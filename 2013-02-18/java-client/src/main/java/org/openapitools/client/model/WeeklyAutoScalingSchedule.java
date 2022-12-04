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
import java.util.Map;

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
 * &lt;p&gt;Describes a time-based instance&#39;s auto scaling schedule. The schedule consists of a set of key-value pairs.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;The key is the time period (a UTC hour) and must be an integer from 0 - 23.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The value indicates whether the instance should be online or offline for the specified period, and must be set to \&quot;on\&quot; or \&quot;off\&quot;&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default setting for all time periods is off, so you use the following parameters primarily to specify the online periods. You don&#39;t have to explicitly specify offline periods unless you want to change an online period to an offline period.&lt;/p&gt; &lt;p&gt;The following example specifies that the instance should be online for four hours, from UTC 1200 - 1600. It will be off for the remainder of the day.&lt;/p&gt; &lt;p&gt; &lt;code&gt; { \&quot;12\&quot;:\&quot;on\&quot;, \&quot;13\&quot;:\&quot;on\&quot;, \&quot;14\&quot;:\&quot;on\&quot;, \&quot;15\&quot;:\&quot;on\&quot; } &lt;/code&gt; &lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:35.959952-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class WeeklyAutoScalingSchedule {
  public static final String SERIALIZED_NAME_MONDAY = "Monday";
  @SerializedName(SERIALIZED_NAME_MONDAY)
  private Map monday;

  public static final String SERIALIZED_NAME_TUESDAY = "Tuesday";
  @SerializedName(SERIALIZED_NAME_TUESDAY)
  private Map tuesday;

  public static final String SERIALIZED_NAME_WEDNESDAY = "Wednesday";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY)
  private Map wednesday;

  public static final String SERIALIZED_NAME_THURSDAY = "Thursday";
  @SerializedName(SERIALIZED_NAME_THURSDAY)
  private Map thursday;

  public static final String SERIALIZED_NAME_FRIDAY = "Friday";
  @SerializedName(SERIALIZED_NAME_FRIDAY)
  private Map friday;

  public static final String SERIALIZED_NAME_SATURDAY = "Saturday";
  @SerializedName(SERIALIZED_NAME_SATURDAY)
  private Map saturday;

  public static final String SERIALIZED_NAME_SUNDAY = "Sunday";
  @SerializedName(SERIALIZED_NAME_SUNDAY)
  private Map sunday;

  public WeeklyAutoScalingSchedule() {
  }

  public WeeklyAutoScalingSchedule monday(Map monday) {
    this.monday = monday;
    return this;
  }

  /**
   * Get monday
   * @return monday
   */
  @javax.annotation.Nullable
  public Map getMonday() {
    return monday;
  }

  public void setMonday(Map monday) {
    this.monday = monday;
  }


  public WeeklyAutoScalingSchedule tuesday(Map tuesday) {
    this.tuesday = tuesday;
    return this;
  }

  /**
   * Get tuesday
   * @return tuesday
   */
  @javax.annotation.Nullable
  public Map getTuesday() {
    return tuesday;
  }

  public void setTuesday(Map tuesday) {
    this.tuesday = tuesday;
  }


  public WeeklyAutoScalingSchedule wednesday(Map wednesday) {
    this.wednesday = wednesday;
    return this;
  }

  /**
   * Get wednesday
   * @return wednesday
   */
  @javax.annotation.Nullable
  public Map getWednesday() {
    return wednesday;
  }

  public void setWednesday(Map wednesday) {
    this.wednesday = wednesday;
  }


  public WeeklyAutoScalingSchedule thursday(Map thursday) {
    this.thursday = thursday;
    return this;
  }

  /**
   * Get thursday
   * @return thursday
   */
  @javax.annotation.Nullable
  public Map getThursday() {
    return thursday;
  }

  public void setThursday(Map thursday) {
    this.thursday = thursday;
  }


  public WeeklyAutoScalingSchedule friday(Map friday) {
    this.friday = friday;
    return this;
  }

  /**
   * Get friday
   * @return friday
   */
  @javax.annotation.Nullable
  public Map getFriday() {
    return friday;
  }

  public void setFriday(Map friday) {
    this.friday = friday;
  }


  public WeeklyAutoScalingSchedule saturday(Map saturday) {
    this.saturday = saturday;
    return this;
  }

  /**
   * Get saturday
   * @return saturday
   */
  @javax.annotation.Nullable
  public Map getSaturday() {
    return saturday;
  }

  public void setSaturday(Map saturday) {
    this.saturday = saturday;
  }


  public WeeklyAutoScalingSchedule sunday(Map sunday) {
    this.sunday = sunday;
    return this;
  }

  /**
   * Get sunday
   * @return sunday
   */
  @javax.annotation.Nullable
  public Map getSunday() {
    return sunday;
  }

  public void setSunday(Map sunday) {
    this.sunday = sunday;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeeklyAutoScalingSchedule weeklyAutoScalingSchedule = (WeeklyAutoScalingSchedule) o;
    return Objects.equals(this.monday, weeklyAutoScalingSchedule.monday) &&
        Objects.equals(this.tuesday, weeklyAutoScalingSchedule.tuesday) &&
        Objects.equals(this.wednesday, weeklyAutoScalingSchedule.wednesday) &&
        Objects.equals(this.thursday, weeklyAutoScalingSchedule.thursday) &&
        Objects.equals(this.friday, weeklyAutoScalingSchedule.friday) &&
        Objects.equals(this.saturday, weeklyAutoScalingSchedule.saturday) &&
        Objects.equals(this.sunday, weeklyAutoScalingSchedule.sunday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeklyAutoScalingSchedule {\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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
    openapiFields.add("Monday");
    openapiFields.add("Tuesday");
    openapiFields.add("Wednesday");
    openapiFields.add("Thursday");
    openapiFields.add("Friday");
    openapiFields.add("Saturday");
    openapiFields.add("Sunday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WeeklyAutoScalingSchedule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WeeklyAutoScalingSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WeeklyAutoScalingSchedule is not found in the empty JSON string", WeeklyAutoScalingSchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WeeklyAutoScalingSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WeeklyAutoScalingSchedule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Monday`
      if (jsonObj.get("Monday") != null && !jsonObj.get("Monday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Monday"));
      }
      // validate the optional field `Tuesday`
      if (jsonObj.get("Tuesday") != null && !jsonObj.get("Tuesday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Tuesday"));
      }
      // validate the optional field `Wednesday`
      if (jsonObj.get("Wednesday") != null && !jsonObj.get("Wednesday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Wednesday"));
      }
      // validate the optional field `Thursday`
      if (jsonObj.get("Thursday") != null && !jsonObj.get("Thursday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Thursday"));
      }
      // validate the optional field `Friday`
      if (jsonObj.get("Friday") != null && !jsonObj.get("Friday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Friday"));
      }
      // validate the optional field `Saturday`
      if (jsonObj.get("Saturday") != null && !jsonObj.get("Saturday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Saturday"));
      }
      // validate the optional field `Sunday`
      if (jsonObj.get("Sunday") != null && !jsonObj.get("Sunday").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Sunday"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WeeklyAutoScalingSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WeeklyAutoScalingSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WeeklyAutoScalingSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WeeklyAutoScalingSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<WeeklyAutoScalingSchedule>() {
           @Override
           public void write(JsonWriter out, WeeklyAutoScalingSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WeeklyAutoScalingSchedule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WeeklyAutoScalingSchedule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WeeklyAutoScalingSchedule
   * @throws IOException if the JSON string is invalid with respect to WeeklyAutoScalingSchedule
   */
  public static WeeklyAutoScalingSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WeeklyAutoScalingSchedule.class);
  }

  /**
   * Convert an instance of WeeklyAutoScalingSchedule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

