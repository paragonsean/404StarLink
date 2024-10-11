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
 * CreateDistribution20181105RequestDistributionConfigOrigins
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateDistribution20181105RequestDistributionConfigOrigins {
  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List items;

  public CreateDistribution20181105RequestDistributionConfigOrigins() {
  }

  public CreateDistribution20181105RequestDistributionConfigOrigins quantity(Integer quantity) {
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


  public CreateDistribution20181105RequestDistributionConfigOrigins items(List items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @javax.annotation.Nonnull
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
    CreateDistribution20181105RequestDistributionConfigOrigins createDistribution20181105RequestDistributionConfigOrigins = (CreateDistribution20181105RequestDistributionConfigOrigins) o;
    return Objects.equals(this.quantity, createDistribution20181105RequestDistributionConfigOrigins.quantity) &&
        Objects.equals(this.items, createDistribution20181105RequestDistributionConfigOrigins.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDistribution20181105RequestDistributionConfigOrigins {\n");
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
    openapiFields.add("Quantity");
    openapiFields.add("Items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Quantity");
    openapiRequiredFields.add("Items");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDistribution20181105RequestDistributionConfigOrigins
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDistribution20181105RequestDistributionConfigOrigins.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDistribution20181105RequestDistributionConfigOrigins is not found in the empty JSON string", CreateDistribution20181105RequestDistributionConfigOrigins.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDistribution20181105RequestDistributionConfigOrigins.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDistribution20181105RequestDistributionConfigOrigins` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDistribution20181105RequestDistributionConfigOrigins.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Quantity`
      Integer.validateJsonElement(jsonObj.get("Quantity"));
      // validate the required field `Items`
      List.validateJsonElement(jsonObj.get("Items"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDistribution20181105RequestDistributionConfigOrigins.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDistribution20181105RequestDistributionConfigOrigins' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDistribution20181105RequestDistributionConfigOrigins> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDistribution20181105RequestDistributionConfigOrigins.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDistribution20181105RequestDistributionConfigOrigins>() {
           @Override
           public void write(JsonWriter out, CreateDistribution20181105RequestDistributionConfigOrigins value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDistribution20181105RequestDistributionConfigOrigins read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDistribution20181105RequestDistributionConfigOrigins given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDistribution20181105RequestDistributionConfigOrigins
   * @throws IOException if the JSON string is invalid with respect to CreateDistribution20181105RequestDistributionConfigOrigins
   */
  public static CreateDistribution20181105RequestDistributionConfigOrigins fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDistribution20181105RequestDistributionConfigOrigins.class);
  }

  /**
   * Convert an instance of CreateDistribution20181105RequestDistributionConfigOrigins to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

