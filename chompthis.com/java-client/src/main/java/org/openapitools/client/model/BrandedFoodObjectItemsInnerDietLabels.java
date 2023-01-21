/*
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**   * Error response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/error-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Subscription Options &raquo;](https://chompthis.com/api/)     * [Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
 *
 * The version of the OpenAPI document: 1.0.0-oas3
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
import org.openapitools.client.model.BrandedFoodObjectItemsInnerDietLabelsGlutenFree;
import org.openapitools.client.model.BrandedFoodObjectItemsInnerDietLabelsVegan;
import org.openapitools.client.model.BrandedFoodObjectItemsInnerDietLabelsVegetarian;

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
 * An object containing this item&#39;s compatibility grades for each supported diet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:45.542408-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BrandedFoodObjectItemsInnerDietLabels {
  public static final String SERIALIZED_NAME_GLUTEN_FREE = "gluten_free";
  @SerializedName(SERIALIZED_NAME_GLUTEN_FREE)
  private BrandedFoodObjectItemsInnerDietLabelsGlutenFree glutenFree;

  public static final String SERIALIZED_NAME_VEGAN = "vegan";
  @SerializedName(SERIALIZED_NAME_VEGAN)
  private BrandedFoodObjectItemsInnerDietLabelsVegan vegan;

  public static final String SERIALIZED_NAME_VEGETARIAN = "vegetarian";
  @SerializedName(SERIALIZED_NAME_VEGETARIAN)
  private BrandedFoodObjectItemsInnerDietLabelsVegetarian vegetarian;

  public BrandedFoodObjectItemsInnerDietLabels() {
  }

  public BrandedFoodObjectItemsInnerDietLabels glutenFree(BrandedFoodObjectItemsInnerDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
    return this;
  }

  /**
   * Get glutenFree
   * @return glutenFree
   */
  @javax.annotation.Nullable
  public BrandedFoodObjectItemsInnerDietLabelsGlutenFree getGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(BrandedFoodObjectItemsInnerDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
  }


  public BrandedFoodObjectItemsInnerDietLabels vegan(BrandedFoodObjectItemsInnerDietLabelsVegan vegan) {
    this.vegan = vegan;
    return this;
  }

  /**
   * Get vegan
   * @return vegan
   */
  @javax.annotation.Nullable
  public BrandedFoodObjectItemsInnerDietLabelsVegan getVegan() {
    return vegan;
  }

  public void setVegan(BrandedFoodObjectItemsInnerDietLabelsVegan vegan) {
    this.vegan = vegan;
  }


  public BrandedFoodObjectItemsInnerDietLabels vegetarian(BrandedFoodObjectItemsInnerDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
    return this;
  }

  /**
   * Get vegetarian
   * @return vegetarian
   */
  @javax.annotation.Nullable
  public BrandedFoodObjectItemsInnerDietLabelsVegetarian getVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(BrandedFoodObjectItemsInnerDietLabelsVegetarian vegetarian) {
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
    BrandedFoodObjectItemsInnerDietLabels brandedFoodObjectItemsInnerDietLabels = (BrandedFoodObjectItemsInnerDietLabels) o;
    return Objects.equals(this.glutenFree, brandedFoodObjectItemsInnerDietLabels.glutenFree) &&
        Objects.equals(this.vegan, brandedFoodObjectItemsInnerDietLabels.vegan) &&
        Objects.equals(this.vegetarian, brandedFoodObjectItemsInnerDietLabels.vegetarian);
  }

  @Override
  public int hashCode() {
    return Objects.hash(glutenFree, vegan, vegetarian);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItemsInnerDietLabels {\n");
    sb.append("    glutenFree: ").append(toIndentedString(glutenFree)).append("\n");
    sb.append("    vegan: ").append(toIndentedString(vegan)).append("\n");
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
    openapiFields.add("gluten_free");
    openapiFields.add("vegan");
    openapiFields.add("vegetarian");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BrandedFoodObjectItemsInnerDietLabels
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandedFoodObjectItemsInnerDietLabels.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandedFoodObjectItemsInnerDietLabels is not found in the empty JSON string", BrandedFoodObjectItemsInnerDietLabels.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandedFoodObjectItemsInnerDietLabels.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandedFoodObjectItemsInnerDietLabels` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `gluten_free`
      if (jsonObj.get("gluten_free") != null && !jsonObj.get("gluten_free").isJsonNull()) {
        BrandedFoodObjectItemsInnerDietLabelsGlutenFree.validateJsonElement(jsonObj.get("gluten_free"));
      }
      // validate the optional field `vegan`
      if (jsonObj.get("vegan") != null && !jsonObj.get("vegan").isJsonNull()) {
        BrandedFoodObjectItemsInnerDietLabelsVegan.validateJsonElement(jsonObj.get("vegan"));
      }
      // validate the optional field `vegetarian`
      if (jsonObj.get("vegetarian") != null && !jsonObj.get("vegetarian").isJsonNull()) {
        BrandedFoodObjectItemsInnerDietLabelsVegetarian.validateJsonElement(jsonObj.get("vegetarian"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandedFoodObjectItemsInnerDietLabels.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandedFoodObjectItemsInnerDietLabels' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandedFoodObjectItemsInnerDietLabels> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandedFoodObjectItemsInnerDietLabels.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandedFoodObjectItemsInnerDietLabels>() {
           @Override
           public void write(JsonWriter out, BrandedFoodObjectItemsInnerDietLabels value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandedFoodObjectItemsInnerDietLabels read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BrandedFoodObjectItemsInnerDietLabels given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrandedFoodObjectItemsInnerDietLabels
   * @throws IOException if the JSON string is invalid with respect to BrandedFoodObjectItemsInnerDietLabels
   */
  public static BrandedFoodObjectItemsInnerDietLabels fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandedFoodObjectItemsInnerDietLabels.class);
  }

  /**
   * Convert an instance of BrandedFoodObjectItemsInnerDietLabels to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

