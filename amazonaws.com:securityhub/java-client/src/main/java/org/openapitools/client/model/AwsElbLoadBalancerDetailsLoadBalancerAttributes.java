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
import org.openapitools.client.model.AwsElbLoadBalancerAttributesAccessLog;
import org.openapitools.client.model.AwsElbLoadBalancerAttributesConnectionDraining;
import org.openapitools.client.model.AwsElbLoadBalancerAttributesConnectionSettings;
import org.openapitools.client.model.AwsElbLoadBalancerAttributesCrossZoneLoadBalancing;

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
 * AwsElbLoadBalancerDetailsLoadBalancerAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsElbLoadBalancerDetailsLoadBalancerAttributes {
  public static final String SERIALIZED_NAME_ACCESS_LOG = "AccessLog";
  @SerializedName(SERIALIZED_NAME_ACCESS_LOG)
  private AwsElbLoadBalancerAttributesAccessLog accessLog;

  public static final String SERIALIZED_NAME_CONNECTION_DRAINING = "ConnectionDraining";
  @SerializedName(SERIALIZED_NAME_CONNECTION_DRAINING)
  private AwsElbLoadBalancerAttributesConnectionDraining connectionDraining;

  public static final String SERIALIZED_NAME_CONNECTION_SETTINGS = "ConnectionSettings";
  @SerializedName(SERIALIZED_NAME_CONNECTION_SETTINGS)
  private AwsElbLoadBalancerAttributesConnectionSettings connectionSettings;

  public static final String SERIALIZED_NAME_CROSS_ZONE_LOAD_BALANCING = "CrossZoneLoadBalancing";
  @SerializedName(SERIALIZED_NAME_CROSS_ZONE_LOAD_BALANCING)
  private AwsElbLoadBalancerAttributesCrossZoneLoadBalancing crossZoneLoadBalancing;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "AdditionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List additionalAttributes;

  public AwsElbLoadBalancerDetailsLoadBalancerAttributes() {
  }

  public AwsElbLoadBalancerDetailsLoadBalancerAttributes accessLog(AwsElbLoadBalancerAttributesAccessLog accessLog) {
    this.accessLog = accessLog;
    return this;
  }

  /**
   * Get accessLog
   * @return accessLog
   */
  @javax.annotation.Nullable
  public AwsElbLoadBalancerAttributesAccessLog getAccessLog() {
    return accessLog;
  }

  public void setAccessLog(AwsElbLoadBalancerAttributesAccessLog accessLog) {
    this.accessLog = accessLog;
  }


  public AwsElbLoadBalancerDetailsLoadBalancerAttributes connectionDraining(AwsElbLoadBalancerAttributesConnectionDraining connectionDraining) {
    this.connectionDraining = connectionDraining;
    return this;
  }

  /**
   * Get connectionDraining
   * @return connectionDraining
   */
  @javax.annotation.Nullable
  public AwsElbLoadBalancerAttributesConnectionDraining getConnectionDraining() {
    return connectionDraining;
  }

  public void setConnectionDraining(AwsElbLoadBalancerAttributesConnectionDraining connectionDraining) {
    this.connectionDraining = connectionDraining;
  }


  public AwsElbLoadBalancerDetailsLoadBalancerAttributes connectionSettings(AwsElbLoadBalancerAttributesConnectionSettings connectionSettings) {
    this.connectionSettings = connectionSettings;
    return this;
  }

  /**
   * Get connectionSettings
   * @return connectionSettings
   */
  @javax.annotation.Nullable
  public AwsElbLoadBalancerAttributesConnectionSettings getConnectionSettings() {
    return connectionSettings;
  }

  public void setConnectionSettings(AwsElbLoadBalancerAttributesConnectionSettings connectionSettings) {
    this.connectionSettings = connectionSettings;
  }


  public AwsElbLoadBalancerDetailsLoadBalancerAttributes crossZoneLoadBalancing(AwsElbLoadBalancerAttributesCrossZoneLoadBalancing crossZoneLoadBalancing) {
    this.crossZoneLoadBalancing = crossZoneLoadBalancing;
    return this;
  }

  /**
   * Get crossZoneLoadBalancing
   * @return crossZoneLoadBalancing
   */
  @javax.annotation.Nullable
  public AwsElbLoadBalancerAttributesCrossZoneLoadBalancing getCrossZoneLoadBalancing() {
    return crossZoneLoadBalancing;
  }

  public void setCrossZoneLoadBalancing(AwsElbLoadBalancerAttributesCrossZoneLoadBalancing crossZoneLoadBalancing) {
    this.crossZoneLoadBalancing = crossZoneLoadBalancing;
  }


  public AwsElbLoadBalancerDetailsLoadBalancerAttributes additionalAttributes(List additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  /**
   * Get additionalAttributes
   * @return additionalAttributes
   */
  @javax.annotation.Nullable
  public List getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsElbLoadBalancerDetailsLoadBalancerAttributes awsElbLoadBalancerDetailsLoadBalancerAttributes = (AwsElbLoadBalancerDetailsLoadBalancerAttributes) o;
    return Objects.equals(this.accessLog, awsElbLoadBalancerDetailsLoadBalancerAttributes.accessLog) &&
        Objects.equals(this.connectionDraining, awsElbLoadBalancerDetailsLoadBalancerAttributes.connectionDraining) &&
        Objects.equals(this.connectionSettings, awsElbLoadBalancerDetailsLoadBalancerAttributes.connectionSettings) &&
        Objects.equals(this.crossZoneLoadBalancing, awsElbLoadBalancerDetailsLoadBalancerAttributes.crossZoneLoadBalancing) &&
        Objects.equals(this.additionalAttributes, awsElbLoadBalancerDetailsLoadBalancerAttributes.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLog, connectionDraining, connectionSettings, crossZoneLoadBalancing, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsElbLoadBalancerDetailsLoadBalancerAttributes {\n");
    sb.append("    accessLog: ").append(toIndentedString(accessLog)).append("\n");
    sb.append("    connectionDraining: ").append(toIndentedString(connectionDraining)).append("\n");
    sb.append("    connectionSettings: ").append(toIndentedString(connectionSettings)).append("\n");
    sb.append("    crossZoneLoadBalancing: ").append(toIndentedString(crossZoneLoadBalancing)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("AccessLog");
    openapiFields.add("ConnectionDraining");
    openapiFields.add("ConnectionSettings");
    openapiFields.add("CrossZoneLoadBalancing");
    openapiFields.add("AdditionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsElbLoadBalancerDetailsLoadBalancerAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsElbLoadBalancerDetailsLoadBalancerAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsElbLoadBalancerDetailsLoadBalancerAttributes is not found in the empty JSON string", AwsElbLoadBalancerDetailsLoadBalancerAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsElbLoadBalancerDetailsLoadBalancerAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsElbLoadBalancerDetailsLoadBalancerAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccessLog`
      if (jsonObj.get("AccessLog") != null && !jsonObj.get("AccessLog").isJsonNull()) {
        AwsElbLoadBalancerAttributesAccessLog.validateJsonElement(jsonObj.get("AccessLog"));
      }
      // validate the optional field `ConnectionDraining`
      if (jsonObj.get("ConnectionDraining") != null && !jsonObj.get("ConnectionDraining").isJsonNull()) {
        AwsElbLoadBalancerAttributesConnectionDraining.validateJsonElement(jsonObj.get("ConnectionDraining"));
      }
      // validate the optional field `ConnectionSettings`
      if (jsonObj.get("ConnectionSettings") != null && !jsonObj.get("ConnectionSettings").isJsonNull()) {
        AwsElbLoadBalancerAttributesConnectionSettings.validateJsonElement(jsonObj.get("ConnectionSettings"));
      }
      // validate the optional field `CrossZoneLoadBalancing`
      if (jsonObj.get("CrossZoneLoadBalancing") != null && !jsonObj.get("CrossZoneLoadBalancing").isJsonNull()) {
        AwsElbLoadBalancerAttributesCrossZoneLoadBalancing.validateJsonElement(jsonObj.get("CrossZoneLoadBalancing"));
      }
      // validate the optional field `AdditionalAttributes`
      if (jsonObj.get("AdditionalAttributes") != null && !jsonObj.get("AdditionalAttributes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AdditionalAttributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsElbLoadBalancerDetailsLoadBalancerAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsElbLoadBalancerDetailsLoadBalancerAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsElbLoadBalancerDetailsLoadBalancerAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsElbLoadBalancerDetailsLoadBalancerAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsElbLoadBalancerDetailsLoadBalancerAttributes>() {
           @Override
           public void write(JsonWriter out, AwsElbLoadBalancerDetailsLoadBalancerAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsElbLoadBalancerDetailsLoadBalancerAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsElbLoadBalancerDetailsLoadBalancerAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsElbLoadBalancerDetailsLoadBalancerAttributes
   * @throws IOException if the JSON string is invalid with respect to AwsElbLoadBalancerDetailsLoadBalancerAttributes
   */
  public static AwsElbLoadBalancerDetailsLoadBalancerAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsElbLoadBalancerDetailsLoadBalancerAttributes.class);
  }

  /**
   * Convert an instance of AwsElbLoadBalancerDetailsLoadBalancerAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

