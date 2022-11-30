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
 * Criteria for the stateless rule.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RuleGroupSourceStatelessRuleMatchAttributes {
  public static final String SERIALIZED_NAME_DESTINATION_PORTS = "DestinationPorts";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PORTS)
  private List destinationPorts;

  public static final String SERIALIZED_NAME_DESTINATIONS = "Destinations";
  @SerializedName(SERIALIZED_NAME_DESTINATIONS)
  private List destinations;

  public static final String SERIALIZED_NAME_PROTOCOLS = "Protocols";
  @SerializedName(SERIALIZED_NAME_PROTOCOLS)
  private List protocols;

  public static final String SERIALIZED_NAME_SOURCE_PORTS = "SourcePorts";
  @SerializedName(SERIALIZED_NAME_SOURCE_PORTS)
  private List sourcePorts;

  public static final String SERIALIZED_NAME_SOURCES = "Sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List sources;

  public static final String SERIALIZED_NAME_TCP_FLAGS = "TcpFlags";
  @SerializedName(SERIALIZED_NAME_TCP_FLAGS)
  private List tcpFlags;

  public RuleGroupSourceStatelessRuleMatchAttributes() {
  }

  public RuleGroupSourceStatelessRuleMatchAttributes destinationPorts(List destinationPorts) {
    this.destinationPorts = destinationPorts;
    return this;
  }

  /**
   * Get destinationPorts
   * @return destinationPorts
   */
  @javax.annotation.Nullable
  public List getDestinationPorts() {
    return destinationPorts;
  }

  public void setDestinationPorts(List destinationPorts) {
    this.destinationPorts = destinationPorts;
  }


  public RuleGroupSourceStatelessRuleMatchAttributes destinations(List destinations) {
    this.destinations = destinations;
    return this;
  }

  /**
   * Get destinations
   * @return destinations
   */
  @javax.annotation.Nullable
  public List getDestinations() {
    return destinations;
  }

  public void setDestinations(List destinations) {
    this.destinations = destinations;
  }


  public RuleGroupSourceStatelessRuleMatchAttributes protocols(List protocols) {
    this.protocols = protocols;
    return this;
  }

  /**
   * Get protocols
   * @return protocols
   */
  @javax.annotation.Nullable
  public List getProtocols() {
    return protocols;
  }

  public void setProtocols(List protocols) {
    this.protocols = protocols;
  }


  public RuleGroupSourceStatelessRuleMatchAttributes sourcePorts(List sourcePorts) {
    this.sourcePorts = sourcePorts;
    return this;
  }

  /**
   * Get sourcePorts
   * @return sourcePorts
   */
  @javax.annotation.Nullable
  public List getSourcePorts() {
    return sourcePorts;
  }

  public void setSourcePorts(List sourcePorts) {
    this.sourcePorts = sourcePorts;
  }


  public RuleGroupSourceStatelessRuleMatchAttributes sources(List sources) {
    this.sources = sources;
    return this;
  }

  /**
   * Get sources
   * @return sources
   */
  @javax.annotation.Nullable
  public List getSources() {
    return sources;
  }

  public void setSources(List sources) {
    this.sources = sources;
  }


  public RuleGroupSourceStatelessRuleMatchAttributes tcpFlags(List tcpFlags) {
    this.tcpFlags = tcpFlags;
    return this;
  }

  /**
   * Get tcpFlags
   * @return tcpFlags
   */
  @javax.annotation.Nullable
  public List getTcpFlags() {
    return tcpFlags;
  }

  public void setTcpFlags(List tcpFlags) {
    this.tcpFlags = tcpFlags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleGroupSourceStatelessRuleMatchAttributes ruleGroupSourceStatelessRuleMatchAttributes = (RuleGroupSourceStatelessRuleMatchAttributes) o;
    return Objects.equals(this.destinationPorts, ruleGroupSourceStatelessRuleMatchAttributes.destinationPorts) &&
        Objects.equals(this.destinations, ruleGroupSourceStatelessRuleMatchAttributes.destinations) &&
        Objects.equals(this.protocols, ruleGroupSourceStatelessRuleMatchAttributes.protocols) &&
        Objects.equals(this.sourcePorts, ruleGroupSourceStatelessRuleMatchAttributes.sourcePorts) &&
        Objects.equals(this.sources, ruleGroupSourceStatelessRuleMatchAttributes.sources) &&
        Objects.equals(this.tcpFlags, ruleGroupSourceStatelessRuleMatchAttributes.tcpFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPorts, destinations, protocols, sourcePorts, sources, tcpFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleGroupSourceStatelessRuleMatchAttributes {\n");
    sb.append("    destinationPorts: ").append(toIndentedString(destinationPorts)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    sourcePorts: ").append(toIndentedString(sourcePorts)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    tcpFlags: ").append(toIndentedString(tcpFlags)).append("\n");
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
    openapiFields.add("DestinationPorts");
    openapiFields.add("Destinations");
    openapiFields.add("Protocols");
    openapiFields.add("SourcePorts");
    openapiFields.add("Sources");
    openapiFields.add("TcpFlags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RuleGroupSourceStatelessRuleMatchAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuleGroupSourceStatelessRuleMatchAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleGroupSourceStatelessRuleMatchAttributes is not found in the empty JSON string", RuleGroupSourceStatelessRuleMatchAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuleGroupSourceStatelessRuleMatchAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleGroupSourceStatelessRuleMatchAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DestinationPorts`
      if (jsonObj.get("DestinationPorts") != null && !jsonObj.get("DestinationPorts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("DestinationPorts"));
      }
      // validate the optional field `Destinations`
      if (jsonObj.get("Destinations") != null && !jsonObj.get("Destinations").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Destinations"));
      }
      // validate the optional field `Protocols`
      if (jsonObj.get("Protocols") != null && !jsonObj.get("Protocols").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Protocols"));
      }
      // validate the optional field `SourcePorts`
      if (jsonObj.get("SourcePorts") != null && !jsonObj.get("SourcePorts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SourcePorts"));
      }
      // validate the optional field `Sources`
      if (jsonObj.get("Sources") != null && !jsonObj.get("Sources").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Sources"));
      }
      // validate the optional field `TcpFlags`
      if (jsonObj.get("TcpFlags") != null && !jsonObj.get("TcpFlags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TcpFlags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleGroupSourceStatelessRuleMatchAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleGroupSourceStatelessRuleMatchAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleGroupSourceStatelessRuleMatchAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleGroupSourceStatelessRuleMatchAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleGroupSourceStatelessRuleMatchAttributes>() {
           @Override
           public void write(JsonWriter out, RuleGroupSourceStatelessRuleMatchAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleGroupSourceStatelessRuleMatchAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RuleGroupSourceStatelessRuleMatchAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RuleGroupSourceStatelessRuleMatchAttributes
   * @throws IOException if the JSON string is invalid with respect to RuleGroupSourceStatelessRuleMatchAttributes
   */
  public static RuleGroupSourceStatelessRuleMatchAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleGroupSourceStatelessRuleMatchAttributes.class);
  }

  /**
   * Convert an instance of RuleGroupSourceStatelessRuleMatchAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

