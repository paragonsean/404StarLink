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
 * Provides information about the TLS/SSL configuration that the CloudFront distribution uses to communicate with viewers.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCloudFrontDistributionViewerCertificate {
  public static final String SERIALIZED_NAME_ACM_CERTIFICATE_ARN = "AcmCertificateArn";
  @SerializedName(SERIALIZED_NAME_ACM_CERTIFICATE_ARN)
  private String acmCertificateArn;

  public static final String SERIALIZED_NAME_CERTIFICATE = "Certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_CERTIFICATE_SOURCE = "CertificateSource";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_SOURCE)
  private String certificateSource;

  public static final String SERIALIZED_NAME_CLOUD_FRONT_DEFAULT_CERTIFICATE = "CloudFrontDefaultCertificate";
  @SerializedName(SERIALIZED_NAME_CLOUD_FRONT_DEFAULT_CERTIFICATE)
  private Boolean cloudFrontDefaultCertificate;

  public static final String SERIALIZED_NAME_IAM_CERTIFICATE_ID = "IamCertificateId";
  @SerializedName(SERIALIZED_NAME_IAM_CERTIFICATE_ID)
  private String iamCertificateId;

  public static final String SERIALIZED_NAME_MINIMUM_PROTOCOL_VERSION = "MinimumProtocolVersion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PROTOCOL_VERSION)
  private String minimumProtocolVersion;

  public static final String SERIALIZED_NAME_SSL_SUPPORT_METHOD = "SslSupportMethod";
  @SerializedName(SERIALIZED_NAME_SSL_SUPPORT_METHOD)
  private String sslSupportMethod;

  public AwsCloudFrontDistributionViewerCertificate() {
  }

  public AwsCloudFrontDistributionViewerCertificate acmCertificateArn(String acmCertificateArn) {
    this.acmCertificateArn = acmCertificateArn;
    return this;
  }

  /**
   * Get acmCertificateArn
   * @return acmCertificateArn
   */
  @javax.annotation.Nullable
  public String getAcmCertificateArn() {
    return acmCertificateArn;
  }

  public void setAcmCertificateArn(String acmCertificateArn) {
    this.acmCertificateArn = acmCertificateArn;
  }


  public AwsCloudFrontDistributionViewerCertificate certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
   */
  @javax.annotation.Nullable
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public AwsCloudFrontDistributionViewerCertificate certificateSource(String certificateSource) {
    this.certificateSource = certificateSource;
    return this;
  }

  /**
   * Get certificateSource
   * @return certificateSource
   */
  @javax.annotation.Nullable
  public String getCertificateSource() {
    return certificateSource;
  }

  public void setCertificateSource(String certificateSource) {
    this.certificateSource = certificateSource;
  }


  public AwsCloudFrontDistributionViewerCertificate cloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
    this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    return this;
  }

  /**
   * Get cloudFrontDefaultCertificate
   * @return cloudFrontDefaultCertificate
   */
  @javax.annotation.Nullable
  public Boolean getCloudFrontDefaultCertificate() {
    return cloudFrontDefaultCertificate;
  }

  public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
    this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
  }


  public AwsCloudFrontDistributionViewerCertificate iamCertificateId(String iamCertificateId) {
    this.iamCertificateId = iamCertificateId;
    return this;
  }

  /**
   * Get iamCertificateId
   * @return iamCertificateId
   */
  @javax.annotation.Nullable
  public String getIamCertificateId() {
    return iamCertificateId;
  }

  public void setIamCertificateId(String iamCertificateId) {
    this.iamCertificateId = iamCertificateId;
  }


  public AwsCloudFrontDistributionViewerCertificate minimumProtocolVersion(String minimumProtocolVersion) {
    this.minimumProtocolVersion = minimumProtocolVersion;
    return this;
  }

  /**
   * Get minimumProtocolVersion
   * @return minimumProtocolVersion
   */
  @javax.annotation.Nullable
  public String getMinimumProtocolVersion() {
    return minimumProtocolVersion;
  }

  public void setMinimumProtocolVersion(String minimumProtocolVersion) {
    this.minimumProtocolVersion = minimumProtocolVersion;
  }


  public AwsCloudFrontDistributionViewerCertificate sslSupportMethod(String sslSupportMethod) {
    this.sslSupportMethod = sslSupportMethod;
    return this;
  }

  /**
   * Get sslSupportMethod
   * @return sslSupportMethod
   */
  @javax.annotation.Nullable
  public String getSslSupportMethod() {
    return sslSupportMethod;
  }

  public void setSslSupportMethod(String sslSupportMethod) {
    this.sslSupportMethod = sslSupportMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCloudFrontDistributionViewerCertificate awsCloudFrontDistributionViewerCertificate = (AwsCloudFrontDistributionViewerCertificate) o;
    return Objects.equals(this.acmCertificateArn, awsCloudFrontDistributionViewerCertificate.acmCertificateArn) &&
        Objects.equals(this.certificate, awsCloudFrontDistributionViewerCertificate.certificate) &&
        Objects.equals(this.certificateSource, awsCloudFrontDistributionViewerCertificate.certificateSource) &&
        Objects.equals(this.cloudFrontDefaultCertificate, awsCloudFrontDistributionViewerCertificate.cloudFrontDefaultCertificate) &&
        Objects.equals(this.iamCertificateId, awsCloudFrontDistributionViewerCertificate.iamCertificateId) &&
        Objects.equals(this.minimumProtocolVersion, awsCloudFrontDistributionViewerCertificate.minimumProtocolVersion) &&
        Objects.equals(this.sslSupportMethod, awsCloudFrontDistributionViewerCertificate.sslSupportMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acmCertificateArn, certificate, certificateSource, cloudFrontDefaultCertificate, iamCertificateId, minimumProtocolVersion, sslSupportMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCloudFrontDistributionViewerCertificate {\n");
    sb.append("    acmCertificateArn: ").append(toIndentedString(acmCertificateArn)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateSource: ").append(toIndentedString(certificateSource)).append("\n");
    sb.append("    cloudFrontDefaultCertificate: ").append(toIndentedString(cloudFrontDefaultCertificate)).append("\n");
    sb.append("    iamCertificateId: ").append(toIndentedString(iamCertificateId)).append("\n");
    sb.append("    minimumProtocolVersion: ").append(toIndentedString(minimumProtocolVersion)).append("\n");
    sb.append("    sslSupportMethod: ").append(toIndentedString(sslSupportMethod)).append("\n");
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
    openapiFields.add("AcmCertificateArn");
    openapiFields.add("Certificate");
    openapiFields.add("CertificateSource");
    openapiFields.add("CloudFrontDefaultCertificate");
    openapiFields.add("IamCertificateId");
    openapiFields.add("MinimumProtocolVersion");
    openapiFields.add("SslSupportMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCloudFrontDistributionViewerCertificate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCloudFrontDistributionViewerCertificate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCloudFrontDistributionViewerCertificate is not found in the empty JSON string", AwsCloudFrontDistributionViewerCertificate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCloudFrontDistributionViewerCertificate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCloudFrontDistributionViewerCertificate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcmCertificateArn`
      if (jsonObj.get("AcmCertificateArn") != null && !jsonObj.get("AcmCertificateArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcmCertificateArn"));
      }
      // validate the optional field `Certificate`
      if (jsonObj.get("Certificate") != null && !jsonObj.get("Certificate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Certificate"));
      }
      // validate the optional field `CertificateSource`
      if (jsonObj.get("CertificateSource") != null && !jsonObj.get("CertificateSource").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CertificateSource"));
      }
      // validate the optional field `CloudFrontDefaultCertificate`
      if (jsonObj.get("CloudFrontDefaultCertificate") != null && !jsonObj.get("CloudFrontDefaultCertificate").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CloudFrontDefaultCertificate"));
      }
      // validate the optional field `IamCertificateId`
      if (jsonObj.get("IamCertificateId") != null && !jsonObj.get("IamCertificateId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IamCertificateId"));
      }
      // validate the optional field `MinimumProtocolVersion`
      if (jsonObj.get("MinimumProtocolVersion") != null && !jsonObj.get("MinimumProtocolVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MinimumProtocolVersion"));
      }
      // validate the optional field `SslSupportMethod`
      if (jsonObj.get("SslSupportMethod") != null && !jsonObj.get("SslSupportMethod").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SslSupportMethod"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCloudFrontDistributionViewerCertificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCloudFrontDistributionViewerCertificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCloudFrontDistributionViewerCertificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCloudFrontDistributionViewerCertificate.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCloudFrontDistributionViewerCertificate>() {
           @Override
           public void write(JsonWriter out, AwsCloudFrontDistributionViewerCertificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCloudFrontDistributionViewerCertificate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCloudFrontDistributionViewerCertificate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCloudFrontDistributionViewerCertificate
   * @throws IOException if the JSON string is invalid with respect to AwsCloudFrontDistributionViewerCertificate
   */
  public static AwsCloudFrontDistributionViewerCertificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCloudFrontDistributionViewerCertificate.class);
  }

  /**
   * Convert an instance of AwsCloudFrontDistributionViewerCertificate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

