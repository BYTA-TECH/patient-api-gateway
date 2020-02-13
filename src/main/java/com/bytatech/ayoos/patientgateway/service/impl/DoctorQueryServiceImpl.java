package com.bytatech.ayoos.patientgateway.service.impl;

import java.io.IOException;
import java.time.LocalDate;
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

import com.bytatech.ayoos.patientgateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.patientgateway.client.doctor.api.ReviewResourceApi;
//import com.bytatech.ayoos.patientgateway.client.doctor.api.UserRatingResourceApi;
import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.Qualification;
import com.bytatech.ayoos.patientgateway.client.doctor.model.ReviewDTO;
import com.bytatech.ayoos.patientgateway.client.doctor.model.SessionInfo;
//import com.bytatech.ayoos.patientgateway.client.doctor.model.UserRatingDTO;
import com.bytatech.ayoos.patientgateway.service.*;
import com.bytatech.ayoos.patientgateway.config.*;
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
		
		QueryBuilder dslQuery = QueryBuilders.termQuery("doctorId", doctorIdpCode);
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


	@Override
	public ResponseEntity<SessionInfo> findSessionInfoByDoctorIdpCodeAndDate(String doctorIdpCode, LocalDate date)
	{
		QueryBuilder dslQuery=QueryBuilders.boolQuery().must(QueryBuilders.termQuery("workplace.doctor.doctorIdpCode.keyword",doctorIdpCode)).must(QueryBuilders.termQuery("date",date));
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
        SearchResponse response = serviceUtility.searchResponseForObject("sessioninfo", dslQuery);
		
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new SessionInfo()));

	}
	
}
