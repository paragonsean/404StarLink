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
import org.openapitools.client.model.InstanceSnapshotLocation;
import org.openapitools.client.model.InstanceSnapshotState;
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
 * GetInstanceSnapshotResultInstanceSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetInstanceSnapshotResultInstanceSnapshot {
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
  private InstanceSnapshotLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private InstanceSnapshotState state;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_FROM_ATTACHED_DISKS = "fromAttachedDisks";
  @SerializedName(SERIALIZED_NAME_FROM_ATTACHED_DISKS)
  private List fromAttachedDisks;

  public static final String SERIALIZED_NAME_FROM_INSTANCE_NAME = "fromInstanceName";
  @SerializedName(SERIALIZED_NAME_FROM_INSTANCE_NAME)
  private String fromInstanceName;

  public static final String SERIALIZED_NAME_FROM_INSTANCE_ARN = "fromInstanceArn";
  @SerializedName(SERIALIZED_NAME_FROM_INSTANCE_ARN)
  private String fromInstanceArn;

  public static final String SERIALIZED_NAME_FROM_BLUEPRINT_ID = "fromBlueprintId";
  @SerializedName(SERIALIZED_NAME_FROM_BLUEPRINT_ID)
  private String fromBlueprintId;

  public static final String SERIALIZED_NAME_FROM_BUNDLE_ID = "fromBundleId";
  @SerializedName(SERIALIZED_NAME_FROM_BUNDLE_ID)
  private String fromBundleId;

  public static final String SERIALIZED_NAME_IS_FROM_AUTO_SNAPSHOT = "isFromAutoSnapshot";
  @SerializedName(SERIALIZED_NAME_IS_FROM_AUTO_SNAPSHOT)
  private Boolean isFromAutoSnapshot;

  public static final String SERIALIZED_NAME_SIZE_IN_GB = "sizeInGb";
  @SerializedName(SERIALIZED_NAME_SIZE_IN_GB)
  private Integer sizeInGb;

  public GetInstanceSnapshotResultInstanceSnapshot() {
  }

  public GetInstanceSnapshotResultInstanceSnapshot name(String name) {
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


  public GetInstanceSnapshotResultInstanceSnapshot arn(String arn) {
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


  public GetInstanceSnapshotResultInstanceSnapshot supportCode(String supportCode) {
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


  public GetInstanceSnapshotResultInstanceSnapshot createdAt(OffsetDateTime createdAt) {
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


  public GetInstanceSnapshotResultInstanceSnapshot location(InstanceSnapshotLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public InstanceSnapshotLocation getLocation() {
    return location;
  }

  public void setLocation(InstanceSnapshotLocation location) {
    this.location = location;
  }


  public GetInstanceSnapshotResultInstanceSnapshot resourceType(ResourceType resourceType) {
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


  public GetInstanceSnapshotResultInstanceSnapshot tags(List tags) {
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


  public GetInstanceSnapshotResultInstanceSnapshot state(InstanceSnapshotState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public InstanceSnapshotState getState() {
    return state;
  }

  public void setState(InstanceSnapshotState state) {
    this.state = state;
  }


  public GetInstanceSnapshotResultInstanceSnapshot progress(String progress) {
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


  public GetInstanceSnapshotResultInstanceSnapshot fromAttachedDisks(List fromAttachedDisks) {
    this.fromAttachedDisks = fromAttachedDisks;
    return this;
  }

  /**
   * Get fromAttachedDisks
   * @return fromAttachedDisks
   */
  @javax.annotation.Nullable
  public List getFromAttachedDisks() {
    return fromAttachedDisks;
  }

  public void setFromAttachedDisks(List fromAttachedDisks) {
    this.fromAttachedDisks = fromAttachedDisks;
  }


  public GetInstanceSnapshotResultInstanceSnapshot fromInstanceName(String fromInstanceName) {
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


  public GetInstanceSnapshotResultInstanceSnapshot fromInstanceArn(String fromInstanceArn) {
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


  public GetInstanceSnapshotResultInstanceSnapshot fromBlueprintId(String fromBlueprintId) {
    this.fromBlueprintId = fromBlueprintId;
    return this;
  }

  /**
   * Get fromBlueprintId
   * @return fromBlueprintId
   */
  @javax.annotation.Nullable
  public String getFromBlueprintId() {
    return fromBlueprintId;
  }

  public void setFromBlueprintId(String fromBlueprintId) {
    this.fromBlueprintId = fromBlueprintId;
  }


  public GetInstanceSnapshotResultInstanceSnapshot fromBundleId(String fromBundleId) {
    this.fromBundleId = fromBundleId;
    return this;
  }

  /**
   * Get fromBundleId
   * @return fromBundleId
   */
  @javax.annotation.Nullable
  public String getFromBundleId() {
    return fromBundleId;
  }

  public void setFromBundleId(String fromBundleId) {
    this.fromBundleId = fromBundleId;
  }


  public GetInstanceSnapshotResultInstanceSnapshot isFromAutoSnapshot(Boolean isFromAutoSnapshot) {
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


  public GetInstanceSnapshotResultInstanceSnapshot sizeInGb(Integer sizeInGb) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstanceSnapshotResultInstanceSnapshot getInstanceSnapshotResultInstanceSnapshot = (GetInstanceSnapshotResultInstanceSnapshot) o;
    return Objects.equals(this.name, getInstanceSnapshotResultInstanceSnapshot.name) &&
        Objects.equals(this.arn, getInstanceSnapshotResultInstanceSnapshot.arn) &&
        Objects.equals(this.supportCode, getInstanceSnapshotResultInstanceSnapshot.supportCode) &&
        Objects.equals(this.createdAt, getInstanceSnapshotResultInstanceSnapshot.createdAt) &&
        Objects.equals(this.location, getInstanceSnapshotResultInstanceSnapshot.location) &&
        Objects.equals(this.resourceType, getInstanceSnapshotResultInstanceSnapshot.resourceType) &&
        Objects.equals(this.tags, getInstanceSnapshotResultInstanceSnapshot.tags) &&
        Objects.equals(this.state, getInstanceSnapshotResultInstanceSnapshot.state) &&
        Objects.equals(this.progress, getInstanceSnapshotResultInstanceSnapshot.progress) &&
        Objects.equals(this.fromAttachedDisks, getInstanceSnapshotResultInstanceSnapshot.fromAttachedDisks) &&
        Objects.equals(this.fromInstanceName, getInstanceSnapshotResultInstanceSnapshot.fromInstanceName) &&
        Objects.equals(this.fromInstanceArn, getInstanceSnapshotResultInstanceSnapshot.fromInstanceArn) &&
        Objects.equals(this.fromBlueprintId, getInstanceSnapshotResultInstanceSnapshot.fromBlueprintId) &&
        Objects.equals(this.fromBundleId, getInstanceSnapshotResultInstanceSnapshot.fromBundleId) &&
        Objects.equals(this.isFromAutoSnapshot, getInstanceSnapshotResultInstanceSnapshot.isFromAutoSnapshot) &&
        Objects.equals(this.sizeInGb, getInstanceSnapshotResultInstanceSnapshot.sizeInGb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, supportCode, createdAt, location, resourceType, tags, state, progress, fromAttachedDisks, fromInstanceName, fromInstanceArn, fromBlueprintId, fromBundleId, isFromAutoSnapshot, sizeInGb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstanceSnapshotResultInstanceSnapshot {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    fromAttachedDisks: ").append(toIndentedString(fromAttachedDisks)).append("\n");
    sb.append("    fromInstanceName: ").append(toIndentedString(fromInstanceName)).append("\n");
    sb.append("    fromInstanceArn: ").append(toIndentedString(fromInstanceArn)).append("\n");
    sb.append("    fromBlueprintId: ").append(toIndentedString(fromBlueprintId)).append("\n");
    sb.append("    fromBundleId: ").append(toIndentedString(fromBundleId)).append("\n");
    sb.append("    isFromAutoSnapshot: ").append(toIndentedString(isFromAutoSnapshot)).append("\n");
    sb.append("    sizeInGb: ").append(toIndentedString(sizeInGb)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("progress");
    openapiFields.add("fromAttachedDisks");
    openapiFields.add("fromInstanceName");
    openapiFields.add("fromInstanceArn");
    openapiFields.add("fromBlueprintId");
    openapiFields.add("fromBundleId");
    openapiFields.add("isFromAutoSnapshot");
    openapiFields.add("sizeInGb");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetInstanceSnapshotResultInstanceSnapshot
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInstanceSnapshotResultInstanceSnapshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInstanceSnapshotResultInstanceSnapshot is not found in the empty JSON string", GetInstanceSnapshotResultInstanceSnapshot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetInstanceSnapshotResultInstanceSnapshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInstanceSnapshotResultInstanceSnapshot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        InstanceSnapshotLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        InstanceSnapshotState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("progress"));
      }
      // validate the optional field `fromAttachedDisks`
      if (jsonObj.get("fromAttachedDisks") != null && !jsonObj.get("fromAttachedDisks").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("fromAttachedDisks"));
      }
      // validate the optional field `fromInstanceName`
      if (jsonObj.get("fromInstanceName") != null && !jsonObj.get("fromInstanceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromInstanceName"));
      }
      // validate the optional field `fromInstanceArn`
      if (jsonObj.get("fromInstanceArn") != null && !jsonObj.get("fromInstanceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromInstanceArn"));
      }
      // validate the optional field `fromBlueprintId`
      if (jsonObj.get("fromBlueprintId") != null && !jsonObj.get("fromBlueprintId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromBlueprintId"));
      }
      // validate the optional field `fromBundleId`
      if (jsonObj.get("fromBundleId") != null && !jsonObj.get("fromBundleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromBundleId"));
      }
      // validate the optional field `isFromAutoSnapshot`
      if (jsonObj.get("isFromAutoSnapshot") != null && !jsonObj.get("isFromAutoSnapshot").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isFromAutoSnapshot"));
      }
      // validate the optional field `sizeInGb`
      if (jsonObj.get("sizeInGb") != null && !jsonObj.get("sizeInGb").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("sizeInGb"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInstanceSnapshotResultInstanceSnapshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInstanceSnapshotResultInstanceSnapshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInstanceSnapshotResultInstanceSnapshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInstanceSnapshotResultInstanceSnapshot.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInstanceSnapshotResultInstanceSnapshot>() {
           @Override
           public void write(JsonWriter out, GetInstanceSnapshotResultInstanceSnapshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInstanceSnapshotResultInstanceSnapshot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetInstanceSnapshotResultInstanceSnapshot given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetInstanceSnapshotResultInstanceSnapshot
   * @throws IOException if the JSON string is invalid with respect to GetInstanceSnapshotResultInstanceSnapshot
   */
  public static GetInstanceSnapshotResultInstanceSnapshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInstanceSnapshotResultInstanceSnapshot.class);
  }

  /**
   * Convert an instance of GetInstanceSnapshotResultInstanceSnapshot to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

