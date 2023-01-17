/*
 * CircleCI REST API
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
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
 * ProjectUsernameProjectTreeBranchPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:26.249361-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProjectUsernameProjectTreeBranchPostRequest {
  public static final String SERIALIZED_NAME_BUILD_PARAMETERS = "build_parameters";
  @SerializedName(SERIALIZED_NAME_BUILD_PARAMETERS)
  private Object buildParameters;

  public static final String SERIALIZED_NAME_PARALLEL = "parallel";
  @SerializedName(SERIALIZED_NAME_PARALLEL)
  private String parallel;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public ProjectUsernameProjectTreeBranchPostRequest() {
  }

  public ProjectUsernameProjectTreeBranchPostRequest buildParameters(Object buildParameters) {
    this.buildParameters = buildParameters;
    return this;
  }

  /**
   * Additional environment variables to inject into the build environment. A map of names to values. 
   * @return buildParameters
   */
  @javax.annotation.Nullable
  public Object getBuildParameters() {
    return buildParameters;
  }

  public void setBuildParameters(Object buildParameters) {
    this.buildParameters = buildParameters;
  }


  public ProjectUsernameProjectTreeBranchPostRequest parallel(String parallel) {
    this.parallel = parallel;
    return this;
  }

  /**
   * The number of containers to use to run the build. Default is null and the project default is used. 
   * @return parallel
   */
  @javax.annotation.Nullable
  public String getParallel() {
    return parallel;
  }

  public void setParallel(String parallel) {
    this.parallel = parallel;
  }


  public ProjectUsernameProjectTreeBranchPostRequest revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter. 
   * @return revision
   */
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUsernameProjectTreeBranchPostRequest projectUsernameProjectTreeBranchPostRequest = (ProjectUsernameProjectTreeBranchPostRequest) o;
    return Objects.equals(this.buildParameters, projectUsernameProjectTreeBranchPostRequest.buildParameters) &&
        Objects.equals(this.parallel, projectUsernameProjectTreeBranchPostRequest.parallel) &&
        Objects.equals(this.revision, projectUsernameProjectTreeBranchPostRequest.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildParameters, parallel, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUsernameProjectTreeBranchPostRequest {\n");
    sb.append("    buildParameters: ").append(toIndentedString(buildParameters)).append("\n");
    sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
    openapiFields.add("build_parameters");
    openapiFields.add("parallel");
    openapiFields.add("revision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectUsernameProjectTreeBranchPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectUsernameProjectTreeBranchPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectUsernameProjectTreeBranchPostRequest is not found in the empty JSON string", ProjectUsernameProjectTreeBranchPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectUsernameProjectTreeBranchPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectUsernameProjectTreeBranchPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parallel") != null && !jsonObj.get("parallel").isJsonNull()) && !jsonObj.get("parallel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parallel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parallel").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUsernameProjectTreeBranchPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUsernameProjectTreeBranchPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUsernameProjectTreeBranchPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUsernameProjectTreeBranchPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUsernameProjectTreeBranchPostRequest>() {
           @Override
           public void write(JsonWriter out, ProjectUsernameProjectTreeBranchPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUsernameProjectTreeBranchPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectUsernameProjectTreeBranchPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectUsernameProjectTreeBranchPostRequest
   * @throws IOException if the JSON string is invalid with respect to ProjectUsernameProjectTreeBranchPostRequest
   */
  public static ProjectUsernameProjectTreeBranchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUsernameProjectTreeBranchPostRequest.class);
  }

  /**
   * Convert an instance of ProjectUsernameProjectTreeBranchPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

