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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Option;

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
 * A single field of a message type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:16.300251-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Field {
  /**
   * The field cardinality.
   */
  @JsonAdapter(CardinalityEnum.Adapter.class)
  public enum CardinalityEnum {
    UNKNOWN("CARDINALITY_UNKNOWN"),
    
    OPTIONAL("CARDINALITY_OPTIONAL"),
    
    REQUIRED("CARDINALITY_REQUIRED"),
    
    REPEATED("CARDINALITY_REPEATED");

    private String value;

    CardinalityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardinalityEnum fromValue(String value) {
      for (CardinalityEnum b : CardinalityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CardinalityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardinalityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardinalityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardinalityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CardinalityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CARDINALITY = "cardinality";
  @SerializedName(SERIALIZED_NAME_CARDINALITY)
  private CardinalityEnum cardinality;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_JSON_NAME = "jsonName";
  @SerializedName(SERIALIZED_NAME_JSON_NAME)
  private String jsonName;

  /**
   * The field type.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    UNKNOWN("TYPE_UNKNOWN"),
    
    DOUBLE("TYPE_DOUBLE"),
    
    FLOAT("TYPE_FLOAT"),
    
    INT64("TYPE_INT64"),
    
    UINT64("TYPE_UINT64"),
    
    INT32("TYPE_INT32"),
    
    FIXED64("TYPE_FIXED64"),
    
    FIXED32("TYPE_FIXED32"),
    
    BOOL("TYPE_BOOL"),
    
    STRING("TYPE_STRING"),
    
    GROUP("TYPE_GROUP"),
    
    MESSAGE("TYPE_MESSAGE"),
    
    BYTES("TYPE_BYTES"),
    
    UINT32("TYPE_UINT32"),
    
    ENUM("TYPE_ENUM"),
    
    SFIXED32("TYPE_SFIXED32"),
    
    SFIXED64("TYPE_SFIXED64"),
    
    SINT32("TYPE_SINT32"),
    
    SINT64("TYPE_SINT64");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_ONEOF_INDEX = "oneofIndex";
  @SerializedName(SERIALIZED_NAME_ONEOF_INDEX)
  private Integer oneofIndex;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Option> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_PACKED = "packed";
  @SerializedName(SERIALIZED_NAME_PACKED)
  private Boolean packed;

  public static final String SERIALIZED_NAME_TYPE_URL = "typeUrl";
  @SerializedName(SERIALIZED_NAME_TYPE_URL)
  private String typeUrl;

  public Field() {
  }

  public Field cardinality(CardinalityEnum cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * The field cardinality.
   * @return cardinality
   */
  @javax.annotation.Nullable
  public CardinalityEnum getCardinality() {
    return cardinality;
  }

  public void setCardinality(CardinalityEnum cardinality) {
    this.cardinality = cardinality;
  }


  public Field defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The string value of the default value of this field. Proto2 syntax only.
   * @return defaultValue
   */
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public Field jsonName(String jsonName) {
    this.jsonName = jsonName;
    return this;
  }

  /**
   * The field JSON name.
   * @return jsonName
   */
  @javax.annotation.Nullable
  public String getJsonName() {
    return jsonName;
  }

  public void setJsonName(String jsonName) {
    this.jsonName = jsonName;
  }


  public Field kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The field type.
   * @return kind
   */
  @javax.annotation.Nullable
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public Field name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The field name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Field number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * The field number.
   * @return number
   */
  @javax.annotation.Nullable
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public Field oneofIndex(Integer oneofIndex) {
    this.oneofIndex = oneofIndex;
    return this;
  }

  /**
   * The index of the field type in Type.oneofs, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
   * @return oneofIndex
   */
  @javax.annotation.Nullable
  public Integer getOneofIndex() {
    return oneofIndex;
  }

  public void setOneofIndex(Integer oneofIndex) {
    this.oneofIndex = oneofIndex;
  }


  public Field options(List<Option> options) {
    this.options = options;
    return this;
  }

  public Field addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * The protocol buffer options.
   * @return options
   */
  @javax.annotation.Nullable
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }


  public Field packed(Boolean packed) {
    this.packed = packed;
    return this;
  }

  /**
   * Whether to use alternative packed wire representation.
   * @return packed
   */
  @javax.annotation.Nullable
  public Boolean getPacked() {
    return packed;
  }

  public void setPacked(Boolean packed) {
    this.packed = packed;
  }


  public Field typeUrl(String typeUrl) {
    this.typeUrl = typeUrl;
    return this;
  }

  /**
   * The field type URL, without the scheme, for message or enumeration types. Example: \&quot;type.googleapis.com/google.protobuf.Timestamp\&quot;.
   * @return typeUrl
   */
  @javax.annotation.Nullable
  public String getTypeUrl() {
    return typeUrl;
  }

  public void setTypeUrl(String typeUrl) {
    this.typeUrl = typeUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.cardinality, field.cardinality) &&
        Objects.equals(this.defaultValue, field.defaultValue) &&
        Objects.equals(this.jsonName, field.jsonName) &&
        Objects.equals(this.kind, field.kind) &&
        Objects.equals(this.name, field.name) &&
        Objects.equals(this.number, field.number) &&
        Objects.equals(this.oneofIndex, field.oneofIndex) &&
        Objects.equals(this.options, field.options) &&
        Objects.equals(this.packed, field.packed) &&
        Objects.equals(this.typeUrl, field.typeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardinality, defaultValue, jsonName, kind, name, number, oneofIndex, options, packed, typeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    jsonName: ").append(toIndentedString(jsonName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    oneofIndex: ").append(toIndentedString(oneofIndex)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    packed: ").append(toIndentedString(packed)).append("\n");
    sb.append("    typeUrl: ").append(toIndentedString(typeUrl)).append("\n");
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
    openapiFields.add("cardinality");
    openapiFields.add("defaultValue");
    openapiFields.add("jsonName");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("oneofIndex");
    openapiFields.add("options");
    openapiFields.add("packed");
    openapiFields.add("typeUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Field
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Field.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Field is not found in the empty JSON string", Field.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Field.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Field` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cardinality") != null && !jsonObj.get("cardinality").isJsonNull()) && !jsonObj.get("cardinality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardinality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardinality").toString()));
      }
      // validate the optional field `cardinality`
      if (jsonObj.get("cardinality") != null && !jsonObj.get("cardinality").isJsonNull()) {
        CardinalityEnum.validateJsonElement(jsonObj.get("cardinality"));
      }
      if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) && !jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
      if ((jsonObj.get("jsonName") != null && !jsonObj.get("jsonName").isJsonNull()) && !jsonObj.get("jsonName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jsonName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jsonName").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        KindEnum.validateJsonElement(jsonObj.get("kind"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            Option.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
      if ((jsonObj.get("typeUrl") != null && !jsonObj.get("typeUrl").isJsonNull()) && !jsonObj.get("typeUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Field.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Field' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Field> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Field.class));

       return (TypeAdapter<T>) new TypeAdapter<Field>() {
           @Override
           public void write(JsonWriter out, Field value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Field read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Field given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Field
   * @throws IOException if the JSON string is invalid with respect to Field
   */
  public static Field fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Field.class);
  }

  /**
   * Convert an instance of Field to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

