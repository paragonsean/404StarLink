/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v3
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CollectdPayload;
import org.openapitools.client.model.MonitoredResource;

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
 * The CreateCollectdTimeSeries request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateCollectdTimeSeriesRequest {
  public static final String SERIALIZED_NAME_COLLECTD_PAYLOADS = "collectdPayloads";
  @SerializedName(SERIALIZED_NAME_COLLECTD_PAYLOADS)
  private List<CollectdPayload> collectdPayloads = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLLECTD_VERSION = "collectdVersion";
  @SerializedName(SERIALIZED_NAME_COLLECTD_VERSION)
  private String collectdVersion;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private MonitoredResource resource;

  public CreateCollectdTimeSeriesRequest() {
  }

  public CreateCollectdTimeSeriesRequest collectdPayloads(List<CollectdPayload> collectdPayloads) {
    this.collectdPayloads = collectdPayloads;
    return this;
  }

  public CreateCollectdTimeSeriesRequest addCollectdPayloadsItem(CollectdPayload collectdPayloadsItem) {
    if (this.collectdPayloads == null) {
      this.collectdPayloads = new ArrayList<>();
    }
    this.collectdPayloads.add(collectdPayloadsItem);
    return this;
  }

  /**
   * The collectd payloads representing the time series data. You must not include more than a single point for each time series, so no two payloads can have the same values for all of the fields plugin, plugin_instance, type, and type_instance.
   * @return collectdPayloads
   */
  @javax.annotation.Nullable
  public List<CollectdPayload> getCollectdPayloads() {
    return collectdPayloads;
  }

  public void setCollectdPayloads(List<CollectdPayload> collectdPayloads) {
    this.collectdPayloads = collectdPayloads;
  }


  public CreateCollectdTimeSeriesRequest collectdVersion(String collectdVersion) {
    this.collectdVersion = collectdVersion;
    return this;
  }

  /**
   * The version of collectd that collected the data. Example: \&quot;5.3.0-192.el6\&quot;.
   * @return collectdVersion
   */
  @javax.annotation.Nullable
  public String getCollectdVersion() {
    return collectdVersion;
  }

  public void setCollectdVersion(String collectdVersion) {
    this.collectdVersion = collectdVersion;
  }


  public CreateCollectdTimeSeriesRequest resource(MonitoredResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @javax.annotation.Nullable
  public MonitoredResource getResource() {
    return resource;
  }

  public void setResource(MonitoredResource resource) {
    this.resource = resource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollectdTimeSeriesRequest createCollectdTimeSeriesRequest = (CreateCollectdTimeSeriesRequest) o;
    return Objects.equals(this.collectdPayloads, createCollectdTimeSeriesRequest.collectdPayloads) &&
        Objects.equals(this.collectdVersion, createCollectdTimeSeriesRequest.collectdVersion) &&
        Objects.equals(this.resource, createCollectdTimeSeriesRequest.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectdPayloads, collectdVersion, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollectdTimeSeriesRequest {\n");
    sb.append("    collectdPayloads: ").append(toIndentedString(collectdPayloads)).append("\n");
    sb.append("    collectdVersion: ").append(toIndentedString(collectdVersion)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("collectdPayloads");
    openapiFields.add("collectdVersion");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCollectdTimeSeriesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCollectdTimeSeriesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCollectdTimeSeriesRequest is not found in the empty JSON string", CreateCollectdTimeSeriesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCollectdTimeSeriesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCollectdTimeSeriesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("collectdPayloads") != null && !jsonObj.get("collectdPayloads").isJsonNull()) {
        JsonArray jsonArraycollectdPayloads = jsonObj.getAsJsonArray("collectdPayloads");
        if (jsonArraycollectdPayloads != null) {
          // ensure the json data is an array
          if (!jsonObj.get("collectdPayloads").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `collectdPayloads` to be an array in the JSON string but got `%s`", jsonObj.get("collectdPayloads").toString()));
          }

          // validate the optional field `collectdPayloads` (array)
          for (int i = 0; i < jsonArraycollectdPayloads.size(); i++) {
            CollectdPayload.validateJsonElement(jsonArraycollectdPayloads.get(i));
          };
        }
      }
      if ((jsonObj.get("collectdVersion") != null && !jsonObj.get("collectdVersion").isJsonNull()) && !jsonObj.get("collectdVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectdVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectdVersion").toString()));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        MonitoredResource.validateJsonElement(jsonObj.get("resource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCollectdTimeSeriesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCollectdTimeSeriesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCollectdTimeSeriesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCollectdTimeSeriesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCollectdTimeSeriesRequest>() {
           @Override
           public void write(JsonWriter out, CreateCollectdTimeSeriesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCollectdTimeSeriesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCollectdTimeSeriesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCollectdTimeSeriesRequest
   * @throws IOException if the JSON string is invalid with respect to CreateCollectdTimeSeriesRequest
   */
  public static CreateCollectdTimeSeriesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCollectdTimeSeriesRequest.class);
  }

  /**
   * Convert an instance of CreateCollectdTimeSeriesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

