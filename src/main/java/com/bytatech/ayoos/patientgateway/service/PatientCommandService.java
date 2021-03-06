package com.bytatech.ayoos.patientgateway.service;

import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;

public interface PatientCommandService {

	

	ResponseEntity<PatientDTO> createPatient(PatientDTO patientDTO);

	ResponseEntity<PatientDTO> updatePatient(PatientDTO patientDTO);
	
}
