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
import java.util.Arrays;
import org.openapitools.client.model.UserChannelEnumChannelStatus;
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
 * IpMessagingV1ServiceUserUserChannel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:30.608709-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IpMessagingV1ServiceUserUserChannel {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_CHANNEL_SID = "channel_sid";
  @SerializedName(SERIALIZED_NAME_CHANNEL_SID)
  private String channelSid;

  public static final String SERIALIZED_NAME_LAST_CONSUMED_MESSAGE_INDEX = "last_consumed_message_index";
  @SerializedName(SERIALIZED_NAME_LAST_CONSUMED_MESSAGE_INDEX)
  private Integer lastConsumedMessageIndex;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_MEMBER_SID = "member_sid";
  @SerializedName(SERIALIZED_NAME_MEMBER_SID)
  private String memberSid;

  public static final String SERIALIZED_NAME_SERVICE_SID = "service_sid";
  @SerializedName(SERIALIZED_NAME_SERVICE_SID)
  private String serviceSid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserChannelEnumChannelStatus status;

  public static final String SERIALIZED_NAME_UNREAD_MESSAGES_COUNT = "unread_messages_count";
  @SerializedName(SERIALIZED_NAME_UNREAD_MESSAGES_COUNT)
  private Integer unreadMessagesCount;

  public IpMessagingV1ServiceUserUserChannel() {
  }

  public IpMessagingV1ServiceUserUserChannel accountSid(String accountSid) {
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


  public IpMessagingV1ServiceUserUserChannel channelSid(String channelSid) {
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


  public IpMessagingV1ServiceUserUserChannel lastConsumedMessageIndex(Integer lastConsumedMessageIndex) {
    this.lastConsumedMessageIndex = lastConsumedMessageIndex;
    return this;
  }

  /**
   * Get lastConsumedMessageIndex
   * @return lastConsumedMessageIndex
   */
  @javax.annotation.Nullable
  public Integer getLastConsumedMessageIndex() {
    return lastConsumedMessageIndex;
  }

  public void setLastConsumedMessageIndex(Integer lastConsumedMessageIndex) {
    this.lastConsumedMessageIndex = lastConsumedMessageIndex;
  }


  public IpMessagingV1ServiceUserUserChannel links(Object links) {
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


  public IpMessagingV1ServiceUserUserChannel memberSid(String memberSid) {
    this.memberSid = memberSid;
    return this;
  }

  /**
   * Get memberSid
   * @return memberSid
   */
  @javax.annotation.Nullable
  public String getMemberSid() {
    return memberSid;
  }

  public void setMemberSid(String memberSid) {
    this.memberSid = memberSid;
  }


  public IpMessagingV1ServiceUserUserChannel serviceSid(String serviceSid) {
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


  public IpMessagingV1ServiceUserUserChannel status(UserChannelEnumChannelStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public UserChannelEnumChannelStatus getStatus() {
    return status;
  }

  public void setStatus(UserChannelEnumChannelStatus status) {
    this.status = status;
  }


  public IpMessagingV1ServiceUserUserChannel unreadMessagesCount(Integer unreadMessagesCount) {
    this.unreadMessagesCount = unreadMessagesCount;
    return this;
  }

  /**
   * Get unreadMessagesCount
   * @return unreadMessagesCount
   */
  @javax.annotation.Nullable
  public Integer getUnreadMessagesCount() {
    return unreadMessagesCount;
  }

  public void setUnreadMessagesCount(Integer unreadMessagesCount) {
    this.unreadMessagesCount = unreadMessagesCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpMessagingV1ServiceUserUserChannel ipMessagingV1ServiceUserUserChannel = (IpMessagingV1ServiceUserUserChannel) o;
    return Objects.equals(this.accountSid, ipMessagingV1ServiceUserUserChannel.accountSid) &&
        Objects.equals(this.channelSid, ipMessagingV1ServiceUserUserChannel.channelSid) &&
        Objects.equals(this.lastConsumedMessageIndex, ipMessagingV1ServiceUserUserChannel.lastConsumedMessageIndex) &&
        Objects.equals(this.links, ipMessagingV1ServiceUserUserChannel.links) &&
        Objects.equals(this.memberSid, ipMessagingV1ServiceUserUserChannel.memberSid) &&
        Objects.equals(this.serviceSid, ipMessagingV1ServiceUserUserChannel.serviceSid) &&
        Objects.equals(this.status, ipMessagingV1ServiceUserUserChannel.status) &&
        Objects.equals(this.unreadMessagesCount, ipMessagingV1ServiceUserUserChannel.unreadMessagesCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, channelSid, lastConsumedMessageIndex, links, memberSid, serviceSid, status, unreadMessagesCount);
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
    sb.append("class IpMessagingV1ServiceUserUserChannel {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    channelSid: ").append(toIndentedString(channelSid)).append("\n");
    sb.append("    lastConsumedMessageIndex: ").append(toIndentedString(lastConsumedMessageIndex)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    memberSid: ").append(toIndentedString(memberSid)).append("\n");
    sb.append("    serviceSid: ").append(toIndentedString(serviceSid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unreadMessagesCount: ").append(toIndentedString(unreadMessagesCount)).append("\n");
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
    openapiFields.add("channel_sid");
    openapiFields.add("last_consumed_message_index");
    openapiFields.add("links");
    openapiFields.add("member_sid");
    openapiFields.add("service_sid");
    openapiFields.add("status");
    openapiFields.add("unread_messages_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IpMessagingV1ServiceUserUserChannel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpMessagingV1ServiceUserUserChannel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpMessagingV1ServiceUserUserChannel is not found in the empty JSON string", IpMessagingV1ServiceUserUserChannel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpMessagingV1ServiceUserUserChannel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpMessagingV1ServiceUserUserChannel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("channel_sid") != null && !jsonObj.get("channel_sid").isJsonNull()) && !jsonObj.get("channel_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_sid").toString()));
      }
      if ((jsonObj.get("member_sid") != null && !jsonObj.get("member_sid").isJsonNull()) && !jsonObj.get("member_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_sid").toString()));
      }
      if ((jsonObj.get("service_sid") != null && !jsonObj.get("service_sid").isJsonNull()) && !jsonObj.get("service_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_sid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        UserChannelEnumChannelStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpMessagingV1ServiceUserUserChannel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpMessagingV1ServiceUserUserChannel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpMessagingV1ServiceUserUserChannel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpMessagingV1ServiceUserUserChannel.class));

       return (TypeAdapter<T>) new TypeAdapter<IpMessagingV1ServiceUserUserChannel>() {
           @Override
           public void write(JsonWriter out, IpMessagingV1ServiceUserUserChannel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpMessagingV1ServiceUserUserChannel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IpMessagingV1ServiceUserUserChannel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IpMessagingV1ServiceUserUserChannel
   * @throws IOException if the JSON string is invalid with respect to IpMessagingV1ServiceUserUserChannel
   */
  public static IpMessagingV1ServiceUserUserChannel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpMessagingV1ServiceUserUserChannel.class);
  }

  /**
   * Convert an instance of IpMessagingV1ServiceUserUserChannel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

