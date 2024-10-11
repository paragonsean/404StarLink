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
import org.openapitools.client.model.CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig;
import org.openapitools.client.model.CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigQueryArgProfileConfig;

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
 * FieldLevelEncryptionFieldLevelEncryptionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FieldLevelEncryptionFieldLevelEncryptionConfig {
  public static final String SERIALIZED_NAME_CALLER_REFERENCE = "CallerReference";
  @SerializedName(SERIALIZED_NAME_CALLER_REFERENCE)
  private String callerReference;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_QUERY_ARG_PROFILE_CONFIG = "QueryArgProfileConfig";
  @SerializedName(SERIALIZED_NAME_QUERY_ARG_PROFILE_CONFIG)
  private CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigQueryArgProfileConfig queryArgProfileConfig;

  public static final String SERIALIZED_NAME_CONTENT_TYPE_PROFILE_CONFIG = "ContentTypeProfileConfig";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE_PROFILE_CONFIG)
  private CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig contentTypeProfileConfig;

  public FieldLevelEncryptionFieldLevelEncryptionConfig() {
  }

  public FieldLevelEncryptionFieldLevelEncryptionConfig callerReference(String callerReference) {
    this.callerReference = callerReference;
    return this;
  }

  /**
   * Get callerReference
   * @return callerReference
   */
  @javax.annotation.Nonnull
  public String getCallerReference() {
    return callerReference;
  }

  public void setCallerReference(String callerReference) {
    this.callerReference = callerReference;
  }


  public FieldLevelEncryptionFieldLevelEncryptionConfig comment(String comment) {
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


  public FieldLevelEncryptionFieldLevelEncryptionConfig queryArgProfileConfig(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigQueryArgProfileConfig queryArgProfileConfig) {
    this.queryArgProfileConfig = queryArgProfileConfig;
    return this;
  }

  /**
   * Get queryArgProfileConfig
   * @return queryArgProfileConfig
   */
  @javax.annotation.Nullable
  public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigQueryArgProfileConfig getQueryArgProfileConfig() {
    return queryArgProfileConfig;
  }

  public void setQueryArgProfileConfig(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigQueryArgProfileConfig queryArgProfileConfig) {
    this.queryArgProfileConfig = queryArgProfileConfig;
  }


  public FieldLevelEncryptionFieldLevelEncryptionConfig contentTypeProfileConfig(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig contentTypeProfileConfig) {
    this.contentTypeProfileConfig = contentTypeProfileConfig;
    return this;
  }

  /**
   * Get contentTypeProfileConfig
   * @return contentTypeProfileConfig
   */
  @javax.annotation.Nullable
  public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig getContentTypeProfileConfig() {
    return contentTypeProfileConfig;
  }

  public void setContentTypeProfileConfig(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig contentTypeProfileConfig) {
    this.contentTypeProfileConfig = contentTypeProfileConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldLevelEncryptionFieldLevelEncryptionConfig fieldLevelEncryptionFieldLevelEncryptionConfig = (FieldLevelEncryptionFieldLevelEncryptionConfig) o;
    return Objects.equals(this.callerReference, fieldLevelEncryptionFieldLevelEncryptionConfig.callerReference) &&
        Objects.equals(this.comment, fieldLevelEncryptionFieldLevelEncryptionConfig.comment) &&
        Objects.equals(this.queryArgProfileConfig, fieldLevelEncryptionFieldLevelEncryptionConfig.queryArgProfileConfig) &&
        Objects.equals(this.contentTypeProfileConfig, fieldLevelEncryptionFieldLevelEncryptionConfig.contentTypeProfileConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerReference, comment, queryArgProfileConfig, contentTypeProfileConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldLevelEncryptionFieldLevelEncryptionConfig {\n");
    sb.append("    callerReference: ").append(toIndentedString(callerReference)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    queryArgProfileConfig: ").append(toIndentedString(queryArgProfileConfig)).append("\n");
    sb.append("    contentTypeProfileConfig: ").append(toIndentedString(contentTypeProfileConfig)).append("\n");
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
    openapiFields.add("CallerReference");
    openapiFields.add("Comment");
    openapiFields.add("QueryArgProfileConfig");
    openapiFields.add("ContentTypeProfileConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CallerReference");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldLevelEncryptionFieldLevelEncryptionConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldLevelEncryptionFieldLevelEncryptionConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldLevelEncryptionFieldLevelEncryptionConfig is not found in the empty JSON string", FieldLevelEncryptionFieldLevelEncryptionConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldLevelEncryptionFieldLevelEncryptionConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldLevelEncryptionFieldLevelEncryptionConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldLevelEncryptionFieldLevelEncryptionConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CallerReference`
      String.validateJsonElement(jsonObj.get("CallerReference"));
      // validate the optional field `Comment`
      if (jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Comment"));
      }
      // validate the optional field `QueryArgProfileConfig`
      if (jsonObj.get("QueryArgProfileConfig") != null && !jsonObj.get("QueryArgProfileConfig").isJsonNull()) {
        CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigQueryArgProfileConfig.validateJsonElement(jsonObj.get("QueryArgProfileConfig"));
      }
      // validate the optional field `ContentTypeProfileConfig`
      if (jsonObj.get("ContentTypeProfileConfig") != null && !jsonObj.get("ContentTypeProfileConfig").isJsonNull()) {
        CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.validateJsonElement(jsonObj.get("ContentTypeProfileConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldLevelEncryptionFieldLevelEncryptionConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldLevelEncryptionFieldLevelEncryptionConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldLevelEncryptionFieldLevelEncryptionConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldLevelEncryptionFieldLevelEncryptionConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldLevelEncryptionFieldLevelEncryptionConfig>() {
           @Override
           public void write(JsonWriter out, FieldLevelEncryptionFieldLevelEncryptionConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldLevelEncryptionFieldLevelEncryptionConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldLevelEncryptionFieldLevelEncryptionConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldLevelEncryptionFieldLevelEncryptionConfig
   * @throws IOException if the JSON string is invalid with respect to FieldLevelEncryptionFieldLevelEncryptionConfig
   */
  public static FieldLevelEncryptionFieldLevelEncryptionConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldLevelEncryptionFieldLevelEncryptionConfig.class);
  }

  /**
   * Convert an instance of FieldLevelEncryptionFieldLevelEncryptionConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

