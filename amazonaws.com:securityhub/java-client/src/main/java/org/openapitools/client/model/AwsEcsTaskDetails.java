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
 * Provides details about a task in a cluster. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcsTaskDetails {
  public static final String SERIALIZED_NAME_CLUSTER_ARN = "ClusterArn";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ARN)
  private String clusterArn;

  public static final String SERIALIZED_NAME_TASK_DEFINITION_ARN = "TaskDefinitionArn";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_ARN)
  private String taskDefinitionArn;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_STARTED_AT = "StartedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STARTED_BY = "StartedBy";
  @SerializedName(SERIALIZED_NAME_STARTED_BY)
  private String startedBy;

  public static final String SERIALIZED_NAME_GROUP = "Group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_VOLUMES = "Volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List volumes;

  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List containers;

  public AwsEcsTaskDetails() {
  }

  public AwsEcsTaskDetails clusterArn(String clusterArn) {
    this.clusterArn = clusterArn;
    return this;
  }

  /**
   * Get clusterArn
   * @return clusterArn
   */
  @javax.annotation.Nullable
  public String getClusterArn() {
    return clusterArn;
  }

  public void setClusterArn(String clusterArn) {
    this.clusterArn = clusterArn;
  }


  public AwsEcsTaskDetails taskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
    return this;
  }

  /**
   * Get taskDefinitionArn
   * @return taskDefinitionArn
   */
  @javax.annotation.Nullable
  public String getTaskDefinitionArn() {
    return taskDefinitionArn;
  }

  public void setTaskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
  }


  public AwsEcsTaskDetails version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public AwsEcsTaskDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public AwsEcsTaskDetails startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
   */
  @javax.annotation.Nullable
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public AwsEcsTaskDetails startedBy(String startedBy) {
    this.startedBy = startedBy;
    return this;
  }

  /**
   * Get startedBy
   * @return startedBy
   */
  @javax.annotation.Nullable
  public String getStartedBy() {
    return startedBy;
  }

  public void setStartedBy(String startedBy) {
    this.startedBy = startedBy;
  }


  public AwsEcsTaskDetails group(String group) {
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


  public AwsEcsTaskDetails volumes(List volumes) {
    this.volumes = volumes;
    return this;
  }

  /**
   * Get volumes
   * @return volumes
   */
  @javax.annotation.Nullable
  public List getVolumes() {
    return volumes;
  }

  public void setVolumes(List volumes) {
    this.volumes = volumes;
  }


  public AwsEcsTaskDetails containers(List containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @javax.annotation.Nullable
  public List getContainers() {
    return containers;
  }

  public void setContainers(List containers) {
    this.containers = containers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsTaskDetails awsEcsTaskDetails = (AwsEcsTaskDetails) o;
    return Objects.equals(this.clusterArn, awsEcsTaskDetails.clusterArn) &&
        Objects.equals(this.taskDefinitionArn, awsEcsTaskDetails.taskDefinitionArn) &&
        Objects.equals(this.version, awsEcsTaskDetails.version) &&
        Objects.equals(this.createdAt, awsEcsTaskDetails.createdAt) &&
        Objects.equals(this.startedAt, awsEcsTaskDetails.startedAt) &&
        Objects.equals(this.startedBy, awsEcsTaskDetails.startedBy) &&
        Objects.equals(this.group, awsEcsTaskDetails.group) &&
        Objects.equals(this.volumes, awsEcsTaskDetails.volumes) &&
        Objects.equals(this.containers, awsEcsTaskDetails.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterArn, taskDefinitionArn, version, createdAt, startedAt, startedBy, group, volumes, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcsTaskDetails {\n");
    sb.append("    clusterArn: ").append(toIndentedString(clusterArn)).append("\n");
    sb.append("    taskDefinitionArn: ").append(toIndentedString(taskDefinitionArn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
    openapiFields.add("ClusterArn");
    openapiFields.add("TaskDefinitionArn");
    openapiFields.add("Version");
    openapiFields.add("CreatedAt");
    openapiFields.add("StartedAt");
    openapiFields.add("StartedBy");
    openapiFields.add("Group");
    openapiFields.add("Volumes");
    openapiFields.add("Containers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcsTaskDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcsTaskDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcsTaskDetails is not found in the empty JSON string", AwsEcsTaskDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcsTaskDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcsTaskDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ClusterArn`
      if (jsonObj.get("ClusterArn") != null && !jsonObj.get("ClusterArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ClusterArn"));
      }
      // validate the optional field `TaskDefinitionArn`
      if (jsonObj.get("TaskDefinitionArn") != null && !jsonObj.get("TaskDefinitionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TaskDefinitionArn"));
      }
      // validate the optional field `Version`
      if (jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Version"));
      }
      // validate the optional field `CreatedAt`
      if (jsonObj.get("CreatedAt") != null && !jsonObj.get("CreatedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedAt"));
      }
      // validate the optional field `StartedAt`
      if (jsonObj.get("StartedAt") != null && !jsonObj.get("StartedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StartedAt"));
      }
      // validate the optional field `StartedBy`
      if (jsonObj.get("StartedBy") != null && !jsonObj.get("StartedBy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StartedBy"));
      }
      // validate the optional field `Group`
      if (jsonObj.get("Group") != null && !jsonObj.get("Group").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Group"));
      }
      // validate the optional field `Volumes`
      if (jsonObj.get("Volumes") != null && !jsonObj.get("Volumes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Volumes"));
      }
      // validate the optional field `Containers`
      if (jsonObj.get("Containers") != null && !jsonObj.get("Containers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Containers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcsTaskDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcsTaskDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcsTaskDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcsTaskDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcsTaskDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcsTaskDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcsTaskDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcsTaskDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcsTaskDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcsTaskDetails
   */
  public static AwsEcsTaskDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcsTaskDetails.class);
  }

  /**
   * Convert an instance of AwsEcsTaskDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

