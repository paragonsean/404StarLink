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
 * Information about behavioral trust of the transaction.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:34.115959-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict {
  public static final String SERIALIZED_NAME_TRUST = "trust";
  @SerializedName(SERIALIZED_NAME_TRUST)
  private Float trust;

  public GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict() {
  }

  public GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict trust(Float trust) {
    this.trust = trust;
    return this;
  }

  /**
   * Probability (0-1) of this transaction attempt being executed in a behaviorally trustworthy way.
   * @return trust
   */
  @javax.annotation.Nullable
  public Float getTrust() {
    return trust;
  }

  public void setTrust(Float trust) {
    this.trust = trust;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict googleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict = (GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict) o;
    return Objects.equals(this.trust, googleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.trust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict {\n");
    sb.append("    trust: ").append(toIndentedString(trust)).append("\n");
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
    openapiFields.add("trust");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict
   */
  public static GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessmentBehavioralTrustVerdict to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

