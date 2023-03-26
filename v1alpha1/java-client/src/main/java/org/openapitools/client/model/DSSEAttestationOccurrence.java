/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1alpha1
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
import org.openapitools.client.model.Envelope;
import org.openapitools.client.model.InTotoStatement;

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
 * An occurrence describing an attestation on a resource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DSSEAttestationOccurrence {
  public static final String SERIALIZED_NAME_ENVELOPE = "envelope";
  @SerializedName(SERIALIZED_NAME_ENVELOPE)
  private Envelope envelope;

  public static final String SERIALIZED_NAME_STATEMENT = "statement";
  @SerializedName(SERIALIZED_NAME_STATEMENT)
  private InTotoStatement statement;

  public DSSEAttestationOccurrence() {
  }

  public DSSEAttestationOccurrence envelope(Envelope envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * Get envelope
   * @return envelope
   */
  @javax.annotation.Nullable
  public Envelope getEnvelope() {
    return envelope;
  }

  public void setEnvelope(Envelope envelope) {
    this.envelope = envelope;
  }


  public DSSEAttestationOccurrence statement(InTotoStatement statement) {
    this.statement = statement;
    return this;
  }

  /**
   * Get statement
   * @return statement
   */
  @javax.annotation.Nullable
  public InTotoStatement getStatement() {
    return statement;
  }

  public void setStatement(InTotoStatement statement) {
    this.statement = statement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSSEAttestationOccurrence dsSEAttestationOccurrence = (DSSEAttestationOccurrence) o;
    return Objects.equals(this.envelope, dsSEAttestationOccurrence.envelope) &&
        Objects.equals(this.statement, dsSEAttestationOccurrence.statement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelope, statement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSSEAttestationOccurrence {\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
    openapiFields.add("envelope");
    openapiFields.add("statement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DSSEAttestationOccurrence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DSSEAttestationOccurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DSSEAttestationOccurrence is not found in the empty JSON string", DSSEAttestationOccurrence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DSSEAttestationOccurrence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DSSEAttestationOccurrence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `envelope`
      if (jsonObj.get("envelope") != null && !jsonObj.get("envelope").isJsonNull()) {
        Envelope.validateJsonElement(jsonObj.get("envelope"));
      }
      // validate the optional field `statement`
      if (jsonObj.get("statement") != null && !jsonObj.get("statement").isJsonNull()) {
        InTotoStatement.validateJsonElement(jsonObj.get("statement"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DSSEAttestationOccurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DSSEAttestationOccurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DSSEAttestationOccurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DSSEAttestationOccurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<DSSEAttestationOccurrence>() {
           @Override
           public void write(JsonWriter out, DSSEAttestationOccurrence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DSSEAttestationOccurrence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DSSEAttestationOccurrence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DSSEAttestationOccurrence
   * @throws IOException if the JSON string is invalid with respect to DSSEAttestationOccurrence
   */
  public static DSSEAttestationOccurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DSSEAttestationOccurrence.class);
  }

  /**
   * Convert an instance of DSSEAttestationOccurrence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

