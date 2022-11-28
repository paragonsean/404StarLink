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
import org.openapitools.client.model.AwsCertificateManagerCertificateDetailsOptions;
import org.openapitools.client.model.AwsCertificateManagerCertificateDetailsRenewalSummary;

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
 * Provides details about an Certificate Manager certificate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCertificateManagerCertificateDetails {
  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_ARN = "CertificateAuthorityArn";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_ARN)
  private String certificateAuthorityArn;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_DOMAIN_VALIDATION_OPTIONS = "DomainValidationOptions";
  @SerializedName(SERIALIZED_NAME_DOMAIN_VALIDATION_OPTIONS)
  private List domainValidationOptions;

  public static final String SERIALIZED_NAME_EXTENDED_KEY_USAGES = "ExtendedKeyUsages";
  @SerializedName(SERIALIZED_NAME_EXTENDED_KEY_USAGES)
  private List extendedKeyUsages;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "FailureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_IMPORTED_AT = "ImportedAt";
  @SerializedName(SERIALIZED_NAME_IMPORTED_AT)
  private String importedAt;

  public static final String SERIALIZED_NAME_IN_USE_BY = "InUseBy";
  @SerializedName(SERIALIZED_NAME_IN_USE_BY)
  private List inUseBy;

  public static final String SERIALIZED_NAME_ISSUED_AT = "IssuedAt";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private String issuedAt;

  public static final String SERIALIZED_NAME_ISSUER = "Issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_KEY_ALGORITHM = "KeyAlgorithm";
  @SerializedName(SERIALIZED_NAME_KEY_ALGORITHM)
  private String keyAlgorithm;

  public static final String SERIALIZED_NAME_KEY_USAGES = "KeyUsages";
  @SerializedName(SERIALIZED_NAME_KEY_USAGES)
  private List keyUsages;

  public static final String SERIALIZED_NAME_NOT_AFTER = "NotAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private String notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "NotBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private String notBefore;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private AwsCertificateManagerCertificateDetailsOptions options;

  public static final String SERIALIZED_NAME_RENEWAL_ELIGIBILITY = "RenewalEligibility";
  @SerializedName(SERIALIZED_NAME_RENEWAL_ELIGIBILITY)
  private String renewalEligibility;

  public static final String SERIALIZED_NAME_RENEWAL_SUMMARY = "RenewalSummary";
  @SerializedName(SERIALIZED_NAME_RENEWAL_SUMMARY)
  private AwsCertificateManagerCertificateDetailsRenewalSummary renewalSummary;

  public static final String SERIALIZED_NAME_SERIAL = "Serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM = "SignatureAlgorithm";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM)
  private String signatureAlgorithm;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_SUBJECT_ALTERNATIVE_NAMES = "SubjectAlternativeNames";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ALTERNATIVE_NAMES)
  private List subjectAlternativeNames;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AwsCertificateManagerCertificateDetails() {
  }

  public AwsCertificateManagerCertificateDetails certificateAuthorityArn(String certificateAuthorityArn) {
    this.certificateAuthorityArn = certificateAuthorityArn;
    return this;
  }

  /**
   * Get certificateAuthorityArn
   * @return certificateAuthorityArn
   */
  @javax.annotation.Nullable
  public String getCertificateAuthorityArn() {
    return certificateAuthorityArn;
  }

  public void setCertificateAuthorityArn(String certificateAuthorityArn) {
    this.certificateAuthorityArn = certificateAuthorityArn;
  }


  public AwsCertificateManagerCertificateDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public AwsCertificateManagerCertificateDetails domainName(String domainName) {
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


  public AwsCertificateManagerCertificateDetails domainValidationOptions(List domainValidationOptions) {
    this.domainValidationOptions = domainValidationOptions;
    return this;
  }

  /**
   * Get domainValidationOptions
   * @return domainValidationOptions
   */
  @javax.annotation.Nullable
  public List getDomainValidationOptions() {
    return domainValidationOptions;
  }

  public void setDomainValidationOptions(List domainValidationOptions) {
    this.domainValidationOptions = domainValidationOptions;
  }


  public AwsCertificateManagerCertificateDetails extendedKeyUsages(List extendedKeyUsages) {
    this.extendedKeyUsages = extendedKeyUsages;
    return this;
  }

  /**
   * Get extendedKeyUsages
   * @return extendedKeyUsages
   */
  @javax.annotation.Nullable
  public List getExtendedKeyUsages() {
    return extendedKeyUsages;
  }

  public void setExtendedKeyUsages(List extendedKeyUsages) {
    this.extendedKeyUsages = extendedKeyUsages;
  }


  public AwsCertificateManagerCertificateDetails failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public AwsCertificateManagerCertificateDetails importedAt(String importedAt) {
    this.importedAt = importedAt;
    return this;
  }

  /**
   * Get importedAt
   * @return importedAt
   */
  @javax.annotation.Nullable
  public String getImportedAt() {
    return importedAt;
  }

  public void setImportedAt(String importedAt) {
    this.importedAt = importedAt;
  }


  public AwsCertificateManagerCertificateDetails inUseBy(List inUseBy) {
    this.inUseBy = inUseBy;
    return this;
  }

  /**
   * Get inUseBy
   * @return inUseBy
   */
  @javax.annotation.Nullable
  public List getInUseBy() {
    return inUseBy;
  }

  public void setInUseBy(List inUseBy) {
    this.inUseBy = inUseBy;
  }


  public AwsCertificateManagerCertificateDetails issuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @javax.annotation.Nullable
  public String getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
  }


  public AwsCertificateManagerCertificateDetails issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   */
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public AwsCertificateManagerCertificateDetails keyAlgorithm(String keyAlgorithm) {
    this.keyAlgorithm = keyAlgorithm;
    return this;
  }

  /**
   * Get keyAlgorithm
   * @return keyAlgorithm
   */
  @javax.annotation.Nullable
  public String getKeyAlgorithm() {
    return keyAlgorithm;
  }

  public void setKeyAlgorithm(String keyAlgorithm) {
    this.keyAlgorithm = keyAlgorithm;
  }


  public AwsCertificateManagerCertificateDetails keyUsages(List keyUsages) {
    this.keyUsages = keyUsages;
    return this;
  }

  /**
   * Get keyUsages
   * @return keyUsages
   */
  @javax.annotation.Nullable
  public List getKeyUsages() {
    return keyUsages;
  }

  public void setKeyUsages(List keyUsages) {
    this.keyUsages = keyUsages;
  }


  public AwsCertificateManagerCertificateDetails notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
   */
  @javax.annotation.Nullable
  public String getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }


  public AwsCertificateManagerCertificateDetails notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   */
  @javax.annotation.Nullable
  public String getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }


  public AwsCertificateManagerCertificateDetails options(AwsCertificateManagerCertificateDetailsOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public AwsCertificateManagerCertificateDetailsOptions getOptions() {
    return options;
  }

  public void setOptions(AwsCertificateManagerCertificateDetailsOptions options) {
    this.options = options;
  }


  public AwsCertificateManagerCertificateDetails renewalEligibility(String renewalEligibility) {
    this.renewalEligibility = renewalEligibility;
    return this;
  }

  /**
   * Get renewalEligibility
   * @return renewalEligibility
   */
  @javax.annotation.Nullable
  public String getRenewalEligibility() {
    return renewalEligibility;
  }

  public void setRenewalEligibility(String renewalEligibility) {
    this.renewalEligibility = renewalEligibility;
  }


  public AwsCertificateManagerCertificateDetails renewalSummary(AwsCertificateManagerCertificateDetailsRenewalSummary renewalSummary) {
    this.renewalSummary = renewalSummary;
    return this;
  }

  /**
   * Get renewalSummary
   * @return renewalSummary
   */
  @javax.annotation.Nullable
  public AwsCertificateManagerCertificateDetailsRenewalSummary getRenewalSummary() {
    return renewalSummary;
  }

  public void setRenewalSummary(AwsCertificateManagerCertificateDetailsRenewalSummary renewalSummary) {
    this.renewalSummary = renewalSummary;
  }


  public AwsCertificateManagerCertificateDetails serial(String serial) {
    this.serial = serial;
    return this;
  }

  /**
   * Get serial
   * @return serial
   */
  @javax.annotation.Nullable
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }


  public AwsCertificateManagerCertificateDetails signatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

  /**
   * Get signatureAlgorithm
   * @return signatureAlgorithm
   */
  @javax.annotation.Nullable
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }


  public AwsCertificateManagerCertificateDetails status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public AwsCertificateManagerCertificateDetails subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public AwsCertificateManagerCertificateDetails subjectAlternativeNames(List subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
    return this;
  }

  /**
   * Get subjectAlternativeNames
   * @return subjectAlternativeNames
   */
  @javax.annotation.Nullable
  public List getSubjectAlternativeNames() {
    return subjectAlternativeNames;
  }

  public void setSubjectAlternativeNames(List subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
  }


  public AwsCertificateManagerCertificateDetails type(String type) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCertificateManagerCertificateDetails awsCertificateManagerCertificateDetails = (AwsCertificateManagerCertificateDetails) o;
    return Objects.equals(this.certificateAuthorityArn, awsCertificateManagerCertificateDetails.certificateAuthorityArn) &&
        Objects.equals(this.createdAt, awsCertificateManagerCertificateDetails.createdAt) &&
        Objects.equals(this.domainName, awsCertificateManagerCertificateDetails.domainName) &&
        Objects.equals(this.domainValidationOptions, awsCertificateManagerCertificateDetails.domainValidationOptions) &&
        Objects.equals(this.extendedKeyUsages, awsCertificateManagerCertificateDetails.extendedKeyUsages) &&
        Objects.equals(this.failureReason, awsCertificateManagerCertificateDetails.failureReason) &&
        Objects.equals(this.importedAt, awsCertificateManagerCertificateDetails.importedAt) &&
        Objects.equals(this.inUseBy, awsCertificateManagerCertificateDetails.inUseBy) &&
        Objects.equals(this.issuedAt, awsCertificateManagerCertificateDetails.issuedAt) &&
        Objects.equals(this.issuer, awsCertificateManagerCertificateDetails.issuer) &&
        Objects.equals(this.keyAlgorithm, awsCertificateManagerCertificateDetails.keyAlgorithm) &&
        Objects.equals(this.keyUsages, awsCertificateManagerCertificateDetails.keyUsages) &&
        Objects.equals(this.notAfter, awsCertificateManagerCertificateDetails.notAfter) &&
        Objects.equals(this.notBefore, awsCertificateManagerCertificateDetails.notBefore) &&
        Objects.equals(this.options, awsCertificateManagerCertificateDetails.options) &&
        Objects.equals(this.renewalEligibility, awsCertificateManagerCertificateDetails.renewalEligibility) &&
        Objects.equals(this.renewalSummary, awsCertificateManagerCertificateDetails.renewalSummary) &&
        Objects.equals(this.serial, awsCertificateManagerCertificateDetails.serial) &&
        Objects.equals(this.signatureAlgorithm, awsCertificateManagerCertificateDetails.signatureAlgorithm) &&
        Objects.equals(this.status, awsCertificateManagerCertificateDetails.status) &&
        Objects.equals(this.subject, awsCertificateManagerCertificateDetails.subject) &&
        Objects.equals(this.subjectAlternativeNames, awsCertificateManagerCertificateDetails.subjectAlternativeNames) &&
        Objects.equals(this.type, awsCertificateManagerCertificateDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateAuthorityArn, createdAt, domainName, domainValidationOptions, extendedKeyUsages, failureReason, importedAt, inUseBy, issuedAt, issuer, keyAlgorithm, keyUsages, notAfter, notBefore, options, renewalEligibility, renewalSummary, serial, signatureAlgorithm, status, subject, subjectAlternativeNames, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCertificateManagerCertificateDetails {\n");
    sb.append("    certificateAuthorityArn: ").append(toIndentedString(certificateAuthorityArn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    domainValidationOptions: ").append(toIndentedString(domainValidationOptions)).append("\n");
    sb.append("    extendedKeyUsages: ").append(toIndentedString(extendedKeyUsages)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    importedAt: ").append(toIndentedString(importedAt)).append("\n");
    sb.append("    inUseBy: ").append(toIndentedString(inUseBy)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
    sb.append("    keyUsages: ").append(toIndentedString(keyUsages)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    renewalEligibility: ").append(toIndentedString(renewalEligibility)).append("\n");
    sb.append("    renewalSummary: ").append(toIndentedString(renewalSummary)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("CertificateAuthorityArn");
    openapiFields.add("CreatedAt");
    openapiFields.add("DomainName");
    openapiFields.add("DomainValidationOptions");
    openapiFields.add("ExtendedKeyUsages");
    openapiFields.add("FailureReason");
    openapiFields.add("ImportedAt");
    openapiFields.add("InUseBy");
    openapiFields.add("IssuedAt");
    openapiFields.add("Issuer");
    openapiFields.add("KeyAlgorithm");
    openapiFields.add("KeyUsages");
    openapiFields.add("NotAfter");
    openapiFields.add("NotBefore");
    openapiFields.add("Options");
    openapiFields.add("RenewalEligibility");
    openapiFields.add("RenewalSummary");
    openapiFields.add("Serial");
    openapiFields.add("SignatureAlgorithm");
    openapiFields.add("Status");
    openapiFields.add("Subject");
    openapiFields.add("SubjectAlternativeNames");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCertificateManagerCertificateDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCertificateManagerCertificateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCertificateManagerCertificateDetails is not found in the empty JSON string", AwsCertificateManagerCertificateDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCertificateManagerCertificateDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCertificateManagerCertificateDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CertificateAuthorityArn`
      if (jsonObj.get("CertificateAuthorityArn") != null && !jsonObj.get("CertificateAuthorityArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CertificateAuthorityArn"));
      }
      // validate the optional field `CreatedAt`
      if (jsonObj.get("CreatedAt") != null && !jsonObj.get("CreatedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedAt"));
      }
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `DomainValidationOptions`
      if (jsonObj.get("DomainValidationOptions") != null && !jsonObj.get("DomainValidationOptions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("DomainValidationOptions"));
      }
      // validate the optional field `ExtendedKeyUsages`
      if (jsonObj.get("ExtendedKeyUsages") != null && !jsonObj.get("ExtendedKeyUsages").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ExtendedKeyUsages"));
      }
      // validate the optional field `FailureReason`
      if (jsonObj.get("FailureReason") != null && !jsonObj.get("FailureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FailureReason"));
      }
      // validate the optional field `ImportedAt`
      if (jsonObj.get("ImportedAt") != null && !jsonObj.get("ImportedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImportedAt"));
      }
      // validate the optional field `InUseBy`
      if (jsonObj.get("InUseBy") != null && !jsonObj.get("InUseBy").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("InUseBy"));
      }
      // validate the optional field `IssuedAt`
      if (jsonObj.get("IssuedAt") != null && !jsonObj.get("IssuedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IssuedAt"));
      }
      // validate the optional field `Issuer`
      if (jsonObj.get("Issuer") != null && !jsonObj.get("Issuer").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Issuer"));
      }
      // validate the optional field `KeyAlgorithm`
      if (jsonObj.get("KeyAlgorithm") != null && !jsonObj.get("KeyAlgorithm").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KeyAlgorithm"));
      }
      // validate the optional field `KeyUsages`
      if (jsonObj.get("KeyUsages") != null && !jsonObj.get("KeyUsages").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("KeyUsages"));
      }
      // validate the optional field `NotAfter`
      if (jsonObj.get("NotAfter") != null && !jsonObj.get("NotAfter").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NotAfter"));
      }
      // validate the optional field `NotBefore`
      if (jsonObj.get("NotBefore") != null && !jsonObj.get("NotBefore").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NotBefore"));
      }
      // validate the optional field `Options`
      if (jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull()) {
        AwsCertificateManagerCertificateDetailsOptions.validateJsonElement(jsonObj.get("Options"));
      }
      // validate the optional field `RenewalEligibility`
      if (jsonObj.get("RenewalEligibility") != null && !jsonObj.get("RenewalEligibility").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RenewalEligibility"));
      }
      // validate the optional field `RenewalSummary`
      if (jsonObj.get("RenewalSummary") != null && !jsonObj.get("RenewalSummary").isJsonNull()) {
        AwsCertificateManagerCertificateDetailsRenewalSummary.validateJsonElement(jsonObj.get("RenewalSummary"));
      }
      // validate the optional field `Serial`
      if (jsonObj.get("Serial") != null && !jsonObj.get("Serial").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Serial"));
      }
      // validate the optional field `SignatureAlgorithm`
      if (jsonObj.get("SignatureAlgorithm") != null && !jsonObj.get("SignatureAlgorithm").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SignatureAlgorithm"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Subject`
      if (jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Subject"));
      }
      // validate the optional field `SubjectAlternativeNames`
      if (jsonObj.get("SubjectAlternativeNames") != null && !jsonObj.get("SubjectAlternativeNames").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SubjectAlternativeNames"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCertificateManagerCertificateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCertificateManagerCertificateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCertificateManagerCertificateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCertificateManagerCertificateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCertificateManagerCertificateDetails>() {
           @Override
           public void write(JsonWriter out, AwsCertificateManagerCertificateDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCertificateManagerCertificateDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCertificateManagerCertificateDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCertificateManagerCertificateDetails
   * @throws IOException if the JSON string is invalid with respect to AwsCertificateManagerCertificateDetails
   */
  public static AwsCertificateManagerCertificateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCertificateManagerCertificateDetails.class);
  }

  /**
   * Convert an instance of AwsCertificateManagerCertificateDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

