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
 * Provides information about an Amazon RDS DB security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsRdsDbSecurityGroupDetails {
  public static final String SERIALIZED_NAME_DB_SECURITY_GROUP_ARN = "DbSecurityGroupArn";
  @SerializedName(SERIALIZED_NAME_DB_SECURITY_GROUP_ARN)
  private String dbSecurityGroupArn;

  public static final String SERIALIZED_NAME_DB_SECURITY_GROUP_DESCRIPTION = "DbSecurityGroupDescription";
  @SerializedName(SERIALIZED_NAME_DB_SECURITY_GROUP_DESCRIPTION)
  private String dbSecurityGroupDescription;

  public static final String SERIALIZED_NAME_DB_SECURITY_GROUP_NAME = "DbSecurityGroupName";
  @SerializedName(SERIALIZED_NAME_DB_SECURITY_GROUP_NAME)
  private String dbSecurityGroupName;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUPS = "Ec2SecurityGroups";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUPS)
  private List ec2SecurityGroups;

  public static final String SERIALIZED_NAME_IP_RANGES = "IpRanges";
  @SerializedName(SERIALIZED_NAME_IP_RANGES)
  private List ipRanges;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public AwsRdsDbSecurityGroupDetails() {
  }

  public AwsRdsDbSecurityGroupDetails dbSecurityGroupArn(String dbSecurityGroupArn) {
    this.dbSecurityGroupArn = dbSecurityGroupArn;
    return this;
  }

  /**
   * Get dbSecurityGroupArn
   * @return dbSecurityGroupArn
   */
  @javax.annotation.Nullable
  public String getDbSecurityGroupArn() {
    return dbSecurityGroupArn;
  }

  public void setDbSecurityGroupArn(String dbSecurityGroupArn) {
    this.dbSecurityGroupArn = dbSecurityGroupArn;
  }


  public AwsRdsDbSecurityGroupDetails dbSecurityGroupDescription(String dbSecurityGroupDescription) {
    this.dbSecurityGroupDescription = dbSecurityGroupDescription;
    return this;
  }

  /**
   * Get dbSecurityGroupDescription
   * @return dbSecurityGroupDescription
   */
  @javax.annotation.Nullable
  public String getDbSecurityGroupDescription() {
    return dbSecurityGroupDescription;
  }

  public void setDbSecurityGroupDescription(String dbSecurityGroupDescription) {
    this.dbSecurityGroupDescription = dbSecurityGroupDescription;
  }


  public AwsRdsDbSecurityGroupDetails dbSecurityGroupName(String dbSecurityGroupName) {
    this.dbSecurityGroupName = dbSecurityGroupName;
    return this;
  }

  /**
   * Get dbSecurityGroupName
   * @return dbSecurityGroupName
   */
  @javax.annotation.Nullable
  public String getDbSecurityGroupName() {
    return dbSecurityGroupName;
  }

  public void setDbSecurityGroupName(String dbSecurityGroupName) {
    this.dbSecurityGroupName = dbSecurityGroupName;
  }


  public AwsRdsDbSecurityGroupDetails ec2SecurityGroups(List ec2SecurityGroups) {
    this.ec2SecurityGroups = ec2SecurityGroups;
    return this;
  }

  /**
   * Get ec2SecurityGroups
   * @return ec2SecurityGroups
   */
  @javax.annotation.Nullable
  public List getEc2SecurityGroups() {
    return ec2SecurityGroups;
  }

  public void setEc2SecurityGroups(List ec2SecurityGroups) {
    this.ec2SecurityGroups = ec2SecurityGroups;
  }


  public AwsRdsDbSecurityGroupDetails ipRanges(List ipRanges) {
    this.ipRanges = ipRanges;
    return this;
  }

  /**
   * Get ipRanges
   * @return ipRanges
   */
  @javax.annotation.Nullable
  public List getIpRanges() {
    return ipRanges;
  }

  public void setIpRanges(List ipRanges) {
    this.ipRanges = ipRanges;
  }


  public AwsRdsDbSecurityGroupDetails ownerId(String ownerId) {
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


  public AwsRdsDbSecurityGroupDetails vpcId(String vpcId) {
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
    AwsRdsDbSecurityGroupDetails awsRdsDbSecurityGroupDetails = (AwsRdsDbSecurityGroupDetails) o;
    return Objects.equals(this.dbSecurityGroupArn, awsRdsDbSecurityGroupDetails.dbSecurityGroupArn) &&
        Objects.equals(this.dbSecurityGroupDescription, awsRdsDbSecurityGroupDetails.dbSecurityGroupDescription) &&
        Objects.equals(this.dbSecurityGroupName, awsRdsDbSecurityGroupDetails.dbSecurityGroupName) &&
        Objects.equals(this.ec2SecurityGroups, awsRdsDbSecurityGroupDetails.ec2SecurityGroups) &&
        Objects.equals(this.ipRanges, awsRdsDbSecurityGroupDetails.ipRanges) &&
        Objects.equals(this.ownerId, awsRdsDbSecurityGroupDetails.ownerId) &&
        Objects.equals(this.vpcId, awsRdsDbSecurityGroupDetails.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbSecurityGroupArn, dbSecurityGroupDescription, dbSecurityGroupName, ec2SecurityGroups, ipRanges, ownerId, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsRdsDbSecurityGroupDetails {\n");
    sb.append("    dbSecurityGroupArn: ").append(toIndentedString(dbSecurityGroupArn)).append("\n");
    sb.append("    dbSecurityGroupDescription: ").append(toIndentedString(dbSecurityGroupDescription)).append("\n");
    sb.append("    dbSecurityGroupName: ").append(toIndentedString(dbSecurityGroupName)).append("\n");
    sb.append("    ec2SecurityGroups: ").append(toIndentedString(ec2SecurityGroups)).append("\n");
    sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
    openapiFields.add("DbSecurityGroupArn");
    openapiFields.add("DbSecurityGroupDescription");
    openapiFields.add("DbSecurityGroupName");
    openapiFields.add("Ec2SecurityGroups");
    openapiFields.add("IpRanges");
    openapiFields.add("OwnerId");
    openapiFields.add("VpcId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsRdsDbSecurityGroupDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsRdsDbSecurityGroupDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsRdsDbSecurityGroupDetails is not found in the empty JSON string", AwsRdsDbSecurityGroupDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsRdsDbSecurityGroupDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsRdsDbSecurityGroupDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DbSecurityGroupArn`
      if (jsonObj.get("DbSecurityGroupArn") != null && !jsonObj.get("DbSecurityGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSecurityGroupArn"));
      }
      // validate the optional field `DbSecurityGroupDescription`
      if (jsonObj.get("DbSecurityGroupDescription") != null && !jsonObj.get("DbSecurityGroupDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSecurityGroupDescription"));
      }
      // validate the optional field `DbSecurityGroupName`
      if (jsonObj.get("DbSecurityGroupName") != null && !jsonObj.get("DbSecurityGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSecurityGroupName"));
      }
      // validate the optional field `Ec2SecurityGroups`
      if (jsonObj.get("Ec2SecurityGroups") != null && !jsonObj.get("Ec2SecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Ec2SecurityGroups"));
      }
      // validate the optional field `IpRanges`
      if (jsonObj.get("IpRanges") != null && !jsonObj.get("IpRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IpRanges"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
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
       if (!AwsRdsDbSecurityGroupDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsRdsDbSecurityGroupDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsRdsDbSecurityGroupDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsRdsDbSecurityGroupDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsRdsDbSecurityGroupDetails>() {
           @Override
           public void write(JsonWriter out, AwsRdsDbSecurityGroupDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsRdsDbSecurityGroupDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsRdsDbSecurityGroupDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsRdsDbSecurityGroupDetails
   * @throws IOException if the JSON string is invalid with respect to AwsRdsDbSecurityGroupDetails
   */
  public static AwsRdsDbSecurityGroupDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsRdsDbSecurityGroupDetails.class);
  }

  /**
   * Convert an instance of AwsRdsDbSecurityGroupDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

