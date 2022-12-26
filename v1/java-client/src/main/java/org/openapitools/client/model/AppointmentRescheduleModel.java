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
import java.util.Arrays;
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
 * AppointmentRescheduleModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:31.714197-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AppointmentRescheduleModel {
  public static final String SERIALIZED_NAME_END_DATE_TIME = "endDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_IDS = "resourceIds";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDS)
  private String resourceIds;

  public static final String SERIALIZED_NAME_SERVICE_ID = "serviceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_TRAVEL_APPOINTMENT_ID = "travelAppointmentId";
  @SerializedName(SERIALIZED_NAME_TRAVEL_APPOINTMENT_ID)
  private String travelAppointmentId;

  public static final String SERIALIZED_NAME_TRAVEL_TIME_MINS = "travelTimeMins";
  @SerializedName(SERIALIZED_NAME_TRAVEL_TIME_MINS)
  private Integer travelTimeMins;

  public AppointmentRescheduleModel() {
  }

  public AppointmentRescheduleModel endDateTime(OffsetDateTime endDateTime) {
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


  public AppointmentRescheduleModel resourceId(String resourceId) {
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


  public AppointmentRescheduleModel resourceIds(String resourceIds) {
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


  public AppointmentRescheduleModel serviceId(String serviceId) {
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


  public AppointmentRescheduleModel startDateTime(OffsetDateTime startDateTime) {
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


  public AppointmentRescheduleModel travelAppointmentId(String travelAppointmentId) {
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


  public AppointmentRescheduleModel travelTimeMins(Integer travelTimeMins) {
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
    AppointmentRescheduleModel appointmentRescheduleModel = (AppointmentRescheduleModel) o;
    return Objects.equals(this.endDateTime, appointmentRescheduleModel.endDateTime) &&
        Objects.equals(this.resourceId, appointmentRescheduleModel.resourceId) &&
        Objects.equals(this.resourceIds, appointmentRescheduleModel.resourceIds) &&
        Objects.equals(this.serviceId, appointmentRescheduleModel.serviceId) &&
        Objects.equals(this.startDateTime, appointmentRescheduleModel.startDateTime) &&
        Objects.equals(this.travelAppointmentId, appointmentRescheduleModel.travelAppointmentId) &&
        Objects.equals(this.travelTimeMins, appointmentRescheduleModel.travelTimeMins);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, resourceId, resourceIds, serviceId, startDateTime, travelAppointmentId, travelTimeMins);
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
    sb.append("class AppointmentRescheduleModel {\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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
    openapiFields.add("endDateTime");
    openapiFields.add("resourceId");
    openapiFields.add("resourceIds");
    openapiFields.add("serviceId");
    openapiFields.add("startDateTime");
    openapiFields.add("travelAppointmentId");
    openapiFields.add("travelTimeMins");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppointmentRescheduleModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppointmentRescheduleModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppointmentRescheduleModel is not found in the empty JSON string", AppointmentRescheduleModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppointmentRescheduleModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppointmentRescheduleModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("resourceId") != null && !jsonObj.get("resourceId").isJsonNull()) && !jsonObj.get("resourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceId").toString()));
      }
      if ((jsonObj.get("resourceIds") != null && !jsonObj.get("resourceIds").isJsonNull()) && !jsonObj.get("resourceIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceIds").toString()));
      }
      if ((jsonObj.get("serviceId") != null && !jsonObj.get("serviceId").isJsonNull()) && !jsonObj.get("serviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceId").toString()));
      }
      if ((jsonObj.get("travelAppointmentId") != null && !jsonObj.get("travelAppointmentId").isJsonNull()) && !jsonObj.get("travelAppointmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelAppointmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelAppointmentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppointmentRescheduleModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppointmentRescheduleModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppointmentRescheduleModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppointmentRescheduleModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AppointmentRescheduleModel>() {
           @Override
           public void write(JsonWriter out, AppointmentRescheduleModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppointmentRescheduleModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppointmentRescheduleModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppointmentRescheduleModel
   * @throws IOException if the JSON string is invalid with respect to AppointmentRescheduleModel
   */
  public static AppointmentRescheduleModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppointmentRescheduleModel.class);
  }

  /**
   * Convert an instance of AppointmentRescheduleModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

