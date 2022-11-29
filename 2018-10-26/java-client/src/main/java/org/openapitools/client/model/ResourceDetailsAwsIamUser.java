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
import java.util.List;
import org.openapitools.client.model.AwsIamUserDetailsPermissionsBoundary;

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
 * ResourceDetailsAwsIamUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsIamUser {
  public static final String SERIALIZED_NAME_ATTACHED_MANAGED_POLICIES = "AttachedManagedPolicies";
  @SerializedName(SERIALIZED_NAME_ATTACHED_MANAGED_POLICIES)
  private List attachedManagedPolicies;

  public static final String SERIALIZED_NAME_CREATE_DATE = "CreateDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private String createDate;

  public static final String SERIALIZED_NAME_GROUP_LIST = "GroupList";
  @SerializedName(SERIALIZED_NAME_GROUP_LIST)
  private List groupList;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PERMISSIONS_BOUNDARY = "PermissionsBoundary";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_BOUNDARY)
  private AwsIamUserDetailsPermissionsBoundary permissionsBoundary;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_NAME = "UserName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_USER_POLICY_LIST = "UserPolicyList";
  @SerializedName(SERIALIZED_NAME_USER_POLICY_LIST)
  private List userPolicyList;

  public ResourceDetailsAwsIamUser() {
  }

  public ResourceDetailsAwsIamUser attachedManagedPolicies(List attachedManagedPolicies) {
    this.attachedManagedPolicies = attachedManagedPolicies;
    return this;
  }

  /**
   * Get attachedManagedPolicies
   * @return attachedManagedPolicies
   */
  @javax.annotation.Nullable
  public List getAttachedManagedPolicies() {
    return attachedManagedPolicies;
  }

  public void setAttachedManagedPolicies(List attachedManagedPolicies) {
    this.attachedManagedPolicies = attachedManagedPolicies;
  }


  public ResourceDetailsAwsIamUser createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
   */
  @javax.annotation.Nullable
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  public ResourceDetailsAwsIamUser groupList(List groupList) {
    this.groupList = groupList;
    return this;
  }

  /**
   * Get groupList
   * @return groupList
   */
  @javax.annotation.Nullable
  public List getGroupList() {
    return groupList;
  }

  public void setGroupList(List groupList) {
    this.groupList = groupList;
  }


  public ResourceDetailsAwsIamUser path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public ResourceDetailsAwsIamUser permissionsBoundary(AwsIamUserDetailsPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
   */
  @javax.annotation.Nullable
  public AwsIamUserDetailsPermissionsBoundary getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(AwsIamUserDetailsPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }


  public ResourceDetailsAwsIamUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ResourceDetailsAwsIamUser userName(String userName) {
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


  public ResourceDetailsAwsIamUser userPolicyList(List userPolicyList) {
    this.userPolicyList = userPolicyList;
    return this;
  }

  /**
   * Get userPolicyList
   * @return userPolicyList
   */
  @javax.annotation.Nullable
  public List getUserPolicyList() {
    return userPolicyList;
  }

  public void setUserPolicyList(List userPolicyList) {
    this.userPolicyList = userPolicyList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsIamUser resourceDetailsAwsIamUser = (ResourceDetailsAwsIamUser) o;
    return Objects.equals(this.attachedManagedPolicies, resourceDetailsAwsIamUser.attachedManagedPolicies) &&
        Objects.equals(this.createDate, resourceDetailsAwsIamUser.createDate) &&
        Objects.equals(this.groupList, resourceDetailsAwsIamUser.groupList) &&
        Objects.equals(this.path, resourceDetailsAwsIamUser.path) &&
        Objects.equals(this.permissionsBoundary, resourceDetailsAwsIamUser.permissionsBoundary) &&
        Objects.equals(this.userId, resourceDetailsAwsIamUser.userId) &&
        Objects.equals(this.userName, resourceDetailsAwsIamUser.userName) &&
        Objects.equals(this.userPolicyList, resourceDetailsAwsIamUser.userPolicyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedManagedPolicies, createDate, groupList, path, permissionsBoundary, userId, userName, userPolicyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsIamUser {\n");
    sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPolicyList: ").append(toIndentedString(userPolicyList)).append("\n");
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
    openapiFields.add("AttachedManagedPolicies");
    openapiFields.add("CreateDate");
    openapiFields.add("GroupList");
    openapiFields.add("Path");
    openapiFields.add("PermissionsBoundary");
    openapiFields.add("UserId");
    openapiFields.add("UserName");
    openapiFields.add("UserPolicyList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsIamUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsIamUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsIamUser is not found in the empty JSON string", ResourceDetailsAwsIamUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsIamUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsIamUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AttachedManagedPolicies`
      if (jsonObj.get("AttachedManagedPolicies") != null && !jsonObj.get("AttachedManagedPolicies").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AttachedManagedPolicies"));
      }
      // validate the optional field `CreateDate`
      if (jsonObj.get("CreateDate") != null && !jsonObj.get("CreateDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreateDate"));
      }
      // validate the optional field `GroupList`
      if (jsonObj.get("GroupList") != null && !jsonObj.get("GroupList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("GroupList"));
      }
      // validate the optional field `Path`
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Path"));
      }
      // validate the optional field `PermissionsBoundary`
      if (jsonObj.get("PermissionsBoundary") != null && !jsonObj.get("PermissionsBoundary").isJsonNull()) {
        AwsIamUserDetailsPermissionsBoundary.validateJsonElement(jsonObj.get("PermissionsBoundary"));
      }
      // validate the optional field `UserId`
      if (jsonObj.get("UserId") != null && !jsonObj.get("UserId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UserId"));
      }
      // validate the optional field `UserName`
      if (jsonObj.get("UserName") != null && !jsonObj.get("UserName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UserName"));
      }
      // validate the optional field `UserPolicyList`
      if (jsonObj.get("UserPolicyList") != null && !jsonObj.get("UserPolicyList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("UserPolicyList"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsIamUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsIamUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsIamUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsIamUser.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsIamUser>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsIamUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsIamUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsIamUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsIamUser
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsIamUser
   */
  public static ResourceDetailsAwsIamUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsIamUser.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsIamUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

