package undefined.client.patient.api;

import org.springframework.cloud.openfeign.FeignClient;
import undefined.client.patient.ClientConfiguration;

@FeignClient(name="${patient.name:patient}", url="${patient.url:35.209.250.234:8099/}", configuration = ClientConfiguration.class)
public interface MedicalCaseResourceApiClient extends MedicalCaseResourceApi {
}