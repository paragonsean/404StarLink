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
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UpdateBucketRequestAccessLogConfig;
import org.openapitools.client.model.UpdateBucketRequestAccessRules;

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
 * UpdateBucketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateBucketRequest {
  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucketName";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  private String bucketName;

  public static final String SERIALIZED_NAME_ACCESS_RULES = "accessRules";
  @SerializedName(SERIALIZED_NAME_ACCESS_RULES)
  private UpdateBucketRequestAccessRules accessRules;

  public static final String SERIALIZED_NAME_VERSIONING = "versioning";
  @SerializedName(SERIALIZED_NAME_VERSIONING)
  private String versioning;

  public static final String SERIALIZED_NAME_READONLY_ACCESS_ACCOUNTS = "readonlyAccessAccounts";
  @SerializedName(SERIALIZED_NAME_READONLY_ACCESS_ACCOUNTS)
  private List readonlyAccessAccounts;

  public static final String SERIALIZED_NAME_ACCESS_LOG_CONFIG = "accessLogConfig";
  @SerializedName(SERIALIZED_NAME_ACCESS_LOG_CONFIG)
  private UpdateBucketRequestAccessLogConfig accessLogConfig;

  public UpdateBucketRequest() {
  }

  public UpdateBucketRequest bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Get bucketName
   * @return bucketName
   */
  @javax.annotation.Nonnull
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  public UpdateBucketRequest accessRules(UpdateBucketRequestAccessRules accessRules) {
    this.accessRules = accessRules;
    return this;
  }

  /**
   * Get accessRules
   * @return accessRules
   */
  @javax.annotation.Nullable
  public UpdateBucketRequestAccessRules getAccessRules() {
    return accessRules;
  }

  public void setAccessRules(UpdateBucketRequestAccessRules accessRules) {
    this.accessRules = accessRules;
  }


  public UpdateBucketRequest versioning(String versioning) {
    this.versioning = versioning;
    return this;
  }

  /**
   * Get versioning
   * @return versioning
   */
  @javax.annotation.Nullable
  public String getVersioning() {
    return versioning;
  }

  public void setVersioning(String versioning) {
    this.versioning = versioning;
  }


  public UpdateBucketRequest readonlyAccessAccounts(List readonlyAccessAccounts) {
    this.readonlyAccessAccounts = readonlyAccessAccounts;
    return this;
  }

  /**
   * Get readonlyAccessAccounts
   * @return readonlyAccessAccounts
   */
  @javax.annotation.Nullable
  public List getReadonlyAccessAccounts() {
    return readonlyAccessAccounts;
  }

  public void setReadonlyAccessAccounts(List readonlyAccessAccounts) {
    this.readonlyAccessAccounts = readonlyAccessAccounts;
  }


  public UpdateBucketRequest accessLogConfig(UpdateBucketRequestAccessLogConfig accessLogConfig) {
    this.accessLogConfig = accessLogConfig;
    return this;
  }

  /**
   * Get accessLogConfig
   * @return accessLogConfig
   */
  @javax.annotation.Nullable
  public UpdateBucketRequestAccessLogConfig getAccessLogConfig() {
    return accessLogConfig;
  }

  public void setAccessLogConfig(UpdateBucketRequestAccessLogConfig accessLogConfig) {
    this.accessLogConfig = accessLogConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBucketRequest updateBucketRequest = (UpdateBucketRequest) o;
    return Objects.equals(this.bucketName, updateBucketRequest.bucketName) &&
        Objects.equals(this.accessRules, updateBucketRequest.accessRules) &&
        Objects.equals(this.versioning, updateBucketRequest.versioning) &&
        Objects.equals(this.readonlyAccessAccounts, updateBucketRequest.readonlyAccessAccounts) &&
        Objects.equals(this.accessLogConfig, updateBucketRequest.accessLogConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, accessRules, versioning, readonlyAccessAccounts, accessLogConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBucketRequest {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    accessRules: ").append(toIndentedString(accessRules)).append("\n");
    sb.append("    versioning: ").append(toIndentedString(versioning)).append("\n");
    sb.append("    readonlyAccessAccounts: ").append(toIndentedString(readonlyAccessAccounts)).append("\n");
    sb.append("    accessLogConfig: ").append(toIndentedString(accessLogConfig)).append("\n");
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
    openapiFields.add("bucketName");
    openapiFields.add("accessRules");
    openapiFields.add("versioning");
    openapiFields.add("readonlyAccessAccounts");
    openapiFields.add("accessLogConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bucketName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateBucketRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBucketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBucketRequest is not found in the empty JSON string", UpdateBucketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBucketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBucketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateBucketRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `bucketName`
      String.validateJsonElement(jsonObj.get("bucketName"));
      // validate the optional field `accessRules`
      if (jsonObj.get("accessRules") != null && !jsonObj.get("accessRules").isJsonNull()) {
        UpdateBucketRequestAccessRules.validateJsonElement(jsonObj.get("accessRules"));
      }
      // validate the optional field `versioning`
      if (jsonObj.get("versioning") != null && !jsonObj.get("versioning").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("versioning"));
      }
      // validate the optional field `readonlyAccessAccounts`
      if (jsonObj.get("readonlyAccessAccounts") != null && !jsonObj.get("readonlyAccessAccounts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("readonlyAccessAccounts"));
      }
      // validate the optional field `accessLogConfig`
      if (jsonObj.get("accessLogConfig") != null && !jsonObj.get("accessLogConfig").isJsonNull()) {
        UpdateBucketRequestAccessLogConfig.validateJsonElement(jsonObj.get("accessLogConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBucketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBucketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBucketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBucketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBucketRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBucketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBucketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateBucketRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateBucketRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateBucketRequest
   */
  public static UpdateBucketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBucketRequest.class);
  }

  /**
   * Convert an instance of UpdateBucketRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

