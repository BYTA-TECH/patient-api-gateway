package com.bytatech.ayoos.patientgateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.patientgateway.client.patient.api.PatientResourceApi;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;
import com.bytatech.ayoos.patientgateway.client.payment.api.RazorpayCommandResourceApi;
import com.bytatech.ayoos.patientgateway.client.payment.model.OrderRequest;
import com.bytatech.ayoos.patientgateway.client.payment.model.OrderResponse;
import com.bytatech.ayoos.patientgateway.service.*;
@Service
public class PaymentCommandServiceImpl implements PaymentCommandService{
	
	Logger log= LoggerFactory.getLogger(PaymentCommandServiceImpl.class);
	
	@Autowired
	RazorpayCommandResourceApi razorpayCommandREsourceApi;
	
	@Autowired
	PatientResourceApi patientResourceApi;

	@Override
	public ResponseEntity<OrderResponse> createOrder(OrderRequest orderRequest) {
		log.debug("<<<<<<<<< createOrder >>>>>>>>{}",orderRequest);
		return razorpayCommandREsourceApi.createOrderUsingPOST(orderRequest);
	}


}
