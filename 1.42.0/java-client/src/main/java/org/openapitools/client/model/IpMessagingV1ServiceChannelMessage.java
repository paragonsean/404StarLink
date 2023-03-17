/*
 * Twilio - Ip_messaging
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
 * IpMessagingV1ServiceChannelMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:30.608709-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IpMessagingV1ServiceChannelMessage {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private String attributes;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CHANNEL_SID = "channel_sid";
  @SerializedName(SERIALIZED_NAME_CHANNEL_SID)
  private String channelSid;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_SERVICE_SID = "service_sid";
  @SerializedName(SERIALIZED_NAME_SERVICE_SID)
  private String serviceSid;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_WAS_EDITED = "was_edited";
  @SerializedName(SERIALIZED_NAME_WAS_EDITED)
  private Boolean wasEdited;

  public IpMessagingV1ServiceChannelMessage() {
  }

  public IpMessagingV1ServiceChannelMessage accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * Get accountSid
   * @return accountSid
   */
  @javax.annotation.Nullable
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public IpMessagingV1ServiceChannelMessage attributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }


  public IpMessagingV1ServiceChannelMessage body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  public IpMessagingV1ServiceChannelMessage channelSid(String channelSid) {
    this.channelSid = channelSid;
    return this;
  }

  /**
   * Get channelSid
   * @return channelSid
   */
  @javax.annotation.Nullable
  public String getChannelSid() {
    return channelSid;
  }

  public void setChannelSid(String channelSid) {
    this.channelSid = channelSid;
  }


  public IpMessagingV1ServiceChannelMessage dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public IpMessagingV1ServiceChannelMessage dateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * Get dateUpdated
   * @return dateUpdated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public IpMessagingV1ServiceChannelMessage from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  public IpMessagingV1ServiceChannelMessage index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   */
  @javax.annotation.Nullable
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  public IpMessagingV1ServiceChannelMessage serviceSid(String serviceSid) {
    this.serviceSid = serviceSid;
    return this;
  }

  /**
   * Get serviceSid
   * @return serviceSid
   */
  @javax.annotation.Nullable
  public String getServiceSid() {
    return serviceSid;
  }

  public void setServiceSid(String serviceSid) {
    this.serviceSid = serviceSid;
  }


  public IpMessagingV1ServiceChannelMessage sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * Get sid
   * @return sid
   */
  @javax.annotation.Nullable
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public IpMessagingV1ServiceChannelMessage to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   */
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  public IpMessagingV1ServiceChannelMessage url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }


  public IpMessagingV1ServiceChannelMessage wasEdited(Boolean wasEdited) {
    this.wasEdited = wasEdited;
    return this;
  }

  /**
   * Get wasEdited
   * @return wasEdited
   */
  @javax.annotation.Nullable
  public Boolean getWasEdited() {
    return wasEdited;
  }

  public void setWasEdited(Boolean wasEdited) {
    this.wasEdited = wasEdited;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpMessagingV1ServiceChannelMessage ipMessagingV1ServiceChannelMessage = (IpMessagingV1ServiceChannelMessage) o;
    return Objects.equals(this.accountSid, ipMessagingV1ServiceChannelMessage.accountSid) &&
        Objects.equals(this.attributes, ipMessagingV1ServiceChannelMessage.attributes) &&
        Objects.equals(this.body, ipMessagingV1ServiceChannelMessage.body) &&
        Objects.equals(this.channelSid, ipMessagingV1ServiceChannelMessage.channelSid) &&
        Objects.equals(this.dateCreated, ipMessagingV1ServiceChannelMessage.dateCreated) &&
        Objects.equals(this.dateUpdated, ipMessagingV1ServiceChannelMessage.dateUpdated) &&
        Objects.equals(this.from, ipMessagingV1ServiceChannelMessage.from) &&
        Objects.equals(this.index, ipMessagingV1ServiceChannelMessage.index) &&
        Objects.equals(this.serviceSid, ipMessagingV1ServiceChannelMessage.serviceSid) &&
        Objects.equals(this.sid, ipMessagingV1ServiceChannelMessage.sid) &&
        Objects.equals(this.to, ipMessagingV1ServiceChannelMessage.to) &&
        Objects.equals(this.url, ipMessagingV1ServiceChannelMessage.url) &&
        Objects.equals(this.wasEdited, ipMessagingV1ServiceChannelMessage.wasEdited);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, attributes, body, channelSid, dateCreated, dateUpdated, from, index, serviceSid, sid, to, url, wasEdited);
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
    sb.append("class IpMessagingV1ServiceChannelMessage {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    channelSid: ").append(toIndentedString(channelSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    serviceSid: ").append(toIndentedString(serviceSid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    wasEdited: ").append(toIndentedString(wasEdited)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("body");
    openapiFields.add("channel_sid");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("from");
    openapiFields.add("index");
    openapiFields.add("service_sid");
    openapiFields.add("sid");
    openapiFields.add("to");
    openapiFields.add("url");
    openapiFields.add("was_edited");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IpMessagingV1ServiceChannelMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpMessagingV1ServiceChannelMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpMessagingV1ServiceChannelMessage is not found in the empty JSON string", IpMessagingV1ServiceChannelMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpMessagingV1ServiceChannelMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpMessagingV1ServiceChannelMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) && !jsonObj.get("attributes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("channel_sid") != null && !jsonObj.get("channel_sid").isJsonNull()) && !jsonObj.get("channel_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_sid").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("service_sid") != null && !jsonObj.get("service_sid").isJsonNull()) && !jsonObj.get("service_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_sid").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpMessagingV1ServiceChannelMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpMessagingV1ServiceChannelMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpMessagingV1ServiceChannelMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpMessagingV1ServiceChannelMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<IpMessagingV1ServiceChannelMessage>() {
           @Override
           public void write(JsonWriter out, IpMessagingV1ServiceChannelMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpMessagingV1ServiceChannelMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IpMessagingV1ServiceChannelMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IpMessagingV1ServiceChannelMessage
   * @throws IOException if the JSON string is invalid with respect to IpMessagingV1ServiceChannelMessage
   */
  public static IpMessagingV1ServiceChannelMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpMessagingV1ServiceChannelMessage.class);
  }

  /**
   * Convert an instance of IpMessagingV1ServiceChannelMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

