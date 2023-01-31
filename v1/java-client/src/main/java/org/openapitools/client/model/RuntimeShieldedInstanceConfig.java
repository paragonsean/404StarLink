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
 * A set of Shielded Instance options. Check [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm). Not all combinations are valid.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:12.602654-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RuntimeShieldedInstanceConfig {
  public static final String SERIALIZED_NAME_ENABLE_INTEGRITY_MONITORING = "enableIntegrityMonitoring";
  @SerializedName(SERIALIZED_NAME_ENABLE_INTEGRITY_MONITORING)
  private Boolean enableIntegrityMonitoring;

  public static final String SERIALIZED_NAME_ENABLE_SECURE_BOOT = "enableSecureBoot";
  @SerializedName(SERIALIZED_NAME_ENABLE_SECURE_BOOT)
  private Boolean enableSecureBoot;

  public static final String SERIALIZED_NAME_ENABLE_VTPM = "enableVtpm";
  @SerializedName(SERIALIZED_NAME_ENABLE_VTPM)
  private Boolean enableVtpm;

  public RuntimeShieldedInstanceConfig() {
  }

  public RuntimeShieldedInstanceConfig enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
    this.enableIntegrityMonitoring = enableIntegrityMonitoring;
    return this;
  }

  /**
   * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created. Enabled by default.
   * @return enableIntegrityMonitoring
   */
  @javax.annotation.Nullable
  public Boolean getEnableIntegrityMonitoring() {
    return enableIntegrityMonitoring;
  }

  public void setEnableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
    this.enableIntegrityMonitoring = enableIntegrityMonitoring;
  }


  public RuntimeShieldedInstanceConfig enableSecureBoot(Boolean enableSecureBoot) {
    this.enableSecureBoot = enableSecureBoot;
    return this;
  }

  /**
   * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails. Disabled by default.
   * @return enableSecureBoot
   */
  @javax.annotation.Nullable
  public Boolean getEnableSecureBoot() {
    return enableSecureBoot;
  }

  public void setEnableSecureBoot(Boolean enableSecureBoot) {
    this.enableSecureBoot = enableSecureBoot;
  }


  public RuntimeShieldedInstanceConfig enableVtpm(Boolean enableVtpm) {
    this.enableVtpm = enableVtpm;
    return this;
  }

  /**
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * @return enableVtpm
   */
  @javax.annotation.Nullable
  public Boolean getEnableVtpm() {
    return enableVtpm;
  }

  public void setEnableVtpm(Boolean enableVtpm) {
    this.enableVtpm = enableVtpm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeShieldedInstanceConfig runtimeShieldedInstanceConfig = (RuntimeShieldedInstanceConfig) o;
    return Objects.equals(this.enableIntegrityMonitoring, runtimeShieldedInstanceConfig.enableIntegrityMonitoring) &&
        Objects.equals(this.enableSecureBoot, runtimeShieldedInstanceConfig.enableSecureBoot) &&
        Objects.equals(this.enableVtpm, runtimeShieldedInstanceConfig.enableVtpm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeShieldedInstanceConfig {\n");
    sb.append("    enableIntegrityMonitoring: ").append(toIndentedString(enableIntegrityMonitoring)).append("\n");
    sb.append("    enableSecureBoot: ").append(toIndentedString(enableSecureBoot)).append("\n");
    sb.append("    enableVtpm: ").append(toIndentedString(enableVtpm)).append("\n");
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
    openapiFields.add("enableIntegrityMonitoring");
    openapiFields.add("enableSecureBoot");
    openapiFields.add("enableVtpm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RuntimeShieldedInstanceConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuntimeShieldedInstanceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuntimeShieldedInstanceConfig is not found in the empty JSON string", RuntimeShieldedInstanceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuntimeShieldedInstanceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuntimeShieldedInstanceConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuntimeShieldedInstanceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuntimeShieldedInstanceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuntimeShieldedInstanceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuntimeShieldedInstanceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<RuntimeShieldedInstanceConfig>() {
           @Override
           public void write(JsonWriter out, RuntimeShieldedInstanceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuntimeShieldedInstanceConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RuntimeShieldedInstanceConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RuntimeShieldedInstanceConfig
   * @throws IOException if the JSON string is invalid with respect to RuntimeShieldedInstanceConfig
   */
  public static RuntimeShieldedInstanceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuntimeShieldedInstanceConfig.class);
  }

  /**
   * Convert an instance of RuntimeShieldedInstanceConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

