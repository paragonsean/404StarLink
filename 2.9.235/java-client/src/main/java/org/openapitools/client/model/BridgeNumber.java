/*
 * REST API Version 2
 * Circuit REST API to interact with the Circuit system.  [Learn more about the Circuit Development Community](https://www.circuit.com/web/developers/home)
 *
 * The version of the OpenAPI document: 2.9.235
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
 * BridgeNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:55.210987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BridgeNumber {
  public static final String SERIALIZED_NAME_BRIDGE_NUMBER = "bridgeNumber";
  @SerializedName(SERIALIZED_NAME_BRIDGE_NUMBER)
  private String bridgeNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_IS_MOST_USED = "isMostUsed";
  @SerializedName(SERIALIZED_NAME_IS_MOST_USED)
  private Boolean isMostUsed;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BridgeNumber() {
  }

  public BridgeNumber bridgeNumber(String bridgeNumber) {
    this.bridgeNumber = bridgeNumber;
    return this;
  }

  /**
   * The number that has to be called to join the real time session of a conversation
   * @return bridgeNumber
   */
  @javax.annotation.Nullable
  public String getBridgeNumber() {
    return bridgeNumber;
  }

  public void setBridgeNumber(String bridgeNumber) {
    this.bridgeNumber = bridgeNumber;
  }


  public BridgeNumber country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country where the bridge is hosted
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public BridgeNumber isMostUsed(Boolean isMostUsed) {
    this.isMostUsed = isMostUsed;
    return this;
  }

  /**
   * Is most used
   * @return isMostUsed
   */
  @javax.annotation.Nullable
  public Boolean getIsMostUsed() {
    return isMostUsed;
  }

  public void setIsMostUsed(Boolean isMostUsed) {
    this.isMostUsed = isMostUsed;
  }


  public BridgeNumber locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale of the bridge
   * @return locale
   */
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public BridgeNumber name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name / identifier of the bridge
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public BridgeNumber type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Information of the billing for the call, i.e. if the caller has to pay or not for the call
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    BridgeNumber bridgeNumber = (BridgeNumber) o;
    return Objects.equals(this.bridgeNumber, bridgeNumber.bridgeNumber) &&
        Objects.equals(this.country, bridgeNumber.country) &&
        Objects.equals(this.isMostUsed, bridgeNumber.isMostUsed) &&
        Objects.equals(this.locale, bridgeNumber.locale) &&
        Objects.equals(this.name, bridgeNumber.name) &&
        Objects.equals(this.type, bridgeNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridgeNumber, country, isMostUsed, locale, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeNumber {\n");
    sb.append("    bridgeNumber: ").append(toIndentedString(bridgeNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isMostUsed: ").append(toIndentedString(isMostUsed)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("bridgeNumber");
    openapiFields.add("country");
    openapiFields.add("isMostUsed");
    openapiFields.add("locale");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BridgeNumber
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BridgeNumber.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BridgeNumber is not found in the empty JSON string", BridgeNumber.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BridgeNumber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BridgeNumber` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bridgeNumber") != null && !jsonObj.get("bridgeNumber").isJsonNull()) && !jsonObj.get("bridgeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bridgeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bridgeNumber").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BridgeNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BridgeNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BridgeNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BridgeNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<BridgeNumber>() {
           @Override
           public void write(JsonWriter out, BridgeNumber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BridgeNumber read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BridgeNumber given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BridgeNumber
   * @throws IOException if the JSON string is invalid with respect to BridgeNumber
   */
  public static BridgeNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BridgeNumber.class);
  }

  /**
   * Convert an instance of BridgeNumber to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

