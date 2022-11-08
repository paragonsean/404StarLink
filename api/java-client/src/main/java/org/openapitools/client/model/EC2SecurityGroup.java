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
 * Provides ownership and status information for an Amazon EC2 security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:41.807787-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EC2SecurityGroup {
  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_NAME = "EC2SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_NAME)
  private String ec2SecurityGroupName;

  public static final String SERIALIZED_NAME_EC2_SECURITY_GROUP_OWNER_ID = "EC2SecurityGroupOwnerId";
  @SerializedName(SERIALIZED_NAME_EC2_SECURITY_GROUP_OWNER_ID)
  private String ec2SecurityGroupOwnerId;

  public EC2SecurityGroup() {
  }

  public EC2SecurityGroup status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public EC2SecurityGroup ec2SecurityGroupName(String ec2SecurityGroupName) {
    this.ec2SecurityGroupName = ec2SecurityGroupName;
    return this;
  }

  /**
   * Get ec2SecurityGroupName
   * @return ec2SecurityGroupName
   */
  @javax.annotation.Nullable
  public String getEc2SecurityGroupName() {
    return ec2SecurityGroupName;
  }

  public void setEc2SecurityGroupName(String ec2SecurityGroupName) {
    this.ec2SecurityGroupName = ec2SecurityGroupName;
  }


  public EC2SecurityGroup ec2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
    this.ec2SecurityGroupOwnerId = ec2SecurityGroupOwnerId;
    return this;
  }

  /**
   * Get ec2SecurityGroupOwnerId
   * @return ec2SecurityGroupOwnerId
   */
  @javax.annotation.Nullable
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
    EC2SecurityGroup ec2SecurityGroup = (EC2SecurityGroup) o;
    return Objects.equals(this.status, ec2SecurityGroup.status) &&
        Objects.equals(this.ec2SecurityGroupName, ec2SecurityGroup.ec2SecurityGroupName) &&
        Objects.equals(this.ec2SecurityGroupOwnerId, ec2SecurityGroup.ec2SecurityGroupOwnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, ec2SecurityGroupName, ec2SecurityGroupOwnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EC2SecurityGroup {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("EC2SecurityGroupName");
    openapiFields.add("EC2SecurityGroupOwnerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EC2SecurityGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EC2SecurityGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EC2SecurityGroup is not found in the empty JSON string", EC2SecurityGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EC2SecurityGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EC2SecurityGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `EC2SecurityGroupName`
      if (jsonObj.get("EC2SecurityGroupName") != null && !jsonObj.get("EC2SecurityGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EC2SecurityGroupName"));
      }
      // validate the optional field `EC2SecurityGroupOwnerId`
      if (jsonObj.get("EC2SecurityGroupOwnerId") != null && !jsonObj.get("EC2SecurityGroupOwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EC2SecurityGroupOwnerId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EC2SecurityGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EC2SecurityGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EC2SecurityGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EC2SecurityGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<EC2SecurityGroup>() {
           @Override
           public void write(JsonWriter out, EC2SecurityGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EC2SecurityGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EC2SecurityGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EC2SecurityGroup
   * @throws IOException if the JSON string is invalid with respect to EC2SecurityGroup
   */
  public static EC2SecurityGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EC2SecurityGroup.class);
  }

  /**
   * Convert an instance of EC2SecurityGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

