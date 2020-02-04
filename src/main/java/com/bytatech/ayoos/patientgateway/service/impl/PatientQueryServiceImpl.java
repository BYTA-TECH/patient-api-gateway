package com.bytatech.ayoos.patientgateway.service.impl;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.patientgateway.client.patient.api.PatientResourceApi;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;
import com.bytatech.ayoos.patientgateway.service.*;
import com.bytatech.ayoos.patientgateway.config.*;

@Service
public class PatientQueryServiceImpl implements PatientQueryService{
	
	private final Logger log= LoggerFactory.getLogger(PatientQueryServiceImpl.class);
	
	@Autowired
	ServiceUtility ServiceUtility;
	
	

	@Override
	public ResponseEntity<Patient> findPatient(String patientCode) {
		log.debug("<<<<<<<<findPatient >>>>>>>{}",patientCode);
		QueryBuilder dslQuery=QueryBuilders.termQuery("IdpCode", patientCode);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		SearchResponse response = ServiceUtility.searchResponseForObject("patient", dslQuery);
		
		return ResponseEntity.ok().body(ServiceUtility.getObjectResult(response, new Patient()));
	}
	
	
}
