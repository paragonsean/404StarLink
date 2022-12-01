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
import org.openapitools.client.model.ResolverQueryLogConfigStatus;
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
 * In the response to a &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverQueryLogConfig.html\&quot;&gt;CreateResolverQueryLogConfig&lt;/a&gt;, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DeleteResolverQueryLogConfig.html\&quot;&gt;DeleteResolverQueryLogConfig&lt;/a&gt;, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverQueryLogConfig.html\&quot;&gt;GetResolverQueryLogConfig&lt;/a&gt;, or &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html\&quot;&gt;ListResolverQueryLogConfigs&lt;/a&gt; request, a complex type that contains settings for one query logging configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:17.414717-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResolverQueryLogConfig {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ResolverQueryLogConfigStatus status;

  public static final String SERIALIZED_NAME_SHARE_STATUS = "ShareStatus";
  @SerializedName(SERIALIZED_NAME_SHARE_STATUS)
  private ShareStatus shareStatus;

  public static final String SERIALIZED_NAME_ASSOCIATION_COUNT = "AssociationCount";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_COUNT)
  private Integer associationCount;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESTINATION_ARN = "DestinationArn";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ARN)
  private String destinationArn;

  public static final String SERIALIZED_NAME_CREATOR_REQUEST_ID = "CreatorRequestId";
  @SerializedName(SERIALIZED_NAME_CREATOR_REQUEST_ID)
  private String creatorRequestId;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private String creationTime;

  public ResolverQueryLogConfig() {
  }

  public ResolverQueryLogConfig id(String id) {
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


  public ResolverQueryLogConfig ownerId(String ownerId) {
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


  public ResolverQueryLogConfig status(ResolverQueryLogConfigStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ResolverQueryLogConfigStatus getStatus() {
    return status;
  }

  public void setStatus(ResolverQueryLogConfigStatus status) {
    this.status = status;
  }


  public ResolverQueryLogConfig shareStatus(ShareStatus shareStatus) {
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


  public ResolverQueryLogConfig associationCount(Integer associationCount) {
    this.associationCount = associationCount;
    return this;
  }

  /**
   * Get associationCount
   * @return associationCount
   */
  @javax.annotation.Nullable
  public Integer getAssociationCount() {
    return associationCount;
  }

  public void setAssociationCount(Integer associationCount) {
    this.associationCount = associationCount;
  }


  public ResolverQueryLogConfig arn(String arn) {
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


  public ResolverQueryLogConfig name(String name) {
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


  public ResolverQueryLogConfig destinationArn(String destinationArn) {
    this.destinationArn = destinationArn;
    return this;
  }

  /**
   * Get destinationArn
   * @return destinationArn
   */
  @javax.annotation.Nullable
  public String getDestinationArn() {
    return destinationArn;
  }

  public void setDestinationArn(String destinationArn) {
    this.destinationArn = destinationArn;
  }


  public ResolverQueryLogConfig creatorRequestId(String creatorRequestId) {
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


  public ResolverQueryLogConfig creationTime(String creationTime) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolverQueryLogConfig resolverQueryLogConfig = (ResolverQueryLogConfig) o;
    return Objects.equals(this.id, resolverQueryLogConfig.id) &&
        Objects.equals(this.ownerId, resolverQueryLogConfig.ownerId) &&
        Objects.equals(this.status, resolverQueryLogConfig.status) &&
        Objects.equals(this.shareStatus, resolverQueryLogConfig.shareStatus) &&
        Objects.equals(this.associationCount, resolverQueryLogConfig.associationCount) &&
        Objects.equals(this.arn, resolverQueryLogConfig.arn) &&
        Objects.equals(this.name, resolverQueryLogConfig.name) &&
        Objects.equals(this.destinationArn, resolverQueryLogConfig.destinationArn) &&
        Objects.equals(this.creatorRequestId, resolverQueryLogConfig.creatorRequestId) &&
        Objects.equals(this.creationTime, resolverQueryLogConfig.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, status, shareStatus, associationCount, arn, name, destinationArn, creatorRequestId, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolverQueryLogConfig {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shareStatus: ").append(toIndentedString(shareStatus)).append("\n");
    sb.append("    associationCount: ").append(toIndentedString(associationCount)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationArn: ").append(toIndentedString(destinationArn)).append("\n");
    sb.append("    creatorRequestId: ").append(toIndentedString(creatorRequestId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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
    openapiFields.add("OwnerId");
    openapiFields.add("Status");
    openapiFields.add("ShareStatus");
    openapiFields.add("AssociationCount");
    openapiFields.add("Arn");
    openapiFields.add("Name");
    openapiFields.add("DestinationArn");
    openapiFields.add("CreatorRequestId");
    openapiFields.add("CreationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResolverQueryLogConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResolverQueryLogConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolverQueryLogConfig is not found in the empty JSON string", ResolverQueryLogConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResolverQueryLogConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolverQueryLogConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ResolverQueryLogConfigStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `ShareStatus`
      if (jsonObj.get("ShareStatus") != null && !jsonObj.get("ShareStatus").isJsonNull()) {
        ShareStatus.validateJsonElement(jsonObj.get("ShareStatus"));
      }
      // validate the optional field `AssociationCount`
      if (jsonObj.get("AssociationCount") != null && !jsonObj.get("AssociationCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("AssociationCount"));
      }
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `DestinationArn`
      if (jsonObj.get("DestinationArn") != null && !jsonObj.get("DestinationArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DestinationArn"));
      }
      // validate the optional field `CreatorRequestId`
      if (jsonObj.get("CreatorRequestId") != null && !jsonObj.get("CreatorRequestId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatorRequestId"));
      }
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreationTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolverQueryLogConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolverQueryLogConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolverQueryLogConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolverQueryLogConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolverQueryLogConfig>() {
           @Override
           public void write(JsonWriter out, ResolverQueryLogConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolverQueryLogConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResolverQueryLogConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResolverQueryLogConfig
   * @throws IOException if the JSON string is invalid with respect to ResolverQueryLogConfig
   */
  public static ResolverQueryLogConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolverQueryLogConfig.class);
  }

  /**
   * Convert an instance of ResolverQueryLogConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

