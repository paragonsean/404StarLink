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
 * Provides the details about the compliance status for a patch.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsSsmComplianceSummary {
  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_COMPLIANT_CRITICAL_COUNT = "CompliantCriticalCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_CRITICAL_COUNT)
  private Integer compliantCriticalCount;

  public static final String SERIALIZED_NAME_COMPLIANT_HIGH_COUNT = "CompliantHighCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_HIGH_COUNT)
  private Integer compliantHighCount;

  public static final String SERIALIZED_NAME_COMPLIANT_MEDIUM_COUNT = "CompliantMediumCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_MEDIUM_COUNT)
  private Integer compliantMediumCount;

  public static final String SERIALIZED_NAME_EXECUTION_TYPE = "ExecutionType";
  @SerializedName(SERIALIZED_NAME_EXECUTION_TYPE)
  private String executionType;

  public static final String SERIALIZED_NAME_NON_COMPLIANT_CRITICAL_COUNT = "NonCompliantCriticalCount";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT_CRITICAL_COUNT)
  private Integer nonCompliantCriticalCount;

  public static final String SERIALIZED_NAME_COMPLIANT_INFORMATIONAL_COUNT = "CompliantInformationalCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_INFORMATIONAL_COUNT)
  private Integer compliantInformationalCount;

  public static final String SERIALIZED_NAME_NON_COMPLIANT_INFORMATIONAL_COUNT = "NonCompliantInformationalCount";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT_INFORMATIONAL_COUNT)
  private Integer nonCompliantInformationalCount;

  public static final String SERIALIZED_NAME_COMPLIANT_UNSPECIFIED_COUNT = "CompliantUnspecifiedCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_UNSPECIFIED_COUNT)
  private Integer compliantUnspecifiedCount;

  public static final String SERIALIZED_NAME_NON_COMPLIANT_LOW_COUNT = "NonCompliantLowCount";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT_LOW_COUNT)
  private Integer nonCompliantLowCount;

  public static final String SERIALIZED_NAME_NON_COMPLIANT_HIGH_COUNT = "NonCompliantHighCount";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT_HIGH_COUNT)
  private Integer nonCompliantHighCount;

  public static final String SERIALIZED_NAME_COMPLIANT_LOW_COUNT = "CompliantLowCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_LOW_COUNT)
  private Integer compliantLowCount;

  public static final String SERIALIZED_NAME_COMPLIANCE_TYPE = "ComplianceType";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_TYPE)
  private String complianceType;

  public static final String SERIALIZED_NAME_PATCH_BASELINE_ID = "PatchBaselineId";
  @SerializedName(SERIALIZED_NAME_PATCH_BASELINE_ID)
  private String patchBaselineId;

  public static final String SERIALIZED_NAME_OVERALL_SEVERITY = "OverallSeverity";
  @SerializedName(SERIALIZED_NAME_OVERALL_SEVERITY)
  private String overallSeverity;

  public static final String SERIALIZED_NAME_NON_COMPLIANT_MEDIUM_COUNT = "NonCompliantMediumCount";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT_MEDIUM_COUNT)
  private Integer nonCompliantMediumCount;

  public static final String SERIALIZED_NAME_NON_COMPLIANT_UNSPECIFIED_COUNT = "NonCompliantUnspecifiedCount";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT_UNSPECIFIED_COUNT)
  private Integer nonCompliantUnspecifiedCount;

  public static final String SERIALIZED_NAME_PATCH_GROUP = "PatchGroup";
  @SerializedName(SERIALIZED_NAME_PATCH_GROUP)
  private String patchGroup;

  public AwsSsmComplianceSummary() {
  }

  public AwsSsmComplianceSummary status(String status) {
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


  public AwsSsmComplianceSummary compliantCriticalCount(Integer compliantCriticalCount) {
    this.compliantCriticalCount = compliantCriticalCount;
    return this;
  }

  /**
   * Get compliantCriticalCount
   * @return compliantCriticalCount
   */
  @javax.annotation.Nullable
  public Integer getCompliantCriticalCount() {
    return compliantCriticalCount;
  }

  public void setCompliantCriticalCount(Integer compliantCriticalCount) {
    this.compliantCriticalCount = compliantCriticalCount;
  }


  public AwsSsmComplianceSummary compliantHighCount(Integer compliantHighCount) {
    this.compliantHighCount = compliantHighCount;
    return this;
  }

  /**
   * Get compliantHighCount
   * @return compliantHighCount
   */
  @javax.annotation.Nullable
  public Integer getCompliantHighCount() {
    return compliantHighCount;
  }

  public void setCompliantHighCount(Integer compliantHighCount) {
    this.compliantHighCount = compliantHighCount;
  }


  public AwsSsmComplianceSummary compliantMediumCount(Integer compliantMediumCount) {
    this.compliantMediumCount = compliantMediumCount;
    return this;
  }

  /**
   * Get compliantMediumCount
   * @return compliantMediumCount
   */
  @javax.annotation.Nullable
  public Integer getCompliantMediumCount() {
    return compliantMediumCount;
  }

  public void setCompliantMediumCount(Integer compliantMediumCount) {
    this.compliantMediumCount = compliantMediumCount;
  }


  public AwsSsmComplianceSummary executionType(String executionType) {
    this.executionType = executionType;
    return this;
  }

  /**
   * Get executionType
   * @return executionType
   */
  @javax.annotation.Nullable
  public String getExecutionType() {
    return executionType;
  }

  public void setExecutionType(String executionType) {
    this.executionType = executionType;
  }


  public AwsSsmComplianceSummary nonCompliantCriticalCount(Integer nonCompliantCriticalCount) {
    this.nonCompliantCriticalCount = nonCompliantCriticalCount;
    return this;
  }

  /**
   * Get nonCompliantCriticalCount
   * @return nonCompliantCriticalCount
   */
  @javax.annotation.Nullable
  public Integer getNonCompliantCriticalCount() {
    return nonCompliantCriticalCount;
  }

  public void setNonCompliantCriticalCount(Integer nonCompliantCriticalCount) {
    this.nonCompliantCriticalCount = nonCompliantCriticalCount;
  }


  public AwsSsmComplianceSummary compliantInformationalCount(Integer compliantInformationalCount) {
    this.compliantInformationalCount = compliantInformationalCount;
    return this;
  }

  /**
   * Get compliantInformationalCount
   * @return compliantInformationalCount
   */
  @javax.annotation.Nullable
  public Integer getCompliantInformationalCount() {
    return compliantInformationalCount;
  }

  public void setCompliantInformationalCount(Integer compliantInformationalCount) {
    this.compliantInformationalCount = compliantInformationalCount;
  }


  public AwsSsmComplianceSummary nonCompliantInformationalCount(Integer nonCompliantInformationalCount) {
    this.nonCompliantInformationalCount = nonCompliantInformationalCount;
    return this;
  }

  /**
   * Get nonCompliantInformationalCount
   * @return nonCompliantInformationalCount
   */
  @javax.annotation.Nullable
  public Integer getNonCompliantInformationalCount() {
    return nonCompliantInformationalCount;
  }

  public void setNonCompliantInformationalCount(Integer nonCompliantInformationalCount) {
    this.nonCompliantInformationalCount = nonCompliantInformationalCount;
  }


  public AwsSsmComplianceSummary compliantUnspecifiedCount(Integer compliantUnspecifiedCount) {
    this.compliantUnspecifiedCount = compliantUnspecifiedCount;
    return this;
  }

  /**
   * Get compliantUnspecifiedCount
   * @return compliantUnspecifiedCount
   */
  @javax.annotation.Nullable
  public Integer getCompliantUnspecifiedCount() {
    return compliantUnspecifiedCount;
  }

  public void setCompliantUnspecifiedCount(Integer compliantUnspecifiedCount) {
    this.compliantUnspecifiedCount = compliantUnspecifiedCount;
  }


  public AwsSsmComplianceSummary nonCompliantLowCount(Integer nonCompliantLowCount) {
    this.nonCompliantLowCount = nonCompliantLowCount;
    return this;
  }

  /**
   * Get nonCompliantLowCount
   * @return nonCompliantLowCount
   */
  @javax.annotation.Nullable
  public Integer getNonCompliantLowCount() {
    return nonCompliantLowCount;
  }

  public void setNonCompliantLowCount(Integer nonCompliantLowCount) {
    this.nonCompliantLowCount = nonCompliantLowCount;
  }


  public AwsSsmComplianceSummary nonCompliantHighCount(Integer nonCompliantHighCount) {
    this.nonCompliantHighCount = nonCompliantHighCount;
    return this;
  }

  /**
   * Get nonCompliantHighCount
   * @return nonCompliantHighCount
   */
  @javax.annotation.Nullable
  public Integer getNonCompliantHighCount() {
    return nonCompliantHighCount;
  }

  public void setNonCompliantHighCount(Integer nonCompliantHighCount) {
    this.nonCompliantHighCount = nonCompliantHighCount;
  }


  public AwsSsmComplianceSummary compliantLowCount(Integer compliantLowCount) {
    this.compliantLowCount = compliantLowCount;
    return this;
  }

  /**
   * Get compliantLowCount
   * @return compliantLowCount
   */
  @javax.annotation.Nullable
  public Integer getCompliantLowCount() {
    return compliantLowCount;
  }

  public void setCompliantLowCount(Integer compliantLowCount) {
    this.compliantLowCount = compliantLowCount;
  }


  public AwsSsmComplianceSummary complianceType(String complianceType) {
    this.complianceType = complianceType;
    return this;
  }

  /**
   * Get complianceType
   * @return complianceType
   */
  @javax.annotation.Nullable
  public String getComplianceType() {
    return complianceType;
  }

  public void setComplianceType(String complianceType) {
    this.complianceType = complianceType;
  }


  public AwsSsmComplianceSummary patchBaselineId(String patchBaselineId) {
    this.patchBaselineId = patchBaselineId;
    return this;
  }

  /**
   * Get patchBaselineId
   * @return patchBaselineId
   */
  @javax.annotation.Nullable
  public String getPatchBaselineId() {
    return patchBaselineId;
  }

  public void setPatchBaselineId(String patchBaselineId) {
    this.patchBaselineId = patchBaselineId;
  }


  public AwsSsmComplianceSummary overallSeverity(String overallSeverity) {
    this.overallSeverity = overallSeverity;
    return this;
  }

  /**
   * Get overallSeverity
   * @return overallSeverity
   */
  @javax.annotation.Nullable
  public String getOverallSeverity() {
    return overallSeverity;
  }

  public void setOverallSeverity(String overallSeverity) {
    this.overallSeverity = overallSeverity;
  }


  public AwsSsmComplianceSummary nonCompliantMediumCount(Integer nonCompliantMediumCount) {
    this.nonCompliantMediumCount = nonCompliantMediumCount;
    return this;
  }

  /**
   * Get nonCompliantMediumCount
   * @return nonCompliantMediumCount
   */
  @javax.annotation.Nullable
  public Integer getNonCompliantMediumCount() {
    return nonCompliantMediumCount;
  }

  public void setNonCompliantMediumCount(Integer nonCompliantMediumCount) {
    this.nonCompliantMediumCount = nonCompliantMediumCount;
  }


  public AwsSsmComplianceSummary nonCompliantUnspecifiedCount(Integer nonCompliantUnspecifiedCount) {
    this.nonCompliantUnspecifiedCount = nonCompliantUnspecifiedCount;
    return this;
  }

  /**
   * Get nonCompliantUnspecifiedCount
   * @return nonCompliantUnspecifiedCount
   */
  @javax.annotation.Nullable
  public Integer getNonCompliantUnspecifiedCount() {
    return nonCompliantUnspecifiedCount;
  }

  public void setNonCompliantUnspecifiedCount(Integer nonCompliantUnspecifiedCount) {
    this.nonCompliantUnspecifiedCount = nonCompliantUnspecifiedCount;
  }


  public AwsSsmComplianceSummary patchGroup(String patchGroup) {
    this.patchGroup = patchGroup;
    return this;
  }

  /**
   * Get patchGroup
   * @return patchGroup
   */
  @javax.annotation.Nullable
  public String getPatchGroup() {
    return patchGroup;
  }

  public void setPatchGroup(String patchGroup) {
    this.patchGroup = patchGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsSsmComplianceSummary awsSsmComplianceSummary = (AwsSsmComplianceSummary) o;
    return Objects.equals(this.status, awsSsmComplianceSummary.status) &&
        Objects.equals(this.compliantCriticalCount, awsSsmComplianceSummary.compliantCriticalCount) &&
        Objects.equals(this.compliantHighCount, awsSsmComplianceSummary.compliantHighCount) &&
        Objects.equals(this.compliantMediumCount, awsSsmComplianceSummary.compliantMediumCount) &&
        Objects.equals(this.executionType, awsSsmComplianceSummary.executionType) &&
        Objects.equals(this.nonCompliantCriticalCount, awsSsmComplianceSummary.nonCompliantCriticalCount) &&
        Objects.equals(this.compliantInformationalCount, awsSsmComplianceSummary.compliantInformationalCount) &&
        Objects.equals(this.nonCompliantInformationalCount, awsSsmComplianceSummary.nonCompliantInformationalCount) &&
        Objects.equals(this.compliantUnspecifiedCount, awsSsmComplianceSummary.compliantUnspecifiedCount) &&
        Objects.equals(this.nonCompliantLowCount, awsSsmComplianceSummary.nonCompliantLowCount) &&
        Objects.equals(this.nonCompliantHighCount, awsSsmComplianceSummary.nonCompliantHighCount) &&
        Objects.equals(this.compliantLowCount, awsSsmComplianceSummary.compliantLowCount) &&
        Objects.equals(this.complianceType, awsSsmComplianceSummary.complianceType) &&
        Objects.equals(this.patchBaselineId, awsSsmComplianceSummary.patchBaselineId) &&
        Objects.equals(this.overallSeverity, awsSsmComplianceSummary.overallSeverity) &&
        Objects.equals(this.nonCompliantMediumCount, awsSsmComplianceSummary.nonCompliantMediumCount) &&
        Objects.equals(this.nonCompliantUnspecifiedCount, awsSsmComplianceSummary.nonCompliantUnspecifiedCount) &&
        Objects.equals(this.patchGroup, awsSsmComplianceSummary.patchGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, compliantCriticalCount, compliantHighCount, compliantMediumCount, executionType, nonCompliantCriticalCount, compliantInformationalCount, nonCompliantInformationalCount, compliantUnspecifiedCount, nonCompliantLowCount, nonCompliantHighCount, compliantLowCount, complianceType, patchBaselineId, overallSeverity, nonCompliantMediumCount, nonCompliantUnspecifiedCount, patchGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsSsmComplianceSummary {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    compliantCriticalCount: ").append(toIndentedString(compliantCriticalCount)).append("\n");
    sb.append("    compliantHighCount: ").append(toIndentedString(compliantHighCount)).append("\n");
    sb.append("    compliantMediumCount: ").append(toIndentedString(compliantMediumCount)).append("\n");
    sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
    sb.append("    nonCompliantCriticalCount: ").append(toIndentedString(nonCompliantCriticalCount)).append("\n");
    sb.append("    compliantInformationalCount: ").append(toIndentedString(compliantInformationalCount)).append("\n");
    sb.append("    nonCompliantInformationalCount: ").append(toIndentedString(nonCompliantInformationalCount)).append("\n");
    sb.append("    compliantUnspecifiedCount: ").append(toIndentedString(compliantUnspecifiedCount)).append("\n");
    sb.append("    nonCompliantLowCount: ").append(toIndentedString(nonCompliantLowCount)).append("\n");
    sb.append("    nonCompliantHighCount: ").append(toIndentedString(nonCompliantHighCount)).append("\n");
    sb.append("    compliantLowCount: ").append(toIndentedString(compliantLowCount)).append("\n");
    sb.append("    complianceType: ").append(toIndentedString(complianceType)).append("\n");
    sb.append("    patchBaselineId: ").append(toIndentedString(patchBaselineId)).append("\n");
    sb.append("    overallSeverity: ").append(toIndentedString(overallSeverity)).append("\n");
    sb.append("    nonCompliantMediumCount: ").append(toIndentedString(nonCompliantMediumCount)).append("\n");
    sb.append("    nonCompliantUnspecifiedCount: ").append(toIndentedString(nonCompliantUnspecifiedCount)).append("\n");
    sb.append("    patchGroup: ").append(toIndentedString(patchGroup)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("CompliantCriticalCount");
    openapiFields.add("CompliantHighCount");
    openapiFields.add("CompliantMediumCount");
    openapiFields.add("ExecutionType");
    openapiFields.add("NonCompliantCriticalCount");
    openapiFields.add("CompliantInformationalCount");
    openapiFields.add("NonCompliantInformationalCount");
    openapiFields.add("CompliantUnspecifiedCount");
    openapiFields.add("NonCompliantLowCount");
    openapiFields.add("NonCompliantHighCount");
    openapiFields.add("CompliantLowCount");
    openapiFields.add("ComplianceType");
    openapiFields.add("PatchBaselineId");
    openapiFields.add("OverallSeverity");
    openapiFields.add("NonCompliantMediumCount");
    openapiFields.add("NonCompliantUnspecifiedCount");
    openapiFields.add("PatchGroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsSsmComplianceSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsSsmComplianceSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsSsmComplianceSummary is not found in the empty JSON string", AwsSsmComplianceSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsSsmComplianceSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsSsmComplianceSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `CompliantCriticalCount`
      if (jsonObj.get("CompliantCriticalCount") != null && !jsonObj.get("CompliantCriticalCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CompliantCriticalCount"));
      }
      // validate the optional field `CompliantHighCount`
      if (jsonObj.get("CompliantHighCount") != null && !jsonObj.get("CompliantHighCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CompliantHighCount"));
      }
      // validate the optional field `CompliantMediumCount`
      if (jsonObj.get("CompliantMediumCount") != null && !jsonObj.get("CompliantMediumCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CompliantMediumCount"));
      }
      // validate the optional field `ExecutionType`
      if (jsonObj.get("ExecutionType") != null && !jsonObj.get("ExecutionType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ExecutionType"));
      }
      // validate the optional field `NonCompliantCriticalCount`
      if (jsonObj.get("NonCompliantCriticalCount") != null && !jsonObj.get("NonCompliantCriticalCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NonCompliantCriticalCount"));
      }
      // validate the optional field `CompliantInformationalCount`
      if (jsonObj.get("CompliantInformationalCount") != null && !jsonObj.get("CompliantInformationalCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CompliantInformationalCount"));
      }
      // validate the optional field `NonCompliantInformationalCount`
      if (jsonObj.get("NonCompliantInformationalCount") != null && !jsonObj.get("NonCompliantInformationalCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NonCompliantInformationalCount"));
      }
      // validate the optional field `CompliantUnspecifiedCount`
      if (jsonObj.get("CompliantUnspecifiedCount") != null && !jsonObj.get("CompliantUnspecifiedCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CompliantUnspecifiedCount"));
      }
      // validate the optional field `NonCompliantLowCount`
      if (jsonObj.get("NonCompliantLowCount") != null && !jsonObj.get("NonCompliantLowCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NonCompliantLowCount"));
      }
      // validate the optional field `NonCompliantHighCount`
      if (jsonObj.get("NonCompliantHighCount") != null && !jsonObj.get("NonCompliantHighCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NonCompliantHighCount"));
      }
      // validate the optional field `CompliantLowCount`
      if (jsonObj.get("CompliantLowCount") != null && !jsonObj.get("CompliantLowCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CompliantLowCount"));
      }
      // validate the optional field `ComplianceType`
      if (jsonObj.get("ComplianceType") != null && !jsonObj.get("ComplianceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ComplianceType"));
      }
      // validate the optional field `PatchBaselineId`
      if (jsonObj.get("PatchBaselineId") != null && !jsonObj.get("PatchBaselineId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PatchBaselineId"));
      }
      // validate the optional field `OverallSeverity`
      if (jsonObj.get("OverallSeverity") != null && !jsonObj.get("OverallSeverity").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OverallSeverity"));
      }
      // validate the optional field `NonCompliantMediumCount`
      if (jsonObj.get("NonCompliantMediumCount") != null && !jsonObj.get("NonCompliantMediumCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NonCompliantMediumCount"));
      }
      // validate the optional field `NonCompliantUnspecifiedCount`
      if (jsonObj.get("NonCompliantUnspecifiedCount") != null && !jsonObj.get("NonCompliantUnspecifiedCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NonCompliantUnspecifiedCount"));
      }
      // validate the optional field `PatchGroup`
      if (jsonObj.get("PatchGroup") != null && !jsonObj.get("PatchGroup").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PatchGroup"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsSsmComplianceSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsSsmComplianceSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsSsmComplianceSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsSsmComplianceSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsSsmComplianceSummary>() {
           @Override
           public void write(JsonWriter out, AwsSsmComplianceSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsSsmComplianceSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsSsmComplianceSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsSsmComplianceSummary
   * @throws IOException if the JSON string is invalid with respect to AwsSsmComplianceSummary
   */
  public static AwsSsmComplianceSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsSsmComplianceSummary.class);
  }

  /**
   * Convert an instance of AwsSsmComplianceSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

