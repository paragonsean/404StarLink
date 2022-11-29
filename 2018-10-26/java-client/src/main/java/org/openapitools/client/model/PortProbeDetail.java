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
import org.openapitools.client.model.PortProbeDetailLocalIpDetails;
import org.openapitools.client.model.PortProbeDetailLocalPortDetails;
import org.openapitools.client.model.PortProbeDetailRemoteIpDetails;

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
 * A port scan that was part of the port probe. For each scan, PortProbeDetails provides information about the local IP address and port that were scanned, and the remote IP address that the scan originated from.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PortProbeDetail {
  public static final String SERIALIZED_NAME_LOCAL_PORT_DETAILS = "LocalPortDetails";
  @SerializedName(SERIALIZED_NAME_LOCAL_PORT_DETAILS)
  private PortProbeDetailLocalPortDetails localPortDetails;

  public static final String SERIALIZED_NAME_LOCAL_IP_DETAILS = "LocalIpDetails";
  @SerializedName(SERIALIZED_NAME_LOCAL_IP_DETAILS)
  private PortProbeDetailLocalIpDetails localIpDetails;

  public static final String SERIALIZED_NAME_REMOTE_IP_DETAILS = "RemoteIpDetails";
  @SerializedName(SERIALIZED_NAME_REMOTE_IP_DETAILS)
  private PortProbeDetailRemoteIpDetails remoteIpDetails;

  public PortProbeDetail() {
  }

  public PortProbeDetail localPortDetails(PortProbeDetailLocalPortDetails localPortDetails) {
    this.localPortDetails = localPortDetails;
    return this;
  }

  /**
   * Get localPortDetails
   * @return localPortDetails
   */
  @javax.annotation.Nullable
  public PortProbeDetailLocalPortDetails getLocalPortDetails() {
    return localPortDetails;
  }

  public void setLocalPortDetails(PortProbeDetailLocalPortDetails localPortDetails) {
    this.localPortDetails = localPortDetails;
  }


  public PortProbeDetail localIpDetails(PortProbeDetailLocalIpDetails localIpDetails) {
    this.localIpDetails = localIpDetails;
    return this;
  }

  /**
   * Get localIpDetails
   * @return localIpDetails
   */
  @javax.annotation.Nullable
  public PortProbeDetailLocalIpDetails getLocalIpDetails() {
    return localIpDetails;
  }

  public void setLocalIpDetails(PortProbeDetailLocalIpDetails localIpDetails) {
    this.localIpDetails = localIpDetails;
  }


  public PortProbeDetail remoteIpDetails(PortProbeDetailRemoteIpDetails remoteIpDetails) {
    this.remoteIpDetails = remoteIpDetails;
    return this;
  }

  /**
   * Get remoteIpDetails
   * @return remoteIpDetails
   */
  @javax.annotation.Nullable
  public PortProbeDetailRemoteIpDetails getRemoteIpDetails() {
    return remoteIpDetails;
  }

  public void setRemoteIpDetails(PortProbeDetailRemoteIpDetails remoteIpDetails) {
    this.remoteIpDetails = remoteIpDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortProbeDetail portProbeDetail = (PortProbeDetail) o;
    return Objects.equals(this.localPortDetails, portProbeDetail.localPortDetails) &&
        Objects.equals(this.localIpDetails, portProbeDetail.localIpDetails) &&
        Objects.equals(this.remoteIpDetails, portProbeDetail.remoteIpDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localPortDetails, localIpDetails, remoteIpDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortProbeDetail {\n");
    sb.append("    localPortDetails: ").append(toIndentedString(localPortDetails)).append("\n");
    sb.append("    localIpDetails: ").append(toIndentedString(localIpDetails)).append("\n");
    sb.append("    remoteIpDetails: ").append(toIndentedString(remoteIpDetails)).append("\n");
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
    openapiFields.add("LocalPortDetails");
    openapiFields.add("LocalIpDetails");
    openapiFields.add("RemoteIpDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PortProbeDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PortProbeDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortProbeDetail is not found in the empty JSON string", PortProbeDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PortProbeDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortProbeDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LocalPortDetails`
      if (jsonObj.get("LocalPortDetails") != null && !jsonObj.get("LocalPortDetails").isJsonNull()) {
        PortProbeDetailLocalPortDetails.validateJsonElement(jsonObj.get("LocalPortDetails"));
      }
      // validate the optional field `LocalIpDetails`
      if (jsonObj.get("LocalIpDetails") != null && !jsonObj.get("LocalIpDetails").isJsonNull()) {
        PortProbeDetailLocalIpDetails.validateJsonElement(jsonObj.get("LocalIpDetails"));
      }
      // validate the optional field `RemoteIpDetails`
      if (jsonObj.get("RemoteIpDetails") != null && !jsonObj.get("RemoteIpDetails").isJsonNull()) {
        PortProbeDetailRemoteIpDetails.validateJsonElement(jsonObj.get("RemoteIpDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortProbeDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortProbeDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortProbeDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortProbeDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<PortProbeDetail>() {
           @Override
           public void write(JsonWriter out, PortProbeDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortProbeDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PortProbeDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PortProbeDetail
   * @throws IOException if the JSON string is invalid with respect to PortProbeDetail
   */
  public static PortProbeDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortProbeDetail.class);
  }

  /**
   * Convert an instance of PortProbeDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

