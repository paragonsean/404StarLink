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
import org.openapitools.client.model.AwsBackupBackupVaultDetailsNotifications;

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
 * ResourceDetailsAwsBackupBackupVault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsBackupBackupVault {
  public static final String SERIALIZED_NAME_BACKUP_VAULT_ARN = "BackupVaultArn";
  @SerializedName(SERIALIZED_NAME_BACKUP_VAULT_ARN)
  private String backupVaultArn;

  public static final String SERIALIZED_NAME_BACKUP_VAULT_NAME = "BackupVaultName";
  @SerializedName(SERIALIZED_NAME_BACKUP_VAULT_NAME)
  private String backupVaultName;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY_ARN = "EncryptionKeyArn";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY_ARN)
  private String encryptionKeyArn;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "Notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private AwsBackupBackupVaultDetailsNotifications notifications;

  public static final String SERIALIZED_NAME_ACCESS_POLICY = "AccessPolicy";
  @SerializedName(SERIALIZED_NAME_ACCESS_POLICY)
  private String accessPolicy;

  public ResourceDetailsAwsBackupBackupVault() {
  }

  public ResourceDetailsAwsBackupBackupVault backupVaultArn(String backupVaultArn) {
    this.backupVaultArn = backupVaultArn;
    return this;
  }

  /**
   * Get backupVaultArn
   * @return backupVaultArn
   */
  @javax.annotation.Nullable
  public String getBackupVaultArn() {
    return backupVaultArn;
  }

  public void setBackupVaultArn(String backupVaultArn) {
    this.backupVaultArn = backupVaultArn;
  }


  public ResourceDetailsAwsBackupBackupVault backupVaultName(String backupVaultName) {
    this.backupVaultName = backupVaultName;
    return this;
  }

  /**
   * Get backupVaultName
   * @return backupVaultName
   */
  @javax.annotation.Nullable
  public String getBackupVaultName() {
    return backupVaultName;
  }

  public void setBackupVaultName(String backupVaultName) {
    this.backupVaultName = backupVaultName;
  }


  public ResourceDetailsAwsBackupBackupVault encryptionKeyArn(String encryptionKeyArn) {
    this.encryptionKeyArn = encryptionKeyArn;
    return this;
  }

  /**
   * Get encryptionKeyArn
   * @return encryptionKeyArn
   */
  @javax.annotation.Nullable
  public String getEncryptionKeyArn() {
    return encryptionKeyArn;
  }

  public void setEncryptionKeyArn(String encryptionKeyArn) {
    this.encryptionKeyArn = encryptionKeyArn;
  }


  public ResourceDetailsAwsBackupBackupVault notifications(AwsBackupBackupVaultDetailsNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   * @return notifications
   */
  @javax.annotation.Nullable
  public AwsBackupBackupVaultDetailsNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(AwsBackupBackupVaultDetailsNotifications notifications) {
    this.notifications = notifications;
  }


  public ResourceDetailsAwsBackupBackupVault accessPolicy(String accessPolicy) {
    this.accessPolicy = accessPolicy;
    return this;
  }

  /**
   * Get accessPolicy
   * @return accessPolicy
   */
  @javax.annotation.Nullable
  public String getAccessPolicy() {
    return accessPolicy;
  }

  public void setAccessPolicy(String accessPolicy) {
    this.accessPolicy = accessPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsBackupBackupVault resourceDetailsAwsBackupBackupVault = (ResourceDetailsAwsBackupBackupVault) o;
    return Objects.equals(this.backupVaultArn, resourceDetailsAwsBackupBackupVault.backupVaultArn) &&
        Objects.equals(this.backupVaultName, resourceDetailsAwsBackupBackupVault.backupVaultName) &&
        Objects.equals(this.encryptionKeyArn, resourceDetailsAwsBackupBackupVault.encryptionKeyArn) &&
        Objects.equals(this.notifications, resourceDetailsAwsBackupBackupVault.notifications) &&
        Objects.equals(this.accessPolicy, resourceDetailsAwsBackupBackupVault.accessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupVaultArn, backupVaultName, encryptionKeyArn, notifications, accessPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsBackupBackupVault {\n");
    sb.append("    backupVaultArn: ").append(toIndentedString(backupVaultArn)).append("\n");
    sb.append("    backupVaultName: ").append(toIndentedString(backupVaultName)).append("\n");
    sb.append("    encryptionKeyArn: ").append(toIndentedString(encryptionKeyArn)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
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
    openapiFields.add("BackupVaultArn");
    openapiFields.add("BackupVaultName");
    openapiFields.add("EncryptionKeyArn");
    openapiFields.add("Notifications");
    openapiFields.add("AccessPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsBackupBackupVault
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsBackupBackupVault.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsBackupBackupVault is not found in the empty JSON string", ResourceDetailsAwsBackupBackupVault.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsBackupBackupVault.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsBackupBackupVault` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `BackupVaultArn`
      if (jsonObj.get("BackupVaultArn") != null && !jsonObj.get("BackupVaultArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BackupVaultArn"));
      }
      // validate the optional field `BackupVaultName`
      if (jsonObj.get("BackupVaultName") != null && !jsonObj.get("BackupVaultName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BackupVaultName"));
      }
      // validate the optional field `EncryptionKeyArn`
      if (jsonObj.get("EncryptionKeyArn") != null && !jsonObj.get("EncryptionKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EncryptionKeyArn"));
      }
      // validate the optional field `Notifications`
      if (jsonObj.get("Notifications") != null && !jsonObj.get("Notifications").isJsonNull()) {
        AwsBackupBackupVaultDetailsNotifications.validateJsonElement(jsonObj.get("Notifications"));
      }
      // validate the optional field `AccessPolicy`
      if (jsonObj.get("AccessPolicy") != null && !jsonObj.get("AccessPolicy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessPolicy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsBackupBackupVault.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsBackupBackupVault' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsBackupBackupVault> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsBackupBackupVault.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsBackupBackupVault>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsBackupBackupVault value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsBackupBackupVault read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsBackupBackupVault given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsBackupBackupVault
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsBackupBackupVault
   */
  public static ResourceDetailsAwsBackupBackupVault fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsBackupBackupVault.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsBackupBackupVault to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

