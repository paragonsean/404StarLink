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
import org.openapitools.client.model.AwsEc2LaunchTemplateDetailsLaunchTemplateData;

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
 *  Specifies the properties for creating an Amazon Elastic Compute Cloud (Amazon EC2) launch template. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2LaunchTemplateDetails {
  public static final String SERIALIZED_NAME_LAUNCH_TEMPLATE_NAME = "LaunchTemplateName";
  @SerializedName(SERIALIZED_NAME_LAUNCH_TEMPLATE_NAME)
  private String launchTemplateName;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAUNCH_TEMPLATE_DATA = "LaunchTemplateData";
  @SerializedName(SERIALIZED_NAME_LAUNCH_TEMPLATE_DATA)
  private AwsEc2LaunchTemplateDetailsLaunchTemplateData launchTemplateData;

  public static final String SERIALIZED_NAME_DEFAULT_VERSION_NUMBER = "DefaultVersionNumber";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VERSION_NUMBER)
  private Integer defaultVersionNumber;

  public static final String SERIALIZED_NAME_LATEST_VERSION_NUMBER = "LatestVersionNumber";
  @SerializedName(SERIALIZED_NAME_LATEST_VERSION_NUMBER)
  private Integer latestVersionNumber;

  public AwsEc2LaunchTemplateDetails() {
  }

  public AwsEc2LaunchTemplateDetails launchTemplateName(String launchTemplateName) {
    this.launchTemplateName = launchTemplateName;
    return this;
  }

  /**
   * Get launchTemplateName
   * @return launchTemplateName
   */
  @javax.annotation.Nullable
  public String getLaunchTemplateName() {
    return launchTemplateName;
  }

  public void setLaunchTemplateName(String launchTemplateName) {
    this.launchTemplateName = launchTemplateName;
  }


  public AwsEc2LaunchTemplateDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AwsEc2LaunchTemplateDetails launchTemplateData(AwsEc2LaunchTemplateDetailsLaunchTemplateData launchTemplateData) {
    this.launchTemplateData = launchTemplateData;
    return this;
  }

  /**
   * Get launchTemplateData
   * @return launchTemplateData
   */
  @javax.annotation.Nullable
  public AwsEc2LaunchTemplateDetailsLaunchTemplateData getLaunchTemplateData() {
    return launchTemplateData;
  }

  public void setLaunchTemplateData(AwsEc2LaunchTemplateDetailsLaunchTemplateData launchTemplateData) {
    this.launchTemplateData = launchTemplateData;
  }


  public AwsEc2LaunchTemplateDetails defaultVersionNumber(Integer defaultVersionNumber) {
    this.defaultVersionNumber = defaultVersionNumber;
    return this;
  }

  /**
   * Get defaultVersionNumber
   * @return defaultVersionNumber
   */
  @javax.annotation.Nullable
  public Integer getDefaultVersionNumber() {
    return defaultVersionNumber;
  }

  public void setDefaultVersionNumber(Integer defaultVersionNumber) {
    this.defaultVersionNumber = defaultVersionNumber;
  }


  public AwsEc2LaunchTemplateDetails latestVersionNumber(Integer latestVersionNumber) {
    this.latestVersionNumber = latestVersionNumber;
    return this;
  }

  /**
   * Get latestVersionNumber
   * @return latestVersionNumber
   */
  @javax.annotation.Nullable
  public Integer getLatestVersionNumber() {
    return latestVersionNumber;
  }

  public void setLatestVersionNumber(Integer latestVersionNumber) {
    this.latestVersionNumber = latestVersionNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2LaunchTemplateDetails awsEc2LaunchTemplateDetails = (AwsEc2LaunchTemplateDetails) o;
    return Objects.equals(this.launchTemplateName, awsEc2LaunchTemplateDetails.launchTemplateName) &&
        Objects.equals(this.id, awsEc2LaunchTemplateDetails.id) &&
        Objects.equals(this.launchTemplateData, awsEc2LaunchTemplateDetails.launchTemplateData) &&
        Objects.equals(this.defaultVersionNumber, awsEc2LaunchTemplateDetails.defaultVersionNumber) &&
        Objects.equals(this.latestVersionNumber, awsEc2LaunchTemplateDetails.latestVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchTemplateName, id, launchTemplateData, defaultVersionNumber, latestVersionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2LaunchTemplateDetails {\n");
    sb.append("    launchTemplateName: ").append(toIndentedString(launchTemplateName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    launchTemplateData: ").append(toIndentedString(launchTemplateData)).append("\n");
    sb.append("    defaultVersionNumber: ").append(toIndentedString(defaultVersionNumber)).append("\n");
    sb.append("    latestVersionNumber: ").append(toIndentedString(latestVersionNumber)).append("\n");
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
    openapiFields.add("LaunchTemplateName");
    openapiFields.add("Id");
    openapiFields.add("LaunchTemplateData");
    openapiFields.add("DefaultVersionNumber");
    openapiFields.add("LatestVersionNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2LaunchTemplateDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2LaunchTemplateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2LaunchTemplateDetails is not found in the empty JSON string", AwsEc2LaunchTemplateDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2LaunchTemplateDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2LaunchTemplateDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LaunchTemplateName`
      if (jsonObj.get("LaunchTemplateName") != null && !jsonObj.get("LaunchTemplateName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchTemplateName"));
      }
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `LaunchTemplateData`
      if (jsonObj.get("LaunchTemplateData") != null && !jsonObj.get("LaunchTemplateData").isJsonNull()) {
        AwsEc2LaunchTemplateDetailsLaunchTemplateData.validateJsonElement(jsonObj.get("LaunchTemplateData"));
      }
      // validate the optional field `DefaultVersionNumber`
      if (jsonObj.get("DefaultVersionNumber") != null && !jsonObj.get("DefaultVersionNumber").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DefaultVersionNumber"));
      }
      // validate the optional field `LatestVersionNumber`
      if (jsonObj.get("LatestVersionNumber") != null && !jsonObj.get("LatestVersionNumber").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("LatestVersionNumber"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2LaunchTemplateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2LaunchTemplateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2LaunchTemplateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2LaunchTemplateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2LaunchTemplateDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2LaunchTemplateDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2LaunchTemplateDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2LaunchTemplateDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2LaunchTemplateDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2LaunchTemplateDetails
   */
  public static AwsEc2LaunchTemplateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2LaunchTemplateDetails.class);
  }

  /**
   * Convert an instance of AwsEc2LaunchTemplateDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

