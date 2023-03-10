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
import org.openapitools.client.model.TrustProductEnumStatus;
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
 * TrusthubV1TrustProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:03.855054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TrusthubV1TrustProduct {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "friendly_name";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private String friendlyName;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_POLICY_SID = "policy_sid";
  @SerializedName(SERIALIZED_NAME_POLICY_SID)
  private String policySid;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TrustProductEnumStatus status;

  public static final String SERIALIZED_NAME_STATUS_CALLBACK = "status_callback";
  @SerializedName(SERIALIZED_NAME_STATUS_CALLBACK)
  private URI statusCallback;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_VALID_UNTIL = "valid_until";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private OffsetDateTime validUntil;

  public TrusthubV1TrustProduct() {
  }

  public TrusthubV1TrustProduct accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Customer-Profile resource.
   * @return accountSid
   */
  @javax.annotation.Nullable
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TrusthubV1TrustProduct dateCreated(OffsetDateTime dateCreated) {
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


  public TrusthubV1TrustProduct dateUpdated(OffsetDateTime dateUpdated) {
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


  public TrusthubV1TrustProduct email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address that will receive updates when the Customer-Profile resource changes status.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public TrusthubV1TrustProduct friendlyName(String friendlyName) {
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


  public TrusthubV1TrustProduct links(Object links) {
    this.links = links;
    return this;
  }

  /**
   * The URLs of the Assigned Items of the Customer-Profile resource.
   * @return links
   */
  @javax.annotation.Nullable
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }


  public TrusthubV1TrustProduct policySid(String policySid) {
    this.policySid = policySid;
    return this;
  }

  /**
   * The unique string of a policy that is associated to the Customer-Profile resource.
   * @return policySid
   */
  @javax.annotation.Nullable
  public String getPolicySid() {
    return policySid;
  }

  public void setPolicySid(String policySid) {
    this.policySid = policySid;
  }


  public TrusthubV1TrustProduct sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * The unique string that we created to identify the Customer-Profile resource.
   * @return sid
   */
  @javax.annotation.Nullable
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public TrusthubV1TrustProduct status(TrustProductEnumStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public TrustProductEnumStatus getStatus() {
    return status;
  }

  public void setStatus(TrustProductEnumStatus status) {
    this.status = status;
  }


  public TrusthubV1TrustProduct statusCallback(URI statusCallback) {
    this.statusCallback = statusCallback;
    return this;
  }

  /**
   * The URL we call to inform your application of status changes.
   * @return statusCallback
   */
  @javax.annotation.Nullable
  public URI getStatusCallback() {
    return statusCallback;
  }

  public void setStatusCallback(URI statusCallback) {
    this.statusCallback = statusCallback;
  }


  public TrusthubV1TrustProduct url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The absolute URL of the Customer-Profile resource.
   * @return url
   */
  @javax.annotation.Nullable
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }


  public TrusthubV1TrustProduct validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * The date and time in GMT in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format when the resource will be valid until.
   * @return validUntil
   */
  @javax.annotation.Nullable
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrusthubV1TrustProduct trusthubV1TrustProduct = (TrusthubV1TrustProduct) o;
    return Objects.equals(this.accountSid, trusthubV1TrustProduct.accountSid) &&
        Objects.equals(this.dateCreated, trusthubV1TrustProduct.dateCreated) &&
        Objects.equals(this.dateUpdated, trusthubV1TrustProduct.dateUpdated) &&
        Objects.equals(this.email, trusthubV1TrustProduct.email) &&
        Objects.equals(this.friendlyName, trusthubV1TrustProduct.friendlyName) &&
        Objects.equals(this.links, trusthubV1TrustProduct.links) &&
        Objects.equals(this.policySid, trusthubV1TrustProduct.policySid) &&
        Objects.equals(this.sid, trusthubV1TrustProduct.sid) &&
        Objects.equals(this.status, trusthubV1TrustProduct.status) &&
        Objects.equals(this.statusCallback, trusthubV1TrustProduct.statusCallback) &&
        Objects.equals(this.url, trusthubV1TrustProduct.url) &&
        Objects.equals(this.validUntil, trusthubV1TrustProduct.validUntil);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, dateCreated, dateUpdated, email, friendlyName, links, policySid, sid, status, statusCallback, url, validUntil);
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
    sb.append("class TrusthubV1TrustProduct {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    policySid: ").append(toIndentedString(policySid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCallback: ").append(toIndentedString(statusCallback)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("email");
    openapiFields.add("friendly_name");
    openapiFields.add("links");
    openapiFields.add("policy_sid");
    openapiFields.add("sid");
    openapiFields.add("status");
    openapiFields.add("status_callback");
    openapiFields.add("url");
    openapiFields.add("valid_until");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrusthubV1TrustProduct
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrusthubV1TrustProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrusthubV1TrustProduct is not found in the empty JSON string", TrusthubV1TrustProduct.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrusthubV1TrustProduct.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrusthubV1TrustProduct` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("friendly_name") != null && !jsonObj.get("friendly_name").isJsonNull()) && !jsonObj.get("friendly_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendly_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendly_name").toString()));
      }
      if ((jsonObj.get("policy_sid") != null && !jsonObj.get("policy_sid").isJsonNull()) && !jsonObj.get("policy_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_sid").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        TrustProductEnumStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("status_callback") != null && !jsonObj.get("status_callback").isJsonNull()) && !jsonObj.get("status_callback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_callback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_callback").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrusthubV1TrustProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrusthubV1TrustProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrusthubV1TrustProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrusthubV1TrustProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<TrusthubV1TrustProduct>() {
           @Override
           public void write(JsonWriter out, TrusthubV1TrustProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrusthubV1TrustProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrusthubV1TrustProduct given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrusthubV1TrustProduct
   * @throws IOException if the JSON string is invalid with respect to TrusthubV1TrustProduct
   */
  public static TrusthubV1TrustProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrusthubV1TrustProduct.class);
  }

  /**
   * Convert an instance of TrusthubV1TrustProduct to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

