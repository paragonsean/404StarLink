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
 * Otcer504Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:42.390260-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Otcer504Response {
  /**
   * Gets or Sets error
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
  public enum ErrorEnum {
    GATEWAY_TIMEOUT("gateway_timeout");

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
    PUBLISHER_SERVICE_DID_NOT_RESPOND_IN_TIME("Publisher service did not respond in time");

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

  public Otcer504Response() {
  }

  public Otcer504Response error(ErrorEnum error) {
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


  public Otcer504Response errorDescription(ErrorDescriptionEnum errorDescription) {
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
    Otcer504Response otcer504Response = (Otcer504Response) o;
    return Objects.equals(this.error, otcer504Response.error) &&
        Objects.equals(this.errorDescription, otcer504Response.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Otcer504Response {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Otcer504Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Otcer504Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Otcer504Response is not found in the empty JSON string", Otcer504Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Otcer504Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Otcer504Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!Otcer504Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Otcer504Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Otcer504Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Otcer504Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Otcer504Response>() {
           @Override
           public void write(JsonWriter out, Otcer504Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Otcer504Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Otcer504Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Otcer504Response
   * @throws IOException if the JSON string is invalid with respect to Otcer504Response
   */
  public static Otcer504Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Otcer504Response.class);
  }

  /**
   * Convert an instance of Otcer504Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

