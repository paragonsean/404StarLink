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
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1Event;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1FirewallPolicyAssessment;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessment;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1RiskAnalysis;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1TokenProperties;

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
 * A reCAPTCHA Enterprise assessment resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:34.115959-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1Assessment {
  public static final String SERIALIZED_NAME_ACCOUNT_DEFENDER_ASSESSMENT = "accountDefenderAssessment";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DEFENDER_ASSESSMENT)
  private GoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment accountDefenderAssessment;

  public static final String SERIALIZED_NAME_ACCOUNT_VERIFICATION = "accountVerification";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VERIFICATION)
  private GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo accountVerification;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private GoogleCloudRecaptchaenterpriseV1Event event;

  public static final String SERIALIZED_NAME_FIREWALL_POLICY_ASSESSMENT = "firewallPolicyAssessment";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY_ASSESSMENT)
  private GoogleCloudRecaptchaenterpriseV1FirewallPolicyAssessment firewallPolicyAssessment;

  public static final String SERIALIZED_NAME_FRAUD_PREVENTION_ASSESSMENT = "fraudPreventionAssessment";
  @SerializedName(SERIALIZED_NAME_FRAUD_PREVENTION_ASSESSMENT)
  private GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessment fraudPreventionAssessment;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIVATE_PASSWORD_LEAK_VERIFICATION = "privatePasswordLeakVerification";
  @SerializedName(SERIALIZED_NAME_PRIVATE_PASSWORD_LEAK_VERIFICATION)
  private GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification privatePasswordLeakVerification;

  public static final String SERIALIZED_NAME_RISK_ANALYSIS = "riskAnalysis";
  @SerializedName(SERIALIZED_NAME_RISK_ANALYSIS)
  private GoogleCloudRecaptchaenterpriseV1RiskAnalysis riskAnalysis;

  public static final String SERIALIZED_NAME_TOKEN_PROPERTIES = "tokenProperties";
  @SerializedName(SERIALIZED_NAME_TOKEN_PROPERTIES)
  private GoogleCloudRecaptchaenterpriseV1TokenProperties tokenProperties;

  public GoogleCloudRecaptchaenterpriseV1Assessment() {
  }

  public GoogleCloudRecaptchaenterpriseV1Assessment(
     String name
  ) {
    this();
    this.name = name;
  }

  public GoogleCloudRecaptchaenterpriseV1Assessment accountDefenderAssessment(GoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment accountDefenderAssessment) {
    this.accountDefenderAssessment = accountDefenderAssessment;
    return this;
  }

  /**
   * Get accountDefenderAssessment
   * @return accountDefenderAssessment
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment getAccountDefenderAssessment() {
    return accountDefenderAssessment;
  }

  public void setAccountDefenderAssessment(GoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment accountDefenderAssessment) {
    this.accountDefenderAssessment = accountDefenderAssessment;
  }


  public GoogleCloudRecaptchaenterpriseV1Assessment accountVerification(GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo accountVerification) {
    this.accountVerification = accountVerification;
    return this;
  }

  /**
   * Get accountVerification
   * @return accountVerification
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo getAccountVerification() {
    return accountVerification;
  }

  public void setAccountVerification(GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo accountVerification) {
    this.accountVerification = accountVerification;
  }


  public GoogleCloudRecaptchaenterpriseV1Assessment event(GoogleCloudRecaptchaenterpriseV1Event event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1Event getEvent() {
    return event;
  }

  public void setEvent(GoogleCloudRecaptchaenterpriseV1Event event) {
    this.event = event;
  }


  public GoogleCloudRecaptchaenterpriseV1Assessment firewallPolicyAssessment(GoogleCloudRecaptchaenterpriseV1FirewallPolicyAssessment firewallPolicyAssessment) {
    this.firewallPolicyAssessment = firewallPolicyAssessment;
    return this;
  }

  /**
   * Get firewallPolicyAssessment
   * @return firewallPolicyAssessment
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1FirewallPolicyAssessment getFirewallPolicyAssessment() {
    return firewallPolicyAssessment;
  }

  public void setFirewallPolicyAssessment(GoogleCloudRecaptchaenterpriseV1FirewallPolicyAssessment firewallPolicyAssessment) {
    this.firewallPolicyAssessment = firewallPolicyAssessment;
  }


  public GoogleCloudRecaptchaenterpriseV1Assessment fraudPreventionAssessment(GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessment fraudPreventionAssessment) {
    this.fraudPreventionAssessment = fraudPreventionAssessment;
    return this;
  }

  /**
   * Get fraudPreventionAssessment
   * @return fraudPreventionAssessment
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessment getFraudPreventionAssessment() {
    return fraudPreventionAssessment;
  }

  public void setFraudPreventionAssessment(GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessment fraudPreventionAssessment) {
    this.fraudPreventionAssessment = fraudPreventionAssessment;
  }


  /**
   * Output only. The resource name for the Assessment in the format \&quot;projects/{project}/assessments/{assessment}\&quot;.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public GoogleCloudRecaptchaenterpriseV1Assessment privatePasswordLeakVerification(GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification privatePasswordLeakVerification) {
    this.privatePasswordLeakVerification = privatePasswordLeakVerification;
    return this;
  }

  /**
   * Get privatePasswordLeakVerification
   * @return privatePasswordLeakVerification
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification getPrivatePasswordLeakVerification() {
    return privatePasswordLeakVerification;
  }

  public void setPrivatePasswordLeakVerification(GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification privatePasswordLeakVerification) {
    this.privatePasswordLeakVerification = privatePasswordLeakVerification;
  }


  public GoogleCloudRecaptchaenterpriseV1Assessment riskAnalysis(GoogleCloudRecaptchaenterpriseV1RiskAnalysis riskAnalysis) {
    this.riskAnalysis = riskAnalysis;
    return this;
  }

  /**
   * Get riskAnalysis
   * @return riskAnalysis
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis getRiskAnalysis() {
    return riskAnalysis;
  }

  public void setRiskAnalysis(GoogleCloudRecaptchaenterpriseV1RiskAnalysis riskAnalysis) {
    this.riskAnalysis = riskAnalysis;
  }


  public GoogleCloudRecaptchaenterpriseV1Assessment tokenProperties(GoogleCloudRecaptchaenterpriseV1TokenProperties tokenProperties) {
    this.tokenProperties = tokenProperties;
    return this;
  }

  /**
   * Get tokenProperties
   * @return tokenProperties
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1TokenProperties getTokenProperties() {
    return tokenProperties;
  }

  public void setTokenProperties(GoogleCloudRecaptchaenterpriseV1TokenProperties tokenProperties) {
    this.tokenProperties = tokenProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1Assessment googleCloudRecaptchaenterpriseV1Assessment = (GoogleCloudRecaptchaenterpriseV1Assessment) o;
    return Objects.equals(this.accountDefenderAssessment, googleCloudRecaptchaenterpriseV1Assessment.accountDefenderAssessment) &&
        Objects.equals(this.accountVerification, googleCloudRecaptchaenterpriseV1Assessment.accountVerification) &&
        Objects.equals(this.event, googleCloudRecaptchaenterpriseV1Assessment.event) &&
        Objects.equals(this.firewallPolicyAssessment, googleCloudRecaptchaenterpriseV1Assessment.firewallPolicyAssessment) &&
        Objects.equals(this.fraudPreventionAssessment, googleCloudRecaptchaenterpriseV1Assessment.fraudPreventionAssessment) &&
        Objects.equals(this.name, googleCloudRecaptchaenterpriseV1Assessment.name) &&
        Objects.equals(this.privatePasswordLeakVerification, googleCloudRecaptchaenterpriseV1Assessment.privatePasswordLeakVerification) &&
        Objects.equals(this.riskAnalysis, googleCloudRecaptchaenterpriseV1Assessment.riskAnalysis) &&
        Objects.equals(this.tokenProperties, googleCloudRecaptchaenterpriseV1Assessment.tokenProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDefenderAssessment, accountVerification, event, firewallPolicyAssessment, fraudPreventionAssessment, name, privatePasswordLeakVerification, riskAnalysis, tokenProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1Assessment {\n");
    sb.append("    accountDefenderAssessment: ").append(toIndentedString(accountDefenderAssessment)).append("\n");
    sb.append("    accountVerification: ").append(toIndentedString(accountVerification)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    firewallPolicyAssessment: ").append(toIndentedString(firewallPolicyAssessment)).append("\n");
    sb.append("    fraudPreventionAssessment: ").append(toIndentedString(fraudPreventionAssessment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privatePasswordLeakVerification: ").append(toIndentedString(privatePasswordLeakVerification)).append("\n");
    sb.append("    riskAnalysis: ").append(toIndentedString(riskAnalysis)).append("\n");
    sb.append("    tokenProperties: ").append(toIndentedString(tokenProperties)).append("\n");
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
    openapiFields.add("accountDefenderAssessment");
    openapiFields.add("accountVerification");
    openapiFields.add("event");
    openapiFields.add("firewallPolicyAssessment");
    openapiFields.add("fraudPreventionAssessment");
    openapiFields.add("name");
    openapiFields.add("privatePasswordLeakVerification");
    openapiFields.add("riskAnalysis");
    openapiFields.add("tokenProperties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1Assessment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1Assessment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1Assessment is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1Assessment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1Assessment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1Assessment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `accountDefenderAssessment`
      if (jsonObj.get("accountDefenderAssessment") != null && !jsonObj.get("accountDefenderAssessment").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment.validateJsonElement(jsonObj.get("accountDefenderAssessment"));
      }
      // validate the optional field `accountVerification`
      if (jsonObj.get("accountVerification") != null && !jsonObj.get("accountVerification").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo.validateJsonElement(jsonObj.get("accountVerification"));
      }
      // validate the optional field `event`
      if (jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1Event.validateJsonElement(jsonObj.get("event"));
      }
      // validate the optional field `firewallPolicyAssessment`
      if (jsonObj.get("firewallPolicyAssessment") != null && !jsonObj.get("firewallPolicyAssessment").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1FirewallPolicyAssessment.validateJsonElement(jsonObj.get("firewallPolicyAssessment"));
      }
      // validate the optional field `fraudPreventionAssessment`
      if (jsonObj.get("fraudPreventionAssessment") != null && !jsonObj.get("fraudPreventionAssessment").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1FraudPreventionAssessment.validateJsonElement(jsonObj.get("fraudPreventionAssessment"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `privatePasswordLeakVerification`
      if (jsonObj.get("privatePasswordLeakVerification") != null && !jsonObj.get("privatePasswordLeakVerification").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification.validateJsonElement(jsonObj.get("privatePasswordLeakVerification"));
      }
      // validate the optional field `riskAnalysis`
      if (jsonObj.get("riskAnalysis") != null && !jsonObj.get("riskAnalysis").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1RiskAnalysis.validateJsonElement(jsonObj.get("riskAnalysis"));
      }
      // validate the optional field `tokenProperties`
      if (jsonObj.get("tokenProperties") != null && !jsonObj.get("tokenProperties").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1TokenProperties.validateJsonElement(jsonObj.get("tokenProperties"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1Assessment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1Assessment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1Assessment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1Assessment.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1Assessment>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1Assessment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1Assessment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1Assessment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1Assessment
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1Assessment
   */
  public static GoogleCloudRecaptchaenterpriseV1Assessment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1Assessment.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1Assessment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

