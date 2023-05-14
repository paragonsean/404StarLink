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
 * Describes a schema in a Fleet Advisor collector inventory.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SchemaShortInfoResponse {
  public static final String SERIALIZED_NAME_SCHEMA_ID = "SchemaId";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_SCHEMA_NAME = "SchemaName";
  @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
  private String schemaName;

  public static final String SERIALIZED_NAME_DATABASE_ID = "DatabaseId";
  @SerializedName(SERIALIZED_NAME_DATABASE_ID)
  private String databaseId;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DATABASE_IP_ADDRESS = "DatabaseIpAddress";
  @SerializedName(SERIALIZED_NAME_DATABASE_IP_ADDRESS)
  private String databaseIpAddress;

  public SchemaShortInfoResponse() {
  }

  public SchemaShortInfoResponse schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * Get schemaId
   * @return schemaId
   */
  @javax.annotation.Nullable
  public String getSchemaId() {
    return schemaId;
  }

  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public SchemaShortInfoResponse schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * Get schemaName
   * @return schemaName
   */
  @javax.annotation.Nullable
  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public SchemaShortInfoResponse databaseId(String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Get databaseId
   * @return databaseId
   */
  @javax.annotation.Nullable
  public String getDatabaseId() {
    return databaseId;
  }

  public void setDatabaseId(String databaseId) {
    this.databaseId = databaseId;
  }


  public SchemaShortInfoResponse databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * Get databaseName
   * @return databaseName
   */
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public SchemaShortInfoResponse databaseIpAddress(String databaseIpAddress) {
    this.databaseIpAddress = databaseIpAddress;
    return this;
  }

  /**
   * Get databaseIpAddress
   * @return databaseIpAddress
   */
  @javax.annotation.Nullable
  public String getDatabaseIpAddress() {
    return databaseIpAddress;
  }

  public void setDatabaseIpAddress(String databaseIpAddress) {
    this.databaseIpAddress = databaseIpAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaShortInfoResponse schemaShortInfoResponse = (SchemaShortInfoResponse) o;
    return Objects.equals(this.schemaId, schemaShortInfoResponse.schemaId) &&
        Objects.equals(this.schemaName, schemaShortInfoResponse.schemaName) &&
        Objects.equals(this.databaseId, schemaShortInfoResponse.databaseId) &&
        Objects.equals(this.databaseName, schemaShortInfoResponse.databaseName) &&
        Objects.equals(this.databaseIpAddress, schemaShortInfoResponse.databaseIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, schemaName, databaseId, databaseName, databaseIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaShortInfoResponse {\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    databaseIpAddress: ").append(toIndentedString(databaseIpAddress)).append("\n");
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
    openapiFields.add("SchemaId");
    openapiFields.add("SchemaName");
    openapiFields.add("DatabaseId");
    openapiFields.add("DatabaseName");
    openapiFields.add("DatabaseIpAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SchemaShortInfoResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SchemaShortInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SchemaShortInfoResponse is not found in the empty JSON string", SchemaShortInfoResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SchemaShortInfoResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SchemaShortInfoResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `SchemaId`
      if (jsonObj.get("SchemaId") != null && !jsonObj.get("SchemaId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SchemaId"));
      }
      // validate the optional field `SchemaName`
      if (jsonObj.get("SchemaName") != null && !jsonObj.get("SchemaName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SchemaName"));
      }
      // validate the optional field `DatabaseId`
      if (jsonObj.get("DatabaseId") != null && !jsonObj.get("DatabaseId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseId"));
      }
      // validate the optional field `DatabaseName`
      if (jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseName"));
      }
      // validate the optional field `DatabaseIpAddress`
      if (jsonObj.get("DatabaseIpAddress") != null && !jsonObj.get("DatabaseIpAddress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseIpAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SchemaShortInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SchemaShortInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SchemaShortInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SchemaShortInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SchemaShortInfoResponse>() {
           @Override
           public void write(JsonWriter out, SchemaShortInfoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SchemaShortInfoResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SchemaShortInfoResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SchemaShortInfoResponse
   * @throws IOException if the JSON string is invalid with respect to SchemaShortInfoResponse
   */
  public static SchemaShortInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SchemaShortInfoResponse.class);
  }

  /**
   * Convert an instance of SchemaShortInfoResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

