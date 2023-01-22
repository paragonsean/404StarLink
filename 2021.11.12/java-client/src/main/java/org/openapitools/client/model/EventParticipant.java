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
import org.openapitools.client.model.CompactPerson;
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
 * EventParticipant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:48.119439-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EventParticipant {
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

  public EventParticipant() {
  }

  public EventParticipant entityType(String entityType) {
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


  public EventParticipant name(String name) {
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


  public EventParticipant note(String note) {
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


  public EventParticipant organization(Organization organization) {
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


  public EventParticipant person(CompactPerson person) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventParticipant eventParticipant = (EventParticipant) o;
    return Objects.equals(this.entityType, eventParticipant.entityType) &&
        Objects.equals(this.name, eventParticipant.name) &&
        Objects.equals(this.note, eventParticipant.note) &&
        Objects.equals(this.organization, eventParticipant.organization) &&
        Objects.equals(this.person, eventParticipant.person);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, name, note, organization, person);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventParticipant {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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
    openapiFields.add("entity_type");
    openapiFields.add("name");
    openapiFields.add("note");
    openapiFields.add("organization");
    openapiFields.add("person");

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
   * @throws IOException if the JSON Element is invalid with respect to EventParticipant
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventParticipant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventParticipant is not found in the empty JSON string", EventParticipant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventParticipant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventParticipant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventParticipant.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventParticipant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventParticipant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventParticipant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventParticipant.class));

       return (TypeAdapter<T>) new TypeAdapter<EventParticipant>() {
           @Override
           public void write(JsonWriter out, EventParticipant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventParticipant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventParticipant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventParticipant
   * @throws IOException if the JSON string is invalid with respect to EventParticipant
   */
  public static EventParticipant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventParticipant.class);
  }

  /**
   * Convert an instance of EventParticipant to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

