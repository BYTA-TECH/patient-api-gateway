package com.bytatech.ayoos.patientgateway.service.impl;

import java.io.IOException;  
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.Qualification;
import com.bytatech.ayoos.patientgateway.client.doctor.model.SessionInfo; 
import com.bytatech.ayoos.patientgateway.config.ServiceUtility;
import com.bytatech.ayoos.patientgateway.service.DoctorQueryService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DoctorQueryServiceImpl implements DoctorQueryService{
	
	private final Logger log = LoggerFactory.getLogger(DoctorQueryServiceImpl.class);
	
	@Autowired
	RestHighLevelClient restHighLevelClient;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	ServiceUtility serviceUtility;
	 
	
	@Override
	public ResponseEntity<List<Doctor>> findAllDoctors(Pageable pageable) {
		log.debug("<<<<<<<<<< findAllDoctors >>>>>>>");
		List<Doctor> list = new ArrayList<>();
		QueryBuilder dslQuery = QueryBuilders.matchAllQuery();
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchRequest request = new SearchRequest("doctor");
		request.source(builder);
		SearchResponse response=null;
		try {
			response= restHighLevelClient.search(request, RequestOptions.DEFAULT);
		}catch (IOException e) {
			e.printStackTrace();
		}
		SearchHit[] searchHit = response.getHits().getHits();
		Doctor d = new Doctor();
		for(SearchHit hit : searchHit) {
			
			list.add(objectMapper.convertValue(hit.getSourceAsMap(), d.getClass()));
		}
		
		return ResponseEntity.ok().body(list);
	}

	@Override
	public ResponseEntity<Doctor> findDoctorByDoctorIdpCode(String doctorIdpCode) {
		log.debug("<<<<<<<<<<<< findDoctorByDoctorId>>>>>>>>{}",doctorIdpCode);
		
		QueryBuilder dslQuery = QueryBuilders.termQuery("doctorIdpCode", doctorIdpCode);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("doctor", dslQuery);
		
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new Doctor()));
	}
	@Override
	public List<String> findAllQualifications(Pageable pageable) {
		log.debug("<<<<<<<<<<< findAllQualifications >>>>>>>");
		QueryBuilder dslQuery =	QueryBuilders.matchAllQuery();
		SearchSourceBuilder builder= new SearchSourceBuilder();
		SearchResponse response=serviceUtility.searchResponseForObject("qualification", dslQuery);
		return serviceUtility.getListResult(response, pageable, new Qualification());
	}

/*
 * @author:ajay.e.s
 * method to divide the session to slot according to interval 
 */
	@Override
	public ResponseEntity<List<SessionInfo>> findSessionInfoByDoctorIdpCodeAndDate(String doctorIdpCode, LocalDate date,Long statusId )
	{
		QueryBuilder dslQuery=QueryBuilders.boolQuery().must(QueryBuilders.termQuery("date",date));
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
        SearchResponse response = serviceUtility.searchResponseForObject("sessioninfo", dslQuery);
        SessionInfo sessionInfo= serviceUtility.getObjectResult(response, new SessionInfo());
       
        Instant fromTime=sessionInfo.getFromTime();
        Instant toTime=sessionInfo.getToTime();
       
        List <SessionInfo> sessionList =new ArrayList<> (); 
 
        while(fromTime.isBefore(toTime)){
        	long interval=sessionInfo.getInterval();
        	SessionInfo s=new SessionInfo();
        	s.setDate(sessionInfo.getDate());
        	s.setFromTime(fromTime); 
        	s.setDoctorIdpCode(sessionInfo.getDoctorIdpCode());
        	s.setStatus(sessionInfo.getStatus());
        	s.setWeekDay(sessionInfo.getWeekDay());
        	s.setWorkPlace(sessionInfo.getWorkPlace());
        	s.setInterval(sessionInfo.getInterval());
            s.setToTime(fromTime.plus(interval,ChronoUnit.MINUTES));             
        	sessionInfo.setFromTime(s.getToTime());
        	if(((s.getToTime()).isBefore(toTime))||((s.getToTime()).equals(toTime)))
        		{
        		Instant fromLimit=Instant.parse(sessionInfo.getDate()+"T00:00:00.000Z"),toLimit;
        		//Select the interval{[0-6]->Morning,[6-12]->AfterNoon,[12-18]->Evening,[18-24]->Night}
        		while((--statusId)>0)
        		{
				log.debug("abc");
        			fromLimit=fromLimit.plus(6,ChronoUnit.HOURS);    
        		}
			log.debug("xyz");
        		toLimit=fromLimit.plus(6,ChronoUnit.HOURS);
        		if((s.getToTime().isBefore(toLimit))&&(s.getToTime().isAfter(fromLimit))&&(s.getToTime().equals(toLimit)))
        		sessionList.add(s);
        		}
        	fromTime=sessionInfo.getFromTime(); 
        }  
        
       return ResponseEntity.ok().body(sessionList);
 
		

	}
	
}
