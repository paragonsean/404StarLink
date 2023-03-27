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
import org.openapitools.client.model.CloudRepoSourceContext;
import org.openapitools.client.model.GerritSourceContext;
import org.openapitools.client.model.GitSourceContext;

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
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:01.336252-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SourceContext {
  public static final String SERIALIZED_NAME_CLOUD_REPO = "cloudRepo";
  @SerializedName(SERIALIZED_NAME_CLOUD_REPO)
  private CloudRepoSourceContext cloudRepo;

  public static final String SERIALIZED_NAME_GERRIT = "gerrit";
  @SerializedName(SERIALIZED_NAME_GERRIT)
  private GerritSourceContext gerrit;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private GitSourceContext git;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public SourceContext() {
  }

  public SourceContext cloudRepo(CloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
    return this;
  }

  /**
   * Get cloudRepo
   * @return cloudRepo
   */
  @javax.annotation.Nullable
  public CloudRepoSourceContext getCloudRepo() {
    return cloudRepo;
  }

  public void setCloudRepo(CloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
  }


  public SourceContext gerrit(GerritSourceContext gerrit) {
    this.gerrit = gerrit;
    return this;
  }

  /**
   * Get gerrit
   * @return gerrit
   */
  @javax.annotation.Nullable
  public GerritSourceContext getGerrit() {
    return gerrit;
  }

  public void setGerrit(GerritSourceContext gerrit) {
    this.gerrit = gerrit;
  }


  public SourceContext git(GitSourceContext git) {
    this.git = git;
    return this;
  }

  /**
   * Get git
   * @return git
   */
  @javax.annotation.Nullable
  public GitSourceContext getGit() {
    return git;
  }

  public void setGit(GitSourceContext git) {
    this.git = git;
  }


  public SourceContext labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SourceContext putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels with user defined metadata.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceContext sourceContext = (SourceContext) o;
    return Objects.equals(this.cloudRepo, sourceContext.cloudRepo) &&
        Objects.equals(this.gerrit, sourceContext.gerrit) &&
        Objects.equals(this.git, sourceContext.git) &&
        Objects.equals(this.labels, sourceContext.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudRepo, gerrit, git, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceContext {\n");
    sb.append("    cloudRepo: ").append(toIndentedString(cloudRepo)).append("\n");
    sb.append("    gerrit: ").append(toIndentedString(gerrit)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("cloudRepo");
    openapiFields.add("gerrit");
    openapiFields.add("git");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SourceContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SourceContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceContext is not found in the empty JSON string", SourceContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SourceContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cloudRepo`
      if (jsonObj.get("cloudRepo") != null && !jsonObj.get("cloudRepo").isJsonNull()) {
        CloudRepoSourceContext.validateJsonElement(jsonObj.get("cloudRepo"));
      }
      // validate the optional field `gerrit`
      if (jsonObj.get("gerrit") != null && !jsonObj.get("gerrit").isJsonNull()) {
        GerritSourceContext.validateJsonElement(jsonObj.get("gerrit"));
      }
      // validate the optional field `git`
      if (jsonObj.get("git") != null && !jsonObj.get("git").isJsonNull()) {
        GitSourceContext.validateJsonElement(jsonObj.get("git"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceContext.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceContext>() {
           @Override
           public void write(JsonWriter out, SourceContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SourceContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SourceContext
   * @throws IOException if the JSON string is invalid with respect to SourceContext
   */
  public static SourceContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceContext.class);
  }

  /**
   * Convert an instance of SourceContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

