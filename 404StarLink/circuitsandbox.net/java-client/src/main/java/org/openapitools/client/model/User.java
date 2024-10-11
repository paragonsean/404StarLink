/*
 * REST API Version 2
 * Circuit REST API to interact with the Circuit system.  [Learn more about the Circuit Development Community](https://www.circuit.com/web/developers/home)
 *
 * The version of the OpenAPI document: 2.9.235
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
import org.openapitools.client.model.UserEmailAddress;
import org.openapitools.client.model.UserPhoneNumber;

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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:59.136525-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class User {
  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_AVATAR_LARGE = "avatarLarge";
  @SerializedName(SERIALIZED_NAME_AVATAR_LARGE)
  private String avatarLarge;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<UserEmailAddress> emailAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<UserPhoneNumber> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIMARY_TENANT_ID = "primaryTenantId";
  @SerializedName(SERIALIZED_NAME_PRIMARY_TENANT_ID)
  private String primaryTenantId;

  public static final String SERIALIZED_NAME_SECONDARY_EMAIL_ADDRESS = "secondaryEmailAddress";
  @SerializedName(SERIALIZED_NAME_SECONDARY_EMAIL_ADDRESS)
  private String secondaryEmailAddress;

  public static final String SERIALIZED_NAME_SECONDARY_TENANT_ID = "secondaryTenantId";
  @SerializedName(SERIALIZED_NAME_SECONDARY_TENANT_ID)
  private String secondaryTenantId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_STATE = "userState";
  @SerializedName(SERIALIZED_NAME_USER_STATE)
  private String userState;

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private String userType;

  public User() {
  }

  public User avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * The URL of the small avatar picture.
   * @return avatar
   */
  @javax.annotation.Nullable
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public User avatarLarge(String avatarLarge) {
    this.avatarLarge = avatarLarge;
    return this;
  }

  /**
   * The URL of the large avatar picture.
   * @return avatarLarge
   */
  @javax.annotation.Nullable
  public String getAvatarLarge() {
    return avatarLarge;
  }

  public void setAvatarLarge(String avatarLarge) {
    this.avatarLarge = avatarLarge;
  }


  public User company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The name of the user&#39;s company
   * @return company
   */
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  public User department(String department) {
    this.department = department;
    return this;
  }

  /**
   * missing documentation
   * @return department
   */
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The user&#39;s display name
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public User emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The primary email address of the user
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public User emailAddresses(List<UserEmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public User addEmailAddressesItem(UserEmailAddress emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

  /**
   * additional email addresses of the user
   * @return emailAddresses
   */
  @javax.annotation.Nullable
  public List<UserEmailAddress> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<UserEmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the user
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * The job title of the user
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the user
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public User locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale of the user. (E.g. en-US, de-DE)
   * @return locale
   */
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public User phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * provisioned phone number of the user
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public User phoneNumbers(List<UserPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public User addPhoneNumbersItem(UserPhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * additional phone numbers of the user
   * @return phoneNumbers
   */
  @javax.annotation.Nullable
  public List<UserPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<UserPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public User primaryTenantId(String primaryTenantId) {
    this.primaryTenantId = primaryTenantId;
    return this;
  }

  /**
   * The primary tenant id
   * @return primaryTenantId
   */
  @javax.annotation.Nullable
  public String getPrimaryTenantId() {
    return primaryTenantId;
  }

  public void setPrimaryTenantId(String primaryTenantId) {
    this.primaryTenantId = primaryTenantId;
  }


  public User secondaryEmailAddress(String secondaryEmailAddress) {
    this.secondaryEmailAddress = secondaryEmailAddress;
    return this;
  }

  /**
   * The secondary email address
   * @return secondaryEmailAddress
   */
  @javax.annotation.Nullable
  public String getSecondaryEmailAddress() {
    return secondaryEmailAddress;
  }

  public void setSecondaryEmailAddress(String secondaryEmailAddress) {
    this.secondaryEmailAddress = secondaryEmailAddress;
  }


  public User secondaryTenantId(String secondaryTenantId) {
    this.secondaryTenantId = secondaryTenantId;
    return this;
  }

  /**
   * The secondary tenant id
   * @return secondaryTenantId
   */
  @javax.annotation.Nullable
  public String getSecondaryTenantId() {
    return secondaryTenantId;
  }

  public void setSecondaryTenantId(String secondaryTenantId) {
    this.secondaryTenantId = secondaryTenantId;
  }


  public User userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public User userState(String userState) {
    this.userState = userState;
    return this;
  }

  /**
   * The state of the user, e.g. deleted
   * @return userState
   */
  @javax.annotation.Nullable
  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }


  public User userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * the type of the user
   * @return userType
   */
  @javax.annotation.Nullable
  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.avatar, user.avatar) &&
        Objects.equals(this.avatarLarge, user.avatarLarge) &&
        Objects.equals(this.company, user.company) &&
        Objects.equals(this.department, user.department) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.emailAddresses, user.emailAddresses) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.jobTitle, user.jobTitle) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.phoneNumber, user.phoneNumber) &&
        Objects.equals(this.phoneNumbers, user.phoneNumbers) &&
        Objects.equals(this.primaryTenantId, user.primaryTenantId) &&
        Objects.equals(this.secondaryEmailAddress, user.secondaryEmailAddress) &&
        Objects.equals(this.secondaryTenantId, user.secondaryTenantId) &&
        Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.userState, user.userState) &&
        Objects.equals(this.userType, user.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, avatarLarge, company, department, displayName, emailAddress, emailAddresses, firstName, jobTitle, lastName, locale, phoneNumber, phoneNumbers, primaryTenantId, secondaryEmailAddress, secondaryTenantId, userId, userState, userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarLarge: ").append(toIndentedString(avatarLarge)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    primaryTenantId: ").append(toIndentedString(primaryTenantId)).append("\n");
    sb.append("    secondaryEmailAddress: ").append(toIndentedString(secondaryEmailAddress)).append("\n");
    sb.append("    secondaryTenantId: ").append(toIndentedString(secondaryTenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userState: ").append(toIndentedString(userState)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("avatarLarge");
    openapiFields.add("company");
    openapiFields.add("department");
    openapiFields.add("displayName");
    openapiFields.add("emailAddress");
    openapiFields.add("emailAddresses");
    openapiFields.add("firstName");
    openapiFields.add("jobTitle");
    openapiFields.add("lastName");
    openapiFields.add("locale");
    openapiFields.add("phoneNumber");
    openapiFields.add("phoneNumbers");
    openapiFields.add("primaryTenantId");
    openapiFields.add("secondaryEmailAddress");
    openapiFields.add("secondaryTenantId");
    openapiFields.add("userId");
    openapiFields.add("userState");
    openapiFields.add("userType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      if ((jsonObj.get("avatarLarge") != null && !jsonObj.get("avatarLarge").isJsonNull()) && !jsonObj.get("avatarLarge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarLarge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarLarge").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) && !jsonObj.get("department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if (jsonObj.get("emailAddresses") != null && !jsonObj.get("emailAddresses").isJsonNull()) {
        JsonArray jsonArrayemailAddresses = jsonObj.getAsJsonArray("emailAddresses");
        if (jsonArrayemailAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emailAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emailAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("emailAddresses").toString()));
          }

          // validate the optional field `emailAddresses` (array)
          for (int i = 0; i < jsonArrayemailAddresses.size(); i++) {
            UserEmailAddress.validateJsonElement(jsonArrayemailAddresses.get(i));
          };
        }
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("jobTitle") != null && !jsonObj.get("jobTitle").isJsonNull()) && !jsonObj.get("jobTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobTitle").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("phoneNumbers") != null && !jsonObj.get("phoneNumbers").isJsonNull()) {
        JsonArray jsonArrayphoneNumbers = jsonObj.getAsJsonArray("phoneNumbers");
        if (jsonArrayphoneNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phoneNumbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("phoneNumbers").toString()));
          }

          // validate the optional field `phoneNumbers` (array)
          for (int i = 0; i < jsonArrayphoneNumbers.size(); i++) {
            UserPhoneNumber.validateJsonElement(jsonArrayphoneNumbers.get(i));
          };
        }
      }
      if ((jsonObj.get("primaryTenantId") != null && !jsonObj.get("primaryTenantId").isJsonNull()) && !jsonObj.get("primaryTenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryTenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryTenantId").toString()));
      }
      if ((jsonObj.get("secondaryEmailAddress") != null && !jsonObj.get("secondaryEmailAddress").isJsonNull()) && !jsonObj.get("secondaryEmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryEmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryEmailAddress").toString()));
      }
      if ((jsonObj.get("secondaryTenantId") != null && !jsonObj.get("secondaryTenantId").isJsonNull()) && !jsonObj.get("secondaryTenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryTenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryTenantId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("userState") != null && !jsonObj.get("userState").isJsonNull()) && !jsonObj.get("userState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userState").toString()));
      }
      if ((jsonObj.get("userType") != null && !jsonObj.get("userType").isJsonNull()) && !jsonObj.get("userType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws IOException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

  /**
   * Convert an instance of User to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

