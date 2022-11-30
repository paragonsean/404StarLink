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
import org.openapitools.client.model.AwsNetworkFirewallFirewallPolicyDetailsFirewallPolicy;

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
 * Details about a firewall policy. A firewall policy defines the behavior of a network firewall.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsNetworkFirewallFirewallPolicyDetails {
  public static final String SERIALIZED_NAME_FIREWALL_POLICY = "FirewallPolicy";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY)
  private AwsNetworkFirewallFirewallPolicyDetailsFirewallPolicy firewallPolicy;

  public static final String SERIALIZED_NAME_FIREWALL_POLICY_ARN = "FirewallPolicyArn";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY_ARN)
  private String firewallPolicyArn;

  public static final String SERIALIZED_NAME_FIREWALL_POLICY_ID = "FirewallPolicyId";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY_ID)
  private String firewallPolicyId;

  public static final String SERIALIZED_NAME_FIREWALL_POLICY_NAME = "FirewallPolicyName";
  @SerializedName(SERIALIZED_NAME_FIREWALL_POLICY_NAME)
  private String firewallPolicyName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public AwsNetworkFirewallFirewallPolicyDetails() {
  }

  public AwsNetworkFirewallFirewallPolicyDetails firewallPolicy(AwsNetworkFirewallFirewallPolicyDetailsFirewallPolicy firewallPolicy) {
    this.firewallPolicy = firewallPolicy;
    return this;
  }

  /**
   * Get firewallPolicy
   * @return firewallPolicy
   */
  @javax.annotation.Nullable
  public AwsNetworkFirewallFirewallPolicyDetailsFirewallPolicy getFirewallPolicy() {
    return firewallPolicy;
  }

  public void setFirewallPolicy(AwsNetworkFirewallFirewallPolicyDetailsFirewallPolicy firewallPolicy) {
    this.firewallPolicy = firewallPolicy;
  }


  public AwsNetworkFirewallFirewallPolicyDetails firewallPolicyArn(String firewallPolicyArn) {
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


  public AwsNetworkFirewallFirewallPolicyDetails firewallPolicyId(String firewallPolicyId) {
    this.firewallPolicyId = firewallPolicyId;
    return this;
  }

  /**
   * Get firewallPolicyId
   * @return firewallPolicyId
   */
  @javax.annotation.Nullable
  public String getFirewallPolicyId() {
    return firewallPolicyId;
  }

  public void setFirewallPolicyId(String firewallPolicyId) {
    this.firewallPolicyId = firewallPolicyId;
  }


  public AwsNetworkFirewallFirewallPolicyDetails firewallPolicyName(String firewallPolicyName) {
    this.firewallPolicyName = firewallPolicyName;
    return this;
  }

  /**
   * Get firewallPolicyName
   * @return firewallPolicyName
   */
  @javax.annotation.Nullable
  public String getFirewallPolicyName() {
    return firewallPolicyName;
  }

  public void setFirewallPolicyName(String firewallPolicyName) {
    this.firewallPolicyName = firewallPolicyName;
  }


  public AwsNetworkFirewallFirewallPolicyDetails description(String description) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsNetworkFirewallFirewallPolicyDetails awsNetworkFirewallFirewallPolicyDetails = (AwsNetworkFirewallFirewallPolicyDetails) o;
    return Objects.equals(this.firewallPolicy, awsNetworkFirewallFirewallPolicyDetails.firewallPolicy) &&
        Objects.equals(this.firewallPolicyArn, awsNetworkFirewallFirewallPolicyDetails.firewallPolicyArn) &&
        Objects.equals(this.firewallPolicyId, awsNetworkFirewallFirewallPolicyDetails.firewallPolicyId) &&
        Objects.equals(this.firewallPolicyName, awsNetworkFirewallFirewallPolicyDetails.firewallPolicyName) &&
        Objects.equals(this.description, awsNetworkFirewallFirewallPolicyDetails.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firewallPolicy, firewallPolicyArn, firewallPolicyId, firewallPolicyName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsNetworkFirewallFirewallPolicyDetails {\n");
    sb.append("    firewallPolicy: ").append(toIndentedString(firewallPolicy)).append("\n");
    sb.append("    firewallPolicyArn: ").append(toIndentedString(firewallPolicyArn)).append("\n");
    sb.append("    firewallPolicyId: ").append(toIndentedString(firewallPolicyId)).append("\n");
    sb.append("    firewallPolicyName: ").append(toIndentedString(firewallPolicyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("FirewallPolicy");
    openapiFields.add("FirewallPolicyArn");
    openapiFields.add("FirewallPolicyId");
    openapiFields.add("FirewallPolicyName");
    openapiFields.add("Description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsNetworkFirewallFirewallPolicyDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsNetworkFirewallFirewallPolicyDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsNetworkFirewallFirewallPolicyDetails is not found in the empty JSON string", AwsNetworkFirewallFirewallPolicyDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsNetworkFirewallFirewallPolicyDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsNetworkFirewallFirewallPolicyDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `FirewallPolicy`
      if (jsonObj.get("FirewallPolicy") != null && !jsonObj.get("FirewallPolicy").isJsonNull()) {
        AwsNetworkFirewallFirewallPolicyDetailsFirewallPolicy.validateJsonElement(jsonObj.get("FirewallPolicy"));
      }
      // validate the optional field `FirewallPolicyArn`
      if (jsonObj.get("FirewallPolicyArn") != null && !jsonObj.get("FirewallPolicyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallPolicyArn"));
      }
      // validate the optional field `FirewallPolicyId`
      if (jsonObj.get("FirewallPolicyId") != null && !jsonObj.get("FirewallPolicyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallPolicyId"));
      }
      // validate the optional field `FirewallPolicyName`
      if (jsonObj.get("FirewallPolicyName") != null && !jsonObj.get("FirewallPolicyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallPolicyName"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsNetworkFirewallFirewallPolicyDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsNetworkFirewallFirewallPolicyDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsNetworkFirewallFirewallPolicyDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsNetworkFirewallFirewallPolicyDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsNetworkFirewallFirewallPolicyDetails>() {
           @Override
           public void write(JsonWriter out, AwsNetworkFirewallFirewallPolicyDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsNetworkFirewallFirewallPolicyDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsNetworkFirewallFirewallPolicyDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsNetworkFirewallFirewallPolicyDetails
   * @throws IOException if the JSON string is invalid with respect to AwsNetworkFirewallFirewallPolicyDetails
   */
  public static AwsNetworkFirewallFirewallPolicyDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsNetworkFirewallFirewallPolicyDetails.class);
  }

  /**
   * Convert an instance of AwsNetworkFirewallFirewallPolicyDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

