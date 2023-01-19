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
 * DownloadDefaultKeyPairResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DownloadDefaultKeyPairResult {
  public static final String SERIALIZED_NAME_PUBLIC_KEY_BASE64 = "publicKeyBase64";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_BASE64)
  private String publicKeyBase64;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_BASE64 = "privateKeyBase64";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_BASE64)
  private String privateKeyBase64;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public DownloadDefaultKeyPairResult() {
  }

  public DownloadDefaultKeyPairResult publicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
    return this;
  }

  /**
   * Get publicKeyBase64
   * @return publicKeyBase64
   */
  @javax.annotation.Nullable
  public String getPublicKeyBase64() {
    return publicKeyBase64;
  }

  public void setPublicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
  }


  public DownloadDefaultKeyPairResult privateKeyBase64(String privateKeyBase64) {
    this.privateKeyBase64 = privateKeyBase64;
    return this;
  }

  /**
   * Get privateKeyBase64
   * @return privateKeyBase64
   */
  @javax.annotation.Nullable
  public String getPrivateKeyBase64() {
    return privateKeyBase64;
  }

  public void setPrivateKeyBase64(String privateKeyBase64) {
    this.privateKeyBase64 = privateKeyBase64;
  }


  public DownloadDefaultKeyPairResult createdAt(OffsetDateTime createdAt) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadDefaultKeyPairResult downloadDefaultKeyPairResult = (DownloadDefaultKeyPairResult) o;
    return Objects.equals(this.publicKeyBase64, downloadDefaultKeyPairResult.publicKeyBase64) &&
        Objects.equals(this.privateKeyBase64, downloadDefaultKeyPairResult.privateKeyBase64) &&
        Objects.equals(this.createdAt, downloadDefaultKeyPairResult.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKeyBase64, privateKeyBase64, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadDefaultKeyPairResult {\n");
    sb.append("    publicKeyBase64: ").append(toIndentedString(publicKeyBase64)).append("\n");
    sb.append("    privateKeyBase64: ").append(toIndentedString(privateKeyBase64)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("publicKeyBase64");
    openapiFields.add("privateKeyBase64");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DownloadDefaultKeyPairResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DownloadDefaultKeyPairResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DownloadDefaultKeyPairResult is not found in the empty JSON string", DownloadDefaultKeyPairResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DownloadDefaultKeyPairResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DownloadDefaultKeyPairResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `publicKeyBase64`
      if (jsonObj.get("publicKeyBase64") != null && !jsonObj.get("publicKeyBase64").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("publicKeyBase64"));
      }
      // validate the optional field `privateKeyBase64`
      if (jsonObj.get("privateKeyBase64") != null && !jsonObj.get("privateKeyBase64").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("privateKeyBase64"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DownloadDefaultKeyPairResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DownloadDefaultKeyPairResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DownloadDefaultKeyPairResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DownloadDefaultKeyPairResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DownloadDefaultKeyPairResult>() {
           @Override
           public void write(JsonWriter out, DownloadDefaultKeyPairResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DownloadDefaultKeyPairResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DownloadDefaultKeyPairResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DownloadDefaultKeyPairResult
   * @throws IOException if the JSON string is invalid with respect to DownloadDefaultKeyPairResult
   */
  public static DownloadDefaultKeyPairResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DownloadDefaultKeyPairResult.class);
  }

  /**
   * Convert an instance of DownloadDefaultKeyPairResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

