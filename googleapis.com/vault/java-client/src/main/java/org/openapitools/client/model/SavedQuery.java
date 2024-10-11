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
 * The definition of a saved query. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SavedQuery {
  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_MATTER_ID = "matterId";
  @SerializedName(SERIALIZED_NAME_MATTER_ID)
  private String matterId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Query query;

  public static final String SERIALIZED_NAME_SAVED_QUERY_ID = "savedQueryId";
  @SerializedName(SERIALIZED_NAME_SAVED_QUERY_ID)
  private String savedQueryId;

  public SavedQuery() {
  }

  public SavedQuery createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The server-generated timestamp when the saved query was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public SavedQuery displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The name of the saved query.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SavedQuery matterId(String matterId) {
    this.matterId = matterId;
    return this;
  }

  /**
   * Output only. The matter ID of the matter the saved query is saved in. The server does not use this field during create and always uses matter ID in the URL.
   * @return matterId
   */
  @javax.annotation.Nullable
  public String getMatterId() {
    return matterId;
  }

  public void setMatterId(String matterId) {
    this.matterId = matterId;
  }


  public SavedQuery query(Query query) {
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


  public SavedQuery savedQueryId(String savedQueryId) {
    this.savedQueryId = savedQueryId;
    return this;
  }

  /**
   * A unique identifier for the saved query.
   * @return savedQueryId
   */
  @javax.annotation.Nullable
  public String getSavedQueryId() {
    return savedQueryId;
  }

  public void setSavedQueryId(String savedQueryId) {
    this.savedQueryId = savedQueryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedQuery savedQuery = (SavedQuery) o;
    return Objects.equals(this.createTime, savedQuery.createTime) &&
        Objects.equals(this.displayName, savedQuery.displayName) &&
        Objects.equals(this.matterId, savedQuery.matterId) &&
        Objects.equals(this.query, savedQuery.query) &&
        Objects.equals(this.savedQueryId, savedQuery.savedQueryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, displayName, matterId, query, savedQueryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedQuery {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    matterId: ").append(toIndentedString(matterId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    savedQueryId: ").append(toIndentedString(savedQueryId)).append("\n");
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
    openapiFields.add("createTime");
    openapiFields.add("displayName");
    openapiFields.add("matterId");
    openapiFields.add("query");
    openapiFields.add("savedQueryId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SavedQuery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SavedQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SavedQuery is not found in the empty JSON string", SavedQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SavedQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SavedQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("matterId") != null && !jsonObj.get("matterId").isJsonNull()) && !jsonObj.get("matterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matterId").toString()));
      }
      // validate the optional field `query`
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) {
        Query.validateJsonElement(jsonObj.get("query"));
      }
      if ((jsonObj.get("savedQueryId") != null && !jsonObj.get("savedQueryId").isJsonNull()) && !jsonObj.get("savedQueryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `savedQueryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("savedQueryId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SavedQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SavedQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SavedQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SavedQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<SavedQuery>() {
           @Override
           public void write(JsonWriter out, SavedQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SavedQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SavedQuery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SavedQuery
   * @throws IOException if the JSON string is invalid with respect to SavedQuery
   */
  public static SavedQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SavedQuery.class);
  }

  /**
   * Convert an instance of SavedQuery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

