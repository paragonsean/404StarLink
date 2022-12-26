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
import java.time.OffsetDateTime;
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
 * AppointmentInitialModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:31.714197-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AppointmentInitialModel {
  public static final String SERIALIZED_NAME_APPOINTMENT_BOOKING_FIELDS = "appointmentBookingFields";
  @SerializedName(SERIALIZED_NAME_APPOINTMENT_BOOKING_FIELDS)
  private List<BookingFieldItem> appointmentBookingFields;

  public static final String SERIALIZED_NAME_BOOKED_BY = "bookedBy";
  @SerializedName(SERIALIZED_NAME_BOOKED_BY)
  private String bookedBy;

  public static final String SERIALIZED_NAME_BOOKING_WINDOW_ID = "bookingWindowId";
  @SerializedName(SERIALIZED_NAME_BOOKING_WINDOW_ID)
  private String bookingWindowId;

  public static final String SERIALIZED_NAME_CALENDAR_ID = "calendarId";
  @SerializedName(SERIALIZED_NAME_CALENDAR_ID)
  private String calendarId;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private CustomFieldInputModel customFields;

  public static final String SERIALIZED_NAME_CUSTOMER_BOOKING_FIELDS = "customerBookingFields";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BOOKING_FIELDS)
  private List<BookingFieldItem> customerBookingFields;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_CUSTOMER_MESSAGE = "customerMessage";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_MESSAGE)
  private String customerMessage;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_END_DATE_TIME = "endDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_GROUP_SIZE = "groupSize";
  @SerializedName(SERIALIZED_NAME_GROUP_SIZE)
  private Integer groupSize;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private String phoneType;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP_ID = "resourceGroupId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP_ID)
  private String resourceGroupId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_IDS = "resourceIds";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDS)
  private String resourceIds;

  public static final String SERIALIZED_NAME_SERVICE_ALLOCATION_ID = "serviceAllocationId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ALLOCATION_ID)
  private String serviceAllocationId;

  public static final String SERIALIZED_NAME_SERVICE_ID = "serviceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_TIMEZONE_NAME = "timezoneName";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_NAME)
  private String timezoneName;

  public static final String SERIALIZED_NAME_TRAVEL_APPOINTMENT_ID = "travelAppointmentId";
  @SerializedName(SERIALIZED_NAME_TRAVEL_APPOINTMENT_ID)
  private String travelAppointmentId;

  public static final String SERIALIZED_NAME_TRAVEL_TIME_MINS = "travelTimeMins";
  @SerializedName(SERIALIZED_NAME_TRAVEL_TIME_MINS)
  private Integer travelTimeMins;

  public AppointmentInitialModel() {
  }

  public AppointmentInitialModel appointmentBookingFields(List<BookingFieldItem> appointmentBookingFields) {
    this.appointmentBookingFields = appointmentBookingFields;
    return this;
  }

  public AppointmentInitialModel addAppointmentBookingFieldsItem(BookingFieldItem appointmentBookingFieldsItem) {
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


  public AppointmentInitialModel bookedBy(String bookedBy) {
    this.bookedBy = bookedBy;
    return this;
  }

  /**
   * Get bookedBy
   * @return bookedBy
   */
  @javax.annotation.Nullable
  public String getBookedBy() {
    return bookedBy;
  }

  public void setBookedBy(String bookedBy) {
    this.bookedBy = bookedBy;
  }


  public AppointmentInitialModel bookingWindowId(String bookingWindowId) {
    this.bookingWindowId = bookingWindowId;
    return this;
  }

  /**
   * Get bookingWindowId
   * @return bookingWindowId
   */
  @javax.annotation.Nullable
  public String getBookingWindowId() {
    return bookingWindowId;
  }

  public void setBookingWindowId(String bookingWindowId) {
    this.bookingWindowId = bookingWindowId;
  }


  public AppointmentInitialModel calendarId(String calendarId) {
    this.calendarId = calendarId;
    return this;
  }

  /**
   * Get calendarId
   * @return calendarId
   */
  @javax.annotation.Nullable
  public String getCalendarId() {
    return calendarId;
  }

  public void setCalendarId(String calendarId) {
    this.calendarId = calendarId;
  }


  public AppointmentInitialModel customFields(CustomFieldInputModel customFields) {
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


  public AppointmentInitialModel customerBookingFields(List<BookingFieldItem> customerBookingFields) {
    this.customerBookingFields = customerBookingFields;
    return this;
  }

  public AppointmentInitialModel addCustomerBookingFieldsItem(BookingFieldItem customerBookingFieldsItem) {
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


  public AppointmentInitialModel customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public AppointmentInitialModel customerMessage(String customerMessage) {
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


  public AppointmentInitialModel email(String email) {
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


  public AppointmentInitialModel endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public AppointmentInitialModel groupSize(Integer groupSize) {
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


  public AppointmentInitialModel location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public AppointmentInitialModel locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
   */
  @javax.annotation.Nullable
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public AppointmentInitialModel name(String name) {
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


  public AppointmentInitialModel notes(String notes) {
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


  public AppointmentInitialModel phone(String phone) {
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


  public AppointmentInitialModel phoneType(String phoneType) {
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


  public AppointmentInitialModel resourceGroupId(String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
    return this;
  }

  /**
   * Get resourceGroupId
   * @return resourceGroupId
   */
  @javax.annotation.Nullable
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  public void setResourceGroupId(String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
  }


  public AppointmentInitialModel resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
   */
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AppointmentInitialModel resourceIds(String resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  /**
   * Get resourceIds
   * @return resourceIds
   */
  @javax.annotation.Nullable
  public String getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(String resourceIds) {
    this.resourceIds = resourceIds;
  }


  public AppointmentInitialModel serviceAllocationId(String serviceAllocationId) {
    this.serviceAllocationId = serviceAllocationId;
    return this;
  }

  /**
   * Get serviceAllocationId
   * @return serviceAllocationId
   */
  @javax.annotation.Nullable
  public String getServiceAllocationId() {
    return serviceAllocationId;
  }

  public void setServiceAllocationId(String serviceAllocationId) {
    this.serviceAllocationId = serviceAllocationId;
  }


  public AppointmentInitialModel serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   */
  @javax.annotation.Nullable
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public AppointmentInitialModel startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Get startDateTime
   * @return startDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public AppointmentInitialModel timezoneName(String timezoneName) {
    this.timezoneName = timezoneName;
    return this;
  }

  /**
   * Get timezoneName
   * @return timezoneName
   */
  @javax.annotation.Nullable
  public String getTimezoneName() {
    return timezoneName;
  }

  public void setTimezoneName(String timezoneName) {
    this.timezoneName = timezoneName;
  }


  public AppointmentInitialModel travelAppointmentId(String travelAppointmentId) {
    this.travelAppointmentId = travelAppointmentId;
    return this;
  }

  /**
   * Get travelAppointmentId
   * @return travelAppointmentId
   */
  @javax.annotation.Nullable
  public String getTravelAppointmentId() {
    return travelAppointmentId;
  }

  public void setTravelAppointmentId(String travelAppointmentId) {
    this.travelAppointmentId = travelAppointmentId;
  }


  public AppointmentInitialModel travelTimeMins(Integer travelTimeMins) {
    this.travelTimeMins = travelTimeMins;
    return this;
  }

  /**
   * Get travelTimeMins
   * @return travelTimeMins
   */
  @javax.annotation.Nullable
  public Integer getTravelTimeMins() {
    return travelTimeMins;
  }

  public void setTravelTimeMins(Integer travelTimeMins) {
    this.travelTimeMins = travelTimeMins;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentInitialModel appointmentInitialModel = (AppointmentInitialModel) o;
    return Objects.equals(this.appointmentBookingFields, appointmentInitialModel.appointmentBookingFields) &&
        Objects.equals(this.bookedBy, appointmentInitialModel.bookedBy) &&
        Objects.equals(this.bookingWindowId, appointmentInitialModel.bookingWindowId) &&
        Objects.equals(this.calendarId, appointmentInitialModel.calendarId) &&
        Objects.equals(this.customFields, appointmentInitialModel.customFields) &&
        Objects.equals(this.customerBookingFields, appointmentInitialModel.customerBookingFields) &&
        Objects.equals(this.customerId, appointmentInitialModel.customerId) &&
        Objects.equals(this.customerMessage, appointmentInitialModel.customerMessage) &&
        Objects.equals(this.email, appointmentInitialModel.email) &&
        Objects.equals(this.endDateTime, appointmentInitialModel.endDateTime) &&
        Objects.equals(this.groupSize, appointmentInitialModel.groupSize) &&
        Objects.equals(this.location, appointmentInitialModel.location) &&
        Objects.equals(this.locationId, appointmentInitialModel.locationId) &&
        Objects.equals(this.name, appointmentInitialModel.name) &&
        Objects.equals(this.notes, appointmentInitialModel.notes) &&
        Objects.equals(this.phone, appointmentInitialModel.phone) &&
        Objects.equals(this.phoneType, appointmentInitialModel.phoneType) &&
        Objects.equals(this.resourceGroupId, appointmentInitialModel.resourceGroupId) &&
        Objects.equals(this.resourceId, appointmentInitialModel.resourceId) &&
        Objects.equals(this.resourceIds, appointmentInitialModel.resourceIds) &&
        Objects.equals(this.serviceAllocationId, appointmentInitialModel.serviceAllocationId) &&
        Objects.equals(this.serviceId, appointmentInitialModel.serviceId) &&
        Objects.equals(this.startDateTime, appointmentInitialModel.startDateTime) &&
        Objects.equals(this.timezoneName, appointmentInitialModel.timezoneName) &&
        Objects.equals(this.travelAppointmentId, appointmentInitialModel.travelAppointmentId) &&
        Objects.equals(this.travelTimeMins, appointmentInitialModel.travelTimeMins);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentBookingFields, bookedBy, bookingWindowId, calendarId, customFields, customerBookingFields, customerId, customerMessage, email, endDateTime, groupSize, location, locationId, name, notes, phone, phoneType, resourceGroupId, resourceId, resourceIds, serviceAllocationId, serviceId, startDateTime, timezoneName, travelAppointmentId, travelTimeMins);
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
    sb.append("class AppointmentInitialModel {\n");
    sb.append("    appointmentBookingFields: ").append(toIndentedString(appointmentBookingFields)).append("\n");
    sb.append("    bookedBy: ").append(toIndentedString(bookedBy)).append("\n");
    sb.append("    bookingWindowId: ").append(toIndentedString(bookingWindowId)).append("\n");
    sb.append("    calendarId: ").append(toIndentedString(calendarId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customerBookingFields: ").append(toIndentedString(customerBookingFields)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerMessage: ").append(toIndentedString(customerMessage)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    serviceAllocationId: ").append(toIndentedString(serviceAllocationId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    timezoneName: ").append(toIndentedString(timezoneName)).append("\n");
    sb.append("    travelAppointmentId: ").append(toIndentedString(travelAppointmentId)).append("\n");
    sb.append("    travelTimeMins: ").append(toIndentedString(travelTimeMins)).append("\n");
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
    openapiFields.add("bookedBy");
    openapiFields.add("bookingWindowId");
    openapiFields.add("calendarId");
    openapiFields.add("customFields");
    openapiFields.add("customerBookingFields");
    openapiFields.add("customerId");
    openapiFields.add("customerMessage");
    openapiFields.add("email");
    openapiFields.add("endDateTime");
    openapiFields.add("groupSize");
    openapiFields.add("location");
    openapiFields.add("locationId");
    openapiFields.add("name");
    openapiFields.add("notes");
    openapiFields.add("phone");
    openapiFields.add("phoneType");
    openapiFields.add("resourceGroupId");
    openapiFields.add("resourceId");
    openapiFields.add("resourceIds");
    openapiFields.add("serviceAllocationId");
    openapiFields.add("serviceId");
    openapiFields.add("startDateTime");
    openapiFields.add("timezoneName");
    openapiFields.add("travelAppointmentId");
    openapiFields.add("travelTimeMins");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppointmentInitialModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppointmentInitialModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppointmentInitialModel is not found in the empty JSON string", AppointmentInitialModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppointmentInitialModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppointmentInitialModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("bookedBy") != null && !jsonObj.get("bookedBy").isJsonNull()) && !jsonObj.get("bookedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bookedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bookedBy").toString()));
      }
      if ((jsonObj.get("bookingWindowId") != null && !jsonObj.get("bookingWindowId").isJsonNull()) && !jsonObj.get("bookingWindowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bookingWindowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bookingWindowId").toString()));
      }
      if ((jsonObj.get("calendarId") != null && !jsonObj.get("calendarId").isJsonNull()) && !jsonObj.get("calendarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calendarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calendarId").toString()));
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
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("customerMessage") != null && !jsonObj.get("customerMessage").isJsonNull()) && !jsonObj.get("customerMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerMessage").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
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
      if ((jsonObj.get("phoneType") != null && !jsonObj.get("phoneType").isJsonNull()) && !jsonObj.get("phoneType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneType").toString()));
      }
      if ((jsonObj.get("resourceGroupId") != null && !jsonObj.get("resourceGroupId").isJsonNull()) && !jsonObj.get("resourceGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceGroupId").toString()));
      }
      if ((jsonObj.get("resourceId") != null && !jsonObj.get("resourceId").isJsonNull()) && !jsonObj.get("resourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceId").toString()));
      }
      if ((jsonObj.get("resourceIds") != null && !jsonObj.get("resourceIds").isJsonNull()) && !jsonObj.get("resourceIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceIds").toString()));
      }
      if ((jsonObj.get("serviceAllocationId") != null && !jsonObj.get("serviceAllocationId").isJsonNull()) && !jsonObj.get("serviceAllocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAllocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAllocationId").toString()));
      }
      if ((jsonObj.get("serviceId") != null && !jsonObj.get("serviceId").isJsonNull()) && !jsonObj.get("serviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceId").toString()));
      }
      if ((jsonObj.get("timezoneName") != null && !jsonObj.get("timezoneName").isJsonNull()) && !jsonObj.get("timezoneName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneName").toString()));
      }
      if ((jsonObj.get("travelAppointmentId") != null && !jsonObj.get("travelAppointmentId").isJsonNull()) && !jsonObj.get("travelAppointmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelAppointmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelAppointmentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppointmentInitialModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppointmentInitialModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppointmentInitialModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppointmentInitialModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AppointmentInitialModel>() {
           @Override
           public void write(JsonWriter out, AppointmentInitialModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppointmentInitialModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppointmentInitialModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppointmentInitialModel
   * @throws IOException if the JSON string is invalid with respect to AppointmentInitialModel
   */
  public static AppointmentInitialModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppointmentInitialModel.class);
  }

  /**
   * Convert an instance of AppointmentInitialModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

