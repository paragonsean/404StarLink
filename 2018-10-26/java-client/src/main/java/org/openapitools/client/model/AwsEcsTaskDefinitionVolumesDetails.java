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
import org.openapitools.client.model.AwsEcsTaskDefinitionVolumesDetailsDockerVolumeConfiguration;
import org.openapitools.client.model.AwsEcsTaskDefinitionVolumesDetailsEfsVolumeConfiguration;
import org.openapitools.client.model.AwsEcsTaskDefinitionVolumesDetailsHost;

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
 * A data volume to mount from another container.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcsTaskDefinitionVolumesDetails {
  public static final String SERIALIZED_NAME_DOCKER_VOLUME_CONFIGURATION = "DockerVolumeConfiguration";
  @SerializedName(SERIALIZED_NAME_DOCKER_VOLUME_CONFIGURATION)
  private AwsEcsTaskDefinitionVolumesDetailsDockerVolumeConfiguration dockerVolumeConfiguration;

  public static final String SERIALIZED_NAME_EFS_VOLUME_CONFIGURATION = "EfsVolumeConfiguration";
  @SerializedName(SERIALIZED_NAME_EFS_VOLUME_CONFIGURATION)
  private AwsEcsTaskDefinitionVolumesDetailsEfsVolumeConfiguration efsVolumeConfiguration;

  public static final String SERIALIZED_NAME_HOST = "Host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private AwsEcsTaskDefinitionVolumesDetailsHost host;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AwsEcsTaskDefinitionVolumesDetails() {
  }

  public AwsEcsTaskDefinitionVolumesDetails dockerVolumeConfiguration(AwsEcsTaskDefinitionVolumesDetailsDockerVolumeConfiguration dockerVolumeConfiguration) {
    this.dockerVolumeConfiguration = dockerVolumeConfiguration;
    return this;
  }

  /**
   * Get dockerVolumeConfiguration
   * @return dockerVolumeConfiguration
   */
  @javax.annotation.Nullable
  public AwsEcsTaskDefinitionVolumesDetailsDockerVolumeConfiguration getDockerVolumeConfiguration() {
    return dockerVolumeConfiguration;
  }

  public void setDockerVolumeConfiguration(AwsEcsTaskDefinitionVolumesDetailsDockerVolumeConfiguration dockerVolumeConfiguration) {
    this.dockerVolumeConfiguration = dockerVolumeConfiguration;
  }


  public AwsEcsTaskDefinitionVolumesDetails efsVolumeConfiguration(AwsEcsTaskDefinitionVolumesDetailsEfsVolumeConfiguration efsVolumeConfiguration) {
    this.efsVolumeConfiguration = efsVolumeConfiguration;
    return this;
  }

  /**
   * Get efsVolumeConfiguration
   * @return efsVolumeConfiguration
   */
  @javax.annotation.Nullable
  public AwsEcsTaskDefinitionVolumesDetailsEfsVolumeConfiguration getEfsVolumeConfiguration() {
    return efsVolumeConfiguration;
  }

  public void setEfsVolumeConfiguration(AwsEcsTaskDefinitionVolumesDetailsEfsVolumeConfiguration efsVolumeConfiguration) {
    this.efsVolumeConfiguration = efsVolumeConfiguration;
  }


  public AwsEcsTaskDefinitionVolumesDetails host(AwsEcsTaskDefinitionVolumesDetailsHost host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  @javax.annotation.Nullable
  public AwsEcsTaskDefinitionVolumesDetailsHost getHost() {
    return host;
  }

  public void setHost(AwsEcsTaskDefinitionVolumesDetailsHost host) {
    this.host = host;
  }


  public AwsEcsTaskDefinitionVolumesDetails name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsTaskDefinitionVolumesDetails awsEcsTaskDefinitionVolumesDetails = (AwsEcsTaskDefinitionVolumesDetails) o;
    return Objects.equals(this.dockerVolumeConfiguration, awsEcsTaskDefinitionVolumesDetails.dockerVolumeConfiguration) &&
        Objects.equals(this.efsVolumeConfiguration, awsEcsTaskDefinitionVolumesDetails.efsVolumeConfiguration) &&
        Objects.equals(this.host, awsEcsTaskDefinitionVolumesDetails.host) &&
        Objects.equals(this.name, awsEcsTaskDefinitionVolumesDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerVolumeConfiguration, efsVolumeConfiguration, host, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcsTaskDefinitionVolumesDetails {\n");
    sb.append("    dockerVolumeConfiguration: ").append(toIndentedString(dockerVolumeConfiguration)).append("\n");
    sb.append("    efsVolumeConfiguration: ").append(toIndentedString(efsVolumeConfiguration)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("DockerVolumeConfiguration");
    openapiFields.add("EfsVolumeConfiguration");
    openapiFields.add("Host");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcsTaskDefinitionVolumesDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcsTaskDefinitionVolumesDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcsTaskDefinitionVolumesDetails is not found in the empty JSON string", AwsEcsTaskDefinitionVolumesDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcsTaskDefinitionVolumesDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcsTaskDefinitionVolumesDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DockerVolumeConfiguration`
      if (jsonObj.get("DockerVolumeConfiguration") != null && !jsonObj.get("DockerVolumeConfiguration").isJsonNull()) {
        AwsEcsTaskDefinitionVolumesDetailsDockerVolumeConfiguration.validateJsonElement(jsonObj.get("DockerVolumeConfiguration"));
      }
      // validate the optional field `EfsVolumeConfiguration`
      if (jsonObj.get("EfsVolumeConfiguration") != null && !jsonObj.get("EfsVolumeConfiguration").isJsonNull()) {
        AwsEcsTaskDefinitionVolumesDetailsEfsVolumeConfiguration.validateJsonElement(jsonObj.get("EfsVolumeConfiguration"));
      }
      // validate the optional field `Host`
      if (jsonObj.get("Host") != null && !jsonObj.get("Host").isJsonNull()) {
        AwsEcsTaskDefinitionVolumesDetailsHost.validateJsonElement(jsonObj.get("Host"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcsTaskDefinitionVolumesDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcsTaskDefinitionVolumesDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcsTaskDefinitionVolumesDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcsTaskDefinitionVolumesDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcsTaskDefinitionVolumesDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcsTaskDefinitionVolumesDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcsTaskDefinitionVolumesDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcsTaskDefinitionVolumesDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcsTaskDefinitionVolumesDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcsTaskDefinitionVolumesDetails
   */
  public static AwsEcsTaskDefinitionVolumesDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcsTaskDefinitionVolumesDetails.class);
  }

  /**
   * Convert an instance of AwsEcsTaskDefinitionVolumesDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

