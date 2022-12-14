/*
 * NeoWs - (Near Earth Object Web Service)
 * A web service for near earth objects. All the data is from the <a href=\"http://neo.jpl.nasa.gov/\" target=\"_blank\">NASA JPL Asteroid team</a>.      NeoWs is proud to power AsteroidTracker on <a href=\"https://itunes.apple.com/us/app/asteroid-tracker/id689684901?mt=8\" target=\"_blank\">iOS</a> and <a href=\"https://play.google.com/store/apps/details?id=com.vitruviussoftware.bunifish.asteroidtracker&feature\" target=\"_blank\">Android</a> as well as related apps.    Follow us on <a href=\"https://twitter.com/AsteroidTracker\" target=\"_blank\">Twitter</a>
 *
 * The version of the OpenAPI document: 1.0
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
 * RelVelocity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:00.362966-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RelVelocity {
  public static final String SERIALIZED_NAME_KILOMETERS_PER_HOUR = "kilometers_per_hour";
  @SerializedName(SERIALIZED_NAME_KILOMETERS_PER_HOUR)
  private String kilometersPerHour;

  public static final String SERIALIZED_NAME_MILES_PER_HOUR = "miles_per_hour";
  @SerializedName(SERIALIZED_NAME_MILES_PER_HOUR)
  private String milesPerHour;

  public RelVelocity() {
  }

  public RelVelocity kilometersPerHour(String kilometersPerHour) {
    this.kilometersPerHour = kilometersPerHour;
    return this;
  }

  /**
   * Get kilometersPerHour
   * @return kilometersPerHour
   */
  @javax.annotation.Nullable
  public String getKilometersPerHour() {
    return kilometersPerHour;
  }

  public void setKilometersPerHour(String kilometersPerHour) {
    this.kilometersPerHour = kilometersPerHour;
  }


  public RelVelocity milesPerHour(String milesPerHour) {
    this.milesPerHour = milesPerHour;
    return this;
  }

  /**
   * Get milesPerHour
   * @return milesPerHour
   */
  @javax.annotation.Nullable
  public String getMilesPerHour() {
    return milesPerHour;
  }

  public void setMilesPerHour(String milesPerHour) {
    this.milesPerHour = milesPerHour;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelVelocity relVelocity = (RelVelocity) o;
    return Objects.equals(this.kilometersPerHour, relVelocity.kilometersPerHour) &&
        Objects.equals(this.milesPerHour, relVelocity.milesPerHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kilometersPerHour, milesPerHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelVelocity {\n");
    sb.append("    kilometersPerHour: ").append(toIndentedString(kilometersPerHour)).append("\n");
    sb.append("    milesPerHour: ").append(toIndentedString(milesPerHour)).append("\n");
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
    openapiFields.add("kilometers_per_hour");
    openapiFields.add("miles_per_hour");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelVelocity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelVelocity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelVelocity is not found in the empty JSON string", RelVelocity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelVelocity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelVelocity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("kilometers_per_hour") != null && !jsonObj.get("kilometers_per_hour").isJsonNull()) && !jsonObj.get("kilometers_per_hour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kilometers_per_hour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kilometers_per_hour").toString()));
      }
      if ((jsonObj.get("miles_per_hour") != null && !jsonObj.get("miles_per_hour").isJsonNull()) && !jsonObj.get("miles_per_hour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `miles_per_hour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("miles_per_hour").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelVelocity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelVelocity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelVelocity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelVelocity.class));

       return (TypeAdapter<T>) new TypeAdapter<RelVelocity>() {
           @Override
           public void write(JsonWriter out, RelVelocity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelVelocity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelVelocity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelVelocity
   * @throws IOException if the JSON string is invalid with respect to RelVelocity
   */
  public static RelVelocity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelVelocity.class);
  }

  /**
   * Convert an instance of RelVelocity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

