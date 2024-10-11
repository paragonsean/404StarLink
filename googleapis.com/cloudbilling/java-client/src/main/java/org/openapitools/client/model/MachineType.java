/*
 * Cloud Billing API
 * Allows developers to manage billing for their Google Cloud Platform projects programmatically.
 *
 * The version of the OpenAPI document: v1beta
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
import org.openapitools.client.model.CustomMachineType;
import org.openapitools.client.model.PredefinedMachineType;

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
 * Specification of machine series, memory, and number of vCPUs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:37.545354-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class MachineType {
  public static final String SERIALIZED_NAME_CUSTOM_MACHINE_TYPE = "customMachineType";
  @SerializedName(SERIALIZED_NAME_CUSTOM_MACHINE_TYPE)
  private CustomMachineType customMachineType;

  public static final String SERIALIZED_NAME_PREDEFINED_MACHINE_TYPE = "predefinedMachineType";
  @SerializedName(SERIALIZED_NAME_PREDEFINED_MACHINE_TYPE)
  private PredefinedMachineType predefinedMachineType;

  public MachineType() {
  }

  public MachineType customMachineType(CustomMachineType customMachineType) {
    this.customMachineType = customMachineType;
    return this;
  }

  /**
   * Get customMachineType
   * @return customMachineType
   */
  @javax.annotation.Nullable
  public CustomMachineType getCustomMachineType() {
    return customMachineType;
  }

  public void setCustomMachineType(CustomMachineType customMachineType) {
    this.customMachineType = customMachineType;
  }


  public MachineType predefinedMachineType(PredefinedMachineType predefinedMachineType) {
    this.predefinedMachineType = predefinedMachineType;
    return this;
  }

  /**
   * Get predefinedMachineType
   * @return predefinedMachineType
   */
  @javax.annotation.Nullable
  public PredefinedMachineType getPredefinedMachineType() {
    return predefinedMachineType;
  }

  public void setPredefinedMachineType(PredefinedMachineType predefinedMachineType) {
    this.predefinedMachineType = predefinedMachineType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineType machineType = (MachineType) o;
    return Objects.equals(this.customMachineType, machineType.customMachineType) &&
        Objects.equals(this.predefinedMachineType, machineType.predefinedMachineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customMachineType, predefinedMachineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineType {\n");
    sb.append("    customMachineType: ").append(toIndentedString(customMachineType)).append("\n");
    sb.append("    predefinedMachineType: ").append(toIndentedString(predefinedMachineType)).append("\n");
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
    openapiFields.add("customMachineType");
    openapiFields.add("predefinedMachineType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MachineType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MachineType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MachineType is not found in the empty JSON string", MachineType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MachineType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MachineType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customMachineType`
      if (jsonObj.get("customMachineType") != null && !jsonObj.get("customMachineType").isJsonNull()) {
        CustomMachineType.validateJsonElement(jsonObj.get("customMachineType"));
      }
      // validate the optional field `predefinedMachineType`
      if (jsonObj.get("predefinedMachineType") != null && !jsonObj.get("predefinedMachineType").isJsonNull()) {
        PredefinedMachineType.validateJsonElement(jsonObj.get("predefinedMachineType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MachineType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MachineType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MachineType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MachineType.class));

       return (TypeAdapter<T>) new TypeAdapter<MachineType>() {
           @Override
           public void write(JsonWriter out, MachineType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MachineType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MachineType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MachineType
   * @throws IOException if the JSON string is invalid with respect to MachineType
   */
  public static MachineType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MachineType.class);
  }

  /**
   * Convert an instance of MachineType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

