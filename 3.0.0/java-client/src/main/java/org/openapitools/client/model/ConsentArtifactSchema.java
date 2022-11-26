/*
 * KERALA PUBLIC SERVICE COMMISSION, Kerala
 * The following issued documents can be integrated with DigiLocker and get used by candidates for service delivery - 1.One Time Verification -OTV certificate � issued to candidates qualified for appointment for posts in Govt. Sector to produce to the concerned dept. after scrutinizing their the relevant documents to prove their qualifications, age, etc.2. Admission Tickets for appearing Online, OMR Exams, Physical Test, Interview etc. 3.Departmental Test Certificates- is issued to employees in Govt. sector
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
import org.openapitools.client.model.ConsentArtifactSchemaConsent;
import org.openapitools.client.model.ConsentArtifactSchemaSignature;

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
 * ConsentArtifactSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:42.390260-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConsentArtifactSchema {
  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private ConsentArtifactSchemaConsent consent;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private ConsentArtifactSchemaSignature signature;

  public ConsentArtifactSchema() {
  }

  public ConsentArtifactSchema consent(ConsentArtifactSchemaConsent consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Get consent
   * @return consent
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsent getConsent() {
    return consent;
  }

  public void setConsent(ConsentArtifactSchemaConsent consent) {
    this.consent = consent;
  }


  public ConsentArtifactSchema signature(ConsentArtifactSchemaSignature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaSignature getSignature() {
    return signature;
  }

  public void setSignature(ConsentArtifactSchemaSignature signature) {
    this.signature = signature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentArtifactSchema consentArtifactSchema = (ConsentArtifactSchema) o;
    return Objects.equals(this.consent, consentArtifactSchema.consent) &&
        Objects.equals(this.signature, consentArtifactSchema.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consent, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentArtifactSchema {\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("consent");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("consent");
    openapiRequiredFields.add("signature");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsentArtifactSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsentArtifactSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentArtifactSchema is not found in the empty JSON string", ConsentArtifactSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsentArtifactSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentArtifactSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentArtifactSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `consent`
      ConsentArtifactSchemaConsent.validateJsonElement(jsonObj.get("consent"));
      // validate the required field `signature`
      ConsentArtifactSchemaSignature.validateJsonElement(jsonObj.get("signature"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentArtifactSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentArtifactSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentArtifactSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentArtifactSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentArtifactSchema>() {
           @Override
           public void write(JsonWriter out, ConsentArtifactSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentArtifactSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsentArtifactSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsentArtifactSchema
   * @throws IOException if the JSON string is invalid with respect to ConsentArtifactSchema
   */
  public static ConsentArtifactSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentArtifactSchema.class);
  }

  /**
   * Convert an instance of ConsentArtifactSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

