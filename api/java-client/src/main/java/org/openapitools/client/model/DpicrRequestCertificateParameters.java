/*
 * Department of Empowerment of Persons with Disabilities
 * Department of Empowerment of Persons with Disabilities is issuing Unique Disability ID through DigiLocker. These can be pulled by beneficiaries into their DigiLocker accounts.
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
 * DpicrRequestCertificateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:09.881505-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DpicrRequestCertificateParameters {
  public static final String SERIALIZED_NAME_C_E_R_T_N_O = "CERT_NO";
  @SerializedName(SERIALIZED_NAME_C_E_R_T_N_O)
  private String CERT_NO;

  public static final String SERIALIZED_NAME_FULL_NAME = "FullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public DpicrRequestCertificateParameters() {
  }

  public DpicrRequestCertificateParameters CERT_NO(String CERT_NO) {
    this.CERT_NO = CERT_NO;
    return this;
  }

  /**
   * CERTIFICATE NO
   * @return CERT_NO
   */
  @javax.annotation.Nonnull
  public String getCERTNO() {
    return CERT_NO;
  }

  public void setCERTNO(String CERT_NO) {
    this.CERT_NO = CERT_NO;
  }


  public DpicrRequestCertificateParameters fullName(String fullName) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpicrRequestCertificateParameters dpicrRequestCertificateParameters = (DpicrRequestCertificateParameters) o;
    return Objects.equals(this.CERT_NO, dpicrRequestCertificateParameters.CERT_NO) &&
        Objects.equals(this.fullName, dpicrRequestCertificateParameters.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CERT_NO, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpicrRequestCertificateParameters {\n");
    sb.append("    CERT_NO: ").append(toIndentedString(CERT_NO)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
    openapiFields.add("CERT_NO");
    openapiFields.add("FullName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CERT_NO");
    openapiRequiredFields.add("FullName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DpicrRequestCertificateParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DpicrRequestCertificateParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DpicrRequestCertificateParameters is not found in the empty JSON string", DpicrRequestCertificateParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DpicrRequestCertificateParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DpicrRequestCertificateParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DpicrRequestCertificateParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("CERT_NO").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CERT_NO` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CERT_NO").toString()));
      }
      if (!jsonObj.get("FullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FullName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpicrRequestCertificateParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpicrRequestCertificateParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpicrRequestCertificateParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpicrRequestCertificateParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<DpicrRequestCertificateParameters>() {
           @Override
           public void write(JsonWriter out, DpicrRequestCertificateParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpicrRequestCertificateParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DpicrRequestCertificateParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DpicrRequestCertificateParameters
   * @throws IOException if the JSON string is invalid with respect to DpicrRequestCertificateParameters
   */
  public static DpicrRequestCertificateParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpicrRequestCertificateParameters.class);
  }

  /**
   * Convert an instance of DpicrRequestCertificateParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

