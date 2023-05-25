/*
 * MLB v3 Scores
 * MLB scores API.
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
 * Inning
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:10.079908-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Inning {
  public static final String SERIALIZED_NAME_AWAY_TEAM_RUNS = "AwayTeamRuns";
  @SerializedName(SERIALIZED_NAME_AWAY_TEAM_RUNS)
  private Integer awayTeamRuns;

  public static final String SERIALIZED_NAME_GAME_I_D = "GameID";
  @SerializedName(SERIALIZED_NAME_GAME_I_D)
  private Integer gameID;

  public static final String SERIALIZED_NAME_HOME_TEAM_RUNS = "HomeTeamRuns";
  @SerializedName(SERIALIZED_NAME_HOME_TEAM_RUNS)
  private Integer homeTeamRuns;

  public static final String SERIALIZED_NAME_INNING_I_D = "InningID";
  @SerializedName(SERIALIZED_NAME_INNING_I_D)
  private Integer inningID;

  public static final String SERIALIZED_NAME_INNING_NUMBER = "InningNumber";
  @SerializedName(SERIALIZED_NAME_INNING_NUMBER)
  private Integer inningNumber;

  public Inning() {
  }

  public Inning awayTeamRuns(Integer awayTeamRuns) {
    this.awayTeamRuns = awayTeamRuns;
    return this;
  }

  /**
   * Get awayTeamRuns
   * @return awayTeamRuns
   */
  @javax.annotation.Nullable
  public Integer getAwayTeamRuns() {
    return awayTeamRuns;
  }

  public void setAwayTeamRuns(Integer awayTeamRuns) {
    this.awayTeamRuns = awayTeamRuns;
  }


  public Inning gameID(Integer gameID) {
    this.gameID = gameID;
    return this;
  }

  /**
   * Get gameID
   * @return gameID
   */
  @javax.annotation.Nullable
  public Integer getGameID() {
    return gameID;
  }

  public void setGameID(Integer gameID) {
    this.gameID = gameID;
  }


  public Inning homeTeamRuns(Integer homeTeamRuns) {
    this.homeTeamRuns = homeTeamRuns;
    return this;
  }

  /**
   * Get homeTeamRuns
   * @return homeTeamRuns
   */
  @javax.annotation.Nullable
  public Integer getHomeTeamRuns() {
    return homeTeamRuns;
  }

  public void setHomeTeamRuns(Integer homeTeamRuns) {
    this.homeTeamRuns = homeTeamRuns;
  }


  public Inning inningID(Integer inningID) {
    this.inningID = inningID;
    return this;
  }

  /**
   * Get inningID
   * @return inningID
   */
  @javax.annotation.Nullable
  public Integer getInningID() {
    return inningID;
  }

  public void setInningID(Integer inningID) {
    this.inningID = inningID;
  }


  public Inning inningNumber(Integer inningNumber) {
    this.inningNumber = inningNumber;
    return this;
  }

  /**
   * Get inningNumber
   * @return inningNumber
   */
  @javax.annotation.Nullable
  public Integer getInningNumber() {
    return inningNumber;
  }

  public void setInningNumber(Integer inningNumber) {
    this.inningNumber = inningNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inning inning = (Inning) o;
    return Objects.equals(this.awayTeamRuns, inning.awayTeamRuns) &&
        Objects.equals(this.gameID, inning.gameID) &&
        Objects.equals(this.homeTeamRuns, inning.homeTeamRuns) &&
        Objects.equals(this.inningID, inning.inningID) &&
        Objects.equals(this.inningNumber, inning.inningNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayTeamRuns, gameID, homeTeamRuns, inningID, inningNumber);
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
    sb.append("class Inning {\n");
    sb.append("    awayTeamRuns: ").append(toIndentedString(awayTeamRuns)).append("\n");
    sb.append("    gameID: ").append(toIndentedString(gameID)).append("\n");
    sb.append("    homeTeamRuns: ").append(toIndentedString(homeTeamRuns)).append("\n");
    sb.append("    inningID: ").append(toIndentedString(inningID)).append("\n");
    sb.append("    inningNumber: ").append(toIndentedString(inningNumber)).append("\n");
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
    openapiFields.add("AwayTeamRuns");
    openapiFields.add("GameID");
    openapiFields.add("HomeTeamRuns");
    openapiFields.add("InningID");
    openapiFields.add("InningNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Inning
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Inning.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Inning is not found in the empty JSON string", Inning.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Inning.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Inning` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Inning.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Inning' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Inning> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Inning.class));

       return (TypeAdapter<T>) new TypeAdapter<Inning>() {
           @Override
           public void write(JsonWriter out, Inning value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Inning read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Inning given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Inning
   * @throws IOException if the JSON string is invalid with respect to Inning
   */
  public static Inning fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Inning.class);
  }

  /**
   * Convert an instance of Inning to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

