/*
 * Ad Exchange Buyer API II
 * Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
 *
 * The version of the OpenAPI document: v2beta1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ServingContext;

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
 * Output only. Shows any corrections that were applied to this creative.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Correction {
  public static final String SERIALIZED_NAME_CONTEXTS = "contexts";
  @SerializedName(SERIALIZED_NAME_CONTEXTS)
  private List<ServingContext> contexts = new ArrayList<>();

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<String> details = new ArrayList<>();

  /**
   * The type of correction that was applied to the creative.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CORRECTION_TYPE_UNSPECIFIED("CORRECTION_TYPE_UNSPECIFIED"),
    
    VENDOR_IDS_ADDED("VENDOR_IDS_ADDED"),
    
    SSL_ATTRIBUTE_REMOVED("SSL_ATTRIBUTE_REMOVED"),
    
    FLASH_FREE_ATTRIBUTE_REMOVED("FLASH_FREE_ATTRIBUTE_REMOVED"),
    
    FLASH_FREE_ATTRIBUTE_ADDED("FLASH_FREE_ATTRIBUTE_ADDED"),
    
    REQUIRED_ATTRIBUTE_ADDED("REQUIRED_ATTRIBUTE_ADDED"),
    
    REQUIRED_VENDOR_ADDED("REQUIRED_VENDOR_ADDED"),
    
    SSL_ATTRIBUTE_ADDED("SSL_ATTRIBUTE_ADDED"),
    
    IN_BANNER_VIDEO_ATTRIBUTE_ADDED("IN_BANNER_VIDEO_ATTRIBUTE_ADDED"),
    
    MRAID_ATTRIBUTE_ADDED("MRAID_ATTRIBUTE_ADDED"),
    
    FLASH_ATTRIBUTE_REMOVED("FLASH_ATTRIBUTE_REMOVED"),
    
    VIDEO_IN_SNIPPET_ATTRIBUTE_ADDED("VIDEO_IN_SNIPPET_ATTRIBUTE_ADDED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public Correction() {
  }

  public Correction contexts(List<ServingContext> contexts) {
    this.contexts = contexts;
    return this;
  }

  public Correction addContextsItem(ServingContext contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

  /**
   * The contexts for the correction.
   * @return contexts
   */
  @javax.annotation.Nullable
  public List<ServingContext> getContexts() {
    return contexts;
  }

  public void setContexts(List<ServingContext> contexts) {
    this.contexts = contexts;
  }


  public Correction details(List<String> details) {
    this.details = details;
    return this;
  }

  public Correction addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Additional details about what was corrected.
   * @return details
   */
  @javax.annotation.Nullable
  public List<String> getDetails() {
    return details;
  }

  public void setDetails(List<String> details) {
    this.details = details;
  }


  public Correction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of correction that was applied to the creative.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correction correction = (Correction) o;
    return Objects.equals(this.contexts, correction.contexts) &&
        Objects.equals(this.details, correction.details) &&
        Objects.equals(this.type, correction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts, details, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correction {\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("contexts");
    openapiFields.add("details");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Correction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Correction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Correction is not found in the empty JSON string", Correction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Correction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Correction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("contexts") != null && !jsonObj.get("contexts").isJsonNull()) {
        JsonArray jsonArraycontexts = jsonObj.getAsJsonArray("contexts");
        if (jsonArraycontexts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contexts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contexts` to be an array in the JSON string but got `%s`", jsonObj.get("contexts").toString()));
          }

          // validate the optional field `contexts` (array)
          for (int i = 0; i < jsonArraycontexts.size(); i++) {
            ServingContext.validateJsonElement(jsonArraycontexts.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull() && !jsonObj.get("details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Correction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Correction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Correction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Correction.class));

       return (TypeAdapter<T>) new TypeAdapter<Correction>() {
           @Override
           public void write(JsonWriter out, Correction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Correction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Correction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Correction
   * @throws IOException if the JSON string is invalid with respect to Correction
   */
  public static Correction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Correction.class);
  }

  /**
   * Convert an instance of Correction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

