/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
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
import org.openapitools.client.model.S3DataConfig;

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
 * CreateMetricAttributionRequestMetricsOutputConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateMetricAttributionRequestMetricsOutputConfig {
  public static final String SERIALIZED_NAME_S3_DATA_DESTINATION = "s3DataDestination";
  @SerializedName(SERIALIZED_NAME_S3_DATA_DESTINATION)
  private S3DataConfig s3DataDestination;

  public static final String SERIALIZED_NAME_ROLE_ARN = "roleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public CreateMetricAttributionRequestMetricsOutputConfig() {
  }

  public CreateMetricAttributionRequestMetricsOutputConfig s3DataDestination(S3DataConfig s3DataDestination) {
    this.s3DataDestination = s3DataDestination;
    return this;
  }

  /**
   * Get s3DataDestination
   * @return s3DataDestination
   */
  @javax.annotation.Nullable
  public S3DataConfig getS3DataDestination() {
    return s3DataDestination;
  }

  public void setS3DataDestination(S3DataConfig s3DataDestination) {
    this.s3DataDestination = s3DataDestination;
  }


  public CreateMetricAttributionRequestMetricsOutputConfig roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMetricAttributionRequestMetricsOutputConfig createMetricAttributionRequestMetricsOutputConfig = (CreateMetricAttributionRequestMetricsOutputConfig) o;
    return Objects.equals(this.s3DataDestination, createMetricAttributionRequestMetricsOutputConfig.s3DataDestination) &&
        Objects.equals(this.roleArn, createMetricAttributionRequestMetricsOutputConfig.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3DataDestination, roleArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMetricAttributionRequestMetricsOutputConfig {\n");
    sb.append("    s3DataDestination: ").append(toIndentedString(s3DataDestination)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
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
    openapiFields.add("s3DataDestination");
    openapiFields.add("roleArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("roleArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateMetricAttributionRequestMetricsOutputConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateMetricAttributionRequestMetricsOutputConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMetricAttributionRequestMetricsOutputConfig is not found in the empty JSON string", CreateMetricAttributionRequestMetricsOutputConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateMetricAttributionRequestMetricsOutputConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMetricAttributionRequestMetricsOutputConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateMetricAttributionRequestMetricsOutputConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `s3DataDestination`
      if (jsonObj.get("s3DataDestination") != null && !jsonObj.get("s3DataDestination").isJsonNull()) {
        S3DataConfig.validateJsonElement(jsonObj.get("s3DataDestination"));
      }
      // validate the required field `roleArn`
      String.validateJsonElement(jsonObj.get("roleArn"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMetricAttributionRequestMetricsOutputConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMetricAttributionRequestMetricsOutputConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMetricAttributionRequestMetricsOutputConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMetricAttributionRequestMetricsOutputConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMetricAttributionRequestMetricsOutputConfig>() {
           @Override
           public void write(JsonWriter out, CreateMetricAttributionRequestMetricsOutputConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMetricAttributionRequestMetricsOutputConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateMetricAttributionRequestMetricsOutputConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateMetricAttributionRequestMetricsOutputConfig
   * @throws IOException if the JSON string is invalid with respect to CreateMetricAttributionRequestMetricsOutputConfig
   */
  public static CreateMetricAttributionRequestMetricsOutputConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMetricAttributionRequestMetricsOutputConfig.class);
  }

  /**
   * Convert an instance of CreateMetricAttributionRequestMetricsOutputConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

