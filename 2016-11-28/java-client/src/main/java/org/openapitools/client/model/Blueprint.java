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
import java.util.Arrays;
import org.openapitools.client.model.AppCategory;
import org.openapitools.client.model.BlueprintType;
import org.openapitools.client.model.InstancePlatform;

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
 * Describes a blueprint (a virtual private server image).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Blueprint {
  public static final String SERIALIZED_NAME_BLUEPRINT_ID = "blueprintId";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_ID)
  private String blueprintId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BlueprintType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_MIN_POWER = "minPower";
  @SerializedName(SERIALIZED_NAME_MIN_POWER)
  private Integer minPower;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSION_CODE = "versionCode";
  @SerializedName(SERIALIZED_NAME_VERSION_CODE)
  private String versionCode;

  public static final String SERIALIZED_NAME_PRODUCT_URL = "productUrl";
  @SerializedName(SERIALIZED_NAME_PRODUCT_URL)
  private String productUrl;

  public static final String SERIALIZED_NAME_LICENSE_URL = "licenseUrl";
  @SerializedName(SERIALIZED_NAME_LICENSE_URL)
  private String licenseUrl;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private InstancePlatform platform;

  public static final String SERIALIZED_NAME_APP_CATEGORY = "appCategory";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY)
  private AppCategory appCategory;

  public Blueprint() {
  }

  public Blueprint blueprintId(String blueprintId) {
    this.blueprintId = blueprintId;
    return this;
  }

  /**
   * Get blueprintId
   * @return blueprintId
   */
  @javax.annotation.Nullable
  public String getBlueprintId() {
    return blueprintId;
  }

  public void setBlueprintId(String blueprintId) {
    this.blueprintId = blueprintId;
  }


  public Blueprint name(String name) {
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


  public Blueprint group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public Blueprint type(BlueprintType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public BlueprintType getType() {
    return type;
  }

  public void setType(BlueprintType type) {
    this.type = type;
  }


  public Blueprint description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Blueprint isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public Blueprint minPower(Integer minPower) {
    this.minPower = minPower;
    return this;
  }

  /**
   * Get minPower
   * @return minPower
   */
  @javax.annotation.Nullable
  public Integer getMinPower() {
    return minPower;
  }

  public void setMinPower(Integer minPower) {
    this.minPower = minPower;
  }


  public Blueprint version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Blueprint versionCode(String versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * Get versionCode
   * @return versionCode
   */
  @javax.annotation.Nullable
  public String getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(String versionCode) {
    this.versionCode = versionCode;
  }


  public Blueprint productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * Get productUrl
   * @return productUrl
   */
  @javax.annotation.Nullable
  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }


  public Blueprint licenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
    return this;
  }

  /**
   * Get licenseUrl
   * @return licenseUrl
   */
  @javax.annotation.Nullable
  public String getLicenseUrl() {
    return licenseUrl;
  }

  public void setLicenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
  }


  public Blueprint platform(InstancePlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @javax.annotation.Nullable
  public InstancePlatform getPlatform() {
    return platform;
  }

  public void setPlatform(InstancePlatform platform) {
    this.platform = platform;
  }


  public Blueprint appCategory(AppCategory appCategory) {
    this.appCategory = appCategory;
    return this;
  }

  /**
   * Get appCategory
   * @return appCategory
   */
  @javax.annotation.Nullable
  public AppCategory getAppCategory() {
    return appCategory;
  }

  public void setAppCategory(AppCategory appCategory) {
    this.appCategory = appCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blueprint blueprint = (Blueprint) o;
    return Objects.equals(this.blueprintId, blueprint.blueprintId) &&
        Objects.equals(this.name, blueprint.name) &&
        Objects.equals(this.group, blueprint.group) &&
        Objects.equals(this.type, blueprint.type) &&
        Objects.equals(this.description, blueprint.description) &&
        Objects.equals(this.isActive, blueprint.isActive) &&
        Objects.equals(this.minPower, blueprint.minPower) &&
        Objects.equals(this.version, blueprint.version) &&
        Objects.equals(this.versionCode, blueprint.versionCode) &&
        Objects.equals(this.productUrl, blueprint.productUrl) &&
        Objects.equals(this.licenseUrl, blueprint.licenseUrl) &&
        Objects.equals(this.platform, blueprint.platform) &&
        Objects.equals(this.appCategory, blueprint.appCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprintId, name, group, type, description, isActive, minPower, version, versionCode, productUrl, licenseUrl, platform, appCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Blueprint {\n");
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    minPower: ").append(toIndentedString(minPower)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    licenseUrl: ").append(toIndentedString(licenseUrl)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    appCategory: ").append(toIndentedString(appCategory)).append("\n");
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
    openapiFields.add("blueprintId");
    openapiFields.add("name");
    openapiFields.add("group");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("isActive");
    openapiFields.add("minPower");
    openapiFields.add("version");
    openapiFields.add("versionCode");
    openapiFields.add("productUrl");
    openapiFields.add("licenseUrl");
    openapiFields.add("platform");
    openapiFields.add("appCategory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Blueprint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Blueprint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Blueprint is not found in the empty JSON string", Blueprint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Blueprint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Blueprint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `blueprintId`
      if (jsonObj.get("blueprintId") != null && !jsonObj.get("blueprintId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("blueprintId"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `group`
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("group"));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        BlueprintType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("description"));
      }
      // validate the optional field `isActive`
      if (jsonObj.get("isActive") != null && !jsonObj.get("isActive").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isActive"));
      }
      // validate the optional field `minPower`
      if (jsonObj.get("minPower") != null && !jsonObj.get("minPower").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("minPower"));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("version"));
      }
      // validate the optional field `versionCode`
      if (jsonObj.get("versionCode") != null && !jsonObj.get("versionCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("versionCode"));
      }
      // validate the optional field `productUrl`
      if (jsonObj.get("productUrl") != null && !jsonObj.get("productUrl").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("productUrl"));
      }
      // validate the optional field `licenseUrl`
      if (jsonObj.get("licenseUrl") != null && !jsonObj.get("licenseUrl").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("licenseUrl"));
      }
      // validate the optional field `platform`
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) {
        InstancePlatform.validateJsonElement(jsonObj.get("platform"));
      }
      // validate the optional field `appCategory`
      if (jsonObj.get("appCategory") != null && !jsonObj.get("appCategory").isJsonNull()) {
        AppCategory.validateJsonElement(jsonObj.get("appCategory"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Blueprint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Blueprint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Blueprint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Blueprint.class));

       return (TypeAdapter<T>) new TypeAdapter<Blueprint>() {
           @Override
           public void write(JsonWriter out, Blueprint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Blueprint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Blueprint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Blueprint
   * @throws IOException if the JSON string is invalid with respect to Blueprint
   */
  public static Blueprint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Blueprint.class);
  }

  /**
   * Convert an instance of Blueprint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

