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
import java.util.UUID;
import org.openapitools.client.model.ConsentArtifactSchema;
import org.openapitools.client.model.HpcerRequestCertificateParameters;

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
 * HpcerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:06.674556-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HpcerRequest {
  public static final String SERIALIZED_NAME_CERTIFICATE_PARAMETERS = "certificateParameters";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PARAMETERS)
  private HpcerRequestCertificateParameters certificateParameters;

  public static final String SERIALIZED_NAME_CONSENT_ARTIFACT = "consentArtifact";
  @SerializedName(SERIALIZED_NAME_CONSENT_ARTIFACT)
  private ConsentArtifactSchema consentArtifact;

  /**
   * The format of the certificate in response.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    XML("xml"),
    
    PDF("pdf");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_TXN_ID = "txnId";
  @SerializedName(SERIALIZED_NAME_TXN_ID)
  private UUID txnId;

  public HpcerRequest() {
  }

  public HpcerRequest certificateParameters(HpcerRequestCertificateParameters certificateParameters) {
    this.certificateParameters = certificateParameters;
    return this;
  }

  /**
   * Get certificateParameters
   * @return certificateParameters
   */
  @javax.annotation.Nullable
  public HpcerRequestCertificateParameters getCertificateParameters() {
    return certificateParameters;
  }

  public void setCertificateParameters(HpcerRequestCertificateParameters certificateParameters) {
    this.certificateParameters = certificateParameters;
  }


  public HpcerRequest consentArtifact(ConsentArtifactSchema consentArtifact) {
    this.consentArtifact = consentArtifact;
    return this;
  }

  /**
   * Get consentArtifact
   * @return consentArtifact
   */
  @javax.annotation.Nullable
  public ConsentArtifactSchema getConsentArtifact() {
    return consentArtifact;
  }

  public void setConsentArtifact(ConsentArtifactSchema consentArtifact) {
    this.consentArtifact = consentArtifact;
  }


  public HpcerRequest format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * The format of the certificate in response.
   * @return format
   */
  @javax.annotation.Nonnull
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public HpcerRequest txnId(UUID txnId) {
    this.txnId = txnId;
    return this;
  }

  /**
   * A unique transaction id for this request in UUID format. It is used for tracking the request.
   * @return txnId
   */
  @javax.annotation.Nonnull
  public UUID getTxnId() {
    return txnId;
  }

  public void setTxnId(UUID txnId) {
    this.txnId = txnId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HpcerRequest hpcerRequest = (HpcerRequest) o;
    return Objects.equals(this.certificateParameters, hpcerRequest.certificateParameters) &&
        Objects.equals(this.consentArtifact, hpcerRequest.consentArtifact) &&
        Objects.equals(this.format, hpcerRequest.format) &&
        Objects.equals(this.txnId, hpcerRequest.txnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateParameters, consentArtifact, format, txnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HpcerRequest {\n");
    sb.append("    certificateParameters: ").append(toIndentedString(certificateParameters)).append("\n");
    sb.append("    consentArtifact: ").append(toIndentedString(consentArtifact)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    txnId: ").append(toIndentedString(txnId)).append("\n");
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
    openapiFields.add("certificateParameters");
    openapiFields.add("consentArtifact");
    openapiFields.add("format");
    openapiFields.add("txnId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("txnId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HpcerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HpcerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HpcerRequest is not found in the empty JSON string", HpcerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HpcerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HpcerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HpcerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `certificateParameters`
      if (jsonObj.get("certificateParameters") != null && !jsonObj.get("certificateParameters").isJsonNull()) {
        HpcerRequestCertificateParameters.validateJsonElement(jsonObj.get("certificateParameters"));
      }
      // validate the optional field `consentArtifact`
      if (jsonObj.get("consentArtifact") != null && !jsonObj.get("consentArtifact").isJsonNull()) {
        ConsentArtifactSchema.validateJsonElement(jsonObj.get("consentArtifact"));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the required field `format`
      FormatEnum.validateJsonElement(jsonObj.get("format"));
      if (!jsonObj.get("txnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `txnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("txnId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HpcerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HpcerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HpcerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HpcerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<HpcerRequest>() {
           @Override
           public void write(JsonWriter out, HpcerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HpcerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HpcerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HpcerRequest
   * @throws IOException if the JSON string is invalid with respect to HpcerRequest
   */
  public static HpcerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HpcerRequest.class);
  }

  /**
   * Convert an instance of HpcerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

