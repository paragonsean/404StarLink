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
 * Selects a repo using a Google Cloud Platform project ID (e.g., winged-cargo-31) and a repo name within that project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:53.550882-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProjectRepoId {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_REPO_NAME = "repoName";
  @SerializedName(SERIALIZED_NAME_REPO_NAME)
  private String repoName;

  public ProjectRepoId() {
  }

  public ProjectRepoId projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ProjectRepoId repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  /**
   * The name of the repo. Leave empty for the default repo.
   * @return repoName
   */
  @javax.annotation.Nullable
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRepoId projectRepoId = (ProjectRepoId) o;
    return Objects.equals(this.projectId, projectRepoId.projectId) &&
        Objects.equals(this.repoName, projectRepoId.repoName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, repoName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRepoId {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("repoName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectRepoId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectRepoId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectRepoId is not found in the empty JSON string", ProjectRepoId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectRepoId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectRepoId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("repoName") != null && !jsonObj.get("repoName").isJsonNull()) && !jsonObj.get("repoName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repoName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repoName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectRepoId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectRepoId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectRepoId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectRepoId.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectRepoId>() {
           @Override
           public void write(JsonWriter out, ProjectRepoId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectRepoId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectRepoId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectRepoId
   * @throws IOException if the JSON string is invalid with respect to ProjectRepoId
   */
  public static ProjectRepoId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectRepoId.class);
  }

  /**
   * Convert an instance of ProjectRepoId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

