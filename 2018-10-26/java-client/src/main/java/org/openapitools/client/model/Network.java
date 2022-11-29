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
import org.openapitools.client.model.NetworkDirection;
import org.openapitools.client.model.NetworkOpenPortRange;

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
 * The details of network-related information about a finding.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Network {
  public static final String SERIALIZED_NAME_DIRECTION = "Direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private NetworkDirection direction;

  public static final String SERIALIZED_NAME_PROTOCOL = "Protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_OPEN_PORT_RANGE = "OpenPortRange";
  @SerializedName(SERIALIZED_NAME_OPEN_PORT_RANGE)
  private NetworkOpenPortRange openPortRange;

  public static final String SERIALIZED_NAME_SOURCE_IP_V4 = "SourceIpV4";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP_V4)
  private String sourceIpV4;

  public static final String SERIALIZED_NAME_SOURCE_IP_V6 = "SourceIpV6";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP_V6)
  private String sourceIpV6;

  public static final String SERIALIZED_NAME_SOURCE_PORT = "SourcePort";
  @SerializedName(SERIALIZED_NAME_SOURCE_PORT)
  private Integer sourcePort;

  public static final String SERIALIZED_NAME_SOURCE_DOMAIN = "SourceDomain";
  @SerializedName(SERIALIZED_NAME_SOURCE_DOMAIN)
  private String sourceDomain;

  public static final String SERIALIZED_NAME_SOURCE_MAC = "SourceMac";
  @SerializedName(SERIALIZED_NAME_SOURCE_MAC)
  private String sourceMac;

  public static final String SERIALIZED_NAME_DESTINATION_IP_V4 = "DestinationIpV4";
  @SerializedName(SERIALIZED_NAME_DESTINATION_IP_V4)
  private String destinationIpV4;

  public static final String SERIALIZED_NAME_DESTINATION_IP_V6 = "DestinationIpV6";
  @SerializedName(SERIALIZED_NAME_DESTINATION_IP_V6)
  private String destinationIpV6;

  public static final String SERIALIZED_NAME_DESTINATION_PORT = "DestinationPort";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PORT)
  private Integer destinationPort;

  public static final String SERIALIZED_NAME_DESTINATION_DOMAIN = "DestinationDomain";
  @SerializedName(SERIALIZED_NAME_DESTINATION_DOMAIN)
  private String destinationDomain;

  public Network() {
  }

  public Network direction(NetworkDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nullable
  public NetworkDirection getDirection() {
    return direction;
  }

  public void setDirection(NetworkDirection direction) {
    this.direction = direction;
  }


  public Network protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
   */
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Network openPortRange(NetworkOpenPortRange openPortRange) {
    this.openPortRange = openPortRange;
    return this;
  }

  /**
   * Get openPortRange
   * @return openPortRange
   */
  @javax.annotation.Nullable
  public NetworkOpenPortRange getOpenPortRange() {
    return openPortRange;
  }

  public void setOpenPortRange(NetworkOpenPortRange openPortRange) {
    this.openPortRange = openPortRange;
  }


  public Network sourceIpV4(String sourceIpV4) {
    this.sourceIpV4 = sourceIpV4;
    return this;
  }

  /**
   * Get sourceIpV4
   * @return sourceIpV4
   */
  @javax.annotation.Nullable
  public String getSourceIpV4() {
    return sourceIpV4;
  }

  public void setSourceIpV4(String sourceIpV4) {
    this.sourceIpV4 = sourceIpV4;
  }


  public Network sourceIpV6(String sourceIpV6) {
    this.sourceIpV6 = sourceIpV6;
    return this;
  }

  /**
   * Get sourceIpV6
   * @return sourceIpV6
   */
  @javax.annotation.Nullable
  public String getSourceIpV6() {
    return sourceIpV6;
  }

  public void setSourceIpV6(String sourceIpV6) {
    this.sourceIpV6 = sourceIpV6;
  }


  public Network sourcePort(Integer sourcePort) {
    this.sourcePort = sourcePort;
    return this;
  }

  /**
   * Get sourcePort
   * @return sourcePort
   */
  @javax.annotation.Nullable
  public Integer getSourcePort() {
    return sourcePort;
  }

  public void setSourcePort(Integer sourcePort) {
    this.sourcePort = sourcePort;
  }


  public Network sourceDomain(String sourceDomain) {
    this.sourceDomain = sourceDomain;
    return this;
  }

  /**
   * Get sourceDomain
   * @return sourceDomain
   */
  @javax.annotation.Nullable
  public String getSourceDomain() {
    return sourceDomain;
  }

  public void setSourceDomain(String sourceDomain) {
    this.sourceDomain = sourceDomain;
  }


  public Network sourceMac(String sourceMac) {
    this.sourceMac = sourceMac;
    return this;
  }

  /**
   * Get sourceMac
   * @return sourceMac
   */
  @javax.annotation.Nullable
  public String getSourceMac() {
    return sourceMac;
  }

  public void setSourceMac(String sourceMac) {
    this.sourceMac = sourceMac;
  }


  public Network destinationIpV4(String destinationIpV4) {
    this.destinationIpV4 = destinationIpV4;
    return this;
  }

  /**
   * Get destinationIpV4
   * @return destinationIpV4
   */
  @javax.annotation.Nullable
  public String getDestinationIpV4() {
    return destinationIpV4;
  }

  public void setDestinationIpV4(String destinationIpV4) {
    this.destinationIpV4 = destinationIpV4;
  }


  public Network destinationIpV6(String destinationIpV6) {
    this.destinationIpV6 = destinationIpV6;
    return this;
  }

  /**
   * Get destinationIpV6
   * @return destinationIpV6
   */
  @javax.annotation.Nullable
  public String getDestinationIpV6() {
    return destinationIpV6;
  }

  public void setDestinationIpV6(String destinationIpV6) {
    this.destinationIpV6 = destinationIpV6;
  }


  public Network destinationPort(Integer destinationPort) {
    this.destinationPort = destinationPort;
    return this;
  }

  /**
   * Get destinationPort
   * @return destinationPort
   */
  @javax.annotation.Nullable
  public Integer getDestinationPort() {
    return destinationPort;
  }

  public void setDestinationPort(Integer destinationPort) {
    this.destinationPort = destinationPort;
  }


  public Network destinationDomain(String destinationDomain) {
    this.destinationDomain = destinationDomain;
    return this;
  }

  /**
   * Get destinationDomain
   * @return destinationDomain
   */
  @javax.annotation.Nullable
  public String getDestinationDomain() {
    return destinationDomain;
  }

  public void setDestinationDomain(String destinationDomain) {
    this.destinationDomain = destinationDomain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.direction, network.direction) &&
        Objects.equals(this.protocol, network.protocol) &&
        Objects.equals(this.openPortRange, network.openPortRange) &&
        Objects.equals(this.sourceIpV4, network.sourceIpV4) &&
        Objects.equals(this.sourceIpV6, network.sourceIpV6) &&
        Objects.equals(this.sourcePort, network.sourcePort) &&
        Objects.equals(this.sourceDomain, network.sourceDomain) &&
        Objects.equals(this.sourceMac, network.sourceMac) &&
        Objects.equals(this.destinationIpV4, network.destinationIpV4) &&
        Objects.equals(this.destinationIpV6, network.destinationIpV6) &&
        Objects.equals(this.destinationPort, network.destinationPort) &&
        Objects.equals(this.destinationDomain, network.destinationDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, protocol, openPortRange, sourceIpV4, sourceIpV6, sourcePort, sourceDomain, sourceMac, destinationIpV4, destinationIpV6, destinationPort, destinationDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    openPortRange: ").append(toIndentedString(openPortRange)).append("\n");
    sb.append("    sourceIpV4: ").append(toIndentedString(sourceIpV4)).append("\n");
    sb.append("    sourceIpV6: ").append(toIndentedString(sourceIpV6)).append("\n");
    sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
    sb.append("    sourceDomain: ").append(toIndentedString(sourceDomain)).append("\n");
    sb.append("    sourceMac: ").append(toIndentedString(sourceMac)).append("\n");
    sb.append("    destinationIpV4: ").append(toIndentedString(destinationIpV4)).append("\n");
    sb.append("    destinationIpV6: ").append(toIndentedString(destinationIpV6)).append("\n");
    sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
    sb.append("    destinationDomain: ").append(toIndentedString(destinationDomain)).append("\n");
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
    openapiFields.add("Direction");
    openapiFields.add("Protocol");
    openapiFields.add("OpenPortRange");
    openapiFields.add("SourceIpV4");
    openapiFields.add("SourceIpV6");
    openapiFields.add("SourcePort");
    openapiFields.add("SourceDomain");
    openapiFields.add("SourceMac");
    openapiFields.add("DestinationIpV4");
    openapiFields.add("DestinationIpV6");
    openapiFields.add("DestinationPort");
    openapiFields.add("DestinationDomain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Network
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Network.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Network is not found in the empty JSON string", Network.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Network.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Network` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Direction`
      if (jsonObj.get("Direction") != null && !jsonObj.get("Direction").isJsonNull()) {
        NetworkDirection.validateJsonElement(jsonObj.get("Direction"));
      }
      // validate the optional field `Protocol`
      if (jsonObj.get("Protocol") != null && !jsonObj.get("Protocol").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Protocol"));
      }
      // validate the optional field `OpenPortRange`
      if (jsonObj.get("OpenPortRange") != null && !jsonObj.get("OpenPortRange").isJsonNull()) {
        NetworkOpenPortRange.validateJsonElement(jsonObj.get("OpenPortRange"));
      }
      // validate the optional field `SourceIpV4`
      if (jsonObj.get("SourceIpV4") != null && !jsonObj.get("SourceIpV4").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceIpV4"));
      }
      // validate the optional field `SourceIpV6`
      if (jsonObj.get("SourceIpV6") != null && !jsonObj.get("SourceIpV6").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceIpV6"));
      }
      // validate the optional field `SourcePort`
      if (jsonObj.get("SourcePort") != null && !jsonObj.get("SourcePort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("SourcePort"));
      }
      // validate the optional field `SourceDomain`
      if (jsonObj.get("SourceDomain") != null && !jsonObj.get("SourceDomain").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceDomain"));
      }
      // validate the optional field `SourceMac`
      if (jsonObj.get("SourceMac") != null && !jsonObj.get("SourceMac").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceMac"));
      }
      // validate the optional field `DestinationIpV4`
      if (jsonObj.get("DestinationIpV4") != null && !jsonObj.get("DestinationIpV4").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DestinationIpV4"));
      }
      // validate the optional field `DestinationIpV6`
      if (jsonObj.get("DestinationIpV6") != null && !jsonObj.get("DestinationIpV6").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DestinationIpV6"));
      }
      // validate the optional field `DestinationPort`
      if (jsonObj.get("DestinationPort") != null && !jsonObj.get("DestinationPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DestinationPort"));
      }
      // validate the optional field `DestinationDomain`
      if (jsonObj.get("DestinationDomain") != null && !jsonObj.get("DestinationDomain").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DestinationDomain"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Network.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Network' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Network> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Network.class));

       return (TypeAdapter<T>) new TypeAdapter<Network>() {
           @Override
           public void write(JsonWriter out, Network value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Network read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Network given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Network
   * @throws IOException if the JSON string is invalid with respect to Network
   */
  public static Network fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Network.class);
  }

  /**
   * Convert an instance of Network to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

