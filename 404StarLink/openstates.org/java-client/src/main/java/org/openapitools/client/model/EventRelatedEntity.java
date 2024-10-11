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
import java.util.Arrays;
import org.openapitools.client.model.CompactBill;
import org.openapitools.client.model.CompactPerson;
import org.openapitools.client.model.CompactVoteEvent;
import org.openapitools.client.model.Organization;

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
 * EventRelatedEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:13.496026-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EventRelatedEntity {
  public static final String SERIALIZED_NAME_BILL = "bill";
  @SerializedName(SERIALIZED_NAME_BILL)
  private CompactBill bill;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Organization organization;

  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private CompactPerson person;

  public static final String SERIALIZED_NAME_VOTE = "vote";
  @SerializedName(SERIALIZED_NAME_VOTE)
  private CompactVoteEvent vote;

  public EventRelatedEntity() {
  }

  public EventRelatedEntity bill(CompactBill bill) {
    this.bill = bill;
    return this;
  }

  /**
   * Get bill
   * @return bill
   */
  @javax.annotation.Nullable
  public CompactBill getBill() {
    return bill;
  }

  public void setBill(CompactBill bill) {
    this.bill = bill;
  }


  public EventRelatedEntity entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @javax.annotation.Nonnull
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public EventRelatedEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public EventRelatedEntity note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
   */
  @javax.annotation.Nonnull
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public EventRelatedEntity organization(Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nullable
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }


  public EventRelatedEntity person(CompactPerson person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
   */
  @javax.annotation.Nullable
  public CompactPerson getPerson() {
    return person;
  }

  public void setPerson(CompactPerson person) {
    this.person = person;
  }


  public EventRelatedEntity vote(CompactVoteEvent vote) {
    this.vote = vote;
    return this;
  }

  /**
   * Get vote
   * @return vote
   */
  @javax.annotation.Nullable
  public CompactVoteEvent getVote() {
    return vote;
  }

  public void setVote(CompactVoteEvent vote) {
    this.vote = vote;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRelatedEntity eventRelatedEntity = (EventRelatedEntity) o;
    return Objects.equals(this.bill, eventRelatedEntity.bill) &&
        Objects.equals(this.entityType, eventRelatedEntity.entityType) &&
        Objects.equals(this.name, eventRelatedEntity.name) &&
        Objects.equals(this.note, eventRelatedEntity.note) &&
        Objects.equals(this.organization, eventRelatedEntity.organization) &&
        Objects.equals(this.person, eventRelatedEntity.person) &&
        Objects.equals(this.vote, eventRelatedEntity.vote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bill, entityType, name, note, organization, person, vote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRelatedEntity {\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
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
    openapiFields.add("bill");
    openapiFields.add("entity_type");
    openapiFields.add("name");
    openapiFields.add("note");
    openapiFields.add("organization");
    openapiFields.add("person");
    openapiFields.add("vote");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entity_type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("note");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventRelatedEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventRelatedEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventRelatedEntity is not found in the empty JSON string", EventRelatedEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventRelatedEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventRelatedEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventRelatedEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bill`
      if (jsonObj.get("bill") != null && !jsonObj.get("bill").isJsonNull()) {
        CompactBill.validateJsonElement(jsonObj.get("bill"));
      }
      if (!jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        Organization.validateJsonElement(jsonObj.get("organization"));
      }
      // validate the optional field `person`
      if (jsonObj.get("person") != null && !jsonObj.get("person").isJsonNull()) {
        CompactPerson.validateJsonElement(jsonObj.get("person"));
      }
      // validate the optional field `vote`
      if (jsonObj.get("vote") != null && !jsonObj.get("vote").isJsonNull()) {
        CompactVoteEvent.validateJsonElement(jsonObj.get("vote"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventRelatedEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventRelatedEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventRelatedEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventRelatedEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<EventRelatedEntity>() {
           @Override
           public void write(JsonWriter out, EventRelatedEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventRelatedEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventRelatedEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventRelatedEntity
   * @throws IOException if the JSON string is invalid with respect to EventRelatedEntity
   */
  public static EventRelatedEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventRelatedEntity.class);
  }

  /**
   * Convert an instance of EventRelatedEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

