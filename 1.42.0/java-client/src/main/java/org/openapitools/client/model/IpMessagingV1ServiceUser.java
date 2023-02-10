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
 * IpMessagingV1ServiceUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:46.374619-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IpMessagingV1ServiceUser {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private String attributes;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "friendly_name";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private String friendlyName;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IS_NOTIFIABLE = "is_notifiable";
  @SerializedName(SERIALIZED_NAME_IS_NOTIFIABLE)
  private Boolean isNotifiable;

  public static final String SERIALIZED_NAME_IS_ONLINE = "is_online";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE)
  private Boolean isOnline;

  public static final String SERIALIZED_NAME_JOINED_CHANNELS_COUNT = "joined_channels_count";
  @SerializedName(SERIALIZED_NAME_JOINED_CHANNELS_COUNT)
  private Integer joinedChannelsCount;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_ROLE_SID = "role_sid";
  @SerializedName(SERIALIZED_NAME_ROLE_SID)
  private String roleSid;

  public static final String SERIALIZED_NAME_SERVICE_SID = "service_sid";
  @SerializedName(SERIALIZED_NAME_SERVICE_SID)
  private String serviceSid;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public IpMessagingV1ServiceUser() {
  }

  public IpMessagingV1ServiceUser accountSid(String accountSid) {
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


  public IpMessagingV1ServiceUser attributes(String attributes) {
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


  public IpMessagingV1ServiceUser dateCreated(OffsetDateTime dateCreated) {
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


  public IpMessagingV1ServiceUser dateUpdated(OffsetDateTime dateUpdated) {
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


  public IpMessagingV1ServiceUser friendlyName(String friendlyName) {
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


  public IpMessagingV1ServiceUser identity(String identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
   */
  @javax.annotation.Nullable
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public IpMessagingV1ServiceUser isNotifiable(Boolean isNotifiable) {
    this.isNotifiable = isNotifiable;
    return this;
  }

  /**
   * Get isNotifiable
   * @return isNotifiable
   */
  @javax.annotation.Nullable
  public Boolean getIsNotifiable() {
    return isNotifiable;
  }

  public void setIsNotifiable(Boolean isNotifiable) {
    this.isNotifiable = isNotifiable;
  }


  public IpMessagingV1ServiceUser isOnline(Boolean isOnline) {
    this.isOnline = isOnline;
    return this;
  }

  /**
   * Get isOnline
   * @return isOnline
   */
  @javax.annotation.Nullable
  public Boolean getIsOnline() {
    return isOnline;
  }

  public void setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
  }


  public IpMessagingV1ServiceUser joinedChannelsCount(Integer joinedChannelsCount) {
    this.joinedChannelsCount = joinedChannelsCount;
    return this;
  }

  /**
   * Get joinedChannelsCount
   * @return joinedChannelsCount
   */
  @javax.annotation.Nullable
  public Integer getJoinedChannelsCount() {
    return joinedChannelsCount;
  }

  public void setJoinedChannelsCount(Integer joinedChannelsCount) {
    this.joinedChannelsCount = joinedChannelsCount;
  }


  public IpMessagingV1ServiceUser links(Object links) {
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


  public IpMessagingV1ServiceUser roleSid(String roleSid) {
    this.roleSid = roleSid;
    return this;
  }

  /**
   * Get roleSid
   * @return roleSid
   */
  @javax.annotation.Nullable
  public String getRoleSid() {
    return roleSid;
  }

  public void setRoleSid(String roleSid) {
    this.roleSid = roleSid;
  }


  public IpMessagingV1ServiceUser serviceSid(String serviceSid) {
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


  public IpMessagingV1ServiceUser sid(String sid) {
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


  public IpMessagingV1ServiceUser url(URI url) {
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
    IpMessagingV1ServiceUser ipMessagingV1ServiceUser = (IpMessagingV1ServiceUser) o;
    return Objects.equals(this.accountSid, ipMessagingV1ServiceUser.accountSid) &&
        Objects.equals(this.attributes, ipMessagingV1ServiceUser.attributes) &&
        Objects.equals(this.dateCreated, ipMessagingV1ServiceUser.dateCreated) &&
        Objects.equals(this.dateUpdated, ipMessagingV1ServiceUser.dateUpdated) &&
        Objects.equals(this.friendlyName, ipMessagingV1ServiceUser.friendlyName) &&
        Objects.equals(this.identity, ipMessagingV1ServiceUser.identity) &&
        Objects.equals(this.isNotifiable, ipMessagingV1ServiceUser.isNotifiable) &&
        Objects.equals(this.isOnline, ipMessagingV1ServiceUser.isOnline) &&
        Objects.equals(this.joinedChannelsCount, ipMessagingV1ServiceUser.joinedChannelsCount) &&
        Objects.equals(this.links, ipMessagingV1ServiceUser.links) &&
        Objects.equals(this.roleSid, ipMessagingV1ServiceUser.roleSid) &&
        Objects.equals(this.serviceSid, ipMessagingV1ServiceUser.serviceSid) &&
        Objects.equals(this.sid, ipMessagingV1ServiceUser.sid) &&
        Objects.equals(this.url, ipMessagingV1ServiceUser.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, attributes, dateCreated, dateUpdated, friendlyName, identity, isNotifiable, isOnline, joinedChannelsCount, links, roleSid, serviceSid, sid, url);
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
    sb.append("class IpMessagingV1ServiceUser {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    isNotifiable: ").append(toIndentedString(isNotifiable)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    joinedChannelsCount: ").append(toIndentedString(joinedChannelsCount)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    roleSid: ").append(toIndentedString(roleSid)).append("\n");
    sb.append("    serviceSid: ").append(toIndentedString(serviceSid)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("friendly_name");
    openapiFields.add("identity");
    openapiFields.add("is_notifiable");
    openapiFields.add("is_online");
    openapiFields.add("joined_channels_count");
    openapiFields.add("links");
    openapiFields.add("role_sid");
    openapiFields.add("service_sid");
    openapiFields.add("sid");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IpMessagingV1ServiceUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpMessagingV1ServiceUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpMessagingV1ServiceUser is not found in the empty JSON string", IpMessagingV1ServiceUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpMessagingV1ServiceUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpMessagingV1ServiceUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) && !jsonObj.get("attributes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }
      if ((jsonObj.get("friendly_name") != null && !jsonObj.get("friendly_name").isJsonNull()) && !jsonObj.get("friendly_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendly_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendly_name").toString()));
      }
      if ((jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()) && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if ((jsonObj.get("role_sid") != null && !jsonObj.get("role_sid").isJsonNull()) && !jsonObj.get("role_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_sid").toString()));
      }
      if ((jsonObj.get("service_sid") != null && !jsonObj.get("service_sid").isJsonNull()) && !jsonObj.get("service_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_sid").toString()));
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
       if (!IpMessagingV1ServiceUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpMessagingV1ServiceUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpMessagingV1ServiceUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpMessagingV1ServiceUser.class));

       return (TypeAdapter<T>) new TypeAdapter<IpMessagingV1ServiceUser>() {
           @Override
           public void write(JsonWriter out, IpMessagingV1ServiceUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpMessagingV1ServiceUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IpMessagingV1ServiceUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IpMessagingV1ServiceUser
   * @throws IOException if the JSON string is invalid with respect to IpMessagingV1ServiceUser
   */
  public static IpMessagingV1ServiceUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpMessagingV1ServiceUser.class);
  }

  /**
   * Convert an instance of IpMessagingV1ServiceUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

