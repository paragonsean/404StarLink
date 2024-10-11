/*
 * Elastic Load Balancing
 * <fullname>Elastic Load Balancing</fullname> <p>A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase the availability of your application. The load balancer also monitors the health of its registered targets and ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic by specifying one or more listeners, which are configured with a protocol and port number for connections from clients to the load balancer. You configure a target group with a protocol and port number for connections from the load balancer to the targets, and with health check settings to be used when checking the health status of the targets.</p> <p>Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load Balancers, Gateway Load Balancers, and Classic Load Balancers. This reference covers the following load balancer types:</p> <ul> <li> <p>Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.</p> </li> <li> <p>Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.</p> </li> <li> <p>Gateway Load Balancer - Operates at the network layer (layer 3).</p> </li> </ul> <p>For more information, see the <a href=\"https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/\">Elastic Load Balancing User Guide</a>.</p> <p>All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat an operation, it succeeds.</p>
 *
 * The version of the OpenAPI document: 2015-12-01
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
import org.openapitools.client.model.RedirectActionStatusCodeEnum;

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
 * &lt;p&gt;Information about a redirect action.&lt;/p&gt; &lt;p&gt;A URI consists of the following components: protocol://hostname:port/path?query. You must modify at least one of the following components to avoid a redirect loop: protocol, hostname, port, or path. Any components that you do not modify retain their original values.&lt;/p&gt; &lt;p&gt;You can reuse URI components using the following reserved keywords:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;#{protocol}&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;#{host}&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;#{port}&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;#{path} (the leading \&quot;/\&quot; is removed)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;#{query}&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example, you can change the path to \&quot;/new/#{path}\&quot;, the hostname to \&quot;example.#{host}\&quot;, or the query to \&quot;#{query}&amp;amp;value&#x3D;xyz\&quot;.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:07.748801-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RedirectActionConfig {
  public static final String SERIALIZED_NAME_PROTOCOL = "Protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_HOST = "Host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_QUERY = "Query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_STATUS_CODE = "StatusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private RedirectActionStatusCodeEnum statusCode;

  public RedirectActionConfig() {
  }

  public RedirectActionConfig protocol(String protocol) {
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


  public RedirectActionConfig port(String port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public RedirectActionConfig host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public RedirectActionConfig path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public RedirectActionConfig query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public RedirectActionConfig statusCode(RedirectActionStatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   */
  @javax.annotation.Nonnull
  public RedirectActionStatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(RedirectActionStatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectActionConfig redirectActionConfig = (RedirectActionConfig) o;
    return Objects.equals(this.protocol, redirectActionConfig.protocol) &&
        Objects.equals(this.port, redirectActionConfig.port) &&
        Objects.equals(this.host, redirectActionConfig.host) &&
        Objects.equals(this.path, redirectActionConfig.path) &&
        Objects.equals(this.query, redirectActionConfig.query) &&
        Objects.equals(this.statusCode, redirectActionConfig.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, port, host, path, query, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectActionConfig {\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
    openapiFields.add("Protocol");
    openapiFields.add("Port");
    openapiFields.add("Host");
    openapiFields.add("Path");
    openapiFields.add("Query");
    openapiFields.add("StatusCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("StatusCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RedirectActionConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedirectActionConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedirectActionConfig is not found in the empty JSON string", RedirectActionConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedirectActionConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedirectActionConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RedirectActionConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Protocol`
      if (jsonObj.get("Protocol") != null && !jsonObj.get("Protocol").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Protocol"));
      }
      // validate the optional field `Port`
      if (jsonObj.get("Port") != null && !jsonObj.get("Port").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Port"));
      }
      // validate the optional field `Host`
      if (jsonObj.get("Host") != null && !jsonObj.get("Host").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Host"));
      }
      // validate the optional field `Path`
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Path"));
      }
      // validate the optional field `Query`
      if (jsonObj.get("Query") != null && !jsonObj.get("Query").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Query"));
      }
      // validate the required field `StatusCode`
      RedirectActionStatusCodeEnum.validateJsonElement(jsonObj.get("StatusCode"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedirectActionConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedirectActionConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedirectActionConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedirectActionConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<RedirectActionConfig>() {
           @Override
           public void write(JsonWriter out, RedirectActionConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedirectActionConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RedirectActionConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RedirectActionConfig
   * @throws IOException if the JSON string is invalid with respect to RedirectActionConfig
   */
  public static RedirectActionConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedirectActionConfig.class);
  }

  /**
   * Convert an instance of RedirectActionConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

