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
import java.util.List;
import org.openapitools.client.model.ResolverRuleStatus;
import org.openapitools.client.model.RuleTypeOption;
import org.openapitools.client.model.ShareStatus;

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
 * DeleteResolverRuleResponseResolverRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:22.281937-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeleteResolverRuleResponseResolverRule {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATOR_REQUEST_ID = "CreatorRequestId";
  @SerializedName(SERIALIZED_NAME_CREATOR_REQUEST_ID)
  private String creatorRequestId;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ResolverRuleStatus status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "StatusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_RULE_TYPE = "RuleType";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private RuleTypeOption ruleType;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_IPS = "TargetIps";
  @SerializedName(SERIALIZED_NAME_TARGET_IPS)
  private List targetIps;

  public static final String SERIALIZED_NAME_RESOLVER_ENDPOINT_ID = "ResolverEndpointId";
  @SerializedName(SERIALIZED_NAME_RESOLVER_ENDPOINT_ID)
  private String resolverEndpointId;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_SHARE_STATUS = "ShareStatus";
  @SerializedName(SERIALIZED_NAME_SHARE_STATUS)
  private ShareStatus shareStatus;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private String creationTime;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME = "ModificationTime";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME)
  private String modificationTime;

  public DeleteResolverRuleResponseResolverRule() {
  }

  public DeleteResolverRuleResponseResolverRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DeleteResolverRuleResponseResolverRule creatorRequestId(String creatorRequestId) {
    this.creatorRequestId = creatorRequestId;
    return this;
  }

  /**
   * Get creatorRequestId
   * @return creatorRequestId
   */
  @javax.annotation.Nullable
  public String getCreatorRequestId() {
    return creatorRequestId;
  }

  public void setCreatorRequestId(String creatorRequestId) {
    this.creatorRequestId = creatorRequestId;
  }


  public DeleteResolverRuleResponseResolverRule arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public DeleteResolverRuleResponseResolverRule domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public DeleteResolverRuleResponseResolverRule status(ResolverRuleStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ResolverRuleStatus getStatus() {
    return status;
  }

  public void setStatus(ResolverRuleStatus status) {
    this.status = status;
  }


  public DeleteResolverRuleResponseResolverRule statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public DeleteResolverRuleResponseResolverRule ruleType(RuleTypeOption ruleType) {
    this.ruleType = ruleType;
    return this;
  }

  /**
   * Get ruleType
   * @return ruleType
   */
  @javax.annotation.Nullable
  public RuleTypeOption getRuleType() {
    return ruleType;
  }

  public void setRuleType(RuleTypeOption ruleType) {
    this.ruleType = ruleType;
  }


  public DeleteResolverRuleResponseResolverRule name(String name) {
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


  public DeleteResolverRuleResponseResolverRule targetIps(List targetIps) {
    this.targetIps = targetIps;
    return this;
  }

  /**
   * Get targetIps
   * @return targetIps
   */
  @javax.annotation.Nullable
  public List getTargetIps() {
    return targetIps;
  }

  public void setTargetIps(List targetIps) {
    this.targetIps = targetIps;
  }


  public DeleteResolverRuleResponseResolverRule resolverEndpointId(String resolverEndpointId) {
    this.resolverEndpointId = resolverEndpointId;
    return this;
  }

  /**
   * Get resolverEndpointId
   * @return resolverEndpointId
   */
  @javax.annotation.Nullable
  public String getResolverEndpointId() {
    return resolverEndpointId;
  }

  public void setResolverEndpointId(String resolverEndpointId) {
    this.resolverEndpointId = resolverEndpointId;
  }


  public DeleteResolverRuleResponseResolverRule ownerId(String ownerId) {
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


  public DeleteResolverRuleResponseResolverRule shareStatus(ShareStatus shareStatus) {
    this.shareStatus = shareStatus;
    return this;
  }

  /**
   * Get shareStatus
   * @return shareStatus
   */
  @javax.annotation.Nullable
  public ShareStatus getShareStatus() {
    return shareStatus;
  }

  public void setShareStatus(ShareStatus shareStatus) {
    this.shareStatus = shareStatus;
  }


  public DeleteResolverRuleResponseResolverRule creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
   */
  @javax.annotation.Nullable
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }


  public DeleteResolverRuleResponseResolverRule modificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }

  /**
   * Get modificationTime
   * @return modificationTime
   */
  @javax.annotation.Nullable
  public String getModificationTime() {
    return modificationTime;
  }

  public void setModificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteResolverRuleResponseResolverRule deleteResolverRuleResponseResolverRule = (DeleteResolverRuleResponseResolverRule) o;
    return Objects.equals(this.id, deleteResolverRuleResponseResolverRule.id) &&
        Objects.equals(this.creatorRequestId, deleteResolverRuleResponseResolverRule.creatorRequestId) &&
        Objects.equals(this.arn, deleteResolverRuleResponseResolverRule.arn) &&
        Objects.equals(this.domainName, deleteResolverRuleResponseResolverRule.domainName) &&
        Objects.equals(this.status, deleteResolverRuleResponseResolverRule.status) &&
        Objects.equals(this.statusMessage, deleteResolverRuleResponseResolverRule.statusMessage) &&
        Objects.equals(this.ruleType, deleteResolverRuleResponseResolverRule.ruleType) &&
        Objects.equals(this.name, deleteResolverRuleResponseResolverRule.name) &&
        Objects.equals(this.targetIps, deleteResolverRuleResponseResolverRule.targetIps) &&
        Objects.equals(this.resolverEndpointId, deleteResolverRuleResponseResolverRule.resolverEndpointId) &&
        Objects.equals(this.ownerId, deleteResolverRuleResponseResolverRule.ownerId) &&
        Objects.equals(this.shareStatus, deleteResolverRuleResponseResolverRule.shareStatus) &&
        Objects.equals(this.creationTime, deleteResolverRuleResponseResolverRule.creationTime) &&
        Objects.equals(this.modificationTime, deleteResolverRuleResponseResolverRule.modificationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creatorRequestId, arn, domainName, status, statusMessage, ruleType, name, targetIps, resolverEndpointId, ownerId, shareStatus, creationTime, modificationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteResolverRuleResponseResolverRule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creatorRequestId: ").append(toIndentedString(creatorRequestId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetIps: ").append(toIndentedString(targetIps)).append("\n");
    sb.append("    resolverEndpointId: ").append(toIndentedString(resolverEndpointId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    shareStatus: ").append(toIndentedString(shareStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    modificationTime: ").append(toIndentedString(modificationTime)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("CreatorRequestId");
    openapiFields.add("Arn");
    openapiFields.add("DomainName");
    openapiFields.add("Status");
    openapiFields.add("StatusMessage");
    openapiFields.add("RuleType");
    openapiFields.add("Name");
    openapiFields.add("TargetIps");
    openapiFields.add("ResolverEndpointId");
    openapiFields.add("OwnerId");
    openapiFields.add("ShareStatus");
    openapiFields.add("CreationTime");
    openapiFields.add("ModificationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteResolverRuleResponseResolverRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteResolverRuleResponseResolverRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteResolverRuleResponseResolverRule is not found in the empty JSON string", DeleteResolverRuleResponseResolverRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteResolverRuleResponseResolverRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteResolverRuleResponseResolverRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `CreatorRequestId`
      if (jsonObj.get("CreatorRequestId") != null && !jsonObj.get("CreatorRequestId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatorRequestId"));
      }
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ResolverRuleStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `StatusMessage`
      if (jsonObj.get("StatusMessage") != null && !jsonObj.get("StatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusMessage"));
      }
      // validate the optional field `RuleType`
      if (jsonObj.get("RuleType") != null && !jsonObj.get("RuleType").isJsonNull()) {
        RuleTypeOption.validateJsonElement(jsonObj.get("RuleType"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `TargetIps`
      if (jsonObj.get("TargetIps") != null && !jsonObj.get("TargetIps").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TargetIps"));
      }
      // validate the optional field `ResolverEndpointId`
      if (jsonObj.get("ResolverEndpointId") != null && !jsonObj.get("ResolverEndpointId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResolverEndpointId"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `ShareStatus`
      if (jsonObj.get("ShareStatus") != null && !jsonObj.get("ShareStatus").isJsonNull()) {
        ShareStatus.validateJsonElement(jsonObj.get("ShareStatus"));
      }
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreationTime"));
      }
      // validate the optional field `ModificationTime`
      if (jsonObj.get("ModificationTime") != null && !jsonObj.get("ModificationTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ModificationTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteResolverRuleResponseResolverRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteResolverRuleResponseResolverRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteResolverRuleResponseResolverRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteResolverRuleResponseResolverRule.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteResolverRuleResponseResolverRule>() {
           @Override
           public void write(JsonWriter out, DeleteResolverRuleResponseResolverRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteResolverRuleResponseResolverRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteResolverRuleResponseResolverRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteResolverRuleResponseResolverRule
   * @throws IOException if the JSON string is invalid with respect to DeleteResolverRuleResponseResolverRule
   */
  public static DeleteResolverRuleResponseResolverRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteResolverRuleResponseResolverRule.class);
  }

  /**
   * Convert an instance of DeleteResolverRuleResponseResolverRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

