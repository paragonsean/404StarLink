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
import org.openapitools.client.model.Brand;

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
 * Response message for BrandService.ListBrands.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:47.882086-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListBrandsResponse {
  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<Brand> brands = new ArrayList<>();

  public ListBrandsResponse() {
  }

  public ListBrandsResponse brands(List<Brand> brands) {
    this.brands = brands;
    return this;
  }

  public ListBrandsResponse addBrandsItem(Brand brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

  /**
   * A list of all brands associated with the Hotel Center account being queried.
   * @return brands
   */
  @javax.annotation.Nullable
  public List<Brand> getBrands() {
    return brands;
  }

  public void setBrands(List<Brand> brands) {
    this.brands = brands;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBrandsResponse listBrandsResponse = (ListBrandsResponse) o;
    return Objects.equals(this.brands, listBrandsResponse.brands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBrandsResponse {\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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
    openapiFields.add("brands");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListBrandsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBrandsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBrandsResponse is not found in the empty JSON string", ListBrandsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBrandsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBrandsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("brands") != null && !jsonObj.get("brands").isJsonNull()) {
        JsonArray jsonArraybrands = jsonObj.getAsJsonArray("brands");
        if (jsonArraybrands != null) {
          // ensure the json data is an array
          if (!jsonObj.get("brands").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `brands` to be an array in the JSON string but got `%s`", jsonObj.get("brands").toString()));
          }

          // validate the optional field `brands` (array)
          for (int i = 0; i < jsonArraybrands.size(); i++) {
            Brand.validateJsonElement(jsonArraybrands.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBrandsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBrandsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBrandsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBrandsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBrandsResponse>() {
           @Override
           public void write(JsonWriter out, ListBrandsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBrandsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListBrandsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListBrandsResponse
   * @throws IOException if the JSON string is invalid with respect to ListBrandsResponse
   */
  public static ListBrandsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBrandsResponse.class);
  }

  /**
   * Convert an instance of ListBrandsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

