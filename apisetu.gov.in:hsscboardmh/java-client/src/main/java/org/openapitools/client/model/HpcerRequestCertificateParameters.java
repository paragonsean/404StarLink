/*
 * Maharashtra State Board of Secondary and Higher Secondary Education, Maharashtra
 * Class X and XII marksheets and passing certificates of Maharashtra State Board of Secondary and Higher Secondary Education (https://mahahsscboard.maharashtra.gov.in/) are available in DigiLocker for years 1990 to 2017.
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
 * HpcerRequestCertificateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:26.774776-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HpcerRequestCertificateParameters {
  public static final String SERIALIZED_NAME_FULL_NAME = "FullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_EXSESSION = "exsession";
  @SerializedName(SERIALIZED_NAME_EXSESSION)
  private String exsession;

  public static final String SERIALIZED_NAME_ROLLNUMBER = "rollnumber";
  @SerializedName(SERIALIZED_NAME_ROLLNUMBER)
  private String rollnumber;

  public static final String SERIALIZED_NAME_TOTALMARKS = "totalmarks";
  @SerializedName(SERIALIZED_NAME_TOTALMARKS)
  private String totalmarks;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public HpcerRequestCertificateParameters() {
  }

  public HpcerRequestCertificateParameters fullName(String fullName) {
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


  public HpcerRequestCertificateParameters exsession(String exsession) {
    this.exsession = exsession;
    return this;
  }

  /**
   * Exam Session
   * @return exsession
   */
  @javax.annotation.Nonnull
  public String getExsession() {
    return exsession;
  }

  public void setExsession(String exsession) {
    this.exsession = exsession;
  }


  public HpcerRequestCertificateParameters rollnumber(String rollnumber) {
    this.rollnumber = rollnumber;
    return this;
  }

  /**
   * Seat No
   * @return rollnumber
   */
  @javax.annotation.Nonnull
  public String getRollnumber() {
    return rollnumber;
  }

  public void setRollnumber(String rollnumber) {
    this.rollnumber = rollnumber;
  }


  public HpcerRequestCertificateParameters totalmarks(String totalmarks) {
    this.totalmarks = totalmarks;
    return this;
  }

  /**
   * Total Marks
   * @return totalmarks
   */
  @javax.annotation.Nonnull
  public String getTotalmarks() {
    return totalmarks;
  }

  public void setTotalmarks(String totalmarks) {
    this.totalmarks = totalmarks;
  }


  public HpcerRequestCertificateParameters year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Year
   * @return year
   */
  @javax.annotation.Nonnull
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HpcerRequestCertificateParameters hpcerRequestCertificateParameters = (HpcerRequestCertificateParameters) o;
    return Objects.equals(this.fullName, hpcerRequestCertificateParameters.fullName) &&
        Objects.equals(this.exsession, hpcerRequestCertificateParameters.exsession) &&
        Objects.equals(this.rollnumber, hpcerRequestCertificateParameters.rollnumber) &&
        Objects.equals(this.totalmarks, hpcerRequestCertificateParameters.totalmarks) &&
        Objects.equals(this.year, hpcerRequestCertificateParameters.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, exsession, rollnumber, totalmarks, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HpcerRequestCertificateParameters {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    exsession: ").append(toIndentedString(exsession)).append("\n");
    sb.append("    rollnumber: ").append(toIndentedString(rollnumber)).append("\n");
    sb.append("    totalmarks: ").append(toIndentedString(totalmarks)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("FullName");
    openapiFields.add("exsession");
    openapiFields.add("rollnumber");
    openapiFields.add("totalmarks");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FullName");
    openapiRequiredFields.add("exsession");
    openapiRequiredFields.add("rollnumber");
    openapiRequiredFields.add("totalmarks");
    openapiRequiredFields.add("year");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HpcerRequestCertificateParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HpcerRequestCertificateParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HpcerRequestCertificateParameters is not found in the empty JSON string", HpcerRequestCertificateParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HpcerRequestCertificateParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HpcerRequestCertificateParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HpcerRequestCertificateParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("FullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FullName").toString()));
      }
      if (!jsonObj.get("exsession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exsession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exsession").toString()));
      }
      if (!jsonObj.get("rollnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rollnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rollnumber").toString()));
      }
      if (!jsonObj.get("totalmarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalmarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalmarks").toString()));
      }
      if (!jsonObj.get("year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HpcerRequestCertificateParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HpcerRequestCertificateParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HpcerRequestCertificateParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HpcerRequestCertificateParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<HpcerRequestCertificateParameters>() {
           @Override
           public void write(JsonWriter out, HpcerRequestCertificateParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HpcerRequestCertificateParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HpcerRequestCertificateParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HpcerRequestCertificateParameters
   * @throws IOException if the JSON string is invalid with respect to HpcerRequestCertificateParameters
   */
  public static HpcerRequestCertificateParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HpcerRequestCertificateParameters.class);
  }

  /**
   * Convert an instance of HpcerRequestCertificateParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

