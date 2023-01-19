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
import java.util.Arrays;
import org.openapitools.client.model.LoadBalancerTlsCertificateDomainStatus;
import org.openapitools.client.model.LoadBalancerTlsCertificateDomainValidationRecordDnsRecordCreationState;

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
 * Describes the validation record of each domain name in the SSL/TLS certificate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LoadBalancerTlsCertificateDomainValidationRecord {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private LoadBalancerTlsCertificateDomainStatus validationStatus;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_DNS_RECORD_CREATION_STATE = "dnsRecordCreationState";
  @SerializedName(SERIALIZED_NAME_DNS_RECORD_CREATION_STATE)
  private LoadBalancerTlsCertificateDomainValidationRecordDnsRecordCreationState dnsRecordCreationState;

  public LoadBalancerTlsCertificateDomainValidationRecord() {
  }

  public LoadBalancerTlsCertificateDomainValidationRecord name(String name) {
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


  public LoadBalancerTlsCertificateDomainValidationRecord type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public LoadBalancerTlsCertificateDomainValidationRecord value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public LoadBalancerTlsCertificateDomainValidationRecord validationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

  /**
   * Get validationStatus
   * @return validationStatus
   */
  @javax.annotation.Nullable
  public LoadBalancerTlsCertificateDomainStatus getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
    this.validationStatus = validationStatus;
  }


  public LoadBalancerTlsCertificateDomainValidationRecord domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public LoadBalancerTlsCertificateDomainValidationRecord dnsRecordCreationState(LoadBalancerTlsCertificateDomainValidationRecordDnsRecordCreationState dnsRecordCreationState) {
    this.dnsRecordCreationState = dnsRecordCreationState;
    return this;
  }

  /**
   * Get dnsRecordCreationState
   * @return dnsRecordCreationState
   */
  @javax.annotation.Nullable
  public LoadBalancerTlsCertificateDomainValidationRecordDnsRecordCreationState getDnsRecordCreationState() {
    return dnsRecordCreationState;
  }

  public void setDnsRecordCreationState(LoadBalancerTlsCertificateDomainValidationRecordDnsRecordCreationState dnsRecordCreationState) {
    this.dnsRecordCreationState = dnsRecordCreationState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerTlsCertificateDomainValidationRecord loadBalancerTlsCertificateDomainValidationRecord = (LoadBalancerTlsCertificateDomainValidationRecord) o;
    return Objects.equals(this.name, loadBalancerTlsCertificateDomainValidationRecord.name) &&
        Objects.equals(this.type, loadBalancerTlsCertificateDomainValidationRecord.type) &&
        Objects.equals(this.value, loadBalancerTlsCertificateDomainValidationRecord.value) &&
        Objects.equals(this.validationStatus, loadBalancerTlsCertificateDomainValidationRecord.validationStatus) &&
        Objects.equals(this.domainName, loadBalancerTlsCertificateDomainValidationRecord.domainName) &&
        Objects.equals(this.dnsRecordCreationState, loadBalancerTlsCertificateDomainValidationRecord.dnsRecordCreationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, validationStatus, domainName, dnsRecordCreationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerTlsCertificateDomainValidationRecord {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    dnsRecordCreationState: ").append(toIndentedString(dnsRecordCreationState)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("validationStatus");
    openapiFields.add("domainName");
    openapiFields.add("dnsRecordCreationState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoadBalancerTlsCertificateDomainValidationRecord
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancerTlsCertificateDomainValidationRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancerTlsCertificateDomainValidationRecord is not found in the empty JSON string", LoadBalancerTlsCertificateDomainValidationRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancerTlsCertificateDomainValidationRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancerTlsCertificateDomainValidationRecord` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("value"));
      }
      // validate the optional field `validationStatus`
      if (jsonObj.get("validationStatus") != null && !jsonObj.get("validationStatus").isJsonNull()) {
        LoadBalancerTlsCertificateDomainStatus.validateJsonElement(jsonObj.get("validationStatus"));
      }
      // validate the optional field `domainName`
      if (jsonObj.get("domainName") != null && !jsonObj.get("domainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("domainName"));
      }
      // validate the optional field `dnsRecordCreationState`
      if (jsonObj.get("dnsRecordCreationState") != null && !jsonObj.get("dnsRecordCreationState").isJsonNull()) {
        LoadBalancerTlsCertificateDomainValidationRecordDnsRecordCreationState.validateJsonElement(jsonObj.get("dnsRecordCreationState"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancerTlsCertificateDomainValidationRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancerTlsCertificateDomainValidationRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancerTlsCertificateDomainValidationRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancerTlsCertificateDomainValidationRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancerTlsCertificateDomainValidationRecord>() {
           @Override
           public void write(JsonWriter out, LoadBalancerTlsCertificateDomainValidationRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancerTlsCertificateDomainValidationRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoadBalancerTlsCertificateDomainValidationRecord given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoadBalancerTlsCertificateDomainValidationRecord
   * @throws IOException if the JSON string is invalid with respect to LoadBalancerTlsCertificateDomainValidationRecord
   */
  public static LoadBalancerTlsCertificateDomainValidationRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancerTlsCertificateDomainValidationRecord.class);
  }

  /**
   * Convert an instance of LoadBalancerTlsCertificateDomainValidationRecord to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

