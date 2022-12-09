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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.DfsSlateGame;
import org.openapitools.client.model.DfsSlatePlayer;
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
 * DfsSlate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:50.409343-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DfsSlate {
  public static final String SERIALIZED_NAME_DFS_SLATE_GAMES = "DfsSlateGames";
  @SerializedName(SERIALIZED_NAME_DFS_SLATE_GAMES)
  private List<DfsSlateGame> dfsSlateGames = new ArrayList<>();

  public static final String SERIALIZED_NAME_DFS_SLATE_PLAYERS = "DfsSlatePlayers";
  @SerializedName(SERIALIZED_NAME_DFS_SLATE_PLAYERS)
  private List<DfsSlatePlayer> dfsSlatePlayers = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_MULTI_DAY_SLATE = "IsMultiDaySlate";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_DAY_SLATE)
  private Boolean isMultiDaySlate;

  public static final String SERIALIZED_NAME_NUMBER_OF_GAMES = "NumberOfGames";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_GAMES)
  private Integer numberOfGames;

  public static final String SERIALIZED_NAME_OPERATOR = "Operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_OPERATOR_DAY = "OperatorDay";
  @SerializedName(SERIALIZED_NAME_OPERATOR_DAY)
  private String operatorDay;

  public static final String SERIALIZED_NAME_OPERATOR_GAME_TYPE = "OperatorGameType";
  @SerializedName(SERIALIZED_NAME_OPERATOR_GAME_TYPE)
  private String operatorGameType;

  public static final String SERIALIZED_NAME_OPERATOR_NAME = "OperatorName";
  @SerializedName(SERIALIZED_NAME_OPERATOR_NAME)
  private String operatorName;

  public static final String SERIALIZED_NAME_OPERATOR_SLATE_I_D = "OperatorSlateID";
  @SerializedName(SERIALIZED_NAME_OPERATOR_SLATE_I_D)
  private Integer operatorSlateID;

  public static final String SERIALIZED_NAME_OPERATOR_START_TIME = "OperatorStartTime";
  @SerializedName(SERIALIZED_NAME_OPERATOR_START_TIME)
  private String operatorStartTime;

  public static final String SERIALIZED_NAME_REMOVED_BY_OPERATOR = "RemovedByOperator";
  @SerializedName(SERIALIZED_NAME_REMOVED_BY_OPERATOR)
  private Boolean removedByOperator;

  public static final String SERIALIZED_NAME_SALARY_CAP = "SalaryCap";
  @SerializedName(SERIALIZED_NAME_SALARY_CAP)
  private Integer salaryCap;

  public static final String SERIALIZED_NAME_SLATE_I_D = "SlateID";
  @SerializedName(SERIALIZED_NAME_SLATE_I_D)
  private Integer slateID;

  public static final String SERIALIZED_NAME_SLATE_ROSTER_SLOTS = "SlateRosterSlots";
  @SerializedName(SERIALIZED_NAME_SLATE_ROSTER_SLOTS)
  private List<String> slateRosterSlots = new ArrayList<>();

  public DfsSlate() {
  }

  public DfsSlate dfsSlateGames(List<DfsSlateGame> dfsSlateGames) {
    this.dfsSlateGames = dfsSlateGames;
    return this;
  }

  public DfsSlate addDfsSlateGamesItem(DfsSlateGame dfsSlateGamesItem) {
    if (this.dfsSlateGames == null) {
      this.dfsSlateGames = new ArrayList<>();
    }
    this.dfsSlateGames.add(dfsSlateGamesItem);
    return this;
  }

  /**
   * Get dfsSlateGames
   * @return dfsSlateGames
   */
  @javax.annotation.Nullable
  public List<DfsSlateGame> getDfsSlateGames() {
    return dfsSlateGames;
  }

  public void setDfsSlateGames(List<DfsSlateGame> dfsSlateGames) {
    this.dfsSlateGames = dfsSlateGames;
  }


  public DfsSlate dfsSlatePlayers(List<DfsSlatePlayer> dfsSlatePlayers) {
    this.dfsSlatePlayers = dfsSlatePlayers;
    return this;
  }

  public DfsSlate addDfsSlatePlayersItem(DfsSlatePlayer dfsSlatePlayersItem) {
    if (this.dfsSlatePlayers == null) {
      this.dfsSlatePlayers = new ArrayList<>();
    }
    this.dfsSlatePlayers.add(dfsSlatePlayersItem);
    return this;
  }

  /**
   * Get dfsSlatePlayers
   * @return dfsSlatePlayers
   */
  @javax.annotation.Nullable
  public List<DfsSlatePlayer> getDfsSlatePlayers() {
    return dfsSlatePlayers;
  }

  public void setDfsSlatePlayers(List<DfsSlatePlayer> dfsSlatePlayers) {
    this.dfsSlatePlayers = dfsSlatePlayers;
  }


  public DfsSlate isMultiDaySlate(Boolean isMultiDaySlate) {
    this.isMultiDaySlate = isMultiDaySlate;
    return this;
  }

  /**
   * Get isMultiDaySlate
   * @return isMultiDaySlate
   */
  @javax.annotation.Nullable
  public Boolean getIsMultiDaySlate() {
    return isMultiDaySlate;
  }

  public void setIsMultiDaySlate(Boolean isMultiDaySlate) {
    this.isMultiDaySlate = isMultiDaySlate;
  }


  public DfsSlate numberOfGames(Integer numberOfGames) {
    this.numberOfGames = numberOfGames;
    return this;
  }

  /**
   * Get numberOfGames
   * @return numberOfGames
   */
  @javax.annotation.Nullable
  public Integer getNumberOfGames() {
    return numberOfGames;
  }

  public void setNumberOfGames(Integer numberOfGames) {
    this.numberOfGames = numberOfGames;
  }


  public DfsSlate operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   */
  @javax.annotation.Nullable
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public DfsSlate operatorDay(String operatorDay) {
    this.operatorDay = operatorDay;
    return this;
  }

  /**
   * Get operatorDay
   * @return operatorDay
   */
  @javax.annotation.Nullable
  public String getOperatorDay() {
    return operatorDay;
  }

  public void setOperatorDay(String operatorDay) {
    this.operatorDay = operatorDay;
  }


  public DfsSlate operatorGameType(String operatorGameType) {
    this.operatorGameType = operatorGameType;
    return this;
  }

  /**
   * Get operatorGameType
   * @return operatorGameType
   */
  @javax.annotation.Nullable
  public String getOperatorGameType() {
    return operatorGameType;
  }

  public void setOperatorGameType(String operatorGameType) {
    this.operatorGameType = operatorGameType;
  }


  public DfsSlate operatorName(String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  /**
   * Get operatorName
   * @return operatorName
   */
  @javax.annotation.Nullable
  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public DfsSlate operatorSlateID(Integer operatorSlateID) {
    this.operatorSlateID = operatorSlateID;
    return this;
  }

  /**
   * Get operatorSlateID
   * @return operatorSlateID
   */
  @javax.annotation.Nullable
  public Integer getOperatorSlateID() {
    return operatorSlateID;
  }

  public void setOperatorSlateID(Integer operatorSlateID) {
    this.operatorSlateID = operatorSlateID;
  }


  public DfsSlate operatorStartTime(String operatorStartTime) {
    this.operatorStartTime = operatorStartTime;
    return this;
  }

  /**
   * Get operatorStartTime
   * @return operatorStartTime
   */
  @javax.annotation.Nullable
  public String getOperatorStartTime() {
    return operatorStartTime;
  }

  public void setOperatorStartTime(String operatorStartTime) {
    this.operatorStartTime = operatorStartTime;
  }


  public DfsSlate removedByOperator(Boolean removedByOperator) {
    this.removedByOperator = removedByOperator;
    return this;
  }

  /**
   * Get removedByOperator
   * @return removedByOperator
   */
  @javax.annotation.Nullable
  public Boolean getRemovedByOperator() {
    return removedByOperator;
  }

  public void setRemovedByOperator(Boolean removedByOperator) {
    this.removedByOperator = removedByOperator;
  }


  public DfsSlate salaryCap(Integer salaryCap) {
    this.salaryCap = salaryCap;
    return this;
  }

  /**
   * Get salaryCap
   * @return salaryCap
   */
  @javax.annotation.Nullable
  public Integer getSalaryCap() {
    return salaryCap;
  }

  public void setSalaryCap(Integer salaryCap) {
    this.salaryCap = salaryCap;
  }


  public DfsSlate slateID(Integer slateID) {
    this.slateID = slateID;
    return this;
  }

  /**
   * Get slateID
   * @return slateID
   */
  @javax.annotation.Nullable
  public Integer getSlateID() {
    return slateID;
  }

  public void setSlateID(Integer slateID) {
    this.slateID = slateID;
  }


  public DfsSlate slateRosterSlots(List<String> slateRosterSlots) {
    this.slateRosterSlots = slateRosterSlots;
    return this;
  }

  public DfsSlate addSlateRosterSlotsItem(String slateRosterSlotsItem) {
    if (this.slateRosterSlots == null) {
      this.slateRosterSlots = new ArrayList<>();
    }
    this.slateRosterSlots.add(slateRosterSlotsItem);
    return this;
  }

  /**
   * Get slateRosterSlots
   * @return slateRosterSlots
   */
  @javax.annotation.Nullable
  public List<String> getSlateRosterSlots() {
    return slateRosterSlots;
  }

  public void setSlateRosterSlots(List<String> slateRosterSlots) {
    this.slateRosterSlots = slateRosterSlots;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSlate dfsSlate = (DfsSlate) o;
    return Objects.equals(this.dfsSlateGames, dfsSlate.dfsSlateGames) &&
        Objects.equals(this.dfsSlatePlayers, dfsSlate.dfsSlatePlayers) &&
        Objects.equals(this.isMultiDaySlate, dfsSlate.isMultiDaySlate) &&
        Objects.equals(this.numberOfGames, dfsSlate.numberOfGames) &&
        Objects.equals(this.operator, dfsSlate.operator) &&
        Objects.equals(this.operatorDay, dfsSlate.operatorDay) &&
        Objects.equals(this.operatorGameType, dfsSlate.operatorGameType) &&
        Objects.equals(this.operatorName, dfsSlate.operatorName) &&
        Objects.equals(this.operatorSlateID, dfsSlate.operatorSlateID) &&
        Objects.equals(this.operatorStartTime, dfsSlate.operatorStartTime) &&
        Objects.equals(this.removedByOperator, dfsSlate.removedByOperator) &&
        Objects.equals(this.salaryCap, dfsSlate.salaryCap) &&
        Objects.equals(this.slateID, dfsSlate.slateID) &&
        Objects.equals(this.slateRosterSlots, dfsSlate.slateRosterSlots);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsSlateGames, dfsSlatePlayers, isMultiDaySlate, numberOfGames, operator, operatorDay, operatorGameType, operatorName, operatorSlateID, operatorStartTime, removedByOperator, salaryCap, slateID, slateRosterSlots);
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
    sb.append("class DfsSlate {\n");
    sb.append("    dfsSlateGames: ").append(toIndentedString(dfsSlateGames)).append("\n");
    sb.append("    dfsSlatePlayers: ").append(toIndentedString(dfsSlatePlayers)).append("\n");
    sb.append("    isMultiDaySlate: ").append(toIndentedString(isMultiDaySlate)).append("\n");
    sb.append("    numberOfGames: ").append(toIndentedString(numberOfGames)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operatorDay: ").append(toIndentedString(operatorDay)).append("\n");
    sb.append("    operatorGameType: ").append(toIndentedString(operatorGameType)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    operatorSlateID: ").append(toIndentedString(operatorSlateID)).append("\n");
    sb.append("    operatorStartTime: ").append(toIndentedString(operatorStartTime)).append("\n");
    sb.append("    removedByOperator: ").append(toIndentedString(removedByOperator)).append("\n");
    sb.append("    salaryCap: ").append(toIndentedString(salaryCap)).append("\n");
    sb.append("    slateID: ").append(toIndentedString(slateID)).append("\n");
    sb.append("    slateRosterSlots: ").append(toIndentedString(slateRosterSlots)).append("\n");
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
    openapiFields.add("DfsSlateGames");
    openapiFields.add("DfsSlatePlayers");
    openapiFields.add("IsMultiDaySlate");
    openapiFields.add("NumberOfGames");
    openapiFields.add("Operator");
    openapiFields.add("OperatorDay");
    openapiFields.add("OperatorGameType");
    openapiFields.add("OperatorName");
    openapiFields.add("OperatorSlateID");
    openapiFields.add("OperatorStartTime");
    openapiFields.add("RemovedByOperator");
    openapiFields.add("SalaryCap");
    openapiFields.add("SlateID");
    openapiFields.add("SlateRosterSlots");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DfsSlate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DfsSlate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DfsSlate is not found in the empty JSON string", DfsSlate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DfsSlate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DfsSlate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("DfsSlateGames") != null && !jsonObj.get("DfsSlateGames").isJsonNull()) {
        JsonArray jsonArraydfsSlateGames = jsonObj.getAsJsonArray("DfsSlateGames");
        if (jsonArraydfsSlateGames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DfsSlateGames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DfsSlateGames` to be an array in the JSON string but got `%s`", jsonObj.get("DfsSlateGames").toString()));
          }

          // validate the optional field `DfsSlateGames` (array)
          for (int i = 0; i < jsonArraydfsSlateGames.size(); i++) {
            DfsSlateGame.validateJsonElement(jsonArraydfsSlateGames.get(i));
          };
        }
      }
      if (jsonObj.get("DfsSlatePlayers") != null && !jsonObj.get("DfsSlatePlayers").isJsonNull()) {
        JsonArray jsonArraydfsSlatePlayers = jsonObj.getAsJsonArray("DfsSlatePlayers");
        if (jsonArraydfsSlatePlayers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DfsSlatePlayers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DfsSlatePlayers` to be an array in the JSON string but got `%s`", jsonObj.get("DfsSlatePlayers").toString()));
          }

          // validate the optional field `DfsSlatePlayers` (array)
          for (int i = 0; i < jsonArraydfsSlatePlayers.size(); i++) {
            DfsSlatePlayer.validateJsonElement(jsonArraydfsSlatePlayers.get(i));
          };
        }
      }
      if ((jsonObj.get("Operator") != null && !jsonObj.get("Operator").isJsonNull()) && !jsonObj.get("Operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Operator").toString()));
      }
      if ((jsonObj.get("OperatorDay") != null && !jsonObj.get("OperatorDay").isJsonNull()) && !jsonObj.get("OperatorDay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperatorDay").toString()));
      }
      if ((jsonObj.get("OperatorGameType") != null && !jsonObj.get("OperatorGameType").isJsonNull()) && !jsonObj.get("OperatorGameType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorGameType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperatorGameType").toString()));
      }
      if ((jsonObj.get("OperatorName") != null && !jsonObj.get("OperatorName").isJsonNull()) && !jsonObj.get("OperatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperatorName").toString()));
      }
      if ((jsonObj.get("OperatorStartTime") != null && !jsonObj.get("OperatorStartTime").isJsonNull()) && !jsonObj.get("OperatorStartTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorStartTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperatorStartTime").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SlateRosterSlots") != null && !jsonObj.get("SlateRosterSlots").isJsonNull() && !jsonObj.get("SlateRosterSlots").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SlateRosterSlots` to be an array in the JSON string but got `%s`", jsonObj.get("SlateRosterSlots").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DfsSlate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DfsSlate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DfsSlate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DfsSlate.class));

       return (TypeAdapter<T>) new TypeAdapter<DfsSlate>() {
           @Override
           public void write(JsonWriter out, DfsSlate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DfsSlate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DfsSlate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DfsSlate
   * @throws IOException if the JSON string is invalid with respect to DfsSlate
   */
  public static DfsSlate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DfsSlate.class);
  }

  /**
   * Convert an instance of DfsSlate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

