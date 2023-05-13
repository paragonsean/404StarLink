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
import org.openapitools.client.model.ReplicationEndpointTypeValue;

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
 * Provides information about types of supported endpoints in response to a request by the &lt;code&gt;DescribeEndpointTypes&lt;/code&gt; operation. This information includes the type of endpoint, the database engine name, and whether change data capture (CDC) is supported.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SupportedEndpointType {
  public static final String SERIALIZED_NAME_ENGINE_NAME = "EngineName";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_SUPPORTS_C_D_C = "SupportsCDC";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_C_D_C)
  private Boolean supportsCDC;

  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "EndpointType";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private ReplicationEndpointTypeValue endpointType;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_ENGINE_MINIMUM_VERSION = "ReplicationInstanceEngineMinimumVersion";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_ENGINE_MINIMUM_VERSION)
  private String replicationInstanceEngineMinimumVersion;

  public static final String SERIALIZED_NAME_ENGINE_DISPLAY_NAME = "EngineDisplayName";
  @SerializedName(SERIALIZED_NAME_ENGINE_DISPLAY_NAME)
  private String engineDisplayName;

  public SupportedEndpointType() {
  }

  public SupportedEndpointType engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

  /**
   * Get engineName
   * @return engineName
   */
  @javax.annotation.Nullable
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public SupportedEndpointType supportsCDC(Boolean supportsCDC) {
    this.supportsCDC = supportsCDC;
    return this;
  }

  /**
   * Get supportsCDC
   * @return supportsCDC
   */
  @javax.annotation.Nullable
  public Boolean getSupportsCDC() {
    return supportsCDC;
  }

  public void setSupportsCDC(Boolean supportsCDC) {
    this.supportsCDC = supportsCDC;
  }


  public SupportedEndpointType endpointType(ReplicationEndpointTypeValue endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  /**
   * Get endpointType
   * @return endpointType
   */
  @javax.annotation.Nullable
  public ReplicationEndpointTypeValue getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
    this.endpointType = endpointType;
  }


  public SupportedEndpointType replicationInstanceEngineMinimumVersion(String replicationInstanceEngineMinimumVersion) {
    this.replicationInstanceEngineMinimumVersion = replicationInstanceEngineMinimumVersion;
    return this;
  }

  /**
   * Get replicationInstanceEngineMinimumVersion
   * @return replicationInstanceEngineMinimumVersion
   */
  @javax.annotation.Nullable
  public String getReplicationInstanceEngineMinimumVersion() {
    return replicationInstanceEngineMinimumVersion;
  }

  public void setReplicationInstanceEngineMinimumVersion(String replicationInstanceEngineMinimumVersion) {
    this.replicationInstanceEngineMinimumVersion = replicationInstanceEngineMinimumVersion;
  }


  public SupportedEndpointType engineDisplayName(String engineDisplayName) {
    this.engineDisplayName = engineDisplayName;
    return this;
  }

  /**
   * Get engineDisplayName
   * @return engineDisplayName
   */
  @javax.annotation.Nullable
  public String getEngineDisplayName() {
    return engineDisplayName;
  }

  public void setEngineDisplayName(String engineDisplayName) {
    this.engineDisplayName = engineDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedEndpointType supportedEndpointType = (SupportedEndpointType) o;
    return Objects.equals(this.engineName, supportedEndpointType.engineName) &&
        Objects.equals(this.supportsCDC, supportedEndpointType.supportsCDC) &&
        Objects.equals(this.endpointType, supportedEndpointType.endpointType) &&
        Objects.equals(this.replicationInstanceEngineMinimumVersion, supportedEndpointType.replicationInstanceEngineMinimumVersion) &&
        Objects.equals(this.engineDisplayName, supportedEndpointType.engineDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineName, supportsCDC, endpointType, replicationInstanceEngineMinimumVersion, engineDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedEndpointType {\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    supportsCDC: ").append(toIndentedString(supportsCDC)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    replicationInstanceEngineMinimumVersion: ").append(toIndentedString(replicationInstanceEngineMinimumVersion)).append("\n");
    sb.append("    engineDisplayName: ").append(toIndentedString(engineDisplayName)).append("\n");
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
    openapiFields.add("EngineName");
    openapiFields.add("SupportsCDC");
    openapiFields.add("EndpointType");
    openapiFields.add("ReplicationInstanceEngineMinimumVersion");
    openapiFields.add("EngineDisplayName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupportedEndpointType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupportedEndpointType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportedEndpointType is not found in the empty JSON string", SupportedEndpointType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupportedEndpointType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupportedEndpointType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EngineName`
      if (jsonObj.get("EngineName") != null && !jsonObj.get("EngineName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineName"));
      }
      // validate the optional field `SupportsCDC`
      if (jsonObj.get("SupportsCDC") != null && !jsonObj.get("SupportsCDC").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("SupportsCDC"));
      }
      // validate the optional field `EndpointType`
      if (jsonObj.get("EndpointType") != null && !jsonObj.get("EndpointType").isJsonNull()) {
        ReplicationEndpointTypeValue.validateJsonElement(jsonObj.get("EndpointType"));
      }
      // validate the optional field `ReplicationInstanceEngineMinimumVersion`
      if (jsonObj.get("ReplicationInstanceEngineMinimumVersion") != null && !jsonObj.get("ReplicationInstanceEngineMinimumVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationInstanceEngineMinimumVersion"));
      }
      // validate the optional field `EngineDisplayName`
      if (jsonObj.get("EngineDisplayName") != null && !jsonObj.get("EngineDisplayName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineDisplayName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportedEndpointType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportedEndpointType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportedEndpointType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportedEndpointType.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportedEndpointType>() {
           @Override
           public void write(JsonWriter out, SupportedEndpointType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupportedEndpointType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SupportedEndpointType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupportedEndpointType
   * @throws IOException if the JSON string is invalid with respect to SupportedEndpointType
   */
  public static SupportedEndpointType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportedEndpointType.class);
  }

  /**
   * Convert an instance of SupportedEndpointType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

