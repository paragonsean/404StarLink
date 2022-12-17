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
 * AppointmentReminderViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:07.204560-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AppointmentReminderViewModel {
  public static final String SERIALIZED_NAME_EMAIL_FIRST_REMINDER = "emailFirstReminder";
  @SerializedName(SERIALIZED_NAME_EMAIL_FIRST_REMINDER)
  private Integer emailFirstReminder;

  public static final String SERIALIZED_NAME_EMAIL_FIRST_REMINDER_INTERVAL = "emailFirstReminderInterval";
  @SerializedName(SERIALIZED_NAME_EMAIL_FIRST_REMINDER_INTERVAL)
  private Integer emailFirstReminderInterval;

  public static final String SERIALIZED_NAME_EMAIL_SECOND_REMINDER = "emailSecondReminder";
  @SerializedName(SERIALIZED_NAME_EMAIL_SECOND_REMINDER)
  private Integer emailSecondReminder;

  public static final String SERIALIZED_NAME_EMAIL_SECOND_REMINDER_INTERVAL = "emailSecondReminderInterval";
  @SerializedName(SERIALIZED_NAME_EMAIL_SECOND_REMINDER_INTERVAL)
  private Integer emailSecondReminderInterval;

  public static final String SERIALIZED_NAME_SMS_FIRST_REMINDER = "smsFirstReminder";
  @SerializedName(SERIALIZED_NAME_SMS_FIRST_REMINDER)
  private Integer smsFirstReminder;

  public static final String SERIALIZED_NAME_SMS_FIRST_REMINDER_INTERVAL = "smsFirstReminderInterval";
  @SerializedName(SERIALIZED_NAME_SMS_FIRST_REMINDER_INTERVAL)
  private Integer smsFirstReminderInterval;

  public static final String SERIALIZED_NAME_SMS_SECOND_REMINDER = "smsSecondReminder";
  @SerializedName(SERIALIZED_NAME_SMS_SECOND_REMINDER)
  private Integer smsSecondReminder;

  public static final String SERIALIZED_NAME_SMS_SECOND_REMINDER_INTERVAL = "smsSecondReminderInterval";
  @SerializedName(SERIALIZED_NAME_SMS_SECOND_REMINDER_INTERVAL)
  private Integer smsSecondReminderInterval;

  public AppointmentReminderViewModel() {
  }

  public AppointmentReminderViewModel emailFirstReminder(Integer emailFirstReminder) {
    this.emailFirstReminder = emailFirstReminder;
    return this;
  }

  /**
   * Get emailFirstReminder
   * @return emailFirstReminder
   */
  @javax.annotation.Nullable
  public Integer getEmailFirstReminder() {
    return emailFirstReminder;
  }

  public void setEmailFirstReminder(Integer emailFirstReminder) {
    this.emailFirstReminder = emailFirstReminder;
  }


  public AppointmentReminderViewModel emailFirstReminderInterval(Integer emailFirstReminderInterval) {
    this.emailFirstReminderInterval = emailFirstReminderInterval;
    return this;
  }

  /**
   * Get emailFirstReminderInterval
   * @return emailFirstReminderInterval
   */
  @javax.annotation.Nullable
  public Integer getEmailFirstReminderInterval() {
    return emailFirstReminderInterval;
  }

  public void setEmailFirstReminderInterval(Integer emailFirstReminderInterval) {
    this.emailFirstReminderInterval = emailFirstReminderInterval;
  }


  public AppointmentReminderViewModel emailSecondReminder(Integer emailSecondReminder) {
    this.emailSecondReminder = emailSecondReminder;
    return this;
  }

  /**
   * Get emailSecondReminder
   * @return emailSecondReminder
   */
  @javax.annotation.Nullable
  public Integer getEmailSecondReminder() {
    return emailSecondReminder;
  }

  public void setEmailSecondReminder(Integer emailSecondReminder) {
    this.emailSecondReminder = emailSecondReminder;
  }


  public AppointmentReminderViewModel emailSecondReminderInterval(Integer emailSecondReminderInterval) {
    this.emailSecondReminderInterval = emailSecondReminderInterval;
    return this;
  }

  /**
   * Get emailSecondReminderInterval
   * @return emailSecondReminderInterval
   */
  @javax.annotation.Nullable
  public Integer getEmailSecondReminderInterval() {
    return emailSecondReminderInterval;
  }

  public void setEmailSecondReminderInterval(Integer emailSecondReminderInterval) {
    this.emailSecondReminderInterval = emailSecondReminderInterval;
  }


  public AppointmentReminderViewModel smsFirstReminder(Integer smsFirstReminder) {
    this.smsFirstReminder = smsFirstReminder;
    return this;
  }

  /**
   * Get smsFirstReminder
   * @return smsFirstReminder
   */
  @javax.annotation.Nullable
  public Integer getSmsFirstReminder() {
    return smsFirstReminder;
  }

  public void setSmsFirstReminder(Integer smsFirstReminder) {
    this.smsFirstReminder = smsFirstReminder;
  }


  public AppointmentReminderViewModel smsFirstReminderInterval(Integer smsFirstReminderInterval) {
    this.smsFirstReminderInterval = smsFirstReminderInterval;
    return this;
  }

  /**
   * Get smsFirstReminderInterval
   * @return smsFirstReminderInterval
   */
  @javax.annotation.Nullable
  public Integer getSmsFirstReminderInterval() {
    return smsFirstReminderInterval;
  }

  public void setSmsFirstReminderInterval(Integer smsFirstReminderInterval) {
    this.smsFirstReminderInterval = smsFirstReminderInterval;
  }


  public AppointmentReminderViewModel smsSecondReminder(Integer smsSecondReminder) {
    this.smsSecondReminder = smsSecondReminder;
    return this;
  }

  /**
   * Get smsSecondReminder
   * @return smsSecondReminder
   */
  @javax.annotation.Nullable
  public Integer getSmsSecondReminder() {
    return smsSecondReminder;
  }

  public void setSmsSecondReminder(Integer smsSecondReminder) {
    this.smsSecondReminder = smsSecondReminder;
  }


  public AppointmentReminderViewModel smsSecondReminderInterval(Integer smsSecondReminderInterval) {
    this.smsSecondReminderInterval = smsSecondReminderInterval;
    return this;
  }

  /**
   * Get smsSecondReminderInterval
   * @return smsSecondReminderInterval
   */
  @javax.annotation.Nullable
  public Integer getSmsSecondReminderInterval() {
    return smsSecondReminderInterval;
  }

  public void setSmsSecondReminderInterval(Integer smsSecondReminderInterval) {
    this.smsSecondReminderInterval = smsSecondReminderInterval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentReminderViewModel appointmentReminderViewModel = (AppointmentReminderViewModel) o;
    return Objects.equals(this.emailFirstReminder, appointmentReminderViewModel.emailFirstReminder) &&
        Objects.equals(this.emailFirstReminderInterval, appointmentReminderViewModel.emailFirstReminderInterval) &&
        Objects.equals(this.emailSecondReminder, appointmentReminderViewModel.emailSecondReminder) &&
        Objects.equals(this.emailSecondReminderInterval, appointmentReminderViewModel.emailSecondReminderInterval) &&
        Objects.equals(this.smsFirstReminder, appointmentReminderViewModel.smsFirstReminder) &&
        Objects.equals(this.smsFirstReminderInterval, appointmentReminderViewModel.smsFirstReminderInterval) &&
        Objects.equals(this.smsSecondReminder, appointmentReminderViewModel.smsSecondReminder) &&
        Objects.equals(this.smsSecondReminderInterval, appointmentReminderViewModel.smsSecondReminderInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailFirstReminder, emailFirstReminderInterval, emailSecondReminder, emailSecondReminderInterval, smsFirstReminder, smsFirstReminderInterval, smsSecondReminder, smsSecondReminderInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentReminderViewModel {\n");
    sb.append("    emailFirstReminder: ").append(toIndentedString(emailFirstReminder)).append("\n");
    sb.append("    emailFirstReminderInterval: ").append(toIndentedString(emailFirstReminderInterval)).append("\n");
    sb.append("    emailSecondReminder: ").append(toIndentedString(emailSecondReminder)).append("\n");
    sb.append("    emailSecondReminderInterval: ").append(toIndentedString(emailSecondReminderInterval)).append("\n");
    sb.append("    smsFirstReminder: ").append(toIndentedString(smsFirstReminder)).append("\n");
    sb.append("    smsFirstReminderInterval: ").append(toIndentedString(smsFirstReminderInterval)).append("\n");
    sb.append("    smsSecondReminder: ").append(toIndentedString(smsSecondReminder)).append("\n");
    sb.append("    smsSecondReminderInterval: ").append(toIndentedString(smsSecondReminderInterval)).append("\n");
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
    openapiFields.add("emailFirstReminder");
    openapiFields.add("emailFirstReminderInterval");
    openapiFields.add("emailSecondReminder");
    openapiFields.add("emailSecondReminderInterval");
    openapiFields.add("smsFirstReminder");
    openapiFields.add("smsFirstReminderInterval");
    openapiFields.add("smsSecondReminder");
    openapiFields.add("smsSecondReminderInterval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppointmentReminderViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppointmentReminderViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppointmentReminderViewModel is not found in the empty JSON string", AppointmentReminderViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppointmentReminderViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppointmentReminderViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppointmentReminderViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppointmentReminderViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppointmentReminderViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppointmentReminderViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AppointmentReminderViewModel>() {
           @Override
           public void write(JsonWriter out, AppointmentReminderViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppointmentReminderViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppointmentReminderViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppointmentReminderViewModel
   * @throws IOException if the JSON string is invalid with respect to AppointmentReminderViewModel
   */
  public static AppointmentReminderViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppointmentReminderViewModel.class);
  }

  /**
   * Convert an instance of AppointmentReminderViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

