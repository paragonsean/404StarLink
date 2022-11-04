/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
 * Contact: mike.ralphson@gmail.com
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
 * GetRevisionResponseProof
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:48.114688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRevisionResponseProof {
  public static final String SERIALIZED_NAME_ION_TEXT = "IonText";
  @SerializedName(SERIALIZED_NAME_ION_TEXT)
  private String ionText;

  public GetRevisionResponseProof() {
  }

  public GetRevisionResponseProof ionText(String ionText) {
    this.ionText = ionText;
    return this;
  }

  /**
   * Get ionText
   * @return ionText
   */
  @javax.annotation.Nullable
  public String getIonText() {
    return ionText;
  }

  public void setIonText(String ionText) {
    this.ionText = ionText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRevisionResponseProof getRevisionResponseProof = (GetRevisionResponseProof) o;
    return Objects.equals(this.ionText, getRevisionResponseProof.ionText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ionText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRevisionResponseProof {\n");
    sb.append("    ionText: ").append(toIndentedString(ionText)).append("\n");
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
    openapiFields.add("IonText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRevisionResponseProof
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRevisionResponseProof.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRevisionResponseProof is not found in the empty JSON string", GetRevisionResponseProof.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRevisionResponseProof.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRevisionResponseProof` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IonText`
      if (jsonObj.get("IonText") != null && !jsonObj.get("IonText").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IonText"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRevisionResponseProof.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRevisionResponseProof' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRevisionResponseProof> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRevisionResponseProof.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRevisionResponseProof>() {
           @Override
           public void write(JsonWriter out, GetRevisionResponseProof value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRevisionResponseProof read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRevisionResponseProof given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRevisionResponseProof
   * @throws IOException if the JSON string is invalid with respect to GetRevisionResponseProof
   */
  public static GetRevisionResponseProof fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRevisionResponseProof.class);
  }

  /**
   * Convert an instance of GetRevisionResponseProof to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

