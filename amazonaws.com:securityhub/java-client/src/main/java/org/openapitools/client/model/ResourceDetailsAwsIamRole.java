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
import org.openapitools.client.model.AwsIamPermissionsBoundary;

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
 * ResourceDetailsAwsIamRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsIamRole {
  public static final String SERIALIZED_NAME_ASSUME_ROLE_POLICY_DOCUMENT = "AssumeRolePolicyDocument";
  @SerializedName(SERIALIZED_NAME_ASSUME_ROLE_POLICY_DOCUMENT)
  private String assumeRolePolicyDocument;

  public static final String SERIALIZED_NAME_ATTACHED_MANAGED_POLICIES = "AttachedManagedPolicies";
  @SerializedName(SERIALIZED_NAME_ATTACHED_MANAGED_POLICIES)
  private List attachedManagedPolicies;

  public static final String SERIALIZED_NAME_CREATE_DATE = "CreateDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private String createDate;

  public static final String SERIALIZED_NAME_INSTANCE_PROFILE_LIST = "InstanceProfileList";
  @SerializedName(SERIALIZED_NAME_INSTANCE_PROFILE_LIST)
  private List instanceProfileList;

  public static final String SERIALIZED_NAME_PERMISSIONS_BOUNDARY = "PermissionsBoundary";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_BOUNDARY)
  private AwsIamPermissionsBoundary permissionsBoundary;

  public static final String SERIALIZED_NAME_ROLE_ID = "RoleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public static final String SERIALIZED_NAME_ROLE_NAME = "RoleName";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_ROLE_POLICY_LIST = "RolePolicyList";
  @SerializedName(SERIALIZED_NAME_ROLE_POLICY_LIST)
  private List rolePolicyList;

  public static final String SERIALIZED_NAME_MAX_SESSION_DURATION = "MaxSessionDuration";
  @SerializedName(SERIALIZED_NAME_MAX_SESSION_DURATION)
  private Integer maxSessionDuration;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public ResourceDetailsAwsIamRole() {
  }

  public ResourceDetailsAwsIamRole assumeRolePolicyDocument(String assumeRolePolicyDocument) {
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    return this;
  }

  /**
   * Get assumeRolePolicyDocument
   * @return assumeRolePolicyDocument
   */
  @javax.annotation.Nullable
  public String getAssumeRolePolicyDocument() {
    return assumeRolePolicyDocument;
  }

  public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
  }


  public ResourceDetailsAwsIamRole attachedManagedPolicies(List attachedManagedPolicies) {
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


  public ResourceDetailsAwsIamRole createDate(String createDate) {
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


  public ResourceDetailsAwsIamRole instanceProfileList(List instanceProfileList) {
    this.instanceProfileList = instanceProfileList;
    return this;
  }

  /**
   * Get instanceProfileList
   * @return instanceProfileList
   */
  @javax.annotation.Nullable
  public List getInstanceProfileList() {
    return instanceProfileList;
  }

  public void setInstanceProfileList(List instanceProfileList) {
    this.instanceProfileList = instanceProfileList;
  }


  public ResourceDetailsAwsIamRole permissionsBoundary(AwsIamPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
   */
  @javax.annotation.Nullable
  public AwsIamPermissionsBoundary getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(AwsIamPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }


  public ResourceDetailsAwsIamRole roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
   */
  @javax.annotation.Nullable
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public ResourceDetailsAwsIamRole roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   */
  @javax.annotation.Nullable
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public ResourceDetailsAwsIamRole rolePolicyList(List rolePolicyList) {
    this.rolePolicyList = rolePolicyList;
    return this;
  }

  /**
   * Get rolePolicyList
   * @return rolePolicyList
   */
  @javax.annotation.Nullable
  public List getRolePolicyList() {
    return rolePolicyList;
  }

  public void setRolePolicyList(List rolePolicyList) {
    this.rolePolicyList = rolePolicyList;
  }


  public ResourceDetailsAwsIamRole maxSessionDuration(Integer maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
    return this;
  }

  /**
   * Get maxSessionDuration
   * @return maxSessionDuration
   */
  @javax.annotation.Nullable
  public Integer getMaxSessionDuration() {
    return maxSessionDuration;
  }

  public void setMaxSessionDuration(Integer maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
  }


  public ResourceDetailsAwsIamRole path(String path) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsIamRole resourceDetailsAwsIamRole = (ResourceDetailsAwsIamRole) o;
    return Objects.equals(this.assumeRolePolicyDocument, resourceDetailsAwsIamRole.assumeRolePolicyDocument) &&
        Objects.equals(this.attachedManagedPolicies, resourceDetailsAwsIamRole.attachedManagedPolicies) &&
        Objects.equals(this.createDate, resourceDetailsAwsIamRole.createDate) &&
        Objects.equals(this.instanceProfileList, resourceDetailsAwsIamRole.instanceProfileList) &&
        Objects.equals(this.permissionsBoundary, resourceDetailsAwsIamRole.permissionsBoundary) &&
        Objects.equals(this.roleId, resourceDetailsAwsIamRole.roleId) &&
        Objects.equals(this.roleName, resourceDetailsAwsIamRole.roleName) &&
        Objects.equals(this.rolePolicyList, resourceDetailsAwsIamRole.rolePolicyList) &&
        Objects.equals(this.maxSessionDuration, resourceDetailsAwsIamRole.maxSessionDuration) &&
        Objects.equals(this.path, resourceDetailsAwsIamRole.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assumeRolePolicyDocument, attachedManagedPolicies, createDate, instanceProfileList, permissionsBoundary, roleId, roleName, rolePolicyList, maxSessionDuration, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsIamRole {\n");
    sb.append("    assumeRolePolicyDocument: ").append(toIndentedString(assumeRolePolicyDocument)).append("\n");
    sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    instanceProfileList: ").append(toIndentedString(instanceProfileList)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    rolePolicyList: ").append(toIndentedString(rolePolicyList)).append("\n");
    sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("AssumeRolePolicyDocument");
    openapiFields.add("AttachedManagedPolicies");
    openapiFields.add("CreateDate");
    openapiFields.add("InstanceProfileList");
    openapiFields.add("PermissionsBoundary");
    openapiFields.add("RoleId");
    openapiFields.add("RoleName");
    openapiFields.add("RolePolicyList");
    openapiFields.add("MaxSessionDuration");
    openapiFields.add("Path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsIamRole
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsIamRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsIamRole is not found in the empty JSON string", ResourceDetailsAwsIamRole.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsIamRole.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsIamRole` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AssumeRolePolicyDocument`
      if (jsonObj.get("AssumeRolePolicyDocument") != null && !jsonObj.get("AssumeRolePolicyDocument").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AssumeRolePolicyDocument"));
      }
      // validate the optional field `AttachedManagedPolicies`
      if (jsonObj.get("AttachedManagedPolicies") != null && !jsonObj.get("AttachedManagedPolicies").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AttachedManagedPolicies"));
      }
      // validate the optional field `CreateDate`
      if (jsonObj.get("CreateDate") != null && !jsonObj.get("CreateDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreateDate"));
      }
      // validate the optional field `InstanceProfileList`
      if (jsonObj.get("InstanceProfileList") != null && !jsonObj.get("InstanceProfileList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("InstanceProfileList"));
      }
      // validate the optional field `PermissionsBoundary`
      if (jsonObj.get("PermissionsBoundary") != null && !jsonObj.get("PermissionsBoundary").isJsonNull()) {
        AwsIamPermissionsBoundary.validateJsonElement(jsonObj.get("PermissionsBoundary"));
      }
      // validate the optional field `RoleId`
      if (jsonObj.get("RoleId") != null && !jsonObj.get("RoleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RoleId"));
      }
      // validate the optional field `RoleName`
      if (jsonObj.get("RoleName") != null && !jsonObj.get("RoleName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RoleName"));
      }
      // validate the optional field `RolePolicyList`
      if (jsonObj.get("RolePolicyList") != null && !jsonObj.get("RolePolicyList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RolePolicyList"));
      }
      // validate the optional field `MaxSessionDuration`
      if (jsonObj.get("MaxSessionDuration") != null && !jsonObj.get("MaxSessionDuration").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxSessionDuration"));
      }
      // validate the optional field `Path`
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Path"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsIamRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsIamRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsIamRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsIamRole.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsIamRole>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsIamRole value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsIamRole read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsIamRole given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsIamRole
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsIamRole
   */
  public static ResourceDetailsAwsIamRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsIamRole.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsIamRole to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

