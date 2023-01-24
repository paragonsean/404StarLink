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
import org.openapitools.client.model.PriceAccuracyView;

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
 * Response message for PriceAccuracyViewService.ListPriceAccuracyViews.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:47.882086-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListPriceAccuracyViewsResponse {
  public static final String SERIALIZED_NAME_PRICE_ACCURACY_VIEWS = "priceAccuracyViews";
  @SerializedName(SERIALIZED_NAME_PRICE_ACCURACY_VIEWS)
  private List<PriceAccuracyView> priceAccuracyViews = new ArrayList<>();

  public ListPriceAccuracyViewsResponse() {
  }

  public ListPriceAccuracyViewsResponse priceAccuracyViews(List<PriceAccuracyView> priceAccuracyViews) {
    this.priceAccuracyViews = priceAccuracyViews;
    return this;
  }

  public ListPriceAccuracyViewsResponse addPriceAccuracyViewsItem(PriceAccuracyView priceAccuracyViewsItem) {
    if (this.priceAccuracyViews == null) {
      this.priceAccuracyViews = new ArrayList<>();
    }
    this.priceAccuracyViews.add(priceAccuracyViewsItem);
    return this;
  }

  /**
   * The list of rows that match the query.
   * @return priceAccuracyViews
   */
  @javax.annotation.Nullable
  public List<PriceAccuracyView> getPriceAccuracyViews() {
    return priceAccuracyViews;
  }

  public void setPriceAccuracyViews(List<PriceAccuracyView> priceAccuracyViews) {
    this.priceAccuracyViews = priceAccuracyViews;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPriceAccuracyViewsResponse listPriceAccuracyViewsResponse = (ListPriceAccuracyViewsResponse) o;
    return Objects.equals(this.priceAccuracyViews, listPriceAccuracyViewsResponse.priceAccuracyViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceAccuracyViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPriceAccuracyViewsResponse {\n");
    sb.append("    priceAccuracyViews: ").append(toIndentedString(priceAccuracyViews)).append("\n");
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
    openapiFields.add("priceAccuracyViews");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListPriceAccuracyViewsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPriceAccuracyViewsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPriceAccuracyViewsResponse is not found in the empty JSON string", ListPriceAccuracyViewsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPriceAccuracyViewsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPriceAccuracyViewsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("priceAccuracyViews") != null && !jsonObj.get("priceAccuracyViews").isJsonNull()) {
        JsonArray jsonArraypriceAccuracyViews = jsonObj.getAsJsonArray("priceAccuracyViews");
        if (jsonArraypriceAccuracyViews != null) {
          // ensure the json data is an array
          if (!jsonObj.get("priceAccuracyViews").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `priceAccuracyViews` to be an array in the JSON string but got `%s`", jsonObj.get("priceAccuracyViews").toString()));
          }

          // validate the optional field `priceAccuracyViews` (array)
          for (int i = 0; i < jsonArraypriceAccuracyViews.size(); i++) {
            PriceAccuracyView.validateJsonElement(jsonArraypriceAccuracyViews.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPriceAccuracyViewsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPriceAccuracyViewsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPriceAccuracyViewsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPriceAccuracyViewsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPriceAccuracyViewsResponse>() {
           @Override
           public void write(JsonWriter out, ListPriceAccuracyViewsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPriceAccuracyViewsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListPriceAccuracyViewsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListPriceAccuracyViewsResponse
   * @throws IOException if the JSON string is invalid with respect to ListPriceAccuracyViewsResponse
   */
  public static ListPriceAccuracyViewsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPriceAccuracyViewsResponse.class);
  }

  /**
   * Convert an instance of ListPriceAccuracyViewsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

