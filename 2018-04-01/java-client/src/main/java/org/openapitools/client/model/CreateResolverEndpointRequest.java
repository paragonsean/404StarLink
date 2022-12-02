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
 * CreateResolverEndpointRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:27.024022-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateResolverEndpointRequest {
  public static final String SERIALIZED_NAME_CREATOR_REQUEST_ID = "CreatorRequestId";
  @SerializedName(SERIALIZED_NAME_CREATOR_REQUEST_ID)
  private String creatorRequestId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
  private List securityGroupIds;

  public static final String SERIALIZED_NAME_DIRECTION = "Direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private ResolverEndpointDirection direction;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "IpAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List ipAddresses;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_RESOLVER_ENDPOINT_TYPE = "ResolverEndpointType";
  @SerializedName(SERIALIZED_NAME_RESOLVER_ENDPOINT_TYPE)
  private ResolverEndpointType resolverEndpointType;

  public CreateResolverEndpointRequest() {
  }

  public CreateResolverEndpointRequest creatorRequestId(String creatorRequestId) {
    this.creatorRequestId = creatorRequestId;
    return this;
  }

  /**
   * Get creatorRequestId
   * @return creatorRequestId
   */
  @javax.annotation.Nonnull
  public String getCreatorRequestId() {
    return creatorRequestId;
  }

  public void setCreatorRequestId(String creatorRequestId) {
    this.creatorRequestId = creatorRequestId;
  }


  public CreateResolverEndpointRequest name(String name) {
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


  public CreateResolverEndpointRequest securityGroupIds(List securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  /**
   * Get securityGroupIds
   * @return securityGroupIds
   */
  @javax.annotation.Nonnull
  public List getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }


  public CreateResolverEndpointRequest direction(ResolverEndpointDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nonnull
  public ResolverEndpointDirection getDirection() {
    return direction;
  }

  public void setDirection(ResolverEndpointDirection direction) {
    this.direction = direction;
  }


  public CreateResolverEndpointRequest ipAddresses(List ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * Get ipAddresses
   * @return ipAddresses
   */
  @javax.annotation.Nonnull
  public List getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public CreateResolverEndpointRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public CreateResolverEndpointRequest resolverEndpointType(ResolverEndpointType resolverEndpointType) {
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
    CreateResolverEndpointRequest createResolverEndpointRequest = (CreateResolverEndpointRequest) o;
    return Objects.equals(this.creatorRequestId, createResolverEndpointRequest.creatorRequestId) &&
        Objects.equals(this.name, createResolverEndpointRequest.name) &&
        Objects.equals(this.securityGroupIds, createResolverEndpointRequest.securityGroupIds) &&
        Objects.equals(this.direction, createResolverEndpointRequest.direction) &&
        Objects.equals(this.ipAddresses, createResolverEndpointRequest.ipAddresses) &&
        Objects.equals(this.tags, createResolverEndpointRequest.tags) &&
        Objects.equals(this.resolverEndpointType, createResolverEndpointRequest.resolverEndpointType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorRequestId, name, securityGroupIds, direction, ipAddresses, tags, resolverEndpointType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateResolverEndpointRequest {\n");
    sb.append("    creatorRequestId: ").append(toIndentedString(creatorRequestId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("CreatorRequestId");
    openapiFields.add("Name");
    openapiFields.add("SecurityGroupIds");
    openapiFields.add("Direction");
    openapiFields.add("IpAddresses");
    openapiFields.add("Tags");
    openapiFields.add("ResolverEndpointType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CreatorRequestId");
    openapiRequiredFields.add("SecurityGroupIds");
    openapiRequiredFields.add("Direction");
    openapiRequiredFields.add("IpAddresses");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateResolverEndpointRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateResolverEndpointRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateResolverEndpointRequest is not found in the empty JSON string", CreateResolverEndpointRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateResolverEndpointRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateResolverEndpointRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateResolverEndpointRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CreatorRequestId`
      String.validateJsonElement(jsonObj.get("CreatorRequestId"));
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the required field `SecurityGroupIds`
      List.validateJsonElement(jsonObj.get("SecurityGroupIds"));
      // validate the required field `Direction`
      ResolverEndpointDirection.validateJsonElement(jsonObj.get("Direction"));
      // validate the required field `IpAddresses`
      List.validateJsonElement(jsonObj.get("IpAddresses"));
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
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
       if (!CreateResolverEndpointRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateResolverEndpointRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateResolverEndpointRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateResolverEndpointRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateResolverEndpointRequest>() {
           @Override
           public void write(JsonWriter out, CreateResolverEndpointRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateResolverEndpointRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateResolverEndpointRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateResolverEndpointRequest
   * @throws IOException if the JSON string is invalid with respect to CreateResolverEndpointRequest
   */
  public static CreateResolverEndpointRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateResolverEndpointRequest.class);
  }

  /**
   * Convert an instance of CreateResolverEndpointRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

