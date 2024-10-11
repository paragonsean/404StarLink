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
 * An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:59.572060-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IngredientObjectItemsInnerCalorieConversionFactor {
  public static final String SERIALIZED_NAME_CARBOHYDRATE_VALUE = "carbohydrate_value";
  @SerializedName(SERIALIZED_NAME_CARBOHYDRATE_VALUE)
  private BigDecimal carbohydrateValue;

  public static final String SERIALIZED_NAME_FAT_VALUE = "fat_value";
  @SerializedName(SERIALIZED_NAME_FAT_VALUE)
  private BigDecimal fatValue;

  public static final String SERIALIZED_NAME_PROTEIN_VALUE = "protein_value";
  @SerializedName(SERIALIZED_NAME_PROTEIN_VALUE)
  private BigDecimal proteinValue;

  public IngredientObjectItemsInnerCalorieConversionFactor() {
  }

  public IngredientObjectItemsInnerCalorieConversionFactor carbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
    return this;
  }

  /**
   * The multiplication factor for carbohydrates
   * @return carbohydrateValue
   */
  @javax.annotation.Nullable
  public BigDecimal getCarbohydrateValue() {
    return carbohydrateValue;
  }

  public void setCarbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
  }


  public IngredientObjectItemsInnerCalorieConversionFactor fatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
    return this;
  }

  /**
   * The multiplication factor for fat
   * @return fatValue
   */
  @javax.annotation.Nullable
  public BigDecimal getFatValue() {
    return fatValue;
  }

  public void setFatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
  }


  public IngredientObjectItemsInnerCalorieConversionFactor proteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
    return this;
  }

  /**
   * The multiplication factor for protein
   * @return proteinValue
   */
  @javax.annotation.Nullable
  public BigDecimal getProteinValue() {
    return proteinValue;
  }

  public void setProteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectItemsInnerCalorieConversionFactor ingredientObjectItemsInnerCalorieConversionFactor = (IngredientObjectItemsInnerCalorieConversionFactor) o;
    return Objects.equals(this.carbohydrateValue, ingredientObjectItemsInnerCalorieConversionFactor.carbohydrateValue) &&
        Objects.equals(this.fatValue, ingredientObjectItemsInnerCalorieConversionFactor.fatValue) &&
        Objects.equals(this.proteinValue, ingredientObjectItemsInnerCalorieConversionFactor.proteinValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carbohydrateValue, fatValue, proteinValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItemsInnerCalorieConversionFactor {\n");
    sb.append("    carbohydrateValue: ").append(toIndentedString(carbohydrateValue)).append("\n");
    sb.append("    fatValue: ").append(toIndentedString(fatValue)).append("\n");
    sb.append("    proteinValue: ").append(toIndentedString(proteinValue)).append("\n");
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
    openapiFields.add("carbohydrate_value");
    openapiFields.add("fat_value");
    openapiFields.add("protein_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IngredientObjectItemsInnerCalorieConversionFactor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IngredientObjectItemsInnerCalorieConversionFactor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IngredientObjectItemsInnerCalorieConversionFactor is not found in the empty JSON string", IngredientObjectItemsInnerCalorieConversionFactor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IngredientObjectItemsInnerCalorieConversionFactor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IngredientObjectItemsInnerCalorieConversionFactor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IngredientObjectItemsInnerCalorieConversionFactor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IngredientObjectItemsInnerCalorieConversionFactor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IngredientObjectItemsInnerCalorieConversionFactor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IngredientObjectItemsInnerCalorieConversionFactor.class));

       return (TypeAdapter<T>) new TypeAdapter<IngredientObjectItemsInnerCalorieConversionFactor>() {
           @Override
           public void write(JsonWriter out, IngredientObjectItemsInnerCalorieConversionFactor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IngredientObjectItemsInnerCalorieConversionFactor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IngredientObjectItemsInnerCalorieConversionFactor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IngredientObjectItemsInnerCalorieConversionFactor
   * @throws IOException if the JSON string is invalid with respect to IngredientObjectItemsInnerCalorieConversionFactor
   */
  public static IngredientObjectItemsInnerCalorieConversionFactor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IngredientObjectItemsInnerCalorieConversionFactor.class);
  }

  /**
   * Convert an instance of IngredientObjectItemsInnerCalorieConversionFactor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

