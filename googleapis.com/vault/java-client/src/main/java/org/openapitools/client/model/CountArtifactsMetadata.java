/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
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
import org.openapitools.client.model.Query;

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
 * Long running operation metadata for CountArtifacts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CountArtifactsMetadata {
  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_MATTER_ID = "matterId";
  @SerializedName(SERIALIZED_NAME_MATTER_ID)
  private String matterId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Query query;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public CountArtifactsMetadata() {
  }

  public CountArtifactsMetadata endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time of count operation. Available when operation is done.
   * @return endTime
   */
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public CountArtifactsMetadata matterId(String matterId) {
    this.matterId = matterId;
    return this;
  }

  /**
   * The matter ID of the associated matter.
   * @return matterId
   */
  @javax.annotation.Nullable
  public String getMatterId() {
    return matterId;
  }

  public void setMatterId(String matterId) {
    this.matterId = matterId;
  }


  public CountArtifactsMetadata query(Query query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public Query getQuery() {
    return query;
  }

  public void setQuery(Query query) {
    this.query = query;
  }


  public CountArtifactsMetadata startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Creation time of count operation.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountArtifactsMetadata countArtifactsMetadata = (CountArtifactsMetadata) o;
    return Objects.equals(this.endTime, countArtifactsMetadata.endTime) &&
        Objects.equals(this.matterId, countArtifactsMetadata.matterId) &&
        Objects.equals(this.query, countArtifactsMetadata.query) &&
        Objects.equals(this.startTime, countArtifactsMetadata.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, matterId, query, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountArtifactsMetadata {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    matterId: ").append(toIndentedString(matterId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("endTime");
    openapiFields.add("matterId");
    openapiFields.add("query");
    openapiFields.add("startTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CountArtifactsMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CountArtifactsMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CountArtifactsMetadata is not found in the empty JSON string", CountArtifactsMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CountArtifactsMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CountArtifactsMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if ((jsonObj.get("matterId") != null && !jsonObj.get("matterId").isJsonNull()) && !jsonObj.get("matterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matterId").toString()));
      }
      // validate the optional field `query`
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) {
        Query.validateJsonElement(jsonObj.get("query"));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CountArtifactsMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CountArtifactsMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CountArtifactsMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CountArtifactsMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CountArtifactsMetadata>() {
           @Override
           public void write(JsonWriter out, CountArtifactsMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CountArtifactsMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CountArtifactsMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CountArtifactsMetadata
   * @throws IOException if the JSON string is invalid with respect to CountArtifactsMetadata
   */
  public static CountArtifactsMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CountArtifactsMetadata.class);
  }

  /**
   * Convert an instance of CountArtifactsMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

