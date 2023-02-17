/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
import org.openapitools.client.model.GenericSignedAttestation;
import org.openapitools.client.model.PgpSignedAttestation;

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
 * Occurrence that represents a single \&quot;attestation\&quot;. The authenticity of an attestation can be verified using the attached signature. If the verifier trusts the public key of the signer, then verifying the signature is sufficient to establish trust. In this circumstance, the authority to which this attestation is attached is primarily useful for look-up (how to find this attestation if you already know the authority and artifact to be verified) and intent (which authority was this attestation intended to sign for).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:08.153528-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Attestation {
  public static final String SERIALIZED_NAME_GENERIC_SIGNED_ATTESTATION = "genericSignedAttestation";
  @SerializedName(SERIALIZED_NAME_GENERIC_SIGNED_ATTESTATION)
  private GenericSignedAttestation genericSignedAttestation;

  public static final String SERIALIZED_NAME_PGP_SIGNED_ATTESTATION = "pgpSignedAttestation";
  @SerializedName(SERIALIZED_NAME_PGP_SIGNED_ATTESTATION)
  private PgpSignedAttestation pgpSignedAttestation;

  public Attestation() {
  }

  public Attestation genericSignedAttestation(GenericSignedAttestation genericSignedAttestation) {
    this.genericSignedAttestation = genericSignedAttestation;
    return this;
  }

  /**
   * Get genericSignedAttestation
   * @return genericSignedAttestation
   */
  @javax.annotation.Nullable
  public GenericSignedAttestation getGenericSignedAttestation() {
    return genericSignedAttestation;
  }

  public void setGenericSignedAttestation(GenericSignedAttestation genericSignedAttestation) {
    this.genericSignedAttestation = genericSignedAttestation;
  }


  public Attestation pgpSignedAttestation(PgpSignedAttestation pgpSignedAttestation) {
    this.pgpSignedAttestation = pgpSignedAttestation;
    return this;
  }

  /**
   * Get pgpSignedAttestation
   * @return pgpSignedAttestation
   */
  @javax.annotation.Nullable
  public PgpSignedAttestation getPgpSignedAttestation() {
    return pgpSignedAttestation;
  }

  public void setPgpSignedAttestation(PgpSignedAttestation pgpSignedAttestation) {
    this.pgpSignedAttestation = pgpSignedAttestation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attestation attestation = (Attestation) o;
    return Objects.equals(this.genericSignedAttestation, attestation.genericSignedAttestation) &&
        Objects.equals(this.pgpSignedAttestation, attestation.pgpSignedAttestation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericSignedAttestation, pgpSignedAttestation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attestation {\n");
    sb.append("    genericSignedAttestation: ").append(toIndentedString(genericSignedAttestation)).append("\n");
    sb.append("    pgpSignedAttestation: ").append(toIndentedString(pgpSignedAttestation)).append("\n");
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
    openapiFields.add("genericSignedAttestation");
    openapiFields.add("pgpSignedAttestation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Attestation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Attestation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attestation is not found in the empty JSON string", Attestation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Attestation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Attestation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `genericSignedAttestation`
      if (jsonObj.get("genericSignedAttestation") != null && !jsonObj.get("genericSignedAttestation").isJsonNull()) {
        GenericSignedAttestation.validateJsonElement(jsonObj.get("genericSignedAttestation"));
      }
      // validate the optional field `pgpSignedAttestation`
      if (jsonObj.get("pgpSignedAttestation") != null && !jsonObj.get("pgpSignedAttestation").isJsonNull()) {
        PgpSignedAttestation.validateJsonElement(jsonObj.get("pgpSignedAttestation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Attestation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attestation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attestation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attestation.class));

       return (TypeAdapter<T>) new TypeAdapter<Attestation>() {
           @Override
           public void write(JsonWriter out, Attestation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Attestation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Attestation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Attestation
   * @throws IOException if the JSON string is invalid with respect to Attestation
   */
  public static Attestation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attestation.class);
  }

  /**
   * Convert an instance of Attestation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

