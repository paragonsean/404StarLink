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
import org.openapitools.client.model.AddressViewModel;
import org.openapitools.client.model.AppointmentReminderViewModel;
import org.openapitools.client.model.BusinessDefaultsViewModel;
import org.openapitools.client.model.BusinessHolidayViewModel;
import org.openapitools.client.model.BusinessHoursViewModel;
import org.openapitools.client.model.BusinessServiceViewModel;
import org.openapitools.client.model.OnlineSettingsViewModel;
import org.openapitools.client.model.TravelViewModel;
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
 * LocationViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:28.402833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LocationViewModel {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressViewModel address;

  public static final String SERIALIZED_NAME_ADMIN_EMAIL = "adminEmail";
  @SerializedName(SERIALIZED_NAME_ADMIN_EMAIL)
  private String adminEmail;

  public static final String SERIALIZED_NAME_ADMIN_NAME = "adminName";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_APPOINTMENT_REMINDERS = "appointmentReminders";
  @SerializedName(SERIALIZED_NAME_APPOINTMENT_REMINDERS)
  private AppointmentReminderViewModel appointmentReminders;

  public static final String SERIALIZED_NAME_BUSINESS_HOLIDAYS = "businessHolidays";
  @SerializedName(SERIALIZED_NAME_BUSINESS_HOLIDAYS)
  private List<BusinessHolidayViewModel> businessHolidays;

  public static final String SERIALIZED_NAME_BUSINESS_HOURS = "businessHours";
  @SerializedName(SERIALIZED_NAME_BUSINESS_HOURS)
  private BusinessHoursViewModel businessHours;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_DEFAULTS = "defaults";
  @SerializedName(SERIALIZED_NAME_DEFAULTS)
  private BusinessDefaultsViewModel defaults;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_FRIENDLY_ID = "friendlyId";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_ID)
  private String friendlyId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PRIMARY_BUSINESS = "primaryBusiness";
  @SerializedName(SERIALIZED_NAME_PRIMARY_BUSINESS)
  private Boolean primaryBusiness;

  public static final String SERIALIZED_NAME_PRIMARY_CALENDAR_ID = "primaryCalendarId";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CALENDAR_ID)
  private String primaryCalendarId;

  public static final String SERIALIZED_NAME_REGION_ID = "regionId";
  @SerializedName(SERIALIZED_NAME_REGION_ID)
  private String regionId;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<BusinessServiceViewModel> services;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private OnlineSettingsViewModel settings;

  public static final String SERIALIZED_NAME_TIMEZONE_IANA = "timezoneIana";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_IANA)
  private String timezoneIana;

  public static final String SERIALIZED_NAME_TIMEZONE_ID = "timezoneId";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_ID)
  private String timezoneId;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "timezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private Integer timezoneOffset;

  public static final String SERIALIZED_NAME_TRAVEL = "travel";
  @SerializedName(SERIALIZED_NAME_TRAVEL)
  private TravelViewModel travel;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public LocationViewModel() {
  }

  public LocationViewModel address(AddressViewModel address) {
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


  public LocationViewModel adminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
    return this;
  }

  /**
   * Get adminEmail
   * @return adminEmail
   */
  @javax.annotation.Nullable
  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }


  public LocationViewModel adminName(String adminName) {
    this.adminName = adminName;
    return this;
  }

  /**
   * Get adminName
   * @return adminName
   */
  @javax.annotation.Nullable
  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }


  public LocationViewModel appointmentReminders(AppointmentReminderViewModel appointmentReminders) {
    this.appointmentReminders = appointmentReminders;
    return this;
  }

  /**
   * Get appointmentReminders
   * @return appointmentReminders
   */
  @javax.annotation.Nullable
  public AppointmentReminderViewModel getAppointmentReminders() {
    return appointmentReminders;
  }

  public void setAppointmentReminders(AppointmentReminderViewModel appointmentReminders) {
    this.appointmentReminders = appointmentReminders;
  }


  public LocationViewModel businessHolidays(List<BusinessHolidayViewModel> businessHolidays) {
    this.businessHolidays = businessHolidays;
    return this;
  }

  public LocationViewModel addBusinessHolidaysItem(BusinessHolidayViewModel businessHolidaysItem) {
    if (this.businessHolidays == null) {
      this.businessHolidays = new ArrayList<>();
    }
    this.businessHolidays.add(businessHolidaysItem);
    return this;
  }

  /**
   * Get businessHolidays
   * @return businessHolidays
   */
  @javax.annotation.Nullable
  public List<BusinessHolidayViewModel> getBusinessHolidays() {
    return businessHolidays;
  }

  public void setBusinessHolidays(List<BusinessHolidayViewModel> businessHolidays) {
    this.businessHolidays = businessHolidays;
  }


  public LocationViewModel businessHours(BusinessHoursViewModel businessHours) {
    this.businessHours = businessHours;
    return this;
  }

  /**
   * Get businessHours
   * @return businessHours
   */
  @javax.annotation.Nullable
  public BusinessHoursViewModel getBusinessHours() {
    return businessHours;
  }

  public void setBusinessHours(BusinessHoursViewModel businessHours) {
    this.businessHours = businessHours;
  }


  public LocationViewModel companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public LocationViewModel companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public LocationViewModel defaults(BusinessDefaultsViewModel defaults) {
    this.defaults = defaults;
    return this;
  }

  /**
   * Get defaults
   * @return defaults
   */
  @javax.annotation.Nullable
  public BusinessDefaultsViewModel getDefaults() {
    return defaults;
  }

  public void setDefaults(BusinessDefaultsViewModel defaults) {
    this.defaults = defaults;
  }


  public LocationViewModel email(String email) {
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


  public LocationViewModel fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
   */
  @javax.annotation.Nullable
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public LocationViewModel friendlyId(String friendlyId) {
    this.friendlyId = friendlyId;
    return this;
  }

  /**
   * Get friendlyId
   * @return friendlyId
   */
  @javax.annotation.Nullable
  public String getFriendlyId() {
    return friendlyId;
  }

  public void setFriendlyId(String friendlyId) {
    this.friendlyId = friendlyId;
  }


  public LocationViewModel id(String id) {
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


  public LocationViewModel imageUrl(String imageUrl) {
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


  public LocationViewModel latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public LocationViewModel logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }


  public LocationViewModel longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public LocationViewModel name(String name) {
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


  public LocationViewModel _object(String _object) {
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


  public LocationViewModel phone(String phone) {
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


  public LocationViewModel primaryBusiness(Boolean primaryBusiness) {
    this.primaryBusiness = primaryBusiness;
    return this;
  }

  /**
   * Get primaryBusiness
   * @return primaryBusiness
   */
  @javax.annotation.Nullable
  public Boolean getPrimaryBusiness() {
    return primaryBusiness;
  }

  public void setPrimaryBusiness(Boolean primaryBusiness) {
    this.primaryBusiness = primaryBusiness;
  }


  public LocationViewModel primaryCalendarId(String primaryCalendarId) {
    this.primaryCalendarId = primaryCalendarId;
    return this;
  }

  /**
   * Get primaryCalendarId
   * @return primaryCalendarId
   */
  @javax.annotation.Nullable
  public String getPrimaryCalendarId() {
    return primaryCalendarId;
  }

  public void setPrimaryCalendarId(String primaryCalendarId) {
    this.primaryCalendarId = primaryCalendarId;
  }


  public LocationViewModel regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Get regionId
   * @return regionId
   */
  @javax.annotation.Nullable
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  public LocationViewModel services(List<BusinessServiceViewModel> services) {
    this.services = services;
    return this;
  }

  public LocationViewModel addServicesItem(BusinessServiceViewModel servicesItem) {
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
  public List<BusinessServiceViewModel> getServices() {
    return services;
  }

  public void setServices(List<BusinessServiceViewModel> services) {
    this.services = services;
  }


  public LocationViewModel settings(OnlineSettingsViewModel settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @javax.annotation.Nullable
  public OnlineSettingsViewModel getSettings() {
    return settings;
  }

  public void setSettings(OnlineSettingsViewModel settings) {
    this.settings = settings;
  }


  public LocationViewModel timezoneIana(String timezoneIana) {
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


  public LocationViewModel timezoneId(String timezoneId) {
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


  public LocationViewModel timezoneOffset(Integer timezoneOffset) {
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


  public LocationViewModel travel(TravelViewModel travel) {
    this.travel = travel;
    return this;
  }

  /**
   * Get travel
   * @return travel
   */
  @javax.annotation.Nullable
  public TravelViewModel getTravel() {
    return travel;
  }

  public void setTravel(TravelViewModel travel) {
    this.travel = travel;
  }


  public LocationViewModel website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
   */
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationViewModel locationViewModel = (LocationViewModel) o;
    return Objects.equals(this.address, locationViewModel.address) &&
        Objects.equals(this.adminEmail, locationViewModel.adminEmail) &&
        Objects.equals(this.adminName, locationViewModel.adminName) &&
        Objects.equals(this.appointmentReminders, locationViewModel.appointmentReminders) &&
        Objects.equals(this.businessHolidays, locationViewModel.businessHolidays) &&
        Objects.equals(this.businessHours, locationViewModel.businessHours) &&
        Objects.equals(this.companyId, locationViewModel.companyId) &&
        Objects.equals(this.companyName, locationViewModel.companyName) &&
        Objects.equals(this.defaults, locationViewModel.defaults) &&
        Objects.equals(this.email, locationViewModel.email) &&
        Objects.equals(this.fax, locationViewModel.fax) &&
        Objects.equals(this.friendlyId, locationViewModel.friendlyId) &&
        Objects.equals(this.id, locationViewModel.id) &&
        Objects.equals(this.imageUrl, locationViewModel.imageUrl) &&
        Objects.equals(this.latitude, locationViewModel.latitude) &&
        Objects.equals(this.logo, locationViewModel.logo) &&
        Objects.equals(this.longitude, locationViewModel.longitude) &&
        Objects.equals(this.name, locationViewModel.name) &&
        Objects.equals(this._object, locationViewModel._object) &&
        Objects.equals(this.phone, locationViewModel.phone) &&
        Objects.equals(this.primaryBusiness, locationViewModel.primaryBusiness) &&
        Objects.equals(this.primaryCalendarId, locationViewModel.primaryCalendarId) &&
        Objects.equals(this.regionId, locationViewModel.regionId) &&
        Objects.equals(this.services, locationViewModel.services) &&
        Objects.equals(this.settings, locationViewModel.settings) &&
        Objects.equals(this.timezoneIana, locationViewModel.timezoneIana) &&
        Objects.equals(this.timezoneId, locationViewModel.timezoneId) &&
        Objects.equals(this.timezoneOffset, locationViewModel.timezoneOffset) &&
        Objects.equals(this.travel, locationViewModel.travel) &&
        Objects.equals(this.website, locationViewModel.website);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, adminEmail, adminName, appointmentReminders, businessHolidays, businessHours, companyId, companyName, defaults, email, fax, friendlyId, id, imageUrl, latitude, logo, longitude, name, _object, phone, primaryBusiness, primaryCalendarId, regionId, services, settings, timezoneIana, timezoneId, timezoneOffset, travel, website);
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
    sb.append("class LocationViewModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    appointmentReminders: ").append(toIndentedString(appointmentReminders)).append("\n");
    sb.append("    businessHolidays: ").append(toIndentedString(businessHolidays)).append("\n");
    sb.append("    businessHours: ").append(toIndentedString(businessHours)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    friendlyId: ").append(toIndentedString(friendlyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    primaryBusiness: ").append(toIndentedString(primaryBusiness)).append("\n");
    sb.append("    primaryCalendarId: ").append(toIndentedString(primaryCalendarId)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    timezoneIana: ").append(toIndentedString(timezoneIana)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
    openapiFields.add("adminEmail");
    openapiFields.add("adminName");
    openapiFields.add("appointmentReminders");
    openapiFields.add("businessHolidays");
    openapiFields.add("businessHours");
    openapiFields.add("companyId");
    openapiFields.add("companyName");
    openapiFields.add("defaults");
    openapiFields.add("email");
    openapiFields.add("fax");
    openapiFields.add("friendlyId");
    openapiFields.add("id");
    openapiFields.add("imageUrl");
    openapiFields.add("latitude");
    openapiFields.add("logo");
    openapiFields.add("longitude");
    openapiFields.add("name");
    openapiFields.add("object");
    openapiFields.add("phone");
    openapiFields.add("primaryBusiness");
    openapiFields.add("primaryCalendarId");
    openapiFields.add("regionId");
    openapiFields.add("services");
    openapiFields.add("settings");
    openapiFields.add("timezoneIana");
    openapiFields.add("timezoneId");
    openapiFields.add("timezoneOffset");
    openapiFields.add("travel");
    openapiFields.add("website");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LocationViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LocationViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationViewModel is not found in the empty JSON string", LocationViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LocationViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocationViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        AddressViewModel.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("adminEmail") != null && !jsonObj.get("adminEmail").isJsonNull()) && !jsonObj.get("adminEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adminEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adminEmail").toString()));
      }
      if ((jsonObj.get("adminName") != null && !jsonObj.get("adminName").isJsonNull()) && !jsonObj.get("adminName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adminName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adminName").toString()));
      }
      // validate the optional field `appointmentReminders`
      if (jsonObj.get("appointmentReminders") != null && !jsonObj.get("appointmentReminders").isJsonNull()) {
        AppointmentReminderViewModel.validateJsonElement(jsonObj.get("appointmentReminders"));
      }
      if (jsonObj.get("businessHolidays") != null && !jsonObj.get("businessHolidays").isJsonNull()) {
        JsonArray jsonArraybusinessHolidays = jsonObj.getAsJsonArray("businessHolidays");
        if (jsonArraybusinessHolidays != null) {
          // ensure the json data is an array
          if (!jsonObj.get("businessHolidays").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `businessHolidays` to be an array in the JSON string but got `%s`", jsonObj.get("businessHolidays").toString()));
          }

          // validate the optional field `businessHolidays` (array)
          for (int i = 0; i < jsonArraybusinessHolidays.size(); i++) {
            BusinessHolidayViewModel.validateJsonElement(jsonArraybusinessHolidays.get(i));
          };
        }
      }
      // validate the optional field `businessHours`
      if (jsonObj.get("businessHours") != null && !jsonObj.get("businessHours").isJsonNull()) {
        BusinessHoursViewModel.validateJsonElement(jsonObj.get("businessHours"));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      // validate the optional field `defaults`
      if (jsonObj.get("defaults") != null && !jsonObj.get("defaults").isJsonNull()) {
        BusinessDefaultsViewModel.validateJsonElement(jsonObj.get("defaults"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      if ((jsonObj.get("friendlyId") != null && !jsonObj.get("friendlyId").isJsonNull()) && !jsonObj.get("friendlyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendlyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendlyId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("primaryCalendarId") != null && !jsonObj.get("primaryCalendarId").isJsonNull()) && !jsonObj.get("primaryCalendarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryCalendarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryCalendarId").toString()));
      }
      if ((jsonObj.get("regionId") != null && !jsonObj.get("regionId").isJsonNull()) && !jsonObj.get("regionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionId").toString()));
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
            BusinessServiceViewModel.validateJsonElement(jsonArrayservices.get(i));
          };
        }
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        OnlineSettingsViewModel.validateJsonElement(jsonObj.get("settings"));
      }
      if ((jsonObj.get("timezoneIana") != null && !jsonObj.get("timezoneIana").isJsonNull()) && !jsonObj.get("timezoneIana").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneIana` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneIana").toString()));
      }
      if ((jsonObj.get("timezoneId") != null && !jsonObj.get("timezoneId").isJsonNull()) && !jsonObj.get("timezoneId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneId").toString()));
      }
      // validate the optional field `travel`
      if (jsonObj.get("travel") != null && !jsonObj.get("travel").isJsonNull()) {
        TravelViewModel.validateJsonElement(jsonObj.get("travel"));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationViewModel>() {
           @Override
           public void write(JsonWriter out, LocationViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocationViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LocationViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LocationViewModel
   * @throws IOException if the JSON string is invalid with respect to LocationViewModel
   */
  public static LocationViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationViewModel.class);
  }

  /**
   * Convert an instance of LocationViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

