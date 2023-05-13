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
 * ReloadTablesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReloadTablesResponse {
  public static final String SERIALIZED_NAME_REPLICATION_TASK_ARN = "ReplicationTaskArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ARN)
  private String replicationTaskArn;

  public ReloadTablesResponse() {
  }

  public ReloadTablesResponse replicationTaskArn(String replicationTaskArn) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReloadTablesResponse reloadTablesResponse = (ReloadTablesResponse) o;
    return Objects.equals(this.replicationTaskArn, reloadTablesResponse.replicationTaskArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReloadTablesResponse {\n");
    sb.append("    replicationTaskArn: ").append(toIndentedString(replicationTaskArn)).append("\n");
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
    openapiFields.add("ReplicationTaskArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReloadTablesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReloadTablesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReloadTablesResponse is not found in the empty JSON string", ReloadTablesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReloadTablesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReloadTablesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationTaskArn`
      if (jsonObj.get("ReplicationTaskArn") != null && !jsonObj.get("ReplicationTaskArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReloadTablesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReloadTablesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReloadTablesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReloadTablesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReloadTablesResponse>() {
           @Override
           public void write(JsonWriter out, ReloadTablesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReloadTablesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReloadTablesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReloadTablesResponse
   * @throws IOException if the JSON string is invalid with respect to ReloadTablesResponse
   */
  public static ReloadTablesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReloadTablesResponse.class);
  }

  /**
   * Convert an instance of ReloadTablesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

