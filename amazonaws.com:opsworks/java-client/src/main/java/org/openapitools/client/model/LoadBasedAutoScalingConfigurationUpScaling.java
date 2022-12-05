/*
 * AWS OpsWorks
 * <fullname>AWS OpsWorks</fullname> <p>Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples for AWS OpsWorks Stacks actions and data types, including common parameters and error codes. </p> <p>AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For information about this product, go to the <a href=\"http://aws.amazon.com/opsworks/\">AWS OpsWorks</a> details page. </p> <p> <b>SDKs and CLI</b> </p> <p>The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using one of the AWS SDKs to implement applications in your preferred language. For more information, see:</p> <ul> <li> <p> <a href=\"https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html\">AWS CLI</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html\">AWS SDK for Java</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm\">AWS SDK for .NET</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html\">AWS SDK for PHP 2</a> </p> </li> <li> <p> <a href=\"http://docs.aws.amazon.com/sdkforruby/api/\">AWS SDK for Ruby</a> </p> </li> <li> <p> <a href=\"http://aws.amazon.com/documentation/sdkforjavascript/\">AWS SDK for Node.js</a> </p> </li> <li> <p> <a href=\"http://docs.pythonboto.org/en/latest/ref/opsworks.html\">AWS SDK for Python(Boto)</a> </p> </li> </ul> <p> <b>Endpoints</b> </p> <p>AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks can only be accessed or managed within the endpoint in which they are created.</p> <ul> <li> <p>opsworks.us-east-1.amazonaws.com</p> </li> <li> <p>opsworks.us-east-2.amazonaws.com</p> </li> <li> <p>opsworks.us-west-1.amazonaws.com</p> </li> <li> <p>opsworks.us-west-2.amazonaws.com</p> </li> <li> <p>opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)</p> </li> <li> <p>opsworks.eu-west-1.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-2.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-3.amazonaws.com</p> </li> <li> <p>opsworks.eu-central-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-2.amazonaws.com</p> </li> <li> <p>opsworks.ap-south-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-2.amazonaws.com</p> </li> <li> <p>opsworks.sa-east-1.amazonaws.com</p> </li> </ul> <p> <b>Chef Versions</b> </p> <p>When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a href=\"https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html\">Chef Versions</a>.</p> <note> <p>You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to Chef 12 as soon as possible.</p> </note>
 *
 * The version of the OpenAPI document: 2013-02-18
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
 * LoadBasedAutoScalingConfigurationUpScaling
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:36.435440-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LoadBasedAutoScalingConfigurationUpScaling {
  public static final String SERIALIZED_NAME_INSTANCE_COUNT = "InstanceCount";
  @SerializedName(SERIALIZED_NAME_INSTANCE_COUNT)
  private Integer instanceCount;

  public static final String SERIALIZED_NAME_THRESHOLDS_WAIT_TIME = "ThresholdsWaitTime";
  @SerializedName(SERIALIZED_NAME_THRESHOLDS_WAIT_TIME)
  private Integer thresholdsWaitTime;

  public static final String SERIALIZED_NAME_IGNORE_METRICS_TIME = "IgnoreMetricsTime";
  @SerializedName(SERIALIZED_NAME_IGNORE_METRICS_TIME)
  private Integer ignoreMetricsTime;

  public static final String SERIALIZED_NAME_CPU_THRESHOLD = "CpuThreshold";
  @SerializedName(SERIALIZED_NAME_CPU_THRESHOLD)
  private Double cpuThreshold;

  public static final String SERIALIZED_NAME_MEMORY_THRESHOLD = "MemoryThreshold";
  @SerializedName(SERIALIZED_NAME_MEMORY_THRESHOLD)
  private Double memoryThreshold;

  public static final String SERIALIZED_NAME_LOAD_THRESHOLD = "LoadThreshold";
  @SerializedName(SERIALIZED_NAME_LOAD_THRESHOLD)
  private Double loadThreshold;

  public static final String SERIALIZED_NAME_ALARMS = "Alarms";
  @SerializedName(SERIALIZED_NAME_ALARMS)
  private List alarms;

  public LoadBasedAutoScalingConfigurationUpScaling() {
  }

  public LoadBasedAutoScalingConfigurationUpScaling instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Get instanceCount
   * @return instanceCount
   */
  @javax.annotation.Nullable
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }


  public LoadBasedAutoScalingConfigurationUpScaling thresholdsWaitTime(Integer thresholdsWaitTime) {
    this.thresholdsWaitTime = thresholdsWaitTime;
    return this;
  }

  /**
   * Get thresholdsWaitTime
   * @return thresholdsWaitTime
   */
  @javax.annotation.Nullable
  public Integer getThresholdsWaitTime() {
    return thresholdsWaitTime;
  }

  public void setThresholdsWaitTime(Integer thresholdsWaitTime) {
    this.thresholdsWaitTime = thresholdsWaitTime;
  }


  public LoadBasedAutoScalingConfigurationUpScaling ignoreMetricsTime(Integer ignoreMetricsTime) {
    this.ignoreMetricsTime = ignoreMetricsTime;
    return this;
  }

  /**
   * Get ignoreMetricsTime
   * @return ignoreMetricsTime
   */
  @javax.annotation.Nullable
  public Integer getIgnoreMetricsTime() {
    return ignoreMetricsTime;
  }

  public void setIgnoreMetricsTime(Integer ignoreMetricsTime) {
    this.ignoreMetricsTime = ignoreMetricsTime;
  }


  public LoadBasedAutoScalingConfigurationUpScaling cpuThreshold(Double cpuThreshold) {
    this.cpuThreshold = cpuThreshold;
    return this;
  }

  /**
   * Get cpuThreshold
   * @return cpuThreshold
   */
  @javax.annotation.Nullable
  public Double getCpuThreshold() {
    return cpuThreshold;
  }

  public void setCpuThreshold(Double cpuThreshold) {
    this.cpuThreshold = cpuThreshold;
  }


  public LoadBasedAutoScalingConfigurationUpScaling memoryThreshold(Double memoryThreshold) {
    this.memoryThreshold = memoryThreshold;
    return this;
  }

  /**
   * Get memoryThreshold
   * @return memoryThreshold
   */
  @javax.annotation.Nullable
  public Double getMemoryThreshold() {
    return memoryThreshold;
  }

  public void setMemoryThreshold(Double memoryThreshold) {
    this.memoryThreshold = memoryThreshold;
  }


  public LoadBasedAutoScalingConfigurationUpScaling loadThreshold(Double loadThreshold) {
    this.loadThreshold = loadThreshold;
    return this;
  }

  /**
   * Get loadThreshold
   * @return loadThreshold
   */
  @javax.annotation.Nullable
  public Double getLoadThreshold() {
    return loadThreshold;
  }

  public void setLoadThreshold(Double loadThreshold) {
    this.loadThreshold = loadThreshold;
  }


  public LoadBasedAutoScalingConfigurationUpScaling alarms(List alarms) {
    this.alarms = alarms;
    return this;
  }

  /**
   * Get alarms
   * @return alarms
   */
  @javax.annotation.Nullable
  public List getAlarms() {
    return alarms;
  }

  public void setAlarms(List alarms) {
    this.alarms = alarms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBasedAutoScalingConfigurationUpScaling loadBasedAutoScalingConfigurationUpScaling = (LoadBasedAutoScalingConfigurationUpScaling) o;
    return Objects.equals(this.instanceCount, loadBasedAutoScalingConfigurationUpScaling.instanceCount) &&
        Objects.equals(this.thresholdsWaitTime, loadBasedAutoScalingConfigurationUpScaling.thresholdsWaitTime) &&
        Objects.equals(this.ignoreMetricsTime, loadBasedAutoScalingConfigurationUpScaling.ignoreMetricsTime) &&
        Objects.equals(this.cpuThreshold, loadBasedAutoScalingConfigurationUpScaling.cpuThreshold) &&
        Objects.equals(this.memoryThreshold, loadBasedAutoScalingConfigurationUpScaling.memoryThreshold) &&
        Objects.equals(this.loadThreshold, loadBasedAutoScalingConfigurationUpScaling.loadThreshold) &&
        Objects.equals(this.alarms, loadBasedAutoScalingConfigurationUpScaling.alarms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceCount, thresholdsWaitTime, ignoreMetricsTime, cpuThreshold, memoryThreshold, loadThreshold, alarms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBasedAutoScalingConfigurationUpScaling {\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    thresholdsWaitTime: ").append(toIndentedString(thresholdsWaitTime)).append("\n");
    sb.append("    ignoreMetricsTime: ").append(toIndentedString(ignoreMetricsTime)).append("\n");
    sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
    sb.append("    memoryThreshold: ").append(toIndentedString(memoryThreshold)).append("\n");
    sb.append("    loadThreshold: ").append(toIndentedString(loadThreshold)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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
    openapiFields.add("InstanceCount");
    openapiFields.add("ThresholdsWaitTime");
    openapiFields.add("IgnoreMetricsTime");
    openapiFields.add("CpuThreshold");
    openapiFields.add("MemoryThreshold");
    openapiFields.add("LoadThreshold");
    openapiFields.add("Alarms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoadBasedAutoScalingConfigurationUpScaling
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBasedAutoScalingConfigurationUpScaling.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBasedAutoScalingConfigurationUpScaling is not found in the empty JSON string", LoadBasedAutoScalingConfigurationUpScaling.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBasedAutoScalingConfigurationUpScaling.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBasedAutoScalingConfigurationUpScaling` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `InstanceCount`
      if (jsonObj.get("InstanceCount") != null && !jsonObj.get("InstanceCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstanceCount"));
      }
      // validate the optional field `ThresholdsWaitTime`
      if (jsonObj.get("ThresholdsWaitTime") != null && !jsonObj.get("ThresholdsWaitTime").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ThresholdsWaitTime"));
      }
      // validate the optional field `IgnoreMetricsTime`
      if (jsonObj.get("IgnoreMetricsTime") != null && !jsonObj.get("IgnoreMetricsTime").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("IgnoreMetricsTime"));
      }
      // validate the optional field `CpuThreshold`
      if (jsonObj.get("CpuThreshold") != null && !jsonObj.get("CpuThreshold").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("CpuThreshold"));
      }
      // validate the optional field `MemoryThreshold`
      if (jsonObj.get("MemoryThreshold") != null && !jsonObj.get("MemoryThreshold").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("MemoryThreshold"));
      }
      // validate the optional field `LoadThreshold`
      if (jsonObj.get("LoadThreshold") != null && !jsonObj.get("LoadThreshold").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("LoadThreshold"));
      }
      // validate the optional field `Alarms`
      if (jsonObj.get("Alarms") != null && !jsonObj.get("Alarms").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Alarms"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBasedAutoScalingConfigurationUpScaling.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBasedAutoScalingConfigurationUpScaling' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBasedAutoScalingConfigurationUpScaling> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBasedAutoScalingConfigurationUpScaling.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBasedAutoScalingConfigurationUpScaling>() {
           @Override
           public void write(JsonWriter out, LoadBasedAutoScalingConfigurationUpScaling value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBasedAutoScalingConfigurationUpScaling read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoadBasedAutoScalingConfigurationUpScaling given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoadBasedAutoScalingConfigurationUpScaling
   * @throws IOException if the JSON string is invalid with respect to LoadBasedAutoScalingConfigurationUpScaling
   */
  public static LoadBasedAutoScalingConfigurationUpScaling fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBasedAutoScalingConfigurationUpScaling.class);
  }

  /**
   * Convert an instance of LoadBasedAutoScalingConfigurationUpScaling to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

