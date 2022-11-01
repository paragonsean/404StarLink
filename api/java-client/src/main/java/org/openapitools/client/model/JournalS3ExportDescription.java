/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
import org.openapitools.client.model.ExportStatus;
import org.openapitools.client.model.OutputFormat;
import org.openapitools.client.model.S3ExportConfiguration;

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
 * Information about a journal export job, including the ledger name, export ID, creation time, current status, and the parameters of the original export creation request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:23.217080-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class JournalS3ExportDescription {
  public static final String SERIALIZED_NAME_LEDGER_NAME = "LedgerName";
  @SerializedName(SERIALIZED_NAME_LEDGER_NAME)
  private String ledgerName;

  public static final String SERIALIZED_NAME_EXPORT_ID = "ExportId";
  @SerializedName(SERIALIZED_NAME_EXPORT_ID)
  private String exportId;

  public static final String SERIALIZED_NAME_EXPORT_CREATION_TIME = "ExportCreationTime";
  @SerializedName(SERIALIZED_NAME_EXPORT_CREATION_TIME)
  private OffsetDateTime exportCreationTime;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ExportStatus status;

  public static final String SERIALIZED_NAME_INCLUSIVE_START_TIME = "InclusiveStartTime";
  @SerializedName(SERIALIZED_NAME_INCLUSIVE_START_TIME)
  private OffsetDateTime inclusiveStartTime;

  public static final String SERIALIZED_NAME_EXCLUSIVE_END_TIME = "ExclusiveEndTime";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_END_TIME)
  private OffsetDateTime exclusiveEndTime;

  public static final String SERIALIZED_NAME_S3_EXPORT_CONFIGURATION = "S3ExportConfiguration";
  @SerializedName(SERIALIZED_NAME_S3_EXPORT_CONFIGURATION)
  private S3ExportConfiguration s3ExportConfiguration;

  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "OutputFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private OutputFormat outputFormat;

  public JournalS3ExportDescription() {
  }

  public JournalS3ExportDescription ledgerName(String ledgerName) {
    this.ledgerName = ledgerName;
    return this;
  }

  /**
   * Get ledgerName
   * @return ledgerName
   */
  @javax.annotation.Nonnull
  public String getLedgerName() {
    return ledgerName;
  }

  public void setLedgerName(String ledgerName) {
    this.ledgerName = ledgerName;
  }


  public JournalS3ExportDescription exportId(String exportId) {
    this.exportId = exportId;
    return this;
  }

  /**
   * Get exportId
   * @return exportId
   */
  @javax.annotation.Nonnull
  public String getExportId() {
    return exportId;
  }

  public void setExportId(String exportId) {
    this.exportId = exportId;
  }


  public JournalS3ExportDescription exportCreationTime(OffsetDateTime exportCreationTime) {
    this.exportCreationTime = exportCreationTime;
    return this;
  }

  /**
   * Get exportCreationTime
   * @return exportCreationTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getExportCreationTime() {
    return exportCreationTime;
  }

  public void setExportCreationTime(OffsetDateTime exportCreationTime) {
    this.exportCreationTime = exportCreationTime;
  }


  public JournalS3ExportDescription status(ExportStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ExportStatus getStatus() {
    return status;
  }

  public void setStatus(ExportStatus status) {
    this.status = status;
  }


  public JournalS3ExportDescription inclusiveStartTime(OffsetDateTime inclusiveStartTime) {
    this.inclusiveStartTime = inclusiveStartTime;
    return this;
  }

  /**
   * Get inclusiveStartTime
   * @return inclusiveStartTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getInclusiveStartTime() {
    return inclusiveStartTime;
  }

  public void setInclusiveStartTime(OffsetDateTime inclusiveStartTime) {
    this.inclusiveStartTime = inclusiveStartTime;
  }


  public JournalS3ExportDescription exclusiveEndTime(OffsetDateTime exclusiveEndTime) {
    this.exclusiveEndTime = exclusiveEndTime;
    return this;
  }

  /**
   * Get exclusiveEndTime
   * @return exclusiveEndTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getExclusiveEndTime() {
    return exclusiveEndTime;
  }

  public void setExclusiveEndTime(OffsetDateTime exclusiveEndTime) {
    this.exclusiveEndTime = exclusiveEndTime;
  }


  public JournalS3ExportDescription s3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
    this.s3ExportConfiguration = s3ExportConfiguration;
    return this;
  }

  /**
   * Get s3ExportConfiguration
   * @return s3ExportConfiguration
   */
  @javax.annotation.Nonnull
  public S3ExportConfiguration getS3ExportConfiguration() {
    return s3ExportConfiguration;
  }

  public void setS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
    this.s3ExportConfiguration = s3ExportConfiguration;
  }


  public JournalS3ExportDescription roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public JournalS3ExportDescription outputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Get outputFormat
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public OutputFormat getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalS3ExportDescription journalS3ExportDescription = (JournalS3ExportDescription) o;
    return Objects.equals(this.ledgerName, journalS3ExportDescription.ledgerName) &&
        Objects.equals(this.exportId, journalS3ExportDescription.exportId) &&
        Objects.equals(this.exportCreationTime, journalS3ExportDescription.exportCreationTime) &&
        Objects.equals(this.status, journalS3ExportDescription.status) &&
        Objects.equals(this.inclusiveStartTime, journalS3ExportDescription.inclusiveStartTime) &&
        Objects.equals(this.exclusiveEndTime, journalS3ExportDescription.exclusiveEndTime) &&
        Objects.equals(this.s3ExportConfiguration, journalS3ExportDescription.s3ExportConfiguration) &&
        Objects.equals(this.roleArn, journalS3ExportDescription.roleArn) &&
        Objects.equals(this.outputFormat, journalS3ExportDescription.outputFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerName, exportId, exportCreationTime, status, inclusiveStartTime, exclusiveEndTime, s3ExportConfiguration, roleArn, outputFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalS3ExportDescription {\n");
    sb.append("    ledgerName: ").append(toIndentedString(ledgerName)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
    sb.append("    exportCreationTime: ").append(toIndentedString(exportCreationTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inclusiveStartTime: ").append(toIndentedString(inclusiveStartTime)).append("\n");
    sb.append("    exclusiveEndTime: ").append(toIndentedString(exclusiveEndTime)).append("\n");
    sb.append("    s3ExportConfiguration: ").append(toIndentedString(s3ExportConfiguration)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
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
    openapiFields.add("LedgerName");
    openapiFields.add("ExportId");
    openapiFields.add("ExportCreationTime");
    openapiFields.add("Status");
    openapiFields.add("InclusiveStartTime");
    openapiFields.add("ExclusiveEndTime");
    openapiFields.add("S3ExportConfiguration");
    openapiFields.add("RoleArn");
    openapiFields.add("OutputFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LedgerName");
    openapiRequiredFields.add("ExportId");
    openapiRequiredFields.add("ExportCreationTime");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("InclusiveStartTime");
    openapiRequiredFields.add("ExclusiveEndTime");
    openapiRequiredFields.add("S3ExportConfiguration");
    openapiRequiredFields.add("RoleArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JournalS3ExportDescription
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JournalS3ExportDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JournalS3ExportDescription is not found in the empty JSON string", JournalS3ExportDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JournalS3ExportDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JournalS3ExportDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JournalS3ExportDescription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `LedgerName`
      String.validateJsonElement(jsonObj.get("LedgerName"));
      // validate the required field `ExportId`
      String.validateJsonElement(jsonObj.get("ExportId"));
      // validate the required field `ExportCreationTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("ExportCreationTime"));
      // validate the required field `Status`
      ExportStatus.validateJsonElement(jsonObj.get("Status"));
      // validate the required field `InclusiveStartTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("InclusiveStartTime"));
      // validate the required field `ExclusiveEndTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("ExclusiveEndTime"));
      // validate the required field `S3ExportConfiguration`
      S3ExportConfiguration.validateJsonElement(jsonObj.get("S3ExportConfiguration"));
      // validate the required field `RoleArn`
      String.validateJsonElement(jsonObj.get("RoleArn"));
      // validate the optional field `OutputFormat`
      if (jsonObj.get("OutputFormat") != null && !jsonObj.get("OutputFormat").isJsonNull()) {
        OutputFormat.validateJsonElement(jsonObj.get("OutputFormat"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JournalS3ExportDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JournalS3ExportDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JournalS3ExportDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JournalS3ExportDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<JournalS3ExportDescription>() {
           @Override
           public void write(JsonWriter out, JournalS3ExportDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JournalS3ExportDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JournalS3ExportDescription given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JournalS3ExportDescription
   * @throws IOException if the JSON string is invalid with respect to JournalS3ExportDescription
   */
  public static JournalS3ExportDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JournalS3ExportDescription.class);
  }

  /**
   * Convert an instance of JournalS3ExportDescription to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

