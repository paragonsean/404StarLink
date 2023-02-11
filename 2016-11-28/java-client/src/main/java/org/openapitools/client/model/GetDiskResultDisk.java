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
import org.openapitools.client.model.AutoMountStatus;
import org.openapitools.client.model.DiskLocation;
import org.openapitools.client.model.DiskState;
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
 * GetDiskResultDisk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetDiskResultDisk {
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
  private DiskLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_ADD_ONS = "addOns";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private List addOns;

  public static final String SERIALIZED_NAME_SIZE_IN_GB = "sizeInGb";
  @SerializedName(SERIALIZED_NAME_SIZE_IN_GB)
  private Integer sizeInGb;

  public static final String SERIALIZED_NAME_IS_SYSTEM_DISK = "isSystemDisk";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_DISK)
  private Boolean isSystemDisk;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Integer iops;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private DiskState state;

  public static final String SERIALIZED_NAME_ATTACHED_TO = "attachedTo";
  @SerializedName(SERIALIZED_NAME_ATTACHED_TO)
  private String attachedTo;

  public static final String SERIALIZED_NAME_IS_ATTACHED = "isAttached";
  @SerializedName(SERIALIZED_NAME_IS_ATTACHED)
  private Boolean isAttached;

  public static final String SERIALIZED_NAME_ATTACHMENT_STATE = "attachmentState";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_STATE)
  private String attachmentState;

  public static final String SERIALIZED_NAME_GB_IN_USE = "gbInUse";
  @SerializedName(SERIALIZED_NAME_GB_IN_USE)
  private Integer gbInUse;

  public static final String SERIALIZED_NAME_AUTO_MOUNT_STATUS = "autoMountStatus";
  @SerializedName(SERIALIZED_NAME_AUTO_MOUNT_STATUS)
  private AutoMountStatus autoMountStatus;

  public GetDiskResultDisk() {
  }

  public GetDiskResultDisk name(String name) {
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


  public GetDiskResultDisk arn(String arn) {
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


  public GetDiskResultDisk supportCode(String supportCode) {
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


  public GetDiskResultDisk createdAt(OffsetDateTime createdAt) {
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


  public GetDiskResultDisk location(DiskLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public DiskLocation getLocation() {
    return location;
  }

  public void setLocation(DiskLocation location) {
    this.location = location;
  }


  public GetDiskResultDisk resourceType(ResourceType resourceType) {
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


  public GetDiskResultDisk tags(List tags) {
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


  public GetDiskResultDisk addOns(List addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * Get addOns
   * @return addOns
   */
  @javax.annotation.Nullable
  public List getAddOns() {
    return addOns;
  }

  public void setAddOns(List addOns) {
    this.addOns = addOns;
  }


  public GetDiskResultDisk sizeInGb(Integer sizeInGb) {
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


  public GetDiskResultDisk isSystemDisk(Boolean isSystemDisk) {
    this.isSystemDisk = isSystemDisk;
    return this;
  }

  /**
   * Get isSystemDisk
   * @return isSystemDisk
   */
  @javax.annotation.Nullable
  public Boolean getIsSystemDisk() {
    return isSystemDisk;
  }

  public void setIsSystemDisk(Boolean isSystemDisk) {
    this.isSystemDisk = isSystemDisk;
  }


  public GetDiskResultDisk iops(Integer iops) {
    this.iops = iops;
    return this;
  }

  /**
   * Get iops
   * @return iops
   */
  @javax.annotation.Nullable
  public Integer getIops() {
    return iops;
  }

  public void setIops(Integer iops) {
    this.iops = iops;
  }


  public GetDiskResultDisk path(String path) {
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


  public GetDiskResultDisk state(DiskState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public DiskState getState() {
    return state;
  }

  public void setState(DiskState state) {
    this.state = state;
  }


  public GetDiskResultDisk attachedTo(String attachedTo) {
    this.attachedTo = attachedTo;
    return this;
  }

  /**
   * Get attachedTo
   * @return attachedTo
   */
  @javax.annotation.Nullable
  public String getAttachedTo() {
    return attachedTo;
  }

  public void setAttachedTo(String attachedTo) {
    this.attachedTo = attachedTo;
  }


  public GetDiskResultDisk isAttached(Boolean isAttached) {
    this.isAttached = isAttached;
    return this;
  }

  /**
   * Get isAttached
   * @return isAttached
   */
  @javax.annotation.Nullable
  public Boolean getIsAttached() {
    return isAttached;
  }

  public void setIsAttached(Boolean isAttached) {
    this.isAttached = isAttached;
  }


  public GetDiskResultDisk attachmentState(String attachmentState) {
    this.attachmentState = attachmentState;
    return this;
  }

  /**
   * Get attachmentState
   * @return attachmentState
   */
  @javax.annotation.Nullable
  public String getAttachmentState() {
    return attachmentState;
  }

  public void setAttachmentState(String attachmentState) {
    this.attachmentState = attachmentState;
  }


  public GetDiskResultDisk gbInUse(Integer gbInUse) {
    this.gbInUse = gbInUse;
    return this;
  }

  /**
   * Get gbInUse
   * @return gbInUse
   */
  @javax.annotation.Nullable
  public Integer getGbInUse() {
    return gbInUse;
  }

  public void setGbInUse(Integer gbInUse) {
    this.gbInUse = gbInUse;
  }


  public GetDiskResultDisk autoMountStatus(AutoMountStatus autoMountStatus) {
    this.autoMountStatus = autoMountStatus;
    return this;
  }

  /**
   * Get autoMountStatus
   * @return autoMountStatus
   */
  @javax.annotation.Nullable
  public AutoMountStatus getAutoMountStatus() {
    return autoMountStatus;
  }

  public void setAutoMountStatus(AutoMountStatus autoMountStatus) {
    this.autoMountStatus = autoMountStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDiskResultDisk getDiskResultDisk = (GetDiskResultDisk) o;
    return Objects.equals(this.name, getDiskResultDisk.name) &&
        Objects.equals(this.arn, getDiskResultDisk.arn) &&
        Objects.equals(this.supportCode, getDiskResultDisk.supportCode) &&
        Objects.equals(this.createdAt, getDiskResultDisk.createdAt) &&
        Objects.equals(this.location, getDiskResultDisk.location) &&
        Objects.equals(this.resourceType, getDiskResultDisk.resourceType) &&
        Objects.equals(this.tags, getDiskResultDisk.tags) &&
        Objects.equals(this.addOns, getDiskResultDisk.addOns) &&
        Objects.equals(this.sizeInGb, getDiskResultDisk.sizeInGb) &&
        Objects.equals(this.isSystemDisk, getDiskResultDisk.isSystemDisk) &&
        Objects.equals(this.iops, getDiskResultDisk.iops) &&
        Objects.equals(this.path, getDiskResultDisk.path) &&
        Objects.equals(this.state, getDiskResultDisk.state) &&
        Objects.equals(this.attachedTo, getDiskResultDisk.attachedTo) &&
        Objects.equals(this.isAttached, getDiskResultDisk.isAttached) &&
        Objects.equals(this.attachmentState, getDiskResultDisk.attachmentState) &&
        Objects.equals(this.gbInUse, getDiskResultDisk.gbInUse) &&
        Objects.equals(this.autoMountStatus, getDiskResultDisk.autoMountStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, supportCode, createdAt, location, resourceType, tags, addOns, sizeInGb, isSystemDisk, iops, path, state, attachedTo, isAttached, attachmentState, gbInUse, autoMountStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDiskResultDisk {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    sizeInGb: ").append(toIndentedString(sizeInGb)).append("\n");
    sb.append("    isSystemDisk: ").append(toIndentedString(isSystemDisk)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    attachedTo: ").append(toIndentedString(attachedTo)).append("\n");
    sb.append("    isAttached: ").append(toIndentedString(isAttached)).append("\n");
    sb.append("    attachmentState: ").append(toIndentedString(attachmentState)).append("\n");
    sb.append("    gbInUse: ").append(toIndentedString(gbInUse)).append("\n");
    sb.append("    autoMountStatus: ").append(toIndentedString(autoMountStatus)).append("\n");
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
    openapiFields.add("addOns");
    openapiFields.add("sizeInGb");
    openapiFields.add("isSystemDisk");
    openapiFields.add("iops");
    openapiFields.add("path");
    openapiFields.add("state");
    openapiFields.add("attachedTo");
    openapiFields.add("isAttached");
    openapiFields.add("attachmentState");
    openapiFields.add("gbInUse");
    openapiFields.add("autoMountStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDiskResultDisk
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDiskResultDisk.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDiskResultDisk is not found in the empty JSON string", GetDiskResultDisk.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDiskResultDisk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDiskResultDisk` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        DiskLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `addOns`
      if (jsonObj.get("addOns") != null && !jsonObj.get("addOns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("addOns"));
      }
      // validate the optional field `sizeInGb`
      if (jsonObj.get("sizeInGb") != null && !jsonObj.get("sizeInGb").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("sizeInGb"));
      }
      // validate the optional field `isSystemDisk`
      if (jsonObj.get("isSystemDisk") != null && !jsonObj.get("isSystemDisk").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isSystemDisk"));
      }
      // validate the optional field `iops`
      if (jsonObj.get("iops") != null && !jsonObj.get("iops").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("iops"));
      }
      // validate the optional field `path`
      if (jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("path"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        DiskState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `attachedTo`
      if (jsonObj.get("attachedTo") != null && !jsonObj.get("attachedTo").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("attachedTo"));
      }
      // validate the optional field `isAttached`
      if (jsonObj.get("isAttached") != null && !jsonObj.get("isAttached").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isAttached"));
      }
      // validate the optional field `attachmentState`
      if (jsonObj.get("attachmentState") != null && !jsonObj.get("attachmentState").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("attachmentState"));
      }
      // validate the optional field `gbInUse`
      if (jsonObj.get("gbInUse") != null && !jsonObj.get("gbInUse").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("gbInUse"));
      }
      // validate the optional field `autoMountStatus`
      if (jsonObj.get("autoMountStatus") != null && !jsonObj.get("autoMountStatus").isJsonNull()) {
        AutoMountStatus.validateJsonElement(jsonObj.get("autoMountStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDiskResultDisk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDiskResultDisk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDiskResultDisk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDiskResultDisk.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDiskResultDisk>() {
           @Override
           public void write(JsonWriter out, GetDiskResultDisk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDiskResultDisk read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDiskResultDisk given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDiskResultDisk
   * @throws IOException if the JSON string is invalid with respect to GetDiskResultDisk
   */
  public static GetDiskResultDisk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDiskResultDisk.class);
  }

  /**
   * Convert an instance of GetDiskResultDisk to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

