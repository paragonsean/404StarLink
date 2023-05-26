/*
 * Amazon CloudWatch Events
 * <p>Amazon EventBridge helps you to respond to state changes in your Amazon Web Services resources. When your resources change state, they automatically send events to an event stream. You can create rules that match selected events in the stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For example, you can configure rules to:</p> <ul> <li> <p>Automatically invoke an Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance enters the running state.</p> </li> <li> <p>Direct specific API records from CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential security or availability risks.</p> </li> <li> <p>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</p> </li> </ul> <p>For more information about the features of Amazon EventBridge, see the <a href=\"https://docs.aws.amazon.com/eventbridge/latest/userguide\">Amazon EventBridge User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2015-10-07
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
 * ListRuleNamesByTargetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListRuleNamesByTargetRequest {
  public static final String SERIALIZED_NAME_TARGET_ARN = "TargetArn";
  @SerializedName(SERIALIZED_NAME_TARGET_ARN)
  private String targetArn;

  public static final String SERIALIZED_NAME_EVENT_BUS_NAME = "EventBusName";
  @SerializedName(SERIALIZED_NAME_EVENT_BUS_NAME)
  private String eventBusName;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_LIMIT = "Limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public ListRuleNamesByTargetRequest() {
  }

  public ListRuleNamesByTargetRequest targetArn(String targetArn) {
    this.targetArn = targetArn;
    return this;
  }

  /**
   * Get targetArn
   * @return targetArn
   */
  @javax.annotation.Nonnull
  public String getTargetArn() {
    return targetArn;
  }

  public void setTargetArn(String targetArn) {
    this.targetArn = targetArn;
  }


  public ListRuleNamesByTargetRequest eventBusName(String eventBusName) {
    this.eventBusName = eventBusName;
    return this;
  }

  /**
   * Get eventBusName
   * @return eventBusName
   */
  @javax.annotation.Nullable
  public String getEventBusName() {
    return eventBusName;
  }

  public void setEventBusName(String eventBusName) {
    this.eventBusName = eventBusName;
  }


  public ListRuleNamesByTargetRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public ListRuleNamesByTargetRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRuleNamesByTargetRequest listRuleNamesByTargetRequest = (ListRuleNamesByTargetRequest) o;
    return Objects.equals(this.targetArn, listRuleNamesByTargetRequest.targetArn) &&
        Objects.equals(this.eventBusName, listRuleNamesByTargetRequest.eventBusName) &&
        Objects.equals(this.nextToken, listRuleNamesByTargetRequest.nextToken) &&
        Objects.equals(this.limit, listRuleNamesByTargetRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetArn, eventBusName, nextToken, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRuleNamesByTargetRequest {\n");
    sb.append("    targetArn: ").append(toIndentedString(targetArn)).append("\n");
    sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("TargetArn");
    openapiFields.add("EventBusName");
    openapiFields.add("NextToken");
    openapiFields.add("Limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TargetArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListRuleNamesByTargetRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListRuleNamesByTargetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRuleNamesByTargetRequest is not found in the empty JSON string", ListRuleNamesByTargetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListRuleNamesByTargetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListRuleNamesByTargetRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListRuleNamesByTargetRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `TargetArn`
      String.validateJsonElement(jsonObj.get("TargetArn"));
      // validate the optional field `EventBusName`
      if (jsonObj.get("EventBusName") != null && !jsonObj.get("EventBusName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EventBusName"));
      }
      // validate the optional field `NextToken`
      if (jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextToken"));
      }
      // validate the optional field `Limit`
      if (jsonObj.get("Limit") != null && !jsonObj.get("Limit").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Limit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRuleNamesByTargetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRuleNamesByTargetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRuleNamesByTargetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRuleNamesByTargetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRuleNamesByTargetRequest>() {
           @Override
           public void write(JsonWriter out, ListRuleNamesByTargetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListRuleNamesByTargetRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListRuleNamesByTargetRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListRuleNamesByTargetRequest
   * @throws IOException if the JSON string is invalid with respect to ListRuleNamesByTargetRequest
   */
  public static ListRuleNamesByTargetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRuleNamesByTargetRequest.class);
  }

  /**
   * Convert an instance of ListRuleNamesByTargetRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

