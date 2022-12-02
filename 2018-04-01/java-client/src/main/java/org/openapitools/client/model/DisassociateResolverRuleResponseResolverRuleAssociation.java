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
import org.openapitools.client.model.ResolverRuleAssociationStatus;

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
 * DisassociateResolverRuleResponseResolverRuleAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:27.024022-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DisassociateResolverRuleResponseResolverRuleAssociation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RESOLVER_RULE_ID = "ResolverRuleId";
  @SerializedName(SERIALIZED_NAME_RESOLVER_RULE_ID)
  private String resolverRuleId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VP_C_ID = "VPCId";
  @SerializedName(SERIALIZED_NAME_VP_C_ID)
  private String vpCId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ResolverRuleAssociationStatus status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "StatusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public DisassociateResolverRuleResponseResolverRuleAssociation() {
  }

  public DisassociateResolverRuleResponseResolverRuleAssociation id(String id) {
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


  public DisassociateResolverRuleResponseResolverRuleAssociation resolverRuleId(String resolverRuleId) {
    this.resolverRuleId = resolverRuleId;
    return this;
  }

  /**
   * Get resolverRuleId
   * @return resolverRuleId
   */
  @javax.annotation.Nullable
  public String getResolverRuleId() {
    return resolverRuleId;
  }

  public void setResolverRuleId(String resolverRuleId) {
    this.resolverRuleId = resolverRuleId;
  }


  public DisassociateResolverRuleResponseResolverRuleAssociation name(String name) {
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


  public DisassociateResolverRuleResponseResolverRuleAssociation vpCId(String vpCId) {
    this.vpCId = vpCId;
    return this;
  }

  /**
   * Get vpCId
   * @return vpCId
   */
  @javax.annotation.Nullable
  public String getVpCId() {
    return vpCId;
  }

  public void setVpCId(String vpCId) {
    this.vpCId = vpCId;
  }


  public DisassociateResolverRuleResponseResolverRuleAssociation status(ResolverRuleAssociationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ResolverRuleAssociationStatus getStatus() {
    return status;
  }

  public void setStatus(ResolverRuleAssociationStatus status) {
    this.status = status;
  }


  public DisassociateResolverRuleResponseResolverRuleAssociation statusMessage(String statusMessage) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisassociateResolverRuleResponseResolverRuleAssociation disassociateResolverRuleResponseResolverRuleAssociation = (DisassociateResolverRuleResponseResolverRuleAssociation) o;
    return Objects.equals(this.id, disassociateResolverRuleResponseResolverRuleAssociation.id) &&
        Objects.equals(this.resolverRuleId, disassociateResolverRuleResponseResolverRuleAssociation.resolverRuleId) &&
        Objects.equals(this.name, disassociateResolverRuleResponseResolverRuleAssociation.name) &&
        Objects.equals(this.vpCId, disassociateResolverRuleResponseResolverRuleAssociation.vpCId) &&
        Objects.equals(this.status, disassociateResolverRuleResponseResolverRuleAssociation.status) &&
        Objects.equals(this.statusMessage, disassociateResolverRuleResponseResolverRuleAssociation.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resolverRuleId, name, vpCId, status, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisassociateResolverRuleResponseResolverRuleAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resolverRuleId: ").append(toIndentedString(resolverRuleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vpCId: ").append(toIndentedString(vpCId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
    openapiFields.add("ResolverRuleId");
    openapiFields.add("Name");
    openapiFields.add("VPCId");
    openapiFields.add("Status");
    openapiFields.add("StatusMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DisassociateResolverRuleResponseResolverRuleAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DisassociateResolverRuleResponseResolverRuleAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisassociateResolverRuleResponseResolverRuleAssociation is not found in the empty JSON string", DisassociateResolverRuleResponseResolverRuleAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DisassociateResolverRuleResponseResolverRuleAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DisassociateResolverRuleResponseResolverRuleAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `ResolverRuleId`
      if (jsonObj.get("ResolverRuleId") != null && !jsonObj.get("ResolverRuleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResolverRuleId"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `VPCId`
      if (jsonObj.get("VPCId") != null && !jsonObj.get("VPCId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VPCId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ResolverRuleAssociationStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `StatusMessage`
      if (jsonObj.get("StatusMessage") != null && !jsonObj.get("StatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisassociateResolverRuleResponseResolverRuleAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisassociateResolverRuleResponseResolverRuleAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisassociateResolverRuleResponseResolverRuleAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisassociateResolverRuleResponseResolverRuleAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<DisassociateResolverRuleResponseResolverRuleAssociation>() {
           @Override
           public void write(JsonWriter out, DisassociateResolverRuleResponseResolverRuleAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisassociateResolverRuleResponseResolverRuleAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DisassociateResolverRuleResponseResolverRuleAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DisassociateResolverRuleResponseResolverRuleAssociation
   * @throws IOException if the JSON string is invalid with respect to DisassociateResolverRuleResponseResolverRuleAssociation
   */
  public static DisassociateResolverRuleResponseResolverRuleAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisassociateResolverRuleResponseResolverRuleAssociation.class);
  }

  /**
   * Convert an instance of DisassociateResolverRuleResponseResolverRuleAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

