/*
 * Twilio - Trusthub
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
import org.openapitools.client.model.ListCustomerProfileResponseMeta;
import org.openapitools.client.model.TrusthubV1EndUserType;

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
 * ListEndUserTypeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:03.855054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListEndUserTypeResponse {
  public static final String SERIALIZED_NAME_END_USER_TYPES = "end_user_types";
  @SerializedName(SERIALIZED_NAME_END_USER_TYPES)
  private List<TrusthubV1EndUserType> endUserTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListCustomerProfileResponseMeta meta;

  public ListEndUserTypeResponse() {
  }

  public ListEndUserTypeResponse endUserTypes(List<TrusthubV1EndUserType> endUserTypes) {
    this.endUserTypes = endUserTypes;
    return this;
  }

  public ListEndUserTypeResponse addEndUserTypesItem(TrusthubV1EndUserType endUserTypesItem) {
    if (this.endUserTypes == null) {
      this.endUserTypes = new ArrayList<>();
    }
    this.endUserTypes.add(endUserTypesItem);
    return this;
  }

  /**
   * Get endUserTypes
   * @return endUserTypes
   */
  @javax.annotation.Nullable
  public List<TrusthubV1EndUserType> getEndUserTypes() {
    return endUserTypes;
  }

  public void setEndUserTypes(List<TrusthubV1EndUserType> endUserTypes) {
    this.endUserTypes = endUserTypes;
  }


  public ListEndUserTypeResponse meta(ListCustomerProfileResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public ListCustomerProfileResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListCustomerProfileResponseMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEndUserTypeResponse listEndUserTypeResponse = (ListEndUserTypeResponse) o;
    return Objects.equals(this.endUserTypes, listEndUserTypeResponse.endUserTypes) &&
        Objects.equals(this.meta, listEndUserTypeResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserTypes, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEndUserTypeResponse {\n");
    sb.append("    endUserTypes: ").append(toIndentedString(endUserTypes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("end_user_types");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListEndUserTypeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListEndUserTypeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListEndUserTypeResponse is not found in the empty JSON string", ListEndUserTypeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListEndUserTypeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListEndUserTypeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("end_user_types") != null && !jsonObj.get("end_user_types").isJsonNull()) {
        JsonArray jsonArrayendUserTypes = jsonObj.getAsJsonArray("end_user_types");
        if (jsonArrayendUserTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("end_user_types").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `end_user_types` to be an array in the JSON string but got `%s`", jsonObj.get("end_user_types").toString()));
          }

          // validate the optional field `end_user_types` (array)
          for (int i = 0; i < jsonArrayendUserTypes.size(); i++) {
            TrusthubV1EndUserType.validateJsonElement(jsonArrayendUserTypes.get(i));
          };
        }
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        ListCustomerProfileResponseMeta.validateJsonElement(jsonObj.get("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListEndUserTypeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListEndUserTypeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListEndUserTypeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListEndUserTypeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListEndUserTypeResponse>() {
           @Override
           public void write(JsonWriter out, ListEndUserTypeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListEndUserTypeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListEndUserTypeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListEndUserTypeResponse
   * @throws IOException if the JSON string is invalid with respect to ListEndUserTypeResponse
   */
  public static ListEndUserTypeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListEndUserTypeResponse.class);
  }

  /**
   * Convert an instance of ListEndUserTypeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

