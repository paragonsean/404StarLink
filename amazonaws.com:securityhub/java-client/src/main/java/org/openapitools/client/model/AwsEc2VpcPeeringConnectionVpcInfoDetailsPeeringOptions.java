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
 * AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions {
  public static final String SERIALIZED_NAME_ALLOW_DNS_RESOLUTION_FROM_REMOTE_VPC = "AllowDnsResolutionFromRemoteVpc";
  @SerializedName(SERIALIZED_NAME_ALLOW_DNS_RESOLUTION_FROM_REMOTE_VPC)
  private Boolean allowDnsResolutionFromRemoteVpc;

  public static final String SERIALIZED_NAME_ALLOW_EGRESS_FROM_LOCAL_CLASSIC_LINK_TO_REMOTE_VPC = "AllowEgressFromLocalClassicLinkToRemoteVpc";
  @SerializedName(SERIALIZED_NAME_ALLOW_EGRESS_FROM_LOCAL_CLASSIC_LINK_TO_REMOTE_VPC)
  private Boolean allowEgressFromLocalClassicLinkToRemoteVpc;

  public static final String SERIALIZED_NAME_ALLOW_EGRESS_FROM_LOCAL_VPC_TO_REMOTE_CLASSIC_LINK = "AllowEgressFromLocalVpcToRemoteClassicLink";
  @SerializedName(SERIALIZED_NAME_ALLOW_EGRESS_FROM_LOCAL_VPC_TO_REMOTE_CLASSIC_LINK)
  private Boolean allowEgressFromLocalVpcToRemoteClassicLink;

  public AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions() {
  }

  public AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions allowDnsResolutionFromRemoteVpc(Boolean allowDnsResolutionFromRemoteVpc) {
    this.allowDnsResolutionFromRemoteVpc = allowDnsResolutionFromRemoteVpc;
    return this;
  }

  /**
   * Get allowDnsResolutionFromRemoteVpc
   * @return allowDnsResolutionFromRemoteVpc
   */
  @javax.annotation.Nullable
  public Boolean getAllowDnsResolutionFromRemoteVpc() {
    return allowDnsResolutionFromRemoteVpc;
  }

  public void setAllowDnsResolutionFromRemoteVpc(Boolean allowDnsResolutionFromRemoteVpc) {
    this.allowDnsResolutionFromRemoteVpc = allowDnsResolutionFromRemoteVpc;
  }


  public AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions allowEgressFromLocalClassicLinkToRemoteVpc(Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
    this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
    return this;
  }

  /**
   * Get allowEgressFromLocalClassicLinkToRemoteVpc
   * @return allowEgressFromLocalClassicLinkToRemoteVpc
   */
  @javax.annotation.Nullable
  public Boolean getAllowEgressFromLocalClassicLinkToRemoteVpc() {
    return allowEgressFromLocalClassicLinkToRemoteVpc;
  }

  public void setAllowEgressFromLocalClassicLinkToRemoteVpc(Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
    this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
  }


  public AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions allowEgressFromLocalVpcToRemoteClassicLink(Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
    this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
    return this;
  }

  /**
   * Get allowEgressFromLocalVpcToRemoteClassicLink
   * @return allowEgressFromLocalVpcToRemoteClassicLink
   */
  @javax.annotation.Nullable
  public Boolean getAllowEgressFromLocalVpcToRemoteClassicLink() {
    return allowEgressFromLocalVpcToRemoteClassicLink;
  }

  public void setAllowEgressFromLocalVpcToRemoteClassicLink(Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
    this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions awsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions = (AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions) o;
    return Objects.equals(this.allowDnsResolutionFromRemoteVpc, awsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.allowDnsResolutionFromRemoteVpc) &&
        Objects.equals(this.allowEgressFromLocalClassicLinkToRemoteVpc, awsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.allowEgressFromLocalClassicLinkToRemoteVpc) &&
        Objects.equals(this.allowEgressFromLocalVpcToRemoteClassicLink, awsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.allowEgressFromLocalVpcToRemoteClassicLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDnsResolutionFromRemoteVpc, allowEgressFromLocalClassicLinkToRemoteVpc, allowEgressFromLocalVpcToRemoteClassicLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions {\n");
    sb.append("    allowDnsResolutionFromRemoteVpc: ").append(toIndentedString(allowDnsResolutionFromRemoteVpc)).append("\n");
    sb.append("    allowEgressFromLocalClassicLinkToRemoteVpc: ").append(toIndentedString(allowEgressFromLocalClassicLinkToRemoteVpc)).append("\n");
    sb.append("    allowEgressFromLocalVpcToRemoteClassicLink: ").append(toIndentedString(allowEgressFromLocalVpcToRemoteClassicLink)).append("\n");
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
    openapiFields.add("AllowDnsResolutionFromRemoteVpc");
    openapiFields.add("AllowEgressFromLocalClassicLinkToRemoteVpc");
    openapiFields.add("AllowEgressFromLocalVpcToRemoteClassicLink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions is not found in the empty JSON string", AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AllowDnsResolutionFromRemoteVpc`
      if (jsonObj.get("AllowDnsResolutionFromRemoteVpc") != null && !jsonObj.get("AllowDnsResolutionFromRemoteVpc").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AllowDnsResolutionFromRemoteVpc"));
      }
      // validate the optional field `AllowEgressFromLocalClassicLinkToRemoteVpc`
      if (jsonObj.get("AllowEgressFromLocalClassicLinkToRemoteVpc") != null && !jsonObj.get("AllowEgressFromLocalClassicLinkToRemoteVpc").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AllowEgressFromLocalClassicLinkToRemoteVpc"));
      }
      // validate the optional field `AllowEgressFromLocalVpcToRemoteClassicLink`
      if (jsonObj.get("AllowEgressFromLocalVpcToRemoteClassicLink") != null && !jsonObj.get("AllowEgressFromLocalVpcToRemoteClassicLink").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AllowEgressFromLocalVpcToRemoteClassicLink"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions>() {
           @Override
           public void write(JsonWriter out, AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions
   * @throws IOException if the JSON string is invalid with respect to AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions
   */
  public static AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions.class);
  }

  /**
   * Convert an instance of AwsEc2VpcPeeringConnectionVpcInfoDetailsPeeringOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

