/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
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
 * Structured address format for billing and shipping addresses.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:34.115959-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1TransactionDataAddress {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private List<String> address = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA = "administrativeArea";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA)
  private String administrativeArea;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_REGION_CODE = "regionCode";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress() {
  }

  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress address(List<String> address) {
    this.address = address;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * The first lines of the address. The first line generally contains the street name and number, and further lines may include information such as an apartment number.
   * @return address
   */
  @javax.annotation.Nullable
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

  /**
   * The state, province, or otherwise administrative area of the address.
   * @return administrativeArea
   */
  @javax.annotation.Nullable
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * The town/city of the address.
   * @return locality
   */
  @javax.annotation.Nullable
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal or ZIP code of the address.
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * The recipient name, potentially including information such as \&quot;care of\&quot;.
   * @return recipient
   */
  @javax.annotation.Nullable
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * The CLDR country/region of the address.
   * @return regionCode
   */
  @javax.annotation.Nullable
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1TransactionDataAddress googleCloudRecaptchaenterpriseV1TransactionDataAddress = (GoogleCloudRecaptchaenterpriseV1TransactionDataAddress) o;
    return Objects.equals(this.address, googleCloudRecaptchaenterpriseV1TransactionDataAddress.address) &&
        Objects.equals(this.administrativeArea, googleCloudRecaptchaenterpriseV1TransactionDataAddress.administrativeArea) &&
        Objects.equals(this.locality, googleCloudRecaptchaenterpriseV1TransactionDataAddress.locality) &&
        Objects.equals(this.postalCode, googleCloudRecaptchaenterpriseV1TransactionDataAddress.postalCode) &&
        Objects.equals(this.recipient, googleCloudRecaptchaenterpriseV1TransactionDataAddress.recipient) &&
        Objects.equals(this.regionCode, googleCloudRecaptchaenterpriseV1TransactionDataAddress.regionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, administrativeArea, locality, postalCode, recipient, regionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1TransactionDataAddress {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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
    openapiFields.add("administrativeArea");
    openapiFields.add("locality");
    openapiFields.add("postalCode");
    openapiFields.add("recipient");
    openapiFields.add("regionCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1TransactionDataAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1TransactionDataAddress is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1TransactionDataAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull() && !jsonObj.get("address").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be an array in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("administrativeArea") != null && !jsonObj.get("administrativeArea").isJsonNull()) && !jsonObj.get("administrativeArea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrativeArea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrativeArea").toString()));
      }
      if ((jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonNull()) && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if ((jsonObj.get("regionCode") != null && !jsonObj.get("regionCode").isJsonNull()) && !jsonObj.get("regionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1TransactionDataAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1TransactionDataAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1TransactionDataAddress>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1TransactionDataAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1TransactionDataAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1TransactionDataAddress
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1TransactionDataAddress
   */
  public static GoogleCloudRecaptchaenterpriseV1TransactionDataAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1TransactionDataAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

