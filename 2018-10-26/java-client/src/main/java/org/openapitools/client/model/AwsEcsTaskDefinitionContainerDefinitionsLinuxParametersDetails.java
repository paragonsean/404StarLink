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
import org.openapitools.client.model.AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsCapabilities;

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
 * &amp;gt;Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails {
  public static final String SERIALIZED_NAME_CAPABILITIES = "Capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsCapabilities capabilities;

  public static final String SERIALIZED_NAME_DEVICES = "Devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List devices;

  public static final String SERIALIZED_NAME_INIT_PROCESS_ENABLED = "InitProcessEnabled";
  @SerializedName(SERIALIZED_NAME_INIT_PROCESS_ENABLED)
  private Boolean initProcessEnabled;

  public static final String SERIALIZED_NAME_MAX_SWAP = "MaxSwap";
  @SerializedName(SERIALIZED_NAME_MAX_SWAP)
  private Integer maxSwap;

  public static final String SERIALIZED_NAME_SHARED_MEMORY_SIZE = "SharedMemorySize";
  @SerializedName(SERIALIZED_NAME_SHARED_MEMORY_SIZE)
  private Integer sharedMemorySize;

  public static final String SERIALIZED_NAME_SWAPPINESS = "Swappiness";
  @SerializedName(SERIALIZED_NAME_SWAPPINESS)
  private Integer swappiness;

  public static final String SERIALIZED_NAME_TMPFS = "Tmpfs";
  @SerializedName(SERIALIZED_NAME_TMPFS)
  private List tmpfs;

  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails() {
  }

  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails capabilities(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
   */
  @javax.annotation.Nullable
  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsCapabilities capabilities) {
    this.capabilities = capabilities;
  }


  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails devices(List devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Get devices
   * @return devices
   */
  @javax.annotation.Nullable
  public List getDevices() {
    return devices;
  }

  public void setDevices(List devices) {
    this.devices = devices;
  }


  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails initProcessEnabled(Boolean initProcessEnabled) {
    this.initProcessEnabled = initProcessEnabled;
    return this;
  }

  /**
   * Get initProcessEnabled
   * @return initProcessEnabled
   */
  @javax.annotation.Nullable
  public Boolean getInitProcessEnabled() {
    return initProcessEnabled;
  }

  public void setInitProcessEnabled(Boolean initProcessEnabled) {
    this.initProcessEnabled = initProcessEnabled;
  }


  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails maxSwap(Integer maxSwap) {
    this.maxSwap = maxSwap;
    return this;
  }

  /**
   * Get maxSwap
   * @return maxSwap
   */
  @javax.annotation.Nullable
  public Integer getMaxSwap() {
    return maxSwap;
  }

  public void setMaxSwap(Integer maxSwap) {
    this.maxSwap = maxSwap;
  }


  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails sharedMemorySize(Integer sharedMemorySize) {
    this.sharedMemorySize = sharedMemorySize;
    return this;
  }

  /**
   * Get sharedMemorySize
   * @return sharedMemorySize
   */
  @javax.annotation.Nullable
  public Integer getSharedMemorySize() {
    return sharedMemorySize;
  }

  public void setSharedMemorySize(Integer sharedMemorySize) {
    this.sharedMemorySize = sharedMemorySize;
  }


  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails swappiness(Integer swappiness) {
    this.swappiness = swappiness;
    return this;
  }

  /**
   * Get swappiness
   * @return swappiness
   */
  @javax.annotation.Nullable
  public Integer getSwappiness() {
    return swappiness;
  }

  public void setSwappiness(Integer swappiness) {
    this.swappiness = swappiness;
  }


  public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails tmpfs(List tmpfs) {
    this.tmpfs = tmpfs;
    return this;
  }

  /**
   * Get tmpfs
   * @return tmpfs
   */
  @javax.annotation.Nullable
  public List getTmpfs() {
    return tmpfs;
  }

  public void setTmpfs(List tmpfs) {
    this.tmpfs = tmpfs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails = (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails) o;
    return Objects.equals(this.capabilities, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.capabilities) &&
        Objects.equals(this.devices, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.devices) &&
        Objects.equals(this.initProcessEnabled, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.initProcessEnabled) &&
        Objects.equals(this.maxSwap, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.maxSwap) &&
        Objects.equals(this.sharedMemorySize, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.sharedMemorySize) &&
        Objects.equals(this.swappiness, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.swappiness) &&
        Objects.equals(this.tmpfs, awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.tmpfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, devices, initProcessEnabled, maxSwap, sharedMemorySize, swappiness, tmpfs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    initProcessEnabled: ").append(toIndentedString(initProcessEnabled)).append("\n");
    sb.append("    maxSwap: ").append(toIndentedString(maxSwap)).append("\n");
    sb.append("    sharedMemorySize: ").append(toIndentedString(sharedMemorySize)).append("\n");
    sb.append("    swappiness: ").append(toIndentedString(swappiness)).append("\n");
    sb.append("    tmpfs: ").append(toIndentedString(tmpfs)).append("\n");
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
    openapiFields.add("Capabilities");
    openapiFields.add("Devices");
    openapiFields.add("InitProcessEnabled");
    openapiFields.add("MaxSwap");
    openapiFields.add("SharedMemorySize");
    openapiFields.add("Swappiness");
    openapiFields.add("Tmpfs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails is not found in the empty JSON string", AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Capabilities`
      if (jsonObj.get("Capabilities") != null && !jsonObj.get("Capabilities").isJsonNull()) {
        AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsCapabilities.validateJsonElement(jsonObj.get("Capabilities"));
      }
      // validate the optional field `Devices`
      if (jsonObj.get("Devices") != null && !jsonObj.get("Devices").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Devices"));
      }
      // validate the optional field `InitProcessEnabled`
      if (jsonObj.get("InitProcessEnabled") != null && !jsonObj.get("InitProcessEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("InitProcessEnabled"));
      }
      // validate the optional field `MaxSwap`
      if (jsonObj.get("MaxSwap") != null && !jsonObj.get("MaxSwap").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxSwap"));
      }
      // validate the optional field `SharedMemorySize`
      if (jsonObj.get("SharedMemorySize") != null && !jsonObj.get("SharedMemorySize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("SharedMemorySize"));
      }
      // validate the optional field `Swappiness`
      if (jsonObj.get("Swappiness") != null && !jsonObj.get("Swappiness").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Swappiness"));
      }
      // validate the optional field `Tmpfs`
      if (jsonObj.get("Tmpfs") != null && !jsonObj.get("Tmpfs").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tmpfs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails
   */
  public static AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.class);
  }

  /**
   * Convert an instance of AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

