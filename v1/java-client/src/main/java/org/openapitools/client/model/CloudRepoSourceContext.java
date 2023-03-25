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
import org.openapitools.client.model.AliasContext;
import org.openapitools.client.model.RepoId;

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
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:53.550882-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloudRepoSourceContext {
  public static final String SERIALIZED_NAME_ALIAS_CONTEXT = "aliasContext";
  @SerializedName(SERIALIZED_NAME_ALIAS_CONTEXT)
  private AliasContext aliasContext;

  public static final String SERIALIZED_NAME_REPO_ID = "repoId";
  @SerializedName(SERIALIZED_NAME_REPO_ID)
  private RepoId repoId;

  public static final String SERIALIZED_NAME_REVISION_ID = "revisionId";
  @SerializedName(SERIALIZED_NAME_REVISION_ID)
  private String revisionId;

  public CloudRepoSourceContext() {
  }

  public CloudRepoSourceContext aliasContext(AliasContext aliasContext) {
    this.aliasContext = aliasContext;
    return this;
  }

  /**
   * Get aliasContext
   * @return aliasContext
   */
  @javax.annotation.Nullable
  public AliasContext getAliasContext() {
    return aliasContext;
  }

  public void setAliasContext(AliasContext aliasContext) {
    this.aliasContext = aliasContext;
  }


  public CloudRepoSourceContext repoId(RepoId repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Get repoId
   * @return repoId
   */
  @javax.annotation.Nullable
  public RepoId getRepoId() {
    return repoId;
  }

  public void setRepoId(RepoId repoId) {
    this.repoId = repoId;
  }


  public CloudRepoSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * A revision ID.
   * @return revisionId
   */
  @javax.annotation.Nullable
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudRepoSourceContext cloudRepoSourceContext = (CloudRepoSourceContext) o;
    return Objects.equals(this.aliasContext, cloudRepoSourceContext.aliasContext) &&
        Objects.equals(this.repoId, cloudRepoSourceContext.repoId) &&
        Objects.equals(this.revisionId, cloudRepoSourceContext.revisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasContext, repoId, revisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRepoSourceContext {\n");
    sb.append("    aliasContext: ").append(toIndentedString(aliasContext)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
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
    openapiFields.add("aliasContext");
    openapiFields.add("repoId");
    openapiFields.add("revisionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudRepoSourceContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudRepoSourceContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRepoSourceContext is not found in the empty JSON string", CloudRepoSourceContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudRepoSourceContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudRepoSourceContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `aliasContext`
      if (jsonObj.get("aliasContext") != null && !jsonObj.get("aliasContext").isJsonNull()) {
        AliasContext.validateJsonElement(jsonObj.get("aliasContext"));
      }
      // validate the optional field `repoId`
      if (jsonObj.get("repoId") != null && !jsonObj.get("repoId").isJsonNull()) {
        RepoId.validateJsonElement(jsonObj.get("repoId"));
      }
      if ((jsonObj.get("revisionId") != null && !jsonObj.get("revisionId").isJsonNull()) && !jsonObj.get("revisionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revisionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revisionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRepoSourceContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRepoSourceContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRepoSourceContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRepoSourceContext.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRepoSourceContext>() {
           @Override
           public void write(JsonWriter out, CloudRepoSourceContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudRepoSourceContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudRepoSourceContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudRepoSourceContext
   * @throws IOException if the JSON string is invalid with respect to CloudRepoSourceContext
   */
  public static CloudRepoSourceContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRepoSourceContext.class);
  }

  /**
   * Convert an instance of CloudRepoSourceContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

