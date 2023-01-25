/*
 * National Institute of Electronics and Information Technology
 * NIELIT, under Ministry of Electronics & IT (http://www.nielit.gov.in/) provides education and training in the area of Information, Electronics & Communication Technology. Certificates issued by NIELIT are made available in students' DigiLocker accounts.
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
 * SkcerRequestCertificateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:56.522348-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SkcerRequestCertificateParameters {
  public static final String SERIALIZED_NAME_D_O_B = "DOB";
  @SerializedName(SERIALIZED_NAME_D_O_B)
  private String DOB;

  public static final String SERIALIZED_NAME_FULL_NAME = "FullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_U_D_F1 = "UDF1";
  @SerializedName(SERIALIZED_NAME_U_D_F1)
  private String UDF1;

  public SkcerRequestCertificateParameters() {
  }

  public SkcerRequestCertificateParameters DOB(String DOB) {
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


  public SkcerRequestCertificateParameters fullName(String fullName) {
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


  public SkcerRequestCertificateParameters UDF1(String UDF1) {
    this.UDF1 = UDF1;
    return this;
  }

  /**
   * Enter Roll No
   * @return UDF1
   */
  @javax.annotation.Nonnull
  public String getUDF1() {
    return UDF1;
  }

  public void setUDF1(String UDF1) {
    this.UDF1 = UDF1;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkcerRequestCertificateParameters skcerRequestCertificateParameters = (SkcerRequestCertificateParameters) o;
    return Objects.equals(this.DOB, skcerRequestCertificateParameters.DOB) &&
        Objects.equals(this.fullName, skcerRequestCertificateParameters.fullName) &&
        Objects.equals(this.UDF1, skcerRequestCertificateParameters.UDF1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DOB, fullName, UDF1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkcerRequestCertificateParameters {\n");
    sb.append("    DOB: ").append(toIndentedString(DOB)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    UDF1: ").append(toIndentedString(UDF1)).append("\n");
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
    openapiFields.add("UDF1");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DOB");
    openapiRequiredFields.add("FullName");
    openapiRequiredFields.add("UDF1");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SkcerRequestCertificateParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SkcerRequestCertificateParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkcerRequestCertificateParameters is not found in the empty JSON string", SkcerRequestCertificateParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SkcerRequestCertificateParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SkcerRequestCertificateParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkcerRequestCertificateParameters.openapiRequiredFields) {
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
      if (!jsonObj.get("UDF1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UDF1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UDF1").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkcerRequestCertificateParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkcerRequestCertificateParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkcerRequestCertificateParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkcerRequestCertificateParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<SkcerRequestCertificateParameters>() {
           @Override
           public void write(JsonWriter out, SkcerRequestCertificateParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SkcerRequestCertificateParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SkcerRequestCertificateParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SkcerRequestCertificateParameters
   * @throws IOException if the JSON string is invalid with respect to SkcerRequestCertificateParameters
   */
  public static SkcerRequestCertificateParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkcerRequestCertificateParameters.class);
  }

  /**
   * Convert an instance of SkcerRequestCertificateParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

