package com.bytatech.ayoos.patientgateway.web.rest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.SessionInfo;
import com.bytatech.ayoos.patientgateway.client.doctor.model.Slot;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.service.*;

@RestController 
@RequestMapping("/api/query")
public class QueryResource {
	
	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	
	@Autowired
	DoctorQueryService doctorQueryService;
	
	@Autowired
	PatientQueryService patientQueryService;
	

	
	@GetMapping("/findAllDoctors")
	public ResponseEntity<List<Doctor>> findAllDoctors(Pageable pageable) {
		log.debug("<<<<< findAllDoctors >>>>>>");
		return doctorQueryService.findAllDoctors(pageable);
	}
	@GetMapping("/patient/{patientCode}")
	public ResponseEntity<Patient> findPatient(@PathVariable String patientCode) {
		log.debug("<<<<<<<<<<< findPatient >>>>>>>>>{}",patientCode);
		return patientQueryService.findPatient(patientCode);
	}
	@GetMapping("/findAllQualification")
	public List<String> findAllQualification(Pageable pageable) {
		log.debug("<<<<<<<< findAllQualification >>>>>>>>");
		return doctorQueryService.findAllQualifications(pageable);
	}
	@GetMapping("/doctors/{doctorIdpCode}")
	public ResponseEntity<Doctor> findDoctorByDoctorIdpCode(@PathVariable String doctorIdpCode) {
		log.debug("<<<<<<<<<<< findDoctorByDoctorId >>>>>>>>>>{}",doctorIdpCode);
		return doctorQueryService.findDoctorByDoctorIdpCode(doctorIdpCode);
	}
	
	@GetMapping("/findSessionInfoByDoctorIdpCodeAndDate/{doctorIdpCode}/{date}")
	public ResponseEntity<List<Slot>>  findSessionInfoByDoctorIdpCodeAndDate(@PathVariable String doctorIdpCode,@PathVariable LocalDate date)
	{
		return doctorQueryService.findSessionInfoByDoctorIdpCodeAndDate(doctorIdpCode,date);
	}
}
