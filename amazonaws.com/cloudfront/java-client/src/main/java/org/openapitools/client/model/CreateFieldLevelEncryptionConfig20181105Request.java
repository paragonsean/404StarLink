/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
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
import org.openapitools.client.model.CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfig;

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
 * CreateFieldLevelEncryptionConfig20181105Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateFieldLevelEncryptionConfig20181105Request {
  public static final String SERIALIZED_NAME_FIELD_LEVEL_ENCRYPTION_CONFIG = "FieldLevelEncryptionConfig";
  @SerializedName(SERIALIZED_NAME_FIELD_LEVEL_ENCRYPTION_CONFIG)
  private CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfig fieldLevelEncryptionConfig;

  public CreateFieldLevelEncryptionConfig20181105Request() {
  }

  public CreateFieldLevelEncryptionConfig20181105Request fieldLevelEncryptionConfig(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
    this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
    return this;
  }

  /**
   * Get fieldLevelEncryptionConfig
   * @return fieldLevelEncryptionConfig
   */
  @javax.annotation.Nonnull
  public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfig getFieldLevelEncryptionConfig() {
    return fieldLevelEncryptionConfig;
  }

  public void setFieldLevelEncryptionConfig(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
    this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFieldLevelEncryptionConfig20181105Request createFieldLevelEncryptionConfig20181105Request = (CreateFieldLevelEncryptionConfig20181105Request) o;
    return Objects.equals(this.fieldLevelEncryptionConfig, createFieldLevelEncryptionConfig20181105Request.fieldLevelEncryptionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldLevelEncryptionConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFieldLevelEncryptionConfig20181105Request {\n");
    sb.append("    fieldLevelEncryptionConfig: ").append(toIndentedString(fieldLevelEncryptionConfig)).append("\n");
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
    openapiFields.add("FieldLevelEncryptionConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FieldLevelEncryptionConfig");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFieldLevelEncryptionConfig20181105Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFieldLevelEncryptionConfig20181105Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFieldLevelEncryptionConfig20181105Request is not found in the empty JSON string", CreateFieldLevelEncryptionConfig20181105Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFieldLevelEncryptionConfig20181105Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFieldLevelEncryptionConfig20181105Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFieldLevelEncryptionConfig20181105Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `FieldLevelEncryptionConfig`
      CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfig.validateJsonElement(jsonObj.get("FieldLevelEncryptionConfig"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFieldLevelEncryptionConfig20181105Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFieldLevelEncryptionConfig20181105Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFieldLevelEncryptionConfig20181105Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFieldLevelEncryptionConfig20181105Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFieldLevelEncryptionConfig20181105Request>() {
           @Override
           public void write(JsonWriter out, CreateFieldLevelEncryptionConfig20181105Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFieldLevelEncryptionConfig20181105Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateFieldLevelEncryptionConfig20181105Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFieldLevelEncryptionConfig20181105Request
   * @throws IOException if the JSON string is invalid with respect to CreateFieldLevelEncryptionConfig20181105Request
   */
  public static CreateFieldLevelEncryptionConfig20181105Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFieldLevelEncryptionConfig20181105Request.class);
  }

  /**
   * Convert an instance of CreateFieldLevelEncryptionConfig20181105Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

