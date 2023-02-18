/*
 * Open States API v3
 *  * [More documentation](https://docs.openstates.org/en/latest/api/v3/index.html) * [Register for an account](https://openstates.org/accounts/signup/)   **We are currently working to restore experimental support for committees & events.**  During this period please note that data is not yet available for all states and the exact format of the new endpoints may change slightly depending on user feedback.  If you have any issues or questions use our [GitHub Issues](https://github.com/openstates/issues/issues) to give feedback. 
 *
 * The version of the OpenAPI document: 2021.11.12
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
 * Office
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:10.400115-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Office {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private String voice;

  public Office() {
  }

  public Office address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Office classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
   */
  @javax.annotation.Nullable
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }


  public Office fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
   */
  @javax.annotation.Nullable
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public Office name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Office voice(String voice) {
    this.voice = voice;
    return this;
  }

  /**
   * Get voice
   * @return voice
   */
  @javax.annotation.Nullable
  public String getVoice() {
    return voice;
  }

  public void setVoice(String voice) {
    this.voice = voice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Office office = (Office) o;
    return Objects.equals(this.address, office.address) &&
        Objects.equals(this.classification, office.classification) &&
        Objects.equals(this.fax, office.fax) &&
        Objects.equals(this.name, office.name) &&
        Objects.equals(this.voice, office.voice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, classification, fax, name, voice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Office {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("classification");
    openapiFields.add("fax");
    openapiFields.add("name");
    openapiFields.add("voice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Office
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Office.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Office is not found in the empty JSON string", Office.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Office.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Office` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Office.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) && !jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      if ((jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("voice") != null && !jsonObj.get("voice").isJsonNull()) && !jsonObj.get("voice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Office.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Office' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Office> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Office.class));

       return (TypeAdapter<T>) new TypeAdapter<Office>() {
           @Override
           public void write(JsonWriter out, Office value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Office read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Office given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Office
   * @throws IOException if the JSON string is invalid with respect to Office
   */
  public static Office fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Office.class);
  }

  /**
   * Convert an instance of Office to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

