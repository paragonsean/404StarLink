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
 *  Provides details about the placement of an Amazon EC2 instance. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2LaunchTemplateDataPlacementDetails {
  public static final String SERIALIZED_NAME_AFFINITY = "Affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private String affinity;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "AvailabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private String availabilityZone;

  public static final String SERIALIZED_NAME_GROUP_NAME = "GroupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_HOST_ID = "HostId";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public static final String SERIALIZED_NAME_HOST_RESOURCE_GROUP_ARN = "HostResourceGroupArn";
  @SerializedName(SERIALIZED_NAME_HOST_RESOURCE_GROUP_ARN)
  private String hostResourceGroupArn;

  public static final String SERIALIZED_NAME_PARTITION_NUMBER = "PartitionNumber";
  @SerializedName(SERIALIZED_NAME_PARTITION_NUMBER)
  private Integer partitionNumber;

  public static final String SERIALIZED_NAME_SPREAD_DOMAIN = "SpreadDomain";
  @SerializedName(SERIALIZED_NAME_SPREAD_DOMAIN)
  private String spreadDomain;

  public static final String SERIALIZED_NAME_TENANCY = "Tenancy";
  @SerializedName(SERIALIZED_NAME_TENANCY)
  private String tenancy;

  public AwsEc2LaunchTemplateDataPlacementDetails() {
  }

  public AwsEc2LaunchTemplateDataPlacementDetails affinity(String affinity) {
    this.affinity = affinity;
    return this;
  }

  /**
   * Get affinity
   * @return affinity
   */
  @javax.annotation.Nullable
  public String getAffinity() {
    return affinity;
  }

  public void setAffinity(String affinity) {
    this.affinity = affinity;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * Get availabilityZone
   * @return availabilityZone
   */
  @javax.annotation.Nullable
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
   */
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * Get hostId
   * @return hostId
   */
  @javax.annotation.Nullable
  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails hostResourceGroupArn(String hostResourceGroupArn) {
    this.hostResourceGroupArn = hostResourceGroupArn;
    return this;
  }

  /**
   * Get hostResourceGroupArn
   * @return hostResourceGroupArn
   */
  @javax.annotation.Nullable
  public String getHostResourceGroupArn() {
    return hostResourceGroupArn;
  }

  public void setHostResourceGroupArn(String hostResourceGroupArn) {
    this.hostResourceGroupArn = hostResourceGroupArn;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails partitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
    return this;
  }

  /**
   * Get partitionNumber
   * @return partitionNumber
   */
  @javax.annotation.Nullable
  public Integer getPartitionNumber() {
    return partitionNumber;
  }

  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails spreadDomain(String spreadDomain) {
    this.spreadDomain = spreadDomain;
    return this;
  }

  /**
   * Get spreadDomain
   * @return spreadDomain
   */
  @javax.annotation.Nullable
  public String getSpreadDomain() {
    return spreadDomain;
  }

  public void setSpreadDomain(String spreadDomain) {
    this.spreadDomain = spreadDomain;
  }


  public AwsEc2LaunchTemplateDataPlacementDetails tenancy(String tenancy) {
    this.tenancy = tenancy;
    return this;
  }

  /**
   * Get tenancy
   * @return tenancy
   */
  @javax.annotation.Nullable
  public String getTenancy() {
    return tenancy;
  }

  public void setTenancy(String tenancy) {
    this.tenancy = tenancy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2LaunchTemplateDataPlacementDetails awsEc2LaunchTemplateDataPlacementDetails = (AwsEc2LaunchTemplateDataPlacementDetails) o;
    return Objects.equals(this.affinity, awsEc2LaunchTemplateDataPlacementDetails.affinity) &&
        Objects.equals(this.availabilityZone, awsEc2LaunchTemplateDataPlacementDetails.availabilityZone) &&
        Objects.equals(this.groupName, awsEc2LaunchTemplateDataPlacementDetails.groupName) &&
        Objects.equals(this.hostId, awsEc2LaunchTemplateDataPlacementDetails.hostId) &&
        Objects.equals(this.hostResourceGroupArn, awsEc2LaunchTemplateDataPlacementDetails.hostResourceGroupArn) &&
        Objects.equals(this.partitionNumber, awsEc2LaunchTemplateDataPlacementDetails.partitionNumber) &&
        Objects.equals(this.spreadDomain, awsEc2LaunchTemplateDataPlacementDetails.spreadDomain) &&
        Objects.equals(this.tenancy, awsEc2LaunchTemplateDataPlacementDetails.tenancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, availabilityZone, groupName, hostId, hostResourceGroupArn, partitionNumber, spreadDomain, tenancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2LaunchTemplateDataPlacementDetails {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    hostResourceGroupArn: ").append(toIndentedString(hostResourceGroupArn)).append("\n");
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    spreadDomain: ").append(toIndentedString(spreadDomain)).append("\n");
    sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
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
    openapiFields.add("Affinity");
    openapiFields.add("AvailabilityZone");
    openapiFields.add("GroupName");
    openapiFields.add("HostId");
    openapiFields.add("HostResourceGroupArn");
    openapiFields.add("PartitionNumber");
    openapiFields.add("SpreadDomain");
    openapiFields.add("Tenancy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2LaunchTemplateDataPlacementDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2LaunchTemplateDataPlacementDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2LaunchTemplateDataPlacementDetails is not found in the empty JSON string", AwsEc2LaunchTemplateDataPlacementDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2LaunchTemplateDataPlacementDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2LaunchTemplateDataPlacementDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Affinity`
      if (jsonObj.get("Affinity") != null && !jsonObj.get("Affinity").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Affinity"));
      }
      // validate the optional field `AvailabilityZone`
      if (jsonObj.get("AvailabilityZone") != null && !jsonObj.get("AvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AvailabilityZone"));
      }
      // validate the optional field `GroupName`
      if (jsonObj.get("GroupName") != null && !jsonObj.get("GroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("GroupName"));
      }
      // validate the optional field `HostId`
      if (jsonObj.get("HostId") != null && !jsonObj.get("HostId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HostId"));
      }
      // validate the optional field `HostResourceGroupArn`
      if (jsonObj.get("HostResourceGroupArn") != null && !jsonObj.get("HostResourceGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HostResourceGroupArn"));
      }
      // validate the optional field `PartitionNumber`
      if (jsonObj.get("PartitionNumber") != null && !jsonObj.get("PartitionNumber").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("PartitionNumber"));
      }
      // validate the optional field `SpreadDomain`
      if (jsonObj.get("SpreadDomain") != null && !jsonObj.get("SpreadDomain").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SpreadDomain"));
      }
      // validate the optional field `Tenancy`
      if (jsonObj.get("Tenancy") != null && !jsonObj.get("Tenancy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Tenancy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2LaunchTemplateDataPlacementDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2LaunchTemplateDataPlacementDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2LaunchTemplateDataPlacementDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2LaunchTemplateDataPlacementDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2LaunchTemplateDataPlacementDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2LaunchTemplateDataPlacementDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2LaunchTemplateDataPlacementDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2LaunchTemplateDataPlacementDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2LaunchTemplateDataPlacementDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2LaunchTemplateDataPlacementDetails
   */
  public static AwsEc2LaunchTemplateDataPlacementDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2LaunchTemplateDataPlacementDetails.class);
  }

  /**
   * Convert an instance of AwsEc2LaunchTemplateDataPlacementDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

