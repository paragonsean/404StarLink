/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
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
import org.openapitools.client.model.CloudStorageSink;
import org.openapitools.client.model.ExportOptions;
import org.openapitools.client.model.ExportStats;
import org.openapitools.client.model.Query;
import org.openapitools.client.model.UserInfo;

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
 * An export. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Export {
  public static final String SERIALIZED_NAME_CLOUD_STORAGE_SINK = "cloudStorageSink";
  @SerializedName(SERIALIZED_NAME_CLOUD_STORAGE_SINK)
  private CloudStorageSink cloudStorageSink;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_EXPORT_OPTIONS = "exportOptions";
  @SerializedName(SERIALIZED_NAME_EXPORT_OPTIONS)
  private ExportOptions exportOptions;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MATTER_ID = "matterId";
  @SerializedName(SERIALIZED_NAME_MATTER_ID)
  private String matterId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Query query;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  private UserInfo requester;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private ExportStats stats;

  /**
   * Output only. The status of the export.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    EXPORT_STATUS_UNSPECIFIED("EXPORT_STATUS_UNSPECIFIED"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    IN_PROGRESS("IN_PROGRESS");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public Export() {
  }

  public Export cloudStorageSink(CloudStorageSink cloudStorageSink) {
    this.cloudStorageSink = cloudStorageSink;
    return this;
  }

  /**
   * Get cloudStorageSink
   * @return cloudStorageSink
   */
  @javax.annotation.Nullable
  public CloudStorageSink getCloudStorageSink() {
    return cloudStorageSink;
  }

  public void setCloudStorageSink(CloudStorageSink cloudStorageSink) {
    this.cloudStorageSink = cloudStorageSink;
  }


  public Export createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time when the export was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public Export exportOptions(ExportOptions exportOptions) {
    this.exportOptions = exportOptions;
    return this;
  }

  /**
   * Get exportOptions
   * @return exportOptions
   */
  @javax.annotation.Nullable
  public ExportOptions getExportOptions() {
    return exportOptions;
  }

  public void setExportOptions(ExportOptions exportOptions) {
    this.exportOptions = exportOptions;
  }


  public Export id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. The generated export ID.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Export matterId(String matterId) {
    this.matterId = matterId;
    return this;
  }

  /**
   * Output only. The matter ID.
   * @return matterId
   */
  @javax.annotation.Nullable
  public String getMatterId() {
    return matterId;
  }

  public void setMatterId(String matterId) {
    this.matterId = matterId;
  }


  public Export name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The export name. Don&#39;t use special characters (~!$&#39;(),;@:/?) in the name, they can prevent you from downloading exports.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Export query(Query query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public Query getQuery() {
    return query;
  }

  public void setQuery(Query query) {
    this.query = query;
  }


  public Export requester(UserInfo requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Get requester
   * @return requester
   */
  @javax.annotation.Nullable
  public UserInfo getRequester() {
    return requester;
  }

  public void setRequester(UserInfo requester) {
    this.requester = requester;
  }


  public Export stats(ExportStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
   */
  @javax.annotation.Nullable
  public ExportStats getStats() {
    return stats;
  }

  public void setStats(ExportStats stats) {
    this.stats = stats;
  }


  public Export status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. The status of the export.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Export export = (Export) o;
    return Objects.equals(this.cloudStorageSink, export.cloudStorageSink) &&
        Objects.equals(this.createTime, export.createTime) &&
        Objects.equals(this.exportOptions, export.exportOptions) &&
        Objects.equals(this.id, export.id) &&
        Objects.equals(this.matterId, export.matterId) &&
        Objects.equals(this.name, export.name) &&
        Objects.equals(this.query, export.query) &&
        Objects.equals(this.requester, export.requester) &&
        Objects.equals(this.stats, export.stats) &&
        Objects.equals(this.status, export.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudStorageSink, createTime, exportOptions, id, matterId, name, query, requester, stats, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Export {\n");
    sb.append("    cloudStorageSink: ").append(toIndentedString(cloudStorageSink)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    exportOptions: ").append(toIndentedString(exportOptions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matterId: ").append(toIndentedString(matterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("cloudStorageSink");
    openapiFields.add("createTime");
    openapiFields.add("exportOptions");
    openapiFields.add("id");
    openapiFields.add("matterId");
    openapiFields.add("name");
    openapiFields.add("query");
    openapiFields.add("requester");
    openapiFields.add("stats");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Export
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Export.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Export is not found in the empty JSON string", Export.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Export.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Export` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cloudStorageSink`
      if (jsonObj.get("cloudStorageSink") != null && !jsonObj.get("cloudStorageSink").isJsonNull()) {
        CloudStorageSink.validateJsonElement(jsonObj.get("cloudStorageSink"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      // validate the optional field `exportOptions`
      if (jsonObj.get("exportOptions") != null && !jsonObj.get("exportOptions").isJsonNull()) {
        ExportOptions.validateJsonElement(jsonObj.get("exportOptions"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("matterId") != null && !jsonObj.get("matterId").isJsonNull()) && !jsonObj.get("matterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matterId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `query`
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) {
        Query.validateJsonElement(jsonObj.get("query"));
      }
      // validate the optional field `requester`
      if (jsonObj.get("requester") != null && !jsonObj.get("requester").isJsonNull()) {
        UserInfo.validateJsonElement(jsonObj.get("requester"));
      }
      // validate the optional field `stats`
      if (jsonObj.get("stats") != null && !jsonObj.get("stats").isJsonNull()) {
        ExportStats.validateJsonElement(jsonObj.get("stats"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Export.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Export' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Export> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Export.class));

       return (TypeAdapter<T>) new TypeAdapter<Export>() {
           @Override
           public void write(JsonWriter out, Export value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Export read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Export given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Export
   * @throws IOException if the JSON string is invalid with respect to Export
   */
  public static Export fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Export.class);
  }

  /**
   * Convert an instance of Export to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

