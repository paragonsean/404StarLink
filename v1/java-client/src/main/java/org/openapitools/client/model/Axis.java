/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
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
 * A chart axis.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:16.300251-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Axis {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  /**
   * The axis scale. By default, a linear scale is used.
   */
  @JsonAdapter(ScaleEnum.Adapter.class)
  public enum ScaleEnum {
    SCALE_UNSPECIFIED("SCALE_UNSPECIFIED"),
    
    LINEAR("LINEAR"),
    
    LOG10("LOG10");

    private String value;

    ScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScaleEnum fromValue(String value) {
      for (ScaleEnum b : ScaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScaleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScaleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private ScaleEnum scale;

  public Axis() {
  }

  public Axis label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The label of the axis.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Axis scale(ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The axis scale. By default, a linear scale is used.
   * @return scale
   */
  @javax.annotation.Nullable
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(ScaleEnum scale) {
    this.scale = scale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Axis axis = (Axis) o;
    return Objects.equals(this.label, axis.label) &&
        Objects.equals(this.scale, axis.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axis {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("scale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Axis
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Axis.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Axis is not found in the empty JSON string", Axis.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Axis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Axis` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        ScaleEnum.validateJsonElement(jsonObj.get("scale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Axis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Axis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Axis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Axis.class));

       return (TypeAdapter<T>) new TypeAdapter<Axis>() {
           @Override
           public void write(JsonWriter out, Axis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Axis read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Axis given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Axis
   * @throws IOException if the JSON string is invalid with respect to Axis
   */
  public static Axis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Axis.class);
  }

  /**
   * Convert an instance of Axis to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

