/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import org.openapitools.client.model.NetworkProtocol;

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
 * CloseInstancePublicPortsRequestPortInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloseInstancePublicPortsRequestPortInfo {
  public static final String SERIALIZED_NAME_FROM_PORT = "fromPort";
  @SerializedName(SERIALIZED_NAME_FROM_PORT)
  private Integer fromPort;

  public static final String SERIALIZED_NAME_TO_PORT = "toPort";
  @SerializedName(SERIALIZED_NAME_TO_PORT)
  private Integer toPort;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private NetworkProtocol protocol;

  public static final String SERIALIZED_NAME_CIDRS = "cidrs";
  @SerializedName(SERIALIZED_NAME_CIDRS)
  private List cidrs;

  public static final String SERIALIZED_NAME_IPV6_CIDRS = "ipv6Cidrs";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDRS)
  private List ipv6Cidrs;

  public static final String SERIALIZED_NAME_CIDR_LIST_ALIASES = "cidrListAliases";
  @SerializedName(SERIALIZED_NAME_CIDR_LIST_ALIASES)
  private List cidrListAliases;

  public CloseInstancePublicPortsRequestPortInfo() {
  }

  public CloseInstancePublicPortsRequestPortInfo fromPort(Integer fromPort) {
    this.fromPort = fromPort;
    return this;
  }

  /**
   * Get fromPort
   * @return fromPort
   */
  @javax.annotation.Nullable
  public Integer getFromPort() {
    return fromPort;
  }

  public void setFromPort(Integer fromPort) {
    this.fromPort = fromPort;
  }


  public CloseInstancePublicPortsRequestPortInfo toPort(Integer toPort) {
    this.toPort = toPort;
    return this;
  }

  /**
   * Get toPort
   * @return toPort
   */
  @javax.annotation.Nullable
  public Integer getToPort() {
    return toPort;
  }

  public void setToPort(Integer toPort) {
    this.toPort = toPort;
  }


  public CloseInstancePublicPortsRequestPortInfo protocol(NetworkProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
   */
  @javax.annotation.Nullable
  public NetworkProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(NetworkProtocol protocol) {
    this.protocol = protocol;
  }


  public CloseInstancePublicPortsRequestPortInfo cidrs(List cidrs) {
    this.cidrs = cidrs;
    return this;
  }

  /**
   * Get cidrs
   * @return cidrs
   */
  @javax.annotation.Nullable
  public List getCidrs() {
    return cidrs;
  }

  public void setCidrs(List cidrs) {
    this.cidrs = cidrs;
  }


  public CloseInstancePublicPortsRequestPortInfo ipv6Cidrs(List ipv6Cidrs) {
    this.ipv6Cidrs = ipv6Cidrs;
    return this;
  }

  /**
   * Get ipv6Cidrs
   * @return ipv6Cidrs
   */
  @javax.annotation.Nullable
  public List getIpv6Cidrs() {
    return ipv6Cidrs;
  }

  public void setIpv6Cidrs(List ipv6Cidrs) {
    this.ipv6Cidrs = ipv6Cidrs;
  }


  public CloseInstancePublicPortsRequestPortInfo cidrListAliases(List cidrListAliases) {
    this.cidrListAliases = cidrListAliases;
    return this;
  }

  /**
   * Get cidrListAliases
   * @return cidrListAliases
   */
  @javax.annotation.Nullable
  public List getCidrListAliases() {
    return cidrListAliases;
  }

  public void setCidrListAliases(List cidrListAliases) {
    this.cidrListAliases = cidrListAliases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseInstancePublicPortsRequestPortInfo closeInstancePublicPortsRequestPortInfo = (CloseInstancePublicPortsRequestPortInfo) o;
    return Objects.equals(this.fromPort, closeInstancePublicPortsRequestPortInfo.fromPort) &&
        Objects.equals(this.toPort, closeInstancePublicPortsRequestPortInfo.toPort) &&
        Objects.equals(this.protocol, closeInstancePublicPortsRequestPortInfo.protocol) &&
        Objects.equals(this.cidrs, closeInstancePublicPortsRequestPortInfo.cidrs) &&
        Objects.equals(this.ipv6Cidrs, closeInstancePublicPortsRequestPortInfo.ipv6Cidrs) &&
        Objects.equals(this.cidrListAliases, closeInstancePublicPortsRequestPortInfo.cidrListAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromPort, toPort, protocol, cidrs, ipv6Cidrs, cidrListAliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseInstancePublicPortsRequestPortInfo {\n");
    sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
    sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
    sb.append("    ipv6Cidrs: ").append(toIndentedString(ipv6Cidrs)).append("\n");
    sb.append("    cidrListAliases: ").append(toIndentedString(cidrListAliases)).append("\n");
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
    openapiFields.add("fromPort");
    openapiFields.add("toPort");
    openapiFields.add("protocol");
    openapiFields.add("cidrs");
    openapiFields.add("ipv6Cidrs");
    openapiFields.add("cidrListAliases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloseInstancePublicPortsRequestPortInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloseInstancePublicPortsRequestPortInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloseInstancePublicPortsRequestPortInfo is not found in the empty JSON string", CloseInstancePublicPortsRequestPortInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloseInstancePublicPortsRequestPortInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloseInstancePublicPortsRequestPortInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fromPort`
      if (jsonObj.get("fromPort") != null && !jsonObj.get("fromPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("fromPort"));
      }
      // validate the optional field `toPort`
      if (jsonObj.get("toPort") != null && !jsonObj.get("toPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("toPort"));
      }
      // validate the optional field `protocol`
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) {
        NetworkProtocol.validateJsonElement(jsonObj.get("protocol"));
      }
      // validate the optional field `cidrs`
      if (jsonObj.get("cidrs") != null && !jsonObj.get("cidrs").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("cidrs"));
      }
      // validate the optional field `ipv6Cidrs`
      if (jsonObj.get("ipv6Cidrs") != null && !jsonObj.get("ipv6Cidrs").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ipv6Cidrs"));
      }
      // validate the optional field `cidrListAliases`
      if (jsonObj.get("cidrListAliases") != null && !jsonObj.get("cidrListAliases").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("cidrListAliases"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloseInstancePublicPortsRequestPortInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloseInstancePublicPortsRequestPortInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloseInstancePublicPortsRequestPortInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloseInstancePublicPortsRequestPortInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CloseInstancePublicPortsRequestPortInfo>() {
           @Override
           public void write(JsonWriter out, CloseInstancePublicPortsRequestPortInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloseInstancePublicPortsRequestPortInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloseInstancePublicPortsRequestPortInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloseInstancePublicPortsRequestPortInfo
   * @throws IOException if the JSON string is invalid with respect to CloseInstancePublicPortsRequestPortInfo
   */
  public static CloseInstancePublicPortsRequestPortInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloseInstancePublicPortsRequestPortInfo.class);
  }

  /**
   * Convert an instance of CloseInstancePublicPortsRequestPortInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

