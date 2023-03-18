/*
 * Traccar
 * Open Source GPS Tracking Platform
 *
 * The version of the OpenAPI document: 5.6
 * Contact: support@traccar.org
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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:33.424652-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class User {
  public static final String SERIALIZED_NAME_ADMINISTRATOR = "administrator";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATOR)
  private Boolean administrator;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_COORDINATE_FORMAT = "coordinateFormat";
  @SerializedName(SERIALIZED_NAME_COORDINATE_FORMAT)
  private String coordinateFormat;

  public static final String SERIALIZED_NAME_DEVICE_LIMIT = "deviceLimit";
  @SerializedName(SERIALIZED_NAME_DEVICE_LIMIT)
  private Integer deviceLimit;

  public static final String SERIALIZED_NAME_DEVICE_READONLY = "deviceReadonly";
  @SerializedName(SERIALIZED_NAME_DEVICE_READONLY)
  private Boolean deviceReadonly;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expirationTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private OffsetDateTime expirationTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LIMIT_COMMANDS = "limitCommands";
  @SerializedName(SERIALIZED_NAME_LIMIT_COMMANDS)
  private Boolean limitCommands;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_MAP = "map";
  @SerializedName(SERIALIZED_NAME_MAP)
  private String map;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_POI_LAYER = "poiLayer";
  @SerializedName(SERIALIZED_NAME_POI_LAYER)
  private String poiLayer;

  public static final String SERIALIZED_NAME_READONLY = "readonly";
  @SerializedName(SERIALIZED_NAME_READONLY)
  private Boolean readonly;

  public static final String SERIALIZED_NAME_TWELVE_HOUR_FORMAT = "twelveHourFormat";
  @SerializedName(SERIALIZED_NAME_TWELVE_HOUR_FORMAT)
  private Boolean twelveHourFormat;

  public static final String SERIALIZED_NAME_USER_LIMIT = "userLimit";
  @SerializedName(SERIALIZED_NAME_USER_LIMIT)
  private Integer userLimit;

  public static final String SERIALIZED_NAME_ZOOM = "zoom";
  @SerializedName(SERIALIZED_NAME_ZOOM)
  private Integer zoom;

  public User() {
  }

  public User administrator(Boolean administrator) {
    this.administrator = administrator;
    return this;
  }

  /**
   * Get administrator
   * @return administrator
   */
  @javax.annotation.Nullable
  public Boolean getAdministrator() {
    return administrator;
  }

  public void setAdministrator(Boolean administrator) {
    this.administrator = administrator;
  }


  public User attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public User coordinateFormat(String coordinateFormat) {
    this.coordinateFormat = coordinateFormat;
    return this;
  }

  /**
   * Get coordinateFormat
   * @return coordinateFormat
   */
  @javax.annotation.Nullable
  public String getCoordinateFormat() {
    return coordinateFormat;
  }

  public void setCoordinateFormat(String coordinateFormat) {
    this.coordinateFormat = coordinateFormat;
  }


  public User deviceLimit(Integer deviceLimit) {
    this.deviceLimit = deviceLimit;
    return this;
  }

  /**
   * Get deviceLimit
   * @return deviceLimit
   */
  @javax.annotation.Nullable
  public Integer getDeviceLimit() {
    return deviceLimit;
  }

  public void setDeviceLimit(Integer deviceLimit) {
    this.deviceLimit = deviceLimit;
  }


  public User deviceReadonly(Boolean deviceReadonly) {
    this.deviceReadonly = deviceReadonly;
    return this;
  }

  /**
   * Get deviceReadonly
   * @return deviceReadonly
   */
  @javax.annotation.Nullable
  public Boolean getDeviceReadonly() {
    return deviceReadonly;
  }

  public void setDeviceReadonly(Boolean deviceReadonly) {
    this.deviceReadonly = deviceReadonly;
  }


  public User disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   */
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public User expirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * in IS0 8601 format. eg. &#x60;1963-11-22T18:30:00Z&#x60;
   * @return expirationTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }


  public User id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public User latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @javax.annotation.Nullable
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public User limitCommands(Boolean limitCommands) {
    this.limitCommands = limitCommands;
    return this;
  }

  /**
   * Get limitCommands
   * @return limitCommands
   */
  @javax.annotation.Nullable
  public Boolean getLimitCommands() {
    return limitCommands;
  }

  public void setLimitCommands(Boolean limitCommands) {
    this.limitCommands = limitCommands;
  }


  public User longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @javax.annotation.Nullable
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public User map(String map) {
    this.map = map;
    return this;
  }

  /**
   * Get map
   * @return map
   */
  @javax.annotation.Nullable
  public String getMap() {
    return map;
  }

  public void setMap(String map) {
    this.map = map;
  }


  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public User poiLayer(String poiLayer) {
    this.poiLayer = poiLayer;
    return this;
  }

  /**
   * Get poiLayer
   * @return poiLayer
   */
  @javax.annotation.Nullable
  public String getPoiLayer() {
    return poiLayer;
  }

  public void setPoiLayer(String poiLayer) {
    this.poiLayer = poiLayer;
  }


  public User readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

  /**
   * Get readonly
   * @return readonly
   */
  @javax.annotation.Nullable
  public Boolean getReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }


  public User twelveHourFormat(Boolean twelveHourFormat) {
    this.twelveHourFormat = twelveHourFormat;
    return this;
  }

  /**
   * Get twelveHourFormat
   * @return twelveHourFormat
   */
  @javax.annotation.Nullable
  public Boolean getTwelveHourFormat() {
    return twelveHourFormat;
  }

  public void setTwelveHourFormat(Boolean twelveHourFormat) {
    this.twelveHourFormat = twelveHourFormat;
  }


  public User userLimit(Integer userLimit) {
    this.userLimit = userLimit;
    return this;
  }

  /**
   * Get userLimit
   * @return userLimit
   */
  @javax.annotation.Nullable
  public Integer getUserLimit() {
    return userLimit;
  }

  public void setUserLimit(Integer userLimit) {
    this.userLimit = userLimit;
  }


  public User zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

  /**
   * Get zoom
   * @return zoom
   */
  @javax.annotation.Nullable
  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.administrator, user.administrator) &&
        Objects.equals(this.attributes, user.attributes) &&
        Objects.equals(this.coordinateFormat, user.coordinateFormat) &&
        Objects.equals(this.deviceLimit, user.deviceLimit) &&
        Objects.equals(this.deviceReadonly, user.deviceReadonly) &&
        Objects.equals(this.disabled, user.disabled) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.expirationTime, user.expirationTime) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.latitude, user.latitude) &&
        Objects.equals(this.limitCommands, user.limitCommands) &&
        Objects.equals(this.longitude, user.longitude) &&
        Objects.equals(this.map, user.map) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.poiLayer, user.poiLayer) &&
        Objects.equals(this.readonly, user.readonly) &&
        Objects.equals(this.twelveHourFormat, user.twelveHourFormat) &&
        Objects.equals(this.userLimit, user.userLimit) &&
        Objects.equals(this.zoom, user.zoom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrator, attributes, coordinateFormat, deviceLimit, deviceReadonly, disabled, email, expirationTime, id, latitude, limitCommands, longitude, map, name, password, phone, poiLayer, readonly, twelveHourFormat, userLimit, zoom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    administrator: ").append(toIndentedString(administrator)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    coordinateFormat: ").append(toIndentedString(coordinateFormat)).append("\n");
    sb.append("    deviceLimit: ").append(toIndentedString(deviceLimit)).append("\n");
    sb.append("    deviceReadonly: ").append(toIndentedString(deviceReadonly)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    limitCommands: ").append(toIndentedString(limitCommands)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    poiLayer: ").append(toIndentedString(poiLayer)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    twelveHourFormat: ").append(toIndentedString(twelveHourFormat)).append("\n");
    sb.append("    userLimit: ").append(toIndentedString(userLimit)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
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
    openapiFields.add("administrator");
    openapiFields.add("attributes");
    openapiFields.add("coordinateFormat");
    openapiFields.add("deviceLimit");
    openapiFields.add("deviceReadonly");
    openapiFields.add("disabled");
    openapiFields.add("email");
    openapiFields.add("expirationTime");
    openapiFields.add("id");
    openapiFields.add("latitude");
    openapiFields.add("limitCommands");
    openapiFields.add("longitude");
    openapiFields.add("map");
    openapiFields.add("name");
    openapiFields.add("password");
    openapiFields.add("phone");
    openapiFields.add("poiLayer");
    openapiFields.add("readonly");
    openapiFields.add("twelveHourFormat");
    openapiFields.add("userLimit");
    openapiFields.add("zoom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("coordinateFormat") != null && !jsonObj.get("coordinateFormat").isJsonNull()) && !jsonObj.get("coordinateFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coordinateFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coordinateFormat").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("map") != null && !jsonObj.get("map").isJsonNull()) && !jsonObj.get("map").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `map` to be a primitive type in the JSON string but got `%s`", jsonObj.get("map").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("poiLayer") != null && !jsonObj.get("poiLayer").isJsonNull()) && !jsonObj.get("poiLayer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poiLayer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poiLayer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws IOException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

  /**
   * Convert an instance of User to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

