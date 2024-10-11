/*
 * Service Control API
 * Provides admission control and telemetry reporting for services integrated with Service Infrastructure. 
 *
 * The version of the OpenAPI document: v2
 * 
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
 * A common proto for logging HTTP requests. Only contains semantics defined by the HTTP specification. Product-specific logging information MUST be defined in a separate message.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:54.152517-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class V2HttpRequest {
  public static final String SERIALIZED_NAME_CACHE_FILL_BYTES = "cacheFillBytes";
  @SerializedName(SERIALIZED_NAME_CACHE_FILL_BYTES)
  private String cacheFillBytes;

  public static final String SERIALIZED_NAME_CACHE_HIT = "cacheHit";
  @SerializedName(SERIALIZED_NAME_CACHE_HIT)
  private Boolean cacheHit;

  public static final String SERIALIZED_NAME_CACHE_LOOKUP = "cacheLookup";
  @SerializedName(SERIALIZED_NAME_CACHE_LOOKUP)
  private Boolean cacheLookup;

  public static final String SERIALIZED_NAME_CACHE_VALIDATED_WITH_ORIGIN_SERVER = "cacheValidatedWithOriginServer";
  @SerializedName(SERIALIZED_NAME_CACHE_VALIDATED_WITH_ORIGIN_SERVER)
  private Boolean cacheValidatedWithOriginServer;

  public static final String SERIALIZED_NAME_LATENCY = "latency";
  @SerializedName(SERIALIZED_NAME_LATENCY)
  private String latency;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_REFERER = "referer";
  @SerializedName(SERIALIZED_NAME_REFERER)
  private String referer;

  public static final String SERIALIZED_NAME_REMOTE_IP = "remoteIp";
  @SerializedName(SERIALIZED_NAME_REMOTE_IP)
  private String remoteIp;

  public static final String SERIALIZED_NAME_REQUEST_METHOD = "requestMethod";
  @SerializedName(SERIALIZED_NAME_REQUEST_METHOD)
  private String requestMethod;

  public static final String SERIALIZED_NAME_REQUEST_SIZE = "requestSize";
  @SerializedName(SERIALIZED_NAME_REQUEST_SIZE)
  private String requestSize;

  public static final String SERIALIZED_NAME_REQUEST_URL = "requestUrl";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_RESPONSE_SIZE = "responseSize";
  @SerializedName(SERIALIZED_NAME_RESPONSE_SIZE)
  private String responseSize;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_USER_AGENT = "userAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public V2HttpRequest() {
  }

  public V2HttpRequest cacheFillBytes(String cacheFillBytes) {
    this.cacheFillBytes = cacheFillBytes;
    return this;
  }

  /**
   * The number of HTTP response bytes inserted into cache. Set only when a cache fill was attempted.
   * @return cacheFillBytes
   */
  @javax.annotation.Nullable
  public String getCacheFillBytes() {
    return cacheFillBytes;
  }

  public void setCacheFillBytes(String cacheFillBytes) {
    this.cacheFillBytes = cacheFillBytes;
  }


  public V2HttpRequest cacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * Whether or not an entity was served from cache (with or without validation).
   * @return cacheHit
   */
  @javax.annotation.Nullable
  public Boolean getCacheHit() {
    return cacheHit;
  }

  public void setCacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
  }


  public V2HttpRequest cacheLookup(Boolean cacheLookup) {
    this.cacheLookup = cacheLookup;
    return this;
  }

  /**
   * Whether or not a cache lookup was attempted.
   * @return cacheLookup
   */
  @javax.annotation.Nullable
  public Boolean getCacheLookup() {
    return cacheLookup;
  }

  public void setCacheLookup(Boolean cacheLookup) {
    this.cacheLookup = cacheLookup;
  }


  public V2HttpRequest cacheValidatedWithOriginServer(Boolean cacheValidatedWithOriginServer) {
    this.cacheValidatedWithOriginServer = cacheValidatedWithOriginServer;
    return this;
  }

  /**
   * Whether or not the response was validated with the origin server before being served from cache. This field is only meaningful if &#x60;cache_hit&#x60; is True.
   * @return cacheValidatedWithOriginServer
   */
  @javax.annotation.Nullable
  public Boolean getCacheValidatedWithOriginServer() {
    return cacheValidatedWithOriginServer;
  }

  public void setCacheValidatedWithOriginServer(Boolean cacheValidatedWithOriginServer) {
    this.cacheValidatedWithOriginServer = cacheValidatedWithOriginServer;
  }


  public V2HttpRequest latency(String latency) {
    this.latency = latency;
    return this;
  }

  /**
   * The request processing latency on the server, from the time the request was received until the response was sent.
   * @return latency
   */
  @javax.annotation.Nullable
  public String getLatency() {
    return latency;
  }

  public void setLatency(String latency) {
    this.latency = latency;
  }


  public V2HttpRequest protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol used for the request. Examples: \&quot;HTTP/1.1\&quot;, \&quot;HTTP/2\&quot;, \&quot;websocket\&quot;
   * @return protocol
   */
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public V2HttpRequest referer(String referer) {
    this.referer = referer;
    return this;
  }

  /**
   * The referer URL of the request, as defined in [HTTP/1.1 Header Field Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
   * @return referer
   */
  @javax.annotation.Nullable
  public String getReferer() {
    return referer;
  }

  public void setReferer(String referer) {
    this.referer = referer;
  }


  public V2HttpRequest remoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }

  /**
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples: &#x60;\&quot;192.168.1.1\&quot;&#x60;, &#x60;\&quot;FE80::0202:B3FF:FE1E:8329\&quot;&#x60;.
   * @return remoteIp
   */
  @javax.annotation.Nullable
  public String getRemoteIp() {
    return remoteIp;
  }

  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }


  public V2HttpRequest requestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

  /**
   * The request method. Examples: &#x60;\&quot;GET\&quot;&#x60;, &#x60;\&quot;HEAD\&quot;&#x60;, &#x60;\&quot;PUT\&quot;&#x60;, &#x60;\&quot;POST\&quot;&#x60;.
   * @return requestMethod
   */
  @javax.annotation.Nullable
  public String getRequestMethod() {
    return requestMethod;
  }

  public void setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
  }


  public V2HttpRequest requestSize(String requestSize) {
    this.requestSize = requestSize;
    return this;
  }

  /**
   * The size of the HTTP request message in bytes, including the request headers and the request body.
   * @return requestSize
   */
  @javax.annotation.Nullable
  public String getRequestSize() {
    return requestSize;
  }

  public void setRequestSize(String requestSize) {
    this.requestSize = requestSize;
  }


  public V2HttpRequest requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * The scheme (http, https), the host name, the path, and the query portion of the URL that was requested. Example: &#x60;\&quot;http://example.com/some/info?color&#x3D;red\&quot;&#x60;.
   * @return requestUrl
   */
  @javax.annotation.Nullable
  public String getRequestUrl() {
    return requestUrl;
  }

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public V2HttpRequest responseSize(String responseSize) {
    this.responseSize = responseSize;
    return this;
  }

  /**
   * The size of the HTTP response message sent back to the client, in bytes, including the response headers and the response body.
   * @return responseSize
   */
  @javax.annotation.Nullable
  public String getResponseSize() {
    return responseSize;
  }

  public void setResponseSize(String responseSize) {
    this.responseSize = responseSize;
  }


  public V2HttpRequest serverIp(String serverIp) {
    this.serverIp = serverIp;
    return this;
  }

  /**
   * The IP address (IPv4 or IPv6) of the origin server that the request was sent to.
   * @return serverIp
   */
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }

  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }


  public V2HttpRequest status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The response code indicating the status of the response. Examples: 200, 404.
   * @return status
   */
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public V2HttpRequest userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * The user agent sent by the client. Example: &#x60;\&quot;Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)\&quot;&#x60;.
   * @return userAgent
   */
  @javax.annotation.Nullable
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HttpRequest v2HttpRequest = (V2HttpRequest) o;
    return Objects.equals(this.cacheFillBytes, v2HttpRequest.cacheFillBytes) &&
        Objects.equals(this.cacheHit, v2HttpRequest.cacheHit) &&
        Objects.equals(this.cacheLookup, v2HttpRequest.cacheLookup) &&
        Objects.equals(this.cacheValidatedWithOriginServer, v2HttpRequest.cacheValidatedWithOriginServer) &&
        Objects.equals(this.latency, v2HttpRequest.latency) &&
        Objects.equals(this.protocol, v2HttpRequest.protocol) &&
        Objects.equals(this.referer, v2HttpRequest.referer) &&
        Objects.equals(this.remoteIp, v2HttpRequest.remoteIp) &&
        Objects.equals(this.requestMethod, v2HttpRequest.requestMethod) &&
        Objects.equals(this.requestSize, v2HttpRequest.requestSize) &&
        Objects.equals(this.requestUrl, v2HttpRequest.requestUrl) &&
        Objects.equals(this.responseSize, v2HttpRequest.responseSize) &&
        Objects.equals(this.serverIp, v2HttpRequest.serverIp) &&
        Objects.equals(this.status, v2HttpRequest.status) &&
        Objects.equals(this.userAgent, v2HttpRequest.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheFillBytes, cacheHit, cacheLookup, cacheValidatedWithOriginServer, latency, protocol, referer, remoteIp, requestMethod, requestSize, requestUrl, responseSize, serverIp, status, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HttpRequest {\n");
    sb.append("    cacheFillBytes: ").append(toIndentedString(cacheFillBytes)).append("\n");
    sb.append("    cacheHit: ").append(toIndentedString(cacheHit)).append("\n");
    sb.append("    cacheLookup: ").append(toIndentedString(cacheLookup)).append("\n");
    sb.append("    cacheValidatedWithOriginServer: ").append(toIndentedString(cacheValidatedWithOriginServer)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
    sb.append("    requestSize: ").append(toIndentedString(requestSize)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
    openapiFields.add("cacheFillBytes");
    openapiFields.add("cacheHit");
    openapiFields.add("cacheLookup");
    openapiFields.add("cacheValidatedWithOriginServer");
    openapiFields.add("latency");
    openapiFields.add("protocol");
    openapiFields.add("referer");
    openapiFields.add("remoteIp");
    openapiFields.add("requestMethod");
    openapiFields.add("requestSize");
    openapiFields.add("requestUrl");
    openapiFields.add("responseSize");
    openapiFields.add("serverIp");
    openapiFields.add("status");
    openapiFields.add("userAgent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2HttpRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2HttpRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HttpRequest is not found in the empty JSON string", V2HttpRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2HttpRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HttpRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cacheFillBytes") != null && !jsonObj.get("cacheFillBytes").isJsonNull()) && !jsonObj.get("cacheFillBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cacheFillBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cacheFillBytes").toString()));
      }
      if ((jsonObj.get("latency") != null && !jsonObj.get("latency").isJsonNull()) && !jsonObj.get("latency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latency").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("referer") != null && !jsonObj.get("referer").isJsonNull()) && !jsonObj.get("referer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referer").toString()));
      }
      if ((jsonObj.get("remoteIp") != null && !jsonObj.get("remoteIp").isJsonNull()) && !jsonObj.get("remoteIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteIp").toString()));
      }
      if ((jsonObj.get("requestMethod") != null && !jsonObj.get("requestMethod").isJsonNull()) && !jsonObj.get("requestMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestMethod").toString()));
      }
      if ((jsonObj.get("requestSize") != null && !jsonObj.get("requestSize").isJsonNull()) && !jsonObj.get("requestSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestSize").toString()));
      }
      if ((jsonObj.get("requestUrl") != null && !jsonObj.get("requestUrl").isJsonNull()) && !jsonObj.get("requestUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestUrl").toString()));
      }
      if ((jsonObj.get("responseSize") != null && !jsonObj.get("responseSize").isJsonNull()) && !jsonObj.get("responseSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseSize").toString()));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      if ((jsonObj.get("userAgent") != null && !jsonObj.get("userAgent").isJsonNull()) && !jsonObj.get("userAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userAgent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HttpRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HttpRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HttpRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HttpRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HttpRequest>() {
           @Override
           public void write(JsonWriter out, V2HttpRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HttpRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2HttpRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2HttpRequest
   * @throws IOException if the JSON string is invalid with respect to V2HttpRequest
   */
  public static V2HttpRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HttpRequest.class);
  }

  /**
   * Convert an instance of V2HttpRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

