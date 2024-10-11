/*
 * Amazon Elasticsearch Service
 * <fullname>Amazon Elasticsearch Configuration Service</fullname> <p>Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.</p> <p>For sample code that uses the Configuration API, see the <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html\">Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html\">sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.</p> <p>The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a href=\"http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions\" target=\"_blank\">Regions and Endpoints</a>.</p>
 *
 * The version of the OpenAPI document: 2015-01-01
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
 * Options to specify the subnets and security groups for VPC endpoint. For more information, see &lt;a href&#x3D;\&quot;http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt; VPC Endpoints for Amazon Elasticsearch Service Domains&lt;/a&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VPCDerivedInfo {
  public static final String SERIALIZED_NAME_VP_C_ID = "VPCId";
  @SerializedName(SERIALIZED_NAME_VP_C_ID)
  private String vpCId;

  public static final String SERIALIZED_NAME_SUBNET_IDS = "SubnetIds";
  @SerializedName(SERIALIZED_NAME_SUBNET_IDS)
  private List subnetIds;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
  private List securityGroupIds;

  public VPCDerivedInfo() {
  }

  public VPCDerivedInfo vpCId(String vpCId) {
    this.vpCId = vpCId;
    return this;
  }

  /**
   * Get vpCId
   * @return vpCId
   */
  @javax.annotation.Nullable
  public String getVpCId() {
    return vpCId;
  }

  public void setVpCId(String vpCId) {
    this.vpCId = vpCId;
  }


  public VPCDerivedInfo subnetIds(List subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  /**
   * Get subnetIds
   * @return subnetIds
   */
  @javax.annotation.Nullable
  public List getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List subnetIds) {
    this.subnetIds = subnetIds;
  }


  public VPCDerivedInfo availabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
    return this;
  }

  /**
   * Get availabilityZones
   * @return availabilityZones
   */
  @javax.annotation.Nullable
  public List getAvailabilityZones() {
    return availabilityZones;
  }

  public void setAvailabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
  }


  public VPCDerivedInfo securityGroupIds(List securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  /**
   * Get securityGroupIds
   * @return securityGroupIds
   */
  @javax.annotation.Nullable
  public List getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPCDerivedInfo vpCDerivedInfo = (VPCDerivedInfo) o;
    return Objects.equals(this.vpCId, vpCDerivedInfo.vpCId) &&
        Objects.equals(this.subnetIds, vpCDerivedInfo.subnetIds) &&
        Objects.equals(this.availabilityZones, vpCDerivedInfo.availabilityZones) &&
        Objects.equals(this.securityGroupIds, vpCDerivedInfo.securityGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpCId, subnetIds, availabilityZones, securityGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPCDerivedInfo {\n");
    sb.append("    vpCId: ").append(toIndentedString(vpCId)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
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
    openapiFields.add("VPCId");
    openapiFields.add("SubnetIds");
    openapiFields.add("AvailabilityZones");
    openapiFields.add("SecurityGroupIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VPCDerivedInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VPCDerivedInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VPCDerivedInfo is not found in the empty JSON string", VPCDerivedInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VPCDerivedInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VPCDerivedInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `VPCId`
      if (jsonObj.get("VPCId") != null && !jsonObj.get("VPCId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VPCId"));
      }
      // validate the optional field `SubnetIds`
      if (jsonObj.get("SubnetIds") != null && !jsonObj.get("SubnetIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SubnetIds"));
      }
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
      }
      // validate the optional field `SecurityGroupIds`
      if (jsonObj.get("SecurityGroupIds") != null && !jsonObj.get("SecurityGroupIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SecurityGroupIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VPCDerivedInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VPCDerivedInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VPCDerivedInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VPCDerivedInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VPCDerivedInfo>() {
           @Override
           public void write(JsonWriter out, VPCDerivedInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VPCDerivedInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VPCDerivedInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VPCDerivedInfo
   * @throws IOException if the JSON string is invalid with respect to VPCDerivedInfo
   */
  public static VPCDerivedInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VPCDerivedInfo.class);
  }

  /**
   * Convert an instance of VPCDerivedInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

