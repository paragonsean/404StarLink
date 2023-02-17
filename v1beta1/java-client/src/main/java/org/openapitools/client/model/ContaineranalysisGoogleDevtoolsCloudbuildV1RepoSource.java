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
import java.util.HashMap;
import java.util.Map;

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
 * Location of the source in a Google Cloud Source Repository.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:08.153528-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource {
  public static final String SERIALIZED_NAME_BRANCH_NAME = "branchName";
  @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
  private String branchName;

  public static final String SERIALIZED_NAME_COMMIT_SHA = "commitSha";
  @SerializedName(SERIALIZED_NAME_COMMIT_SHA)
  private String commitSha;

  public static final String SERIALIZED_NAME_DIR = "dir";
  @SerializedName(SERIALIZED_NAME_DIR)
  private String dir;

  public static final String SERIALIZED_NAME_INVERT_REGEX = "invertRegex";
  @SerializedName(SERIALIZED_NAME_INVERT_REGEX)
  private Boolean invertRegex;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_REPO_NAME = "repoName";
  @SerializedName(SERIALIZED_NAME_REPO_NAME)
  private String repoName;

  public static final String SERIALIZED_NAME_SUBSTITUTIONS = "substitutions";
  @SerializedName(SERIALIZED_NAME_SUBSTITUTIONS)
  private Map<String, String> substitutions = new HashMap<>();

  public static final String SERIALIZED_NAME_TAG_NAME = "tagName";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * @return branchName
   */
  @javax.annotation.Nullable
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * Explicit commit SHA to build.
   * @return commitSha
   */
  @javax.annotation.Nullable
  public String getCommitSha() {
    return commitSha;
  }

  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource dir(String dir) {
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


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource invertRegex(Boolean invertRegex) {
    this.invertRegex = invertRegex;
    return this;
  }

  /**
   * Only trigger a build if the revision regex does NOT match the revision regex.
   * @return invertRegex
   */
  @javax.annotation.Nullable
  public Boolean getInvertRegex() {
    return invertRegex;
  }

  public void setInvertRegex(Boolean invertRegex) {
    this.invertRegex = invertRegex;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  /**
   * Name of the Cloud Source Repository.
   * @return repoName
   */
  @javax.annotation.Nullable
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource substitutions(Map<String, String> substitutions) {
    this.substitutions = substitutions;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource putSubstitutionsItem(String key, String substitutionsItem) {
    if (this.substitutions == null) {
      this.substitutions = new HashMap<>();
    }
    this.substitutions.put(key, substitutionsItem);
    return this;
  }

  /**
   * Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
   * @return substitutions
   */
  @javax.annotation.Nullable
  public Map<String, String> getSubstitutions() {
    return substitutions;
  }

  public void setSubstitutions(Map<String, String> substitutions) {
    this.substitutions = substitutions;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  /**
   * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * @return tagName
   */
  @javax.annotation.Nullable
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource containeranalysisGoogleDevtoolsCloudbuildV1RepoSource = (ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource) o;
    return Objects.equals(this.branchName, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.branchName) &&
        Objects.equals(this.commitSha, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.commitSha) &&
        Objects.equals(this.dir, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.dir) &&
        Objects.equals(this.invertRegex, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.invertRegex) &&
        Objects.equals(this.projectId, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.projectId) &&
        Objects.equals(this.repoName, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.repoName) &&
        Objects.equals(this.substitutions, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.substitutions) &&
        Objects.equals(this.tagName, containeranalysisGoogleDevtoolsCloudbuildV1RepoSource.tagName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, commitSha, dir, invertRegex, projectId, repoName, substitutions, tagName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource {\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    invertRegex: ").append(toIndentedString(invertRegex)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    substitutions: ").append(toIndentedString(substitutions)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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
    openapiFields.add("branchName");
    openapiFields.add("commitSha");
    openapiFields.add("dir");
    openapiFields.add("invertRegex");
    openapiFields.add("projectId");
    openapiFields.add("repoName");
    openapiFields.add("substitutions");
    openapiFields.add("tagName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("branchName") != null && !jsonObj.get("branchName").isJsonNull()) && !jsonObj.get("branchName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branchName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branchName").toString()));
      }
      if ((jsonObj.get("commitSha") != null && !jsonObj.get("commitSha").isJsonNull()) && !jsonObj.get("commitSha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitSha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commitSha").toString()));
      }
      if ((jsonObj.get("dir") != null && !jsonObj.get("dir").isJsonNull()) && !jsonObj.get("dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dir").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("repoName") != null && !jsonObj.get("repoName").isJsonNull()) && !jsonObj.get("repoName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repoName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repoName").toString()));
      }
      if ((jsonObj.get("tagName") != null && !jsonObj.get("tagName").isJsonNull()) && !jsonObj.get("tagName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

