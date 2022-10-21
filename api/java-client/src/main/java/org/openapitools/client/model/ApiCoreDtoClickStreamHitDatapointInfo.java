/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
import java.util.List;
import org.openapitools.client.model.ApiCoreDtoTagsTag;

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
 * ApiCoreDtoClickStreamHitDatapointInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:52.389256-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoClickStreamHitDatapointInfo {
  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_DATAPOINT_FAVOURITE = "datapointFavourite";
  @SerializedName(SERIALIZED_NAME_DATAPOINT_FAVOURITE)
  private Boolean datapointFavourite;

  public static final String SERIALIZED_NAME_DATAPOINT_ID = "datapointId";
  @SerializedName(SERIALIZED_NAME_DATAPOINT_ID)
  private Long datapointId;

  public static final String SERIALIZED_NAME_DATAPOINT_NAME = "datapointName";
  @SerializedName(SERIALIZED_NAME_DATAPOINT_NAME)
  private String datapointName;

  public static final String SERIALIZED_NAME_DATAPOINT_TITLE = "datapointTitle";
  @SerializedName(SERIALIZED_NAME_DATAPOINT_TITLE)
  private String datapointTitle;

  public static final String SERIALIZED_NAME_DATAPOINT_TYPE = "datapointType";
  @SerializedName(SERIALIZED_NAME_DATAPOINT_TYPE)
  private String datapointType;

  public static final String SERIALIZED_NAME_DESTINATION_URL = "destinationUrl";
  @SerializedName(SERIALIZED_NAME_DESTINATION_URL)
  private String destinationUrl;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_IS_A_B_TEST = "isABTest";
  @SerializedName(SERIALIZED_NAME_IS_A_B_TEST)
  private Boolean isABTest;

  public static final String SERIALIZED_NAME_IS_PRIVATE_SHARED = "isPrivateShared";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE_SHARED)
  private Boolean isPrivateShared;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "isPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("Active"),
    
    PAUSED("Paused"),
    
    ABUSE("Abuse"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ApiCoreDtoTagsTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRACKING_CODE = "trackingCode";
  @SerializedName(SERIALIZED_NAME_TRACKING_CODE)
  private String trackingCode;

  public ApiCoreDtoClickStreamHitDatapointInfo() {
  }

  public ApiCoreDtoClickStreamHitDatapointInfo creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return creationDate
   */
  @javax.annotation.Nullable
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo datapointFavourite(Boolean datapointFavourite) {
    this.datapointFavourite = datapointFavourite;
    return this;
  }

  /**
   * Get datapointFavourite
   * @return datapointFavourite
   */
  @javax.annotation.Nullable
  public Boolean getDatapointFavourite() {
    return datapointFavourite;
  }

  public void setDatapointFavourite(Boolean datapointFavourite) {
    this.datapointFavourite = datapointFavourite;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo datapointId(Long datapointId) {
    this.datapointId = datapointId;
    return this;
  }

  /**
   * Get datapointId
   * @return datapointId
   */
  @javax.annotation.Nullable
  public Long getDatapointId() {
    return datapointId;
  }

  public void setDatapointId(Long datapointId) {
    this.datapointId = datapointId;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo datapointName(String datapointName) {
    this.datapointName = datapointName;
    return this;
  }

  /**
   * Get datapointName
   * @return datapointName
   */
  @javax.annotation.Nullable
  public String getDatapointName() {
    return datapointName;
  }

  public void setDatapointName(String datapointName) {
    this.datapointName = datapointName;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo datapointTitle(String datapointTitle) {
    this.datapointTitle = datapointTitle;
    return this;
  }

  /**
   * Get datapointTitle
   * @return datapointTitle
   */
  @javax.annotation.Nullable
  public String getDatapointTitle() {
    return datapointTitle;
  }

  public void setDatapointTitle(String datapointTitle) {
    this.datapointTitle = datapointTitle;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo datapointType(String datapointType) {
    this.datapointType = datapointType;
    return this;
  }

  /**
   * Get datapointType
   * @return datapointType
   */
  @javax.annotation.Nullable
  public String getDatapointType() {
    return datapointType;
  }

  public void setDatapointType(String datapointType) {
    this.datapointType = datapointType;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  /**
   * Get destinationUrl
   * @return destinationUrl
   */
  @javax.annotation.Nullable
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  @javax.annotation.Nullable
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo groupName(String groupName) {
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


  public ApiCoreDtoClickStreamHitDatapointInfo isABTest(Boolean isABTest) {
    this.isABTest = isABTest;
    return this;
  }

  /**
   * Get isABTest
   * @return isABTest
   */
  @javax.annotation.Nullable
  public Boolean getIsABTest() {
    return isABTest;
  }

  public void setIsABTest(Boolean isABTest) {
    this.isABTest = isABTest;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo isPrivateShared(Boolean isPrivateShared) {
    this.isPrivateShared = isPrivateShared;
    return this;
  }

  /**
   * Get isPrivateShared
   * @return isPrivateShared
   */
  @javax.annotation.Nullable
  public Boolean getIsPrivateShared() {
    return isPrivateShared;
  }

  public void setIsPrivateShared(Boolean isPrivateShared) {
    this.isPrivateShared = isPrivateShared;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Get isPublic
   * @return isPublic
   */
  @javax.annotation.Nullable
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo tags(List<ApiCoreDtoTagsTag> tags) {
    this.tags = tags;
    return this;
  }

  public ApiCoreDtoClickStreamHitDatapointInfo addTagsItem(ApiCoreDtoTagsTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List<ApiCoreDtoTagsTag> getTags() {
    return tags;
  }

  public void setTags(List<ApiCoreDtoTagsTag> tags) {
    this.tags = tags;
  }


  public ApiCoreDtoClickStreamHitDatapointInfo trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

  /**
   * Get trackingCode
   * @return trackingCode
   */
  @javax.annotation.Nullable
  public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoClickStreamHitDatapointInfo apiCoreDtoClickStreamHitDatapointInfo = (ApiCoreDtoClickStreamHitDatapointInfo) o;
    return Objects.equals(this.creationDate, apiCoreDtoClickStreamHitDatapointInfo.creationDate) &&
        Objects.equals(this.datapointFavourite, apiCoreDtoClickStreamHitDatapointInfo.datapointFavourite) &&
        Objects.equals(this.datapointId, apiCoreDtoClickStreamHitDatapointInfo.datapointId) &&
        Objects.equals(this.datapointName, apiCoreDtoClickStreamHitDatapointInfo.datapointName) &&
        Objects.equals(this.datapointTitle, apiCoreDtoClickStreamHitDatapointInfo.datapointTitle) &&
        Objects.equals(this.datapointType, apiCoreDtoClickStreamHitDatapointInfo.datapointType) &&
        Objects.equals(this.destinationUrl, apiCoreDtoClickStreamHitDatapointInfo.destinationUrl) &&
        Objects.equals(this.groupId, apiCoreDtoClickStreamHitDatapointInfo.groupId) &&
        Objects.equals(this.groupName, apiCoreDtoClickStreamHitDatapointInfo.groupName) &&
        Objects.equals(this.isABTest, apiCoreDtoClickStreamHitDatapointInfo.isABTest) &&
        Objects.equals(this.isPrivateShared, apiCoreDtoClickStreamHitDatapointInfo.isPrivateShared) &&
        Objects.equals(this.isPublic, apiCoreDtoClickStreamHitDatapointInfo.isPublic) &&
        Objects.equals(this.notes, apiCoreDtoClickStreamHitDatapointInfo.notes) &&
        Objects.equals(this.status, apiCoreDtoClickStreamHitDatapointInfo.status) &&
        Objects.equals(this.tags, apiCoreDtoClickStreamHitDatapointInfo.tags) &&
        Objects.equals(this.trackingCode, apiCoreDtoClickStreamHitDatapointInfo.trackingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, datapointFavourite, datapointId, datapointName, datapointTitle, datapointType, destinationUrl, groupId, groupName, isABTest, isPrivateShared, isPublic, notes, status, tags, trackingCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoClickStreamHitDatapointInfo {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    datapointFavourite: ").append(toIndentedString(datapointFavourite)).append("\n");
    sb.append("    datapointId: ").append(toIndentedString(datapointId)).append("\n");
    sb.append("    datapointName: ").append(toIndentedString(datapointName)).append("\n");
    sb.append("    datapointTitle: ").append(toIndentedString(datapointTitle)).append("\n");
    sb.append("    datapointType: ").append(toIndentedString(datapointType)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    isABTest: ").append(toIndentedString(isABTest)).append("\n");
    sb.append("    isPrivateShared: ").append(toIndentedString(isPrivateShared)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
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
    openapiFields.add("creationDate");
    openapiFields.add("datapointFavourite");
    openapiFields.add("datapointId");
    openapiFields.add("datapointName");
    openapiFields.add("datapointTitle");
    openapiFields.add("datapointType");
    openapiFields.add("destinationUrl");
    openapiFields.add("groupId");
    openapiFields.add("groupName");
    openapiFields.add("isABTest");
    openapiFields.add("isPrivateShared");
    openapiFields.add("isPublic");
    openapiFields.add("notes");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("trackingCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoClickStreamHitDatapointInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoClickStreamHitDatapointInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoClickStreamHitDatapointInfo is not found in the empty JSON string", ApiCoreDtoClickStreamHitDatapointInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoClickStreamHitDatapointInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoClickStreamHitDatapointInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("creationDate") != null && !jsonObj.get("creationDate").isJsonNull()) && !jsonObj.get("creationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creationDate").toString()));
      }
      if ((jsonObj.get("datapointName") != null && !jsonObj.get("datapointName").isJsonNull()) && !jsonObj.get("datapointName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datapointName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datapointName").toString()));
      }
      if ((jsonObj.get("datapointTitle") != null && !jsonObj.get("datapointTitle").isJsonNull()) && !jsonObj.get("datapointTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datapointTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datapointTitle").toString()));
      }
      if ((jsonObj.get("datapointType") != null && !jsonObj.get("datapointType").isJsonNull()) && !jsonObj.get("datapointType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datapointType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datapointType").toString()));
      }
      if ((jsonObj.get("destinationUrl") != null && !jsonObj.get("destinationUrl").isJsonNull()) && !jsonObj.get("destinationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationUrl").toString()));
      }
      if ((jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonNull()) && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            ApiCoreDtoTagsTag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      if ((jsonObj.get("trackingCode") != null && !jsonObj.get("trackingCode").isJsonNull()) && !jsonObj.get("trackingCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoClickStreamHitDatapointInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoClickStreamHitDatapointInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoClickStreamHitDatapointInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoClickStreamHitDatapointInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoClickStreamHitDatapointInfo>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoClickStreamHitDatapointInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoClickStreamHitDatapointInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoClickStreamHitDatapointInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoClickStreamHitDatapointInfo
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoClickStreamHitDatapointInfo
   */
  public static ApiCoreDtoClickStreamHitDatapointInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoClickStreamHitDatapointInfo.class);
  }

  /**
   * Convert an instance of ApiCoreDtoClickStreamHitDatapointInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

