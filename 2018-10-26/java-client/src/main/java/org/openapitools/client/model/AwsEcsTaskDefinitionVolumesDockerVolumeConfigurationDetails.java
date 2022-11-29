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
 * Information about a Docker volume.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails {
  public static final String SERIALIZED_NAME_AUTOPROVISION = "Autoprovision";
  @SerializedName(SERIALIZED_NAME_AUTOPROVISION)
  private Boolean autoprovision;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_DRIVER_OPTS = "DriverOpts";
  @SerializedName(SERIALIZED_NAME_DRIVER_OPTS)
  private Map driverOpts;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map labels;

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails() {
  }

  public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails autoprovision(Boolean autoprovision) {
    this.autoprovision = autoprovision;
    return this;
  }

  /**
   * Get autoprovision
   * @return autoprovision
   */
  @javax.annotation.Nullable
  public Boolean getAutoprovision() {
    return autoprovision;
  }

  public void setAutoprovision(Boolean autoprovision) {
    this.autoprovision = autoprovision;
  }


  public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   */
  @javax.annotation.Nullable
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails driverOpts(Map driverOpts) {
    this.driverOpts = driverOpts;
    return this;
  }

  /**
   * Get driverOpts
   * @return driverOpts
   */
  @javax.annotation.Nullable
  public Map getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(Map driverOpts) {
    this.driverOpts = driverOpts;
  }


  public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails labels(Map labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nullable
  public Map getLabels() {
    return labels;
  }

  public void setLabels(Map labels) {
    this.labels = labels;
  }


  public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails = (AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails) o;
    return Objects.equals(this.autoprovision, awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.autoprovision) &&
        Objects.equals(this.driver, awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.driver) &&
        Objects.equals(this.driverOpts, awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.driverOpts) &&
        Objects.equals(this.labels, awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.labels) &&
        Objects.equals(this.scope, awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoprovision, driver, driverOpts, labels, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails {\n");
    sb.append("    autoprovision: ").append(toIndentedString(autoprovision)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverOpts: ").append(toIndentedString(driverOpts)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("Autoprovision");
    openapiFields.add("Driver");
    openapiFields.add("DriverOpts");
    openapiFields.add("Labels");
    openapiFields.add("Scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails is not found in the empty JSON string", AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Autoprovision`
      if (jsonObj.get("Autoprovision") != null && !jsonObj.get("Autoprovision").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Autoprovision"));
      }
      // validate the optional field `Driver`
      if (jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Driver"));
      }
      // validate the optional field `DriverOpts`
      if (jsonObj.get("DriverOpts") != null && !jsonObj.get("DriverOpts").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("DriverOpts"));
      }
      // validate the optional field `Labels`
      if (jsonObj.get("Labels") != null && !jsonObj.get("Labels").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Labels"));
      }
      // validate the optional field `Scope`
      if (jsonObj.get("Scope") != null && !jsonObj.get("Scope").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Scope"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails
   */
  public static AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.class);
  }

  /**
   * Convert an instance of AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

