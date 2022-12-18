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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BookingFieldItem;
import org.openapitools.client.model.CustomFieldInputModel;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AppointmentBookModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:10.428978-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AppointmentBookModel {
  public static final String SERIALIZED_NAME_APPOINTMENT_BOOKING_FIELDS = "appointmentBookingFields";
  @SerializedName(SERIALIZED_NAME_APPOINTMENT_BOOKING_FIELDS)
  private List<BookingFieldItem> appointmentBookingFields;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private CustomFieldInputModel customFields;

  public static final String SERIALIZED_NAME_CUSTOMER_BOOKING_FIELDS = "customerBookingFields";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BOOKING_FIELDS)
  private List<BookingFieldItem> customerBookingFields;

  public static final String SERIALIZED_NAME_CUSTOMER_MESSAGE = "customerMessage";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_MESSAGE)
  private String customerMessage;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GROUP_SIZE = "groupSize";
  @SerializedName(SERIALIZED_NAME_GROUP_SIZE)
  private Integer groupSize;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PHONE_EXT = "phoneExt";
  @SerializedName(SERIALIZED_NAME_PHONE_EXT)
  private String phoneExt;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private String phoneType;

  public AppointmentBookModel() {
  }

  public AppointmentBookModel appointmentBookingFields(List<BookingFieldItem> appointmentBookingFields) {
    this.appointmentBookingFields = appointmentBookingFields;
    return this;
  }

  public AppointmentBookModel addAppointmentBookingFieldsItem(BookingFieldItem appointmentBookingFieldsItem) {
    if (this.appointmentBookingFields == null) {
      this.appointmentBookingFields = new ArrayList<>();
    }
    this.appointmentBookingFields.add(appointmentBookingFieldsItem);
    return this;
  }

  /**
   * Get appointmentBookingFields
   * @return appointmentBookingFields
   */
  @javax.annotation.Nullable
  public List<BookingFieldItem> getAppointmentBookingFields() {
    return appointmentBookingFields;
  }

  public void setAppointmentBookingFields(List<BookingFieldItem> appointmentBookingFields) {
    this.appointmentBookingFields = appointmentBookingFields;
  }


  public AppointmentBookModel customFields(CustomFieldInputModel customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields
   * @return customFields
   */
  @javax.annotation.Nullable
  public CustomFieldInputModel getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFieldInputModel customFields) {
    this.customFields = customFields;
  }


  public AppointmentBookModel customerBookingFields(List<BookingFieldItem> customerBookingFields) {
    this.customerBookingFields = customerBookingFields;
    return this;
  }

  public AppointmentBookModel addCustomerBookingFieldsItem(BookingFieldItem customerBookingFieldsItem) {
    if (this.customerBookingFields == null) {
      this.customerBookingFields = new ArrayList<>();
    }
    this.customerBookingFields.add(customerBookingFieldsItem);
    return this;
  }

  /**
   * Get customerBookingFields
   * @return customerBookingFields
   */
  @javax.annotation.Nullable
  public List<BookingFieldItem> getCustomerBookingFields() {
    return customerBookingFields;
  }

  public void setCustomerBookingFields(List<BookingFieldItem> customerBookingFields) {
    this.customerBookingFields = customerBookingFields;
  }


  public AppointmentBookModel customerMessage(String customerMessage) {
    this.customerMessage = customerMessage;
    return this;
  }

  /**
   * Get customerMessage
   * @return customerMessage
   */
  @javax.annotation.Nullable
  public String getCustomerMessage() {
    return customerMessage;
  }

  public void setCustomerMessage(String customerMessage) {
    this.customerMessage = customerMessage;
  }


  public AppointmentBookModel email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public AppointmentBookModel groupSize(Integer groupSize) {
    this.groupSize = groupSize;
    return this;
  }

  /**
   * Get groupSize
   * @return groupSize
   */
  @javax.annotation.Nullable
  public Integer getGroupSize() {
    return groupSize;
  }

  public void setGroupSize(Integer groupSize) {
    this.groupSize = groupSize;
  }


  public AppointmentBookModel name(String name) {
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


  public AppointmentBookModel notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public AppointmentBookModel phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public AppointmentBookModel phoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
    return this;
  }

  /**
   * Get phoneExt
   * @return phoneExt
   */
  @javax.annotation.Nullable
  public String getPhoneExt() {
    return phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }


  public AppointmentBookModel phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  /**
   * Get phoneType
   * @return phoneType
   */
  @javax.annotation.Nullable
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentBookModel appointmentBookModel = (AppointmentBookModel) o;
    return Objects.equals(this.appointmentBookingFields, appointmentBookModel.appointmentBookingFields) &&
        Objects.equals(this.customFields, appointmentBookModel.customFields) &&
        Objects.equals(this.customerBookingFields, appointmentBookModel.customerBookingFields) &&
        Objects.equals(this.customerMessage, appointmentBookModel.customerMessage) &&
        Objects.equals(this.email, appointmentBookModel.email) &&
        Objects.equals(this.groupSize, appointmentBookModel.groupSize) &&
        Objects.equals(this.name, appointmentBookModel.name) &&
        Objects.equals(this.notes, appointmentBookModel.notes) &&
        Objects.equals(this.phone, appointmentBookModel.phone) &&
        Objects.equals(this.phoneExt, appointmentBookModel.phoneExt) &&
        Objects.equals(this.phoneType, appointmentBookModel.phoneType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentBookingFields, customFields, customerBookingFields, customerMessage, email, groupSize, name, notes, phone, phoneExt, phoneType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentBookModel {\n");
    sb.append("    appointmentBookingFields: ").append(toIndentedString(appointmentBookingFields)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customerBookingFields: ").append(toIndentedString(customerBookingFields)).append("\n");
    sb.append("    customerMessage: ").append(toIndentedString(customerMessage)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneExt: ").append(toIndentedString(phoneExt)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
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
    openapiFields.add("appointmentBookingFields");
    openapiFields.add("customFields");
    openapiFields.add("customerBookingFields");
    openapiFields.add("customerMessage");
    openapiFields.add("email");
    openapiFields.add("groupSize");
    openapiFields.add("name");
    openapiFields.add("notes");
    openapiFields.add("phone");
    openapiFields.add("phoneExt");
    openapiFields.add("phoneType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppointmentBookModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppointmentBookModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppointmentBookModel is not found in the empty JSON string", AppointmentBookModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppointmentBookModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppointmentBookModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("appointmentBookingFields") != null && !jsonObj.get("appointmentBookingFields").isJsonNull()) {
        JsonArray jsonArrayappointmentBookingFields = jsonObj.getAsJsonArray("appointmentBookingFields");
        if (jsonArrayappointmentBookingFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("appointmentBookingFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `appointmentBookingFields` to be an array in the JSON string but got `%s`", jsonObj.get("appointmentBookingFields").toString()));
          }

          // validate the optional field `appointmentBookingFields` (array)
          for (int i = 0; i < jsonArrayappointmentBookingFields.size(); i++) {
            BookingFieldItem.validateJsonElement(jsonArrayappointmentBookingFields.get(i));
          };
        }
      }
      // validate the optional field `customFields`
      if (jsonObj.get("customFields") != null && !jsonObj.get("customFields").isJsonNull()) {
        CustomFieldInputModel.validateJsonElement(jsonObj.get("customFields"));
      }
      if (jsonObj.get("customerBookingFields") != null && !jsonObj.get("customerBookingFields").isJsonNull()) {
        JsonArray jsonArraycustomerBookingFields = jsonObj.getAsJsonArray("customerBookingFields");
        if (jsonArraycustomerBookingFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customerBookingFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customerBookingFields` to be an array in the JSON string but got `%s`", jsonObj.get("customerBookingFields").toString()));
          }

          // validate the optional field `customerBookingFields` (array)
          for (int i = 0; i < jsonArraycustomerBookingFields.size(); i++) {
            BookingFieldItem.validateJsonElement(jsonArraycustomerBookingFields.get(i));
          };
        }
      }
      if ((jsonObj.get("customerMessage") != null && !jsonObj.get("customerMessage").isJsonNull()) && !jsonObj.get("customerMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerMessage").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("phoneExt") != null && !jsonObj.get("phoneExt").isJsonNull()) && !jsonObj.get("phoneExt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneExt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneExt").toString()));
      }
      if ((jsonObj.get("phoneType") != null && !jsonObj.get("phoneType").isJsonNull()) && !jsonObj.get("phoneType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppointmentBookModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppointmentBookModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppointmentBookModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppointmentBookModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AppointmentBookModel>() {
           @Override
           public void write(JsonWriter out, AppointmentBookModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppointmentBookModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppointmentBookModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppointmentBookModel
   * @throws IOException if the JSON string is invalid with respect to AppointmentBookModel
   */
  public static AppointmentBookModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppointmentBookModel.class);
  }

  /**
   * Convert an instance of AppointmentBookModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

