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
import java.util.Arrays;
import org.openapitools.client.model.CategoryRatedAreasAllOfCategoryScores;
import org.openapitools.client.model.GeoCode;

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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:02.142829-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CategoryRatedAreas {
  public static final String SERIALIZED_NAME_CATEGORY_SCORES = "categoryScores";
  @SerializedName(SERIALIZED_NAME_CATEGORY_SCORES)
  private CategoryRatedAreasAllOfCategoryScores categoryScores;

  public static final String SERIALIZED_NAME_GEO_CODE = "geoCode";
  @SerializedName(SERIALIZED_NAME_GEO_CODE)
  private GeoCode geoCode;

  public static final String SERIALIZED_NAME_RADIUS = "radius";
  @SerializedName(SERIALIZED_NAME_RADIUS)
  private Integer radius;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CategoryRatedAreas() {
  }

  public CategoryRatedAreas categoryScores(CategoryRatedAreasAllOfCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
    return this;
  }

  /**
   * Get categoryScores
   * @return categoryScores
   */
  @javax.annotation.Nullable
  public CategoryRatedAreasAllOfCategoryScores getCategoryScores() {
    return categoryScores;
  }

  public void setCategoryScores(CategoryRatedAreasAllOfCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }


  public CategoryRatedAreas geoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
    return this;
  }

  /**
   * Get geoCode
   * @return geoCode
   */
  @javax.annotation.Nullable
  public GeoCode getGeoCode() {
    return geoCode;
  }

  public void setGeoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
  }


  public CategoryRatedAreas radius(Integer radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Radius of the area in meters
   * @return radius
   */
  @javax.annotation.Nullable
  public Integer getRadius() {
    return radius;
  }

  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  public CategoryRatedAreas type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the manipulatd resource
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryRatedAreas categoryRatedAreas = (CategoryRatedAreas) o;
    return Objects.equals(this.categoryScores, categoryRatedAreas.categoryScores) &&
        Objects.equals(this.geoCode, categoryRatedAreas.geoCode) &&
        Objects.equals(this.radius, categoryRatedAreas.radius) &&
        Objects.equals(this.type, categoryRatedAreas.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryScores, geoCode, radius, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryRatedAreas {\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
    sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("categoryScores");
    openapiFields.add("geoCode");
    openapiFields.add("radius");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CategoryRatedAreas
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CategoryRatedAreas.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CategoryRatedAreas is not found in the empty JSON string", CategoryRatedAreas.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CategoryRatedAreas.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CategoryRatedAreas` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `categoryScores`
      if (jsonObj.get("categoryScores") != null && !jsonObj.get("categoryScores").isJsonNull()) {
        CategoryRatedAreasAllOfCategoryScores.validateJsonElement(jsonObj.get("categoryScores"));
      }
      // validate the optional field `geoCode`
      if (jsonObj.get("geoCode") != null && !jsonObj.get("geoCode").isJsonNull()) {
        GeoCode.validateJsonElement(jsonObj.get("geoCode"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CategoryRatedAreas.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CategoryRatedAreas' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CategoryRatedAreas> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CategoryRatedAreas.class));

       return (TypeAdapter<T>) new TypeAdapter<CategoryRatedAreas>() {
           @Override
           public void write(JsonWriter out, CategoryRatedAreas value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CategoryRatedAreas read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CategoryRatedAreas given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CategoryRatedAreas
   * @throws IOException if the JSON string is invalid with respect to CategoryRatedAreas
   */
  public static CategoryRatedAreas fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CategoryRatedAreas.class);
  }

  /**
   * Convert an instance of CategoryRatedAreas to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

