/*
 * Flickr API Schema
 * A subset of Flickr's API defined in Swagger format.
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.GetFavoritesContextByID200ResponseCount;

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
 * Echo200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:51.881402-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Echo200Response {
  public static final String SERIALIZED_NAME_ECHO = "echo";
  @SerializedName(SERIALIZED_NAME_ECHO)
  private GetFavoritesContextByID200ResponseCount echo;

  public Echo200Response() {
  }

  public Echo200Response echo(GetFavoritesContextByID200ResponseCount echo) {
    this.echo = echo;
    return this;
  }

  /**
   * Get echo
   * @return echo
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getEcho() {
    return echo;
  }

  public void setEcho(GetFavoritesContextByID200ResponseCount echo) {
    this.echo = echo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Echo200Response echo200Response = (Echo200Response) o;
    return Objects.equals(this.echo, echo200Response.echo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(echo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Echo200Response {\n");
    sb.append("    echo: ").append(toIndentedString(echo)).append("\n");
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
    openapiFields.add("echo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Echo200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Echo200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Echo200Response is not found in the empty JSON string", Echo200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Echo200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Echo200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `echo`
      if (jsonObj.get("echo") != null && !jsonObj.get("echo").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("echo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Echo200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Echo200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Echo200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Echo200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Echo200Response>() {
           @Override
           public void write(JsonWriter out, Echo200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Echo200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Echo200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Echo200Response
   * @throws IOException if the JSON string is invalid with respect to Echo200Response
   */
  public static Echo200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Echo200Response.class);
  }

  /**
   * Convert an instance of Echo200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

