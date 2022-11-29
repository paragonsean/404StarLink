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
import org.openapitools.client.model.ActionRemoteIpDetailsCity;
import org.openapitools.client.model.ActionRemoteIpDetailsCountry;
import org.openapitools.client.model.ActionRemoteIpDetailsGeoLocation;
import org.openapitools.client.model.ActionRemoteIpDetailsOrganization;

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
 * For &lt;code&gt;AwsApiAction&lt;/code&gt;, &lt;code&gt;NetworkConnectionAction&lt;/code&gt;, and &lt;code&gt;PortProbeAction&lt;/code&gt;, &lt;code&gt;RemoteIpDetails&lt;/code&gt; provides information about the remote IP address that was involved in the action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ActionRemoteIpDetails {
  public static final String SERIALIZED_NAME_IP_ADDRESS_V4 = "IpAddressV4";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_V4)
  private String ipAddressV4;

  public static final String SERIALIZED_NAME_ORGANIZATION = "Organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private ActionRemoteIpDetailsOrganization organization;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private ActionRemoteIpDetailsCountry country;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private ActionRemoteIpDetailsCity city;

  public static final String SERIALIZED_NAME_GEO_LOCATION = "GeoLocation";
  @SerializedName(SERIALIZED_NAME_GEO_LOCATION)
  private ActionRemoteIpDetailsGeoLocation geoLocation;

  public ActionRemoteIpDetails() {
  }

  public ActionRemoteIpDetails ipAddressV4(String ipAddressV4) {
    this.ipAddressV4 = ipAddressV4;
    return this;
  }

  /**
   * Get ipAddressV4
   * @return ipAddressV4
   */
  @javax.annotation.Nullable
  public String getIpAddressV4() {
    return ipAddressV4;
  }

  public void setIpAddressV4(String ipAddressV4) {
    this.ipAddressV4 = ipAddressV4;
  }


  public ActionRemoteIpDetails organization(ActionRemoteIpDetailsOrganization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nullable
  public ActionRemoteIpDetailsOrganization getOrganization() {
    return organization;
  }

  public void setOrganization(ActionRemoteIpDetailsOrganization organization) {
    this.organization = organization;
  }


  public ActionRemoteIpDetails country(ActionRemoteIpDetailsCountry country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public ActionRemoteIpDetailsCountry getCountry() {
    return country;
  }

  public void setCountry(ActionRemoteIpDetailsCountry country) {
    this.country = country;
  }


  public ActionRemoteIpDetails city(ActionRemoteIpDetailsCity city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public ActionRemoteIpDetailsCity getCity() {
    return city;
  }

  public void setCity(ActionRemoteIpDetailsCity city) {
    this.city = city;
  }


  public ActionRemoteIpDetails geoLocation(ActionRemoteIpDetailsGeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   * @return geoLocation
   */
  @javax.annotation.Nullable
  public ActionRemoteIpDetailsGeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(ActionRemoteIpDetailsGeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionRemoteIpDetails actionRemoteIpDetails = (ActionRemoteIpDetails) o;
    return Objects.equals(this.ipAddressV4, actionRemoteIpDetails.ipAddressV4) &&
        Objects.equals(this.organization, actionRemoteIpDetails.organization) &&
        Objects.equals(this.country, actionRemoteIpDetails.country) &&
        Objects.equals(this.city, actionRemoteIpDetails.city) &&
        Objects.equals(this.geoLocation, actionRemoteIpDetails.geoLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddressV4, organization, country, city, geoLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionRemoteIpDetails {\n");
    sb.append("    ipAddressV4: ").append(toIndentedString(ipAddressV4)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
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
    openapiFields.add("IpAddressV4");
    openapiFields.add("Organization");
    openapiFields.add("Country");
    openapiFields.add("City");
    openapiFields.add("GeoLocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActionRemoteIpDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActionRemoteIpDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionRemoteIpDetails is not found in the empty JSON string", ActionRemoteIpDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActionRemoteIpDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionRemoteIpDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IpAddressV4`
      if (jsonObj.get("IpAddressV4") != null && !jsonObj.get("IpAddressV4").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IpAddressV4"));
      }
      // validate the optional field `Organization`
      if (jsonObj.get("Organization") != null && !jsonObj.get("Organization").isJsonNull()) {
        ActionRemoteIpDetailsOrganization.validateJsonElement(jsonObj.get("Organization"));
      }
      // validate the optional field `Country`
      if (jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) {
        ActionRemoteIpDetailsCountry.validateJsonElement(jsonObj.get("Country"));
      }
      // validate the optional field `City`
      if (jsonObj.get("City") != null && !jsonObj.get("City").isJsonNull()) {
        ActionRemoteIpDetailsCity.validateJsonElement(jsonObj.get("City"));
      }
      // validate the optional field `GeoLocation`
      if (jsonObj.get("GeoLocation") != null && !jsonObj.get("GeoLocation").isJsonNull()) {
        ActionRemoteIpDetailsGeoLocation.validateJsonElement(jsonObj.get("GeoLocation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionRemoteIpDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionRemoteIpDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionRemoteIpDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionRemoteIpDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionRemoteIpDetails>() {
           @Override
           public void write(JsonWriter out, ActionRemoteIpDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionRemoteIpDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActionRemoteIpDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActionRemoteIpDetails
   * @throws IOException if the JSON string is invalid with respect to ActionRemoteIpDetails
   */
  public static ActionRemoteIpDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionRemoteIpDetails.class);
  }

  /**
   * Convert an instance of ActionRemoteIpDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

