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
import org.openapitools.client.model.SubnetSubnetAvailabilityZone;
import org.openapitools.client.model.SubnetSubnetOutpost;

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
 * SubnetListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:05.565321-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SubnetListInner {
  public static final String SERIALIZED_NAME_SUBNET_IDENTIFIER = "SubnetIdentifier";
  @SerializedName(SERIALIZED_NAME_SUBNET_IDENTIFIER)
  private String subnetIdentifier;

  public static final String SERIALIZED_NAME_SUBNET_AVAILABILITY_ZONE = "SubnetAvailabilityZone";
  @SerializedName(SERIALIZED_NAME_SUBNET_AVAILABILITY_ZONE)
  private SubnetSubnetAvailabilityZone subnetAvailabilityZone;

  public static final String SERIALIZED_NAME_SUBNET_OUTPOST = "SubnetOutpost";
  @SerializedName(SERIALIZED_NAME_SUBNET_OUTPOST)
  private SubnetSubnetOutpost subnetOutpost;

  public static final String SERIALIZED_NAME_SUPPORTED_NETWORK_TYPES = "SupportedNetworkTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_NETWORK_TYPES)
  private List supportedNetworkTypes;

  public SubnetListInner() {
  }

  public SubnetListInner subnetIdentifier(String subnetIdentifier) {
    this.subnetIdentifier = subnetIdentifier;
    return this;
  }

  /**
   * Get subnetIdentifier
   * @return subnetIdentifier
   */
  @javax.annotation.Nullable
  public String getSubnetIdentifier() {
    return subnetIdentifier;
  }

  public void setSubnetIdentifier(String subnetIdentifier) {
    this.subnetIdentifier = subnetIdentifier;
  }


  public SubnetListInner subnetAvailabilityZone(SubnetSubnetAvailabilityZone subnetAvailabilityZone) {
    this.subnetAvailabilityZone = subnetAvailabilityZone;
    return this;
  }

  /**
   * Get subnetAvailabilityZone
   * @return subnetAvailabilityZone
   */
  @javax.annotation.Nullable
  public SubnetSubnetAvailabilityZone getSubnetAvailabilityZone() {
    return subnetAvailabilityZone;
  }

  public void setSubnetAvailabilityZone(SubnetSubnetAvailabilityZone subnetAvailabilityZone) {
    this.subnetAvailabilityZone = subnetAvailabilityZone;
  }


  public SubnetListInner subnetOutpost(SubnetSubnetOutpost subnetOutpost) {
    this.subnetOutpost = subnetOutpost;
    return this;
  }

  /**
   * Get subnetOutpost
   * @return subnetOutpost
   */
  @javax.annotation.Nullable
  public SubnetSubnetOutpost getSubnetOutpost() {
    return subnetOutpost;
  }

  public void setSubnetOutpost(SubnetSubnetOutpost subnetOutpost) {
    this.subnetOutpost = subnetOutpost;
  }


  public SubnetListInner supportedNetworkTypes(List supportedNetworkTypes) {
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
    SubnetListInner subnetListInner = (SubnetListInner) o;
    return Objects.equals(this.subnetIdentifier, subnetListInner.subnetIdentifier) &&
        Objects.equals(this.subnetAvailabilityZone, subnetListInner.subnetAvailabilityZone) &&
        Objects.equals(this.subnetOutpost, subnetListInner.subnetOutpost) &&
        Objects.equals(this.supportedNetworkTypes, subnetListInner.supportedNetworkTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetIdentifier, subnetAvailabilityZone, subnetOutpost, supportedNetworkTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetListInner {\n");
    sb.append("    subnetIdentifier: ").append(toIndentedString(subnetIdentifier)).append("\n");
    sb.append("    subnetAvailabilityZone: ").append(toIndentedString(subnetAvailabilityZone)).append("\n");
    sb.append("    subnetOutpost: ").append(toIndentedString(subnetOutpost)).append("\n");
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
    openapiFields.add("SubnetIdentifier");
    openapiFields.add("SubnetAvailabilityZone");
    openapiFields.add("SubnetOutpost");
    openapiFields.add("SupportedNetworkTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubnetListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubnetListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubnetListInner is not found in the empty JSON string", SubnetListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubnetListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubnetListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `SubnetIdentifier`
      if (jsonObj.get("SubnetIdentifier") != null && !jsonObj.get("SubnetIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetIdentifier"));
      }
      // validate the optional field `SubnetAvailabilityZone`
      if (jsonObj.get("SubnetAvailabilityZone") != null && !jsonObj.get("SubnetAvailabilityZone").isJsonNull()) {
        SubnetSubnetAvailabilityZone.validateJsonElement(jsonObj.get("SubnetAvailabilityZone"));
      }
      // validate the optional field `SubnetOutpost`
      if (jsonObj.get("SubnetOutpost") != null && !jsonObj.get("SubnetOutpost").isJsonNull()) {
        SubnetSubnetOutpost.validateJsonElement(jsonObj.get("SubnetOutpost"));
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
       if (!SubnetListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubnetListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubnetListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubnetListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SubnetListInner>() {
           @Override
           public void write(JsonWriter out, SubnetListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubnetListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubnetListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubnetListInner
   * @throws IOException if the JSON string is invalid with respect to SubnetListInner
   */
  public static SubnetListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubnetListInner.class);
  }

  /**
   * Convert an instance of SubnetListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

