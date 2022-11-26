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
 * Risk analysis result for an event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:54.758298-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1RiskAnalysis {
  public static final String SERIALIZED_NAME_EXTENDED_VERDICT_REASONS = "extendedVerdictReasons";
  @SerializedName(SERIALIZED_NAME_EXTENDED_VERDICT_REASONS)
  private List<String> extendedVerdictReasons = new ArrayList<>();

  /**
   * Gets or Sets reasons
   */
  @JsonAdapter(ReasonsEnum.Adapter.class)
  public enum ReasonsEnum {
    CLASSIFICATION_REASON_UNSPECIFIED("CLASSIFICATION_REASON_UNSPECIFIED"),
    
    AUTOMATION("AUTOMATION"),
    
    UNEXPECTED_ENVIRONMENT("UNEXPECTED_ENVIRONMENT"),
    
    TOO_MUCH_TRAFFIC("TOO_MUCH_TRAFFIC"),
    
    UNEXPECTED_USAGE_PATTERNS("UNEXPECTED_USAGE_PATTERNS"),
    
    LOW_CONFIDENCE_SCORE("LOW_CONFIDENCE_SCORE"),
    
    SUSPECTED_CARDING("SUSPECTED_CARDING"),
    
    SUSPECTED_CHARGEBACK("SUSPECTED_CHARGEBACK");

    private String value;

    ReasonsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonsEnum fromValue(String value) {
      for (ReasonsEnum b : ReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ReasonsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REASONS = "reasons";
  @SerializedName(SERIALIZED_NAME_REASONS)
  private List<ReasonsEnum> reasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Float score;

  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis() {
  }

  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis extendedVerdictReasons(List<String> extendedVerdictReasons) {
    this.extendedVerdictReasons = extendedVerdictReasons;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis addExtendedVerdictReasonsItem(String extendedVerdictReasonsItem) {
    if (this.extendedVerdictReasons == null) {
      this.extendedVerdictReasons = new ArrayList<>();
    }
    this.extendedVerdictReasons.add(extendedVerdictReasonsItem);
    return this;
  }

  /**
   * Extended verdict reasons to be used for experimentation only. The set of possible reasons is subject to change.
   * @return extendedVerdictReasons
   */
  @javax.annotation.Nullable
  public List<String> getExtendedVerdictReasons() {
    return extendedVerdictReasons;
  }

  public void setExtendedVerdictReasons(List<String> extendedVerdictReasons) {
    this.extendedVerdictReasons = extendedVerdictReasons;
  }


  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis reasons(List<ReasonsEnum> reasons) {
    this.reasons = reasons;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis addReasonsItem(ReasonsEnum reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

  /**
   * Reasons contributing to the risk analysis verdict.
   * @return reasons
   */
  @javax.annotation.Nullable
  public List<ReasonsEnum> getReasons() {
    return reasons;
  }

  public void setReasons(List<ReasonsEnum> reasons) {
    this.reasons = reasons;
  }


  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis score(Float score) {
    this.score = score;
    return this;
  }

  /**
   * Legitimate event score from 0.0 to 1.0. (1.0 means very likely legitimate traffic while 0.0 means very likely non-legitimate traffic).
   * @return score
   */
  @javax.annotation.Nullable
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1RiskAnalysis googleCloudRecaptchaenterpriseV1RiskAnalysis = (GoogleCloudRecaptchaenterpriseV1RiskAnalysis) o;
    return Objects.equals(this.extendedVerdictReasons, googleCloudRecaptchaenterpriseV1RiskAnalysis.extendedVerdictReasons) &&
        Objects.equals(this.reasons, googleCloudRecaptchaenterpriseV1RiskAnalysis.reasons) &&
        Objects.equals(this.score, googleCloudRecaptchaenterpriseV1RiskAnalysis.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedVerdictReasons, reasons, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1RiskAnalysis {\n");
    sb.append("    extendedVerdictReasons: ").append(toIndentedString(extendedVerdictReasons)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("extendedVerdictReasons");
    openapiFields.add("reasons");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1RiskAnalysis
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1RiskAnalysis.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1RiskAnalysis is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1RiskAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1RiskAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1RiskAnalysis` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("extendedVerdictReasons") != null && !jsonObj.get("extendedVerdictReasons").isJsonNull() && !jsonObj.get("extendedVerdictReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extendedVerdictReasons` to be an array in the JSON string but got `%s`", jsonObj.get("extendedVerdictReasons").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reasons") != null && !jsonObj.get("reasons").isJsonNull() && !jsonObj.get("reasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasons` to be an array in the JSON string but got `%s`", jsonObj.get("reasons").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1RiskAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1RiskAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1RiskAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1RiskAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1RiskAnalysis>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1RiskAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1RiskAnalysis read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1RiskAnalysis given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1RiskAnalysis
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1RiskAnalysis
   */
  public static GoogleCloudRecaptchaenterpriseV1RiskAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1RiskAnalysis.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1RiskAnalysis to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

