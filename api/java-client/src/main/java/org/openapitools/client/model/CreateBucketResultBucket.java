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
import org.openapitools.client.model.BucketAccessRules;
import org.openapitools.client.model.BucketLocation;
import org.openapitools.client.model.BucketState;
import org.openapitools.client.model.UpdateBucketRequestAccessLogConfig;

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
 * CreateBucketResultBucket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateBucketResultBucket {
  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_ACCESS_RULES = "accessRules";
  @SerializedName(SERIALIZED_NAME_ACCESS_RULES)
  private BucketAccessRules accessRules;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private BucketLocation location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPPORT_CODE = "supportCode";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CODE)
  private String supportCode;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_OBJECT_VERSIONING = "objectVersioning";
  @SerializedName(SERIALIZED_NAME_OBJECT_VERSIONING)
  private String objectVersioning;

  public static final String SERIALIZED_NAME_ABLE_TO_UPDATE_BUNDLE = "ableToUpdateBundle";
  @SerializedName(SERIALIZED_NAME_ABLE_TO_UPDATE_BUNDLE)
  private Boolean ableToUpdateBundle;

  public static final String SERIALIZED_NAME_READONLY_ACCESS_ACCOUNTS = "readonlyAccessAccounts";
  @SerializedName(SERIALIZED_NAME_READONLY_ACCESS_ACCOUNTS)
  private List readonlyAccessAccounts;

  public static final String SERIALIZED_NAME_RESOURCES_RECEIVING_ACCESS = "resourcesReceivingAccess";
  @SerializedName(SERIALIZED_NAME_RESOURCES_RECEIVING_ACCESS)
  private List resourcesReceivingAccess;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private BucketState state;

  public static final String SERIALIZED_NAME_ACCESS_LOG_CONFIG = "accessLogConfig";
  @SerializedName(SERIALIZED_NAME_ACCESS_LOG_CONFIG)
  private UpdateBucketRequestAccessLogConfig accessLogConfig;

  public CreateBucketResultBucket() {
  }

  public CreateBucketResultBucket resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public CreateBucketResultBucket accessRules(BucketAccessRules accessRules) {
    this.accessRules = accessRules;
    return this;
  }

  /**
   * Get accessRules
   * @return accessRules
   */
  @javax.annotation.Nullable
  public BucketAccessRules getAccessRules() {
    return accessRules;
  }

  public void setAccessRules(BucketAccessRules accessRules) {
    this.accessRules = accessRules;
  }


  public CreateBucketResultBucket arn(String arn) {
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


  public CreateBucketResultBucket bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
   */
  @javax.annotation.Nullable
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public CreateBucketResultBucket createdAt(OffsetDateTime createdAt) {
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


  public CreateBucketResultBucket url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public CreateBucketResultBucket location(BucketLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public BucketLocation getLocation() {
    return location;
  }

  public void setLocation(BucketLocation location) {
    this.location = location;
  }


  public CreateBucketResultBucket name(String name) {
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


  public CreateBucketResultBucket supportCode(String supportCode) {
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


  public CreateBucketResultBucket tags(List tags) {
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


  public CreateBucketResultBucket objectVersioning(String objectVersioning) {
    this.objectVersioning = objectVersioning;
    return this;
  }

  /**
   * Get objectVersioning
   * @return objectVersioning
   */
  @javax.annotation.Nullable
  public String getObjectVersioning() {
    return objectVersioning;
  }

  public void setObjectVersioning(String objectVersioning) {
    this.objectVersioning = objectVersioning;
  }


  public CreateBucketResultBucket ableToUpdateBundle(Boolean ableToUpdateBundle) {
    this.ableToUpdateBundle = ableToUpdateBundle;
    return this;
  }

  /**
   * Get ableToUpdateBundle
   * @return ableToUpdateBundle
   */
  @javax.annotation.Nullable
  public Boolean getAbleToUpdateBundle() {
    return ableToUpdateBundle;
  }

  public void setAbleToUpdateBundle(Boolean ableToUpdateBundle) {
    this.ableToUpdateBundle = ableToUpdateBundle;
  }


  public CreateBucketResultBucket readonlyAccessAccounts(List readonlyAccessAccounts) {
    this.readonlyAccessAccounts = readonlyAccessAccounts;
    return this;
  }

  /**
   * Get readonlyAccessAccounts
   * @return readonlyAccessAccounts
   */
  @javax.annotation.Nullable
  public List getReadonlyAccessAccounts() {
    return readonlyAccessAccounts;
  }

  public void setReadonlyAccessAccounts(List readonlyAccessAccounts) {
    this.readonlyAccessAccounts = readonlyAccessAccounts;
  }


  public CreateBucketResultBucket resourcesReceivingAccess(List resourcesReceivingAccess) {
    this.resourcesReceivingAccess = resourcesReceivingAccess;
    return this;
  }

  /**
   * Get resourcesReceivingAccess
   * @return resourcesReceivingAccess
   */
  @javax.annotation.Nullable
  public List getResourcesReceivingAccess() {
    return resourcesReceivingAccess;
  }

  public void setResourcesReceivingAccess(List resourcesReceivingAccess) {
    this.resourcesReceivingAccess = resourcesReceivingAccess;
  }


  public CreateBucketResultBucket state(BucketState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public BucketState getState() {
    return state;
  }

  public void setState(BucketState state) {
    this.state = state;
  }


  public CreateBucketResultBucket accessLogConfig(UpdateBucketRequestAccessLogConfig accessLogConfig) {
    this.accessLogConfig = accessLogConfig;
    return this;
  }

  /**
   * Get accessLogConfig
   * @return accessLogConfig
   */
  @javax.annotation.Nullable
  public UpdateBucketRequestAccessLogConfig getAccessLogConfig() {
    return accessLogConfig;
  }

  public void setAccessLogConfig(UpdateBucketRequestAccessLogConfig accessLogConfig) {
    this.accessLogConfig = accessLogConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBucketResultBucket createBucketResultBucket = (CreateBucketResultBucket) o;
    return Objects.equals(this.resourceType, createBucketResultBucket.resourceType) &&
        Objects.equals(this.accessRules, createBucketResultBucket.accessRules) &&
        Objects.equals(this.arn, createBucketResultBucket.arn) &&
        Objects.equals(this.bundleId, createBucketResultBucket.bundleId) &&
        Objects.equals(this.createdAt, createBucketResultBucket.createdAt) &&
        Objects.equals(this.url, createBucketResultBucket.url) &&
        Objects.equals(this.location, createBucketResultBucket.location) &&
        Objects.equals(this.name, createBucketResultBucket.name) &&
        Objects.equals(this.supportCode, createBucketResultBucket.supportCode) &&
        Objects.equals(this.tags, createBucketResultBucket.tags) &&
        Objects.equals(this.objectVersioning, createBucketResultBucket.objectVersioning) &&
        Objects.equals(this.ableToUpdateBundle, createBucketResultBucket.ableToUpdateBundle) &&
        Objects.equals(this.readonlyAccessAccounts, createBucketResultBucket.readonlyAccessAccounts) &&
        Objects.equals(this.resourcesReceivingAccess, createBucketResultBucket.resourcesReceivingAccess) &&
        Objects.equals(this.state, createBucketResultBucket.state) &&
        Objects.equals(this.accessLogConfig, createBucketResultBucket.accessLogConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, accessRules, arn, bundleId, createdAt, url, location, name, supportCode, tags, objectVersioning, ableToUpdateBundle, readonlyAccessAccounts, resourcesReceivingAccess, state, accessLogConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBucketResultBucket {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    accessRules: ").append(toIndentedString(accessRules)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    objectVersioning: ").append(toIndentedString(objectVersioning)).append("\n");
    sb.append("    ableToUpdateBundle: ").append(toIndentedString(ableToUpdateBundle)).append("\n");
    sb.append("    readonlyAccessAccounts: ").append(toIndentedString(readonlyAccessAccounts)).append("\n");
    sb.append("    resourcesReceivingAccess: ").append(toIndentedString(resourcesReceivingAccess)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    accessLogConfig: ").append(toIndentedString(accessLogConfig)).append("\n");
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
    openapiFields.add("resourceType");
    openapiFields.add("accessRules");
    openapiFields.add("arn");
    openapiFields.add("bundleId");
    openapiFields.add("createdAt");
    openapiFields.add("url");
    openapiFields.add("location");
    openapiFields.add("name");
    openapiFields.add("supportCode");
    openapiFields.add("tags");
    openapiFields.add("objectVersioning");
    openapiFields.add("ableToUpdateBundle");
    openapiFields.add("readonlyAccessAccounts");
    openapiFields.add("resourcesReceivingAccess");
    openapiFields.add("state");
    openapiFields.add("accessLogConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateBucketResultBucket
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBucketResultBucket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBucketResultBucket is not found in the empty JSON string", CreateBucketResultBucket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBucketResultBucket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBucketResultBucket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `accessRules`
      if (jsonObj.get("accessRules") != null && !jsonObj.get("accessRules").isJsonNull()) {
        BucketAccessRules.validateJsonElement(jsonObj.get("accessRules"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `bundleId`
      if (jsonObj.get("bundleId") != null && !jsonObj.get("bundleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("bundleId"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `url`
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("url"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        BucketLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `supportCode`
      if (jsonObj.get("supportCode") != null && !jsonObj.get("supportCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("supportCode"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `objectVersioning`
      if (jsonObj.get("objectVersioning") != null && !jsonObj.get("objectVersioning").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("objectVersioning"));
      }
      // validate the optional field `ableToUpdateBundle`
      if (jsonObj.get("ableToUpdateBundle") != null && !jsonObj.get("ableToUpdateBundle").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ableToUpdateBundle"));
      }
      // validate the optional field `readonlyAccessAccounts`
      if (jsonObj.get("readonlyAccessAccounts") != null && !jsonObj.get("readonlyAccessAccounts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("readonlyAccessAccounts"));
      }
      // validate the optional field `resourcesReceivingAccess`
      if (jsonObj.get("resourcesReceivingAccess") != null && !jsonObj.get("resourcesReceivingAccess").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("resourcesReceivingAccess"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        BucketState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `accessLogConfig`
      if (jsonObj.get("accessLogConfig") != null && !jsonObj.get("accessLogConfig").isJsonNull()) {
        UpdateBucketRequestAccessLogConfig.validateJsonElement(jsonObj.get("accessLogConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBucketResultBucket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBucketResultBucket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBucketResultBucket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBucketResultBucket.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBucketResultBucket>() {
           @Override
           public void write(JsonWriter out, CreateBucketResultBucket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBucketResultBucket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateBucketResultBucket given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateBucketResultBucket
   * @throws IOException if the JSON string is invalid with respect to CreateBucketResultBucket
   */
  public static CreateBucketResultBucket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBucketResultBucket.class);
  }

  /**
   * Convert an instance of CreateBucketResultBucket to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

