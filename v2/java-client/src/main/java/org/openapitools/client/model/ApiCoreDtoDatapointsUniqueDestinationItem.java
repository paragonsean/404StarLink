/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
 * ApiCoreDtoDatapointsUniqueDestinationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:55.938564-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoDatapointsUniqueDestinationItem {
  public static final String SERIALIZED_NAME_FIRST_DESTINATION_URL = "firstDestinationUrl";
  @SerializedName(SERIALIZED_NAME_FIRST_DESTINATION_URL)
  private String firstDestinationUrl;

  public ApiCoreDtoDatapointsUniqueDestinationItem() {
  }

  public ApiCoreDtoDatapointsUniqueDestinationItem firstDestinationUrl(String firstDestinationUrl) {
    this.firstDestinationUrl = firstDestinationUrl;
    return this;
  }

  /**
   * Get firstDestinationUrl
   * @return firstDestinationUrl
   */
  @javax.annotation.Nullable
  public String getFirstDestinationUrl() {
    return firstDestinationUrl;
  }

  public void setFirstDestinationUrl(String firstDestinationUrl) {
    this.firstDestinationUrl = firstDestinationUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoDatapointsUniqueDestinationItem apiCoreDtoDatapointsUniqueDestinationItem = (ApiCoreDtoDatapointsUniqueDestinationItem) o;
    return Objects.equals(this.firstDestinationUrl, apiCoreDtoDatapointsUniqueDestinationItem.firstDestinationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDestinationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoDatapointsUniqueDestinationItem {\n");
    sb.append("    firstDestinationUrl: ").append(toIndentedString(firstDestinationUrl)).append("\n");
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
    openapiFields.add("firstDestinationUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoDatapointsUniqueDestinationItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoDatapointsUniqueDestinationItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoDatapointsUniqueDestinationItem is not found in the empty JSON string", ApiCoreDtoDatapointsUniqueDestinationItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoDatapointsUniqueDestinationItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoDatapointsUniqueDestinationItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstDestinationUrl") != null && !jsonObj.get("firstDestinationUrl").isJsonNull()) && !jsonObj.get("firstDestinationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstDestinationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstDestinationUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoDatapointsUniqueDestinationItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoDatapointsUniqueDestinationItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoDatapointsUniqueDestinationItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoDatapointsUniqueDestinationItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoDatapointsUniqueDestinationItem>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoDatapointsUniqueDestinationItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoDatapointsUniqueDestinationItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoDatapointsUniqueDestinationItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoDatapointsUniqueDestinationItem
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoDatapointsUniqueDestinationItem
   */
  public static ApiCoreDtoDatapointsUniqueDestinationItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoDatapointsUniqueDestinationItem.class);
  }

  /**
   * Convert an instance of ApiCoreDtoDatapointsUniqueDestinationItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

