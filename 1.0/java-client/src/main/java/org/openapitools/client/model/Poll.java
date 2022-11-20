/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Emoji;

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
 * Represents a poll attached to a status.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:23.722002-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Poll {
  public static final String SERIALIZED_NAME_EMOJIS = "emojis";
  @SerializedName(SERIALIZED_NAME_EMOJIS)
  private List<Emoji> emojis = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MULTIPLE = "multiple";
  @SerializedName(SERIALIZED_NAME_MULTIPLE)
  private Boolean multiple;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Object> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWN_VOTES = "own_votes";
  @SerializedName(SERIALIZED_NAME_OWN_VOTES)
  private List<Integer> ownVotes = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOTED = "voted";
  @SerializedName(SERIALIZED_NAME_VOTED)
  private Boolean voted;

  public static final String SERIALIZED_NAME_VOTERS_COUNT = "voters_count";
  @SerializedName(SERIALIZED_NAME_VOTERS_COUNT)
  private Integer votersCount;

  public static final String SERIALIZED_NAME_VOTES_COUNT = "votes_count";
  @SerializedName(SERIALIZED_NAME_VOTES_COUNT)
  private Integer votesCount;

  public Poll() {
  }

  public Poll emojis(List<Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Poll addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji to be used for rendering poll options.
   * @return emojis
   */
  @javax.annotation.Nullable
  public List<Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<Emoji> emojis) {
    this.emojis = emojis;
  }


  public Poll expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Is the poll currently expired?
   * @return expired
   */
  @javax.annotation.Nullable
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public Poll expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * When the poll ends. ISO 8601 Datetime, or null if the poll does not end.
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Poll id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the poll in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Poll multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

  /**
   * Does the poll allow multiple-choice answers?
   * @return multiple
   */
  @javax.annotation.Nullable
  public Boolean getMultiple() {
    return multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }


  public Poll options(List<Object> options) {
    this.options = options;
    return this;
  }

  public Poll addOptionsItem(Object optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Possible answers for the poll.
   * @return options
   */
  @javax.annotation.Nullable
  public List<Object> getOptions() {
    return options;
  }

  public void setOptions(List<Object> options) {
    this.options = options;
  }


  public Poll ownVotes(List<Integer> ownVotes) {
    this.ownVotes = ownVotes;
    return this;
  }

  public Poll addOwnVotesItem(Integer ownVotesItem) {
    if (this.ownVotes == null) {
      this.ownVotes = new ArrayList<>();
    }
    this.ownVotes.add(ownVotesItem);
    return this;
  }

  /**
   * When called with a user token, which options has the authorized user chosen? Contains an array of index values for &#x60;options&#x60;. Array of Number, or null if no current user
   * @return ownVotes
   */
  @javax.annotation.Nullable
  public List<Integer> getOwnVotes() {
    return ownVotes;
  }

  public void setOwnVotes(List<Integer> ownVotes) {
    this.ownVotes = ownVotes;
  }


  public Poll voted(Boolean voted) {
    this.voted = voted;
    return this;
  }

  /**
   * When called with a user token, has the authorized user voted? Boolean, or null if no current user
   * @return voted
   */
  @javax.annotation.Nullable
  public Boolean getVoted() {
    return voted;
  }

  public void setVoted(Boolean voted) {
    this.voted = voted;
  }


  public Poll votersCount(Integer votersCount) {
    this.votersCount = votersCount;
    return this;
  }

  /**
   * How many unique accounts have voted on a multiple-choice poll. Number, or null if &#x60;multiple&#x60; is false.
   * @return votersCount
   */
  @javax.annotation.Nullable
  public Integer getVotersCount() {
    return votersCount;
  }

  public void setVotersCount(Integer votersCount) {
    this.votersCount = votersCount;
  }


  public Poll votesCount(Integer votesCount) {
    this.votesCount = votesCount;
    return this;
  }

  /**
   * How many votes have been received.
   * @return votesCount
   */
  @javax.annotation.Nullable
  public Integer getVotesCount() {
    return votesCount;
  }

  public void setVotesCount(Integer votesCount) {
    this.votesCount = votesCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poll poll = (Poll) o;
    return Objects.equals(this.emojis, poll.emojis) &&
        Objects.equals(this.expired, poll.expired) &&
        Objects.equals(this.expiresAt, poll.expiresAt) &&
        Objects.equals(this.id, poll.id) &&
        Objects.equals(this.multiple, poll.multiple) &&
        Objects.equals(this.options, poll.options) &&
        Objects.equals(this.ownVotes, poll.ownVotes) &&
        Objects.equals(this.voted, poll.voted) &&
        Objects.equals(this.votersCount, poll.votersCount) &&
        Objects.equals(this.votesCount, poll.votesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis, expired, expiresAt, id, multiple, options, ownVotes, voted, votersCount, votesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poll {\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    ownVotes: ").append(toIndentedString(ownVotes)).append("\n");
    sb.append("    voted: ").append(toIndentedString(voted)).append("\n");
    sb.append("    votersCount: ").append(toIndentedString(votersCount)).append("\n");
    sb.append("    votesCount: ").append(toIndentedString(votesCount)).append("\n");
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
    openapiFields.add("emojis");
    openapiFields.add("expired");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("multiple");
    openapiFields.add("options");
    openapiFields.add("own_votes");
    openapiFields.add("voted");
    openapiFields.add("voters_count");
    openapiFields.add("votes_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Poll
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Poll.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Poll is not found in the empty JSON string", Poll.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Poll.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Poll` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("emojis") != null && !jsonObj.get("emojis").isJsonNull()) {
        JsonArray jsonArrayemojis = jsonObj.getAsJsonArray("emojis");
        if (jsonArrayemojis != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emojis").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emojis` to be an array in the JSON string but got `%s`", jsonObj.get("emojis").toString()));
          }

          // validate the optional field `emojis` (array)
          for (int i = 0; i < jsonArrayemojis.size(); i++) {
            Emoji.validateJsonElement(jsonArrayemojis.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull() && !jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("own_votes") != null && !jsonObj.get("own_votes").isJsonNull() && !jsonObj.get("own_votes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `own_votes` to be an array in the JSON string but got `%s`", jsonObj.get("own_votes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Poll.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Poll' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Poll> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Poll.class));

       return (TypeAdapter<T>) new TypeAdapter<Poll>() {
           @Override
           public void write(JsonWriter out, Poll value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Poll read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Poll given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Poll
   * @throws IOException if the JSON string is invalid with respect to Poll
   */
  public static Poll fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Poll.class);
  }

  /**
   * Convert an instance of Poll to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

