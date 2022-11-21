/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ApiV1ReportsPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:27.417956-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV1ReportsPostRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_FORWARD = "forward";
  @SerializedName(SERIALIZED_NAME_FORWARD)
  private Boolean forward;

  public static final String SERIALIZED_NAME_STATUS_IDS = "status_ids";
  @SerializedName(SERIALIZED_NAME_STATUS_IDS)
  private List<String> statusIds = new ArrayList<>();

  public ApiV1ReportsPostRequest() {
  }

  public ApiV1ReportsPostRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account to report
   * @return accountId
   */
  @javax.annotation.Nonnull
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ApiV1ReportsPostRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Reason for the report (default max 1000 characters)
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public ApiV1ReportsPostRequest forward(Boolean forward) {
    this.forward = forward;
    return this;
  }

  /**
   * If the account is remote, should the report be forwarded to the remote admin?
   * @return forward
   */
  @javax.annotation.Nullable
  public Boolean getForward() {
    return forward;
  }

  public void setForward(Boolean forward) {
    this.forward = forward;
  }


  public ApiV1ReportsPostRequest statusIds(List<String> statusIds) {
    this.statusIds = statusIds;
    return this;
  }

  public ApiV1ReportsPostRequest addStatusIdsItem(String statusIdsItem) {
    if (this.statusIds == null) {
      this.statusIds = new ArrayList<>();
    }
    this.statusIds.add(statusIdsItem);
    return this;
  }

  /**
   * Array of Statuses to attach to the report, for context
   * @return statusIds
   */
  @javax.annotation.Nullable
  public List<String> getStatusIds() {
    return statusIds;
  }

  public void setStatusIds(List<String> statusIds) {
    this.statusIds = statusIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ReportsPostRequest apiV1ReportsPostRequest = (ApiV1ReportsPostRequest) o;
    return Objects.equals(this.accountId, apiV1ReportsPostRequest.accountId) &&
        Objects.equals(this.comment, apiV1ReportsPostRequest.comment) &&
        Objects.equals(this.forward, apiV1ReportsPostRequest.forward) &&
        Objects.equals(this.statusIds, apiV1ReportsPostRequest.statusIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, comment, forward, statusIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ReportsPostRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    forward: ").append(toIndentedString(forward)).append("\n");
    sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("comment");
    openapiFields.add("forward");
    openapiFields.add("status_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV1ReportsPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1ReportsPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1ReportsPostRequest is not found in the empty JSON string", ApiV1ReportsPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV1ReportsPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1ReportsPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV1ReportsPostRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status_ids") != null && !jsonObj.get("status_ids").isJsonNull() && !jsonObj.get("status_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_ids` to be an array in the JSON string but got `%s`", jsonObj.get("status_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1ReportsPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1ReportsPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1ReportsPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1ReportsPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1ReportsPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1ReportsPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1ReportsPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV1ReportsPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV1ReportsPostRequest
   * @throws IOException if the JSON string is invalid with respect to ApiV1ReportsPostRequest
   */
  public static ApiV1ReportsPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1ReportsPostRequest.class);
  }

  /**
   * Convert an instance of ApiV1ReportsPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

