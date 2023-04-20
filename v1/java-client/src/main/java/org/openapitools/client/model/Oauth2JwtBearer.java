/*
 * Connectors API
 * Enables users to create and manage connections to Google Cloud services and third-party business applications using the Connectors interface.
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
import org.openapitools.client.model.JwtClaims;
import org.openapitools.client.model.Secret;

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
 * Parameters to support JSON Web Token (JWT) Profile for Oauth 2.0 Authorization Grant based authentication. See https://tools.ietf.org/html/rfc7523 for more details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:13.662521-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Oauth2JwtBearer {
  public static final String SERIALIZED_NAME_CLIENT_KEY = "clientKey";
  @SerializedName(SERIALIZED_NAME_CLIENT_KEY)
  private Secret clientKey;

  public static final String SERIALIZED_NAME_JWT_CLAIMS = "jwtClaims";
  @SerializedName(SERIALIZED_NAME_JWT_CLAIMS)
  private JwtClaims jwtClaims;

  public Oauth2JwtBearer() {
  }

  public Oauth2JwtBearer clientKey(Secret clientKey) {
    this.clientKey = clientKey;
    return this;
  }

  /**
   * Get clientKey
   * @return clientKey
   */
  @javax.annotation.Nullable
  public Secret getClientKey() {
    return clientKey;
  }

  public void setClientKey(Secret clientKey) {
    this.clientKey = clientKey;
  }


  public Oauth2JwtBearer jwtClaims(JwtClaims jwtClaims) {
    this.jwtClaims = jwtClaims;
    return this;
  }

  /**
   * Get jwtClaims
   * @return jwtClaims
   */
  @javax.annotation.Nullable
  public JwtClaims getJwtClaims() {
    return jwtClaims;
  }

  public void setJwtClaims(JwtClaims jwtClaims) {
    this.jwtClaims = jwtClaims;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2JwtBearer oauth2JwtBearer = (Oauth2JwtBearer) o;
    return Objects.equals(this.clientKey, oauth2JwtBearer.clientKey) &&
        Objects.equals(this.jwtClaims, oauth2JwtBearer.jwtClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientKey, jwtClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2JwtBearer {\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    jwtClaims: ").append(toIndentedString(jwtClaims)).append("\n");
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
    openapiFields.add("clientKey");
    openapiFields.add("jwtClaims");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Oauth2JwtBearer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Oauth2JwtBearer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Oauth2JwtBearer is not found in the empty JSON string", Oauth2JwtBearer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Oauth2JwtBearer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Oauth2JwtBearer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `clientKey`
      if (jsonObj.get("clientKey") != null && !jsonObj.get("clientKey").isJsonNull()) {
        Secret.validateJsonElement(jsonObj.get("clientKey"));
      }
      // validate the optional field `jwtClaims`
      if (jsonObj.get("jwtClaims") != null && !jsonObj.get("jwtClaims").isJsonNull()) {
        JwtClaims.validateJsonElement(jsonObj.get("jwtClaims"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Oauth2JwtBearer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Oauth2JwtBearer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Oauth2JwtBearer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Oauth2JwtBearer.class));

       return (TypeAdapter<T>) new TypeAdapter<Oauth2JwtBearer>() {
           @Override
           public void write(JsonWriter out, Oauth2JwtBearer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Oauth2JwtBearer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Oauth2JwtBearer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Oauth2JwtBearer
   * @throws IOException if the JSON string is invalid with respect to Oauth2JwtBearer
   */
  public static Oauth2JwtBearer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Oauth2JwtBearer.class);
  }

  /**
   * Convert an instance of Oauth2JwtBearer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

