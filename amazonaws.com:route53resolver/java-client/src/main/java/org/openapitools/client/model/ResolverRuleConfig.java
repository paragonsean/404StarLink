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
 * In an &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverRule.html\&quot;&gt;UpdateResolverRule&lt;/a&gt; request, information about the changes that you want to make.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:22.540130-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResolverRuleConfig {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_IPS = "TargetIps";
  @SerializedName(SERIALIZED_NAME_TARGET_IPS)
  private List targetIps;

  public static final String SERIALIZED_NAME_RESOLVER_ENDPOINT_ID = "ResolverEndpointId";
  @SerializedName(SERIALIZED_NAME_RESOLVER_ENDPOINT_ID)
  private String resolverEndpointId;

  public ResolverRuleConfig() {
  }

  public ResolverRuleConfig name(String name) {
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


  public ResolverRuleConfig targetIps(List targetIps) {
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


  public ResolverRuleConfig resolverEndpointId(String resolverEndpointId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolverRuleConfig resolverRuleConfig = (ResolverRuleConfig) o;
    return Objects.equals(this.name, resolverRuleConfig.name) &&
        Objects.equals(this.targetIps, resolverRuleConfig.targetIps) &&
        Objects.equals(this.resolverEndpointId, resolverRuleConfig.resolverEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, targetIps, resolverEndpointId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolverRuleConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetIps: ").append(toIndentedString(targetIps)).append("\n");
    sb.append("    resolverEndpointId: ").append(toIndentedString(resolverEndpointId)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("TargetIps");
    openapiFields.add("ResolverEndpointId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResolverRuleConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResolverRuleConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolverRuleConfig is not found in the empty JSON string", ResolverRuleConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResolverRuleConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolverRuleConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolverRuleConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolverRuleConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolverRuleConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolverRuleConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolverRuleConfig>() {
           @Override
           public void write(JsonWriter out, ResolverRuleConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolverRuleConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResolverRuleConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResolverRuleConfig
   * @throws IOException if the JSON string is invalid with respect to ResolverRuleConfig
   */
  public static ResolverRuleConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolverRuleConfig.class);
  }

  /**
   * Convert an instance of ResolverRuleConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

