/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import org.openapitools.client.model.SourceConnectionDetailConnectionParameters;
import org.openapitools.client.model.SourceConnectionDetailLastSync;
import org.openapitools.client.model.SourceType;

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
 * Provides details about the configured &lt;code&gt;SourceConnection&lt;/code&gt;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SourceConnectionDetail {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SourceType type;

  public static final String SERIALIZED_NAME_CONNECTION_PARAMETERS = "ConnectionParameters";
  @SerializedName(SERIALIZED_NAME_CONNECTION_PARAMETERS)
  private SourceConnectionDetailConnectionParameters connectionParameters;

  public static final String SERIALIZED_NAME_LAST_SYNC = "LastSync";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC)
  private SourceConnectionDetailLastSync lastSync;

  public SourceConnectionDetail() {
  }

  public SourceConnectionDetail type(SourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public SourceType getType() {
    return type;
  }

  public void setType(SourceType type) {
    this.type = type;
  }


  public SourceConnectionDetail connectionParameters(SourceConnectionDetailConnectionParameters connectionParameters) {
    this.connectionParameters = connectionParameters;
    return this;
  }

  /**
   * Get connectionParameters
   * @return connectionParameters
   */
  @javax.annotation.Nullable
  public SourceConnectionDetailConnectionParameters getConnectionParameters() {
    return connectionParameters;
  }

  public void setConnectionParameters(SourceConnectionDetailConnectionParameters connectionParameters) {
    this.connectionParameters = connectionParameters;
  }


  public SourceConnectionDetail lastSync(SourceConnectionDetailLastSync lastSync) {
    this.lastSync = lastSync;
    return this;
  }

  /**
   * Get lastSync
   * @return lastSync
   */
  @javax.annotation.Nullable
  public SourceConnectionDetailLastSync getLastSync() {
    return lastSync;
  }

  public void setLastSync(SourceConnectionDetailLastSync lastSync) {
    this.lastSync = lastSync;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceConnectionDetail sourceConnectionDetail = (SourceConnectionDetail) o;
    return Objects.equals(this.type, sourceConnectionDetail.type) &&
        Objects.equals(this.connectionParameters, sourceConnectionDetail.connectionParameters) &&
        Objects.equals(this.lastSync, sourceConnectionDetail.lastSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, connectionParameters, lastSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceConnectionDetail {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    connectionParameters: ").append(toIndentedString(connectionParameters)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("ConnectionParameters");
    openapiFields.add("LastSync");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SourceConnectionDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SourceConnectionDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceConnectionDetail is not found in the empty JSON string", SourceConnectionDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SourceConnectionDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceConnectionDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        SourceType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `ConnectionParameters`
      if (jsonObj.get("ConnectionParameters") != null && !jsonObj.get("ConnectionParameters").isJsonNull()) {
        SourceConnectionDetailConnectionParameters.validateJsonElement(jsonObj.get("ConnectionParameters"));
      }
      // validate the optional field `LastSync`
      if (jsonObj.get("LastSync") != null && !jsonObj.get("LastSync").isJsonNull()) {
        SourceConnectionDetailLastSync.validateJsonElement(jsonObj.get("LastSync"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceConnectionDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceConnectionDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceConnectionDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceConnectionDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceConnectionDetail>() {
           @Override
           public void write(JsonWriter out, SourceConnectionDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceConnectionDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SourceConnectionDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SourceConnectionDetail
   * @throws IOException if the JSON string is invalid with respect to SourceConnectionDetail
   */
  public static SourceConnectionDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceConnectionDetail.class);
  }

  /**
   * Convert an instance of SourceConnectionDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

