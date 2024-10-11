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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ListingsPostRequestShippingRatesInner;

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
 * ListingsPostRequestShipping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:18.245876-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListingsPostRequestShipping {
  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private Boolean local;

  public static final String SERIALIZED_NAME_RATES = "rates";
  @SerializedName(SERIALIZED_NAME_RATES)
  private List<ListingsPostRequestShippingRatesInner> rates = new ArrayList<>();

  public ListingsPostRequestShipping() {
  }

  public ListingsPostRequestShipping local(Boolean local) {
    this.local = local;
    return this;
  }

  /**
   * True if you offer local pickup
   * @return local
   */
  @javax.annotation.Nullable
  public Boolean getLocal() {
    return local;
  }

  public void setLocal(Boolean local) {
    this.local = local;
  }


  public ListingsPostRequestShipping rates(List<ListingsPostRequestShippingRatesInner> rates) {
    this.rates = rates;
    return this;
  }

  public ListingsPostRequestShipping addRatesItem(ListingsPostRequestShippingRatesInner ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<>();
    }
    this.rates.add(ratesItem);
    return this;
  }

  /**
   * List of shipping rates. Set to null to clear rates.
   * @return rates
   */
  @javax.annotation.Nullable
  public List<ListingsPostRequestShippingRatesInner> getRates() {
    return rates;
  }

  public void setRates(List<ListingsPostRequestShippingRatesInner> rates) {
    this.rates = rates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingsPostRequestShipping listingsPostRequestShipping = (ListingsPostRequestShipping) o;
    return Objects.equals(this.local, listingsPostRequestShipping.local) &&
        Objects.equals(this.rates, listingsPostRequestShipping.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local, rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingsPostRequestShipping {\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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
    openapiFields.add("local");
    openapiFields.add("rates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListingsPostRequestShipping
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListingsPostRequestShipping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingsPostRequestShipping is not found in the empty JSON string", ListingsPostRequestShipping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListingsPostRequestShipping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingsPostRequestShipping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rates") != null && !jsonObj.get("rates").isJsonNull()) {
        JsonArray jsonArrayrates = jsonObj.getAsJsonArray("rates");
        if (jsonArrayrates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rates` to be an array in the JSON string but got `%s`", jsonObj.get("rates").toString()));
          }

          // validate the optional field `rates` (array)
          for (int i = 0; i < jsonArrayrates.size(); i++) {
            ListingsPostRequestShippingRatesInner.validateJsonElement(jsonArrayrates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingsPostRequestShipping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingsPostRequestShipping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingsPostRequestShipping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingsPostRequestShipping.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingsPostRequestShipping>() {
           @Override
           public void write(JsonWriter out, ListingsPostRequestShipping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingsPostRequestShipping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListingsPostRequestShipping given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListingsPostRequestShipping
   * @throws IOException if the JSON string is invalid with respect to ListingsPostRequestShipping
   */
  public static ListingsPostRequestShipping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingsPostRequestShipping.class);
  }

  /**
   * Convert an instance of ListingsPostRequestShipping to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

