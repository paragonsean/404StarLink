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
import org.openapitools.client.model.GetCloudFrontOriginAccessIdentityConfigResultCloudFrontOriginAccessIdentityConfig;

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
 * The returned result of the corresponding request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetCloudFrontOriginAccessIdentityConfigResult {
  public static final String SERIALIZED_NAME_CLOUD_FRONT_ORIGIN_ACCESS_IDENTITY_CONFIG = "CloudFrontOriginAccessIdentityConfig";
  @SerializedName(SERIALIZED_NAME_CLOUD_FRONT_ORIGIN_ACCESS_IDENTITY_CONFIG)
  private GetCloudFrontOriginAccessIdentityConfigResultCloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

  public GetCloudFrontOriginAccessIdentityConfigResult() {
  }

  public GetCloudFrontOriginAccessIdentityConfigResult cloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigResultCloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
    this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    return this;
  }

  /**
   * Get cloudFrontOriginAccessIdentityConfig
   * @return cloudFrontOriginAccessIdentityConfig
   */
  @javax.annotation.Nullable
  public GetCloudFrontOriginAccessIdentityConfigResultCloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
    return cloudFrontOriginAccessIdentityConfig;
  }

  public void setCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigResultCloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
    this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfigResult = (GetCloudFrontOriginAccessIdentityConfigResult) o;
    return Objects.equals(this.cloudFrontOriginAccessIdentityConfig, getCloudFrontOriginAccessIdentityConfigResult.cloudFrontOriginAccessIdentityConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudFrontOriginAccessIdentityConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCloudFrontOriginAccessIdentityConfigResult {\n");
    sb.append("    cloudFrontOriginAccessIdentityConfig: ").append(toIndentedString(cloudFrontOriginAccessIdentityConfig)).append("\n");
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
    openapiFields.add("CloudFrontOriginAccessIdentityConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCloudFrontOriginAccessIdentityConfigResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCloudFrontOriginAccessIdentityConfigResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCloudFrontOriginAccessIdentityConfigResult is not found in the empty JSON string", GetCloudFrontOriginAccessIdentityConfigResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCloudFrontOriginAccessIdentityConfigResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCloudFrontOriginAccessIdentityConfigResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CloudFrontOriginAccessIdentityConfig`
      if (jsonObj.get("CloudFrontOriginAccessIdentityConfig") != null && !jsonObj.get("CloudFrontOriginAccessIdentityConfig").isJsonNull()) {
        GetCloudFrontOriginAccessIdentityConfigResultCloudFrontOriginAccessIdentityConfig.validateJsonElement(jsonObj.get("CloudFrontOriginAccessIdentityConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCloudFrontOriginAccessIdentityConfigResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCloudFrontOriginAccessIdentityConfigResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCloudFrontOriginAccessIdentityConfigResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCloudFrontOriginAccessIdentityConfigResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCloudFrontOriginAccessIdentityConfigResult>() {
           @Override
           public void write(JsonWriter out, GetCloudFrontOriginAccessIdentityConfigResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCloudFrontOriginAccessIdentityConfigResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCloudFrontOriginAccessIdentityConfigResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCloudFrontOriginAccessIdentityConfigResult
   * @throws IOException if the JSON string is invalid with respect to GetCloudFrontOriginAccessIdentityConfigResult
   */
  public static GetCloudFrontOriginAccessIdentityConfigResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCloudFrontOriginAccessIdentityConfigResult.class);
  }

  /**
   * Convert an instance of GetCloudFrontOriginAccessIdentityConfigResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

