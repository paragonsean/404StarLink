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
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GitSourceContext {
  public static final String SERIALIZED_NAME_REVISION_ID = "revisionId";
  @SerializedName(SERIALIZED_NAME_REVISION_ID)
  private String revisionId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public GitSourceContext() {
  }

  public GitSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Git commit hash.
   * @return revisionId
   */
  @javax.annotation.Nullable
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }


  public GitSourceContext url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Git repository URL.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSourceContext gitSourceContext = (GitSourceContext) o;
    return Objects.equals(this.revisionId, gitSourceContext.revisionId) &&
        Objects.equals(this.url, gitSourceContext.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisionId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSourceContext {\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("revisionId");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GitSourceContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GitSourceContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GitSourceContext is not found in the empty JSON string", GitSourceContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GitSourceContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GitSourceContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("revisionId") != null && !jsonObj.get("revisionId").isJsonNull()) && !jsonObj.get("revisionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revisionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revisionId").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GitSourceContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GitSourceContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GitSourceContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GitSourceContext.class));

       return (TypeAdapter<T>) new TypeAdapter<GitSourceContext>() {
           @Override
           public void write(JsonWriter out, GitSourceContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GitSourceContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GitSourceContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GitSourceContext
   * @throws IOException if the JSON string is invalid with respect to GitSourceContext
   */
  public static GitSourceContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GitSourceContext.class);
  }

  /**
   * Convert an instance of GitSourceContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

