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
import org.openapitools.client.model.AwsEc2VpcPeeringConnectionDetailsAccepterVpcInfo;
import org.openapitools.client.model.AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo;
import org.openapitools.client.model.AwsEc2VpcPeeringConnectionDetailsStatus;

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
 * ResourceDetailsAwsEc2VpcPeeringConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEc2VpcPeeringConnection {
  public static final String SERIALIZED_NAME_ACCEPTER_VPC_INFO = "AccepterVpcInfo";
  @SerializedName(SERIALIZED_NAME_ACCEPTER_VPC_INFO)
  private AwsEc2VpcPeeringConnectionDetailsAccepterVpcInfo accepterVpcInfo;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "ExpirationTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime;

  public static final String SERIALIZED_NAME_REQUESTER_VPC_INFO = "RequesterVpcInfo";
  @SerializedName(SERIALIZED_NAME_REQUESTER_VPC_INFO)
  private AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo requesterVpcInfo;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AwsEc2VpcPeeringConnectionDetailsStatus status;

  public static final String SERIALIZED_NAME_VPC_PEERING_CONNECTION_ID = "VpcPeeringConnectionId";
  @SerializedName(SERIALIZED_NAME_VPC_PEERING_CONNECTION_ID)
  private String vpcPeeringConnectionId;

  public ResourceDetailsAwsEc2VpcPeeringConnection() {
  }

  public ResourceDetailsAwsEc2VpcPeeringConnection accepterVpcInfo(AwsEc2VpcPeeringConnectionDetailsAccepterVpcInfo accepterVpcInfo) {
    this.accepterVpcInfo = accepterVpcInfo;
    return this;
  }

  /**
   * Get accepterVpcInfo
   * @return accepterVpcInfo
   */
  @javax.annotation.Nullable
  public AwsEc2VpcPeeringConnectionDetailsAccepterVpcInfo getAccepterVpcInfo() {
    return accepterVpcInfo;
  }

  public void setAccepterVpcInfo(AwsEc2VpcPeeringConnectionDetailsAccepterVpcInfo accepterVpcInfo) {
    this.accepterVpcInfo = accepterVpcInfo;
  }


  public ResourceDetailsAwsEc2VpcPeeringConnection expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Get expirationTime
   * @return expirationTime
   */
  @javax.annotation.Nullable
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }


  public ResourceDetailsAwsEc2VpcPeeringConnection requesterVpcInfo(AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo requesterVpcInfo) {
    this.requesterVpcInfo = requesterVpcInfo;
    return this;
  }

  /**
   * Get requesterVpcInfo
   * @return requesterVpcInfo
   */
  @javax.annotation.Nullable
  public AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo getRequesterVpcInfo() {
    return requesterVpcInfo;
  }

  public void setRequesterVpcInfo(AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo requesterVpcInfo) {
    this.requesterVpcInfo = requesterVpcInfo;
  }


  public ResourceDetailsAwsEc2VpcPeeringConnection status(AwsEc2VpcPeeringConnectionDetailsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public AwsEc2VpcPeeringConnectionDetailsStatus getStatus() {
    return status;
  }

  public void setStatus(AwsEc2VpcPeeringConnectionDetailsStatus status) {
    this.status = status;
  }


  public ResourceDetailsAwsEc2VpcPeeringConnection vpcPeeringConnectionId(String vpcPeeringConnectionId) {
    this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    return this;
  }

  /**
   * Get vpcPeeringConnectionId
   * @return vpcPeeringConnectionId
   */
  @javax.annotation.Nullable
  public String getVpcPeeringConnectionId() {
    return vpcPeeringConnectionId;
  }

  public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
    this.vpcPeeringConnectionId = vpcPeeringConnectionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEc2VpcPeeringConnection resourceDetailsAwsEc2VpcPeeringConnection = (ResourceDetailsAwsEc2VpcPeeringConnection) o;
    return Objects.equals(this.accepterVpcInfo, resourceDetailsAwsEc2VpcPeeringConnection.accepterVpcInfo) &&
        Objects.equals(this.expirationTime, resourceDetailsAwsEc2VpcPeeringConnection.expirationTime) &&
        Objects.equals(this.requesterVpcInfo, resourceDetailsAwsEc2VpcPeeringConnection.requesterVpcInfo) &&
        Objects.equals(this.status, resourceDetailsAwsEc2VpcPeeringConnection.status) &&
        Objects.equals(this.vpcPeeringConnectionId, resourceDetailsAwsEc2VpcPeeringConnection.vpcPeeringConnectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepterVpcInfo, expirationTime, requesterVpcInfo, status, vpcPeeringConnectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEc2VpcPeeringConnection {\n");
    sb.append("    accepterVpcInfo: ").append(toIndentedString(accepterVpcInfo)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    requesterVpcInfo: ").append(toIndentedString(requesterVpcInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vpcPeeringConnectionId: ").append(toIndentedString(vpcPeeringConnectionId)).append("\n");
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
    openapiFields.add("AccepterVpcInfo");
    openapiFields.add("ExpirationTime");
    openapiFields.add("RequesterVpcInfo");
    openapiFields.add("Status");
    openapiFields.add("VpcPeeringConnectionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEc2VpcPeeringConnection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEc2VpcPeeringConnection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEc2VpcPeeringConnection is not found in the empty JSON string", ResourceDetailsAwsEc2VpcPeeringConnection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEc2VpcPeeringConnection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEc2VpcPeeringConnection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccepterVpcInfo`
      if (jsonObj.get("AccepterVpcInfo") != null && !jsonObj.get("AccepterVpcInfo").isJsonNull()) {
        AwsEc2VpcPeeringConnectionDetailsAccepterVpcInfo.validateJsonElement(jsonObj.get("AccepterVpcInfo"));
      }
      // validate the optional field `ExpirationTime`
      if (jsonObj.get("ExpirationTime") != null && !jsonObj.get("ExpirationTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ExpirationTime"));
      }
      // validate the optional field `RequesterVpcInfo`
      if (jsonObj.get("RequesterVpcInfo") != null && !jsonObj.get("RequesterVpcInfo").isJsonNull()) {
        AwsEc2VpcPeeringConnectionDetailsRequesterVpcInfo.validateJsonElement(jsonObj.get("RequesterVpcInfo"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        AwsEc2VpcPeeringConnectionDetailsStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `VpcPeeringConnectionId`
      if (jsonObj.get("VpcPeeringConnectionId") != null && !jsonObj.get("VpcPeeringConnectionId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcPeeringConnectionId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEc2VpcPeeringConnection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEc2VpcPeeringConnection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEc2VpcPeeringConnection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEc2VpcPeeringConnection.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEc2VpcPeeringConnection>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEc2VpcPeeringConnection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEc2VpcPeeringConnection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEc2VpcPeeringConnection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEc2VpcPeeringConnection
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEc2VpcPeeringConnection
   */
  public static ResourceDetailsAwsEc2VpcPeeringConnection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEc2VpcPeeringConnection.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEc2VpcPeeringConnection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

