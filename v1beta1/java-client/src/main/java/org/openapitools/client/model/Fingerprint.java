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
import java.util.ArrayList;
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
 * A set of properties that uniquely identify a given Docker image.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:01.336252-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Fingerprint {
  public static final String SERIALIZED_NAME_V1_NAME = "v1Name";
  @SerializedName(SERIALIZED_NAME_V1_NAME)
  private String v1Name;

  public static final String SERIALIZED_NAME_V2_BLOB = "v2Blob";
  @SerializedName(SERIALIZED_NAME_V2_BLOB)
  private List<String> v2Blob = new ArrayList<>();

  public static final String SERIALIZED_NAME_V2_NAME = "v2Name";
  @SerializedName(SERIALIZED_NAME_V2_NAME)
  private String v2Name;

  public Fingerprint() {
  }

  public Fingerprint v1Name(String v1Name) {
    this.v1Name = v1Name;
    return this;
  }

  /**
   * Required. The layer ID of the final layer in the Docker image&#39;s v1 representation.
   * @return v1Name
   */
  @javax.annotation.Nullable
  public String getV1Name() {
    return v1Name;
  }

  public void setV1Name(String v1Name) {
    this.v1Name = v1Name;
  }


  public Fingerprint v2Blob(List<String> v2Blob) {
    this.v2Blob = v2Blob;
    return this;
  }

  public Fingerprint addV2BlobItem(String v2BlobItem) {
    if (this.v2Blob == null) {
      this.v2Blob = new ArrayList<>();
    }
    this.v2Blob.add(v2BlobItem);
    return this;
  }

  /**
   * Required. The ordered list of v2 blobs that represent a given image.
   * @return v2Blob
   */
  @javax.annotation.Nullable
  public List<String> getV2Blob() {
    return v2Blob;
  }

  public void setV2Blob(List<String> v2Blob) {
    this.v2Blob = v2Blob;
  }


  public Fingerprint v2Name(String v2Name) {
    this.v2Name = v2Name;
    return this;
  }

  /**
   * Output only. The name of the image&#39;s v2 blobs computed via: [bottom] :&#x3D; v2_blobbottom :&#x3D; sha256(v2_blob[N] + \&quot; \&quot; + v2_name[N+1]) Only the name of the final blob is kept.
   * @return v2Name
   */
  @javax.annotation.Nullable
  public String getV2Name() {
    return v2Name;
  }

  public void setV2Name(String v2Name) {
    this.v2Name = v2Name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fingerprint fingerprint = (Fingerprint) o;
    return Objects.equals(this.v1Name, fingerprint.v1Name) &&
        Objects.equals(this.v2Blob, fingerprint.v2Blob) &&
        Objects.equals(this.v2Name, fingerprint.v2Name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v1Name, v2Blob, v2Name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fingerprint {\n");
    sb.append("    v1Name: ").append(toIndentedString(v1Name)).append("\n");
    sb.append("    v2Blob: ").append(toIndentedString(v2Blob)).append("\n");
    sb.append("    v2Name: ").append(toIndentedString(v2Name)).append("\n");
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
    openapiFields.add("v1Name");
    openapiFields.add("v2Blob");
    openapiFields.add("v2Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Fingerprint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Fingerprint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Fingerprint is not found in the empty JSON string", Fingerprint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Fingerprint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Fingerprint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("v1Name") != null && !jsonObj.get("v1Name").isJsonNull()) && !jsonObj.get("v1Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `v1Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("v1Name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("v2Blob") != null && !jsonObj.get("v2Blob").isJsonNull() && !jsonObj.get("v2Blob").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `v2Blob` to be an array in the JSON string but got `%s`", jsonObj.get("v2Blob").toString()));
      }
      if ((jsonObj.get("v2Name") != null && !jsonObj.get("v2Name").isJsonNull()) && !jsonObj.get("v2Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `v2Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("v2Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Fingerprint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Fingerprint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Fingerprint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Fingerprint.class));

       return (TypeAdapter<T>) new TypeAdapter<Fingerprint>() {
           @Override
           public void write(JsonWriter out, Fingerprint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Fingerprint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Fingerprint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Fingerprint
   * @throws IOException if the JSON string is invalid with respect to Fingerprint
   */
  public static Fingerprint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Fingerprint.class);
  }

  /**
   * Convert an instance of Fingerprint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

