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
 * Contains details about an Amazon EC2 network access control list (ACL).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2NetworkAclDetails {
  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_NETWORK_ACL_ID = "NetworkAclId";
  @SerializedName(SERIALIZED_NAME_NETWORK_ACL_ID)
  private String networkAclId;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_ASSOCIATIONS = "Associations";
  @SerializedName(SERIALIZED_NAME_ASSOCIATIONS)
  private List associations;

  public static final String SERIALIZED_NAME_ENTRIES = "Entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List entries;

  public AwsEc2NetworkAclDetails() {
  }

  public AwsEc2NetworkAclDetails isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   */
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public AwsEc2NetworkAclDetails networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

  /**
   * Get networkAclId
   * @return networkAclId
   */
  @javax.annotation.Nullable
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }


  public AwsEc2NetworkAclDetails ownerId(String ownerId) {
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


  public AwsEc2NetworkAclDetails vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
   */
  @javax.annotation.Nullable
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  public AwsEc2NetworkAclDetails associations(List associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
   */
  @javax.annotation.Nullable
  public List getAssociations() {
    return associations;
  }

  public void setAssociations(List associations) {
    this.associations = associations;
  }


  public AwsEc2NetworkAclDetails entries(List entries) {
    this.entries = entries;
    return this;
  }

  /**
   * Get entries
   * @return entries
   */
  @javax.annotation.Nullable
  public List getEntries() {
    return entries;
  }

  public void setEntries(List entries) {
    this.entries = entries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2NetworkAclDetails awsEc2NetworkAclDetails = (AwsEc2NetworkAclDetails) o;
    return Objects.equals(this.isDefault, awsEc2NetworkAclDetails.isDefault) &&
        Objects.equals(this.networkAclId, awsEc2NetworkAclDetails.networkAclId) &&
        Objects.equals(this.ownerId, awsEc2NetworkAclDetails.ownerId) &&
        Objects.equals(this.vpcId, awsEc2NetworkAclDetails.vpcId) &&
        Objects.equals(this.associations, awsEc2NetworkAclDetails.associations) &&
        Objects.equals(this.entries, awsEc2NetworkAclDetails.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, networkAclId, ownerId, vpcId, associations, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2NetworkAclDetails {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
    openapiFields.add("IsDefault");
    openapiFields.add("NetworkAclId");
    openapiFields.add("OwnerId");
    openapiFields.add("VpcId");
    openapiFields.add("Associations");
    openapiFields.add("Entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2NetworkAclDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2NetworkAclDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2NetworkAclDetails is not found in the empty JSON string", AwsEc2NetworkAclDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2NetworkAclDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2NetworkAclDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IsDefault`
      if (jsonObj.get("IsDefault") != null && !jsonObj.get("IsDefault").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IsDefault"));
      }
      // validate the optional field `NetworkAclId`
      if (jsonObj.get("NetworkAclId") != null && !jsonObj.get("NetworkAclId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NetworkAclId"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `Associations`
      if (jsonObj.get("Associations") != null && !jsonObj.get("Associations").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Associations"));
      }
      // validate the optional field `Entries`
      if (jsonObj.get("Entries") != null && !jsonObj.get("Entries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Entries"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2NetworkAclDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2NetworkAclDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2NetworkAclDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2NetworkAclDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2NetworkAclDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2NetworkAclDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2NetworkAclDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2NetworkAclDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2NetworkAclDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2NetworkAclDetails
   */
  public static AwsEc2NetworkAclDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2NetworkAclDetails.class);
  }

  /**
   * Convert an instance of AwsEc2NetworkAclDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

