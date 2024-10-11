/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
 * ApiCoreDtoAccountingExtendedGrants
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:52.389256-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoAccountingExtendedGrants {
  public static final String SERIALIZED_NAME_ALLOW_ALL_GRANTS = "allowAllGrants";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_GRANTS)
  private Boolean allowAllGrants;

  public static final String SERIALIZED_NAME_ALLOW_GROUP_CREATION = "allowGroupCreation";
  @SerializedName(SERIALIZED_NAME_ALLOW_GROUP_CREATION)
  private Boolean allowGroupCreation;

  public ApiCoreDtoAccountingExtendedGrants() {
  }

  public ApiCoreDtoAccountingExtendedGrants allowAllGrants(Boolean allowAllGrants) {
    this.allowAllGrants = allowAllGrants;
    return this;
  }

  /**
   * Get allowAllGrants
   * @return allowAllGrants
   */
  @javax.annotation.Nullable
  public Boolean getAllowAllGrants() {
    return allowAllGrants;
  }

  public void setAllowAllGrants(Boolean allowAllGrants) {
    this.allowAllGrants = allowAllGrants;
  }


  public ApiCoreDtoAccountingExtendedGrants allowGroupCreation(Boolean allowGroupCreation) {
    this.allowGroupCreation = allowGroupCreation;
    return this;
  }

  /**
   * Get allowGroupCreation
   * @return allowGroupCreation
   */
  @javax.annotation.Nullable
  public Boolean getAllowGroupCreation() {
    return allowGroupCreation;
  }

  public void setAllowGroupCreation(Boolean allowGroupCreation) {
    this.allowGroupCreation = allowGroupCreation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoAccountingExtendedGrants apiCoreDtoAccountingExtendedGrants = (ApiCoreDtoAccountingExtendedGrants) o;
    return Objects.equals(this.allowAllGrants, apiCoreDtoAccountingExtendedGrants.allowAllGrants) &&
        Objects.equals(this.allowGroupCreation, apiCoreDtoAccountingExtendedGrants.allowGroupCreation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAllGrants, allowGroupCreation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoAccountingExtendedGrants {\n");
    sb.append("    allowAllGrants: ").append(toIndentedString(allowAllGrants)).append("\n");
    sb.append("    allowGroupCreation: ").append(toIndentedString(allowGroupCreation)).append("\n");
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
    openapiFields.add("allowAllGrants");
    openapiFields.add("allowGroupCreation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoAccountingExtendedGrants
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoAccountingExtendedGrants.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoAccountingExtendedGrants is not found in the empty JSON string", ApiCoreDtoAccountingExtendedGrants.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoAccountingExtendedGrants.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoAccountingExtendedGrants` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoAccountingExtendedGrants.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoAccountingExtendedGrants' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoAccountingExtendedGrants> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoAccountingExtendedGrants.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoAccountingExtendedGrants>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoAccountingExtendedGrants value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoAccountingExtendedGrants read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoAccountingExtendedGrants given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoAccountingExtendedGrants
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoAccountingExtendedGrants
   */
  public static ApiCoreDtoAccountingExtendedGrants fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoAccountingExtendedGrants.class);
  }

  /**
   * Convert an instance of ApiCoreDtoAccountingExtendedGrants to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

