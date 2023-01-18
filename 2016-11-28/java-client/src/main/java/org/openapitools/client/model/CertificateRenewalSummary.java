/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
 * Contact: mike.ralphson@gmail.com
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RenewalStatus;

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
 * CertificateRenewalSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CertificateRenewalSummary {
  public static final String SERIALIZED_NAME_DOMAIN_VALIDATION_RECORDS = "domainValidationRecords";
  @SerializedName(SERIALIZED_NAME_DOMAIN_VALIDATION_RECORDS)
  private List domainValidationRecords;

  public static final String SERIALIZED_NAME_RENEWAL_STATUS = "renewalStatus";
  @SerializedName(SERIALIZED_NAME_RENEWAL_STATUS)
  private RenewalStatus renewalStatus;

  public static final String SERIALIZED_NAME_RENEWAL_STATUS_REASON = "renewalStatusReason";
  @SerializedName(SERIALIZED_NAME_RENEWAL_STATUS_REASON)
  private String renewalStatusReason;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public CertificateRenewalSummary() {
  }

  public CertificateRenewalSummary domainValidationRecords(List domainValidationRecords) {
    this.domainValidationRecords = domainValidationRecords;
    return this;
  }

  /**
   * Get domainValidationRecords
   * @return domainValidationRecords
   */
  @javax.annotation.Nullable
  public List getDomainValidationRecords() {
    return domainValidationRecords;
  }

  public void setDomainValidationRecords(List domainValidationRecords) {
    this.domainValidationRecords = domainValidationRecords;
  }


  public CertificateRenewalSummary renewalStatus(RenewalStatus renewalStatus) {
    this.renewalStatus = renewalStatus;
    return this;
  }

  /**
   * Get renewalStatus
   * @return renewalStatus
   */
  @javax.annotation.Nullable
  public RenewalStatus getRenewalStatus() {
    return renewalStatus;
  }

  public void setRenewalStatus(RenewalStatus renewalStatus) {
    this.renewalStatus = renewalStatus;
  }


  public CertificateRenewalSummary renewalStatusReason(String renewalStatusReason) {
    this.renewalStatusReason = renewalStatusReason;
    return this;
  }

  /**
   * Get renewalStatusReason
   * @return renewalStatusReason
   */
  @javax.annotation.Nullable
  public String getRenewalStatusReason() {
    return renewalStatusReason;
  }

  public void setRenewalStatusReason(String renewalStatusReason) {
    this.renewalStatusReason = renewalStatusReason;
  }


  public CertificateRenewalSummary updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateRenewalSummary certificateRenewalSummary = (CertificateRenewalSummary) o;
    return Objects.equals(this.domainValidationRecords, certificateRenewalSummary.domainValidationRecords) &&
        Objects.equals(this.renewalStatus, certificateRenewalSummary.renewalStatus) &&
        Objects.equals(this.renewalStatusReason, certificateRenewalSummary.renewalStatusReason) &&
        Objects.equals(this.updatedAt, certificateRenewalSummary.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainValidationRecords, renewalStatus, renewalStatusReason, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateRenewalSummary {\n");
    sb.append("    domainValidationRecords: ").append(toIndentedString(domainValidationRecords)).append("\n");
    sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
    sb.append("    renewalStatusReason: ").append(toIndentedString(renewalStatusReason)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("domainValidationRecords");
    openapiFields.add("renewalStatus");
    openapiFields.add("renewalStatusReason");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CertificateRenewalSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificateRenewalSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateRenewalSummary is not found in the empty JSON string", CertificateRenewalSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificateRenewalSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateRenewalSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `domainValidationRecords`
      if (jsonObj.get("domainValidationRecords") != null && !jsonObj.get("domainValidationRecords").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("domainValidationRecords"));
      }
      // validate the optional field `renewalStatus`
      if (jsonObj.get("renewalStatus") != null && !jsonObj.get("renewalStatus").isJsonNull()) {
        RenewalStatus.validateJsonElement(jsonObj.get("renewalStatus"));
      }
      // validate the optional field `renewalStatusReason`
      if (jsonObj.get("renewalStatusReason") != null && !jsonObj.get("renewalStatusReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("renewalStatusReason"));
      }
      // validate the optional field `updatedAt`
      if (jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("updatedAt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateRenewalSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateRenewalSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateRenewalSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateRenewalSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateRenewalSummary>() {
           @Override
           public void write(JsonWriter out, CertificateRenewalSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateRenewalSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CertificateRenewalSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CertificateRenewalSummary
   * @throws IOException if the JSON string is invalid with respect to CertificateRenewalSummary
   */
  public static CertificateRenewalSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateRenewalSummary.class);
  }

  /**
   * Convert an instance of CertificateRenewalSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

