/*
 * AWS Security Token Service
 * <fullname>Security Token Service</fullname> <p>Security Token Service (STS) enables you to request temporary, limited-privilege credentials for Identity and Access Management (IAM) users or for users that you authenticate (federated users). This guide provides descriptions of the STS API. For more information about using this service, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html\">Temporary Security Credentials</a>.</p>
 *
 * The version of the OpenAPI document: 2011-06-15
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
 * AssumeRoleWithSAMLRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:29.307538-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AssumeRoleWithSAMLRequest {
  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_PRINCIPAL_ARN = "PrincipalArn";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ARN)
  private String principalArn;

  public static final String SERIALIZED_NAME_SA_M_L_ASSERTION = "SAMLAssertion";
  @SerializedName(SERIALIZED_NAME_SA_M_L_ASSERTION)
  private String saMLAssertion;

  public static final String SERIALIZED_NAME_POLICY_ARNS = "PolicyArns";
  @SerializedName(SERIALIZED_NAME_POLICY_ARNS)
  private List policyArns;

  public static final String SERIALIZED_NAME_POLICY = "Policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_DURATION_SECONDS = "DurationSeconds";
  @SerializedName(SERIALIZED_NAME_DURATION_SECONDS)
  private Integer durationSeconds;

  public AssumeRoleWithSAMLRequest() {
  }

  public AssumeRoleWithSAMLRequest roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public AssumeRoleWithSAMLRequest principalArn(String principalArn) {
    this.principalArn = principalArn;
    return this;
  }

  /**
   * Get principalArn
   * @return principalArn
   */
  @javax.annotation.Nonnull
  public String getPrincipalArn() {
    return principalArn;
  }

  public void setPrincipalArn(String principalArn) {
    this.principalArn = principalArn;
  }


  public AssumeRoleWithSAMLRequest saMLAssertion(String saMLAssertion) {
    this.saMLAssertion = saMLAssertion;
    return this;
  }

  /**
   * Get saMLAssertion
   * @return saMLAssertion
   */
  @javax.annotation.Nonnull
  public String getSaMLAssertion() {
    return saMLAssertion;
  }

  public void setSaMLAssertion(String saMLAssertion) {
    this.saMLAssertion = saMLAssertion;
  }


  public AssumeRoleWithSAMLRequest policyArns(List policyArns) {
    this.policyArns = policyArns;
    return this;
  }

  /**
   * Get policyArns
   * @return policyArns
   */
  @javax.annotation.Nullable
  public List getPolicyArns() {
    return policyArns;
  }

  public void setPolicyArns(List policyArns) {
    this.policyArns = policyArns;
  }


  public AssumeRoleWithSAMLRequest policy(String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   */
  @javax.annotation.Nullable
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public AssumeRoleWithSAMLRequest durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Get durationSeconds
   * @return durationSeconds
   */
  @javax.annotation.Nullable
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest = (AssumeRoleWithSAMLRequest) o;
    return Objects.equals(this.roleArn, assumeRoleWithSAMLRequest.roleArn) &&
        Objects.equals(this.principalArn, assumeRoleWithSAMLRequest.principalArn) &&
        Objects.equals(this.saMLAssertion, assumeRoleWithSAMLRequest.saMLAssertion) &&
        Objects.equals(this.policyArns, assumeRoleWithSAMLRequest.policyArns) &&
        Objects.equals(this.policy, assumeRoleWithSAMLRequest.policy) &&
        Objects.equals(this.durationSeconds, assumeRoleWithSAMLRequest.durationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn, principalArn, saMLAssertion, policyArns, policy, durationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssumeRoleWithSAMLRequest {\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    principalArn: ").append(toIndentedString(principalArn)).append("\n");
    sb.append("    saMLAssertion: ").append(toIndentedString(saMLAssertion)).append("\n");
    sb.append("    policyArns: ").append(toIndentedString(policyArns)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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
    openapiFields.add("RoleArn");
    openapiFields.add("PrincipalArn");
    openapiFields.add("SAMLAssertion");
    openapiFields.add("PolicyArns");
    openapiFields.add("Policy");
    openapiFields.add("DurationSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RoleArn");
    openapiRequiredFields.add("PrincipalArn");
    openapiRequiredFields.add("SAMLAssertion");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AssumeRoleWithSAMLRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssumeRoleWithSAMLRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssumeRoleWithSAMLRequest is not found in the empty JSON string", AssumeRoleWithSAMLRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssumeRoleWithSAMLRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssumeRoleWithSAMLRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssumeRoleWithSAMLRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `RoleArn`
      String.validateJsonElement(jsonObj.get("RoleArn"));
      // validate the required field `PrincipalArn`
      String.validateJsonElement(jsonObj.get("PrincipalArn"));
      // validate the required field `SAMLAssertion`
      String.validateJsonElement(jsonObj.get("SAMLAssertion"));
      // validate the optional field `PolicyArns`
      if (jsonObj.get("PolicyArns") != null && !jsonObj.get("PolicyArns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PolicyArns"));
      }
      // validate the optional field `Policy`
      if (jsonObj.get("Policy") != null && !jsonObj.get("Policy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Policy"));
      }
      // validate the optional field `DurationSeconds`
      if (jsonObj.get("DurationSeconds") != null && !jsonObj.get("DurationSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DurationSeconds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssumeRoleWithSAMLRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssumeRoleWithSAMLRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssumeRoleWithSAMLRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssumeRoleWithSAMLRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AssumeRoleWithSAMLRequest>() {
           @Override
           public void write(JsonWriter out, AssumeRoleWithSAMLRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssumeRoleWithSAMLRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AssumeRoleWithSAMLRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssumeRoleWithSAMLRequest
   * @throws IOException if the JSON string is invalid with respect to AssumeRoleWithSAMLRequest
   */
  public static AssumeRoleWithSAMLRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssumeRoleWithSAMLRequest.class);
  }

  /**
   * Convert an instance of AssumeRoleWithSAMLRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

