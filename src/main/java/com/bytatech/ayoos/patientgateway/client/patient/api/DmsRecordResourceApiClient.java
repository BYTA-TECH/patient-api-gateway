package com.bytatech.ayoos.patientgateway.client.patient.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientgateway.client.patient.ClientConfiguration;

@FeignClient(name="${patient.name:patient}", url="${patient.url:35.209.250.234:8099/}", configuration = ClientConfiguration.class)
public interface DmsRecordResourceApiClient extends DmsRecordResourceApi {
}