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
 * Membership
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:42.446348-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Membership {
  public static final String SERIALIZED_NAME_ACTIVE = "Active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_MEMBERSHIP_ID = "MembershipId";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_ID)
  private Integer membershipId;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public static final String SERIALIZED_NAME_PLAYER_NAME = "PlayerName";
  @SerializedName(SERIALIZED_NAME_PLAYER_NAME)
  private String playerName;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_TEAM_AREA = "TeamArea";
  @SerializedName(SERIALIZED_NAME_TEAM_AREA)
  private String teamArea;

  public static final String SERIALIZED_NAME_TEAM_ID = "TeamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private Integer teamId;

  public static final String SERIALIZED_NAME_TEAM_NAME = "TeamName";
  @SerializedName(SERIALIZED_NAME_TEAM_NAME)
  private String teamName;

  public static final String SERIALIZED_NAME_UPDATED = "Updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public Membership() {
  }

  public Membership active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public Membership endDate(String endDate) {
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


  public Membership membershipId(Integer membershipId) {
    this.membershipId = membershipId;
    return this;
  }

  /**
   * Get membershipId
   * @return membershipId
   */
  @javax.annotation.Nullable
  public Integer getMembershipId() {
    return membershipId;
  }

  public void setMembershipId(Integer membershipId) {
    this.membershipId = membershipId;
  }


  public Membership playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * Get playerId
   * @return playerId
   */
  @javax.annotation.Nullable
  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }


  public Membership playerName(String playerName) {
    this.playerName = playerName;
    return this;
  }

  /**
   * Get playerName
   * @return playerName
   */
  @javax.annotation.Nullable
  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }


  public Membership startDate(String startDate) {
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


  public Membership teamArea(String teamArea) {
    this.teamArea = teamArea;
    return this;
  }

  /**
   * Get teamArea
   * @return teamArea
   */
  @javax.annotation.Nullable
  public String getTeamArea() {
    return teamArea;
  }

  public void setTeamArea(String teamArea) {
    this.teamArea = teamArea;
  }


  public Membership teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  @javax.annotation.Nullable
  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }


  public Membership teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
   */
  @javax.annotation.Nullable
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public Membership updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Membership membership = (Membership) o;
    return Objects.equals(this.active, membership.active) &&
        Objects.equals(this.endDate, membership.endDate) &&
        Objects.equals(this.membershipId, membership.membershipId) &&
        Objects.equals(this.playerId, membership.playerId) &&
        Objects.equals(this.playerName, membership.playerName) &&
        Objects.equals(this.startDate, membership.startDate) &&
        Objects.equals(this.teamArea, membership.teamArea) &&
        Objects.equals(this.teamId, membership.teamId) &&
        Objects.equals(this.teamName, membership.teamName) &&
        Objects.equals(this.updated, membership.updated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, endDate, membershipId, playerId, playerName, startDate, teamArea, teamId, teamName, updated);
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
    sb.append("class Membership {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    playerName: ").append(toIndentedString(playerName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    teamArea: ").append(toIndentedString(teamArea)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("Active");
    openapiFields.add("EndDate");
    openapiFields.add("MembershipId");
    openapiFields.add("PlayerId");
    openapiFields.add("PlayerName");
    openapiFields.add("StartDate");
    openapiFields.add("TeamArea");
    openapiFields.add("TeamId");
    openapiFields.add("TeamName");
    openapiFields.add("Updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Membership
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Membership.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Membership is not found in the empty JSON string", Membership.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Membership.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Membership` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EndDate") != null && !jsonObj.get("EndDate").isJsonNull()) && !jsonObj.get("EndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndDate").toString()));
      }
      if ((jsonObj.get("PlayerName") != null && !jsonObj.get("PlayerName").isJsonNull()) && !jsonObj.get("PlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerName").toString()));
      }
      if ((jsonObj.get("StartDate") != null && !jsonObj.get("StartDate").isJsonNull()) && !jsonObj.get("StartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StartDate").toString()));
      }
      if ((jsonObj.get("TeamArea") != null && !jsonObj.get("TeamArea").isJsonNull()) && !jsonObj.get("TeamArea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TeamArea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TeamArea").toString()));
      }
      if ((jsonObj.get("TeamName") != null && !jsonObj.get("TeamName").isJsonNull()) && !jsonObj.get("TeamName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TeamName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TeamName").toString()));
      }
      if ((jsonObj.get("Updated") != null && !jsonObj.get("Updated").isJsonNull()) && !jsonObj.get("Updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Updated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Membership.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Membership' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Membership> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Membership.class));

       return (TypeAdapter<T>) new TypeAdapter<Membership>() {
           @Override
           public void write(JsonWriter out, Membership value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Membership read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Membership given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Membership
   * @throws IOException if the JSON string is invalid with respect to Membership
   */
  public static Membership fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Membership.class);
  }

  /**
   * Convert an instance of Membership to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

