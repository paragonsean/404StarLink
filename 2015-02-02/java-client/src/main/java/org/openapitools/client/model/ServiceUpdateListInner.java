/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
import org.openapitools.client.model.ServiceUpdateSeverity;
import org.openapitools.client.model.ServiceUpdateStatus;
import org.openapitools.client.model.ServiceUpdateType;

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
 * ServiceUpdateListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:10.865581-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ServiceUpdateListInner {
  public static final String SERIALIZED_NAME_SERVICE_UPDATE_NAME = "ServiceUpdateName";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_NAME)
  private String serviceUpdateName;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_RELEASE_DATE = "ServiceUpdateReleaseDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_RELEASE_DATE)
  private OffsetDateTime serviceUpdateReleaseDate;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_END_DATE = "ServiceUpdateEndDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_END_DATE)
  private OffsetDateTime serviceUpdateEndDate;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_SEVERITY = "ServiceUpdateSeverity";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_SEVERITY)
  private ServiceUpdateSeverity serviceUpdateSeverity;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_RECOMMENDED_APPLY_BY_DATE = "ServiceUpdateRecommendedApplyByDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_RECOMMENDED_APPLY_BY_DATE)
  private OffsetDateTime serviceUpdateRecommendedApplyByDate;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_STATUS = "ServiceUpdateStatus";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_STATUS)
  private ServiceUpdateStatus serviceUpdateStatus;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_DESCRIPTION = "ServiceUpdateDescription";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_DESCRIPTION)
  private String serviceUpdateDescription;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_TYPE = "ServiceUpdateType";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_TYPE)
  private ServiceUpdateType serviceUpdateType;

  public static final String SERIALIZED_NAME_ENGINE = "Engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_AUTO_UPDATE_AFTER_RECOMMENDED_APPLY_BY_DATE = "AutoUpdateAfterRecommendedApplyByDate";
  @SerializedName(SERIALIZED_NAME_AUTO_UPDATE_AFTER_RECOMMENDED_APPLY_BY_DATE)
  private Boolean autoUpdateAfterRecommendedApplyByDate;

  public static final String SERIALIZED_NAME_ESTIMATED_UPDATE_TIME = "EstimatedUpdateTime";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_UPDATE_TIME)
  private String estimatedUpdateTime;

  public ServiceUpdateListInner() {
  }

  public ServiceUpdateListInner serviceUpdateName(String serviceUpdateName) {
    this.serviceUpdateName = serviceUpdateName;
    return this;
  }

  /**
   * Get serviceUpdateName
   * @return serviceUpdateName
   */
  @javax.annotation.Nullable
  public String getServiceUpdateName() {
    return serviceUpdateName;
  }

  public void setServiceUpdateName(String serviceUpdateName) {
    this.serviceUpdateName = serviceUpdateName;
  }


  public ServiceUpdateListInner serviceUpdateReleaseDate(OffsetDateTime serviceUpdateReleaseDate) {
    this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
    return this;
  }

  /**
   * Get serviceUpdateReleaseDate
   * @return serviceUpdateReleaseDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getServiceUpdateReleaseDate() {
    return serviceUpdateReleaseDate;
  }

  public void setServiceUpdateReleaseDate(OffsetDateTime serviceUpdateReleaseDate) {
    this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
  }


  public ServiceUpdateListInner serviceUpdateEndDate(OffsetDateTime serviceUpdateEndDate) {
    this.serviceUpdateEndDate = serviceUpdateEndDate;
    return this;
  }

  /**
   * Get serviceUpdateEndDate
   * @return serviceUpdateEndDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getServiceUpdateEndDate() {
    return serviceUpdateEndDate;
  }

  public void setServiceUpdateEndDate(OffsetDateTime serviceUpdateEndDate) {
    this.serviceUpdateEndDate = serviceUpdateEndDate;
  }


  public ServiceUpdateListInner serviceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
    this.serviceUpdateSeverity = serviceUpdateSeverity;
    return this;
  }

  /**
   * Get serviceUpdateSeverity
   * @return serviceUpdateSeverity
   */
  @javax.annotation.Nullable
  public ServiceUpdateSeverity getServiceUpdateSeverity() {
    return serviceUpdateSeverity;
  }

  public void setServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
    this.serviceUpdateSeverity = serviceUpdateSeverity;
  }


  public ServiceUpdateListInner serviceUpdateRecommendedApplyByDate(OffsetDateTime serviceUpdateRecommendedApplyByDate) {
    this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
    return this;
  }

  /**
   * Get serviceUpdateRecommendedApplyByDate
   * @return serviceUpdateRecommendedApplyByDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getServiceUpdateRecommendedApplyByDate() {
    return serviceUpdateRecommendedApplyByDate;
  }

  public void setServiceUpdateRecommendedApplyByDate(OffsetDateTime serviceUpdateRecommendedApplyByDate) {
    this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
  }


  public ServiceUpdateListInner serviceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
    this.serviceUpdateStatus = serviceUpdateStatus;
    return this;
  }

  /**
   * Get serviceUpdateStatus
   * @return serviceUpdateStatus
   */
  @javax.annotation.Nullable
  public ServiceUpdateStatus getServiceUpdateStatus() {
    return serviceUpdateStatus;
  }

  public void setServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
    this.serviceUpdateStatus = serviceUpdateStatus;
  }


  public ServiceUpdateListInner serviceUpdateDescription(String serviceUpdateDescription) {
    this.serviceUpdateDescription = serviceUpdateDescription;
    return this;
  }

  /**
   * Get serviceUpdateDescription
   * @return serviceUpdateDescription
   */
  @javax.annotation.Nullable
  public String getServiceUpdateDescription() {
    return serviceUpdateDescription;
  }

  public void setServiceUpdateDescription(String serviceUpdateDescription) {
    this.serviceUpdateDescription = serviceUpdateDescription;
  }


  public ServiceUpdateListInner serviceUpdateType(ServiceUpdateType serviceUpdateType) {
    this.serviceUpdateType = serviceUpdateType;
    return this;
  }

  /**
   * Get serviceUpdateType
   * @return serviceUpdateType
   */
  @javax.annotation.Nullable
  public ServiceUpdateType getServiceUpdateType() {
    return serviceUpdateType;
  }

  public void setServiceUpdateType(ServiceUpdateType serviceUpdateType) {
    this.serviceUpdateType = serviceUpdateType;
  }


  public ServiceUpdateListInner engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @javax.annotation.Nullable
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public ServiceUpdateListInner engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

  /**
   * Get engineVersion
   * @return engineVersion
   */
  @javax.annotation.Nullable
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }


  public ServiceUpdateListInner autoUpdateAfterRecommendedApplyByDate(Boolean autoUpdateAfterRecommendedApplyByDate) {
    this.autoUpdateAfterRecommendedApplyByDate = autoUpdateAfterRecommendedApplyByDate;
    return this;
  }

  /**
   * Get autoUpdateAfterRecommendedApplyByDate
   * @return autoUpdateAfterRecommendedApplyByDate
   */
  @javax.annotation.Nullable
  public Boolean getAutoUpdateAfterRecommendedApplyByDate() {
    return autoUpdateAfterRecommendedApplyByDate;
  }

  public void setAutoUpdateAfterRecommendedApplyByDate(Boolean autoUpdateAfterRecommendedApplyByDate) {
    this.autoUpdateAfterRecommendedApplyByDate = autoUpdateAfterRecommendedApplyByDate;
  }


  public ServiceUpdateListInner estimatedUpdateTime(String estimatedUpdateTime) {
    this.estimatedUpdateTime = estimatedUpdateTime;
    return this;
  }

  /**
   * Get estimatedUpdateTime
   * @return estimatedUpdateTime
   */
  @javax.annotation.Nullable
  public String getEstimatedUpdateTime() {
    return estimatedUpdateTime;
  }

  public void setEstimatedUpdateTime(String estimatedUpdateTime) {
    this.estimatedUpdateTime = estimatedUpdateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUpdateListInner serviceUpdateListInner = (ServiceUpdateListInner) o;
    return Objects.equals(this.serviceUpdateName, serviceUpdateListInner.serviceUpdateName) &&
        Objects.equals(this.serviceUpdateReleaseDate, serviceUpdateListInner.serviceUpdateReleaseDate) &&
        Objects.equals(this.serviceUpdateEndDate, serviceUpdateListInner.serviceUpdateEndDate) &&
        Objects.equals(this.serviceUpdateSeverity, serviceUpdateListInner.serviceUpdateSeverity) &&
        Objects.equals(this.serviceUpdateRecommendedApplyByDate, serviceUpdateListInner.serviceUpdateRecommendedApplyByDate) &&
        Objects.equals(this.serviceUpdateStatus, serviceUpdateListInner.serviceUpdateStatus) &&
        Objects.equals(this.serviceUpdateDescription, serviceUpdateListInner.serviceUpdateDescription) &&
        Objects.equals(this.serviceUpdateType, serviceUpdateListInner.serviceUpdateType) &&
        Objects.equals(this.engine, serviceUpdateListInner.engine) &&
        Objects.equals(this.engineVersion, serviceUpdateListInner.engineVersion) &&
        Objects.equals(this.autoUpdateAfterRecommendedApplyByDate, serviceUpdateListInner.autoUpdateAfterRecommendedApplyByDate) &&
        Objects.equals(this.estimatedUpdateTime, serviceUpdateListInner.estimatedUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceUpdateName, serviceUpdateReleaseDate, serviceUpdateEndDate, serviceUpdateSeverity, serviceUpdateRecommendedApplyByDate, serviceUpdateStatus, serviceUpdateDescription, serviceUpdateType, engine, engineVersion, autoUpdateAfterRecommendedApplyByDate, estimatedUpdateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUpdateListInner {\n");
    sb.append("    serviceUpdateName: ").append(toIndentedString(serviceUpdateName)).append("\n");
    sb.append("    serviceUpdateReleaseDate: ").append(toIndentedString(serviceUpdateReleaseDate)).append("\n");
    sb.append("    serviceUpdateEndDate: ").append(toIndentedString(serviceUpdateEndDate)).append("\n");
    sb.append("    serviceUpdateSeverity: ").append(toIndentedString(serviceUpdateSeverity)).append("\n");
    sb.append("    serviceUpdateRecommendedApplyByDate: ").append(toIndentedString(serviceUpdateRecommendedApplyByDate)).append("\n");
    sb.append("    serviceUpdateStatus: ").append(toIndentedString(serviceUpdateStatus)).append("\n");
    sb.append("    serviceUpdateDescription: ").append(toIndentedString(serviceUpdateDescription)).append("\n");
    sb.append("    serviceUpdateType: ").append(toIndentedString(serviceUpdateType)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    autoUpdateAfterRecommendedApplyByDate: ").append(toIndentedString(autoUpdateAfterRecommendedApplyByDate)).append("\n");
    sb.append("    estimatedUpdateTime: ").append(toIndentedString(estimatedUpdateTime)).append("\n");
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
    openapiFields.add("ServiceUpdateName");
    openapiFields.add("ServiceUpdateReleaseDate");
    openapiFields.add("ServiceUpdateEndDate");
    openapiFields.add("ServiceUpdateSeverity");
    openapiFields.add("ServiceUpdateRecommendedApplyByDate");
    openapiFields.add("ServiceUpdateStatus");
    openapiFields.add("ServiceUpdateDescription");
    openapiFields.add("ServiceUpdateType");
    openapiFields.add("Engine");
    openapiFields.add("EngineVersion");
    openapiFields.add("AutoUpdateAfterRecommendedApplyByDate");
    openapiFields.add("EstimatedUpdateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ServiceUpdateListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ServiceUpdateListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceUpdateListInner is not found in the empty JSON string", ServiceUpdateListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ServiceUpdateListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceUpdateListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ServiceUpdateName`
      if (jsonObj.get("ServiceUpdateName") != null && !jsonObj.get("ServiceUpdateName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceUpdateName"));
      }
      // validate the optional field `ServiceUpdateReleaseDate`
      if (jsonObj.get("ServiceUpdateReleaseDate") != null && !jsonObj.get("ServiceUpdateReleaseDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ServiceUpdateReleaseDate"));
      }
      // validate the optional field `ServiceUpdateEndDate`
      if (jsonObj.get("ServiceUpdateEndDate") != null && !jsonObj.get("ServiceUpdateEndDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ServiceUpdateEndDate"));
      }
      // validate the optional field `ServiceUpdateSeverity`
      if (jsonObj.get("ServiceUpdateSeverity") != null && !jsonObj.get("ServiceUpdateSeverity").isJsonNull()) {
        ServiceUpdateSeverity.validateJsonElement(jsonObj.get("ServiceUpdateSeverity"));
      }
      // validate the optional field `ServiceUpdateRecommendedApplyByDate`
      if (jsonObj.get("ServiceUpdateRecommendedApplyByDate") != null && !jsonObj.get("ServiceUpdateRecommendedApplyByDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ServiceUpdateRecommendedApplyByDate"));
      }
      // validate the optional field `ServiceUpdateStatus`
      if (jsonObj.get("ServiceUpdateStatus") != null && !jsonObj.get("ServiceUpdateStatus").isJsonNull()) {
        ServiceUpdateStatus.validateJsonElement(jsonObj.get("ServiceUpdateStatus"));
      }
      // validate the optional field `ServiceUpdateDescription`
      if (jsonObj.get("ServiceUpdateDescription") != null && !jsonObj.get("ServiceUpdateDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceUpdateDescription"));
      }
      // validate the optional field `ServiceUpdateType`
      if (jsonObj.get("ServiceUpdateType") != null && !jsonObj.get("ServiceUpdateType").isJsonNull()) {
        ServiceUpdateType.validateJsonElement(jsonObj.get("ServiceUpdateType"));
      }
      // validate the optional field `Engine`
      if (jsonObj.get("Engine") != null && !jsonObj.get("Engine").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Engine"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `AutoUpdateAfterRecommendedApplyByDate`
      if (jsonObj.get("AutoUpdateAfterRecommendedApplyByDate") != null && !jsonObj.get("AutoUpdateAfterRecommendedApplyByDate").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AutoUpdateAfterRecommendedApplyByDate"));
      }
      // validate the optional field `EstimatedUpdateTime`
      if (jsonObj.get("EstimatedUpdateTime") != null && !jsonObj.get("EstimatedUpdateTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EstimatedUpdateTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceUpdateListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceUpdateListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceUpdateListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceUpdateListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceUpdateListInner>() {
           @Override
           public void write(JsonWriter out, ServiceUpdateListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceUpdateListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ServiceUpdateListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ServiceUpdateListInner
   * @throws IOException if the JSON string is invalid with respect to ServiceUpdateListInner
   */
  public static ServiceUpdateListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceUpdateListInner.class);
  }

  /**
   * Convert an instance of ServiceUpdateListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

