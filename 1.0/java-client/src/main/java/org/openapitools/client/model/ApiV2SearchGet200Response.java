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
import org.openapitools.client.model.Account;
import org.openapitools.client.model.Status;
import org.openapitools.client.model.Tag;

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
 * ApiV2SearchGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:23.722002-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV2SearchGet200Response {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<Account> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_HASHTAGS = "hashtags";
  @SerializedName(SERIALIZED_NAME_HASHTAGS)
  private List<Status> hashtags = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<Tag> statuses = new ArrayList<>();

  public ApiV2SearchGet200Response() {
  }

  public ApiV2SearchGet200Response accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public ApiV2SearchGet200Response addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
   */
  @javax.annotation.Nullable
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }


  public ApiV2SearchGet200Response hashtags(List<Status> hashtags) {
    this.hashtags = hashtags;
    return this;
  }

  public ApiV2SearchGet200Response addHashtagsItem(Status hashtagsItem) {
    if (this.hashtags == null) {
      this.hashtags = new ArrayList<>();
    }
    this.hashtags.add(hashtagsItem);
    return this;
  }

  /**
   * Get hashtags
   * @return hashtags
   */
  @javax.annotation.Nullable
  public List<Status> getHashtags() {
    return hashtags;
  }

  public void setHashtags(List<Status> hashtags) {
    this.hashtags = hashtags;
  }


  public ApiV2SearchGet200Response statuses(List<Tag> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ApiV2SearchGet200Response addStatusesItem(Tag statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
   */
  @javax.annotation.Nullable
  public List<Tag> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<Tag> statuses) {
    this.statuses = statuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2SearchGet200Response apiV2SearchGet200Response = (ApiV2SearchGet200Response) o;
    return Objects.equals(this.accounts, apiV2SearchGet200Response.accounts) &&
        Objects.equals(this.hashtags, apiV2SearchGet200Response.hashtags) &&
        Objects.equals(this.statuses, apiV2SearchGet200Response.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, hashtags, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2SearchGet200Response {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
    openapiFields.add("accounts");
    openapiFields.add("hashtags");
    openapiFields.add("statuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV2SearchGet200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV2SearchGet200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2SearchGet200Response is not found in the empty JSON string", ApiV2SearchGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV2SearchGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2SearchGet200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("accounts") != null && !jsonObj.get("accounts").isJsonNull()) {
        JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
        if (jsonArrayaccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
          }

          // validate the optional field `accounts` (array)
          for (int i = 0; i < jsonArrayaccounts.size(); i++) {
            Account.validateJsonElement(jsonArrayaccounts.get(i));
          };
        }
      }
      if (jsonObj.get("hashtags") != null && !jsonObj.get("hashtags").isJsonNull()) {
        JsonArray jsonArrayhashtags = jsonObj.getAsJsonArray("hashtags");
        if (jsonArrayhashtags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hashtags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hashtags` to be an array in the JSON string but got `%s`", jsonObj.get("hashtags").toString()));
          }

          // validate the optional field `hashtags` (array)
          for (int i = 0; i < jsonArrayhashtags.size(); i++) {
            Status.validateJsonElement(jsonArrayhashtags.get(i));
          };
        }
      }
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
        if (jsonArraystatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
          }

          // validate the optional field `statuses` (array)
          for (int i = 0; i < jsonArraystatuses.size(); i++) {
            Tag.validateJsonElement(jsonArraystatuses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2SearchGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2SearchGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2SearchGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2SearchGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2SearchGet200Response>() {
           @Override
           public void write(JsonWriter out, ApiV2SearchGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2SearchGet200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV2SearchGet200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV2SearchGet200Response
   * @throws IOException if the JSON string is invalid with respect to ApiV2SearchGet200Response
   */
  public static ApiV2SearchGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2SearchGet200Response.class);
  }

  /**
   * Convert an instance of ApiV2SearchGet200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

