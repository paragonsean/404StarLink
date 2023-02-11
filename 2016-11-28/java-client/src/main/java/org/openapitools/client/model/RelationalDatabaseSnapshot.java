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
import org.openapitools.client.model.RelationalDatabaseSnapshotLocation;
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
 * Describes a database snapshot.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RelationalDatabaseSnapshot {
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
  private RelationalDatabaseSnapshotLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "engineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_SIZE_IN_GB = "sizeInGb";
  @SerializedName(SERIALIZED_NAME_SIZE_IN_GB)
  private Integer sizeInGb;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_NAME = "fromRelationalDatabaseName";
  @SerializedName(SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_NAME)
  private String fromRelationalDatabaseName;

  public static final String SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_ARN = "fromRelationalDatabaseArn";
  @SerializedName(SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_ARN)
  private String fromRelationalDatabaseArn;

  public static final String SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_BUNDLE_ID = "fromRelationalDatabaseBundleId";
  @SerializedName(SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_BUNDLE_ID)
  private String fromRelationalDatabaseBundleId;

  public static final String SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_BLUEPRINT_ID = "fromRelationalDatabaseBlueprintId";
  @SerializedName(SERIALIZED_NAME_FROM_RELATIONAL_DATABASE_BLUEPRINT_ID)
  private String fromRelationalDatabaseBlueprintId;

  public RelationalDatabaseSnapshot() {
  }

  public RelationalDatabaseSnapshot name(String name) {
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


  public RelationalDatabaseSnapshot arn(String arn) {
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


  public RelationalDatabaseSnapshot supportCode(String supportCode) {
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


  public RelationalDatabaseSnapshot createdAt(OffsetDateTime createdAt) {
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


  public RelationalDatabaseSnapshot location(RelationalDatabaseSnapshotLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public RelationalDatabaseSnapshotLocation getLocation() {
    return location;
  }

  public void setLocation(RelationalDatabaseSnapshotLocation location) {
    this.location = location;
  }


  public RelationalDatabaseSnapshot resourceType(ResourceType resourceType) {
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


  public RelationalDatabaseSnapshot tags(List tags) {
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


  public RelationalDatabaseSnapshot engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @javax.annotation.Nullable
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public RelationalDatabaseSnapshot engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

  /**
   * Get engineVersion
   * @return engineVersion
   */
  @javax.annotation.Nullable
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }


  public RelationalDatabaseSnapshot sizeInGb(Integer sizeInGb) {
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


  public RelationalDatabaseSnapshot state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public RelationalDatabaseSnapshot fromRelationalDatabaseName(String fromRelationalDatabaseName) {
    this.fromRelationalDatabaseName = fromRelationalDatabaseName;
    return this;
  }

  /**
   * Get fromRelationalDatabaseName
   * @return fromRelationalDatabaseName
   */
  @javax.annotation.Nullable
  public String getFromRelationalDatabaseName() {
    return fromRelationalDatabaseName;
  }

  public void setFromRelationalDatabaseName(String fromRelationalDatabaseName) {
    this.fromRelationalDatabaseName = fromRelationalDatabaseName;
  }


  public RelationalDatabaseSnapshot fromRelationalDatabaseArn(String fromRelationalDatabaseArn) {
    this.fromRelationalDatabaseArn = fromRelationalDatabaseArn;
    return this;
  }

  /**
   * Get fromRelationalDatabaseArn
   * @return fromRelationalDatabaseArn
   */
  @javax.annotation.Nullable
  public String getFromRelationalDatabaseArn() {
    return fromRelationalDatabaseArn;
  }

  public void setFromRelationalDatabaseArn(String fromRelationalDatabaseArn) {
    this.fromRelationalDatabaseArn = fromRelationalDatabaseArn;
  }


  public RelationalDatabaseSnapshot fromRelationalDatabaseBundleId(String fromRelationalDatabaseBundleId) {
    this.fromRelationalDatabaseBundleId = fromRelationalDatabaseBundleId;
    return this;
  }

  /**
   * Get fromRelationalDatabaseBundleId
   * @return fromRelationalDatabaseBundleId
   */
  @javax.annotation.Nullable
  public String getFromRelationalDatabaseBundleId() {
    return fromRelationalDatabaseBundleId;
  }

  public void setFromRelationalDatabaseBundleId(String fromRelationalDatabaseBundleId) {
    this.fromRelationalDatabaseBundleId = fromRelationalDatabaseBundleId;
  }


  public RelationalDatabaseSnapshot fromRelationalDatabaseBlueprintId(String fromRelationalDatabaseBlueprintId) {
    this.fromRelationalDatabaseBlueprintId = fromRelationalDatabaseBlueprintId;
    return this;
  }

  /**
   * Get fromRelationalDatabaseBlueprintId
   * @return fromRelationalDatabaseBlueprintId
   */
  @javax.annotation.Nullable
  public String getFromRelationalDatabaseBlueprintId() {
    return fromRelationalDatabaseBlueprintId;
  }

  public void setFromRelationalDatabaseBlueprintId(String fromRelationalDatabaseBlueprintId) {
    this.fromRelationalDatabaseBlueprintId = fromRelationalDatabaseBlueprintId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalDatabaseSnapshot relationalDatabaseSnapshot = (RelationalDatabaseSnapshot) o;
    return Objects.equals(this.name, relationalDatabaseSnapshot.name) &&
        Objects.equals(this.arn, relationalDatabaseSnapshot.arn) &&
        Objects.equals(this.supportCode, relationalDatabaseSnapshot.supportCode) &&
        Objects.equals(this.createdAt, relationalDatabaseSnapshot.createdAt) &&
        Objects.equals(this.location, relationalDatabaseSnapshot.location) &&
        Objects.equals(this.resourceType, relationalDatabaseSnapshot.resourceType) &&
        Objects.equals(this.tags, relationalDatabaseSnapshot.tags) &&
        Objects.equals(this.engine, relationalDatabaseSnapshot.engine) &&
        Objects.equals(this.engineVersion, relationalDatabaseSnapshot.engineVersion) &&
        Objects.equals(this.sizeInGb, relationalDatabaseSnapshot.sizeInGb) &&
        Objects.equals(this.state, relationalDatabaseSnapshot.state) &&
        Objects.equals(this.fromRelationalDatabaseName, relationalDatabaseSnapshot.fromRelationalDatabaseName) &&
        Objects.equals(this.fromRelationalDatabaseArn, relationalDatabaseSnapshot.fromRelationalDatabaseArn) &&
        Objects.equals(this.fromRelationalDatabaseBundleId, relationalDatabaseSnapshot.fromRelationalDatabaseBundleId) &&
        Objects.equals(this.fromRelationalDatabaseBlueprintId, relationalDatabaseSnapshot.fromRelationalDatabaseBlueprintId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, supportCode, createdAt, location, resourceType, tags, engine, engineVersion, sizeInGb, state, fromRelationalDatabaseName, fromRelationalDatabaseArn, fromRelationalDatabaseBundleId, fromRelationalDatabaseBlueprintId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalDatabaseSnapshot {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    sizeInGb: ").append(toIndentedString(sizeInGb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fromRelationalDatabaseName: ").append(toIndentedString(fromRelationalDatabaseName)).append("\n");
    sb.append("    fromRelationalDatabaseArn: ").append(toIndentedString(fromRelationalDatabaseArn)).append("\n");
    sb.append("    fromRelationalDatabaseBundleId: ").append(toIndentedString(fromRelationalDatabaseBundleId)).append("\n");
    sb.append("    fromRelationalDatabaseBlueprintId: ").append(toIndentedString(fromRelationalDatabaseBlueprintId)).append("\n");
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
    openapiFields.add("engine");
    openapiFields.add("engineVersion");
    openapiFields.add("sizeInGb");
    openapiFields.add("state");
    openapiFields.add("fromRelationalDatabaseName");
    openapiFields.add("fromRelationalDatabaseArn");
    openapiFields.add("fromRelationalDatabaseBundleId");
    openapiFields.add("fromRelationalDatabaseBlueprintId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelationalDatabaseSnapshot
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelationalDatabaseSnapshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationalDatabaseSnapshot is not found in the empty JSON string", RelationalDatabaseSnapshot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelationalDatabaseSnapshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelationalDatabaseSnapshot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        RelationalDatabaseSnapshotLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `engine`
      if (jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("engine"));
      }
      // validate the optional field `engineVersion`
      if (jsonObj.get("engineVersion") != null && !jsonObj.get("engineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("engineVersion"));
      }
      // validate the optional field `sizeInGb`
      if (jsonObj.get("sizeInGb") != null && !jsonObj.get("sizeInGb").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("sizeInGb"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `fromRelationalDatabaseName`
      if (jsonObj.get("fromRelationalDatabaseName") != null && !jsonObj.get("fromRelationalDatabaseName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromRelationalDatabaseName"));
      }
      // validate the optional field `fromRelationalDatabaseArn`
      if (jsonObj.get("fromRelationalDatabaseArn") != null && !jsonObj.get("fromRelationalDatabaseArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromRelationalDatabaseArn"));
      }
      // validate the optional field `fromRelationalDatabaseBundleId`
      if (jsonObj.get("fromRelationalDatabaseBundleId") != null && !jsonObj.get("fromRelationalDatabaseBundleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromRelationalDatabaseBundleId"));
      }
      // validate the optional field `fromRelationalDatabaseBlueprintId`
      if (jsonObj.get("fromRelationalDatabaseBlueprintId") != null && !jsonObj.get("fromRelationalDatabaseBlueprintId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("fromRelationalDatabaseBlueprintId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelationalDatabaseSnapshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationalDatabaseSnapshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationalDatabaseSnapshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationalDatabaseSnapshot.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationalDatabaseSnapshot>() {
           @Override
           public void write(JsonWriter out, RelationalDatabaseSnapshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelationalDatabaseSnapshot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelationalDatabaseSnapshot given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelationalDatabaseSnapshot
   * @throws IOException if the JSON string is invalid with respect to RelationalDatabaseSnapshot
   */
  public static RelationalDatabaseSnapshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationalDatabaseSnapshot.class);
  }

  /**
   * Convert an instance of RelationalDatabaseSnapshot to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

