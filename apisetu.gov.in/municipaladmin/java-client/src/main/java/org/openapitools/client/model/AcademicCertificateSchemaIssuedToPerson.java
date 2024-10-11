/*
 * Directorate of Municipal Administration, Karnataka
 * APIs provided by Directorate of Municipal Administration, Karnataka.
 *
 * The version of the OpenAPI document: 3.0.0
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
import org.openapitools.client.model.AcademicCertificateSchemaIssuedToPersonAddress;
import org.openapitools.client.model.AcademicCertificateSchemaIssuedToPersonPhoto;

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
 * AcademicCertificateSchemaIssuedToPerson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:33.174984-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcademicCertificateSchemaIssuedToPerson {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AcademicCertificateSchemaIssuedToPersonAddress address;

  public static final String SERIALIZED_NAME_PHOTO = "Photo";
  @SerializedName(SERIALIZED_NAME_PHOTO)
  private AcademicCertificateSchemaIssuedToPersonPhoto photo;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DISABILITY_STATUS = "disabilityStatus";
  @SerializedName(SERIALIZED_NAME_DISABILITY_STATUS)
  private String disabilityStatus;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "maritalStatus";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_MOTHER_NAME = "motherName";
  @SerializedName(SERIALIZED_NAME_MOTHER_NAME)
  private String motherName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_RELIGION = "religion";
  @SerializedName(SERIALIZED_NAME_RELIGION)
  private String religion;

  public static final String SERIALIZED_NAME_SWD = "swd";
  @SerializedName(SERIALIZED_NAME_SWD)
  private String swd;

  public static final String SERIALIZED_NAME_SWD_INDICATOR = "swdIndicator";
  @SerializedName(SERIALIZED_NAME_SWD_INDICATOR)
  private String swdIndicator;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public AcademicCertificateSchemaIssuedToPerson() {
  }

  public AcademicCertificateSchemaIssuedToPerson address(AcademicCertificateSchemaIssuedToPersonAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaIssuedToPersonAddress getAddress() {
    return address;
  }

  public void setAddress(AcademicCertificateSchemaIssuedToPersonAddress address) {
    this.address = address;
  }


  public AcademicCertificateSchemaIssuedToPerson photo(AcademicCertificateSchemaIssuedToPersonPhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaIssuedToPersonPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(AcademicCertificateSchemaIssuedToPersonPhoto photo) {
    this.photo = photo;
  }


  public AcademicCertificateSchemaIssuedToPerson category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nonnull
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public AcademicCertificateSchemaIssuedToPerson disabilityStatus(String disabilityStatus) {
    this.disabilityStatus = disabilityStatus;
    return this;
  }

  /**
   * Get disabilityStatus
   * @return disabilityStatus
   */
  @javax.annotation.Nonnull
  public String getDisabilityStatus() {
    return disabilityStatus;
  }

  public void setDisabilityStatus(String disabilityStatus) {
    this.disabilityStatus = disabilityStatus;
  }


  public AcademicCertificateSchemaIssuedToPerson dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
   */
  @javax.annotation.Nonnull
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }


  public AcademicCertificateSchemaIssuedToPerson email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public AcademicCertificateSchemaIssuedToPerson gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nonnull
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public AcademicCertificateSchemaIssuedToPerson maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
   */
  @javax.annotation.Nonnull
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public AcademicCertificateSchemaIssuedToPerson motherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  /**
   * Get motherName
   * @return motherName
   */
  @javax.annotation.Nonnull
  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }


  public AcademicCertificateSchemaIssuedToPerson name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AcademicCertificateSchemaIssuedToPerson phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nonnull
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public AcademicCertificateSchemaIssuedToPerson religion(String religion) {
    this.religion = religion;
    return this;
  }

  /**
   * Get religion
   * @return religion
   */
  @javax.annotation.Nonnull
  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }


  public AcademicCertificateSchemaIssuedToPerson swd(String swd) {
    this.swd = swd;
    return this;
  }

  /**
   * Get swd
   * @return swd
   */
  @javax.annotation.Nonnull
  public String getSwd() {
    return swd;
  }

  public void setSwd(String swd) {
    this.swd = swd;
  }


  public AcademicCertificateSchemaIssuedToPerson swdIndicator(String swdIndicator) {
    this.swdIndicator = swdIndicator;
    return this;
  }

  /**
   * Get swdIndicator
   * @return swdIndicator
   */
  @javax.annotation.Nonnull
  public String getSwdIndicator() {
    return swdIndicator;
  }

  public void setSwdIndicator(String swdIndicator) {
    this.swdIndicator = swdIndicator;
  }


  public AcademicCertificateSchemaIssuedToPerson title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public AcademicCertificateSchemaIssuedToPerson uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
   */
  @javax.annotation.Nonnull
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicCertificateSchemaIssuedToPerson academicCertificateSchemaIssuedToPerson = (AcademicCertificateSchemaIssuedToPerson) o;
    return Objects.equals(this.address, academicCertificateSchemaIssuedToPerson.address) &&
        Objects.equals(this.photo, academicCertificateSchemaIssuedToPerson.photo) &&
        Objects.equals(this.category, academicCertificateSchemaIssuedToPerson.category) &&
        Objects.equals(this.disabilityStatus, academicCertificateSchemaIssuedToPerson.disabilityStatus) &&
        Objects.equals(this.dob, academicCertificateSchemaIssuedToPerson.dob) &&
        Objects.equals(this.email, academicCertificateSchemaIssuedToPerson.email) &&
        Objects.equals(this.gender, academicCertificateSchemaIssuedToPerson.gender) &&
        Objects.equals(this.maritalStatus, academicCertificateSchemaIssuedToPerson.maritalStatus) &&
        Objects.equals(this.motherName, academicCertificateSchemaIssuedToPerson.motherName) &&
        Objects.equals(this.name, academicCertificateSchemaIssuedToPerson.name) &&
        Objects.equals(this.phone, academicCertificateSchemaIssuedToPerson.phone) &&
        Objects.equals(this.religion, academicCertificateSchemaIssuedToPerson.religion) &&
        Objects.equals(this.swd, academicCertificateSchemaIssuedToPerson.swd) &&
        Objects.equals(this.swdIndicator, academicCertificateSchemaIssuedToPerson.swdIndicator) &&
        Objects.equals(this.title, academicCertificateSchemaIssuedToPerson.title) &&
        Objects.equals(this.uid, academicCertificateSchemaIssuedToPerson.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, photo, category, disabilityStatus, dob, email, gender, maritalStatus, motherName, name, phone, religion, swd, swdIndicator, title, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicCertificateSchemaIssuedToPerson {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    disabilityStatus: ").append(toIndentedString(disabilityStatus)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    motherName: ").append(toIndentedString(motherName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    religion: ").append(toIndentedString(religion)).append("\n");
    sb.append("    swd: ").append(toIndentedString(swd)).append("\n");
    sb.append("    swdIndicator: ").append(toIndentedString(swdIndicator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("Address");
    openapiFields.add("Photo");
    openapiFields.add("category");
    openapiFields.add("disabilityStatus");
    openapiFields.add("dob");
    openapiFields.add("email");
    openapiFields.add("gender");
    openapiFields.add("maritalStatus");
    openapiFields.add("motherName");
    openapiFields.add("name");
    openapiFields.add("phone");
    openapiFields.add("religion");
    openapiFields.add("swd");
    openapiFields.add("swdIndicator");
    openapiFields.add("title");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Address");
    openapiRequiredFields.add("Photo");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("disabilityStatus");
    openapiRequiredFields.add("dob");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("gender");
    openapiRequiredFields.add("maritalStatus");
    openapiRequiredFields.add("motherName");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("religion");
    openapiRequiredFields.add("swd");
    openapiRequiredFields.add("swdIndicator");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("uid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcademicCertificateSchemaIssuedToPerson
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcademicCertificateSchemaIssuedToPerson.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcademicCertificateSchemaIssuedToPerson is not found in the empty JSON string", AcademicCertificateSchemaIssuedToPerson.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcademicCertificateSchemaIssuedToPerson.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcademicCertificateSchemaIssuedToPerson` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcademicCertificateSchemaIssuedToPerson.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Address`
      AcademicCertificateSchemaIssuedToPersonAddress.validateJsonElement(jsonObj.get("Address"));
      // validate the required field `Photo`
      AcademicCertificateSchemaIssuedToPersonPhoto.validateJsonElement(jsonObj.get("Photo"));
      if (!jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("disabilityStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disabilityStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disabilityStatus").toString()));
      }
      if (!jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if (!jsonObj.get("maritalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maritalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maritalStatus").toString()));
      }
      if (!jsonObj.get("motherName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `motherName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("motherName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("religion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `religion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("religion").toString()));
      }
      if (!jsonObj.get("swd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swd").toString()));
      }
      if (!jsonObj.get("swdIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swdIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swdIndicator").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcademicCertificateSchemaIssuedToPerson.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcademicCertificateSchemaIssuedToPerson' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcademicCertificateSchemaIssuedToPerson> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcademicCertificateSchemaIssuedToPerson.class));

       return (TypeAdapter<T>) new TypeAdapter<AcademicCertificateSchemaIssuedToPerson>() {
           @Override
           public void write(JsonWriter out, AcademicCertificateSchemaIssuedToPerson value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcademicCertificateSchemaIssuedToPerson read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcademicCertificateSchemaIssuedToPerson given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcademicCertificateSchemaIssuedToPerson
   * @throws IOException if the JSON string is invalid with respect to AcademicCertificateSchemaIssuedToPerson
   */
  public static AcademicCertificateSchemaIssuedToPerson fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcademicCertificateSchemaIssuedToPerson.class);
  }

  /**
   * Convert an instance of AcademicCertificateSchemaIssuedToPerson to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

