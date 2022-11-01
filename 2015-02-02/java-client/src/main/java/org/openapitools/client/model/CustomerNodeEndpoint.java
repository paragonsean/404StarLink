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
 * The endpoint from which data should be migrated.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:01.012361-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CustomerNodeEndpoint {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public CustomerNodeEndpoint() {
  }

  public CustomerNodeEndpoint address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public CustomerNodeEndpoint port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerNodeEndpoint customerNodeEndpoint = (CustomerNodeEndpoint) o;
    return Objects.equals(this.address, customerNodeEndpoint.address) &&
        Objects.equals(this.port, customerNodeEndpoint.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerNodeEndpoint {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("Address");
    openapiFields.add("Port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomerNodeEndpoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerNodeEndpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerNodeEndpoint is not found in the empty JSON string", CustomerNodeEndpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerNodeEndpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerNodeEndpoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Address`
      if (jsonObj.get("Address") != null && !jsonObj.get("Address").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Address"));
      }
      // validate the optional field `Port`
      if (jsonObj.get("Port") != null && !jsonObj.get("Port").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Port"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerNodeEndpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerNodeEndpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerNodeEndpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerNodeEndpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerNodeEndpoint>() {
           @Override
           public void write(JsonWriter out, CustomerNodeEndpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerNodeEndpoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomerNodeEndpoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomerNodeEndpoint
   * @throws IOException if the JSON string is invalid with respect to CustomerNodeEndpoint
   */
  public static CustomerNodeEndpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerNodeEndpoint.class);
  }

  /**
   * Convert an instance of CustomerNodeEndpoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

