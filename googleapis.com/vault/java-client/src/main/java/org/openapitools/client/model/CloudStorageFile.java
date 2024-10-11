/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
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
 * The export file in Cloud Storage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloudStorageFile {
  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucketName";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  private String bucketName;

  public static final String SERIALIZED_NAME_MD5_HASH = "md5Hash";
  @SerializedName(SERIALIZED_NAME_MD5_HASH)
  private String md5Hash;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "objectName";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public CloudStorageFile() {
  }

  public CloudStorageFile bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * The name of the Cloud Storage bucket for the export file. You can use this value in the [Cloud Storage JSON or XML APIs](https://cloud.google.com/storage/docs/apis), but not to list the bucket contents. Instead, you can [get individual export files](https://cloud.google.com/storage/docs/json_api/v1/objects/get) by object name.
   * @return bucketName
   */
  @javax.annotation.Nullable
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  public CloudStorageFile md5Hash(String md5Hash) {
    this.md5Hash = md5Hash;
    return this;
  }

  /**
   * The md5 hash of the file.
   * @return md5Hash
   */
  @javax.annotation.Nullable
  public String getMd5Hash() {
    return md5Hash;
  }

  public void setMd5Hash(String md5Hash) {
    this.md5Hash = md5Hash;
  }


  public CloudStorageFile objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * The name of the Cloud Storage object for the export file. You can use this value in the [Cloud Storage JSON or XML APIs](https://cloud.google.com/storage/docs/apis).
   * @return objectName
   */
  @javax.annotation.Nullable
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  public CloudStorageFile size(String size) {
    this.size = size;
    return this;
  }

  /**
   * The export file size.
   * @return size
   */
  @javax.annotation.Nullable
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudStorageFile cloudStorageFile = (CloudStorageFile) o;
    return Objects.equals(this.bucketName, cloudStorageFile.bucketName) &&
        Objects.equals(this.md5Hash, cloudStorageFile.md5Hash) &&
        Objects.equals(this.objectName, cloudStorageFile.objectName) &&
        Objects.equals(this.size, cloudStorageFile.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, md5Hash, objectName, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageFile {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    md5Hash: ").append(toIndentedString(md5Hash)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("bucketName");
    openapiFields.add("md5Hash");
    openapiFields.add("objectName");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudStorageFile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudStorageFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudStorageFile is not found in the empty JSON string", CloudStorageFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudStorageFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudStorageFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bucketName") != null && !jsonObj.get("bucketName").isJsonNull()) && !jsonObj.get("bucketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucketName").toString()));
      }
      if ((jsonObj.get("md5Hash") != null && !jsonObj.get("md5Hash").isJsonNull()) && !jsonObj.get("md5Hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5Hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5Hash").toString()));
      }
      if ((jsonObj.get("objectName") != null && !jsonObj.get("objectName").isJsonNull()) && !jsonObj.get("objectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectName").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudStorageFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudStorageFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudStorageFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudStorageFile.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudStorageFile>() {
           @Override
           public void write(JsonWriter out, CloudStorageFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudStorageFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudStorageFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudStorageFile
   * @throws IOException if the JSON string is invalid with respect to CloudStorageFile
   */
  public static CloudStorageFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudStorageFile.class);
  }

  /**
   * Convert an instance of CloudStorageFile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

