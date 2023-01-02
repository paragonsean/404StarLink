/*
 * Amazon DynamoDB Streams
 * <fullname>Amazon DynamoDB</fullname> <p>Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about application development with Streams, see <a href=\"https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html\">Capturing Table Activity with DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.</p>
 *
 * The version of the OpenAPI document: 2012-08-10
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
import java.util.Map;
import org.openapitools.client.model.StreamViewType;

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
 * RecordDynamodb
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:46.795436-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RecordDynamodb {
  public static final String SERIALIZED_NAME_APPROXIMATE_CREATION_DATE_TIME = "ApproximateCreationDateTime";
  @SerializedName(SERIALIZED_NAME_APPROXIMATE_CREATION_DATE_TIME)
  private OffsetDateTime approximateCreationDateTime;

  public static final String SERIALIZED_NAME_KEYS = "Keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private Map keys;

  public static final String SERIALIZED_NAME_NEW_IMAGE = "NewImage";
  @SerializedName(SERIALIZED_NAME_NEW_IMAGE)
  private Map newImage;

  public static final String SERIALIZED_NAME_OLD_IMAGE = "OldImage";
  @SerializedName(SERIALIZED_NAME_OLD_IMAGE)
  private Map oldImage;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "SequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private String sequenceNumber;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "SizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Integer sizeBytes;

  public static final String SERIALIZED_NAME_STREAM_VIEW_TYPE = "StreamViewType";
  @SerializedName(SERIALIZED_NAME_STREAM_VIEW_TYPE)
  private StreamViewType streamViewType;

  public RecordDynamodb() {
  }

  public RecordDynamodb approximateCreationDateTime(OffsetDateTime approximateCreationDateTime) {
    this.approximateCreationDateTime = approximateCreationDateTime;
    return this;
  }

  /**
   * Get approximateCreationDateTime
   * @return approximateCreationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getApproximateCreationDateTime() {
    return approximateCreationDateTime;
  }

  public void setApproximateCreationDateTime(OffsetDateTime approximateCreationDateTime) {
    this.approximateCreationDateTime = approximateCreationDateTime;
  }


  public RecordDynamodb keys(Map keys) {
    this.keys = keys;
    return this;
  }

  /**
   * Get keys
   * @return keys
   */
  @javax.annotation.Nullable
  public Map getKeys() {
    return keys;
  }

  public void setKeys(Map keys) {
    this.keys = keys;
  }


  public RecordDynamodb newImage(Map newImage) {
    this.newImage = newImage;
    return this;
  }

  /**
   * Get newImage
   * @return newImage
   */
  @javax.annotation.Nullable
  public Map getNewImage() {
    return newImage;
  }

  public void setNewImage(Map newImage) {
    this.newImage = newImage;
  }


  public RecordDynamodb oldImage(Map oldImage) {
    this.oldImage = oldImage;
    return this;
  }

  /**
   * Get oldImage
   * @return oldImage
   */
  @javax.annotation.Nullable
  public Map getOldImage() {
    return oldImage;
  }

  public void setOldImage(Map oldImage) {
    this.oldImage = oldImage;
  }


  public RecordDynamodb sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
   */
  @javax.annotation.Nullable
  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public RecordDynamodb sizeBytes(Integer sizeBytes) {
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


  public RecordDynamodb streamViewType(StreamViewType streamViewType) {
    this.streamViewType = streamViewType;
    return this;
  }

  /**
   * Get streamViewType
   * @return streamViewType
   */
  @javax.annotation.Nullable
  public StreamViewType getStreamViewType() {
    return streamViewType;
  }

  public void setStreamViewType(StreamViewType streamViewType) {
    this.streamViewType = streamViewType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordDynamodb recordDynamodb = (RecordDynamodb) o;
    return Objects.equals(this.approximateCreationDateTime, recordDynamodb.approximateCreationDateTime) &&
        Objects.equals(this.keys, recordDynamodb.keys) &&
        Objects.equals(this.newImage, recordDynamodb.newImage) &&
        Objects.equals(this.oldImage, recordDynamodb.oldImage) &&
        Objects.equals(this.sequenceNumber, recordDynamodb.sequenceNumber) &&
        Objects.equals(this.sizeBytes, recordDynamodb.sizeBytes) &&
        Objects.equals(this.streamViewType, recordDynamodb.streamViewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateCreationDateTime, keys, newImage, oldImage, sequenceNumber, sizeBytes, streamViewType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordDynamodb {\n");
    sb.append("    approximateCreationDateTime: ").append(toIndentedString(approximateCreationDateTime)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    newImage: ").append(toIndentedString(newImage)).append("\n");
    sb.append("    oldImage: ").append(toIndentedString(oldImage)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    streamViewType: ").append(toIndentedString(streamViewType)).append("\n");
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
    openapiFields.add("ApproximateCreationDateTime");
    openapiFields.add("Keys");
    openapiFields.add("NewImage");
    openapiFields.add("OldImage");
    openapiFields.add("SequenceNumber");
    openapiFields.add("SizeBytes");
    openapiFields.add("StreamViewType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordDynamodb
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordDynamodb.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordDynamodb is not found in the empty JSON string", RecordDynamodb.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordDynamodb.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordDynamodb` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ApproximateCreationDateTime`
      if (jsonObj.get("ApproximateCreationDateTime") != null && !jsonObj.get("ApproximateCreationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ApproximateCreationDateTime"));
      }
      // validate the optional field `Keys`
      if (jsonObj.get("Keys") != null && !jsonObj.get("Keys").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Keys"));
      }
      // validate the optional field `NewImage`
      if (jsonObj.get("NewImage") != null && !jsonObj.get("NewImage").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("NewImage"));
      }
      // validate the optional field `OldImage`
      if (jsonObj.get("OldImage") != null && !jsonObj.get("OldImage").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("OldImage"));
      }
      // validate the optional field `SequenceNumber`
      if (jsonObj.get("SequenceNumber") != null && !jsonObj.get("SequenceNumber").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SequenceNumber"));
      }
      // validate the optional field `SizeBytes`
      if (jsonObj.get("SizeBytes") != null && !jsonObj.get("SizeBytes").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("SizeBytes"));
      }
      // validate the optional field `StreamViewType`
      if (jsonObj.get("StreamViewType") != null && !jsonObj.get("StreamViewType").isJsonNull()) {
        StreamViewType.validateJsonElement(jsonObj.get("StreamViewType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordDynamodb.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordDynamodb' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordDynamodb> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordDynamodb.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordDynamodb>() {
           @Override
           public void write(JsonWriter out, RecordDynamodb value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordDynamodb read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordDynamodb given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordDynamodb
   * @throws IOException if the JSON string is invalid with respect to RecordDynamodb
   */
  public static RecordDynamodb fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordDynamodb.class);
  }

  /**
   * Convert an instance of RecordDynamodb to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

