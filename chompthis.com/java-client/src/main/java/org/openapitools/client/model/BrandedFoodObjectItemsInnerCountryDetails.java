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
 * An object containing additional information on the countries where this item is found
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:45.542408-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BrandedFoodObjectItemsInnerCountryDetails {
  public static final String SERIALIZED_NAME_ENGLISH_SPEAKING = "english_speaking";
  @SerializedName(SERIALIZED_NAME_ENGLISH_SPEAKING)
  private Integer englishSpeaking;

  public static final String SERIALIZED_NAME_NON_ENGLISH_SPEAKING = "non_english_speaking";
  @SerializedName(SERIALIZED_NAME_NON_ENGLISH_SPEAKING)
  private Integer nonEnglishSpeaking;

  public BrandedFoodObjectItemsInnerCountryDetails() {
  }

  public BrandedFoodObjectItemsInnerCountryDetails englishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
    return this;
  }

  /**
   * The number of countries where English is the country&#39;s primary language
   * @return englishSpeaking
   */
  @javax.annotation.Nullable
  public Integer getEnglishSpeaking() {
    return englishSpeaking;
  }

  public void setEnglishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
  }


  public BrandedFoodObjectItemsInnerCountryDetails nonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
    return this;
  }

  /**
   * The number of countries where English is not the country&#39;s primary language
   * @return nonEnglishSpeaking
   */
  @javax.annotation.Nullable
  public Integer getNonEnglishSpeaking() {
    return nonEnglishSpeaking;
  }

  public void setNonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectItemsInnerCountryDetails brandedFoodObjectItemsInnerCountryDetails = (BrandedFoodObjectItemsInnerCountryDetails) o;
    return Objects.equals(this.englishSpeaking, brandedFoodObjectItemsInnerCountryDetails.englishSpeaking) &&
        Objects.equals(this.nonEnglishSpeaking, brandedFoodObjectItemsInnerCountryDetails.nonEnglishSpeaking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(englishSpeaking, nonEnglishSpeaking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItemsInnerCountryDetails {\n");
    sb.append("    englishSpeaking: ").append(toIndentedString(englishSpeaking)).append("\n");
    sb.append("    nonEnglishSpeaking: ").append(toIndentedString(nonEnglishSpeaking)).append("\n");
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
    openapiFields.add("english_speaking");
    openapiFields.add("non_english_speaking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BrandedFoodObjectItemsInnerCountryDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandedFoodObjectItemsInnerCountryDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandedFoodObjectItemsInnerCountryDetails is not found in the empty JSON string", BrandedFoodObjectItemsInnerCountryDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandedFoodObjectItemsInnerCountryDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandedFoodObjectItemsInnerCountryDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandedFoodObjectItemsInnerCountryDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandedFoodObjectItemsInnerCountryDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandedFoodObjectItemsInnerCountryDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandedFoodObjectItemsInnerCountryDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandedFoodObjectItemsInnerCountryDetails>() {
           @Override
           public void write(JsonWriter out, BrandedFoodObjectItemsInnerCountryDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandedFoodObjectItemsInnerCountryDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BrandedFoodObjectItemsInnerCountryDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrandedFoodObjectItemsInnerCountryDetails
   * @throws IOException if the JSON string is invalid with respect to BrandedFoodObjectItemsInnerCountryDetails
   */
  public static BrandedFoodObjectItemsInnerCountryDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandedFoodObjectItemsInnerCountryDetails.class);
  }

  /**
   * Convert an instance of BrandedFoodObjectItemsInnerCountryDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

