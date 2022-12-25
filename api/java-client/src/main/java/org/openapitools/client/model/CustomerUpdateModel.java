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
import org.openapitools.client.model.AddressUpdateModel;
import org.openapitools.client.model.ContactUpdateModel;
import org.openapitools.client.model.CustomFieldUpdateModel;
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
 * CustomerUpdateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:28.402833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CustomerUpdateModel {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressUpdateModel address;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private ContactUpdateModel contact;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private CustomFieldUpdateModel customFields;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private String notificationType;

  public static final String SERIALIZED_NAME_STRIPE_CUSTOMER_ID = "stripeCustomerId";
  @SerializedName(SERIALIZED_NAME_STRIPE_CUSTOMER_ID)
  private String stripeCustomerId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public CustomerUpdateModel() {
  }

  public CustomerUpdateModel address(AddressUpdateModel address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public AddressUpdateModel getAddress() {
    return address;
  }

  public void setAddress(AddressUpdateModel address) {
    this.address = address;
  }


  public CustomerUpdateModel contact(ContactUpdateModel contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @javax.annotation.Nullable
  public ContactUpdateModel getContact() {
    return contact;
  }

  public void setContact(ContactUpdateModel contact) {
    this.contact = contact;
  }


  public CustomerUpdateModel customFields(CustomFieldUpdateModel customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields
   * @return customFields
   */
  @javax.annotation.Nullable
  public CustomFieldUpdateModel getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFieldUpdateModel customFields) {
    this.customFields = customFields;
  }


  public CustomerUpdateModel email(String email) {
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


  public CustomerUpdateModel firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
   */
  @javax.annotation.Nullable
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public CustomerUpdateModel lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
   */
  @javax.annotation.Nullable
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public CustomerUpdateModel locationId(String locationId) {
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


  public CustomerUpdateModel name(String name) {
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


  public CustomerUpdateModel notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * 0 &#x3D; default(Email), 1 &#x3D; Email, 2 &#x3D; SMS, 3 &#x3D; Email and SMS
   * @return notificationType
   */
  @javax.annotation.Nullable
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }


  public CustomerUpdateModel stripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
    return this;
  }

  /**
   * Get stripeCustomerId
   * @return stripeCustomerId
   */
  @javax.annotation.Nullable
  public String getStripeCustomerId() {
    return stripeCustomerId;
  }

  public void setStripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
  }


  public CustomerUpdateModel type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateModel customerUpdateModel = (CustomerUpdateModel) o;
    return Objects.equals(this.address, customerUpdateModel.address) &&
        Objects.equals(this.contact, customerUpdateModel.contact) &&
        Objects.equals(this.customFields, customerUpdateModel.customFields) &&
        Objects.equals(this.email, customerUpdateModel.email) &&
        Objects.equals(this.firstname, customerUpdateModel.firstname) &&
        Objects.equals(this.lastname, customerUpdateModel.lastname) &&
        Objects.equals(this.locationId, customerUpdateModel.locationId) &&
        Objects.equals(this.name, customerUpdateModel.name) &&
        Objects.equals(this.notificationType, customerUpdateModel.notificationType) &&
        Objects.equals(this.stripeCustomerId, customerUpdateModel.stripeCustomerId) &&
        Objects.equals(this.type, customerUpdateModel.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, contact, customFields, email, firstname, lastname, locationId, name, notificationType, stripeCustomerId, type);
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
    sb.append("class CustomerUpdateModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("contact");
    openapiFields.add("customFields");
    openapiFields.add("email");
    openapiFields.add("firstname");
    openapiFields.add("lastname");
    openapiFields.add("locationId");
    openapiFields.add("name");
    openapiFields.add("notificationType");
    openapiFields.add("stripeCustomerId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomerUpdateModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerUpdateModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUpdateModel is not found in the empty JSON string", CustomerUpdateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerUpdateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerUpdateModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        AddressUpdateModel.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `contact`
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) {
        ContactUpdateModel.validateJsonElement(jsonObj.get("contact"));
      }
      // validate the optional field `customFields`
      if (jsonObj.get("customFields") != null && !jsonObj.get("customFields").isJsonNull()) {
        CustomFieldUpdateModel.validateJsonElement(jsonObj.get("customFields"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("firstname") != null && !jsonObj.get("firstname").isJsonNull()) && !jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if ((jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull()) && !jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notificationType") != null && !jsonObj.get("notificationType").isJsonNull()) && !jsonObj.get("notificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationType").toString()));
      }
      if ((jsonObj.get("stripeCustomerId") != null && !jsonObj.get("stripeCustomerId").isJsonNull()) && !jsonObj.get("stripeCustomerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripeCustomerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripeCustomerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUpdateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUpdateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUpdateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUpdateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUpdateModel>() {
           @Override
           public void write(JsonWriter out, CustomerUpdateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerUpdateModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomerUpdateModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomerUpdateModel
   * @throws IOException if the JSON string is invalid with respect to CustomerUpdateModel
   */
  public static CustomerUpdateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUpdateModel.class);
  }

  /**
   * Convert an instance of CustomerUpdateModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

