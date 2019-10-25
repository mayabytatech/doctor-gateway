package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.client.doctor.model.Doctor;
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
 * UserRating
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T10:42:10.566+05:30[Asia/Calcutta]")

public class UserRating   {
  @JsonProperty("doctor")
  private Doctor doctor = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("ratedOn")
  private LocalDate ratedOn = null;

  @JsonProperty("rating")
  private Double rating = null;

  @JsonProperty("userName")
  private String userName = null;

  public UserRating doctor(Doctor doctor) {
    this.doctor = doctor;
    return this;
  }

  /**
   * Get doctor
   * @return doctor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Doctor getDoctor() {
    return doctor;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public UserRating id(Long id) {
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

  public UserRating ratedOn(LocalDate ratedOn) {
    this.ratedOn = ratedOn;
    return this;
  }

  /**
   * Get ratedOn
   * @return ratedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getRatedOn() {
    return ratedOn;
  }

  public void setRatedOn(LocalDate ratedOn) {
    this.ratedOn = ratedOn;
  }

  public UserRating rating(Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public UserRating userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRating userRating = (UserRating) o;
    return Objects.equals(this.doctor, userRating.doctor) &&
        Objects.equals(this.id, userRating.id) &&
        Objects.equals(this.ratedOn, userRating.ratedOn) &&
        Objects.equals(this.rating, userRating.rating) &&
        Objects.equals(this.userName, userRating.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctor, id, ratedOn, rating, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRating {\n");
    
    sb.append("    doctor: ").append(toIndentedString(doctor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedOn: ").append(toIndentedString(ratedOn)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

