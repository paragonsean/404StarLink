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
 * OauthTokenPost200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:45.133390-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class OauthTokenPost200Response {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public OauthTokenPost200Response() {
  }

  public OauthTokenPost200Response accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   */
  @javax.annotation.Nullable
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public OauthTokenPost200Response createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * UNIX timestamp
   * @return createdAt
   */
  @javax.annotation.Nullable
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public OauthTokenPost200Response scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  public OauthTokenPost200Response tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
   */
  @javax.annotation.Nullable
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthTokenPost200Response oauthTokenPost200Response = (OauthTokenPost200Response) o;
    return Objects.equals(this.accessToken, oauthTokenPost200Response.accessToken) &&
        Objects.equals(this.createdAt, oauthTokenPost200Response.createdAt) &&
        Objects.equals(this.scope, oauthTokenPost200Response.scope) &&
        Objects.equals(this.tokenType, oauthTokenPost200Response.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, createdAt, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthTokenPost200Response {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("created_at");
    openapiFields.add("scope");
    openapiFields.add("token_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OauthTokenPost200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OauthTokenPost200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OauthTokenPost200Response is not found in the empty JSON string", OauthTokenPost200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OauthTokenPost200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OauthTokenPost200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OauthTokenPost200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OauthTokenPost200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OauthTokenPost200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OauthTokenPost200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<OauthTokenPost200Response>() {
           @Override
           public void write(JsonWriter out, OauthTokenPost200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OauthTokenPost200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OauthTokenPost200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OauthTokenPost200Response
   * @throws IOException if the JSON string is invalid with respect to OauthTokenPost200Response
   */
  public static OauthTokenPost200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OauthTokenPost200Response.class);
  }

  /**
   * Convert an instance of OauthTokenPost200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

