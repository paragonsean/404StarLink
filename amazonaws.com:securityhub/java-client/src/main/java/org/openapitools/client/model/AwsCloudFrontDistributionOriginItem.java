/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import org.openapitools.client.model.AwsCloudFrontDistributionOriginItemCustomOriginConfig;
import org.openapitools.client.model.AwsCloudFrontDistributionOriginItemS3OriginConfig;

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
 * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), AWS Elemental MediaStore, or other server from which CloudFront gets your files.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCloudFrontDistributionOriginItem {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORIGIN_PATH = "OriginPath";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PATH)
  private String originPath;

  public static final String SERIALIZED_NAME_S3_ORIGIN_CONFIG = "S3OriginConfig";
  @SerializedName(SERIALIZED_NAME_S3_ORIGIN_CONFIG)
  private AwsCloudFrontDistributionOriginItemS3OriginConfig s3OriginConfig;

  public static final String SERIALIZED_NAME_CUSTOM_ORIGIN_CONFIG = "CustomOriginConfig";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ORIGIN_CONFIG)
  private AwsCloudFrontDistributionOriginItemCustomOriginConfig customOriginConfig;

  public AwsCloudFrontDistributionOriginItem() {
  }

  public AwsCloudFrontDistributionOriginItem domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public AwsCloudFrontDistributionOriginItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AwsCloudFrontDistributionOriginItem originPath(String originPath) {
    this.originPath = originPath;
    return this;
  }

  /**
   * Get originPath
   * @return originPath
   */
  @javax.annotation.Nullable
  public String getOriginPath() {
    return originPath;
  }

  public void setOriginPath(String originPath) {
    this.originPath = originPath;
  }


  public AwsCloudFrontDistributionOriginItem s3OriginConfig(AwsCloudFrontDistributionOriginItemS3OriginConfig s3OriginConfig) {
    this.s3OriginConfig = s3OriginConfig;
    return this;
  }

  /**
   * Get s3OriginConfig
   * @return s3OriginConfig
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionOriginItemS3OriginConfig getS3OriginConfig() {
    return s3OriginConfig;
  }

  public void setS3OriginConfig(AwsCloudFrontDistributionOriginItemS3OriginConfig s3OriginConfig) {
    this.s3OriginConfig = s3OriginConfig;
  }


  public AwsCloudFrontDistributionOriginItem customOriginConfig(AwsCloudFrontDistributionOriginItemCustomOriginConfig customOriginConfig) {
    this.customOriginConfig = customOriginConfig;
    return this;
  }

  /**
   * Get customOriginConfig
   * @return customOriginConfig
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionOriginItemCustomOriginConfig getCustomOriginConfig() {
    return customOriginConfig;
  }

  public void setCustomOriginConfig(AwsCloudFrontDistributionOriginItemCustomOriginConfig customOriginConfig) {
    this.customOriginConfig = customOriginConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCloudFrontDistributionOriginItem awsCloudFrontDistributionOriginItem = (AwsCloudFrontDistributionOriginItem) o;
    return Objects.equals(this.domainName, awsCloudFrontDistributionOriginItem.domainName) &&
        Objects.equals(this.id, awsCloudFrontDistributionOriginItem.id) &&
        Objects.equals(this.originPath, awsCloudFrontDistributionOriginItem.originPath) &&
        Objects.equals(this.s3OriginConfig, awsCloudFrontDistributionOriginItem.s3OriginConfig) &&
        Objects.equals(this.customOriginConfig, awsCloudFrontDistributionOriginItem.customOriginConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, id, originPath, s3OriginConfig, customOriginConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCloudFrontDistributionOriginItem {\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originPath: ").append(toIndentedString(originPath)).append("\n");
    sb.append("    s3OriginConfig: ").append(toIndentedString(s3OriginConfig)).append("\n");
    sb.append("    customOriginConfig: ").append(toIndentedString(customOriginConfig)).append("\n");
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
    openapiFields.add("DomainName");
    openapiFields.add("Id");
    openapiFields.add("OriginPath");
    openapiFields.add("S3OriginConfig");
    openapiFields.add("CustomOriginConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCloudFrontDistributionOriginItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCloudFrontDistributionOriginItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCloudFrontDistributionOriginItem is not found in the empty JSON string", AwsCloudFrontDistributionOriginItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCloudFrontDistributionOriginItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCloudFrontDistributionOriginItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `OriginPath`
      if (jsonObj.get("OriginPath") != null && !jsonObj.get("OriginPath").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OriginPath"));
      }
      // validate the optional field `S3OriginConfig`
      if (jsonObj.get("S3OriginConfig") != null && !jsonObj.get("S3OriginConfig").isJsonNull()) {
        AwsCloudFrontDistributionOriginItemS3OriginConfig.validateJsonElement(jsonObj.get("S3OriginConfig"));
      }
      // validate the optional field `CustomOriginConfig`
      if (jsonObj.get("CustomOriginConfig") != null && !jsonObj.get("CustomOriginConfig").isJsonNull()) {
        AwsCloudFrontDistributionOriginItemCustomOriginConfig.validateJsonElement(jsonObj.get("CustomOriginConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCloudFrontDistributionOriginItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCloudFrontDistributionOriginItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCloudFrontDistributionOriginItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCloudFrontDistributionOriginItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCloudFrontDistributionOriginItem>() {
           @Override
           public void write(JsonWriter out, AwsCloudFrontDistributionOriginItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCloudFrontDistributionOriginItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCloudFrontDistributionOriginItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCloudFrontDistributionOriginItem
   * @throws IOException if the JSON string is invalid with respect to AwsCloudFrontDistributionOriginItem
   */
  public static AwsCloudFrontDistributionOriginItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCloudFrontDistributionOriginItem.class);
  }

  /**
   * Convert an instance of AwsCloudFrontDistributionOriginItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

