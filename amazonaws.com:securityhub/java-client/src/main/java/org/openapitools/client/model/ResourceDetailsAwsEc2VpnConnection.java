/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import org.openapitools.client.model.AwsEc2VpnConnectionDetailsOptions;

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
 * ResourceDetailsAwsEc2VpnConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEc2VpnConnection {
  public static final String SERIALIZED_NAME_VPN_CONNECTION_ID = "VpnConnectionId";
  @SerializedName(SERIALIZED_NAME_VPN_CONNECTION_ID)
  private String vpnConnectionId;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_CUSTOMER_GATEWAY_ID = "CustomerGatewayId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GATEWAY_ID)
  private String customerGatewayId;

  public static final String SERIALIZED_NAME_CUSTOMER_GATEWAY_CONFIGURATION = "CustomerGatewayConfiguration";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GATEWAY_CONFIGURATION)
  private String customerGatewayConfiguration;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VPN_GATEWAY_ID = "VpnGatewayId";
  @SerializedName(SERIALIZED_NAME_VPN_GATEWAY_ID)
  private String vpnGatewayId;

  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_VGW_TELEMETRY = "VgwTelemetry";
  @SerializedName(SERIALIZED_NAME_VGW_TELEMETRY)
  private List vgwTelemetry;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private AwsEc2VpnConnectionDetailsOptions options;

  public static final String SERIALIZED_NAME_ROUTES = "Routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List routes;

  public static final String SERIALIZED_NAME_TRANSIT_GATEWAY_ID = "TransitGatewayId";
  @SerializedName(SERIALIZED_NAME_TRANSIT_GATEWAY_ID)
  private String transitGatewayId;

  public ResourceDetailsAwsEc2VpnConnection() {
  }

  public ResourceDetailsAwsEc2VpnConnection vpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

  /**
   * Get vpnConnectionId
   * @return vpnConnectionId
   */
  @javax.annotation.Nullable
  public String getVpnConnectionId() {
    return vpnConnectionId;
  }

  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }


  public ResourceDetailsAwsEc2VpnConnection state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public ResourceDetailsAwsEc2VpnConnection customerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
    return this;
  }

  /**
   * Get customerGatewayId
   * @return customerGatewayId
   */
  @javax.annotation.Nullable
  public String getCustomerGatewayId() {
    return customerGatewayId;
  }

  public void setCustomerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
  }


  public ResourceDetailsAwsEc2VpnConnection customerGatewayConfiguration(String customerGatewayConfiguration) {
    this.customerGatewayConfiguration = customerGatewayConfiguration;
    return this;
  }

  /**
   * Get customerGatewayConfiguration
   * @return customerGatewayConfiguration
   */
  @javax.annotation.Nullable
  public String getCustomerGatewayConfiguration() {
    return customerGatewayConfiguration;
  }

  public void setCustomerGatewayConfiguration(String customerGatewayConfiguration) {
    this.customerGatewayConfiguration = customerGatewayConfiguration;
  }


  public ResourceDetailsAwsEc2VpnConnection type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public ResourceDetailsAwsEc2VpnConnection vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

  /**
   * Get vpnGatewayId
   * @return vpnGatewayId
   */
  @javax.annotation.Nullable
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }


  public ResourceDetailsAwsEc2VpnConnection category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public ResourceDetailsAwsEc2VpnConnection vgwTelemetry(List vgwTelemetry) {
    this.vgwTelemetry = vgwTelemetry;
    return this;
  }

  /**
   * Get vgwTelemetry
   * @return vgwTelemetry
   */
  @javax.annotation.Nullable
  public List getVgwTelemetry() {
    return vgwTelemetry;
  }

  public void setVgwTelemetry(List vgwTelemetry) {
    this.vgwTelemetry = vgwTelemetry;
  }


  public ResourceDetailsAwsEc2VpnConnection options(AwsEc2VpnConnectionDetailsOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public AwsEc2VpnConnectionDetailsOptions getOptions() {
    return options;
  }

  public void setOptions(AwsEc2VpnConnectionDetailsOptions options) {
    this.options = options;
  }


  public ResourceDetailsAwsEc2VpnConnection routes(List routes) {
    this.routes = routes;
    return this;
  }

  /**
   * Get routes
   * @return routes
   */
  @javax.annotation.Nullable
  public List getRoutes() {
    return routes;
  }

  public void setRoutes(List routes) {
    this.routes = routes;
  }


  public ResourceDetailsAwsEc2VpnConnection transitGatewayId(String transitGatewayId) {
    this.transitGatewayId = transitGatewayId;
    return this;
  }

  /**
   * Get transitGatewayId
   * @return transitGatewayId
   */
  @javax.annotation.Nullable
  public String getTransitGatewayId() {
    return transitGatewayId;
  }

  public void setTransitGatewayId(String transitGatewayId) {
    this.transitGatewayId = transitGatewayId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEc2VpnConnection resourceDetailsAwsEc2VpnConnection = (ResourceDetailsAwsEc2VpnConnection) o;
    return Objects.equals(this.vpnConnectionId, resourceDetailsAwsEc2VpnConnection.vpnConnectionId) &&
        Objects.equals(this.state, resourceDetailsAwsEc2VpnConnection.state) &&
        Objects.equals(this.customerGatewayId, resourceDetailsAwsEc2VpnConnection.customerGatewayId) &&
        Objects.equals(this.customerGatewayConfiguration, resourceDetailsAwsEc2VpnConnection.customerGatewayConfiguration) &&
        Objects.equals(this.type, resourceDetailsAwsEc2VpnConnection.type) &&
        Objects.equals(this.vpnGatewayId, resourceDetailsAwsEc2VpnConnection.vpnGatewayId) &&
        Objects.equals(this.category, resourceDetailsAwsEc2VpnConnection.category) &&
        Objects.equals(this.vgwTelemetry, resourceDetailsAwsEc2VpnConnection.vgwTelemetry) &&
        Objects.equals(this.options, resourceDetailsAwsEc2VpnConnection.options) &&
        Objects.equals(this.routes, resourceDetailsAwsEc2VpnConnection.routes) &&
        Objects.equals(this.transitGatewayId, resourceDetailsAwsEc2VpnConnection.transitGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpnConnectionId, state, customerGatewayId, customerGatewayConfiguration, type, vpnGatewayId, category, vgwTelemetry, options, routes, transitGatewayId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEc2VpnConnection {\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
    sb.append("    customerGatewayConfiguration: ").append(toIndentedString(customerGatewayConfiguration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    vgwTelemetry: ").append(toIndentedString(vgwTelemetry)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    transitGatewayId: ").append(toIndentedString(transitGatewayId)).append("\n");
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
    openapiFields.add("VpnConnectionId");
    openapiFields.add("State");
    openapiFields.add("CustomerGatewayId");
    openapiFields.add("CustomerGatewayConfiguration");
    openapiFields.add("Type");
    openapiFields.add("VpnGatewayId");
    openapiFields.add("Category");
    openapiFields.add("VgwTelemetry");
    openapiFields.add("Options");
    openapiFields.add("Routes");
    openapiFields.add("TransitGatewayId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEc2VpnConnection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEc2VpnConnection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEc2VpnConnection is not found in the empty JSON string", ResourceDetailsAwsEc2VpnConnection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEc2VpnConnection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEc2VpnConnection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `VpnConnectionId`
      if (jsonObj.get("VpnConnectionId") != null && !jsonObj.get("VpnConnectionId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpnConnectionId"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("State"));
      }
      // validate the optional field `CustomerGatewayId`
      if (jsonObj.get("CustomerGatewayId") != null && !jsonObj.get("CustomerGatewayId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomerGatewayId"));
      }
      // validate the optional field `CustomerGatewayConfiguration`
      if (jsonObj.get("CustomerGatewayConfiguration") != null && !jsonObj.get("CustomerGatewayConfiguration").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomerGatewayConfiguration"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `VpnGatewayId`
      if (jsonObj.get("VpnGatewayId") != null && !jsonObj.get("VpnGatewayId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpnGatewayId"));
      }
      // validate the optional field `Category`
      if (jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Category"));
      }
      // validate the optional field `VgwTelemetry`
      if (jsonObj.get("VgwTelemetry") != null && !jsonObj.get("VgwTelemetry").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("VgwTelemetry"));
      }
      // validate the optional field `Options`
      if (jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull()) {
        AwsEc2VpnConnectionDetailsOptions.validateJsonElement(jsonObj.get("Options"));
      }
      // validate the optional field `Routes`
      if (jsonObj.get("Routes") != null && !jsonObj.get("Routes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Routes"));
      }
      // validate the optional field `TransitGatewayId`
      if (jsonObj.get("TransitGatewayId") != null && !jsonObj.get("TransitGatewayId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TransitGatewayId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEc2VpnConnection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEc2VpnConnection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEc2VpnConnection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEc2VpnConnection.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEc2VpnConnection>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEc2VpnConnection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEc2VpnConnection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEc2VpnConnection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEc2VpnConnection
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEc2VpnConnection
   */
  public static ResourceDetailsAwsEc2VpnConnection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEc2VpnConnection.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEc2VpnConnection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

