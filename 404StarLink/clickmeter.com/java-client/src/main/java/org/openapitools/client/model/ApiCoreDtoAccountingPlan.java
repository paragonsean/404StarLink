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
 * ApiCoreDtoAccountingPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:16.082688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoAccountingPlan {
  public static final String SERIALIZED_NAME_ALLOWED_PERSONAL_DOMAINS = "allowedPersonalDomains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PERSONAL_DOMAINS)
  private Integer allowedPersonalDomains;

  public static final String SERIALIZED_NAME_ALLOWED_PERSONAL_URLS = "allowedPersonalUrls";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PERSONAL_URLS)
  private Integer allowedPersonalUrls;

  public static final String SERIALIZED_NAME_BILLING_PERIOD_END = "billingPeriodEnd";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD_END)
  private String billingPeriodEnd;

  public static final String SERIALIZED_NAME_BILLING_PERIOD_START = "billingPeriodStart";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD_START)
  private String billingPeriodStart;

  public static final String SERIALIZED_NAME_BONUS_MONTHLY_EVENTS = "bonusMonthlyEvents";
  @SerializedName(SERIALIZED_NAME_BONUS_MONTHLY_EVENTS)
  private Long bonusMonthlyEvents;

  public static final String SERIALIZED_NAME_MAXIMUM_DATAPOINTS = "maximumDatapoints";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DATAPOINTS)
  private Long maximumDatapoints;

  public static final String SERIALIZED_NAME_MAXIMUM_GUESTS = "maximumGuests";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_GUESTS)
  private Long maximumGuests;

  public static final String SERIALIZED_NAME_MONTHLY_EVENTS = "monthlyEvents";
  @SerializedName(SERIALIZED_NAME_MONTHLY_EVENTS)
  private Long monthlyEvents;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private Long profileId;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_RECURRING_PERIOD = "recurringPeriod";
  @SerializedName(SERIALIZED_NAME_RECURRING_PERIOD)
  private Integer recurringPeriod;

  public static final String SERIALIZED_NAME_USED_DATAPOINTS = "usedDatapoints";
  @SerializedName(SERIALIZED_NAME_USED_DATAPOINTS)
  private Long usedDatapoints;

  public static final String SERIALIZED_NAME_USED_MONTHLY_EVENTS = "usedMonthlyEvents";
  @SerializedName(SERIALIZED_NAME_USED_MONTHLY_EVENTS)
  private Long usedMonthlyEvents;

  public ApiCoreDtoAccountingPlan() {
  }

  public ApiCoreDtoAccountingPlan allowedPersonalDomains(Integer allowedPersonalDomains) {
    this.allowedPersonalDomains = allowedPersonalDomains;
    return this;
  }

  /**
   * Get allowedPersonalDomains
   * @return allowedPersonalDomains
   */
  @javax.annotation.Nullable
  public Integer getAllowedPersonalDomains() {
    return allowedPersonalDomains;
  }

  public void setAllowedPersonalDomains(Integer allowedPersonalDomains) {
    this.allowedPersonalDomains = allowedPersonalDomains;
  }


  public ApiCoreDtoAccountingPlan allowedPersonalUrls(Integer allowedPersonalUrls) {
    this.allowedPersonalUrls = allowedPersonalUrls;
    return this;
  }

  /**
   * Get allowedPersonalUrls
   * @return allowedPersonalUrls
   */
  @javax.annotation.Nullable
  public Integer getAllowedPersonalUrls() {
    return allowedPersonalUrls;
  }

  public void setAllowedPersonalUrls(Integer allowedPersonalUrls) {
    this.allowedPersonalUrls = allowedPersonalUrls;
  }


  public ApiCoreDtoAccountingPlan billingPeriodEnd(String billingPeriodEnd) {
    this.billingPeriodEnd = billingPeriodEnd;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return billingPeriodEnd
   */
  @javax.annotation.Nullable
  public String getBillingPeriodEnd() {
    return billingPeriodEnd;
  }

  public void setBillingPeriodEnd(String billingPeriodEnd) {
    this.billingPeriodEnd = billingPeriodEnd;
  }


  public ApiCoreDtoAccountingPlan billingPeriodStart(String billingPeriodStart) {
    this.billingPeriodStart = billingPeriodStart;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return billingPeriodStart
   */
  @javax.annotation.Nullable
  public String getBillingPeriodStart() {
    return billingPeriodStart;
  }

  public void setBillingPeriodStart(String billingPeriodStart) {
    this.billingPeriodStart = billingPeriodStart;
  }


  public ApiCoreDtoAccountingPlan bonusMonthlyEvents(Long bonusMonthlyEvents) {
    this.bonusMonthlyEvents = bonusMonthlyEvents;
    return this;
  }

  /**
   * Get bonusMonthlyEvents
   * @return bonusMonthlyEvents
   */
  @javax.annotation.Nullable
  public Long getBonusMonthlyEvents() {
    return bonusMonthlyEvents;
  }

  public void setBonusMonthlyEvents(Long bonusMonthlyEvents) {
    this.bonusMonthlyEvents = bonusMonthlyEvents;
  }


  public ApiCoreDtoAccountingPlan maximumDatapoints(Long maximumDatapoints) {
    this.maximumDatapoints = maximumDatapoints;
    return this;
  }

  /**
   * Get maximumDatapoints
   * @return maximumDatapoints
   */
  @javax.annotation.Nullable
  public Long getMaximumDatapoints() {
    return maximumDatapoints;
  }

  public void setMaximumDatapoints(Long maximumDatapoints) {
    this.maximumDatapoints = maximumDatapoints;
  }


  public ApiCoreDtoAccountingPlan maximumGuests(Long maximumGuests) {
    this.maximumGuests = maximumGuests;
    return this;
  }

  /**
   * Get maximumGuests
   * @return maximumGuests
   */
  @javax.annotation.Nullable
  public Long getMaximumGuests() {
    return maximumGuests;
  }

  public void setMaximumGuests(Long maximumGuests) {
    this.maximumGuests = maximumGuests;
  }


  public ApiCoreDtoAccountingPlan monthlyEvents(Long monthlyEvents) {
    this.monthlyEvents = monthlyEvents;
    return this;
  }

  /**
   * Get monthlyEvents
   * @return monthlyEvents
   */
  @javax.annotation.Nullable
  public Long getMonthlyEvents() {
    return monthlyEvents;
  }

  public void setMonthlyEvents(Long monthlyEvents) {
    this.monthlyEvents = monthlyEvents;
  }


  public ApiCoreDtoAccountingPlan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ApiCoreDtoAccountingPlan price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public ApiCoreDtoAccountingPlan profileId(Long profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   * @return profileId
   */
  @javax.annotation.Nullable
  public Long getProfileId() {
    return profileId;
  }

  public void setProfileId(Long profileId) {
    this.profileId = profileId;
  }


  public ApiCoreDtoAccountingPlan recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * Get recurring
   * @return recurring
   */
  @javax.annotation.Nullable
  public Boolean getRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public ApiCoreDtoAccountingPlan recurringPeriod(Integer recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
    return this;
  }

  /**
   * Get recurringPeriod
   * @return recurringPeriod
   */
  @javax.annotation.Nullable
  public Integer getRecurringPeriod() {
    return recurringPeriod;
  }

  public void setRecurringPeriod(Integer recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
  }


  public ApiCoreDtoAccountingPlan usedDatapoints(Long usedDatapoints) {
    this.usedDatapoints = usedDatapoints;
    return this;
  }

  /**
   * Get usedDatapoints
   * @return usedDatapoints
   */
  @javax.annotation.Nullable
  public Long getUsedDatapoints() {
    return usedDatapoints;
  }

  public void setUsedDatapoints(Long usedDatapoints) {
    this.usedDatapoints = usedDatapoints;
  }


  public ApiCoreDtoAccountingPlan usedMonthlyEvents(Long usedMonthlyEvents) {
    this.usedMonthlyEvents = usedMonthlyEvents;
    return this;
  }

  /**
   * Get usedMonthlyEvents
   * @return usedMonthlyEvents
   */
  @javax.annotation.Nullable
  public Long getUsedMonthlyEvents() {
    return usedMonthlyEvents;
  }

  public void setUsedMonthlyEvents(Long usedMonthlyEvents) {
    this.usedMonthlyEvents = usedMonthlyEvents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoAccountingPlan apiCoreDtoAccountingPlan = (ApiCoreDtoAccountingPlan) o;
    return Objects.equals(this.allowedPersonalDomains, apiCoreDtoAccountingPlan.allowedPersonalDomains) &&
        Objects.equals(this.allowedPersonalUrls, apiCoreDtoAccountingPlan.allowedPersonalUrls) &&
        Objects.equals(this.billingPeriodEnd, apiCoreDtoAccountingPlan.billingPeriodEnd) &&
        Objects.equals(this.billingPeriodStart, apiCoreDtoAccountingPlan.billingPeriodStart) &&
        Objects.equals(this.bonusMonthlyEvents, apiCoreDtoAccountingPlan.bonusMonthlyEvents) &&
        Objects.equals(this.maximumDatapoints, apiCoreDtoAccountingPlan.maximumDatapoints) &&
        Objects.equals(this.maximumGuests, apiCoreDtoAccountingPlan.maximumGuests) &&
        Objects.equals(this.monthlyEvents, apiCoreDtoAccountingPlan.monthlyEvents) &&
        Objects.equals(this.name, apiCoreDtoAccountingPlan.name) &&
        Objects.equals(this.price, apiCoreDtoAccountingPlan.price) &&
        Objects.equals(this.profileId, apiCoreDtoAccountingPlan.profileId) &&
        Objects.equals(this.recurring, apiCoreDtoAccountingPlan.recurring) &&
        Objects.equals(this.recurringPeriod, apiCoreDtoAccountingPlan.recurringPeriod) &&
        Objects.equals(this.usedDatapoints, apiCoreDtoAccountingPlan.usedDatapoints) &&
        Objects.equals(this.usedMonthlyEvents, apiCoreDtoAccountingPlan.usedMonthlyEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPersonalDomains, allowedPersonalUrls, billingPeriodEnd, billingPeriodStart, bonusMonthlyEvents, maximumDatapoints, maximumGuests, monthlyEvents, name, price, profileId, recurring, recurringPeriod, usedDatapoints, usedMonthlyEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoAccountingPlan {\n");
    sb.append("    allowedPersonalDomains: ").append(toIndentedString(allowedPersonalDomains)).append("\n");
    sb.append("    allowedPersonalUrls: ").append(toIndentedString(allowedPersonalUrls)).append("\n");
    sb.append("    billingPeriodEnd: ").append(toIndentedString(billingPeriodEnd)).append("\n");
    sb.append("    billingPeriodStart: ").append(toIndentedString(billingPeriodStart)).append("\n");
    sb.append("    bonusMonthlyEvents: ").append(toIndentedString(bonusMonthlyEvents)).append("\n");
    sb.append("    maximumDatapoints: ").append(toIndentedString(maximumDatapoints)).append("\n");
    sb.append("    maximumGuests: ").append(toIndentedString(maximumGuests)).append("\n");
    sb.append("    monthlyEvents: ").append(toIndentedString(monthlyEvents)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    recurringPeriod: ").append(toIndentedString(recurringPeriod)).append("\n");
    sb.append("    usedDatapoints: ").append(toIndentedString(usedDatapoints)).append("\n");
    sb.append("    usedMonthlyEvents: ").append(toIndentedString(usedMonthlyEvents)).append("\n");
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
    openapiFields.add("allowedPersonalDomains");
    openapiFields.add("allowedPersonalUrls");
    openapiFields.add("billingPeriodEnd");
    openapiFields.add("billingPeriodStart");
    openapiFields.add("bonusMonthlyEvents");
    openapiFields.add("maximumDatapoints");
    openapiFields.add("maximumGuests");
    openapiFields.add("monthlyEvents");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("profileId");
    openapiFields.add("recurring");
    openapiFields.add("recurringPeriod");
    openapiFields.add("usedDatapoints");
    openapiFields.add("usedMonthlyEvents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoAccountingPlan
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoAccountingPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoAccountingPlan is not found in the empty JSON string", ApiCoreDtoAccountingPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoAccountingPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoAccountingPlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("billingPeriodEnd") != null && !jsonObj.get("billingPeriodEnd").isJsonNull()) && !jsonObj.get("billingPeriodEnd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingPeriodEnd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingPeriodEnd").toString()));
      }
      if ((jsonObj.get("billingPeriodStart") != null && !jsonObj.get("billingPeriodStart").isJsonNull()) && !jsonObj.get("billingPeriodStart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingPeriodStart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingPeriodStart").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoAccountingPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoAccountingPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoAccountingPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoAccountingPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoAccountingPlan>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoAccountingPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoAccountingPlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoAccountingPlan given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoAccountingPlan
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoAccountingPlan
   */
  public static ApiCoreDtoAccountingPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoAccountingPlan.class);
  }

  /**
   * Convert an instance of ApiCoreDtoAccountingPlan to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

