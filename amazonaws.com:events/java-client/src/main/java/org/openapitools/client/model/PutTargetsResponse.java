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
 * PutTargetsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PutTargetsResponse {
  public static final String SERIALIZED_NAME_FAILED_ENTRY_COUNT = "FailedEntryCount";
  @SerializedName(SERIALIZED_NAME_FAILED_ENTRY_COUNT)
  private Integer failedEntryCount;

  public static final String SERIALIZED_NAME_FAILED_ENTRIES = "FailedEntries";
  @SerializedName(SERIALIZED_NAME_FAILED_ENTRIES)
  private List failedEntries;

  public PutTargetsResponse() {
  }

  public PutTargetsResponse failedEntryCount(Integer failedEntryCount) {
    this.failedEntryCount = failedEntryCount;
    return this;
  }

  /**
   * Get failedEntryCount
   * @return failedEntryCount
   */
  @javax.annotation.Nullable
  public Integer getFailedEntryCount() {
    return failedEntryCount;
  }

  public void setFailedEntryCount(Integer failedEntryCount) {
    this.failedEntryCount = failedEntryCount;
  }


  public PutTargetsResponse failedEntries(List failedEntries) {
    this.failedEntries = failedEntries;
    return this;
  }

  /**
   * Get failedEntries
   * @return failedEntries
   */
  @javax.annotation.Nullable
  public List getFailedEntries() {
    return failedEntries;
  }

  public void setFailedEntries(List failedEntries) {
    this.failedEntries = failedEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTargetsResponse putTargetsResponse = (PutTargetsResponse) o;
    return Objects.equals(this.failedEntryCount, putTargetsResponse.failedEntryCount) &&
        Objects.equals(this.failedEntries, putTargetsResponse.failedEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedEntryCount, failedEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTargetsResponse {\n");
    sb.append("    failedEntryCount: ").append(toIndentedString(failedEntryCount)).append("\n");
    sb.append("    failedEntries: ").append(toIndentedString(failedEntries)).append("\n");
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
    openapiFields.add("FailedEntryCount");
    openapiFields.add("FailedEntries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PutTargetsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PutTargetsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutTargetsResponse is not found in the empty JSON string", PutTargetsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PutTargetsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutTargetsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `FailedEntryCount`
      if (jsonObj.get("FailedEntryCount") != null && !jsonObj.get("FailedEntryCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("FailedEntryCount"));
      }
      // validate the optional field `FailedEntries`
      if (jsonObj.get("FailedEntries") != null && !jsonObj.get("FailedEntries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("FailedEntries"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutTargetsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutTargetsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutTargetsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutTargetsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PutTargetsResponse>() {
           @Override
           public void write(JsonWriter out, PutTargetsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutTargetsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PutTargetsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PutTargetsResponse
   * @throws IOException if the JSON string is invalid with respect to PutTargetsResponse
   */
  public static PutTargetsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutTargetsResponse.class);
  }

  /**
   * Convert an instance of PutTargetsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

