/*
 * Transport Department, Daman & Diu
 * Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.
 *
 * The version of the OpenAPI document: 3.0.0
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
import org.openapitools.client.model.DrivingLicenseSchemaIssuedToPerson;

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
 * DrivingLicenseSchemaIssuedTo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:16.010188-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DrivingLicenseSchemaIssuedTo {
  public static final String SERIALIZED_NAME_PERSON = "Person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private DrivingLicenseSchemaIssuedToPerson person;

  public DrivingLicenseSchemaIssuedTo() {
  }

  public DrivingLicenseSchemaIssuedTo person(DrivingLicenseSchemaIssuedToPerson person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
   */
  @javax.annotation.Nonnull
  public DrivingLicenseSchemaIssuedToPerson getPerson() {
    return person;
  }

  public void setPerson(DrivingLicenseSchemaIssuedToPerson person) {
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
    DrivingLicenseSchemaIssuedTo drivingLicenseSchemaIssuedTo = (DrivingLicenseSchemaIssuedTo) o;
    return Objects.equals(this.person, drivingLicenseSchemaIssuedTo.person);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenseSchemaIssuedTo {\n");
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
    openapiFields.add("Person");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Person");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseSchemaIssuedTo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DrivingLicenseSchemaIssuedTo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DrivingLicenseSchemaIssuedTo is not found in the empty JSON string", DrivingLicenseSchemaIssuedTo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DrivingLicenseSchemaIssuedTo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DrivingLicenseSchemaIssuedTo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DrivingLicenseSchemaIssuedTo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Person`
      DrivingLicenseSchemaIssuedToPerson.validateJsonElement(jsonObj.get("Person"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrivingLicenseSchemaIssuedTo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrivingLicenseSchemaIssuedTo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrivingLicenseSchemaIssuedTo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrivingLicenseSchemaIssuedTo.class));

       return (TypeAdapter<T>) new TypeAdapter<DrivingLicenseSchemaIssuedTo>() {
           @Override
           public void write(JsonWriter out, DrivingLicenseSchemaIssuedTo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrivingLicenseSchemaIssuedTo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DrivingLicenseSchemaIssuedTo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DrivingLicenseSchemaIssuedTo
   * @throws IOException if the JSON string is invalid with respect to DrivingLicenseSchemaIssuedTo
   */
  public static DrivingLicenseSchemaIssuedTo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrivingLicenseSchemaIssuedTo.class);
  }

  /**
   * Convert an instance of DrivingLicenseSchemaIssuedTo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

