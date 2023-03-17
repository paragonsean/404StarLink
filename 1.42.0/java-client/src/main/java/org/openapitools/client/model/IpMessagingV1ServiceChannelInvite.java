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
 * IpMessagingV1ServiceChannelInvite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:30.608709-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class IpMessagingV1ServiceChannelInvite {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_CHANNEL_SID = "channel_sid";
  @SerializedName(SERIALIZED_NAME_CHANNEL_SID)
  private String channelSid;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

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

  public IpMessagingV1ServiceChannelInvite() {
  }

  public IpMessagingV1ServiceChannelInvite accountSid(String accountSid) {
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


  public IpMessagingV1ServiceChannelInvite channelSid(String channelSid) {
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


  public IpMessagingV1ServiceChannelInvite createdBy(String createdBy) {
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


  public IpMessagingV1ServiceChannelInvite dateCreated(OffsetDateTime dateCreated) {
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


  public IpMessagingV1ServiceChannelInvite dateUpdated(OffsetDateTime dateUpdated) {
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


  public IpMessagingV1ServiceChannelInvite identity(String identity) {
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


  public IpMessagingV1ServiceChannelInvite roleSid(String roleSid) {
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


  public IpMessagingV1ServiceChannelInvite serviceSid(String serviceSid) {
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


  public IpMessagingV1ServiceChannelInvite sid(String sid) {
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


  public IpMessagingV1ServiceChannelInvite url(URI url) {
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
    IpMessagingV1ServiceChannelInvite ipMessagingV1ServiceChannelInvite = (IpMessagingV1ServiceChannelInvite) o;
    return Objects.equals(this.accountSid, ipMessagingV1ServiceChannelInvite.accountSid) &&
        Objects.equals(this.channelSid, ipMessagingV1ServiceChannelInvite.channelSid) &&
        Objects.equals(this.createdBy, ipMessagingV1ServiceChannelInvite.createdBy) &&
        Objects.equals(this.dateCreated, ipMessagingV1ServiceChannelInvite.dateCreated) &&
        Objects.equals(this.dateUpdated, ipMessagingV1ServiceChannelInvite.dateUpdated) &&
        Objects.equals(this.identity, ipMessagingV1ServiceChannelInvite.identity) &&
        Objects.equals(this.roleSid, ipMessagingV1ServiceChannelInvite.roleSid) &&
        Objects.equals(this.serviceSid, ipMessagingV1ServiceChannelInvite.serviceSid) &&
        Objects.equals(this.sid, ipMessagingV1ServiceChannelInvite.sid) &&
        Objects.equals(this.url, ipMessagingV1ServiceChannelInvite.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, channelSid, createdBy, dateCreated, dateUpdated, identity, roleSid, serviceSid, sid, url);
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
    sb.append("class IpMessagingV1ServiceChannelInvite {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    channelSid: ").append(toIndentedString(channelSid)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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
    openapiFields.add("channel_sid");
    openapiFields.add("created_by");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("identity");
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
   * @throws IOException if the JSON Element is invalid with respect to IpMessagingV1ServiceChannelInvite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpMessagingV1ServiceChannelInvite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpMessagingV1ServiceChannelInvite is not found in the empty JSON string", IpMessagingV1ServiceChannelInvite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpMessagingV1ServiceChannelInvite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpMessagingV1ServiceChannelInvite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("channel_sid") != null && !jsonObj.get("channel_sid").isJsonNull()) && !jsonObj.get("channel_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_sid").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
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
       if (!IpMessagingV1ServiceChannelInvite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpMessagingV1ServiceChannelInvite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpMessagingV1ServiceChannelInvite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpMessagingV1ServiceChannelInvite.class));

       return (TypeAdapter<T>) new TypeAdapter<IpMessagingV1ServiceChannelInvite>() {
           @Override
           public void write(JsonWriter out, IpMessagingV1ServiceChannelInvite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpMessagingV1ServiceChannelInvite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IpMessagingV1ServiceChannelInvite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IpMessagingV1ServiceChannelInvite
   * @throws IOException if the JSON string is invalid with respect to IpMessagingV1ServiceChannelInvite
   */
  public static IpMessagingV1ServiceChannelInvite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpMessagingV1ServiceChannelInvite.class);
  }

  /**
   * Convert an instance of IpMessagingV1ServiceChannelInvite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

