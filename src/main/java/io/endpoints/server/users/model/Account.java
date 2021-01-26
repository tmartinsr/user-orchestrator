package io.endpoints.server.users.model;

import java.math.BigDecimal;
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

public class Account   {
  
  @Schema(required = true, description = "")
  private Integer accountId = null;
  
  @Schema(required = true, description = "")
  private String IBAN = null;
  
  @Schema(required = true, description = "")
  private BigDecimal balance = null;
  
  @Schema(required = true, description = "")
  private String currency = null;
  
  @Schema(required = true, description = "")
  private String dateOfBalence = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("account_id")
  @NotNull
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public Account accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get IBAN
   * @return IBAN
  **/
  @JsonProperty("IBAN")
  @NotNull
  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public Account IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("balance")
  @NotNull
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Account balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  @NotNull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Get dateOfBalence
   * @return dateOfBalence
  **/
  @JsonProperty("date_of_balence")
  @NotNull
  public String getDateOfBalence() {
    return dateOfBalence;
  }

  public void setDateOfBalence(String dateOfBalence) {
    this.dateOfBalence = dateOfBalence;
  }

  public Account dateOfBalence(String dateOfBalence) {
    this.dateOfBalence = dateOfBalence;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateOfBalence: ").append(toIndentedString(dateOfBalence)).append("\n");
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
