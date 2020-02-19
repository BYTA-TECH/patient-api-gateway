package com.bytatech.ayoos.patientgateway.client.patient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PatientDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T15:46:22.211+05:30[Asia/Colombo]")

public class PatientDTO   {
  @JsonProperty("createdDate")
  private LocalDate createdDate = null;

  @JsonProperty("dmsId")
  private String dmsId = null;

  @JsonProperty("dob")
  private LocalDate dob = null;

  @JsonProperty("emailId")
  private String emailId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("idpCode")
  private String idpCode = null;

  @JsonProperty("imageLink")
  private String imageLink = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("phoneNumber")
  private Long phoneNumber = null;

  public PatientDTO createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public PatientDTO dmsId(String dmsId) {
    this.dmsId = dmsId;
    return this;
  }

  /**
   * Get dmsId
   * @return dmsId
  **/
  @ApiModelProperty(value = "")


  public String getDmsId() {
    return dmsId;
  }

  public void setDmsId(String dmsId) {
    this.dmsId = dmsId;
  }

  public PatientDTO dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public PatientDTO emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  **/
  @ApiModelProperty(value = "")


  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public PatientDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PatientDTO idpCode(String idpCode) {
    this.idpCode = idpCode;
    return this;
  }

  /**
   * Get idpCode
   * @return idpCode
  **/
  @ApiModelProperty(value = "")


  public String getIdpCode() {
    return idpCode;
  }

  public void setIdpCode(String idpCode) {
    this.idpCode = idpCode;
  }

  public PatientDTO imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Get imageLink
   * @return imageLink
  **/
  @ApiModelProperty(value = "")


  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public PatientDTO location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PatientDTO phoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientDTO patientDTO = (PatientDTO) o;
    return Objects.equals(this.createdDate, patientDTO.createdDate) &&
        Objects.equals(this.dmsId, patientDTO.dmsId) &&
        Objects.equals(this.dob, patientDTO.dob) &&
        Objects.equals(this.emailId, patientDTO.emailId) &&
        Objects.equals(this.id, patientDTO.id) &&
        Objects.equals(this.idpCode, patientDTO.idpCode) &&
        Objects.equals(this.imageLink, patientDTO.imageLink) &&
        Objects.equals(this.location, patientDTO.location) &&
        Objects.equals(this.phoneNumber, patientDTO.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, dmsId, dob, emailId, id, idpCode, imageLink, location, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientDTO {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    dmsId: ").append(toIndentedString(dmsId)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idpCode: ").append(toIndentedString(idpCode)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

