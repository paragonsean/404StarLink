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
import org.openapitools.client.model.MutationProtectionStatus;

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
 * An association between a firewall rule group and a VPC, which enables DNS filtering for the VPC. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:22.540130-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FirewallRuleGroupAssociation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_FIREWALL_RULE_GROUP_ID = "FirewallRuleGroupId";
  @SerializedName(SERIALIZED_NAME_FIREWALL_RULE_GROUP_ID)
  private String firewallRuleGroupId;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "Priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_MUTATION_PROTECTION = "MutationProtection";
  @SerializedName(SERIALIZED_NAME_MUTATION_PROTECTION)
  private MutationProtectionStatus mutationProtection;

  public static final String SERIALIZED_NAME_MANAGED_OWNER_NAME = "ManagedOwnerName";
  @SerializedName(SERIALIZED_NAME_MANAGED_OWNER_NAME)
  private String managedOwnerName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FirewallRuleGroupAssociationStatus status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "StatusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_CREATOR_REQUEST_ID = "CreatorRequestId";
  @SerializedName(SERIALIZED_NAME_CREATOR_REQUEST_ID)
  private String creatorRequestId;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private String creationTime;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME = "ModificationTime";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME)
  private String modificationTime;

  public FirewallRuleGroupAssociation() {
  }

  public FirewallRuleGroupAssociation id(String id) {
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


  public FirewallRuleGroupAssociation arn(String arn) {
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


  public FirewallRuleGroupAssociation firewallRuleGroupId(String firewallRuleGroupId) {
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


  public FirewallRuleGroupAssociation vpcId(String vpcId) {
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


  public FirewallRuleGroupAssociation name(String name) {
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


  public FirewallRuleGroupAssociation priority(Integer priority) {
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


  public FirewallRuleGroupAssociation mutationProtection(MutationProtectionStatus mutationProtection) {
    this.mutationProtection = mutationProtection;
    return this;
  }

  /**
   * Get mutationProtection
   * @return mutationProtection
   */
  @javax.annotation.Nullable
  public MutationProtectionStatus getMutationProtection() {
    return mutationProtection;
  }

  public void setMutationProtection(MutationProtectionStatus mutationProtection) {
    this.mutationProtection = mutationProtection;
  }


  public FirewallRuleGroupAssociation managedOwnerName(String managedOwnerName) {
    this.managedOwnerName = managedOwnerName;
    return this;
  }

  /**
   * Get managedOwnerName
   * @return managedOwnerName
   */
  @javax.annotation.Nullable
  public String getManagedOwnerName() {
    return managedOwnerName;
  }

  public void setManagedOwnerName(String managedOwnerName) {
    this.managedOwnerName = managedOwnerName;
  }


  public FirewallRuleGroupAssociation status(FirewallRuleGroupAssociationStatus status) {
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


  public FirewallRuleGroupAssociation statusMessage(String statusMessage) {
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


  public FirewallRuleGroupAssociation creatorRequestId(String creatorRequestId) {
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


  public FirewallRuleGroupAssociation creationTime(String creationTime) {
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


  public FirewallRuleGroupAssociation modificationTime(String modificationTime) {
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
    FirewallRuleGroupAssociation firewallRuleGroupAssociation = (FirewallRuleGroupAssociation) o;
    return Objects.equals(this.id, firewallRuleGroupAssociation.id) &&
        Objects.equals(this.arn, firewallRuleGroupAssociation.arn) &&
        Objects.equals(this.firewallRuleGroupId, firewallRuleGroupAssociation.firewallRuleGroupId) &&
        Objects.equals(this.vpcId, firewallRuleGroupAssociation.vpcId) &&
        Objects.equals(this.name, firewallRuleGroupAssociation.name) &&
        Objects.equals(this.priority, firewallRuleGroupAssociation.priority) &&
        Objects.equals(this.mutationProtection, firewallRuleGroupAssociation.mutationProtection) &&
        Objects.equals(this.managedOwnerName, firewallRuleGroupAssociation.managedOwnerName) &&
        Objects.equals(this.status, firewallRuleGroupAssociation.status) &&
        Objects.equals(this.statusMessage, firewallRuleGroupAssociation.statusMessage) &&
        Objects.equals(this.creatorRequestId, firewallRuleGroupAssociation.creatorRequestId) &&
        Objects.equals(this.creationTime, firewallRuleGroupAssociation.creationTime) &&
        Objects.equals(this.modificationTime, firewallRuleGroupAssociation.modificationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, arn, firewallRuleGroupId, vpcId, name, priority, mutationProtection, managedOwnerName, status, statusMessage, creatorRequestId, creationTime, modificationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallRuleGroupAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    firewallRuleGroupId: ").append(toIndentedString(firewallRuleGroupId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    mutationProtection: ").append(toIndentedString(mutationProtection)).append("\n");
    sb.append("    managedOwnerName: ").append(toIndentedString(managedOwnerName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    creatorRequestId: ").append(toIndentedString(creatorRequestId)).append("\n");
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
    openapiFields.add("Arn");
    openapiFields.add("FirewallRuleGroupId");
    openapiFields.add("VpcId");
    openapiFields.add("Name");
    openapiFields.add("Priority");
    openapiFields.add("MutationProtection");
    openapiFields.add("ManagedOwnerName");
    openapiFields.add("Status");
    openapiFields.add("StatusMessage");
    openapiFields.add("CreatorRequestId");
    openapiFields.add("CreationTime");
    openapiFields.add("ModificationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FirewallRuleGroupAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallRuleGroupAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallRuleGroupAssociation is not found in the empty JSON string", FirewallRuleGroupAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallRuleGroupAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallRuleGroupAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `FirewallRuleGroupId`
      if (jsonObj.get("FirewallRuleGroupId") != null && !jsonObj.get("FirewallRuleGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirewallRuleGroupId"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Priority`
      if (jsonObj.get("Priority") != null && !jsonObj.get("Priority").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Priority"));
      }
      // validate the optional field `MutationProtection`
      if (jsonObj.get("MutationProtection") != null && !jsonObj.get("MutationProtection").isJsonNull()) {
        MutationProtectionStatus.validateJsonElement(jsonObj.get("MutationProtection"));
      }
      // validate the optional field `ManagedOwnerName`
      if (jsonObj.get("ManagedOwnerName") != null && !jsonObj.get("ManagedOwnerName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ManagedOwnerName"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        FirewallRuleGroupAssociationStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `StatusMessage`
      if (jsonObj.get("StatusMessage") != null && !jsonObj.get("StatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusMessage"));
      }
      // validate the optional field `CreatorRequestId`
      if (jsonObj.get("CreatorRequestId") != null && !jsonObj.get("CreatorRequestId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatorRequestId"));
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
       if (!FirewallRuleGroupAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallRuleGroupAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallRuleGroupAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallRuleGroupAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallRuleGroupAssociation>() {
           @Override
           public void write(JsonWriter out, FirewallRuleGroupAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallRuleGroupAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FirewallRuleGroupAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FirewallRuleGroupAssociation
   * @throws IOException if the JSON string is invalid with respect to FirewallRuleGroupAssociation
   */
  public static FirewallRuleGroupAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallRuleGroupAssociation.class);
  }

  /**
   * Convert an instance of FirewallRuleGroupAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

