/*
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
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
import org.openapitools.client.model.ListEsimProfileResponseMeta;
import org.openapitools.client.model.SupersimV1Sim;

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
 * ListSimResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:41.776543-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListSimResponse {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListEsimProfileResponseMeta meta;

  public static final String SERIALIZED_NAME_SIMS = "sims";
  @SerializedName(SERIALIZED_NAME_SIMS)
  private List<SupersimV1Sim> sims = new ArrayList<>();

  public ListSimResponse() {
  }

  public ListSimResponse meta(ListEsimProfileResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public ListEsimProfileResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListEsimProfileResponseMeta meta) {
    this.meta = meta;
  }


  public ListSimResponse sims(List<SupersimV1Sim> sims) {
    this.sims = sims;
    return this;
  }

  public ListSimResponse addSimsItem(SupersimV1Sim simsItem) {
    if (this.sims == null) {
      this.sims = new ArrayList<>();
    }
    this.sims.add(simsItem);
    return this;
  }

  /**
   * Get sims
   * @return sims
   */
  @javax.annotation.Nullable
  public List<SupersimV1Sim> getSims() {
    return sims;
  }

  public void setSims(List<SupersimV1Sim> sims) {
    this.sims = sims;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSimResponse listSimResponse = (ListSimResponse) o;
    return Objects.equals(this.meta, listSimResponse.meta) &&
        Objects.equals(this.sims, listSimResponse.sims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, sims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSimResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    sims: ").append(toIndentedString(sims)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("sims");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListSimResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListSimResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListSimResponse is not found in the empty JSON string", ListSimResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListSimResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListSimResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        ListEsimProfileResponseMeta.validateJsonElement(jsonObj.get("meta"));
      }
      if (jsonObj.get("sims") != null && !jsonObj.get("sims").isJsonNull()) {
        JsonArray jsonArraysims = jsonObj.getAsJsonArray("sims");
        if (jsonArraysims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sims` to be an array in the JSON string but got `%s`", jsonObj.get("sims").toString()));
          }

          // validate the optional field `sims` (array)
          for (int i = 0; i < jsonArraysims.size(); i++) {
            SupersimV1Sim.validateJsonElement(jsonArraysims.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListSimResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListSimResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListSimResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListSimResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListSimResponse>() {
           @Override
           public void write(JsonWriter out, ListSimResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListSimResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListSimResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListSimResponse
   * @throws IOException if the JSON string is invalid with respect to ListSimResponse
   */
  public static ListSimResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSimResponse.class);
  }

  /**
   * Convert an instance of ListSimResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

