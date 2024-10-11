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
 * VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:07.708508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance {
  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_POLICY_NO = "policyNo";
  @SerializedName(SERIALIZED_NAME_POLICY_NO)
  private String policyNo;

  public static final String SERIALIZED_NAME_VALID_TILL = "validTill";
  @SerializedName(SERIALIZED_NAME_VALID_TILL)
  private String validTill;

  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance() {
  }

  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance companyName(String companyName) {
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


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance policyNo(String policyNo) {
    this.policyNo = policyNo;
    return this;
  }

  /**
   * Get policyNo
   * @return policyNo
   */
  @javax.annotation.Nullable
  public String getPolicyNo() {
    return policyNo;
  }

  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance validTill(String validTill) {
    this.validTill = validTill;
    return this;
  }

  /**
   * Get validTill
   * @return validTill
   */
  @javax.annotation.Nullable
  public String getValidTill() {
    return validTill;
  }

  public void setValidTill(String validTill) {
    this.validTill = validTill;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance vehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance = (VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance) o;
    return Objects.equals(this.companyName, vehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.companyName) &&
        Objects.equals(this.policyNo, vehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.policyNo) &&
        Objects.equals(this.validTill, vehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.validTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, policyNo, validTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    policyNo: ").append(toIndentedString(policyNo)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
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
    openapiFields.add("companyName");
    openapiFields.add("policyNo");
    openapiFields.add("validTill");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance is not found in the empty JSON string", VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("policyNo") != null && !jsonObj.get("policyNo").isJsonNull()) && !jsonObj.get("policyNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyNo").toString()));
      }
      if ((jsonObj.get("validTill") != null && !jsonObj.get("validTill").isJsonNull()) && !jsonObj.get("validTill").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validTill` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validTill").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.class));

       return (TypeAdapter<T>) new TypeAdapter<VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance>() {
           @Override
           public void write(JsonWriter out, VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance
   * @throws IOException if the JSON string is invalid with respect to VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance
   */
  public static VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance.class);
  }

  /**
   * Convert an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

