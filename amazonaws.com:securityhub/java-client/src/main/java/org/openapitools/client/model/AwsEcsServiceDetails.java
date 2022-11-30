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
import org.openapitools.client.model.AwsEcsServiceDetailsDeploymentConfiguration;
import org.openapitools.client.model.AwsEcsServiceDetailsDeploymentController;
import org.openapitools.client.model.AwsEcsServiceDetailsNetworkConfiguration;

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
 * Provides details about a service within an ECS cluster.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcsServiceDetails {
  public static final String SERIALIZED_NAME_CAPACITY_PROVIDER_STRATEGY = "CapacityProviderStrategy";
  @SerializedName(SERIALIZED_NAME_CAPACITY_PROVIDER_STRATEGY)
  private List capacityProviderStrategy;

  public static final String SERIALIZED_NAME_CLUSTER = "Cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_DEPLOYMENT_CONFIGURATION = "DeploymentConfiguration";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_CONFIGURATION)
  private AwsEcsServiceDetailsDeploymentConfiguration deploymentConfiguration;

  public static final String SERIALIZED_NAME_DEPLOYMENT_CONTROLLER = "DeploymentController";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_CONTROLLER)
  private AwsEcsServiceDetailsDeploymentController deploymentController;

  public static final String SERIALIZED_NAME_DESIRED_COUNT = "DesiredCount";
  @SerializedName(SERIALIZED_NAME_DESIRED_COUNT)
  private Integer desiredCount;

  public static final String SERIALIZED_NAME_ENABLE_ECS_MANAGED_TAGS = "EnableEcsManagedTags";
  @SerializedName(SERIALIZED_NAME_ENABLE_ECS_MANAGED_TAGS)
  private Boolean enableEcsManagedTags;

  public static final String SERIALIZED_NAME_ENABLE_EXECUTE_COMMAND = "EnableExecuteCommand";
  @SerializedName(SERIALIZED_NAME_ENABLE_EXECUTE_COMMAND)
  private Boolean enableExecuteCommand;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_GRACE_PERIOD_SECONDS = "HealthCheckGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_GRACE_PERIOD_SECONDS)
  private Integer healthCheckGracePeriodSeconds;

  public static final String SERIALIZED_NAME_LAUNCH_TYPE = "LaunchType";
  @SerializedName(SERIALIZED_NAME_LAUNCH_TYPE)
  private String launchType;

  public static final String SERIALIZED_NAME_LOAD_BALANCERS = "LoadBalancers";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCERS)
  private List loadBalancers;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_CONFIGURATION = "NetworkConfiguration";
  @SerializedName(SERIALIZED_NAME_NETWORK_CONFIGURATION)
  private AwsEcsServiceDetailsNetworkConfiguration networkConfiguration;

  public static final String SERIALIZED_NAME_PLACEMENT_CONSTRAINTS = "PlacementConstraints";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_CONSTRAINTS)
  private List placementConstraints;

  public static final String SERIALIZED_NAME_PLACEMENT_STRATEGIES = "PlacementStrategies";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_STRATEGIES)
  private List placementStrategies;

  public static final String SERIALIZED_NAME_PLATFORM_VERSION = "PlatformVersion";
  @SerializedName(SERIALIZED_NAME_PLATFORM_VERSION)
  private String platformVersion;

  public static final String SERIALIZED_NAME_PROPAGATE_TAGS = "PropagateTags";
  @SerializedName(SERIALIZED_NAME_PROPAGATE_TAGS)
  private String propagateTags;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SCHEDULING_STRATEGY = "SchedulingStrategy";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_STRATEGY)
  private String schedulingStrategy;

  public static final String SERIALIZED_NAME_SERVICE_ARN = "ServiceArn";
  @SerializedName(SERIALIZED_NAME_SERVICE_ARN)
  private String serviceArn;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "ServiceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_REGISTRIES = "ServiceRegistries";
  @SerializedName(SERIALIZED_NAME_SERVICE_REGISTRIES)
  private List serviceRegistries;

  public static final String SERIALIZED_NAME_TASK_DEFINITION = "TaskDefinition";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION)
  private String taskDefinition;

  public AwsEcsServiceDetails() {
  }

  public AwsEcsServiceDetails capacityProviderStrategy(List capacityProviderStrategy) {
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


  public AwsEcsServiceDetails cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Get cluster
   * @return cluster
   */
  @javax.annotation.Nullable
  public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public AwsEcsServiceDetails deploymentConfiguration(AwsEcsServiceDetailsDeploymentConfiguration deploymentConfiguration) {
    this.deploymentConfiguration = deploymentConfiguration;
    return this;
  }

  /**
   * Get deploymentConfiguration
   * @return deploymentConfiguration
   */
  @javax.annotation.Nullable
  public AwsEcsServiceDetailsDeploymentConfiguration getDeploymentConfiguration() {
    return deploymentConfiguration;
  }

  public void setDeploymentConfiguration(AwsEcsServiceDetailsDeploymentConfiguration deploymentConfiguration) {
    this.deploymentConfiguration = deploymentConfiguration;
  }


  public AwsEcsServiceDetails deploymentController(AwsEcsServiceDetailsDeploymentController deploymentController) {
    this.deploymentController = deploymentController;
    return this;
  }

  /**
   * Get deploymentController
   * @return deploymentController
   */
  @javax.annotation.Nullable
  public AwsEcsServiceDetailsDeploymentController getDeploymentController() {
    return deploymentController;
  }

  public void setDeploymentController(AwsEcsServiceDetailsDeploymentController deploymentController) {
    this.deploymentController = deploymentController;
  }


  public AwsEcsServiceDetails desiredCount(Integer desiredCount) {
    this.desiredCount = desiredCount;
    return this;
  }

  /**
   * Get desiredCount
   * @return desiredCount
   */
  @javax.annotation.Nullable
  public Integer getDesiredCount() {
    return desiredCount;
  }

  public void setDesiredCount(Integer desiredCount) {
    this.desiredCount = desiredCount;
  }


  public AwsEcsServiceDetails enableEcsManagedTags(Boolean enableEcsManagedTags) {
    this.enableEcsManagedTags = enableEcsManagedTags;
    return this;
  }

  /**
   * Get enableEcsManagedTags
   * @return enableEcsManagedTags
   */
  @javax.annotation.Nullable
  public Boolean getEnableEcsManagedTags() {
    return enableEcsManagedTags;
  }

  public void setEnableEcsManagedTags(Boolean enableEcsManagedTags) {
    this.enableEcsManagedTags = enableEcsManagedTags;
  }


  public AwsEcsServiceDetails enableExecuteCommand(Boolean enableExecuteCommand) {
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


  public AwsEcsServiceDetails healthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
    this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    return this;
  }

  /**
   * Get healthCheckGracePeriodSeconds
   * @return healthCheckGracePeriodSeconds
   */
  @javax.annotation.Nullable
  public Integer getHealthCheckGracePeriodSeconds() {
    return healthCheckGracePeriodSeconds;
  }

  public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
    this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
  }


  public AwsEcsServiceDetails launchType(String launchType) {
    this.launchType = launchType;
    return this;
  }

  /**
   * Get launchType
   * @return launchType
   */
  @javax.annotation.Nullable
  public String getLaunchType() {
    return launchType;
  }

  public void setLaunchType(String launchType) {
    this.launchType = launchType;
  }


  public AwsEcsServiceDetails loadBalancers(List loadBalancers) {
    this.loadBalancers = loadBalancers;
    return this;
  }

  /**
   * Get loadBalancers
   * @return loadBalancers
   */
  @javax.annotation.Nullable
  public List getLoadBalancers() {
    return loadBalancers;
  }

  public void setLoadBalancers(List loadBalancers) {
    this.loadBalancers = loadBalancers;
  }


  public AwsEcsServiceDetails name(String name) {
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


  public AwsEcsServiceDetails networkConfiguration(AwsEcsServiceDetailsNetworkConfiguration networkConfiguration) {
    this.networkConfiguration = networkConfiguration;
    return this;
  }

  /**
   * Get networkConfiguration
   * @return networkConfiguration
   */
  @javax.annotation.Nullable
  public AwsEcsServiceDetailsNetworkConfiguration getNetworkConfiguration() {
    return networkConfiguration;
  }

  public void setNetworkConfiguration(AwsEcsServiceDetailsNetworkConfiguration networkConfiguration) {
    this.networkConfiguration = networkConfiguration;
  }


  public AwsEcsServiceDetails placementConstraints(List placementConstraints) {
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


  public AwsEcsServiceDetails placementStrategies(List placementStrategies) {
    this.placementStrategies = placementStrategies;
    return this;
  }

  /**
   * Get placementStrategies
   * @return placementStrategies
   */
  @javax.annotation.Nullable
  public List getPlacementStrategies() {
    return placementStrategies;
  }

  public void setPlacementStrategies(List placementStrategies) {
    this.placementStrategies = placementStrategies;
  }


  public AwsEcsServiceDetails platformVersion(String platformVersion) {
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


  public AwsEcsServiceDetails propagateTags(String propagateTags) {
    this.propagateTags = propagateTags;
    return this;
  }

  /**
   * Get propagateTags
   * @return propagateTags
   */
  @javax.annotation.Nullable
  public String getPropagateTags() {
    return propagateTags;
  }

  public void setPropagateTags(String propagateTags) {
    this.propagateTags = propagateTags;
  }


  public AwsEcsServiceDetails role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public AwsEcsServiceDetails schedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
    return this;
  }

  /**
   * Get schedulingStrategy
   * @return schedulingStrategy
   */
  @javax.annotation.Nullable
  public String getSchedulingStrategy() {
    return schedulingStrategy;
  }

  public void setSchedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
  }


  public AwsEcsServiceDetails serviceArn(String serviceArn) {
    this.serviceArn = serviceArn;
    return this;
  }

  /**
   * Get serviceArn
   * @return serviceArn
   */
  @javax.annotation.Nullable
  public String getServiceArn() {
    return serviceArn;
  }

  public void setServiceArn(String serviceArn) {
    this.serviceArn = serviceArn;
  }


  public AwsEcsServiceDetails serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @javax.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public AwsEcsServiceDetails serviceRegistries(List serviceRegistries) {
    this.serviceRegistries = serviceRegistries;
    return this;
  }

  /**
   * Get serviceRegistries
   * @return serviceRegistries
   */
  @javax.annotation.Nullable
  public List getServiceRegistries() {
    return serviceRegistries;
  }

  public void setServiceRegistries(List serviceRegistries) {
    this.serviceRegistries = serviceRegistries;
  }


  public AwsEcsServiceDetails taskDefinition(String taskDefinition) {
    this.taskDefinition = taskDefinition;
    return this;
  }

  /**
   * Get taskDefinition
   * @return taskDefinition
   */
  @javax.annotation.Nullable
  public String getTaskDefinition() {
    return taskDefinition;
  }

  public void setTaskDefinition(String taskDefinition) {
    this.taskDefinition = taskDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsServiceDetails awsEcsServiceDetails = (AwsEcsServiceDetails) o;
    return Objects.equals(this.capacityProviderStrategy, awsEcsServiceDetails.capacityProviderStrategy) &&
        Objects.equals(this.cluster, awsEcsServiceDetails.cluster) &&
        Objects.equals(this.deploymentConfiguration, awsEcsServiceDetails.deploymentConfiguration) &&
        Objects.equals(this.deploymentController, awsEcsServiceDetails.deploymentController) &&
        Objects.equals(this.desiredCount, awsEcsServiceDetails.desiredCount) &&
        Objects.equals(this.enableEcsManagedTags, awsEcsServiceDetails.enableEcsManagedTags) &&
        Objects.equals(this.enableExecuteCommand, awsEcsServiceDetails.enableExecuteCommand) &&
        Objects.equals(this.healthCheckGracePeriodSeconds, awsEcsServiceDetails.healthCheckGracePeriodSeconds) &&
        Objects.equals(this.launchType, awsEcsServiceDetails.launchType) &&
        Objects.equals(this.loadBalancers, awsEcsServiceDetails.loadBalancers) &&
        Objects.equals(this.name, awsEcsServiceDetails.name) &&
        Objects.equals(this.networkConfiguration, awsEcsServiceDetails.networkConfiguration) &&
        Objects.equals(this.placementConstraints, awsEcsServiceDetails.placementConstraints) &&
        Objects.equals(this.placementStrategies, awsEcsServiceDetails.placementStrategies) &&
        Objects.equals(this.platformVersion, awsEcsServiceDetails.platformVersion) &&
        Objects.equals(this.propagateTags, awsEcsServiceDetails.propagateTags) &&
        Objects.equals(this.role, awsEcsServiceDetails.role) &&
        Objects.equals(this.schedulingStrategy, awsEcsServiceDetails.schedulingStrategy) &&
        Objects.equals(this.serviceArn, awsEcsServiceDetails.serviceArn) &&
        Objects.equals(this.serviceName, awsEcsServiceDetails.serviceName) &&
        Objects.equals(this.serviceRegistries, awsEcsServiceDetails.serviceRegistries) &&
        Objects.equals(this.taskDefinition, awsEcsServiceDetails.taskDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityProviderStrategy, cluster, deploymentConfiguration, deploymentController, desiredCount, enableEcsManagedTags, enableExecuteCommand, healthCheckGracePeriodSeconds, launchType, loadBalancers, name, networkConfiguration, placementConstraints, placementStrategies, platformVersion, propagateTags, role, schedulingStrategy, serviceArn, serviceName, serviceRegistries, taskDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcsServiceDetails {\n");
    sb.append("    capacityProviderStrategy: ").append(toIndentedString(capacityProviderStrategy)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    deploymentConfiguration: ").append(toIndentedString(deploymentConfiguration)).append("\n");
    sb.append("    deploymentController: ").append(toIndentedString(deploymentController)).append("\n");
    sb.append("    desiredCount: ").append(toIndentedString(desiredCount)).append("\n");
    sb.append("    enableEcsManagedTags: ").append(toIndentedString(enableEcsManagedTags)).append("\n");
    sb.append("    enableExecuteCommand: ").append(toIndentedString(enableExecuteCommand)).append("\n");
    sb.append("    healthCheckGracePeriodSeconds: ").append(toIndentedString(healthCheckGracePeriodSeconds)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    loadBalancers: ").append(toIndentedString(loadBalancers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkConfiguration: ").append(toIndentedString(networkConfiguration)).append("\n");
    sb.append("    placementConstraints: ").append(toIndentedString(placementConstraints)).append("\n");
    sb.append("    placementStrategies: ").append(toIndentedString(placementStrategies)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
    sb.append("    propagateTags: ").append(toIndentedString(propagateTags)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    schedulingStrategy: ").append(toIndentedString(schedulingStrategy)).append("\n");
    sb.append("    serviceArn: ").append(toIndentedString(serviceArn)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceRegistries: ").append(toIndentedString(serviceRegistries)).append("\n");
    sb.append("    taskDefinition: ").append(toIndentedString(taskDefinition)).append("\n");
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
    openapiFields.add("CapacityProviderStrategy");
    openapiFields.add("Cluster");
    openapiFields.add("DeploymentConfiguration");
    openapiFields.add("DeploymentController");
    openapiFields.add("DesiredCount");
    openapiFields.add("EnableEcsManagedTags");
    openapiFields.add("EnableExecuteCommand");
    openapiFields.add("HealthCheckGracePeriodSeconds");
    openapiFields.add("LaunchType");
    openapiFields.add("LoadBalancers");
    openapiFields.add("Name");
    openapiFields.add("NetworkConfiguration");
    openapiFields.add("PlacementConstraints");
    openapiFields.add("PlacementStrategies");
    openapiFields.add("PlatformVersion");
    openapiFields.add("PropagateTags");
    openapiFields.add("Role");
    openapiFields.add("SchedulingStrategy");
    openapiFields.add("ServiceArn");
    openapiFields.add("ServiceName");
    openapiFields.add("ServiceRegistries");
    openapiFields.add("TaskDefinition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcsServiceDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcsServiceDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcsServiceDetails is not found in the empty JSON string", AwsEcsServiceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcsServiceDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcsServiceDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CapacityProviderStrategy`
      if (jsonObj.get("CapacityProviderStrategy") != null && !jsonObj.get("CapacityProviderStrategy").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CapacityProviderStrategy"));
      }
      // validate the optional field `Cluster`
      if (jsonObj.get("Cluster") != null && !jsonObj.get("Cluster").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Cluster"));
      }
      // validate the optional field `DeploymentConfiguration`
      if (jsonObj.get("DeploymentConfiguration") != null && !jsonObj.get("DeploymentConfiguration").isJsonNull()) {
        AwsEcsServiceDetailsDeploymentConfiguration.validateJsonElement(jsonObj.get("DeploymentConfiguration"));
      }
      // validate the optional field `DeploymentController`
      if (jsonObj.get("DeploymentController") != null && !jsonObj.get("DeploymentController").isJsonNull()) {
        AwsEcsServiceDetailsDeploymentController.validateJsonElement(jsonObj.get("DeploymentController"));
      }
      // validate the optional field `DesiredCount`
      if (jsonObj.get("DesiredCount") != null && !jsonObj.get("DesiredCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DesiredCount"));
      }
      // validate the optional field `EnableEcsManagedTags`
      if (jsonObj.get("EnableEcsManagedTags") != null && !jsonObj.get("EnableEcsManagedTags").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EnableEcsManagedTags"));
      }
      // validate the optional field `EnableExecuteCommand`
      if (jsonObj.get("EnableExecuteCommand") != null && !jsonObj.get("EnableExecuteCommand").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EnableExecuteCommand"));
      }
      // validate the optional field `HealthCheckGracePeriodSeconds`
      if (jsonObj.get("HealthCheckGracePeriodSeconds") != null && !jsonObj.get("HealthCheckGracePeriodSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HealthCheckGracePeriodSeconds"));
      }
      // validate the optional field `LaunchType`
      if (jsonObj.get("LaunchType") != null && !jsonObj.get("LaunchType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchType"));
      }
      // validate the optional field `LoadBalancers`
      if (jsonObj.get("LoadBalancers") != null && !jsonObj.get("LoadBalancers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("LoadBalancers"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `NetworkConfiguration`
      if (jsonObj.get("NetworkConfiguration") != null && !jsonObj.get("NetworkConfiguration").isJsonNull()) {
        AwsEcsServiceDetailsNetworkConfiguration.validateJsonElement(jsonObj.get("NetworkConfiguration"));
      }
      // validate the optional field `PlacementConstraints`
      if (jsonObj.get("PlacementConstraints") != null && !jsonObj.get("PlacementConstraints").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PlacementConstraints"));
      }
      // validate the optional field `PlacementStrategies`
      if (jsonObj.get("PlacementStrategies") != null && !jsonObj.get("PlacementStrategies").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PlacementStrategies"));
      }
      // validate the optional field `PlatformVersion`
      if (jsonObj.get("PlatformVersion") != null && !jsonObj.get("PlatformVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PlatformVersion"));
      }
      // validate the optional field `PropagateTags`
      if (jsonObj.get("PropagateTags") != null && !jsonObj.get("PropagateTags").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PropagateTags"));
      }
      // validate the optional field `Role`
      if (jsonObj.get("Role") != null && !jsonObj.get("Role").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Role"));
      }
      // validate the optional field `SchedulingStrategy`
      if (jsonObj.get("SchedulingStrategy") != null && !jsonObj.get("SchedulingStrategy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SchedulingStrategy"));
      }
      // validate the optional field `ServiceArn`
      if (jsonObj.get("ServiceArn") != null && !jsonObj.get("ServiceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceArn"));
      }
      // validate the optional field `ServiceName`
      if (jsonObj.get("ServiceName") != null && !jsonObj.get("ServiceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceName"));
      }
      // validate the optional field `ServiceRegistries`
      if (jsonObj.get("ServiceRegistries") != null && !jsonObj.get("ServiceRegistries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ServiceRegistries"));
      }
      // validate the optional field `TaskDefinition`
      if (jsonObj.get("TaskDefinition") != null && !jsonObj.get("TaskDefinition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TaskDefinition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcsServiceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcsServiceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcsServiceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcsServiceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcsServiceDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcsServiceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcsServiceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcsServiceDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcsServiceDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcsServiceDetails
   */
  public static AwsEcsServiceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcsServiceDetails.class);
  }

  /**
   * Convert an instance of AwsEcsServiceDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

