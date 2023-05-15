/*
 * LoL v3 Scores
 * LoL v3 Scores
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Round;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Season
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:39.898809-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Season {
  public static final String SERIALIZED_NAME_COMPETITION_ID = "CompetitionId";
  @SerializedName(SERIALIZED_NAME_COMPETITION_ID)
  private Integer competitionId;

  public static final String SERIALIZED_NAME_COMPETITION_NAME = "CompetitionName";
  @SerializedName(SERIALIZED_NAME_COMPETITION_NAME)
  private String competitionName;

  public static final String SERIALIZED_NAME_CURRENT_SEASON = "CurrentSeason";
  @SerializedName(SERIALIZED_NAME_CURRENT_SEASON)
  private Boolean currentSeason;

  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROUNDS = "Rounds";
  @SerializedName(SERIALIZED_NAME_ROUNDS)
  private List<Round> rounds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEASON = "Season";
  @SerializedName(SERIALIZED_NAME_SEASON)
  private Integer season;

  public static final String SERIALIZED_NAME_SEASON_ID = "SeasonId";
  @SerializedName(SERIALIZED_NAME_SEASON_ID)
  private Integer seasonId;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public Season() {
  }

  public Season competitionId(Integer competitionId) {
    this.competitionId = competitionId;
    return this;
  }

  /**
   * Get competitionId
   * @return competitionId
   */
  @javax.annotation.Nullable
  public Integer getCompetitionId() {
    return competitionId;
  }

  public void setCompetitionId(Integer competitionId) {
    this.competitionId = competitionId;
  }


  public Season competitionName(String competitionName) {
    this.competitionName = competitionName;
    return this;
  }

  /**
   * Get competitionName
   * @return competitionName
   */
  @javax.annotation.Nullable
  public String getCompetitionName() {
    return competitionName;
  }

  public void setCompetitionName(String competitionName) {
    this.competitionName = competitionName;
  }


  public Season currentSeason(Boolean currentSeason) {
    this.currentSeason = currentSeason;
    return this;
  }

  /**
   * Get currentSeason
   * @return currentSeason
   */
  @javax.annotation.Nullable
  public Boolean getCurrentSeason() {
    return currentSeason;
  }

  public void setCurrentSeason(Boolean currentSeason) {
    this.currentSeason = currentSeason;
  }


  public Season endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Season name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Season rounds(List<Round> rounds) {
    this.rounds = rounds;
    return this;
  }

  public Season addRoundsItem(Round roundsItem) {
    if (this.rounds == null) {
      this.rounds = new ArrayList<>();
    }
    this.rounds.add(roundsItem);
    return this;
  }

  /**
   * Get rounds
   * @return rounds
   */
  @javax.annotation.Nullable
  public List<Round> getRounds() {
    return rounds;
  }

  public void setRounds(List<Round> rounds) {
    this.rounds = rounds;
  }


  public Season season(Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  @javax.annotation.Nullable
  public Integer getSeason() {
    return season;
  }

  public void setSeason(Integer season) {
    this.season = season;
  }


  public Season seasonId(Integer seasonId) {
    this.seasonId = seasonId;
    return this;
  }

  /**
   * Get seasonId
   * @return seasonId
   */
  @javax.annotation.Nullable
  public Integer getSeasonId() {
    return seasonId;
  }

  public void setSeasonId(Integer seasonId) {
    this.seasonId = seasonId;
  }


  public Season startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Season season = (Season) o;
    return Objects.equals(this.competitionId, season.competitionId) &&
        Objects.equals(this.competitionName, season.competitionName) &&
        Objects.equals(this.currentSeason, season.currentSeason) &&
        Objects.equals(this.endDate, season.endDate) &&
        Objects.equals(this.name, season.name) &&
        Objects.equals(this.rounds, season.rounds) &&
        Objects.equals(this.season, season.season) &&
        Objects.equals(this.seasonId, season.seasonId) &&
        Objects.equals(this.startDate, season.startDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitionId, competitionName, currentSeason, endDate, name, rounds, season, seasonId, startDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Season {\n");
    sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
    sb.append("    competitionName: ").append(toIndentedString(competitionName)).append("\n");
    sb.append("    currentSeason: ").append(toIndentedString(currentSeason)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rounds: ").append(toIndentedString(rounds)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonId: ").append(toIndentedString(seasonId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("CompetitionId");
    openapiFields.add("CompetitionName");
    openapiFields.add("CurrentSeason");
    openapiFields.add("EndDate");
    openapiFields.add("Name");
    openapiFields.add("Rounds");
    openapiFields.add("Season");
    openapiFields.add("SeasonId");
    openapiFields.add("StartDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Season
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Season.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Season is not found in the empty JSON string", Season.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Season.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Season` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CompetitionName") != null && !jsonObj.get("CompetitionName").isJsonNull()) && !jsonObj.get("CompetitionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CompetitionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CompetitionName").toString()));
      }
      if ((jsonObj.get("EndDate") != null && !jsonObj.get("EndDate").isJsonNull()) && !jsonObj.get("EndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndDate").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Rounds") != null && !jsonObj.get("Rounds").isJsonNull()) {
        JsonArray jsonArrayrounds = jsonObj.getAsJsonArray("Rounds");
        if (jsonArrayrounds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Rounds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Rounds` to be an array in the JSON string but got `%s`", jsonObj.get("Rounds").toString()));
          }

          // validate the optional field `Rounds` (array)
          for (int i = 0; i < jsonArrayrounds.size(); i++) {
            Round.validateJsonElement(jsonArrayrounds.get(i));
          };
        }
      }
      if ((jsonObj.get("StartDate") != null && !jsonObj.get("StartDate").isJsonNull()) && !jsonObj.get("StartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StartDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Season.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Season' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Season> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Season.class));

       return (TypeAdapter<T>) new TypeAdapter<Season>() {
           @Override
           public void write(JsonWriter out, Season value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Season read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Season given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Season
   * @throws IOException if the JSON string is invalid with respect to Season
   */
  public static Season fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Season.class);
  }

  /**
   * Convert an instance of Season to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

