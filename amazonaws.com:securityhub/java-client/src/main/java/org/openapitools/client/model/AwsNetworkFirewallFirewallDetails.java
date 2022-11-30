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
 * Details about an Network Firewall firewall.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsNetworkFirewallFirewallDetails {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "DeleteProtection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private Boolean deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FIREWALL_ARN = "FirewallArn";
  @SerializedName(SERIALIZED_NAME_FIREWALL_ARN)
  private String firewallArn;

  public static final String SERIALIZED_NAME_FIREWALL_ID = "FirewallId";
  @SerializedName(SERIALIZED_NAME_FIREWALL_ID)
  private String firewallId;

  public static final String SERIALIZED_NAME_FIREWALL_NAME = "FirewallName";
  @SerializedName(SERIALIZED_NAME_FIREWALL_NAME)
  private String firewallName;

  public static final String SERIALIZED_NAME_FIREWALL_POLICY_ARN = "FirewallPolicyArn";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY_ARN)
  private String firewallPolicyArn;

  public static final String SERIALIZED_NAME_FIREWALL_POLICY_CHANGE_PROTECTION = "FirewallPolicyChangeProtection";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY_CHANGE_PROTECTION)
  private Boolean firewallPolicyChangeProtection;

  public static final String SERIALIZED_NAME_SUBNET_CHANGE_PROTECTION = "SubnetChangeProtection";
  @SerializedName(SERIALIZED_NAME_SUBNET_CHANGE_PROTECTION)
  private Boolean subnetChangeProtection;

  public static final String SERIALIZED_NAME_SUBNET_MAPPINGS = "SubnetMappings";
  @SerializedName(SERIALIZED_NAME_SUBNET_MAPPINGS)
  private List subnetMappings;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public AwsNetworkFirewallFirewallDetails() {
  }

  public AwsNetworkFirewallFirewallDetails deleteProtection(Boolean deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Get deleteProtection
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public Boolean getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(Boolean deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public AwsNetworkFirewallFirewallDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AwsNetworkFirewallFirewallDetails firewallArn(String firewallArn) {
    this.firewallArn = firewallArn;
    return this;
  }

  /**
   * Get firewallArn
   * @return firewallArn
   */
  @javax.annotation.Nullable
  public String getFirewallArn() {
    return firewallArn;
  }

  public void setFirewallArn(String firewallArn) {
    this.firewallArn = firewallArn;
  }


  public AwsNetworkFirewallFirewallDetails firewallId(String firewallId) {
    this.firewallId = firewallId;
    return this;
  }

  /**
   * Get firewallId
   * @return firewallId
   */
  @javax.annotation.Nullable
  public String getFirewallId() {
    return firewallId;
  }

  public void setFirewallId(String firewallId) {
    this.firewallId = firewallId;
  }


  public AwsNetworkFirewallFirewallDetails firewallName(String firewallName) {
    this.firewallName = firewallName;
    return this;
  }

  /**
   * Get firewallName
   * @return firewallName
   */
  @javax.annotation.Nullable
  public String getFirewallName() {
    return firewallName;
  }

  public void setFirewallName(String firewallName) {
    this.firewallName = firewallName;
  }


  public AwsNetworkFirewallFirewallDetails firewallPolicyArn(String firewallPolicyArn) {
    this.firewallPolicyArn = firewallPolicyArn;
    return this;
  }

  /**
   * Get firewallPolicyArn
   * @return firewallPolicyArn
   */
  @javax.annotation.Nullable
  public String getFirewallPolicyArn() {
    return firewallPolicyArn;
  }

  public void setFirewallPolicyArn(String firewallPolicyArn) {
    this.firewallPolicyArn = firewallPolicyArn;
  }


  public AwsNetworkFirewallFirewallDetails firewallPolicyChangeProtection(Boolean firewallPolicyChangeProtection) {
    this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
    return this;
  }

  /**
   * Get firewallPolicyChangeProtection
   * @return firewallPolicyChangeProtection
   */
  @javax.annotation.Nullable
  public Boolean getFirewallPolicyChangeProtection() {
    return firewallPolicyChangeProtection;
  }

  public void setFirewallPolicyChangeProtection(Boolean firewallPolicyChangeProtection) {
    this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
  }


  public AwsNetworkFirewallFirewallDetails subnetChangeProtection(Boolean subnetChangeProtection) {
    this.subnetChangeProtection = subnetChangeProtection;
    return this;
  }

  /**
   * Get subnetChangeProtection
   * @return subnetChangeProtection
   */
  @javax.annotation.Nullable
  public Boolean getSubnetChangeProtection() {
    return subnetChangeProtection;
  }

  public void setSubnetChangeProtection(Boolean subnetChangeProtection) {
    this.subnetChangeProtection = subnetChangeProtection;
  }


  public AwsNetworkFirewallFirewallDetails subnetMappings(List subnetMappings) {
    this.subnetMappings = subnetMappings;
    return this;
  }

  /**
   * Get subnetMappings
   * @return subnetMappings
   */
  @javax.annotation.Nullable
  public List getSubnetMappings() {
    return subnetMappings;
  }

  public void setSubnetMappings(List subnetMappings) {
    this.subnetMappings = subnetMappings;
  }


  public AwsNetworkFirewallFirewallDetails vpcId(String vpcId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsNetworkFirewallFirewallDetails awsNetworkFirewallFirewallDetails = (AwsNetworkFirewallFirewallDetails) o;
    return Objects.equals(this.deleteProtection, awsNetworkFirewallFirewallDetails.deleteProtection) &&
        Objects.equals(this.description, awsNetworkFirewallFirewallDetails.description) &&
        Objects.equals(this.firewallArn, awsNetworkFirewallFirewallDetails.firewallArn) &&
        Objects.equals(this.firewallId, awsNetworkFirewallFirewallDetails.firewallId) &&
        Objects.equals(this.firewallName, awsNetworkFirewallFirewallDetails.firewallName) &&
        Objects.equals(this.firewallPolicyArn, awsNetworkFirewallFirewallDetails.firewallPolicyArn) &&
        Objects.equals(this.firewallPolicyChangeProtection, awsNetworkFirewallFirewallDetails.firewallPolicyChangeProtection) &&
        Objects.equals(this.subnetChangeProtection, awsNetworkFirewallFirewallDetails.subnetChangeProtection) &&
        Objects.equals(this.subnetMappings, awsNetworkFirewallFirewallDetails.subnetMappings) &&
        Objects.equals(this.vpcId, awsNetworkFirewallFirewallDetails.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, firewallArn, firewallId, firewallName, firewallPolicyArn, firewallPolicyChangeProtection, subnetChangeProtection, subnetMappings, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsNetworkFirewallFirewallDetails {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firewallArn: ").append(toIndentedString(firewallArn)).append("\n");
    sb.append("    firewallId: ").append(toIndentedString(firewallId)).append("\n");
    sb.append("    firewallName: ").append(toIndentedString(firewallName)).append("\n");
    sb.append("    firewallPolicyArn: ").append(toIndentedString(firewallPolicyArn)).append("\n");
    sb.append("    firewallPolicyChangeProtection: ").append(toIndentedString(firewallPolicyChangeProtection)).append("\n");
    sb.append("    subnetChangeProtection: ").append(toIndentedString(subnetChangeProtection)).append("\n");
    sb.append("    subnetMappings: ").append(toIndentedString(subnetMappings)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
    openapiFields.add("DeleteProtection");
    openapiFields.add("Description");
    openapiFields.add("FirewallArn");
    openapiFields.add("FirewallId");
    openapiFields.add("FirewallName");
    openapiFields.add("FirewallPolicyArn");
    openapiFields.add("FirewallPolicyChangeProtection");
    openapiFields.add("SubnetChangeProtection");
    openapiFields.add("SubnetMappings");
    openapiFields.add("VpcId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsNetworkFirewallFirewallDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsNetworkFirewallFirewallDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsNetworkFirewallFirewallDetails is not found in the empty JSON string", AwsNetworkFirewallFirewallDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsNetworkFirewallFirewallDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsNetworkFirewallFirewallDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DeleteProtection`
      if (jsonObj.get("DeleteProtection") != null && !jsonObj.get("DeleteProtection").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DeleteProtection"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `FirewallArn`
      if (jsonObj.get("FirewallArn") != null && !jsonObj.get("FirewallArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallArn"));
      }
      // validate the optional field `FirewallId`
      if (jsonObj.get("FirewallId") != null && !jsonObj.get("FirewallId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallId"));
      }
      // validate the optional field `FirewallName`
      if (jsonObj.get("FirewallName") != null && !jsonObj.get("FirewallName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallName"));
      }
      // validate the optional field `FirewallPolicyArn`
      if (jsonObj.get("FirewallPolicyArn") != null && !jsonObj.get("FirewallPolicyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallPolicyArn"));
      }
      // validate the optional field `FirewallPolicyChangeProtection`
      if (jsonObj.get("FirewallPolicyChangeProtection") != null && !jsonObj.get("FirewallPolicyChangeProtection").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("FirewallPolicyChangeProtection"));
      }
      // validate the optional field `SubnetChangeProtection`
      if (jsonObj.get("SubnetChangeProtection") != null && !jsonObj.get("SubnetChangeProtection").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("SubnetChangeProtection"));
      }
      // validate the optional field `SubnetMappings`
      if (jsonObj.get("SubnetMappings") != null && !jsonObj.get("SubnetMappings").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SubnetMappings"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsNetworkFirewallFirewallDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsNetworkFirewallFirewallDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsNetworkFirewallFirewallDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsNetworkFirewallFirewallDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsNetworkFirewallFirewallDetails>() {
           @Override
           public void write(JsonWriter out, AwsNetworkFirewallFirewallDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsNetworkFirewallFirewallDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsNetworkFirewallFirewallDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsNetworkFirewallFirewallDetails
   * @throws IOException if the JSON string is invalid with respect to AwsNetworkFirewallFirewallDetails
   */
  public static AwsNetworkFirewallFirewallDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsNetworkFirewallFirewallDetails.class);
  }

  /**
   * Convert an instance of AwsNetworkFirewallFirewallDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

