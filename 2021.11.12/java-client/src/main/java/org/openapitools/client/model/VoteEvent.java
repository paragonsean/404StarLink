/*
 * Open States API v3
 *  * [More documentation](https://docs.openstates.org/en/latest/api/v3/index.html) * [Register for an account](https://openstates.org/accounts/signup/)   **We are currently working to restore experimental support for committees & events.**  During this period please note that data is not yet available for all states and the exact format of the new endpoints may change slightly depending on user feedback.  If you have any issues or questions use our [GitHub Issues](https://github.com/openstates/issues/issues) to give feedback. 
 *
 * The version of the OpenAPI document: 2021.11.12
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
import org.openapitools.client.model.Link;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.PersonVote;
import org.openapitools.client.model.VoteCount;

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
 * VoteEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:48.119439-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VoteEvent {
  public static final String SERIALIZED_NAME_COUNTS = "counts";
  @SerializedName(SERIALIZED_NAME_COUNTS)
  private List<VoteCount> counts = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTRAS = "extras";
  @SerializedName(SERIALIZED_NAME_EXTRAS)
  private Object extras;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_MOTION_CLASSIFICATION = "motion_classification";
  @SerializedName(SERIALIZED_NAME_MOTION_CLASSIFICATION)
  private List<String> motionClassification = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOTION_TEXT = "motion_text";
  @SerializedName(SERIALIZED_NAME_MOTION_TEXT)
  private String motionText;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Organization organization;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<Link> sources = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  private List<PersonVote> votes = new ArrayList<>();

  public VoteEvent() {
  }

  public VoteEvent counts(List<VoteCount> counts) {
    this.counts = counts;
    return this;
  }

  public VoteEvent addCountsItem(VoteCount countsItem) {
    if (this.counts == null) {
      this.counts = new ArrayList<>();
    }
    this.counts.add(countsItem);
    return this;
  }

  /**
   * Get counts
   * @return counts
   */
  @javax.annotation.Nonnull
  public List<VoteCount> getCounts() {
    return counts;
  }

  public void setCounts(List<VoteCount> counts) {
    this.counts = counts;
  }


  public VoteEvent extras(Object extras) {
    this.extras = extras;
    return this;
  }

  /**
   * Get extras
   * @return extras
   */
  @javax.annotation.Nonnull
  public Object getExtras() {
    return extras;
  }

  public void setExtras(Object extras) {
    this.extras = extras;
  }


  public VoteEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public VoteEvent identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   */
  @javax.annotation.Nonnull
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public VoteEvent motionClassification(List<String> motionClassification) {
    this.motionClassification = motionClassification;
    return this;
  }

  public VoteEvent addMotionClassificationItem(String motionClassificationItem) {
    if (this.motionClassification == null) {
      this.motionClassification = new ArrayList<>();
    }
    this.motionClassification.add(motionClassificationItem);
    return this;
  }

  /**
   * Get motionClassification
   * @return motionClassification
   */
  @javax.annotation.Nullable
  public List<String> getMotionClassification() {
    return motionClassification;
  }

  public void setMotionClassification(List<String> motionClassification) {
    this.motionClassification = motionClassification;
  }


  public VoteEvent motionText(String motionText) {
    this.motionText = motionText;
    return this;
  }

  /**
   * Get motionText
   * @return motionText
   */
  @javax.annotation.Nonnull
  public String getMotionText() {
    return motionText;
  }

  public void setMotionText(String motionText) {
    this.motionText = motionText;
  }


  public VoteEvent organization(Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nonnull
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }


  public VoteEvent result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nonnull
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public VoteEvent sources(List<Link> sources) {
    this.sources = sources;
    return this;
  }

  public VoteEvent addSourcesItem(Link sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Get sources
   * @return sources
   */
  @javax.annotation.Nonnull
  public List<Link> getSources() {
    return sources;
  }

  public void setSources(List<Link> sources) {
    this.sources = sources;
  }


  public VoteEvent startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public VoteEvent votes(List<PersonVote> votes) {
    this.votes = votes;
    return this;
  }

  public VoteEvent addVotesItem(PersonVote votesItem) {
    if (this.votes == null) {
      this.votes = new ArrayList<>();
    }
    this.votes.add(votesItem);
    return this;
  }

  /**
   * Get votes
   * @return votes
   */
  @javax.annotation.Nonnull
  public List<PersonVote> getVotes() {
    return votes;
  }

  public void setVotes(List<PersonVote> votes) {
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
    VoteEvent voteEvent = (VoteEvent) o;
    return Objects.equals(this.counts, voteEvent.counts) &&
        Objects.equals(this.extras, voteEvent.extras) &&
        Objects.equals(this.id, voteEvent.id) &&
        Objects.equals(this.identifier, voteEvent.identifier) &&
        Objects.equals(this.motionClassification, voteEvent.motionClassification) &&
        Objects.equals(this.motionText, voteEvent.motionText) &&
        Objects.equals(this.organization, voteEvent.organization) &&
        Objects.equals(this.result, voteEvent.result) &&
        Objects.equals(this.sources, voteEvent.sources) &&
        Objects.equals(this.startDate, voteEvent.startDate) &&
        Objects.equals(this.votes, voteEvent.votes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, extras, id, identifier, motionClassification, motionText, organization, result, sources, startDate, votes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteEvent {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    motionClassification: ").append(toIndentedString(motionClassification)).append("\n");
    sb.append("    motionText: ").append(toIndentedString(motionText)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("counts");
    openapiFields.add("extras");
    openapiFields.add("id");
    openapiFields.add("identifier");
    openapiFields.add("motion_classification");
    openapiFields.add("motion_text");
    openapiFields.add("organization");
    openapiFields.add("result");
    openapiFields.add("sources");
    openapiFields.add("start_date");
    openapiFields.add("votes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("counts");
    openapiRequiredFields.add("extras");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("motion_text");
    openapiRequiredFields.add("organization");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("sources");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("votes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VoteEvent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoteEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoteEvent is not found in the empty JSON string", VoteEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoteEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoteEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoteEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("counts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `counts` to be an array in the JSON string but got `%s`", jsonObj.get("counts").toString()));
      }

      JsonArray jsonArraycounts = jsonObj.getAsJsonArray("counts");
      // validate the required field `counts` (array)
      for (int i = 0; i < jsonArraycounts.size(); i++) {
        VoteCount.validateJsonElement(jsonArraycounts.get(i));
      };
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("motion_classification") != null && !jsonObj.get("motion_classification").isJsonNull() && !jsonObj.get("motion_classification").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `motion_classification` to be an array in the JSON string but got `%s`", jsonObj.get("motion_classification").toString()));
      }
      if (!jsonObj.get("motion_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `motion_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("motion_text").toString()));
      }
      // validate the required field `organization`
      Organization.validateJsonElement(jsonObj.get("organization"));
      if (!jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sources` to be an array in the JSON string but got `%s`", jsonObj.get("sources").toString()));
      }

      JsonArray jsonArraysources = jsonObj.getAsJsonArray("sources");
      // validate the required field `sources` (array)
      for (int i = 0; i < jsonArraysources.size(); i++) {
        Link.validateJsonElement(jsonArraysources.get(i));
      };
      if (!jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("votes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `votes` to be an array in the JSON string but got `%s`", jsonObj.get("votes").toString()));
      }

      JsonArray jsonArrayvotes = jsonObj.getAsJsonArray("votes");
      // validate the required field `votes` (array)
      for (int i = 0; i < jsonArrayvotes.size(); i++) {
        PersonVote.validateJsonElement(jsonArrayvotes.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoteEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoteEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoteEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoteEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<VoteEvent>() {
           @Override
           public void write(JsonWriter out, VoteEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoteEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VoteEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VoteEvent
   * @throws IOException if the JSON string is invalid with respect to VoteEvent
   */
  public static VoteEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoteEvent.class);
  }

  /**
   * Convert an instance of VoteEvent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

