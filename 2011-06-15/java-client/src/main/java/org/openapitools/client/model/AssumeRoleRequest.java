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
 * AssumeRoleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:26.316110-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AssumeRoleRequest {
  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_ROLE_SESSION_NAME = "RoleSessionName";
  @SerializedName(SERIALIZED_NAME_ROLE_SESSION_NAME)
  private String roleSessionName;

  public static final String SERIALIZED_NAME_POLICY_ARNS = "PolicyArns";
  @SerializedName(SERIALIZED_NAME_POLICY_ARNS)
  private List policyArns;

  public static final String SERIALIZED_NAME_POLICY = "Policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_DURATION_SECONDS = "DurationSeconds";
  @SerializedName(SERIALIZED_NAME_DURATION_SECONDS)
  private Integer durationSeconds;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_TRANSITIVE_TAG_KEYS = "TransitiveTagKeys";
  @SerializedName(SERIALIZED_NAME_TRANSITIVE_TAG_KEYS)
  private List transitiveTagKeys;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "ExternalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_TOKEN_CODE = "TokenCode";
  @SerializedName(SERIALIZED_NAME_TOKEN_CODE)
  private String tokenCode;

  public static final String SERIALIZED_NAME_SOURCE_IDENTITY = "SourceIdentity";
  @SerializedName(SERIALIZED_NAME_SOURCE_IDENTITY)
  private String sourceIdentity;

  public AssumeRoleRequest() {
  }

  public AssumeRoleRequest roleArn(String roleArn) {
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


  public AssumeRoleRequest roleSessionName(String roleSessionName) {
    this.roleSessionName = roleSessionName;
    return this;
  }

  /**
   * Get roleSessionName
   * @return roleSessionName
   */
  @javax.annotation.Nonnull
  public String getRoleSessionName() {
    return roleSessionName;
  }

  public void setRoleSessionName(String roleSessionName) {
    this.roleSessionName = roleSessionName;
  }


  public AssumeRoleRequest policyArns(List policyArns) {
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


  public AssumeRoleRequest policy(String policy) {
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


  public AssumeRoleRequest durationSeconds(Integer durationSeconds) {
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


  public AssumeRoleRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public AssumeRoleRequest transitiveTagKeys(List transitiveTagKeys) {
    this.transitiveTagKeys = transitiveTagKeys;
    return this;
  }

  /**
   * Get transitiveTagKeys
   * @return transitiveTagKeys
   */
  @javax.annotation.Nullable
  public List getTransitiveTagKeys() {
    return transitiveTagKeys;
  }

  public void setTransitiveTagKeys(List transitiveTagKeys) {
    this.transitiveTagKeys = transitiveTagKeys;
  }


  public AssumeRoleRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AssumeRoleRequest serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public AssumeRoleRequest tokenCode(String tokenCode) {
    this.tokenCode = tokenCode;
    return this;
  }

  /**
   * Get tokenCode
   * @return tokenCode
   */
  @javax.annotation.Nullable
  public String getTokenCode() {
    return tokenCode;
  }

  public void setTokenCode(String tokenCode) {
    this.tokenCode = tokenCode;
  }


  public AssumeRoleRequest sourceIdentity(String sourceIdentity) {
    this.sourceIdentity = sourceIdentity;
    return this;
  }

  /**
   * Get sourceIdentity
   * @return sourceIdentity
   */
  @javax.annotation.Nullable
  public String getSourceIdentity() {
    return sourceIdentity;
  }

  public void setSourceIdentity(String sourceIdentity) {
    this.sourceIdentity = sourceIdentity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssumeRoleRequest assumeRoleRequest = (AssumeRoleRequest) o;
    return Objects.equals(this.roleArn, assumeRoleRequest.roleArn) &&
        Objects.equals(this.roleSessionName, assumeRoleRequest.roleSessionName) &&
        Objects.equals(this.policyArns, assumeRoleRequest.policyArns) &&
        Objects.equals(this.policy, assumeRoleRequest.policy) &&
        Objects.equals(this.durationSeconds, assumeRoleRequest.durationSeconds) &&
        Objects.equals(this.tags, assumeRoleRequest.tags) &&
        Objects.equals(this.transitiveTagKeys, assumeRoleRequest.transitiveTagKeys) &&
        Objects.equals(this.externalId, assumeRoleRequest.externalId) &&
        Objects.equals(this.serialNumber, assumeRoleRequest.serialNumber) &&
        Objects.equals(this.tokenCode, assumeRoleRequest.tokenCode) &&
        Objects.equals(this.sourceIdentity, assumeRoleRequest.sourceIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn, roleSessionName, policyArns, policy, durationSeconds, tags, transitiveTagKeys, externalId, serialNumber, tokenCode, sourceIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssumeRoleRequest {\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    roleSessionName: ").append(toIndentedString(roleSessionName)).append("\n");
    sb.append("    policyArns: ").append(toIndentedString(policyArns)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transitiveTagKeys: ").append(toIndentedString(transitiveTagKeys)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    tokenCode: ").append(toIndentedString(tokenCode)).append("\n");
    sb.append("    sourceIdentity: ").append(toIndentedString(sourceIdentity)).append("\n");
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
    openapiFields.add("RoleSessionName");
    openapiFields.add("PolicyArns");
    openapiFields.add("Policy");
    openapiFields.add("DurationSeconds");
    openapiFields.add("Tags");
    openapiFields.add("TransitiveTagKeys");
    openapiFields.add("ExternalId");
    openapiFields.add("SerialNumber");
    openapiFields.add("TokenCode");
    openapiFields.add("SourceIdentity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RoleArn");
    openapiRequiredFields.add("RoleSessionName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AssumeRoleRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssumeRoleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssumeRoleRequest is not found in the empty JSON string", AssumeRoleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssumeRoleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssumeRoleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssumeRoleRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `RoleArn`
      String.validateJsonElement(jsonObj.get("RoleArn"));
      // validate the required field `RoleSessionName`
      String.validateJsonElement(jsonObj.get("RoleSessionName"));
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
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
      // validate the optional field `TransitiveTagKeys`
      if (jsonObj.get("TransitiveTagKeys") != null && !jsonObj.get("TransitiveTagKeys").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TransitiveTagKeys"));
      }
      // validate the optional field `ExternalId`
      if (jsonObj.get("ExternalId") != null && !jsonObj.get("ExternalId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ExternalId"));
      }
      // validate the optional field `SerialNumber`
      if (jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SerialNumber"));
      }
      // validate the optional field `TokenCode`
      if (jsonObj.get("TokenCode") != null && !jsonObj.get("TokenCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TokenCode"));
      }
      // validate the optional field `SourceIdentity`
      if (jsonObj.get("SourceIdentity") != null && !jsonObj.get("SourceIdentity").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceIdentity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssumeRoleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssumeRoleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssumeRoleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssumeRoleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AssumeRoleRequest>() {
           @Override
           public void write(JsonWriter out, AssumeRoleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssumeRoleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AssumeRoleRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssumeRoleRequest
   * @throws IOException if the JSON string is invalid with respect to AssumeRoleRequest
   */
  public static AssumeRoleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssumeRoleRequest.class);
  }

  /**
   * Convert an instance of AssumeRoleRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

