package com.bytatech.ayoos.patientgateway.client.doctor.model;

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
 * DoctorDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-06T14:06:54.455+05:30[Asia/Colombo]")

public class DoctorDTO   {
  @JsonProperty("contactInfoId")
  private Long contactInfoId = null;

  @JsonProperty("dmsId")
  private String dmsId = null;

  @JsonProperty("doctorIdpCode")
  private String doctorIdpCode = null;

  @JsonProperty("doctorSettingsId")
  private Long doctorSettingsId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("imageLink")
  private String imageLink = null;

  @JsonProperty("paymentSettingsId")
  private Long paymentSettingsId = null;

  @JsonProperty("phoneNumber")
  private Long phoneNumber = null;

  @JsonProperty("practiceSince")
  private LocalDate practiceSince = null;

  @JsonProperty("registerNumber")
  private String registerNumber = null;

  @JsonProperty("specialization")
  private String specialization = null;

  @JsonProperty("totalRating")
  private Double totalRating = null;

  public DoctorDTO contactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
    return this;
  }

  /**
   * Get contactInfoId
   * @return contactInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getContactInfoId() {
    return contactInfoId;
  }

  public void setContactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
  }

  public DoctorDTO dmsId(String dmsId) {
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

  public DoctorDTO doctorIdpCode(String doctorIdpCode) {
    this.doctorIdpCode = doctorIdpCode;
    return this;
  }

  /**
   * Get doctorIdpCode
   * @return doctorIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getDoctorIdpCode() {
    return doctorIdpCode;
  }

  public void setDoctorIdpCode(String doctorIdpCode) {
    this.doctorIdpCode = doctorIdpCode;
  }

  public DoctorDTO doctorSettingsId(Long doctorSettingsId) {
    this.doctorSettingsId = doctorSettingsId;
    return this;
  }

  /**
   * Get doctorSettingsId
   * @return doctorSettingsId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorSettingsId() {
    return doctorSettingsId;
  }

  public void setDoctorSettingsId(Long doctorSettingsId) {
    this.doctorSettingsId = doctorSettingsId;
  }

  public DoctorDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DoctorDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public DoctorDTO id(Long id) {
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

  public DoctorDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public DoctorDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public DoctorDTO imageLink(String imageLink) {
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

  public DoctorDTO paymentSettingsId(Long paymentSettingsId) {
    this.paymentSettingsId = paymentSettingsId;
    return this;
  }

  /**
   * Get paymentSettingsId
   * @return paymentSettingsId
  **/
  @ApiModelProperty(value = "")


  public Long getPaymentSettingsId() {
    return paymentSettingsId;
  }

  public void setPaymentSettingsId(Long paymentSettingsId) {
    this.paymentSettingsId = paymentSettingsId;
  }

  public DoctorDTO phoneNumber(Long phoneNumber) {
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

  public DoctorDTO practiceSince(LocalDate practiceSince) {
    this.practiceSince = practiceSince;
    return this;
  }

  /**
   * Get practiceSince
   * @return practiceSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getPracticeSince() {
    return practiceSince;
  }

  public void setPracticeSince(LocalDate practiceSince) {
    this.practiceSince = practiceSince;
  }

  public DoctorDTO registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

  /**
   * Get registerNumber
   * @return registerNumber
  **/
  @ApiModelProperty(value = "")


  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public DoctorDTO specialization(String specialization) {
    this.specialization = specialization;
    return this;
  }

  /**
   * Get specialization
   * @return specialization
  **/
  @ApiModelProperty(value = "")


  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public DoctorDTO totalRating(Double totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Get totalRating
   * @return totalRating
  **/
  @ApiModelProperty(value = "")


  public Double getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(Double totalRating) {
    this.totalRating = totalRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoctorDTO doctorDTO = (DoctorDTO) o;
    return Objects.equals(this.contactInfoId, doctorDTO.contactInfoId) &&
        Objects.equals(this.dmsId, doctorDTO.dmsId) &&
        Objects.equals(this.doctorIdpCode, doctorDTO.doctorIdpCode) &&
        Objects.equals(this.doctorSettingsId, doctorDTO.doctorSettingsId) &&
        Objects.equals(this.email, doctorDTO.email) &&
        Objects.equals(this.firstName, doctorDTO.firstName) &&
        Objects.equals(this.id, doctorDTO.id) &&
        Objects.equals(this.image, doctorDTO.image) &&
        Objects.equals(this.imageContentType, doctorDTO.imageContentType) &&
        Objects.equals(this.imageLink, doctorDTO.imageLink) &&
        Objects.equals(this.paymentSettingsId, doctorDTO.paymentSettingsId) &&
        Objects.equals(this.phoneNumber, doctorDTO.phoneNumber) &&
        Objects.equals(this.practiceSince, doctorDTO.practiceSince) &&
        Objects.equals(this.registerNumber, doctorDTO.registerNumber) &&
        Objects.equals(this.specialization, doctorDTO.specialization) &&
        Objects.equals(this.totalRating, doctorDTO.totalRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfoId, dmsId, doctorIdpCode, doctorSettingsId, email, firstName, id, image, imageContentType, imageLink, paymentSettingsId, phoneNumber, practiceSince, registerNumber, specialization, totalRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoctorDTO {\n");
    
    sb.append("    contactInfoId: ").append(toIndentedString(contactInfoId)).append("\n");
    sb.append("    dmsId: ").append(toIndentedString(dmsId)).append("\n");
    sb.append("    doctorIdpCode: ").append(toIndentedString(doctorIdpCode)).append("\n");
    sb.append("    doctorSettingsId: ").append(toIndentedString(doctorSettingsId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    paymentSettingsId: ").append(toIndentedString(paymentSettingsId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    practiceSince: ").append(toIndentedString(practiceSince)).append("\n");
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
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

