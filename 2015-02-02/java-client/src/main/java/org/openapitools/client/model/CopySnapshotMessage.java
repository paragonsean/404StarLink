/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
import java.util.List;

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
 * Represents the input of a &lt;code&gt;CopySnapshotMessage&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:10.865581-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CopySnapshotMessage {
  public static final String SERIALIZED_NAME_SOURCE_SNAPSHOT_NAME = "SourceSnapshotName";
  @SerializedName(SERIALIZED_NAME_SOURCE_SNAPSHOT_NAME)
  private String sourceSnapshotName;

  public static final String SERIALIZED_NAME_TARGET_SNAPSHOT_NAME = "TargetSnapshotName";
  @SerializedName(SERIALIZED_NAME_TARGET_SNAPSHOT_NAME)
  private String targetSnapshotName;

  public static final String SERIALIZED_NAME_TARGET_BUCKET = "TargetBucket";
  @SerializedName(SERIALIZED_NAME_TARGET_BUCKET)
  private String targetBucket;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CopySnapshotMessage() {
  }

  public CopySnapshotMessage sourceSnapshotName(String sourceSnapshotName) {
    this.sourceSnapshotName = sourceSnapshotName;
    return this;
  }

  /**
   * Get sourceSnapshotName
   * @return sourceSnapshotName
   */
  @javax.annotation.Nonnull
  public String getSourceSnapshotName() {
    return sourceSnapshotName;
  }

  public void setSourceSnapshotName(String sourceSnapshotName) {
    this.sourceSnapshotName = sourceSnapshotName;
  }


  public CopySnapshotMessage targetSnapshotName(String targetSnapshotName) {
    this.targetSnapshotName = targetSnapshotName;
    return this;
  }

  /**
   * Get targetSnapshotName
   * @return targetSnapshotName
   */
  @javax.annotation.Nonnull
  public String getTargetSnapshotName() {
    return targetSnapshotName;
  }

  public void setTargetSnapshotName(String targetSnapshotName) {
    this.targetSnapshotName = targetSnapshotName;
  }


  public CopySnapshotMessage targetBucket(String targetBucket) {
    this.targetBucket = targetBucket;
    return this;
  }

  /**
   * Get targetBucket
   * @return targetBucket
   */
  @javax.annotation.Nullable
  public String getTargetBucket() {
    return targetBucket;
  }

  public void setTargetBucket(String targetBucket) {
    this.targetBucket = targetBucket;
  }


  public CopySnapshotMessage kmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  /**
   * Get kmsKeyId
   * @return kmsKeyId
   */
  @javax.annotation.Nullable
  public String getKmsKeyId() {
    return kmsKeyId;
  }

  public void setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
  }


  public CopySnapshotMessage tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopySnapshotMessage copySnapshotMessage = (CopySnapshotMessage) o;
    return Objects.equals(this.sourceSnapshotName, copySnapshotMessage.sourceSnapshotName) &&
        Objects.equals(this.targetSnapshotName, copySnapshotMessage.targetSnapshotName) &&
        Objects.equals(this.targetBucket, copySnapshotMessage.targetBucket) &&
        Objects.equals(this.kmsKeyId, copySnapshotMessage.kmsKeyId) &&
        Objects.equals(this.tags, copySnapshotMessage.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceSnapshotName, targetSnapshotName, targetBucket, kmsKeyId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopySnapshotMessage {\n");
    sb.append("    sourceSnapshotName: ").append(toIndentedString(sourceSnapshotName)).append("\n");
    sb.append("    targetSnapshotName: ").append(toIndentedString(targetSnapshotName)).append("\n");
    sb.append("    targetBucket: ").append(toIndentedString(targetBucket)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("SourceSnapshotName");
    openapiFields.add("TargetSnapshotName");
    openapiFields.add("TargetBucket");
    openapiFields.add("KmsKeyId");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SourceSnapshotName");
    openapiRequiredFields.add("TargetSnapshotName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CopySnapshotMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CopySnapshotMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CopySnapshotMessage is not found in the empty JSON string", CopySnapshotMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CopySnapshotMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CopySnapshotMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CopySnapshotMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `SourceSnapshotName`
      String.validateJsonElement(jsonObj.get("SourceSnapshotName"));
      // validate the required field `TargetSnapshotName`
      String.validateJsonElement(jsonObj.get("TargetSnapshotName"));
      // validate the optional field `TargetBucket`
      if (jsonObj.get("TargetBucket") != null && !jsonObj.get("TargetBucket").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TargetBucket"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CopySnapshotMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CopySnapshotMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CopySnapshotMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CopySnapshotMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CopySnapshotMessage>() {
           @Override
           public void write(JsonWriter out, CopySnapshotMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CopySnapshotMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CopySnapshotMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CopySnapshotMessage
   * @throws IOException if the JSON string is invalid with respect to CopySnapshotMessage
   */
  public static CopySnapshotMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CopySnapshotMessage.class);
  }

  /**
   * Convert an instance of CopySnapshotMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

