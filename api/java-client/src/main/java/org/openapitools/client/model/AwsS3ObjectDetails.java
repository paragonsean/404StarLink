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
 * Details about an Amazon S3 object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsS3ObjectDetails {
  public static final String SERIALIZED_NAME_LAST_MODIFIED = "LastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_ETAG = "ETag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_VERSION_ID = "VersionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "ContentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_SERVER_SIDE_ENCRYPTION = "ServerSideEncryption";
  @SerializedName(SERIALIZED_NAME_SERVER_SIDE_ENCRYPTION)
  private String serverSideEncryption;

  public static final String SERIALIZED_NAME_SS_E_K_M_S_KEY_ID = "SSEKMSKeyId";
  @SerializedName(SERIALIZED_NAME_SS_E_K_M_S_KEY_ID)
  private String ssEKMSKeyId;

  public AwsS3ObjectDetails() {
  }

  public AwsS3ObjectDetails lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public AwsS3ObjectDetails etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Get etag
   * @return etag
   */
  @javax.annotation.Nullable
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  public AwsS3ObjectDetails versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId
   * @return versionId
   */
  @javax.annotation.Nullable
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public AwsS3ObjectDetails contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public AwsS3ObjectDetails serverSideEncryption(String serverSideEncryption) {
    this.serverSideEncryption = serverSideEncryption;
    return this;
  }

  /**
   * Get serverSideEncryption
   * @return serverSideEncryption
   */
  @javax.annotation.Nullable
  public String getServerSideEncryption() {
    return serverSideEncryption;
  }

  public void setServerSideEncryption(String serverSideEncryption) {
    this.serverSideEncryption = serverSideEncryption;
  }


  public AwsS3ObjectDetails ssEKMSKeyId(String ssEKMSKeyId) {
    this.ssEKMSKeyId = ssEKMSKeyId;
    return this;
  }

  /**
   * Get ssEKMSKeyId
   * @return ssEKMSKeyId
   */
  @javax.annotation.Nullable
  public String getSsEKMSKeyId() {
    return ssEKMSKeyId;
  }

  public void setSsEKMSKeyId(String ssEKMSKeyId) {
    this.ssEKMSKeyId = ssEKMSKeyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsS3ObjectDetails awsS3ObjectDetails = (AwsS3ObjectDetails) o;
    return Objects.equals(this.lastModified, awsS3ObjectDetails.lastModified) &&
        Objects.equals(this.etag, awsS3ObjectDetails.etag) &&
        Objects.equals(this.versionId, awsS3ObjectDetails.versionId) &&
        Objects.equals(this.contentType, awsS3ObjectDetails.contentType) &&
        Objects.equals(this.serverSideEncryption, awsS3ObjectDetails.serverSideEncryption) &&
        Objects.equals(this.ssEKMSKeyId, awsS3ObjectDetails.ssEKMSKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, etag, versionId, contentType, serverSideEncryption, ssEKMSKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsS3ObjectDetails {\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    serverSideEncryption: ").append(toIndentedString(serverSideEncryption)).append("\n");
    sb.append("    ssEKMSKeyId: ").append(toIndentedString(ssEKMSKeyId)).append("\n");
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
    openapiFields.add("LastModified");
    openapiFields.add("ETag");
    openapiFields.add("VersionId");
    openapiFields.add("ContentType");
    openapiFields.add("ServerSideEncryption");
    openapiFields.add("SSEKMSKeyId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsS3ObjectDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsS3ObjectDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsS3ObjectDetails is not found in the empty JSON string", AwsS3ObjectDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsS3ObjectDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsS3ObjectDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LastModified`
      if (jsonObj.get("LastModified") != null && !jsonObj.get("LastModified").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastModified"));
      }
      // validate the optional field `ETag`
      if (jsonObj.get("ETag") != null && !jsonObj.get("ETag").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ETag"));
      }
      // validate the optional field `VersionId`
      if (jsonObj.get("VersionId") != null && !jsonObj.get("VersionId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VersionId"));
      }
      // validate the optional field `ContentType`
      if (jsonObj.get("ContentType") != null && !jsonObj.get("ContentType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ContentType"));
      }
      // validate the optional field `ServerSideEncryption`
      if (jsonObj.get("ServerSideEncryption") != null && !jsonObj.get("ServerSideEncryption").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServerSideEncryption"));
      }
      // validate the optional field `SSEKMSKeyId`
      if (jsonObj.get("SSEKMSKeyId") != null && !jsonObj.get("SSEKMSKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SSEKMSKeyId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsS3ObjectDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsS3ObjectDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsS3ObjectDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsS3ObjectDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsS3ObjectDetails>() {
           @Override
           public void write(JsonWriter out, AwsS3ObjectDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsS3ObjectDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsS3ObjectDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsS3ObjectDetails
   * @throws IOException if the JSON string is invalid with respect to AwsS3ObjectDetails
   */
  public static AwsS3ObjectDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsS3ObjectDetails.class);
  }

  /**
   * Convert an instance of AwsS3ObjectDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

