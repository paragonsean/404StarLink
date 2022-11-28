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
 * ResourceDetailsAwsCloudWatchAlarm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsCloudWatchAlarm {
  public static final String SERIALIZED_NAME_ACTIONS_ENABLED = "ActionsEnabled";
  @SerializedName(SERIALIZED_NAME_ACTIONS_ENABLED)
  private Boolean actionsEnabled;

  public static final String SERIALIZED_NAME_ALARM_ACTIONS = "AlarmActions";
  @SerializedName(SERIALIZED_NAME_ALARM_ACTIONS)
  private List alarmActions;

  public static final String SERIALIZED_NAME_ALARM_ARN = "AlarmArn";
  @SerializedName(SERIALIZED_NAME_ALARM_ARN)
  private String alarmArn;

  public static final String SERIALIZED_NAME_ALARM_CONFIGURATION_UPDATED_TIMESTAMP = "AlarmConfigurationUpdatedTimestamp";
  @SerializedName(SERIALIZED_NAME_ALARM_CONFIGURATION_UPDATED_TIMESTAMP)
  private String alarmConfigurationUpdatedTimestamp;

  public static final String SERIALIZED_NAME_ALARM_DESCRIPTION = "AlarmDescription";
  @SerializedName(SERIALIZED_NAME_ALARM_DESCRIPTION)
  private String alarmDescription;

  public static final String SERIALIZED_NAME_ALARM_NAME = "AlarmName";
  @SerializedName(SERIALIZED_NAME_ALARM_NAME)
  private String alarmName;

  public static final String SERIALIZED_NAME_COMPARISON_OPERATOR = "ComparisonOperator";
  @SerializedName(SERIALIZED_NAME_COMPARISON_OPERATOR)
  private String comparisonOperator;

  public static final String SERIALIZED_NAME_DATAPOINTS_TO_ALARM = "DatapointsToAlarm";
  @SerializedName(SERIALIZED_NAME_DATAPOINTS_TO_ALARM)
  private Integer datapointsToAlarm;

  public static final String SERIALIZED_NAME_DIMENSIONS = "Dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List dimensions;

  public static final String SERIALIZED_NAME_EVALUATE_LOW_SAMPLE_COUNT_PERCENTILE = "EvaluateLowSampleCountPercentile";
  @SerializedName(SERIALIZED_NAME_EVALUATE_LOW_SAMPLE_COUNT_PERCENTILE)
  private String evaluateLowSampleCountPercentile;

  public static final String SERIALIZED_NAME_EVALUATION_PERIODS = "EvaluationPeriods";
  @SerializedName(SERIALIZED_NAME_EVALUATION_PERIODS)
  private Integer evaluationPeriods;

  public static final String SERIALIZED_NAME_EXTENDED_STATISTIC = "ExtendedStatistic";
  @SerializedName(SERIALIZED_NAME_EXTENDED_STATISTIC)
  private String extendedStatistic;

  public static final String SERIALIZED_NAME_INSUFFICIENT_DATA_ACTIONS = "InsufficientDataActions";
  @SerializedName(SERIALIZED_NAME_INSUFFICIENT_DATA_ACTIONS)
  private List insufficientDataActions;

  public static final String SERIALIZED_NAME_METRIC_NAME = "MetricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private String metricName;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OK_ACTIONS = "OkActions";
  @SerializedName(SERIALIZED_NAME_OK_ACTIONS)
  private List okActions;

  public static final String SERIALIZED_NAME_PERIOD = "Period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  public static final String SERIALIZED_NAME_STATISTIC = "Statistic";
  @SerializedName(SERIALIZED_NAME_STATISTIC)
  private String statistic;

  public static final String SERIALIZED_NAME_THRESHOLD = "Threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Double threshold;

  public static final String SERIALIZED_NAME_THRESHOLD_METRIC_ID = "ThresholdMetricId";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_METRIC_ID)
  private String thresholdMetricId;

  public static final String SERIALIZED_NAME_TREAT_MISSING_DATA = "TreatMissingData";
  @SerializedName(SERIALIZED_NAME_TREAT_MISSING_DATA)
  private String treatMissingData;

  public static final String SERIALIZED_NAME_UNIT = "Unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public ResourceDetailsAwsCloudWatchAlarm() {
  }

  public ResourceDetailsAwsCloudWatchAlarm actionsEnabled(Boolean actionsEnabled) {
    this.actionsEnabled = actionsEnabled;
    return this;
  }

  /**
   * Get actionsEnabled
   * @return actionsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getActionsEnabled() {
    return actionsEnabled;
  }

  public void setActionsEnabled(Boolean actionsEnabled) {
    this.actionsEnabled = actionsEnabled;
  }


  public ResourceDetailsAwsCloudWatchAlarm alarmActions(List alarmActions) {
    this.alarmActions = alarmActions;
    return this;
  }

  /**
   * Get alarmActions
   * @return alarmActions
   */
  @javax.annotation.Nullable
  public List getAlarmActions() {
    return alarmActions;
  }

  public void setAlarmActions(List alarmActions) {
    this.alarmActions = alarmActions;
  }


  public ResourceDetailsAwsCloudWatchAlarm alarmArn(String alarmArn) {
    this.alarmArn = alarmArn;
    return this;
  }

  /**
   * Get alarmArn
   * @return alarmArn
   */
  @javax.annotation.Nullable
  public String getAlarmArn() {
    return alarmArn;
  }

  public void setAlarmArn(String alarmArn) {
    this.alarmArn = alarmArn;
  }


  public ResourceDetailsAwsCloudWatchAlarm alarmConfigurationUpdatedTimestamp(String alarmConfigurationUpdatedTimestamp) {
    this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
    return this;
  }

  /**
   * Get alarmConfigurationUpdatedTimestamp
   * @return alarmConfigurationUpdatedTimestamp
   */
  @javax.annotation.Nullable
  public String getAlarmConfigurationUpdatedTimestamp() {
    return alarmConfigurationUpdatedTimestamp;
  }

  public void setAlarmConfigurationUpdatedTimestamp(String alarmConfigurationUpdatedTimestamp) {
    this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
  }


  public ResourceDetailsAwsCloudWatchAlarm alarmDescription(String alarmDescription) {
    this.alarmDescription = alarmDescription;
    return this;
  }

  /**
   * Get alarmDescription
   * @return alarmDescription
   */
  @javax.annotation.Nullable
  public String getAlarmDescription() {
    return alarmDescription;
  }

  public void setAlarmDescription(String alarmDescription) {
    this.alarmDescription = alarmDescription;
  }


  public ResourceDetailsAwsCloudWatchAlarm alarmName(String alarmName) {
    this.alarmName = alarmName;
    return this;
  }

  /**
   * Get alarmName
   * @return alarmName
   */
  @javax.annotation.Nullable
  public String getAlarmName() {
    return alarmName;
  }

  public void setAlarmName(String alarmName) {
    this.alarmName = alarmName;
  }


  public ResourceDetailsAwsCloudWatchAlarm comparisonOperator(String comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  /**
   * Get comparisonOperator
   * @return comparisonOperator
   */
  @javax.annotation.Nullable
  public String getComparisonOperator() {
    return comparisonOperator;
  }

  public void setComparisonOperator(String comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }


  public ResourceDetailsAwsCloudWatchAlarm datapointsToAlarm(Integer datapointsToAlarm) {
    this.datapointsToAlarm = datapointsToAlarm;
    return this;
  }

  /**
   * Get datapointsToAlarm
   * @return datapointsToAlarm
   */
  @javax.annotation.Nullable
  public Integer getDatapointsToAlarm() {
    return datapointsToAlarm;
  }

  public void setDatapointsToAlarm(Integer datapointsToAlarm) {
    this.datapointsToAlarm = datapointsToAlarm;
  }


  public ResourceDetailsAwsCloudWatchAlarm dimensions(List dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Get dimensions
   * @return dimensions
   */
  @javax.annotation.Nullable
  public List getDimensions() {
    return dimensions;
  }

  public void setDimensions(List dimensions) {
    this.dimensions = dimensions;
  }


  public ResourceDetailsAwsCloudWatchAlarm evaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
    this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
    return this;
  }

  /**
   * Get evaluateLowSampleCountPercentile
   * @return evaluateLowSampleCountPercentile
   */
  @javax.annotation.Nullable
  public String getEvaluateLowSampleCountPercentile() {
    return evaluateLowSampleCountPercentile;
  }

  public void setEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
    this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
  }


  public ResourceDetailsAwsCloudWatchAlarm evaluationPeriods(Integer evaluationPeriods) {
    this.evaluationPeriods = evaluationPeriods;
    return this;
  }

  /**
   * Get evaluationPeriods
   * @return evaluationPeriods
   */
  @javax.annotation.Nullable
  public Integer getEvaluationPeriods() {
    return evaluationPeriods;
  }

  public void setEvaluationPeriods(Integer evaluationPeriods) {
    this.evaluationPeriods = evaluationPeriods;
  }


  public ResourceDetailsAwsCloudWatchAlarm extendedStatistic(String extendedStatistic) {
    this.extendedStatistic = extendedStatistic;
    return this;
  }

  /**
   * Get extendedStatistic
   * @return extendedStatistic
   */
  @javax.annotation.Nullable
  public String getExtendedStatistic() {
    return extendedStatistic;
  }

  public void setExtendedStatistic(String extendedStatistic) {
    this.extendedStatistic = extendedStatistic;
  }


  public ResourceDetailsAwsCloudWatchAlarm insufficientDataActions(List insufficientDataActions) {
    this.insufficientDataActions = insufficientDataActions;
    return this;
  }

  /**
   * Get insufficientDataActions
   * @return insufficientDataActions
   */
  @javax.annotation.Nullable
  public List getInsufficientDataActions() {
    return insufficientDataActions;
  }

  public void setInsufficientDataActions(List insufficientDataActions) {
    this.insufficientDataActions = insufficientDataActions;
  }


  public ResourceDetailsAwsCloudWatchAlarm metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Get metricName
   * @return metricName
   */
  @javax.annotation.Nullable
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }


  public ResourceDetailsAwsCloudWatchAlarm namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public ResourceDetailsAwsCloudWatchAlarm okActions(List okActions) {
    this.okActions = okActions;
    return this;
  }

  /**
   * Get okActions
   * @return okActions
   */
  @javax.annotation.Nullable
  public List getOkActions() {
    return okActions;
  }

  public void setOkActions(List okActions) {
    this.okActions = okActions;
  }


  public ResourceDetailsAwsCloudWatchAlarm period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   */
  @javax.annotation.Nullable
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }


  public ResourceDetailsAwsCloudWatchAlarm statistic(String statistic) {
    this.statistic = statistic;
    return this;
  }

  /**
   * Get statistic
   * @return statistic
   */
  @javax.annotation.Nullable
  public String getStatistic() {
    return statistic;
  }

  public void setStatistic(String statistic) {
    this.statistic = statistic;
  }


  public ResourceDetailsAwsCloudWatchAlarm threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  @javax.annotation.Nullable
  public Double getThreshold() {
    return threshold;
  }

  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public ResourceDetailsAwsCloudWatchAlarm thresholdMetricId(String thresholdMetricId) {
    this.thresholdMetricId = thresholdMetricId;
    return this;
  }

  /**
   * Get thresholdMetricId
   * @return thresholdMetricId
   */
  @javax.annotation.Nullable
  public String getThresholdMetricId() {
    return thresholdMetricId;
  }

  public void setThresholdMetricId(String thresholdMetricId) {
    this.thresholdMetricId = thresholdMetricId;
  }


  public ResourceDetailsAwsCloudWatchAlarm treatMissingData(String treatMissingData) {
    this.treatMissingData = treatMissingData;
    return this;
  }

  /**
   * Get treatMissingData
   * @return treatMissingData
   */
  @javax.annotation.Nullable
  public String getTreatMissingData() {
    return treatMissingData;
  }

  public void setTreatMissingData(String treatMissingData) {
    this.treatMissingData = treatMissingData;
  }


  public ResourceDetailsAwsCloudWatchAlarm unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsCloudWatchAlarm resourceDetailsAwsCloudWatchAlarm = (ResourceDetailsAwsCloudWatchAlarm) o;
    return Objects.equals(this.actionsEnabled, resourceDetailsAwsCloudWatchAlarm.actionsEnabled) &&
        Objects.equals(this.alarmActions, resourceDetailsAwsCloudWatchAlarm.alarmActions) &&
        Objects.equals(this.alarmArn, resourceDetailsAwsCloudWatchAlarm.alarmArn) &&
        Objects.equals(this.alarmConfigurationUpdatedTimestamp, resourceDetailsAwsCloudWatchAlarm.alarmConfigurationUpdatedTimestamp) &&
        Objects.equals(this.alarmDescription, resourceDetailsAwsCloudWatchAlarm.alarmDescription) &&
        Objects.equals(this.alarmName, resourceDetailsAwsCloudWatchAlarm.alarmName) &&
        Objects.equals(this.comparisonOperator, resourceDetailsAwsCloudWatchAlarm.comparisonOperator) &&
        Objects.equals(this.datapointsToAlarm, resourceDetailsAwsCloudWatchAlarm.datapointsToAlarm) &&
        Objects.equals(this.dimensions, resourceDetailsAwsCloudWatchAlarm.dimensions) &&
        Objects.equals(this.evaluateLowSampleCountPercentile, resourceDetailsAwsCloudWatchAlarm.evaluateLowSampleCountPercentile) &&
        Objects.equals(this.evaluationPeriods, resourceDetailsAwsCloudWatchAlarm.evaluationPeriods) &&
        Objects.equals(this.extendedStatistic, resourceDetailsAwsCloudWatchAlarm.extendedStatistic) &&
        Objects.equals(this.insufficientDataActions, resourceDetailsAwsCloudWatchAlarm.insufficientDataActions) &&
        Objects.equals(this.metricName, resourceDetailsAwsCloudWatchAlarm.metricName) &&
        Objects.equals(this.namespace, resourceDetailsAwsCloudWatchAlarm.namespace) &&
        Objects.equals(this.okActions, resourceDetailsAwsCloudWatchAlarm.okActions) &&
        Objects.equals(this.period, resourceDetailsAwsCloudWatchAlarm.period) &&
        Objects.equals(this.statistic, resourceDetailsAwsCloudWatchAlarm.statistic) &&
        Objects.equals(this.threshold, resourceDetailsAwsCloudWatchAlarm.threshold) &&
        Objects.equals(this.thresholdMetricId, resourceDetailsAwsCloudWatchAlarm.thresholdMetricId) &&
        Objects.equals(this.treatMissingData, resourceDetailsAwsCloudWatchAlarm.treatMissingData) &&
        Objects.equals(this.unit, resourceDetailsAwsCloudWatchAlarm.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionsEnabled, alarmActions, alarmArn, alarmConfigurationUpdatedTimestamp, alarmDescription, alarmName, comparisonOperator, datapointsToAlarm, dimensions, evaluateLowSampleCountPercentile, evaluationPeriods, extendedStatistic, insufficientDataActions, metricName, namespace, okActions, period, statistic, threshold, thresholdMetricId, treatMissingData, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsCloudWatchAlarm {\n");
    sb.append("    actionsEnabled: ").append(toIndentedString(actionsEnabled)).append("\n");
    sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
    sb.append("    alarmArn: ").append(toIndentedString(alarmArn)).append("\n");
    sb.append("    alarmConfigurationUpdatedTimestamp: ").append(toIndentedString(alarmConfigurationUpdatedTimestamp)).append("\n");
    sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
    sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    datapointsToAlarm: ").append(toIndentedString(datapointsToAlarm)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    evaluateLowSampleCountPercentile: ").append(toIndentedString(evaluateLowSampleCountPercentile)).append("\n");
    sb.append("    evaluationPeriods: ").append(toIndentedString(evaluationPeriods)).append("\n");
    sb.append("    extendedStatistic: ").append(toIndentedString(extendedStatistic)).append("\n");
    sb.append("    insufficientDataActions: ").append(toIndentedString(insufficientDataActions)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    thresholdMetricId: ").append(toIndentedString(thresholdMetricId)).append("\n");
    sb.append("    treatMissingData: ").append(toIndentedString(treatMissingData)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("ActionsEnabled");
    openapiFields.add("AlarmActions");
    openapiFields.add("AlarmArn");
    openapiFields.add("AlarmConfigurationUpdatedTimestamp");
    openapiFields.add("AlarmDescription");
    openapiFields.add("AlarmName");
    openapiFields.add("ComparisonOperator");
    openapiFields.add("DatapointsToAlarm");
    openapiFields.add("Dimensions");
    openapiFields.add("EvaluateLowSampleCountPercentile");
    openapiFields.add("EvaluationPeriods");
    openapiFields.add("ExtendedStatistic");
    openapiFields.add("InsufficientDataActions");
    openapiFields.add("MetricName");
    openapiFields.add("Namespace");
    openapiFields.add("OkActions");
    openapiFields.add("Period");
    openapiFields.add("Statistic");
    openapiFields.add("Threshold");
    openapiFields.add("ThresholdMetricId");
    openapiFields.add("TreatMissingData");
    openapiFields.add("Unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsCloudWatchAlarm
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsCloudWatchAlarm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsCloudWatchAlarm is not found in the empty JSON string", ResourceDetailsAwsCloudWatchAlarm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsCloudWatchAlarm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsCloudWatchAlarm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ActionsEnabled`
      if (jsonObj.get("ActionsEnabled") != null && !jsonObj.get("ActionsEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ActionsEnabled"));
      }
      // validate the optional field `AlarmActions`
      if (jsonObj.get("AlarmActions") != null && !jsonObj.get("AlarmActions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AlarmActions"));
      }
      // validate the optional field `AlarmArn`
      if (jsonObj.get("AlarmArn") != null && !jsonObj.get("AlarmArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AlarmArn"));
      }
      // validate the optional field `AlarmConfigurationUpdatedTimestamp`
      if (jsonObj.get("AlarmConfigurationUpdatedTimestamp") != null && !jsonObj.get("AlarmConfigurationUpdatedTimestamp").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AlarmConfigurationUpdatedTimestamp"));
      }
      // validate the optional field `AlarmDescription`
      if (jsonObj.get("AlarmDescription") != null && !jsonObj.get("AlarmDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AlarmDescription"));
      }
      // validate the optional field `AlarmName`
      if (jsonObj.get("AlarmName") != null && !jsonObj.get("AlarmName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AlarmName"));
      }
      // validate the optional field `ComparisonOperator`
      if (jsonObj.get("ComparisonOperator") != null && !jsonObj.get("ComparisonOperator").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ComparisonOperator"));
      }
      // validate the optional field `DatapointsToAlarm`
      if (jsonObj.get("DatapointsToAlarm") != null && !jsonObj.get("DatapointsToAlarm").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DatapointsToAlarm"));
      }
      // validate the optional field `Dimensions`
      if (jsonObj.get("Dimensions") != null && !jsonObj.get("Dimensions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Dimensions"));
      }
      // validate the optional field `EvaluateLowSampleCountPercentile`
      if (jsonObj.get("EvaluateLowSampleCountPercentile") != null && !jsonObj.get("EvaluateLowSampleCountPercentile").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EvaluateLowSampleCountPercentile"));
      }
      // validate the optional field `EvaluationPeriods`
      if (jsonObj.get("EvaluationPeriods") != null && !jsonObj.get("EvaluationPeriods").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("EvaluationPeriods"));
      }
      // validate the optional field `ExtendedStatistic`
      if (jsonObj.get("ExtendedStatistic") != null && !jsonObj.get("ExtendedStatistic").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ExtendedStatistic"));
      }
      // validate the optional field `InsufficientDataActions`
      if (jsonObj.get("InsufficientDataActions") != null && !jsonObj.get("InsufficientDataActions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("InsufficientDataActions"));
      }
      // validate the optional field `MetricName`
      if (jsonObj.get("MetricName") != null && !jsonObj.get("MetricName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MetricName"));
      }
      // validate the optional field `Namespace`
      if (jsonObj.get("Namespace") != null && !jsonObj.get("Namespace").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Namespace"));
      }
      // validate the optional field `OkActions`
      if (jsonObj.get("OkActions") != null && !jsonObj.get("OkActions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("OkActions"));
      }
      // validate the optional field `Period`
      if (jsonObj.get("Period") != null && !jsonObj.get("Period").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Period"));
      }
      // validate the optional field `Statistic`
      if (jsonObj.get("Statistic") != null && !jsonObj.get("Statistic").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Statistic"));
      }
      // validate the optional field `Threshold`
      if (jsonObj.get("Threshold") != null && !jsonObj.get("Threshold").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("Threshold"));
      }
      // validate the optional field `ThresholdMetricId`
      if (jsonObj.get("ThresholdMetricId") != null && !jsonObj.get("ThresholdMetricId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ThresholdMetricId"));
      }
      // validate the optional field `TreatMissingData`
      if (jsonObj.get("TreatMissingData") != null && !jsonObj.get("TreatMissingData").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TreatMissingData"));
      }
      // validate the optional field `Unit`
      if (jsonObj.get("Unit") != null && !jsonObj.get("Unit").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Unit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsCloudWatchAlarm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsCloudWatchAlarm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsCloudWatchAlarm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsCloudWatchAlarm.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsCloudWatchAlarm>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsCloudWatchAlarm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsCloudWatchAlarm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsCloudWatchAlarm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsCloudWatchAlarm
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsCloudWatchAlarm
   */
  public static ResourceDetailsAwsCloudWatchAlarm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsCloudWatchAlarm.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsCloudWatchAlarm to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

