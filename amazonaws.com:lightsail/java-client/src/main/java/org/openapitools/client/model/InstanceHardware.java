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
 * InstanceHardware
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class InstanceHardware {
  public static final String SERIALIZED_NAME_CPU_COUNT = "cpuCount";
  @SerializedName(SERIALIZED_NAME_CPU_COUNT)
  private Integer cpuCount;

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private List disks;

  public static final String SERIALIZED_NAME_RAM_SIZE_IN_GB = "ramSizeInGb";
  @SerializedName(SERIALIZED_NAME_RAM_SIZE_IN_GB)
  private Float ramSizeInGb;

  public InstanceHardware() {
  }

  public InstanceHardware cpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * Get cpuCount
   * @return cpuCount
   */
  @javax.annotation.Nullable
  public Integer getCpuCount() {
    return cpuCount;
  }

  public void setCpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
  }


  public InstanceHardware disks(List disks) {
    this.disks = disks;
    return this;
  }

  /**
   * Get disks
   * @return disks
   */
  @javax.annotation.Nullable
  public List getDisks() {
    return disks;
  }

  public void setDisks(List disks) {
    this.disks = disks;
  }


  public InstanceHardware ramSizeInGb(Float ramSizeInGb) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceHardware instanceHardware = (InstanceHardware) o;
    return Objects.equals(this.cpuCount, instanceHardware.cpuCount) &&
        Objects.equals(this.disks, instanceHardware.disks) &&
        Objects.equals(this.ramSizeInGb, instanceHardware.ramSizeInGb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuCount, disks, ramSizeInGb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceHardware {\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    ramSizeInGb: ").append(toIndentedString(ramSizeInGb)).append("\n");
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
    openapiFields.add("cpuCount");
    openapiFields.add("disks");
    openapiFields.add("ramSizeInGb");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InstanceHardware
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstanceHardware.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstanceHardware is not found in the empty JSON string", InstanceHardware.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InstanceHardware.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstanceHardware` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cpuCount`
      if (jsonObj.get("cpuCount") != null && !jsonObj.get("cpuCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("cpuCount"));
      }
      // validate the optional field `disks`
      if (jsonObj.get("disks") != null && !jsonObj.get("disks").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("disks"));
      }
      // validate the optional field `ramSizeInGb`
      if (jsonObj.get("ramSizeInGb") != null && !jsonObj.get("ramSizeInGb").isJsonNull()) {
        Float.validateJsonElement(jsonObj.get("ramSizeInGb"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstanceHardware.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstanceHardware' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstanceHardware> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstanceHardware.class));

       return (TypeAdapter<T>) new TypeAdapter<InstanceHardware>() {
           @Override
           public void write(JsonWriter out, InstanceHardware value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstanceHardware read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InstanceHardware given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InstanceHardware
   * @throws IOException if the JSON string is invalid with respect to InstanceHardware
   */
  public static InstanceHardware fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstanceHardware.class);
  }

  /**
   * Convert an instance of InstanceHardware to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

