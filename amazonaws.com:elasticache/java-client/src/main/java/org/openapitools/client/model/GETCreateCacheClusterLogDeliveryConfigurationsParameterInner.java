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
import java.util.Arrays;
import org.openapitools.client.model.DestinationType;
import org.openapitools.client.model.LogDeliveryConfigurationRequestDestinationDetails;
import org.openapitools.client.model.LogFormat;
import org.openapitools.client.model.LogType;

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
 * GETCreateCacheClusterLogDeliveryConfigurationsParameterInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:52.956161-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GETCreateCacheClusterLogDeliveryConfigurationsParameterInner {
  public static final String SERIALIZED_NAME_LOG_TYPE = "LogType";
  @SerializedName(SERIALIZED_NAME_LOG_TYPE)
  private LogType logType;

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "DestinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private DestinationType destinationType;

  public static final String SERIALIZED_NAME_DESTINATION_DETAILS = "DestinationDetails";
  @SerializedName(SERIALIZED_NAME_DESTINATION_DETAILS)
  private LogDeliveryConfigurationRequestDestinationDetails destinationDetails;

  public static final String SERIALIZED_NAME_LOG_FORMAT = "LogFormat";
  @SerializedName(SERIALIZED_NAME_LOG_FORMAT)
  private LogFormat logFormat;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner() {
  }

  public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner logType(LogType logType) {
    this.logType = logType;
    return this;
  }

  /**
   * Get logType
   * @return logType
   */
  @javax.annotation.Nullable
  public LogType getLogType() {
    return logType;
  }

  public void setLogType(LogType logType) {
    this.logType = logType;
  }


  public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner destinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  /**
   * Get destinationType
   * @return destinationType
   */
  @javax.annotation.Nullable
  public DestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
  }


  public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner destinationDetails(LogDeliveryConfigurationRequestDestinationDetails destinationDetails) {
    this.destinationDetails = destinationDetails;
    return this;
  }

  /**
   * Get destinationDetails
   * @return destinationDetails
   */
  @javax.annotation.Nullable
  public LogDeliveryConfigurationRequestDestinationDetails getDestinationDetails() {
    return destinationDetails;
  }

  public void setDestinationDetails(LogDeliveryConfigurationRequestDestinationDetails destinationDetails) {
    this.destinationDetails = destinationDetails;
  }


  public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner logFormat(LogFormat logFormat) {
    this.logFormat = logFormat;
    return this;
  }

  /**
   * Get logFormat
   * @return logFormat
   */
  @javax.annotation.Nullable
  public LogFormat getLogFormat() {
    return logFormat;
  }

  public void setLogFormat(LogFormat logFormat) {
    this.logFormat = logFormat;
  }


  public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETCreateCacheClusterLogDeliveryConfigurationsParameterInner geTCreateCacheClusterLogDeliveryConfigurationsParameterInner = (GETCreateCacheClusterLogDeliveryConfigurationsParameterInner) o;
    return Objects.equals(this.logType, geTCreateCacheClusterLogDeliveryConfigurationsParameterInner.logType) &&
        Objects.equals(this.destinationType, geTCreateCacheClusterLogDeliveryConfigurationsParameterInner.destinationType) &&
        Objects.equals(this.destinationDetails, geTCreateCacheClusterLogDeliveryConfigurationsParameterInner.destinationDetails) &&
        Objects.equals(this.logFormat, geTCreateCacheClusterLogDeliveryConfigurationsParameterInner.logFormat) &&
        Objects.equals(this.enabled, geTCreateCacheClusterLogDeliveryConfigurationsParameterInner.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logType, destinationType, destinationDetails, logFormat, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETCreateCacheClusterLogDeliveryConfigurationsParameterInner {\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destinationDetails: ").append(toIndentedString(destinationDetails)).append("\n");
    sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("LogType");
    openapiFields.add("DestinationType");
    openapiFields.add("DestinationDetails");
    openapiFields.add("LogFormat");
    openapiFields.add("Enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GETCreateCacheClusterLogDeliveryConfigurationsParameterInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GETCreateCacheClusterLogDeliveryConfigurationsParameterInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GETCreateCacheClusterLogDeliveryConfigurationsParameterInner is not found in the empty JSON string", GETCreateCacheClusterLogDeliveryConfigurationsParameterInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GETCreateCacheClusterLogDeliveryConfigurationsParameterInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GETCreateCacheClusterLogDeliveryConfigurationsParameterInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LogType`
      if (jsonObj.get("LogType") != null && !jsonObj.get("LogType").isJsonNull()) {
        LogType.validateJsonElement(jsonObj.get("LogType"));
      }
      // validate the optional field `DestinationType`
      if (jsonObj.get("DestinationType") != null && !jsonObj.get("DestinationType").isJsonNull()) {
        DestinationType.validateJsonElement(jsonObj.get("DestinationType"));
      }
      // validate the optional field `DestinationDetails`
      if (jsonObj.get("DestinationDetails") != null && !jsonObj.get("DestinationDetails").isJsonNull()) {
        LogDeliveryConfigurationRequestDestinationDetails.validateJsonElement(jsonObj.get("DestinationDetails"));
      }
      // validate the optional field `LogFormat`
      if (jsonObj.get("LogFormat") != null && !jsonObj.get("LogFormat").isJsonNull()) {
        LogFormat.validateJsonElement(jsonObj.get("LogFormat"));
      }
      // validate the optional field `Enabled`
      if (jsonObj.get("Enabled") != null && !jsonObj.get("Enabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Enabled"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GETCreateCacheClusterLogDeliveryConfigurationsParameterInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GETCreateCacheClusterLogDeliveryConfigurationsParameterInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GETCreateCacheClusterLogDeliveryConfigurationsParameterInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GETCreateCacheClusterLogDeliveryConfigurationsParameterInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GETCreateCacheClusterLogDeliveryConfigurationsParameterInner>() {
           @Override
           public void write(JsonWriter out, GETCreateCacheClusterLogDeliveryConfigurationsParameterInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GETCreateCacheClusterLogDeliveryConfigurationsParameterInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GETCreateCacheClusterLogDeliveryConfigurationsParameterInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GETCreateCacheClusterLogDeliveryConfigurationsParameterInner
   * @throws IOException if the JSON string is invalid with respect to GETCreateCacheClusterLogDeliveryConfigurationsParameterInner
   */
  public static GETCreateCacheClusterLogDeliveryConfigurationsParameterInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GETCreateCacheClusterLogDeliveryConfigurationsParameterInner.class);
  }

  /**
   * Convert an instance of GETCreateCacheClusterLogDeliveryConfigurationsParameterInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

