/*
 * Storage Transfer API
 * Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 
 *
 * The version of the OpenAPI document: v1
 * 
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
 * A collection of counters that report the progress of a transfer operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:32.119462-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TransferCounters {
  public static final String SERIALIZED_NAME_BYTES_COPIED_TO_SINK = "bytesCopiedToSink";
  @SerializedName(SERIALIZED_NAME_BYTES_COPIED_TO_SINK)
  private String bytesCopiedToSink;

  public static final String SERIALIZED_NAME_BYTES_DELETED_FROM_SINK = "bytesDeletedFromSink";
  @SerializedName(SERIALIZED_NAME_BYTES_DELETED_FROM_SINK)
  private String bytesDeletedFromSink;

  public static final String SERIALIZED_NAME_BYTES_DELETED_FROM_SOURCE = "bytesDeletedFromSource";
  @SerializedName(SERIALIZED_NAME_BYTES_DELETED_FROM_SOURCE)
  private String bytesDeletedFromSource;

  public static final String SERIALIZED_NAME_BYTES_FAILED_TO_DELETE_FROM_SINK = "bytesFailedToDeleteFromSink";
  @SerializedName(SERIALIZED_NAME_BYTES_FAILED_TO_DELETE_FROM_SINK)
  private String bytesFailedToDeleteFromSink;

  public static final String SERIALIZED_NAME_BYTES_FOUND_FROM_SOURCE = "bytesFoundFromSource";
  @SerializedName(SERIALIZED_NAME_BYTES_FOUND_FROM_SOURCE)
  private String bytesFoundFromSource;

  public static final String SERIALIZED_NAME_BYTES_FOUND_ONLY_FROM_SINK = "bytesFoundOnlyFromSink";
  @SerializedName(SERIALIZED_NAME_BYTES_FOUND_ONLY_FROM_SINK)
  private String bytesFoundOnlyFromSink;

  public static final String SERIALIZED_NAME_BYTES_FROM_SOURCE_FAILED = "bytesFromSourceFailed";
  @SerializedName(SERIALIZED_NAME_BYTES_FROM_SOURCE_FAILED)
  private String bytesFromSourceFailed;

  public static final String SERIALIZED_NAME_BYTES_FROM_SOURCE_SKIPPED_BY_SYNC = "bytesFromSourceSkippedBySync";
  @SerializedName(SERIALIZED_NAME_BYTES_FROM_SOURCE_SKIPPED_BY_SYNC)
  private String bytesFromSourceSkippedBySync;

  public static final String SERIALIZED_NAME_DIRECTORIES_FAILED_TO_LIST_FROM_SOURCE = "directoriesFailedToListFromSource";
  @SerializedName(SERIALIZED_NAME_DIRECTORIES_FAILED_TO_LIST_FROM_SOURCE)
  private String directoriesFailedToListFromSource;

  public static final String SERIALIZED_NAME_DIRECTORIES_FOUND_FROM_SOURCE = "directoriesFoundFromSource";
  @SerializedName(SERIALIZED_NAME_DIRECTORIES_FOUND_FROM_SOURCE)
  private String directoriesFoundFromSource;

  public static final String SERIALIZED_NAME_DIRECTORIES_SUCCESSFULLY_LISTED_FROM_SOURCE = "directoriesSuccessfullyListedFromSource";
  @SerializedName(SERIALIZED_NAME_DIRECTORIES_SUCCESSFULLY_LISTED_FROM_SOURCE)
  private String directoriesSuccessfullyListedFromSource;

  public static final String SERIALIZED_NAME_INTERMEDIATE_OBJECTS_CLEANED_UP = "intermediateObjectsCleanedUp";
  @SerializedName(SERIALIZED_NAME_INTERMEDIATE_OBJECTS_CLEANED_UP)
  private String intermediateObjectsCleanedUp;

  public static final String SERIALIZED_NAME_INTERMEDIATE_OBJECTS_FAILED_CLEANED_UP = "intermediateObjectsFailedCleanedUp";
  @SerializedName(SERIALIZED_NAME_INTERMEDIATE_OBJECTS_FAILED_CLEANED_UP)
  private String intermediateObjectsFailedCleanedUp;

  public static final String SERIALIZED_NAME_OBJECTS_COPIED_TO_SINK = "objectsCopiedToSink";
  @SerializedName(SERIALIZED_NAME_OBJECTS_COPIED_TO_SINK)
  private String objectsCopiedToSink;

  public static final String SERIALIZED_NAME_OBJECTS_DELETED_FROM_SINK = "objectsDeletedFromSink";
  @SerializedName(SERIALIZED_NAME_OBJECTS_DELETED_FROM_SINK)
  private String objectsDeletedFromSink;

  public static final String SERIALIZED_NAME_OBJECTS_DELETED_FROM_SOURCE = "objectsDeletedFromSource";
  @SerializedName(SERIALIZED_NAME_OBJECTS_DELETED_FROM_SOURCE)
  private String objectsDeletedFromSource;

  public static final String SERIALIZED_NAME_OBJECTS_FAILED_TO_DELETE_FROM_SINK = "objectsFailedToDeleteFromSink";
  @SerializedName(SERIALIZED_NAME_OBJECTS_FAILED_TO_DELETE_FROM_SINK)
  private String objectsFailedToDeleteFromSink;

  public static final String SERIALIZED_NAME_OBJECTS_FOUND_FROM_SOURCE = "objectsFoundFromSource";
  @SerializedName(SERIALIZED_NAME_OBJECTS_FOUND_FROM_SOURCE)
  private String objectsFoundFromSource;

  public static final String SERIALIZED_NAME_OBJECTS_FOUND_ONLY_FROM_SINK = "objectsFoundOnlyFromSink";
  @SerializedName(SERIALIZED_NAME_OBJECTS_FOUND_ONLY_FROM_SINK)
  private String objectsFoundOnlyFromSink;

  public static final String SERIALIZED_NAME_OBJECTS_FROM_SOURCE_FAILED = "objectsFromSourceFailed";
  @SerializedName(SERIALIZED_NAME_OBJECTS_FROM_SOURCE_FAILED)
  private String objectsFromSourceFailed;

  public static final String SERIALIZED_NAME_OBJECTS_FROM_SOURCE_SKIPPED_BY_SYNC = "objectsFromSourceSkippedBySync";
  @SerializedName(SERIALIZED_NAME_OBJECTS_FROM_SOURCE_SKIPPED_BY_SYNC)
  private String objectsFromSourceSkippedBySync;

  public TransferCounters() {
  }

  public TransferCounters bytesCopiedToSink(String bytesCopiedToSink) {
    this.bytesCopiedToSink = bytesCopiedToSink;
    return this;
  }

  /**
   * Bytes that are copied to the data sink.
   * @return bytesCopiedToSink
   */
  @javax.annotation.Nullable
  public String getBytesCopiedToSink() {
    return bytesCopiedToSink;
  }

  public void setBytesCopiedToSink(String bytesCopiedToSink) {
    this.bytesCopiedToSink = bytesCopiedToSink;
  }


  public TransferCounters bytesDeletedFromSink(String bytesDeletedFromSink) {
    this.bytesDeletedFromSink = bytesDeletedFromSink;
    return this;
  }

  /**
   * Bytes that are deleted from the data sink.
   * @return bytesDeletedFromSink
   */
  @javax.annotation.Nullable
  public String getBytesDeletedFromSink() {
    return bytesDeletedFromSink;
  }

  public void setBytesDeletedFromSink(String bytesDeletedFromSink) {
    this.bytesDeletedFromSink = bytesDeletedFromSink;
  }


  public TransferCounters bytesDeletedFromSource(String bytesDeletedFromSource) {
    this.bytesDeletedFromSource = bytesDeletedFromSource;
    return this;
  }

  /**
   * Bytes that are deleted from the data source.
   * @return bytesDeletedFromSource
   */
  @javax.annotation.Nullable
  public String getBytesDeletedFromSource() {
    return bytesDeletedFromSource;
  }

  public void setBytesDeletedFromSource(String bytesDeletedFromSource) {
    this.bytesDeletedFromSource = bytesDeletedFromSource;
  }


  public TransferCounters bytesFailedToDeleteFromSink(String bytesFailedToDeleteFromSink) {
    this.bytesFailedToDeleteFromSink = bytesFailedToDeleteFromSink;
    return this;
  }

  /**
   * Bytes that failed to be deleted from the data sink.
   * @return bytesFailedToDeleteFromSink
   */
  @javax.annotation.Nullable
  public String getBytesFailedToDeleteFromSink() {
    return bytesFailedToDeleteFromSink;
  }

  public void setBytesFailedToDeleteFromSink(String bytesFailedToDeleteFromSink) {
    this.bytesFailedToDeleteFromSink = bytesFailedToDeleteFromSink;
  }


  public TransferCounters bytesFoundFromSource(String bytesFoundFromSource) {
    this.bytesFoundFromSource = bytesFoundFromSource;
    return this;
  }

  /**
   * Bytes found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync.
   * @return bytesFoundFromSource
   */
  @javax.annotation.Nullable
  public String getBytesFoundFromSource() {
    return bytesFoundFromSource;
  }

  public void setBytesFoundFromSource(String bytesFoundFromSource) {
    this.bytesFoundFromSource = bytesFoundFromSource;
  }


  public TransferCounters bytesFoundOnlyFromSink(String bytesFoundOnlyFromSink) {
    this.bytesFoundOnlyFromSink = bytesFoundOnlyFromSink;
    return this;
  }

  /**
   * Bytes found only in the data sink that are scheduled to be deleted.
   * @return bytesFoundOnlyFromSink
   */
  @javax.annotation.Nullable
  public String getBytesFoundOnlyFromSink() {
    return bytesFoundOnlyFromSink;
  }

  public void setBytesFoundOnlyFromSink(String bytesFoundOnlyFromSink) {
    this.bytesFoundOnlyFromSink = bytesFoundOnlyFromSink;
  }


  public TransferCounters bytesFromSourceFailed(String bytesFromSourceFailed) {
    this.bytesFromSourceFailed = bytesFromSourceFailed;
    return this;
  }

  /**
   * Bytes in the data source that failed to be transferred or that failed to be deleted after being transferred.
   * @return bytesFromSourceFailed
   */
  @javax.annotation.Nullable
  public String getBytesFromSourceFailed() {
    return bytesFromSourceFailed;
  }

  public void setBytesFromSourceFailed(String bytesFromSourceFailed) {
    this.bytesFromSourceFailed = bytesFromSourceFailed;
  }


  public TransferCounters bytesFromSourceSkippedBySync(String bytesFromSourceSkippedBySync) {
    this.bytesFromSourceSkippedBySync = bytesFromSourceSkippedBySync;
    return this;
  }

  /**
   * Bytes in the data source that are not transferred because they already exist in the data sink.
   * @return bytesFromSourceSkippedBySync
   */
  @javax.annotation.Nullable
  public String getBytesFromSourceSkippedBySync() {
    return bytesFromSourceSkippedBySync;
  }

  public void setBytesFromSourceSkippedBySync(String bytesFromSourceSkippedBySync) {
    this.bytesFromSourceSkippedBySync = bytesFromSourceSkippedBySync;
  }


  public TransferCounters directoriesFailedToListFromSource(String directoriesFailedToListFromSource) {
    this.directoriesFailedToListFromSource = directoriesFailedToListFromSource;
    return this;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of listing failures for each directory found at the source. Potential failures when listing a directory include permission failure or block failure. If listing a directory fails, no files in the directory are transferred.
   * @return directoriesFailedToListFromSource
   */
  @javax.annotation.Nullable
  public String getDirectoriesFailedToListFromSource() {
    return directoriesFailedToListFromSource;
  }

  public void setDirectoriesFailedToListFromSource(String directoriesFailedToListFromSource) {
    this.directoriesFailedToListFromSource = directoriesFailedToListFromSource;
  }


  public TransferCounters directoriesFoundFromSource(String directoriesFoundFromSource) {
    this.directoriesFoundFromSource = directoriesFoundFromSource;
    return this;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of directories found while listing. For example, if the root directory of the transfer is &#x60;base/&#x60; and there are two other directories, &#x60;a/&#x60; and &#x60;b/&#x60; under this directory, the count after listing &#x60;base/&#x60;, &#x60;base/a/&#x60; and &#x60;base/b/&#x60; is 3.
   * @return directoriesFoundFromSource
   */
  @javax.annotation.Nullable
  public String getDirectoriesFoundFromSource() {
    return directoriesFoundFromSource;
  }

  public void setDirectoriesFoundFromSource(String directoriesFoundFromSource) {
    this.directoriesFoundFromSource = directoriesFoundFromSource;
  }


  public TransferCounters directoriesSuccessfullyListedFromSource(String directoriesSuccessfullyListedFromSource) {
    this.directoriesSuccessfullyListedFromSource = directoriesSuccessfullyListedFromSource;
    return this;
  }

  /**
   * For transfers involving PosixFilesystem only. Number of successful listings for each directory found at the source.
   * @return directoriesSuccessfullyListedFromSource
   */
  @javax.annotation.Nullable
  public String getDirectoriesSuccessfullyListedFromSource() {
    return directoriesSuccessfullyListedFromSource;
  }

  public void setDirectoriesSuccessfullyListedFromSource(String directoriesSuccessfullyListedFromSource) {
    this.directoriesSuccessfullyListedFromSource = directoriesSuccessfullyListedFromSource;
  }


  public TransferCounters intermediateObjectsCleanedUp(String intermediateObjectsCleanedUp) {
    this.intermediateObjectsCleanedUp = intermediateObjectsCleanedUp;
    return this;
  }

  /**
   * Number of successfully cleaned up intermediate objects.
   * @return intermediateObjectsCleanedUp
   */
  @javax.annotation.Nullable
  public String getIntermediateObjectsCleanedUp() {
    return intermediateObjectsCleanedUp;
  }

  public void setIntermediateObjectsCleanedUp(String intermediateObjectsCleanedUp) {
    this.intermediateObjectsCleanedUp = intermediateObjectsCleanedUp;
  }


  public TransferCounters intermediateObjectsFailedCleanedUp(String intermediateObjectsFailedCleanedUp) {
    this.intermediateObjectsFailedCleanedUp = intermediateObjectsFailedCleanedUp;
    return this;
  }

  /**
   * Number of intermediate objects failed cleaned up.
   * @return intermediateObjectsFailedCleanedUp
   */
  @javax.annotation.Nullable
  public String getIntermediateObjectsFailedCleanedUp() {
    return intermediateObjectsFailedCleanedUp;
  }

  public void setIntermediateObjectsFailedCleanedUp(String intermediateObjectsFailedCleanedUp) {
    this.intermediateObjectsFailedCleanedUp = intermediateObjectsFailedCleanedUp;
  }


  public TransferCounters objectsCopiedToSink(String objectsCopiedToSink) {
    this.objectsCopiedToSink = objectsCopiedToSink;
    return this;
  }

  /**
   * Objects that are copied to the data sink.
   * @return objectsCopiedToSink
   */
  @javax.annotation.Nullable
  public String getObjectsCopiedToSink() {
    return objectsCopiedToSink;
  }

  public void setObjectsCopiedToSink(String objectsCopiedToSink) {
    this.objectsCopiedToSink = objectsCopiedToSink;
  }


  public TransferCounters objectsDeletedFromSink(String objectsDeletedFromSink) {
    this.objectsDeletedFromSink = objectsDeletedFromSink;
    return this;
  }

  /**
   * Objects that are deleted from the data sink.
   * @return objectsDeletedFromSink
   */
  @javax.annotation.Nullable
  public String getObjectsDeletedFromSink() {
    return objectsDeletedFromSink;
  }

  public void setObjectsDeletedFromSink(String objectsDeletedFromSink) {
    this.objectsDeletedFromSink = objectsDeletedFromSink;
  }


  public TransferCounters objectsDeletedFromSource(String objectsDeletedFromSource) {
    this.objectsDeletedFromSource = objectsDeletedFromSource;
    return this;
  }

  /**
   * Objects that are deleted from the data source.
   * @return objectsDeletedFromSource
   */
  @javax.annotation.Nullable
  public String getObjectsDeletedFromSource() {
    return objectsDeletedFromSource;
  }

  public void setObjectsDeletedFromSource(String objectsDeletedFromSource) {
    this.objectsDeletedFromSource = objectsDeletedFromSource;
  }


  public TransferCounters objectsFailedToDeleteFromSink(String objectsFailedToDeleteFromSink) {
    this.objectsFailedToDeleteFromSink = objectsFailedToDeleteFromSink;
    return this;
  }

  /**
   * Objects that failed to be deleted from the data sink.
   * @return objectsFailedToDeleteFromSink
   */
  @javax.annotation.Nullable
  public String getObjectsFailedToDeleteFromSink() {
    return objectsFailedToDeleteFromSink;
  }

  public void setObjectsFailedToDeleteFromSink(String objectsFailedToDeleteFromSink) {
    this.objectsFailedToDeleteFromSink = objectsFailedToDeleteFromSink;
  }


  public TransferCounters objectsFoundFromSource(String objectsFoundFromSource) {
    this.objectsFoundFromSource = objectsFoundFromSource;
    return this;
  }

  /**
   * Objects found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync.
   * @return objectsFoundFromSource
   */
  @javax.annotation.Nullable
  public String getObjectsFoundFromSource() {
    return objectsFoundFromSource;
  }

  public void setObjectsFoundFromSource(String objectsFoundFromSource) {
    this.objectsFoundFromSource = objectsFoundFromSource;
  }


  public TransferCounters objectsFoundOnlyFromSink(String objectsFoundOnlyFromSink) {
    this.objectsFoundOnlyFromSink = objectsFoundOnlyFromSink;
    return this;
  }

  /**
   * Objects found only in the data sink that are scheduled to be deleted.
   * @return objectsFoundOnlyFromSink
   */
  @javax.annotation.Nullable
  public String getObjectsFoundOnlyFromSink() {
    return objectsFoundOnlyFromSink;
  }

  public void setObjectsFoundOnlyFromSink(String objectsFoundOnlyFromSink) {
    this.objectsFoundOnlyFromSink = objectsFoundOnlyFromSink;
  }


  public TransferCounters objectsFromSourceFailed(String objectsFromSourceFailed) {
    this.objectsFromSourceFailed = objectsFromSourceFailed;
    return this;
  }

  /**
   * Objects in the data source that failed to be transferred or that failed to be deleted after being transferred.
   * @return objectsFromSourceFailed
   */
  @javax.annotation.Nullable
  public String getObjectsFromSourceFailed() {
    return objectsFromSourceFailed;
  }

  public void setObjectsFromSourceFailed(String objectsFromSourceFailed) {
    this.objectsFromSourceFailed = objectsFromSourceFailed;
  }


  public TransferCounters objectsFromSourceSkippedBySync(String objectsFromSourceSkippedBySync) {
    this.objectsFromSourceSkippedBySync = objectsFromSourceSkippedBySync;
    return this;
  }

  /**
   * Objects in the data source that are not transferred because they already exist in the data sink.
   * @return objectsFromSourceSkippedBySync
   */
  @javax.annotation.Nullable
  public String getObjectsFromSourceSkippedBySync() {
    return objectsFromSourceSkippedBySync;
  }

  public void setObjectsFromSourceSkippedBySync(String objectsFromSourceSkippedBySync) {
    this.objectsFromSourceSkippedBySync = objectsFromSourceSkippedBySync;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCounters transferCounters = (TransferCounters) o;
    return Objects.equals(this.bytesCopiedToSink, transferCounters.bytesCopiedToSink) &&
        Objects.equals(this.bytesDeletedFromSink, transferCounters.bytesDeletedFromSink) &&
        Objects.equals(this.bytesDeletedFromSource, transferCounters.bytesDeletedFromSource) &&
        Objects.equals(this.bytesFailedToDeleteFromSink, transferCounters.bytesFailedToDeleteFromSink) &&
        Objects.equals(this.bytesFoundFromSource, transferCounters.bytesFoundFromSource) &&
        Objects.equals(this.bytesFoundOnlyFromSink, transferCounters.bytesFoundOnlyFromSink) &&
        Objects.equals(this.bytesFromSourceFailed, transferCounters.bytesFromSourceFailed) &&
        Objects.equals(this.bytesFromSourceSkippedBySync, transferCounters.bytesFromSourceSkippedBySync) &&
        Objects.equals(this.directoriesFailedToListFromSource, transferCounters.directoriesFailedToListFromSource) &&
        Objects.equals(this.directoriesFoundFromSource, transferCounters.directoriesFoundFromSource) &&
        Objects.equals(this.directoriesSuccessfullyListedFromSource, transferCounters.directoriesSuccessfullyListedFromSource) &&
        Objects.equals(this.intermediateObjectsCleanedUp, transferCounters.intermediateObjectsCleanedUp) &&
        Objects.equals(this.intermediateObjectsFailedCleanedUp, transferCounters.intermediateObjectsFailedCleanedUp) &&
        Objects.equals(this.objectsCopiedToSink, transferCounters.objectsCopiedToSink) &&
        Objects.equals(this.objectsDeletedFromSink, transferCounters.objectsDeletedFromSink) &&
        Objects.equals(this.objectsDeletedFromSource, transferCounters.objectsDeletedFromSource) &&
        Objects.equals(this.objectsFailedToDeleteFromSink, transferCounters.objectsFailedToDeleteFromSink) &&
        Objects.equals(this.objectsFoundFromSource, transferCounters.objectsFoundFromSource) &&
        Objects.equals(this.objectsFoundOnlyFromSink, transferCounters.objectsFoundOnlyFromSink) &&
        Objects.equals(this.objectsFromSourceFailed, transferCounters.objectsFromSourceFailed) &&
        Objects.equals(this.objectsFromSourceSkippedBySync, transferCounters.objectsFromSourceSkippedBySync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesCopiedToSink, bytesDeletedFromSink, bytesDeletedFromSource, bytesFailedToDeleteFromSink, bytesFoundFromSource, bytesFoundOnlyFromSink, bytesFromSourceFailed, bytesFromSourceSkippedBySync, directoriesFailedToListFromSource, directoriesFoundFromSource, directoriesSuccessfullyListedFromSource, intermediateObjectsCleanedUp, intermediateObjectsFailedCleanedUp, objectsCopiedToSink, objectsDeletedFromSink, objectsDeletedFromSource, objectsFailedToDeleteFromSink, objectsFoundFromSource, objectsFoundOnlyFromSink, objectsFromSourceFailed, objectsFromSourceSkippedBySync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCounters {\n");
    sb.append("    bytesCopiedToSink: ").append(toIndentedString(bytesCopiedToSink)).append("\n");
    sb.append("    bytesDeletedFromSink: ").append(toIndentedString(bytesDeletedFromSink)).append("\n");
    sb.append("    bytesDeletedFromSource: ").append(toIndentedString(bytesDeletedFromSource)).append("\n");
    sb.append("    bytesFailedToDeleteFromSink: ").append(toIndentedString(bytesFailedToDeleteFromSink)).append("\n");
    sb.append("    bytesFoundFromSource: ").append(toIndentedString(bytesFoundFromSource)).append("\n");
    sb.append("    bytesFoundOnlyFromSink: ").append(toIndentedString(bytesFoundOnlyFromSink)).append("\n");
    sb.append("    bytesFromSourceFailed: ").append(toIndentedString(bytesFromSourceFailed)).append("\n");
    sb.append("    bytesFromSourceSkippedBySync: ").append(toIndentedString(bytesFromSourceSkippedBySync)).append("\n");
    sb.append("    directoriesFailedToListFromSource: ").append(toIndentedString(directoriesFailedToListFromSource)).append("\n");
    sb.append("    directoriesFoundFromSource: ").append(toIndentedString(directoriesFoundFromSource)).append("\n");
    sb.append("    directoriesSuccessfullyListedFromSource: ").append(toIndentedString(directoriesSuccessfullyListedFromSource)).append("\n");
    sb.append("    intermediateObjectsCleanedUp: ").append(toIndentedString(intermediateObjectsCleanedUp)).append("\n");
    sb.append("    intermediateObjectsFailedCleanedUp: ").append(toIndentedString(intermediateObjectsFailedCleanedUp)).append("\n");
    sb.append("    objectsCopiedToSink: ").append(toIndentedString(objectsCopiedToSink)).append("\n");
    sb.append("    objectsDeletedFromSink: ").append(toIndentedString(objectsDeletedFromSink)).append("\n");
    sb.append("    objectsDeletedFromSource: ").append(toIndentedString(objectsDeletedFromSource)).append("\n");
    sb.append("    objectsFailedToDeleteFromSink: ").append(toIndentedString(objectsFailedToDeleteFromSink)).append("\n");
    sb.append("    objectsFoundFromSource: ").append(toIndentedString(objectsFoundFromSource)).append("\n");
    sb.append("    objectsFoundOnlyFromSink: ").append(toIndentedString(objectsFoundOnlyFromSink)).append("\n");
    sb.append("    objectsFromSourceFailed: ").append(toIndentedString(objectsFromSourceFailed)).append("\n");
    sb.append("    objectsFromSourceSkippedBySync: ").append(toIndentedString(objectsFromSourceSkippedBySync)).append("\n");
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
    openapiFields.add("bytesCopiedToSink");
    openapiFields.add("bytesDeletedFromSink");
    openapiFields.add("bytesDeletedFromSource");
    openapiFields.add("bytesFailedToDeleteFromSink");
    openapiFields.add("bytesFoundFromSource");
    openapiFields.add("bytesFoundOnlyFromSink");
    openapiFields.add("bytesFromSourceFailed");
    openapiFields.add("bytesFromSourceSkippedBySync");
    openapiFields.add("directoriesFailedToListFromSource");
    openapiFields.add("directoriesFoundFromSource");
    openapiFields.add("directoriesSuccessfullyListedFromSource");
    openapiFields.add("intermediateObjectsCleanedUp");
    openapiFields.add("intermediateObjectsFailedCleanedUp");
    openapiFields.add("objectsCopiedToSink");
    openapiFields.add("objectsDeletedFromSink");
    openapiFields.add("objectsDeletedFromSource");
    openapiFields.add("objectsFailedToDeleteFromSink");
    openapiFields.add("objectsFoundFromSource");
    openapiFields.add("objectsFoundOnlyFromSink");
    openapiFields.add("objectsFromSourceFailed");
    openapiFields.add("objectsFromSourceSkippedBySync");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransferCounters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransferCounters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferCounters is not found in the empty JSON string", TransferCounters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransferCounters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferCounters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bytesCopiedToSink") != null && !jsonObj.get("bytesCopiedToSink").isJsonNull()) && !jsonObj.get("bytesCopiedToSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesCopiedToSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesCopiedToSink").toString()));
      }
      if ((jsonObj.get("bytesDeletedFromSink") != null && !jsonObj.get("bytesDeletedFromSink").isJsonNull()) && !jsonObj.get("bytesDeletedFromSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesDeletedFromSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesDeletedFromSink").toString()));
      }
      if ((jsonObj.get("bytesDeletedFromSource") != null && !jsonObj.get("bytesDeletedFromSource").isJsonNull()) && !jsonObj.get("bytesDeletedFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesDeletedFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesDeletedFromSource").toString()));
      }
      if ((jsonObj.get("bytesFailedToDeleteFromSink") != null && !jsonObj.get("bytesFailedToDeleteFromSink").isJsonNull()) && !jsonObj.get("bytesFailedToDeleteFromSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesFailedToDeleteFromSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesFailedToDeleteFromSink").toString()));
      }
      if ((jsonObj.get("bytesFoundFromSource") != null && !jsonObj.get("bytesFoundFromSource").isJsonNull()) && !jsonObj.get("bytesFoundFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesFoundFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesFoundFromSource").toString()));
      }
      if ((jsonObj.get("bytesFoundOnlyFromSink") != null && !jsonObj.get("bytesFoundOnlyFromSink").isJsonNull()) && !jsonObj.get("bytesFoundOnlyFromSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesFoundOnlyFromSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesFoundOnlyFromSink").toString()));
      }
      if ((jsonObj.get("bytesFromSourceFailed") != null && !jsonObj.get("bytesFromSourceFailed").isJsonNull()) && !jsonObj.get("bytesFromSourceFailed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesFromSourceFailed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesFromSourceFailed").toString()));
      }
      if ((jsonObj.get("bytesFromSourceSkippedBySync") != null && !jsonObj.get("bytesFromSourceSkippedBySync").isJsonNull()) && !jsonObj.get("bytesFromSourceSkippedBySync").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesFromSourceSkippedBySync` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesFromSourceSkippedBySync").toString()));
      }
      if ((jsonObj.get("directoriesFailedToListFromSource") != null && !jsonObj.get("directoriesFailedToListFromSource").isJsonNull()) && !jsonObj.get("directoriesFailedToListFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directoriesFailedToListFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directoriesFailedToListFromSource").toString()));
      }
      if ((jsonObj.get("directoriesFoundFromSource") != null && !jsonObj.get("directoriesFoundFromSource").isJsonNull()) && !jsonObj.get("directoriesFoundFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directoriesFoundFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directoriesFoundFromSource").toString()));
      }
      if ((jsonObj.get("directoriesSuccessfullyListedFromSource") != null && !jsonObj.get("directoriesSuccessfullyListedFromSource").isJsonNull()) && !jsonObj.get("directoriesSuccessfullyListedFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directoriesSuccessfullyListedFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directoriesSuccessfullyListedFromSource").toString()));
      }
      if ((jsonObj.get("intermediateObjectsCleanedUp") != null && !jsonObj.get("intermediateObjectsCleanedUp").isJsonNull()) && !jsonObj.get("intermediateObjectsCleanedUp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intermediateObjectsCleanedUp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intermediateObjectsCleanedUp").toString()));
      }
      if ((jsonObj.get("intermediateObjectsFailedCleanedUp") != null && !jsonObj.get("intermediateObjectsFailedCleanedUp").isJsonNull()) && !jsonObj.get("intermediateObjectsFailedCleanedUp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intermediateObjectsFailedCleanedUp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intermediateObjectsFailedCleanedUp").toString()));
      }
      if ((jsonObj.get("objectsCopiedToSink") != null && !jsonObj.get("objectsCopiedToSink").isJsonNull()) && !jsonObj.get("objectsCopiedToSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsCopiedToSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsCopiedToSink").toString()));
      }
      if ((jsonObj.get("objectsDeletedFromSink") != null && !jsonObj.get("objectsDeletedFromSink").isJsonNull()) && !jsonObj.get("objectsDeletedFromSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsDeletedFromSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsDeletedFromSink").toString()));
      }
      if ((jsonObj.get("objectsDeletedFromSource") != null && !jsonObj.get("objectsDeletedFromSource").isJsonNull()) && !jsonObj.get("objectsDeletedFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsDeletedFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsDeletedFromSource").toString()));
      }
      if ((jsonObj.get("objectsFailedToDeleteFromSink") != null && !jsonObj.get("objectsFailedToDeleteFromSink").isJsonNull()) && !jsonObj.get("objectsFailedToDeleteFromSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsFailedToDeleteFromSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsFailedToDeleteFromSink").toString()));
      }
      if ((jsonObj.get("objectsFoundFromSource") != null && !jsonObj.get("objectsFoundFromSource").isJsonNull()) && !jsonObj.get("objectsFoundFromSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsFoundFromSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsFoundFromSource").toString()));
      }
      if ((jsonObj.get("objectsFoundOnlyFromSink") != null && !jsonObj.get("objectsFoundOnlyFromSink").isJsonNull()) && !jsonObj.get("objectsFoundOnlyFromSink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsFoundOnlyFromSink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsFoundOnlyFromSink").toString()));
      }
      if ((jsonObj.get("objectsFromSourceFailed") != null && !jsonObj.get("objectsFromSourceFailed").isJsonNull()) && !jsonObj.get("objectsFromSourceFailed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsFromSourceFailed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsFromSourceFailed").toString()));
      }
      if ((jsonObj.get("objectsFromSourceSkippedBySync") != null && !jsonObj.get("objectsFromSourceSkippedBySync").isJsonNull()) && !jsonObj.get("objectsFromSourceSkippedBySync").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectsFromSourceSkippedBySync` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectsFromSourceSkippedBySync").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferCounters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferCounters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferCounters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferCounters.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferCounters>() {
           @Override
           public void write(JsonWriter out, TransferCounters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferCounters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransferCounters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferCounters
   * @throws IOException if the JSON string is invalid with respect to TransferCounters
   */
  public static TransferCounters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferCounters.class);
  }

  /**
   * Convert an instance of TransferCounters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

