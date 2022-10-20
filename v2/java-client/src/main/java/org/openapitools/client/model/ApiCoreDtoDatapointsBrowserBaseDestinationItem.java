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
 * ApiCoreDtoDatapointsBrowserBaseDestinationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:30.497679-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoDatapointsBrowserBaseDestinationItem {
  public static final String SERIALIZED_NAME_EMAIL_DESTINATION_URL = "emailDestinationUrl";
  @SerializedName(SERIALIZED_NAME_EMAIL_DESTINATION_URL)
  private String emailDestinationUrl;

  public static final String SERIALIZED_NAME_MOBILE_DESTINATION_URL = "mobileDestinationUrl";
  @SerializedName(SERIALIZED_NAME_MOBILE_DESTINATION_URL)
  private String mobileDestinationUrl;

  public static final String SERIALIZED_NAME_SPIDERS_DESTINATION_URL = "spidersDestinationUrl";
  @SerializedName(SERIALIZED_NAME_SPIDERS_DESTINATION_URL)
  private String spidersDestinationUrl;

  public ApiCoreDtoDatapointsBrowserBaseDestinationItem() {
  }

  public ApiCoreDtoDatapointsBrowserBaseDestinationItem emailDestinationUrl(String emailDestinationUrl) {
    this.emailDestinationUrl = emailDestinationUrl;
    return this;
  }

  /**
   * Get emailDestinationUrl
   * @return emailDestinationUrl
   */
  @javax.annotation.Nullable
  public String getEmailDestinationUrl() {
    return emailDestinationUrl;
  }

  public void setEmailDestinationUrl(String emailDestinationUrl) {
    this.emailDestinationUrl = emailDestinationUrl;
  }


  public ApiCoreDtoDatapointsBrowserBaseDestinationItem mobileDestinationUrl(String mobileDestinationUrl) {
    this.mobileDestinationUrl = mobileDestinationUrl;
    return this;
  }

  /**
   * Get mobileDestinationUrl
   * @return mobileDestinationUrl
   */
  @javax.annotation.Nullable
  public String getMobileDestinationUrl() {
    return mobileDestinationUrl;
  }

  public void setMobileDestinationUrl(String mobileDestinationUrl) {
    this.mobileDestinationUrl = mobileDestinationUrl;
  }


  public ApiCoreDtoDatapointsBrowserBaseDestinationItem spidersDestinationUrl(String spidersDestinationUrl) {
    this.spidersDestinationUrl = spidersDestinationUrl;
    return this;
  }

  /**
   * Get spidersDestinationUrl
   * @return spidersDestinationUrl
   */
  @javax.annotation.Nullable
  public String getSpidersDestinationUrl() {
    return spidersDestinationUrl;
  }

  public void setSpidersDestinationUrl(String spidersDestinationUrl) {
    this.spidersDestinationUrl = spidersDestinationUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoDatapointsBrowserBaseDestinationItem apiCoreDtoDatapointsBrowserBaseDestinationItem = (ApiCoreDtoDatapointsBrowserBaseDestinationItem) o;
    return Objects.equals(this.emailDestinationUrl, apiCoreDtoDatapointsBrowserBaseDestinationItem.emailDestinationUrl) &&
        Objects.equals(this.mobileDestinationUrl, apiCoreDtoDatapointsBrowserBaseDestinationItem.mobileDestinationUrl) &&
        Objects.equals(this.spidersDestinationUrl, apiCoreDtoDatapointsBrowserBaseDestinationItem.spidersDestinationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailDestinationUrl, mobileDestinationUrl, spidersDestinationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoDatapointsBrowserBaseDestinationItem {\n");
    sb.append("    emailDestinationUrl: ").append(toIndentedString(emailDestinationUrl)).append("\n");
    sb.append("    mobileDestinationUrl: ").append(toIndentedString(mobileDestinationUrl)).append("\n");
    sb.append("    spidersDestinationUrl: ").append(toIndentedString(spidersDestinationUrl)).append("\n");
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
    openapiFields.add("emailDestinationUrl");
    openapiFields.add("mobileDestinationUrl");
    openapiFields.add("spidersDestinationUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoDatapointsBrowserBaseDestinationItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoDatapointsBrowserBaseDestinationItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoDatapointsBrowserBaseDestinationItem is not found in the empty JSON string", ApiCoreDtoDatapointsBrowserBaseDestinationItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoDatapointsBrowserBaseDestinationItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoDatapointsBrowserBaseDestinationItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("emailDestinationUrl") != null && !jsonObj.get("emailDestinationUrl").isJsonNull()) && !jsonObj.get("emailDestinationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailDestinationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailDestinationUrl").toString()));
      }
      if ((jsonObj.get("mobileDestinationUrl") != null && !jsonObj.get("mobileDestinationUrl").isJsonNull()) && !jsonObj.get("mobileDestinationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobileDestinationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobileDestinationUrl").toString()));
      }
      if ((jsonObj.get("spidersDestinationUrl") != null && !jsonObj.get("spidersDestinationUrl").isJsonNull()) && !jsonObj.get("spidersDestinationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spidersDestinationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spidersDestinationUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoDatapointsBrowserBaseDestinationItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoDatapointsBrowserBaseDestinationItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoDatapointsBrowserBaseDestinationItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoDatapointsBrowserBaseDestinationItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoDatapointsBrowserBaseDestinationItem>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoDatapointsBrowserBaseDestinationItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoDatapointsBrowserBaseDestinationItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoDatapointsBrowserBaseDestinationItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoDatapointsBrowserBaseDestinationItem
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoDatapointsBrowserBaseDestinationItem
   */
  public static ApiCoreDtoDatapointsBrowserBaseDestinationItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoDatapointsBrowserBaseDestinationItem.class);
  }

  /**
   * Convert an instance of ApiCoreDtoDatapointsBrowserBaseDestinationItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

