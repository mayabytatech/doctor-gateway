/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.doctor.api;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import com.bytatech.ayoos.client.doctor.domain.ReservedSlot;
import com.bytatech.ayoos.client.doctor.model.ReservedSlotDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T10:42:10.566+05:30[Asia/Calcutta]")

@Api(value = "ReservedSlotResource", description = "the ReservedSlotResource API")
public interface ReservedSlotResourceApi {

    @ApiOperation(value = "createReservedSlot", nickname = "createReservedSlotUsingPOST", notes = "", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/createReservedSlot-kafka",
        method = RequestMethod.POST)
    ResponseEntity<Void> createReservedSlotUsingPOST();


    @ApiOperation(value = "createReservedSlot", nickname = "createReservedSlotUsingPOST1", notes = "", response = ReservedSlotDTO.class, tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reserved-slots",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ReservedSlotDTO> createReservedSlotUsingPOST1(@ApiParam(value = "reservedSlotDTO" ,required=true )  @Valid @RequestBody ReservedSlotDTO reservedSlotDTO);


    @ApiOperation(value = "createSlot", nickname = "createSlotUsingPOST", notes = "", response = ReservedSlotDTO.class, responseContainer = "List", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/slot",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<List<ReservedSlotDTO>> createSlotUsingPOST(@NotNull @ApiParam(value = "date", required = true) @Valid @RequestParam(value = "date", required = true) LocalDate date,@NotNull @ApiParam(value = "doctorId", required = true) @Valid @RequestParam(value = "doctorId", required = true) Long doctorId);


    @ApiOperation(value = "deleteReservedSlot", nickname = "deleteReservedSlotUsingDELETE", notes = "", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/reserved-slots/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteReservedSlotUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "findReservedSlotByDoctorId", nickname = "findReservedSlotByDoctorIdUsingGET", notes = "", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reserved-slot/findBydoctorId/{doctorId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> findReservedSlotByDoctorIdUsingGET(@ApiParam(value = "doctorId",required=true) @PathVariable("doctorId") Long doctorId);


    @ApiOperation(value = "getAllReservedSlots", nickname = "getAllReservedSlotsUsingGET", notes = "", response = ReservedSlotDTO.class, responseContainer = "List", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reserved-slots",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReservedSlotDTO>> getAllReservedSlotsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getAllUnReservedSlots", nickname = "getAllUnReservedSlotsUsingGET", notes = "", response = ReservedSlotDTO.class, responseContainer = "List", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/unReserved-slots",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReservedSlotDTO>> getAllUnReservedSlotsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getReservedSlot", nickname = "getReservedSlotUsingGET", notes = "", response = ReservedSlotDTO.class, tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reserved-slots/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ReservedSlotDTO> getReservedSlotUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "listToDto", nickname = "listToDtoUsingPOST4", notes = "", response = ReservedSlotDTO.class, responseContainer = "List", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reserved-slot/toDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<ReservedSlotDTO>> listToDtoUsingPOST4(@ApiParam(value = "reservedSlot" ,required=true )  @Valid @RequestBody List<ReservedSlot> reservedSlot);


    @ApiOperation(value = "searchReservedSlots", nickname = "searchReservedSlotsUsingGET", notes = "", response = ReservedSlotDTO.class, responseContainer = "List", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/reserved-slots",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReservedSlotDTO>> searchReservedSlotsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "test1", nickname = "test1UsingGET", notes = "", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/test1/{date}/{doctorId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> test1UsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") LocalDate date,@ApiParam(value = "doctorId",required=true) @PathVariable("doctorId") Long doctorId);


    @ApiOperation(value = "test2", nickname = "test2UsingGET", notes = "", response = ReservedSlotDTO.class, responseContainer = "List", tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/test2/{date}/{doctorId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReservedSlotDTO>> test2UsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "doctorId",required=true) @PathVariable("doctorId") Long doctorId);


    @ApiOperation(value = "updateReservedSlot", nickname = "updateReservedSlotUsingPUT", notes = "", response = ReservedSlotDTO.class, tags={ "reserved-slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReservedSlotDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reserved-slots",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ReservedSlotDTO> updateReservedSlotUsingPUT(@ApiParam(value = "reservedSlotDTO" ,required=true )  @Valid @RequestBody ReservedSlotDTO reservedSlotDTO);

}
