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
 * SetTimeBasedAutoScalingRequestAutoScalingSchedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:31.623912-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SetTimeBasedAutoScalingRequestAutoScalingSchedule {
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

  public SetTimeBasedAutoScalingRequestAutoScalingSchedule() {
  }

  public SetTimeBasedAutoScalingRequestAutoScalingSchedule monday(Map monday) {
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


  public SetTimeBasedAutoScalingRequestAutoScalingSchedule tuesday(Map tuesday) {
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


  public SetTimeBasedAutoScalingRequestAutoScalingSchedule wednesday(Map wednesday) {
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


  public SetTimeBasedAutoScalingRequestAutoScalingSchedule thursday(Map thursday) {
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


  public SetTimeBasedAutoScalingRequestAutoScalingSchedule friday(Map friday) {
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


  public SetTimeBasedAutoScalingRequestAutoScalingSchedule saturday(Map saturday) {
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


  public SetTimeBasedAutoScalingRequestAutoScalingSchedule sunday(Map sunday) {
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
    SetTimeBasedAutoScalingRequestAutoScalingSchedule setTimeBasedAutoScalingRequestAutoScalingSchedule = (SetTimeBasedAutoScalingRequestAutoScalingSchedule) o;
    return Objects.equals(this.monday, setTimeBasedAutoScalingRequestAutoScalingSchedule.monday) &&
        Objects.equals(this.tuesday, setTimeBasedAutoScalingRequestAutoScalingSchedule.tuesday) &&
        Objects.equals(this.wednesday, setTimeBasedAutoScalingRequestAutoScalingSchedule.wednesday) &&
        Objects.equals(this.thursday, setTimeBasedAutoScalingRequestAutoScalingSchedule.thursday) &&
        Objects.equals(this.friday, setTimeBasedAutoScalingRequestAutoScalingSchedule.friday) &&
        Objects.equals(this.saturday, setTimeBasedAutoScalingRequestAutoScalingSchedule.saturday) &&
        Objects.equals(this.sunday, setTimeBasedAutoScalingRequestAutoScalingSchedule.sunday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetTimeBasedAutoScalingRequestAutoScalingSchedule {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to SetTimeBasedAutoScalingRequestAutoScalingSchedule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetTimeBasedAutoScalingRequestAutoScalingSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetTimeBasedAutoScalingRequestAutoScalingSchedule is not found in the empty JSON string", SetTimeBasedAutoScalingRequestAutoScalingSchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetTimeBasedAutoScalingRequestAutoScalingSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetTimeBasedAutoScalingRequestAutoScalingSchedule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!SetTimeBasedAutoScalingRequestAutoScalingSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetTimeBasedAutoScalingRequestAutoScalingSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetTimeBasedAutoScalingRequestAutoScalingSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetTimeBasedAutoScalingRequestAutoScalingSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<SetTimeBasedAutoScalingRequestAutoScalingSchedule>() {
           @Override
           public void write(JsonWriter out, SetTimeBasedAutoScalingRequestAutoScalingSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetTimeBasedAutoScalingRequestAutoScalingSchedule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SetTimeBasedAutoScalingRequestAutoScalingSchedule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetTimeBasedAutoScalingRequestAutoScalingSchedule
   * @throws IOException if the JSON string is invalid with respect to SetTimeBasedAutoScalingRequestAutoScalingSchedule
   */
  public static SetTimeBasedAutoScalingRequestAutoScalingSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetTimeBasedAutoScalingRequestAutoScalingSchedule.class);
  }

  /**
   * Convert an instance of SetTimeBasedAutoScalingRequestAutoScalingSchedule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

