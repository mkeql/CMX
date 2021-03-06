/*
 * Portal Connect API
 * This is a simple API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.au.eql.cmx.connect.model;

import java.util.Objects;
import java.util.Arrays;
import com.au.eql.cmx.connect.model.ConnectDetails;
import com.au.eql.cmx.connect.model.PremiseData;
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
 * Connect
 */
@JsonPropertyOrder({
  Connect.JSON_PROPERTY_CONNECT_DETAILS,
  Connect.JSON_PROPERTY_NMIDETAILS
})
@JsonTypeName("Connect")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T22:43:39.296574+10:00[Australia/Brisbane]")
public class Connect {
  public static final String JSON_PROPERTY_CONNECT_DETAILS = "connectDetails";
  private ConnectDetails connectDetails;

  public static final String JSON_PROPERTY_NMIDETAILS = "nmidetails";
  private PremiseData nmidetails;

  public Connect() { 
  }

  public Connect connectDetails(ConnectDetails connectDetails) {
    
    this.connectDetails = connectDetails;
    return this;
  }

   /**
   * Get connectDetails
   * @return connectDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONNECT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectDetails getConnectDetails() {
    return connectDetails;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectDetails(ConnectDetails connectDetails) {
    this.connectDetails = connectDetails;
  }


  public Connect nmidetails(PremiseData nmidetails) {
    
    this.nmidetails = nmidetails;
    return this;
  }

   /**
   * Get nmidetails
   * @return nmidetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NMIDETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PremiseData getNmidetails() {
    return nmidetails;
  }


  @JsonProperty(JSON_PROPERTY_NMIDETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNmidetails(PremiseData nmidetails) {
    this.nmidetails = nmidetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connect connect = (Connect) o;
    return Objects.equals(this.connectDetails, connect.connectDetails) &&
        Objects.equals(this.nmidetails, connect.nmidetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectDetails, nmidetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connect {\n");
    sb.append("    connectDetails: ").append(toIndentedString(connectDetails)).append("\n");
    sb.append("    nmidetails: ").append(toIndentedString(nmidetails)).append("\n");
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

