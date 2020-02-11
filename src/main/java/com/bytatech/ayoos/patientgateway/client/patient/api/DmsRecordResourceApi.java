/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.patientgateway.client.patient.api;

import com.bytatech.ayoos.patientgateway.client.patient.model.DMSRecordDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

@Api(value = "DmsRecordResource", description = "the DmsRecordResource API")
public interface DmsRecordResourceApi {

    @ApiOperation(value = "createDMSRecord", nickname = "createDMSRecordUsingPOST1", notes = "", response = DMSRecordDTO.class, tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DMSRecordDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/dms-records",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DMSRecordDTO> createDMSRecordUsingPOST1(@ApiParam(value = "dMSRecordDTO" ,required=true )  @Valid @RequestBody DMSRecordDTO dmSRecordDTO);


    @ApiOperation(value = "deleteDMSRecord", nickname = "deleteDMSRecordUsingDELETE", notes = "", tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/dms-records/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDMSRecordUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDMSRecords", nickname = "getAllDMSRecordsUsingGET", notes = "", response = DMSRecordDTO.class, responseContainer = "List", tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DMSRecordDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/dms-records",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DMSRecordDTO>> getAllDMSRecordsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getDMSRecord", nickname = "getDMSRecordUsingGET", notes = "", response = DMSRecordDTO.class, tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DMSRecordDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/dms-records/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DMSRecordDTO> getDMSRecordUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDMSRecords", nickname = "searchDMSRecordsUsingGET", notes = "", response = DMSRecordDTO.class, responseContainer = "List", tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DMSRecordDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/dms-records",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DMSRecordDTO>> searchDMSRecordsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "test", nickname = "testUsingGET1", notes = "", response = String.class, tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/dms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> testUsingGET1();


    @ApiOperation(value = "updateDMSRecord", nickname = "updateDMSRecordUsingPUT", notes = "", response = DMSRecordDTO.class, tags={ "dms-record-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DMSRecordDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/dms-records",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DMSRecordDTO> updateDMSRecordUsingPUT(@ApiParam(value = "dMSRecordDTO" ,required=true )  @Valid @RequestBody DMSRecordDTO dmSRecordDTO);

}