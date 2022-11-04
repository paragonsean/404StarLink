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
import org.openapitools.client.model.ExportJournalToS3RequestS3ExportConfiguration;

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
 * ExportJournalToS3Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:48.114688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ExportJournalToS3Request {
  public static final String SERIALIZED_NAME_INCLUSIVE_START_TIME = "InclusiveStartTime";
  @SerializedName(SERIALIZED_NAME_INCLUSIVE_START_TIME)
  private OffsetDateTime inclusiveStartTime;

  public static final String SERIALIZED_NAME_EXCLUSIVE_END_TIME = "ExclusiveEndTime";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_END_TIME)
  private OffsetDateTime exclusiveEndTime;

  public static final String SERIALIZED_NAME_S3_EXPORT_CONFIGURATION = "S3ExportConfiguration";
  @SerializedName(SERIALIZED_NAME_S3_EXPORT_CONFIGURATION)
  private ExportJournalToS3RequestS3ExportConfiguration s3ExportConfiguration;

  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  /**
   * The output format of your exported journal data. If this parameter is not specified, the exported data defaults to &lt;code&gt;ION_TEXT&lt;/code&gt; format.
   */
  @JsonAdapter(OutputFormatEnum.Adapter.class)
  public enum OutputFormatEnum {
    ION_BINARY("ION_BINARY"),
    
    ION_TEXT("ION_TEXT"),
    
    JSON("JSON");

    private String value;

    OutputFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutputFormatEnum fromValue(String value) {
      for (OutputFormatEnum b : OutputFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutputFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutputFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutputFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutputFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OutputFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "OutputFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private OutputFormatEnum outputFormat;

  public ExportJournalToS3Request() {
  }

  public ExportJournalToS3Request inclusiveStartTime(OffsetDateTime inclusiveStartTime) {
    this.inclusiveStartTime = inclusiveStartTime;
    return this;
  }

  /**
   * &lt;p&gt;The inclusive start date and time for the range of journal contents to export.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;InclusiveStartTime&lt;/code&gt; must be in &lt;code&gt;ISO 8601&lt;/code&gt; date and time format and in Universal Coordinated Time (UTC). For example: &lt;code&gt;2019-06-13T21:36:34Z&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;InclusiveStartTime&lt;/code&gt; must be before &lt;code&gt;ExclusiveEndTime&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you provide an &lt;code&gt;InclusiveStartTime&lt;/code&gt; that is before the ledger&#39;s &lt;code&gt;CreationDateTime&lt;/code&gt;, Amazon QLDB defaults it to the ledger&#39;s &lt;code&gt;CreationDateTime&lt;/code&gt;.&lt;/p&gt;
   * @return inclusiveStartTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getInclusiveStartTime() {
    return inclusiveStartTime;
  }

  public void setInclusiveStartTime(OffsetDateTime inclusiveStartTime) {
    this.inclusiveStartTime = inclusiveStartTime;
  }


  public ExportJournalToS3Request exclusiveEndTime(OffsetDateTime exclusiveEndTime) {
    this.exclusiveEndTime = exclusiveEndTime;
    return this;
  }

  /**
   * &lt;p&gt;The exclusive end date and time for the range of journal contents to export.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;ExclusiveEndTime&lt;/code&gt; must be in &lt;code&gt;ISO 8601&lt;/code&gt; date and time format and in Universal Coordinated Time (UTC). For example: &lt;code&gt;2019-06-13T21:36:34Z&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;ExclusiveEndTime&lt;/code&gt; must be less than or equal to the current UTC date and time.&lt;/p&gt;
   * @return exclusiveEndTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getExclusiveEndTime() {
    return exclusiveEndTime;
  }

  public void setExclusiveEndTime(OffsetDateTime exclusiveEndTime) {
    this.exclusiveEndTime = exclusiveEndTime;
  }


  public ExportJournalToS3Request s3ExportConfiguration(ExportJournalToS3RequestS3ExportConfiguration s3ExportConfiguration) {
    this.s3ExportConfiguration = s3ExportConfiguration;
    return this;
  }

  /**
   * Get s3ExportConfiguration
   * @return s3ExportConfiguration
   */
  @javax.annotation.Nonnull
  public ExportJournalToS3RequestS3ExportConfiguration getS3ExportConfiguration() {
    return s3ExportConfiguration;
  }

  public void setS3ExportConfiguration(ExportJournalToS3RequestS3ExportConfiguration s3ExportConfiguration) {
    this.s3ExportConfiguration = s3ExportConfiguration;
  }


  public ExportJournalToS3Request roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * &lt;p&gt;The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;(Optional) Use your customer managed key in Key Management Service (KMS) for server-side encryption of your exported data.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To pass a role to QLDB when requesting a journal export, you must have permissions to perform the &lt;code&gt;iam:PassRole&lt;/code&gt; action on the IAM role resource. This is required for all journal export requests.&lt;/p&gt;
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public ExportJournalToS3Request outputFormat(OutputFormatEnum outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * The output format of your exported journal data. If this parameter is not specified, the exported data defaults to &lt;code&gt;ION_TEXT&lt;/code&gt; format.
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public OutputFormatEnum getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(OutputFormatEnum outputFormat) {
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
    ExportJournalToS3Request exportJournalToS3Request = (ExportJournalToS3Request) o;
    return Objects.equals(this.inclusiveStartTime, exportJournalToS3Request.inclusiveStartTime) &&
        Objects.equals(this.exclusiveEndTime, exportJournalToS3Request.exclusiveEndTime) &&
        Objects.equals(this.s3ExportConfiguration, exportJournalToS3Request.s3ExportConfiguration) &&
        Objects.equals(this.roleArn, exportJournalToS3Request.roleArn) &&
        Objects.equals(this.outputFormat, exportJournalToS3Request.outputFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusiveStartTime, exclusiveEndTime, s3ExportConfiguration, roleArn, outputFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportJournalToS3Request {\n");
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
    openapiFields.add("InclusiveStartTime");
    openapiFields.add("ExclusiveEndTime");
    openapiFields.add("S3ExportConfiguration");
    openapiFields.add("RoleArn");
    openapiFields.add("OutputFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("InclusiveStartTime");
    openapiRequiredFields.add("ExclusiveEndTime");
    openapiRequiredFields.add("S3ExportConfiguration");
    openapiRequiredFields.add("RoleArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportJournalToS3Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportJournalToS3Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportJournalToS3Request is not found in the empty JSON string", ExportJournalToS3Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportJournalToS3Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportJournalToS3Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportJournalToS3Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `S3ExportConfiguration`
      ExportJournalToS3RequestS3ExportConfiguration.validateJsonElement(jsonObj.get("S3ExportConfiguration"));
      if (!jsonObj.get("RoleArn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RoleArn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RoleArn").toString()));
      }
      if ((jsonObj.get("OutputFormat") != null && !jsonObj.get("OutputFormat").isJsonNull()) && !jsonObj.get("OutputFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OutputFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OutputFormat").toString()));
      }
      // validate the optional field `OutputFormat`
      if (jsonObj.get("OutputFormat") != null && !jsonObj.get("OutputFormat").isJsonNull()) {
        OutputFormatEnum.validateJsonElement(jsonObj.get("OutputFormat"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportJournalToS3Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportJournalToS3Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportJournalToS3Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportJournalToS3Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportJournalToS3Request>() {
           @Override
           public void write(JsonWriter out, ExportJournalToS3Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportJournalToS3Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExportJournalToS3Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportJournalToS3Request
   * @throws IOException if the JSON string is invalid with respect to ExportJournalToS3Request
   */
  public static ExportJournalToS3Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportJournalToS3Request.class);
  }

  /**
   * Convert an instance of ExportJournalToS3Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

