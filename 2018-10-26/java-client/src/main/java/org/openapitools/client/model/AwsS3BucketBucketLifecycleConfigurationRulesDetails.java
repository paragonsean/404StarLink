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
import java.util.List;
import org.openapitools.client.model.AwsS3BucketBucketLifecycleConfigurationRulesDetailsAbortIncompleteMultipartUpload;
import org.openapitools.client.model.AwsS3BucketBucketLifecycleConfigurationRulesDetailsFilter;

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
 * Configuration for a lifecycle rule.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsS3BucketBucketLifecycleConfigurationRulesDetails {
  public static final String SERIALIZED_NAME_ABORT_INCOMPLETE_MULTIPART_UPLOAD = "AbortIncompleteMultipartUpload";
  @SerializedName(SERIALIZED_NAME_ABORT_INCOMPLETE_MULTIPART_UPLOAD)
  private AwsS3BucketBucketLifecycleConfigurationRulesDetailsAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "ExpirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_EXPIRATION_IN_DAYS = "ExpirationInDays";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_IN_DAYS)
  private Integer expirationInDays;

  public static final String SERIALIZED_NAME_EXPIRED_OBJECT_DELETE_MARKER = "ExpiredObjectDeleteMarker";
  @SerializedName(SERIALIZED_NAME_EXPIRED_OBJECT_DELETE_MARKER)
  private Boolean expiredObjectDeleteMarker;

  public static final String SERIALIZED_NAME_FILTER = "Filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private AwsS3BucketBucketLifecycleConfigurationRulesDetailsFilter filter;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_NONCURRENT_VERSION_EXPIRATION_IN_DAYS = "NoncurrentVersionExpirationInDays";
  @SerializedName(SERIALIZED_NAME_NONCURRENT_VERSION_EXPIRATION_IN_DAYS)
  private Integer noncurrentVersionExpirationInDays;

  public static final String SERIALIZED_NAME_NONCURRENT_VERSION_TRANSITIONS = "NoncurrentVersionTransitions";
  @SerializedName(SERIALIZED_NAME_NONCURRENT_VERSION_TRANSITIONS)
  private List noncurrentVersionTransitions;

  public static final String SERIALIZED_NAME_PREFIX = "Prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANSITIONS = "Transitions";
  @SerializedName(SERIALIZED_NAME_TRANSITIONS)
  private List transitions;

  public AwsS3BucketBucketLifecycleConfigurationRulesDetails() {
  }

  public AwsS3BucketBucketLifecycleConfigurationRulesDetails abortIncompleteMultipartUpload(AwsS3BucketBucketLifecycleConfigurationRulesDetailsAbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
    this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
    return this;
  }

  /**
   * Get abortIncompleteMultipartUpload
   * @return abortIncompleteMultipartUpload
   */
  @javax.annotation.Nullable
  public AwsS3BucketBucketLifecycleConfigurationRulesDetailsAbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload() {
    return abortIncompleteMultipartUpload;
  }

  public void setAbortIncompleteMultipartUpload(AwsS3BucketBucketLifecycleConfigurationRulesDetailsAbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
    this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails expirationInDays(Integer expirationInDays) {
    this.expirationInDays = expirationInDays;
    return this;
  }

  /**
   * Get expirationInDays
   * @return expirationInDays
   */
  @javax.annotation.Nullable
  public Integer getExpirationInDays() {
    return expirationInDays;
  }

  public void setExpirationInDays(Integer expirationInDays) {
    this.expirationInDays = expirationInDays;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails expiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
    this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    return this;
  }

  /**
   * Get expiredObjectDeleteMarker
   * @return expiredObjectDeleteMarker
   */
  @javax.annotation.Nullable
  public Boolean getExpiredObjectDeleteMarker() {
    return expiredObjectDeleteMarker;
  }

  public void setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
    this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails filter(AwsS3BucketBucketLifecycleConfigurationRulesDetailsFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public AwsS3BucketBucketLifecycleConfigurationRulesDetailsFilter getFilter() {
    return filter;
  }

  public void setFilter(AwsS3BucketBucketLifecycleConfigurationRulesDetailsFilter filter) {
    this.filter = filter;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   */
  @javax.annotation.Nullable
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails noncurrentVersionExpirationInDays(Integer noncurrentVersionExpirationInDays) {
    this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
    return this;
  }

  /**
   * Get noncurrentVersionExpirationInDays
   * @return noncurrentVersionExpirationInDays
   */
  @javax.annotation.Nullable
  public Integer getNoncurrentVersionExpirationInDays() {
    return noncurrentVersionExpirationInDays;
  }

  public void setNoncurrentVersionExpirationInDays(Integer noncurrentVersionExpirationInDays) {
    this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails noncurrentVersionTransitions(List noncurrentVersionTransitions) {
    this.noncurrentVersionTransitions = noncurrentVersionTransitions;
    return this;
  }

  /**
   * Get noncurrentVersionTransitions
   * @return noncurrentVersionTransitions
   */
  @javax.annotation.Nullable
  public List getNoncurrentVersionTransitions() {
    return noncurrentVersionTransitions;
  }

  public void setNoncurrentVersionTransitions(List noncurrentVersionTransitions) {
    this.noncurrentVersionTransitions = noncurrentVersionTransitions;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   */
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails status(String status) {
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


  public AwsS3BucketBucketLifecycleConfigurationRulesDetails transitions(List transitions) {
    this.transitions = transitions;
    return this;
  }

  /**
   * Get transitions
   * @return transitions
   */
  @javax.annotation.Nullable
  public List getTransitions() {
    return transitions;
  }

  public void setTransitions(List transitions) {
    this.transitions = transitions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsS3BucketBucketLifecycleConfigurationRulesDetails awsS3BucketBucketLifecycleConfigurationRulesDetails = (AwsS3BucketBucketLifecycleConfigurationRulesDetails) o;
    return Objects.equals(this.abortIncompleteMultipartUpload, awsS3BucketBucketLifecycleConfigurationRulesDetails.abortIncompleteMultipartUpload) &&
        Objects.equals(this.expirationDate, awsS3BucketBucketLifecycleConfigurationRulesDetails.expirationDate) &&
        Objects.equals(this.expirationInDays, awsS3BucketBucketLifecycleConfigurationRulesDetails.expirationInDays) &&
        Objects.equals(this.expiredObjectDeleteMarker, awsS3BucketBucketLifecycleConfigurationRulesDetails.expiredObjectDeleteMarker) &&
        Objects.equals(this.filter, awsS3BucketBucketLifecycleConfigurationRulesDetails.filter) &&
        Objects.equals(this.ID, awsS3BucketBucketLifecycleConfigurationRulesDetails.ID) &&
        Objects.equals(this.noncurrentVersionExpirationInDays, awsS3BucketBucketLifecycleConfigurationRulesDetails.noncurrentVersionExpirationInDays) &&
        Objects.equals(this.noncurrentVersionTransitions, awsS3BucketBucketLifecycleConfigurationRulesDetails.noncurrentVersionTransitions) &&
        Objects.equals(this.prefix, awsS3BucketBucketLifecycleConfigurationRulesDetails.prefix) &&
        Objects.equals(this.status, awsS3BucketBucketLifecycleConfigurationRulesDetails.status) &&
        Objects.equals(this.transitions, awsS3BucketBucketLifecycleConfigurationRulesDetails.transitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abortIncompleteMultipartUpload, expirationDate, expirationInDays, expiredObjectDeleteMarker, filter, ID, noncurrentVersionExpirationInDays, noncurrentVersionTransitions, prefix, status, transitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsS3BucketBucketLifecycleConfigurationRulesDetails {\n");
    sb.append("    abortIncompleteMultipartUpload: ").append(toIndentedString(abortIncompleteMultipartUpload)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expirationInDays: ").append(toIndentedString(expirationInDays)).append("\n");
    sb.append("    expiredObjectDeleteMarker: ").append(toIndentedString(expiredObjectDeleteMarker)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    noncurrentVersionExpirationInDays: ").append(toIndentedString(noncurrentVersionExpirationInDays)).append("\n");
    sb.append("    noncurrentVersionTransitions: ").append(toIndentedString(noncurrentVersionTransitions)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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
    openapiFields.add("AbortIncompleteMultipartUpload");
    openapiFields.add("ExpirationDate");
    openapiFields.add("ExpirationInDays");
    openapiFields.add("ExpiredObjectDeleteMarker");
    openapiFields.add("Filter");
    openapiFields.add("ID");
    openapiFields.add("NoncurrentVersionExpirationInDays");
    openapiFields.add("NoncurrentVersionTransitions");
    openapiFields.add("Prefix");
    openapiFields.add("Status");
    openapiFields.add("Transitions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsS3BucketBucketLifecycleConfigurationRulesDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsS3BucketBucketLifecycleConfigurationRulesDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsS3BucketBucketLifecycleConfigurationRulesDetails is not found in the empty JSON string", AwsS3BucketBucketLifecycleConfigurationRulesDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsS3BucketBucketLifecycleConfigurationRulesDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsS3BucketBucketLifecycleConfigurationRulesDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AbortIncompleteMultipartUpload`
      if (jsonObj.get("AbortIncompleteMultipartUpload") != null && !jsonObj.get("AbortIncompleteMultipartUpload").isJsonNull()) {
        AwsS3BucketBucketLifecycleConfigurationRulesDetailsAbortIncompleteMultipartUpload.validateJsonElement(jsonObj.get("AbortIncompleteMultipartUpload"));
      }
      // validate the optional field `ExpirationDate`
      if (jsonObj.get("ExpirationDate") != null && !jsonObj.get("ExpirationDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ExpirationDate"));
      }
      // validate the optional field `ExpirationInDays`
      if (jsonObj.get("ExpirationInDays") != null && !jsonObj.get("ExpirationInDays").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ExpirationInDays"));
      }
      // validate the optional field `ExpiredObjectDeleteMarker`
      if (jsonObj.get("ExpiredObjectDeleteMarker") != null && !jsonObj.get("ExpiredObjectDeleteMarker").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ExpiredObjectDeleteMarker"));
      }
      // validate the optional field `Filter`
      if (jsonObj.get("Filter") != null && !jsonObj.get("Filter").isJsonNull()) {
        AwsS3BucketBucketLifecycleConfigurationRulesDetailsFilter.validateJsonElement(jsonObj.get("Filter"));
      }
      // validate the optional field `ID`
      if (jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ID"));
      }
      // validate the optional field `NoncurrentVersionExpirationInDays`
      if (jsonObj.get("NoncurrentVersionExpirationInDays") != null && !jsonObj.get("NoncurrentVersionExpirationInDays").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("NoncurrentVersionExpirationInDays"));
      }
      // validate the optional field `NoncurrentVersionTransitions`
      if (jsonObj.get("NoncurrentVersionTransitions") != null && !jsonObj.get("NoncurrentVersionTransitions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NoncurrentVersionTransitions"));
      }
      // validate the optional field `Prefix`
      if (jsonObj.get("Prefix") != null && !jsonObj.get("Prefix").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Prefix"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Transitions`
      if (jsonObj.get("Transitions") != null && !jsonObj.get("Transitions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Transitions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsS3BucketBucketLifecycleConfigurationRulesDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsS3BucketBucketLifecycleConfigurationRulesDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsS3BucketBucketLifecycleConfigurationRulesDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsS3BucketBucketLifecycleConfigurationRulesDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsS3BucketBucketLifecycleConfigurationRulesDetails>() {
           @Override
           public void write(JsonWriter out, AwsS3BucketBucketLifecycleConfigurationRulesDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsS3BucketBucketLifecycleConfigurationRulesDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsS3BucketBucketLifecycleConfigurationRulesDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsS3BucketBucketLifecycleConfigurationRulesDetails
   * @throws IOException if the JSON string is invalid with respect to AwsS3BucketBucketLifecycleConfigurationRulesDetails
   */
  public static AwsS3BucketBucketLifecycleConfigurationRulesDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsS3BucketBucketLifecycleConfigurationRulesDetails.class);
  }

  /**
   * Convert an instance of AwsS3BucketBucketLifecycleConfigurationRulesDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

