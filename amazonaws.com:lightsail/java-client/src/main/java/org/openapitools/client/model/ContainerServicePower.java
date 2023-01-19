/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
 * &lt;p&gt;Describes the powers that can be specified for an Amazon Lightsail container service.&lt;/p&gt; &lt;p&gt;The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainerServicePower {
  public static final String SERIALIZED_NAME_POWER_ID = "powerId";
  @SerializedName(SERIALIZED_NAME_POWER_ID)
  private String powerId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_CPU_COUNT = "cpuCount";
  @SerializedName(SERIALIZED_NAME_CPU_COUNT)
  private Float cpuCount;

  public static final String SERIALIZED_NAME_RAM_SIZE_IN_GB = "ramSizeInGb";
  @SerializedName(SERIALIZED_NAME_RAM_SIZE_IN_GB)
  private Float ramSizeInGb;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public ContainerServicePower() {
  }

  public ContainerServicePower powerId(String powerId) {
    this.powerId = powerId;
    return this;
  }

  /**
   * Get powerId
   * @return powerId
   */
  @javax.annotation.Nullable
  public String getPowerId() {
    return powerId;
  }

  public void setPowerId(String powerId) {
    this.powerId = powerId;
  }


  public ContainerServicePower price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }


  public ContainerServicePower cpuCount(Float cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * Get cpuCount
   * @return cpuCount
   */
  @javax.annotation.Nullable
  public Float getCpuCount() {
    return cpuCount;
  }

  public void setCpuCount(Float cpuCount) {
    this.cpuCount = cpuCount;
  }


  public ContainerServicePower ramSizeInGb(Float ramSizeInGb) {
    this.ramSizeInGb = ramSizeInGb;
    return this;
  }

  /**
   * Get ramSizeInGb
   * @return ramSizeInGb
   */
  @javax.annotation.Nullable
  public Float getRamSizeInGb() {
    return ramSizeInGb;
  }

  public void setRamSizeInGb(Float ramSizeInGb) {
    this.ramSizeInGb = ramSizeInGb;
  }


  public ContainerServicePower name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ContainerServicePower isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerServicePower containerServicePower = (ContainerServicePower) o;
    return Objects.equals(this.powerId, containerServicePower.powerId) &&
        Objects.equals(this.price, containerServicePower.price) &&
        Objects.equals(this.cpuCount, containerServicePower.cpuCount) &&
        Objects.equals(this.ramSizeInGb, containerServicePower.ramSizeInGb) &&
        Objects.equals(this.name, containerServicePower.name) &&
        Objects.equals(this.isActive, containerServicePower.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerId, price, cpuCount, ramSizeInGb, name, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerServicePower {\n");
    sb.append("    powerId: ").append(toIndentedString(powerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    ramSizeInGb: ").append(toIndentedString(ramSizeInGb)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("powerId");
    openapiFields.add("price");
    openapiFields.add("cpuCount");
    openapiFields.add("ramSizeInGb");
    openapiFields.add("name");
    openapiFields.add("isActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerServicePower
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerServicePower.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerServicePower is not found in the empty JSON string", ContainerServicePower.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerServicePower.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerServicePower` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `powerId`
      if (jsonObj.get("powerId") != null && !jsonObj.get("powerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("powerId"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        Float.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `cpuCount`
      if (jsonObj.get("cpuCount") != null && !jsonObj.get("cpuCount").isJsonNull()) {
        Float.validateJsonElement(jsonObj.get("cpuCount"));
      }
      // validate the optional field `ramSizeInGb`
      if (jsonObj.get("ramSizeInGb") != null && !jsonObj.get("ramSizeInGb").isJsonNull()) {
        Float.validateJsonElement(jsonObj.get("ramSizeInGb"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `isActive`
      if (jsonObj.get("isActive") != null && !jsonObj.get("isActive").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isActive"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerServicePower.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerServicePower' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerServicePower> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerServicePower.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerServicePower>() {
           @Override
           public void write(JsonWriter out, ContainerServicePower value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerServicePower read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerServicePower given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerServicePower
   * @throws IOException if the JSON string is invalid with respect to ContainerServicePower
   */
  public static ContainerServicePower fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerServicePower.class);
  }

  /**
   * Convert an instance of ContainerServicePower to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

