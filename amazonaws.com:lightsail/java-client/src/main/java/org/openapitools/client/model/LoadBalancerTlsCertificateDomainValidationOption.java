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
 * Contains information about the domain names on an SSL/TLS certificate that you will use to validate domain ownership.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LoadBalancerTlsCertificateDomainValidationOption {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private LoadBalancerTlsCertificateDomainStatus validationStatus;

  public LoadBalancerTlsCertificateDomainValidationOption() {
  }

  public LoadBalancerTlsCertificateDomainValidationOption domainName(String domainName) {
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


  public LoadBalancerTlsCertificateDomainValidationOption validationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerTlsCertificateDomainValidationOption loadBalancerTlsCertificateDomainValidationOption = (LoadBalancerTlsCertificateDomainValidationOption) o;
    return Objects.equals(this.domainName, loadBalancerTlsCertificateDomainValidationOption.domainName) &&
        Objects.equals(this.validationStatus, loadBalancerTlsCertificateDomainValidationOption.validationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, validationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerTlsCertificateDomainValidationOption {\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
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
    openapiFields.add("domainName");
    openapiFields.add("validationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoadBalancerTlsCertificateDomainValidationOption
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancerTlsCertificateDomainValidationOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancerTlsCertificateDomainValidationOption is not found in the empty JSON string", LoadBalancerTlsCertificateDomainValidationOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancerTlsCertificateDomainValidationOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancerTlsCertificateDomainValidationOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `domainName`
      if (jsonObj.get("domainName") != null && !jsonObj.get("domainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("domainName"));
      }
      // validate the optional field `validationStatus`
      if (jsonObj.get("validationStatus") != null && !jsonObj.get("validationStatus").isJsonNull()) {
        LoadBalancerTlsCertificateDomainStatus.validateJsonElement(jsonObj.get("validationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancerTlsCertificateDomainValidationOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancerTlsCertificateDomainValidationOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancerTlsCertificateDomainValidationOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancerTlsCertificateDomainValidationOption.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancerTlsCertificateDomainValidationOption>() {
           @Override
           public void write(JsonWriter out, LoadBalancerTlsCertificateDomainValidationOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancerTlsCertificateDomainValidationOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoadBalancerTlsCertificateDomainValidationOption given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoadBalancerTlsCertificateDomainValidationOption
   * @throws IOException if the JSON string is invalid with respect to LoadBalancerTlsCertificateDomainValidationOption
   */
  public static LoadBalancerTlsCertificateDomainValidationOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancerTlsCertificateDomainValidationOption.class);
  }

  /**
   * Convert an instance of LoadBalancerTlsCertificateDomainValidationOption to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

