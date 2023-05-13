/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
import org.openapitools.client.model.RefreshSchemasStatusTypeValue;

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
 * DescribeRefreshSchemasStatusResponseRefreshSchemasStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeRefreshSchemasStatusResponseRefreshSchemasStatus {
  public static final String SERIALIZED_NAME_ENDPOINT_ARN = "EndpointArn";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ARN)
  private String endpointArn;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_ARN = "ReplicationInstanceArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_ARN)
  private String replicationInstanceArn;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RefreshSchemasStatusTypeValue status;

  public static final String SERIALIZED_NAME_LAST_REFRESH_DATE = "LastRefreshDate";
  @SerializedName(SERIALIZED_NAME_LAST_REFRESH_DATE)
  private OffsetDateTime lastRefreshDate;

  public static final String SERIALIZED_NAME_LAST_FAILURE_MESSAGE = "LastFailureMessage";
  @SerializedName(SERIALIZED_NAME_LAST_FAILURE_MESSAGE)
  private String lastFailureMessage;

  public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus() {
  }

  public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus endpointArn(String endpointArn) {
    this.endpointArn = endpointArn;
    return this;
  }

  /**
   * Get endpointArn
   * @return endpointArn
   */
  @javax.annotation.Nullable
  public String getEndpointArn() {
    return endpointArn;
  }

  public void setEndpointArn(String endpointArn) {
    this.endpointArn = endpointArn;
  }


  public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus replicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
    return this;
  }

  /**
   * Get replicationInstanceArn
   * @return replicationInstanceArn
   */
  @javax.annotation.Nullable
  public String getReplicationInstanceArn() {
    return replicationInstanceArn;
  }

  public void setReplicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
  }


  public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus status(RefreshSchemasStatusTypeValue status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public RefreshSchemasStatusTypeValue getStatus() {
    return status;
  }

  public void setStatus(RefreshSchemasStatusTypeValue status) {
    this.status = status;
  }


  public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus lastRefreshDate(OffsetDateTime lastRefreshDate) {
    this.lastRefreshDate = lastRefreshDate;
    return this;
  }

  /**
   * Get lastRefreshDate
   * @return lastRefreshDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastRefreshDate() {
    return lastRefreshDate;
  }

  public void setLastRefreshDate(OffsetDateTime lastRefreshDate) {
    this.lastRefreshDate = lastRefreshDate;
  }


  public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus lastFailureMessage(String lastFailureMessage) {
    this.lastFailureMessage = lastFailureMessage;
    return this;
  }

  /**
   * Get lastFailureMessage
   * @return lastFailureMessage
   */
  @javax.annotation.Nullable
  public String getLastFailureMessage() {
    return lastFailureMessage;
  }

  public void setLastFailureMessage(String lastFailureMessage) {
    this.lastFailureMessage = lastFailureMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRefreshSchemasStatusResponseRefreshSchemasStatus describeRefreshSchemasStatusResponseRefreshSchemasStatus = (DescribeRefreshSchemasStatusResponseRefreshSchemasStatus) o;
    return Objects.equals(this.endpointArn, describeRefreshSchemasStatusResponseRefreshSchemasStatus.endpointArn) &&
        Objects.equals(this.replicationInstanceArn, describeRefreshSchemasStatusResponseRefreshSchemasStatus.replicationInstanceArn) &&
        Objects.equals(this.status, describeRefreshSchemasStatusResponseRefreshSchemasStatus.status) &&
        Objects.equals(this.lastRefreshDate, describeRefreshSchemasStatusResponseRefreshSchemasStatus.lastRefreshDate) &&
        Objects.equals(this.lastFailureMessage, describeRefreshSchemasStatusResponseRefreshSchemasStatus.lastFailureMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointArn, replicationInstanceArn, status, lastRefreshDate, lastFailureMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRefreshSchemasStatusResponseRefreshSchemasStatus {\n");
    sb.append("    endpointArn: ").append(toIndentedString(endpointArn)).append("\n");
    sb.append("    replicationInstanceArn: ").append(toIndentedString(replicationInstanceArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastRefreshDate: ").append(toIndentedString(lastRefreshDate)).append("\n");
    sb.append("    lastFailureMessage: ").append(toIndentedString(lastFailureMessage)).append("\n");
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
    openapiFields.add("EndpointArn");
    openapiFields.add("ReplicationInstanceArn");
    openapiFields.add("Status");
    openapiFields.add("LastRefreshDate");
    openapiFields.add("LastFailureMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeRefreshSchemasStatusResponseRefreshSchemasStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeRefreshSchemasStatusResponseRefreshSchemasStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeRefreshSchemasStatusResponseRefreshSchemasStatus is not found in the empty JSON string", DescribeRefreshSchemasStatusResponseRefreshSchemasStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeRefreshSchemasStatusResponseRefreshSchemasStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeRefreshSchemasStatusResponseRefreshSchemasStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EndpointArn`
      if (jsonObj.get("EndpointArn") != null && !jsonObj.get("EndpointArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EndpointArn"));
      }
      // validate the optional field `ReplicationInstanceArn`
      if (jsonObj.get("ReplicationInstanceArn") != null && !jsonObj.get("ReplicationInstanceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationInstanceArn"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        RefreshSchemasStatusTypeValue.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `LastRefreshDate`
      if (jsonObj.get("LastRefreshDate") != null && !jsonObj.get("LastRefreshDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("LastRefreshDate"));
      }
      // validate the optional field `LastFailureMessage`
      if (jsonObj.get("LastFailureMessage") != null && !jsonObj.get("LastFailureMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastFailureMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeRefreshSchemasStatusResponseRefreshSchemasStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeRefreshSchemasStatusResponseRefreshSchemasStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeRefreshSchemasStatusResponseRefreshSchemasStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeRefreshSchemasStatusResponseRefreshSchemasStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeRefreshSchemasStatusResponseRefreshSchemasStatus>() {
           @Override
           public void write(JsonWriter out, DescribeRefreshSchemasStatusResponseRefreshSchemasStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeRefreshSchemasStatusResponseRefreshSchemasStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeRefreshSchemasStatusResponseRefreshSchemasStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeRefreshSchemasStatusResponseRefreshSchemasStatus
   * @throws IOException if the JSON string is invalid with respect to DescribeRefreshSchemasStatusResponseRefreshSchemasStatus
   */
  public static DescribeRefreshSchemasStatusResponseRefreshSchemasStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeRefreshSchemasStatusResponseRefreshSchemasStatus.class);
  }

  /**
   * Convert an instance of DescribeRefreshSchemasStatusResponseRefreshSchemasStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

