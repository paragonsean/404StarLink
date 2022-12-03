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
import org.openapitools.client.model.ResolverDNSSECValidationStatus;

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
 * UpdateResolverDnssecConfigResponseResolverDNSSECConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:26.887120-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateResolverDnssecConfigResponseResolverDNSSECConfig {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "ResourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "ValidationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private ResolverDNSSECValidationStatus validationStatus;

  public UpdateResolverDnssecConfigResponseResolverDNSSECConfig() {
  }

  public UpdateResolverDnssecConfigResponseResolverDNSSECConfig id(String id) {
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


  public UpdateResolverDnssecConfigResponseResolverDNSSECConfig ownerId(String ownerId) {
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


  public UpdateResolverDnssecConfigResponseResolverDNSSECConfig resourceId(String resourceId) {
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


  public UpdateResolverDnssecConfigResponseResolverDNSSECConfig validationStatus(ResolverDNSSECValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

  /**
   * Get validationStatus
   * @return validationStatus
   */
  @javax.annotation.Nullable
  public ResolverDNSSECValidationStatus getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(ResolverDNSSECValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResolverDnssecConfigResponseResolverDNSSECConfig updateResolverDnssecConfigResponseResolverDNSSECConfig = (UpdateResolverDnssecConfigResponseResolverDNSSECConfig) o;
    return Objects.equals(this.id, updateResolverDnssecConfigResponseResolverDNSSECConfig.id) &&
        Objects.equals(this.ownerId, updateResolverDnssecConfigResponseResolverDNSSECConfig.ownerId) &&
        Objects.equals(this.resourceId, updateResolverDnssecConfigResponseResolverDNSSECConfig.resourceId) &&
        Objects.equals(this.validationStatus, updateResolverDnssecConfigResponseResolverDNSSECConfig.validationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, resourceId, validationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResolverDnssecConfigResponseResolverDNSSECConfig {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
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
    openapiFields.add("ResourceId");
    openapiFields.add("ValidationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateResolverDnssecConfigResponseResolverDNSSECConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateResolverDnssecConfigResponseResolverDNSSECConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateResolverDnssecConfigResponseResolverDNSSECConfig is not found in the empty JSON string", UpdateResolverDnssecConfigResponseResolverDNSSECConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateResolverDnssecConfigResponseResolverDNSSECConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateResolverDnssecConfigResponseResolverDNSSECConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `ResourceId`
      if (jsonObj.get("ResourceId") != null && !jsonObj.get("ResourceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceId"));
      }
      // validate the optional field `ValidationStatus`
      if (jsonObj.get("ValidationStatus") != null && !jsonObj.get("ValidationStatus").isJsonNull()) {
        ResolverDNSSECValidationStatus.validateJsonElement(jsonObj.get("ValidationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateResolverDnssecConfigResponseResolverDNSSECConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateResolverDnssecConfigResponseResolverDNSSECConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateResolverDnssecConfigResponseResolverDNSSECConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateResolverDnssecConfigResponseResolverDNSSECConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateResolverDnssecConfigResponseResolverDNSSECConfig>() {
           @Override
           public void write(JsonWriter out, UpdateResolverDnssecConfigResponseResolverDNSSECConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateResolverDnssecConfigResponseResolverDNSSECConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateResolverDnssecConfigResponseResolverDNSSECConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateResolverDnssecConfigResponseResolverDNSSECConfig
   * @throws IOException if the JSON string is invalid with respect to UpdateResolverDnssecConfigResponseResolverDNSSECConfig
   */
  public static UpdateResolverDnssecConfigResponseResolverDNSSECConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateResolverDnssecConfigResponseResolverDNSSECConfig.class);
  }

  /**
   * Convert an instance of UpdateResolverDnssecConfigResponseResolverDNSSECConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

