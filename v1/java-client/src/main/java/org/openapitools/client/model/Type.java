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
import org.openapitools.client.model.Field;
import org.openapitools.client.model.Option;
import org.openapitools.client.model.SourceContext;

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
 * A protocol buffer message type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:16.300251-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Type {
  public static final String SERIALIZED_NAME_EDITION = "edition";
  @SerializedName(SERIALIZED_NAME_EDITION)
  private String edition;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Field> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ONEOFS = "oneofs";
  @SerializedName(SERIALIZED_NAME_ONEOFS)
  private List<String> oneofs = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Option> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_CONTEXT = "sourceContext";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONTEXT)
  private SourceContext sourceContext;

  /**
   * The source syntax.
   */
  @JsonAdapter(SyntaxEnum.Adapter.class)
  public enum SyntaxEnum {
    PROTO2("SYNTAX_PROTO2"),
    
    PROTO3("SYNTAX_PROTO3"),
    
    EDITIONS("SYNTAX_EDITIONS");

    private String value;

    SyntaxEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SyntaxEnum fromValue(String value) {
      for (SyntaxEnum b : SyntaxEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SyntaxEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SyntaxEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SyntaxEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SyntaxEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SyntaxEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SYNTAX = "syntax";
  @SerializedName(SERIALIZED_NAME_SYNTAX)
  private SyntaxEnum syntax;

  public Type() {
  }

  public Type edition(String edition) {
    this.edition = edition;
    return this;
  }

  /**
   * The source edition string, only valid when syntax is SYNTAX_EDITIONS.
   * @return edition
   */
  @javax.annotation.Nullable
  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }


  public Type fields(List<Field> fields) {
    this.fields = fields;
    return this;
  }

  public Type addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The list of fields.
   * @return fields
   */
  @javax.annotation.Nullable
  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }


  public Type name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The fully qualified message name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Type oneofs(List<String> oneofs) {
    this.oneofs = oneofs;
    return this;
  }

  public Type addOneofsItem(String oneofsItem) {
    if (this.oneofs == null) {
      this.oneofs = new ArrayList<>();
    }
    this.oneofs.add(oneofsItem);
    return this;
  }

  /**
   * The list of types appearing in oneof definitions in this type.
   * @return oneofs
   */
  @javax.annotation.Nullable
  public List<String> getOneofs() {
    return oneofs;
  }

  public void setOneofs(List<String> oneofs) {
    this.oneofs = oneofs;
  }


  public Type options(List<Option> options) {
    this.options = options;
    return this;
  }

  public Type addOptionsItem(Option optionsItem) {
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


  public Type sourceContext(SourceContext sourceContext) {
    this.sourceContext = sourceContext;
    return this;
  }

  /**
   * Get sourceContext
   * @return sourceContext
   */
  @javax.annotation.Nullable
  public SourceContext getSourceContext() {
    return sourceContext;
  }

  public void setSourceContext(SourceContext sourceContext) {
    this.sourceContext = sourceContext;
  }


  public Type syntax(SyntaxEnum syntax) {
    this.syntax = syntax;
    return this;
  }

  /**
   * The source syntax.
   * @return syntax
   */
  @javax.annotation.Nullable
  public SyntaxEnum getSyntax() {
    return syntax;
  }

  public void setSyntax(SyntaxEnum syntax) {
    this.syntax = syntax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Type type = (Type) o;
    return Objects.equals(this.edition, type.edition) &&
        Objects.equals(this.fields, type.fields) &&
        Objects.equals(this.name, type.name) &&
        Objects.equals(this.oneofs, type.oneofs) &&
        Objects.equals(this.options, type.options) &&
        Objects.equals(this.sourceContext, type.sourceContext) &&
        Objects.equals(this.syntax, type.syntax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edition, fields, name, oneofs, options, sourceContext, syntax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Type {\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oneofs: ").append(toIndentedString(oneofs)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    sourceContext: ").append(toIndentedString(sourceContext)).append("\n");
    sb.append("    syntax: ").append(toIndentedString(syntax)).append("\n");
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
    openapiFields.add("edition");
    openapiFields.add("fields");
    openapiFields.add("name");
    openapiFields.add("oneofs");
    openapiFields.add("options");
    openapiFields.add("sourceContext");
    openapiFields.add("syntax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Type
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Type.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Type is not found in the empty JSON string", Type.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Type.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Type` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("edition") != null && !jsonObj.get("edition").isJsonNull()) && !jsonObj.get("edition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edition").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            Field.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("oneofs") != null && !jsonObj.get("oneofs").isJsonNull() && !jsonObj.get("oneofs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `oneofs` to be an array in the JSON string but got `%s`", jsonObj.get("oneofs").toString()));
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
      // validate the optional field `sourceContext`
      if (jsonObj.get("sourceContext") != null && !jsonObj.get("sourceContext").isJsonNull()) {
        SourceContext.validateJsonElement(jsonObj.get("sourceContext"));
      }
      if ((jsonObj.get("syntax") != null && !jsonObj.get("syntax").isJsonNull()) && !jsonObj.get("syntax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syntax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syntax").toString()));
      }
      // validate the optional field `syntax`
      if (jsonObj.get("syntax") != null && !jsonObj.get("syntax").isJsonNull()) {
        SyntaxEnum.validateJsonElement(jsonObj.get("syntax"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Type.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Type' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Type> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Type.class));

       return (TypeAdapter<T>) new TypeAdapter<Type>() {
           @Override
           public void write(JsonWriter out, Type value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Type read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Type given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Type
   * @throws IOException if the JSON string is invalid with respect to Type
   */
  public static Type fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Type.class);
  }

  /**
   * Convert an instance of Type to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

