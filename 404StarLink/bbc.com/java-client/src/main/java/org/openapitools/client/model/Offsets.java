/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OffsetIn;

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
 * Offsets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Offsets {
  public static final String SERIALIZED_NAME_OFFSET_IN = "offset_in";
  @SerializedName(SERIALIZED_NAME_OFFSET_IN)
  private List<OffsetIn> offsetIn = new ArrayList<>();

  public Offsets() {
  }

  public Offsets offsetIn(List<OffsetIn> offsetIn) {
    this.offsetIn = offsetIn;
    return this;
  }

  public Offsets addOffsetInItem(OffsetIn offsetInItem) {
    if (this.offsetIn == null) {
      this.offsetIn = new ArrayList<>();
    }
    this.offsetIn.add(offsetInItem);
    return this;
  }

  /**
   * Get offsetIn
   * @return offsetIn
   */
  @javax.annotation.Nullable
  public List<OffsetIn> getOffsetIn() {
    return offsetIn;
  }

  public void setOffsetIn(List<OffsetIn> offsetIn) {
    this.offsetIn = offsetIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offsets offsets = (Offsets) o;
    return Objects.equals(this.offsetIn, offsets.offsetIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offsets {\n");
    sb.append("    offsetIn: ").append(toIndentedString(offsetIn)).append("\n");
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
    openapiFields.add("offset_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Offsets
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Offsets.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Offsets is not found in the empty JSON string", Offsets.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Offsets.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Offsets` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("offset_in") != null && !jsonObj.get("offset_in").isJsonNull()) {
        JsonArray jsonArrayoffsetIn = jsonObj.getAsJsonArray("offset_in");
        if (jsonArrayoffsetIn != null) {
          // ensure the json data is an array
          if (!jsonObj.get("offset_in").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `offset_in` to be an array in the JSON string but got `%s`", jsonObj.get("offset_in").toString()));
          }

          // validate the optional field `offset_in` (array)
          for (int i = 0; i < jsonArrayoffsetIn.size(); i++) {
            OffsetIn.validateJsonElement(jsonArrayoffsetIn.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Offsets.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Offsets' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Offsets> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Offsets.class));

       return (TypeAdapter<T>) new TypeAdapter<Offsets>() {
           @Override
           public void write(JsonWriter out, Offsets value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Offsets read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Offsets given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Offsets
   * @throws IOException if the JSON string is invalid with respect to Offsets
   */
  public static Offsets fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Offsets.class);
  }

  /**
   * Convert an instance of Offsets to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

