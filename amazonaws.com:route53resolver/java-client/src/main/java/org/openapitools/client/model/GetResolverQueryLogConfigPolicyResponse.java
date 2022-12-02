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
 * GetResolverQueryLogConfigPolicyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:22.281937-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetResolverQueryLogConfigPolicyResponse {
  public static final String SERIALIZED_NAME_RESOLVER_QUERY_LOG_CONFIG_POLICY = "ResolverQueryLogConfigPolicy";
  @SerializedName(SERIALIZED_NAME_RESOLVER_QUERY_LOG_CONFIG_POLICY)
  private String resolverQueryLogConfigPolicy;

  public GetResolverQueryLogConfigPolicyResponse() {
  }

  public GetResolverQueryLogConfigPolicyResponse resolverQueryLogConfigPolicy(String resolverQueryLogConfigPolicy) {
    this.resolverQueryLogConfigPolicy = resolverQueryLogConfigPolicy;
    return this;
  }

  /**
   * Get resolverQueryLogConfigPolicy
   * @return resolverQueryLogConfigPolicy
   */
  @javax.annotation.Nullable
  public String getResolverQueryLogConfigPolicy() {
    return resolverQueryLogConfigPolicy;
  }

  public void setResolverQueryLogConfigPolicy(String resolverQueryLogConfigPolicy) {
    this.resolverQueryLogConfigPolicy = resolverQueryLogConfigPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResolverQueryLogConfigPolicyResponse getResolverQueryLogConfigPolicyResponse = (GetResolverQueryLogConfigPolicyResponse) o;
    return Objects.equals(this.resolverQueryLogConfigPolicy, getResolverQueryLogConfigPolicyResponse.resolverQueryLogConfigPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolverQueryLogConfigPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetResolverQueryLogConfigPolicyResponse {\n");
    sb.append("    resolverQueryLogConfigPolicy: ").append(toIndentedString(resolverQueryLogConfigPolicy)).append("\n");
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
    openapiFields.add("ResolverQueryLogConfigPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetResolverQueryLogConfigPolicyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetResolverQueryLogConfigPolicyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetResolverQueryLogConfigPolicyResponse is not found in the empty JSON string", GetResolverQueryLogConfigPolicyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetResolverQueryLogConfigPolicyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetResolverQueryLogConfigPolicyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ResolverQueryLogConfigPolicy`
      if (jsonObj.get("ResolverQueryLogConfigPolicy") != null && !jsonObj.get("ResolverQueryLogConfigPolicy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResolverQueryLogConfigPolicy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetResolverQueryLogConfigPolicyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetResolverQueryLogConfigPolicyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetResolverQueryLogConfigPolicyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetResolverQueryLogConfigPolicyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetResolverQueryLogConfigPolicyResponse>() {
           @Override
           public void write(JsonWriter out, GetResolverQueryLogConfigPolicyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetResolverQueryLogConfigPolicyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetResolverQueryLogConfigPolicyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetResolverQueryLogConfigPolicyResponse
   * @throws IOException if the JSON string is invalid with respect to GetResolverQueryLogConfigPolicyResponse
   */
  public static GetResolverQueryLogConfigPolicyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetResolverQueryLogConfigPolicyResponse.class);
  }

  /**
   * Convert an instance of GetResolverQueryLogConfigPolicyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

