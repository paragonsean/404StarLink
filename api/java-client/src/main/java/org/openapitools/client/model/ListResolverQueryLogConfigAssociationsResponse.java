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
 * ListResolverQueryLogConfigAssociationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:17.414717-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListResolverQueryLogConfigAssociationsResponse {
  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "TotalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_FILTERED_COUNT = "TotalFilteredCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_FILTERED_COUNT)
  private Integer totalFilteredCount;

  public static final String SERIALIZED_NAME_RESOLVER_QUERY_LOG_CONFIG_ASSOCIATIONS = "ResolverQueryLogConfigAssociations";
  @SerializedName(SERIALIZED_NAME_RESOLVER_QUERY_LOG_CONFIG_ASSOCIATIONS)
  private List resolverQueryLogConfigAssociations;

  public ListResolverQueryLogConfigAssociationsResponse() {
  }

  public ListResolverQueryLogConfigAssociationsResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public ListResolverQueryLogConfigAssociationsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public ListResolverQueryLogConfigAssociationsResponse totalFilteredCount(Integer totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * Get totalFilteredCount
   * @return totalFilteredCount
   */
  @javax.annotation.Nullable
  public Integer getTotalFilteredCount() {
    return totalFilteredCount;
  }

  public void setTotalFilteredCount(Integer totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
  }


  public ListResolverQueryLogConfigAssociationsResponse resolverQueryLogConfigAssociations(List resolverQueryLogConfigAssociations) {
    this.resolverQueryLogConfigAssociations = resolverQueryLogConfigAssociations;
    return this;
  }

  /**
   * Get resolverQueryLogConfigAssociations
   * @return resolverQueryLogConfigAssociations
   */
  @javax.annotation.Nullable
  public List getResolverQueryLogConfigAssociations() {
    return resolverQueryLogConfigAssociations;
  }

  public void setResolverQueryLogConfigAssociations(List resolverQueryLogConfigAssociations) {
    this.resolverQueryLogConfigAssociations = resolverQueryLogConfigAssociations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResolverQueryLogConfigAssociationsResponse listResolverQueryLogConfigAssociationsResponse = (ListResolverQueryLogConfigAssociationsResponse) o;
    return Objects.equals(this.nextToken, listResolverQueryLogConfigAssociationsResponse.nextToken) &&
        Objects.equals(this.totalCount, listResolverQueryLogConfigAssociationsResponse.totalCount) &&
        Objects.equals(this.totalFilteredCount, listResolverQueryLogConfigAssociationsResponse.totalFilteredCount) &&
        Objects.equals(this.resolverQueryLogConfigAssociations, listResolverQueryLogConfigAssociationsResponse.resolverQueryLogConfigAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, totalCount, totalFilteredCount, resolverQueryLogConfigAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResolverQueryLogConfigAssociationsResponse {\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
    sb.append("    resolverQueryLogConfigAssociations: ").append(toIndentedString(resolverQueryLogConfigAssociations)).append("\n");
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
    openapiFields.add("NextToken");
    openapiFields.add("TotalCount");
    openapiFields.add("TotalFilteredCount");
    openapiFields.add("ResolverQueryLogConfigAssociations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListResolverQueryLogConfigAssociationsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListResolverQueryLogConfigAssociationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListResolverQueryLogConfigAssociationsResponse is not found in the empty JSON string", ListResolverQueryLogConfigAssociationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListResolverQueryLogConfigAssociationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListResolverQueryLogConfigAssociationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `NextToken`
      if (jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextToken"));
      }
      // validate the optional field `TotalCount`
      if (jsonObj.get("TotalCount") != null && !jsonObj.get("TotalCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("TotalCount"));
      }
      // validate the optional field `TotalFilteredCount`
      if (jsonObj.get("TotalFilteredCount") != null && !jsonObj.get("TotalFilteredCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("TotalFilteredCount"));
      }
      // validate the optional field `ResolverQueryLogConfigAssociations`
      if (jsonObj.get("ResolverQueryLogConfigAssociations") != null && !jsonObj.get("ResolverQueryLogConfigAssociations").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ResolverQueryLogConfigAssociations"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListResolverQueryLogConfigAssociationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListResolverQueryLogConfigAssociationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListResolverQueryLogConfigAssociationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListResolverQueryLogConfigAssociationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListResolverQueryLogConfigAssociationsResponse>() {
           @Override
           public void write(JsonWriter out, ListResolverQueryLogConfigAssociationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListResolverQueryLogConfigAssociationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListResolverQueryLogConfigAssociationsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListResolverQueryLogConfigAssociationsResponse
   * @throws IOException if the JSON string is invalid with respect to ListResolverQueryLogConfigAssociationsResponse
   */
  public static ListResolverQueryLogConfigAssociationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListResolverQueryLogConfigAssociationsResponse.class);
  }

  /**
   * Convert an instance of ListResolverQueryLogConfigAssociationsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

