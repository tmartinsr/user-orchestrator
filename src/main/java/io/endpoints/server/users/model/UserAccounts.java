package io.endpoints.server.users.model;

import io.endpoints.server.users.model.Account;
import io.endpoints.server.users.model.User;
import java.util.ArrayList;
import java.util.List;
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

public class UserAccounts   {
  
  @Schema(required = true, description = "")
  private User user = null;
  
  @Schema(required = true, description = "")
  private List<Account> accounts = new ArrayList<Account>();
 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  @NotNull
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserAccounts user(User user) {
    this.user = user;
    return this;
  }

 /**
   * Get accounts
   * @return accounts
  **/
  @JsonProperty("accounts")
  @NotNull
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public UserAccounts accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public UserAccounts addAccountsItem(Account accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccounts {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
