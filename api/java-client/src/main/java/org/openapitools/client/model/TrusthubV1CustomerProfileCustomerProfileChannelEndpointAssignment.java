/*
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:57.920103-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_CHANNEL_ENDPOINT_SID = "channel_endpoint_sid";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ENDPOINT_SID)
  private String channelEndpointSid;

  public static final String SERIALIZED_NAME_CHANNEL_ENDPOINT_TYPE = "channel_endpoint_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ENDPOINT_TYPE)
  private String channelEndpointType;

  public static final String SERIALIZED_NAME_CUSTOMER_PROFILE_SID = "customer_profile_sid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILE_SID)
  private String customerProfileSid;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment() {
  }

  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Item Assignment resource.
   * @return accountSid
   */
  @javax.annotation.Nullable
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment channelEndpointSid(String channelEndpointSid) {
    this.channelEndpointSid = channelEndpointSid;
    return this;
  }

  /**
   * The SID of an channel endpoint
   * @return channelEndpointSid
   */
  @javax.annotation.Nullable
  public String getChannelEndpointSid() {
    return channelEndpointSid;
  }

  public void setChannelEndpointSid(String channelEndpointSid) {
    this.channelEndpointSid = channelEndpointSid;
  }


  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment channelEndpointType(String channelEndpointType) {
    this.channelEndpointType = channelEndpointType;
    return this;
  }

  /**
   * The type of channel endpoint. eg: phone-number
   * @return channelEndpointType
   */
  @javax.annotation.Nullable
  public String getChannelEndpointType() {
    return channelEndpointType;
  }

  public void setChannelEndpointType(String channelEndpointType) {
    this.channelEndpointType = channelEndpointType;
  }


  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment customerProfileSid(String customerProfileSid) {
    this.customerProfileSid = customerProfileSid;
    return this;
  }

  /**
   * The unique string that we created to identify the CustomerProfile resource.
   * @return customerProfileSid
   */
  @javax.annotation.Nullable
  public String getCustomerProfileSid() {
    return customerProfileSid;
  }

  public void setCustomerProfileSid(String customerProfileSid) {
    this.customerProfileSid = customerProfileSid;
  }


  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * The unique string that we created to identify the Item Assignment resource.
   * @return sid
   */
  @javax.annotation.Nullable
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The absolute URL of the Identity resource.
   * @return url
   */
  @javax.annotation.Nullable
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment = (TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment) o;
    return Objects.equals(this.accountSid, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.accountSid) &&
        Objects.equals(this.channelEndpointSid, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.channelEndpointSid) &&
        Objects.equals(this.channelEndpointType, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.channelEndpointType) &&
        Objects.equals(this.customerProfileSid, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.customerProfileSid) &&
        Objects.equals(this.dateCreated, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.dateCreated) &&
        Objects.equals(this.sid, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.sid) &&
        Objects.equals(this.url, trusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, channelEndpointSid, channelEndpointType, customerProfileSid, dateCreated, sid, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    channelEndpointSid: ").append(toIndentedString(channelEndpointSid)).append("\n");
    sb.append("    channelEndpointType: ").append(toIndentedString(channelEndpointType)).append("\n");
    sb.append("    customerProfileSid: ").append(toIndentedString(customerProfileSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("account_sid");
    openapiFields.add("channel_endpoint_sid");
    openapiFields.add("channel_endpoint_type");
    openapiFields.add("customer_profile_sid");
    openapiFields.add("date_created");
    openapiFields.add("sid");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment is not found in the empty JSON string", TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("channel_endpoint_sid") != null && !jsonObj.get("channel_endpoint_sid").isJsonNull()) && !jsonObj.get("channel_endpoint_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_endpoint_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_endpoint_sid").toString()));
      }
      if ((jsonObj.get("channel_endpoint_type") != null && !jsonObj.get("channel_endpoint_type").isJsonNull()) && !jsonObj.get("channel_endpoint_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_endpoint_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_endpoint_type").toString()));
      }
      if ((jsonObj.get("customer_profile_sid") != null && !jsonObj.get("customer_profile_sid").isJsonNull()) && !jsonObj.get("customer_profile_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_profile_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_profile_sid").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment>() {
           @Override
           public void write(JsonWriter out, TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment
   * @throws IOException if the JSON string is invalid with respect to TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment
   */
  public static TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.class);
  }

  /**
   * Convert an instance of TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

