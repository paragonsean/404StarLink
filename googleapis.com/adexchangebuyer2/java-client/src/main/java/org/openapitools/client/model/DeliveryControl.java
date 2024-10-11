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
import org.openapitools.client.model.FrequencyCap;

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
 * Message contains details about how the deals will be paced.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeliveryControl {
  /**
   * Output only. Specified the creative blocking levels to be applied.
   */
  @JsonAdapter(CreativeBlockingLevelEnum.Adapter.class)
  public enum CreativeBlockingLevelEnum {
    CREATIVE_BLOCKING_LEVEL_UNSPECIFIED("CREATIVE_BLOCKING_LEVEL_UNSPECIFIED"),
    
    PUBLISHER_BLOCKING_RULES("PUBLISHER_BLOCKING_RULES"),
    
    ADX_POLICY_BLOCKING_ONLY("ADX_POLICY_BLOCKING_ONLY");

    private String value;

    CreativeBlockingLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreativeBlockingLevelEnum fromValue(String value) {
      for (CreativeBlockingLevelEnum b : CreativeBlockingLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CreativeBlockingLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreativeBlockingLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreativeBlockingLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreativeBlockingLevelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CreativeBlockingLevelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CREATIVE_BLOCKING_LEVEL = "creativeBlockingLevel";
  @SerializedName(SERIALIZED_NAME_CREATIVE_BLOCKING_LEVEL)
  private CreativeBlockingLevelEnum creativeBlockingLevel;

  /**
   * Output only. Specifies how the impression delivery will be paced.
   */
  @JsonAdapter(DeliveryRateTypeEnum.Adapter.class)
  public enum DeliveryRateTypeEnum {
    DELIVERY_RATE_TYPE_UNSPECIFIED("DELIVERY_RATE_TYPE_UNSPECIFIED"),
    
    EVENLY("EVENLY"),
    
    FRONT_LOADED("FRONT_LOADED"),
    
    AS_FAST_AS_POSSIBLE("AS_FAST_AS_POSSIBLE");

    private String value;

    DeliveryRateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryRateTypeEnum fromValue(String value) {
      for (DeliveryRateTypeEnum b : DeliveryRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryRateTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DeliveryRateTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_RATE_TYPE = "deliveryRateType";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RATE_TYPE)
  private DeliveryRateTypeEnum deliveryRateType;

  public static final String SERIALIZED_NAME_FREQUENCY_CAPS = "frequencyCaps";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_CAPS)
  private List<FrequencyCap> frequencyCaps = new ArrayList<>();

  public DeliveryControl() {
  }

  public DeliveryControl(
     CreativeBlockingLevelEnum creativeBlockingLevel, 
     DeliveryRateTypeEnum deliveryRateType, 
     List<FrequencyCap> frequencyCaps
  ) {
    this();
    this.creativeBlockingLevel = creativeBlockingLevel;
    this.deliveryRateType = deliveryRateType;
    this.frequencyCaps = frequencyCaps;
  }

  /**
   * Output only. Specified the creative blocking levels to be applied.
   * @return creativeBlockingLevel
   */
  @javax.annotation.Nullable
  public CreativeBlockingLevelEnum getCreativeBlockingLevel() {
    return creativeBlockingLevel;
  }



  /**
   * Output only. Specifies how the impression delivery will be paced.
   * @return deliveryRateType
   */
  @javax.annotation.Nullable
  public DeliveryRateTypeEnum getDeliveryRateType() {
    return deliveryRateType;
  }



  /**
   * Output only. Specifies any frequency caps.
   * @return frequencyCaps
   */
  @javax.annotation.Nullable
  public List<FrequencyCap> getFrequencyCaps() {
    return frequencyCaps;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryControl deliveryControl = (DeliveryControl) o;
    return Objects.equals(this.creativeBlockingLevel, deliveryControl.creativeBlockingLevel) &&
        Objects.equals(this.deliveryRateType, deliveryControl.deliveryRateType) &&
        Objects.equals(this.frequencyCaps, deliveryControl.frequencyCaps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeBlockingLevel, deliveryRateType, frequencyCaps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryControl {\n");
    sb.append("    creativeBlockingLevel: ").append(toIndentedString(creativeBlockingLevel)).append("\n");
    sb.append("    deliveryRateType: ").append(toIndentedString(deliveryRateType)).append("\n");
    sb.append("    frequencyCaps: ").append(toIndentedString(frequencyCaps)).append("\n");
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
    openapiFields.add("creativeBlockingLevel");
    openapiFields.add("deliveryRateType");
    openapiFields.add("frequencyCaps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeliveryControl
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeliveryControl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryControl is not found in the empty JSON string", DeliveryControl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeliveryControl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryControl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("creativeBlockingLevel") != null && !jsonObj.get("creativeBlockingLevel").isJsonNull()) && !jsonObj.get("creativeBlockingLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeBlockingLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeBlockingLevel").toString()));
      }
      // validate the optional field `creativeBlockingLevel`
      if (jsonObj.get("creativeBlockingLevel") != null && !jsonObj.get("creativeBlockingLevel").isJsonNull()) {
        CreativeBlockingLevelEnum.validateJsonElement(jsonObj.get("creativeBlockingLevel"));
      }
      if ((jsonObj.get("deliveryRateType") != null && !jsonObj.get("deliveryRateType").isJsonNull()) && !jsonObj.get("deliveryRateType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryRateType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryRateType").toString()));
      }
      // validate the optional field `deliveryRateType`
      if (jsonObj.get("deliveryRateType") != null && !jsonObj.get("deliveryRateType").isJsonNull()) {
        DeliveryRateTypeEnum.validateJsonElement(jsonObj.get("deliveryRateType"));
      }
      if (jsonObj.get("frequencyCaps") != null && !jsonObj.get("frequencyCaps").isJsonNull()) {
        JsonArray jsonArrayfrequencyCaps = jsonObj.getAsJsonArray("frequencyCaps");
        if (jsonArrayfrequencyCaps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("frequencyCaps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `frequencyCaps` to be an array in the JSON string but got `%s`", jsonObj.get("frequencyCaps").toString()));
          }

          // validate the optional field `frequencyCaps` (array)
          for (int i = 0; i < jsonArrayfrequencyCaps.size(); i++) {
            FrequencyCap.validateJsonElement(jsonArrayfrequencyCaps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryControl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryControl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryControl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryControl.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryControl>() {
           @Override
           public void write(JsonWriter out, DeliveryControl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryControl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeliveryControl given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeliveryControl
   * @throws IOException if the JSON string is invalid with respect to DeliveryControl
   */
  public static DeliveryControl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryControl.class);
  }

  /**
   * Convert an instance of DeliveryControl to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

