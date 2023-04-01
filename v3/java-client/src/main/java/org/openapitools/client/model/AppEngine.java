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
import java.util.Arrays;

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
 * App Engine service. Learn more at https://cloud.google.com/appengine.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AppEngine {
  public static final String SERIALIZED_NAME_MODULE_ID = "moduleId";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId;

  public AppEngine() {
  }

  public AppEngine moduleId(String moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  /**
   * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource (https://cloud.google.com/monitoring/api/resources#tag_gae_app).
   * @return moduleId
   */
  @javax.annotation.Nullable
  public String getModuleId() {
    return moduleId;
  }

  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEngine appEngine = (AppEngine) o;
    return Objects.equals(this.moduleId, appEngine.moduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEngine {\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
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
    openapiFields.add("moduleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppEngine
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppEngine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppEngine is not found in the empty JSON string", AppEngine.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppEngine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppEngine` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("moduleId") != null && !jsonObj.get("moduleId").isJsonNull()) && !jsonObj.get("moduleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moduleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moduleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppEngine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppEngine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppEngine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppEngine.class));

       return (TypeAdapter<T>) new TypeAdapter<AppEngine>() {
           @Override
           public void write(JsonWriter out, AppEngine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppEngine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppEngine given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppEngine
   * @throws IOException if the JSON string is invalid with respect to AppEngine
   */
  public static AppEngine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppEngine.class);
  }

  /**
   * Convert an instance of AppEngine to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

