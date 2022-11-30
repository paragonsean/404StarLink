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
 * Contains details about an IAM group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsIamGroupDetails {
  public static final String SERIALIZED_NAME_ATTACHED_MANAGED_POLICIES = "AttachedManagedPolicies";
  @SerializedName(SERIALIZED_NAME_ATTACHED_MANAGED_POLICIES)
  private List attachedManagedPolicies;

  public static final String SERIALIZED_NAME_CREATE_DATE = "CreateDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private String createDate;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "GroupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_GROUP_POLICY_LIST = "GroupPolicyList";
  @SerializedName(SERIALIZED_NAME_GROUP_POLICY_LIST)
  private List groupPolicyList;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public AwsIamGroupDetails() {
  }

  public AwsIamGroupDetails attachedManagedPolicies(List attachedManagedPolicies) {
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


  public AwsIamGroupDetails createDate(String createDate) {
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


  public AwsIamGroupDetails groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public AwsIamGroupDetails groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
   */
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public AwsIamGroupDetails groupPolicyList(List groupPolicyList) {
    this.groupPolicyList = groupPolicyList;
    return this;
  }

  /**
   * Get groupPolicyList
   * @return groupPolicyList
   */
  @javax.annotation.Nullable
  public List getGroupPolicyList() {
    return groupPolicyList;
  }

  public void setGroupPolicyList(List groupPolicyList) {
    this.groupPolicyList = groupPolicyList;
  }


  public AwsIamGroupDetails path(String path) {
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
    AwsIamGroupDetails awsIamGroupDetails = (AwsIamGroupDetails) o;
    return Objects.equals(this.attachedManagedPolicies, awsIamGroupDetails.attachedManagedPolicies) &&
        Objects.equals(this.createDate, awsIamGroupDetails.createDate) &&
        Objects.equals(this.groupId, awsIamGroupDetails.groupId) &&
        Objects.equals(this.groupName, awsIamGroupDetails.groupName) &&
        Objects.equals(this.groupPolicyList, awsIamGroupDetails.groupPolicyList) &&
        Objects.equals(this.path, awsIamGroupDetails.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedManagedPolicies, createDate, groupId, groupName, groupPolicyList, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsIamGroupDetails {\n");
    sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupPolicyList: ").append(toIndentedString(groupPolicyList)).append("\n");
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
    openapiFields.add("AttachedManagedPolicies");
    openapiFields.add("CreateDate");
    openapiFields.add("GroupId");
    openapiFields.add("GroupName");
    openapiFields.add("GroupPolicyList");
    openapiFields.add("Path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsIamGroupDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsIamGroupDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsIamGroupDetails is not found in the empty JSON string", AwsIamGroupDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsIamGroupDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsIamGroupDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `GroupId`
      if (jsonObj.get("GroupId") != null && !jsonObj.get("GroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("GroupId"));
      }
      // validate the optional field `GroupName`
      if (jsonObj.get("GroupName") != null && !jsonObj.get("GroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("GroupName"));
      }
      // validate the optional field `GroupPolicyList`
      if (jsonObj.get("GroupPolicyList") != null && !jsonObj.get("GroupPolicyList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("GroupPolicyList"));
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
       if (!AwsIamGroupDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsIamGroupDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsIamGroupDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsIamGroupDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsIamGroupDetails>() {
           @Override
           public void write(JsonWriter out, AwsIamGroupDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsIamGroupDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsIamGroupDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsIamGroupDetails
   * @throws IOException if the JSON string is invalid with respect to AwsIamGroupDetails
   */
  public static AwsIamGroupDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsIamGroupDetails.class);
  }

  /**
   * Convert an instance of AwsIamGroupDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

