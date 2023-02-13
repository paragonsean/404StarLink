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
 * Describes a database bundle. A bundle describes the performance specifications of the database.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RelationalDatabaseBundle {
  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_RAM_SIZE_IN_GB = "ramSizeInGb";
  @SerializedName(SERIALIZED_NAME_RAM_SIZE_IN_GB)
  private Float ramSizeInGb;

  public static final String SERIALIZED_NAME_DISK_SIZE_IN_GB = "diskSizeInGb";
  @SerializedName(SERIALIZED_NAME_DISK_SIZE_IN_GB)
  private Integer diskSizeInGb;

  public static final String SERIALIZED_NAME_TRANSFER_PER_MONTH_IN_GB = "transferPerMonthInGb";
  @SerializedName(SERIALIZED_NAME_TRANSFER_PER_MONTH_IN_GB)
  private Integer transferPerMonthInGb;

  public static final String SERIALIZED_NAME_CPU_COUNT = "cpuCount";
  @SerializedName(SERIALIZED_NAME_CPU_COUNT)
  private Integer cpuCount;

  public static final String SERIALIZED_NAME_IS_ENCRYPTED = "isEncrypted";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPTED)
  private Boolean isEncrypted;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public RelationalDatabaseBundle() {
  }

  public RelationalDatabaseBundle bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
   */
  @javax.annotation.Nullable
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public RelationalDatabaseBundle name(String name) {
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


  public RelationalDatabaseBundle price(Float price) {
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


  public RelationalDatabaseBundle ramSizeInGb(Float ramSizeInGb) {
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


  public RelationalDatabaseBundle diskSizeInGb(Integer diskSizeInGb) {
    this.diskSizeInGb = diskSizeInGb;
    return this;
  }

  /**
   * Get diskSizeInGb
   * @return diskSizeInGb
   */
  @javax.annotation.Nullable
  public Integer getDiskSizeInGb() {
    return diskSizeInGb;
  }

  public void setDiskSizeInGb(Integer diskSizeInGb) {
    this.diskSizeInGb = diskSizeInGb;
  }


  public RelationalDatabaseBundle transferPerMonthInGb(Integer transferPerMonthInGb) {
    this.transferPerMonthInGb = transferPerMonthInGb;
    return this;
  }

  /**
   * Get transferPerMonthInGb
   * @return transferPerMonthInGb
   */
  @javax.annotation.Nullable
  public Integer getTransferPerMonthInGb() {
    return transferPerMonthInGb;
  }

  public void setTransferPerMonthInGb(Integer transferPerMonthInGb) {
    this.transferPerMonthInGb = transferPerMonthInGb;
  }


  public RelationalDatabaseBundle cpuCount(Integer cpuCount) {
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


  public RelationalDatabaseBundle isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

  /**
   * Get isEncrypted
   * @return isEncrypted
   */
  @javax.annotation.Nullable
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  public RelationalDatabaseBundle isActive(Boolean isActive) {
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
    RelationalDatabaseBundle relationalDatabaseBundle = (RelationalDatabaseBundle) o;
    return Objects.equals(this.bundleId, relationalDatabaseBundle.bundleId) &&
        Objects.equals(this.name, relationalDatabaseBundle.name) &&
        Objects.equals(this.price, relationalDatabaseBundle.price) &&
        Objects.equals(this.ramSizeInGb, relationalDatabaseBundle.ramSizeInGb) &&
        Objects.equals(this.diskSizeInGb, relationalDatabaseBundle.diskSizeInGb) &&
        Objects.equals(this.transferPerMonthInGb, relationalDatabaseBundle.transferPerMonthInGb) &&
        Objects.equals(this.cpuCount, relationalDatabaseBundle.cpuCount) &&
        Objects.equals(this.isEncrypted, relationalDatabaseBundle.isEncrypted) &&
        Objects.equals(this.isActive, relationalDatabaseBundle.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, name, price, ramSizeInGb, diskSizeInGb, transferPerMonthInGb, cpuCount, isEncrypted, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalDatabaseBundle {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ramSizeInGb: ").append(toIndentedString(ramSizeInGb)).append("\n");
    sb.append("    diskSizeInGb: ").append(toIndentedString(diskSizeInGb)).append("\n");
    sb.append("    transferPerMonthInGb: ").append(toIndentedString(transferPerMonthInGb)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
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
    openapiFields.add("bundleId");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("ramSizeInGb");
    openapiFields.add("diskSizeInGb");
    openapiFields.add("transferPerMonthInGb");
    openapiFields.add("cpuCount");
    openapiFields.add("isEncrypted");
    openapiFields.add("isActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelationalDatabaseBundle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelationalDatabaseBundle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationalDatabaseBundle is not found in the empty JSON string", RelationalDatabaseBundle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelationalDatabaseBundle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelationalDatabaseBundle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bundleId`
      if (jsonObj.get("bundleId") != null && !jsonObj.get("bundleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("bundleId"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        Float.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `ramSizeInGb`
      if (jsonObj.get("ramSizeInGb") != null && !jsonObj.get("ramSizeInGb").isJsonNull()) {
        Float.validateJsonElement(jsonObj.get("ramSizeInGb"));
      }
      // validate the optional field `diskSizeInGb`
      if (jsonObj.get("diskSizeInGb") != null && !jsonObj.get("diskSizeInGb").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("diskSizeInGb"));
      }
      // validate the optional field `transferPerMonthInGb`
      if (jsonObj.get("transferPerMonthInGb") != null && !jsonObj.get("transferPerMonthInGb").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("transferPerMonthInGb"));
      }
      // validate the optional field `cpuCount`
      if (jsonObj.get("cpuCount") != null && !jsonObj.get("cpuCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("cpuCount"));
      }
      // validate the optional field `isEncrypted`
      if (jsonObj.get("isEncrypted") != null && !jsonObj.get("isEncrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isEncrypted"));
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
       if (!RelationalDatabaseBundle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationalDatabaseBundle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationalDatabaseBundle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationalDatabaseBundle.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationalDatabaseBundle>() {
           @Override
           public void write(JsonWriter out, RelationalDatabaseBundle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelationalDatabaseBundle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelationalDatabaseBundle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelationalDatabaseBundle
   * @throws IOException if the JSON string is invalid with respect to RelationalDatabaseBundle
   */
  public static RelationalDatabaseBundle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationalDatabaseBundle.class);
  }

  /**
   * Convert an instance of RelationalDatabaseBundle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

