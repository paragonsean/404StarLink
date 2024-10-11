/*
 * Ad Exchange Buyer API II
 * Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
 *
 * The version of the OpenAPI document: v2beta1
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
import org.openapitools.client.model.AdSize;

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
 * Represents information for a creative that is associated with a Programmatic Guaranteed/Preferred Deal in Ad Manager.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreativeSpecification {
  public static final String SERIALIZED_NAME_CREATIVE_COMPANION_SIZES = "creativeCompanionSizes";
  @SerializedName(SERIALIZED_NAME_CREATIVE_COMPANION_SIZES)
  private List<AdSize> creativeCompanionSizes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATIVE_SIZE = "creativeSize";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SIZE)
  private AdSize creativeSize;

  public CreativeSpecification() {
  }

  public CreativeSpecification creativeCompanionSizes(List<AdSize> creativeCompanionSizes) {
    this.creativeCompanionSizes = creativeCompanionSizes;
    return this;
  }

  public CreativeSpecification addCreativeCompanionSizesItem(AdSize creativeCompanionSizesItem) {
    if (this.creativeCompanionSizes == null) {
      this.creativeCompanionSizes = new ArrayList<>();
    }
    this.creativeCompanionSizes.add(creativeCompanionSizesItem);
    return this;
  }

  /**
   * Companion sizes may be filled in only when this is a video creative.
   * @return creativeCompanionSizes
   */
  @javax.annotation.Nullable
  public List<AdSize> getCreativeCompanionSizes() {
    return creativeCompanionSizes;
  }

  public void setCreativeCompanionSizes(List<AdSize> creativeCompanionSizes) {
    this.creativeCompanionSizes = creativeCompanionSizes;
  }


  public CreativeSpecification creativeSize(AdSize creativeSize) {
    this.creativeSize = creativeSize;
    return this;
  }

  /**
   * Get creativeSize
   * @return creativeSize
   */
  @javax.annotation.Nullable
  public AdSize getCreativeSize() {
    return creativeSize;
  }

  public void setCreativeSize(AdSize creativeSize) {
    this.creativeSize = creativeSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeSpecification creativeSpecification = (CreativeSpecification) o;
    return Objects.equals(this.creativeCompanionSizes, creativeSpecification.creativeCompanionSizes) &&
        Objects.equals(this.creativeSize, creativeSpecification.creativeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeCompanionSizes, creativeSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeSpecification {\n");
    sb.append("    creativeCompanionSizes: ").append(toIndentedString(creativeCompanionSizes)).append("\n");
    sb.append("    creativeSize: ").append(toIndentedString(creativeSize)).append("\n");
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
    openapiFields.add("creativeCompanionSizes");
    openapiFields.add("creativeSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreativeSpecification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreativeSpecification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreativeSpecification is not found in the empty JSON string", CreativeSpecification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreativeSpecification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreativeSpecification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("creativeCompanionSizes") != null && !jsonObj.get("creativeCompanionSizes").isJsonNull()) {
        JsonArray jsonArraycreativeCompanionSizes = jsonObj.getAsJsonArray("creativeCompanionSizes");
        if (jsonArraycreativeCompanionSizes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("creativeCompanionSizes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `creativeCompanionSizes` to be an array in the JSON string but got `%s`", jsonObj.get("creativeCompanionSizes").toString()));
          }

          // validate the optional field `creativeCompanionSizes` (array)
          for (int i = 0; i < jsonArraycreativeCompanionSizes.size(); i++) {
            AdSize.validateJsonElement(jsonArraycreativeCompanionSizes.get(i));
          };
        }
      }
      // validate the optional field `creativeSize`
      if (jsonObj.get("creativeSize") != null && !jsonObj.get("creativeSize").isJsonNull()) {
        AdSize.validateJsonElement(jsonObj.get("creativeSize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeSpecification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeSpecification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeSpecification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeSpecification.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeSpecification>() {
           @Override
           public void write(JsonWriter out, CreativeSpecification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeSpecification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreativeSpecification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreativeSpecification
   * @throws IOException if the JSON string is invalid with respect to CreativeSpecification
   */
  public static CreativeSpecification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeSpecification.class);
  }

  /**
   * Convert an instance of CreativeSpecification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

