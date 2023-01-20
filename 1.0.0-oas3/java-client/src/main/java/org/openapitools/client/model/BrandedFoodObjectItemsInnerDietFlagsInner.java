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
 * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:43.083627-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BrandedFoodObjectItemsInnerDietFlagsInner {
  public static final String SERIALIZED_NAME_COMPATIBILITY_DESCRIPTION = "compatibility_description";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY_DESCRIPTION)
  private String compatibilityDescription;

  public static final String SERIALIZED_NAME_COMPATIBILITY_LEVEL = "compatibility_level";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY_LEVEL)
  private Integer compatibilityLevel;

  public static final String SERIALIZED_NAME_DIET_LABEL = "diet_label";
  @SerializedName(SERIALIZED_NAME_DIET_LABEL)
  private String dietLabel;

  public static final String SERIALIZED_NAME_INGREDIENT = "ingredient";
  @SerializedName(SERIALIZED_NAME_INGREDIENT)
  private String ingredient;

  public static final String SERIALIZED_NAME_INGREDIENT_DESCRIPTION = "ingredient_description";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_DESCRIPTION)
  private String ingredientDescription;

  public static final String SERIALIZED_NAME_IS_ALLERGEN = "is_allergen";
  @SerializedName(SERIALIZED_NAME_IS_ALLERGEN)
  private Boolean isAllergen;

  public static final String SERIALIZED_NAME_IS_COMPATIBLE = "is_compatible";
  @SerializedName(SERIALIZED_NAME_IS_COMPATIBLE)
  private String isCompatible;

  public BrandedFoodObjectItemsInnerDietFlagsInner() {
  }

  public BrandedFoodObjectItemsInnerDietFlagsInner compatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
    return this;
  }

  /**
   * A description of how we graded this ingredient for compatibility with the diet
   * @return compatibilityDescription
   */
  @javax.annotation.Nullable
  public String getCompatibilityDescription() {
    return compatibilityDescription;
  }

  public void setCompatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
  }


  public BrandedFoodObjectItemsInnerDietFlagsInner compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

  /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
   * @return compatibilityLevel
   */
  @javax.annotation.Nullable
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }


  public BrandedFoodObjectItemsInnerDietFlagsInner dietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
    return this;
  }

  /**
   * Name of the diet with which this ingredient may not be compatible
   * @return dietLabel
   */
  @javax.annotation.Nullable
  public String getDietLabel() {
    return dietLabel;
  }

  public void setDietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
  }


  public BrandedFoodObjectItemsInnerDietFlagsInner ingredient(String ingredient) {
    this.ingredient = ingredient;
    return this;
  }

  /**
   * Ingredient name
   * @return ingredient
   */
  @javax.annotation.Nullable
  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }


  public BrandedFoodObjectItemsInnerDietFlagsInner ingredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
    return this;
  }

  /**
   * Description of the ingredient
   * @return ingredientDescription
   */
  @javax.annotation.Nullable
  public String getIngredientDescription() {
    return ingredientDescription;
  }

  public void setIngredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
  }


  public BrandedFoodObjectItemsInnerDietFlagsInner isAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
    return this;
  }

  /**
   * Boolean representing if the ingredient is a known allergen
   * @return isAllergen
   */
  @javax.annotation.Nullable
  public Boolean getIsAllergen() {
    return isAllergen;
  }

  public void setIsAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
  }


  public BrandedFoodObjectItemsInnerDietFlagsInner isCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

  /**
   * A description of if we believe this ingredient is compatible with the diet
   * @return isCompatible
   */
  @javax.annotation.Nullable
  public String getIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectItemsInnerDietFlagsInner brandedFoodObjectItemsInnerDietFlagsInner = (BrandedFoodObjectItemsInnerDietFlagsInner) o;
    return Objects.equals(this.compatibilityDescription, brandedFoodObjectItemsInnerDietFlagsInner.compatibilityDescription) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectItemsInnerDietFlagsInner.compatibilityLevel) &&
        Objects.equals(this.dietLabel, brandedFoodObjectItemsInnerDietFlagsInner.dietLabel) &&
        Objects.equals(this.ingredient, brandedFoodObjectItemsInnerDietFlagsInner.ingredient) &&
        Objects.equals(this.ingredientDescription, brandedFoodObjectItemsInnerDietFlagsInner.ingredientDescription) &&
        Objects.equals(this.isAllergen, brandedFoodObjectItemsInnerDietFlagsInner.isAllergen) &&
        Objects.equals(this.isCompatible, brandedFoodObjectItemsInnerDietFlagsInner.isCompatible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compatibilityDescription, compatibilityLevel, dietLabel, ingredient, ingredientDescription, isAllergen, isCompatible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItemsInnerDietFlagsInner {\n");
    sb.append("    compatibilityDescription: ").append(toIndentedString(compatibilityDescription)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    dietLabel: ").append(toIndentedString(dietLabel)).append("\n");
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    ingredientDescription: ").append(toIndentedString(ingredientDescription)).append("\n");
    sb.append("    isAllergen: ").append(toIndentedString(isAllergen)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
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
    openapiFields.add("compatibility_description");
    openapiFields.add("compatibility_level");
    openapiFields.add("diet_label");
    openapiFields.add("ingredient");
    openapiFields.add("ingredient_description");
    openapiFields.add("is_allergen");
    openapiFields.add("is_compatible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BrandedFoodObjectItemsInnerDietFlagsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandedFoodObjectItemsInnerDietFlagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandedFoodObjectItemsInnerDietFlagsInner is not found in the empty JSON string", BrandedFoodObjectItemsInnerDietFlagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandedFoodObjectItemsInnerDietFlagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandedFoodObjectItemsInnerDietFlagsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("compatibility_description") != null && !jsonObj.get("compatibility_description").isJsonNull()) && !jsonObj.get("compatibility_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compatibility_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compatibility_description").toString()));
      }
      if ((jsonObj.get("diet_label") != null && !jsonObj.get("diet_label").isJsonNull()) && !jsonObj.get("diet_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diet_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diet_label").toString()));
      }
      if ((jsonObj.get("ingredient") != null && !jsonObj.get("ingredient").isJsonNull()) && !jsonObj.get("ingredient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingredient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingredient").toString()));
      }
      if ((jsonObj.get("ingredient_description") != null && !jsonObj.get("ingredient_description").isJsonNull()) && !jsonObj.get("ingredient_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingredient_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingredient_description").toString()));
      }
      if ((jsonObj.get("is_compatible") != null && !jsonObj.get("is_compatible").isJsonNull()) && !jsonObj.get("is_compatible").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_compatible` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_compatible").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandedFoodObjectItemsInnerDietFlagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandedFoodObjectItemsInnerDietFlagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandedFoodObjectItemsInnerDietFlagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandedFoodObjectItemsInnerDietFlagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandedFoodObjectItemsInnerDietFlagsInner>() {
           @Override
           public void write(JsonWriter out, BrandedFoodObjectItemsInnerDietFlagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandedFoodObjectItemsInnerDietFlagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BrandedFoodObjectItemsInnerDietFlagsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrandedFoodObjectItemsInnerDietFlagsInner
   * @throws IOException if the JSON string is invalid with respect to BrandedFoodObjectItemsInnerDietFlagsInner
   */
  public static BrandedFoodObjectItemsInnerDietFlagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandedFoodObjectItemsInnerDietFlagsInner.class);
  }

  /**
   * Convert an instance of BrandedFoodObjectItemsInnerDietFlagsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

