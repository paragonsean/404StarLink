/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
 * Location of the source manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:01.336252-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest {
  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_GENERATION = "generation";
  @SerializedName(SERIALIZED_NAME_GENERATION)
  private String generation;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @return bucket
   */
  @javax.annotation.Nullable
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest generation(String generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
   * @return generation
   */
  @javax.annotation.Nullable
  public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Google Cloud Storage object containing the source manifest. This object must be a JSON file.
   * @return _object
   */
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest containeranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest = (ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest) o;
    return Objects.equals(this.bucket, containeranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.bucket) &&
        Objects.equals(this.generation, containeranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.generation) &&
        Objects.equals(this._object, containeranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, generation, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("bucket");
    openapiFields.add("generation");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bucket") != null && !jsonObj.get("bucket").isJsonNull()) && !jsonObj.get("bucket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucket").toString()));
      }
      if ((jsonObj.get("generation") != null && !jsonObj.get("generation").isJsonNull()) && !jsonObj.get("generation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generation").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

