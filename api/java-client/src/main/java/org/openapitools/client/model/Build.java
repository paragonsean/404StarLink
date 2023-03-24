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
import org.openapitools.client.model.BuildSignature;

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
 * Note holding the version of the provider&#39;s builder and the signature of the provenance message in the build details occurrence.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:49.449403-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Build {
  public static final String SERIALIZED_NAME_BUILDER_VERSION = "builderVersion";
  @SerializedName(SERIALIZED_NAME_BUILDER_VERSION)
  private String builderVersion;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private BuildSignature signature;

  public Build() {
  }

  public Build builderVersion(String builderVersion) {
    this.builderVersion = builderVersion;
    return this;
  }

  /**
   * Required. Immutable. Version of the builder which produced this build.
   * @return builderVersion
   */
  @javax.annotation.Nullable
  public String getBuilderVersion() {
    return builderVersion;
  }

  public void setBuilderVersion(String builderVersion) {
    this.builderVersion = builderVersion;
  }


  public Build signature(BuildSignature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nullable
  public BuildSignature getSignature() {
    return signature;
  }

  public void setSignature(BuildSignature signature) {
    this.signature = signature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Build build = (Build) o;
    return Objects.equals(this.builderVersion, build.builderVersion) &&
        Objects.equals(this.signature, build.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builderVersion, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Build {\n");
    sb.append("    builderVersion: ").append(toIndentedString(builderVersion)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("builderVersion");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Build
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Build.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Build is not found in the empty JSON string", Build.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Build.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Build` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("builderVersion") != null && !jsonObj.get("builderVersion").isJsonNull()) && !jsonObj.get("builderVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builderVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builderVersion").toString()));
      }
      // validate the optional field `signature`
      if (jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) {
        BuildSignature.validateJsonElement(jsonObj.get("signature"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Build.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Build' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Build> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Build.class));

       return (TypeAdapter<T>) new TypeAdapter<Build>() {
           @Override
           public void write(JsonWriter out, Build value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Build read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Build given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Build
   * @throws IOException if the JSON string is invalid with respect to Build
   */
  public static Build fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Build.class);
  }

  /**
   * Convert an instance of Build to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

