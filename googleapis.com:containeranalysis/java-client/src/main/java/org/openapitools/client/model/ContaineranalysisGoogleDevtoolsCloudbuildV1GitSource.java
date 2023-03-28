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
 * Location of the source in any accessible Git repository.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:05.225194-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource {
  public static final String SERIALIZED_NAME_DIR = "dir";
  @SerializedName(SERIALIZED_NAME_DIR)
  private String dir;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource dir(String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s &#x60;dir&#x60; is specified and is an absolute path, this value is ignored for that step&#39;s execution.
   * @return dir
   */
  @javax.annotation.Nullable
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The revision to fetch from the Git repository such as a branch, a tag, a commit SHA, or any Git ref. Cloud Build uses &#x60;git fetch&#x60; to fetch the revision from the Git repository; therefore make sure that the string you provide for &#x60;revision&#x60; is parsable by the command. For information on string values accepted by &#x60;git fetch&#x60;, see https://git-scm.com/docs/gitrevisions#_specifying_revisions. For information on &#x60;git fetch&#x60;, see https://git-scm.com/docs/git-fetch.
   * @return revision
   */
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Location of the Git repo to build. This will be used as a &#x60;git remote&#x60;, see https://git-scm.com/docs/git-remote.
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
    ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource containeranalysisGoogleDevtoolsCloudbuildV1GitSource = (ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource) o;
    return Objects.equals(this.dir, containeranalysisGoogleDevtoolsCloudbuildV1GitSource.dir) &&
        Objects.equals(this.revision, containeranalysisGoogleDevtoolsCloudbuildV1GitSource.revision) &&
        Objects.equals(this.url, containeranalysisGoogleDevtoolsCloudbuildV1GitSource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dir, revision, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource {\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
    openapiFields.add("dir");
    openapiFields.add("revision");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dir") != null && !jsonObj.get("dir").isJsonNull()) && !jsonObj.get("dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dir").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

