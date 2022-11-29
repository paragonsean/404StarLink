/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import java.util.List;
import org.openapitools.client.model.AwsCertificateManagerCertificateDomainValidationOptionResourceRecord;

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
 * &lt;p&gt;Contains information about one of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;The initial validation of each domain name that occurs as a result of the &lt;code&gt;RequestCertificate&lt;/code&gt; request&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The validation of each domain name in the certificate, as it pertains to Certificate Manager managed renewal&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCertificateManagerCertificateDomainValidationOption {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_RESOURCE_RECORD = "ResourceRecord";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RECORD)
  private AwsCertificateManagerCertificateDomainValidationOptionResourceRecord resourceRecord;

  public static final String SERIALIZED_NAME_VALIDATION_DOMAIN = "ValidationDomain";
  @SerializedName(SERIALIZED_NAME_VALIDATION_DOMAIN)
  private String validationDomain;

  public static final String SERIALIZED_NAME_VALIDATION_EMAILS = "ValidationEmails";
  @SerializedName(SERIALIZED_NAME_VALIDATION_EMAILS)
  private List validationEmails;

  public static final String SERIALIZED_NAME_VALIDATION_METHOD = "ValidationMethod";
  @SerializedName(SERIALIZED_NAME_VALIDATION_METHOD)
  private String validationMethod;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "ValidationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private String validationStatus;

  public AwsCertificateManagerCertificateDomainValidationOption() {
  }

  public AwsCertificateManagerCertificateDomainValidationOption domainName(String domainName) {
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


  public AwsCertificateManagerCertificateDomainValidationOption resourceRecord(AwsCertificateManagerCertificateDomainValidationOptionResourceRecord resourceRecord) {
    this.resourceRecord = resourceRecord;
    return this;
  }

  /**
   * Get resourceRecord
   * @return resourceRecord
   */
  @javax.annotation.Nullable
  public AwsCertificateManagerCertificateDomainValidationOptionResourceRecord getResourceRecord() {
    return resourceRecord;
  }

  public void setResourceRecord(AwsCertificateManagerCertificateDomainValidationOptionResourceRecord resourceRecord) {
    this.resourceRecord = resourceRecord;
  }


  public AwsCertificateManagerCertificateDomainValidationOption validationDomain(String validationDomain) {
    this.validationDomain = validationDomain;
    return this;
  }

  /**
   * Get validationDomain
   * @return validationDomain
   */
  @javax.annotation.Nullable
  public String getValidationDomain() {
    return validationDomain;
  }

  public void setValidationDomain(String validationDomain) {
    this.validationDomain = validationDomain;
  }


  public AwsCertificateManagerCertificateDomainValidationOption validationEmails(List validationEmails) {
    this.validationEmails = validationEmails;
    return this;
  }

  /**
   * Get validationEmails
   * @return validationEmails
   */
  @javax.annotation.Nullable
  public List getValidationEmails() {
    return validationEmails;
  }

  public void setValidationEmails(List validationEmails) {
    this.validationEmails = validationEmails;
  }


  public AwsCertificateManagerCertificateDomainValidationOption validationMethod(String validationMethod) {
    this.validationMethod = validationMethod;
    return this;
  }

  /**
   * Get validationMethod
   * @return validationMethod
   */
  @javax.annotation.Nullable
  public String getValidationMethod() {
    return validationMethod;
  }

  public void setValidationMethod(String validationMethod) {
    this.validationMethod = validationMethod;
  }


  public AwsCertificateManagerCertificateDomainValidationOption validationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

  /**
   * Get validationStatus
   * @return validationStatus
   */
  @javax.annotation.Nullable
  public String getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(String validationStatus) {
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
    AwsCertificateManagerCertificateDomainValidationOption awsCertificateManagerCertificateDomainValidationOption = (AwsCertificateManagerCertificateDomainValidationOption) o;
    return Objects.equals(this.domainName, awsCertificateManagerCertificateDomainValidationOption.domainName) &&
        Objects.equals(this.resourceRecord, awsCertificateManagerCertificateDomainValidationOption.resourceRecord) &&
        Objects.equals(this.validationDomain, awsCertificateManagerCertificateDomainValidationOption.validationDomain) &&
        Objects.equals(this.validationEmails, awsCertificateManagerCertificateDomainValidationOption.validationEmails) &&
        Objects.equals(this.validationMethod, awsCertificateManagerCertificateDomainValidationOption.validationMethod) &&
        Objects.equals(this.validationStatus, awsCertificateManagerCertificateDomainValidationOption.validationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, resourceRecord, validationDomain, validationEmails, validationMethod, validationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCertificateManagerCertificateDomainValidationOption {\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    resourceRecord: ").append(toIndentedString(resourceRecord)).append("\n");
    sb.append("    validationDomain: ").append(toIndentedString(validationDomain)).append("\n");
    sb.append("    validationEmails: ").append(toIndentedString(validationEmails)).append("\n");
    sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
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
    openapiFields.add("DomainName");
    openapiFields.add("ResourceRecord");
    openapiFields.add("ValidationDomain");
    openapiFields.add("ValidationEmails");
    openapiFields.add("ValidationMethod");
    openapiFields.add("ValidationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCertificateManagerCertificateDomainValidationOption
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCertificateManagerCertificateDomainValidationOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCertificateManagerCertificateDomainValidationOption is not found in the empty JSON string", AwsCertificateManagerCertificateDomainValidationOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCertificateManagerCertificateDomainValidationOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCertificateManagerCertificateDomainValidationOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `ResourceRecord`
      if (jsonObj.get("ResourceRecord") != null && !jsonObj.get("ResourceRecord").isJsonNull()) {
        AwsCertificateManagerCertificateDomainValidationOptionResourceRecord.validateJsonElement(jsonObj.get("ResourceRecord"));
      }
      // validate the optional field `ValidationDomain`
      if (jsonObj.get("ValidationDomain") != null && !jsonObj.get("ValidationDomain").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ValidationDomain"));
      }
      // validate the optional field `ValidationEmails`
      if (jsonObj.get("ValidationEmails") != null && !jsonObj.get("ValidationEmails").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ValidationEmails"));
      }
      // validate the optional field `ValidationMethod`
      if (jsonObj.get("ValidationMethod") != null && !jsonObj.get("ValidationMethod").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ValidationMethod"));
      }
      // validate the optional field `ValidationStatus`
      if (jsonObj.get("ValidationStatus") != null && !jsonObj.get("ValidationStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ValidationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCertificateManagerCertificateDomainValidationOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCertificateManagerCertificateDomainValidationOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCertificateManagerCertificateDomainValidationOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCertificateManagerCertificateDomainValidationOption.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCertificateManagerCertificateDomainValidationOption>() {
           @Override
           public void write(JsonWriter out, AwsCertificateManagerCertificateDomainValidationOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCertificateManagerCertificateDomainValidationOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCertificateManagerCertificateDomainValidationOption given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCertificateManagerCertificateDomainValidationOption
   * @throws IOException if the JSON string is invalid with respect to AwsCertificateManagerCertificateDomainValidationOption
   */
  public static AwsCertificateManagerCertificateDomainValidationOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCertificateManagerCertificateDomainValidationOption.class);
  }

  /**
   * Convert an instance of AwsCertificateManagerCertificateDomainValidationOption to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

