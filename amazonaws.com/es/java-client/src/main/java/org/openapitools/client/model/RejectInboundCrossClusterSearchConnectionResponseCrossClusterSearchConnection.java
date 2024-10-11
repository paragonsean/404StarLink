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
import java.util.Arrays;
import org.openapitools.client.model.CreateOutboundCrossClusterSearchConnectionResponseDestinationDomainInfo;
import org.openapitools.client.model.CreateOutboundCrossClusterSearchConnectionResponseSourceDomainInfo;
import org.openapitools.client.model.InboundCrossClusterSearchConnectionConnectionStatus;

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
 * RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection {
  public static final String SERIALIZED_NAME_SOURCE_DOMAIN_INFO = "SourceDomainInfo";
  @SerializedName(SERIALIZED_NAME_SOURCE_DOMAIN_INFO)
  private CreateOutboundCrossClusterSearchConnectionResponseSourceDomainInfo sourceDomainInfo;

  public static final String SERIALIZED_NAME_DESTINATION_DOMAIN_INFO = "DestinationDomainInfo";
  @SerializedName(SERIALIZED_NAME_DESTINATION_DOMAIN_INFO)
  private CreateOutboundCrossClusterSearchConnectionResponseDestinationDomainInfo destinationDomainInfo;

  public static final String SERIALIZED_NAME_CROSS_CLUSTER_SEARCH_CONNECTION_ID = "CrossClusterSearchConnectionId";
  @SerializedName(SERIALIZED_NAME_CROSS_CLUSTER_SEARCH_CONNECTION_ID)
  private String crossClusterSearchConnectionId;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "ConnectionStatus";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private InboundCrossClusterSearchConnectionConnectionStatus connectionStatus;

  public RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection() {
  }

  public RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection sourceDomainInfo(CreateOutboundCrossClusterSearchConnectionResponseSourceDomainInfo sourceDomainInfo) {
    this.sourceDomainInfo = sourceDomainInfo;
    return this;
  }

  /**
   * Get sourceDomainInfo
   * @return sourceDomainInfo
   */
  @javax.annotation.Nullable
  public CreateOutboundCrossClusterSearchConnectionResponseSourceDomainInfo getSourceDomainInfo() {
    return sourceDomainInfo;
  }

  public void setSourceDomainInfo(CreateOutboundCrossClusterSearchConnectionResponseSourceDomainInfo sourceDomainInfo) {
    this.sourceDomainInfo = sourceDomainInfo;
  }


  public RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection destinationDomainInfo(CreateOutboundCrossClusterSearchConnectionResponseDestinationDomainInfo destinationDomainInfo) {
    this.destinationDomainInfo = destinationDomainInfo;
    return this;
  }

  /**
   * Get destinationDomainInfo
   * @return destinationDomainInfo
   */
  @javax.annotation.Nullable
  public CreateOutboundCrossClusterSearchConnectionResponseDestinationDomainInfo getDestinationDomainInfo() {
    return destinationDomainInfo;
  }

  public void setDestinationDomainInfo(CreateOutboundCrossClusterSearchConnectionResponseDestinationDomainInfo destinationDomainInfo) {
    this.destinationDomainInfo = destinationDomainInfo;
  }


  public RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection crossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
    this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
    return this;
  }

  /**
   * Get crossClusterSearchConnectionId
   * @return crossClusterSearchConnectionId
   */
  @javax.annotation.Nullable
  public String getCrossClusterSearchConnectionId() {
    return crossClusterSearchConnectionId;
  }

  public void setCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
    this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
  }


  public RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection connectionStatus(InboundCrossClusterSearchConnectionConnectionStatus connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

  /**
   * Get connectionStatus
   * @return connectionStatus
   */
  @javax.annotation.Nullable
  public InboundCrossClusterSearchConnectionConnectionStatus getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(InboundCrossClusterSearchConnectionConnectionStatus connectionStatus) {
    this.connectionStatus = connectionStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection rejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection = (RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection) o;
    return Objects.equals(this.sourceDomainInfo, rejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.sourceDomainInfo) &&
        Objects.equals(this.destinationDomainInfo, rejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.destinationDomainInfo) &&
        Objects.equals(this.crossClusterSearchConnectionId, rejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.crossClusterSearchConnectionId) &&
        Objects.equals(this.connectionStatus, rejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.connectionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDomainInfo, destinationDomainInfo, crossClusterSearchConnectionId, connectionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection {\n");
    sb.append("    sourceDomainInfo: ").append(toIndentedString(sourceDomainInfo)).append("\n");
    sb.append("    destinationDomainInfo: ").append(toIndentedString(destinationDomainInfo)).append("\n");
    sb.append("    crossClusterSearchConnectionId: ").append(toIndentedString(crossClusterSearchConnectionId)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
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
    openapiFields.add("SourceDomainInfo");
    openapiFields.add("DestinationDomainInfo");
    openapiFields.add("CrossClusterSearchConnectionId");
    openapiFields.add("ConnectionStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection is not found in the empty JSON string", RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `SourceDomainInfo`
      if (jsonObj.get("SourceDomainInfo") != null && !jsonObj.get("SourceDomainInfo").isJsonNull()) {
        CreateOutboundCrossClusterSearchConnectionResponseSourceDomainInfo.validateJsonElement(jsonObj.get("SourceDomainInfo"));
      }
      // validate the optional field `DestinationDomainInfo`
      if (jsonObj.get("DestinationDomainInfo") != null && !jsonObj.get("DestinationDomainInfo").isJsonNull()) {
        CreateOutboundCrossClusterSearchConnectionResponseDestinationDomainInfo.validateJsonElement(jsonObj.get("DestinationDomainInfo"));
      }
      // validate the optional field `CrossClusterSearchConnectionId`
      if (jsonObj.get("CrossClusterSearchConnectionId") != null && !jsonObj.get("CrossClusterSearchConnectionId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CrossClusterSearchConnectionId"));
      }
      // validate the optional field `ConnectionStatus`
      if (jsonObj.get("ConnectionStatus") != null && !jsonObj.get("ConnectionStatus").isJsonNull()) {
        InboundCrossClusterSearchConnectionConnectionStatus.validateJsonElement(jsonObj.get("ConnectionStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.class));

       return (TypeAdapter<T>) new TypeAdapter<RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection>() {
           @Override
           public void write(JsonWriter out, RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection
   * @throws IOException if the JSON string is invalid with respect to RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection
   */
  public static RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection.class);
  }

  /**
   * Convert an instance of RejectInboundCrossClusterSearchConnectionResponseCrossClusterSearchConnection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

