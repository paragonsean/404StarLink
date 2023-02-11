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
import org.openapitools.client.model.RelationalDatabaseEngine;

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
 * Describes a database image, or blueprint. A blueprint describes the major engine version of a database.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RelationalDatabaseBlueprint {
  public static final String SERIALIZED_NAME_BLUEPRINT_ID = "blueprintId";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_ID)
  private String blueprintId;

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private RelationalDatabaseEngine engine;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "engineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_ENGINE_DESCRIPTION = "engineDescription";
  @SerializedName(SERIALIZED_NAME_ENGINE_DESCRIPTION)
  private String engineDescription;

  public static final String SERIALIZED_NAME_ENGINE_VERSION_DESCRIPTION = "engineVersionDescription";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION_DESCRIPTION)
  private String engineVersionDescription;

  public static final String SERIALIZED_NAME_IS_ENGINE_DEFAULT = "isEngineDefault";
  @SerializedName(SERIALIZED_NAME_IS_ENGINE_DEFAULT)
  private Boolean isEngineDefault;

  public RelationalDatabaseBlueprint() {
  }

  public RelationalDatabaseBlueprint blueprintId(String blueprintId) {
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


  public RelationalDatabaseBlueprint engine(RelationalDatabaseEngine engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @javax.annotation.Nullable
  public RelationalDatabaseEngine getEngine() {
    return engine;
  }

  public void setEngine(RelationalDatabaseEngine engine) {
    this.engine = engine;
  }


  public RelationalDatabaseBlueprint engineVersion(String engineVersion) {
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


  public RelationalDatabaseBlueprint engineDescription(String engineDescription) {
    this.engineDescription = engineDescription;
    return this;
  }

  /**
   * Get engineDescription
   * @return engineDescription
   */
  @javax.annotation.Nullable
  public String getEngineDescription() {
    return engineDescription;
  }

  public void setEngineDescription(String engineDescription) {
    this.engineDescription = engineDescription;
  }


  public RelationalDatabaseBlueprint engineVersionDescription(String engineVersionDescription) {
    this.engineVersionDescription = engineVersionDescription;
    return this;
  }

  /**
   * Get engineVersionDescription
   * @return engineVersionDescription
   */
  @javax.annotation.Nullable
  public String getEngineVersionDescription() {
    return engineVersionDescription;
  }

  public void setEngineVersionDescription(String engineVersionDescription) {
    this.engineVersionDescription = engineVersionDescription;
  }


  public RelationalDatabaseBlueprint isEngineDefault(Boolean isEngineDefault) {
    this.isEngineDefault = isEngineDefault;
    return this;
  }

  /**
   * Get isEngineDefault
   * @return isEngineDefault
   */
  @javax.annotation.Nullable
  public Boolean getIsEngineDefault() {
    return isEngineDefault;
  }

  public void setIsEngineDefault(Boolean isEngineDefault) {
    this.isEngineDefault = isEngineDefault;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalDatabaseBlueprint relationalDatabaseBlueprint = (RelationalDatabaseBlueprint) o;
    return Objects.equals(this.blueprintId, relationalDatabaseBlueprint.blueprintId) &&
        Objects.equals(this.engine, relationalDatabaseBlueprint.engine) &&
        Objects.equals(this.engineVersion, relationalDatabaseBlueprint.engineVersion) &&
        Objects.equals(this.engineDescription, relationalDatabaseBlueprint.engineDescription) &&
        Objects.equals(this.engineVersionDescription, relationalDatabaseBlueprint.engineVersionDescription) &&
        Objects.equals(this.isEngineDefault, relationalDatabaseBlueprint.isEngineDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprintId, engine, engineVersion, engineDescription, engineVersionDescription, isEngineDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalDatabaseBlueprint {\n");
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    engineDescription: ").append(toIndentedString(engineDescription)).append("\n");
    sb.append("    engineVersionDescription: ").append(toIndentedString(engineVersionDescription)).append("\n");
    sb.append("    isEngineDefault: ").append(toIndentedString(isEngineDefault)).append("\n");
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
    openapiFields.add("engine");
    openapiFields.add("engineVersion");
    openapiFields.add("engineDescription");
    openapiFields.add("engineVersionDescription");
    openapiFields.add("isEngineDefault");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelationalDatabaseBlueprint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelationalDatabaseBlueprint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationalDatabaseBlueprint is not found in the empty JSON string", RelationalDatabaseBlueprint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelationalDatabaseBlueprint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelationalDatabaseBlueprint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `blueprintId`
      if (jsonObj.get("blueprintId") != null && !jsonObj.get("blueprintId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("blueprintId"));
      }
      // validate the optional field `engine`
      if (jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull()) {
        RelationalDatabaseEngine.validateJsonElement(jsonObj.get("engine"));
      }
      // validate the optional field `engineVersion`
      if (jsonObj.get("engineVersion") != null && !jsonObj.get("engineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("engineVersion"));
      }
      // validate the optional field `engineDescription`
      if (jsonObj.get("engineDescription") != null && !jsonObj.get("engineDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("engineDescription"));
      }
      // validate the optional field `engineVersionDescription`
      if (jsonObj.get("engineVersionDescription") != null && !jsonObj.get("engineVersionDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("engineVersionDescription"));
      }
      // validate the optional field `isEngineDefault`
      if (jsonObj.get("isEngineDefault") != null && !jsonObj.get("isEngineDefault").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isEngineDefault"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelationalDatabaseBlueprint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationalDatabaseBlueprint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationalDatabaseBlueprint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationalDatabaseBlueprint.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationalDatabaseBlueprint>() {
           @Override
           public void write(JsonWriter out, RelationalDatabaseBlueprint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelationalDatabaseBlueprint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelationalDatabaseBlueprint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelationalDatabaseBlueprint
   * @throws IOException if the JSON string is invalid with respect to RelationalDatabaseBlueprint
   */
  public static RelationalDatabaseBlueprint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationalDatabaseBlueprint.class);
  }

  /**
   * Convert an instance of RelationalDatabaseBlueprint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

