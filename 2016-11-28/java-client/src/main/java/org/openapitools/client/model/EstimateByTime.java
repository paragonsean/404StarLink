/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.EstimateByTimeTimePeriod;
import org.openapitools.client.model.PricingUnit;

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
 * An estimate that&#39;s associated with a time period. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EstimateByTime {
  public static final String SERIALIZED_NAME_USAGE_COST = "usageCost";
  @SerializedName(SERIALIZED_NAME_USAGE_COST)
  private Double usageCost;

  public static final String SERIALIZED_NAME_PRICING_UNIT = "pricingUnit";
  @SerializedName(SERIALIZED_NAME_PRICING_UNIT)
  private PricingUnit pricingUnit;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private Double unit;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_TIME_PERIOD = "timePeriod";
  @SerializedName(SERIALIZED_NAME_TIME_PERIOD)
  private EstimateByTimeTimePeriod timePeriod;

  public EstimateByTime() {
  }

  public EstimateByTime usageCost(Double usageCost) {
    this.usageCost = usageCost;
    return this;
  }

  /**
   * Get usageCost
   * @return usageCost
   */
  @javax.annotation.Nullable
  public Double getUsageCost() {
    return usageCost;
  }

  public void setUsageCost(Double usageCost) {
    this.usageCost = usageCost;
  }


  public EstimateByTime pricingUnit(PricingUnit pricingUnit) {
    this.pricingUnit = pricingUnit;
    return this;
  }

  /**
   * Get pricingUnit
   * @return pricingUnit
   */
  @javax.annotation.Nullable
  public PricingUnit getPricingUnit() {
    return pricingUnit;
  }

  public void setPricingUnit(PricingUnit pricingUnit) {
    this.pricingUnit = pricingUnit;
  }


  public EstimateByTime unit(Double unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nullable
  public Double getUnit() {
    return unit;
  }

  public void setUnit(Double unit) {
    this.unit = unit;
  }


  public EstimateByTime currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public EstimateByTime timePeriod(EstimateByTimeTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Get timePeriod
   * @return timePeriod
   */
  @javax.annotation.Nullable
  public EstimateByTimeTimePeriod getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(EstimateByTimeTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateByTime estimateByTime = (EstimateByTime) o;
    return Objects.equals(this.usageCost, estimateByTime.usageCost) &&
        Objects.equals(this.pricingUnit, estimateByTime.pricingUnit) &&
        Objects.equals(this.unit, estimateByTime.unit) &&
        Objects.equals(this.currency, estimateByTime.currency) &&
        Objects.equals(this.timePeriod, estimateByTime.timePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageCost, pricingUnit, unit, currency, timePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateByTime {\n");
    sb.append("    usageCost: ").append(toIndentedString(usageCost)).append("\n");
    sb.append("    pricingUnit: ").append(toIndentedString(pricingUnit)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
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
    openapiFields.add("usageCost");
    openapiFields.add("pricingUnit");
    openapiFields.add("unit");
    openapiFields.add("currency");
    openapiFields.add("timePeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EstimateByTime
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EstimateByTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EstimateByTime is not found in the empty JSON string", EstimateByTime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EstimateByTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EstimateByTime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `usageCost`
      if (jsonObj.get("usageCost") != null && !jsonObj.get("usageCost").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("usageCost"));
      }
      // validate the optional field `pricingUnit`
      if (jsonObj.get("pricingUnit") != null && !jsonObj.get("pricingUnit").isJsonNull()) {
        PricingUnit.validateJsonElement(jsonObj.get("pricingUnit"));
      }
      // validate the optional field `unit`
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("unit"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency.validateJsonElement(jsonObj.get("currency"));
      }
      // validate the optional field `timePeriod`
      if (jsonObj.get("timePeriod") != null && !jsonObj.get("timePeriod").isJsonNull()) {
        EstimateByTimeTimePeriod.validateJsonElement(jsonObj.get("timePeriod"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EstimateByTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EstimateByTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EstimateByTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EstimateByTime.class));

       return (TypeAdapter<T>) new TypeAdapter<EstimateByTime>() {
           @Override
           public void write(JsonWriter out, EstimateByTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EstimateByTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EstimateByTime given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EstimateByTime
   * @throws IOException if the JSON string is invalid with respect to EstimateByTime
   */
  public static EstimateByTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimateByTime.class);
  }

  /**
   * Convert an instance of EstimateByTime to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

