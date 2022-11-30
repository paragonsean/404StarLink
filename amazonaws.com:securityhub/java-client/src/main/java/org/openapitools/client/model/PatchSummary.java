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
 * Provides an overview of the patch compliance status for an instance against a selected compliance standard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PatchSummary {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTALLED_COUNT = "InstalledCount";
  @SerializedName(SERIALIZED_NAME_INSTALLED_COUNT)
  private Integer installedCount;

  public static final String SERIALIZED_NAME_MISSING_COUNT = "MissingCount";
  @SerializedName(SERIALIZED_NAME_MISSING_COUNT)
  private Integer missingCount;

  public static final String SERIALIZED_NAME_FAILED_COUNT = "FailedCount";
  @SerializedName(SERIALIZED_NAME_FAILED_COUNT)
  private Integer failedCount;

  public static final String SERIALIZED_NAME_INSTALLED_OTHER_COUNT = "InstalledOtherCount";
  @SerializedName(SERIALIZED_NAME_INSTALLED_OTHER_COUNT)
  private Integer installedOtherCount;

  public static final String SERIALIZED_NAME_INSTALLED_REJECTED_COUNT = "InstalledRejectedCount";
  @SerializedName(SERIALIZED_NAME_INSTALLED_REJECTED_COUNT)
  private Integer installedRejectedCount;

  public static final String SERIALIZED_NAME_INSTALLED_PENDING_REBOOT = "InstalledPendingReboot";
  @SerializedName(SERIALIZED_NAME_INSTALLED_PENDING_REBOOT)
  private Integer installedPendingReboot;

  public static final String SERIALIZED_NAME_OPERATION_START_TIME = "OperationStartTime";
  @SerializedName(SERIALIZED_NAME_OPERATION_START_TIME)
  private String operationStartTime;

  public static final String SERIALIZED_NAME_OPERATION_END_TIME = "OperationEndTime";
  @SerializedName(SERIALIZED_NAME_OPERATION_END_TIME)
  private String operationEndTime;

  public static final String SERIALIZED_NAME_REBOOT_OPTION = "RebootOption";
  @SerializedName(SERIALIZED_NAME_REBOOT_OPTION)
  private String rebootOption;

  public static final String SERIALIZED_NAME_OPERATION = "Operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public PatchSummary() {
  }

  public PatchSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public PatchSummary installedCount(Integer installedCount) {
    this.installedCount = installedCount;
    return this;
  }

  /**
   * Get installedCount
   * @return installedCount
   */
  @javax.annotation.Nullable
  public Integer getInstalledCount() {
    return installedCount;
  }

  public void setInstalledCount(Integer installedCount) {
    this.installedCount = installedCount;
  }


  public PatchSummary missingCount(Integer missingCount) {
    this.missingCount = missingCount;
    return this;
  }

  /**
   * Get missingCount
   * @return missingCount
   */
  @javax.annotation.Nullable
  public Integer getMissingCount() {
    return missingCount;
  }

  public void setMissingCount(Integer missingCount) {
    this.missingCount = missingCount;
  }


  public PatchSummary failedCount(Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

  /**
   * Get failedCount
   * @return failedCount
   */
  @javax.annotation.Nullable
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }


  public PatchSummary installedOtherCount(Integer installedOtherCount) {
    this.installedOtherCount = installedOtherCount;
    return this;
  }

  /**
   * Get installedOtherCount
   * @return installedOtherCount
   */
  @javax.annotation.Nullable
  public Integer getInstalledOtherCount() {
    return installedOtherCount;
  }

  public void setInstalledOtherCount(Integer installedOtherCount) {
    this.installedOtherCount = installedOtherCount;
  }


  public PatchSummary installedRejectedCount(Integer installedRejectedCount) {
    this.installedRejectedCount = installedRejectedCount;
    return this;
  }

  /**
   * Get installedRejectedCount
   * @return installedRejectedCount
   */
  @javax.annotation.Nullable
  public Integer getInstalledRejectedCount() {
    return installedRejectedCount;
  }

  public void setInstalledRejectedCount(Integer installedRejectedCount) {
    this.installedRejectedCount = installedRejectedCount;
  }


  public PatchSummary installedPendingReboot(Integer installedPendingReboot) {
    this.installedPendingReboot = installedPendingReboot;
    return this;
  }

  /**
   * Get installedPendingReboot
   * @return installedPendingReboot
   */
  @javax.annotation.Nullable
  public Integer getInstalledPendingReboot() {
    return installedPendingReboot;
  }

  public void setInstalledPendingReboot(Integer installedPendingReboot) {
    this.installedPendingReboot = installedPendingReboot;
  }


  public PatchSummary operationStartTime(String operationStartTime) {
    this.operationStartTime = operationStartTime;
    return this;
  }

  /**
   * Get operationStartTime
   * @return operationStartTime
   */
  @javax.annotation.Nullable
  public String getOperationStartTime() {
    return operationStartTime;
  }

  public void setOperationStartTime(String operationStartTime) {
    this.operationStartTime = operationStartTime;
  }


  public PatchSummary operationEndTime(String operationEndTime) {
    this.operationEndTime = operationEndTime;
    return this;
  }

  /**
   * Get operationEndTime
   * @return operationEndTime
   */
  @javax.annotation.Nullable
  public String getOperationEndTime() {
    return operationEndTime;
  }

  public void setOperationEndTime(String operationEndTime) {
    this.operationEndTime = operationEndTime;
  }


  public PatchSummary rebootOption(String rebootOption) {
    this.rebootOption = rebootOption;
    return this;
  }

  /**
   * Get rebootOption
   * @return rebootOption
   */
  @javax.annotation.Nullable
  public String getRebootOption() {
    return rebootOption;
  }

  public void setRebootOption(String rebootOption) {
    this.rebootOption = rebootOption;
  }


  public PatchSummary operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchSummary patchSummary = (PatchSummary) o;
    return Objects.equals(this.id, patchSummary.id) &&
        Objects.equals(this.installedCount, patchSummary.installedCount) &&
        Objects.equals(this.missingCount, patchSummary.missingCount) &&
        Objects.equals(this.failedCount, patchSummary.failedCount) &&
        Objects.equals(this.installedOtherCount, patchSummary.installedOtherCount) &&
        Objects.equals(this.installedRejectedCount, patchSummary.installedRejectedCount) &&
        Objects.equals(this.installedPendingReboot, patchSummary.installedPendingReboot) &&
        Objects.equals(this.operationStartTime, patchSummary.operationStartTime) &&
        Objects.equals(this.operationEndTime, patchSummary.operationEndTime) &&
        Objects.equals(this.rebootOption, patchSummary.rebootOption) &&
        Objects.equals(this.operation, patchSummary.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, installedCount, missingCount, failedCount, installedOtherCount, installedRejectedCount, installedPendingReboot, operationStartTime, operationEndTime, rebootOption, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installedCount: ").append(toIndentedString(installedCount)).append("\n");
    sb.append("    missingCount: ").append(toIndentedString(missingCount)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    installedOtherCount: ").append(toIndentedString(installedOtherCount)).append("\n");
    sb.append("    installedRejectedCount: ").append(toIndentedString(installedRejectedCount)).append("\n");
    sb.append("    installedPendingReboot: ").append(toIndentedString(installedPendingReboot)).append("\n");
    sb.append("    operationStartTime: ").append(toIndentedString(operationStartTime)).append("\n");
    sb.append("    operationEndTime: ").append(toIndentedString(operationEndTime)).append("\n");
    sb.append("    rebootOption: ").append(toIndentedString(rebootOption)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("InstalledCount");
    openapiFields.add("MissingCount");
    openapiFields.add("FailedCount");
    openapiFields.add("InstalledOtherCount");
    openapiFields.add("InstalledRejectedCount");
    openapiFields.add("InstalledPendingReboot");
    openapiFields.add("OperationStartTime");
    openapiFields.add("OperationEndTime");
    openapiFields.add("RebootOption");
    openapiFields.add("Operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchSummary is not found in the empty JSON string", PatchSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PatchSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the optional field `InstalledCount`
      if (jsonObj.get("InstalledCount") != null && !jsonObj.get("InstalledCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstalledCount"));
      }
      // validate the optional field `MissingCount`
      if (jsonObj.get("MissingCount") != null && !jsonObj.get("MissingCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MissingCount"));
      }
      // validate the optional field `FailedCount`
      if (jsonObj.get("FailedCount") != null && !jsonObj.get("FailedCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("FailedCount"));
      }
      // validate the optional field `InstalledOtherCount`
      if (jsonObj.get("InstalledOtherCount") != null && !jsonObj.get("InstalledOtherCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstalledOtherCount"));
      }
      // validate the optional field `InstalledRejectedCount`
      if (jsonObj.get("InstalledRejectedCount") != null && !jsonObj.get("InstalledRejectedCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstalledRejectedCount"));
      }
      // validate the optional field `InstalledPendingReboot`
      if (jsonObj.get("InstalledPendingReboot") != null && !jsonObj.get("InstalledPendingReboot").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstalledPendingReboot"));
      }
      // validate the optional field `OperationStartTime`
      if (jsonObj.get("OperationStartTime") != null && !jsonObj.get("OperationStartTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OperationStartTime"));
      }
      // validate the optional field `OperationEndTime`
      if (jsonObj.get("OperationEndTime") != null && !jsonObj.get("OperationEndTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OperationEndTime"));
      }
      // validate the optional field `RebootOption`
      if (jsonObj.get("RebootOption") != null && !jsonObj.get("RebootOption").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RebootOption"));
      }
      // validate the optional field `Operation`
      if (jsonObj.get("Operation") != null && !jsonObj.get("Operation").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Operation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchSummary>() {
           @Override
           public void write(JsonWriter out, PatchSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchSummary
   * @throws IOException if the JSON string is invalid with respect to PatchSummary
   */
  public static PatchSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchSummary.class);
  }

  /**
   * Convert an instance of PatchSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

