/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
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
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1Hash;

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
 * Container message for hashes of byte content of files, used in SourceProvenance messages to verify integrity of source input to the build.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:59.945291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes {
  public static final String SERIALIZED_NAME_FILE_HASH = "fileHash";
  @SerializedName(SERIALIZED_NAME_FILE_HASH)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1Hash> fileHash = new ArrayList<>();

  public ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes fileHash(List<ContaineranalysisGoogleDevtoolsCloudbuildV1Hash> fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes addFileHashItem(ContaineranalysisGoogleDevtoolsCloudbuildV1Hash fileHashItem) {
    if (this.fileHash == null) {
      this.fileHash = new ArrayList<>();
    }
    this.fileHash.add(fileHashItem);
    return this;
  }

  /**
   * Collection of file hashes.
   * @return fileHash
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1Hash> getFileHash() {
    return fileHash;
  }

  public void setFileHash(List<ContaineranalysisGoogleDevtoolsCloudbuildV1Hash> fileHash) {
    this.fileHash = fileHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes containeranalysisGoogleDevtoolsCloudbuildV1FileHashes = (ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes) o;
    return Objects.equals(this.fileHash, containeranalysisGoogleDevtoolsCloudbuildV1FileHashes.fileHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes {\n");
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
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
    openapiFields.add("fileHash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("fileHash") != null && !jsonObj.get("fileHash").isJsonNull()) {
        JsonArray jsonArrayfileHash = jsonObj.getAsJsonArray("fileHash");
        if (jsonArrayfileHash != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fileHash").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fileHash` to be an array in the JSON string but got `%s`", jsonObj.get("fileHash").toString()));
          }

          // validate the optional field `fileHash` (array)
          for (int i = 0; i < jsonArrayfileHash.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1Hash.validateJsonElement(jsonArrayfileHash.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

