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
 * Server
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:49.238697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Server {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_BING_KEY = "bingKey";
  @SerializedName(SERIALIZED_NAME_BING_KEY)
  private String bingKey;

  public static final String SERIALIZED_NAME_COORDINATE_FORMAT = "coordinateFormat";
  @SerializedName(SERIALIZED_NAME_COORDINATE_FORMAT)
  private String coordinateFormat;

  public static final String SERIALIZED_NAME_DEVICE_READONLY = "deviceReadonly";
  @SerializedName(SERIALIZED_NAME_DEVICE_READONLY)
  private Boolean deviceReadonly;

  public static final String SERIALIZED_NAME_FORCE_SETTINGS = "forceSettings";
  @SerializedName(SERIALIZED_NAME_FORCE_SETTINGS)
  private Boolean forceSettings;

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

  public static final String SERIALIZED_NAME_MAP_URL = "mapUrl";
  @SerializedName(SERIALIZED_NAME_MAP_URL)
  private String mapUrl;

  public static final String SERIALIZED_NAME_POI_LAYER = "poiLayer";
  @SerializedName(SERIALIZED_NAME_POI_LAYER)
  private String poiLayer;

  public static final String SERIALIZED_NAME_READONLY = "readonly";
  @SerializedName(SERIALIZED_NAME_READONLY)
  private Boolean readonly;

  public static final String SERIALIZED_NAME_REGISTRATION = "registration";
  @SerializedName(SERIALIZED_NAME_REGISTRATION)
  private Boolean registration;

  public static final String SERIALIZED_NAME_TWELVE_HOUR_FORMAT = "twelveHourFormat";
  @SerializedName(SERIALIZED_NAME_TWELVE_HOUR_FORMAT)
  private Boolean twelveHourFormat;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ZOOM = "zoom";
  @SerializedName(SERIALIZED_NAME_ZOOM)
  private Integer zoom;

  public Server() {
  }

  public Server attributes(Object attributes) {
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


  public Server bingKey(String bingKey) {
    this.bingKey = bingKey;
    return this;
  }

  /**
   * Get bingKey
   * @return bingKey
   */
  @javax.annotation.Nullable
  public String getBingKey() {
    return bingKey;
  }

  public void setBingKey(String bingKey) {
    this.bingKey = bingKey;
  }


  public Server coordinateFormat(String coordinateFormat) {
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


  public Server deviceReadonly(Boolean deviceReadonly) {
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


  public Server forceSettings(Boolean forceSettings) {
    this.forceSettings = forceSettings;
    return this;
  }

  /**
   * Get forceSettings
   * @return forceSettings
   */
  @javax.annotation.Nullable
  public Boolean getForceSettings() {
    return forceSettings;
  }

  public void setForceSettings(Boolean forceSettings) {
    this.forceSettings = forceSettings;
  }


  public Server id(Integer id) {
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


  public Server latitude(BigDecimal latitude) {
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


  public Server limitCommands(Boolean limitCommands) {
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


  public Server longitude(BigDecimal longitude) {
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


  public Server map(String map) {
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


  public Server mapUrl(String mapUrl) {
    this.mapUrl = mapUrl;
    return this;
  }

  /**
   * Get mapUrl
   * @return mapUrl
   */
  @javax.annotation.Nullable
  public String getMapUrl() {
    return mapUrl;
  }

  public void setMapUrl(String mapUrl) {
    this.mapUrl = mapUrl;
  }


  public Server poiLayer(String poiLayer) {
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


  public Server readonly(Boolean readonly) {
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


  public Server registration(Boolean registration) {
    this.registration = registration;
    return this;
  }

  /**
   * Get registration
   * @return registration
   */
  @javax.annotation.Nullable
  public Boolean getRegistration() {
    return registration;
  }

  public void setRegistration(Boolean registration) {
    this.registration = registration;
  }


  public Server twelveHourFormat(Boolean twelveHourFormat) {
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


  public Server version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Server zoom(Integer zoom) {
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
    Server server = (Server) o;
    return Objects.equals(this.attributes, server.attributes) &&
        Objects.equals(this.bingKey, server.bingKey) &&
        Objects.equals(this.coordinateFormat, server.coordinateFormat) &&
        Objects.equals(this.deviceReadonly, server.deviceReadonly) &&
        Objects.equals(this.forceSettings, server.forceSettings) &&
        Objects.equals(this.id, server.id) &&
        Objects.equals(this.latitude, server.latitude) &&
        Objects.equals(this.limitCommands, server.limitCommands) &&
        Objects.equals(this.longitude, server.longitude) &&
        Objects.equals(this.map, server.map) &&
        Objects.equals(this.mapUrl, server.mapUrl) &&
        Objects.equals(this.poiLayer, server.poiLayer) &&
        Objects.equals(this.readonly, server.readonly) &&
        Objects.equals(this.registration, server.registration) &&
        Objects.equals(this.twelveHourFormat, server.twelveHourFormat) &&
        Objects.equals(this.version, server.version) &&
        Objects.equals(this.zoom, server.zoom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, bingKey, coordinateFormat, deviceReadonly, forceSettings, id, latitude, limitCommands, longitude, map, mapUrl, poiLayer, readonly, registration, twelveHourFormat, version, zoom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Server {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    bingKey: ").append(toIndentedString(bingKey)).append("\n");
    sb.append("    coordinateFormat: ").append(toIndentedString(coordinateFormat)).append("\n");
    sb.append("    deviceReadonly: ").append(toIndentedString(deviceReadonly)).append("\n");
    sb.append("    forceSettings: ").append(toIndentedString(forceSettings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    limitCommands: ").append(toIndentedString(limitCommands)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    mapUrl: ").append(toIndentedString(mapUrl)).append("\n");
    sb.append("    poiLayer: ").append(toIndentedString(poiLayer)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    twelveHourFormat: ").append(toIndentedString(twelveHourFormat)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("bingKey");
    openapiFields.add("coordinateFormat");
    openapiFields.add("deviceReadonly");
    openapiFields.add("forceSettings");
    openapiFields.add("id");
    openapiFields.add("latitude");
    openapiFields.add("limitCommands");
    openapiFields.add("longitude");
    openapiFields.add("map");
    openapiFields.add("mapUrl");
    openapiFields.add("poiLayer");
    openapiFields.add("readonly");
    openapiFields.add("registration");
    openapiFields.add("twelveHourFormat");
    openapiFields.add("version");
    openapiFields.add("zoom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Server
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Server.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Server is not found in the empty JSON string", Server.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Server.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Server` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bingKey") != null && !jsonObj.get("bingKey").isJsonNull()) && !jsonObj.get("bingKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bingKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bingKey").toString()));
      }
      if ((jsonObj.get("coordinateFormat") != null && !jsonObj.get("coordinateFormat").isJsonNull()) && !jsonObj.get("coordinateFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coordinateFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coordinateFormat").toString()));
      }
      if ((jsonObj.get("map") != null && !jsonObj.get("map").isJsonNull()) && !jsonObj.get("map").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `map` to be a primitive type in the JSON string but got `%s`", jsonObj.get("map").toString()));
      }
      if ((jsonObj.get("mapUrl") != null && !jsonObj.get("mapUrl").isJsonNull()) && !jsonObj.get("mapUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mapUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mapUrl").toString()));
      }
      if ((jsonObj.get("poiLayer") != null && !jsonObj.get("poiLayer").isJsonNull()) && !jsonObj.get("poiLayer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poiLayer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poiLayer").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Server.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Server' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Server> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Server.class));

       return (TypeAdapter<T>) new TypeAdapter<Server>() {
           @Override
           public void write(JsonWriter out, Server value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Server read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Server given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Server
   * @throws IOException if the JSON string is invalid with respect to Server
   */
  public static Server fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Server.class);
  }

  /**
   * Convert an instance of Server to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

