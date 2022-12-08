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
 * Penalty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:47.818286-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Penalty {
  public static final String SERIALIZED_NAME_BENCH_PENALTY_SERVED_BY_PLAYER_I_D = "BenchPenaltyServedByPlayerID";
  @SerializedName(SERIALIZED_NAME_BENCH_PENALTY_SERVED_BY_PLAYER_I_D)
  private Integer benchPenaltyServedByPlayerID;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DRAWN_BY_PLAYER_I_D = "DrawnByPlayerID";
  @SerializedName(SERIALIZED_NAME_DRAWN_BY_PLAYER_I_D)
  private Integer drawnByPlayerID;

  public static final String SERIALIZED_NAME_DRAWN_BY_TEAM_I_D = "DrawnByTeamID";
  @SerializedName(SERIALIZED_NAME_DRAWN_BY_TEAM_I_D)
  private Integer drawnByTeamID;

  public static final String SERIALIZED_NAME_IS_BENCH_PENALTY = "IsBenchPenalty";
  @SerializedName(SERIALIZED_NAME_IS_BENCH_PENALTY)
  private Boolean isBenchPenalty;

  public static final String SERIALIZED_NAME_PENALIZED_PLAYER_I_D = "PenalizedPlayerID";
  @SerializedName(SERIALIZED_NAME_PENALIZED_PLAYER_I_D)
  private Integer penalizedPlayerID;

  public static final String SERIALIZED_NAME_PENALIZED_TEAM_I_D = "PenalizedTeamID";
  @SerializedName(SERIALIZED_NAME_PENALIZED_TEAM_I_D)
  private Integer penalizedTeamID;

  public static final String SERIALIZED_NAME_PENALTY_I_D = "PenaltyID";
  @SerializedName(SERIALIZED_NAME_PENALTY_I_D)
  private Integer penaltyID;

  public static final String SERIALIZED_NAME_PENALTY_MINUTES = "PenaltyMinutes";
  @SerializedName(SERIALIZED_NAME_PENALTY_MINUTES)
  private Integer penaltyMinutes;

  public static final String SERIALIZED_NAME_PERIOD_I_D = "PeriodID";
  @SerializedName(SERIALIZED_NAME_PERIOD_I_D)
  private Integer periodID;

  public static final String SERIALIZED_NAME_SEQUENCE = "Sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_TIME_REMAINING_MINUTES = "TimeRemainingMinutes";
  @SerializedName(SERIALIZED_NAME_TIME_REMAINING_MINUTES)
  private Integer timeRemainingMinutes;

  public static final String SERIALIZED_NAME_TIME_REMAINING_SECONDS = "TimeRemainingSeconds";
  @SerializedName(SERIALIZED_NAME_TIME_REMAINING_SECONDS)
  private Integer timeRemainingSeconds;

  public Penalty() {
  }

  public Penalty benchPenaltyServedByPlayerID(Integer benchPenaltyServedByPlayerID) {
    this.benchPenaltyServedByPlayerID = benchPenaltyServedByPlayerID;
    return this;
  }

  /**
   * Get benchPenaltyServedByPlayerID
   * @return benchPenaltyServedByPlayerID
   */
  @javax.annotation.Nullable
  public Integer getBenchPenaltyServedByPlayerID() {
    return benchPenaltyServedByPlayerID;
  }

  public void setBenchPenaltyServedByPlayerID(Integer benchPenaltyServedByPlayerID) {
    this.benchPenaltyServedByPlayerID = benchPenaltyServedByPlayerID;
  }


  public Penalty description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Penalty drawnByPlayerID(Integer drawnByPlayerID) {
    this.drawnByPlayerID = drawnByPlayerID;
    return this;
  }

  /**
   * Get drawnByPlayerID
   * @return drawnByPlayerID
   */
  @javax.annotation.Nullable
  public Integer getDrawnByPlayerID() {
    return drawnByPlayerID;
  }

  public void setDrawnByPlayerID(Integer drawnByPlayerID) {
    this.drawnByPlayerID = drawnByPlayerID;
  }


  public Penalty drawnByTeamID(Integer drawnByTeamID) {
    this.drawnByTeamID = drawnByTeamID;
    return this;
  }

  /**
   * Get drawnByTeamID
   * @return drawnByTeamID
   */
  @javax.annotation.Nullable
  public Integer getDrawnByTeamID() {
    return drawnByTeamID;
  }

  public void setDrawnByTeamID(Integer drawnByTeamID) {
    this.drawnByTeamID = drawnByTeamID;
  }


  public Penalty isBenchPenalty(Boolean isBenchPenalty) {
    this.isBenchPenalty = isBenchPenalty;
    return this;
  }

  /**
   * Get isBenchPenalty
   * @return isBenchPenalty
   */
  @javax.annotation.Nullable
  public Boolean getIsBenchPenalty() {
    return isBenchPenalty;
  }

  public void setIsBenchPenalty(Boolean isBenchPenalty) {
    this.isBenchPenalty = isBenchPenalty;
  }


  public Penalty penalizedPlayerID(Integer penalizedPlayerID) {
    this.penalizedPlayerID = penalizedPlayerID;
    return this;
  }

  /**
   * Get penalizedPlayerID
   * @return penalizedPlayerID
   */
  @javax.annotation.Nullable
  public Integer getPenalizedPlayerID() {
    return penalizedPlayerID;
  }

  public void setPenalizedPlayerID(Integer penalizedPlayerID) {
    this.penalizedPlayerID = penalizedPlayerID;
  }


  public Penalty penalizedTeamID(Integer penalizedTeamID) {
    this.penalizedTeamID = penalizedTeamID;
    return this;
  }

  /**
   * Get penalizedTeamID
   * @return penalizedTeamID
   */
  @javax.annotation.Nullable
  public Integer getPenalizedTeamID() {
    return penalizedTeamID;
  }

  public void setPenalizedTeamID(Integer penalizedTeamID) {
    this.penalizedTeamID = penalizedTeamID;
  }


  public Penalty penaltyID(Integer penaltyID) {
    this.penaltyID = penaltyID;
    return this;
  }

  /**
   * Get penaltyID
   * @return penaltyID
   */
  @javax.annotation.Nullable
  public Integer getPenaltyID() {
    return penaltyID;
  }

  public void setPenaltyID(Integer penaltyID) {
    this.penaltyID = penaltyID;
  }


  public Penalty penaltyMinutes(Integer penaltyMinutes) {
    this.penaltyMinutes = penaltyMinutes;
    return this;
  }

  /**
   * Get penaltyMinutes
   * @return penaltyMinutes
   */
  @javax.annotation.Nullable
  public Integer getPenaltyMinutes() {
    return penaltyMinutes;
  }

  public void setPenaltyMinutes(Integer penaltyMinutes) {
    this.penaltyMinutes = penaltyMinutes;
  }


  public Penalty periodID(Integer periodID) {
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


  public Penalty sequence(Integer sequence) {
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


  public Penalty timeRemainingMinutes(Integer timeRemainingMinutes) {
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


  public Penalty timeRemainingSeconds(Integer timeRemainingSeconds) {
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
    Penalty penalty = (Penalty) o;
    return Objects.equals(this.benchPenaltyServedByPlayerID, penalty.benchPenaltyServedByPlayerID) &&
        Objects.equals(this.description, penalty.description) &&
        Objects.equals(this.drawnByPlayerID, penalty.drawnByPlayerID) &&
        Objects.equals(this.drawnByTeamID, penalty.drawnByTeamID) &&
        Objects.equals(this.isBenchPenalty, penalty.isBenchPenalty) &&
        Objects.equals(this.penalizedPlayerID, penalty.penalizedPlayerID) &&
        Objects.equals(this.penalizedTeamID, penalty.penalizedTeamID) &&
        Objects.equals(this.penaltyID, penalty.penaltyID) &&
        Objects.equals(this.penaltyMinutes, penalty.penaltyMinutes) &&
        Objects.equals(this.periodID, penalty.periodID) &&
        Objects.equals(this.sequence, penalty.sequence) &&
        Objects.equals(this.timeRemainingMinutes, penalty.timeRemainingMinutes) &&
        Objects.equals(this.timeRemainingSeconds, penalty.timeRemainingSeconds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchPenaltyServedByPlayerID, description, drawnByPlayerID, drawnByTeamID, isBenchPenalty, penalizedPlayerID, penalizedTeamID, penaltyID, penaltyMinutes, periodID, sequence, timeRemainingMinutes, timeRemainingSeconds);
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
    sb.append("class Penalty {\n");
    sb.append("    benchPenaltyServedByPlayerID: ").append(toIndentedString(benchPenaltyServedByPlayerID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    drawnByPlayerID: ").append(toIndentedString(drawnByPlayerID)).append("\n");
    sb.append("    drawnByTeamID: ").append(toIndentedString(drawnByTeamID)).append("\n");
    sb.append("    isBenchPenalty: ").append(toIndentedString(isBenchPenalty)).append("\n");
    sb.append("    penalizedPlayerID: ").append(toIndentedString(penalizedPlayerID)).append("\n");
    sb.append("    penalizedTeamID: ").append(toIndentedString(penalizedTeamID)).append("\n");
    sb.append("    penaltyID: ").append(toIndentedString(penaltyID)).append("\n");
    sb.append("    penaltyMinutes: ").append(toIndentedString(penaltyMinutes)).append("\n");
    sb.append("    periodID: ").append(toIndentedString(periodID)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    openapiFields.add("BenchPenaltyServedByPlayerID");
    openapiFields.add("Description");
    openapiFields.add("DrawnByPlayerID");
    openapiFields.add("DrawnByTeamID");
    openapiFields.add("IsBenchPenalty");
    openapiFields.add("PenalizedPlayerID");
    openapiFields.add("PenalizedTeamID");
    openapiFields.add("PenaltyID");
    openapiFields.add("PenaltyMinutes");
    openapiFields.add("PeriodID");
    openapiFields.add("Sequence");
    openapiFields.add("TimeRemainingMinutes");
    openapiFields.add("TimeRemainingSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Penalty
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Penalty.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Penalty is not found in the empty JSON string", Penalty.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Penalty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Penalty` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Penalty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Penalty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Penalty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Penalty.class));

       return (TypeAdapter<T>) new TypeAdapter<Penalty>() {
           @Override
           public void write(JsonWriter out, Penalty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Penalty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Penalty given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Penalty
   * @throws IOException if the JSON string is invalid with respect to Penalty
   */
  public static Penalty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Penalty.class);
  }

  /**
   * Convert an instance of Penalty to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

