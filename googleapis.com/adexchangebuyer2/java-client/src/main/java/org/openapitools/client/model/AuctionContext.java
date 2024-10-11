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
 * Output only. The auction type the restriction applies to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AuctionContext {
  /**
   * Gets or Sets auctionTypes
   */
  @JsonAdapter(AuctionTypesEnum.Adapter.class)
  public enum AuctionTypesEnum {
    OPEN_AUCTION("OPEN_AUCTION"),
    
    DIRECT_DEALS("DIRECT_DEALS");

    private String value;

    AuctionTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuctionTypesEnum fromValue(String value) {
      for (AuctionTypesEnum b : AuctionTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuctionTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuctionTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuctionTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuctionTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AuctionTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUCTION_TYPES = "auctionTypes";
  @SerializedName(SERIALIZED_NAME_AUCTION_TYPES)
  private List<AuctionTypesEnum> auctionTypes = new ArrayList<>();

  public AuctionContext() {
  }

  public AuctionContext auctionTypes(List<AuctionTypesEnum> auctionTypes) {
    this.auctionTypes = auctionTypes;
    return this;
  }

  public AuctionContext addAuctionTypesItem(AuctionTypesEnum auctionTypesItem) {
    if (this.auctionTypes == null) {
      this.auctionTypes = new ArrayList<>();
    }
    this.auctionTypes.add(auctionTypesItem);
    return this;
  }

  /**
   * The auction types this restriction applies to.
   * @return auctionTypes
   */
  @javax.annotation.Nullable
  public List<AuctionTypesEnum> getAuctionTypes() {
    return auctionTypes;
  }

  public void setAuctionTypes(List<AuctionTypesEnum> auctionTypes) {
    this.auctionTypes = auctionTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuctionContext auctionContext = (AuctionContext) o;
    return Objects.equals(this.auctionTypes, auctionContext.auctionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auctionTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuctionContext {\n");
    sb.append("    auctionTypes: ").append(toIndentedString(auctionTypes)).append("\n");
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
    openapiFields.add("auctionTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuctionContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuctionContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuctionContext is not found in the empty JSON string", AuctionContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuctionContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuctionContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("auctionTypes") != null && !jsonObj.get("auctionTypes").isJsonNull() && !jsonObj.get("auctionTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auctionTypes` to be an array in the JSON string but got `%s`", jsonObj.get("auctionTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuctionContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuctionContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuctionContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuctionContext.class));

       return (TypeAdapter<T>) new TypeAdapter<AuctionContext>() {
           @Override
           public void write(JsonWriter out, AuctionContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuctionContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuctionContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuctionContext
   * @throws IOException if the JSON string is invalid with respect to AuctionContext
   */
  public static AuctionContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuctionContext.class);
  }

  /**
   * Convert an instance of AuctionContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

