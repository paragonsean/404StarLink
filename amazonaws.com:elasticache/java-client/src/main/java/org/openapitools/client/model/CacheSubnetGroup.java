/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
 * &lt;p&gt;Represents the output of one of the following operations:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;CreateCacheSubnetGroup&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ModifyCacheSubnetGroup&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:52.956161-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheSubnetGroup {
  public static final String SERIALIZED_NAME_CACHE_SUBNET_GROUP_NAME = "CacheSubnetGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_SUBNET_GROUP_NAME)
  private String cacheSubnetGroupName;

  public static final String SERIALIZED_NAME_CACHE_SUBNET_GROUP_DESCRIPTION = "CacheSubnetGroupDescription";
  @SerializedName(SERIALIZED_NAME_CACHE_SUBNET_GROUP_DESCRIPTION)
  private String cacheSubnetGroupDescription;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_SUBNETS = "Subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List subnets;

  public static final String SERIALIZED_NAME_A_R_N = "ARN";
  @SerializedName(SERIALIZED_NAME_A_R_N)
  private String ARN;

  public static final String SERIALIZED_NAME_SUPPORTED_NETWORK_TYPES = "SupportedNetworkTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_NETWORK_TYPES)
  private List supportedNetworkTypes;

  public CacheSubnetGroup() {
  }

  public CacheSubnetGroup cacheSubnetGroupName(String cacheSubnetGroupName) {
    this.cacheSubnetGroupName = cacheSubnetGroupName;
    return this;
  }

  /**
   * Get cacheSubnetGroupName
   * @return cacheSubnetGroupName
   */
  @javax.annotation.Nullable
  public String getCacheSubnetGroupName() {
    return cacheSubnetGroupName;
  }

  public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
    this.cacheSubnetGroupName = cacheSubnetGroupName;
  }


  public CacheSubnetGroup cacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
    this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    return this;
  }

  /**
   * Get cacheSubnetGroupDescription
   * @return cacheSubnetGroupDescription
   */
  @javax.annotation.Nullable
  public String getCacheSubnetGroupDescription() {
    return cacheSubnetGroupDescription;
  }

  public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
    this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
  }


  public CacheSubnetGroup vpcId(String vpcId) {
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


  public CacheSubnetGroup subnets(List subnets) {
    this.subnets = subnets;
    return this;
  }

  /**
   * Get subnets
   * @return subnets
   */
  @javax.annotation.Nullable
  public List getSubnets() {
    return subnets;
  }

  public void setSubnets(List subnets) {
    this.subnets = subnets;
  }


  public CacheSubnetGroup ARN(String ARN) {
    this.ARN = ARN;
    return this;
  }

  /**
   * Get ARN
   * @return ARN
   */
  @javax.annotation.Nullable
  public String getARN() {
    return ARN;
  }

  public void setARN(String ARN) {
    this.ARN = ARN;
  }


  public CacheSubnetGroup supportedNetworkTypes(List supportedNetworkTypes) {
    this.supportedNetworkTypes = supportedNetworkTypes;
    return this;
  }

  /**
   * Get supportedNetworkTypes
   * @return supportedNetworkTypes
   */
  @javax.annotation.Nullable
  public List getSupportedNetworkTypes() {
    return supportedNetworkTypes;
  }

  public void setSupportedNetworkTypes(List supportedNetworkTypes) {
    this.supportedNetworkTypes = supportedNetworkTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheSubnetGroup cacheSubnetGroup = (CacheSubnetGroup) o;
    return Objects.equals(this.cacheSubnetGroupName, cacheSubnetGroup.cacheSubnetGroupName) &&
        Objects.equals(this.cacheSubnetGroupDescription, cacheSubnetGroup.cacheSubnetGroupDescription) &&
        Objects.equals(this.vpcId, cacheSubnetGroup.vpcId) &&
        Objects.equals(this.subnets, cacheSubnetGroup.subnets) &&
        Objects.equals(this.ARN, cacheSubnetGroup.ARN) &&
        Objects.equals(this.supportedNetworkTypes, cacheSubnetGroup.supportedNetworkTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheSubnetGroupName, cacheSubnetGroupDescription, vpcId, subnets, ARN, supportedNetworkTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheSubnetGroup {\n");
    sb.append("    cacheSubnetGroupName: ").append(toIndentedString(cacheSubnetGroupName)).append("\n");
    sb.append("    cacheSubnetGroupDescription: ").append(toIndentedString(cacheSubnetGroupDescription)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    ARN: ").append(toIndentedString(ARN)).append("\n");
    sb.append("    supportedNetworkTypes: ").append(toIndentedString(supportedNetworkTypes)).append("\n");
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
    openapiFields.add("CacheSubnetGroupName");
    openapiFields.add("CacheSubnetGroupDescription");
    openapiFields.add("VpcId");
    openapiFields.add("Subnets");
    openapiFields.add("ARN");
    openapiFields.add("SupportedNetworkTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheSubnetGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheSubnetGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheSubnetGroup is not found in the empty JSON string", CacheSubnetGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheSubnetGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheSubnetGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheSubnetGroupName`
      if (jsonObj.get("CacheSubnetGroupName") != null && !jsonObj.get("CacheSubnetGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSubnetGroupName"));
      }
      // validate the optional field `CacheSubnetGroupDescription`
      if (jsonObj.get("CacheSubnetGroupDescription") != null && !jsonObj.get("CacheSubnetGroupDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSubnetGroupDescription"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `Subnets`
      if (jsonObj.get("Subnets") != null && !jsonObj.get("Subnets").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Subnets"));
      }
      // validate the optional field `ARN`
      if (jsonObj.get("ARN") != null && !jsonObj.get("ARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ARN"));
      }
      // validate the optional field `SupportedNetworkTypes`
      if (jsonObj.get("SupportedNetworkTypes") != null && !jsonObj.get("SupportedNetworkTypes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SupportedNetworkTypes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheSubnetGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheSubnetGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheSubnetGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheSubnetGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheSubnetGroup>() {
           @Override
           public void write(JsonWriter out, CacheSubnetGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheSubnetGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheSubnetGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheSubnetGroup
   * @throws IOException if the JSON string is invalid with respect to CacheSubnetGroup
   */
  public static CacheSubnetGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheSubnetGroup.class);
  }

  /**
   * Convert an instance of CacheSubnetGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

