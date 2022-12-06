/*
 * NHL v3 Projections
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
 * ScoringPlay
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:42.422352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ScoringPlay {
  public static final String SERIALIZED_NAME_ALLOWED_BY_TEAM_I_D = "AllowedByTeamID";
  @SerializedName(SERIALIZED_NAME_ALLOWED_BY_TEAM_I_D)
  private Integer allowedByTeamID;

  public static final String SERIALIZED_NAME_ASSISTED_BY_PLAYER_I_D1 = "AssistedByPlayerID1";
  @SerializedName(SERIALIZED_NAME_ASSISTED_BY_PLAYER_I_D1)
  private Integer assistedByPlayerID1;

  public static final String SERIALIZED_NAME_ASSISTED_BY_PLAYER_I_D2 = "AssistedByPlayerID2";
  @SerializedName(SERIALIZED_NAME_ASSISTED_BY_PLAYER_I_D2)
  private Integer assistedByPlayerID2;

  public static final String SERIALIZED_NAME_AWAY_TEAM_SCORE = "AwayTeamScore";
  @SerializedName(SERIALIZED_NAME_AWAY_TEAM_SCORE)
  private Integer awayTeamScore;

  public static final String SERIALIZED_NAME_EMPTY_NET = "EmptyNet";
  @SerializedName(SERIALIZED_NAME_EMPTY_NET)
  private Boolean emptyNet;

  public static final String SERIALIZED_NAME_HOME_TEAM_SCORE = "HomeTeamScore";
  @SerializedName(SERIALIZED_NAME_HOME_TEAM_SCORE)
  private Integer homeTeamScore;

  public static final String SERIALIZED_NAME_PERIOD_I_D = "PeriodID";
  @SerializedName(SERIALIZED_NAME_PERIOD_I_D)
  private Integer periodID;

  public static final String SERIALIZED_NAME_POWER_PLAY = "PowerPlay";
  @SerializedName(SERIALIZED_NAME_POWER_PLAY)
  private Boolean powerPlay;

  public static final String SERIALIZED_NAME_SCORED_BY_PLAYER_I_D = "ScoredByPlayerID";
  @SerializedName(SERIALIZED_NAME_SCORED_BY_PLAYER_I_D)
  private Integer scoredByPlayerID;

  public static final String SERIALIZED_NAME_SCORED_BY_TEAM_I_D = "ScoredByTeamID";
  @SerializedName(SERIALIZED_NAME_SCORED_BY_TEAM_I_D)
  private Integer scoredByTeamID;

  public static final String SERIALIZED_NAME_SCORING_PLAY_I_D = "ScoringPlayID";
  @SerializedName(SERIALIZED_NAME_SCORING_PLAY_I_D)
  private Integer scoringPlayID;

  public static final String SERIALIZED_NAME_SEQUENCE = "Sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_SHORT_HANDED = "ShortHanded";
  @SerializedName(SERIALIZED_NAME_SHORT_HANDED)
  private Boolean shortHanded;

  public static final String SERIALIZED_NAME_TIME_REMAINING_MINUTES = "TimeRemainingMinutes";
  @SerializedName(SERIALIZED_NAME_TIME_REMAINING_MINUTES)
  private Integer timeRemainingMinutes;

  public static final String SERIALIZED_NAME_TIME_REMAINING_SECONDS = "TimeRemainingSeconds";
  @SerializedName(SERIALIZED_NAME_TIME_REMAINING_SECONDS)
  private Integer timeRemainingSeconds;

  public ScoringPlay() {
  }

  public ScoringPlay allowedByTeamID(Integer allowedByTeamID) {
    this.allowedByTeamID = allowedByTeamID;
    return this;
  }

  /**
   * Get allowedByTeamID
   * @return allowedByTeamID
   */
  @javax.annotation.Nullable
  public Integer getAllowedByTeamID() {
    return allowedByTeamID;
  }

  public void setAllowedByTeamID(Integer allowedByTeamID) {
    this.allowedByTeamID = allowedByTeamID;
  }


  public ScoringPlay assistedByPlayerID1(Integer assistedByPlayerID1) {
    this.assistedByPlayerID1 = assistedByPlayerID1;
    return this;
  }

  /**
   * Get assistedByPlayerID1
   * @return assistedByPlayerID1
   */
  @javax.annotation.Nullable
  public Integer getAssistedByPlayerID1() {
    return assistedByPlayerID1;
  }

  public void setAssistedByPlayerID1(Integer assistedByPlayerID1) {
    this.assistedByPlayerID1 = assistedByPlayerID1;
  }


  public ScoringPlay assistedByPlayerID2(Integer assistedByPlayerID2) {
    this.assistedByPlayerID2 = assistedByPlayerID2;
    return this;
  }

  /**
   * Get assistedByPlayerID2
   * @return assistedByPlayerID2
   */
  @javax.annotation.Nullable
  public Integer getAssistedByPlayerID2() {
    return assistedByPlayerID2;
  }

  public void setAssistedByPlayerID2(Integer assistedByPlayerID2) {
    this.assistedByPlayerID2 = assistedByPlayerID2;
  }


  public ScoringPlay awayTeamScore(Integer awayTeamScore) {
    this.awayTeamScore = awayTeamScore;
    return this;
  }

  /**
   * Get awayTeamScore
   * @return awayTeamScore
   */
  @javax.annotation.Nullable
  public Integer getAwayTeamScore() {
    return awayTeamScore;
  }

  public void setAwayTeamScore(Integer awayTeamScore) {
    this.awayTeamScore = awayTeamScore;
  }


  public ScoringPlay emptyNet(Boolean emptyNet) {
    this.emptyNet = emptyNet;
    return this;
  }

  /**
   * Get emptyNet
   * @return emptyNet
   */
  @javax.annotation.Nullable
  public Boolean getEmptyNet() {
    return emptyNet;
  }

  public void setEmptyNet(Boolean emptyNet) {
    this.emptyNet = emptyNet;
  }


  public ScoringPlay homeTeamScore(Integer homeTeamScore) {
    this.homeTeamScore = homeTeamScore;
    return this;
  }

  /**
   * Get homeTeamScore
   * @return homeTeamScore
   */
  @javax.annotation.Nullable
  public Integer getHomeTeamScore() {
    return homeTeamScore;
  }

  public void setHomeTeamScore(Integer homeTeamScore) {
    this.homeTeamScore = homeTeamScore;
  }


  public ScoringPlay periodID(Integer periodID) {
    this.periodID = periodID;
    return this;
  }

  /**
   * Get periodID
   * @return periodID
   */
  @javax.annotation.Nullable
  public Integer getPeriodID() {
    return periodID;
  }

  public void setPeriodID(Integer periodID) {
    this.periodID = periodID;
  }


  public ScoringPlay powerPlay(Boolean powerPlay) {
    this.powerPlay = powerPlay;
    return this;
  }

  /**
   * Get powerPlay
   * @return powerPlay
   */
  @javax.annotation.Nullable
  public Boolean getPowerPlay() {
    return powerPlay;
  }

  public void setPowerPlay(Boolean powerPlay) {
    this.powerPlay = powerPlay;
  }


  public ScoringPlay scoredByPlayerID(Integer scoredByPlayerID) {
    this.scoredByPlayerID = scoredByPlayerID;
    return this;
  }

  /**
   * Get scoredByPlayerID
   * @return scoredByPlayerID
   */
  @javax.annotation.Nullable
  public Integer getScoredByPlayerID() {
    return scoredByPlayerID;
  }

  public void setScoredByPlayerID(Integer scoredByPlayerID) {
    this.scoredByPlayerID = scoredByPlayerID;
  }


  public ScoringPlay scoredByTeamID(Integer scoredByTeamID) {
    this.scoredByTeamID = scoredByTeamID;
    return this;
  }

  /**
   * Get scoredByTeamID
   * @return scoredByTeamID
   */
  @javax.annotation.Nullable
  public Integer getScoredByTeamID() {
    return scoredByTeamID;
  }

  public void setScoredByTeamID(Integer scoredByTeamID) {
    this.scoredByTeamID = scoredByTeamID;
  }


  public ScoringPlay scoringPlayID(Integer scoringPlayID) {
    this.scoringPlayID = scoringPlayID;
    return this;
  }

  /**
   * Get scoringPlayID
   * @return scoringPlayID
   */
  @javax.annotation.Nullable
  public Integer getScoringPlayID() {
    return scoringPlayID;
  }

  public void setScoringPlayID(Integer scoringPlayID) {
    this.scoringPlayID = scoringPlayID;
  }


  public ScoringPlay sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
   */
  @javax.annotation.Nullable
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public ScoringPlay shortHanded(Boolean shortHanded) {
    this.shortHanded = shortHanded;
    return this;
  }

  /**
   * Get shortHanded
   * @return shortHanded
   */
  @javax.annotation.Nullable
  public Boolean getShortHanded() {
    return shortHanded;
  }

  public void setShortHanded(Boolean shortHanded) {
    this.shortHanded = shortHanded;
  }


  public ScoringPlay timeRemainingMinutes(Integer timeRemainingMinutes) {
    this.timeRemainingMinutes = timeRemainingMinutes;
    return this;
  }

  /**
   * Get timeRemainingMinutes
   * @return timeRemainingMinutes
   */
  @javax.annotation.Nullable
  public Integer getTimeRemainingMinutes() {
    return timeRemainingMinutes;
  }

  public void setTimeRemainingMinutes(Integer timeRemainingMinutes) {
    this.timeRemainingMinutes = timeRemainingMinutes;
  }


  public ScoringPlay timeRemainingSeconds(Integer timeRemainingSeconds) {
    this.timeRemainingSeconds = timeRemainingSeconds;
    return this;
  }

  /**
   * Get timeRemainingSeconds
   * @return timeRemainingSeconds
   */
  @javax.annotation.Nullable
  public Integer getTimeRemainingSeconds() {
    return timeRemainingSeconds;
  }

  public void setTimeRemainingSeconds(Integer timeRemainingSeconds) {
    this.timeRemainingSeconds = timeRemainingSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoringPlay scoringPlay = (ScoringPlay) o;
    return Objects.equals(this.allowedByTeamID, scoringPlay.allowedByTeamID) &&
        Objects.equals(this.assistedByPlayerID1, scoringPlay.assistedByPlayerID1) &&
        Objects.equals(this.assistedByPlayerID2, scoringPlay.assistedByPlayerID2) &&
        Objects.equals(this.awayTeamScore, scoringPlay.awayTeamScore) &&
        Objects.equals(this.emptyNet, scoringPlay.emptyNet) &&
        Objects.equals(this.homeTeamScore, scoringPlay.homeTeamScore) &&
        Objects.equals(this.periodID, scoringPlay.periodID) &&
        Objects.equals(this.powerPlay, scoringPlay.powerPlay) &&
        Objects.equals(this.scoredByPlayerID, scoringPlay.scoredByPlayerID) &&
        Objects.equals(this.scoredByTeamID, scoringPlay.scoredByTeamID) &&
        Objects.equals(this.scoringPlayID, scoringPlay.scoringPlayID) &&
        Objects.equals(this.sequence, scoringPlay.sequence) &&
        Objects.equals(this.shortHanded, scoringPlay.shortHanded) &&
        Objects.equals(this.timeRemainingMinutes, scoringPlay.timeRemainingMinutes) &&
        Objects.equals(this.timeRemainingSeconds, scoringPlay.timeRemainingSeconds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedByTeamID, assistedByPlayerID1, assistedByPlayerID2, awayTeamScore, emptyNet, homeTeamScore, periodID, powerPlay, scoredByPlayerID, scoredByTeamID, scoringPlayID, sequence, shortHanded, timeRemainingMinutes, timeRemainingSeconds);
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
    sb.append("class ScoringPlay {\n");
    sb.append("    allowedByTeamID: ").append(toIndentedString(allowedByTeamID)).append("\n");
    sb.append("    assistedByPlayerID1: ").append(toIndentedString(assistedByPlayerID1)).append("\n");
    sb.append("    assistedByPlayerID2: ").append(toIndentedString(assistedByPlayerID2)).append("\n");
    sb.append("    awayTeamScore: ").append(toIndentedString(awayTeamScore)).append("\n");
    sb.append("    emptyNet: ").append(toIndentedString(emptyNet)).append("\n");
    sb.append("    homeTeamScore: ").append(toIndentedString(homeTeamScore)).append("\n");
    sb.append("    periodID: ").append(toIndentedString(periodID)).append("\n");
    sb.append("    powerPlay: ").append(toIndentedString(powerPlay)).append("\n");
    sb.append("    scoredByPlayerID: ").append(toIndentedString(scoredByPlayerID)).append("\n");
    sb.append("    scoredByTeamID: ").append(toIndentedString(scoredByTeamID)).append("\n");
    sb.append("    scoringPlayID: ").append(toIndentedString(scoringPlayID)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    shortHanded: ").append(toIndentedString(shortHanded)).append("\n");
    sb.append("    timeRemainingMinutes: ").append(toIndentedString(timeRemainingMinutes)).append("\n");
    sb.append("    timeRemainingSeconds: ").append(toIndentedString(timeRemainingSeconds)).append("\n");
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
    openapiFields.add("AllowedByTeamID");
    openapiFields.add("AssistedByPlayerID1");
    openapiFields.add("AssistedByPlayerID2");
    openapiFields.add("AwayTeamScore");
    openapiFields.add("EmptyNet");
    openapiFields.add("HomeTeamScore");
    openapiFields.add("PeriodID");
    openapiFields.add("PowerPlay");
    openapiFields.add("ScoredByPlayerID");
    openapiFields.add("ScoredByTeamID");
    openapiFields.add("ScoringPlayID");
    openapiFields.add("Sequence");
    openapiFields.add("ShortHanded");
    openapiFields.add("TimeRemainingMinutes");
    openapiFields.add("TimeRemainingSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ScoringPlay
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScoringPlay.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScoringPlay is not found in the empty JSON string", ScoringPlay.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScoringPlay.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScoringPlay` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScoringPlay.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScoringPlay' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScoringPlay> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScoringPlay.class));

       return (TypeAdapter<T>) new TypeAdapter<ScoringPlay>() {
           @Override
           public void write(JsonWriter out, ScoringPlay value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScoringPlay read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ScoringPlay given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScoringPlay
   * @throws IOException if the JSON string is invalid with respect to ScoringPlay
   */
  public static ScoringPlay fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScoringPlay.class);
  }

  /**
   * Convert an instance of ScoringPlay to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

