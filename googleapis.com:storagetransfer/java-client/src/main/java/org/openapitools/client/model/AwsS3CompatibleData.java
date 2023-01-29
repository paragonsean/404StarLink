/*
 * Storage Transfer API
 * Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 
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
import org.openapitools.client.model.S3CompatibleMetadata;

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
 * An AwsS3CompatibleData resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:07.190451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsS3CompatibleData {
  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucketName";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  private String bucketName;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_S3_METADATA = "s3Metadata";
  @SerializedName(SERIALIZED_NAME_S3_METADATA)
  private S3CompatibleMetadata s3Metadata;

  public AwsS3CompatibleData() {
  }

  public AwsS3CompatibleData bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Required. Specifies the name of the bucket.
   * @return bucketName
   */
  @javax.annotation.Nullable
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  public AwsS3CompatibleData endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Required. Specifies the endpoint of the storage service.
   * @return endpoint
   */
  @javax.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public AwsS3CompatibleData path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Specifies the root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public AwsS3CompatibleData region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Specifies the region to sign requests with. This can be left blank if requests should be signed with an empty region.
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public AwsS3CompatibleData s3Metadata(S3CompatibleMetadata s3Metadata) {
    this.s3Metadata = s3Metadata;
    return this;
  }

  /**
   * Get s3Metadata
   * @return s3Metadata
   */
  @javax.annotation.Nullable
  public S3CompatibleMetadata getS3Metadata() {
    return s3Metadata;
  }

  public void setS3Metadata(S3CompatibleMetadata s3Metadata) {
    this.s3Metadata = s3Metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsS3CompatibleData awsS3CompatibleData = (AwsS3CompatibleData) o;
    return Objects.equals(this.bucketName, awsS3CompatibleData.bucketName) &&
        Objects.equals(this.endpoint, awsS3CompatibleData.endpoint) &&
        Objects.equals(this.path, awsS3CompatibleData.path) &&
        Objects.equals(this.region, awsS3CompatibleData.region) &&
        Objects.equals(this.s3Metadata, awsS3CompatibleData.s3Metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, endpoint, path, region, s3Metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsS3CompatibleData {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    s3Metadata: ").append(toIndentedString(s3Metadata)).append("\n");
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
    openapiFields.add("endpoint");
    openapiFields.add("path");
    openapiFields.add("region");
    openapiFields.add("s3Metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsS3CompatibleData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsS3CompatibleData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsS3CompatibleData is not found in the empty JSON string", AwsS3CompatibleData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsS3CompatibleData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsS3CompatibleData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bucketName") != null && !jsonObj.get("bucketName").isJsonNull()) && !jsonObj.get("bucketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucketName").toString()));
      }
      if ((jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      // validate the optional field `s3Metadata`
      if (jsonObj.get("s3Metadata") != null && !jsonObj.get("s3Metadata").isJsonNull()) {
        S3CompatibleMetadata.validateJsonElement(jsonObj.get("s3Metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsS3CompatibleData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsS3CompatibleData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsS3CompatibleData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsS3CompatibleData.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsS3CompatibleData>() {
           @Override
           public void write(JsonWriter out, AwsS3CompatibleData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsS3CompatibleData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsS3CompatibleData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsS3CompatibleData
   * @throws IOException if the JSON string is invalid with respect to AwsS3CompatibleData
   */
  public static AwsS3CompatibleData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsS3CompatibleData.class);
  }

  /**
   * Convert an instance of AwsS3CompatibleData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

