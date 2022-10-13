/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CampaignUpdateSummary;
import org.openapitools.client.model.CreateCampaignRequestCampaignConfig;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * DescribeCampaignResponseCampaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:08.261957-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeCampaignResponseCampaign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CAMPAIGN_ARN = "campaignArn";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ARN)
  private String campaignArn;

  public static final String SERIALIZED_NAME_SOLUTION_VERSION_ARN = "solutionVersionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_VERSION_ARN)
  private String solutionVersionArn;

  public static final String SERIALIZED_NAME_MIN_PROVISIONED_T_P_S = "minProvisionedTPS";
  @SerializedName(SERIALIZED_NAME_MIN_PROVISIONED_T_P_S)
  private Integer minProvisionedTPS;

  public static final String SERIALIZED_NAME_CAMPAIGN_CONFIG = "campaignConfig";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CONFIG)
  private CreateCampaignRequestCampaignConfig campaignConfig;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_LATEST_CAMPAIGN_UPDATE = "latestCampaignUpdate";
  @SerializedName(SERIALIZED_NAME_LATEST_CAMPAIGN_UPDATE)
  private CampaignUpdateSummary latestCampaignUpdate;

  public DescribeCampaignResponseCampaign() {
  }

  public DescribeCampaignResponseCampaign name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DescribeCampaignResponseCampaign campaignArn(String campaignArn) {
    this.campaignArn = campaignArn;
    return this;
  }

  /**
   * Get campaignArn
   * @return campaignArn
   */
  @javax.annotation.Nullable
  public String getCampaignArn() {
    return campaignArn;
  }

  public void setCampaignArn(String campaignArn) {
    this.campaignArn = campaignArn;
  }


  public DescribeCampaignResponseCampaign solutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
    return this;
  }

  /**
   * Get solutionVersionArn
   * @return solutionVersionArn
   */
  @javax.annotation.Nullable
  public String getSolutionVersionArn() {
    return solutionVersionArn;
  }

  public void setSolutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
  }


  public DescribeCampaignResponseCampaign minProvisionedTPS(Integer minProvisionedTPS) {
    this.minProvisionedTPS = minProvisionedTPS;
    return this;
  }

  /**
   * Get minProvisionedTPS
   * @return minProvisionedTPS
   */
  @javax.annotation.Nullable
  public Integer getMinProvisionedTPS() {
    return minProvisionedTPS;
  }

  public void setMinProvisionedTPS(Integer minProvisionedTPS) {
    this.minProvisionedTPS = minProvisionedTPS;
  }


  public DescribeCampaignResponseCampaign campaignConfig(CreateCampaignRequestCampaignConfig campaignConfig) {
    this.campaignConfig = campaignConfig;
    return this;
  }

  /**
   * Get campaignConfig
   * @return campaignConfig
   */
  @javax.annotation.Nullable
  public CreateCampaignRequestCampaignConfig getCampaignConfig() {
    return campaignConfig;
  }

  public void setCampaignConfig(CreateCampaignRequestCampaignConfig campaignConfig) {
    this.campaignConfig = campaignConfig;
  }


  public DescribeCampaignResponseCampaign status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public DescribeCampaignResponseCampaign failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public DescribeCampaignResponseCampaign creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public DescribeCampaignResponseCampaign lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

  /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }


  public DescribeCampaignResponseCampaign latestCampaignUpdate(CampaignUpdateSummary latestCampaignUpdate) {
    this.latestCampaignUpdate = latestCampaignUpdate;
    return this;
  }

  /**
   * Get latestCampaignUpdate
   * @return latestCampaignUpdate
   */
  @javax.annotation.Nullable
  public CampaignUpdateSummary getLatestCampaignUpdate() {
    return latestCampaignUpdate;
  }

  public void setLatestCampaignUpdate(CampaignUpdateSummary latestCampaignUpdate) {
    this.latestCampaignUpdate = latestCampaignUpdate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCampaignResponseCampaign describeCampaignResponseCampaign = (DescribeCampaignResponseCampaign) o;
    return Objects.equals(this.name, describeCampaignResponseCampaign.name) &&
        Objects.equals(this.campaignArn, describeCampaignResponseCampaign.campaignArn) &&
        Objects.equals(this.solutionVersionArn, describeCampaignResponseCampaign.solutionVersionArn) &&
        Objects.equals(this.minProvisionedTPS, describeCampaignResponseCampaign.minProvisionedTPS) &&
        Objects.equals(this.campaignConfig, describeCampaignResponseCampaign.campaignConfig) &&
        Objects.equals(this.status, describeCampaignResponseCampaign.status) &&
        Objects.equals(this.failureReason, describeCampaignResponseCampaign.failureReason) &&
        Objects.equals(this.creationDateTime, describeCampaignResponseCampaign.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, describeCampaignResponseCampaign.lastUpdatedDateTime) &&
        Objects.equals(this.latestCampaignUpdate, describeCampaignResponseCampaign.latestCampaignUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, campaignArn, solutionVersionArn, minProvisionedTPS, campaignConfig, status, failureReason, creationDateTime, lastUpdatedDateTime, latestCampaignUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCampaignResponseCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    campaignArn: ").append(toIndentedString(campaignArn)).append("\n");
    sb.append("    solutionVersionArn: ").append(toIndentedString(solutionVersionArn)).append("\n");
    sb.append("    minProvisionedTPS: ").append(toIndentedString(minProvisionedTPS)).append("\n");
    sb.append("    campaignConfig: ").append(toIndentedString(campaignConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    latestCampaignUpdate: ").append(toIndentedString(latestCampaignUpdate)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("campaignArn");
    openapiFields.add("solutionVersionArn");
    openapiFields.add("minProvisionedTPS");
    openapiFields.add("campaignConfig");
    openapiFields.add("status");
    openapiFields.add("failureReason");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("latestCampaignUpdate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeCampaignResponseCampaign
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeCampaignResponseCampaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeCampaignResponseCampaign is not found in the empty JSON string", DescribeCampaignResponseCampaign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeCampaignResponseCampaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeCampaignResponseCampaign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `campaignArn`
      if (jsonObj.get("campaignArn") != null && !jsonObj.get("campaignArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("campaignArn"));
      }
      // validate the optional field `solutionVersionArn`
      if (jsonObj.get("solutionVersionArn") != null && !jsonObj.get("solutionVersionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("solutionVersionArn"));
      }
      // validate the optional field `minProvisionedTPS`
      if (jsonObj.get("minProvisionedTPS") != null && !jsonObj.get("minProvisionedTPS").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("minProvisionedTPS"));
      }
      // validate the optional field `campaignConfig`
      if (jsonObj.get("campaignConfig") != null && !jsonObj.get("campaignConfig").isJsonNull()) {
        CreateCampaignRequestCampaignConfig.validateJsonElement(jsonObj.get("campaignConfig"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
      // validate the optional field `latestCampaignUpdate`
      if (jsonObj.get("latestCampaignUpdate") != null && !jsonObj.get("latestCampaignUpdate").isJsonNull()) {
        CampaignUpdateSummary.validateJsonElement(jsonObj.get("latestCampaignUpdate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeCampaignResponseCampaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeCampaignResponseCampaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeCampaignResponseCampaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeCampaignResponseCampaign.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeCampaignResponseCampaign>() {
           @Override
           public void write(JsonWriter out, DescribeCampaignResponseCampaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeCampaignResponseCampaign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeCampaignResponseCampaign given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeCampaignResponseCampaign
   * @throws IOException if the JSON string is invalid with respect to DescribeCampaignResponseCampaign
   */
  public static DescribeCampaignResponseCampaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeCampaignResponseCampaign.class);
  }

  /**
   * Convert an instance of DescribeCampaignResponseCampaign to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

