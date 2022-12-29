/*
 * Catalog API
 * The Catalog API allows users to search for and locate an eBay catalog product that is a direct match for the product that they wish to sell. Listing against an eBay catalog product helps insure that all listings (based off of that catalog product) have complete and accurate information. In addition to helping to create high-quality listings, another benefit to the seller of using catalog information to create listings is that much of the details of the listing will be prefilled, including the listing title, the listing description, the item specifics, and a stock image for the product (if available). Sellers will not have to enter item specifics themselves, and the overall listing process is a lot faster and easier.
 *
 * The version of the OpenAPI document: v1_beta.5.0
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
 * This type contains information about one value of a specified aspect. This value serves as a product refinement.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:40.391429-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AspectValueDistribution {
  public static final String SERIALIZED_NAME_LOCALIZED_ASPECT_VALUE = "localizedAspectValue";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_ASPECT_VALUE)
  private String localizedAspectValue;

  public static final String SERIALIZED_NAME_MATCH_COUNT = "matchCount";
  @SerializedName(SERIALIZED_NAME_MATCH_COUNT)
  private Integer matchCount;

  public static final String SERIALIZED_NAME_REFINEMENT_HREF = "refinementHref";
  @SerializedName(SERIALIZED_NAME_REFINEMENT_HREF)
  private String refinementHref;

  public AspectValueDistribution() {
  }

  public AspectValueDistribution localizedAspectValue(String localizedAspectValue) {
    this.localizedAspectValue = localizedAspectValue;
    return this;
  }

  /**
   * The localized value of the category aspect identified by &lt;b&gt;refinement.aspectDistributions.localizedAspectName&lt;/b&gt;.
   * @return localizedAspectValue
   */
  @javax.annotation.Nullable
  public String getLocalizedAspectValue() {
    return localizedAspectValue;
  }

  public void setLocalizedAspectValue(String localizedAspectValue) {
    this.localizedAspectValue = localizedAspectValue;
  }


  public AspectValueDistribution matchCount(Integer matchCount) {
    this.matchCount = matchCount;
    return this;
  }

  /**
   * The number of times the value of &lt;b&gt;localizedAspectValue&lt;/b&gt; has been used for eBay product listings. By comparing this quantity to the &lt;b&gt;matchCount&lt;/b&gt; for other values of the same aspect, you can present a histogram of the values to sellers, who can use that information to select which aspect value is most appropriate for their product. You can then include the user-selected value in the the &lt;b&gt;search&lt;/b&gt; call&#39;s &lt;b&gt;aspect_filter&lt;/b&gt; parameter to refine your search.
   * @return matchCount
   */
  @javax.annotation.Nullable
  public Integer getMatchCount() {
    return matchCount;
  }

  public void setMatchCount(Integer matchCount) {
    this.matchCount = matchCount;
  }


  public AspectValueDistribution refinementHref(String refinementHref) {
    this.refinementHref = refinementHref;
    return this;
  }

  /**
   * A HATEOAS reference that further refines the search with this particular &lt;b&gt;localizedAspectValue&lt;/b&gt;.
   * @return refinementHref
   */
  @javax.annotation.Nullable
  public String getRefinementHref() {
    return refinementHref;
  }

  public void setRefinementHref(String refinementHref) {
    this.refinementHref = refinementHref;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AspectValueDistribution aspectValueDistribution = (AspectValueDistribution) o;
    return Objects.equals(this.localizedAspectValue, aspectValueDistribution.localizedAspectValue) &&
        Objects.equals(this.matchCount, aspectValueDistribution.matchCount) &&
        Objects.equals(this.refinementHref, aspectValueDistribution.refinementHref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedAspectValue, matchCount, refinementHref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AspectValueDistribution {\n");
    sb.append("    localizedAspectValue: ").append(toIndentedString(localizedAspectValue)).append("\n");
    sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
    sb.append("    refinementHref: ").append(toIndentedString(refinementHref)).append("\n");
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
    openapiFields.add("localizedAspectValue");
    openapiFields.add("matchCount");
    openapiFields.add("refinementHref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AspectValueDistribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AspectValueDistribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AspectValueDistribution is not found in the empty JSON string", AspectValueDistribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AspectValueDistribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AspectValueDistribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("localizedAspectValue") != null && !jsonObj.get("localizedAspectValue").isJsonNull()) && !jsonObj.get("localizedAspectValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localizedAspectValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localizedAspectValue").toString()));
      }
      if ((jsonObj.get("refinementHref") != null && !jsonObj.get("refinementHref").isJsonNull()) && !jsonObj.get("refinementHref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refinementHref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refinementHref").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AspectValueDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AspectValueDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AspectValueDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AspectValueDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<AspectValueDistribution>() {
           @Override
           public void write(JsonWriter out, AspectValueDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AspectValueDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AspectValueDistribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AspectValueDistribution
   * @throws IOException if the JSON string is invalid with respect to AspectValueDistribution
   */
  public static AspectValueDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AspectValueDistribution.class);
  }

  /**
   * Convert an instance of AspectValueDistribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

