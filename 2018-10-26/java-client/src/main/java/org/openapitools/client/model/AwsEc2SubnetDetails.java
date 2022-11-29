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
 * Contains information about a subnet in Amazon EC2.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2SubnetDetails {
  public static final String SERIALIZED_NAME_ASSIGN_IPV6_ADDRESS_ON_CREATION = "AssignIpv6AddressOnCreation";
  @SerializedName(SERIALIZED_NAME_ASSIGN_IPV6_ADDRESS_ON_CREATION)
  private Boolean assignIpv6AddressOnCreation;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "AvailabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private String availabilityZone;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE_ID = "AvailabilityZoneId";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE_ID)
  private String availabilityZoneId;

  public static final String SERIALIZED_NAME_AVAILABLE_IP_ADDRESS_COUNT = "AvailableIpAddressCount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_IP_ADDRESS_COUNT)
  private Integer availableIpAddressCount;

  public static final String SERIALIZED_NAME_CIDR_BLOCK = "CidrBlock";
  @SerializedName(SERIALIZED_NAME_CIDR_BLOCK)
  private String cidrBlock;

  public static final String SERIALIZED_NAME_DEFAULT_FOR_AZ = "DefaultForAz";
  @SerializedName(SERIALIZED_NAME_DEFAULT_FOR_AZ)
  private Boolean defaultForAz;

  public static final String SERIALIZED_NAME_MAP_PUBLIC_IP_ON_LAUNCH = "MapPublicIpOnLaunch";
  @SerializedName(SERIALIZED_NAME_MAP_PUBLIC_IP_ON_LAUNCH)
  private Boolean mapPublicIpOnLaunch;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SUBNET_ARN = "SubnetArn";
  @SerializedName(SERIALIZED_NAME_SUBNET_ARN)
  private String subnetArn;

  public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";
  @SerializedName(SERIALIZED_NAME_SUBNET_ID)
  private String subnetId;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_IPV6_CIDR_BLOCK_ASSOCIATION_SET = "Ipv6CidrBlockAssociationSet";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDR_BLOCK_ASSOCIATION_SET)
  private List ipv6CidrBlockAssociationSet;

  public AwsEc2SubnetDetails() {
  }

  public AwsEc2SubnetDetails assignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
    this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    return this;
  }

  /**
   * Get assignIpv6AddressOnCreation
   * @return assignIpv6AddressOnCreation
   */
  @javax.annotation.Nullable
  public Boolean getAssignIpv6AddressOnCreation() {
    return assignIpv6AddressOnCreation;
  }

  public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
    this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
  }


  public AwsEc2SubnetDetails availabilityZone(String availabilityZone) {
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


  public AwsEc2SubnetDetails availabilityZoneId(String availabilityZoneId) {
    this.availabilityZoneId = availabilityZoneId;
    return this;
  }

  /**
   * Get availabilityZoneId
   * @return availabilityZoneId
   */
  @javax.annotation.Nullable
  public String getAvailabilityZoneId() {
    return availabilityZoneId;
  }

  public void setAvailabilityZoneId(String availabilityZoneId) {
    this.availabilityZoneId = availabilityZoneId;
  }


  public AwsEc2SubnetDetails availableIpAddressCount(Integer availableIpAddressCount) {
    this.availableIpAddressCount = availableIpAddressCount;
    return this;
  }

  /**
   * Get availableIpAddressCount
   * @return availableIpAddressCount
   */
  @javax.annotation.Nullable
  public Integer getAvailableIpAddressCount() {
    return availableIpAddressCount;
  }

  public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
    this.availableIpAddressCount = availableIpAddressCount;
  }


  public AwsEc2SubnetDetails cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

  /**
   * Get cidrBlock
   * @return cidrBlock
   */
  @javax.annotation.Nullable
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }


  public AwsEc2SubnetDetails defaultForAz(Boolean defaultForAz) {
    this.defaultForAz = defaultForAz;
    return this;
  }

  /**
   * Get defaultForAz
   * @return defaultForAz
   */
  @javax.annotation.Nullable
  public Boolean getDefaultForAz() {
    return defaultForAz;
  }

  public void setDefaultForAz(Boolean defaultForAz) {
    this.defaultForAz = defaultForAz;
  }


  public AwsEc2SubnetDetails mapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
    this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    return this;
  }

  /**
   * Get mapPublicIpOnLaunch
   * @return mapPublicIpOnLaunch
   */
  @javax.annotation.Nullable
  public Boolean getMapPublicIpOnLaunch() {
    return mapPublicIpOnLaunch;
  }

  public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
    this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
  }


  public AwsEc2SubnetDetails ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public AwsEc2SubnetDetails state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public AwsEc2SubnetDetails subnetArn(String subnetArn) {
    this.subnetArn = subnetArn;
    return this;
  }

  /**
   * Get subnetArn
   * @return subnetArn
   */
  @javax.annotation.Nullable
  public String getSubnetArn() {
    return subnetArn;
  }

  public void setSubnetArn(String subnetArn) {
    this.subnetArn = subnetArn;
  }


  public AwsEc2SubnetDetails subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  /**
   * Get subnetId
   * @return subnetId
   */
  @javax.annotation.Nullable
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  public AwsEc2SubnetDetails vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
   */
  @javax.annotation.Nullable
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  public AwsEc2SubnetDetails ipv6CidrBlockAssociationSet(List ipv6CidrBlockAssociationSet) {
    this.ipv6CidrBlockAssociationSet = ipv6CidrBlockAssociationSet;
    return this;
  }

  /**
   * Get ipv6CidrBlockAssociationSet
   * @return ipv6CidrBlockAssociationSet
   */
  @javax.annotation.Nullable
  public List getIpv6CidrBlockAssociationSet() {
    return ipv6CidrBlockAssociationSet;
  }

  public void setIpv6CidrBlockAssociationSet(List ipv6CidrBlockAssociationSet) {
    this.ipv6CidrBlockAssociationSet = ipv6CidrBlockAssociationSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2SubnetDetails awsEc2SubnetDetails = (AwsEc2SubnetDetails) o;
    return Objects.equals(this.assignIpv6AddressOnCreation, awsEc2SubnetDetails.assignIpv6AddressOnCreation) &&
        Objects.equals(this.availabilityZone, awsEc2SubnetDetails.availabilityZone) &&
        Objects.equals(this.availabilityZoneId, awsEc2SubnetDetails.availabilityZoneId) &&
        Objects.equals(this.availableIpAddressCount, awsEc2SubnetDetails.availableIpAddressCount) &&
        Objects.equals(this.cidrBlock, awsEc2SubnetDetails.cidrBlock) &&
        Objects.equals(this.defaultForAz, awsEc2SubnetDetails.defaultForAz) &&
        Objects.equals(this.mapPublicIpOnLaunch, awsEc2SubnetDetails.mapPublicIpOnLaunch) &&
        Objects.equals(this.ownerId, awsEc2SubnetDetails.ownerId) &&
        Objects.equals(this.state, awsEc2SubnetDetails.state) &&
        Objects.equals(this.subnetArn, awsEc2SubnetDetails.subnetArn) &&
        Objects.equals(this.subnetId, awsEc2SubnetDetails.subnetId) &&
        Objects.equals(this.vpcId, awsEc2SubnetDetails.vpcId) &&
        Objects.equals(this.ipv6CidrBlockAssociationSet, awsEc2SubnetDetails.ipv6CidrBlockAssociationSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignIpv6AddressOnCreation, availabilityZone, availabilityZoneId, availableIpAddressCount, cidrBlock, defaultForAz, mapPublicIpOnLaunch, ownerId, state, subnetArn, subnetId, vpcId, ipv6CidrBlockAssociationSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2SubnetDetails {\n");
    sb.append("    assignIpv6AddressOnCreation: ").append(toIndentedString(assignIpv6AddressOnCreation)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
    sb.append("    availableIpAddressCount: ").append(toIndentedString(availableIpAddressCount)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    defaultForAz: ").append(toIndentedString(defaultForAz)).append("\n");
    sb.append("    mapPublicIpOnLaunch: ").append(toIndentedString(mapPublicIpOnLaunch)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subnetArn: ").append(toIndentedString(subnetArn)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    ipv6CidrBlockAssociationSet: ").append(toIndentedString(ipv6CidrBlockAssociationSet)).append("\n");
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
    openapiFields.add("AssignIpv6AddressOnCreation");
    openapiFields.add("AvailabilityZone");
    openapiFields.add("AvailabilityZoneId");
    openapiFields.add("AvailableIpAddressCount");
    openapiFields.add("CidrBlock");
    openapiFields.add("DefaultForAz");
    openapiFields.add("MapPublicIpOnLaunch");
    openapiFields.add("OwnerId");
    openapiFields.add("State");
    openapiFields.add("SubnetArn");
    openapiFields.add("SubnetId");
    openapiFields.add("VpcId");
    openapiFields.add("Ipv6CidrBlockAssociationSet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2SubnetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2SubnetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2SubnetDetails is not found in the empty JSON string", AwsEc2SubnetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2SubnetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2SubnetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AssignIpv6AddressOnCreation`
      if (jsonObj.get("AssignIpv6AddressOnCreation") != null && !jsonObj.get("AssignIpv6AddressOnCreation").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AssignIpv6AddressOnCreation"));
      }
      // validate the optional field `AvailabilityZone`
      if (jsonObj.get("AvailabilityZone") != null && !jsonObj.get("AvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AvailabilityZone"));
      }
      // validate the optional field `AvailabilityZoneId`
      if (jsonObj.get("AvailabilityZoneId") != null && !jsonObj.get("AvailabilityZoneId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AvailabilityZoneId"));
      }
      // validate the optional field `AvailableIpAddressCount`
      if (jsonObj.get("AvailableIpAddressCount") != null && !jsonObj.get("AvailableIpAddressCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("AvailableIpAddressCount"));
      }
      // validate the optional field `CidrBlock`
      if (jsonObj.get("CidrBlock") != null && !jsonObj.get("CidrBlock").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CidrBlock"));
      }
      // validate the optional field `DefaultForAz`
      if (jsonObj.get("DefaultForAz") != null && !jsonObj.get("DefaultForAz").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DefaultForAz"));
      }
      // validate the optional field `MapPublicIpOnLaunch`
      if (jsonObj.get("MapPublicIpOnLaunch") != null && !jsonObj.get("MapPublicIpOnLaunch").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("MapPublicIpOnLaunch"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("State"));
      }
      // validate the optional field `SubnetArn`
      if (jsonObj.get("SubnetArn") != null && !jsonObj.get("SubnetArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetArn"));
      }
      // validate the optional field `SubnetId`
      if (jsonObj.get("SubnetId") != null && !jsonObj.get("SubnetId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetId"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `Ipv6CidrBlockAssociationSet`
      if (jsonObj.get("Ipv6CidrBlockAssociationSet") != null && !jsonObj.get("Ipv6CidrBlockAssociationSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Ipv6CidrBlockAssociationSet"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2SubnetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2SubnetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2SubnetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2SubnetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2SubnetDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2SubnetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2SubnetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2SubnetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2SubnetDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2SubnetDetails
   */
  public static AwsEc2SubnetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2SubnetDetails.class);
  }

  /**
   * Convert an instance of AwsEc2SubnetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

