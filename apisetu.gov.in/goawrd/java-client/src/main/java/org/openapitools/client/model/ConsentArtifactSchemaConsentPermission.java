/*
 * Goa Water Resources Department, Goa
 * Goa WRD (https://goawrd.gov.in/) is the official departmental portal of the Water Resources Department, Govt. of Goa, through which citizens can avail time bound service being offered by the department. Certificates issued by it (e.g. Contractor Enlistment, Well Registration etc) are made available in citizens' DigiLocker accounts.
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
import org.openapitools.client.model.ConsentArtifactSchemaConsentPermissionDateRange;
import org.openapitools.client.model.ConsentArtifactSchemaConsentPermissionFrequency;

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
 * ConsentArtifactSchemaConsentPermission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:40.182694-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConsentArtifactSchemaConsentPermission {
  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private String access;

  public static final String SERIALIZED_NAME_DATE_RANGE = "dateRange";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private ConsentArtifactSchemaConsentPermissionDateRange dateRange;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private ConsentArtifactSchemaConsentPermissionFrequency frequency;

  public ConsentArtifactSchemaConsentPermission() {
  }

  public ConsentArtifactSchemaConsentPermission access(String access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nonnull
  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }


  public ConsentArtifactSchemaConsentPermission dateRange(ConsentArtifactSchemaConsentPermissionDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentPermissionDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(ConsentArtifactSchemaConsentPermissionDateRange dateRange) {
    this.dateRange = dateRange;
  }


  public ConsentArtifactSchemaConsentPermission frequency(ConsentArtifactSchemaConsentPermissionFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentPermissionFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(ConsentArtifactSchemaConsentPermissionFrequency frequency) {
    this.frequency = frequency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentArtifactSchemaConsentPermission consentArtifactSchemaConsentPermission = (ConsentArtifactSchemaConsentPermission) o;
    return Objects.equals(this.access, consentArtifactSchemaConsentPermission.access) &&
        Objects.equals(this.dateRange, consentArtifactSchemaConsentPermission.dateRange) &&
        Objects.equals(this.frequency, consentArtifactSchemaConsentPermission.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, dateRange, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentArtifactSchemaConsentPermission {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("dateRange");
    openapiFields.add("frequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access");
    openapiRequiredFields.add("dateRange");
    openapiRequiredFields.add("frequency");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsentArtifactSchemaConsentPermission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsentArtifactSchemaConsentPermission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentArtifactSchemaConsentPermission is not found in the empty JSON string", ConsentArtifactSchemaConsentPermission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsentArtifactSchemaConsentPermission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentArtifactSchemaConsentPermission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentArtifactSchemaConsentPermission.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      // validate the required field `dateRange`
      ConsentArtifactSchemaConsentPermissionDateRange.validateJsonElement(jsonObj.get("dateRange"));
      // validate the required field `frequency`
      ConsentArtifactSchemaConsentPermissionFrequency.validateJsonElement(jsonObj.get("frequency"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentArtifactSchemaConsentPermission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentArtifactSchemaConsentPermission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentArtifactSchemaConsentPermission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentArtifactSchemaConsentPermission.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentArtifactSchemaConsentPermission>() {
           @Override
           public void write(JsonWriter out, ConsentArtifactSchemaConsentPermission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentArtifactSchemaConsentPermission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsentArtifactSchemaConsentPermission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsentArtifactSchemaConsentPermission
   * @throws IOException if the JSON string is invalid with respect to ConsentArtifactSchemaConsentPermission
   */
  public static ConsentArtifactSchemaConsentPermission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentArtifactSchemaConsentPermission.class);
  }

  /**
   * Convert an instance of ConsentArtifactSchemaConsentPermission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

