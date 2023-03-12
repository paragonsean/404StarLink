/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
 * Contact: mike.ralphson@gmail.com
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
 * SourceConnectionParametersCodeStar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SourceConnectionParametersCodeStar {
  public static final String SERIALIZED_NAME_CONNECTION_ARN = "ConnectionArn";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ARN)
  private String connectionArn;

  public static final String SERIALIZED_NAME_REPOSITORY = "Repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_BRANCH = "Branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_ARTIFACT_PATH = "ArtifactPath";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_PATH)
  private String artifactPath;

  public SourceConnectionParametersCodeStar() {
  }

  public SourceConnectionParametersCodeStar connectionArn(String connectionArn) {
    this.connectionArn = connectionArn;
    return this;
  }

  /**
   * Get connectionArn
   * @return connectionArn
   */
  @javax.annotation.Nonnull
  public String getConnectionArn() {
    return connectionArn;
  }

  public void setConnectionArn(String connectionArn) {
    this.connectionArn = connectionArn;
  }


  public SourceConnectionParametersCodeStar repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * Get repository
   * @return repository
   */
  @javax.annotation.Nonnull
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }


  public SourceConnectionParametersCodeStar branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
   */
  @javax.annotation.Nonnull
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }


  public SourceConnectionParametersCodeStar artifactPath(String artifactPath) {
    this.artifactPath = artifactPath;
    return this;
  }

  /**
   * Get artifactPath
   * @return artifactPath
   */
  @javax.annotation.Nonnull
  public String getArtifactPath() {
    return artifactPath;
  }

  public void setArtifactPath(String artifactPath) {
    this.artifactPath = artifactPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceConnectionParametersCodeStar sourceConnectionParametersCodeStar = (SourceConnectionParametersCodeStar) o;
    return Objects.equals(this.connectionArn, sourceConnectionParametersCodeStar.connectionArn) &&
        Objects.equals(this.repository, sourceConnectionParametersCodeStar.repository) &&
        Objects.equals(this.branch, sourceConnectionParametersCodeStar.branch) &&
        Objects.equals(this.artifactPath, sourceConnectionParametersCodeStar.artifactPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionArn, repository, branch, artifactPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceConnectionParametersCodeStar {\n");
    sb.append("    connectionArn: ").append(toIndentedString(connectionArn)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    artifactPath: ").append(toIndentedString(artifactPath)).append("\n");
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
    openapiFields.add("ConnectionArn");
    openapiFields.add("Repository");
    openapiFields.add("Branch");
    openapiFields.add("ArtifactPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ConnectionArn");
    openapiRequiredFields.add("Repository");
    openapiRequiredFields.add("Branch");
    openapiRequiredFields.add("ArtifactPath");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SourceConnectionParametersCodeStar
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SourceConnectionParametersCodeStar.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceConnectionParametersCodeStar is not found in the empty JSON string", SourceConnectionParametersCodeStar.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SourceConnectionParametersCodeStar.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceConnectionParametersCodeStar` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SourceConnectionParametersCodeStar.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ConnectionArn`
      String.validateJsonElement(jsonObj.get("ConnectionArn"));
      // validate the required field `Repository`
      String.validateJsonElement(jsonObj.get("Repository"));
      // validate the required field `Branch`
      String.validateJsonElement(jsonObj.get("Branch"));
      // validate the required field `ArtifactPath`
      String.validateJsonElement(jsonObj.get("ArtifactPath"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceConnectionParametersCodeStar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceConnectionParametersCodeStar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceConnectionParametersCodeStar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceConnectionParametersCodeStar.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceConnectionParametersCodeStar>() {
           @Override
           public void write(JsonWriter out, SourceConnectionParametersCodeStar value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceConnectionParametersCodeStar read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SourceConnectionParametersCodeStar given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SourceConnectionParametersCodeStar
   * @throws IOException if the JSON string is invalid with respect to SourceConnectionParametersCodeStar
   */
  public static SourceConnectionParametersCodeStar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceConnectionParametersCodeStar.class);
  }

  /**
   * Convert an instance of SourceConnectionParametersCodeStar to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

