/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
 *
 * The version of the OpenAPI document: v1beta1
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
 * The current status of a Replica.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:20.455241-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReplicaStatus {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION = "templateVersion";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION)
  private String templateVersion;

  public static final String SERIALIZED_NAME_VM_LINK = "vmLink";
  @SerializedName(SERIALIZED_NAME_VM_LINK)
  private String vmLink;

  public static final String SERIALIZED_NAME_VM_START_TIME = "vmStartTime";
  @SerializedName(SERIALIZED_NAME_VM_START_TIME)
  private String vmStartTime;

  public ReplicaStatus() {
  }

  public ReplicaStatus details(String details) {
    this.details = details;
    return this;
  }

  /**
   * [Output Only] Human-readable details about the current state of the replica
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public ReplicaStatus state(String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output Only] The state of the Replica.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public ReplicaStatus templateVersion(String templateVersion) {
    this.templateVersion = templateVersion;
    return this;
  }

  /**
   * [Output Only] The template used to build the replica.
   * @return templateVersion
   */
  @javax.annotation.Nullable
  public String getTemplateVersion() {
    return templateVersion;
  }

  public void setTemplateVersion(String templateVersion) {
    this.templateVersion = templateVersion;
  }


  public ReplicaStatus vmLink(String vmLink) {
    this.vmLink = vmLink;
    return this;
  }

  /**
   * [Output Only] Link to the virtual machine that this Replica represents.
   * @return vmLink
   */
  @javax.annotation.Nullable
  public String getVmLink() {
    return vmLink;
  }

  public void setVmLink(String vmLink) {
    this.vmLink = vmLink;
  }


  public ReplicaStatus vmStartTime(String vmStartTime) {
    this.vmStartTime = vmStartTime;
    return this;
  }

  /**
   * [Output Only] The time that this Replica got to the RUNNING state, in RFC 3339 format. If the start time is unknown, UNKNOWN is returned.
   * @return vmStartTime
   */
  @javax.annotation.Nullable
  public String getVmStartTime() {
    return vmStartTime;
  }

  public void setVmStartTime(String vmStartTime) {
    this.vmStartTime = vmStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicaStatus replicaStatus = (ReplicaStatus) o;
    return Objects.equals(this.details, replicaStatus.details) &&
        Objects.equals(this.state, replicaStatus.state) &&
        Objects.equals(this.templateVersion, replicaStatus.templateVersion) &&
        Objects.equals(this.vmLink, replicaStatus.vmLink) &&
        Objects.equals(this.vmStartTime, replicaStatus.vmStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, state, templateVersion, vmLink, vmStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicaStatus {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
    sb.append("    vmLink: ").append(toIndentedString(vmLink)).append("\n");
    sb.append("    vmStartTime: ").append(toIndentedString(vmStartTime)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("state");
    openapiFields.add("templateVersion");
    openapiFields.add("vmLink");
    openapiFields.add("vmStartTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReplicaStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReplicaStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicaStatus is not found in the empty JSON string", ReplicaStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReplicaStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReplicaStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("templateVersion") != null && !jsonObj.get("templateVersion").isJsonNull()) && !jsonObj.get("templateVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateVersion").toString()));
      }
      if ((jsonObj.get("vmLink") != null && !jsonObj.get("vmLink").isJsonNull()) && !jsonObj.get("vmLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vmLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vmLink").toString()));
      }
      if ((jsonObj.get("vmStartTime") != null && !jsonObj.get("vmStartTime").isJsonNull()) && !jsonObj.get("vmStartTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vmStartTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vmStartTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicaStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicaStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicaStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicaStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicaStatus>() {
           @Override
           public void write(JsonWriter out, ReplicaStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReplicaStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReplicaStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReplicaStatus
   * @throws IOException if the JSON string is invalid with respect to ReplicaStatus
   */
  public static ReplicaStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicaStatus.class);
  }

  /**
   * Convert an instance of ReplicaStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

