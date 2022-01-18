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
 * PremiseData
 */
@JsonPropertyOrder({
  PremiseData.JSON_PROPERTY_N_M_I,
  PremiseData.JSON_PROPERTY_STREET_NUMBER,
  PremiseData.JSON_PROPERTY_STREET_NAME,
  PremiseData.JSON_PROPERTY_STREET_TYPE,
  PremiseData.JSON_PROPERTY_SUBURB,
  PremiseData.JSON_PROPERTY_POST_CODE,
  PremiseData.JSON_PROPERTY_LOT_NUMBER,
  PremiseData.JSON_PROPERTY_PLAN_NUMBER
})
@JsonTypeName("PremiseData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T16:09:15.829548+10:00[Australia/Brisbane]")
public class PremiseData {
  public static final String JSON_PROPERTY_N_M_I = "NMI";
  private String NMI;

  public static final String JSON_PROPERTY_STREET_NUMBER = "streetNumber";
  private String streetNumber;

  public static final String JSON_PROPERTY_STREET_NAME = "streetName";
  private String streetName;

  public static final String JSON_PROPERTY_STREET_TYPE = "streetType";
  private String streetType;

  public static final String JSON_PROPERTY_SUBURB = "suburb";
  private String suburb;

  public static final String JSON_PROPERTY_POST_CODE = "postCode";
  private String postCode;

  public static final String JSON_PROPERTY_LOT_NUMBER = "lotNumber";
  private String lotNumber;

  public static final String JSON_PROPERTY_PLAN_NUMBER = "planNumber";
  private String planNumber;

  public PremiseData() { 
  }

  public PremiseData NMI(String NMI) {
    
    this.NMI = NMI;
    return this;
  }

   /**
   * Get NMI
   * @return NMI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31200236811", value = "")
  @JsonProperty(JSON_PROPERTY_N_M_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNMI() {
    return NMI;
  }


  @JsonProperty(JSON_PROPERTY_N_M_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNMI(String NMI) {
    this.NMI = NMI;
  }


  public PremiseData streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52", value = "")
  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetNumber() {
    return streetNumber;
  }


  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public PremiseData streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane Street", value = "")
  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetName() {
    return streetName;
  }


  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public PremiseData streetType(String streetType) {
    
    this.streetType = streetType;
    return this;
  }

   /**
   * Get streetType
   * @return streetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "street", value = "")
  @JsonProperty(JSON_PROPERTY_STREET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetType() {
    return streetType;
  }


  @JsonProperty(JSON_PROPERTY_STREET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }


  public PremiseData suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kedron", value = "")
  @JsonProperty(JSON_PROPERTY_SUBURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuburb() {
    return suburb;
  }


  @JsonProperty(JSON_PROPERTY_SUBURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public PremiseData postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4000", value = "")
  @JsonProperty(JSON_PROPERTY_POST_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostCode() {
    return postCode;
  }


  @JsonProperty(JSON_PROPERTY_POST_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public PremiseData lotNumber(String lotNumber) {
    
    this.lotNumber = lotNumber;
    return this;
  }

   /**
   * Get lotNumber
   * @return lotNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lot 514", value = "")
  @JsonProperty(JSON_PROPERTY_LOT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLotNumber() {
    return lotNumber;
  }


  @JsonProperty(JSON_PROPERTY_LOT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }


  public PremiseData planNumber(String planNumber) {
    
    this.planNumber = planNumber;
    return this;
  }

   /**
   * Get planNumber
   * @return planNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP741564", value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanNumber() {
    return planNumber;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanNumber(String planNumber) {
    this.planNumber = planNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiseData premiseData = (PremiseData) o;
    return Objects.equals(this.NMI, premiseData.NMI) &&
        Objects.equals(this.streetNumber, premiseData.streetNumber) &&
        Objects.equals(this.streetName, premiseData.streetName) &&
        Objects.equals(this.streetType, premiseData.streetType) &&
        Objects.equals(this.suburb, premiseData.suburb) &&
        Objects.equals(this.postCode, premiseData.postCode) &&
        Objects.equals(this.lotNumber, premiseData.lotNumber) &&
        Objects.equals(this.planNumber, premiseData.planNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NMI, streetNumber, streetName, streetType, suburb, postCode, lotNumber, planNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiseData {\n");
    sb.append("    NMI: ").append(toIndentedString(NMI)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    lotNumber: ").append(toIndentedString(lotNumber)).append("\n");
    sb.append("    planNumber: ").append(toIndentedString(planNumber)).append("\n");
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

