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
 * Information about the subnet group for the database instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsRdsDbSubnetGroup {
  public static final String SERIALIZED_NAME_DB_SUBNET_GROUP_NAME = "DbSubnetGroupName";
  @SerializedName(SERIALIZED_NAME_DB_SUBNET_GROUP_NAME)
  private String dbSubnetGroupName;

  public static final String SERIALIZED_NAME_DB_SUBNET_GROUP_DESCRIPTION = "DbSubnetGroupDescription";
  @SerializedName(SERIALIZED_NAME_DB_SUBNET_GROUP_DESCRIPTION)
  private String dbSubnetGroupDescription;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_SUBNET_GROUP_STATUS = "SubnetGroupStatus";
  @SerializedName(SERIALIZED_NAME_SUBNET_GROUP_STATUS)
  private String subnetGroupStatus;

  public static final String SERIALIZED_NAME_SUBNETS = "Subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List subnets;

  public static final String SERIALIZED_NAME_DB_SUBNET_GROUP_ARN = "DbSubnetGroupArn";
  @SerializedName(SERIALIZED_NAME_DB_SUBNET_GROUP_ARN)
  private String dbSubnetGroupArn;

  public AwsRdsDbSubnetGroup() {
  }

  public AwsRdsDbSubnetGroup dbSubnetGroupName(String dbSubnetGroupName) {
    this.dbSubnetGroupName = dbSubnetGroupName;
    return this;
  }

  /**
   * Get dbSubnetGroupName
   * @return dbSubnetGroupName
   */
  @javax.annotation.Nullable
  public String getDbSubnetGroupName() {
    return dbSubnetGroupName;
  }

  public void setDbSubnetGroupName(String dbSubnetGroupName) {
    this.dbSubnetGroupName = dbSubnetGroupName;
  }


  public AwsRdsDbSubnetGroup dbSubnetGroupDescription(String dbSubnetGroupDescription) {
    this.dbSubnetGroupDescription = dbSubnetGroupDescription;
    return this;
  }

  /**
   * Get dbSubnetGroupDescription
   * @return dbSubnetGroupDescription
   */
  @javax.annotation.Nullable
  public String getDbSubnetGroupDescription() {
    return dbSubnetGroupDescription;
  }

  public void setDbSubnetGroupDescription(String dbSubnetGroupDescription) {
    this.dbSubnetGroupDescription = dbSubnetGroupDescription;
  }


  public AwsRdsDbSubnetGroup vpcId(String vpcId) {
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


  public AwsRdsDbSubnetGroup subnetGroupStatus(String subnetGroupStatus) {
    this.subnetGroupStatus = subnetGroupStatus;
    return this;
  }

  /**
   * Get subnetGroupStatus
   * @return subnetGroupStatus
   */
  @javax.annotation.Nullable
  public String getSubnetGroupStatus() {
    return subnetGroupStatus;
  }

  public void setSubnetGroupStatus(String subnetGroupStatus) {
    this.subnetGroupStatus = subnetGroupStatus;
  }


  public AwsRdsDbSubnetGroup subnets(List subnets) {
    this.subnets = subnets;
    return this;
  }

  /**
   * Get subnets
   * @return subnets
   */
  @javax.annotation.Nullable
  public List getSubnets() {
    return subnets;
  }

  public void setSubnets(List subnets) {
    this.subnets = subnets;
  }


  public AwsRdsDbSubnetGroup dbSubnetGroupArn(String dbSubnetGroupArn) {
    this.dbSubnetGroupArn = dbSubnetGroupArn;
    return this;
  }

  /**
   * Get dbSubnetGroupArn
   * @return dbSubnetGroupArn
   */
  @javax.annotation.Nullable
  public String getDbSubnetGroupArn() {
    return dbSubnetGroupArn;
  }

  public void setDbSubnetGroupArn(String dbSubnetGroupArn) {
    this.dbSubnetGroupArn = dbSubnetGroupArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsRdsDbSubnetGroup awsRdsDbSubnetGroup = (AwsRdsDbSubnetGroup) o;
    return Objects.equals(this.dbSubnetGroupName, awsRdsDbSubnetGroup.dbSubnetGroupName) &&
        Objects.equals(this.dbSubnetGroupDescription, awsRdsDbSubnetGroup.dbSubnetGroupDescription) &&
        Objects.equals(this.vpcId, awsRdsDbSubnetGroup.vpcId) &&
        Objects.equals(this.subnetGroupStatus, awsRdsDbSubnetGroup.subnetGroupStatus) &&
        Objects.equals(this.subnets, awsRdsDbSubnetGroup.subnets) &&
        Objects.equals(this.dbSubnetGroupArn, awsRdsDbSubnetGroup.dbSubnetGroupArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbSubnetGroupName, dbSubnetGroupDescription, vpcId, subnetGroupStatus, subnets, dbSubnetGroupArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsRdsDbSubnetGroup {\n");
    sb.append("    dbSubnetGroupName: ").append(toIndentedString(dbSubnetGroupName)).append("\n");
    sb.append("    dbSubnetGroupDescription: ").append(toIndentedString(dbSubnetGroupDescription)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    subnetGroupStatus: ").append(toIndentedString(subnetGroupStatus)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    dbSubnetGroupArn: ").append(toIndentedString(dbSubnetGroupArn)).append("\n");
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
    openapiFields.add("DbSubnetGroupName");
    openapiFields.add("DbSubnetGroupDescription");
    openapiFields.add("VpcId");
    openapiFields.add("SubnetGroupStatus");
    openapiFields.add("Subnets");
    openapiFields.add("DbSubnetGroupArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsRdsDbSubnetGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsRdsDbSubnetGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsRdsDbSubnetGroup is not found in the empty JSON string", AwsRdsDbSubnetGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsRdsDbSubnetGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsRdsDbSubnetGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DbSubnetGroupName`
      if (jsonObj.get("DbSubnetGroupName") != null && !jsonObj.get("DbSubnetGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSubnetGroupName"));
      }
      // validate the optional field `DbSubnetGroupDescription`
      if (jsonObj.get("DbSubnetGroupDescription") != null && !jsonObj.get("DbSubnetGroupDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSubnetGroupDescription"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `SubnetGroupStatus`
      if (jsonObj.get("SubnetGroupStatus") != null && !jsonObj.get("SubnetGroupStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetGroupStatus"));
      }
      // validate the optional field `Subnets`
      if (jsonObj.get("Subnets") != null && !jsonObj.get("Subnets").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Subnets"));
      }
      // validate the optional field `DbSubnetGroupArn`
      if (jsonObj.get("DbSubnetGroupArn") != null && !jsonObj.get("DbSubnetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSubnetGroupArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsRdsDbSubnetGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsRdsDbSubnetGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsRdsDbSubnetGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsRdsDbSubnetGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsRdsDbSubnetGroup>() {
           @Override
           public void write(JsonWriter out, AwsRdsDbSubnetGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsRdsDbSubnetGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsRdsDbSubnetGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsRdsDbSubnetGroup
   * @throws IOException if the JSON string is invalid with respect to AwsRdsDbSubnetGroup
   */
  public static AwsRdsDbSubnetGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsRdsDbSubnetGroup.class);
  }

  /**
   * Convert an instance of AwsRdsDbSubnetGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

