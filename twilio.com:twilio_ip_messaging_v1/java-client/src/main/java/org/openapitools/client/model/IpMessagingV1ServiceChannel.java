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
import org.openapitools.client.model.ChannelEnumChannelType;
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
 * IpMessagingV1ServiceChannel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:43.360758-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IpMessagingV1ServiceChannel {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private String attributes;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "friendly_name";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private String friendlyName;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_MEMBERS_COUNT = "members_count";
  @SerializedName(SERIALIZED_NAME_MEMBERS_COUNT)
  private Integer membersCount;

  public static final String SERIALIZED_NAME_MESSAGES_COUNT = "messages_count";
  @SerializedName(SERIALIZED_NAME_MESSAGES_COUNT)
  private Integer messagesCount;

  public static final String SERIALIZED_NAME_SERVICE_SID = "service_sid";
  @SerializedName(SERIALIZED_NAME_SERVICE_SID)
  private String serviceSid;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ChannelEnumChannelType type;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "unique_name";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public IpMessagingV1ServiceChannel() {
  }

  public IpMessagingV1ServiceChannel accountSid(String accountSid) {
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


  public IpMessagingV1ServiceChannel attributes(String attributes) {
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


  public IpMessagingV1ServiceChannel createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public IpMessagingV1ServiceChannel dateCreated(OffsetDateTime dateCreated) {
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


  public IpMessagingV1ServiceChannel dateUpdated(OffsetDateTime dateUpdated) {
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


  public IpMessagingV1ServiceChannel friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName
   * @return friendlyName
   */
  @javax.annotation.Nullable
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  public IpMessagingV1ServiceChannel links(Object links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }


  public IpMessagingV1ServiceChannel membersCount(Integer membersCount) {
    this.membersCount = membersCount;
    return this;
  }

  /**
   * Get membersCount
   * @return membersCount
   */
  @javax.annotation.Nullable
  public Integer getMembersCount() {
    return membersCount;
  }

  public void setMembersCount(Integer membersCount) {
    this.membersCount = membersCount;
  }


  public IpMessagingV1ServiceChannel messagesCount(Integer messagesCount) {
    this.messagesCount = messagesCount;
    return this;
  }

  /**
   * Get messagesCount
   * @return messagesCount
   */
  @javax.annotation.Nullable
  public Integer getMessagesCount() {
    return messagesCount;
  }

  public void setMessagesCount(Integer messagesCount) {
    this.messagesCount = messagesCount;
  }


  public IpMessagingV1ServiceChannel serviceSid(String serviceSid) {
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


  public IpMessagingV1ServiceChannel sid(String sid) {
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


  public IpMessagingV1ServiceChannel type(ChannelEnumChannelType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public ChannelEnumChannelType getType() {
    return type;
  }

  public void setType(ChannelEnumChannelType type) {
    this.type = type;
  }


  public IpMessagingV1ServiceChannel uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

  /**
   * Get uniqueName
   * @return uniqueName
   */
  @javax.annotation.Nullable
  public String getUniqueName() {
    return uniqueName;
  }

  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  public IpMessagingV1ServiceChannel url(URI url) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpMessagingV1ServiceChannel ipMessagingV1ServiceChannel = (IpMessagingV1ServiceChannel) o;
    return Objects.equals(this.accountSid, ipMessagingV1ServiceChannel.accountSid) &&
        Objects.equals(this.attributes, ipMessagingV1ServiceChannel.attributes) &&
        Objects.equals(this.createdBy, ipMessagingV1ServiceChannel.createdBy) &&
        Objects.equals(this.dateCreated, ipMessagingV1ServiceChannel.dateCreated) &&
        Objects.equals(this.dateUpdated, ipMessagingV1ServiceChannel.dateUpdated) &&
        Objects.equals(this.friendlyName, ipMessagingV1ServiceChannel.friendlyName) &&
        Objects.equals(this.links, ipMessagingV1ServiceChannel.links) &&
        Objects.equals(this.membersCount, ipMessagingV1ServiceChannel.membersCount) &&
        Objects.equals(this.messagesCount, ipMessagingV1ServiceChannel.messagesCount) &&
        Objects.equals(this.serviceSid, ipMessagingV1ServiceChannel.serviceSid) &&
        Objects.equals(this.sid, ipMessagingV1ServiceChannel.sid) &&
        Objects.equals(this.type, ipMessagingV1ServiceChannel.type) &&
        Objects.equals(this.uniqueName, ipMessagingV1ServiceChannel.uniqueName) &&
        Objects.equals(this.url, ipMessagingV1ServiceChannel.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, attributes, createdBy, dateCreated, dateUpdated, friendlyName, links, membersCount, messagesCount, serviceSid, sid, type, uniqueName, url);
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
    sb.append("class IpMessagingV1ServiceChannel {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    membersCount: ").append(toIndentedString(membersCount)).append("\n");
    sb.append("    messagesCount: ").append(toIndentedString(messagesCount)).append("\n");
    sb.append("    serviceSid: ").append(toIndentedString(serviceSid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("created_by");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("friendly_name");
    openapiFields.add("links");
    openapiFields.add("members_count");
    openapiFields.add("messages_count");
    openapiFields.add("service_sid");
    openapiFields.add("sid");
    openapiFields.add("type");
    openapiFields.add("unique_name");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IpMessagingV1ServiceChannel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpMessagingV1ServiceChannel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpMessagingV1ServiceChannel is not found in the empty JSON string", IpMessagingV1ServiceChannel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpMessagingV1ServiceChannel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpMessagingV1ServiceChannel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) && !jsonObj.get("attributes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("friendly_name") != null && !jsonObj.get("friendly_name").isJsonNull()) && !jsonObj.get("friendly_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendly_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendly_name").toString()));
      }
      if ((jsonObj.get("service_sid") != null && !jsonObj.get("service_sid").isJsonNull()) && !jsonObj.get("service_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_sid").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        ChannelEnumChannelType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("unique_name") != null && !jsonObj.get("unique_name").isJsonNull()) && !jsonObj.get("unique_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpMessagingV1ServiceChannel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpMessagingV1ServiceChannel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpMessagingV1ServiceChannel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpMessagingV1ServiceChannel.class));

       return (TypeAdapter<T>) new TypeAdapter<IpMessagingV1ServiceChannel>() {
           @Override
           public void write(JsonWriter out, IpMessagingV1ServiceChannel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpMessagingV1ServiceChannel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IpMessagingV1ServiceChannel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IpMessagingV1ServiceChannel
   * @throws IOException if the JSON string is invalid with respect to IpMessagingV1ServiceChannel
   */
  public static IpMessagingV1ServiceChannel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpMessagingV1ServiceChannel.class);
  }

  /**
   * Convert an instance of IpMessagingV1ServiceChannel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

