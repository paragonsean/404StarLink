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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ArchiveState;

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
 * DescribeArchiveResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeArchiveResponse {
  public static final String SERIALIZED_NAME_ARCHIVE_ARN = "ArchiveArn";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_ARN)
  private String archiveArn;

  public static final String SERIALIZED_NAME_ARCHIVE_NAME = "ArchiveName";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_NAME)
  private String archiveName;

  public static final String SERIALIZED_NAME_EVENT_SOURCE_ARN = "EventSourceArn";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_ARN)
  private String eventSourceArn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENT_PATTERN = "EventPattern";
  @SerializedName(SERIALIZED_NAME_EVENT_PATTERN)
  private String eventPattern;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ArchiveState state;

  public static final String SERIALIZED_NAME_STATE_REASON = "StateReason";
  @SerializedName(SERIALIZED_NAME_STATE_REASON)
  private String stateReason;

  public static final String SERIALIZED_NAME_RETENTION_DAYS = "RetentionDays";
  @SerializedName(SERIALIZED_NAME_RETENTION_DAYS)
  private Integer retentionDays;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "SizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Integer sizeBytes;

  public static final String SERIALIZED_NAME_EVENT_COUNT = "EventCount";
  @SerializedName(SERIALIZED_NAME_EVENT_COUNT)
  private Integer eventCount;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public DescribeArchiveResponse() {
  }

  public DescribeArchiveResponse archiveArn(String archiveArn) {
    this.archiveArn = archiveArn;
    return this;
  }

  /**
   * Get archiveArn
   * @return archiveArn
   */
  @javax.annotation.Nullable
  public String getArchiveArn() {
    return archiveArn;
  }

  public void setArchiveArn(String archiveArn) {
    this.archiveArn = archiveArn;
  }


  public DescribeArchiveResponse archiveName(String archiveName) {
    this.archiveName = archiveName;
    return this;
  }

  /**
   * Get archiveName
   * @return archiveName
   */
  @javax.annotation.Nullable
  public String getArchiveName() {
    return archiveName;
  }

  public void setArchiveName(String archiveName) {
    this.archiveName = archiveName;
  }


  public DescribeArchiveResponse eventSourceArn(String eventSourceArn) {
    this.eventSourceArn = eventSourceArn;
    return this;
  }

  /**
   * Get eventSourceArn
   * @return eventSourceArn
   */
  @javax.annotation.Nullable
  public String getEventSourceArn() {
    return eventSourceArn;
  }

  public void setEventSourceArn(String eventSourceArn) {
    this.eventSourceArn = eventSourceArn;
  }


  public DescribeArchiveResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DescribeArchiveResponse eventPattern(String eventPattern) {
    this.eventPattern = eventPattern;
    return this;
  }

  /**
   * Get eventPattern
   * @return eventPattern
   */
  @javax.annotation.Nullable
  public String getEventPattern() {
    return eventPattern;
  }

  public void setEventPattern(String eventPattern) {
    this.eventPattern = eventPattern;
  }


  public DescribeArchiveResponse state(ArchiveState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public ArchiveState getState() {
    return state;
  }

  public void setState(ArchiveState state) {
    this.state = state;
  }


  public DescribeArchiveResponse stateReason(String stateReason) {
    this.stateReason = stateReason;
    return this;
  }

  /**
   * Get stateReason
   * @return stateReason
   */
  @javax.annotation.Nullable
  public String getStateReason() {
    return stateReason;
  }

  public void setStateReason(String stateReason) {
    this.stateReason = stateReason;
  }


  public DescribeArchiveResponse retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Get retentionDays
   * @return retentionDays
   */
  @javax.annotation.Nullable
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }


  public DescribeArchiveResponse sizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Get sizeBytes
   * @return sizeBytes
   */
  @javax.annotation.Nullable
  public Integer getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  public DescribeArchiveResponse eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }

  /**
   * Get eventCount
   * @return eventCount
   */
  @javax.annotation.Nullable
  public Integer getEventCount() {
    return eventCount;
  }

  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }


  public DescribeArchiveResponse creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeArchiveResponse describeArchiveResponse = (DescribeArchiveResponse) o;
    return Objects.equals(this.archiveArn, describeArchiveResponse.archiveArn) &&
        Objects.equals(this.archiveName, describeArchiveResponse.archiveName) &&
        Objects.equals(this.eventSourceArn, describeArchiveResponse.eventSourceArn) &&
        Objects.equals(this.description, describeArchiveResponse.description) &&
        Objects.equals(this.eventPattern, describeArchiveResponse.eventPattern) &&
        Objects.equals(this.state, describeArchiveResponse.state) &&
        Objects.equals(this.stateReason, describeArchiveResponse.stateReason) &&
        Objects.equals(this.retentionDays, describeArchiveResponse.retentionDays) &&
        Objects.equals(this.sizeBytes, describeArchiveResponse.sizeBytes) &&
        Objects.equals(this.eventCount, describeArchiveResponse.eventCount) &&
        Objects.equals(this.creationTime, describeArchiveResponse.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveArn, archiveName, eventSourceArn, description, eventPattern, state, stateReason, retentionDays, sizeBytes, eventCount, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeArchiveResponse {\n");
    sb.append("    archiveArn: ").append(toIndentedString(archiveArn)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    eventSourceArn: ").append(toIndentedString(eventSourceArn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventPattern: ").append(toIndentedString(eventPattern)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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
    openapiFields.add("ArchiveArn");
    openapiFields.add("ArchiveName");
    openapiFields.add("EventSourceArn");
    openapiFields.add("Description");
    openapiFields.add("EventPattern");
    openapiFields.add("State");
    openapiFields.add("StateReason");
    openapiFields.add("RetentionDays");
    openapiFields.add("SizeBytes");
    openapiFields.add("EventCount");
    openapiFields.add("CreationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeArchiveResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeArchiveResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeArchiveResponse is not found in the empty JSON string", DescribeArchiveResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeArchiveResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeArchiveResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ArchiveArn`
      if (jsonObj.get("ArchiveArn") != null && !jsonObj.get("ArchiveArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ArchiveArn"));
      }
      // validate the optional field `ArchiveName`
      if (jsonObj.get("ArchiveName") != null && !jsonObj.get("ArchiveName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ArchiveName"));
      }
      // validate the optional field `EventSourceArn`
      if (jsonObj.get("EventSourceArn") != null && !jsonObj.get("EventSourceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EventSourceArn"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `EventPattern`
      if (jsonObj.get("EventPattern") != null && !jsonObj.get("EventPattern").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EventPattern"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        ArchiveState.validateJsonElement(jsonObj.get("State"));
      }
      // validate the optional field `StateReason`
      if (jsonObj.get("StateReason") != null && !jsonObj.get("StateReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StateReason"));
      }
      // validate the optional field `RetentionDays`
      if (jsonObj.get("RetentionDays") != null && !jsonObj.get("RetentionDays").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("RetentionDays"));
      }
      // validate the optional field `SizeBytes`
      if (jsonObj.get("SizeBytes") != null && !jsonObj.get("SizeBytes").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("SizeBytes"));
      }
      // validate the optional field `EventCount`
      if (jsonObj.get("EventCount") != null && !jsonObj.get("EventCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("EventCount"));
      }
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreationTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeArchiveResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeArchiveResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeArchiveResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeArchiveResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeArchiveResponse>() {
           @Override
           public void write(JsonWriter out, DescribeArchiveResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeArchiveResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeArchiveResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeArchiveResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeArchiveResponse
   */
  public static DescribeArchiveResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeArchiveResponse.class);
  }

  /**
   * Convert an instance of DescribeArchiveResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

