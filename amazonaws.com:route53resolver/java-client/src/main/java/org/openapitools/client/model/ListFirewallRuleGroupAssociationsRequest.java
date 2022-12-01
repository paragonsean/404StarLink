/*
 * Amazon Route 53 Resolver
 * <p>When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver. By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or Elastic Load Balancing load balancers. Resolver performs recursive lookups against public name servers for all other domain names.</p> <p>You can also configure DNS resolution between your VPC and your network over a Direct Connect or VPN connection:</p> <p> <b>Forward DNS queries from resolvers on your network to Route 53 Resolver</b> </p> <p>DNS resolvers on your network can forward DNS queries to Resolver in a specified VPC. This allows your DNS resolvers to easily resolve domain names for Amazon Web Services resources such as EC2 instances or records in a Route 53 private hosted zone. For more information, see <a href=\"https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-network-to-vpc\">How DNS Resolvers on Your Network Forward DNS Queries to Route 53 Resolver</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p> <b>Conditionally forward queries from a VPC to resolvers on your network</b> </p> <p>You can configure Resolver to forward queries that it receives from EC2 instances in your VPCs to DNS resolvers on your network. To forward selected queries, you create Resolver rules that specify the domain names for the DNS queries that you want to forward (such as example.com), and the IP addresses of the DNS resolvers on your network that you want to forward the queries to. If a query matches multiple rules (example.com, acme.example.com), Resolver chooses the rule with the most specific match (acme.example.com) and forwards the query to the IP addresses that you specified in that rule. For more information, see <a href=\"https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-vpc-to-network\">How Route 53 Resolver Forwards DNS Queries from Your VPCs to Your Network</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p>Like Amazon VPC, Resolver is Regional. In each Region where you have VPCs, you can choose whether to forward queries from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.</p>
 *
 * The version of the OpenAPI document: 2018-04-01
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
import org.openapitools.client.model.FirewallRuleGroupAssociationStatus;

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
 * ListFirewallRuleGroupAssociationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:22.540130-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListFirewallRuleGroupAssociationsRequest {
  public static final String SERIALIZED_NAME_FIREWALL_RULE_GROUP_ID = "FirewallRuleGroupId";
  @SerializedName(SERIALIZED_NAME_FIREWALL_RULE_GROUP_ID)
  private String firewallRuleGroupId;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_PRIORITY = "Priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FirewallRuleGroupAssociationStatus status;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "MaxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListFirewallRuleGroupAssociationsRequest() {
  }

  public ListFirewallRuleGroupAssociationsRequest firewallRuleGroupId(String firewallRuleGroupId) {
    this.firewallRuleGroupId = firewallRuleGroupId;
    return this;
  }

  /**
   * Get firewallRuleGroupId
   * @return firewallRuleGroupId
   */
  @javax.annotation.Nullable
  public String getFirewallRuleGroupId() {
    return firewallRuleGroupId;
  }

  public void setFirewallRuleGroupId(String firewallRuleGroupId) {
    this.firewallRuleGroupId = firewallRuleGroupId;
  }


  public ListFirewallRuleGroupAssociationsRequest vpcId(String vpcId) {
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


  public ListFirewallRuleGroupAssociationsRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public ListFirewallRuleGroupAssociationsRequest status(FirewallRuleGroupAssociationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public FirewallRuleGroupAssociationStatus getStatus() {
    return status;
  }

  public void setStatus(FirewallRuleGroupAssociationStatus status) {
    this.status = status;
  }


  public ListFirewallRuleGroupAssociationsRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Get maxResults
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public ListFirewallRuleGroupAssociationsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFirewallRuleGroupAssociationsRequest listFirewallRuleGroupAssociationsRequest = (ListFirewallRuleGroupAssociationsRequest) o;
    return Objects.equals(this.firewallRuleGroupId, listFirewallRuleGroupAssociationsRequest.firewallRuleGroupId) &&
        Objects.equals(this.vpcId, listFirewallRuleGroupAssociationsRequest.vpcId) &&
        Objects.equals(this.priority, listFirewallRuleGroupAssociationsRequest.priority) &&
        Objects.equals(this.status, listFirewallRuleGroupAssociationsRequest.status) &&
        Objects.equals(this.maxResults, listFirewallRuleGroupAssociationsRequest.maxResults) &&
        Objects.equals(this.nextToken, listFirewallRuleGroupAssociationsRequest.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firewallRuleGroupId, vpcId, priority, status, maxResults, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFirewallRuleGroupAssociationsRequest {\n");
    sb.append("    firewallRuleGroupId: ").append(toIndentedString(firewallRuleGroupId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("FirewallRuleGroupId");
    openapiFields.add("VpcId");
    openapiFields.add("Priority");
    openapiFields.add("Status");
    openapiFields.add("MaxResults");
    openapiFields.add("NextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListFirewallRuleGroupAssociationsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListFirewallRuleGroupAssociationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListFirewallRuleGroupAssociationsRequest is not found in the empty JSON string", ListFirewallRuleGroupAssociationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListFirewallRuleGroupAssociationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListFirewallRuleGroupAssociationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `FirewallRuleGroupId`
      if (jsonObj.get("FirewallRuleGroupId") != null && !jsonObj.get("FirewallRuleGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallRuleGroupId"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `Priority`
      if (jsonObj.get("Priority") != null && !jsonObj.get("Priority").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Priority"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        FirewallRuleGroupAssociationStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `MaxResults`
      if (jsonObj.get("MaxResults") != null && !jsonObj.get("MaxResults").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxResults"));
      }
      // validate the optional field `NextToken`
      if (jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListFirewallRuleGroupAssociationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListFirewallRuleGroupAssociationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListFirewallRuleGroupAssociationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListFirewallRuleGroupAssociationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListFirewallRuleGroupAssociationsRequest>() {
           @Override
           public void write(JsonWriter out, ListFirewallRuleGroupAssociationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListFirewallRuleGroupAssociationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListFirewallRuleGroupAssociationsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListFirewallRuleGroupAssociationsRequest
   * @throws IOException if the JSON string is invalid with respect to ListFirewallRuleGroupAssociationsRequest
   */
  public static ListFirewallRuleGroupAssociationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListFirewallRuleGroupAssociationsRequest.class);
  }

  /**
   * Convert an instance of ListFirewallRuleGroupAssociationsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

