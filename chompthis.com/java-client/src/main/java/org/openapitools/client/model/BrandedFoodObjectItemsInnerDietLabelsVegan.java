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
 * An object containing information on this item&#39;s compatibility with the Vegan diets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:45.542408-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BrandedFoodObjectItemsInnerDietLabelsVegan {
  public static final String SERIALIZED_NAME_COMPATIBILITY_LEVEL = "compatibility_level";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY_LEVEL)
  private Integer compatibilityLevel;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Integer confidence;

  public static final String SERIALIZED_NAME_CONFIDENCE_DESCRIPTION = "confidence_description";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_DESCRIPTION)
  private String confidenceDescription;

  public static final String SERIALIZED_NAME_IS_COMPATIBLE = "is_compatible";
  @SerializedName(SERIALIZED_NAME_IS_COMPATIBLE)
  private Boolean isCompatible;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public BrandedFoodObjectItemsInnerDietLabelsVegan() {
  }

  public BrandedFoodObjectItemsInnerDietLabelsVegan compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

  /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
   * @return compatibilityLevel
   */
  @javax.annotation.Nullable
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }


  public BrandedFoodObjectItemsInnerDietLabelsVegan confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Boolean that indicates if we are confident in how this item is graded for this diet
   * @return confidence
   */
  @javax.annotation.Nullable
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  public BrandedFoodObjectItemsInnerDietLabelsVegan confidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
    return this;
  }

  /**
   * Description of our confidence that this item was graded correctly
   * @return confidenceDescription
   */
  @javax.annotation.Nullable
  public String getConfidenceDescription() {
    return confidenceDescription;
  }

  public void setConfidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
  }


  public BrandedFoodObjectItemsInnerDietLabelsVegan isCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

  /**
   * Boolean describing if this item is compatible with this diet
   * @return isCompatible
   */
  @javax.annotation.Nullable
  public Boolean getIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }


  public BrandedFoodObjectItemsInnerDietLabelsVegan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Diet name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectItemsInnerDietLabelsVegan brandedFoodObjectItemsInnerDietLabelsVegan = (BrandedFoodObjectItemsInnerDietLabelsVegan) o;
    return Objects.equals(this.compatibilityLevel, brandedFoodObjectItemsInnerDietLabelsVegan.compatibilityLevel) &&
        Objects.equals(this.confidence, brandedFoodObjectItemsInnerDietLabelsVegan.confidence) &&
        Objects.equals(this.confidenceDescription, brandedFoodObjectItemsInnerDietLabelsVegan.confidenceDescription) &&
        Objects.equals(this.isCompatible, brandedFoodObjectItemsInnerDietLabelsVegan.isCompatible) &&
        Objects.equals(this.name, brandedFoodObjectItemsInnerDietLabelsVegan.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compatibilityLevel, confidence, confidenceDescription, isCompatible, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItemsInnerDietLabelsVegan {\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    confidenceDescription: ").append(toIndentedString(confidenceDescription)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("compatibility_level");
    openapiFields.add("confidence");
    openapiFields.add("confidence_description");
    openapiFields.add("is_compatible");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BrandedFoodObjectItemsInnerDietLabelsVegan
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandedFoodObjectItemsInnerDietLabelsVegan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandedFoodObjectItemsInnerDietLabelsVegan is not found in the empty JSON string", BrandedFoodObjectItemsInnerDietLabelsVegan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandedFoodObjectItemsInnerDietLabelsVegan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandedFoodObjectItemsInnerDietLabelsVegan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("confidence_description") != null && !jsonObj.get("confidence_description").isJsonNull()) && !jsonObj.get("confidence_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidence_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confidence_description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandedFoodObjectItemsInnerDietLabelsVegan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandedFoodObjectItemsInnerDietLabelsVegan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandedFoodObjectItemsInnerDietLabelsVegan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandedFoodObjectItemsInnerDietLabelsVegan.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandedFoodObjectItemsInnerDietLabelsVegan>() {
           @Override
           public void write(JsonWriter out, BrandedFoodObjectItemsInnerDietLabelsVegan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandedFoodObjectItemsInnerDietLabelsVegan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BrandedFoodObjectItemsInnerDietLabelsVegan given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrandedFoodObjectItemsInnerDietLabelsVegan
   * @throws IOException if the JSON string is invalid with respect to BrandedFoodObjectItemsInnerDietLabelsVegan
   */
  public static BrandedFoodObjectItemsInnerDietLabelsVegan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandedFoodObjectItemsInnerDietLabelsVegan.class);
  }

  /**
   * Convert an instance of BrandedFoodObjectItemsInnerDietLabelsVegan to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

