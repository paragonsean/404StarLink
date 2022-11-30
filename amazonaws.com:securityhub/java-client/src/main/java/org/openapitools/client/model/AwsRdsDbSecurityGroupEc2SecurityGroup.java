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
 * EC2 security group information for an RDS DB security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsRdsDbSecurityGroupEc2SecurityGroup {
  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_ID = "Ec2SecurityGroupId";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_ID)
  private String ec2SecurityGroupId;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_NAME = "Ec2SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_NAME)
  private String ec2SecurityGroupName;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_OWNER_ID = "Ec2SecurityGroupOwnerId";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_OWNER_ID)
  private String ec2SecurityGroupOwnerId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AwsRdsDbSecurityGroupEc2SecurityGroup() {
  }

  public AwsRdsDbSecurityGroupEc2SecurityGroup ec2SecurityGroupId(String ec2SecurityGroupId) {
    this.ec2SecurityGroupId = ec2SecurityGroupId;
    return this;
  }

  /**
   * Get ec2SecurityGroupId
   * @return ec2SecurityGroupId
   */
  @javax.annotation.Nullable
  public String getEc2SecurityGroupId() {
    return ec2SecurityGroupId;
  }

  public void setEc2SecurityGroupId(String ec2SecurityGroupId) {
    this.ec2SecurityGroupId = ec2SecurityGroupId;
  }


  public AwsRdsDbSecurityGroupEc2SecurityGroup ec2SecurityGroupName(String ec2SecurityGroupName) {
    this.ec2SecurityGroupName = ec2SecurityGroupName;
    return this;
  }

  /**
   * Get ec2SecurityGroupName
   * @return ec2SecurityGroupName
   */
  @javax.annotation.Nullable
  public String getEc2SecurityGroupName() {
    return ec2SecurityGroupName;
  }

  public void setEc2SecurityGroupName(String ec2SecurityGroupName) {
    this.ec2SecurityGroupName = ec2SecurityGroupName;
  }


  public AwsRdsDbSecurityGroupEc2SecurityGroup ec2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
    this.ec2SecurityGroupOwnerId = ec2SecurityGroupOwnerId;
    return this;
  }

  /**
   * Get ec2SecurityGroupOwnerId
   * @return ec2SecurityGroupOwnerId
   */
  @javax.annotation.Nullable
  public String getEc2SecurityGroupOwnerId() {
    return ec2SecurityGroupOwnerId;
  }

  public void setEc2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
    this.ec2SecurityGroupOwnerId = ec2SecurityGroupOwnerId;
  }


  public AwsRdsDbSecurityGroupEc2SecurityGroup status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsRdsDbSecurityGroupEc2SecurityGroup awsRdsDbSecurityGroupEc2SecurityGroup = (AwsRdsDbSecurityGroupEc2SecurityGroup) o;
    return Objects.equals(this.ec2SecurityGroupId, awsRdsDbSecurityGroupEc2SecurityGroup.ec2SecurityGroupId) &&
        Objects.equals(this.ec2SecurityGroupName, awsRdsDbSecurityGroupEc2SecurityGroup.ec2SecurityGroupName) &&
        Objects.equals(this.ec2SecurityGroupOwnerId, awsRdsDbSecurityGroupEc2SecurityGroup.ec2SecurityGroupOwnerId) &&
        Objects.equals(this.status, awsRdsDbSecurityGroupEc2SecurityGroup.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ec2SecurityGroupId, ec2SecurityGroupName, ec2SecurityGroupOwnerId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsRdsDbSecurityGroupEc2SecurityGroup {\n");
    sb.append("    ec2SecurityGroupId: ").append(toIndentedString(ec2SecurityGroupId)).append("\n");
    sb.append("    ec2SecurityGroupName: ").append(toIndentedString(ec2SecurityGroupName)).append("\n");
    sb.append("    ec2SecurityGroupOwnerId: ").append(toIndentedString(ec2SecurityGroupOwnerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Ec2SecurityGroupId");
    openapiFields.add("Ec2SecurityGroupName");
    openapiFields.add("Ec2SecurityGroupOwnerId");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsRdsDbSecurityGroupEc2SecurityGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsRdsDbSecurityGroupEc2SecurityGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsRdsDbSecurityGroupEc2SecurityGroup is not found in the empty JSON string", AwsRdsDbSecurityGroupEc2SecurityGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsRdsDbSecurityGroupEc2SecurityGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsRdsDbSecurityGroupEc2SecurityGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Ec2SecurityGroupId`
      if (jsonObj.get("Ec2SecurityGroupId") != null && !jsonObj.get("Ec2SecurityGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Ec2SecurityGroupId"));
      }
      // validate the optional field `Ec2SecurityGroupName`
      if (jsonObj.get("Ec2SecurityGroupName") != null && !jsonObj.get("Ec2SecurityGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Ec2SecurityGroupName"));
      }
      // validate the optional field `Ec2SecurityGroupOwnerId`
      if (jsonObj.get("Ec2SecurityGroupOwnerId") != null && !jsonObj.get("Ec2SecurityGroupOwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Ec2SecurityGroupOwnerId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsRdsDbSecurityGroupEc2SecurityGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsRdsDbSecurityGroupEc2SecurityGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsRdsDbSecurityGroupEc2SecurityGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsRdsDbSecurityGroupEc2SecurityGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsRdsDbSecurityGroupEc2SecurityGroup>() {
           @Override
           public void write(JsonWriter out, AwsRdsDbSecurityGroupEc2SecurityGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsRdsDbSecurityGroupEc2SecurityGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsRdsDbSecurityGroupEc2SecurityGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsRdsDbSecurityGroupEc2SecurityGroup
   * @throws IOException if the JSON string is invalid with respect to AwsRdsDbSecurityGroupEc2SecurityGroup
   */
  public static AwsRdsDbSecurityGroupEc2SecurityGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsRdsDbSecurityGroupEc2SecurityGroup.class);
  }

  /**
   * Convert an instance of AwsRdsDbSecurityGroupEc2SecurityGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

