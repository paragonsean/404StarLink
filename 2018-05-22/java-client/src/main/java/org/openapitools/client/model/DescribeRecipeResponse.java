/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
 * Contact: mike.ralphson@gmail.com
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
import org.openapitools.client.model.DescribeRecipeResponseRecipe;

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
 * DescribeRecipeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:25.633240-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeRecipeResponse {
  public static final String SERIALIZED_NAME_RECIPE = "recipe";
  @SerializedName(SERIALIZED_NAME_RECIPE)
  private DescribeRecipeResponseRecipe recipe;

  public DescribeRecipeResponse() {
  }

  public DescribeRecipeResponse recipe(DescribeRecipeResponseRecipe recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * Get recipe
   * @return recipe
   */
  @javax.annotation.Nullable
  public DescribeRecipeResponseRecipe getRecipe() {
    return recipe;
  }

  public void setRecipe(DescribeRecipeResponseRecipe recipe) {
    this.recipe = recipe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRecipeResponse describeRecipeResponse = (DescribeRecipeResponse) o;
    return Objects.equals(this.recipe, describeRecipeResponse.recipe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRecipeResponse {\n");
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
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
    openapiFields.add("recipe");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeRecipeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeRecipeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeRecipeResponse is not found in the empty JSON string", DescribeRecipeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeRecipeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeRecipeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `recipe`
      if (jsonObj.get("recipe") != null && !jsonObj.get("recipe").isJsonNull()) {
        DescribeRecipeResponseRecipe.validateJsonElement(jsonObj.get("recipe"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeRecipeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeRecipeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeRecipeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeRecipeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeRecipeResponse>() {
           @Override
           public void write(JsonWriter out, DescribeRecipeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeRecipeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeRecipeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeRecipeResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeRecipeResponse
   */
  public static DescribeRecipeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeRecipeResponse.class);
  }

  /**
   * Convert an instance of DescribeRecipeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

