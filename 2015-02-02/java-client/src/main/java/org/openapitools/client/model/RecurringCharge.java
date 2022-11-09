/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
 * Contains the specific price and frequency of a recurring charges for a reserved cache node, or for a reserved cache node offering.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:47.534295-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RecurringCharge {
  public static final String SERIALIZED_NAME_RECURRING_CHARGE_AMOUNT = "RecurringChargeAmount";
  @SerializedName(SERIALIZED_NAME_RECURRING_CHARGE_AMOUNT)
  private Double recurringChargeAmount;

  public static final String SERIALIZED_NAME_RECURRING_CHARGE_FREQUENCY = "RecurringChargeFrequency";
  @SerializedName(SERIALIZED_NAME_RECURRING_CHARGE_FREQUENCY)
  private String recurringChargeFrequency;

  public RecurringCharge() {
  }

  public RecurringCharge recurringChargeAmount(Double recurringChargeAmount) {
    this.recurringChargeAmount = recurringChargeAmount;
    return this;
  }

  /**
   * Get recurringChargeAmount
   * @return recurringChargeAmount
   */
  @javax.annotation.Nullable
  public Double getRecurringChargeAmount() {
    return recurringChargeAmount;
  }

  public void setRecurringChargeAmount(Double recurringChargeAmount) {
    this.recurringChargeAmount = recurringChargeAmount;
  }


  public RecurringCharge recurringChargeFrequency(String recurringChargeFrequency) {
    this.recurringChargeFrequency = recurringChargeFrequency;
    return this;
  }

  /**
   * Get recurringChargeFrequency
   * @return recurringChargeFrequency
   */
  @javax.annotation.Nullable
  public String getRecurringChargeFrequency() {
    return recurringChargeFrequency;
  }

  public void setRecurringChargeFrequency(String recurringChargeFrequency) {
    this.recurringChargeFrequency = recurringChargeFrequency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringCharge recurringCharge = (RecurringCharge) o;
    return Objects.equals(this.recurringChargeAmount, recurringCharge.recurringChargeAmount) &&
        Objects.equals(this.recurringChargeFrequency, recurringCharge.recurringChargeFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringChargeAmount, recurringChargeFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringCharge {\n");
    sb.append("    recurringChargeAmount: ").append(toIndentedString(recurringChargeAmount)).append("\n");
    sb.append("    recurringChargeFrequency: ").append(toIndentedString(recurringChargeFrequency)).append("\n");
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
    openapiFields.add("RecurringChargeAmount");
    openapiFields.add("RecurringChargeFrequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecurringCharge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecurringCharge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringCharge is not found in the empty JSON string", RecurringCharge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecurringCharge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecurringCharge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `RecurringChargeAmount`
      if (jsonObj.get("RecurringChargeAmount") != null && !jsonObj.get("RecurringChargeAmount").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("RecurringChargeAmount"));
      }
      // validate the optional field `RecurringChargeFrequency`
      if (jsonObj.get("RecurringChargeFrequency") != null && !jsonObj.get("RecurringChargeFrequency").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RecurringChargeFrequency"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringCharge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringCharge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringCharge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringCharge.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringCharge>() {
           @Override
           public void write(JsonWriter out, RecurringCharge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringCharge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecurringCharge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecurringCharge
   * @throws IOException if the JSON string is invalid with respect to RecurringCharge
   */
  public static RecurringCharge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringCharge.class);
  }

  /**
   * Convert an instance of RecurringCharge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

