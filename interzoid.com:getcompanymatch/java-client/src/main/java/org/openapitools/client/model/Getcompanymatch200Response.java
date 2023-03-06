/*
 * Interzoid Get Company Name Match Similarity Key API
 * This API provides a similarity key used to match with other similar company name data, including for purposes of deduplication, fuzzy matching, or merging of datasets. A much higher match rate will be achieved by matching on the algorithmically generated similarity key rather than the data itself.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@interzoid.com
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
 * Getcompanymatch200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:53.627190-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Getcompanymatch200Response {
  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CREDITS = "Credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private String credits;

  public static final String SERIALIZED_NAME_SIMKEY = "Simkey";
  @SerializedName(SERIALIZED_NAME_SIMKEY)
  private String simkey;

  public Getcompanymatch200Response() {
  }

  public Getcompanymatch200Response code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public Getcompanymatch200Response credits(String credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  @javax.annotation.Nullable
  public String getCredits() {
    return credits;
  }

  public void setCredits(String credits) {
    this.credits = credits;
  }


  public Getcompanymatch200Response simkey(String simkey) {
    this.simkey = simkey;
    return this;
  }

  /**
   * Get simkey
   * @return simkey
   */
  @javax.annotation.Nullable
  public String getSimkey() {
    return simkey;
  }

  public void setSimkey(String simkey) {
    this.simkey = simkey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Getcompanymatch200Response getcompanymatch200Response = (Getcompanymatch200Response) o;
    return Objects.equals(this.code, getcompanymatch200Response.code) &&
        Objects.equals(this.credits, getcompanymatch200Response.credits) &&
        Objects.equals(this.simkey, getcompanymatch200Response.simkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, credits, simkey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Getcompanymatch200Response {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    simkey: ").append(toIndentedString(simkey)).append("\n");
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
    openapiFields.add("Code");
    openapiFields.add("Credits");
    openapiFields.add("Simkey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Getcompanymatch200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Getcompanymatch200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Getcompanymatch200Response is not found in the empty JSON string", Getcompanymatch200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Getcompanymatch200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Getcompanymatch200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
      if ((jsonObj.get("Credits") != null && !jsonObj.get("Credits").isJsonNull()) && !jsonObj.get("Credits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Credits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Credits").toString()));
      }
      if ((jsonObj.get("Simkey") != null && !jsonObj.get("Simkey").isJsonNull()) && !jsonObj.get("Simkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Simkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Simkey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Getcompanymatch200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Getcompanymatch200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Getcompanymatch200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Getcompanymatch200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Getcompanymatch200Response>() {
           @Override
           public void write(JsonWriter out, Getcompanymatch200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Getcompanymatch200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Getcompanymatch200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Getcompanymatch200Response
   * @throws IOException if the JSON string is invalid with respect to Getcompanymatch200Response
   */
  public static Getcompanymatch200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Getcompanymatch200Response.class);
  }

  /**
   * Convert an instance of Getcompanymatch200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

