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
import org.openapitools.client.model.AddressViewModel;
import org.openapitools.client.model.ContactViewModel;
import org.openapitools.client.model.CustomFieldInputModel;
import org.openapitools.client.model.ResourceHoursViewModel;
import org.openapitools.client.model.ResourceServiceViewModel;
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
 * ResourceViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:34.980638-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceViewModel {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressViewModel address;

  public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private ResourceHoursViewModel availability;

  public static final String SERIALIZED_NAME_BIO_LINK = "bioLink";
  @SerializedName(SERIALIZED_NAME_BIO_LINK)
  private String bioLink;

  public static final String SERIALIZED_NAME_BOOKING_NOTIFICATION = "bookingNotification";
  @SerializedName(SERIALIZED_NAME_BOOKING_NOTIFICATION)
  private Integer bookingNotification;

  public static final String SERIALIZED_NAME_CALENDAR_AVAILABILITY = "calendarAvailability";
  @SerializedName(SERIALIZED_NAME_CALENDAR_AVAILABILITY)
  private Integer calendarAvailability;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private ContactViewModel contact;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private CustomFieldInputModel customFields;

  public static final String SERIALIZED_NAME_DELETED_STATUS = "deletedStatus";
  @SerializedName(SERIALIZED_NAME_DELETED_STATUS)
  private Boolean deletedStatus;

  public static final String SERIALIZED_NAME_DELETED_TIME = "deletedTime";
  @SerializedName(SERIALIZED_NAME_DELETED_TIME)
  private OffsetDateTime deletedTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_GOOGLE_CALENDAR_ID = "googleCalendarId";
  @SerializedName(SERIALIZED_NAME_GOOGLE_CALENDAR_ID)
  private String googleCalendarId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_HOURLY = "hourly";
  @SerializedName(SERIALIZED_NAME_HOURLY)
  private Double hourly;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IGNORE_BUSINESS_HOURS = "ignoreBusinessHours";
  @SerializedName(SERIALIZED_NAME_IGNORE_BUSINESS_HOURS)
  private Boolean ignoreBusinessHours;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private Integer notificationType;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_OUTLOOK_CALENDAR_ID = "outlookCalendarId";
  @SerializedName(SERIALIZED_NAME_OUTLOOK_CALENDAR_ID)
  private String outlookCalendarId;

  public static final String SERIALIZED_NAME_RECURRING_AVAILABILITY = "recurringAvailability";
  @SerializedName(SERIALIZED_NAME_RECURRING_AVAILABILITY)
  private Boolean recurringAvailability;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<ResourceServiceViewModel> services;

  public static final String SERIALIZED_NAME_SKYPE_NAME = "skypeName";
  @SerializedName(SERIALIZED_NAME_SKYPE_NAME)
  private String skypeName;

  public static final String SERIALIZED_NAME_SORT_KEY = "sortKey";
  @SerializedName(SERIALIZED_NAME_SORT_KEY)
  private Integer sortKey;

  public static final String SERIALIZED_NAME_TIMEZONE_IANA = "timezoneIana";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_IANA)
  private String timezoneIana;

  public static final String SERIALIZED_NAME_TIMEZONE_ID = "timezoneId";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_ID)
  private String timezoneId;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "timezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private Integer timezoneOffset;

  public ResourceViewModel() {
  }

  public ResourceViewModel address(AddressViewModel address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public AddressViewModel getAddress() {
    return address;
  }

  public void setAddress(AddressViewModel address) {
    this.address = address;
  }


  public ResourceViewModel availability(ResourceHoursViewModel availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @javax.annotation.Nullable
  public ResourceHoursViewModel getAvailability() {
    return availability;
  }

  public void setAvailability(ResourceHoursViewModel availability) {
    this.availability = availability;
  }


  public ResourceViewModel bioLink(String bioLink) {
    this.bioLink = bioLink;
    return this;
  }

  /**
   * Get bioLink
   * @return bioLink
   */
  @javax.annotation.Nullable
  public String getBioLink() {
    return bioLink;
  }

  public void setBioLink(String bioLink) {
    this.bioLink = bioLink;
  }


  public ResourceViewModel bookingNotification(Integer bookingNotification) {
    this.bookingNotification = bookingNotification;
    return this;
  }

  /**
   * Get bookingNotification
   * @return bookingNotification
   */
  @javax.annotation.Nullable
  public Integer getBookingNotification() {
    return bookingNotification;
  }

  public void setBookingNotification(Integer bookingNotification) {
    this.bookingNotification = bookingNotification;
  }


  public ResourceViewModel calendarAvailability(Integer calendarAvailability) {
    this.calendarAvailability = calendarAvailability;
    return this;
  }

  /**
   * Get calendarAvailability
   * @return calendarAvailability
   */
  @javax.annotation.Nullable
  public Integer getCalendarAvailability() {
    return calendarAvailability;
  }

  public void setCalendarAvailability(Integer calendarAvailability) {
    this.calendarAvailability = calendarAvailability;
  }


  public ResourceViewModel contact(ContactViewModel contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @javax.annotation.Nullable
  public ContactViewModel getContact() {
    return contact;
  }

  public void setContact(ContactViewModel contact) {
    this.contact = contact;
  }


  public ResourceViewModel customFields(CustomFieldInputModel customFields) {
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


  public ResourceViewModel deletedStatus(Boolean deletedStatus) {
    this.deletedStatus = deletedStatus;
    return this;
  }

  /**
   * Get deletedStatus
   * @return deletedStatus
   */
  @javax.annotation.Nullable
  public Boolean getDeletedStatus() {
    return deletedStatus;
  }

  public void setDeletedStatus(Boolean deletedStatus) {
    this.deletedStatus = deletedStatus;
  }


  public ResourceViewModel deletedTime(OffsetDateTime deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

  /**
   * Get deletedTime
   * @return deletedTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(OffsetDateTime deletedTime) {
    this.deletedTime = deletedTime;
  }


  public ResourceViewModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ResourceViewModel effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public ResourceViewModel email(String email) {
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


  public ResourceViewModel gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public ResourceViewModel googleCalendarId(String googleCalendarId) {
    this.googleCalendarId = googleCalendarId;
    return this;
  }

  /**
   * Get googleCalendarId
   * @return googleCalendarId
   */
  @javax.annotation.Nullable
  public String getGoogleCalendarId() {
    return googleCalendarId;
  }

  public void setGoogleCalendarId(String googleCalendarId) {
    this.googleCalendarId = googleCalendarId;
  }


  public ResourceViewModel groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ResourceViewModel hourly(Double hourly) {
    this.hourly = hourly;
    return this;
  }

  /**
   * Get hourly
   * @return hourly
   */
  @javax.annotation.Nullable
  public Double getHourly() {
    return hourly;
  }

  public void setHourly(Double hourly) {
    this.hourly = hourly;
  }


  public ResourceViewModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ResourceViewModel ignoreBusinessHours(Boolean ignoreBusinessHours) {
    this.ignoreBusinessHours = ignoreBusinessHours;
    return this;
  }

  /**
   * Get ignoreBusinessHours
   * @return ignoreBusinessHours
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreBusinessHours() {
    return ignoreBusinessHours;
  }

  public void setIgnoreBusinessHours(Boolean ignoreBusinessHours) {
    this.ignoreBusinessHours = ignoreBusinessHours;
  }


  public ResourceViewModel imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public ResourceViewModel locationId(String locationId) {
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


  public ResourceViewModel name(String name) {
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


  public ResourceViewModel notificationType(Integer notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   * @return notificationType
   */
  @javax.annotation.Nullable
  public Integer getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(Integer notificationType) {
    this.notificationType = notificationType;
  }


  public ResourceViewModel _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }


  public ResourceViewModel outlookCalendarId(String outlookCalendarId) {
    this.outlookCalendarId = outlookCalendarId;
    return this;
  }

  /**
   * Get outlookCalendarId
   * @return outlookCalendarId
   */
  @javax.annotation.Nullable
  public String getOutlookCalendarId() {
    return outlookCalendarId;
  }

  public void setOutlookCalendarId(String outlookCalendarId) {
    this.outlookCalendarId = outlookCalendarId;
  }


  public ResourceViewModel recurringAvailability(Boolean recurringAvailability) {
    this.recurringAvailability = recurringAvailability;
    return this;
  }

  /**
   * Get recurringAvailability
   * @return recurringAvailability
   */
  @javax.annotation.Nullable
  public Boolean getRecurringAvailability() {
    return recurringAvailability;
  }

  public void setRecurringAvailability(Boolean recurringAvailability) {
    this.recurringAvailability = recurringAvailability;
  }


  public ResourceViewModel services(List<ResourceServiceViewModel> services) {
    this.services = services;
    return this;
  }

  public ResourceViewModel addServicesItem(ResourceServiceViewModel servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
   */
  @javax.annotation.Nullable
  public List<ResourceServiceViewModel> getServices() {
    return services;
  }

  public void setServices(List<ResourceServiceViewModel> services) {
    this.services = services;
  }


  public ResourceViewModel skypeName(String skypeName) {
    this.skypeName = skypeName;
    return this;
  }

  /**
   * Get skypeName
   * @return skypeName
   */
  @javax.annotation.Nullable
  public String getSkypeName() {
    return skypeName;
  }

  public void setSkypeName(String skypeName) {
    this.skypeName = skypeName;
  }


  public ResourceViewModel sortKey(Integer sortKey) {
    this.sortKey = sortKey;
    return this;
  }

  /**
   * Get sortKey
   * @return sortKey
   */
  @javax.annotation.Nullable
  public Integer getSortKey() {
    return sortKey;
  }

  public void setSortKey(Integer sortKey) {
    this.sortKey = sortKey;
  }


  public ResourceViewModel timezoneIana(String timezoneIana) {
    this.timezoneIana = timezoneIana;
    return this;
  }

  /**
   * Get timezoneIana
   * @return timezoneIana
   */
  @javax.annotation.Nullable
  public String getTimezoneIana() {
    return timezoneIana;
  }

  public void setTimezoneIana(String timezoneIana) {
    this.timezoneIana = timezoneIana;
  }


  public ResourceViewModel timezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  /**
   * Get timezoneId
   * @return timezoneId
   */
  @javax.annotation.Nullable
  public String getTimezoneId() {
    return timezoneId;
  }

  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }


  public ResourceViewModel timezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

  /**
   * Get timezoneOffset
   * @return timezoneOffset
   */
  @javax.annotation.Nullable
  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceViewModel resourceViewModel = (ResourceViewModel) o;
    return Objects.equals(this.address, resourceViewModel.address) &&
        Objects.equals(this.availability, resourceViewModel.availability) &&
        Objects.equals(this.bioLink, resourceViewModel.bioLink) &&
        Objects.equals(this.bookingNotification, resourceViewModel.bookingNotification) &&
        Objects.equals(this.calendarAvailability, resourceViewModel.calendarAvailability) &&
        Objects.equals(this.contact, resourceViewModel.contact) &&
        Objects.equals(this.customFields, resourceViewModel.customFields) &&
        Objects.equals(this.deletedStatus, resourceViewModel.deletedStatus) &&
        Objects.equals(this.deletedTime, resourceViewModel.deletedTime) &&
        Objects.equals(this.description, resourceViewModel.description) &&
        Objects.equals(this.effectiveDate, resourceViewModel.effectiveDate) &&
        Objects.equals(this.email, resourceViewModel.email) &&
        Objects.equals(this.gender, resourceViewModel.gender) &&
        Objects.equals(this.googleCalendarId, resourceViewModel.googleCalendarId) &&
        Objects.equals(this.groupId, resourceViewModel.groupId) &&
        Objects.equals(this.hourly, resourceViewModel.hourly) &&
        Objects.equals(this.id, resourceViewModel.id) &&
        Objects.equals(this.ignoreBusinessHours, resourceViewModel.ignoreBusinessHours) &&
        Objects.equals(this.imageUrl, resourceViewModel.imageUrl) &&
        Objects.equals(this.locationId, resourceViewModel.locationId) &&
        Objects.equals(this.name, resourceViewModel.name) &&
        Objects.equals(this.notificationType, resourceViewModel.notificationType) &&
        Objects.equals(this._object, resourceViewModel._object) &&
        Objects.equals(this.outlookCalendarId, resourceViewModel.outlookCalendarId) &&
        Objects.equals(this.recurringAvailability, resourceViewModel.recurringAvailability) &&
        Objects.equals(this.services, resourceViewModel.services) &&
        Objects.equals(this.skypeName, resourceViewModel.skypeName) &&
        Objects.equals(this.sortKey, resourceViewModel.sortKey) &&
        Objects.equals(this.timezoneIana, resourceViewModel.timezoneIana) &&
        Objects.equals(this.timezoneId, resourceViewModel.timezoneId) &&
        Objects.equals(this.timezoneOffset, resourceViewModel.timezoneOffset);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, availability, bioLink, bookingNotification, calendarAvailability, contact, customFields, deletedStatus, deletedTime, description, effectiveDate, email, gender, googleCalendarId, groupId, hourly, id, ignoreBusinessHours, imageUrl, locationId, name, notificationType, _object, outlookCalendarId, recurringAvailability, services, skypeName, sortKey, timezoneIana, timezoneId, timezoneOffset);
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
    sb.append("class ResourceViewModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    bioLink: ").append(toIndentedString(bioLink)).append("\n");
    sb.append("    bookingNotification: ").append(toIndentedString(bookingNotification)).append("\n");
    sb.append("    calendarAvailability: ").append(toIndentedString(calendarAvailability)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    deletedStatus: ").append(toIndentedString(deletedStatus)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    googleCalendarId: ").append(toIndentedString(googleCalendarId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    hourly: ").append(toIndentedString(hourly)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreBusinessHours: ").append(toIndentedString(ignoreBusinessHours)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    outlookCalendarId: ").append(toIndentedString(outlookCalendarId)).append("\n");
    sb.append("    recurringAvailability: ").append(toIndentedString(recurringAvailability)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    skypeName: ").append(toIndentedString(skypeName)).append("\n");
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
    sb.append("    timezoneIana: ").append(toIndentedString(timezoneIana)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("availability");
    openapiFields.add("bioLink");
    openapiFields.add("bookingNotification");
    openapiFields.add("calendarAvailability");
    openapiFields.add("contact");
    openapiFields.add("customFields");
    openapiFields.add("deletedStatus");
    openapiFields.add("deletedTime");
    openapiFields.add("description");
    openapiFields.add("effectiveDate");
    openapiFields.add("email");
    openapiFields.add("gender");
    openapiFields.add("googleCalendarId");
    openapiFields.add("groupId");
    openapiFields.add("hourly");
    openapiFields.add("id");
    openapiFields.add("ignoreBusinessHours");
    openapiFields.add("imageUrl");
    openapiFields.add("locationId");
    openapiFields.add("name");
    openapiFields.add("notificationType");
    openapiFields.add("object");
    openapiFields.add("outlookCalendarId");
    openapiFields.add("recurringAvailability");
    openapiFields.add("services");
    openapiFields.add("skypeName");
    openapiFields.add("sortKey");
    openapiFields.add("timezoneIana");
    openapiFields.add("timezoneId");
    openapiFields.add("timezoneOffset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceViewModel is not found in the empty JSON string", ResourceViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        AddressViewModel.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `availability`
      if (jsonObj.get("availability") != null && !jsonObj.get("availability").isJsonNull()) {
        ResourceHoursViewModel.validateJsonElement(jsonObj.get("availability"));
      }
      if ((jsonObj.get("bioLink") != null && !jsonObj.get("bioLink").isJsonNull()) && !jsonObj.get("bioLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bioLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bioLink").toString()));
      }
      // validate the optional field `contact`
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) {
        ContactViewModel.validateJsonElement(jsonObj.get("contact"));
      }
      // validate the optional field `customFields`
      if (jsonObj.get("customFields") != null && !jsonObj.get("customFields").isJsonNull()) {
        CustomFieldInputModel.validateJsonElement(jsonObj.get("customFields"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("googleCalendarId") != null && !jsonObj.get("googleCalendarId").isJsonNull()) && !jsonObj.get("googleCalendarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googleCalendarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googleCalendarId").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("outlookCalendarId") != null && !jsonObj.get("outlookCalendarId").isJsonNull()) && !jsonObj.get("outlookCalendarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlookCalendarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlookCalendarId").toString()));
      }
      if (jsonObj.get("services") != null && !jsonObj.get("services").isJsonNull()) {
        JsonArray jsonArrayservices = jsonObj.getAsJsonArray("services");
        if (jsonArrayservices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("services").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `services` to be an array in the JSON string but got `%s`", jsonObj.get("services").toString()));
          }

          // validate the optional field `services` (array)
          for (int i = 0; i < jsonArrayservices.size(); i++) {
            ResourceServiceViewModel.validateJsonElement(jsonArrayservices.get(i));
          };
        }
      }
      if ((jsonObj.get("skypeName") != null && !jsonObj.get("skypeName").isJsonNull()) && !jsonObj.get("skypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skypeName").toString()));
      }
      if ((jsonObj.get("timezoneIana") != null && !jsonObj.get("timezoneIana").isJsonNull()) && !jsonObj.get("timezoneIana").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneIana` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneIana").toString()));
      }
      if ((jsonObj.get("timezoneId") != null && !jsonObj.get("timezoneId").isJsonNull()) && !jsonObj.get("timezoneId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceViewModel>() {
           @Override
           public void write(JsonWriter out, ResourceViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceViewModel
   * @throws IOException if the JSON string is invalid with respect to ResourceViewModel
   */
  public static ResourceViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceViewModel.class);
  }

  /**
   * Convert an instance of ResourceViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

