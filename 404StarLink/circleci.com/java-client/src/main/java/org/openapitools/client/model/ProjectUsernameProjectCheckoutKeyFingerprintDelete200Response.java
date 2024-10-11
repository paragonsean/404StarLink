/*
 * CircleCI REST API
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * The version of the OpenAPI document: v1
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
 * ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:32.315150-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response {
  /**
   * Gets or Sets message
   */
  @JsonAdapter(MessageEnum.Adapter.class)
  public enum MessageEnum {
    OK("OK");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageEnum fromValue(String value) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MessageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private MessageEnum message;

  public ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response() {
  }

  public ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response message(MessageEnum message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public MessageEnum getMessage() {
    return message;
  }

  public void setMessage(MessageEnum message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response projectUsernameProjectCheckoutKeyFingerprintDelete200Response = (ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response) o;
    return Objects.equals(this.message, projectUsernameProjectCheckoutKeyFingerprintDelete200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response is not found in the empty JSON string", ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `message`
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) {
        MessageEnum.validateJsonElement(jsonObj.get("message"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response>() {
           @Override
           public void write(JsonWriter out, ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response
   * @throws IOException if the JSON string is invalid with respect to ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response
   */
  public static ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response.class);
  }

  /**
   * Convert an instance of ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

