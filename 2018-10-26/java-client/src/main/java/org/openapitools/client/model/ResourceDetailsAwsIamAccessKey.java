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
import org.openapitools.client.model.AwsIamAccessKeyDetailsSessionContext;
import org.openapitools.client.model.AwsIamAccessKeyStatus;

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
 * ResourceDetailsAwsIamAccessKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsIamAccessKey {
  public static final String SERIALIZED_NAME_USER_NAME = "UserName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AwsIamAccessKeyStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_PRINCIPAL_ID = "PrincipalId";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ID)
  private String principalId;

  public static final String SERIALIZED_NAME_PRINCIPAL_TYPE = "PrincipalType";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_TYPE)
  private String principalType;

  public static final String SERIALIZED_NAME_PRINCIPAL_NAME = "PrincipalName";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_NAME)
  private String principalName;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "AccessKeyId";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_SESSION_CONTEXT = "SessionContext";
  @SerializedName(SERIALIZED_NAME_SESSION_CONTEXT)
  private AwsIamAccessKeyDetailsSessionContext sessionContext;

  public ResourceDetailsAwsIamAccessKey() {
  }

  public ResourceDetailsAwsIamAccessKey userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ResourceDetailsAwsIamAccessKey status(AwsIamAccessKeyStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public AwsIamAccessKeyStatus getStatus() {
    return status;
  }

  public void setStatus(AwsIamAccessKeyStatus status) {
    this.status = status;
  }


  public ResourceDetailsAwsIamAccessKey createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ResourceDetailsAwsIamAccessKey principalId(String principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * Get principalId
   * @return principalId
   */
  @javax.annotation.Nullable
  public String getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }


  public ResourceDetailsAwsIamAccessKey principalType(String principalType) {
    this.principalType = principalType;
    return this;
  }

  /**
   * Get principalType
   * @return principalType
   */
  @javax.annotation.Nullable
  public String getPrincipalType() {
    return principalType;
  }

  public void setPrincipalType(String principalType) {
    this.principalType = principalType;
  }


  public ResourceDetailsAwsIamAccessKey principalName(String principalName) {
    this.principalName = principalName;
    return this;
  }

  /**
   * Get principalName
   * @return principalName
   */
  @javax.annotation.Nullable
  public String getPrincipalName() {
    return principalName;
  }

  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }


  public ResourceDetailsAwsIamAccessKey accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ResourceDetailsAwsIamAccessKey accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Get accessKeyId
   * @return accessKeyId
   */
  @javax.annotation.Nullable
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public ResourceDetailsAwsIamAccessKey sessionContext(AwsIamAccessKeyDetailsSessionContext sessionContext) {
    this.sessionContext = sessionContext;
    return this;
  }

  /**
   * Get sessionContext
   * @return sessionContext
   */
  @javax.annotation.Nullable
  public AwsIamAccessKeyDetailsSessionContext getSessionContext() {
    return sessionContext;
  }

  public void setSessionContext(AwsIamAccessKeyDetailsSessionContext sessionContext) {
    this.sessionContext = sessionContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsIamAccessKey resourceDetailsAwsIamAccessKey = (ResourceDetailsAwsIamAccessKey) o;
    return Objects.equals(this.userName, resourceDetailsAwsIamAccessKey.userName) &&
        Objects.equals(this.status, resourceDetailsAwsIamAccessKey.status) &&
        Objects.equals(this.createdAt, resourceDetailsAwsIamAccessKey.createdAt) &&
        Objects.equals(this.principalId, resourceDetailsAwsIamAccessKey.principalId) &&
        Objects.equals(this.principalType, resourceDetailsAwsIamAccessKey.principalType) &&
        Objects.equals(this.principalName, resourceDetailsAwsIamAccessKey.principalName) &&
        Objects.equals(this.accountId, resourceDetailsAwsIamAccessKey.accountId) &&
        Objects.equals(this.accessKeyId, resourceDetailsAwsIamAccessKey.accessKeyId) &&
        Objects.equals(this.sessionContext, resourceDetailsAwsIamAccessKey.sessionContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, status, createdAt, principalId, principalType, principalName, accountId, accessKeyId, sessionContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsIamAccessKey {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
    sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
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
    openapiFields.add("UserName");
    openapiFields.add("Status");
    openapiFields.add("CreatedAt");
    openapiFields.add("PrincipalId");
    openapiFields.add("PrincipalType");
    openapiFields.add("PrincipalName");
    openapiFields.add("AccountId");
    openapiFields.add("AccessKeyId");
    openapiFields.add("SessionContext");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsIamAccessKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsIamAccessKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsIamAccessKey is not found in the empty JSON string", ResourceDetailsAwsIamAccessKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsIamAccessKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsIamAccessKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `UserName`
      if (jsonObj.get("UserName") != null && !jsonObj.get("UserName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UserName"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        AwsIamAccessKeyStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `CreatedAt`
      if (jsonObj.get("CreatedAt") != null && !jsonObj.get("CreatedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedAt"));
      }
      // validate the optional field `PrincipalId`
      if (jsonObj.get("PrincipalId") != null && !jsonObj.get("PrincipalId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrincipalId"));
      }
      // validate the optional field `PrincipalType`
      if (jsonObj.get("PrincipalType") != null && !jsonObj.get("PrincipalType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrincipalType"));
      }
      // validate the optional field `PrincipalName`
      if (jsonObj.get("PrincipalName") != null && !jsonObj.get("PrincipalName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrincipalName"));
      }
      // validate the optional field `AccountId`
      if (jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccountId"));
      }
      // validate the optional field `AccessKeyId`
      if (jsonObj.get("AccessKeyId") != null && !jsonObj.get("AccessKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessKeyId"));
      }
      // validate the optional field `SessionContext`
      if (jsonObj.get("SessionContext") != null && !jsonObj.get("SessionContext").isJsonNull()) {
        AwsIamAccessKeyDetailsSessionContext.validateJsonElement(jsonObj.get("SessionContext"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsIamAccessKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsIamAccessKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsIamAccessKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsIamAccessKey.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsIamAccessKey>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsIamAccessKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsIamAccessKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsIamAccessKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsIamAccessKey
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsIamAccessKey
   */
  public static ResourceDetailsAwsIamAccessKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsIamAccessKey.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsIamAccessKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

