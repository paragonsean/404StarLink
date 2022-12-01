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
import org.openapitools.client.model.ResolverQueryLogConfigAssociationError;
import org.openapitools.client.model.ResolverQueryLogConfigAssociationStatus;

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
 * In the response to an &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverQueryLogConfig.html\&quot;&gt;AssociateResolverQueryLogConfig&lt;/a&gt;, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html\&quot;&gt;DisassociateResolverQueryLogConfig&lt;/a&gt;, &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverQueryLogConfigAssociation.html\&quot;&gt;GetResolverQueryLogConfigAssociation&lt;/a&gt;, or &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html\&quot;&gt;ListResolverQueryLogConfigAssociations&lt;/a&gt;, request, a complex type that contains settings for a specified association between an Amazon VPC and a query logging configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:17.414717-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResolverQueryLogConfigAssociation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RESOLVER_QUERY_LOG_CONFIG_ID = "ResolverQueryLogConfigId";
  @SerializedName(SERIALIZED_NAME_RESOLVER_QUERY_LOG_CONFIG_ID)
  private String resolverQueryLogConfigId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "ResourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ResolverQueryLogConfigAssociationStatus status;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ResolverQueryLogConfigAssociationError error;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private String creationTime;

  public ResolverQueryLogConfigAssociation() {
  }

  public ResolverQueryLogConfigAssociation id(String id) {
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


  public ResolverQueryLogConfigAssociation resolverQueryLogConfigId(String resolverQueryLogConfigId) {
    this.resolverQueryLogConfigId = resolverQueryLogConfigId;
    return this;
  }

  /**
   * Get resolverQueryLogConfigId
   * @return resolverQueryLogConfigId
   */
  @javax.annotation.Nullable
  public String getResolverQueryLogConfigId() {
    return resolverQueryLogConfigId;
  }

  public void setResolverQueryLogConfigId(String resolverQueryLogConfigId) {
    this.resolverQueryLogConfigId = resolverQueryLogConfigId;
  }


  public ResolverQueryLogConfigAssociation resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
   */
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public ResolverQueryLogConfigAssociation status(ResolverQueryLogConfigAssociationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ResolverQueryLogConfigAssociationStatus getStatus() {
    return status;
  }

  public void setStatus(ResolverQueryLogConfigAssociationStatus status) {
    this.status = status;
  }


  public ResolverQueryLogConfigAssociation error(ResolverQueryLogConfigAssociationError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public ResolverQueryLogConfigAssociationError getError() {
    return error;
  }

  public void setError(ResolverQueryLogConfigAssociationError error) {
    this.error = error;
  }


  public ResolverQueryLogConfigAssociation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ResolverQueryLogConfigAssociation creationTime(String creationTime) {
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
    ResolverQueryLogConfigAssociation resolverQueryLogConfigAssociation = (ResolverQueryLogConfigAssociation) o;
    return Objects.equals(this.id, resolverQueryLogConfigAssociation.id) &&
        Objects.equals(this.resolverQueryLogConfigId, resolverQueryLogConfigAssociation.resolverQueryLogConfigId) &&
        Objects.equals(this.resourceId, resolverQueryLogConfigAssociation.resourceId) &&
        Objects.equals(this.status, resolverQueryLogConfigAssociation.status) &&
        Objects.equals(this.error, resolverQueryLogConfigAssociation.error) &&
        Objects.equals(this.errorMessage, resolverQueryLogConfigAssociation.errorMessage) &&
        Objects.equals(this.creationTime, resolverQueryLogConfigAssociation.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resolverQueryLogConfigId, resourceId, status, error, errorMessage, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolverQueryLogConfigAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resolverQueryLogConfigId: ").append(toIndentedString(resolverQueryLogConfigId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("ResolverQueryLogConfigId");
    openapiFields.add("ResourceId");
    openapiFields.add("Status");
    openapiFields.add("Error");
    openapiFields.add("ErrorMessage");
    openapiFields.add("CreationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResolverQueryLogConfigAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResolverQueryLogConfigAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolverQueryLogConfigAssociation is not found in the empty JSON string", ResolverQueryLogConfigAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResolverQueryLogConfigAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolverQueryLogConfigAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `ResolverQueryLogConfigId`
      if (jsonObj.get("ResolverQueryLogConfigId") != null && !jsonObj.get("ResolverQueryLogConfigId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResolverQueryLogConfigId"));
      }
      // validate the optional field `ResourceId`
      if (jsonObj.get("ResourceId") != null && !jsonObj.get("ResourceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ResolverQueryLogConfigAssociationStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Error`
      if (jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) {
        ResolverQueryLogConfigAssociationError.validateJsonElement(jsonObj.get("Error"));
      }
      // validate the optional field `ErrorMessage`
      if (jsonObj.get("ErrorMessage") != null && !jsonObj.get("ErrorMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ErrorMessage"));
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
       if (!ResolverQueryLogConfigAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolverQueryLogConfigAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolverQueryLogConfigAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolverQueryLogConfigAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolverQueryLogConfigAssociation>() {
           @Override
           public void write(JsonWriter out, ResolverQueryLogConfigAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolverQueryLogConfigAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResolverQueryLogConfigAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResolverQueryLogConfigAssociation
   * @throws IOException if the JSON string is invalid with respect to ResolverQueryLogConfigAssociation
   */
  public static ResolverQueryLogConfigAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolverQueryLogConfigAssociation.class);
  }

  /**
   * Convert an instance of ResolverQueryLogConfigAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

