/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
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
 * Settings specific to keys that can be used for WAF (Web Application Firewall).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:34.115959-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1WafSettings {
  /**
   * Required. The WAF feature for which this key is enabled.
   */
  @JsonAdapter(WafFeatureEnum.Adapter.class)
  public enum WafFeatureEnum {
    WAF_FEATURE_UNSPECIFIED("WAF_FEATURE_UNSPECIFIED"),
    
    CHALLENGE_PAGE("CHALLENGE_PAGE"),
    
    SESSION_TOKEN("SESSION_TOKEN"),
    
    ACTION_TOKEN("ACTION_TOKEN"),
    
    EXPRESS("EXPRESS");

    private String value;

    WafFeatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WafFeatureEnum fromValue(String value) {
      for (WafFeatureEnum b : WafFeatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WafFeatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WafFeatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WafFeatureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WafFeatureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WafFeatureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WAF_FEATURE = "wafFeature";
  @SerializedName(SERIALIZED_NAME_WAF_FEATURE)
  private WafFeatureEnum wafFeature;

  /**
   * Required. The WAF service that uses this key.
   */
  @JsonAdapter(WafServiceEnum.Adapter.class)
  public enum WafServiceEnum {
    WAF_SERVICE_UNSPECIFIED("WAF_SERVICE_UNSPECIFIED"),
    
    CA("CA"),
    
    FASTLY("FASTLY");

    private String value;

    WafServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WafServiceEnum fromValue(String value) {
      for (WafServiceEnum b : WafServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WafServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WafServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WafServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WafServiceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WafServiceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WAF_SERVICE = "wafService";
  @SerializedName(SERIALIZED_NAME_WAF_SERVICE)
  private WafServiceEnum wafService;

  public GoogleCloudRecaptchaenterpriseV1WafSettings() {
  }

  public GoogleCloudRecaptchaenterpriseV1WafSettings wafFeature(WafFeatureEnum wafFeature) {
    this.wafFeature = wafFeature;
    return this;
  }

  /**
   * Required. The WAF feature for which this key is enabled.
   * @return wafFeature
   */
  @javax.annotation.Nullable
  public WafFeatureEnum getWafFeature() {
    return wafFeature;
  }

  public void setWafFeature(WafFeatureEnum wafFeature) {
    this.wafFeature = wafFeature;
  }


  public GoogleCloudRecaptchaenterpriseV1WafSettings wafService(WafServiceEnum wafService) {
    this.wafService = wafService;
    return this;
  }

  /**
   * Required. The WAF service that uses this key.
   * @return wafService
   */
  @javax.annotation.Nullable
  public WafServiceEnum getWafService() {
    return wafService;
  }

  public void setWafService(WafServiceEnum wafService) {
    this.wafService = wafService;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1WafSettings googleCloudRecaptchaenterpriseV1WafSettings = (GoogleCloudRecaptchaenterpriseV1WafSettings) o;
    return Objects.equals(this.wafFeature, googleCloudRecaptchaenterpriseV1WafSettings.wafFeature) &&
        Objects.equals(this.wafService, googleCloudRecaptchaenterpriseV1WafSettings.wafService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wafFeature, wafService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1WafSettings {\n");
    sb.append("    wafFeature: ").append(toIndentedString(wafFeature)).append("\n");
    sb.append("    wafService: ").append(toIndentedString(wafService)).append("\n");
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
    openapiFields.add("wafFeature");
    openapiFields.add("wafService");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1WafSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1WafSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1WafSettings is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1WafSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1WafSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1WafSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("wafFeature") != null && !jsonObj.get("wafFeature").isJsonNull()) && !jsonObj.get("wafFeature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wafFeature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wafFeature").toString()));
      }
      // validate the optional field `wafFeature`
      if (jsonObj.get("wafFeature") != null && !jsonObj.get("wafFeature").isJsonNull()) {
        WafFeatureEnum.validateJsonElement(jsonObj.get("wafFeature"));
      }
      if ((jsonObj.get("wafService") != null && !jsonObj.get("wafService").isJsonNull()) && !jsonObj.get("wafService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wafService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wafService").toString()));
      }
      // validate the optional field `wafService`
      if (jsonObj.get("wafService") != null && !jsonObj.get("wafService").isJsonNull()) {
        WafServiceEnum.validateJsonElement(jsonObj.get("wafService"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1WafSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1WafSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1WafSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1WafSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1WafSettings>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1WafSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1WafSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1WafSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1WafSettings
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1WafSettings
   */
  public static GoogleCloudRecaptchaenterpriseV1WafSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1WafSettings.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1WafSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

