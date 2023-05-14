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
 * CreateEndpointMessageDmsTransferSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateEndpointMessageDmsTransferSettings {
  public static final String SERIALIZED_NAME_SERVICE_ACCESS_ROLE_ARN = "ServiceAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCESS_ROLE_ARN)
  private String serviceAccessRoleArn;

  public static final String SERIALIZED_NAME_BUCKET_NAME = "BucketName";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  private String bucketName;

  public CreateEndpointMessageDmsTransferSettings() {
  }

  public CreateEndpointMessageDmsTransferSettings serviceAccessRoleArn(String serviceAccessRoleArn) {
    this.serviceAccessRoleArn = serviceAccessRoleArn;
    return this;
  }

  /**
   * Get serviceAccessRoleArn
   * @return serviceAccessRoleArn
   */
  @javax.annotation.Nullable
  public String getServiceAccessRoleArn() {
    return serviceAccessRoleArn;
  }

  public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
    this.serviceAccessRoleArn = serviceAccessRoleArn;
  }


  public CreateEndpointMessageDmsTransferSettings bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Get bucketName
   * @return bucketName
   */
  @javax.annotation.Nullable
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEndpointMessageDmsTransferSettings createEndpointMessageDmsTransferSettings = (CreateEndpointMessageDmsTransferSettings) o;
    return Objects.equals(this.serviceAccessRoleArn, createEndpointMessageDmsTransferSettings.serviceAccessRoleArn) &&
        Objects.equals(this.bucketName, createEndpointMessageDmsTransferSettings.bucketName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccessRoleArn, bucketName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEndpointMessageDmsTransferSettings {\n");
    sb.append("    serviceAccessRoleArn: ").append(toIndentedString(serviceAccessRoleArn)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
    openapiFields.add("BucketName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEndpointMessageDmsTransferSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEndpointMessageDmsTransferSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEndpointMessageDmsTransferSettings is not found in the empty JSON string", CreateEndpointMessageDmsTransferSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEndpointMessageDmsTransferSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEndpointMessageDmsTransferSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ServiceAccessRoleArn`
      if (jsonObj.get("ServiceAccessRoleArn") != null && !jsonObj.get("ServiceAccessRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceAccessRoleArn"));
      }
      // validate the optional field `BucketName`
      if (jsonObj.get("BucketName") != null && !jsonObj.get("BucketName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BucketName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEndpointMessageDmsTransferSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEndpointMessageDmsTransferSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEndpointMessageDmsTransferSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEndpointMessageDmsTransferSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEndpointMessageDmsTransferSettings>() {
           @Override
           public void write(JsonWriter out, CreateEndpointMessageDmsTransferSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEndpointMessageDmsTransferSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEndpointMessageDmsTransferSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEndpointMessageDmsTransferSettings
   * @throws IOException if the JSON string is invalid with respect to CreateEndpointMessageDmsTransferSettings
   */
  public static CreateEndpointMessageDmsTransferSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEndpointMessageDmsTransferSettings.class);
  }

  /**
   * Convert an instance of CreateEndpointMessageDmsTransferSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

