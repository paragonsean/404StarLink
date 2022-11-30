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
import org.openapitools.client.model.AwsBackupBackupPlanDetailsBackupPlan;

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
 * ResourceDetailsAwsBackupBackupPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsBackupBackupPlan {
  public static final String SERIALIZED_NAME_BACKUP_PLAN = "BackupPlan";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLAN)
  private AwsBackupBackupPlanDetailsBackupPlan backupPlan;

  public static final String SERIALIZED_NAME_BACKUP_PLAN_ARN = "BackupPlanArn";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_ARN)
  private String backupPlanArn;

  public static final String SERIALIZED_NAME_BACKUP_PLAN_ID = "BackupPlanId";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_ID)
  private String backupPlanId;

  public static final String SERIALIZED_NAME_VERSION_ID = "VersionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public ResourceDetailsAwsBackupBackupPlan() {
  }

  public ResourceDetailsAwsBackupBackupPlan backupPlan(AwsBackupBackupPlanDetailsBackupPlan backupPlan) {
    this.backupPlan = backupPlan;
    return this;
  }

  /**
   * Get backupPlan
   * @return backupPlan
   */
  @javax.annotation.Nullable
  public AwsBackupBackupPlanDetailsBackupPlan getBackupPlan() {
    return backupPlan;
  }

  public void setBackupPlan(AwsBackupBackupPlanDetailsBackupPlan backupPlan) {
    this.backupPlan = backupPlan;
  }


  public ResourceDetailsAwsBackupBackupPlan backupPlanArn(String backupPlanArn) {
    this.backupPlanArn = backupPlanArn;
    return this;
  }

  /**
   * Get backupPlanArn
   * @return backupPlanArn
   */
  @javax.annotation.Nullable
  public String getBackupPlanArn() {
    return backupPlanArn;
  }

  public void setBackupPlanArn(String backupPlanArn) {
    this.backupPlanArn = backupPlanArn;
  }


  public ResourceDetailsAwsBackupBackupPlan backupPlanId(String backupPlanId) {
    this.backupPlanId = backupPlanId;
    return this;
  }

  /**
   * Get backupPlanId
   * @return backupPlanId
   */
  @javax.annotation.Nullable
  public String getBackupPlanId() {
    return backupPlanId;
  }

  public void setBackupPlanId(String backupPlanId) {
    this.backupPlanId = backupPlanId;
  }


  public ResourceDetailsAwsBackupBackupPlan versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId
   * @return versionId
   */
  @javax.annotation.Nullable
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsBackupBackupPlan resourceDetailsAwsBackupBackupPlan = (ResourceDetailsAwsBackupBackupPlan) o;
    return Objects.equals(this.backupPlan, resourceDetailsAwsBackupBackupPlan.backupPlan) &&
        Objects.equals(this.backupPlanArn, resourceDetailsAwsBackupBackupPlan.backupPlanArn) &&
        Objects.equals(this.backupPlanId, resourceDetailsAwsBackupBackupPlan.backupPlanId) &&
        Objects.equals(this.versionId, resourceDetailsAwsBackupBackupPlan.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPlan, backupPlanArn, backupPlanId, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsBackupBackupPlan {\n");
    sb.append("    backupPlan: ").append(toIndentedString(backupPlan)).append("\n");
    sb.append("    backupPlanArn: ").append(toIndentedString(backupPlanArn)).append("\n");
    sb.append("    backupPlanId: ").append(toIndentedString(backupPlanId)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
    openapiFields.add("BackupPlan");
    openapiFields.add("BackupPlanArn");
    openapiFields.add("BackupPlanId");
    openapiFields.add("VersionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsBackupBackupPlan
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsBackupBackupPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsBackupBackupPlan is not found in the empty JSON string", ResourceDetailsAwsBackupBackupPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsBackupBackupPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsBackupBackupPlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `BackupPlan`
      if (jsonObj.get("BackupPlan") != null && !jsonObj.get("BackupPlan").isJsonNull()) {
        AwsBackupBackupPlanDetailsBackupPlan.validateJsonElement(jsonObj.get("BackupPlan"));
      }
      // validate the optional field `BackupPlanArn`
      if (jsonObj.get("BackupPlanArn") != null && !jsonObj.get("BackupPlanArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BackupPlanArn"));
      }
      // validate the optional field `BackupPlanId`
      if (jsonObj.get("BackupPlanId") != null && !jsonObj.get("BackupPlanId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BackupPlanId"));
      }
      // validate the optional field `VersionId`
      if (jsonObj.get("VersionId") != null && !jsonObj.get("VersionId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VersionId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsBackupBackupPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsBackupBackupPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsBackupBackupPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsBackupBackupPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsBackupBackupPlan>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsBackupBackupPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsBackupBackupPlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsBackupBackupPlan given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsBackupBackupPlan
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsBackupBackupPlan
   */
  public static ResourceDetailsAwsBackupBackupPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsBackupBackupPlan.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsBackupBackupPlan to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

