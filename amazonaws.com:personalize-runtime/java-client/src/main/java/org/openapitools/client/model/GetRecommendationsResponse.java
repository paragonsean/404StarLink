/*
 * Amazon Personalize Runtime
 * <p/>
 *
 * The version of the OpenAPI document: 2018-05-22
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
 * GetRecommendationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:55.811291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRecommendationsResponse {
  public static final String SERIALIZED_NAME_ITEM_LIST = "itemList";
  @SerializedName(SERIALIZED_NAME_ITEM_LIST)
  private List itemList;

  public static final String SERIALIZED_NAME_RECOMMENDATION_ID = "recommendationId";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION_ID)
  private String recommendationId;

  public GetRecommendationsResponse() {
  }

  public GetRecommendationsResponse itemList(List itemList) {
    this.itemList = itemList;
    return this;
  }

  /**
   * Get itemList
   * @return itemList
   */
  @javax.annotation.Nullable
  public List getItemList() {
    return itemList;
  }

  public void setItemList(List itemList) {
    this.itemList = itemList;
  }


  public GetRecommendationsResponse recommendationId(String recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * Get recommendationId
   * @return recommendationId
   */
  @javax.annotation.Nullable
  public String getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(String recommendationId) {
    this.recommendationId = recommendationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecommendationsResponse getRecommendationsResponse = (GetRecommendationsResponse) o;
    return Objects.equals(this.itemList, getRecommendationsResponse.itemList) &&
        Objects.equals(this.recommendationId, getRecommendationsResponse.recommendationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemList, recommendationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecommendationsResponse {\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
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
    openapiFields.add("itemList");
    openapiFields.add("recommendationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRecommendationsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecommendationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecommendationsResponse is not found in the empty JSON string", GetRecommendationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecommendationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecommendationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `itemList`
      if (jsonObj.get("itemList") != null && !jsonObj.get("itemList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("itemList"));
      }
      // validate the optional field `recommendationId`
      if (jsonObj.get("recommendationId") != null && !jsonObj.get("recommendationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("recommendationId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecommendationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecommendationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecommendationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecommendationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecommendationsResponse>() {
           @Override
           public void write(JsonWriter out, GetRecommendationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecommendationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRecommendationsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRecommendationsResponse
   * @throws IOException if the JSON string is invalid with respect to GetRecommendationsResponse
   */
  public static GetRecommendationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecommendationsResponse.class);
  }

  /**
   * Convert an instance of GetRecommendationsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

