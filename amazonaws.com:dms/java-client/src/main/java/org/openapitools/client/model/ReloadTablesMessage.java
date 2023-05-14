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
import java.util.List;
import org.openapitools.client.model.ReloadOptionValue;

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
 * ReloadTablesMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReloadTablesMessage {
  public static final String SERIALIZED_NAME_REPLICATION_TASK_ARN = "ReplicationTaskArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ARN)
  private String replicationTaskArn;

  public static final String SERIALIZED_NAME_TABLES_TO_RELOAD = "TablesToReload";
  @SerializedName(SERIALIZED_NAME_TABLES_TO_RELOAD)
  private List tablesToReload;

  public static final String SERIALIZED_NAME_RELOAD_OPTION = "ReloadOption";
  @SerializedName(SERIALIZED_NAME_RELOAD_OPTION)
  private ReloadOptionValue reloadOption;

  public ReloadTablesMessage() {
  }

  public ReloadTablesMessage replicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
    return this;
  }

  /**
   * Get replicationTaskArn
   * @return replicationTaskArn
   */
  @javax.annotation.Nonnull
  public String getReplicationTaskArn() {
    return replicationTaskArn;
  }

  public void setReplicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
  }


  public ReloadTablesMessage tablesToReload(List tablesToReload) {
    this.tablesToReload = tablesToReload;
    return this;
  }

  /**
   * Get tablesToReload
   * @return tablesToReload
   */
  @javax.annotation.Nonnull
  public List getTablesToReload() {
    return tablesToReload;
  }

  public void setTablesToReload(List tablesToReload) {
    this.tablesToReload = tablesToReload;
  }


  public ReloadTablesMessage reloadOption(ReloadOptionValue reloadOption) {
    this.reloadOption = reloadOption;
    return this;
  }

  /**
   * Get reloadOption
   * @return reloadOption
   */
  @javax.annotation.Nullable
  public ReloadOptionValue getReloadOption() {
    return reloadOption;
  }

  public void setReloadOption(ReloadOptionValue reloadOption) {
    this.reloadOption = reloadOption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReloadTablesMessage reloadTablesMessage = (ReloadTablesMessage) o;
    return Objects.equals(this.replicationTaskArn, reloadTablesMessage.replicationTaskArn) &&
        Objects.equals(this.tablesToReload, reloadTablesMessage.tablesToReload) &&
        Objects.equals(this.reloadOption, reloadTablesMessage.reloadOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskArn, tablesToReload, reloadOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReloadTablesMessage {\n");
    sb.append("    replicationTaskArn: ").append(toIndentedString(replicationTaskArn)).append("\n");
    sb.append("    tablesToReload: ").append(toIndentedString(tablesToReload)).append("\n");
    sb.append("    reloadOption: ").append(toIndentedString(reloadOption)).append("\n");
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
    openapiFields.add("TablesToReload");
    openapiFields.add("ReloadOption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReplicationTaskArn");
    openapiRequiredFields.add("TablesToReload");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReloadTablesMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReloadTablesMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReloadTablesMessage is not found in the empty JSON string", ReloadTablesMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReloadTablesMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReloadTablesMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReloadTablesMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ReplicationTaskArn`
      String.validateJsonElement(jsonObj.get("ReplicationTaskArn"));
      // validate the required field `TablesToReload`
      List.validateJsonElement(jsonObj.get("TablesToReload"));
      // validate the optional field `ReloadOption`
      if (jsonObj.get("ReloadOption") != null && !jsonObj.get("ReloadOption").isJsonNull()) {
        ReloadOptionValue.validateJsonElement(jsonObj.get("ReloadOption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReloadTablesMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReloadTablesMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReloadTablesMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReloadTablesMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ReloadTablesMessage>() {
           @Override
           public void write(JsonWriter out, ReloadTablesMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReloadTablesMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReloadTablesMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReloadTablesMessage
   * @throws IOException if the JSON string is invalid with respect to ReloadTablesMessage
   */
  public static ReloadTablesMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReloadTablesMessage.class);
  }

  /**
   * Convert an instance of ReloadTablesMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

