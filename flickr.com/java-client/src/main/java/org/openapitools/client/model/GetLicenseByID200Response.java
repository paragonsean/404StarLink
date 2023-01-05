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
import org.openapitools.client.model.GetLicenseByID200ResponseLicenses;

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
 * GetLicenseByID200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:54.658141-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetLicenseByID200Response {
  public static final String SERIALIZED_NAME_LICENSES = "licenses";
  @SerializedName(SERIALIZED_NAME_LICENSES)
  private GetLicenseByID200ResponseLicenses licenses;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private String stat;

  public GetLicenseByID200Response() {
  }

  public GetLicenseByID200Response licenses(GetLicenseByID200ResponseLicenses licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Get licenses
   * @return licenses
   */
  @javax.annotation.Nullable
  public GetLicenseByID200ResponseLicenses getLicenses() {
    return licenses;
  }

  public void setLicenses(GetLicenseByID200ResponseLicenses licenses) {
    this.licenses = licenses;
  }


  public GetLicenseByID200Response stat(String stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @javax.annotation.Nullable
  public String getStat() {
    return stat;
  }

  public void setStat(String stat) {
    this.stat = stat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLicenseByID200Response getLicenseByID200Response = (GetLicenseByID200Response) o;
    return Objects.equals(this.licenses, getLicenseByID200Response.licenses) &&
        Objects.equals(this.stat, getLicenseByID200Response.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenses, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLicenseByID200Response {\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
    openapiFields.add("licenses");
    openapiFields.add("stat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLicenseByID200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLicenseByID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLicenseByID200Response is not found in the empty JSON string", GetLicenseByID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLicenseByID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLicenseByID200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `licenses`
      if (jsonObj.get("licenses") != null && !jsonObj.get("licenses").isJsonNull()) {
        GetLicenseByID200ResponseLicenses.validateJsonElement(jsonObj.get("licenses"));
      }
      if ((jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) && !jsonObj.get("stat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLicenseByID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLicenseByID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLicenseByID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLicenseByID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLicenseByID200Response>() {
           @Override
           public void write(JsonWriter out, GetLicenseByID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLicenseByID200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLicenseByID200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLicenseByID200Response
   * @throws IOException if the JSON string is invalid with respect to GetLicenseByID200Response
   */
  public static GetLicenseByID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLicenseByID200Response.class);
  }

  /**
   * Convert an instance of GetLicenseByID200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

