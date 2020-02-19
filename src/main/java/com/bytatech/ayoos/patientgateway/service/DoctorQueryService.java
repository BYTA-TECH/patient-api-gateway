package com.bytatech.ayoos.patientgateway.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.ReviewDTO;
import com.bytatech.ayoos.patientgateway.client.doctor.model.SessionInfo;


public interface DoctorQueryService {

	ResponseEntity<List<Doctor>> findAllDoctors(Pageable pageable);

	ResponseEntity<Doctor> findDoctorByDoctorIdpCode(String doctorIdpCode);
	public List<String> findAllQualifications(Pageable pageable) ;

	ResponseEntity<List<SessionInfo>> findSessionInfoByDoctorIdpCodeAndDate(String doctorIdpCode, LocalDate date);

}
