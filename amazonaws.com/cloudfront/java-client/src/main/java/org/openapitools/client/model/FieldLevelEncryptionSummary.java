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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.FieldLevelEncryptionSummaryContentTypeProfileConfig;
import org.openapitools.client.model.FieldLevelEncryptionSummaryQueryArgProfileConfig;

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
 * A summary of a field-level encryption item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FieldLevelEncryptionSummary {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "LastModifiedTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private OffsetDateTime lastModifiedTime;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_QUERY_ARG_PROFILE_CONFIG = "QueryArgProfileConfig";
  @SerializedName(SERIALIZED_NAME_QUERY_ARG_PROFILE_CONFIG)
  private FieldLevelEncryptionSummaryQueryArgProfileConfig queryArgProfileConfig;

  public static final String SERIALIZED_NAME_CONTENT_TYPE_PROFILE_CONFIG = "ContentTypeProfileConfig";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE_PROFILE_CONFIG)
  private FieldLevelEncryptionSummaryContentTypeProfileConfig contentTypeProfileConfig;

  public FieldLevelEncryptionSummary() {
  }

  public FieldLevelEncryptionSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public FieldLevelEncryptionSummary lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   * @return lastModifiedTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  public FieldLevelEncryptionSummary comment(String comment) {
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


  public FieldLevelEncryptionSummary queryArgProfileConfig(FieldLevelEncryptionSummaryQueryArgProfileConfig queryArgProfileConfig) {
    this.queryArgProfileConfig = queryArgProfileConfig;
    return this;
  }

  /**
   * Get queryArgProfileConfig
   * @return queryArgProfileConfig
   */
  @javax.annotation.Nullable
  public FieldLevelEncryptionSummaryQueryArgProfileConfig getQueryArgProfileConfig() {
    return queryArgProfileConfig;
  }

  public void setQueryArgProfileConfig(FieldLevelEncryptionSummaryQueryArgProfileConfig queryArgProfileConfig) {
    this.queryArgProfileConfig = queryArgProfileConfig;
  }


  public FieldLevelEncryptionSummary contentTypeProfileConfig(FieldLevelEncryptionSummaryContentTypeProfileConfig contentTypeProfileConfig) {
    this.contentTypeProfileConfig = contentTypeProfileConfig;
    return this;
  }

  /**
   * Get contentTypeProfileConfig
   * @return contentTypeProfileConfig
   */
  @javax.annotation.Nullable
  public FieldLevelEncryptionSummaryContentTypeProfileConfig getContentTypeProfileConfig() {
    return contentTypeProfileConfig;
  }

  public void setContentTypeProfileConfig(FieldLevelEncryptionSummaryContentTypeProfileConfig contentTypeProfileConfig) {
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
    FieldLevelEncryptionSummary fieldLevelEncryptionSummary = (FieldLevelEncryptionSummary) o;
    return Objects.equals(this.id, fieldLevelEncryptionSummary.id) &&
        Objects.equals(this.lastModifiedTime, fieldLevelEncryptionSummary.lastModifiedTime) &&
        Objects.equals(this.comment, fieldLevelEncryptionSummary.comment) &&
        Objects.equals(this.queryArgProfileConfig, fieldLevelEncryptionSummary.queryArgProfileConfig) &&
        Objects.equals(this.contentTypeProfileConfig, fieldLevelEncryptionSummary.contentTypeProfileConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedTime, comment, queryArgProfileConfig, contentTypeProfileConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldLevelEncryptionSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("LastModifiedTime");
    openapiFields.add("Comment");
    openapiFields.add("QueryArgProfileConfig");
    openapiFields.add("ContentTypeProfileConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("LastModifiedTime");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldLevelEncryptionSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldLevelEncryptionSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldLevelEncryptionSummary is not found in the empty JSON string", FieldLevelEncryptionSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldLevelEncryptionSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldLevelEncryptionSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldLevelEncryptionSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the required field `LastModifiedTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("LastModifiedTime"));
      // validate the optional field `Comment`
      if (jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Comment"));
      }
      // validate the optional field `QueryArgProfileConfig`
      if (jsonObj.get("QueryArgProfileConfig") != null && !jsonObj.get("QueryArgProfileConfig").isJsonNull()) {
        FieldLevelEncryptionSummaryQueryArgProfileConfig.validateJsonElement(jsonObj.get("QueryArgProfileConfig"));
      }
      // validate the optional field `ContentTypeProfileConfig`
      if (jsonObj.get("ContentTypeProfileConfig") != null && !jsonObj.get("ContentTypeProfileConfig").isJsonNull()) {
        FieldLevelEncryptionSummaryContentTypeProfileConfig.validateJsonElement(jsonObj.get("ContentTypeProfileConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldLevelEncryptionSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldLevelEncryptionSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldLevelEncryptionSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldLevelEncryptionSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldLevelEncryptionSummary>() {
           @Override
           public void write(JsonWriter out, FieldLevelEncryptionSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldLevelEncryptionSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldLevelEncryptionSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldLevelEncryptionSummary
   * @throws IOException if the JSON string is invalid with respect to FieldLevelEncryptionSummary
   */
  public static FieldLevelEncryptionSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldLevelEncryptionSummary.class);
  }

  /**
   * Convert an instance of FieldLevelEncryptionSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

