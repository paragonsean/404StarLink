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
 * CommitteeMembership
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:10.400115-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CommitteeMembership {
  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private CompactPerson person;

  public static final String SERIALIZED_NAME_PERSON_NAME = "person_name";
  @SerializedName(SERIALIZED_NAME_PERSON_NAME)
  private String personName;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public CommitteeMembership() {
  }

  public CommitteeMembership person(CompactPerson person) {
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


  public CommitteeMembership personName(String personName) {
    this.personName = personName;
    return this;
  }

  /**
   * Get personName
   * @return personName
   */
  @javax.annotation.Nonnull
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }


  public CommitteeMembership role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nonnull
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitteeMembership committeeMembership = (CommitteeMembership) o;
    return Objects.equals(this.person, committeeMembership.person) &&
        Objects.equals(this.personName, committeeMembership.personName) &&
        Objects.equals(this.role, committeeMembership.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, personName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitteeMembership {\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("person");
    openapiFields.add("person_name");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("person_name");
    openapiRequiredFields.add("role");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommitteeMembership
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommitteeMembership.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommitteeMembership is not found in the empty JSON string", CommitteeMembership.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommitteeMembership.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommitteeMembership` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommitteeMembership.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `person`
      if (jsonObj.get("person") != null && !jsonObj.get("person").isJsonNull()) {
        CompactPerson.validateJsonElement(jsonObj.get("person"));
      }
      if (!jsonObj.get("person_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `person_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("person_name").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommitteeMembership.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommitteeMembership' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommitteeMembership> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommitteeMembership.class));

       return (TypeAdapter<T>) new TypeAdapter<CommitteeMembership>() {
           @Override
           public void write(JsonWriter out, CommitteeMembership value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommitteeMembership read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommitteeMembership given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommitteeMembership
   * @throws IOException if the JSON string is invalid with respect to CommitteeMembership
   */
  public static CommitteeMembership fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommitteeMembership.class);
  }

  /**
   * Convert an instance of CommitteeMembership to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

