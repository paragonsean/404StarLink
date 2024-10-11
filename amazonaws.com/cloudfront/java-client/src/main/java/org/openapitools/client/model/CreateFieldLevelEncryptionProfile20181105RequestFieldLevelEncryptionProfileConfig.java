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
import org.openapitools.client.model.CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities;

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
 * A complex data type of profiles for the field-level encryption.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CALLER_REFERENCE = "CallerReference";
  @SerializedName(SERIALIZED_NAME_CALLER_REFERENCE)
  private String callerReference;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_ENCRYPTION_ENTITIES = "EncryptionEntities";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_ENTITIES)
  private CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities encryptionEntities;

  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig() {
  }

  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig callerReference(String callerReference) {
    this.callerReference = callerReference;
    return this;
  }

  /**
   * Get callerReference
   * @return callerReference
   */
  @javax.annotation.Nullable
  public String getCallerReference() {
    return callerReference;
  }

  public void setCallerReference(String callerReference) {
    this.callerReference = callerReference;
  }


  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig encryptionEntities(CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities encryptionEntities) {
    this.encryptionEntities = encryptionEntities;
    return this;
  }

  /**
   * Get encryptionEntities
   * @return encryptionEntities
   */
  @javax.annotation.Nullable
  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities getEncryptionEntities() {
    return encryptionEntities;
  }

  public void setEncryptionEntities(CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities encryptionEntities) {
    this.encryptionEntities = encryptionEntities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig createFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig = (CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig) o;
    return Objects.equals(this.name, createFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.name) &&
        Objects.equals(this.callerReference, createFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.callerReference) &&
        Objects.equals(this.comment, createFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.comment) &&
        Objects.equals(this.encryptionEntities, createFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.encryptionEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, callerReference, comment, encryptionEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    callerReference: ").append(toIndentedString(callerReference)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    encryptionEntities: ").append(toIndentedString(encryptionEntities)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("CallerReference");
    openapiFields.add("Comment");
    openapiFields.add("EncryptionEntities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig is not found in the empty JSON string", CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `CallerReference`
      if (jsonObj.get("CallerReference") != null && !jsonObj.get("CallerReference").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CallerReference"));
      }
      // validate the optional field `Comment`
      if (jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Comment"));
      }
      // validate the optional field `EncryptionEntities`
      if (jsonObj.get("EncryptionEntities") != null && !jsonObj.get("EncryptionEntities").isJsonNull()) {
        CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities.validateJsonElement(jsonObj.get("EncryptionEntities"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig>() {
           @Override
           public void write(JsonWriter out, CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig
   * @throws IOException if the JSON string is invalid with respect to CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig
   */
  public static CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig.class);
  }

  /**
   * Convert an instance of CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

