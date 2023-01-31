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
 * Request for setting instance accelerator.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:12.602654-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SetInstanceAcceleratorRequest {
  public static final String SERIALIZED_NAME_CORE_COUNT = "coreCount";
  @SerializedName(SERIALIZED_NAME_CORE_COUNT)
  private String coreCount;

  /**
   * Required. Type of this accelerator.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACCELERATOR_TYPE_UNSPECIFIED("ACCELERATOR_TYPE_UNSPECIFIED"),
    
    NVIDIA_TESLA_K80("NVIDIA_TESLA_K80"),
    
    NVIDIA_TESLA_P100("NVIDIA_TESLA_P100"),
    
    NVIDIA_TESLA_V100("NVIDIA_TESLA_V100"),
    
    NVIDIA_TESLA_P4("NVIDIA_TESLA_P4"),
    
    NVIDIA_TESLA_T4("NVIDIA_TESLA_T4"),
    
    NVIDIA_TESLA_A100("NVIDIA_TESLA_A100"),
    
    NVIDIA_TESLA_T4_VWS("NVIDIA_TESLA_T4_VWS"),
    
    NVIDIA_TESLA_P100_VWS("NVIDIA_TESLA_P100_VWS"),
    
    NVIDIA_TESLA_P4_VWS("NVIDIA_TESLA_P4_VWS"),
    
    TPU_V2("TPU_V2"),
    
    TPU_V3("TPU_V3");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public SetInstanceAcceleratorRequest() {
  }

  public SetInstanceAcceleratorRequest coreCount(String coreCount) {
    this.coreCount = coreCount;
    return this;
  }

  /**
   * Required. Count of cores of this accelerator. Note that not all combinations of &#x60;type&#x60; and &#x60;core_count&#x60; are valid. Check [GPUs on Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.
   * @return coreCount
   */
  @javax.annotation.Nullable
  public String getCoreCount() {
    return coreCount;
  }

  public void setCoreCount(String coreCount) {
    this.coreCount = coreCount;
  }


  public SetInstanceAcceleratorRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Required. Type of this accelerator.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetInstanceAcceleratorRequest setInstanceAcceleratorRequest = (SetInstanceAcceleratorRequest) o;
    return Objects.equals(this.coreCount, setInstanceAcceleratorRequest.coreCount) &&
        Objects.equals(this.type, setInstanceAcceleratorRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreCount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetInstanceAcceleratorRequest {\n");
    sb.append("    coreCount: ").append(toIndentedString(coreCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("coreCount");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SetInstanceAcceleratorRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetInstanceAcceleratorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetInstanceAcceleratorRequest is not found in the empty JSON string", SetInstanceAcceleratorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetInstanceAcceleratorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetInstanceAcceleratorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("coreCount") != null && !jsonObj.get("coreCount").isJsonNull()) && !jsonObj.get("coreCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coreCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coreCount").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetInstanceAcceleratorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetInstanceAcceleratorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetInstanceAcceleratorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetInstanceAcceleratorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetInstanceAcceleratorRequest>() {
           @Override
           public void write(JsonWriter out, SetInstanceAcceleratorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetInstanceAcceleratorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SetInstanceAcceleratorRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetInstanceAcceleratorRequest
   * @throws IOException if the JSON string is invalid with respect to SetInstanceAcceleratorRequest
   */
  public static SetInstanceAcceleratorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetInstanceAcceleratorRequest.class);
  }

  /**
   * Convert an instance of SetInstanceAcceleratorRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

