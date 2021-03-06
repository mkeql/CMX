/*
 * Premise Search API
 * This is a simple API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.au.eql.cmx.premise.model;

import java.util.Objects;
import java.util.Arrays;
import com.au.eql.cmx.premise.model.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NMIStatus
 */
@JsonPropertyOrder({
  NMIStatus.JSON_PROPERTY_NMI,
  NMIStatus.JSON_PROPERTY_ADDRESS,
  NMIStatus.JSON_PROPERTY_NMI_STATUS,
  NMIStatus.JSON_PROPERTY_CONNECTION_TYPE,
  NMIStatus.JSON_PROPERTY_TARIFF
})
@JsonTypeName("NMIStatus")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-15T17:41:25.017457+10:00[Australia/Brisbane]")
public class NMIStatus {
  public static final String JSON_PROPERTY_NMI = "nmi";
  private String nmi;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_NMI_STATUS = "nmiStatus";
  private String nmiStatus;

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private String connectionType;

  public static final String JSON_PROPERTY_TARIFF = "tariff";
  private String tariff;

  public NMIStatus() { 
  }

  public NMIStatus nmi(String nmi) {
    
    this.nmi = nmi;
    return this;
  }

   /**
   * Get nmi
   * @return nmi
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30523457421", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NMI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNmi() {
    return nmi;
  }


  @JsonProperty(JSON_PROPERTY_NMI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNmi(String nmi) {
    this.nmi = nmi;
  }


  public NMIStatus address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public NMIStatus nmiStatus(String nmiStatus) {
    
    this.nmiStatus = nmiStatus;
    return this;
  }

   /**
   * Get nmiStatus
   * @return nmiStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Active", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NMI_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNmiStatus() {
    return nmiStatus;
  }


  @JsonProperty(JSON_PROPERTY_NMI_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNmiStatus(String nmiStatus) {
    this.nmiStatus = nmiStatus;
  }


  public NMIStatus connectionType(String connectionType) {
    
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PERMAN", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionType() {
    return connectionType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }


  public NMIStatus tariff(String tariff) {
    
    this.tariff = tariff;
    return this;
  }

   /**
   * Get tariff
   * @return tariff
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8400 1900", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARIFF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTariff() {
    return tariff;
  }


  @JsonProperty(JSON_PROPERTY_TARIFF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTariff(String tariff) {
    this.tariff = tariff;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NMIStatus nmIStatus = (NMIStatus) o;
    return Objects.equals(this.nmi, nmIStatus.nmi) &&
        Objects.equals(this.address, nmIStatus.address) &&
        Objects.equals(this.nmiStatus, nmIStatus.nmiStatus) &&
        Objects.equals(this.connectionType, nmIStatus.connectionType) &&
        Objects.equals(this.tariff, nmIStatus.tariff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nmi, address, nmiStatus, connectionType, tariff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NMIStatus {\n");
    sb.append("    nmi: ").append(toIndentedString(nmi)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    nmiStatus: ").append(toIndentedString(nmiStatus)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    tariff: ").append(toIndentedString(tariff)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

