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
 * A SourceContext referring to a Gerrit project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:53.550882-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GerritSourceContext {
  public static final String SERIALIZED_NAME_ALIAS_CONTEXT = "aliasContext";
  @SerializedName(SERIALIZED_NAME_ALIAS_CONTEXT)
  private AliasContext aliasContext;

  public static final String SERIALIZED_NAME_GERRIT_PROJECT = "gerritProject";
  @SerializedName(SERIALIZED_NAME_GERRIT_PROJECT)
  private String gerritProject;

  public static final String SERIALIZED_NAME_HOST_URI = "hostUri";
  @SerializedName(SERIALIZED_NAME_HOST_URI)
  private String hostUri;

  public static final String SERIALIZED_NAME_REVISION_ID = "revisionId";
  @SerializedName(SERIALIZED_NAME_REVISION_ID)
  private String revisionId;

  public GerritSourceContext() {
  }

  public GerritSourceContext aliasContext(AliasContext aliasContext) {
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


  public GerritSourceContext gerritProject(String gerritProject) {
    this.gerritProject = gerritProject;
    return this;
  }

  /**
   * The full project name within the host. Projects may be nested, so \&quot;project/subproject\&quot; is a valid project name. The \&quot;repo name\&quot; is the hostURI/project.
   * @return gerritProject
   */
  @javax.annotation.Nullable
  public String getGerritProject() {
    return gerritProject;
  }

  public void setGerritProject(String gerritProject) {
    this.gerritProject = gerritProject;
  }


  public GerritSourceContext hostUri(String hostUri) {
    this.hostUri = hostUri;
    return this;
  }

  /**
   * The URI of a running Gerrit instance.
   * @return hostUri
   */
  @javax.annotation.Nullable
  public String getHostUri() {
    return hostUri;
  }

  public void setHostUri(String hostUri) {
    this.hostUri = hostUri;
  }


  public GerritSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * A revision (commit) ID.
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
    GerritSourceContext gerritSourceContext = (GerritSourceContext) o;
    return Objects.equals(this.aliasContext, gerritSourceContext.aliasContext) &&
        Objects.equals(this.gerritProject, gerritSourceContext.gerritProject) &&
        Objects.equals(this.hostUri, gerritSourceContext.hostUri) &&
        Objects.equals(this.revisionId, gerritSourceContext.revisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasContext, gerritProject, hostUri, revisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GerritSourceContext {\n");
    sb.append("    aliasContext: ").append(toIndentedString(aliasContext)).append("\n");
    sb.append("    gerritProject: ").append(toIndentedString(gerritProject)).append("\n");
    sb.append("    hostUri: ").append(toIndentedString(hostUri)).append("\n");
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
    openapiFields.add("gerritProject");
    openapiFields.add("hostUri");
    openapiFields.add("revisionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GerritSourceContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GerritSourceContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GerritSourceContext is not found in the empty JSON string", GerritSourceContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GerritSourceContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GerritSourceContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `aliasContext`
      if (jsonObj.get("aliasContext") != null && !jsonObj.get("aliasContext").isJsonNull()) {
        AliasContext.validateJsonElement(jsonObj.get("aliasContext"));
      }
      if ((jsonObj.get("gerritProject") != null && !jsonObj.get("gerritProject").isJsonNull()) && !jsonObj.get("gerritProject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gerritProject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gerritProject").toString()));
      }
      if ((jsonObj.get("hostUri") != null && !jsonObj.get("hostUri").isJsonNull()) && !jsonObj.get("hostUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostUri").toString()));
      }
      if ((jsonObj.get("revisionId") != null && !jsonObj.get("revisionId").isJsonNull()) && !jsonObj.get("revisionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revisionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revisionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GerritSourceContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GerritSourceContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GerritSourceContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GerritSourceContext.class));

       return (TypeAdapter<T>) new TypeAdapter<GerritSourceContext>() {
           @Override
           public void write(JsonWriter out, GerritSourceContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GerritSourceContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GerritSourceContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GerritSourceContext
   * @throws IOException if the JSON string is invalid with respect to GerritSourceContext
   */
  public static GerritSourceContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GerritSourceContext.class);
  }

  /**
   * Convert an instance of GerritSourceContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

