/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.DiskSnapshotLocation;
import org.openapitools.client.model.DiskSnapshotState;
import org.openapitools.client.model.ResourceType;

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
 * GetDiskSnapshotResultDiskSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetDiskSnapshotResultDiskSnapshot {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_SUPPORT_CODE = "supportCode";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CODE)
  private String supportCode;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private DiskSnapshotLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_SIZE_IN_GB = "sizeInGb";
  @SerializedName(SERIALIZED_NAME_SIZE_IN_GB)
  private Integer sizeInGb;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private DiskSnapshotState state;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_FROM_DISK_NAME = "fromDiskName";
  @SerializedName(SERIALIZED_NAME_FROM_DISK_NAME)
  private String fromDiskName;

  public static final String SERIALIZED_NAME_FROM_DISK_ARN = "fromDiskArn";
  @SerializedName(SERIALIZED_NAME_FROM_DISK_ARN)
  private String fromDiskArn;

  public static final String SERIALIZED_NAME_FROM_INSTANCE_NAME = "fromInstanceName";
  @SerializedName(SERIALIZED_NAME_FROM_INSTANCE_NAME)
  private String fromInstanceName;

  public static final String SERIALIZED_NAME_FROM_INSTANCE_ARN = "fromInstanceArn";
  @SerializedName(SERIALIZED_NAME_FROM_INSTANCE_ARN)
  private String fromInstanceArn;

  public static final String SERIALIZED_NAME_IS_FROM_AUTO_SNAPSHOT = "isFromAutoSnapshot";
  @SerializedName(SERIALIZED_NAME_IS_FROM_AUTO_SNAPSHOT)
  private Boolean isFromAutoSnapshot;

  public GetDiskSnapshotResultDiskSnapshot() {
  }

  public GetDiskSnapshotResultDiskSnapshot name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetDiskSnapshotResultDiskSnapshot arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public GetDiskSnapshotResultDiskSnapshot supportCode(String supportCode) {
    this.supportCode = supportCode;
    return this;
  }

  /**
   * Get supportCode
   * @return supportCode
   */
  @javax.annotation.Nullable
  public String getSupportCode() {
    return supportCode;
  }

  public void setSupportCode(String supportCode) {
    this.supportCode = supportCode;
  }


  public GetDiskSnapshotResultDiskSnapshot createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetDiskSnapshotResultDiskSnapshot location(DiskSnapshotLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public DiskSnapshotLocation getLocation() {
    return location;
  }

  public void setLocation(DiskSnapshotLocation location) {
    this.location = location;
  }


  public GetDiskSnapshotResultDiskSnapshot resourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public ResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public GetDiskSnapshotResultDiskSnapshot tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public GetDiskSnapshotResultDiskSnapshot sizeInGb(Integer sizeInGb) {
    this.sizeInGb = sizeInGb;
    return this;
  }

  /**
   * Get sizeInGb
   * @return sizeInGb
   */
  @javax.annotation.Nullable
  public Integer getSizeInGb() {
    return sizeInGb;
  }

  public void setSizeInGb(Integer sizeInGb) {
    this.sizeInGb = sizeInGb;
  }


  public GetDiskSnapshotResultDiskSnapshot state(DiskSnapshotState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public DiskSnapshotState getState() {
    return state;
  }

  public void setState(DiskSnapshotState state) {
    this.state = state;
  }


  public GetDiskSnapshotResultDiskSnapshot progress(String progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  public GetDiskSnapshotResultDiskSnapshot fromDiskName(String fromDiskName) {
    this.fromDiskName = fromDiskName;
    return this;
  }

  /**
   * Get fromDiskName
   * @return fromDiskName
   */
  @javax.annotation.Nullable
  public String getFromDiskName() {
    return fromDiskName;
  }

  public void setFromDiskName(String fromDiskName) {
    this.fromDiskName = fromDiskName;
  }


  public GetDiskSnapshotResultDiskSnapshot fromDiskArn(String fromDiskArn) {
    this.fromDiskArn = fromDiskArn;
    return this;
  }

  /**
   * Get fromDiskArn
   * @return fromDiskArn
   */
  @javax.annotation.Nullable
  public String getFromDiskArn() {
    return fromDiskArn;
  }

  public void setFromDiskArn(String fromDiskArn) {
    this.fromDiskArn = fromDiskArn;
  }


  public GetDiskSnapshotResultDiskSnapshot fromInstanceName(String fromInstanceName) {
    this.fromInstanceName = fromInstanceName;
    return this;
  }

  /**
   * Get fromInstanceName
   * @return fromInstanceName
   */
  @javax.annotation.Nullable
  public String getFromInstanceName() {
    return fromInstanceName;
  }

  public void setFromInstanceName(String fromInstanceName) {
    this.fromInstanceName = fromInstanceName;
  }


  public GetDiskSnapshotResultDiskSnapshot fromInstanceArn(String fromInstanceArn) {
    this.fromInstanceArn = fromInstanceArn;
    return this;
  }

  /**
   * Get fromInstanceArn
   * @return fromInstanceArn
   */
  @javax.annotation.Nullable
  public String getFromInstanceArn() {
    return fromInstanceArn;
  }

  public void setFromInstanceArn(String fromInstanceArn) {
    this.fromInstanceArn = fromInstanceArn;
  }


  public GetDiskSnapshotResultDiskSnapshot isFromAutoSnapshot(Boolean isFromAutoSnapshot) {
    this.isFromAutoSnapshot = isFromAutoSnapshot;
    return this;
  }

  /**
   * Get isFromAutoSnapshot
   * @return isFromAutoSnapshot
   */
  @javax.annotation.Nullable
  public Boolean getIsFromAutoSnapshot() {
    return isFromAutoSnapshot;
  }

  public void setIsFromAutoSnapshot(Boolean isFromAutoSnapshot) {
    this.isFromAutoSnapshot = isFromAutoSnapshot;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDiskSnapshotResultDiskSnapshot getDiskSnapshotResultDiskSnapshot = (GetDiskSnapshotResultDiskSnapshot) o;
    return Objects.equals(this.name, getDiskSnapshotResultDiskSnapshot.name) &&
        Objects.equals(this.arn, getDiskSnapshotResultDiskSnapshot.arn) &&
        Objects.equals(this.supportCode, getDiskSnapshotResultDiskSnapshot.supportCode) &&
        Objects.equals(this.createdAt, getDiskSnapshotResultDiskSnapshot.createdAt) &&
        Objects.equals(this.location, getDiskSnapshotResultDiskSnapshot.location) &&
        Objects.equals(this.resourceType, getDiskSnapshotResultDiskSnapshot.resourceType) &&
        Objects.equals(this.tags, getDiskSnapshotResultDiskSnapshot.tags) &&
        Objects.equals(this.sizeInGb, getDiskSnapshotResultDiskSnapshot.sizeInGb) &&
        Objects.equals(this.state, getDiskSnapshotResultDiskSnapshot.state) &&
        Objects.equals(this.progress, getDiskSnapshotResultDiskSnapshot.progress) &&
        Objects.equals(this.fromDiskName, getDiskSnapshotResultDiskSnapshot.fromDiskName) &&
        Objects.equals(this.fromDiskArn, getDiskSnapshotResultDiskSnapshot.fromDiskArn) &&
        Objects.equals(this.fromInstanceName, getDiskSnapshotResultDiskSnapshot.fromInstanceName) &&
        Objects.equals(this.fromInstanceArn, getDiskSnapshotResultDiskSnapshot.fromInstanceArn) &&
        Objects.equals(this.isFromAutoSnapshot, getDiskSnapshotResultDiskSnapshot.isFromAutoSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, supportCode, createdAt, location, resourceType, tags, sizeInGb, state, progress, fromDiskName, fromDiskArn, fromInstanceName, fromInstanceArn, isFromAutoSnapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDiskSnapshotResultDiskSnapshot {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sizeInGb: ").append(toIndentedString(sizeInGb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    fromDiskName: ").append(toIndentedString(fromDiskName)).append("\n");
    sb.append("    fromDiskArn: ").append(toIndentedString(fromDiskArn)).append("\n");
    sb.append("    fromInstanceName: ").append(toIndentedString(fromInstanceName)).append("\n");
    sb.append("    fromInstanceArn: ").append(toIndentedString(fromInstanceArn)).append("\n");
    sb.append("    isFromAutoSnapshot: ").append(toIndentedString(isFromAutoSnapshot)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("arn");
    openapiFields.add("supportCode");
    openapiFields.add("createdAt");
    openapiFields.add("location");
    openapiFields.add("resourceType");
    openapiFields.add("tags");
    openapiFields.add("sizeInGb");
    openapiFields.add("state");
    openapiFields.add("progress");
    openapiFields.add("fromDiskName");
    openapiFields.add("fromDiskArn");
    openapiFields.add("fromInstanceName");
    openapiFields.add("fromInstanceArn");
    openapiFields.add("isFromAutoSnapshot");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDiskSnapshotResultDiskSnapshot
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDiskSnapshotResultDiskSnapshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDiskSnapshotResultDiskSnapshot is not found in the empty JSON string", GetDiskSnapshotResultDiskSnapshot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDiskSnapshotResultDiskSnapshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDiskSnapshotResultDiskSnapshot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `supportCode`
      if (jsonObj.get("supportCode") != null && !jsonObj.get("supportCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("supportCode"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        DiskSnapshotLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `sizeInGb`
      if (jsonObj.get("sizeInGb") != null && !jsonObj.get("sizeInGb").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("sizeInGb"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        DiskSnapshotState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("progress"));
      }
      // validate the optional field `fromDiskName`
      if (jsonObj.get("fromDiskName") != null && !jsonObj.get("fromDiskName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromDiskName"));
      }
      // validate the optional field `fromDiskArn`
      if (jsonObj.get("fromDiskArn") != null && !jsonObj.get("fromDiskArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromDiskArn"));
      }
      // validate the optional field `fromInstanceName`
      if (jsonObj.get("fromInstanceName") != null && !jsonObj.get("fromInstanceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromInstanceName"));
      }
      // validate the optional field `fromInstanceArn`
      if (jsonObj.get("fromInstanceArn") != null && !jsonObj.get("fromInstanceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromInstanceArn"));
      }
      // validate the optional field `isFromAutoSnapshot`
      if (jsonObj.get("isFromAutoSnapshot") != null && !jsonObj.get("isFromAutoSnapshot").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isFromAutoSnapshot"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDiskSnapshotResultDiskSnapshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDiskSnapshotResultDiskSnapshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDiskSnapshotResultDiskSnapshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDiskSnapshotResultDiskSnapshot.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDiskSnapshotResultDiskSnapshot>() {
           @Override
           public void write(JsonWriter out, GetDiskSnapshotResultDiskSnapshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDiskSnapshotResultDiskSnapshot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDiskSnapshotResultDiskSnapshot given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDiskSnapshotResultDiskSnapshot
   * @throws IOException if the JSON string is invalid with respect to GetDiskSnapshotResultDiskSnapshot
   */
  public static GetDiskSnapshotResultDiskSnapshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDiskSnapshotResultDiskSnapshot.class);
  }

  /**
   * Convert an instance of GetDiskSnapshotResultDiskSnapshot to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

