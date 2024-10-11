/*
 * reverb
 * reverb
 *
 * The version of the OpenAPI document: 3.0
 * Contact: integrations@reverb.com
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
 * ListingsPostRequestSeller
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:18.245876-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListingsPostRequestSeller {
  public static final String SERIALIZED_NAME_PAYPAL_EMAIL = "paypal_email";
  @SerializedName(SERIALIZED_NAME_PAYPAL_EMAIL)
  private String paypalEmail;

  public ListingsPostRequestSeller() {
  }

  public ListingsPostRequestSeller paypalEmail(String paypalEmail) {
    this.paypalEmail = paypalEmail;
    return this;
  }

  /**
   * Get paypalEmail
   * @return paypalEmail
   */
  @javax.annotation.Nullable
  public String getPaypalEmail() {
    return paypalEmail;
  }

  public void setPaypalEmail(String paypalEmail) {
    this.paypalEmail = paypalEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingsPostRequestSeller listingsPostRequestSeller = (ListingsPostRequestSeller) o;
    return Objects.equals(this.paypalEmail, listingsPostRequestSeller.paypalEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paypalEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingsPostRequestSeller {\n");
    sb.append("    paypalEmail: ").append(toIndentedString(paypalEmail)).append("\n");
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
    openapiFields.add("paypal_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListingsPostRequestSeller
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListingsPostRequestSeller.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingsPostRequestSeller is not found in the empty JSON string", ListingsPostRequestSeller.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListingsPostRequestSeller.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingsPostRequestSeller` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("paypal_email") != null && !jsonObj.get("paypal_email").isJsonNull()) && !jsonObj.get("paypal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paypal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paypal_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingsPostRequestSeller.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingsPostRequestSeller' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingsPostRequestSeller> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingsPostRequestSeller.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingsPostRequestSeller>() {
           @Override
           public void write(JsonWriter out, ListingsPostRequestSeller value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingsPostRequestSeller read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListingsPostRequestSeller given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListingsPostRequestSeller
   * @throws IOException if the JSON string is invalid with respect to ListingsPostRequestSeller
   */
  public static ListingsPostRequestSeller fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingsPostRequestSeller.class);
  }

  /**
   * Convert an instance of ListingsPostRequestSeller to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

