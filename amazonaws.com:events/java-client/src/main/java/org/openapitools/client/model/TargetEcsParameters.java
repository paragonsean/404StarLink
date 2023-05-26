/*
 * Amazon CloudWatch Events
 * <p>Amazon EventBridge helps you to respond to state changes in your Amazon Web Services resources. When your resources change state, they automatically send events to an event stream. You can create rules that match selected events in the stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For example, you can configure rules to:</p> <ul> <li> <p>Automatically invoke an Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance enters the running state.</p> </li> <li> <p>Direct specific API records from CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential security or availability risks.</p> </li> <li> <p>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</p> </li> </ul> <p>For more information about the features of Amazon EventBridge, see the <a href=\"https://docs.aws.amazon.com/eventbridge/latest/userguide\">Amazon EventBridge User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2015-10-07
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
import org.openapitools.client.model.EcsParametersNetworkConfiguration;
import org.openapitools.client.model.LaunchType;
import org.openapitools.client.model.PropagateTags;

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
 * TargetEcsParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TargetEcsParameters {
  public static final String SERIALIZED_NAME_TASK_DEFINITION_ARN = "TaskDefinitionArn";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_ARN)
  private String taskDefinitionArn;

  public static final String SERIALIZED_NAME_TASK_COUNT = "TaskCount";
  @SerializedName(SERIALIZED_NAME_TASK_COUNT)
  private Integer taskCount;

  public static final String SERIALIZED_NAME_LAUNCH_TYPE = "LaunchType";
  @SerializedName(SERIALIZED_NAME_LAUNCH_TYPE)
  private LaunchType launchType;

  public static final String SERIALIZED_NAME_NETWORK_CONFIGURATION = "NetworkConfiguration";
  @SerializedName(SERIALIZED_NAME_NETWORK_CONFIGURATION)
  private EcsParametersNetworkConfiguration networkConfiguration;

  public static final String SERIALIZED_NAME_PLATFORM_VERSION = "PlatformVersion";
  @SerializedName(SERIALIZED_NAME_PLATFORM_VERSION)
  private String platformVersion;

  public static final String SERIALIZED_NAME_GROUP = "Group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_CAPACITY_PROVIDER_STRATEGY = "CapacityProviderStrategy";
  @SerializedName(SERIALIZED_NAME_CAPACITY_PROVIDER_STRATEGY)
  private List capacityProviderStrategy;

  public static final String SERIALIZED_NAME_ENABLE_E_C_S_MANAGED_TAGS = "EnableECSManagedTags";
  @SerializedName(SERIALIZED_NAME_ENABLE_E_C_S_MANAGED_TAGS)
  private Boolean enableECSManagedTags;

  public static final String SERIALIZED_NAME_ENABLE_EXECUTE_COMMAND = "EnableExecuteCommand";
  @SerializedName(SERIALIZED_NAME_ENABLE_EXECUTE_COMMAND)
  private Boolean enableExecuteCommand;

  public static final String SERIALIZED_NAME_PLACEMENT_CONSTRAINTS = "PlacementConstraints";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_CONSTRAINTS)
  private List placementConstraints;

  public static final String SERIALIZED_NAME_PLACEMENT_STRATEGY = "PlacementStrategy";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_STRATEGY)
  private List placementStrategy;

  public static final String SERIALIZED_NAME_PROPAGATE_TAGS = "PropagateTags";
  @SerializedName(SERIALIZED_NAME_PROPAGATE_TAGS)
  private PropagateTags propagateTags;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "ReferenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public TargetEcsParameters() {
  }

  public TargetEcsParameters taskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
    return this;
  }

  /**
   * Get taskDefinitionArn
   * @return taskDefinitionArn
   */
  @javax.annotation.Nonnull
  public String getTaskDefinitionArn() {
    return taskDefinitionArn;
  }

  public void setTaskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
  }


  public TargetEcsParameters taskCount(Integer taskCount) {
    this.taskCount = taskCount;
    return this;
  }

  /**
   * Get taskCount
   * @return taskCount
   */
  @javax.annotation.Nullable
  public Integer getTaskCount() {
    return taskCount;
  }

  public void setTaskCount(Integer taskCount) {
    this.taskCount = taskCount;
  }


  public TargetEcsParameters launchType(LaunchType launchType) {
    this.launchType = launchType;
    return this;
  }

  /**
   * Get launchType
   * @return launchType
   */
  @javax.annotation.Nullable
  public LaunchType getLaunchType() {
    return launchType;
  }

  public void setLaunchType(LaunchType launchType) {
    this.launchType = launchType;
  }


  public TargetEcsParameters networkConfiguration(EcsParametersNetworkConfiguration networkConfiguration) {
    this.networkConfiguration = networkConfiguration;
    return this;
  }

  /**
   * Get networkConfiguration
   * @return networkConfiguration
   */
  @javax.annotation.Nullable
  public EcsParametersNetworkConfiguration getNetworkConfiguration() {
    return networkConfiguration;
  }

  public void setNetworkConfiguration(EcsParametersNetworkConfiguration networkConfiguration) {
    this.networkConfiguration = networkConfiguration;
  }


  public TargetEcsParameters platformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
    return this;
  }

  /**
   * Get platformVersion
   * @return platformVersion
   */
  @javax.annotation.Nullable
  public String getPlatformVersion() {
    return platformVersion;
  }

  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }


  public TargetEcsParameters group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public TargetEcsParameters capacityProviderStrategy(List capacityProviderStrategy) {
    this.capacityProviderStrategy = capacityProviderStrategy;
    return this;
  }

  /**
   * Get capacityProviderStrategy
   * @return capacityProviderStrategy
   */
  @javax.annotation.Nullable
  public List getCapacityProviderStrategy() {
    return capacityProviderStrategy;
  }

  public void setCapacityProviderStrategy(List capacityProviderStrategy) {
    this.capacityProviderStrategy = capacityProviderStrategy;
  }


  public TargetEcsParameters enableECSManagedTags(Boolean enableECSManagedTags) {
    this.enableECSManagedTags = enableECSManagedTags;
    return this;
  }

  /**
   * Get enableECSManagedTags
   * @return enableECSManagedTags
   */
  @javax.annotation.Nullable
  public Boolean getEnableECSManagedTags() {
    return enableECSManagedTags;
  }

  public void setEnableECSManagedTags(Boolean enableECSManagedTags) {
    this.enableECSManagedTags = enableECSManagedTags;
  }


  public TargetEcsParameters enableExecuteCommand(Boolean enableExecuteCommand) {
    this.enableExecuteCommand = enableExecuteCommand;
    return this;
  }

  /**
   * Get enableExecuteCommand
   * @return enableExecuteCommand
   */
  @javax.annotation.Nullable
  public Boolean getEnableExecuteCommand() {
    return enableExecuteCommand;
  }

  public void setEnableExecuteCommand(Boolean enableExecuteCommand) {
    this.enableExecuteCommand = enableExecuteCommand;
  }


  public TargetEcsParameters placementConstraints(List placementConstraints) {
    this.placementConstraints = placementConstraints;
    return this;
  }

  /**
   * Get placementConstraints
   * @return placementConstraints
   */
  @javax.annotation.Nullable
  public List getPlacementConstraints() {
    return placementConstraints;
  }

  public void setPlacementConstraints(List placementConstraints) {
    this.placementConstraints = placementConstraints;
  }


  public TargetEcsParameters placementStrategy(List placementStrategy) {
    this.placementStrategy = placementStrategy;
    return this;
  }

  /**
   * Get placementStrategy
   * @return placementStrategy
   */
  @javax.annotation.Nullable
  public List getPlacementStrategy() {
    return placementStrategy;
  }

  public void setPlacementStrategy(List placementStrategy) {
    this.placementStrategy = placementStrategy;
  }


  public TargetEcsParameters propagateTags(PropagateTags propagateTags) {
    this.propagateTags = propagateTags;
    return this;
  }

  /**
   * Get propagateTags
   * @return propagateTags
   */
  @javax.annotation.Nullable
  public PropagateTags getPropagateTags() {
    return propagateTags;
  }

  public void setPropagateTags(PropagateTags propagateTags) {
    this.propagateTags = propagateTags;
  }


  public TargetEcsParameters referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public TargetEcsParameters tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetEcsParameters targetEcsParameters = (TargetEcsParameters) o;
    return Objects.equals(this.taskDefinitionArn, targetEcsParameters.taskDefinitionArn) &&
        Objects.equals(this.taskCount, targetEcsParameters.taskCount) &&
        Objects.equals(this.launchType, targetEcsParameters.launchType) &&
        Objects.equals(this.networkConfiguration, targetEcsParameters.networkConfiguration) &&
        Objects.equals(this.platformVersion, targetEcsParameters.platformVersion) &&
        Objects.equals(this.group, targetEcsParameters.group) &&
        Objects.equals(this.capacityProviderStrategy, targetEcsParameters.capacityProviderStrategy) &&
        Objects.equals(this.enableECSManagedTags, targetEcsParameters.enableECSManagedTags) &&
        Objects.equals(this.enableExecuteCommand, targetEcsParameters.enableExecuteCommand) &&
        Objects.equals(this.placementConstraints, targetEcsParameters.placementConstraints) &&
        Objects.equals(this.placementStrategy, targetEcsParameters.placementStrategy) &&
        Objects.equals(this.propagateTags, targetEcsParameters.propagateTags) &&
        Objects.equals(this.referenceId, targetEcsParameters.referenceId) &&
        Objects.equals(this.tags, targetEcsParameters.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskDefinitionArn, taskCount, launchType, networkConfiguration, platformVersion, group, capacityProviderStrategy, enableECSManagedTags, enableExecuteCommand, placementConstraints, placementStrategy, propagateTags, referenceId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetEcsParameters {\n");
    sb.append("    taskDefinitionArn: ").append(toIndentedString(taskDefinitionArn)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    networkConfiguration: ").append(toIndentedString(networkConfiguration)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    capacityProviderStrategy: ").append(toIndentedString(capacityProviderStrategy)).append("\n");
    sb.append("    enableECSManagedTags: ").append(toIndentedString(enableECSManagedTags)).append("\n");
    sb.append("    enableExecuteCommand: ").append(toIndentedString(enableExecuteCommand)).append("\n");
    sb.append("    placementConstraints: ").append(toIndentedString(placementConstraints)).append("\n");
    sb.append("    placementStrategy: ").append(toIndentedString(placementStrategy)).append("\n");
    sb.append("    propagateTags: ").append(toIndentedString(propagateTags)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("TaskDefinitionArn");
    openapiFields.add("TaskCount");
    openapiFields.add("LaunchType");
    openapiFields.add("NetworkConfiguration");
    openapiFields.add("PlatformVersion");
    openapiFields.add("Group");
    openapiFields.add("CapacityProviderStrategy");
    openapiFields.add("EnableECSManagedTags");
    openapiFields.add("EnableExecuteCommand");
    openapiFields.add("PlacementConstraints");
    openapiFields.add("PlacementStrategy");
    openapiFields.add("PropagateTags");
    openapiFields.add("ReferenceId");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TaskDefinitionArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetEcsParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetEcsParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetEcsParameters is not found in the empty JSON string", TargetEcsParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetEcsParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetEcsParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetEcsParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `TaskDefinitionArn`
      String.validateJsonElement(jsonObj.get("TaskDefinitionArn"));
      // validate the optional field `TaskCount`
      if (jsonObj.get("TaskCount") != null && !jsonObj.get("TaskCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("TaskCount"));
      }
      // validate the optional field `LaunchType`
      if (jsonObj.get("LaunchType") != null && !jsonObj.get("LaunchType").isJsonNull()) {
        LaunchType.validateJsonElement(jsonObj.get("LaunchType"));
      }
      // validate the optional field `NetworkConfiguration`
      if (jsonObj.get("NetworkConfiguration") != null && !jsonObj.get("NetworkConfiguration").isJsonNull()) {
        EcsParametersNetworkConfiguration.validateJsonElement(jsonObj.get("NetworkConfiguration"));
      }
      // validate the optional field `PlatformVersion`
      if (jsonObj.get("PlatformVersion") != null && !jsonObj.get("PlatformVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PlatformVersion"));
      }
      // validate the optional field `Group`
      if (jsonObj.get("Group") != null && !jsonObj.get("Group").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Group"));
      }
      // validate the optional field `CapacityProviderStrategy`
      if (jsonObj.get("CapacityProviderStrategy") != null && !jsonObj.get("CapacityProviderStrategy").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CapacityProviderStrategy"));
      }
      // validate the optional field `EnableECSManagedTags`
      if (jsonObj.get("EnableECSManagedTags") != null && !jsonObj.get("EnableECSManagedTags").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EnableECSManagedTags"));
      }
      // validate the optional field `EnableExecuteCommand`
      if (jsonObj.get("EnableExecuteCommand") != null && !jsonObj.get("EnableExecuteCommand").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EnableExecuteCommand"));
      }
      // validate the optional field `PlacementConstraints`
      if (jsonObj.get("PlacementConstraints") != null && !jsonObj.get("PlacementConstraints").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PlacementConstraints"));
      }
      // validate the optional field `PlacementStrategy`
      if (jsonObj.get("PlacementStrategy") != null && !jsonObj.get("PlacementStrategy").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PlacementStrategy"));
      }
      // validate the optional field `PropagateTags`
      if (jsonObj.get("PropagateTags") != null && !jsonObj.get("PropagateTags").isJsonNull()) {
        PropagateTags.validateJsonElement(jsonObj.get("PropagateTags"));
      }
      // validate the optional field `ReferenceId`
      if (jsonObj.get("ReferenceId") != null && !jsonObj.get("ReferenceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReferenceId"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetEcsParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetEcsParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetEcsParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetEcsParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetEcsParameters>() {
           @Override
           public void write(JsonWriter out, TargetEcsParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetEcsParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetEcsParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetEcsParameters
   * @throws IOException if the JSON string is invalid with respect to TargetEcsParameters
   */
  public static TargetEcsParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetEcsParameters.class);
  }

  /**
   * Convert an instance of TargetEcsParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

