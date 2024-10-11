/*
 * AWS Global Accelerator
 * <fullname>Global Accelerator</fullname> <p>This is the <i>Global Accelerator API Reference</i>. This guide is for developers who need detailed information about Global Accelerator API actions, data types, and errors. For more information about Global Accelerator features, see the <a href=\"https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html\">Global Accelerator Developer Guide</a>.</p> <p>Global Accelerator is a service in which you create <i>accelerators</i> to improve the performance of your applications for local and global users. Depending on the type of accelerator you choose, you can gain additional benefits. </p> <ul> <li> <p>By using a standard accelerator, you can improve availability of your internet applications that are used by a global audience. With a standard accelerator, Global Accelerator directs traffic to optimal endpoints over the Amazon Web Services global network. </p> </li> <li> <p>For other scenarios, you might choose a custom routing accelerator. With a custom routing accelerator, you can use application logic to directly map one or more users to a specific endpoint among many endpoints.</p> </li> </ul> <important> <p>Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify <code>--region us-west-2</code> on AWS CLI commands.</p> </important> <p>By default, Global Accelerator provides you with static IP addresses that you associate with your accelerator. The static IP addresses are anycast from the Amazon Web Services edge network. For IPv4, Global Accelerator provides two static IPv4 addresses. For dual-stack, Global Accelerator provides a total of four addresses: two static IPv4 addresses and two static IPv6 addresses. With a standard accelerator for IPv4, instead of using the addresses that Global Accelerator provides, you can configure these entry points to be IPv4 addresses from your own IP address ranges that you bring toGlobal Accelerator (BYOIP). </p> <p>For a standard accelerator, they distribute incoming application traffic across multiple endpoint resources in multiple Amazon Web Services Regions , which increases the availability of your applications. Endpoints for standard accelerators can be Network Load Balancers, Application Load Balancers, Amazon EC2 instances, or Elastic IP addresses that are located in one Amazon Web Services Region or multiple Amazon Web Services Regions. For custom routing accelerators, you map traffic that arrives to the static IP addresses to specific Amazon EC2 servers in endpoints that are virtual private cloud (VPC) subnets.</p> <important> <p>The static IP addresses remain assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the static IP addresses that are assigned to it, so you can no longer route traffic by using them. You can use IAM policies like tag-based permissions with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see <a href=\"https://docs.aws.amazon.com/global-accelerator/latest/dg/access-control-manage-access-tag-policies.html\">Tag-based policies</a>.</p> </important> <p>For standard accelerators, Global Accelerator uses the Amazon Web Services global network to route traffic to the optimal regional endpoint based on health, client location, and policies that you configure. The service reacts instantly to changes in health or configuration to ensure that internet traffic from clients is always directed to healthy endpoints.</p> <p>For more information about understanding and using Global Accelerator, see the <a href=\"https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html\">Global Accelerator Developer Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2018-08-08
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
 * ListCustomRoutingListenersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:24.229578-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListCustomRoutingListenersRequest {
  public static final String SERIALIZED_NAME_ACCELERATOR_ARN = "AcceleratorArn";
  @SerializedName(SERIALIZED_NAME_ACCELERATOR_ARN)
  private String acceleratorArn;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "MaxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListCustomRoutingListenersRequest() {
  }

  public ListCustomRoutingListenersRequest acceleratorArn(String acceleratorArn) {
    this.acceleratorArn = acceleratorArn;
    return this;
  }

  /**
   * Get acceleratorArn
   * @return acceleratorArn
   */
  @javax.annotation.Nonnull
  public String getAcceleratorArn() {
    return acceleratorArn;
  }

  public void setAcceleratorArn(String acceleratorArn) {
    this.acceleratorArn = acceleratorArn;
  }


  public ListCustomRoutingListenersRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Get maxResults
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public ListCustomRoutingListenersRequest nextToken(String nextToken) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomRoutingListenersRequest listCustomRoutingListenersRequest = (ListCustomRoutingListenersRequest) o;
    return Objects.equals(this.acceleratorArn, listCustomRoutingListenersRequest.acceleratorArn) &&
        Objects.equals(this.maxResults, listCustomRoutingListenersRequest.maxResults) &&
        Objects.equals(this.nextToken, listCustomRoutingListenersRequest.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorArn, maxResults, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomRoutingListenersRequest {\n");
    sb.append("    acceleratorArn: ").append(toIndentedString(acceleratorArn)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("AcceleratorArn");
    openapiFields.add("MaxResults");
    openapiFields.add("NextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AcceleratorArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListCustomRoutingListenersRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListCustomRoutingListenersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCustomRoutingListenersRequest is not found in the empty JSON string", ListCustomRoutingListenersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListCustomRoutingListenersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCustomRoutingListenersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListCustomRoutingListenersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `AcceleratorArn`
      String.validateJsonElement(jsonObj.get("AcceleratorArn"));
      // validate the optional field `MaxResults`
      if (jsonObj.get("MaxResults") != null && !jsonObj.get("MaxResults").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxResults"));
      }
      // validate the optional field `NextToken`
      if (jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCustomRoutingListenersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCustomRoutingListenersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCustomRoutingListenersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCustomRoutingListenersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCustomRoutingListenersRequest>() {
           @Override
           public void write(JsonWriter out, ListCustomRoutingListenersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCustomRoutingListenersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListCustomRoutingListenersRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListCustomRoutingListenersRequest
   * @throws IOException if the JSON string is invalid with respect to ListCustomRoutingListenersRequest
   */
  public static ListCustomRoutingListenersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCustomRoutingListenersRequest.class);
  }

  /**
   * Convert an instance of ListCustomRoutingListenersRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

