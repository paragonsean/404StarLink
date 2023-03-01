/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
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
import org.openapitools.client.model.PermissionType;
import org.openapitools.client.model.ShareStatus;

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
 * A workload share return object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:44.124838-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class WorkloadShare {
  public static final String SERIALIZED_NAME_SHARE_ID = "ShareId";
  @SerializedName(SERIALIZED_NAME_SHARE_ID)
  private String shareId;

  public static final String SERIALIZED_NAME_SHARED_BY = "SharedBy";
  @SerializedName(SERIALIZED_NAME_SHARED_BY)
  private String sharedBy;

  public static final String SERIALIZED_NAME_SHARED_WITH = "SharedWith";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH)
  private String sharedWith;

  public static final String SERIALIZED_NAME_PERMISSION_TYPE = "PermissionType";
  @SerializedName(SERIALIZED_NAME_PERMISSION_TYPE)
  private PermissionType permissionType;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ShareStatus status;

  public static final String SERIALIZED_NAME_WORKLOAD_NAME = "WorkloadName";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_NAME)
  private String workloadName;

  public static final String SERIALIZED_NAME_WORKLOAD_ID = "WorkloadId";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_ID)
  private String workloadId;

  public WorkloadShare() {
  }

  public WorkloadShare shareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  /**
   * The ID associated with the workload share.
   * @return shareId
   */
  @javax.annotation.Nullable
  public String getShareId() {
    return shareId;
  }

  public void setShareId(String shareId) {
    this.shareId = shareId;
  }


  public WorkloadShare sharedBy(String sharedBy) {
    this.sharedBy = sharedBy;
    return this;
  }

  /**
   * An Amazon Web Services account ID.
   * @return sharedBy
   */
  @javax.annotation.Nullable
  public String getSharedBy() {
    return sharedBy;
  }

  public void setSharedBy(String sharedBy) {
    this.sharedBy = sharedBy;
  }


  public WorkloadShare sharedWith(String sharedWith) {
    this.sharedWith = sharedWith;
    return this;
  }

  /**
   * The Amazon Web Services account ID, IAM role, organization ID, or organizational unit (OU) ID with which the workload is shared.
   * @return sharedWith
   */
  @javax.annotation.Nullable
  public String getSharedWith() {
    return sharedWith;
  }

  public void setSharedWith(String sharedWith) {
    this.sharedWith = sharedWith;
  }


  public WorkloadShare permissionType(PermissionType permissionType) {
    this.permissionType = permissionType;
    return this;
  }

  /**
   * Get permissionType
   * @return permissionType
   */
  @javax.annotation.Nullable
  public PermissionType getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(PermissionType permissionType) {
    this.permissionType = permissionType;
  }


  public WorkloadShare status(ShareStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ShareStatus getStatus() {
    return status;
  }

  public void setStatus(ShareStatus status) {
    this.status = status;
  }


  public WorkloadShare workloadName(String workloadName) {
    this.workloadName = workloadName;
    return this;
  }

  /**
   * &lt;p&gt;The name of the workload.&lt;/p&gt; &lt;p&gt;The name must be unique within an account within an Amazon Web Services Region. Spaces and capitalization are ignored when checking for uniqueness.&lt;/p&gt;
   * @return workloadName
   */
  @javax.annotation.Nullable
  public String getWorkloadName() {
    return workloadName;
  }

  public void setWorkloadName(String workloadName) {
    this.workloadName = workloadName;
  }


  public WorkloadShare workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * The ID assigned to the workload. This ID is unique within an Amazon Web Services Region.
   * @return workloadId
   */
  @javax.annotation.Nullable
  public String getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadShare workloadShare = (WorkloadShare) o;
    return Objects.equals(this.shareId, workloadShare.shareId) &&
        Objects.equals(this.sharedBy, workloadShare.sharedBy) &&
        Objects.equals(this.sharedWith, workloadShare.sharedWith) &&
        Objects.equals(this.permissionType, workloadShare.permissionType) &&
        Objects.equals(this.status, workloadShare.status) &&
        Objects.equals(this.workloadName, workloadShare.workloadName) &&
        Objects.equals(this.workloadId, workloadShare.workloadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareId, sharedBy, sharedWith, permissionType, status, workloadName, workloadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadShare {\n");
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
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
    openapiFields.add("ShareId");
    openapiFields.add("SharedBy");
    openapiFields.add("SharedWith");
    openapiFields.add("PermissionType");
    openapiFields.add("Status");
    openapiFields.add("WorkloadName");
    openapiFields.add("WorkloadId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkloadShare
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkloadShare.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkloadShare is not found in the empty JSON string", WorkloadShare.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkloadShare.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkloadShare` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ShareId") != null && !jsonObj.get("ShareId").isJsonNull()) && !jsonObj.get("ShareId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ShareId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ShareId").toString()));
      }
      if ((jsonObj.get("SharedBy") != null && !jsonObj.get("SharedBy").isJsonNull()) && !jsonObj.get("SharedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SharedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SharedBy").toString()));
      }
      if ((jsonObj.get("SharedWith") != null && !jsonObj.get("SharedWith").isJsonNull()) && !jsonObj.get("SharedWith").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SharedWith` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SharedWith").toString()));
      }
      // validate the optional field `PermissionType`
      if (jsonObj.get("PermissionType") != null && !jsonObj.get("PermissionType").isJsonNull()) {
        PermissionType.validateJsonElement(jsonObj.get("PermissionType"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ShareStatus.validateJsonElement(jsonObj.get("Status"));
      }
      if ((jsonObj.get("WorkloadName") != null && !jsonObj.get("WorkloadName").isJsonNull()) && !jsonObj.get("WorkloadName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadName").toString()));
      }
      if ((jsonObj.get("WorkloadId") != null && !jsonObj.get("WorkloadId").isJsonNull()) && !jsonObj.get("WorkloadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkloadShare.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkloadShare' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkloadShare> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkloadShare.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkloadShare>() {
           @Override
           public void write(JsonWriter out, WorkloadShare value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkloadShare read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkloadShare given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkloadShare
   * @throws IOException if the JSON string is invalid with respect to WorkloadShare
   */
  public static WorkloadShare fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkloadShare.class);
  }

  /**
   * Convert an instance of WorkloadShare to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

