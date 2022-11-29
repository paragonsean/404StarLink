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
 * Information about an Amazon Web Services Amazon EC2 Transit Gateway that interconnects virtual private clouds (VPCs) and on-premises networks. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2TransitGatewayDetails {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_ROUTE_TABLE_PROPAGATION = "DefaultRouteTablePropagation";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ROUTE_TABLE_PROPAGATION)
  private String defaultRouteTablePropagation;

  public static final String SERIALIZED_NAME_AUTO_ACCEPT_SHARED_ATTACHMENTS = "AutoAcceptSharedAttachments";
  @SerializedName(SERIALIZED_NAME_AUTO_ACCEPT_SHARED_ATTACHMENTS)
  private String autoAcceptSharedAttachments;

  public static final String SERIALIZED_NAME_DEFAULT_ROUTE_TABLE_ASSOCIATION = "DefaultRouteTableAssociation";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ROUTE_TABLE_ASSOCIATION)
  private String defaultRouteTableAssociation;

  public static final String SERIALIZED_NAME_TRANSIT_GATEWAY_CIDR_BLOCKS = "TransitGatewayCidrBlocks";
  @SerializedName(SERIALIZED_NAME_TRANSIT_GATEWAY_CIDR_BLOCKS)
  private List transitGatewayCidrBlocks;

  public static final String SERIALIZED_NAME_ASSOCIATION_DEFAULT_ROUTE_TABLE_ID = "AssociationDefaultRouteTableId";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_DEFAULT_ROUTE_TABLE_ID)
  private String associationDefaultRouteTableId;

  public static final String SERIALIZED_NAME_PROPAGATION_DEFAULT_ROUTE_TABLE_ID = "PropagationDefaultRouteTableId";
  @SerializedName(SERIALIZED_NAME_PROPAGATION_DEFAULT_ROUTE_TABLE_ID)
  private String propagationDefaultRouteTableId;

  public static final String SERIALIZED_NAME_VPN_ECMP_SUPPORT = "VpnEcmpSupport";
  @SerializedName(SERIALIZED_NAME_VPN_ECMP_SUPPORT)
  private String vpnEcmpSupport;

  public static final String SERIALIZED_NAME_DNS_SUPPORT = "DnsSupport";
  @SerializedName(SERIALIZED_NAME_DNS_SUPPORT)
  private String dnsSupport;

  public static final String SERIALIZED_NAME_MULTICAST_SUPPORT = "MulticastSupport";
  @SerializedName(SERIALIZED_NAME_MULTICAST_SUPPORT)
  private String multicastSupport;

  public static final String SERIALIZED_NAME_AMAZON_SIDE_ASN = "AmazonSideAsn";
  @SerializedName(SERIALIZED_NAME_AMAZON_SIDE_ASN)
  private Integer amazonSideAsn;

  public AwsEc2TransitGatewayDetails() {
  }

  public AwsEc2TransitGatewayDetails id(String id) {
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


  public AwsEc2TransitGatewayDetails description(String description) {
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


  public AwsEc2TransitGatewayDetails defaultRouteTablePropagation(String defaultRouteTablePropagation) {
    this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    return this;
  }

  /**
   * Get defaultRouteTablePropagation
   * @return defaultRouteTablePropagation
   */
  @javax.annotation.Nullable
  public String getDefaultRouteTablePropagation() {
    return defaultRouteTablePropagation;
  }

  public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
    this.defaultRouteTablePropagation = defaultRouteTablePropagation;
  }


  public AwsEc2TransitGatewayDetails autoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
    this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    return this;
  }

  /**
   * Get autoAcceptSharedAttachments
   * @return autoAcceptSharedAttachments
   */
  @javax.annotation.Nullable
  public String getAutoAcceptSharedAttachments() {
    return autoAcceptSharedAttachments;
  }

  public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
    this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
  }


  public AwsEc2TransitGatewayDetails defaultRouteTableAssociation(String defaultRouteTableAssociation) {
    this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    return this;
  }

  /**
   * Get defaultRouteTableAssociation
   * @return defaultRouteTableAssociation
   */
  @javax.annotation.Nullable
  public String getDefaultRouteTableAssociation() {
    return defaultRouteTableAssociation;
  }

  public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
    this.defaultRouteTableAssociation = defaultRouteTableAssociation;
  }


  public AwsEc2TransitGatewayDetails transitGatewayCidrBlocks(List transitGatewayCidrBlocks) {
    this.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
    return this;
  }

  /**
   * Get transitGatewayCidrBlocks
   * @return transitGatewayCidrBlocks
   */
  @javax.annotation.Nullable
  public List getTransitGatewayCidrBlocks() {
    return transitGatewayCidrBlocks;
  }

  public void setTransitGatewayCidrBlocks(List transitGatewayCidrBlocks) {
    this.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
  }


  public AwsEc2TransitGatewayDetails associationDefaultRouteTableId(String associationDefaultRouteTableId) {
    this.associationDefaultRouteTableId = associationDefaultRouteTableId;
    return this;
  }

  /**
   * Get associationDefaultRouteTableId
   * @return associationDefaultRouteTableId
   */
  @javax.annotation.Nullable
  public String getAssociationDefaultRouteTableId() {
    return associationDefaultRouteTableId;
  }

  public void setAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
    this.associationDefaultRouteTableId = associationDefaultRouteTableId;
  }


  public AwsEc2TransitGatewayDetails propagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
    this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
    return this;
  }

  /**
   * Get propagationDefaultRouteTableId
   * @return propagationDefaultRouteTableId
   */
  @javax.annotation.Nullable
  public String getPropagationDefaultRouteTableId() {
    return propagationDefaultRouteTableId;
  }

  public void setPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
    this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
  }


  public AwsEc2TransitGatewayDetails vpnEcmpSupport(String vpnEcmpSupport) {
    this.vpnEcmpSupport = vpnEcmpSupport;
    return this;
  }

  /**
   * Get vpnEcmpSupport
   * @return vpnEcmpSupport
   */
  @javax.annotation.Nullable
  public String getVpnEcmpSupport() {
    return vpnEcmpSupport;
  }

  public void setVpnEcmpSupport(String vpnEcmpSupport) {
    this.vpnEcmpSupport = vpnEcmpSupport;
  }


  public AwsEc2TransitGatewayDetails dnsSupport(String dnsSupport) {
    this.dnsSupport = dnsSupport;
    return this;
  }

  /**
   * Get dnsSupport
   * @return dnsSupport
   */
  @javax.annotation.Nullable
  public String getDnsSupport() {
    return dnsSupport;
  }

  public void setDnsSupport(String dnsSupport) {
    this.dnsSupport = dnsSupport;
  }


  public AwsEc2TransitGatewayDetails multicastSupport(String multicastSupport) {
    this.multicastSupport = multicastSupport;
    return this;
  }

  /**
   * Get multicastSupport
   * @return multicastSupport
   */
  @javax.annotation.Nullable
  public String getMulticastSupport() {
    return multicastSupport;
  }

  public void setMulticastSupport(String multicastSupport) {
    this.multicastSupport = multicastSupport;
  }


  public AwsEc2TransitGatewayDetails amazonSideAsn(Integer amazonSideAsn) {
    this.amazonSideAsn = amazonSideAsn;
    return this;
  }

  /**
   * Get amazonSideAsn
   * @return amazonSideAsn
   */
  @javax.annotation.Nullable
  public Integer getAmazonSideAsn() {
    return amazonSideAsn;
  }

  public void setAmazonSideAsn(Integer amazonSideAsn) {
    this.amazonSideAsn = amazonSideAsn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2TransitGatewayDetails awsEc2TransitGatewayDetails = (AwsEc2TransitGatewayDetails) o;
    return Objects.equals(this.id, awsEc2TransitGatewayDetails.id) &&
        Objects.equals(this.description, awsEc2TransitGatewayDetails.description) &&
        Objects.equals(this.defaultRouteTablePropagation, awsEc2TransitGatewayDetails.defaultRouteTablePropagation) &&
        Objects.equals(this.autoAcceptSharedAttachments, awsEc2TransitGatewayDetails.autoAcceptSharedAttachments) &&
        Objects.equals(this.defaultRouteTableAssociation, awsEc2TransitGatewayDetails.defaultRouteTableAssociation) &&
        Objects.equals(this.transitGatewayCidrBlocks, awsEc2TransitGatewayDetails.transitGatewayCidrBlocks) &&
        Objects.equals(this.associationDefaultRouteTableId, awsEc2TransitGatewayDetails.associationDefaultRouteTableId) &&
        Objects.equals(this.propagationDefaultRouteTableId, awsEc2TransitGatewayDetails.propagationDefaultRouteTableId) &&
        Objects.equals(this.vpnEcmpSupport, awsEc2TransitGatewayDetails.vpnEcmpSupport) &&
        Objects.equals(this.dnsSupport, awsEc2TransitGatewayDetails.dnsSupport) &&
        Objects.equals(this.multicastSupport, awsEc2TransitGatewayDetails.multicastSupport) &&
        Objects.equals(this.amazonSideAsn, awsEc2TransitGatewayDetails.amazonSideAsn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, defaultRouteTablePropagation, autoAcceptSharedAttachments, defaultRouteTableAssociation, transitGatewayCidrBlocks, associationDefaultRouteTableId, propagationDefaultRouteTableId, vpnEcmpSupport, dnsSupport, multicastSupport, amazonSideAsn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2TransitGatewayDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultRouteTablePropagation: ").append(toIndentedString(defaultRouteTablePropagation)).append("\n");
    sb.append("    autoAcceptSharedAttachments: ").append(toIndentedString(autoAcceptSharedAttachments)).append("\n");
    sb.append("    defaultRouteTableAssociation: ").append(toIndentedString(defaultRouteTableAssociation)).append("\n");
    sb.append("    transitGatewayCidrBlocks: ").append(toIndentedString(transitGatewayCidrBlocks)).append("\n");
    sb.append("    associationDefaultRouteTableId: ").append(toIndentedString(associationDefaultRouteTableId)).append("\n");
    sb.append("    propagationDefaultRouteTableId: ").append(toIndentedString(propagationDefaultRouteTableId)).append("\n");
    sb.append("    vpnEcmpSupport: ").append(toIndentedString(vpnEcmpSupport)).append("\n");
    sb.append("    dnsSupport: ").append(toIndentedString(dnsSupport)).append("\n");
    sb.append("    multicastSupport: ").append(toIndentedString(multicastSupport)).append("\n");
    sb.append("    amazonSideAsn: ").append(toIndentedString(amazonSideAsn)).append("\n");
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
    openapiFields.add("Description");
    openapiFields.add("DefaultRouteTablePropagation");
    openapiFields.add("AutoAcceptSharedAttachments");
    openapiFields.add("DefaultRouteTableAssociation");
    openapiFields.add("TransitGatewayCidrBlocks");
    openapiFields.add("AssociationDefaultRouteTableId");
    openapiFields.add("PropagationDefaultRouteTableId");
    openapiFields.add("VpnEcmpSupport");
    openapiFields.add("DnsSupport");
    openapiFields.add("MulticastSupport");
    openapiFields.add("AmazonSideAsn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2TransitGatewayDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2TransitGatewayDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2TransitGatewayDetails is not found in the empty JSON string", AwsEc2TransitGatewayDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2TransitGatewayDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2TransitGatewayDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `DefaultRouteTablePropagation`
      if (jsonObj.get("DefaultRouteTablePropagation") != null && !jsonObj.get("DefaultRouteTablePropagation").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultRouteTablePropagation"));
      }
      // validate the optional field `AutoAcceptSharedAttachments`
      if (jsonObj.get("AutoAcceptSharedAttachments") != null && !jsonObj.get("AutoAcceptSharedAttachments").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AutoAcceptSharedAttachments"));
      }
      // validate the optional field `DefaultRouteTableAssociation`
      if (jsonObj.get("DefaultRouteTableAssociation") != null && !jsonObj.get("DefaultRouteTableAssociation").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultRouteTableAssociation"));
      }
      // validate the optional field `TransitGatewayCidrBlocks`
      if (jsonObj.get("TransitGatewayCidrBlocks") != null && !jsonObj.get("TransitGatewayCidrBlocks").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TransitGatewayCidrBlocks"));
      }
      // validate the optional field `AssociationDefaultRouteTableId`
      if (jsonObj.get("AssociationDefaultRouteTableId") != null && !jsonObj.get("AssociationDefaultRouteTableId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AssociationDefaultRouteTableId"));
      }
      // validate the optional field `PropagationDefaultRouteTableId`
      if (jsonObj.get("PropagationDefaultRouteTableId") != null && !jsonObj.get("PropagationDefaultRouteTableId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PropagationDefaultRouteTableId"));
      }
      // validate the optional field `VpnEcmpSupport`
      if (jsonObj.get("VpnEcmpSupport") != null && !jsonObj.get("VpnEcmpSupport").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpnEcmpSupport"));
      }
      // validate the optional field `DnsSupport`
      if (jsonObj.get("DnsSupport") != null && !jsonObj.get("DnsSupport").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DnsSupport"));
      }
      // validate the optional field `MulticastSupport`
      if (jsonObj.get("MulticastSupport") != null && !jsonObj.get("MulticastSupport").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MulticastSupport"));
      }
      // validate the optional field `AmazonSideAsn`
      if (jsonObj.get("AmazonSideAsn") != null && !jsonObj.get("AmazonSideAsn").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("AmazonSideAsn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2TransitGatewayDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2TransitGatewayDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2TransitGatewayDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2TransitGatewayDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2TransitGatewayDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2TransitGatewayDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2TransitGatewayDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2TransitGatewayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2TransitGatewayDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2TransitGatewayDetails
   */
  public static AwsEc2TransitGatewayDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2TransitGatewayDetails.class);
  }

  /**
   * Convert an instance of AwsEc2TransitGatewayDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

