/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
 * Contains metadata about an KMS key.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsKmsKeyDetails {
  public static final String SERIALIZED_NAME_AW_S_ACCOUNT_ID = "AWSAccountId";
  @SerializedName(SERIALIZED_NAME_AW_S_ACCOUNT_ID)
  private String awSAccountId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Double creationDate;

  public static final String SERIALIZED_NAME_KEY_ID = "KeyId";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public static final String SERIALIZED_NAME_KEY_MANAGER = "KeyManager";
  @SerializedName(SERIALIZED_NAME_KEY_MANAGER)
  private String keyManager;

  public static final String SERIALIZED_NAME_KEY_STATE = "KeyState";
  @SerializedName(SERIALIZED_NAME_KEY_STATE)
  private String keyState;

  public static final String SERIALIZED_NAME_ORIGIN = "Origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_KEY_ROTATION_STATUS = "KeyRotationStatus";
  @SerializedName(SERIALIZED_NAME_KEY_ROTATION_STATUS)
  private Boolean keyRotationStatus;

  public AwsKmsKeyDetails() {
  }

  public AwsKmsKeyDetails awSAccountId(String awSAccountId) {
    this.awSAccountId = awSAccountId;
    return this;
  }

  /**
   * Get awSAccountId
   * @return awSAccountId
   */
  @javax.annotation.Nullable
  public String getAwSAccountId() {
    return awSAccountId;
  }

  public void setAwSAccountId(String awSAccountId) {
    this.awSAccountId = awSAccountId;
  }


  public AwsKmsKeyDetails creationDate(Double creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public Double getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Double creationDate) {
    this.creationDate = creationDate;
  }


  public AwsKmsKeyDetails keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * Get keyId
   * @return keyId
   */
  @javax.annotation.Nullable
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  public AwsKmsKeyDetails keyManager(String keyManager) {
    this.keyManager = keyManager;
    return this;
  }

  /**
   * Get keyManager
   * @return keyManager
   */
  @javax.annotation.Nullable
  public String getKeyManager() {
    return keyManager;
  }

  public void setKeyManager(String keyManager) {
    this.keyManager = keyManager;
  }


  public AwsKmsKeyDetails keyState(String keyState) {
    this.keyState = keyState;
    return this;
  }

  /**
   * Get keyState
   * @return keyState
   */
  @javax.annotation.Nullable
  public String getKeyState() {
    return keyState;
  }

  public void setKeyState(String keyState) {
    this.keyState = keyState;
  }


  public AwsKmsKeyDetails origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
   */
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public AwsKmsKeyDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AwsKmsKeyDetails keyRotationStatus(Boolean keyRotationStatus) {
    this.keyRotationStatus = keyRotationStatus;
    return this;
  }

  /**
   * Get keyRotationStatus
   * @return keyRotationStatus
   */
  @javax.annotation.Nullable
  public Boolean getKeyRotationStatus() {
    return keyRotationStatus;
  }

  public void setKeyRotationStatus(Boolean keyRotationStatus) {
    this.keyRotationStatus = keyRotationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsKmsKeyDetails awsKmsKeyDetails = (AwsKmsKeyDetails) o;
    return Objects.equals(this.awSAccountId, awsKmsKeyDetails.awSAccountId) &&
        Objects.equals(this.creationDate, awsKmsKeyDetails.creationDate) &&
        Objects.equals(this.keyId, awsKmsKeyDetails.keyId) &&
        Objects.equals(this.keyManager, awsKmsKeyDetails.keyManager) &&
        Objects.equals(this.keyState, awsKmsKeyDetails.keyState) &&
        Objects.equals(this.origin, awsKmsKeyDetails.origin) &&
        Objects.equals(this.description, awsKmsKeyDetails.description) &&
        Objects.equals(this.keyRotationStatus, awsKmsKeyDetails.keyRotationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awSAccountId, creationDate, keyId, keyManager, keyState, origin, description, keyRotationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsKmsKeyDetails {\n");
    sb.append("    awSAccountId: ").append(toIndentedString(awSAccountId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    keyManager: ").append(toIndentedString(keyManager)).append("\n");
    sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keyRotationStatus: ").append(toIndentedString(keyRotationStatus)).append("\n");
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
    openapiFields.add("AWSAccountId");
    openapiFields.add("CreationDate");
    openapiFields.add("KeyId");
    openapiFields.add("KeyManager");
    openapiFields.add("KeyState");
    openapiFields.add("Origin");
    openapiFields.add("Description");
    openapiFields.add("KeyRotationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsKmsKeyDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsKmsKeyDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsKmsKeyDetails is not found in the empty JSON string", AwsKmsKeyDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsKmsKeyDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsKmsKeyDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AWSAccountId`
      if (jsonObj.get("AWSAccountId") != null && !jsonObj.get("AWSAccountId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AWSAccountId"));
      }
      // validate the optional field `CreationDate`
      if (jsonObj.get("CreationDate") != null && !jsonObj.get("CreationDate").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("CreationDate"));
      }
      // validate the optional field `KeyId`
      if (jsonObj.get("KeyId") != null && !jsonObj.get("KeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KeyId"));
      }
      // validate the optional field `KeyManager`
      if (jsonObj.get("KeyManager") != null && !jsonObj.get("KeyManager").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KeyManager"));
      }
      // validate the optional field `KeyState`
      if (jsonObj.get("KeyState") != null && !jsonObj.get("KeyState").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KeyState"));
      }
      // validate the optional field `Origin`
      if (jsonObj.get("Origin") != null && !jsonObj.get("Origin").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Origin"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `KeyRotationStatus`
      if (jsonObj.get("KeyRotationStatus") != null && !jsonObj.get("KeyRotationStatus").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("KeyRotationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsKmsKeyDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsKmsKeyDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsKmsKeyDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsKmsKeyDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsKmsKeyDetails>() {
           @Override
           public void write(JsonWriter out, AwsKmsKeyDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsKmsKeyDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsKmsKeyDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsKmsKeyDetails
   * @throws IOException if the JSON string is invalid with respect to AwsKmsKeyDetails
   */
  public static AwsKmsKeyDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsKmsKeyDetails.class);
  }

  /**
   * Convert an instance of AwsKmsKeyDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

