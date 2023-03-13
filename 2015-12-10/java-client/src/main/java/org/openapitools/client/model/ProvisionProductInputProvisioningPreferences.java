/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
 * ProvisionProductInputProvisioningPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisionProductInputProvisioningPreferences {
  public static final String SERIALIZED_NAME_STACK_SET_ACCOUNTS = "StackSetAccounts";
  @SerializedName(SERIALIZED_NAME_STACK_SET_ACCOUNTS)
  private List stackSetAccounts;

  public static final String SERIALIZED_NAME_STACK_SET_REGIONS = "StackSetRegions";
  @SerializedName(SERIALIZED_NAME_STACK_SET_REGIONS)
  private List stackSetRegions;

  public static final String SERIALIZED_NAME_STACK_SET_FAILURE_TOLERANCE_COUNT = "StackSetFailureToleranceCount";
  @SerializedName(SERIALIZED_NAME_STACK_SET_FAILURE_TOLERANCE_COUNT)
  private Integer stackSetFailureToleranceCount;

  public static final String SERIALIZED_NAME_STACK_SET_FAILURE_TOLERANCE_PERCENTAGE = "StackSetFailureTolerancePercentage";
  @SerializedName(SERIALIZED_NAME_STACK_SET_FAILURE_TOLERANCE_PERCENTAGE)
  private Integer stackSetFailureTolerancePercentage;

  public static final String SERIALIZED_NAME_STACK_SET_MAX_CONCURRENCY_COUNT = "StackSetMaxConcurrencyCount";
  @SerializedName(SERIALIZED_NAME_STACK_SET_MAX_CONCURRENCY_COUNT)
  private Integer stackSetMaxConcurrencyCount;

  public static final String SERIALIZED_NAME_STACK_SET_MAX_CONCURRENCY_PERCENTAGE = "StackSetMaxConcurrencyPercentage";
  @SerializedName(SERIALIZED_NAME_STACK_SET_MAX_CONCURRENCY_PERCENTAGE)
  private Integer stackSetMaxConcurrencyPercentage;

  public ProvisionProductInputProvisioningPreferences() {
  }

  public ProvisionProductInputProvisioningPreferences stackSetAccounts(List stackSetAccounts) {
    this.stackSetAccounts = stackSetAccounts;
    return this;
  }

  /**
   * Get stackSetAccounts
   * @return stackSetAccounts
   */
  @javax.annotation.Nullable
  public List getStackSetAccounts() {
    return stackSetAccounts;
  }

  public void setStackSetAccounts(List stackSetAccounts) {
    this.stackSetAccounts = stackSetAccounts;
  }


  public ProvisionProductInputProvisioningPreferences stackSetRegions(List stackSetRegions) {
    this.stackSetRegions = stackSetRegions;
    return this;
  }

  /**
   * Get stackSetRegions
   * @return stackSetRegions
   */
  @javax.annotation.Nullable
  public List getStackSetRegions() {
    return stackSetRegions;
  }

  public void setStackSetRegions(List stackSetRegions) {
    this.stackSetRegions = stackSetRegions;
  }


  public ProvisionProductInputProvisioningPreferences stackSetFailureToleranceCount(Integer stackSetFailureToleranceCount) {
    this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
    return this;
  }

  /**
   * Get stackSetFailureToleranceCount
   * @return stackSetFailureToleranceCount
   */
  @javax.annotation.Nullable
  public Integer getStackSetFailureToleranceCount() {
    return stackSetFailureToleranceCount;
  }

  public void setStackSetFailureToleranceCount(Integer stackSetFailureToleranceCount) {
    this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
  }


  public ProvisionProductInputProvisioningPreferences stackSetFailureTolerancePercentage(Integer stackSetFailureTolerancePercentage) {
    this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
    return this;
  }

  /**
   * Get stackSetFailureTolerancePercentage
   * @return stackSetFailureTolerancePercentage
   */
  @javax.annotation.Nullable
  public Integer getStackSetFailureTolerancePercentage() {
    return stackSetFailureTolerancePercentage;
  }

  public void setStackSetFailureTolerancePercentage(Integer stackSetFailureTolerancePercentage) {
    this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
  }


  public ProvisionProductInputProvisioningPreferences stackSetMaxConcurrencyCount(Integer stackSetMaxConcurrencyCount) {
    this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
    return this;
  }

  /**
   * Get stackSetMaxConcurrencyCount
   * @return stackSetMaxConcurrencyCount
   */
  @javax.annotation.Nullable
  public Integer getStackSetMaxConcurrencyCount() {
    return stackSetMaxConcurrencyCount;
  }

  public void setStackSetMaxConcurrencyCount(Integer stackSetMaxConcurrencyCount) {
    this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
  }


  public ProvisionProductInputProvisioningPreferences stackSetMaxConcurrencyPercentage(Integer stackSetMaxConcurrencyPercentage) {
    this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
    return this;
  }

  /**
   * Get stackSetMaxConcurrencyPercentage
   * @return stackSetMaxConcurrencyPercentage
   */
  @javax.annotation.Nullable
  public Integer getStackSetMaxConcurrencyPercentage() {
    return stackSetMaxConcurrencyPercentage;
  }

  public void setStackSetMaxConcurrencyPercentage(Integer stackSetMaxConcurrencyPercentage) {
    this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionProductInputProvisioningPreferences provisionProductInputProvisioningPreferences = (ProvisionProductInputProvisioningPreferences) o;
    return Objects.equals(this.stackSetAccounts, provisionProductInputProvisioningPreferences.stackSetAccounts) &&
        Objects.equals(this.stackSetRegions, provisionProductInputProvisioningPreferences.stackSetRegions) &&
        Objects.equals(this.stackSetFailureToleranceCount, provisionProductInputProvisioningPreferences.stackSetFailureToleranceCount) &&
        Objects.equals(this.stackSetFailureTolerancePercentage, provisionProductInputProvisioningPreferences.stackSetFailureTolerancePercentage) &&
        Objects.equals(this.stackSetMaxConcurrencyCount, provisionProductInputProvisioningPreferences.stackSetMaxConcurrencyCount) &&
        Objects.equals(this.stackSetMaxConcurrencyPercentage, provisionProductInputProvisioningPreferences.stackSetMaxConcurrencyPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackSetAccounts, stackSetRegions, stackSetFailureToleranceCount, stackSetFailureTolerancePercentage, stackSetMaxConcurrencyCount, stackSetMaxConcurrencyPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionProductInputProvisioningPreferences {\n");
    sb.append("    stackSetAccounts: ").append(toIndentedString(stackSetAccounts)).append("\n");
    sb.append("    stackSetRegions: ").append(toIndentedString(stackSetRegions)).append("\n");
    sb.append("    stackSetFailureToleranceCount: ").append(toIndentedString(stackSetFailureToleranceCount)).append("\n");
    sb.append("    stackSetFailureTolerancePercentage: ").append(toIndentedString(stackSetFailureTolerancePercentage)).append("\n");
    sb.append("    stackSetMaxConcurrencyCount: ").append(toIndentedString(stackSetMaxConcurrencyCount)).append("\n");
    sb.append("    stackSetMaxConcurrencyPercentage: ").append(toIndentedString(stackSetMaxConcurrencyPercentage)).append("\n");
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
    openapiFields.add("StackSetAccounts");
    openapiFields.add("StackSetRegions");
    openapiFields.add("StackSetFailureToleranceCount");
    openapiFields.add("StackSetFailureTolerancePercentage");
    openapiFields.add("StackSetMaxConcurrencyCount");
    openapiFields.add("StackSetMaxConcurrencyPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisionProductInputProvisioningPreferences
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisionProductInputProvisioningPreferences.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisionProductInputProvisioningPreferences is not found in the empty JSON string", ProvisionProductInputProvisioningPreferences.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisionProductInputProvisioningPreferences.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisionProductInputProvisioningPreferences` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `StackSetAccounts`
      if (jsonObj.get("StackSetAccounts") != null && !jsonObj.get("StackSetAccounts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("StackSetAccounts"));
      }
      // validate the optional field `StackSetRegions`
      if (jsonObj.get("StackSetRegions") != null && !jsonObj.get("StackSetRegions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("StackSetRegions"));
      }
      // validate the optional field `StackSetFailureToleranceCount`
      if (jsonObj.get("StackSetFailureToleranceCount") != null && !jsonObj.get("StackSetFailureToleranceCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("StackSetFailureToleranceCount"));
      }
      // validate the optional field `StackSetFailureTolerancePercentage`
      if (jsonObj.get("StackSetFailureTolerancePercentage") != null && !jsonObj.get("StackSetFailureTolerancePercentage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("StackSetFailureTolerancePercentage"));
      }
      // validate the optional field `StackSetMaxConcurrencyCount`
      if (jsonObj.get("StackSetMaxConcurrencyCount") != null && !jsonObj.get("StackSetMaxConcurrencyCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("StackSetMaxConcurrencyCount"));
      }
      // validate the optional field `StackSetMaxConcurrencyPercentage`
      if (jsonObj.get("StackSetMaxConcurrencyPercentage") != null && !jsonObj.get("StackSetMaxConcurrencyPercentage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("StackSetMaxConcurrencyPercentage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisionProductInputProvisioningPreferences.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisionProductInputProvisioningPreferences' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisionProductInputProvisioningPreferences> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisionProductInputProvisioningPreferences.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisionProductInputProvisioningPreferences>() {
           @Override
           public void write(JsonWriter out, ProvisionProductInputProvisioningPreferences value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisionProductInputProvisioningPreferences read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisionProductInputProvisioningPreferences given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisionProductInputProvisioningPreferences
   * @throws IOException if the JSON string is invalid with respect to ProvisionProductInputProvisioningPreferences
   */
  public static ProvisionProductInputProvisioningPreferences fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisionProductInputProvisioningPreferences.class);
  }

  /**
   * Convert an instance of ProvisionProductInputProvisioningPreferences to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

