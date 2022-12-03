/*
 * AWS OpsWorks
 * <fullname>AWS OpsWorks</fullname> <p>Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples for AWS OpsWorks Stacks actions and data types, including common parameters and error codes. </p> <p>AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For information about this product, go to the <a href=\"http://aws.amazon.com/opsworks/\">AWS OpsWorks</a> details page. </p> <p> <b>SDKs and CLI</b> </p> <p>The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using one of the AWS SDKs to implement applications in your preferred language. For more information, see:</p> <ul> <li> <p> <a href=\"https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html\">AWS CLI</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html\">AWS SDK for Java</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm\">AWS SDK for .NET</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html\">AWS SDK for PHP 2</a> </p> </li> <li> <p> <a href=\"http://docs.aws.amazon.com/sdkforruby/api/\">AWS SDK for Ruby</a> </p> </li> <li> <p> <a href=\"http://aws.amazon.com/documentation/sdkforjavascript/\">AWS SDK for Node.js</a> </p> </li> <li> <p> <a href=\"http://docs.pythonboto.org/en/latest/ref/opsworks.html\">AWS SDK for Python(Boto)</a> </p> </li> </ul> <p> <b>Endpoints</b> </p> <p>AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks can only be accessed or managed within the endpoint in which they are created.</p> <ul> <li> <p>opsworks.us-east-1.amazonaws.com</p> </li> <li> <p>opsworks.us-east-2.amazonaws.com</p> </li> <li> <p>opsworks.us-west-1.amazonaws.com</p> </li> <li> <p>opsworks.us-west-2.amazonaws.com</p> </li> <li> <p>opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)</p> </li> <li> <p>opsworks.eu-west-1.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-2.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-3.amazonaws.com</p> </li> <li> <p>opsworks.eu-central-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-2.amazonaws.com</p> </li> <li> <p>opsworks.ap-south-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-2.amazonaws.com</p> </li> <li> <p>opsworks.sa-east-1.amazonaws.com</p> </li> </ul> <p> <b>Chef Versions</b> </p> <p>When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a href=\"https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html\">Chef Versions</a>.</p> <note> <p>You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to Chef 12 as soon as possible.</p> </note>
 *
 * The version of the OpenAPI document: 2013-02-18
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
import org.openapitools.client.model.CloudWatchLogsEncoding;
import org.openapitools.client.model.CloudWatchLogsInitialPosition;
import org.openapitools.client.model.CloudWatchLogsTimeZone;

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
 * Describes the Amazon CloudWatch logs configuration for a layer. For detailed information about members of this data type, see the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html\&quot;&gt;CloudWatch Logs Agent Reference&lt;/a&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:31.585098-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloudWatchLogsLogStream {
  public static final String SERIALIZED_NAME_LOG_GROUP_NAME = "LogGroupName";
  @SerializedName(SERIALIZED_NAME_LOG_GROUP_NAME)
  private String logGroupName;

  public static final String SERIALIZED_NAME_DATETIME_FORMAT = "DatetimeFormat";
  @SerializedName(SERIALIZED_NAME_DATETIME_FORMAT)
  private String datetimeFormat;

  public static final String SERIALIZED_NAME_TIME_ZONE = "TimeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private CloudWatchLogsTimeZone timeZone;

  public static final String SERIALIZED_NAME_FILE = "File";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_FILE_FINGERPRINT_LINES = "FileFingerprintLines";
  @SerializedName(SERIALIZED_NAME_FILE_FINGERPRINT_LINES)
  private String fileFingerprintLines;

  public static final String SERIALIZED_NAME_MULTI_LINE_START_PATTERN = "MultiLineStartPattern";
  @SerializedName(SERIALIZED_NAME_MULTI_LINE_START_PATTERN)
  private String multiLineStartPattern;

  public static final String SERIALIZED_NAME_INITIAL_POSITION = "InitialPosition";
  @SerializedName(SERIALIZED_NAME_INITIAL_POSITION)
  private CloudWatchLogsInitialPosition initialPosition;

  public static final String SERIALIZED_NAME_ENCODING = "Encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private CloudWatchLogsEncoding encoding;

  public static final String SERIALIZED_NAME_BUFFER_DURATION = "BufferDuration";
  @SerializedName(SERIALIZED_NAME_BUFFER_DURATION)
  private Integer bufferDuration;

  public static final String SERIALIZED_NAME_BATCH_COUNT = "BatchCount";
  @SerializedName(SERIALIZED_NAME_BATCH_COUNT)
  private Integer batchCount;

  public static final String SERIALIZED_NAME_BATCH_SIZE = "BatchSize";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private Integer batchSize;

  public CloudWatchLogsLogStream() {
  }

  public CloudWatchLogsLogStream logGroupName(String logGroupName) {
    this.logGroupName = logGroupName;
    return this;
  }

  /**
   * Get logGroupName
   * @return logGroupName
   */
  @javax.annotation.Nullable
  public String getLogGroupName() {
    return logGroupName;
  }

  public void setLogGroupName(String logGroupName) {
    this.logGroupName = logGroupName;
  }


  public CloudWatchLogsLogStream datetimeFormat(String datetimeFormat) {
    this.datetimeFormat = datetimeFormat;
    return this;
  }

  /**
   * Get datetimeFormat
   * @return datetimeFormat
   */
  @javax.annotation.Nullable
  public String getDatetimeFormat() {
    return datetimeFormat;
  }

  public void setDatetimeFormat(String datetimeFormat) {
    this.datetimeFormat = datetimeFormat;
  }


  public CloudWatchLogsLogStream timeZone(CloudWatchLogsTimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  @javax.annotation.Nullable
  public CloudWatchLogsTimeZone getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(CloudWatchLogsTimeZone timeZone) {
    this.timeZone = timeZone;
  }


  public CloudWatchLogsLogStream _file(String _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nullable
  public String getFile() {
    return _file;
  }

  public void setFile(String _file) {
    this._file = _file;
  }


  public CloudWatchLogsLogStream fileFingerprintLines(String fileFingerprintLines) {
    this.fileFingerprintLines = fileFingerprintLines;
    return this;
  }

  /**
   * Get fileFingerprintLines
   * @return fileFingerprintLines
   */
  @javax.annotation.Nullable
  public String getFileFingerprintLines() {
    return fileFingerprintLines;
  }

  public void setFileFingerprintLines(String fileFingerprintLines) {
    this.fileFingerprintLines = fileFingerprintLines;
  }


  public CloudWatchLogsLogStream multiLineStartPattern(String multiLineStartPattern) {
    this.multiLineStartPattern = multiLineStartPattern;
    return this;
  }

  /**
   * Get multiLineStartPattern
   * @return multiLineStartPattern
   */
  @javax.annotation.Nullable
  public String getMultiLineStartPattern() {
    return multiLineStartPattern;
  }

  public void setMultiLineStartPattern(String multiLineStartPattern) {
    this.multiLineStartPattern = multiLineStartPattern;
  }


  public CloudWatchLogsLogStream initialPosition(CloudWatchLogsInitialPosition initialPosition) {
    this.initialPosition = initialPosition;
    return this;
  }

  /**
   * Get initialPosition
   * @return initialPosition
   */
  @javax.annotation.Nullable
  public CloudWatchLogsInitialPosition getInitialPosition() {
    return initialPosition;
  }

  public void setInitialPosition(CloudWatchLogsInitialPosition initialPosition) {
    this.initialPosition = initialPosition;
  }


  public CloudWatchLogsLogStream encoding(CloudWatchLogsEncoding encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
   */
  @javax.annotation.Nullable
  public CloudWatchLogsEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(CloudWatchLogsEncoding encoding) {
    this.encoding = encoding;
  }


  public CloudWatchLogsLogStream bufferDuration(Integer bufferDuration) {
    this.bufferDuration = bufferDuration;
    return this;
  }

  /**
   * Get bufferDuration
   * @return bufferDuration
   */
  @javax.annotation.Nullable
  public Integer getBufferDuration() {
    return bufferDuration;
  }

  public void setBufferDuration(Integer bufferDuration) {
    this.bufferDuration = bufferDuration;
  }


  public CloudWatchLogsLogStream batchCount(Integer batchCount) {
    this.batchCount = batchCount;
    return this;
  }

  /**
   * Get batchCount
   * @return batchCount
   */
  @javax.annotation.Nullable
  public Integer getBatchCount() {
    return batchCount;
  }

  public void setBatchCount(Integer batchCount) {
    this.batchCount = batchCount;
  }


  public CloudWatchLogsLogStream batchSize(Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
   */
  @javax.annotation.Nullable
  public Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWatchLogsLogStream cloudWatchLogsLogStream = (CloudWatchLogsLogStream) o;
    return Objects.equals(this.logGroupName, cloudWatchLogsLogStream.logGroupName) &&
        Objects.equals(this.datetimeFormat, cloudWatchLogsLogStream.datetimeFormat) &&
        Objects.equals(this.timeZone, cloudWatchLogsLogStream.timeZone) &&
        Objects.equals(this._file, cloudWatchLogsLogStream._file) &&
        Objects.equals(this.fileFingerprintLines, cloudWatchLogsLogStream.fileFingerprintLines) &&
        Objects.equals(this.multiLineStartPattern, cloudWatchLogsLogStream.multiLineStartPattern) &&
        Objects.equals(this.initialPosition, cloudWatchLogsLogStream.initialPosition) &&
        Objects.equals(this.encoding, cloudWatchLogsLogStream.encoding) &&
        Objects.equals(this.bufferDuration, cloudWatchLogsLogStream.bufferDuration) &&
        Objects.equals(this.batchCount, cloudWatchLogsLogStream.batchCount) &&
        Objects.equals(this.batchSize, cloudWatchLogsLogStream.batchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logGroupName, datetimeFormat, timeZone, _file, fileFingerprintLines, multiLineStartPattern, initialPosition, encoding, bufferDuration, batchCount, batchSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWatchLogsLogStream {\n");
    sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
    sb.append("    datetimeFormat: ").append(toIndentedString(datetimeFormat)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    fileFingerprintLines: ").append(toIndentedString(fileFingerprintLines)).append("\n");
    sb.append("    multiLineStartPattern: ").append(toIndentedString(multiLineStartPattern)).append("\n");
    sb.append("    initialPosition: ").append(toIndentedString(initialPosition)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    bufferDuration: ").append(toIndentedString(bufferDuration)).append("\n");
    sb.append("    batchCount: ").append(toIndentedString(batchCount)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
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
    openapiFields.add("LogGroupName");
    openapiFields.add("DatetimeFormat");
    openapiFields.add("TimeZone");
    openapiFields.add("File");
    openapiFields.add("FileFingerprintLines");
    openapiFields.add("MultiLineStartPattern");
    openapiFields.add("InitialPosition");
    openapiFields.add("Encoding");
    openapiFields.add("BufferDuration");
    openapiFields.add("BatchCount");
    openapiFields.add("BatchSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudWatchLogsLogStream
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudWatchLogsLogStream.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudWatchLogsLogStream is not found in the empty JSON string", CloudWatchLogsLogStream.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudWatchLogsLogStream.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudWatchLogsLogStream` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LogGroupName`
      if (jsonObj.get("LogGroupName") != null && !jsonObj.get("LogGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LogGroupName"));
      }
      // validate the optional field `DatetimeFormat`
      if (jsonObj.get("DatetimeFormat") != null && !jsonObj.get("DatetimeFormat").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatetimeFormat"));
      }
      // validate the optional field `TimeZone`
      if (jsonObj.get("TimeZone") != null && !jsonObj.get("TimeZone").isJsonNull()) {
        CloudWatchLogsTimeZone.validateJsonElement(jsonObj.get("TimeZone"));
      }
      // validate the optional field `File`
      if (jsonObj.get("File") != null && !jsonObj.get("File").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("File"));
      }
      // validate the optional field `FileFingerprintLines`
      if (jsonObj.get("FileFingerprintLines") != null && !jsonObj.get("FileFingerprintLines").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FileFingerprintLines"));
      }
      // validate the optional field `MultiLineStartPattern`
      if (jsonObj.get("MultiLineStartPattern") != null && !jsonObj.get("MultiLineStartPattern").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MultiLineStartPattern"));
      }
      // validate the optional field `InitialPosition`
      if (jsonObj.get("InitialPosition") != null && !jsonObj.get("InitialPosition").isJsonNull()) {
        CloudWatchLogsInitialPosition.validateJsonElement(jsonObj.get("InitialPosition"));
      }
      // validate the optional field `Encoding`
      if (jsonObj.get("Encoding") != null && !jsonObj.get("Encoding").isJsonNull()) {
        CloudWatchLogsEncoding.validateJsonElement(jsonObj.get("Encoding"));
      }
      // validate the optional field `BufferDuration`
      if (jsonObj.get("BufferDuration") != null && !jsonObj.get("BufferDuration").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("BufferDuration"));
      }
      // validate the optional field `BatchCount`
      if (jsonObj.get("BatchCount") != null && !jsonObj.get("BatchCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("BatchCount"));
      }
      // validate the optional field `BatchSize`
      if (jsonObj.get("BatchSize") != null && !jsonObj.get("BatchSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("BatchSize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudWatchLogsLogStream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudWatchLogsLogStream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudWatchLogsLogStream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudWatchLogsLogStream.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudWatchLogsLogStream>() {
           @Override
           public void write(JsonWriter out, CloudWatchLogsLogStream value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudWatchLogsLogStream read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudWatchLogsLogStream given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudWatchLogsLogStream
   * @throws IOException if the JSON string is invalid with respect to CloudWatchLogsLogStream
   */
  public static CloudWatchLogsLogStream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudWatchLogsLogStream.class);
  }

  /**
   * Convert an instance of CloudWatchLogsLogStream to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

