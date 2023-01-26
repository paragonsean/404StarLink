/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
 * The properties in the Hotel Center account that can be managed with the Google Ads account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:54.390975-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HotelList {
  public static final String SERIALIZED_NAME_PARTNER_HOTEL_IDS = "partnerHotelIds";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_IDS)
  private List<String> partnerHotelIds = new ArrayList<>();

  public HotelList() {
  }

  public HotelList partnerHotelIds(List<String> partnerHotelIds) {
    this.partnerHotelIds = partnerHotelIds;
    return this;
  }

  public HotelList addPartnerHotelIdsItem(String partnerHotelIdsItem) {
    if (this.partnerHotelIds == null) {
      this.partnerHotelIds = new ArrayList<>();
    }
    this.partnerHotelIds.add(partnerHotelIdsItem);
    return this;
  }

  /**
   * Hotel IDs.
   * @return partnerHotelIds
   */
  @javax.annotation.Nullable
  public List<String> getPartnerHotelIds() {
    return partnerHotelIds;
  }

  public void setPartnerHotelIds(List<String> partnerHotelIds) {
    this.partnerHotelIds = partnerHotelIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelList hotelList = (HotelList) o;
    return Objects.equals(this.partnerHotelIds, hotelList.partnerHotelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerHotelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelList {\n");
    sb.append("    partnerHotelIds: ").append(toIndentedString(partnerHotelIds)).append("\n");
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
    openapiFields.add("partnerHotelIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HotelList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelList is not found in the empty JSON string", HotelList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HotelList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("partnerHotelIds") != null && !jsonObj.get("partnerHotelIds").isJsonNull() && !jsonObj.get("partnerHotelIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerHotelIds` to be an array in the JSON string but got `%s`", jsonObj.get("partnerHotelIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelList.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelList>() {
           @Override
           public void write(JsonWriter out, HotelList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HotelList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HotelList
   * @throws IOException if the JSON string is invalid with respect to HotelList
   */
  public static HotelList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelList.class);
  }

  /**
   * Convert an instance of HotelList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

