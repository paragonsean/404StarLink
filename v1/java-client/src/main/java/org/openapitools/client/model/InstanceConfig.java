/*
 * Notebooks API
 * Notebooks API is used to manage notebook resources in Google Cloud.
 *
 * The version of the OpenAPI document: v1
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
 * Notebook instance configurations that can be updated.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:12.602654-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class InstanceConfig {
  public static final String SERIALIZED_NAME_ENABLE_HEALTH_MONITORING = "enableHealthMonitoring";
  @SerializedName(SERIALIZED_NAME_ENABLE_HEALTH_MONITORING)
  private Boolean enableHealthMonitoring;

  public static final String SERIALIZED_NAME_NOTEBOOK_UPGRADE_SCHEDULE = "notebookUpgradeSchedule";
  @SerializedName(SERIALIZED_NAME_NOTEBOOK_UPGRADE_SCHEDULE)
  private String notebookUpgradeSchedule;

  public InstanceConfig() {
  }

  public InstanceConfig enableHealthMonitoring(Boolean enableHealthMonitoring) {
    this.enableHealthMonitoring = enableHealthMonitoring;
    return this;
  }

  /**
   * Verifies core internal services are running.
   * @return enableHealthMonitoring
   */
  @javax.annotation.Nullable
  public Boolean getEnableHealthMonitoring() {
    return enableHealthMonitoring;
  }

  public void setEnableHealthMonitoring(Boolean enableHealthMonitoring) {
    this.enableHealthMonitoring = enableHealthMonitoring;
  }


  public InstanceConfig notebookUpgradeSchedule(String notebookUpgradeSchedule) {
    this.notebookUpgradeSchedule = notebookUpgradeSchedule;
    return this;
  }

  /**
   * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
   * @return notebookUpgradeSchedule
   */
  @javax.annotation.Nullable
  public String getNotebookUpgradeSchedule() {
    return notebookUpgradeSchedule;
  }

  public void setNotebookUpgradeSchedule(String notebookUpgradeSchedule) {
    this.notebookUpgradeSchedule = notebookUpgradeSchedule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfig instanceConfig = (InstanceConfig) o;
    return Objects.equals(this.enableHealthMonitoring, instanceConfig.enableHealthMonitoring) &&
        Objects.equals(this.notebookUpgradeSchedule, instanceConfig.notebookUpgradeSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHealthMonitoring, notebookUpgradeSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfig {\n");
    sb.append("    enableHealthMonitoring: ").append(toIndentedString(enableHealthMonitoring)).append("\n");
    sb.append("    notebookUpgradeSchedule: ").append(toIndentedString(notebookUpgradeSchedule)).append("\n");
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
    openapiFields.add("enableHealthMonitoring");
    openapiFields.add("notebookUpgradeSchedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InstanceConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstanceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstanceConfig is not found in the empty JSON string", InstanceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InstanceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstanceConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("notebookUpgradeSchedule") != null && !jsonObj.get("notebookUpgradeSchedule").isJsonNull()) && !jsonObj.get("notebookUpgradeSchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notebookUpgradeSchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notebookUpgradeSchedule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstanceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstanceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstanceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstanceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<InstanceConfig>() {
           @Override
           public void write(JsonWriter out, InstanceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstanceConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InstanceConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InstanceConfig
   * @throws IOException if the JSON string is invalid with respect to InstanceConfig
   */
  public static InstanceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstanceConfig.class);
  }

  /**
   * Convert an instance of InstanceConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

