/*
 * Maharashtra State Board of Secondary and Higher Secondary Education, Maharashtra
 * Class X and XII marksheets and passing certificates of Maharashtra State Board of Secondary and Higher Secondary Education (https://mahahsscboard.maharashtra.gov.in/) are available in DigiLocker for years 1990 to 2017.
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
 * Hpcer400Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:26.774776-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Hpcer400Response {
  /**
   * Gets or Sets error
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
  public enum ErrorEnum {
    MISSING_PARAMETER("missing_parameter"),
    
    INVALID_PARAMETER("invalid_parameter"),
    
    INVALID_FORMAT("invalid_format"),
    
    INVALID_TXNID("invalid_txnid"),
    
    INVALID_CONSENTID("invalid_consentid");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ErrorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorEnum error;

  /**
   * Gets or Sets errorDescription
   */
  @JsonAdapter(ErrorDescriptionEnum.Adapter.class)
  public enum ErrorDescriptionEnum {
    PLEASE_PROVIDE_ALL_MANDATORY_PARAMETERS("Please provide all mandatory parameters"),
    
    BAD_REQUEST("Bad request"),
    
    THE_FORMAT_PARAMETER_IS_INVALID("The format parameter is invalid"),
    
    THE_TXN_ID_PARAMETER_MUST_BE_IN_UUID_FORMAT("The txnId parameter must be in UUID format"),
    
    THE_CONSENT_ID_PARAMETER_MUST_BE_IN_UUID_FORMAT("The consentId parameter must be in UUID format");

    private String value;

    ErrorDescriptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorDescriptionEnum fromValue(String value) {
      for (ErrorDescriptionEnum b : ErrorDescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorDescriptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorDescriptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorDescriptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorDescriptionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ErrorDescriptionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "errorDescription";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private ErrorDescriptionEnum errorDescription;

  public Hpcer400Response() {
  }

  public Hpcer400Response error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }


  public Hpcer400Response errorDescription(ErrorDescriptionEnum errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
   */
  @javax.annotation.Nullable
  public ErrorDescriptionEnum getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(ErrorDescriptionEnum errorDescription) {
    this.errorDescription = errorDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hpcer400Response hpcer400Response = (Hpcer400Response) o;
    return Objects.equals(this.error, hpcer400Response.error) &&
        Objects.equals(this.errorDescription, hpcer400Response.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hpcer400Response {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("errorDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Hpcer400Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Hpcer400Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Hpcer400Response is not found in the empty JSON string", Hpcer400Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Hpcer400Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Hpcer400Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        ErrorEnum.validateJsonElement(jsonObj.get("error"));
      }
      if ((jsonObj.get("errorDescription") != null && !jsonObj.get("errorDescription").isJsonNull()) && !jsonObj.get("errorDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDescription").toString()));
      }
      // validate the optional field `errorDescription`
      if (jsonObj.get("errorDescription") != null && !jsonObj.get("errorDescription").isJsonNull()) {
        ErrorDescriptionEnum.validateJsonElement(jsonObj.get("errorDescription"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Hpcer400Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Hpcer400Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Hpcer400Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Hpcer400Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Hpcer400Response>() {
           @Override
           public void write(JsonWriter out, Hpcer400Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Hpcer400Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Hpcer400Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Hpcer400Response
   * @throws IOException if the JSON string is invalid with respect to Hpcer400Response
   */
  public static Hpcer400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Hpcer400Response.class);
  }

  /**
   * Convert an instance of Hpcer400Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

