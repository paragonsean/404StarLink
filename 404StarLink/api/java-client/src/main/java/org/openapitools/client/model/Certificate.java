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
import org.openapitools.client.model.CertificateRenewalSummary;
import org.openapitools.client.model.CertificateStatus;

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
 * &lt;p&gt;Describes the full details of an Amazon Lightsail SSL/TLS certificate.&lt;/p&gt; &lt;note&gt; &lt;p&gt;To get a summary of a certificate, use the &lt;code&gt;GetCertificates&lt;/code&gt; action and ommit &lt;code&gt;includeCertificateDetails&lt;/code&gt; from your request. The response will include only the certificate Amazon Resource Name (ARN), certificate name, domain name, and tags.&lt;/p&gt; &lt;/note&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Certificate {
  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CertificateStatus status;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_SUBJECT_ALTERNATIVE_NAMES = "subjectAlternativeNames";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ALTERNATIVE_NAMES)
  private List subjectAlternativeNames;

  public static final String SERIALIZED_NAME_DOMAIN_VALIDATION_RECORDS = "domainValidationRecords";
  @SerializedName(SERIALIZED_NAME_DOMAIN_VALIDATION_RECORDS)
  private List domainValidationRecords;

  public static final String SERIALIZED_NAME_REQUEST_FAILURE_REASON = "requestFailureReason";
  @SerializedName(SERIALIZED_NAME_REQUEST_FAILURE_REASON)
  private String requestFailureReason;

  public static final String SERIALIZED_NAME_IN_USE_RESOURCE_COUNT = "inUseResourceCount";
  @SerializedName(SERIALIZED_NAME_IN_USE_RESOURCE_COUNT)
  private Integer inUseResourceCount;

  public static final String SERIALIZED_NAME_KEY_ALGORITHM = "keyAlgorithm";
  @SerializedName(SERIALIZED_NAME_KEY_ALGORITHM)
  private String keyAlgorithm;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issuedAt";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_ISSUER_C_A = "issuerCA";
  @SerializedName(SERIALIZED_NAME_ISSUER_C_A)
  private String issuerCA;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_ELIGIBLE_TO_RENEW = "eligibleToRenew";
  @SerializedName(SERIALIZED_NAME_ELIGIBLE_TO_RENEW)
  private String eligibleToRenew;

  public static final String SERIALIZED_NAME_RENEWAL_SUMMARY = "renewalSummary";
  @SerializedName(SERIALIZED_NAME_RENEWAL_SUMMARY)
  private CertificateRenewalSummary renewalSummary;

  public static final String SERIALIZED_NAME_REVOKED_AT = "revokedAt";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT)
  private OffsetDateTime revokedAt;

  public static final String SERIALIZED_NAME_REVOCATION_REASON = "revocationReason";
  @SerializedName(SERIALIZED_NAME_REVOCATION_REASON)
  private String revocationReason;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_SUPPORT_CODE = "supportCode";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CODE)
  private String supportCode;

  public Certificate() {
  }

  public Certificate arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public Certificate name(String name) {
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


  public Certificate domainName(String domainName) {
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


  public Certificate status(CertificateStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public CertificateStatus getStatus() {
    return status;
  }

  public void setStatus(CertificateStatus status) {
    this.status = status;
  }


  public Certificate serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Certificate subjectAlternativeNames(List subjectAlternativeNames) {
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


  public Certificate domainValidationRecords(List domainValidationRecords) {
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


  public Certificate requestFailureReason(String requestFailureReason) {
    this.requestFailureReason = requestFailureReason;
    return this;
  }

  /**
   * Get requestFailureReason
   * @return requestFailureReason
   */
  @javax.annotation.Nullable
  public String getRequestFailureReason() {
    return requestFailureReason;
  }

  public void setRequestFailureReason(String requestFailureReason) {
    this.requestFailureReason = requestFailureReason;
  }


  public Certificate inUseResourceCount(Integer inUseResourceCount) {
    this.inUseResourceCount = inUseResourceCount;
    return this;
  }

  /**
   * Get inUseResourceCount
   * @return inUseResourceCount
   */
  @javax.annotation.Nullable
  public Integer getInUseResourceCount() {
    return inUseResourceCount;
  }

  public void setInUseResourceCount(Integer inUseResourceCount) {
    this.inUseResourceCount = inUseResourceCount;
  }


  public Certificate keyAlgorithm(String keyAlgorithm) {
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


  public Certificate createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Certificate issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public Certificate issuerCA(String issuerCA) {
    this.issuerCA = issuerCA;
    return this;
  }

  /**
   * Get issuerCA
   * @return issuerCA
   */
  @javax.annotation.Nullable
  public String getIssuerCA() {
    return issuerCA;
  }

  public void setIssuerCA(String issuerCA) {
    this.issuerCA = issuerCA;
  }


  public Certificate notBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public Certificate notAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public Certificate eligibleToRenew(String eligibleToRenew) {
    this.eligibleToRenew = eligibleToRenew;
    return this;
  }

  /**
   * Get eligibleToRenew
   * @return eligibleToRenew
   */
  @javax.annotation.Nullable
  public String getEligibleToRenew() {
    return eligibleToRenew;
  }

  public void setEligibleToRenew(String eligibleToRenew) {
    this.eligibleToRenew = eligibleToRenew;
  }


  public Certificate renewalSummary(CertificateRenewalSummary renewalSummary) {
    this.renewalSummary = renewalSummary;
    return this;
  }

  /**
   * Get renewalSummary
   * @return renewalSummary
   */
  @javax.annotation.Nullable
  public CertificateRenewalSummary getRenewalSummary() {
    return renewalSummary;
  }

  public void setRenewalSummary(CertificateRenewalSummary renewalSummary) {
    this.renewalSummary = renewalSummary;
  }


  public Certificate revokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
    return this;
  }

  /**
   * Get revokedAt
   * @return revokedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRevokedAt() {
    return revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
  }


  public Certificate revocationReason(String revocationReason) {
    this.revocationReason = revocationReason;
    return this;
  }

  /**
   * Get revocationReason
   * @return revocationReason
   */
  @javax.annotation.Nullable
  public String getRevocationReason() {
    return revocationReason;
  }

  public void setRevocationReason(String revocationReason) {
    this.revocationReason = revocationReason;
  }


  public Certificate tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public Certificate supportCode(String supportCode) {
    this.supportCode = supportCode;
    return this;
  }

  /**
   * Get supportCode
   * @return supportCode
   */
  @javax.annotation.Nullable
  public String getSupportCode() {
    return supportCode;
  }

  public void setSupportCode(String supportCode) {
    this.supportCode = supportCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificate certificate = (Certificate) o;
    return Objects.equals(this.arn, certificate.arn) &&
        Objects.equals(this.name, certificate.name) &&
        Objects.equals(this.domainName, certificate.domainName) &&
        Objects.equals(this.status, certificate.status) &&
        Objects.equals(this.serialNumber, certificate.serialNumber) &&
        Objects.equals(this.subjectAlternativeNames, certificate.subjectAlternativeNames) &&
        Objects.equals(this.domainValidationRecords, certificate.domainValidationRecords) &&
        Objects.equals(this.requestFailureReason, certificate.requestFailureReason) &&
        Objects.equals(this.inUseResourceCount, certificate.inUseResourceCount) &&
        Objects.equals(this.keyAlgorithm, certificate.keyAlgorithm) &&
        Objects.equals(this.createdAt, certificate.createdAt) &&
        Objects.equals(this.issuedAt, certificate.issuedAt) &&
        Objects.equals(this.issuerCA, certificate.issuerCA) &&
        Objects.equals(this.notBefore, certificate.notBefore) &&
        Objects.equals(this.notAfter, certificate.notAfter) &&
        Objects.equals(this.eligibleToRenew, certificate.eligibleToRenew) &&
        Objects.equals(this.renewalSummary, certificate.renewalSummary) &&
        Objects.equals(this.revokedAt, certificate.revokedAt) &&
        Objects.equals(this.revocationReason, certificate.revocationReason) &&
        Objects.equals(this.tags, certificate.tags) &&
        Objects.equals(this.supportCode, certificate.supportCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, name, domainName, status, serialNumber, subjectAlternativeNames, domainValidationRecords, requestFailureReason, inUseResourceCount, keyAlgorithm, createdAt, issuedAt, issuerCA, notBefore, notAfter, eligibleToRenew, renewalSummary, revokedAt, revocationReason, tags, supportCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
    sb.append("    domainValidationRecords: ").append(toIndentedString(domainValidationRecords)).append("\n");
    sb.append("    requestFailureReason: ").append(toIndentedString(requestFailureReason)).append("\n");
    sb.append("    inUseResourceCount: ").append(toIndentedString(inUseResourceCount)).append("\n");
    sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    issuerCA: ").append(toIndentedString(issuerCA)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    eligibleToRenew: ").append(toIndentedString(eligibleToRenew)).append("\n");
    sb.append("    renewalSummary: ").append(toIndentedString(renewalSummary)).append("\n");
    sb.append("    revokedAt: ").append(toIndentedString(revokedAt)).append("\n");
    sb.append("    revocationReason: ").append(toIndentedString(revocationReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
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
    openapiFields.add("arn");
    openapiFields.add("name");
    openapiFields.add("domainName");
    openapiFields.add("status");
    openapiFields.add("serialNumber");
    openapiFields.add("subjectAlternativeNames");
    openapiFields.add("domainValidationRecords");
    openapiFields.add("requestFailureReason");
    openapiFields.add("inUseResourceCount");
    openapiFields.add("keyAlgorithm");
    openapiFields.add("createdAt");
    openapiFields.add("issuedAt");
    openapiFields.add("issuerCA");
    openapiFields.add("notBefore");
    openapiFields.add("notAfter");
    openapiFields.add("eligibleToRenew");
    openapiFields.add("renewalSummary");
    openapiFields.add("revokedAt");
    openapiFields.add("revocationReason");
    openapiFields.add("tags");
    openapiFields.add("supportCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Certificate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Certificate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Certificate is not found in the empty JSON string", Certificate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Certificate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Certificate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `domainName`
      if (jsonObj.get("domainName") != null && !jsonObj.get("domainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("domainName"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        CertificateStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `serialNumber`
      if (jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("serialNumber"));
      }
      // validate the optional field `subjectAlternativeNames`
      if (jsonObj.get("subjectAlternativeNames") != null && !jsonObj.get("subjectAlternativeNames").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("subjectAlternativeNames"));
      }
      // validate the optional field `domainValidationRecords`
      if (jsonObj.get("domainValidationRecords") != null && !jsonObj.get("domainValidationRecords").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("domainValidationRecords"));
      }
      // validate the optional field `requestFailureReason`
      if (jsonObj.get("requestFailureReason") != null && !jsonObj.get("requestFailureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("requestFailureReason"));
      }
      // validate the optional field `inUseResourceCount`
      if (jsonObj.get("inUseResourceCount") != null && !jsonObj.get("inUseResourceCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("inUseResourceCount"));
      }
      // validate the optional field `keyAlgorithm`
      if (jsonObj.get("keyAlgorithm") != null && !jsonObj.get("keyAlgorithm").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("keyAlgorithm"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `issuedAt`
      if (jsonObj.get("issuedAt") != null && !jsonObj.get("issuedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("issuedAt"));
      }
      // validate the optional field `issuerCA`
      if (jsonObj.get("issuerCA") != null && !jsonObj.get("issuerCA").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("issuerCA"));
      }
      // validate the optional field `notBefore`
      if (jsonObj.get("notBefore") != null && !jsonObj.get("notBefore").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("notBefore"));
      }
      // validate the optional field `notAfter`
      if (jsonObj.get("notAfter") != null && !jsonObj.get("notAfter").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("notAfter"));
      }
      // validate the optional field `eligibleToRenew`
      if (jsonObj.get("eligibleToRenew") != null && !jsonObj.get("eligibleToRenew").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("eligibleToRenew"));
      }
      // validate the optional field `renewalSummary`
      if (jsonObj.get("renewalSummary") != null && !jsonObj.get("renewalSummary").isJsonNull()) {
        CertificateRenewalSummary.validateJsonElement(jsonObj.get("renewalSummary"));
      }
      // validate the optional field `revokedAt`
      if (jsonObj.get("revokedAt") != null && !jsonObj.get("revokedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("revokedAt"));
      }
      // validate the optional field `revocationReason`
      if (jsonObj.get("revocationReason") != null && !jsonObj.get("revocationReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("revocationReason"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `supportCode`
      if (jsonObj.get("supportCode") != null && !jsonObj.get("supportCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("supportCode"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Certificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Certificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Certificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Certificate.class));

       return (TypeAdapter<T>) new TypeAdapter<Certificate>() {
           @Override
           public void write(JsonWriter out, Certificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Certificate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Certificate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Certificate
   * @throws IOException if the JSON string is invalid with respect to Certificate
   */
  public static Certificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Certificate.class);
  }

  /**
   * Convert an instance of Certificate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

