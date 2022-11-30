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
import org.openapitools.client.model.AwsCloudFrontDistributionDetailsCacheBehaviors;
import org.openapitools.client.model.AwsCloudFrontDistributionDetailsDefaultCacheBehavior;
import org.openapitools.client.model.AwsCloudFrontDistributionDetailsLogging;
import org.openapitools.client.model.AwsCloudFrontDistributionDetailsOriginGroups;
import org.openapitools.client.model.AwsCloudFrontDistributionDetailsOrigins;
import org.openapitools.client.model.AwsCloudFrontDistributionDetailsViewerCertificate;

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
 * ResourceDetailsAwsCloudFrontDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsCloudFrontDistribution {
  public static final String SERIALIZED_NAME_CACHE_BEHAVIORS = "CacheBehaviors";
  @SerializedName(SERIALIZED_NAME_CACHE_BEHAVIORS)
  private AwsCloudFrontDistributionDetailsCacheBehaviors cacheBehaviors;

  public static final String SERIALIZED_NAME_DEFAULT_CACHE_BEHAVIOR = "DefaultCacheBehavior";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CACHE_BEHAVIOR)
  private AwsCloudFrontDistributionDetailsDefaultCacheBehavior defaultCacheBehavior;

  public static final String SERIALIZED_NAME_DEFAULT_ROOT_OBJECT = "DefaultRootObject";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ROOT_OBJECT)
  private String defaultRootObject;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ETAG = "ETag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "LastModifiedTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private String lastModifiedTime;

  public static final String SERIALIZED_NAME_LOGGING = "Logging";
  @SerializedName(SERIALIZED_NAME_LOGGING)
  private AwsCloudFrontDistributionDetailsLogging logging;

  public static final String SERIALIZED_NAME_ORIGINS = "Origins";
  @SerializedName(SERIALIZED_NAME_ORIGINS)
  private AwsCloudFrontDistributionDetailsOrigins origins;

  public static final String SERIALIZED_NAME_ORIGIN_GROUPS = "OriginGroups";
  @SerializedName(SERIALIZED_NAME_ORIGIN_GROUPS)
  private AwsCloudFrontDistributionDetailsOriginGroups originGroups;

  public static final String SERIALIZED_NAME_VIEWER_CERTIFICATE = "ViewerCertificate";
  @SerializedName(SERIALIZED_NAME_VIEWER_CERTIFICATE)
  private AwsCloudFrontDistributionDetailsViewerCertificate viewerCertificate;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_WEB_ACL_ID = "WebAclId";
  @SerializedName(SERIALIZED_NAME_WEB_ACL_ID)
  private String webAclId;

  public ResourceDetailsAwsCloudFrontDistribution() {
  }

  public ResourceDetailsAwsCloudFrontDistribution cacheBehaviors(AwsCloudFrontDistributionDetailsCacheBehaviors cacheBehaviors) {
    this.cacheBehaviors = cacheBehaviors;
    return this;
  }

  /**
   * Get cacheBehaviors
   * @return cacheBehaviors
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionDetailsCacheBehaviors getCacheBehaviors() {
    return cacheBehaviors;
  }

  public void setCacheBehaviors(AwsCloudFrontDistributionDetailsCacheBehaviors cacheBehaviors) {
    this.cacheBehaviors = cacheBehaviors;
  }


  public ResourceDetailsAwsCloudFrontDistribution defaultCacheBehavior(AwsCloudFrontDistributionDetailsDefaultCacheBehavior defaultCacheBehavior) {
    this.defaultCacheBehavior = defaultCacheBehavior;
    return this;
  }

  /**
   * Get defaultCacheBehavior
   * @return defaultCacheBehavior
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionDetailsDefaultCacheBehavior getDefaultCacheBehavior() {
    return defaultCacheBehavior;
  }

  public void setDefaultCacheBehavior(AwsCloudFrontDistributionDetailsDefaultCacheBehavior defaultCacheBehavior) {
    this.defaultCacheBehavior = defaultCacheBehavior;
  }


  public ResourceDetailsAwsCloudFrontDistribution defaultRootObject(String defaultRootObject) {
    this.defaultRootObject = defaultRootObject;
    return this;
  }

  /**
   * Get defaultRootObject
   * @return defaultRootObject
   */
  @javax.annotation.Nullable
  public String getDefaultRootObject() {
    return defaultRootObject;
  }

  public void setDefaultRootObject(String defaultRootObject) {
    this.defaultRootObject = defaultRootObject;
  }


  public ResourceDetailsAwsCloudFrontDistribution domainName(String domainName) {
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


  public ResourceDetailsAwsCloudFrontDistribution etag(String etag) {
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


  public ResourceDetailsAwsCloudFrontDistribution lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   * @return lastModifiedTime
   */
  @javax.annotation.Nullable
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  public ResourceDetailsAwsCloudFrontDistribution logging(AwsCloudFrontDistributionDetailsLogging logging) {
    this.logging = logging;
    return this;
  }

  /**
   * Get logging
   * @return logging
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionDetailsLogging getLogging() {
    return logging;
  }

  public void setLogging(AwsCloudFrontDistributionDetailsLogging logging) {
    this.logging = logging;
  }


  public ResourceDetailsAwsCloudFrontDistribution origins(AwsCloudFrontDistributionDetailsOrigins origins) {
    this.origins = origins;
    return this;
  }

  /**
   * Get origins
   * @return origins
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionDetailsOrigins getOrigins() {
    return origins;
  }

  public void setOrigins(AwsCloudFrontDistributionDetailsOrigins origins) {
    this.origins = origins;
  }


  public ResourceDetailsAwsCloudFrontDistribution originGroups(AwsCloudFrontDistributionDetailsOriginGroups originGroups) {
    this.originGroups = originGroups;
    return this;
  }

  /**
   * Get originGroups
   * @return originGroups
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionDetailsOriginGroups getOriginGroups() {
    return originGroups;
  }

  public void setOriginGroups(AwsCloudFrontDistributionDetailsOriginGroups originGroups) {
    this.originGroups = originGroups;
  }


  public ResourceDetailsAwsCloudFrontDistribution viewerCertificate(AwsCloudFrontDistributionDetailsViewerCertificate viewerCertificate) {
    this.viewerCertificate = viewerCertificate;
    return this;
  }

  /**
   * Get viewerCertificate
   * @return viewerCertificate
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionDetailsViewerCertificate getViewerCertificate() {
    return viewerCertificate;
  }

  public void setViewerCertificate(AwsCloudFrontDistributionDetailsViewerCertificate viewerCertificate) {
    this.viewerCertificate = viewerCertificate;
  }


  public ResourceDetailsAwsCloudFrontDistribution status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ResourceDetailsAwsCloudFrontDistribution webAclId(String webAclId) {
    this.webAclId = webAclId;
    return this;
  }

  /**
   * Get webAclId
   * @return webAclId
   */
  @javax.annotation.Nullable
  public String getWebAclId() {
    return webAclId;
  }

  public void setWebAclId(String webAclId) {
    this.webAclId = webAclId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsCloudFrontDistribution resourceDetailsAwsCloudFrontDistribution = (ResourceDetailsAwsCloudFrontDistribution) o;
    return Objects.equals(this.cacheBehaviors, resourceDetailsAwsCloudFrontDistribution.cacheBehaviors) &&
        Objects.equals(this.defaultCacheBehavior, resourceDetailsAwsCloudFrontDistribution.defaultCacheBehavior) &&
        Objects.equals(this.defaultRootObject, resourceDetailsAwsCloudFrontDistribution.defaultRootObject) &&
        Objects.equals(this.domainName, resourceDetailsAwsCloudFrontDistribution.domainName) &&
        Objects.equals(this.etag, resourceDetailsAwsCloudFrontDistribution.etag) &&
        Objects.equals(this.lastModifiedTime, resourceDetailsAwsCloudFrontDistribution.lastModifiedTime) &&
        Objects.equals(this.logging, resourceDetailsAwsCloudFrontDistribution.logging) &&
        Objects.equals(this.origins, resourceDetailsAwsCloudFrontDistribution.origins) &&
        Objects.equals(this.originGroups, resourceDetailsAwsCloudFrontDistribution.originGroups) &&
        Objects.equals(this.viewerCertificate, resourceDetailsAwsCloudFrontDistribution.viewerCertificate) &&
        Objects.equals(this.status, resourceDetailsAwsCloudFrontDistribution.status) &&
        Objects.equals(this.webAclId, resourceDetailsAwsCloudFrontDistribution.webAclId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheBehaviors, defaultCacheBehavior, defaultRootObject, domainName, etag, lastModifiedTime, logging, origins, originGroups, viewerCertificate, status, webAclId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsCloudFrontDistribution {\n");
    sb.append("    cacheBehaviors: ").append(toIndentedString(cacheBehaviors)).append("\n");
    sb.append("    defaultCacheBehavior: ").append(toIndentedString(defaultCacheBehavior)).append("\n");
    sb.append("    defaultRootObject: ").append(toIndentedString(defaultRootObject)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
    sb.append("    originGroups: ").append(toIndentedString(originGroups)).append("\n");
    sb.append("    viewerCertificate: ").append(toIndentedString(viewerCertificate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webAclId: ").append(toIndentedString(webAclId)).append("\n");
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
    openapiFields.add("CacheBehaviors");
    openapiFields.add("DefaultCacheBehavior");
    openapiFields.add("DefaultRootObject");
    openapiFields.add("DomainName");
    openapiFields.add("ETag");
    openapiFields.add("LastModifiedTime");
    openapiFields.add("Logging");
    openapiFields.add("Origins");
    openapiFields.add("OriginGroups");
    openapiFields.add("ViewerCertificate");
    openapiFields.add("Status");
    openapiFields.add("WebAclId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsCloudFrontDistribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsCloudFrontDistribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsCloudFrontDistribution is not found in the empty JSON string", ResourceDetailsAwsCloudFrontDistribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsCloudFrontDistribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsCloudFrontDistribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheBehaviors`
      if (jsonObj.get("CacheBehaviors") != null && !jsonObj.get("CacheBehaviors").isJsonNull()) {
        AwsCloudFrontDistributionDetailsCacheBehaviors.validateJsonElement(jsonObj.get("CacheBehaviors"));
      }
      // validate the optional field `DefaultCacheBehavior`
      if (jsonObj.get("DefaultCacheBehavior") != null && !jsonObj.get("DefaultCacheBehavior").isJsonNull()) {
        AwsCloudFrontDistributionDetailsDefaultCacheBehavior.validateJsonElement(jsonObj.get("DefaultCacheBehavior"));
      }
      // validate the optional field `DefaultRootObject`
      if (jsonObj.get("DefaultRootObject") != null && !jsonObj.get("DefaultRootObject").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultRootObject"));
      }
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `ETag`
      if (jsonObj.get("ETag") != null && !jsonObj.get("ETag").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ETag"));
      }
      // validate the optional field `LastModifiedTime`
      if (jsonObj.get("LastModifiedTime") != null && !jsonObj.get("LastModifiedTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastModifiedTime"));
      }
      // validate the optional field `Logging`
      if (jsonObj.get("Logging") != null && !jsonObj.get("Logging").isJsonNull()) {
        AwsCloudFrontDistributionDetailsLogging.validateJsonElement(jsonObj.get("Logging"));
      }
      // validate the optional field `Origins`
      if (jsonObj.get("Origins") != null && !jsonObj.get("Origins").isJsonNull()) {
        AwsCloudFrontDistributionDetailsOrigins.validateJsonElement(jsonObj.get("Origins"));
      }
      // validate the optional field `OriginGroups`
      if (jsonObj.get("OriginGroups") != null && !jsonObj.get("OriginGroups").isJsonNull()) {
        AwsCloudFrontDistributionDetailsOriginGroups.validateJsonElement(jsonObj.get("OriginGroups"));
      }
      // validate the optional field `ViewerCertificate`
      if (jsonObj.get("ViewerCertificate") != null && !jsonObj.get("ViewerCertificate").isJsonNull()) {
        AwsCloudFrontDistributionDetailsViewerCertificate.validateJsonElement(jsonObj.get("ViewerCertificate"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `WebAclId`
      if (jsonObj.get("WebAclId") != null && !jsonObj.get("WebAclId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("WebAclId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsCloudFrontDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsCloudFrontDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsCloudFrontDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsCloudFrontDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsCloudFrontDistribution>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsCloudFrontDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsCloudFrontDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsCloudFrontDistribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsCloudFrontDistribution
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsCloudFrontDistribution
   */
  public static ResourceDetailsAwsCloudFrontDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsCloudFrontDistribution.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsCloudFrontDistribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

