/*
 * Location Score
 * Before using this API, we recommend you read our **[Authorization Guide](https://developers.amadeus.com/self-service/apis-docs/guides/authorization-262)** for more information on how to generate an access token.     Please also be aware that our test environment is based on a subset of the production, this API in test only returns a few selected cities. You can find the list in our **[data collection](https://github.com/amadeus4dev/data-collection)**.
 *
 * The version of the OpenAPI document: 1.0.2
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
import java.math.BigDecimal;
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
 * restaurant category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:02.142829-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CategoryRatedAreasAllOfCategoryScoresRestaurant {
  public static final String SERIALIZED_NAME_OVERALL = "overall";
  @SerializedName(SERIALIZED_NAME_OVERALL)
  private BigDecimal overall;

  public static final String SERIALIZED_NAME_VEGETARIAN = "vegetarian";
  @SerializedName(SERIALIZED_NAME_VEGETARIAN)
  private BigDecimal vegetarian;

  public CategoryRatedAreasAllOfCategoryScoresRestaurant() {
  }

  public CategoryRatedAreasAllOfCategoryScoresRestaurant overall(BigDecimal overall) {
    this.overall = overall;
    return this;
  }

  /**
   * score of eating possibility from 0 (no place to eat) to 100 (many restaurants to enjoy)
   * @return overall
   */
  @javax.annotation.Nullable
  public BigDecimal getOverall() {
    return overall;
  }

  public void setOverall(BigDecimal overall) {
    this.overall = overall;
  }


  public CategoryRatedAreasAllOfCategoryScoresRestaurant vegetarian(BigDecimal vegetarian) {
    this.vegetarian = vegetarian;
    return this;
  }

  /**
   * score of vegetatian eating possibility from 0 (no place to eat vegetatian) to 100 (many restaurants to enjoy)
   * @return vegetarian
   */
  @javax.annotation.Nullable
  public BigDecimal getVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(BigDecimal vegetarian) {
    this.vegetarian = vegetarian;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryRatedAreasAllOfCategoryScoresRestaurant categoryRatedAreasAllOfCategoryScoresRestaurant = (CategoryRatedAreasAllOfCategoryScoresRestaurant) o;
    return Objects.equals(this.overall, categoryRatedAreasAllOfCategoryScoresRestaurant.overall) &&
        Objects.equals(this.vegetarian, categoryRatedAreasAllOfCategoryScoresRestaurant.vegetarian);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overall, vegetarian);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryRatedAreasAllOfCategoryScoresRestaurant {\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
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
    openapiFields.add("overall");
    openapiFields.add("vegetarian");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CategoryRatedAreasAllOfCategoryScoresRestaurant
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CategoryRatedAreasAllOfCategoryScoresRestaurant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CategoryRatedAreasAllOfCategoryScoresRestaurant is not found in the empty JSON string", CategoryRatedAreasAllOfCategoryScoresRestaurant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CategoryRatedAreasAllOfCategoryScoresRestaurant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CategoryRatedAreasAllOfCategoryScoresRestaurant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CategoryRatedAreasAllOfCategoryScoresRestaurant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CategoryRatedAreasAllOfCategoryScoresRestaurant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CategoryRatedAreasAllOfCategoryScoresRestaurant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CategoryRatedAreasAllOfCategoryScoresRestaurant.class));

       return (TypeAdapter<T>) new TypeAdapter<CategoryRatedAreasAllOfCategoryScoresRestaurant>() {
           @Override
           public void write(JsonWriter out, CategoryRatedAreasAllOfCategoryScoresRestaurant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CategoryRatedAreasAllOfCategoryScoresRestaurant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CategoryRatedAreasAllOfCategoryScoresRestaurant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CategoryRatedAreasAllOfCategoryScoresRestaurant
   * @throws IOException if the JSON string is invalid with respect to CategoryRatedAreasAllOfCategoryScoresRestaurant
   */
  public static CategoryRatedAreasAllOfCategoryScoresRestaurant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CategoryRatedAreasAllOfCategoryScoresRestaurant.class);
  }

  /**
   * Convert an instance of CategoryRatedAreasAllOfCategoryScoresRestaurant to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

