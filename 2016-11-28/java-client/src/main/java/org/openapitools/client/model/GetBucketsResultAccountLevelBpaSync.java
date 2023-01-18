/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import org.openapitools.client.model.AccountLevelBpaSyncStatus;
import org.openapitools.client.model.BPAStatusMessage;

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
 * GetBucketsResultAccountLevelBpaSync
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetBucketsResultAccountLevelBpaSync {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AccountLevelBpaSyncStatus status;

  public static final String SERIALIZED_NAME_LAST_SYNCED_AT = "lastSyncedAt";
  @SerializedName(SERIALIZED_NAME_LAST_SYNCED_AT)
  private OffsetDateTime lastSyncedAt;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private BPAStatusMessage message;

  public static final String SERIALIZED_NAME_BPA_IMPACTS_LIGHTSAIL = "bpaImpactsLightsail";
  @SerializedName(SERIALIZED_NAME_BPA_IMPACTS_LIGHTSAIL)
  private Boolean bpaImpactsLightsail;

  public GetBucketsResultAccountLevelBpaSync() {
  }

  public GetBucketsResultAccountLevelBpaSync status(AccountLevelBpaSyncStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public AccountLevelBpaSyncStatus getStatus() {
    return status;
  }

  public void setStatus(AccountLevelBpaSyncStatus status) {
    this.status = status;
  }


  public GetBucketsResultAccountLevelBpaSync lastSyncedAt(OffsetDateTime lastSyncedAt) {
    this.lastSyncedAt = lastSyncedAt;
    return this;
  }

  /**
   * Get lastSyncedAt
   * @return lastSyncedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastSyncedAt() {
    return lastSyncedAt;
  }

  public void setLastSyncedAt(OffsetDateTime lastSyncedAt) {
    this.lastSyncedAt = lastSyncedAt;
  }


  public GetBucketsResultAccountLevelBpaSync message(BPAStatusMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public BPAStatusMessage getMessage() {
    return message;
  }

  public void setMessage(BPAStatusMessage message) {
    this.message = message;
  }


  public GetBucketsResultAccountLevelBpaSync bpaImpactsLightsail(Boolean bpaImpactsLightsail) {
    this.bpaImpactsLightsail = bpaImpactsLightsail;
    return this;
  }

  /**
   * Get bpaImpactsLightsail
   * @return bpaImpactsLightsail
   */
  @javax.annotation.Nullable
  public Boolean getBpaImpactsLightsail() {
    return bpaImpactsLightsail;
  }

  public void setBpaImpactsLightsail(Boolean bpaImpactsLightsail) {
    this.bpaImpactsLightsail = bpaImpactsLightsail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBucketsResultAccountLevelBpaSync getBucketsResultAccountLevelBpaSync = (GetBucketsResultAccountLevelBpaSync) o;
    return Objects.equals(this.status, getBucketsResultAccountLevelBpaSync.status) &&
        Objects.equals(this.lastSyncedAt, getBucketsResultAccountLevelBpaSync.lastSyncedAt) &&
        Objects.equals(this.message, getBucketsResultAccountLevelBpaSync.message) &&
        Objects.equals(this.bpaImpactsLightsail, getBucketsResultAccountLevelBpaSync.bpaImpactsLightsail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, lastSyncedAt, message, bpaImpactsLightsail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBucketsResultAccountLevelBpaSync {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastSyncedAt: ").append(toIndentedString(lastSyncedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    bpaImpactsLightsail: ").append(toIndentedString(bpaImpactsLightsail)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("lastSyncedAt");
    openapiFields.add("message");
    openapiFields.add("bpaImpactsLightsail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBucketsResultAccountLevelBpaSync
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBucketsResultAccountLevelBpaSync.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBucketsResultAccountLevelBpaSync is not found in the empty JSON string", GetBucketsResultAccountLevelBpaSync.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBucketsResultAccountLevelBpaSync.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBucketsResultAccountLevelBpaSync` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        AccountLevelBpaSyncStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `lastSyncedAt`
      if (jsonObj.get("lastSyncedAt") != null && !jsonObj.get("lastSyncedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastSyncedAt"));
      }
      // validate the optional field `message`
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) {
        BPAStatusMessage.validateJsonElement(jsonObj.get("message"));
      }
      // validate the optional field `bpaImpactsLightsail`
      if (jsonObj.get("bpaImpactsLightsail") != null && !jsonObj.get("bpaImpactsLightsail").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("bpaImpactsLightsail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBucketsResultAccountLevelBpaSync.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBucketsResultAccountLevelBpaSync' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBucketsResultAccountLevelBpaSync> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBucketsResultAccountLevelBpaSync.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBucketsResultAccountLevelBpaSync>() {
           @Override
           public void write(JsonWriter out, GetBucketsResultAccountLevelBpaSync value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBucketsResultAccountLevelBpaSync read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBucketsResultAccountLevelBpaSync given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBucketsResultAccountLevelBpaSync
   * @throws IOException if the JSON string is invalid with respect to GetBucketsResultAccountLevelBpaSync
   */
  public static GetBucketsResultAccountLevelBpaSync fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBucketsResultAccountLevelBpaSync.class);
  }

  /**
   * Convert an instance of GetBucketsResultAccountLevelBpaSync to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

