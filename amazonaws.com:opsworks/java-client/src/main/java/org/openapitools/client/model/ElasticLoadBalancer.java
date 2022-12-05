/*
 * AWS OpsWorks
 * <fullname>AWS OpsWorks</fullname> <p>Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples for AWS OpsWorks Stacks actions and data types, including common parameters and error codes. </p> <p>AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For information about this product, go to the <a href=\"http://aws.amazon.com/opsworks/\">AWS OpsWorks</a> details page. </p> <p> <b>SDKs and CLI</b> </p> <p>The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using one of the AWS SDKs to implement applications in your preferred language. For more information, see:</p> <ul> <li> <p> <a href=\"https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html\">AWS CLI</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html\">AWS SDK for Java</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm\">AWS SDK for .NET</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html\">AWS SDK for PHP 2</a> </p> </li> <li> <p> <a href=\"http://docs.aws.amazon.com/sdkforruby/api/\">AWS SDK for Ruby</a> </p> </li> <li> <p> <a href=\"http://aws.amazon.com/documentation/sdkforjavascript/\">AWS SDK for Node.js</a> </p> </li> <li> <p> <a href=\"http://docs.pythonboto.org/en/latest/ref/opsworks.html\">AWS SDK for Python(Boto)</a> </p> </li> </ul> <p> <b>Endpoints</b> </p> <p>AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks can only be accessed or managed within the endpoint in which they are created.</p> <ul> <li> <p>opsworks.us-east-1.amazonaws.com</p> </li> <li> <p>opsworks.us-east-2.amazonaws.com</p> </li> <li> <p>opsworks.us-west-1.amazonaws.com</p> </li> <li> <p>opsworks.us-west-2.amazonaws.com</p> </li> <li> <p>opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)</p> </li> <li> <p>opsworks.eu-west-1.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-2.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-3.amazonaws.com</p> </li> <li> <p>opsworks.eu-central-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-2.amazonaws.com</p> </li> <li> <p>opsworks.ap-south-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-2.amazonaws.com</p> </li> <li> <p>opsworks.sa-east-1.amazonaws.com</p> </li> </ul> <p> <b>Chef Versions</b> </p> <p>When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a href=\"https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html\">Chef Versions</a>.</p> <note> <p>You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to Chef 12 as soon as possible.</p> </note>
 *
 * The version of the OpenAPI document: 2013-02-18
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
 * Describes an Elastic Load Balancing instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:36.435440-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ElasticLoadBalancer {
  public static final String SERIALIZED_NAME_ELASTIC_LOAD_BALANCER_NAME = "ElasticLoadBalancerName";
  @SerializedName(SERIALIZED_NAME_ELASTIC_LOAD_BALANCER_NAME)
  private String elasticLoadBalancerName;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_DNS_NAME = "DnsName";
  @SerializedName(SERIALIZED_NAME_DNS_NAME)
  private String dnsName;

  public static final String SERIALIZED_NAME_STACK_ID = "StackId";
  @SerializedName(SERIALIZED_NAME_STACK_ID)
  private String stackId;

  public static final String SERIALIZED_NAME_LAYER_ID = "LayerId";
  @SerializedName(SERIALIZED_NAME_LAYER_ID)
  private String layerId;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

  public static final String SERIALIZED_NAME_SUBNET_IDS = "SubnetIds";
  @SerializedName(SERIALIZED_NAME_SUBNET_IDS)
  private List subnetIds;

  public static final String SERIALIZED_NAME_EC2_INSTANCE_IDS = "Ec2InstanceIds";
  @SerializedName(SERIALIZED_NAME_EC2_INSTANCE_IDS)
  private List ec2InstanceIds;

  public ElasticLoadBalancer() {
  }

  public ElasticLoadBalancer elasticLoadBalancerName(String elasticLoadBalancerName) {
    this.elasticLoadBalancerName = elasticLoadBalancerName;
    return this;
  }

  /**
   * Get elasticLoadBalancerName
   * @return elasticLoadBalancerName
   */
  @javax.annotation.Nullable
  public String getElasticLoadBalancerName() {
    return elasticLoadBalancerName;
  }

  public void setElasticLoadBalancerName(String elasticLoadBalancerName) {
    this.elasticLoadBalancerName = elasticLoadBalancerName;
  }


  public ElasticLoadBalancer region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public ElasticLoadBalancer dnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  /**
   * Get dnsName
   * @return dnsName
   */
  @javax.annotation.Nullable
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }


  public ElasticLoadBalancer stackId(String stackId) {
    this.stackId = stackId;
    return this;
  }

  /**
   * Get stackId
   * @return stackId
   */
  @javax.annotation.Nullable
  public String getStackId() {
    return stackId;
  }

  public void setStackId(String stackId) {
    this.stackId = stackId;
  }


  public ElasticLoadBalancer layerId(String layerId) {
    this.layerId = layerId;
    return this;
  }

  /**
   * Get layerId
   * @return layerId
   */
  @javax.annotation.Nullable
  public String getLayerId() {
    return layerId;
  }

  public void setLayerId(String layerId) {
    this.layerId = layerId;
  }


  public ElasticLoadBalancer vpcId(String vpcId) {
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


  public ElasticLoadBalancer availabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
    return this;
  }

  /**
   * Get availabilityZones
   * @return availabilityZones
   */
  @javax.annotation.Nullable
  public List getAvailabilityZones() {
    return availabilityZones;
  }

  public void setAvailabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
  }


  public ElasticLoadBalancer subnetIds(List subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  /**
   * Get subnetIds
   * @return subnetIds
   */
  @javax.annotation.Nullable
  public List getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List subnetIds) {
    this.subnetIds = subnetIds;
  }


  public ElasticLoadBalancer ec2InstanceIds(List ec2InstanceIds) {
    this.ec2InstanceIds = ec2InstanceIds;
    return this;
  }

  /**
   * Get ec2InstanceIds
   * @return ec2InstanceIds
   */
  @javax.annotation.Nullable
  public List getEc2InstanceIds() {
    return ec2InstanceIds;
  }

  public void setEc2InstanceIds(List ec2InstanceIds) {
    this.ec2InstanceIds = ec2InstanceIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticLoadBalancer elasticLoadBalancer = (ElasticLoadBalancer) o;
    return Objects.equals(this.elasticLoadBalancerName, elasticLoadBalancer.elasticLoadBalancerName) &&
        Objects.equals(this.region, elasticLoadBalancer.region) &&
        Objects.equals(this.dnsName, elasticLoadBalancer.dnsName) &&
        Objects.equals(this.stackId, elasticLoadBalancer.stackId) &&
        Objects.equals(this.layerId, elasticLoadBalancer.layerId) &&
        Objects.equals(this.vpcId, elasticLoadBalancer.vpcId) &&
        Objects.equals(this.availabilityZones, elasticLoadBalancer.availabilityZones) &&
        Objects.equals(this.subnetIds, elasticLoadBalancer.subnetIds) &&
        Objects.equals(this.ec2InstanceIds, elasticLoadBalancer.ec2InstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticLoadBalancerName, region, dnsName, stackId, layerId, vpcId, availabilityZones, subnetIds, ec2InstanceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticLoadBalancer {\n");
    sb.append("    elasticLoadBalancerName: ").append(toIndentedString(elasticLoadBalancerName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
    sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    ec2InstanceIds: ").append(toIndentedString(ec2InstanceIds)).append("\n");
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
    openapiFields.add("ElasticLoadBalancerName");
    openapiFields.add("Region");
    openapiFields.add("DnsName");
    openapiFields.add("StackId");
    openapiFields.add("LayerId");
    openapiFields.add("VpcId");
    openapiFields.add("AvailabilityZones");
    openapiFields.add("SubnetIds");
    openapiFields.add("Ec2InstanceIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElasticLoadBalancer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElasticLoadBalancer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElasticLoadBalancer is not found in the empty JSON string", ElasticLoadBalancer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElasticLoadBalancer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElasticLoadBalancer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ElasticLoadBalancerName`
      if (jsonObj.get("ElasticLoadBalancerName") != null && !jsonObj.get("ElasticLoadBalancerName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ElasticLoadBalancerName"));
      }
      // validate the optional field `Region`
      if (jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Region"));
      }
      // validate the optional field `DnsName`
      if (jsonObj.get("DnsName") != null && !jsonObj.get("DnsName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DnsName"));
      }
      // validate the optional field `StackId`
      if (jsonObj.get("StackId") != null && !jsonObj.get("StackId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StackId"));
      }
      // validate the optional field `LayerId`
      if (jsonObj.get("LayerId") != null && !jsonObj.get("LayerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LayerId"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
      }
      // validate the optional field `SubnetIds`
      if (jsonObj.get("SubnetIds") != null && !jsonObj.get("SubnetIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SubnetIds"));
      }
      // validate the optional field `Ec2InstanceIds`
      if (jsonObj.get("Ec2InstanceIds") != null && !jsonObj.get("Ec2InstanceIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Ec2InstanceIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElasticLoadBalancer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElasticLoadBalancer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElasticLoadBalancer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElasticLoadBalancer.class));

       return (TypeAdapter<T>) new TypeAdapter<ElasticLoadBalancer>() {
           @Override
           public void write(JsonWriter out, ElasticLoadBalancer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElasticLoadBalancer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElasticLoadBalancer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElasticLoadBalancer
   * @throws IOException if the JSON string is invalid with respect to ElasticLoadBalancer
   */
  public static ElasticLoadBalancer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElasticLoadBalancer.class);
  }

  /**
   * Convert an instance of ElasticLoadBalancer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

