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
import org.openapitools.client.model.AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions;

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
 * AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo {
  public static final String SERIALIZED_NAME_CIDR_BLOCK = "CidrBlock";
  @SerializedName(SERIALIZED_NAME_CIDR_BLOCK)
  private String cidrBlock;

  public static final String SERIALIZED_NAME_CIDR_BLOCK_SET = "CidrBlockSet";
  @SerializedName(SERIALIZED_NAME_CIDR_BLOCK_SET)
  private List cidrBlockSet;

  public static final String SERIALIZED_NAME_IPV6_CIDR_BLOCK_SET = "Ipv6CidrBlockSet";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDR_BLOCK_SET)
  private List ipv6CidrBlockSet;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PEERING_OPTIONS = "PeeringOptions";
  @SerializedName(SERIALIZED_NAME_PEERING_OPTIONS)
  private AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions peeringOptions;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo() {
  }

  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo cidrBlock(String cidrBlock) {
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


  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo cidrBlockSet(List cidrBlockSet) {
    this.cidrBlockSet = cidrBlockSet;
    return this;
  }

  /**
   * Get cidrBlockSet
   * @return cidrBlockSet
   */
  @javax.annotation.Nullable
  public List getCidrBlockSet() {
    return cidrBlockSet;
  }

  public void setCidrBlockSet(List cidrBlockSet) {
    this.cidrBlockSet = cidrBlockSet;
  }


  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo ipv6CidrBlockSet(List ipv6CidrBlockSet) {
    this.ipv6CidrBlockSet = ipv6CidrBlockSet;
    return this;
  }

  /**
   * Get ipv6CidrBlockSet
   * @return ipv6CidrBlockSet
   */
  @javax.annotation.Nullable
  public List getIpv6CidrBlockSet() {
    return ipv6CidrBlockSet;
  }

  public void setIpv6CidrBlockSet(List ipv6CidrBlockSet) {
    this.ipv6CidrBlockSet = ipv6CidrBlockSet;
  }


  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo ownerId(String ownerId) {
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


  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo peeringOptions(AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions peeringOptions) {
    this.peeringOptions = peeringOptions;
    return this;
  }

  /**
   * Get peeringOptions
   * @return peeringOptions
   */
  @javax.annotation.Nullable
  public AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions getPeeringOptions() {
    return peeringOptions;
  }

  public void setPeeringOptions(AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions peeringOptions) {
    this.peeringOptions = peeringOptions;
  }


  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo region(String region) {
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


  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo vpcId(String vpcId) {
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
    AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo = (AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo) o;
    return Objects.equals(this.cidrBlock, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.cidrBlock) &&
        Objects.equals(this.cidrBlockSet, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.cidrBlockSet) &&
        Objects.equals(this.ipv6CidrBlockSet, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.ipv6CidrBlockSet) &&
        Objects.equals(this.ownerId, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.ownerId) &&
        Objects.equals(this.peeringOptions, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.peeringOptions) &&
        Objects.equals(this.region, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.region) &&
        Objects.equals(this.vpcId, awsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, cidrBlockSet, ipv6CidrBlockSet, ownerId, peeringOptions, region, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo {\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    cidrBlockSet: ").append(toIndentedString(cidrBlockSet)).append("\n");
    sb.append("    ipv6CidrBlockSet: ").append(toIndentedString(ipv6CidrBlockSet)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    peeringOptions: ").append(toIndentedString(peeringOptions)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("CidrBlock");
    openapiFields.add("CidrBlockSet");
    openapiFields.add("Ipv6CidrBlockSet");
    openapiFields.add("OwnerId");
    openapiFields.add("PeeringOptions");
    openapiFields.add("Region");
    openapiFields.add("VpcId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo is not found in the empty JSON string", AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CidrBlock`
      if (jsonObj.get("CidrBlock") != null && !jsonObj.get("CidrBlock").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CidrBlock"));
      }
      // validate the optional field `CidrBlockSet`
      if (jsonObj.get("CidrBlockSet") != null && !jsonObj.get("CidrBlockSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CidrBlockSet"));
      }
      // validate the optional field `Ipv6CidrBlockSet`
      if (jsonObj.get("Ipv6CidrBlockSet") != null && !jsonObj.get("Ipv6CidrBlockSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Ipv6CidrBlockSet"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `PeeringOptions`
      if (jsonObj.get("PeeringOptions") != null && !jsonObj.get("PeeringOptions").isJsonNull()) {
        AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.validateJsonElement(jsonObj.get("PeeringOptions"));
      }
      // validate the optional field `Region`
      if (jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Region"));
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
       if (!AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo>() {
           @Override
           public void write(JsonWriter out, AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo
   * @throws IOException if the JSON string is invalid with respect to AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo
   */
  public static AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.class);
  }

  /**
   * Convert an instance of AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

