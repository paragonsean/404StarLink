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
import org.openapitools.client.model.TargetingValue;

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
 * Advertisers can target different attributes of an ad slot. For example, they can choose to show ads only if the user is in the U.S. Such targeting criteria can be specified as part of Shared Targeting.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TargetingCriteria {
  public static final String SERIALIZED_NAME_EXCLUSIONS = "exclusions";
  @SerializedName(SERIALIZED_NAME_EXCLUSIONS)
  private List<TargetingValue> exclusions = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUSIONS = "inclusions";
  @SerializedName(SERIALIZED_NAME_INCLUSIONS)
  private List<TargetingValue> inclusions = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public TargetingCriteria() {
  }

  public TargetingCriteria exclusions(List<TargetingValue> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public TargetingCriteria addExclusionsItem(TargetingValue exclusionsItem) {
    if (this.exclusions == null) {
      this.exclusions = new ArrayList<>();
    }
    this.exclusions.add(exclusionsItem);
    return this;
  }

  /**
   * The list of values to exclude from targeting. Each value is AND&#39;d together.
   * @return exclusions
   */
  @javax.annotation.Nullable
  public List<TargetingValue> getExclusions() {
    return exclusions;
  }

  public void setExclusions(List<TargetingValue> exclusions) {
    this.exclusions = exclusions;
  }


  public TargetingCriteria inclusions(List<TargetingValue> inclusions) {
    this.inclusions = inclusions;
    return this;
  }

  public TargetingCriteria addInclusionsItem(TargetingValue inclusionsItem) {
    if (this.inclusions == null) {
      this.inclusions = new ArrayList<>();
    }
    this.inclusions.add(inclusionsItem);
    return this;
  }

  /**
   * The list of value to include as part of the targeting. Each value is OR&#39;d together.
   * @return inclusions
   */
  @javax.annotation.Nullable
  public List<TargetingValue> getInclusions() {
    return inclusions;
  }

  public void setInclusions(List<TargetingValue> inclusions) {
    this.inclusions = inclusions;
  }


  public TargetingCriteria key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key representing the shared targeting criterion. Targeting criteria defined by Google ad servers will begin with GOOG_. Third parties may define their own keys. A list of permissible keys along with the acceptable values will be provided as part of the external documentation.
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingCriteria targetingCriteria = (TargetingCriteria) o;
    return Objects.equals(this.exclusions, targetingCriteria.exclusions) &&
        Objects.equals(this.inclusions, targetingCriteria.inclusions) &&
        Objects.equals(this.key, targetingCriteria.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusions, inclusions, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingCriteria {\n");
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    inclusions: ").append(toIndentedString(inclusions)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("exclusions");
    openapiFields.add("inclusions");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetingCriteria
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetingCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetingCriteria is not found in the empty JSON string", TargetingCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetingCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetingCriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("exclusions") != null && !jsonObj.get("exclusions").isJsonNull()) {
        JsonArray jsonArrayexclusions = jsonObj.getAsJsonArray("exclusions");
        if (jsonArrayexclusions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exclusions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exclusions` to be an array in the JSON string but got `%s`", jsonObj.get("exclusions").toString()));
          }

          // validate the optional field `exclusions` (array)
          for (int i = 0; i < jsonArrayexclusions.size(); i++) {
            TargetingValue.validateJsonElement(jsonArrayexclusions.get(i));
          };
        }
      }
      if (jsonObj.get("inclusions") != null && !jsonObj.get("inclusions").isJsonNull()) {
        JsonArray jsonArrayinclusions = jsonObj.getAsJsonArray("inclusions");
        if (jsonArrayinclusions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inclusions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inclusions` to be an array in the JSON string but got `%s`", jsonObj.get("inclusions").toString()));
          }

          // validate the optional field `inclusions` (array)
          for (int i = 0; i < jsonArrayinclusions.size(); i++) {
            TargetingValue.validateJsonElement(jsonArrayinclusions.get(i));
          };
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetingCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetingCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetingCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetingCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetingCriteria>() {
           @Override
           public void write(JsonWriter out, TargetingCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetingCriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetingCriteria given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetingCriteria
   * @throws IOException if the JSON string is invalid with respect to TargetingCriteria
   */
  public static TargetingCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetingCriteria.class);
  }

  /**
   * Convert an instance of TargetingCriteria to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

