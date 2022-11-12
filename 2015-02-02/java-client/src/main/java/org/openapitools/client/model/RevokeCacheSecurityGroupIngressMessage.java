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
 * Represents the input of a &lt;code&gt;RevokeCacheSecurityGroupIngress&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:10.865581-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RevokeCacheSecurityGroupIngressMessage {
  public static final String SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME = "CacheSecurityGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME)
  private String cacheSecurityGroupName;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_NAME = "EC2SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_NAME)
  private String ec2SecurityGroupName;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_OWNER_ID = "EC2SecurityGroupOwnerId";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_OWNER_ID)
  private String ec2SecurityGroupOwnerId;

  public RevokeCacheSecurityGroupIngressMessage() {
  }

  public RevokeCacheSecurityGroupIngressMessage cacheSecurityGroupName(String cacheSecurityGroupName) {
    this.cacheSecurityGroupName = cacheSecurityGroupName;
    return this;
  }

  /**
   * Get cacheSecurityGroupName
   * @return cacheSecurityGroupName
   */
  @javax.annotation.Nonnull
  public String getCacheSecurityGroupName() {
    return cacheSecurityGroupName;
  }

  public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
    this.cacheSecurityGroupName = cacheSecurityGroupName;
  }


  public RevokeCacheSecurityGroupIngressMessage ec2SecurityGroupName(String ec2SecurityGroupName) {
    this.ec2SecurityGroupName = ec2SecurityGroupName;
    return this;
  }

  /**
   * Get ec2SecurityGroupName
   * @return ec2SecurityGroupName
   */
  @javax.annotation.Nonnull
  public String getEc2SecurityGroupName() {
    return ec2SecurityGroupName;
  }

  public void setEc2SecurityGroupName(String ec2SecurityGroupName) {
    this.ec2SecurityGroupName = ec2SecurityGroupName;
  }


  public RevokeCacheSecurityGroupIngressMessage ec2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
    this.ec2SecurityGroupOwnerId = ec2SecurityGroupOwnerId;
    return this;
  }

  /**
   * Get ec2SecurityGroupOwnerId
   * @return ec2SecurityGroupOwnerId
   */
  @javax.annotation.Nonnull
  public String getEc2SecurityGroupOwnerId() {
    return ec2SecurityGroupOwnerId;
  }

  public void setEc2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
    this.ec2SecurityGroupOwnerId = ec2SecurityGroupOwnerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeCacheSecurityGroupIngressMessage revokeCacheSecurityGroupIngressMessage = (RevokeCacheSecurityGroupIngressMessage) o;
    return Objects.equals(this.cacheSecurityGroupName, revokeCacheSecurityGroupIngressMessage.cacheSecurityGroupName) &&
        Objects.equals(this.ec2SecurityGroupName, revokeCacheSecurityGroupIngressMessage.ec2SecurityGroupName) &&
        Objects.equals(this.ec2SecurityGroupOwnerId, revokeCacheSecurityGroupIngressMessage.ec2SecurityGroupOwnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheSecurityGroupName, ec2SecurityGroupName, ec2SecurityGroupOwnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeCacheSecurityGroupIngressMessage {\n");
    sb.append("    cacheSecurityGroupName: ").append(toIndentedString(cacheSecurityGroupName)).append("\n");
    sb.append("    ec2SecurityGroupName: ").append(toIndentedString(ec2SecurityGroupName)).append("\n");
    sb.append("    ec2SecurityGroupOwnerId: ").append(toIndentedString(ec2SecurityGroupOwnerId)).append("\n");
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
    openapiFields.add("CacheSecurityGroupName");
    openapiFields.add("EC2SecurityGroupName");
    openapiFields.add("EC2SecurityGroupOwnerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CacheSecurityGroupName");
    openapiRequiredFields.add("EC2SecurityGroupName");
    openapiRequiredFields.add("EC2SecurityGroupOwnerId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RevokeCacheSecurityGroupIngressMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RevokeCacheSecurityGroupIngressMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevokeCacheSecurityGroupIngressMessage is not found in the empty JSON string", RevokeCacheSecurityGroupIngressMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RevokeCacheSecurityGroupIngressMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevokeCacheSecurityGroupIngressMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RevokeCacheSecurityGroupIngressMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CacheSecurityGroupName`
      String.validateJsonElement(jsonObj.get("CacheSecurityGroupName"));
      // validate the required field `EC2SecurityGroupName`
      String.validateJsonElement(jsonObj.get("EC2SecurityGroupName"));
      // validate the required field `EC2SecurityGroupOwnerId`
      String.validateJsonElement(jsonObj.get("EC2SecurityGroupOwnerId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevokeCacheSecurityGroupIngressMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevokeCacheSecurityGroupIngressMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevokeCacheSecurityGroupIngressMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevokeCacheSecurityGroupIngressMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<RevokeCacheSecurityGroupIngressMessage>() {
           @Override
           public void write(JsonWriter out, RevokeCacheSecurityGroupIngressMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevokeCacheSecurityGroupIngressMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RevokeCacheSecurityGroupIngressMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RevokeCacheSecurityGroupIngressMessage
   * @throws IOException if the JSON string is invalid with respect to RevokeCacheSecurityGroupIngressMessage
   */
  public static RevokeCacheSecurityGroupIngressMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevokeCacheSecurityGroupIngressMessage.class);
  }

  /**
   * Convert an instance of RevokeCacheSecurityGroupIngressMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

