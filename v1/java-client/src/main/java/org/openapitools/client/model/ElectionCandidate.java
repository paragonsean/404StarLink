/*
 * Members API
 * An API which retrieves Members data.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
import org.openapitools.client.model.Party;
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
 * ElectionCandidate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:52.015048-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ElectionCandidate {
  public static final String SERIALIZED_NAME_MEMBER_ID = "memberId";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private Integer memberId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARTY = "party";
  @SerializedName(SERIALIZED_NAME_PARTY)
  private Party party;

  public static final String SERIALIZED_NAME_RANK_ORDER = "rankOrder";
  @SerializedName(SERIALIZED_NAME_RANK_ORDER)
  private Integer rankOrder;

  public static final String SERIALIZED_NAME_RESULT_CHANGE = "resultChange";
  @SerializedName(SERIALIZED_NAME_RESULT_CHANGE)
  private String resultChange;

  public static final String SERIALIZED_NAME_VOTE_SHARE = "voteShare";
  @SerializedName(SERIALIZED_NAME_VOTE_SHARE)
  private Double voteShare;

  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  private Integer votes;

  public ElectionCandidate() {
  }

  public ElectionCandidate memberId(Integer memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
   */
  @javax.annotation.Nullable
  public Integer getMemberId() {
    return memberId;
  }

  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }


  public ElectionCandidate name(String name) {
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


  public ElectionCandidate party(Party party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
   */
  @javax.annotation.Nullable
  public Party getParty() {
    return party;
  }

  public void setParty(Party party) {
    this.party = party;
  }


  public ElectionCandidate rankOrder(Integer rankOrder) {
    this.rankOrder = rankOrder;
    return this;
  }

  /**
   * Get rankOrder
   * @return rankOrder
   */
  @javax.annotation.Nullable
  public Integer getRankOrder() {
    return rankOrder;
  }

  public void setRankOrder(Integer rankOrder) {
    this.rankOrder = rankOrder;
  }


  public ElectionCandidate resultChange(String resultChange) {
    this.resultChange = resultChange;
    return this;
  }

  /**
   * Get resultChange
   * @return resultChange
   */
  @javax.annotation.Nullable
  public String getResultChange() {
    return resultChange;
  }

  public void setResultChange(String resultChange) {
    this.resultChange = resultChange;
  }


  public ElectionCandidate voteShare(Double voteShare) {
    this.voteShare = voteShare;
    return this;
  }

  /**
   * Get voteShare
   * @return voteShare
   */
  @javax.annotation.Nullable
  public Double getVoteShare() {
    return voteShare;
  }

  public void setVoteShare(Double voteShare) {
    this.voteShare = voteShare;
  }


  public ElectionCandidate votes(Integer votes) {
    this.votes = votes;
    return this;
  }

  /**
   * Get votes
   * @return votes
   */
  @javax.annotation.Nullable
  public Integer getVotes() {
    return votes;
  }

  public void setVotes(Integer votes) {
    this.votes = votes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectionCandidate electionCandidate = (ElectionCandidate) o;
    return Objects.equals(this.memberId, electionCandidate.memberId) &&
        Objects.equals(this.name, electionCandidate.name) &&
        Objects.equals(this.party, electionCandidate.party) &&
        Objects.equals(this.rankOrder, electionCandidate.rankOrder) &&
        Objects.equals(this.resultChange, electionCandidate.resultChange) &&
        Objects.equals(this.voteShare, electionCandidate.voteShare) &&
        Objects.equals(this.votes, electionCandidate.votes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, name, party, rankOrder, resultChange, voteShare, votes);
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
    sb.append("class ElectionCandidate {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    rankOrder: ").append(toIndentedString(rankOrder)).append("\n");
    sb.append("    resultChange: ").append(toIndentedString(resultChange)).append("\n");
    sb.append("    voteShare: ").append(toIndentedString(voteShare)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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
    openapiFields.add("memberId");
    openapiFields.add("name");
    openapiFields.add("party");
    openapiFields.add("rankOrder");
    openapiFields.add("resultChange");
    openapiFields.add("voteShare");
    openapiFields.add("votes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElectionCandidate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElectionCandidate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElectionCandidate is not found in the empty JSON string", ElectionCandidate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElectionCandidate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElectionCandidate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `party`
      if (jsonObj.get("party") != null && !jsonObj.get("party").isJsonNull()) {
        Party.validateJsonElement(jsonObj.get("party"));
      }
      if ((jsonObj.get("resultChange") != null && !jsonObj.get("resultChange").isJsonNull()) && !jsonObj.get("resultChange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultChange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultChange").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElectionCandidate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElectionCandidate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElectionCandidate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElectionCandidate.class));

       return (TypeAdapter<T>) new TypeAdapter<ElectionCandidate>() {
           @Override
           public void write(JsonWriter out, ElectionCandidate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElectionCandidate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElectionCandidate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElectionCandidate
   * @throws IOException if the JSON string is invalid with respect to ElectionCandidate
   */
  public static ElectionCandidate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElectionCandidate.class);
  }

  /**
   * Convert an instance of ElectionCandidate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

