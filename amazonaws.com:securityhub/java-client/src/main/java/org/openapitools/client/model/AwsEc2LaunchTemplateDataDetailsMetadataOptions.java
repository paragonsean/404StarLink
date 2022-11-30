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
 * AwsEc2LaunchTemplateDataDetailsMetadataOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2LaunchTemplateDataDetailsMetadataOptions {
  public static final String SERIALIZED_NAME_HTTP_ENDPOINT = "HttpEndpoint";
  @SerializedName(SERIALIZED_NAME_HTTP_ENDPOINT)
  private String httpEndpoint;

  public static final String SERIALIZED_NAME_HTTP_PROTOCOL_IPV6 = "HttpProtocolIpv6";
  @SerializedName(SERIALIZED_NAME_HTTP_PROTOCOL_IPV6)
  private String httpProtocolIpv6;

  public static final String SERIALIZED_NAME_HTTP_TOKENS = "HttpTokens";
  @SerializedName(SERIALIZED_NAME_HTTP_TOKENS)
  private String httpTokens;

  public static final String SERIALIZED_NAME_HTTP_PUT_RESPONSE_HOP_LIMIT = "HttpPutResponseHopLimit";
  @SerializedName(SERIALIZED_NAME_HTTP_PUT_RESPONSE_HOP_LIMIT)
  private Integer httpPutResponseHopLimit;

  public static final String SERIALIZED_NAME_INSTANCE_METADATA_TAGS = "InstanceMetadataTags";
  @SerializedName(SERIALIZED_NAME_INSTANCE_METADATA_TAGS)
  private String instanceMetadataTags;

  public AwsEc2LaunchTemplateDataDetailsMetadataOptions() {
  }

  public AwsEc2LaunchTemplateDataDetailsMetadataOptions httpEndpoint(String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
    return this;
  }

  /**
   * Get httpEndpoint
   * @return httpEndpoint
   */
  @javax.annotation.Nullable
  public String getHttpEndpoint() {
    return httpEndpoint;
  }

  public void setHttpEndpoint(String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
  }


  public AwsEc2LaunchTemplateDataDetailsMetadataOptions httpProtocolIpv6(String httpProtocolIpv6) {
    this.httpProtocolIpv6 = httpProtocolIpv6;
    return this;
  }

  /**
   * Get httpProtocolIpv6
   * @return httpProtocolIpv6
   */
  @javax.annotation.Nullable
  public String getHttpProtocolIpv6() {
    return httpProtocolIpv6;
  }

  public void setHttpProtocolIpv6(String httpProtocolIpv6) {
    this.httpProtocolIpv6 = httpProtocolIpv6;
  }


  public AwsEc2LaunchTemplateDataDetailsMetadataOptions httpTokens(String httpTokens) {
    this.httpTokens = httpTokens;
    return this;
  }

  /**
   * Get httpTokens
   * @return httpTokens
   */
  @javax.annotation.Nullable
  public String getHttpTokens() {
    return httpTokens;
  }

  public void setHttpTokens(String httpTokens) {
    this.httpTokens = httpTokens;
  }


  public AwsEc2LaunchTemplateDataDetailsMetadataOptions httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
    this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    return this;
  }

  /**
   * Get httpPutResponseHopLimit
   * @return httpPutResponseHopLimit
   */
  @javax.annotation.Nullable
  public Integer getHttpPutResponseHopLimit() {
    return httpPutResponseHopLimit;
  }

  public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
    this.httpPutResponseHopLimit = httpPutResponseHopLimit;
  }


  public AwsEc2LaunchTemplateDataDetailsMetadataOptions instanceMetadataTags(String instanceMetadataTags) {
    this.instanceMetadataTags = instanceMetadataTags;
    return this;
  }

  /**
   * Get instanceMetadataTags
   * @return instanceMetadataTags
   */
  @javax.annotation.Nullable
  public String getInstanceMetadataTags() {
    return instanceMetadataTags;
  }

  public void setInstanceMetadataTags(String instanceMetadataTags) {
    this.instanceMetadataTags = instanceMetadataTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2LaunchTemplateDataDetailsMetadataOptions awsEc2LaunchTemplateDataDetailsMetadataOptions = (AwsEc2LaunchTemplateDataDetailsMetadataOptions) o;
    return Objects.equals(this.httpEndpoint, awsEc2LaunchTemplateDataDetailsMetadataOptions.httpEndpoint) &&
        Objects.equals(this.httpProtocolIpv6, awsEc2LaunchTemplateDataDetailsMetadataOptions.httpProtocolIpv6) &&
        Objects.equals(this.httpTokens, awsEc2LaunchTemplateDataDetailsMetadataOptions.httpTokens) &&
        Objects.equals(this.httpPutResponseHopLimit, awsEc2LaunchTemplateDataDetailsMetadataOptions.httpPutResponseHopLimit) &&
        Objects.equals(this.instanceMetadataTags, awsEc2LaunchTemplateDataDetailsMetadataOptions.instanceMetadataTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpEndpoint, httpProtocolIpv6, httpTokens, httpPutResponseHopLimit, instanceMetadataTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2LaunchTemplateDataDetailsMetadataOptions {\n");
    sb.append("    httpEndpoint: ").append(toIndentedString(httpEndpoint)).append("\n");
    sb.append("    httpProtocolIpv6: ").append(toIndentedString(httpProtocolIpv6)).append("\n");
    sb.append("    httpTokens: ").append(toIndentedString(httpTokens)).append("\n");
    sb.append("    httpPutResponseHopLimit: ").append(toIndentedString(httpPutResponseHopLimit)).append("\n");
    sb.append("    instanceMetadataTags: ").append(toIndentedString(instanceMetadataTags)).append("\n");
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
    openapiFields.add("HttpEndpoint");
    openapiFields.add("HttpProtocolIpv6");
    openapiFields.add("HttpTokens");
    openapiFields.add("HttpPutResponseHopLimit");
    openapiFields.add("InstanceMetadataTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2LaunchTemplateDataDetailsMetadataOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2LaunchTemplateDataDetailsMetadataOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2LaunchTemplateDataDetailsMetadataOptions is not found in the empty JSON string", AwsEc2LaunchTemplateDataDetailsMetadataOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2LaunchTemplateDataDetailsMetadataOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2LaunchTemplateDataDetailsMetadataOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `HttpEndpoint`
      if (jsonObj.get("HttpEndpoint") != null && !jsonObj.get("HttpEndpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HttpEndpoint"));
      }
      // validate the optional field `HttpProtocolIpv6`
      if (jsonObj.get("HttpProtocolIpv6") != null && !jsonObj.get("HttpProtocolIpv6").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HttpProtocolIpv6"));
      }
      // validate the optional field `HttpTokens`
      if (jsonObj.get("HttpTokens") != null && !jsonObj.get("HttpTokens").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HttpTokens"));
      }
      // validate the optional field `HttpPutResponseHopLimit`
      if (jsonObj.get("HttpPutResponseHopLimit") != null && !jsonObj.get("HttpPutResponseHopLimit").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HttpPutResponseHopLimit"));
      }
      // validate the optional field `InstanceMetadataTags`
      if (jsonObj.get("InstanceMetadataTags") != null && !jsonObj.get("InstanceMetadataTags").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceMetadataTags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2LaunchTemplateDataDetailsMetadataOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2LaunchTemplateDataDetailsMetadataOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2LaunchTemplateDataDetailsMetadataOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2LaunchTemplateDataDetailsMetadataOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2LaunchTemplateDataDetailsMetadataOptions>() {
           @Override
           public void write(JsonWriter out, AwsEc2LaunchTemplateDataDetailsMetadataOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2LaunchTemplateDataDetailsMetadataOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2LaunchTemplateDataDetailsMetadataOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2LaunchTemplateDataDetailsMetadataOptions
   * @throws IOException if the JSON string is invalid with respect to AwsEc2LaunchTemplateDataDetailsMetadataOptions
   */
  public static AwsEc2LaunchTemplateDataDetailsMetadataOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2LaunchTemplateDataDetailsMetadataOptions.class);
  }

  /**
   * Convert an instance of AwsEc2LaunchTemplateDataDetailsMetadataOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

