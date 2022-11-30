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
 * Provides information about an Amazon SNS topic to which notifications can be published.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsSnsTopicDetails {
  public static final String SERIALIZED_NAME_KMS_MASTER_KEY_ID = "KmsMasterKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_MASTER_KEY_ID)
  private String kmsMasterKeyId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION = "Subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private List subscription;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "TopicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_SQS_SUCCESS_FEEDBACK_ROLE_ARN = "SqsSuccessFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_SQS_SUCCESS_FEEDBACK_ROLE_ARN)
  private String sqsSuccessFeedbackRoleArn;

  public static final String SERIALIZED_NAME_SQS_FAILURE_FEEDBACK_ROLE_ARN = "SqsFailureFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_SQS_FAILURE_FEEDBACK_ROLE_ARN)
  private String sqsFailureFeedbackRoleArn;

  public static final String SERIALIZED_NAME_APPLICATION_SUCCESS_FEEDBACK_ROLE_ARN = "ApplicationSuccessFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_APPLICATION_SUCCESS_FEEDBACK_ROLE_ARN)
  private String applicationSuccessFeedbackRoleArn;

  public static final String SERIALIZED_NAME_FIREHOSE_SUCCESS_FEEDBACK_ROLE_ARN = "FirehoseSuccessFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_FIREHOSE_SUCCESS_FEEDBACK_ROLE_ARN)
  private String firehoseSuccessFeedbackRoleArn;

  public static final String SERIALIZED_NAME_FIREHOSE_FAILURE_FEEDBACK_ROLE_ARN = "FirehoseFailureFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_FIREHOSE_FAILURE_FEEDBACK_ROLE_ARN)
  private String firehoseFailureFeedbackRoleArn;

  public static final String SERIALIZED_NAME_HTTP_SUCCESS_FEEDBACK_ROLE_ARN = "HttpSuccessFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_HTTP_SUCCESS_FEEDBACK_ROLE_ARN)
  private String httpSuccessFeedbackRoleArn;

  public static final String SERIALIZED_NAME_HTTP_FAILURE_FEEDBACK_ROLE_ARN = "HttpFailureFeedbackRoleArn";
  @SerializedName(SERIALIZED_NAME_HTTP_FAILURE_FEEDBACK_ROLE_ARN)
  private String httpFailureFeedbackRoleArn;

  public AwsSnsTopicDetails() {
  }

  public AwsSnsTopicDetails kmsMasterKeyId(String kmsMasterKeyId) {
    this.kmsMasterKeyId = kmsMasterKeyId;
    return this;
  }

  /**
   * Get kmsMasterKeyId
   * @return kmsMasterKeyId
   */
  @javax.annotation.Nullable
  public String getKmsMasterKeyId() {
    return kmsMasterKeyId;
  }

  public void setKmsMasterKeyId(String kmsMasterKeyId) {
    this.kmsMasterKeyId = kmsMasterKeyId;
  }


  public AwsSnsTopicDetails subscription(List subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   */
  @javax.annotation.Nullable
  public List getSubscription() {
    return subscription;
  }

  public void setSubscription(List subscription) {
    this.subscription = subscription;
  }


  public AwsSnsTopicDetails topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Get topicName
   * @return topicName
   */
  @javax.annotation.Nullable
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public AwsSnsTopicDetails owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public AwsSnsTopicDetails sqsSuccessFeedbackRoleArn(String sqsSuccessFeedbackRoleArn) {
    this.sqsSuccessFeedbackRoleArn = sqsSuccessFeedbackRoleArn;
    return this;
  }

  /**
   * Get sqsSuccessFeedbackRoleArn
   * @return sqsSuccessFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getSqsSuccessFeedbackRoleArn() {
    return sqsSuccessFeedbackRoleArn;
  }

  public void setSqsSuccessFeedbackRoleArn(String sqsSuccessFeedbackRoleArn) {
    this.sqsSuccessFeedbackRoleArn = sqsSuccessFeedbackRoleArn;
  }


  public AwsSnsTopicDetails sqsFailureFeedbackRoleArn(String sqsFailureFeedbackRoleArn) {
    this.sqsFailureFeedbackRoleArn = sqsFailureFeedbackRoleArn;
    return this;
  }

  /**
   * Get sqsFailureFeedbackRoleArn
   * @return sqsFailureFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getSqsFailureFeedbackRoleArn() {
    return sqsFailureFeedbackRoleArn;
  }

  public void setSqsFailureFeedbackRoleArn(String sqsFailureFeedbackRoleArn) {
    this.sqsFailureFeedbackRoleArn = sqsFailureFeedbackRoleArn;
  }


  public AwsSnsTopicDetails applicationSuccessFeedbackRoleArn(String applicationSuccessFeedbackRoleArn) {
    this.applicationSuccessFeedbackRoleArn = applicationSuccessFeedbackRoleArn;
    return this;
  }

  /**
   * Get applicationSuccessFeedbackRoleArn
   * @return applicationSuccessFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getApplicationSuccessFeedbackRoleArn() {
    return applicationSuccessFeedbackRoleArn;
  }

  public void setApplicationSuccessFeedbackRoleArn(String applicationSuccessFeedbackRoleArn) {
    this.applicationSuccessFeedbackRoleArn = applicationSuccessFeedbackRoleArn;
  }


  public AwsSnsTopicDetails firehoseSuccessFeedbackRoleArn(String firehoseSuccessFeedbackRoleArn) {
    this.firehoseSuccessFeedbackRoleArn = firehoseSuccessFeedbackRoleArn;
    return this;
  }

  /**
   * Get firehoseSuccessFeedbackRoleArn
   * @return firehoseSuccessFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getFirehoseSuccessFeedbackRoleArn() {
    return firehoseSuccessFeedbackRoleArn;
  }

  public void setFirehoseSuccessFeedbackRoleArn(String firehoseSuccessFeedbackRoleArn) {
    this.firehoseSuccessFeedbackRoleArn = firehoseSuccessFeedbackRoleArn;
  }


  public AwsSnsTopicDetails firehoseFailureFeedbackRoleArn(String firehoseFailureFeedbackRoleArn) {
    this.firehoseFailureFeedbackRoleArn = firehoseFailureFeedbackRoleArn;
    return this;
  }

  /**
   * Get firehoseFailureFeedbackRoleArn
   * @return firehoseFailureFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getFirehoseFailureFeedbackRoleArn() {
    return firehoseFailureFeedbackRoleArn;
  }

  public void setFirehoseFailureFeedbackRoleArn(String firehoseFailureFeedbackRoleArn) {
    this.firehoseFailureFeedbackRoleArn = firehoseFailureFeedbackRoleArn;
  }


  public AwsSnsTopicDetails httpSuccessFeedbackRoleArn(String httpSuccessFeedbackRoleArn) {
    this.httpSuccessFeedbackRoleArn = httpSuccessFeedbackRoleArn;
    return this;
  }

  /**
   * Get httpSuccessFeedbackRoleArn
   * @return httpSuccessFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getHttpSuccessFeedbackRoleArn() {
    return httpSuccessFeedbackRoleArn;
  }

  public void setHttpSuccessFeedbackRoleArn(String httpSuccessFeedbackRoleArn) {
    this.httpSuccessFeedbackRoleArn = httpSuccessFeedbackRoleArn;
  }


  public AwsSnsTopicDetails httpFailureFeedbackRoleArn(String httpFailureFeedbackRoleArn) {
    this.httpFailureFeedbackRoleArn = httpFailureFeedbackRoleArn;
    return this;
  }

  /**
   * Get httpFailureFeedbackRoleArn
   * @return httpFailureFeedbackRoleArn
   */
  @javax.annotation.Nullable
  public String getHttpFailureFeedbackRoleArn() {
    return httpFailureFeedbackRoleArn;
  }

  public void setHttpFailureFeedbackRoleArn(String httpFailureFeedbackRoleArn) {
    this.httpFailureFeedbackRoleArn = httpFailureFeedbackRoleArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsSnsTopicDetails awsSnsTopicDetails = (AwsSnsTopicDetails) o;
    return Objects.equals(this.kmsMasterKeyId, awsSnsTopicDetails.kmsMasterKeyId) &&
        Objects.equals(this.subscription, awsSnsTopicDetails.subscription) &&
        Objects.equals(this.topicName, awsSnsTopicDetails.topicName) &&
        Objects.equals(this.owner, awsSnsTopicDetails.owner) &&
        Objects.equals(this.sqsSuccessFeedbackRoleArn, awsSnsTopicDetails.sqsSuccessFeedbackRoleArn) &&
        Objects.equals(this.sqsFailureFeedbackRoleArn, awsSnsTopicDetails.sqsFailureFeedbackRoleArn) &&
        Objects.equals(this.applicationSuccessFeedbackRoleArn, awsSnsTopicDetails.applicationSuccessFeedbackRoleArn) &&
        Objects.equals(this.firehoseSuccessFeedbackRoleArn, awsSnsTopicDetails.firehoseSuccessFeedbackRoleArn) &&
        Objects.equals(this.firehoseFailureFeedbackRoleArn, awsSnsTopicDetails.firehoseFailureFeedbackRoleArn) &&
        Objects.equals(this.httpSuccessFeedbackRoleArn, awsSnsTopicDetails.httpSuccessFeedbackRoleArn) &&
        Objects.equals(this.httpFailureFeedbackRoleArn, awsSnsTopicDetails.httpFailureFeedbackRoleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsMasterKeyId, subscription, topicName, owner, sqsSuccessFeedbackRoleArn, sqsFailureFeedbackRoleArn, applicationSuccessFeedbackRoleArn, firehoseSuccessFeedbackRoleArn, firehoseFailureFeedbackRoleArn, httpSuccessFeedbackRoleArn, httpFailureFeedbackRoleArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsSnsTopicDetails {\n");
    sb.append("    kmsMasterKeyId: ").append(toIndentedString(kmsMasterKeyId)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sqsSuccessFeedbackRoleArn: ").append(toIndentedString(sqsSuccessFeedbackRoleArn)).append("\n");
    sb.append("    sqsFailureFeedbackRoleArn: ").append(toIndentedString(sqsFailureFeedbackRoleArn)).append("\n");
    sb.append("    applicationSuccessFeedbackRoleArn: ").append(toIndentedString(applicationSuccessFeedbackRoleArn)).append("\n");
    sb.append("    firehoseSuccessFeedbackRoleArn: ").append(toIndentedString(firehoseSuccessFeedbackRoleArn)).append("\n");
    sb.append("    firehoseFailureFeedbackRoleArn: ").append(toIndentedString(firehoseFailureFeedbackRoleArn)).append("\n");
    sb.append("    httpSuccessFeedbackRoleArn: ").append(toIndentedString(httpSuccessFeedbackRoleArn)).append("\n");
    sb.append("    httpFailureFeedbackRoleArn: ").append(toIndentedString(httpFailureFeedbackRoleArn)).append("\n");
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
    openapiFields.add("KmsMasterKeyId");
    openapiFields.add("Subscription");
    openapiFields.add("TopicName");
    openapiFields.add("Owner");
    openapiFields.add("SqsSuccessFeedbackRoleArn");
    openapiFields.add("SqsFailureFeedbackRoleArn");
    openapiFields.add("ApplicationSuccessFeedbackRoleArn");
    openapiFields.add("FirehoseSuccessFeedbackRoleArn");
    openapiFields.add("FirehoseFailureFeedbackRoleArn");
    openapiFields.add("HttpSuccessFeedbackRoleArn");
    openapiFields.add("HttpFailureFeedbackRoleArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsSnsTopicDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsSnsTopicDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsSnsTopicDetails is not found in the empty JSON string", AwsSnsTopicDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsSnsTopicDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsSnsTopicDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `KmsMasterKeyId`
      if (jsonObj.get("KmsMasterKeyId") != null && !jsonObj.get("KmsMasterKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsMasterKeyId"));
      }
      // validate the optional field `Subscription`
      if (jsonObj.get("Subscription") != null && !jsonObj.get("Subscription").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Subscription"));
      }
      // validate the optional field `TopicName`
      if (jsonObj.get("TopicName") != null && !jsonObj.get("TopicName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TopicName"));
      }
      // validate the optional field `Owner`
      if (jsonObj.get("Owner") != null && !jsonObj.get("Owner").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Owner"));
      }
      // validate the optional field `SqsSuccessFeedbackRoleArn`
      if (jsonObj.get("SqsSuccessFeedbackRoleArn") != null && !jsonObj.get("SqsSuccessFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SqsSuccessFeedbackRoleArn"));
      }
      // validate the optional field `SqsFailureFeedbackRoleArn`
      if (jsonObj.get("SqsFailureFeedbackRoleArn") != null && !jsonObj.get("SqsFailureFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SqsFailureFeedbackRoleArn"));
      }
      // validate the optional field `ApplicationSuccessFeedbackRoleArn`
      if (jsonObj.get("ApplicationSuccessFeedbackRoleArn") != null && !jsonObj.get("ApplicationSuccessFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ApplicationSuccessFeedbackRoleArn"));
      }
      // validate the optional field `FirehoseSuccessFeedbackRoleArn`
      if (jsonObj.get("FirehoseSuccessFeedbackRoleArn") != null && !jsonObj.get("FirehoseSuccessFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirehoseSuccessFeedbackRoleArn"));
      }
      // validate the optional field `FirehoseFailureFeedbackRoleArn`
      if (jsonObj.get("FirehoseFailureFeedbackRoleArn") != null && !jsonObj.get("FirehoseFailureFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FirehoseFailureFeedbackRoleArn"));
      }
      // validate the optional field `HttpSuccessFeedbackRoleArn`
      if (jsonObj.get("HttpSuccessFeedbackRoleArn") != null && !jsonObj.get("HttpSuccessFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HttpSuccessFeedbackRoleArn"));
      }
      // validate the optional field `HttpFailureFeedbackRoleArn`
      if (jsonObj.get("HttpFailureFeedbackRoleArn") != null && !jsonObj.get("HttpFailureFeedbackRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HttpFailureFeedbackRoleArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsSnsTopicDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsSnsTopicDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsSnsTopicDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsSnsTopicDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsSnsTopicDetails>() {
           @Override
           public void write(JsonWriter out, AwsSnsTopicDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsSnsTopicDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsSnsTopicDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsSnsTopicDetails
   * @throws IOException if the JSON string is invalid with respect to AwsSnsTopicDetails
   */
  public static AwsSnsTopicDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsSnsTopicDetails.class);
  }

  /**
   * Convert an instance of AwsSnsTopicDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

