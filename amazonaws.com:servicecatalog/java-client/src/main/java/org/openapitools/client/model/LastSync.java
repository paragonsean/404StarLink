/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import org.openapitools.client.model.LastSyncStatus;

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
 * &lt;p&gt;Provides details about the product&#39;s connection sync and contains the following sub-fields. &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;LastSyncTime&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;LastSyncStatus&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;LastSyncStatusMessage&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;LastSuccessfulSyncTime&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;LastSuccessfulSyncProvisioningArtifactID&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LastSync {
  public static final String SERIALIZED_NAME_LAST_SYNC_TIME = "LastSyncTime";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_TIME)
  private OffsetDateTime lastSyncTime;

  public static final String SERIALIZED_NAME_LAST_SYNC_STATUS = "LastSyncStatus";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_STATUS)
  private LastSyncStatus lastSyncStatus;

  public static final String SERIALIZED_NAME_LAST_SYNC_STATUS_MESSAGE = "LastSyncStatusMessage";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_STATUS_MESSAGE)
  private String lastSyncStatusMessage;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_SYNC_TIME = "LastSuccessfulSyncTime";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_SYNC_TIME)
  private OffsetDateTime lastSuccessfulSyncTime;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_SYNC_PROVISIONING_ARTIFACT_ID = "LastSuccessfulSyncProvisioningArtifactId";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_SYNC_PROVISIONING_ARTIFACT_ID)
  private String lastSuccessfulSyncProvisioningArtifactId;

  public LastSync() {
  }

  public LastSync lastSyncTime(OffsetDateTime lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    return this;
  }

  /**
   * Get lastSyncTime
   * @return lastSyncTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastSyncTime() {
    return lastSyncTime;
  }

  public void setLastSyncTime(OffsetDateTime lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
  }


  public LastSync lastSyncStatus(LastSyncStatus lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
    return this;
  }

  /**
   * Get lastSyncStatus
   * @return lastSyncStatus
   */
  @javax.annotation.Nullable
  public LastSyncStatus getLastSyncStatus() {
    return lastSyncStatus;
  }

  public void setLastSyncStatus(LastSyncStatus lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
  }


  public LastSync lastSyncStatusMessage(String lastSyncStatusMessage) {
    this.lastSyncStatusMessage = lastSyncStatusMessage;
    return this;
  }

  /**
   * Get lastSyncStatusMessage
   * @return lastSyncStatusMessage
   */
  @javax.annotation.Nullable
  public String getLastSyncStatusMessage() {
    return lastSyncStatusMessage;
  }

  public void setLastSyncStatusMessage(String lastSyncStatusMessage) {
    this.lastSyncStatusMessage = lastSyncStatusMessage;
  }


  public LastSync lastSuccessfulSyncTime(OffsetDateTime lastSuccessfulSyncTime) {
    this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
    return this;
  }

  /**
   * Get lastSuccessfulSyncTime
   * @return lastSuccessfulSyncTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastSuccessfulSyncTime() {
    return lastSuccessfulSyncTime;
  }

  public void setLastSuccessfulSyncTime(OffsetDateTime lastSuccessfulSyncTime) {
    this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
  }


  public LastSync lastSuccessfulSyncProvisioningArtifactId(String lastSuccessfulSyncProvisioningArtifactId) {
    this.lastSuccessfulSyncProvisioningArtifactId = lastSuccessfulSyncProvisioningArtifactId;
    return this;
  }

  /**
   * Get lastSuccessfulSyncProvisioningArtifactId
   * @return lastSuccessfulSyncProvisioningArtifactId
   */
  @javax.annotation.Nullable
  public String getLastSuccessfulSyncProvisioningArtifactId() {
    return lastSuccessfulSyncProvisioningArtifactId;
  }

  public void setLastSuccessfulSyncProvisioningArtifactId(String lastSuccessfulSyncProvisioningArtifactId) {
    this.lastSuccessfulSyncProvisioningArtifactId = lastSuccessfulSyncProvisioningArtifactId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastSync lastSync = (LastSync) o;
    return Objects.equals(this.lastSyncTime, lastSync.lastSyncTime) &&
        Objects.equals(this.lastSyncStatus, lastSync.lastSyncStatus) &&
        Objects.equals(this.lastSyncStatusMessage, lastSync.lastSyncStatusMessage) &&
        Objects.equals(this.lastSuccessfulSyncTime, lastSync.lastSuccessfulSyncTime) &&
        Objects.equals(this.lastSuccessfulSyncProvisioningArtifactId, lastSync.lastSuccessfulSyncProvisioningArtifactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSyncTime, lastSyncStatus, lastSyncStatusMessage, lastSuccessfulSyncTime, lastSuccessfulSyncProvisioningArtifactId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastSync {\n");
    sb.append("    lastSyncTime: ").append(toIndentedString(lastSyncTime)).append("\n");
    sb.append("    lastSyncStatus: ").append(toIndentedString(lastSyncStatus)).append("\n");
    sb.append("    lastSyncStatusMessage: ").append(toIndentedString(lastSyncStatusMessage)).append("\n");
    sb.append("    lastSuccessfulSyncTime: ").append(toIndentedString(lastSuccessfulSyncTime)).append("\n");
    sb.append("    lastSuccessfulSyncProvisioningArtifactId: ").append(toIndentedString(lastSuccessfulSyncProvisioningArtifactId)).append("\n");
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
    openapiFields.add("LastSyncTime");
    openapiFields.add("LastSyncStatus");
    openapiFields.add("LastSyncStatusMessage");
    openapiFields.add("LastSuccessfulSyncTime");
    openapiFields.add("LastSuccessfulSyncProvisioningArtifactId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LastSync
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LastSync.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LastSync is not found in the empty JSON string", LastSync.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LastSync.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LastSync` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LastSyncTime`
      if (jsonObj.get("LastSyncTime") != null && !jsonObj.get("LastSyncTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("LastSyncTime"));
      }
      // validate the optional field `LastSyncStatus`
      if (jsonObj.get("LastSyncStatus") != null && !jsonObj.get("LastSyncStatus").isJsonNull()) {
        LastSyncStatus.validateJsonElement(jsonObj.get("LastSyncStatus"));
      }
      // validate the optional field `LastSyncStatusMessage`
      if (jsonObj.get("LastSyncStatusMessage") != null && !jsonObj.get("LastSyncStatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastSyncStatusMessage"));
      }
      // validate the optional field `LastSuccessfulSyncTime`
      if (jsonObj.get("LastSuccessfulSyncTime") != null && !jsonObj.get("LastSuccessfulSyncTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("LastSuccessfulSyncTime"));
      }
      // validate the optional field `LastSuccessfulSyncProvisioningArtifactId`
      if (jsonObj.get("LastSuccessfulSyncProvisioningArtifactId") != null && !jsonObj.get("LastSuccessfulSyncProvisioningArtifactId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastSuccessfulSyncProvisioningArtifactId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LastSync.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LastSync' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LastSync> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LastSync.class));

       return (TypeAdapter<T>) new TypeAdapter<LastSync>() {
           @Override
           public void write(JsonWriter out, LastSync value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LastSync read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LastSync given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LastSync
   * @throws IOException if the JSON string is invalid with respect to LastSync
   */
  public static LastSync fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LastSync.class);
  }

  /**
   * Convert an instance of LastSync to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

