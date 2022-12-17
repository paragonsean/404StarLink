/*
 * OnSched Consumer API
 * Build secure and scalable custom apps for Online Booking. Our flexible API provides many options for availability and booking.  <br><br>  Take the API for a test drive. Just click on the Authorize button below and authenticate.   You can access our demo company profile if you are not a customer, or your own profile by using your assigned ClientId and Secret.  <br><br>  The API has two interfaces, consumer and setup.   <ul>  <li>  The consumer interface provides all the endpoints required for implementing consumer booking flows.  </li>  <li>  The setup interface provides endpoints for profile configuration and setup.  </li>  </ul>  Toggle freely between the two interfaces using the swagger tool bar option labelled 'Select a definition'.  
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.client.model.BusinessHourViewModel;

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
 * BusinessHoursViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:07.204560-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BusinessHoursViewModel {
  public static final String SERIALIZED_NAME_FRI = "fri";
  @SerializedName(SERIALIZED_NAME_FRI)
  private BusinessHourViewModel fri;

  public static final String SERIALIZED_NAME_MON = "mon";
  @SerializedName(SERIALIZED_NAME_MON)
  private BusinessHourViewModel mon;

  public static final String SERIALIZED_NAME_SAT = "sat";
  @SerializedName(SERIALIZED_NAME_SAT)
  private BusinessHourViewModel sat;

  public static final String SERIALIZED_NAME_SUN = "sun";
  @SerializedName(SERIALIZED_NAME_SUN)
  private BusinessHourViewModel sun;

  public static final String SERIALIZED_NAME_THU = "thu";
  @SerializedName(SERIALIZED_NAME_THU)
  private BusinessHourViewModel thu;

  public static final String SERIALIZED_NAME_TUE = "tue";
  @SerializedName(SERIALIZED_NAME_TUE)
  private BusinessHourViewModel tue;

  public static final String SERIALIZED_NAME_WED = "wed";
  @SerializedName(SERIALIZED_NAME_WED)
  private BusinessHourViewModel wed;

  public BusinessHoursViewModel() {
  }

  public BusinessHoursViewModel fri(BusinessHourViewModel fri) {
    this.fri = fri;
    return this;
  }

  /**
   * Get fri
   * @return fri
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getFri() {
    return fri;
  }

  public void setFri(BusinessHourViewModel fri) {
    this.fri = fri;
  }


  public BusinessHoursViewModel mon(BusinessHourViewModel mon) {
    this.mon = mon;
    return this;
  }

  /**
   * Get mon
   * @return mon
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getMon() {
    return mon;
  }

  public void setMon(BusinessHourViewModel mon) {
    this.mon = mon;
  }


  public BusinessHoursViewModel sat(BusinessHourViewModel sat) {
    this.sat = sat;
    return this;
  }

  /**
   * Get sat
   * @return sat
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getSat() {
    return sat;
  }

  public void setSat(BusinessHourViewModel sat) {
    this.sat = sat;
  }


  public BusinessHoursViewModel sun(BusinessHourViewModel sun) {
    this.sun = sun;
    return this;
  }

  /**
   * Get sun
   * @return sun
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getSun() {
    return sun;
  }

  public void setSun(BusinessHourViewModel sun) {
    this.sun = sun;
  }


  public BusinessHoursViewModel thu(BusinessHourViewModel thu) {
    this.thu = thu;
    return this;
  }

  /**
   * Get thu
   * @return thu
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getThu() {
    return thu;
  }

  public void setThu(BusinessHourViewModel thu) {
    this.thu = thu;
  }


  public BusinessHoursViewModel tue(BusinessHourViewModel tue) {
    this.tue = tue;
    return this;
  }

  /**
   * Get tue
   * @return tue
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getTue() {
    return tue;
  }

  public void setTue(BusinessHourViewModel tue) {
    this.tue = tue;
  }


  public BusinessHoursViewModel wed(BusinessHourViewModel wed) {
    this.wed = wed;
    return this;
  }

  /**
   * Get wed
   * @return wed
   */
  @javax.annotation.Nullable
  public BusinessHourViewModel getWed() {
    return wed;
  }

  public void setWed(BusinessHourViewModel wed) {
    this.wed = wed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHoursViewModel businessHoursViewModel = (BusinessHoursViewModel) o;
    return Objects.equals(this.fri, businessHoursViewModel.fri) &&
        Objects.equals(this.mon, businessHoursViewModel.mon) &&
        Objects.equals(this.sat, businessHoursViewModel.sat) &&
        Objects.equals(this.sun, businessHoursViewModel.sun) &&
        Objects.equals(this.thu, businessHoursViewModel.thu) &&
        Objects.equals(this.tue, businessHoursViewModel.tue) &&
        Objects.equals(this.wed, businessHoursViewModel.wed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fri, mon, sat, sun, thu, tue, wed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHoursViewModel {\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
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
    openapiFields.add("fri");
    openapiFields.add("mon");
    openapiFields.add("sat");
    openapiFields.add("sun");
    openapiFields.add("thu");
    openapiFields.add("tue");
    openapiFields.add("wed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessHoursViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessHoursViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessHoursViewModel is not found in the empty JSON string", BusinessHoursViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BusinessHoursViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessHoursViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fri`
      if (jsonObj.get("fri") != null && !jsonObj.get("fri").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("fri"));
      }
      // validate the optional field `mon`
      if (jsonObj.get("mon") != null && !jsonObj.get("mon").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("mon"));
      }
      // validate the optional field `sat`
      if (jsonObj.get("sat") != null && !jsonObj.get("sat").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("sat"));
      }
      // validate the optional field `sun`
      if (jsonObj.get("sun") != null && !jsonObj.get("sun").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("sun"));
      }
      // validate the optional field `thu`
      if (jsonObj.get("thu") != null && !jsonObj.get("thu").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("thu"));
      }
      // validate the optional field `tue`
      if (jsonObj.get("tue") != null && !jsonObj.get("tue").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("tue"));
      }
      // validate the optional field `wed`
      if (jsonObj.get("wed") != null && !jsonObj.get("wed").isJsonNull()) {
        BusinessHourViewModel.validateJsonElement(jsonObj.get("wed"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessHoursViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessHoursViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessHoursViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessHoursViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessHoursViewModel>() {
           @Override
           public void write(JsonWriter out, BusinessHoursViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessHoursViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BusinessHoursViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessHoursViewModel
   * @throws IOException if the JSON string is invalid with respect to BusinessHoursViewModel
   */
  public static BusinessHoursViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessHoursViewModel.class);
  }

  /**
   * Convert an instance of BusinessHoursViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

