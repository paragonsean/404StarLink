/*
 * Playable Locations API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import java.util.Arrays;
import org.openapitools.client.model.GoogleMapsPlayablelocationsV3SampleFilter;

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
 * Encapsulates a filter criterion for searching for a set of playable locations.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:48.084666-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleMapsPlayablelocationsV3SampleCriterion {
  public static final String SERIALIZED_NAME_FIELDS_TO_RETURN = "fieldsToReturn";
  @SerializedName(SERIALIZED_NAME_FIELDS_TO_RETURN)
  private String fieldsToReturn;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private GoogleMapsPlayablelocationsV3SampleFilter filter;

  public static final String SERIALIZED_NAME_GAME_OBJECT_TYPE = "gameObjectType";
  @SerializedName(SERIALIZED_NAME_GAME_OBJECT_TYPE)
  private Integer gameObjectType;

  public GoogleMapsPlayablelocationsV3SampleCriterion() {
  }

  public GoogleMapsPlayablelocationsV3SampleCriterion fieldsToReturn(String fieldsToReturn) {
    this.fieldsToReturn = fieldsToReturn;
    return this;
  }

  /**
   * Specifies which &#x60;PlayableLocation&#x60; fields are returned. &#x60;name&#x60; (which is used for logging impressions), &#x60;center_point&#x60; and &#x60;place_id&#x60; (or &#x60;plus_code&#x60;) are always returned. The following fields are omitted unless you specify them here: * snapped_point * types Note: The more fields you include, the more expensive in terms of data and associated latency your query will be.
   * @return fieldsToReturn
   */
  @javax.annotation.Nullable
  public String getFieldsToReturn() {
    return fieldsToReturn;
  }

  public void setFieldsToReturn(String fieldsToReturn) {
    this.fieldsToReturn = fieldsToReturn;
  }


  public GoogleMapsPlayablelocationsV3SampleCriterion filter(GoogleMapsPlayablelocationsV3SampleFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public GoogleMapsPlayablelocationsV3SampleFilter getFilter() {
    return filter;
  }

  public void setFilter(GoogleMapsPlayablelocationsV3SampleFilter filter) {
    this.filter = filter;
  }


  public GoogleMapsPlayablelocationsV3SampleCriterion gameObjectType(Integer gameObjectType) {
    this.gameObjectType = gameObjectType;
    return this;
  }

  /**
   * Required. An arbitrary, developer-defined identifier of the type of game object that the playable location is used for. This field allows you to specify criteria per game object type when searching for playable locations. You should assign a unique &#x60;game_object_type&#x60; ID across all &#x60;request_criteria&#x60; to represent a distinct type of game object. For example, 1&#x3D;monster location, 2&#x3D;powerup location. The response contains a map.
   * @return gameObjectType
   */
  @javax.annotation.Nullable
  public Integer getGameObjectType() {
    return gameObjectType;
  }

  public void setGameObjectType(Integer gameObjectType) {
    this.gameObjectType = gameObjectType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleMapsPlayablelocationsV3SampleCriterion googleMapsPlayablelocationsV3SampleCriterion = (GoogleMapsPlayablelocationsV3SampleCriterion) o;
    return Objects.equals(this.fieldsToReturn, googleMapsPlayablelocationsV3SampleCriterion.fieldsToReturn) &&
        Objects.equals(this.filter, googleMapsPlayablelocationsV3SampleCriterion.filter) &&
        Objects.equals(this.gameObjectType, googleMapsPlayablelocationsV3SampleCriterion.gameObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldsToReturn, filter, gameObjectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleMapsPlayablelocationsV3SampleCriterion {\n");
    sb.append("    fieldsToReturn: ").append(toIndentedString(fieldsToReturn)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    gameObjectType: ").append(toIndentedString(gameObjectType)).append("\n");
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
    openapiFields.add("fieldsToReturn");
    openapiFields.add("filter");
    openapiFields.add("gameObjectType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleMapsPlayablelocationsV3SampleCriterion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleMapsPlayablelocationsV3SampleCriterion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleMapsPlayablelocationsV3SampleCriterion is not found in the empty JSON string", GoogleMapsPlayablelocationsV3SampleCriterion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleMapsPlayablelocationsV3SampleCriterion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleMapsPlayablelocationsV3SampleCriterion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fieldsToReturn") != null && !jsonObj.get("fieldsToReturn").isJsonNull()) && !jsonObj.get("fieldsToReturn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldsToReturn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldsToReturn").toString()));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        GoogleMapsPlayablelocationsV3SampleFilter.validateJsonElement(jsonObj.get("filter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleMapsPlayablelocationsV3SampleCriterion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleMapsPlayablelocationsV3SampleCriterion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleMapsPlayablelocationsV3SampleCriterion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleMapsPlayablelocationsV3SampleCriterion.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleMapsPlayablelocationsV3SampleCriterion>() {
           @Override
           public void write(JsonWriter out, GoogleMapsPlayablelocationsV3SampleCriterion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleMapsPlayablelocationsV3SampleCriterion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleMapsPlayablelocationsV3SampleCriterion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleMapsPlayablelocationsV3SampleCriterion
   * @throws IOException if the JSON string is invalid with respect to GoogleMapsPlayablelocationsV3SampleCriterion
   */
  public static GoogleMapsPlayablelocationsV3SampleCriterion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleMapsPlayablelocationsV3SampleCriterion.class);
  }

  /**
   * Convert an instance of GoogleMapsPlayablelocationsV3SampleCriterion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

