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
import org.openapitools.client.model.AlarmLocation;
import org.openapitools.client.model.AlarmMonitoredResourceInfo;
import org.openapitools.client.model.AlarmState;
import org.openapitools.client.model.ComparisonOperator;
import org.openapitools.client.model.MetricName;
import org.openapitools.client.model.MetricStatistic;
import org.openapitools.client.model.MetricUnit;
import org.openapitools.client.model.ResourceType;
import org.openapitools.client.model.TreatMissingData;

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
 * &lt;p&gt;Describes an alarm.&lt;/p&gt; &lt;p&gt;An alarm is a way to monitor your Lightsail resource metrics. For more information, see &lt;a href&#x3D;\&quot;https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms\&quot;&gt;Alarms in Amazon Lightsail&lt;/a&gt;.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Alarm {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private AlarmLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_SUPPORT_CODE = "supportCode";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CODE)
  private String supportCode;

  public static final String SERIALIZED_NAME_MONITORED_RESOURCE_INFO = "monitoredResourceInfo";
  @SerializedName(SERIALIZED_NAME_MONITORED_RESOURCE_INFO)
  private AlarmMonitoredResourceInfo monitoredResourceInfo;

  public static final String SERIALIZED_NAME_COMPARISON_OPERATOR = "comparisonOperator";
  @SerializedName(SERIALIZED_NAME_COMPARISON_OPERATOR)
  private ComparisonOperator comparisonOperator;

  public static final String SERIALIZED_NAME_EVALUATION_PERIODS = "evaluationPeriods";
  @SerializedName(SERIALIZED_NAME_EVALUATION_PERIODS)
  private Integer evaluationPeriods;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Double threshold;

  public static final String SERIALIZED_NAME_DATAPOINTS_TO_ALARM = "datapointsToAlarm";
  @SerializedName(SERIALIZED_NAME_DATAPOINTS_TO_ALARM)
  private Integer datapointsToAlarm;

  public static final String SERIALIZED_NAME_TREAT_MISSING_DATA = "treatMissingData";
  @SerializedName(SERIALIZED_NAME_TREAT_MISSING_DATA)
  private TreatMissingData treatMissingData;

  public static final String SERIALIZED_NAME_STATISTIC = "statistic";
  @SerializedName(SERIALIZED_NAME_STATISTIC)
  private MetricStatistic statistic;

  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private MetricName metricName;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private AlarmState state;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private MetricUnit unit;

  public static final String SERIALIZED_NAME_CONTACT_PROTOCOLS = "contactProtocols";
  @SerializedName(SERIALIZED_NAME_CONTACT_PROTOCOLS)
  private List contactProtocols;

  public static final String SERIALIZED_NAME_NOTIFICATION_TRIGGERS = "notificationTriggers";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TRIGGERS)
  private List notificationTriggers;

  public static final String SERIALIZED_NAME_NOTIFICATION_ENABLED = "notificationEnabled";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ENABLED)
  private Boolean notificationEnabled;

  public Alarm() {
  }

  public Alarm name(String name) {
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


  public Alarm arn(String arn) {
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


  public Alarm createdAt(OffsetDateTime createdAt) {
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


  public Alarm location(AlarmLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public AlarmLocation getLocation() {
    return location;
  }

  public void setLocation(AlarmLocation location) {
    this.location = location;
  }


  public Alarm resourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public ResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public Alarm supportCode(String supportCode) {
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


  public Alarm monitoredResourceInfo(AlarmMonitoredResourceInfo monitoredResourceInfo) {
    this.monitoredResourceInfo = monitoredResourceInfo;
    return this;
  }

  /**
   * Get monitoredResourceInfo
   * @return monitoredResourceInfo
   */
  @javax.annotation.Nullable
  public AlarmMonitoredResourceInfo getMonitoredResourceInfo() {
    return monitoredResourceInfo;
  }

  public void setMonitoredResourceInfo(AlarmMonitoredResourceInfo monitoredResourceInfo) {
    this.monitoredResourceInfo = monitoredResourceInfo;
  }


  public Alarm comparisonOperator(ComparisonOperator comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  /**
   * Get comparisonOperator
   * @return comparisonOperator
   */
  @javax.annotation.Nullable
  public ComparisonOperator getComparisonOperator() {
    return comparisonOperator;
  }

  public void setComparisonOperator(ComparisonOperator comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }


  public Alarm evaluationPeriods(Integer evaluationPeriods) {
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


  public Alarm period(Integer period) {
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


  public Alarm threshold(Double threshold) {
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


  public Alarm datapointsToAlarm(Integer datapointsToAlarm) {
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


  public Alarm treatMissingData(TreatMissingData treatMissingData) {
    this.treatMissingData = treatMissingData;
    return this;
  }

  /**
   * Get treatMissingData
   * @return treatMissingData
   */
  @javax.annotation.Nullable
  public TreatMissingData getTreatMissingData() {
    return treatMissingData;
  }

  public void setTreatMissingData(TreatMissingData treatMissingData) {
    this.treatMissingData = treatMissingData;
  }


  public Alarm statistic(MetricStatistic statistic) {
    this.statistic = statistic;
    return this;
  }

  /**
   * Get statistic
   * @return statistic
   */
  @javax.annotation.Nullable
  public MetricStatistic getStatistic() {
    return statistic;
  }

  public void setStatistic(MetricStatistic statistic) {
    this.statistic = statistic;
  }


  public Alarm metricName(MetricName metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Get metricName
   * @return metricName
   */
  @javax.annotation.Nullable
  public MetricName getMetricName() {
    return metricName;
  }

  public void setMetricName(MetricName metricName) {
    this.metricName = metricName;
  }


  public Alarm state(AlarmState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public AlarmState getState() {
    return state;
  }

  public void setState(AlarmState state) {
    this.state = state;
  }


  public Alarm unit(MetricUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nullable
  public MetricUnit getUnit() {
    return unit;
  }

  public void setUnit(MetricUnit unit) {
    this.unit = unit;
  }


  public Alarm contactProtocols(List contactProtocols) {
    this.contactProtocols = contactProtocols;
    return this;
  }

  /**
   * Get contactProtocols
   * @return contactProtocols
   */
  @javax.annotation.Nullable
  public List getContactProtocols() {
    return contactProtocols;
  }

  public void setContactProtocols(List contactProtocols) {
    this.contactProtocols = contactProtocols;
  }


  public Alarm notificationTriggers(List notificationTriggers) {
    this.notificationTriggers = notificationTriggers;
    return this;
  }

  /**
   * Get notificationTriggers
   * @return notificationTriggers
   */
  @javax.annotation.Nullable
  public List getNotificationTriggers() {
    return notificationTriggers;
  }

  public void setNotificationTriggers(List notificationTriggers) {
    this.notificationTriggers = notificationTriggers;
  }


  public Alarm notificationEnabled(Boolean notificationEnabled) {
    this.notificationEnabled = notificationEnabled;
    return this;
  }

  /**
   * Get notificationEnabled
   * @return notificationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getNotificationEnabled() {
    return notificationEnabled;
  }

  public void setNotificationEnabled(Boolean notificationEnabled) {
    this.notificationEnabled = notificationEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alarm alarm = (Alarm) o;
    return Objects.equals(this.name, alarm.name) &&
        Objects.equals(this.arn, alarm.arn) &&
        Objects.equals(this.createdAt, alarm.createdAt) &&
        Objects.equals(this.location, alarm.location) &&
        Objects.equals(this.resourceType, alarm.resourceType) &&
        Objects.equals(this.supportCode, alarm.supportCode) &&
        Objects.equals(this.monitoredResourceInfo, alarm.monitoredResourceInfo) &&
        Objects.equals(this.comparisonOperator, alarm.comparisonOperator) &&
        Objects.equals(this.evaluationPeriods, alarm.evaluationPeriods) &&
        Objects.equals(this.period, alarm.period) &&
        Objects.equals(this.threshold, alarm.threshold) &&
        Objects.equals(this.datapointsToAlarm, alarm.datapointsToAlarm) &&
        Objects.equals(this.treatMissingData, alarm.treatMissingData) &&
        Objects.equals(this.statistic, alarm.statistic) &&
        Objects.equals(this.metricName, alarm.metricName) &&
        Objects.equals(this.state, alarm.state) &&
        Objects.equals(this.unit, alarm.unit) &&
        Objects.equals(this.contactProtocols, alarm.contactProtocols) &&
        Objects.equals(this.notificationTriggers, alarm.notificationTriggers) &&
        Objects.equals(this.notificationEnabled, alarm.notificationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, createdAt, location, resourceType, supportCode, monitoredResourceInfo, comparisonOperator, evaluationPeriods, period, threshold, datapointsToAlarm, treatMissingData, statistic, metricName, state, unit, contactProtocols, notificationTriggers, notificationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alarm {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    monitoredResourceInfo: ").append(toIndentedString(monitoredResourceInfo)).append("\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    evaluationPeriods: ").append(toIndentedString(evaluationPeriods)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    datapointsToAlarm: ").append(toIndentedString(datapointsToAlarm)).append("\n");
    sb.append("    treatMissingData: ").append(toIndentedString(treatMissingData)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    contactProtocols: ").append(toIndentedString(contactProtocols)).append("\n");
    sb.append("    notificationTriggers: ").append(toIndentedString(notificationTriggers)).append("\n");
    sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
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
    openapiFields.add("arn");
    openapiFields.add("createdAt");
    openapiFields.add("location");
    openapiFields.add("resourceType");
    openapiFields.add("supportCode");
    openapiFields.add("monitoredResourceInfo");
    openapiFields.add("comparisonOperator");
    openapiFields.add("evaluationPeriods");
    openapiFields.add("period");
    openapiFields.add("threshold");
    openapiFields.add("datapointsToAlarm");
    openapiFields.add("treatMissingData");
    openapiFields.add("statistic");
    openapiFields.add("metricName");
    openapiFields.add("state");
    openapiFields.add("unit");
    openapiFields.add("contactProtocols");
    openapiFields.add("notificationTriggers");
    openapiFields.add("notificationEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Alarm
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Alarm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Alarm is not found in the empty JSON string", Alarm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Alarm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Alarm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        AlarmLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `supportCode`
      if (jsonObj.get("supportCode") != null && !jsonObj.get("supportCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("supportCode"));
      }
      // validate the optional field `monitoredResourceInfo`
      if (jsonObj.get("monitoredResourceInfo") != null && !jsonObj.get("monitoredResourceInfo").isJsonNull()) {
        AlarmMonitoredResourceInfo.validateJsonElement(jsonObj.get("monitoredResourceInfo"));
      }
      // validate the optional field `comparisonOperator`
      if (jsonObj.get("comparisonOperator") != null && !jsonObj.get("comparisonOperator").isJsonNull()) {
        ComparisonOperator.validateJsonElement(jsonObj.get("comparisonOperator"));
      }
      // validate the optional field `evaluationPeriods`
      if (jsonObj.get("evaluationPeriods") != null && !jsonObj.get("evaluationPeriods").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("evaluationPeriods"));
      }
      // validate the optional field `period`
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("period"));
      }
      // validate the optional field `threshold`
      if (jsonObj.get("threshold") != null && !jsonObj.get("threshold").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("threshold"));
      }
      // validate the optional field `datapointsToAlarm`
      if (jsonObj.get("datapointsToAlarm") != null && !jsonObj.get("datapointsToAlarm").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("datapointsToAlarm"));
      }
      // validate the optional field `treatMissingData`
      if (jsonObj.get("treatMissingData") != null && !jsonObj.get("treatMissingData").isJsonNull()) {
        TreatMissingData.validateJsonElement(jsonObj.get("treatMissingData"));
      }
      // validate the optional field `statistic`
      if (jsonObj.get("statistic") != null && !jsonObj.get("statistic").isJsonNull()) {
        MetricStatistic.validateJsonElement(jsonObj.get("statistic"));
      }
      // validate the optional field `metricName`
      if (jsonObj.get("metricName") != null && !jsonObj.get("metricName").isJsonNull()) {
        MetricName.validateJsonElement(jsonObj.get("metricName"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        AlarmState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `unit`
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) {
        MetricUnit.validateJsonElement(jsonObj.get("unit"));
      }
      // validate the optional field `contactProtocols`
      if (jsonObj.get("contactProtocols") != null && !jsonObj.get("contactProtocols").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("contactProtocols"));
      }
      // validate the optional field `notificationTriggers`
      if (jsonObj.get("notificationTriggers") != null && !jsonObj.get("notificationTriggers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("notificationTriggers"));
      }
      // validate the optional field `notificationEnabled`
      if (jsonObj.get("notificationEnabled") != null && !jsonObj.get("notificationEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("notificationEnabled"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Alarm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Alarm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Alarm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Alarm.class));

       return (TypeAdapter<T>) new TypeAdapter<Alarm>() {
           @Override
           public void write(JsonWriter out, Alarm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Alarm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Alarm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Alarm
   * @throws IOException if the JSON string is invalid with respect to Alarm
   */
  public static Alarm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Alarm.class);
  }

  /**
   * Convert an instance of Alarm to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

