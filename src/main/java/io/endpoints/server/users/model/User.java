package io.endpoints.server.users.model;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class User   {
  
  @Schema(required = true, description = "")
  private Integer userId = null;
  
  @Schema(required = true, description = "")
  private String firstName = null;
  
  @Schema(required = true, description = "")
  private String lastName = null;
  
  @Schema(description = "")
  private String phone = null;
  
  @Schema(required = true, description = "")
  private String email = null;
  
  @Schema(required = true, description = "")
  private String gender = null;
  
  @Schema(required = true, description = "")
  private String address = null;
  
  @Schema(required = true, description = "")
  private Integer postalCode = null;
  
  @Schema(required = true, description = "")
  private String countryCode = null;
 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("user_id")
  @NotNull
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public User userId(Integer userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  @JsonProperty("first_name")
  @NotNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("last_name")
  @NotNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get phone
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  @NotNull
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public User gender(String gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  @NotNull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public User address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Get postalCode
   * @return postalCode
  **/
  @JsonProperty("postal_code")
  @NotNull
  public Integer getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(Integer postalCode) {
    this.postalCode = postalCode;
  }

  public User postalCode(Integer postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
   * Get countryCode
   * @return countryCode
  **/
  @JsonProperty("country_code")
  @NotNull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public User countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
