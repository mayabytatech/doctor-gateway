package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentSettingsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T10:42:10.566+05:30[Asia/Calcutta]")

public class PaymentSettingsDTO   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("isPaymentEnabled")
  private Boolean isPaymentEnabled = null;

  @JsonProperty("noteToPayer")
  private String noteToPayer = null;

  @JsonProperty("paymentGatewayCredentials")
  private String paymentGatewayCredentials = null;

  @JsonProperty("paymentGatewayProvider")
  private String paymentGatewayProvider = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  public PaymentSettingsDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PaymentSettingsDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentSettingsDTO id(Long id) {
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

  public PaymentSettingsDTO intent(String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
  **/
  @ApiModelProperty(value = "")


  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public PaymentSettingsDTO isPaymentEnabled(Boolean isPaymentEnabled) {
    this.isPaymentEnabled = isPaymentEnabled;
    return this;
  }

  /**
   * Get isPaymentEnabled
   * @return isPaymentEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsPaymentEnabled() {
    return isPaymentEnabled;
  }

  public void setIsPaymentEnabled(Boolean isPaymentEnabled) {
    this.isPaymentEnabled = isPaymentEnabled;
  }

  public PaymentSettingsDTO noteToPayer(String noteToPayer) {
    this.noteToPayer = noteToPayer;
    return this;
  }

  /**
   * Get noteToPayer
   * @return noteToPayer
  **/
  @ApiModelProperty(value = "")


  public String getNoteToPayer() {
    return noteToPayer;
  }

  public void setNoteToPayer(String noteToPayer) {
    this.noteToPayer = noteToPayer;
  }

  public PaymentSettingsDTO paymentGatewayCredentials(String paymentGatewayCredentials) {
    this.paymentGatewayCredentials = paymentGatewayCredentials;
    return this;
  }

  /**
   * Get paymentGatewayCredentials
   * @return paymentGatewayCredentials
  **/
  @ApiModelProperty(value = "")


  public String getPaymentGatewayCredentials() {
    return paymentGatewayCredentials;
  }

  public void setPaymentGatewayCredentials(String paymentGatewayCredentials) {
    this.paymentGatewayCredentials = paymentGatewayCredentials;
  }

  public PaymentSettingsDTO paymentGatewayProvider(String paymentGatewayProvider) {
    this.paymentGatewayProvider = paymentGatewayProvider;
    return this;
  }

  /**
   * Get paymentGatewayProvider
   * @return paymentGatewayProvider
  **/
  @ApiModelProperty(value = "")


  public String getPaymentGatewayProvider() {
    return paymentGatewayProvider;
  }

  public void setPaymentGatewayProvider(String paymentGatewayProvider) {
    this.paymentGatewayProvider = paymentGatewayProvider;
  }

  public PaymentSettingsDTO paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettingsDTO paymentSettingsDTO = (PaymentSettingsDTO) o;
    return Objects.equals(this.amount, paymentSettingsDTO.amount) &&
        Objects.equals(this.currency, paymentSettingsDTO.currency) &&
        Objects.equals(this.id, paymentSettingsDTO.id) &&
        Objects.equals(this.intent, paymentSettingsDTO.intent) &&
        Objects.equals(this.isPaymentEnabled, paymentSettingsDTO.isPaymentEnabled) &&
        Objects.equals(this.noteToPayer, paymentSettingsDTO.noteToPayer) &&
        Objects.equals(this.paymentGatewayCredentials, paymentSettingsDTO.paymentGatewayCredentials) &&
        Objects.equals(this.paymentGatewayProvider, paymentSettingsDTO.paymentGatewayProvider) &&
        Objects.equals(this.paymentMethod, paymentSettingsDTO.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, id, intent, isPaymentEnabled, noteToPayer, paymentGatewayCredentials, paymentGatewayProvider, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSettingsDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    isPaymentEnabled: ").append(toIndentedString(isPaymentEnabled)).append("\n");
    sb.append("    noteToPayer: ").append(toIndentedString(noteToPayer)).append("\n");
    sb.append("    paymentGatewayCredentials: ").append(toIndentedString(paymentGatewayCredentials)).append("\n");
    sb.append("    paymentGatewayProvider: ").append(toIndentedString(paymentGatewayProvider)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

