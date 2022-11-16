/*
 * Transport Department, Daman & Diu
 * Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.
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
import org.openapitools.client.model.DrivingLicenseSchemaIssuedByOrganizationAddress;

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
 * DrivingLicenseSchemaIssuedByOrganization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:10.568267-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DrivingLicenseSchemaIssuedByOrganization {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private DrivingLicenseSchemaIssuedByOrganizationAddress address;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public DrivingLicenseSchemaIssuedByOrganization() {
  }

  public DrivingLicenseSchemaIssuedByOrganization address(DrivingLicenseSchemaIssuedByOrganizationAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public DrivingLicenseSchemaIssuedByOrganizationAddress getAddress() {
    return address;
  }

  public void setAddress(DrivingLicenseSchemaIssuedByOrganizationAddress address) {
    this.address = address;
  }


  public DrivingLicenseSchemaIssuedByOrganization code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public DrivingLicenseSchemaIssuedByOrganization name(String name) {
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


  public DrivingLicenseSchemaIssuedByOrganization tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Get tin
   * @return tin
   */
  @javax.annotation.Nonnull
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public DrivingLicenseSchemaIssuedByOrganization type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public DrivingLicenseSchemaIssuedByOrganization uid(String uid) {
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
    DrivingLicenseSchemaIssuedByOrganization drivingLicenseSchemaIssuedByOrganization = (DrivingLicenseSchemaIssuedByOrganization) o;
    return Objects.equals(this.address, drivingLicenseSchemaIssuedByOrganization.address) &&
        Objects.equals(this.code, drivingLicenseSchemaIssuedByOrganization.code) &&
        Objects.equals(this.name, drivingLicenseSchemaIssuedByOrganization.name) &&
        Objects.equals(this.tin, drivingLicenseSchemaIssuedByOrganization.tin) &&
        Objects.equals(this.type, drivingLicenseSchemaIssuedByOrganization.type) &&
        Objects.equals(this.uid, drivingLicenseSchemaIssuedByOrganization.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, code, name, tin, type, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenseSchemaIssuedByOrganization {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("name");
    openapiFields.add("tin");
    openapiFields.add("type");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Address");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("tin");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseSchemaIssuedByOrganization
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DrivingLicenseSchemaIssuedByOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DrivingLicenseSchemaIssuedByOrganization is not found in the empty JSON string", DrivingLicenseSchemaIssuedByOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DrivingLicenseSchemaIssuedByOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DrivingLicenseSchemaIssuedByOrganization` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DrivingLicenseSchemaIssuedByOrganization.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Address`
      DrivingLicenseSchemaIssuedByOrganizationAddress.validateJsonElement(jsonObj.get("Address"));
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrivingLicenseSchemaIssuedByOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrivingLicenseSchemaIssuedByOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrivingLicenseSchemaIssuedByOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrivingLicenseSchemaIssuedByOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<DrivingLicenseSchemaIssuedByOrganization>() {
           @Override
           public void write(JsonWriter out, DrivingLicenseSchemaIssuedByOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrivingLicenseSchemaIssuedByOrganization read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DrivingLicenseSchemaIssuedByOrganization given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DrivingLicenseSchemaIssuedByOrganization
   * @throws IOException if the JSON string is invalid with respect to DrivingLicenseSchemaIssuedByOrganization
   */
  public static DrivingLicenseSchemaIssuedByOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrivingLicenseSchemaIssuedByOrganization.class);
  }

  /**
   * Convert an instance of DrivingLicenseSchemaIssuedByOrganization to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

