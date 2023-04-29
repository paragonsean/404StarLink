/*
 * Twilio - Supersim
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
import org.openapitools.client.model.FleetEnumDataMetering;
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
 * SupersimV1Fleet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:41.776543-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SupersimV1Fleet {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_DATA_ENABLED = "data_enabled";
  @SerializedName(SERIALIZED_NAME_DATA_ENABLED)
  private Boolean dataEnabled;

  public static final String SERIALIZED_NAME_DATA_LIMIT = "data_limit";
  @SerializedName(SERIALIZED_NAME_DATA_LIMIT)
  private Integer dataLimit;

  public static final String SERIALIZED_NAME_DATA_METERING = "data_metering";
  @SerializedName(SERIALIZED_NAME_DATA_METERING)
  private FleetEnumDataMetering dataMetering;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  /**
   * A string representing the HTTP method to use when making a request to &#x60;ip_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;.
   */
  @JsonAdapter(IpCommandsMethodEnum.Adapter.class)
  public enum IpCommandsMethodEnum {
    HEAD("HEAD"),
    
    GET("GET"),
    
    POST("POST"),
    
    PATCH("PATCH"),
    
    PUT("PUT"),
    
    DELETE("DELETE");

    private String value;

    IpCommandsMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IpCommandsMethodEnum fromValue(String value) {
      for (IpCommandsMethodEnum b : IpCommandsMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IpCommandsMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpCommandsMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpCommandsMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IpCommandsMethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IpCommandsMethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IP_COMMANDS_METHOD = "ip_commands_method";
  @SerializedName(SERIALIZED_NAME_IP_COMMANDS_METHOD)
  private IpCommandsMethodEnum ipCommandsMethod;

  public static final String SERIALIZED_NAME_IP_COMMANDS_URL = "ip_commands_url";
  @SerializedName(SERIALIZED_NAME_IP_COMMANDS_URL)
  private URI ipCommandsUrl;

  public static final String SERIALIZED_NAME_NETWORK_ACCESS_PROFILE_SID = "network_access_profile_sid";
  @SerializedName(SERIALIZED_NAME_NETWORK_ACCESS_PROFILE_SID)
  private String networkAccessProfileSid;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_SMS_COMMANDS_ENABLED = "sms_commands_enabled";
  @SerializedName(SERIALIZED_NAME_SMS_COMMANDS_ENABLED)
  private Boolean smsCommandsEnabled;

  /**
   * A string representing the HTTP method to use when making a request to &#x60;sms_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;.
   */
  @JsonAdapter(SmsCommandsMethodEnum.Adapter.class)
  public enum SmsCommandsMethodEnum {
    HEAD("HEAD"),
    
    GET("GET"),
    
    POST("POST"),
    
    PATCH("PATCH"),
    
    PUT("PUT"),
    
    DELETE("DELETE");

    private String value;

    SmsCommandsMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SmsCommandsMethodEnum fromValue(String value) {
      for (SmsCommandsMethodEnum b : SmsCommandsMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SmsCommandsMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SmsCommandsMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SmsCommandsMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SmsCommandsMethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SmsCommandsMethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SMS_COMMANDS_METHOD = "sms_commands_method";
  @SerializedName(SERIALIZED_NAME_SMS_COMMANDS_METHOD)
  private SmsCommandsMethodEnum smsCommandsMethod;

  public static final String SERIALIZED_NAME_SMS_COMMANDS_URL = "sms_commands_url";
  @SerializedName(SERIALIZED_NAME_SMS_COMMANDS_URL)
  private URI smsCommandsUrl;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "unique_name";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public SupersimV1Fleet() {
  }

  public SupersimV1Fleet accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Fleet resource.
   * @return accountSid
   */
  @javax.annotation.Nullable
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public SupersimV1Fleet dataEnabled(Boolean dataEnabled) {
    this.dataEnabled = dataEnabled;
    return this;
  }

  /**
   * Defines whether SIMs in the Fleet are capable of using 2G/3G/4G/LTE/CAT-M data connectivity. Defaults to &#x60;true&#x60;.
   * @return dataEnabled
   */
  @javax.annotation.Nullable
  public Boolean getDataEnabled() {
    return dataEnabled;
  }

  public void setDataEnabled(Boolean dataEnabled) {
    this.dataEnabled = dataEnabled;
  }


  public SupersimV1Fleet dataLimit(Integer dataLimit) {
    this.dataLimit = dataLimit;
    return this;
  }

  /**
   * The total data usage (download and upload combined) in Megabytes that each Super SIM assigned to the Fleet can consume during a billing period (normally one month). Value must be between 1MB (1) and 2TB (2,000,000). Defaults to 1GB (1,000).
   * @return dataLimit
   */
  @javax.annotation.Nullable
  public Integer getDataLimit() {
    return dataLimit;
  }

  public void setDataLimit(Integer dataLimit) {
    this.dataLimit = dataLimit;
  }


  public SupersimV1Fleet dataMetering(FleetEnumDataMetering dataMetering) {
    this.dataMetering = dataMetering;
    return this;
  }

  /**
   * Get dataMetering
   * @return dataMetering
   */
  @javax.annotation.Nullable
  public FleetEnumDataMetering getDataMetering() {
    return dataMetering;
  }

  public void setDataMetering(FleetEnumDataMetering dataMetering) {
    this.dataMetering = dataMetering;
  }


  public SupersimV1Fleet dateCreated(OffsetDateTime dateCreated) {
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


  public SupersimV1Fleet dateUpdated(OffsetDateTime dateUpdated) {
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


  public SupersimV1Fleet ipCommandsMethod(IpCommandsMethodEnum ipCommandsMethod) {
    this.ipCommandsMethod = ipCommandsMethod;
    return this;
  }

  /**
   * A string representing the HTTP method to use when making a request to &#x60;ip_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;.
   * @return ipCommandsMethod
   */
  @javax.annotation.Nullable
  public IpCommandsMethodEnum getIpCommandsMethod() {
    return ipCommandsMethod;
  }

  public void setIpCommandsMethod(IpCommandsMethodEnum ipCommandsMethod) {
    this.ipCommandsMethod = ipCommandsMethod;
  }


  public SupersimV1Fleet ipCommandsUrl(URI ipCommandsUrl) {
    this.ipCommandsUrl = ipCommandsUrl;
    return this;
  }

  /**
   * The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device to a special IP address. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored.
   * @return ipCommandsUrl
   */
  @javax.annotation.Nullable
  public URI getIpCommandsUrl() {
    return ipCommandsUrl;
  }

  public void setIpCommandsUrl(URI ipCommandsUrl) {
    this.ipCommandsUrl = ipCommandsUrl;
  }


  public SupersimV1Fleet networkAccessProfileSid(String networkAccessProfileSid) {
    this.networkAccessProfileSid = networkAccessProfileSid;
    return this;
  }

  /**
   * The SID of the Network Access Profile that controls which cellular networks the Fleet&#39;s SIMs can connect to.
   * @return networkAccessProfileSid
   */
  @javax.annotation.Nullable
  public String getNetworkAccessProfileSid() {
    return networkAccessProfileSid;
  }

  public void setNetworkAccessProfileSid(String networkAccessProfileSid) {
    this.networkAccessProfileSid = networkAccessProfileSid;
  }


  public SupersimV1Fleet sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * The unique string that we created to identify the Fleet resource.
   * @return sid
   */
  @javax.annotation.Nullable
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public SupersimV1Fleet smsCommandsEnabled(Boolean smsCommandsEnabled) {
    this.smsCommandsEnabled = smsCommandsEnabled;
    return this;
  }

  /**
   * Defines whether SIMs in the Fleet are capable of sending and receiving machine-to-machine SMS via Commands. Defaults to &#x60;true&#x60;.
   * @return smsCommandsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getSmsCommandsEnabled() {
    return smsCommandsEnabled;
  }

  public void setSmsCommandsEnabled(Boolean smsCommandsEnabled) {
    this.smsCommandsEnabled = smsCommandsEnabled;
  }


  public SupersimV1Fleet smsCommandsMethod(SmsCommandsMethodEnum smsCommandsMethod) {
    this.smsCommandsMethod = smsCommandsMethod;
    return this;
  }

  /**
   * A string representing the HTTP method to use when making a request to &#x60;sms_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;.
   * @return smsCommandsMethod
   */
  @javax.annotation.Nullable
  public SmsCommandsMethodEnum getSmsCommandsMethod() {
    return smsCommandsMethod;
  }

  public void setSmsCommandsMethod(SmsCommandsMethodEnum smsCommandsMethod) {
    this.smsCommandsMethod = smsCommandsMethod;
  }


  public SupersimV1Fleet smsCommandsUrl(URI smsCommandsUrl) {
    this.smsCommandsUrl = smsCommandsUrl;
    return this;
  }

  /**
   * The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored.
   * @return smsCommandsUrl
   */
  @javax.annotation.Nullable
  public URI getSmsCommandsUrl() {
    return smsCommandsUrl;
  }

  public void setSmsCommandsUrl(URI smsCommandsUrl) {
    this.smsCommandsUrl = smsCommandsUrl;
  }


  public SupersimV1Fleet uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

  /**
   * An application-defined string that uniquely identifies the resource. It can be used in place of the resource&#39;s &#x60;sid&#x60; in the URL to address the resource.
   * @return uniqueName
   */
  @javax.annotation.Nullable
  public String getUniqueName() {
    return uniqueName;
  }

  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  public SupersimV1Fleet url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The absolute URL of the Fleet resource.
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
    SupersimV1Fleet supersimV1Fleet = (SupersimV1Fleet) o;
    return Objects.equals(this.accountSid, supersimV1Fleet.accountSid) &&
        Objects.equals(this.dataEnabled, supersimV1Fleet.dataEnabled) &&
        Objects.equals(this.dataLimit, supersimV1Fleet.dataLimit) &&
        Objects.equals(this.dataMetering, supersimV1Fleet.dataMetering) &&
        Objects.equals(this.dateCreated, supersimV1Fleet.dateCreated) &&
        Objects.equals(this.dateUpdated, supersimV1Fleet.dateUpdated) &&
        Objects.equals(this.ipCommandsMethod, supersimV1Fleet.ipCommandsMethod) &&
        Objects.equals(this.ipCommandsUrl, supersimV1Fleet.ipCommandsUrl) &&
        Objects.equals(this.networkAccessProfileSid, supersimV1Fleet.networkAccessProfileSid) &&
        Objects.equals(this.sid, supersimV1Fleet.sid) &&
        Objects.equals(this.smsCommandsEnabled, supersimV1Fleet.smsCommandsEnabled) &&
        Objects.equals(this.smsCommandsMethod, supersimV1Fleet.smsCommandsMethod) &&
        Objects.equals(this.smsCommandsUrl, supersimV1Fleet.smsCommandsUrl) &&
        Objects.equals(this.uniqueName, supersimV1Fleet.uniqueName) &&
        Objects.equals(this.url, supersimV1Fleet.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, dataEnabled, dataLimit, dataMetering, dateCreated, dateUpdated, ipCommandsMethod, ipCommandsUrl, networkAccessProfileSid, sid, smsCommandsEnabled, smsCommandsMethod, smsCommandsUrl, uniqueName, url);
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
    sb.append("class SupersimV1Fleet {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    dataEnabled: ").append(toIndentedString(dataEnabled)).append("\n");
    sb.append("    dataLimit: ").append(toIndentedString(dataLimit)).append("\n");
    sb.append("    dataMetering: ").append(toIndentedString(dataMetering)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    ipCommandsMethod: ").append(toIndentedString(ipCommandsMethod)).append("\n");
    sb.append("    ipCommandsUrl: ").append(toIndentedString(ipCommandsUrl)).append("\n");
    sb.append("    networkAccessProfileSid: ").append(toIndentedString(networkAccessProfileSid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    smsCommandsEnabled: ").append(toIndentedString(smsCommandsEnabled)).append("\n");
    sb.append("    smsCommandsMethod: ").append(toIndentedString(smsCommandsMethod)).append("\n");
    sb.append("    smsCommandsUrl: ").append(toIndentedString(smsCommandsUrl)).append("\n");
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
    openapiFields.add("data_enabled");
    openapiFields.add("data_limit");
    openapiFields.add("data_metering");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("ip_commands_method");
    openapiFields.add("ip_commands_url");
    openapiFields.add("network_access_profile_sid");
    openapiFields.add("sid");
    openapiFields.add("sms_commands_enabled");
    openapiFields.add("sms_commands_method");
    openapiFields.add("sms_commands_url");
    openapiFields.add("unique_name");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupersimV1Fleet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupersimV1Fleet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupersimV1Fleet is not found in the empty JSON string", SupersimV1Fleet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupersimV1Fleet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupersimV1Fleet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("data_metering") != null && !jsonObj.get("data_metering").isJsonNull()) && !jsonObj.get("data_metering").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_metering` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_metering").toString()));
      }
      // validate the optional field `data_metering`
      if (jsonObj.get("data_metering") != null && !jsonObj.get("data_metering").isJsonNull()) {
        FleetEnumDataMetering.validateJsonElement(jsonObj.get("data_metering"));
      }
      if ((jsonObj.get("ip_commands_method") != null && !jsonObj.get("ip_commands_method").isJsonNull()) && !jsonObj.get("ip_commands_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_commands_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_commands_method").toString()));
      }
      // validate the optional field `ip_commands_method`
      if (jsonObj.get("ip_commands_method") != null && !jsonObj.get("ip_commands_method").isJsonNull()) {
        IpCommandsMethodEnum.validateJsonElement(jsonObj.get("ip_commands_method"));
      }
      if ((jsonObj.get("ip_commands_url") != null && !jsonObj.get("ip_commands_url").isJsonNull()) && !jsonObj.get("ip_commands_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_commands_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_commands_url").toString()));
      }
      if ((jsonObj.get("network_access_profile_sid") != null && !jsonObj.get("network_access_profile_sid").isJsonNull()) && !jsonObj.get("network_access_profile_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network_access_profile_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network_access_profile_sid").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("sms_commands_method") != null && !jsonObj.get("sms_commands_method").isJsonNull()) && !jsonObj.get("sms_commands_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sms_commands_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sms_commands_method").toString()));
      }
      // validate the optional field `sms_commands_method`
      if (jsonObj.get("sms_commands_method") != null && !jsonObj.get("sms_commands_method").isJsonNull()) {
        SmsCommandsMethodEnum.validateJsonElement(jsonObj.get("sms_commands_method"));
      }
      if ((jsonObj.get("sms_commands_url") != null && !jsonObj.get("sms_commands_url").isJsonNull()) && !jsonObj.get("sms_commands_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sms_commands_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sms_commands_url").toString()));
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
       if (!SupersimV1Fleet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupersimV1Fleet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupersimV1Fleet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupersimV1Fleet.class));

       return (TypeAdapter<T>) new TypeAdapter<SupersimV1Fleet>() {
           @Override
           public void write(JsonWriter out, SupersimV1Fleet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupersimV1Fleet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SupersimV1Fleet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupersimV1Fleet
   * @throws IOException if the JSON string is invalid with respect to SupersimV1Fleet
   */
  public static SupersimV1Fleet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupersimV1Fleet.class);
  }

  /**
   * Convert an instance of SupersimV1Fleet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

