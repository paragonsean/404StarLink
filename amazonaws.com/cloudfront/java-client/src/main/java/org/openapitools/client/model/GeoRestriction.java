/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
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
import java.util.List;
import org.openapitools.client.model.GeoRestrictionType;

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
 * A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using &lt;code&gt;MaxMind&lt;/code&gt; GeoIP databases. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GeoRestriction {
  public static final String SERIALIZED_NAME_RESTRICTION_TYPE = "RestrictionType";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_TYPE)
  private GeoRestrictionType restrictionType;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List items;

  public GeoRestriction() {
  }

  public GeoRestriction restrictionType(GeoRestrictionType restrictionType) {
    this.restrictionType = restrictionType;
    return this;
  }

  /**
   * Get restrictionType
   * @return restrictionType
   */
  @javax.annotation.Nonnull
  public GeoRestrictionType getRestrictionType() {
    return restrictionType;
  }

  public void setRestrictionType(GeoRestrictionType restrictionType) {
    this.restrictionType = restrictionType;
  }


  public GeoRestriction quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nonnull
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public GeoRestriction items(List items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @javax.annotation.Nullable
  public List getItems() {
    return items;
  }

  public void setItems(List items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoRestriction geoRestriction = (GeoRestriction) o;
    return Objects.equals(this.restrictionType, geoRestriction.restrictionType) &&
        Objects.equals(this.quantity, geoRestriction.quantity) &&
        Objects.equals(this.items, geoRestriction.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictionType, quantity, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoRestriction {\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("RestrictionType");
    openapiFields.add("Quantity");
    openapiFields.add("Items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RestrictionType");
    openapiRequiredFields.add("Quantity");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GeoRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GeoRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeoRestriction is not found in the empty JSON string", GeoRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GeoRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GeoRestriction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GeoRestriction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `RestrictionType`
      GeoRestrictionType.validateJsonElement(jsonObj.get("RestrictionType"));
      // validate the required field `Quantity`
      Integer.validateJsonElement(jsonObj.get("Quantity"));
      // validate the optional field `Items`
      if (jsonObj.get("Items") != null && !jsonObj.get("Items").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Items"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeoRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeoRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeoRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeoRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<GeoRestriction>() {
           @Override
           public void write(JsonWriter out, GeoRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GeoRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GeoRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GeoRestriction
   * @throws IOException if the JSON string is invalid with respect to GeoRestriction
   */
  public static GeoRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeoRestriction.class);
  }

  /**
   * Convert an instance of GeoRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

