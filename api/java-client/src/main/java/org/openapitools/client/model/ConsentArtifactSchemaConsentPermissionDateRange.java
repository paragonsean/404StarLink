/*
 * Karnataka Secondary Education Examination Board, Karnataka
 * Karnataka Secondary Education Examination Board (http://kseeb.kar.nic.in) is providing passing certificates of  SSLC(10th Std) of April and June-2018 Examinations.
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
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * ConsentArtifactSchemaConsentPermissionDateRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:01.791540-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConsentArtifactSchemaConsentPermissionDateRange {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private OffsetDateTime from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private OffsetDateTime to;

  public ConsentArtifactSchemaConsentPermissionDateRange() {
  }

  public ConsentArtifactSchemaConsentPermissionDateRange from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ
   * @return from
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }


  public ConsentArtifactSchemaConsentPermissionDateRange to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ
   * @return to
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentArtifactSchemaConsentPermissionDateRange consentArtifactSchemaConsentPermissionDateRange = (ConsentArtifactSchemaConsentPermissionDateRange) o;
    return Objects.equals(this.from, consentArtifactSchemaConsentPermissionDateRange.from) &&
        Objects.equals(this.to, consentArtifactSchemaConsentPermissionDateRange.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentArtifactSchemaConsentPermissionDateRange {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsentArtifactSchemaConsentPermissionDateRange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsentArtifactSchemaConsentPermissionDateRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentArtifactSchemaConsentPermissionDateRange is not found in the empty JSON string", ConsentArtifactSchemaConsentPermissionDateRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsentArtifactSchemaConsentPermissionDateRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentArtifactSchemaConsentPermissionDateRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentArtifactSchemaConsentPermissionDateRange.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentArtifactSchemaConsentPermissionDateRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentArtifactSchemaConsentPermissionDateRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentArtifactSchemaConsentPermissionDateRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentArtifactSchemaConsentPermissionDateRange.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentArtifactSchemaConsentPermissionDateRange>() {
           @Override
           public void write(JsonWriter out, ConsentArtifactSchemaConsentPermissionDateRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentArtifactSchemaConsentPermissionDateRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsentArtifactSchemaConsentPermissionDateRange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsentArtifactSchemaConsentPermissionDateRange
   * @throws IOException if the JSON string is invalid with respect to ConsentArtifactSchemaConsentPermissionDateRange
   */
  public static ConsentArtifactSchemaConsentPermissionDateRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentArtifactSchemaConsentPermissionDateRange.class);
  }

  /**
   * Convert an instance of ConsentArtifactSchemaConsentPermissionDateRange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

