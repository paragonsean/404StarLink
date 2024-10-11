/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
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
import org.openapitools.client.model.CustomOriginConfigOriginSslProtocols;
import org.openapitools.client.model.OriginProtocolPolicy;

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
 * OriginCustomOriginConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class OriginCustomOriginConfig {
  public static final String SERIALIZED_NAME_HT_T_P_PORT = "HTTPPort";
  @SerializedName(SERIALIZED_NAME_HT_T_P_PORT)
  private Integer htTPPort;

  public static final String SERIALIZED_NAME_HT_T_P_S_PORT = "HTTPSPort";
  @SerializedName(SERIALIZED_NAME_HT_T_P_S_PORT)
  private Integer htTPSPort;

  public static final String SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY = "OriginProtocolPolicy";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY)
  private OriginProtocolPolicy originProtocolPolicy;

  public static final String SERIALIZED_NAME_ORIGIN_SSL_PROTOCOLS = "OriginSslProtocols";
  @SerializedName(SERIALIZED_NAME_ORIGIN_SSL_PROTOCOLS)
  private CustomOriginConfigOriginSslProtocols originSslProtocols;

  public static final String SERIALIZED_NAME_ORIGIN_READ_TIMEOUT = "OriginReadTimeout";
  @SerializedName(SERIALIZED_NAME_ORIGIN_READ_TIMEOUT)
  private Integer originReadTimeout;

  public static final String SERIALIZED_NAME_ORIGIN_KEEPALIVE_TIMEOUT = "OriginKeepaliveTimeout";
  @SerializedName(SERIALIZED_NAME_ORIGIN_KEEPALIVE_TIMEOUT)
  private Integer originKeepaliveTimeout;

  public OriginCustomOriginConfig() {
  }

  public OriginCustomOriginConfig htTPPort(Integer htTPPort) {
    this.htTPPort = htTPPort;
    return this;
  }

  /**
   * Get htTPPort
   * @return htTPPort
   */
  @javax.annotation.Nonnull
  public Integer getHtTPPort() {
    return htTPPort;
  }

  public void setHtTPPort(Integer htTPPort) {
    this.htTPPort = htTPPort;
  }


  public OriginCustomOriginConfig htTPSPort(Integer htTPSPort) {
    this.htTPSPort = htTPSPort;
    return this;
  }

  /**
   * Get htTPSPort
   * @return htTPSPort
   */
  @javax.annotation.Nonnull
  public Integer getHtTPSPort() {
    return htTPSPort;
  }

  public void setHtTPSPort(Integer htTPSPort) {
    this.htTPSPort = htTPSPort;
  }


  public OriginCustomOriginConfig originProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
    return this;
  }

  /**
   * Get originProtocolPolicy
   * @return originProtocolPolicy
   */
  @javax.annotation.Nonnull
  public OriginProtocolPolicy getOriginProtocolPolicy() {
    return originProtocolPolicy;
  }

  public void setOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
  }


  public OriginCustomOriginConfig originSslProtocols(CustomOriginConfigOriginSslProtocols originSslProtocols) {
    this.originSslProtocols = originSslProtocols;
    return this;
  }

  /**
   * Get originSslProtocols
   * @return originSslProtocols
   */
  @javax.annotation.Nullable
  public CustomOriginConfigOriginSslProtocols getOriginSslProtocols() {
    return originSslProtocols;
  }

  public void setOriginSslProtocols(CustomOriginConfigOriginSslProtocols originSslProtocols) {
    this.originSslProtocols = originSslProtocols;
  }


  public OriginCustomOriginConfig originReadTimeout(Integer originReadTimeout) {
    this.originReadTimeout = originReadTimeout;
    return this;
  }

  /**
   * Get originReadTimeout
   * @return originReadTimeout
   */
  @javax.annotation.Nullable
  public Integer getOriginReadTimeout() {
    return originReadTimeout;
  }

  public void setOriginReadTimeout(Integer originReadTimeout) {
    this.originReadTimeout = originReadTimeout;
  }


  public OriginCustomOriginConfig originKeepaliveTimeout(Integer originKeepaliveTimeout) {
    this.originKeepaliveTimeout = originKeepaliveTimeout;
    return this;
  }

  /**
   * Get originKeepaliveTimeout
   * @return originKeepaliveTimeout
   */
  @javax.annotation.Nullable
  public Integer getOriginKeepaliveTimeout() {
    return originKeepaliveTimeout;
  }

  public void setOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
    this.originKeepaliveTimeout = originKeepaliveTimeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginCustomOriginConfig originCustomOriginConfig = (OriginCustomOriginConfig) o;
    return Objects.equals(this.htTPPort, originCustomOriginConfig.htTPPort) &&
        Objects.equals(this.htTPSPort, originCustomOriginConfig.htTPSPort) &&
        Objects.equals(this.originProtocolPolicy, originCustomOriginConfig.originProtocolPolicy) &&
        Objects.equals(this.originSslProtocols, originCustomOriginConfig.originSslProtocols) &&
        Objects.equals(this.originReadTimeout, originCustomOriginConfig.originReadTimeout) &&
        Objects.equals(this.originKeepaliveTimeout, originCustomOriginConfig.originKeepaliveTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htTPPort, htTPSPort, originProtocolPolicy, originSslProtocols, originReadTimeout, originKeepaliveTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginCustomOriginConfig {\n");
    sb.append("    htTPPort: ").append(toIndentedString(htTPPort)).append("\n");
    sb.append("    htTPSPort: ").append(toIndentedString(htTPSPort)).append("\n");
    sb.append("    originProtocolPolicy: ").append(toIndentedString(originProtocolPolicy)).append("\n");
    sb.append("    originSslProtocols: ").append(toIndentedString(originSslProtocols)).append("\n");
    sb.append("    originReadTimeout: ").append(toIndentedString(originReadTimeout)).append("\n");
    sb.append("    originKeepaliveTimeout: ").append(toIndentedString(originKeepaliveTimeout)).append("\n");
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
    openapiFields.add("HTTPPort");
    openapiFields.add("HTTPSPort");
    openapiFields.add("OriginProtocolPolicy");
    openapiFields.add("OriginSslProtocols");
    openapiFields.add("OriginReadTimeout");
    openapiFields.add("OriginKeepaliveTimeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("HTTPPort");
    openapiRequiredFields.add("HTTPSPort");
    openapiRequiredFields.add("OriginProtocolPolicy");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OriginCustomOriginConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OriginCustomOriginConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginCustomOriginConfig is not found in the empty JSON string", OriginCustomOriginConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OriginCustomOriginConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginCustomOriginConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginCustomOriginConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `HTTPPort`
      Integer.validateJsonElement(jsonObj.get("HTTPPort"));
      // validate the required field `HTTPSPort`
      Integer.validateJsonElement(jsonObj.get("HTTPSPort"));
      // validate the required field `OriginProtocolPolicy`
      OriginProtocolPolicy.validateJsonElement(jsonObj.get("OriginProtocolPolicy"));
      // validate the optional field `OriginSslProtocols`
      if (jsonObj.get("OriginSslProtocols") != null && !jsonObj.get("OriginSslProtocols").isJsonNull()) {
        CustomOriginConfigOriginSslProtocols.validateJsonElement(jsonObj.get("OriginSslProtocols"));
      }
      // validate the optional field `OriginReadTimeout`
      if (jsonObj.get("OriginReadTimeout") != null && !jsonObj.get("OriginReadTimeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("OriginReadTimeout"));
      }
      // validate the optional field `OriginKeepaliveTimeout`
      if (jsonObj.get("OriginKeepaliveTimeout") != null && !jsonObj.get("OriginKeepaliveTimeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("OriginKeepaliveTimeout"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginCustomOriginConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginCustomOriginConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginCustomOriginConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginCustomOriginConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginCustomOriginConfig>() {
           @Override
           public void write(JsonWriter out, OriginCustomOriginConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginCustomOriginConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OriginCustomOriginConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OriginCustomOriginConfig
   * @throws IOException if the JSON string is invalid with respect to OriginCustomOriginConfig
   */
  public static OriginCustomOriginConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginCustomOriginConfig.class);
  }

  /**
   * Convert an instance of OriginCustomOriginConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

