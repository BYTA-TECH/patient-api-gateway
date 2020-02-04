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

@Service
public class PatientCommandServiceImpl implements PatientCommandService{
	
	private final Logger log= LoggerFactory.getLogger(PatientCommandServiceImpl.class);
	
	
	@Autowired
	PatientResourceApi patientResourceApi;

	
	@Override
	public ResponseEntity<PatientDTO> createPatient(PatientDTO patientDTO) {
		log.debug("<<<<<<<<createPatient >>>>>>>{}",patientDTO);
		return patientResourceApi.createPatientUsingPOST1(patientDTO);
	}
	@Override
	public ResponseEntity<PatientDTO> updatePatient(PatientDTO patientDTO) {
		log.debug("<<<<<<<< updatePatient >>>>>>>{}",patientDTO);
		return patientResourceApi.updatePatientUsingPUT1(patientDTO);
	}
	
	
}
