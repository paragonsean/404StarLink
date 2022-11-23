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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Settings specific to keys that can be used by websites.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:34.115959-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1WebKeySettings {
  public static final String SERIALIZED_NAME_ALLOW_ALL_DOMAINS = "allowAllDomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_DOMAINS)
  private Boolean allowAllDomains;

  public static final String SERIALIZED_NAME_ALLOW_AMP_TRAFFIC = "allowAmpTraffic";
  @SerializedName(SERIALIZED_NAME_ALLOW_AMP_TRAFFIC)
  private Boolean allowAmpTraffic;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowedDomains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  private List<String> allowedDomains = new ArrayList<>();

  /**
   * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
   */
  @JsonAdapter(ChallengeSecurityPreferenceEnum.Adapter.class)
  public enum ChallengeSecurityPreferenceEnum {
    CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED("CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED"),
    
    USABILITY("USABILITY"),
    
    BALANCE("BALANCE"),
    
    SECURITY("SECURITY");

    private String value;

    ChallengeSecurityPreferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChallengeSecurityPreferenceEnum fromValue(String value) {
      for (ChallengeSecurityPreferenceEnum b : ChallengeSecurityPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChallengeSecurityPreferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChallengeSecurityPreferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChallengeSecurityPreferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChallengeSecurityPreferenceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ChallengeSecurityPreferenceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHALLENGE_SECURITY_PREFERENCE = "challengeSecurityPreference";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_SECURITY_PREFERENCE)
  private ChallengeSecurityPreferenceEnum challengeSecurityPreference;

  /**
   * Required. Describes how this key is integrated with the website.
   */
  @JsonAdapter(IntegrationTypeEnum.Adapter.class)
  public enum IntegrationTypeEnum {
    INTEGRATION_TYPE_UNSPECIFIED("INTEGRATION_TYPE_UNSPECIFIED"),
    
    SCORE("SCORE"),
    
    CHECKBOX("CHECKBOX"),
    
    INVISIBLE("INVISIBLE");

    private String value;

    IntegrationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntegrationTypeEnum fromValue(String value) {
      for (IntegrationTypeEnum b : IntegrationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntegrationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntegrationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntegrationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IntegrationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INTEGRATION_TYPE = "integrationType";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_TYPE)
  private IntegrationTypeEnum integrationType;

  public GoogleCloudRecaptchaenterpriseV1WebKeySettings() {
  }

  public GoogleCloudRecaptchaenterpriseV1WebKeySettings allowAllDomains(Boolean allowAllDomains) {
    this.allowAllDomains = allowAllDomains;
    return this;
  }

  /**
   * If set to true, it means allowed_domains will not be enforced.
   * @return allowAllDomains
   */
  @javax.annotation.Nullable
  public Boolean getAllowAllDomains() {
    return allowAllDomains;
  }

  public void setAllowAllDomains(Boolean allowAllDomains) {
    this.allowAllDomains = allowAllDomains;
  }


  public GoogleCloudRecaptchaenterpriseV1WebKeySettings allowAmpTraffic(Boolean allowAmpTraffic) {
    this.allowAmpTraffic = allowAmpTraffic;
    return this;
  }

  /**
   * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
   * @return allowAmpTraffic
   */
  @javax.annotation.Nullable
  public Boolean getAllowAmpTraffic() {
    return allowAmpTraffic;
  }

  public void setAllowAmpTraffic(Boolean allowAmpTraffic) {
    this.allowAmpTraffic = allowAmpTraffic;
  }


  public GoogleCloudRecaptchaenterpriseV1WebKeySettings allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1WebKeySettings addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null) {
      this.allowedDomains = new ArrayList<>();
    }
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

  /**
   * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39;
   * @return allowedDomains
   */
  @javax.annotation.Nullable
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }

  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  public GoogleCloudRecaptchaenterpriseV1WebKeySettings challengeSecurityPreference(ChallengeSecurityPreferenceEnum challengeSecurityPreference) {
    this.challengeSecurityPreference = challengeSecurityPreference;
    return this;
  }

  /**
   * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
   * @return challengeSecurityPreference
   */
  @javax.annotation.Nullable
  public ChallengeSecurityPreferenceEnum getChallengeSecurityPreference() {
    return challengeSecurityPreference;
  }

  public void setChallengeSecurityPreference(ChallengeSecurityPreferenceEnum challengeSecurityPreference) {
    this.challengeSecurityPreference = challengeSecurityPreference;
  }


  public GoogleCloudRecaptchaenterpriseV1WebKeySettings integrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * Required. Describes how this key is integrated with the website.
   * @return integrationType
   */
  @javax.annotation.Nullable
  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1WebKeySettings googleCloudRecaptchaenterpriseV1WebKeySettings = (GoogleCloudRecaptchaenterpriseV1WebKeySettings) o;
    return Objects.equals(this.allowAllDomains, googleCloudRecaptchaenterpriseV1WebKeySettings.allowAllDomains) &&
        Objects.equals(this.allowAmpTraffic, googleCloudRecaptchaenterpriseV1WebKeySettings.allowAmpTraffic) &&
        Objects.equals(this.allowedDomains, googleCloudRecaptchaenterpriseV1WebKeySettings.allowedDomains) &&
        Objects.equals(this.challengeSecurityPreference, googleCloudRecaptchaenterpriseV1WebKeySettings.challengeSecurityPreference) &&
        Objects.equals(this.integrationType, googleCloudRecaptchaenterpriseV1WebKeySettings.integrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAllDomains, allowAmpTraffic, allowedDomains, challengeSecurityPreference, integrationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1WebKeySettings {\n");
    sb.append("    allowAllDomains: ").append(toIndentedString(allowAllDomains)).append("\n");
    sb.append("    allowAmpTraffic: ").append(toIndentedString(allowAmpTraffic)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    challengeSecurityPreference: ").append(toIndentedString(challengeSecurityPreference)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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
    openapiFields.add("allowAllDomains");
    openapiFields.add("allowAmpTraffic");
    openapiFields.add("allowedDomains");
    openapiFields.add("challengeSecurityPreference");
    openapiFields.add("integrationType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1WebKeySettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1WebKeySettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1WebKeySettings is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1WebKeySettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1WebKeySettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1WebKeySettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedDomains") != null && !jsonObj.get("allowedDomains").isJsonNull() && !jsonObj.get("allowedDomains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedDomains` to be an array in the JSON string but got `%s`", jsonObj.get("allowedDomains").toString()));
      }
      if ((jsonObj.get("challengeSecurityPreference") != null && !jsonObj.get("challengeSecurityPreference").isJsonNull()) && !jsonObj.get("challengeSecurityPreference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `challengeSecurityPreference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challengeSecurityPreference").toString()));
      }
      // validate the optional field `challengeSecurityPreference`
      if (jsonObj.get("challengeSecurityPreference") != null && !jsonObj.get("challengeSecurityPreference").isJsonNull()) {
        ChallengeSecurityPreferenceEnum.validateJsonElement(jsonObj.get("challengeSecurityPreference"));
      }
      if ((jsonObj.get("integrationType") != null && !jsonObj.get("integrationType").isJsonNull()) && !jsonObj.get("integrationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationType").toString()));
      }
      // validate the optional field `integrationType`
      if (jsonObj.get("integrationType") != null && !jsonObj.get("integrationType").isJsonNull()) {
        IntegrationTypeEnum.validateJsonElement(jsonObj.get("integrationType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1WebKeySettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1WebKeySettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1WebKeySettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1WebKeySettings.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1WebKeySettings>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1WebKeySettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1WebKeySettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1WebKeySettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1WebKeySettings
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1WebKeySettings
   */
  public static GoogleCloudRecaptchaenterpriseV1WebKeySettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1WebKeySettings.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1WebKeySettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

