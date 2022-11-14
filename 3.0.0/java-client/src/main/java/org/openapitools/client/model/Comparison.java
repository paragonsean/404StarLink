/*
 * Crossbrowsertesting.com Screenshot Comparisons API
 * What's in this version:   1. Compare two screenshots for layout differences   2. Compare a full screenshot test of browsers to a single baseline browser for layout differences.   3. Compare a screenshot test version to another test version - good for regression tests.   4. Get links to the Comparison UI for visual representation of layout differences
 *
 * The version of the OpenAPI document: 3.0.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Element;

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
 * Comparison
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:20.933088-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Comparison {
  public static final String SERIALIZED_NAME_DIFFERENCES = "differences";
  @SerializedName(SERIALIZED_NAME_DIFFERENCES)
  private Integer differences;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<Element> elements = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Boolean error;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SHOW_COMPARISONS_PUBLIC_URL = "show_comparisons_public_url";
  @SerializedName(SERIALIZED_NAME_SHOW_COMPARISONS_PUBLIC_URL)
  private String showComparisonsPublicUrl;

  public static final String SERIALIZED_NAME_SHOW_COMPARISONS_WEB_URL = "show_comparisons_web_url";
  @SerializedName(SERIALIZED_NAME_SHOW_COMPARISONS_WEB_URL)
  private String showComparisonsWebUrl;

  public static final String SERIALIZED_NAME_TOLERANCE = "tolerance";
  @SerializedName(SERIALIZED_NAME_TOLERANCE)
  private Integer tolerance;

  public Comparison() {
  }

  public Comparison differences(Integer differences) {
    this.differences = differences;
    return this;
  }

  /**
   * Get differences
   * @return differences
   */
  @javax.annotation.Nullable
  public Integer getDifferences() {
    return differences;
  }

  public void setDifferences(Integer differences) {
    this.differences = differences;
  }


  public Comparison elements(List<Element> elements) {
    this.elements = elements;
    return this;
  }

  public Comparison addElementsItem(Element elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
   */
  @javax.annotation.Nullable
  public List<Element> getElements() {
    return elements;
  }

  public void setElements(List<Element> elements) {
    this.elements = elements;
  }


  public Comparison error(Boolean error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }


  public Comparison message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Comparison showComparisonsPublicUrl(String showComparisonsPublicUrl) {
    this.showComparisonsPublicUrl = showComparisonsPublicUrl;
    return this;
  }

  /**
   * Get showComparisonsPublicUrl
   * @return showComparisonsPublicUrl
   */
  @javax.annotation.Nullable
  public String getShowComparisonsPublicUrl() {
    return showComparisonsPublicUrl;
  }

  public void setShowComparisonsPublicUrl(String showComparisonsPublicUrl) {
    this.showComparisonsPublicUrl = showComparisonsPublicUrl;
  }


  public Comparison showComparisonsWebUrl(String showComparisonsWebUrl) {
    this.showComparisonsWebUrl = showComparisonsWebUrl;
    return this;
  }

  /**
   * Get showComparisonsWebUrl
   * @return showComparisonsWebUrl
   */
  @javax.annotation.Nullable
  public String getShowComparisonsWebUrl() {
    return showComparisonsWebUrl;
  }

  public void setShowComparisonsWebUrl(String showComparisonsWebUrl) {
    this.showComparisonsWebUrl = showComparisonsWebUrl;
  }


  public Comparison tolerance(Integer tolerance) {
    this.tolerance = tolerance;
    return this;
  }

  /**
   * Get tolerance
   * @return tolerance
   */
  @javax.annotation.Nullable
  public Integer getTolerance() {
    return tolerance;
  }

  public void setTolerance(Integer tolerance) {
    this.tolerance = tolerance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comparison comparison = (Comparison) o;
    return Objects.equals(this.differences, comparison.differences) &&
        Objects.equals(this.elements, comparison.elements) &&
        Objects.equals(this.error, comparison.error) &&
        Objects.equals(this.message, comparison.message) &&
        Objects.equals(this.showComparisonsPublicUrl, comparison.showComparisonsPublicUrl) &&
        Objects.equals(this.showComparisonsWebUrl, comparison.showComparisonsWebUrl) &&
        Objects.equals(this.tolerance, comparison.tolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(differences, elements, error, message, showComparisonsPublicUrl, showComparisonsWebUrl, tolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comparison {\n");
    sb.append("    differences: ").append(toIndentedString(differences)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    showComparisonsPublicUrl: ").append(toIndentedString(showComparisonsPublicUrl)).append("\n");
    sb.append("    showComparisonsWebUrl: ").append(toIndentedString(showComparisonsWebUrl)).append("\n");
    sb.append("    tolerance: ").append(toIndentedString(tolerance)).append("\n");
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
    openapiFields.add("differences");
    openapiFields.add("elements");
    openapiFields.add("error");
    openapiFields.add("message");
    openapiFields.add("show_comparisons_public_url");
    openapiFields.add("show_comparisons_web_url");
    openapiFields.add("tolerance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Comparison
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Comparison.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Comparison is not found in the empty JSON string", Comparison.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Comparison.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Comparison` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("elements") != null && !jsonObj.get("elements").isJsonNull()) {
        JsonArray jsonArrayelements = jsonObj.getAsJsonArray("elements");
        if (jsonArrayelements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("elements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `elements` to be an array in the JSON string but got `%s`", jsonObj.get("elements").toString()));
          }

          // validate the optional field `elements` (array)
          for (int i = 0; i < jsonArrayelements.size(); i++) {
            Element.validateJsonElement(jsonArrayelements.get(i));
          };
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("show_comparisons_public_url") != null && !jsonObj.get("show_comparisons_public_url").isJsonNull()) && !jsonObj.get("show_comparisons_public_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_comparisons_public_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_comparisons_public_url").toString()));
      }
      if ((jsonObj.get("show_comparisons_web_url") != null && !jsonObj.get("show_comparisons_web_url").isJsonNull()) && !jsonObj.get("show_comparisons_web_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_comparisons_web_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_comparisons_web_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Comparison.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Comparison' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Comparison> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Comparison.class));

       return (TypeAdapter<T>) new TypeAdapter<Comparison>() {
           @Override
           public void write(JsonWriter out, Comparison value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Comparison read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Comparison given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Comparison
   * @throws IOException if the JSON string is invalid with respect to Comparison
   */
  public static Comparison fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Comparison.class);
  }

  /**
   * Convert an instance of Comparison to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

