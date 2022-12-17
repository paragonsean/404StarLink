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
 * ContactViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:07.204560-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContactViewModel {
  public static final String SERIALIZED_NAME_BUSINESS_PHONE = "businessPhone";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE)
  private String businessPhone;

  public static final String SERIALIZED_NAME_BUSINESS_PHONE_EXT = "businessPhoneExt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE_EXT)
  private String businessPhoneExt;

  public static final String SERIALIZED_NAME_CONFERENCE_INFO = "conferenceInfo";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_INFO)
  private String conferenceInfo;

  public static final String SERIALIZED_NAME_HOME_PHONE = "homePhone";
  @SerializedName(SERIALIZED_NAME_HOME_PHONE)
  private String homePhone;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private String phoneType;

  public static final String SERIALIZED_NAME_SKYPE_USERNAME = "skypeUsername";
  @SerializedName(SERIALIZED_NAME_SKYPE_USERNAME)
  private String skypeUsername;

  public ContactViewModel() {
  }

  public ContactViewModel businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

  /**
   * Get businessPhone
   * @return businessPhone
   */
  @javax.annotation.Nullable
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }


  public ContactViewModel businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

  /**
   * Get businessPhoneExt
   * @return businessPhoneExt
   */
  @javax.annotation.Nullable
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }


  public ContactViewModel conferenceInfo(String conferenceInfo) {
    this.conferenceInfo = conferenceInfo;
    return this;
  }

  /**
   * Get conferenceInfo
   * @return conferenceInfo
   */
  @javax.annotation.Nullable
  public String getConferenceInfo() {
    return conferenceInfo;
  }

  public void setConferenceInfo(String conferenceInfo) {
    this.conferenceInfo = conferenceInfo;
  }


  public ContactViewModel homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  /**
   * Get homePhone
   * @return homePhone
   */
  @javax.annotation.Nullable
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }


  public ContactViewModel mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  /**
   * Get mobilePhone
   * @return mobilePhone
   */
  @javax.annotation.Nullable
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public ContactViewModel phoneType(String phoneType) {
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


  public ContactViewModel skypeUsername(String skypeUsername) {
    this.skypeUsername = skypeUsername;
    return this;
  }

  /**
   * Get skypeUsername
   * @return skypeUsername
   */
  @javax.annotation.Nullable
  public String getSkypeUsername() {
    return skypeUsername;
  }

  public void setSkypeUsername(String skypeUsername) {
    this.skypeUsername = skypeUsername;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactViewModel contactViewModel = (ContactViewModel) o;
    return Objects.equals(this.businessPhone, contactViewModel.businessPhone) &&
        Objects.equals(this.businessPhoneExt, contactViewModel.businessPhoneExt) &&
        Objects.equals(this.conferenceInfo, contactViewModel.conferenceInfo) &&
        Objects.equals(this.homePhone, contactViewModel.homePhone) &&
        Objects.equals(this.mobilePhone, contactViewModel.mobilePhone) &&
        Objects.equals(this.phoneType, contactViewModel.phoneType) &&
        Objects.equals(this.skypeUsername, contactViewModel.skypeUsername);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessPhone, businessPhoneExt, conferenceInfo, homePhone, mobilePhone, phoneType, skypeUsername);
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
    sb.append("class ContactViewModel {\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhoneExt: ").append(toIndentedString(businessPhoneExt)).append("\n");
    sb.append("    conferenceInfo: ").append(toIndentedString(conferenceInfo)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    skypeUsername: ").append(toIndentedString(skypeUsername)).append("\n");
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
    openapiFields.add("businessPhone");
    openapiFields.add("businessPhoneExt");
    openapiFields.add("conferenceInfo");
    openapiFields.add("homePhone");
    openapiFields.add("mobilePhone");
    openapiFields.add("phoneType");
    openapiFields.add("skypeUsername");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContactViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContactViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactViewModel is not found in the empty JSON string", ContactViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContactViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("businessPhone") != null && !jsonObj.get("businessPhone").isJsonNull()) && !jsonObj.get("businessPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessPhone").toString()));
      }
      if ((jsonObj.get("businessPhoneExt") != null && !jsonObj.get("businessPhoneExt").isJsonNull()) && !jsonObj.get("businessPhoneExt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessPhoneExt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessPhoneExt").toString()));
      }
      if ((jsonObj.get("conferenceInfo") != null && !jsonObj.get("conferenceInfo").isJsonNull()) && !jsonObj.get("conferenceInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conferenceInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conferenceInfo").toString()));
      }
      if ((jsonObj.get("homePhone") != null && !jsonObj.get("homePhone").isJsonNull()) && !jsonObj.get("homePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homePhone").toString()));
      }
      if ((jsonObj.get("mobilePhone") != null && !jsonObj.get("mobilePhone").isJsonNull()) && !jsonObj.get("mobilePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobilePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobilePhone").toString()));
      }
      if ((jsonObj.get("phoneType") != null && !jsonObj.get("phoneType").isJsonNull()) && !jsonObj.get("phoneType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneType").toString()));
      }
      if ((jsonObj.get("skypeUsername") != null && !jsonObj.get("skypeUsername").isJsonNull()) && !jsonObj.get("skypeUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skypeUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skypeUsername").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactViewModel>() {
           @Override
           public void write(JsonWriter out, ContactViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContactViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContactViewModel
   * @throws IOException if the JSON string is invalid with respect to ContactViewModel
   */
  public static ContactViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactViewModel.class);
  }

  /**
   * Convert an instance of ContactViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

