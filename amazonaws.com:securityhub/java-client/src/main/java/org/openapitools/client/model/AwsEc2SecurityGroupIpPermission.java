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
 * An IP permission for an EC2 security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2SecurityGroupIpPermission {
  public static final String SERIALIZED_NAME_IP_PROTOCOL = "IpProtocol";
  @SerializedName(SERIALIZED_NAME_IP_PROTOCOL)
  private String ipProtocol;

  public static final String SERIALIZED_NAME_FROM_PORT = "FromPort";
  @SerializedName(SERIALIZED_NAME_FROM_PORT)
  private Integer fromPort;

  public static final String SERIALIZED_NAME_TO_PORT = "ToPort";
  @SerializedName(SERIALIZED_NAME_TO_PORT)
  private Integer toPort;

  public static final String SERIALIZED_NAME_USER_ID_GROUP_PAIRS = "UserIdGroupPairs";
  @SerializedName(SERIALIZED_NAME_USER_ID_GROUP_PAIRS)
  private List userIdGroupPairs;

  public static final String SERIALIZED_NAME_IP_RANGES = "IpRanges";
  @SerializedName(SERIALIZED_NAME_IP_RANGES)
  private List ipRanges;

  public static final String SERIALIZED_NAME_IPV6_RANGES = "Ipv6Ranges";
  @SerializedName(SERIALIZED_NAME_IPV6_RANGES)
  private List ipv6Ranges;

  public static final String SERIALIZED_NAME_PREFIX_LIST_IDS = "PrefixListIds";
  @SerializedName(SERIALIZED_NAME_PREFIX_LIST_IDS)
  private List prefixListIds;

  public AwsEc2SecurityGroupIpPermission() {
  }

  public AwsEc2SecurityGroupIpPermission ipProtocol(String ipProtocol) {
    this.ipProtocol = ipProtocol;
    return this;
  }

  /**
   * Get ipProtocol
   * @return ipProtocol
   */
  @javax.annotation.Nullable
  public String getIpProtocol() {
    return ipProtocol;
  }

  public void setIpProtocol(String ipProtocol) {
    this.ipProtocol = ipProtocol;
  }


  public AwsEc2SecurityGroupIpPermission fromPort(Integer fromPort) {
    this.fromPort = fromPort;
    return this;
  }

  /**
   * Get fromPort
   * @return fromPort
   */
  @javax.annotation.Nullable
  public Integer getFromPort() {
    return fromPort;
  }

  public void setFromPort(Integer fromPort) {
    this.fromPort = fromPort;
  }


  public AwsEc2SecurityGroupIpPermission toPort(Integer toPort) {
    this.toPort = toPort;
    return this;
  }

  /**
   * Get toPort
   * @return toPort
   */
  @javax.annotation.Nullable
  public Integer getToPort() {
    return toPort;
  }

  public void setToPort(Integer toPort) {
    this.toPort = toPort;
  }


  public AwsEc2SecurityGroupIpPermission userIdGroupPairs(List userIdGroupPairs) {
    this.userIdGroupPairs = userIdGroupPairs;
    return this;
  }

  /**
   * Get userIdGroupPairs
   * @return userIdGroupPairs
   */
  @javax.annotation.Nullable
  public List getUserIdGroupPairs() {
    return userIdGroupPairs;
  }

  public void setUserIdGroupPairs(List userIdGroupPairs) {
    this.userIdGroupPairs = userIdGroupPairs;
  }


  public AwsEc2SecurityGroupIpPermission ipRanges(List ipRanges) {
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


  public AwsEc2SecurityGroupIpPermission ipv6Ranges(List ipv6Ranges) {
    this.ipv6Ranges = ipv6Ranges;
    return this;
  }

  /**
   * Get ipv6Ranges
   * @return ipv6Ranges
   */
  @javax.annotation.Nullable
  public List getIpv6Ranges() {
    return ipv6Ranges;
  }

  public void setIpv6Ranges(List ipv6Ranges) {
    this.ipv6Ranges = ipv6Ranges;
  }


  public AwsEc2SecurityGroupIpPermission prefixListIds(List prefixListIds) {
    this.prefixListIds = prefixListIds;
    return this;
  }

  /**
   * Get prefixListIds
   * @return prefixListIds
   */
  @javax.annotation.Nullable
  public List getPrefixListIds() {
    return prefixListIds;
  }

  public void setPrefixListIds(List prefixListIds) {
    this.prefixListIds = prefixListIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2SecurityGroupIpPermission awsEc2SecurityGroupIpPermission = (AwsEc2SecurityGroupIpPermission) o;
    return Objects.equals(this.ipProtocol, awsEc2SecurityGroupIpPermission.ipProtocol) &&
        Objects.equals(this.fromPort, awsEc2SecurityGroupIpPermission.fromPort) &&
        Objects.equals(this.toPort, awsEc2SecurityGroupIpPermission.toPort) &&
        Objects.equals(this.userIdGroupPairs, awsEc2SecurityGroupIpPermission.userIdGroupPairs) &&
        Objects.equals(this.ipRanges, awsEc2SecurityGroupIpPermission.ipRanges) &&
        Objects.equals(this.ipv6Ranges, awsEc2SecurityGroupIpPermission.ipv6Ranges) &&
        Objects.equals(this.prefixListIds, awsEc2SecurityGroupIpPermission.prefixListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipProtocol, fromPort, toPort, userIdGroupPairs, ipRanges, ipv6Ranges, prefixListIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2SecurityGroupIpPermission {\n");
    sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
    sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
    sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
    sb.append("    userIdGroupPairs: ").append(toIndentedString(userIdGroupPairs)).append("\n");
    sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
    sb.append("    ipv6Ranges: ").append(toIndentedString(ipv6Ranges)).append("\n");
    sb.append("    prefixListIds: ").append(toIndentedString(prefixListIds)).append("\n");
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
    openapiFields.add("IpProtocol");
    openapiFields.add("FromPort");
    openapiFields.add("ToPort");
    openapiFields.add("UserIdGroupPairs");
    openapiFields.add("IpRanges");
    openapiFields.add("Ipv6Ranges");
    openapiFields.add("PrefixListIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2SecurityGroupIpPermission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2SecurityGroupIpPermission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2SecurityGroupIpPermission is not found in the empty JSON string", AwsEc2SecurityGroupIpPermission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2SecurityGroupIpPermission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2SecurityGroupIpPermission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IpProtocol`
      if (jsonObj.get("IpProtocol") != null && !jsonObj.get("IpProtocol").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IpProtocol"));
      }
      // validate the optional field `FromPort`
      if (jsonObj.get("FromPort") != null && !jsonObj.get("FromPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("FromPort"));
      }
      // validate the optional field `ToPort`
      if (jsonObj.get("ToPort") != null && !jsonObj.get("ToPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ToPort"));
      }
      // validate the optional field `UserIdGroupPairs`
      if (jsonObj.get("UserIdGroupPairs") != null && !jsonObj.get("UserIdGroupPairs").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("UserIdGroupPairs"));
      }
      // validate the optional field `IpRanges`
      if (jsonObj.get("IpRanges") != null && !jsonObj.get("IpRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IpRanges"));
      }
      // validate the optional field `Ipv6Ranges`
      if (jsonObj.get("Ipv6Ranges") != null && !jsonObj.get("Ipv6Ranges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Ipv6Ranges"));
      }
      // validate the optional field `PrefixListIds`
      if (jsonObj.get("PrefixListIds") != null && !jsonObj.get("PrefixListIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PrefixListIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2SecurityGroupIpPermission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2SecurityGroupIpPermission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2SecurityGroupIpPermission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2SecurityGroupIpPermission.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2SecurityGroupIpPermission>() {
           @Override
           public void write(JsonWriter out, AwsEc2SecurityGroupIpPermission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2SecurityGroupIpPermission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2SecurityGroupIpPermission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2SecurityGroupIpPermission
   * @throws IOException if the JSON string is invalid with respect to AwsEc2SecurityGroupIpPermission
   */
  public static AwsEc2SecurityGroupIpPermission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2SecurityGroupIpPermission.class);
  }

  /**
   * Convert an instance of AwsEc2SecurityGroupIpPermission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

