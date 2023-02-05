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
 * TrusthubV1EndUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:26.050357-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TrusthubV1EndUser {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes = null;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "friendly_name";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private String friendlyName;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public TrusthubV1EndUser() {
  }

  public TrusthubV1EndUser accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the End User resource.
   * @return accountSid
   */
  @javax.annotation.Nullable
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TrusthubV1EndUser attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The set of parameters that are the attributes of the End Users resource which are listed in the End User Types.
   * @return attributes
   */
  @javax.annotation.Nullable
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public TrusthubV1EndUser dateCreated(OffsetDateTime dateCreated) {
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


  public TrusthubV1EndUser dateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
   * @return dateUpdated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public TrusthubV1EndUser friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * The string that you assigned to describe the resource.
   * @return friendlyName
   */
  @javax.annotation.Nullable
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  public TrusthubV1EndUser sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * The unique string created by Twilio to identify the End User resource.
   * @return sid
   */
  @javax.annotation.Nullable
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public TrusthubV1EndUser type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of end user of the Bundle resource - can be &#x60;individual&#x60; or &#x60;business&#x60;.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public TrusthubV1EndUser url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The absolute URL of the End User resource.
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
    TrusthubV1EndUser trusthubV1EndUser = (TrusthubV1EndUser) o;
    return Objects.equals(this.accountSid, trusthubV1EndUser.accountSid) &&
        Objects.equals(this.attributes, trusthubV1EndUser.attributes) &&
        Objects.equals(this.dateCreated, trusthubV1EndUser.dateCreated) &&
        Objects.equals(this.dateUpdated, trusthubV1EndUser.dateUpdated) &&
        Objects.equals(this.friendlyName, trusthubV1EndUser.friendlyName) &&
        Objects.equals(this.sid, trusthubV1EndUser.sid) &&
        Objects.equals(this.type, trusthubV1EndUser.type) &&
        Objects.equals(this.url, trusthubV1EndUser.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, attributes, dateCreated, dateUpdated, friendlyName, sid, type, url);
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
    sb.append("class TrusthubV1EndUser {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("sid");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrusthubV1EndUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrusthubV1EndUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrusthubV1EndUser is not found in the empty JSON string", TrusthubV1EndUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrusthubV1EndUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrusthubV1EndUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("friendly_name") != null && !jsonObj.get("friendly_name").isJsonNull()) && !jsonObj.get("friendly_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendly_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendly_name").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrusthubV1EndUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrusthubV1EndUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrusthubV1EndUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrusthubV1EndUser.class));

       return (TypeAdapter<T>) new TypeAdapter<TrusthubV1EndUser>() {
           @Override
           public void write(JsonWriter out, TrusthubV1EndUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrusthubV1EndUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrusthubV1EndUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrusthubV1EndUser
   * @throws IOException if the JSON string is invalid with respect to TrusthubV1EndUser
   */
  public static TrusthubV1EndUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrusthubV1EndUser.class);
  }

  /**
   * Convert an instance of TrusthubV1EndUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

