/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
 * ModifyEndpointMessageElasticsearchSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ModifyEndpointMessageElasticsearchSettings {
  public static final String SERIALIZED_NAME_SERVICE_ACCESS_ROLE_ARN = "ServiceAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCESS_ROLE_ARN)
  private String serviceAccessRoleArn;

  public static final String SERIALIZED_NAME_ENDPOINT_URI = "EndpointUri";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_URI)
  private String endpointUri;

  public static final String SERIALIZED_NAME_FULL_LOAD_ERROR_PERCENTAGE = "FullLoadErrorPercentage";
  @SerializedName(SERIALIZED_NAME_FULL_LOAD_ERROR_PERCENTAGE)
  private Integer fullLoadErrorPercentage;

  public static final String SERIALIZED_NAME_ERROR_RETRY_DURATION = "ErrorRetryDuration";
  @SerializedName(SERIALIZED_NAME_ERROR_RETRY_DURATION)
  private Integer errorRetryDuration;

  public static final String SERIALIZED_NAME_USE_NEW_MAPPING_TYPE = "UseNewMappingType";
  @SerializedName(SERIALIZED_NAME_USE_NEW_MAPPING_TYPE)
  private Boolean useNewMappingType;

  public ModifyEndpointMessageElasticsearchSettings() {
  }

  public ModifyEndpointMessageElasticsearchSettings serviceAccessRoleArn(String serviceAccessRoleArn) {
    this.serviceAccessRoleArn = serviceAccessRoleArn;
    return this;
  }

  /**
   * Get serviceAccessRoleArn
   * @return serviceAccessRoleArn
   */
  @javax.annotation.Nonnull
  public String getServiceAccessRoleArn() {
    return serviceAccessRoleArn;
  }

  public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
    this.serviceAccessRoleArn = serviceAccessRoleArn;
  }


  public ModifyEndpointMessageElasticsearchSettings endpointUri(String endpointUri) {
    this.endpointUri = endpointUri;
    return this;
  }

  /**
   * Get endpointUri
   * @return endpointUri
   */
  @javax.annotation.Nonnull
  public String getEndpointUri() {
    return endpointUri;
  }

  public void setEndpointUri(String endpointUri) {
    this.endpointUri = endpointUri;
  }


  public ModifyEndpointMessageElasticsearchSettings fullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
    this.fullLoadErrorPercentage = fullLoadErrorPercentage;
    return this;
  }

  /**
   * Get fullLoadErrorPercentage
   * @return fullLoadErrorPercentage
   */
  @javax.annotation.Nullable
  public Integer getFullLoadErrorPercentage() {
    return fullLoadErrorPercentage;
  }

  public void setFullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
    this.fullLoadErrorPercentage = fullLoadErrorPercentage;
  }


  public ModifyEndpointMessageElasticsearchSettings errorRetryDuration(Integer errorRetryDuration) {
    this.errorRetryDuration = errorRetryDuration;
    return this;
  }

  /**
   * Get errorRetryDuration
   * @return errorRetryDuration
   */
  @javax.annotation.Nullable
  public Integer getErrorRetryDuration() {
    return errorRetryDuration;
  }

  public void setErrorRetryDuration(Integer errorRetryDuration) {
    this.errorRetryDuration = errorRetryDuration;
  }


  public ModifyEndpointMessageElasticsearchSettings useNewMappingType(Boolean useNewMappingType) {
    this.useNewMappingType = useNewMappingType;
    return this;
  }

  /**
   * Get useNewMappingType
   * @return useNewMappingType
   */
  @javax.annotation.Nullable
  public Boolean getUseNewMappingType() {
    return useNewMappingType;
  }

  public void setUseNewMappingType(Boolean useNewMappingType) {
    this.useNewMappingType = useNewMappingType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyEndpointMessageElasticsearchSettings modifyEndpointMessageElasticsearchSettings = (ModifyEndpointMessageElasticsearchSettings) o;
    return Objects.equals(this.serviceAccessRoleArn, modifyEndpointMessageElasticsearchSettings.serviceAccessRoleArn) &&
        Objects.equals(this.endpointUri, modifyEndpointMessageElasticsearchSettings.endpointUri) &&
        Objects.equals(this.fullLoadErrorPercentage, modifyEndpointMessageElasticsearchSettings.fullLoadErrorPercentage) &&
        Objects.equals(this.errorRetryDuration, modifyEndpointMessageElasticsearchSettings.errorRetryDuration) &&
        Objects.equals(this.useNewMappingType, modifyEndpointMessageElasticsearchSettings.useNewMappingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccessRoleArn, endpointUri, fullLoadErrorPercentage, errorRetryDuration, useNewMappingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyEndpointMessageElasticsearchSettings {\n");
    sb.append("    serviceAccessRoleArn: ").append(toIndentedString(serviceAccessRoleArn)).append("\n");
    sb.append("    endpointUri: ").append(toIndentedString(endpointUri)).append("\n");
    sb.append("    fullLoadErrorPercentage: ").append(toIndentedString(fullLoadErrorPercentage)).append("\n");
    sb.append("    errorRetryDuration: ").append(toIndentedString(errorRetryDuration)).append("\n");
    sb.append("    useNewMappingType: ").append(toIndentedString(useNewMappingType)).append("\n");
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
    openapiFields.add("ServiceAccessRoleArn");
    openapiFields.add("EndpointUri");
    openapiFields.add("FullLoadErrorPercentage");
    openapiFields.add("ErrorRetryDuration");
    openapiFields.add("UseNewMappingType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ServiceAccessRoleArn");
    openapiRequiredFields.add("EndpointUri");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModifyEndpointMessageElasticsearchSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyEndpointMessageElasticsearchSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyEndpointMessageElasticsearchSettings is not found in the empty JSON string", ModifyEndpointMessageElasticsearchSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModifyEndpointMessageElasticsearchSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyEndpointMessageElasticsearchSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyEndpointMessageElasticsearchSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ServiceAccessRoleArn`
      String.validateJsonElement(jsonObj.get("ServiceAccessRoleArn"));
      // validate the required field `EndpointUri`
      String.validateJsonElement(jsonObj.get("EndpointUri"));
      // validate the optional field `FullLoadErrorPercentage`
      if (jsonObj.get("FullLoadErrorPercentage") != null && !jsonObj.get("FullLoadErrorPercentage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("FullLoadErrorPercentage"));
      }
      // validate the optional field `ErrorRetryDuration`
      if (jsonObj.get("ErrorRetryDuration") != null && !jsonObj.get("ErrorRetryDuration").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ErrorRetryDuration"));
      }
      // validate the optional field `UseNewMappingType`
      if (jsonObj.get("UseNewMappingType") != null && !jsonObj.get("UseNewMappingType").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("UseNewMappingType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyEndpointMessageElasticsearchSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyEndpointMessageElasticsearchSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyEndpointMessageElasticsearchSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyEndpointMessageElasticsearchSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyEndpointMessageElasticsearchSettings>() {
           @Override
           public void write(JsonWriter out, ModifyEndpointMessageElasticsearchSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyEndpointMessageElasticsearchSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModifyEndpointMessageElasticsearchSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModifyEndpointMessageElasticsearchSettings
   * @throws IOException if the JSON string is invalid with respect to ModifyEndpointMessageElasticsearchSettings
   */
  public static ModifyEndpointMessageElasticsearchSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyEndpointMessageElasticsearchSettings.class);
  }

  /**
   * Convert an instance of ModifyEndpointMessageElasticsearchSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

