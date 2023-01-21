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
 * An object containing information on a specific food portion found in this item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:45.542408-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IngredientObjectItemsInnerPortionsInner {
  public static final String SERIALIZED_NAME_DATA_POINTS = "data_points";
  @SerializedName(SERIALIZED_NAME_DATA_POINTS)
  private Integer dataPoints;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FOOTNOTE = "footnote";
  @SerializedName(SERIALIZED_NAME_FOOTNOTE)
  private String footnote;

  public static final String SERIALIZED_NAME_GRAM_WEIGHT = "gram_weight";
  @SerializedName(SERIALIZED_NAME_GRAM_WEIGHT)
  private BigDecimal gramWeight;

  public static final String SERIALIZED_NAME_MEASUREMENT_UNIT = "measurement_unit";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_UNIT)
  private String measurementUnit;

  public static final String SERIALIZED_NAME_MODIFIER = "modifier";
  @SerializedName(SERIALIZED_NAME_MODIFIER)
  private String modifier;

  public IngredientObjectItemsInnerPortionsInner() {
  }

  public IngredientObjectItemsInnerPortionsInner dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * The number of observations on which the measure is based
   * @return dataPoints
   */
  @javax.annotation.Nullable
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }


  public IngredientObjectItemsInnerPortionsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public IngredientObjectItemsInnerPortionsInner footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
   * @return footnote
   */
  @javax.annotation.Nullable
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  public IngredientObjectItemsInnerPortionsInner gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

  /**
   * The weight of the measure in grams
   * @return gramWeight
   */
  @javax.annotation.Nullable
  public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }


  public IngredientObjectItemsInnerPortionsInner measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
   * @return measurementUnit
   */
  @javax.annotation.Nullable
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }


  public IngredientObjectItemsInnerPortionsInner modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
   * @return modifier
   */
  @javax.annotation.Nullable
  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectItemsInnerPortionsInner ingredientObjectItemsInnerPortionsInner = (IngredientObjectItemsInnerPortionsInner) o;
    return Objects.equals(this.dataPoints, ingredientObjectItemsInnerPortionsInner.dataPoints) &&
        Objects.equals(this.description, ingredientObjectItemsInnerPortionsInner.description) &&
        Objects.equals(this.footnote, ingredientObjectItemsInnerPortionsInner.footnote) &&
        Objects.equals(this.gramWeight, ingredientObjectItemsInnerPortionsInner.gramWeight) &&
        Objects.equals(this.measurementUnit, ingredientObjectItemsInnerPortionsInner.measurementUnit) &&
        Objects.equals(this.modifier, ingredientObjectItemsInnerPortionsInner.modifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPoints, description, footnote, gramWeight, measurementUnit, modifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItemsInnerPortionsInner {\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
    openapiFields.add("data_points");
    openapiFields.add("description");
    openapiFields.add("footnote");
    openapiFields.add("gram_weight");
    openapiFields.add("measurement_unit");
    openapiFields.add("modifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IngredientObjectItemsInnerPortionsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IngredientObjectItemsInnerPortionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IngredientObjectItemsInnerPortionsInner is not found in the empty JSON string", IngredientObjectItemsInnerPortionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IngredientObjectItemsInnerPortionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IngredientObjectItemsInnerPortionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("footnote") != null && !jsonObj.get("footnote").isJsonNull()) && !jsonObj.get("footnote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footnote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footnote").toString()));
      }
      if ((jsonObj.get("measurement_unit") != null && !jsonObj.get("measurement_unit").isJsonNull()) && !jsonObj.get("measurement_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measurement_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measurement_unit").toString()));
      }
      if ((jsonObj.get("modifier") != null && !jsonObj.get("modifier").isJsonNull()) && !jsonObj.get("modifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IngredientObjectItemsInnerPortionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IngredientObjectItemsInnerPortionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IngredientObjectItemsInnerPortionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IngredientObjectItemsInnerPortionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<IngredientObjectItemsInnerPortionsInner>() {
           @Override
           public void write(JsonWriter out, IngredientObjectItemsInnerPortionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IngredientObjectItemsInnerPortionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IngredientObjectItemsInnerPortionsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IngredientObjectItemsInnerPortionsInner
   * @throws IOException if the JSON string is invalid with respect to IngredientObjectItemsInnerPortionsInner
   */
  public static IngredientObjectItemsInnerPortionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IngredientObjectItemsInnerPortionsInner.class);
  }

  /**
   * Convert an instance of IngredientObjectItemsInnerPortionsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

