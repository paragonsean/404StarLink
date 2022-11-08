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
 * &lt;p&gt;Represents the output of one of the following operations:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;AuthorizeCacheSecurityGroupIngress&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;CreateCacheSecurityGroup&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;RevokeCacheSecurityGroupIngress&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:41.807787-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheSecurityGroup {
  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME = "CacheSecurityGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME)
  private String cacheSecurityGroupName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUPS = "EC2SecurityGroups";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUPS)
  private List ec2SecurityGroups;

  public static final String SERIALIZED_NAME_A_R_N = "ARN";
  @SerializedName(SERIALIZED_NAME_A_R_N)
  private String ARN;

  public CacheSecurityGroup() {
  }

  public CacheSecurityGroup ownerId(String ownerId) {
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


  public CacheSecurityGroup cacheSecurityGroupName(String cacheSecurityGroupName) {
    this.cacheSecurityGroupName = cacheSecurityGroupName;
    return this;
  }

  /**
   * Get cacheSecurityGroupName
   * @return cacheSecurityGroupName
   */
  @javax.annotation.Nullable
  public String getCacheSecurityGroupName() {
    return cacheSecurityGroupName;
  }

  public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
    this.cacheSecurityGroupName = cacheSecurityGroupName;
  }


  public CacheSecurityGroup description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CacheSecurityGroup ec2SecurityGroups(List ec2SecurityGroups) {
    this.ec2SecurityGroups = ec2SecurityGroups;
    return this;
  }

  /**
   * Get ec2SecurityGroups
   * @return ec2SecurityGroups
   */
  @javax.annotation.Nullable
  public List getEc2SecurityGroups() {
    return ec2SecurityGroups;
  }

  public void setEc2SecurityGroups(List ec2SecurityGroups) {
    this.ec2SecurityGroups = ec2SecurityGroups;
  }


  public CacheSecurityGroup ARN(String ARN) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheSecurityGroup cacheSecurityGroup = (CacheSecurityGroup) o;
    return Objects.equals(this.ownerId, cacheSecurityGroup.ownerId) &&
        Objects.equals(this.cacheSecurityGroupName, cacheSecurityGroup.cacheSecurityGroupName) &&
        Objects.equals(this.description, cacheSecurityGroup.description) &&
        Objects.equals(this.ec2SecurityGroups, cacheSecurityGroup.ec2SecurityGroups) &&
        Objects.equals(this.ARN, cacheSecurityGroup.ARN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, cacheSecurityGroupName, description, ec2SecurityGroups, ARN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheSecurityGroup {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    cacheSecurityGroupName: ").append(toIndentedString(cacheSecurityGroupName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ec2SecurityGroups: ").append(toIndentedString(ec2SecurityGroups)).append("\n");
    sb.append("    ARN: ").append(toIndentedString(ARN)).append("\n");
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
    openapiFields.add("OwnerId");
    openapiFields.add("CacheSecurityGroupName");
    openapiFields.add("Description");
    openapiFields.add("EC2SecurityGroups");
    openapiFields.add("ARN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheSecurityGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheSecurityGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheSecurityGroup is not found in the empty JSON string", CacheSecurityGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheSecurityGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheSecurityGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `CacheSecurityGroupName`
      if (jsonObj.get("CacheSecurityGroupName") != null && !jsonObj.get("CacheSecurityGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSecurityGroupName"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `EC2SecurityGroups`
      if (jsonObj.get("EC2SecurityGroups") != null && !jsonObj.get("EC2SecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("EC2SecurityGroups"));
      }
      // validate the optional field `ARN`
      if (jsonObj.get("ARN") != null && !jsonObj.get("ARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ARN"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheSecurityGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheSecurityGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheSecurityGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheSecurityGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheSecurityGroup>() {
           @Override
           public void write(JsonWriter out, CacheSecurityGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheSecurityGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheSecurityGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheSecurityGroup
   * @throws IOException if the JSON string is invalid with respect to CacheSecurityGroup
   */
  public static CacheSecurityGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheSecurityGroup.class);
  }

  /**
   * Convert an instance of CacheSecurityGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

