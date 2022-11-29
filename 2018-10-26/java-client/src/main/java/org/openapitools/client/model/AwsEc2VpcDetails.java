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
 * Details about an EC2 VPC.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2VpcDetails {
  public static final String SERIALIZED_NAME_CIDR_BLOCK_ASSOCIATION_SET = "CidrBlockAssociationSet";
  @SerializedName(SERIALIZED_NAME_CIDR_BLOCK_ASSOCIATION_SET)
  private List cidrBlockAssociationSet;

  public static final String SERIALIZED_NAME_IPV6_CIDR_BLOCK_ASSOCIATION_SET = "Ipv6CidrBlockAssociationSet";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDR_BLOCK_ASSOCIATION_SET)
  private List ipv6CidrBlockAssociationSet;

  public static final String SERIALIZED_NAME_DHCP_OPTIONS_ID = "DhcpOptionsId";
  @SerializedName(SERIALIZED_NAME_DHCP_OPTIONS_ID)
  private String dhcpOptionsId;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public AwsEc2VpcDetails() {
  }

  public AwsEc2VpcDetails cidrBlockAssociationSet(List cidrBlockAssociationSet) {
    this.cidrBlockAssociationSet = cidrBlockAssociationSet;
    return this;
  }

  /**
   * Get cidrBlockAssociationSet
   * @return cidrBlockAssociationSet
   */
  @javax.annotation.Nullable
  public List getCidrBlockAssociationSet() {
    return cidrBlockAssociationSet;
  }

  public void setCidrBlockAssociationSet(List cidrBlockAssociationSet) {
    this.cidrBlockAssociationSet = cidrBlockAssociationSet;
  }


  public AwsEc2VpcDetails ipv6CidrBlockAssociationSet(List ipv6CidrBlockAssociationSet) {
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


  public AwsEc2VpcDetails dhcpOptionsId(String dhcpOptionsId) {
    this.dhcpOptionsId = dhcpOptionsId;
    return this;
  }

  /**
   * Get dhcpOptionsId
   * @return dhcpOptionsId
   */
  @javax.annotation.Nullable
  public String getDhcpOptionsId() {
    return dhcpOptionsId;
  }

  public void setDhcpOptionsId(String dhcpOptionsId) {
    this.dhcpOptionsId = dhcpOptionsId;
  }


  public AwsEc2VpcDetails state(String state) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2VpcDetails awsEc2VpcDetails = (AwsEc2VpcDetails) o;
    return Objects.equals(this.cidrBlockAssociationSet, awsEc2VpcDetails.cidrBlockAssociationSet) &&
        Objects.equals(this.ipv6CidrBlockAssociationSet, awsEc2VpcDetails.ipv6CidrBlockAssociationSet) &&
        Objects.equals(this.dhcpOptionsId, awsEc2VpcDetails.dhcpOptionsId) &&
        Objects.equals(this.state, awsEc2VpcDetails.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlockAssociationSet, ipv6CidrBlockAssociationSet, dhcpOptionsId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2VpcDetails {\n");
    sb.append("    cidrBlockAssociationSet: ").append(toIndentedString(cidrBlockAssociationSet)).append("\n");
    sb.append("    ipv6CidrBlockAssociationSet: ").append(toIndentedString(ipv6CidrBlockAssociationSet)).append("\n");
    sb.append("    dhcpOptionsId: ").append(toIndentedString(dhcpOptionsId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("CidrBlockAssociationSet");
    openapiFields.add("Ipv6CidrBlockAssociationSet");
    openapiFields.add("DhcpOptionsId");
    openapiFields.add("State");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2VpcDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2VpcDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2VpcDetails is not found in the empty JSON string", AwsEc2VpcDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2VpcDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2VpcDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CidrBlockAssociationSet`
      if (jsonObj.get("CidrBlockAssociationSet") != null && !jsonObj.get("CidrBlockAssociationSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CidrBlockAssociationSet"));
      }
      // validate the optional field `Ipv6CidrBlockAssociationSet`
      if (jsonObj.get("Ipv6CidrBlockAssociationSet") != null && !jsonObj.get("Ipv6CidrBlockAssociationSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Ipv6CidrBlockAssociationSet"));
      }
      // validate the optional field `DhcpOptionsId`
      if (jsonObj.get("DhcpOptionsId") != null && !jsonObj.get("DhcpOptionsId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DhcpOptionsId"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("State"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2VpcDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2VpcDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2VpcDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2VpcDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2VpcDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2VpcDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2VpcDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2VpcDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2VpcDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2VpcDetails
   */
  public static AwsEc2VpcDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2VpcDetails.class);
  }

  /**
   * Convert an instance of AwsEc2VpcDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

