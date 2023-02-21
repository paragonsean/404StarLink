/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v3
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.MutationRecord;

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
 * A NotificationChannel is a medium through which an alert is delivered when a policy violation is detected. Examples of channels include email, SMS, and third-party messaging applications. Fields containing sensitive information like authentication tokens or contact info are only partially populated on retrieval.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:22.830819-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NotificationChannel {
  public static final String SERIALIZED_NAME_CREATION_RECORD = "creationRecord";
  @SerializedName(SERIALIZED_NAME_CREATION_RECORD)
  private MutationRecord creationRecord;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MUTATION_RECORDS = "mutationRecords";
  @SerializedName(SERIALIZED_NAME_MUTATION_RECORDS)
  private List<MutationRecord> mutationRecords = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER_LABELS = "userLabels";
  @SerializedName(SERIALIZED_NAME_USER_LABELS)
  private Map<String, String> userLabels = new HashMap<>();

  /**
   * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    VERIFICATION_STATUS_UNSPECIFIED("VERIFICATION_STATUS_UNSPECIFIED"),
    
    UNVERIFIED("UNVERIFIED"),
    
    VERIFIED("VERIFIED");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VerificationStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verificationStatus";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatusEnum verificationStatus;

  public NotificationChannel() {
  }

  public NotificationChannel creationRecord(MutationRecord creationRecord) {
    this.creationRecord = creationRecord;
    return this;
  }

  /**
   * Get creationRecord
   * @return creationRecord
   */
  @javax.annotation.Nullable
  public MutationRecord getCreationRecord() {
    return creationRecord;
  }

  public void setCreationRecord(MutationRecord creationRecord) {
    this.creationRecord = creationRecord;
  }


  public NotificationChannel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public NotificationChannel displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public NotificationChannel enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public NotificationChannel labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public NotificationChannel putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Configuration fields that define the channel and its behavior. The permissible and required labels are specified in the NotificationChannelDescriptor.labels of the NotificationChannelDescriptor corresponding to the type field.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public NotificationChannel mutationRecords(List<MutationRecord> mutationRecords) {
    this.mutationRecords = mutationRecords;
    return this;
  }

  public NotificationChannel addMutationRecordsItem(MutationRecord mutationRecordsItem) {
    if (this.mutationRecords == null) {
      this.mutationRecords = new ArrayList<>();
    }
    this.mutationRecords.add(mutationRecordsItem);
    return this;
  }

  /**
   * Records of the modification of this channel.
   * @return mutationRecords
   */
  @javax.annotation.Nullable
  public List<MutationRecord> getMutationRecords() {
    return mutationRecords;
  }

  public void setMutationRecords(List<MutationRecord> mutationRecords) {
    this.mutationRecords = mutationRecords;
  }


  public NotificationChannel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public NotificationChannel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public NotificationChannel userLabels(Map<String, String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  public NotificationChannel putUserLabelsItem(String key, String userLabelsItem) {
    if (this.userLabels == null) {
      this.userLabels = new HashMap<>();
    }
    this.userLabels.put(key, userLabelsItem);
    return this;
  }

  /**
   * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
   * @return userLabels
   */
  @javax.annotation.Nullable
  public Map<String, String> getUserLabels() {
    return userLabels;
  }

  public void setUserLabels(Map<String, String> userLabels) {
    this.userLabels = userLabels;
  }


  public NotificationChannel verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
   * @return verificationStatus
   */
  @javax.annotation.Nullable
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannel notificationChannel = (NotificationChannel) o;
    return Objects.equals(this.creationRecord, notificationChannel.creationRecord) &&
        Objects.equals(this.description, notificationChannel.description) &&
        Objects.equals(this.displayName, notificationChannel.displayName) &&
        Objects.equals(this.enabled, notificationChannel.enabled) &&
        Objects.equals(this.labels, notificationChannel.labels) &&
        Objects.equals(this.mutationRecords, notificationChannel.mutationRecords) &&
        Objects.equals(this.name, notificationChannel.name) &&
        Objects.equals(this.type, notificationChannel.type) &&
        Objects.equals(this.userLabels, notificationChannel.userLabels) &&
        Objects.equals(this.verificationStatus, notificationChannel.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationRecord, description, displayName, enabled, labels, mutationRecords, name, type, userLabels, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannel {\n");
    sb.append("    creationRecord: ").append(toIndentedString(creationRecord)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mutationRecords: ").append(toIndentedString(mutationRecords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userLabels: ").append(toIndentedString(userLabels)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
    openapiFields.add("creationRecord");
    openapiFields.add("description");
    openapiFields.add("displayName");
    openapiFields.add("enabled");
    openapiFields.add("labels");
    openapiFields.add("mutationRecords");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("userLabels");
    openapiFields.add("verificationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotificationChannel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationChannel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationChannel is not found in the empty JSON string", NotificationChannel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationChannel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationChannel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `creationRecord`
      if (jsonObj.get("creationRecord") != null && !jsonObj.get("creationRecord").isJsonNull()) {
        MutationRecord.validateJsonElement(jsonObj.get("creationRecord"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("mutationRecords") != null && !jsonObj.get("mutationRecords").isJsonNull()) {
        JsonArray jsonArraymutationRecords = jsonObj.getAsJsonArray("mutationRecords");
        if (jsonArraymutationRecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mutationRecords").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mutationRecords` to be an array in the JSON string but got `%s`", jsonObj.get("mutationRecords").toString()));
          }

          // validate the optional field `mutationRecords` (array)
          for (int i = 0; i < jsonArraymutationRecords.size(); i++) {
            MutationRecord.validateJsonElement(jsonArraymutationRecords.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("verificationStatus") != null && !jsonObj.get("verificationStatus").isJsonNull()) && !jsonObj.get("verificationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationStatus").toString()));
      }
      // validate the optional field `verificationStatus`
      if (jsonObj.get("verificationStatus") != null && !jsonObj.get("verificationStatus").isJsonNull()) {
        VerificationStatusEnum.validateJsonElement(jsonObj.get("verificationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationChannel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationChannel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationChannel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationChannel.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationChannel>() {
           @Override
           public void write(JsonWriter out, NotificationChannel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationChannel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotificationChannel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationChannel
   * @throws IOException if the JSON string is invalid with respect to NotificationChannel
   */
  public static NotificationChannel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationChannel.class);
  }

  /**
   * Convert an instance of NotificationChannel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

