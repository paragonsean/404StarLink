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
 * Justification provides the justification when the state of the assessment if NOT_AFFECTED.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:05.225194-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Justification {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  /**
   * The justification type for this vulnerability.
   */
  @JsonAdapter(JustificationTypeEnum.Adapter.class)
  public enum JustificationTypeEnum {
    JUSTIFICATION_TYPE_UNSPECIFIED("JUSTIFICATION_TYPE_UNSPECIFIED"),
    
    COMPONENT_NOT_PRESENT("COMPONENT_NOT_PRESENT"),
    
    VULNERABLE_CODE_NOT_PRESENT("VULNERABLE_CODE_NOT_PRESENT"),
    
    VULNERABLE_CODE_NOT_IN_EXECUTE_PATH("VULNERABLE_CODE_NOT_IN_EXECUTE_PATH"),
    
    VULNERABLE_CODE_CANNOT_BE_CONTROLLED_BY_ADVERSARY("VULNERABLE_CODE_CANNOT_BE_CONTROLLED_BY_ADVERSARY"),
    
    INLINE_MITIGATIONS_ALREADY_EXIST("INLINE_MITIGATIONS_ALREADY_EXIST");

    private String value;

    JustificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JustificationTypeEnum fromValue(String value) {
      for (JustificationTypeEnum b : JustificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JustificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JustificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JustificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JustificationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      JustificationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_JUSTIFICATION_TYPE = "justificationType";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATION_TYPE)
  private JustificationTypeEnum justificationType;

  public Justification() {
  }

  public Justification details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Additional details on why this justification was chosen.
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public Justification justificationType(JustificationTypeEnum justificationType) {
    this.justificationType = justificationType;
    return this;
  }

  /**
   * The justification type for this vulnerability.
   * @return justificationType
   */
  @javax.annotation.Nullable
  public JustificationTypeEnum getJustificationType() {
    return justificationType;
  }

  public void setJustificationType(JustificationTypeEnum justificationType) {
    this.justificationType = justificationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Justification justification = (Justification) o;
    return Objects.equals(this.details, justification.details) &&
        Objects.equals(this.justificationType, justification.justificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, justificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Justification {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    justificationType: ").append(toIndentedString(justificationType)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("justificationType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Justification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Justification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Justification is not found in the empty JSON string", Justification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Justification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Justification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("justificationType") != null && !jsonObj.get("justificationType").isJsonNull()) && !jsonObj.get("justificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justificationType").toString()));
      }
      // validate the optional field `justificationType`
      if (jsonObj.get("justificationType") != null && !jsonObj.get("justificationType").isJsonNull()) {
        JustificationTypeEnum.validateJsonElement(jsonObj.get("justificationType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Justification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Justification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Justification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Justification.class));

       return (TypeAdapter<T>) new TypeAdapter<Justification>() {
           @Override
           public void write(JsonWriter out, Justification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Justification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Justification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Justification
   * @throws IOException if the JSON string is invalid with respect to Justification
   */
  public static Justification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Justification.class);
  }

  /**
   * Convert an instance of Justification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

