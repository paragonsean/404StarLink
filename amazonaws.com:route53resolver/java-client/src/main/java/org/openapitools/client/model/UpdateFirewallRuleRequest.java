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
import org.openapitools.client.model.Action;
import org.openapitools.client.model.BlockOverrideDnsType;
import org.openapitools.client.model.BlockResponse;

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
 * UpdateFirewallRuleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:22.540130-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateFirewallRuleRequest {
  public static final String SERIALIZED_NAME_FIREWALL_RULE_GROUP_ID = "FirewallRuleGroupId";
  @SerializedName(SERIALIZED_NAME_FIREWALL_RULE_GROUP_ID)
  private String firewallRuleGroupId;

  public static final String SERIALIZED_NAME_FIREWALL_DOMAIN_LIST_ID = "FirewallDomainListId";
  @SerializedName(SERIALIZED_NAME_FIREWALL_DOMAIN_LIST_ID)
  private String firewallDomainListId;

  public static final String SERIALIZED_NAME_PRIORITY = "Priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_ACTION = "Action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Action action;

  public static final String SERIALIZED_NAME_BLOCK_RESPONSE = "BlockResponse";
  @SerializedName(SERIALIZED_NAME_BLOCK_RESPONSE)
  private BlockResponse blockResponse;

  public static final String SERIALIZED_NAME_BLOCK_OVERRIDE_DOMAIN = "BlockOverrideDomain";
  @SerializedName(SERIALIZED_NAME_BLOCK_OVERRIDE_DOMAIN)
  private String blockOverrideDomain;

  public static final String SERIALIZED_NAME_BLOCK_OVERRIDE_DNS_TYPE = "BlockOverrideDnsType";
  @SerializedName(SERIALIZED_NAME_BLOCK_OVERRIDE_DNS_TYPE)
  private BlockOverrideDnsType blockOverrideDnsType;

  public static final String SERIALIZED_NAME_BLOCK_OVERRIDE_TTL = "BlockOverrideTtl";
  @SerializedName(SERIALIZED_NAME_BLOCK_OVERRIDE_TTL)
  private Integer blockOverrideTtl;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public UpdateFirewallRuleRequest() {
  }

  public UpdateFirewallRuleRequest firewallRuleGroupId(String firewallRuleGroupId) {
    this.firewallRuleGroupId = firewallRuleGroupId;
    return this;
  }

  /**
   * Get firewallRuleGroupId
   * @return firewallRuleGroupId
   */
  @javax.annotation.Nonnull
  public String getFirewallRuleGroupId() {
    return firewallRuleGroupId;
  }

  public void setFirewallRuleGroupId(String firewallRuleGroupId) {
    this.firewallRuleGroupId = firewallRuleGroupId;
  }


  public UpdateFirewallRuleRequest firewallDomainListId(String firewallDomainListId) {
    this.firewallDomainListId = firewallDomainListId;
    return this;
  }

  /**
   * Get firewallDomainListId
   * @return firewallDomainListId
   */
  @javax.annotation.Nonnull
  public String getFirewallDomainListId() {
    return firewallDomainListId;
  }

  public void setFirewallDomainListId(String firewallDomainListId) {
    this.firewallDomainListId = firewallDomainListId;
  }


  public UpdateFirewallRuleRequest priority(Integer priority) {
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


  public UpdateFirewallRuleRequest action(Action action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }


  public UpdateFirewallRuleRequest blockResponse(BlockResponse blockResponse) {
    this.blockResponse = blockResponse;
    return this;
  }

  /**
   * Get blockResponse
   * @return blockResponse
   */
  @javax.annotation.Nullable
  public BlockResponse getBlockResponse() {
    return blockResponse;
  }

  public void setBlockResponse(BlockResponse blockResponse) {
    this.blockResponse = blockResponse;
  }


  public UpdateFirewallRuleRequest blockOverrideDomain(String blockOverrideDomain) {
    this.blockOverrideDomain = blockOverrideDomain;
    return this;
  }

  /**
   * Get blockOverrideDomain
   * @return blockOverrideDomain
   */
  @javax.annotation.Nullable
  public String getBlockOverrideDomain() {
    return blockOverrideDomain;
  }

  public void setBlockOverrideDomain(String blockOverrideDomain) {
    this.blockOverrideDomain = blockOverrideDomain;
  }


  public UpdateFirewallRuleRequest blockOverrideDnsType(BlockOverrideDnsType blockOverrideDnsType) {
    this.blockOverrideDnsType = blockOverrideDnsType;
    return this;
  }

  /**
   * Get blockOverrideDnsType
   * @return blockOverrideDnsType
   */
  @javax.annotation.Nullable
  public BlockOverrideDnsType getBlockOverrideDnsType() {
    return blockOverrideDnsType;
  }

  public void setBlockOverrideDnsType(BlockOverrideDnsType blockOverrideDnsType) {
    this.blockOverrideDnsType = blockOverrideDnsType;
  }


  public UpdateFirewallRuleRequest blockOverrideTtl(Integer blockOverrideTtl) {
    this.blockOverrideTtl = blockOverrideTtl;
    return this;
  }

  /**
   * Get blockOverrideTtl
   * @return blockOverrideTtl
   */
  @javax.annotation.Nullable
  public Integer getBlockOverrideTtl() {
    return blockOverrideTtl;
  }

  public void setBlockOverrideTtl(Integer blockOverrideTtl) {
    this.blockOverrideTtl = blockOverrideTtl;
  }


  public UpdateFirewallRuleRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFirewallRuleRequest updateFirewallRuleRequest = (UpdateFirewallRuleRequest) o;
    return Objects.equals(this.firewallRuleGroupId, updateFirewallRuleRequest.firewallRuleGroupId) &&
        Objects.equals(this.firewallDomainListId, updateFirewallRuleRequest.firewallDomainListId) &&
        Objects.equals(this.priority, updateFirewallRuleRequest.priority) &&
        Objects.equals(this.action, updateFirewallRuleRequest.action) &&
        Objects.equals(this.blockResponse, updateFirewallRuleRequest.blockResponse) &&
        Objects.equals(this.blockOverrideDomain, updateFirewallRuleRequest.blockOverrideDomain) &&
        Objects.equals(this.blockOverrideDnsType, updateFirewallRuleRequest.blockOverrideDnsType) &&
        Objects.equals(this.blockOverrideTtl, updateFirewallRuleRequest.blockOverrideTtl) &&
        Objects.equals(this.name, updateFirewallRuleRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firewallRuleGroupId, firewallDomainListId, priority, action, blockResponse, blockOverrideDomain, blockOverrideDnsType, blockOverrideTtl, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFirewallRuleRequest {\n");
    sb.append("    firewallRuleGroupId: ").append(toIndentedString(firewallRuleGroupId)).append("\n");
    sb.append("    firewallDomainListId: ").append(toIndentedString(firewallDomainListId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    blockResponse: ").append(toIndentedString(blockResponse)).append("\n");
    sb.append("    blockOverrideDomain: ").append(toIndentedString(blockOverrideDomain)).append("\n");
    sb.append("    blockOverrideDnsType: ").append(toIndentedString(blockOverrideDnsType)).append("\n");
    sb.append("    blockOverrideTtl: ").append(toIndentedString(blockOverrideTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("FirewallDomainListId");
    openapiFields.add("Priority");
    openapiFields.add("Action");
    openapiFields.add("BlockResponse");
    openapiFields.add("BlockOverrideDomain");
    openapiFields.add("BlockOverrideDnsType");
    openapiFields.add("BlockOverrideTtl");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FirewallRuleGroupId");
    openapiRequiredFields.add("FirewallDomainListId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateFirewallRuleRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFirewallRuleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFirewallRuleRequest is not found in the empty JSON string", UpdateFirewallRuleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFirewallRuleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFirewallRuleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateFirewallRuleRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `FirewallRuleGroupId`
      String.validateJsonElement(jsonObj.get("FirewallRuleGroupId"));
      // validate the required field `FirewallDomainListId`
      String.validateJsonElement(jsonObj.get("FirewallDomainListId"));
      // validate the optional field `Priority`
      if (jsonObj.get("Priority") != null && !jsonObj.get("Priority").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Priority"));
      }
      // validate the optional field `Action`
      if (jsonObj.get("Action") != null && !jsonObj.get("Action").isJsonNull()) {
        Action.validateJsonElement(jsonObj.get("Action"));
      }
      // validate the optional field `BlockResponse`
      if (jsonObj.get("BlockResponse") != null && !jsonObj.get("BlockResponse").isJsonNull()) {
        BlockResponse.validateJsonElement(jsonObj.get("BlockResponse"));
      }
      // validate the optional field `BlockOverrideDomain`
      if (jsonObj.get("BlockOverrideDomain") != null && !jsonObj.get("BlockOverrideDomain").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BlockOverrideDomain"));
      }
      // validate the optional field `BlockOverrideDnsType`
      if (jsonObj.get("BlockOverrideDnsType") != null && !jsonObj.get("BlockOverrideDnsType").isJsonNull()) {
        BlockOverrideDnsType.validateJsonElement(jsonObj.get("BlockOverrideDnsType"));
      }
      // validate the optional field `BlockOverrideTtl`
      if (jsonObj.get("BlockOverrideTtl") != null && !jsonObj.get("BlockOverrideTtl").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("BlockOverrideTtl"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFirewallRuleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFirewallRuleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFirewallRuleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFirewallRuleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFirewallRuleRequest>() {
           @Override
           public void write(JsonWriter out, UpdateFirewallRuleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFirewallRuleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateFirewallRuleRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateFirewallRuleRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateFirewallRuleRequest
   */
  public static UpdateFirewallRuleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFirewallRuleRequest.class);
  }

  /**
   * Convert an instance of UpdateFirewallRuleRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

