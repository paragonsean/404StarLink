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
 * Contains metadata for a replication instance task log.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReplicationInstanceTaskLog {
  public static final String SERIALIZED_NAME_REPLICATION_TASK_NAME = "ReplicationTaskName";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_NAME)
  private String replicationTaskName;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_ARN = "ReplicationTaskArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ARN)
  private String replicationTaskArn;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_TASK_LOG_SIZE = "ReplicationInstanceTaskLogSize";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_TASK_LOG_SIZE)
  private Integer replicationInstanceTaskLogSize;

  public ReplicationInstanceTaskLog() {
  }

  public ReplicationInstanceTaskLog replicationTaskName(String replicationTaskName) {
    this.replicationTaskName = replicationTaskName;
    return this;
  }

  /**
   * Get replicationTaskName
   * @return replicationTaskName
   */
  @javax.annotation.Nullable
  public String getReplicationTaskName() {
    return replicationTaskName;
  }

  public void setReplicationTaskName(String replicationTaskName) {
    this.replicationTaskName = replicationTaskName;
  }


  public ReplicationInstanceTaskLog replicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
    return this;
  }

  /**
   * Get replicationTaskArn
   * @return replicationTaskArn
   */
  @javax.annotation.Nullable
  public String getReplicationTaskArn() {
    return replicationTaskArn;
  }

  public void setReplicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
  }


  public ReplicationInstanceTaskLog replicationInstanceTaskLogSize(Integer replicationInstanceTaskLogSize) {
    this.replicationInstanceTaskLogSize = replicationInstanceTaskLogSize;
    return this;
  }

  /**
   * Get replicationInstanceTaskLogSize
   * @return replicationInstanceTaskLogSize
   */
  @javax.annotation.Nullable
  public Integer getReplicationInstanceTaskLogSize() {
    return replicationInstanceTaskLogSize;
  }

  public void setReplicationInstanceTaskLogSize(Integer replicationInstanceTaskLogSize) {
    this.replicationInstanceTaskLogSize = replicationInstanceTaskLogSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationInstanceTaskLog replicationInstanceTaskLog = (ReplicationInstanceTaskLog) o;
    return Objects.equals(this.replicationTaskName, replicationInstanceTaskLog.replicationTaskName) &&
        Objects.equals(this.replicationTaskArn, replicationInstanceTaskLog.replicationTaskArn) &&
        Objects.equals(this.replicationInstanceTaskLogSize, replicationInstanceTaskLog.replicationInstanceTaskLogSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskName, replicationTaskArn, replicationInstanceTaskLogSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationInstanceTaskLog {\n");
    sb.append("    replicationTaskName: ").append(toIndentedString(replicationTaskName)).append("\n");
    sb.append("    replicationTaskArn: ").append(toIndentedString(replicationTaskArn)).append("\n");
    sb.append("    replicationInstanceTaskLogSize: ").append(toIndentedString(replicationInstanceTaskLogSize)).append("\n");
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
    openapiFields.add("ReplicationTaskName");
    openapiFields.add("ReplicationTaskArn");
    openapiFields.add("ReplicationInstanceTaskLogSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReplicationInstanceTaskLog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReplicationInstanceTaskLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicationInstanceTaskLog is not found in the empty JSON string", ReplicationInstanceTaskLog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReplicationInstanceTaskLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReplicationInstanceTaskLog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationTaskName`
      if (jsonObj.get("ReplicationTaskName") != null && !jsonObj.get("ReplicationTaskName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskName"));
      }
      // validate the optional field `ReplicationTaskArn`
      if (jsonObj.get("ReplicationTaskArn") != null && !jsonObj.get("ReplicationTaskArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskArn"));
      }
      // validate the optional field `ReplicationInstanceTaskLogSize`
      if (jsonObj.get("ReplicationInstanceTaskLogSize") != null && !jsonObj.get("ReplicationInstanceTaskLogSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ReplicationInstanceTaskLogSize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicationInstanceTaskLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicationInstanceTaskLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicationInstanceTaskLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicationInstanceTaskLog.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicationInstanceTaskLog>() {
           @Override
           public void write(JsonWriter out, ReplicationInstanceTaskLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReplicationInstanceTaskLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReplicationInstanceTaskLog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReplicationInstanceTaskLog
   * @throws IOException if the JSON string is invalid with respect to ReplicationInstanceTaskLog
   */
  public static ReplicationInstanceTaskLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicationInstanceTaskLog.class);
  }

  /**
   * Convert an instance of ReplicationInstanceTaskLog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

