package com.bytatech.ayoos.patientgateway.service.impl;
import com.bytatech.ayoos.patientgateway.service.*;
import com.bytatech.ayoos.patientgateway.config.*;
import java.io.IOException;
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
import com.bytatech.ayoos.patientgateway.client.doctor.api.UserRatingResourceApi;
import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.ReviewDTO;
import com.bytatech.ayoos.patientgateway.client.doctor.model.UserRatingDTO;
import com.bytatech.ayoos.patientgateway.service.*;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DoctorCommandServiceImpl implements DoctorCommandService{
	
	private final Logger log = LoggerFactory.getLogger(DoctorCommandServiceImpl.class);
	
	@Autowired
	RestHighLevelClient restHighLevelClient;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	ServiceUtility serviceUtility;
	
	@Autowired
	DoctorResourceApi doctorResourceApi;
	
	@Autowired
	UserRatingResourceApi userRatingResourceApi;
	
	@Autowired
	ReviewResourceApi reviewResourceApi;

	

	
	
	@Override
	public ResponseEntity<UserRatingDTO> createUserRating(UserRatingDTO userRatingDTO) {
		log.debug("<<<<<<<< createUserRating >>>>>>>>",userRatingDTO);
		return userRatingResourceApi.createUserRatingUsingPOST(userRatingDTO);
	}
	
	@Override
	public ResponseEntity<ReviewDTO> createReview(ReviewDTO reviewDTO) {
		log.debug("<<<<<<createReview >>>>>>>>{}",reviewDTO);
		return reviewResourceApi.createReviewUsingPOST(reviewDTO);
	}

}
