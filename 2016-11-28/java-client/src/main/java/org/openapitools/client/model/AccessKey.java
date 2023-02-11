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
import org.openapitools.client.model.AccessKeyLastUsed;
import org.openapitools.client.model.StatusType;

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
 * &lt;p&gt;Describes an access key for an Amazon Lightsail bucket.&lt;/p&gt; &lt;p&gt;Access keys grant full programmatic access to the specified bucket and its objects. You can have a maximum of two access keys per bucket. Use the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateBucketAccessKey.html\&quot;&gt;CreateBucketAccessKey&lt;/a&gt; action to create an access key for a specific bucket. For more information about access keys, see &lt;a href&#x3D;\&quot;https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-bucket-access-keys\&quot;&gt;Creating access keys for a bucket in Amazon Lightsail&lt;/a&gt; in the &lt;i&gt;Amazon Lightsail Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;important&gt; &lt;p&gt;The &lt;code&gt;secretAccessKey&lt;/code&gt; value is returned only in response to the &lt;code&gt;CreateBucketAccessKey&lt;/code&gt; action. You can get a secret access key only when you first create an access key; you cannot get the secret access key later. If you lose the secret access key, you must create a new access key.&lt;/p&gt; &lt;/important&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AccessKey {
  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "accessKeyId";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY = "secretAccessKey";
  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY)
  private String secretAccessKey;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusType status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_USED = "lastUsed";
  @SerializedName(SERIALIZED_NAME_LAST_USED)
  private AccessKeyLastUsed lastUsed;

  public AccessKey() {
  }

  public AccessKey accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Get accessKeyId
   * @return accessKeyId
   */
  @javax.annotation.Nullable
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AccessKey secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * Get secretAccessKey
   * @return secretAccessKey
   */
  @javax.annotation.Nullable
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  public AccessKey status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }


  public AccessKey createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AccessKey lastUsed(AccessKeyLastUsed lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

  /**
   * Get lastUsed
   * @return lastUsed
   */
  @javax.annotation.Nullable
  public AccessKeyLastUsed getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(AccessKeyLastUsed lastUsed) {
    this.lastUsed = lastUsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKey accessKey = (AccessKey) o;
    return Objects.equals(this.accessKeyId, accessKey.accessKeyId) &&
        Objects.equals(this.secretAccessKey, accessKey.secretAccessKey) &&
        Objects.equals(this.status, accessKey.status) &&
        Objects.equals(this.createdAt, accessKey.createdAt) &&
        Objects.equals(this.lastUsed, accessKey.lastUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, status, createdAt, lastUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKey {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
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
    openapiFields.add("accessKeyId");
    openapiFields.add("secretAccessKey");
    openapiFields.add("status");
    openapiFields.add("createdAt");
    openapiFields.add("lastUsed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccessKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessKey is not found in the empty JSON string", AccessKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `accessKeyId`
      if (jsonObj.get("accessKeyId") != null && !jsonObj.get("accessKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("accessKeyId"));
      }
      // validate the optional field `secretAccessKey`
      if (jsonObj.get("secretAccessKey") != null && !jsonObj.get("secretAccessKey").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("secretAccessKey"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusType.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `lastUsed`
      if (jsonObj.get("lastUsed") != null && !jsonObj.get("lastUsed").isJsonNull()) {
        AccessKeyLastUsed.validateJsonElement(jsonObj.get("lastUsed"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessKey.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessKey>() {
           @Override
           public void write(JsonWriter out, AccessKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccessKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccessKey
   * @throws IOException if the JSON string is invalid with respect to AccessKey
   */
  public static AccessKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessKey.class);
  }

  /**
   * Convert an instance of AccessKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

