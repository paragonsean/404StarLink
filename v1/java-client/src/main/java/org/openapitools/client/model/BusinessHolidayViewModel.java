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
 * BusinessHolidayViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:31.714197-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BusinessHolidayViewModel {
  public static final String SERIALIZED_NAME_BUSINESS_CLOSED = "businessClosed";
  @SerializedName(SERIALIZED_NAME_BUSINESS_CLOSED)
  private Boolean businessClosed;

  public static final String SERIALIZED_NAME_HOLIDAY_NAME = "holidayName";
  @SerializedName(SERIALIZED_NAME_HOLIDAY_NAME)
  private String holidayName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUBLIC_HOLIDAY_ID = "publicHolidayId";
  @SerializedName(SERIALIZED_NAME_PUBLIC_HOLIDAY_ID)
  private Integer publicHolidayId;

  public BusinessHolidayViewModel() {
  }

  public BusinessHolidayViewModel businessClosed(Boolean businessClosed) {
    this.businessClosed = businessClosed;
    return this;
  }

  /**
   * Get businessClosed
   * @return businessClosed
   */
  @javax.annotation.Nullable
  public Boolean getBusinessClosed() {
    return businessClosed;
  }

  public void setBusinessClosed(Boolean businessClosed) {
    this.businessClosed = businessClosed;
  }


  public BusinessHolidayViewModel holidayName(String holidayName) {
    this.holidayName = holidayName;
    return this;
  }

  /**
   * Get holidayName
   * @return holidayName
   */
  @javax.annotation.Nullable
  public String getHolidayName() {
    return holidayName;
  }

  public void setHolidayName(String holidayName) {
    this.holidayName = holidayName;
  }


  public BusinessHolidayViewModel id(String id) {
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


  public BusinessHolidayViewModel publicHolidayId(Integer publicHolidayId) {
    this.publicHolidayId = publicHolidayId;
    return this;
  }

  /**
   * Get publicHolidayId
   * @return publicHolidayId
   */
  @javax.annotation.Nullable
  public Integer getPublicHolidayId() {
    return publicHolidayId;
  }

  public void setPublicHolidayId(Integer publicHolidayId) {
    this.publicHolidayId = publicHolidayId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHolidayViewModel businessHolidayViewModel = (BusinessHolidayViewModel) o;
    return Objects.equals(this.businessClosed, businessHolidayViewModel.businessClosed) &&
        Objects.equals(this.holidayName, businessHolidayViewModel.holidayName) &&
        Objects.equals(this.id, businessHolidayViewModel.id) &&
        Objects.equals(this.publicHolidayId, businessHolidayViewModel.publicHolidayId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessClosed, holidayName, id, publicHolidayId);
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
    sb.append("class BusinessHolidayViewModel {\n");
    sb.append("    businessClosed: ").append(toIndentedString(businessClosed)).append("\n");
    sb.append("    holidayName: ").append(toIndentedString(holidayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicHolidayId: ").append(toIndentedString(publicHolidayId)).append("\n");
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
    openapiFields.add("businessClosed");
    openapiFields.add("holidayName");
    openapiFields.add("id");
    openapiFields.add("publicHolidayId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessHolidayViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessHolidayViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessHolidayViewModel is not found in the empty JSON string", BusinessHolidayViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BusinessHolidayViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessHolidayViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("holidayName") != null && !jsonObj.get("holidayName").isJsonNull()) && !jsonObj.get("holidayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holidayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holidayName").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessHolidayViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessHolidayViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessHolidayViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessHolidayViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessHolidayViewModel>() {
           @Override
           public void write(JsonWriter out, BusinessHolidayViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessHolidayViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BusinessHolidayViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessHolidayViewModel
   * @throws IOException if the JSON string is invalid with respect to BusinessHolidayViewModel
   */
  public static BusinessHolidayViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessHolidayViewModel.class);
  }

  /**
   * Convert an instance of BusinessHolidayViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

