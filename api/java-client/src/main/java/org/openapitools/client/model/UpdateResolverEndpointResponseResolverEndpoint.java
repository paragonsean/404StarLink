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
import org.openapitools.client.model.ResolverEndpointDirection;
import org.openapitools.client.model.ResolverEndpointStatus;
import org.openapitools.client.model.ResolverEndpointType;

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
 * UpdateResolverEndpointResponseResolverEndpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:17.414717-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateResolverEndpointResponseResolverEndpoint {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATOR_REQUEST_ID = "CreatorRequestId";
  @SerializedName(SERIALIZED_NAME_CREATOR_REQUEST_ID)
  private String creatorRequestId;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
  private List securityGroupIds;

  public static final String SERIALIZED_NAME_DIRECTION = "Direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private ResolverEndpointDirection direction;

  public static final String SERIALIZED_NAME_IP_ADDRESS_COUNT = "IpAddressCount";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_COUNT)
  private Integer ipAddressCount;

  public static final String SERIALIZED_NAME_HOST_V_P_C_ID = "HostVPCId";
  @SerializedName(SERIALIZED_NAME_HOST_V_P_C_ID)
  private String hostVPCId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ResolverEndpointStatus status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "StatusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private String creationTime;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME = "ModificationTime";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME)
  private String modificationTime;

  public static final String SERIALIZED_NAME_RESOLVER_ENDPOINT_TYPE = "ResolverEndpointType";
  @SerializedName(SERIALIZED_NAME_RESOLVER_ENDPOINT_TYPE)
  private ResolverEndpointType resolverEndpointType;

  public UpdateResolverEndpointResponseResolverEndpoint() {
  }

  public UpdateResolverEndpointResponseResolverEndpoint id(String id) {
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


  public UpdateResolverEndpointResponseResolverEndpoint creatorRequestId(String creatorRequestId) {
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


  public UpdateResolverEndpointResponseResolverEndpoint arn(String arn) {
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


  public UpdateResolverEndpointResponseResolverEndpoint name(String name) {
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


  public UpdateResolverEndpointResponseResolverEndpoint securityGroupIds(List securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  /**
   * Get securityGroupIds
   * @return securityGroupIds
   */
  @javax.annotation.Nullable
  public List getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }


  public UpdateResolverEndpointResponseResolverEndpoint direction(ResolverEndpointDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nullable
  public ResolverEndpointDirection getDirection() {
    return direction;
  }

  public void setDirection(ResolverEndpointDirection direction) {
    this.direction = direction;
  }


  public UpdateResolverEndpointResponseResolverEndpoint ipAddressCount(Integer ipAddressCount) {
    this.ipAddressCount = ipAddressCount;
    return this;
  }

  /**
   * Get ipAddressCount
   * @return ipAddressCount
   */
  @javax.annotation.Nullable
  public Integer getIpAddressCount() {
    return ipAddressCount;
  }

  public void setIpAddressCount(Integer ipAddressCount) {
    this.ipAddressCount = ipAddressCount;
  }


  public UpdateResolverEndpointResponseResolverEndpoint hostVPCId(String hostVPCId) {
    this.hostVPCId = hostVPCId;
    return this;
  }

  /**
   * Get hostVPCId
   * @return hostVPCId
   */
  @javax.annotation.Nullable
  public String getHostVPCId() {
    return hostVPCId;
  }

  public void setHostVPCId(String hostVPCId) {
    this.hostVPCId = hostVPCId;
  }


  public UpdateResolverEndpointResponseResolverEndpoint status(ResolverEndpointStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ResolverEndpointStatus getStatus() {
    return status;
  }

  public void setStatus(ResolverEndpointStatus status) {
    this.status = status;
  }


  public UpdateResolverEndpointResponseResolverEndpoint statusMessage(String statusMessage) {
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


  public UpdateResolverEndpointResponseResolverEndpoint creationTime(String creationTime) {
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


  public UpdateResolverEndpointResponseResolverEndpoint modificationTime(String modificationTime) {
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


  public UpdateResolverEndpointResponseResolverEndpoint resolverEndpointType(ResolverEndpointType resolverEndpointType) {
    this.resolverEndpointType = resolverEndpointType;
    return this;
  }

  /**
   * Get resolverEndpointType
   * @return resolverEndpointType
   */
  @javax.annotation.Nullable
  public ResolverEndpointType getResolverEndpointType() {
    return resolverEndpointType;
  }

  public void setResolverEndpointType(ResolverEndpointType resolverEndpointType) {
    this.resolverEndpointType = resolverEndpointType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResolverEndpointResponseResolverEndpoint updateResolverEndpointResponseResolverEndpoint = (UpdateResolverEndpointResponseResolverEndpoint) o;
    return Objects.equals(this.id, updateResolverEndpointResponseResolverEndpoint.id) &&
        Objects.equals(this.creatorRequestId, updateResolverEndpointResponseResolverEndpoint.creatorRequestId) &&
        Objects.equals(this.arn, updateResolverEndpointResponseResolverEndpoint.arn) &&
        Objects.equals(this.name, updateResolverEndpointResponseResolverEndpoint.name) &&
        Objects.equals(this.securityGroupIds, updateResolverEndpointResponseResolverEndpoint.securityGroupIds) &&
        Objects.equals(this.direction, updateResolverEndpointResponseResolverEndpoint.direction) &&
        Objects.equals(this.ipAddressCount, updateResolverEndpointResponseResolverEndpoint.ipAddressCount) &&
        Objects.equals(this.hostVPCId, updateResolverEndpointResponseResolverEndpoint.hostVPCId) &&
        Objects.equals(this.status, updateResolverEndpointResponseResolverEndpoint.status) &&
        Objects.equals(this.statusMessage, updateResolverEndpointResponseResolverEndpoint.statusMessage) &&
        Objects.equals(this.creationTime, updateResolverEndpointResponseResolverEndpoint.creationTime) &&
        Objects.equals(this.modificationTime, updateResolverEndpointResponseResolverEndpoint.modificationTime) &&
        Objects.equals(this.resolverEndpointType, updateResolverEndpointResponseResolverEndpoint.resolverEndpointType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creatorRequestId, arn, name, securityGroupIds, direction, ipAddressCount, hostVPCId, status, statusMessage, creationTime, modificationTime, resolverEndpointType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResolverEndpointResponseResolverEndpoint {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creatorRequestId: ").append(toIndentedString(creatorRequestId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ipAddressCount: ").append(toIndentedString(ipAddressCount)).append("\n");
    sb.append("    hostVPCId: ").append(toIndentedString(hostVPCId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    modificationTime: ").append(toIndentedString(modificationTime)).append("\n");
    sb.append("    resolverEndpointType: ").append(toIndentedString(resolverEndpointType)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("SecurityGroupIds");
    openapiFields.add("Direction");
    openapiFields.add("IpAddressCount");
    openapiFields.add("HostVPCId");
    openapiFields.add("Status");
    openapiFields.add("StatusMessage");
    openapiFields.add("CreationTime");
    openapiFields.add("ModificationTime");
    openapiFields.add("ResolverEndpointType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateResolverEndpointResponseResolverEndpoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateResolverEndpointResponseResolverEndpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateResolverEndpointResponseResolverEndpoint is not found in the empty JSON string", UpdateResolverEndpointResponseResolverEndpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateResolverEndpointResponseResolverEndpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateResolverEndpointResponseResolverEndpoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `SecurityGroupIds`
      if (jsonObj.get("SecurityGroupIds") != null && !jsonObj.get("SecurityGroupIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SecurityGroupIds"));
      }
      // validate the optional field `Direction`
      if (jsonObj.get("Direction") != null && !jsonObj.get("Direction").isJsonNull()) {
        ResolverEndpointDirection.validateJsonElement(jsonObj.get("Direction"));
      }
      // validate the optional field `IpAddressCount`
      if (jsonObj.get("IpAddressCount") != null && !jsonObj.get("IpAddressCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("IpAddressCount"));
      }
      // validate the optional field `HostVPCId`
      if (jsonObj.get("HostVPCId") != null && !jsonObj.get("HostVPCId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HostVPCId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ResolverEndpointStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `StatusMessage`
      if (jsonObj.get("StatusMessage") != null && !jsonObj.get("StatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusMessage"));
      }
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreationTime"));
      }
      // validate the optional field `ModificationTime`
      if (jsonObj.get("ModificationTime") != null && !jsonObj.get("ModificationTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ModificationTime"));
      }
      // validate the optional field `ResolverEndpointType`
      if (jsonObj.get("ResolverEndpointType") != null && !jsonObj.get("ResolverEndpointType").isJsonNull()) {
        ResolverEndpointType.validateJsonElement(jsonObj.get("ResolverEndpointType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateResolverEndpointResponseResolverEndpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateResolverEndpointResponseResolverEndpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateResolverEndpointResponseResolverEndpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateResolverEndpointResponseResolverEndpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateResolverEndpointResponseResolverEndpoint>() {
           @Override
           public void write(JsonWriter out, UpdateResolverEndpointResponseResolverEndpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateResolverEndpointResponseResolverEndpoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateResolverEndpointResponseResolverEndpoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateResolverEndpointResponseResolverEndpoint
   * @throws IOException if the JSON string is invalid with respect to UpdateResolverEndpointResponseResolverEndpoint
   */
  public static UpdateResolverEndpointResponseResolverEndpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateResolverEndpointResponseResolverEndpoint.class);
  }

  /**
   * Convert an instance of UpdateResolverEndpointResponseResolverEndpoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

