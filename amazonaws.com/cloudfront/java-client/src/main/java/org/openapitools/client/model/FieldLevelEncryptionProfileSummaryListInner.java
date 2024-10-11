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
 * FieldLevelEncryptionProfileSummaryListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FieldLevelEncryptionProfileSummaryListInner {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "LastModifiedTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private OffsetDateTime lastModifiedTime;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENCRYPTION_ENTITIES = "EncryptionEntities";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_ENTITIES)
  private CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities encryptionEntities;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public FieldLevelEncryptionProfileSummaryListInner() {
  }

  public FieldLevelEncryptionProfileSummaryListInner id(String id) {
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


  public FieldLevelEncryptionProfileSummaryListInner lastModifiedTime(OffsetDateTime lastModifiedTime) {
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


  public FieldLevelEncryptionProfileSummaryListInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FieldLevelEncryptionProfileSummaryListInner encryptionEntities(CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities encryptionEntities) {
    this.encryptionEntities = encryptionEntities;
    return this;
  }

  /**
   * Get encryptionEntities
   * @return encryptionEntities
   */
  @javax.annotation.Nonnull
  public CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities getEncryptionEntities() {
    return encryptionEntities;
  }

  public void setEncryptionEntities(CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities encryptionEntities) {
    this.encryptionEntities = encryptionEntities;
  }


  public FieldLevelEncryptionProfileSummaryListInner comment(String comment) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldLevelEncryptionProfileSummaryListInner fieldLevelEncryptionProfileSummaryListInner = (FieldLevelEncryptionProfileSummaryListInner) o;
    return Objects.equals(this.id, fieldLevelEncryptionProfileSummaryListInner.id) &&
        Objects.equals(this.lastModifiedTime, fieldLevelEncryptionProfileSummaryListInner.lastModifiedTime) &&
        Objects.equals(this.name, fieldLevelEncryptionProfileSummaryListInner.name) &&
        Objects.equals(this.encryptionEntities, fieldLevelEncryptionProfileSummaryListInner.encryptionEntities) &&
        Objects.equals(this.comment, fieldLevelEncryptionProfileSummaryListInner.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedTime, name, encryptionEntities, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldLevelEncryptionProfileSummaryListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    encryptionEntities: ").append(toIndentedString(encryptionEntities)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("EncryptionEntities");
    openapiFields.add("Comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("LastModifiedTime");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("EncryptionEntities");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldLevelEncryptionProfileSummaryListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldLevelEncryptionProfileSummaryListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldLevelEncryptionProfileSummaryListInner is not found in the empty JSON string", FieldLevelEncryptionProfileSummaryListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldLevelEncryptionProfileSummaryListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldLevelEncryptionProfileSummaryListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldLevelEncryptionProfileSummaryListInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the required field `LastModifiedTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("LastModifiedTime"));
      // validate the required field `Name`
      String.validateJsonElement(jsonObj.get("Name"));
      // validate the required field `EncryptionEntities`
      CreateFieldLevelEncryptionProfile20181105RequestFieldLevelEncryptionProfileConfigEncryptionEntities.validateJsonElement(jsonObj.get("EncryptionEntities"));
      // validate the optional field `Comment`
      if (jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Comment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldLevelEncryptionProfileSummaryListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldLevelEncryptionProfileSummaryListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldLevelEncryptionProfileSummaryListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldLevelEncryptionProfileSummaryListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldLevelEncryptionProfileSummaryListInner>() {
           @Override
           public void write(JsonWriter out, FieldLevelEncryptionProfileSummaryListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldLevelEncryptionProfileSummaryListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldLevelEncryptionProfileSummaryListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldLevelEncryptionProfileSummaryListInner
   * @throws IOException if the JSON string is invalid with respect to FieldLevelEncryptionProfileSummaryListInner
   */
  public static FieldLevelEncryptionProfileSummaryListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldLevelEncryptionProfileSummaryListInner.class);
  }

  /**
   * Convert an instance of FieldLevelEncryptionProfileSummaryListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

