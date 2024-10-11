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
import org.openapitools.client.model.VpcEndpointStatus;
import org.openapitools.client.model.VpcEndpointVpcOptions;

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
 * The connection endpoint for connecting to an Amazon OpenSearch Service domain through a proxy.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VpcEndpoint {
  public static final String SERIALIZED_NAME_VPC_ENDPOINT_ID = "VpcEndpointId";
  @SerializedName(SERIALIZED_NAME_VPC_ENDPOINT_ID)
  private String vpcEndpointId;

  public static final String SERIALIZED_NAME_VPC_ENDPOINT_OWNER = "VpcEndpointOwner";
  @SerializedName(SERIALIZED_NAME_VPC_ENDPOINT_OWNER)
  private String vpcEndpointOwner;

  public static final String SERIALIZED_NAME_DOMAIN_ARN = "DomainArn";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ARN)
  private String domainArn;

  public static final String SERIALIZED_NAME_VPC_OPTIONS = "VpcOptions";
  @SerializedName(SERIALIZED_NAME_VPC_OPTIONS)
  private VpcEndpointVpcOptions vpcOptions;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VpcEndpointStatus status;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public VpcEndpoint() {
  }

  public VpcEndpoint vpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  /**
   * Get vpcEndpointId
   * @return vpcEndpointId
   */
  @javax.annotation.Nullable
  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  public void setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
  }


  public VpcEndpoint vpcEndpointOwner(String vpcEndpointOwner) {
    this.vpcEndpointOwner = vpcEndpointOwner;
    return this;
  }

  /**
   * Get vpcEndpointOwner
   * @return vpcEndpointOwner
   */
  @javax.annotation.Nullable
  public String getVpcEndpointOwner() {
    return vpcEndpointOwner;
  }

  public void setVpcEndpointOwner(String vpcEndpointOwner) {
    this.vpcEndpointOwner = vpcEndpointOwner;
  }


  public VpcEndpoint domainArn(String domainArn) {
    this.domainArn = domainArn;
    return this;
  }

  /**
   * Get domainArn
   * @return domainArn
   */
  @javax.annotation.Nullable
  public String getDomainArn() {
    return domainArn;
  }

  public void setDomainArn(String domainArn) {
    this.domainArn = domainArn;
  }


  public VpcEndpoint vpcOptions(VpcEndpointVpcOptions vpcOptions) {
    this.vpcOptions = vpcOptions;
    return this;
  }

  /**
   * Get vpcOptions
   * @return vpcOptions
   */
  @javax.annotation.Nullable
  public VpcEndpointVpcOptions getVpcOptions() {
    return vpcOptions;
  }

  public void setVpcOptions(VpcEndpointVpcOptions vpcOptions) {
    this.vpcOptions = vpcOptions;
  }


  public VpcEndpoint status(VpcEndpointStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public VpcEndpointStatus getStatus() {
    return status;
  }

  public void setStatus(VpcEndpointStatus status) {
    this.status = status;
  }


  public VpcEndpoint endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @javax.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcEndpoint vpcEndpoint = (VpcEndpoint) o;
    return Objects.equals(this.vpcEndpointId, vpcEndpoint.vpcEndpointId) &&
        Objects.equals(this.vpcEndpointOwner, vpcEndpoint.vpcEndpointOwner) &&
        Objects.equals(this.domainArn, vpcEndpoint.domainArn) &&
        Objects.equals(this.vpcOptions, vpcEndpoint.vpcOptions) &&
        Objects.equals(this.status, vpcEndpoint.status) &&
        Objects.equals(this.endpoint, vpcEndpoint.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcEndpointId, vpcEndpointOwner, domainArn, vpcOptions, status, endpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcEndpoint {\n");
    sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
    sb.append("    vpcEndpointOwner: ").append(toIndentedString(vpcEndpointOwner)).append("\n");
    sb.append("    domainArn: ").append(toIndentedString(domainArn)).append("\n");
    sb.append("    vpcOptions: ").append(toIndentedString(vpcOptions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
    openapiFields.add("VpcEndpointId");
    openapiFields.add("VpcEndpointOwner");
    openapiFields.add("DomainArn");
    openapiFields.add("VpcOptions");
    openapiFields.add("Status");
    openapiFields.add("Endpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VpcEndpoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VpcEndpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VpcEndpoint is not found in the empty JSON string", VpcEndpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VpcEndpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VpcEndpoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `VpcEndpointId`
      if (jsonObj.get("VpcEndpointId") != null && !jsonObj.get("VpcEndpointId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcEndpointId"));
      }
      // validate the optional field `VpcEndpointOwner`
      if (jsonObj.get("VpcEndpointOwner") != null && !jsonObj.get("VpcEndpointOwner").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcEndpointOwner"));
      }
      // validate the optional field `DomainArn`
      if (jsonObj.get("DomainArn") != null && !jsonObj.get("DomainArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainArn"));
      }
      // validate the optional field `VpcOptions`
      if (jsonObj.get("VpcOptions") != null && !jsonObj.get("VpcOptions").isJsonNull()) {
        VpcEndpointVpcOptions.validateJsonElement(jsonObj.get("VpcOptions"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        VpcEndpointStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Endpoint`
      if (jsonObj.get("Endpoint") != null && !jsonObj.get("Endpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Endpoint"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VpcEndpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VpcEndpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VpcEndpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VpcEndpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<VpcEndpoint>() {
           @Override
           public void write(JsonWriter out, VpcEndpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VpcEndpoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VpcEndpoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VpcEndpoint
   * @throws IOException if the JSON string is invalid with respect to VpcEndpoint
   */
  public static VpcEndpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VpcEndpoint.class);
  }

  /**
   * Convert an instance of VpcEndpoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

