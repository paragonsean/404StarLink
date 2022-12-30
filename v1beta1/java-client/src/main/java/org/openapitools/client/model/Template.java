/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
 *
 * The version of the OpenAPI document: v1beta1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Action;
import org.openapitools.client.model.HealthCheck;
import org.openapitools.client.model.VmParams;

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
 * The template used for creating replicas in the pool.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:39.942530-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Template {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Action action;

  public static final String SERIALIZED_NAME_HEALTH_CHECKS = "healthChecks";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECKS)
  private List<HealthCheck> healthChecks = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VM_PARAMS = "vmParams";
  @SerializedName(SERIALIZED_NAME_VM_PARAMS)
  private VmParams vmParams;

  public Template() {
  }

  public Template action(Action action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }


  public Template healthChecks(List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  public Template addHealthChecksItem(HealthCheck healthChecksItem) {
    if (this.healthChecks == null) {
      this.healthChecks = new ArrayList<>();
    }
    this.healthChecks.add(healthChecksItem);
    return this;
  }

  /**
   * A list of HTTP Health Checks to configure for this replica pool and all virtual machines in this replica pool.
   * @return healthChecks
   */
  @javax.annotation.Nullable
  public List<HealthCheck> getHealthChecks() {
    return healthChecks;
  }

  public void setHealthChecks(List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
  }


  public Template version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A free-form string describing the version of this template. You can provide any versioning string you would like. For example, version1 or template-v1.
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Template vmParams(VmParams vmParams) {
    this.vmParams = vmParams;
    return this;
  }

  /**
   * Get vmParams
   * @return vmParams
   */
  @javax.annotation.Nullable
  public VmParams getVmParams() {
    return vmParams;
  }

  public void setVmParams(VmParams vmParams) {
    this.vmParams = vmParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.action, template.action) &&
        Objects.equals(this.healthChecks, template.healthChecks) &&
        Objects.equals(this.version, template.version) &&
        Objects.equals(this.vmParams, template.vmParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, healthChecks, version, vmParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vmParams: ").append(toIndentedString(vmParams)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("healthChecks");
    openapiFields.add("version");
    openapiFields.add("vmParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Template
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Template.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Template is not found in the empty JSON string", Template.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Template.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Template` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        Action.validateJsonElement(jsonObj.get("action"));
      }
      if (jsonObj.get("healthChecks") != null && !jsonObj.get("healthChecks").isJsonNull()) {
        JsonArray jsonArrayhealthChecks = jsonObj.getAsJsonArray("healthChecks");
        if (jsonArrayhealthChecks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("healthChecks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `healthChecks` to be an array in the JSON string but got `%s`", jsonObj.get("healthChecks").toString()));
          }

          // validate the optional field `healthChecks` (array)
          for (int i = 0; i < jsonArrayhealthChecks.size(); i++) {
            HealthCheck.validateJsonElement(jsonArrayhealthChecks.get(i));
          };
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `vmParams`
      if (jsonObj.get("vmParams") != null && !jsonObj.get("vmParams").isJsonNull()) {
        VmParams.validateJsonElement(jsonObj.get("vmParams"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Template.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Template' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Template> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Template.class));

       return (TypeAdapter<T>) new TypeAdapter<Template>() {
           @Override
           public void write(JsonWriter out, Template value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Template read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Template given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Template
   * @throws IOException if the JSON string is invalid with respect to Template
   */
  public static Template fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Template.class);
  }

  /**
   * Convert an instance of Template to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

