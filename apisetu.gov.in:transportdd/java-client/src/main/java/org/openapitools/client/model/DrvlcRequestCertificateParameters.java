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
 * DrvlcRequestCertificateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:18.712891-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DrvlcRequestCertificateParameters {
  public static final String SERIALIZED_NAME_D_O_B = "DOB";
  @SerializedName(SERIALIZED_NAME_D_O_B)
  private String DOB;

  public static final String SERIALIZED_NAME_FULL_NAME = "FullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_U_I_D = "UID";
  @SerializedName(SERIALIZED_NAME_U_I_D)
  private String UID;

  public static final String SERIALIZED_NAME_DLNO = "dlno";
  @SerializedName(SERIALIZED_NAME_DLNO)
  private String dlno;

  public DrvlcRequestCertificateParameters() {
  }

  public DrvlcRequestCertificateParameters DOB(String DOB) {
    this.DOB = DOB;
    return this;
  }

  /**
   * Date of birth in DD-MM-YYYY format
   * @return DOB
   */
  @javax.annotation.Nonnull
  public String getDOB() {
    return DOB;
  }

  public void setDOB(String DOB) {
    this.DOB = DOB;
  }


  public DrvlcRequestCertificateParameters fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name
   * @return fullName
   */
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public DrvlcRequestCertificateParameters UID(String UID) {
    this.UID = UID;
    return this;
  }

  /**
   * Aadhaar number
   * @return UID
   */
  @javax.annotation.Nonnull
  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }


  public DrvlcRequestCertificateParameters dlno(String dlno) {
    this.dlno = dlno;
    return this;
  }

  /**
   * Driving License No
   * @return dlno
   */
  @javax.annotation.Nonnull
  public String getDlno() {
    return dlno;
  }

  public void setDlno(String dlno) {
    this.dlno = dlno;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrvlcRequestCertificateParameters drvlcRequestCertificateParameters = (DrvlcRequestCertificateParameters) o;
    return Objects.equals(this.DOB, drvlcRequestCertificateParameters.DOB) &&
        Objects.equals(this.fullName, drvlcRequestCertificateParameters.fullName) &&
        Objects.equals(this.UID, drvlcRequestCertificateParameters.UID) &&
        Objects.equals(this.dlno, drvlcRequestCertificateParameters.dlno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DOB, fullName, UID, dlno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrvlcRequestCertificateParameters {\n");
    sb.append("    DOB: ").append(toIndentedString(DOB)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    dlno: ").append(toIndentedString(dlno)).append("\n");
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
    openapiFields.add("DOB");
    openapiFields.add("FullName");
    openapiFields.add("UID");
    openapiFields.add("dlno");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DOB");
    openapiRequiredFields.add("FullName");
    openapiRequiredFields.add("UID");
    openapiRequiredFields.add("dlno");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DrvlcRequestCertificateParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DrvlcRequestCertificateParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DrvlcRequestCertificateParameters is not found in the empty JSON string", DrvlcRequestCertificateParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DrvlcRequestCertificateParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DrvlcRequestCertificateParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DrvlcRequestCertificateParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("DOB").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DOB` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DOB").toString()));
      }
      if (!jsonObj.get("FullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FullName").toString()));
      }
      if (!jsonObj.get("UID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UID").toString()));
      }
      if (!jsonObj.get("dlno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dlno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dlno").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrvlcRequestCertificateParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrvlcRequestCertificateParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrvlcRequestCertificateParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrvlcRequestCertificateParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<DrvlcRequestCertificateParameters>() {
           @Override
           public void write(JsonWriter out, DrvlcRequestCertificateParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrvlcRequestCertificateParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DrvlcRequestCertificateParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DrvlcRequestCertificateParameters
   * @throws IOException if the JSON string is invalid with respect to DrvlcRequestCertificateParameters
   */
  public static DrvlcRequestCertificateParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrvlcRequestCertificateParameters.class);
  }

  /**
   * Convert an instance of DrvlcRequestCertificateParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

