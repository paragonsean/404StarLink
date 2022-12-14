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
import org.openapitools.client.model.MissDistance;
import org.openapitools.client.model.RelVelocity;

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
 * CloseApproachData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:00.362966-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloseApproachData {
  public static final String SERIALIZED_NAME_CLOSE_APPROACH_DATE = "close_approach_date";
  @SerializedName(SERIALIZED_NAME_CLOSE_APPROACH_DATE)
  private String closeApproachDate;

  public static final String SERIALIZED_NAME_CLOSE_APPROACH_DATE_FULL = "close_approach_date_full";
  @SerializedName(SERIALIZED_NAME_CLOSE_APPROACH_DATE_FULL)
  private String closeApproachDateFull;

  public static final String SERIALIZED_NAME_EPOCH_DATE_CLOSE_APPROACH = "epoch_date_close_approach";
  @SerializedName(SERIALIZED_NAME_EPOCH_DATE_CLOSE_APPROACH)
  private Long epochDateCloseApproach;

  public static final String SERIALIZED_NAME_MISS_DISTANCE = "miss_distance";
  @SerializedName(SERIALIZED_NAME_MISS_DISTANCE)
  private MissDistance missDistance;

  public static final String SERIALIZED_NAME_ORBITING_BODY = "orbiting_body";
  @SerializedName(SERIALIZED_NAME_ORBITING_BODY)
  private String orbitingBody;

  public static final String SERIALIZED_NAME_RELATIVE_VELOCITY = "relative_velocity";
  @SerializedName(SERIALIZED_NAME_RELATIVE_VELOCITY)
  private RelVelocity relativeVelocity;

  public CloseApproachData() {
  }

  public CloseApproachData closeApproachDate(String closeApproachDate) {
    this.closeApproachDate = closeApproachDate;
    return this;
  }

  /**
   * Get closeApproachDate
   * @return closeApproachDate
   */
  @javax.annotation.Nullable
  public String getCloseApproachDate() {
    return closeApproachDate;
  }

  public void setCloseApproachDate(String closeApproachDate) {
    this.closeApproachDate = closeApproachDate;
  }


  public CloseApproachData closeApproachDateFull(String closeApproachDateFull) {
    this.closeApproachDateFull = closeApproachDateFull;
    return this;
  }

  /**
   * Get closeApproachDateFull
   * @return closeApproachDateFull
   */
  @javax.annotation.Nullable
  public String getCloseApproachDateFull() {
    return closeApproachDateFull;
  }

  public void setCloseApproachDateFull(String closeApproachDateFull) {
    this.closeApproachDateFull = closeApproachDateFull;
  }


  public CloseApproachData epochDateCloseApproach(Long epochDateCloseApproach) {
    this.epochDateCloseApproach = epochDateCloseApproach;
    return this;
  }

  /**
   * Get epochDateCloseApproach
   * @return epochDateCloseApproach
   */
  @javax.annotation.Nullable
  public Long getEpochDateCloseApproach() {
    return epochDateCloseApproach;
  }

  public void setEpochDateCloseApproach(Long epochDateCloseApproach) {
    this.epochDateCloseApproach = epochDateCloseApproach;
  }


  public CloseApproachData missDistance(MissDistance missDistance) {
    this.missDistance = missDistance;
    return this;
  }

  /**
   * Get missDistance
   * @return missDistance
   */
  @javax.annotation.Nullable
  public MissDistance getMissDistance() {
    return missDistance;
  }

  public void setMissDistance(MissDistance missDistance) {
    this.missDistance = missDistance;
  }


  public CloseApproachData orbitingBody(String orbitingBody) {
    this.orbitingBody = orbitingBody;
    return this;
  }

  /**
   * Get orbitingBody
   * @return orbitingBody
   */
  @javax.annotation.Nullable
  public String getOrbitingBody() {
    return orbitingBody;
  }

  public void setOrbitingBody(String orbitingBody) {
    this.orbitingBody = orbitingBody;
  }


  public CloseApproachData relativeVelocity(RelVelocity relativeVelocity) {
    this.relativeVelocity = relativeVelocity;
    return this;
  }

  /**
   * Get relativeVelocity
   * @return relativeVelocity
   */
  @javax.annotation.Nullable
  public RelVelocity getRelativeVelocity() {
    return relativeVelocity;
  }

  public void setRelativeVelocity(RelVelocity relativeVelocity) {
    this.relativeVelocity = relativeVelocity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseApproachData closeApproachData = (CloseApproachData) o;
    return Objects.equals(this.closeApproachDate, closeApproachData.closeApproachDate) &&
        Objects.equals(this.closeApproachDateFull, closeApproachData.closeApproachDateFull) &&
        Objects.equals(this.epochDateCloseApproach, closeApproachData.epochDateCloseApproach) &&
        Objects.equals(this.missDistance, closeApproachData.missDistance) &&
        Objects.equals(this.orbitingBody, closeApproachData.orbitingBody) &&
        Objects.equals(this.relativeVelocity, closeApproachData.relativeVelocity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closeApproachDate, closeApproachDateFull, epochDateCloseApproach, missDistance, orbitingBody, relativeVelocity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseApproachData {\n");
    sb.append("    closeApproachDate: ").append(toIndentedString(closeApproachDate)).append("\n");
    sb.append("    closeApproachDateFull: ").append(toIndentedString(closeApproachDateFull)).append("\n");
    sb.append("    epochDateCloseApproach: ").append(toIndentedString(epochDateCloseApproach)).append("\n");
    sb.append("    missDistance: ").append(toIndentedString(missDistance)).append("\n");
    sb.append("    orbitingBody: ").append(toIndentedString(orbitingBody)).append("\n");
    sb.append("    relativeVelocity: ").append(toIndentedString(relativeVelocity)).append("\n");
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
    openapiFields.add("close_approach_date");
    openapiFields.add("close_approach_date_full");
    openapiFields.add("epoch_date_close_approach");
    openapiFields.add("miss_distance");
    openapiFields.add("orbiting_body");
    openapiFields.add("relative_velocity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloseApproachData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloseApproachData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloseApproachData is not found in the empty JSON string", CloseApproachData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloseApproachData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloseApproachData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("close_approach_date") != null && !jsonObj.get("close_approach_date").isJsonNull()) && !jsonObj.get("close_approach_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `close_approach_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("close_approach_date").toString()));
      }
      if ((jsonObj.get("close_approach_date_full") != null && !jsonObj.get("close_approach_date_full").isJsonNull()) && !jsonObj.get("close_approach_date_full").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `close_approach_date_full` to be a primitive type in the JSON string but got `%s`", jsonObj.get("close_approach_date_full").toString()));
      }
      // validate the optional field `miss_distance`
      if (jsonObj.get("miss_distance") != null && !jsonObj.get("miss_distance").isJsonNull()) {
        MissDistance.validateJsonElement(jsonObj.get("miss_distance"));
      }
      if ((jsonObj.get("orbiting_body") != null && !jsonObj.get("orbiting_body").isJsonNull()) && !jsonObj.get("orbiting_body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orbiting_body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orbiting_body").toString()));
      }
      // validate the optional field `relative_velocity`
      if (jsonObj.get("relative_velocity") != null && !jsonObj.get("relative_velocity").isJsonNull()) {
        RelVelocity.validateJsonElement(jsonObj.get("relative_velocity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloseApproachData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloseApproachData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloseApproachData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloseApproachData.class));

       return (TypeAdapter<T>) new TypeAdapter<CloseApproachData>() {
           @Override
           public void write(JsonWriter out, CloseApproachData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloseApproachData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloseApproachData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloseApproachData
   * @throws IOException if the JSON string is invalid with respect to CloseApproachData
   */
  public static CloseApproachData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloseApproachData.class);
  }

  /**
   * Convert an instance of CloseApproachData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

