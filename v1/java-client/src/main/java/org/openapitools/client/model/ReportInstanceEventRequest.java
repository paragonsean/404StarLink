/*
 * Notebooks API
 * Notebooks API is used to manage notebook resources in Google Cloud.
 *
 * The version of the OpenAPI document: v1
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
import java.util.Arrays;
import org.openapitools.client.model.Event;

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
 * Request for reporting a Managed Notebook Event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:12.602654-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReportInstanceEventRequest {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Event event;

  public static final String SERIALIZED_NAME_VM_ID = "vmId";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public ReportInstanceEventRequest() {
  }

  public ReportInstanceEventRequest event(Event event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @javax.annotation.Nullable
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }


  public ReportInstanceEventRequest vmId(String vmId) {
    this.vmId = vmId;
    return this;
  }

  /**
   * Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * @return vmId
   */
  @javax.annotation.Nullable
  public String getVmId() {
    return vmId;
  }

  public void setVmId(String vmId) {
    this.vmId = vmId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInstanceEventRequest reportInstanceEventRequest = (ReportInstanceEventRequest) o;
    return Objects.equals(this.event, reportInstanceEventRequest.event) &&
        Objects.equals(this.vmId, reportInstanceEventRequest.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInstanceEventRequest {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("vmId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportInstanceEventRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportInstanceEventRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportInstanceEventRequest is not found in the empty JSON string", ReportInstanceEventRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportInstanceEventRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportInstanceEventRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `event`
      if (jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) {
        Event.validateJsonElement(jsonObj.get("event"));
      }
      if ((jsonObj.get("vmId") != null && !jsonObj.get("vmId").isJsonNull()) && !jsonObj.get("vmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vmId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportInstanceEventRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportInstanceEventRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportInstanceEventRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportInstanceEventRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportInstanceEventRequest>() {
           @Override
           public void write(JsonWriter out, ReportInstanceEventRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportInstanceEventRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportInstanceEventRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportInstanceEventRequest
   * @throws IOException if the JSON string is invalid with respect to ReportInstanceEventRequest
   */
  public static ReportInstanceEventRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportInstanceEventRequest.class);
  }

  /**
   * Convert an instance of ReportInstanceEventRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

