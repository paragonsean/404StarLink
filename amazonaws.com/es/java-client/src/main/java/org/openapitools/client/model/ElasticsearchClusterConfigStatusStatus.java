/*
 * Amazon Elasticsearch Service
 * <fullname>Amazon Elasticsearch Configuration Service</fullname> <p>Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.</p> <p>For sample code that uses the Configuration API, see the <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html\">Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html\">sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.</p> <p>The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a href=\"http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions\" target=\"_blank\">Regions and Endpoints</a>.</p>
 *
 * The version of the OpenAPI document: 2015-01-01
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
import org.openapitools.client.model.OptionState;

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
 * ElasticsearchClusterConfigStatusStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ElasticsearchClusterConfigStatusStatus {
  public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "UpdateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "UpdateVersion";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Integer updateVersion;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private OptionState state;

  public static final String SERIALIZED_NAME_PENDING_DELETION = "PendingDeletion";
  @SerializedName(SERIALIZED_NAME_PENDING_DELETION)
  private Boolean pendingDeletion;

  public ElasticsearchClusterConfigStatusStatus() {
  }

  public ElasticsearchClusterConfigStatusStatus creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ElasticsearchClusterConfigStatusStatus updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  public ElasticsearchClusterConfigStatusStatus updateVersion(Integer updateVersion) {
    this.updateVersion = updateVersion;
    return this;
  }

  /**
   * Get updateVersion
   * @return updateVersion
   */
  @javax.annotation.Nullable
  public Integer getUpdateVersion() {
    return updateVersion;
  }

  public void setUpdateVersion(Integer updateVersion) {
    this.updateVersion = updateVersion;
  }


  public ElasticsearchClusterConfigStatusStatus state(OptionState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  public OptionState getState() {
    return state;
  }

  public void setState(OptionState state) {
    this.state = state;
  }


  public ElasticsearchClusterConfigStatusStatus pendingDeletion(Boolean pendingDeletion) {
    this.pendingDeletion = pendingDeletion;
    return this;
  }

  /**
   * Get pendingDeletion
   * @return pendingDeletion
   */
  @javax.annotation.Nullable
  public Boolean getPendingDeletion() {
    return pendingDeletion;
  }

  public void setPendingDeletion(Boolean pendingDeletion) {
    this.pendingDeletion = pendingDeletion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchClusterConfigStatusStatus elasticsearchClusterConfigStatusStatus = (ElasticsearchClusterConfigStatusStatus) o;
    return Objects.equals(this.creationDate, elasticsearchClusterConfigStatusStatus.creationDate) &&
        Objects.equals(this.updateDate, elasticsearchClusterConfigStatusStatus.updateDate) &&
        Objects.equals(this.updateVersion, elasticsearchClusterConfigStatusStatus.updateVersion) &&
        Objects.equals(this.state, elasticsearchClusterConfigStatusStatus.state) &&
        Objects.equals(this.pendingDeletion, elasticsearchClusterConfigStatusStatus.pendingDeletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, updateDate, updateVersion, state, pendingDeletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchClusterConfigStatusStatus {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pendingDeletion: ").append(toIndentedString(pendingDeletion)).append("\n");
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
    openapiFields.add("CreationDate");
    openapiFields.add("UpdateDate");
    openapiFields.add("UpdateVersion");
    openapiFields.add("State");
    openapiFields.add("PendingDeletion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CreationDate");
    openapiRequiredFields.add("UpdateDate");
    openapiRequiredFields.add("State");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElasticsearchClusterConfigStatusStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElasticsearchClusterConfigStatusStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElasticsearchClusterConfigStatusStatus is not found in the empty JSON string", ElasticsearchClusterConfigStatusStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElasticsearchClusterConfigStatusStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElasticsearchClusterConfigStatusStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ElasticsearchClusterConfigStatusStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CreationDate`
      OffsetDateTime.validateJsonElement(jsonObj.get("CreationDate"));
      // validate the required field `UpdateDate`
      OffsetDateTime.validateJsonElement(jsonObj.get("UpdateDate"));
      // validate the optional field `UpdateVersion`
      if (jsonObj.get("UpdateVersion") != null && !jsonObj.get("UpdateVersion").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("UpdateVersion"));
      }
      // validate the required field `State`
      OptionState.validateJsonElement(jsonObj.get("State"));
      // validate the optional field `PendingDeletion`
      if (jsonObj.get("PendingDeletion") != null && !jsonObj.get("PendingDeletion").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("PendingDeletion"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElasticsearchClusterConfigStatusStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElasticsearchClusterConfigStatusStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElasticsearchClusterConfigStatusStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElasticsearchClusterConfigStatusStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ElasticsearchClusterConfigStatusStatus>() {
           @Override
           public void write(JsonWriter out, ElasticsearchClusterConfigStatusStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElasticsearchClusterConfigStatusStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElasticsearchClusterConfigStatusStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElasticsearchClusterConfigStatusStatus
   * @throws IOException if the JSON string is invalid with respect to ElasticsearchClusterConfigStatusStatus
   */
  public static ElasticsearchClusterConfigStatusStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElasticsearchClusterConfigStatusStatus.class);
  }

  /**
   * Convert an instance of ElasticsearchClusterConfigStatusStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

