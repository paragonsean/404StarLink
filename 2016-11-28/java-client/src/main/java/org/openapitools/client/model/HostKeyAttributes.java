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
 * Describes the public SSH host keys or the RDP certificate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HostKeyAttributes {
  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private String algorithm;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "publicKey";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_WITNESSED_AT = "witnessedAt";
  @SerializedName(SERIALIZED_NAME_WITNESSED_AT)
  private OffsetDateTime witnessedAt;

  public static final String SERIALIZED_NAME_FINGERPRINT_S_H_A1 = "fingerprintSHA1";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT_S_H_A1)
  private String fingerprintSHA1;

  public static final String SERIALIZED_NAME_FINGERPRINT_S_H_A256 = "fingerprintSHA256";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT_S_H_A256)
  private String fingerprintSHA256;

  public static final String SERIALIZED_NAME_NOT_VALID_BEFORE = "notValidBefore";
  @SerializedName(SERIALIZED_NAME_NOT_VALID_BEFORE)
  private OffsetDateTime notValidBefore;

  public static final String SERIALIZED_NAME_NOT_VALID_AFTER = "notValidAfter";
  @SerializedName(SERIALIZED_NAME_NOT_VALID_AFTER)
  private OffsetDateTime notValidAfter;

  public HostKeyAttributes() {
  }

  public HostKeyAttributes algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Get algorithm
   * @return algorithm
   */
  @javax.annotation.Nullable
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }


  public HostKeyAttributes publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
   */
  @javax.annotation.Nullable
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public HostKeyAttributes witnessedAt(OffsetDateTime witnessedAt) {
    this.witnessedAt = witnessedAt;
    return this;
  }

  /**
   * Get witnessedAt
   * @return witnessedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getWitnessedAt() {
    return witnessedAt;
  }

  public void setWitnessedAt(OffsetDateTime witnessedAt) {
    this.witnessedAt = witnessedAt;
  }


  public HostKeyAttributes fingerprintSHA1(String fingerprintSHA1) {
    this.fingerprintSHA1 = fingerprintSHA1;
    return this;
  }

  /**
   * Get fingerprintSHA1
   * @return fingerprintSHA1
   */
  @javax.annotation.Nullable
  public String getFingerprintSHA1() {
    return fingerprintSHA1;
  }

  public void setFingerprintSHA1(String fingerprintSHA1) {
    this.fingerprintSHA1 = fingerprintSHA1;
  }


  public HostKeyAttributes fingerprintSHA256(String fingerprintSHA256) {
    this.fingerprintSHA256 = fingerprintSHA256;
    return this;
  }

  /**
   * Get fingerprintSHA256
   * @return fingerprintSHA256
   */
  @javax.annotation.Nullable
  public String getFingerprintSHA256() {
    return fingerprintSHA256;
  }

  public void setFingerprintSHA256(String fingerprintSHA256) {
    this.fingerprintSHA256 = fingerprintSHA256;
  }


  public HostKeyAttributes notValidBefore(OffsetDateTime notValidBefore) {
    this.notValidBefore = notValidBefore;
    return this;
  }

  /**
   * Get notValidBefore
   * @return notValidBefore
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotValidBefore() {
    return notValidBefore;
  }

  public void setNotValidBefore(OffsetDateTime notValidBefore) {
    this.notValidBefore = notValidBefore;
  }


  public HostKeyAttributes notValidAfter(OffsetDateTime notValidAfter) {
    this.notValidAfter = notValidAfter;
    return this;
  }

  /**
   * Get notValidAfter
   * @return notValidAfter
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotValidAfter() {
    return notValidAfter;
  }

  public void setNotValidAfter(OffsetDateTime notValidAfter) {
    this.notValidAfter = notValidAfter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostKeyAttributes hostKeyAttributes = (HostKeyAttributes) o;
    return Objects.equals(this.algorithm, hostKeyAttributes.algorithm) &&
        Objects.equals(this.publicKey, hostKeyAttributes.publicKey) &&
        Objects.equals(this.witnessedAt, hostKeyAttributes.witnessedAt) &&
        Objects.equals(this.fingerprintSHA1, hostKeyAttributes.fingerprintSHA1) &&
        Objects.equals(this.fingerprintSHA256, hostKeyAttributes.fingerprintSHA256) &&
        Objects.equals(this.notValidBefore, hostKeyAttributes.notValidBefore) &&
        Objects.equals(this.notValidAfter, hostKeyAttributes.notValidAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, publicKey, witnessedAt, fingerprintSHA1, fingerprintSHA256, notValidBefore, notValidAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostKeyAttributes {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    witnessedAt: ").append(toIndentedString(witnessedAt)).append("\n");
    sb.append("    fingerprintSHA1: ").append(toIndentedString(fingerprintSHA1)).append("\n");
    sb.append("    fingerprintSHA256: ").append(toIndentedString(fingerprintSHA256)).append("\n");
    sb.append("    notValidBefore: ").append(toIndentedString(notValidBefore)).append("\n");
    sb.append("    notValidAfter: ").append(toIndentedString(notValidAfter)).append("\n");
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
    openapiFields.add("algorithm");
    openapiFields.add("publicKey");
    openapiFields.add("witnessedAt");
    openapiFields.add("fingerprintSHA1");
    openapiFields.add("fingerprintSHA256");
    openapiFields.add("notValidBefore");
    openapiFields.add("notValidAfter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HostKeyAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HostKeyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HostKeyAttributes is not found in the empty JSON string", HostKeyAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HostKeyAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HostKeyAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `algorithm`
      if (jsonObj.get("algorithm") != null && !jsonObj.get("algorithm").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("algorithm"));
      }
      // validate the optional field `publicKey`
      if (jsonObj.get("publicKey") != null && !jsonObj.get("publicKey").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("publicKey"));
      }
      // validate the optional field `witnessedAt`
      if (jsonObj.get("witnessedAt") != null && !jsonObj.get("witnessedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("witnessedAt"));
      }
      // validate the optional field `fingerprintSHA1`
      if (jsonObj.get("fingerprintSHA1") != null && !jsonObj.get("fingerprintSHA1").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fingerprintSHA1"));
      }
      // validate the optional field `fingerprintSHA256`
      if (jsonObj.get("fingerprintSHA256") != null && !jsonObj.get("fingerprintSHA256").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fingerprintSHA256"));
      }
      // validate the optional field `notValidBefore`
      if (jsonObj.get("notValidBefore") != null && !jsonObj.get("notValidBefore").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("notValidBefore"));
      }
      // validate the optional field `notValidAfter`
      if (jsonObj.get("notValidAfter") != null && !jsonObj.get("notValidAfter").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("notValidAfter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HostKeyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HostKeyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HostKeyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HostKeyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<HostKeyAttributes>() {
           @Override
           public void write(JsonWriter out, HostKeyAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HostKeyAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HostKeyAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HostKeyAttributes
   * @throws IOException if the JSON string is invalid with respect to HostKeyAttributes
   */
  public static HostKeyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HostKeyAttributes.class);
  }

  /**
   * Convert an instance of HostKeyAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

