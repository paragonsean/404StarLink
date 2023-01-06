/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccountLink;

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
 * Response message for AccountLinkService.ListAccountLinks.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:57.375310-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListAccountLinksResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_LINKS = "accountLinks";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LINKS)
  private List<AccountLink> accountLinks = new ArrayList<>();

  public ListAccountLinksResponse() {
  }

  public ListAccountLinksResponse accountLinks(List<AccountLink> accountLinks) {
    this.accountLinks = accountLinks;
    return this;
  }

  public ListAccountLinksResponse addAccountLinksItem(AccountLink accountLinksItem) {
    if (this.accountLinks == null) {
      this.accountLinks = new ArrayList<>();
    }
    this.accountLinks.add(accountLinksItem);
    return this;
  }

  /**
   * A list of all account links associated with the Hotel Center account being queried.
   * @return accountLinks
   */
  @javax.annotation.Nullable
  public List<AccountLink> getAccountLinks() {
    return accountLinks;
  }

  public void setAccountLinks(List<AccountLink> accountLinks) {
    this.accountLinks = accountLinks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAccountLinksResponse listAccountLinksResponse = (ListAccountLinksResponse) o;
    return Objects.equals(this.accountLinks, listAccountLinksResponse.accountLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAccountLinksResponse {\n");
    sb.append("    accountLinks: ").append(toIndentedString(accountLinks)).append("\n");
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
    openapiFields.add("accountLinks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListAccountLinksResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListAccountLinksResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAccountLinksResponse is not found in the empty JSON string", ListAccountLinksResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListAccountLinksResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAccountLinksResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("accountLinks") != null && !jsonObj.get("accountLinks").isJsonNull()) {
        JsonArray jsonArrayaccountLinks = jsonObj.getAsJsonArray("accountLinks");
        if (jsonArrayaccountLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accountLinks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accountLinks` to be an array in the JSON string but got `%s`", jsonObj.get("accountLinks").toString()));
          }

          // validate the optional field `accountLinks` (array)
          for (int i = 0; i < jsonArrayaccountLinks.size(); i++) {
            AccountLink.validateJsonElement(jsonArrayaccountLinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAccountLinksResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAccountLinksResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAccountLinksResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAccountLinksResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAccountLinksResponse>() {
           @Override
           public void write(JsonWriter out, ListAccountLinksResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAccountLinksResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListAccountLinksResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListAccountLinksResponse
   * @throws IOException if the JSON string is invalid with respect to ListAccountLinksResponse
   */
  public static ListAccountLinksResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAccountLinksResponse.class);
  }

  /**
   * Convert an instance of ListAccountLinksResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

