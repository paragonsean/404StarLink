/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ApiCoreDtoClickStreamHitBrowserInfo;
import org.openapitools.client.model.ApiCoreDtoClickStreamHitConversionInfo;
import org.openapitools.client.model.ApiCoreDtoClickStreamHitDatapointInfo;
import org.openapitools.client.model.ApiCoreDtoClickStreamHitLocationInfo;
import org.openapitools.client.model.ApiCoreDtoClickStreamHitOsInfo;
import org.openapitools.client.model.ApiCoreDtoClickStreamHitSource;

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
 * ApiCoreDtoClickStreamHit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:19.349158-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoClickStreamHit {
  public static final String SERIALIZED_NAME_ACCESS_TIME = "accessTime";
  @SerializedName(SERIALIZED_NAME_ACCESS_TIME)
  private String accessTime;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private ApiCoreDtoClickStreamHitBrowserInfo browser;

  public static final String SERIALIZED_NAME_CLIENT_LANGUAGE = "clientLanguage";
  @SerializedName(SERIALIZED_NAME_CLIENT_LANGUAGE)
  private String clientLanguage;

  public static final String SERIALIZED_NAME_CONVERSION1 = "conversion1";
  @SerializedName(SERIALIZED_NAME_CONVERSION1)
  private ApiCoreDtoClickStreamHitConversionInfo conversion1;

  public static final String SERIALIZED_NAME_CONVERSION2 = "conversion2";
  @SerializedName(SERIALIZED_NAME_CONVERSION2)
  private ApiCoreDtoClickStreamHitConversionInfo conversion2;

  public static final String SERIALIZED_NAME_CONVERSION3 = "conversion3";
  @SerializedName(SERIALIZED_NAME_CONVERSION3)
  private ApiCoreDtoClickStreamHitConversionInfo conversion3;

  public static final String SERIALIZED_NAME_CONVERSION4 = "conversion4";
  @SerializedName(SERIALIZED_NAME_CONVERSION4)
  private ApiCoreDtoClickStreamHitConversionInfo conversion4;

  public static final String SERIALIZED_NAME_CONVERSION5 = "conversion5";
  @SerializedName(SERIALIZED_NAME_CONVERSION5)
  private ApiCoreDtoClickStreamHitConversionInfo conversion5;

  public static final String SERIALIZED_NAME_CONVERSIONS = "conversions";
  @SerializedName(SERIALIZED_NAME_CONVERSIONS)
  private List<ApiCoreDtoClickStreamHitConversionInfo> conversions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private ApiCoreDtoClickStreamHitDatapointInfo entity;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IS_PROXY = "isProxy";
  @SerializedName(SERIALIZED_NAME_IS_PROXY)
  private String isProxy;

  public static final String SERIALIZED_NAME_IS_SPIDER = "isSpider";
  @SerializedName(SERIALIZED_NAME_IS_SPIDER)
  private String isSpider;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "isUnique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private String isUnique;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private ApiCoreDtoClickStreamHitLocationInfo location;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private String org;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private ApiCoreDtoClickStreamHitOsInfo os;

  public static final String SERIALIZED_NAME_QUERY_PARAMS = "queryParams";
  @SerializedName(SERIALIZED_NAME_QUERY_PARAMS)
  private String queryParams;

  public static final String SERIALIZED_NAME_REAL_DESTINATION_URL = "realDestinationUrl";
  @SerializedName(SERIALIZED_NAME_REAL_DESTINATION_URL)
  private String realDestinationUrl;

  public static final String SERIALIZED_NAME_REFERER = "referer";
  @SerializedName(SERIALIZED_NAME_REFERER)
  private String referer;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ApiCoreDtoClickStreamHitSource source;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ApiCoreDtoClickStreamHit() {
  }

  public ApiCoreDtoClickStreamHit accessTime(String accessTime) {
    this.accessTime = accessTime;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return accessTime
   */
  @javax.annotation.Nullable
  public String getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(String accessTime) {
    this.accessTime = accessTime;
  }


  public ApiCoreDtoClickStreamHit browser(ApiCoreDtoClickStreamHitBrowserInfo browser) {
    this.browser = browser;
    return this;
  }

  /**
   * Get browser
   * @return browser
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitBrowserInfo getBrowser() {
    return browser;
  }

  public void setBrowser(ApiCoreDtoClickStreamHitBrowserInfo browser) {
    this.browser = browser;
  }


  public ApiCoreDtoClickStreamHit clientLanguage(String clientLanguage) {
    this.clientLanguage = clientLanguage;
    return this;
  }

  /**
   * Get clientLanguage
   * @return clientLanguage
   */
  @javax.annotation.Nullable
  public String getClientLanguage() {
    return clientLanguage;
  }

  public void setClientLanguage(String clientLanguage) {
    this.clientLanguage = clientLanguage;
  }


  public ApiCoreDtoClickStreamHit conversion1(ApiCoreDtoClickStreamHitConversionInfo conversion1) {
    this.conversion1 = conversion1;
    return this;
  }

  /**
   * Get conversion1
   * @return conversion1
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitConversionInfo getConversion1() {
    return conversion1;
  }

  public void setConversion1(ApiCoreDtoClickStreamHitConversionInfo conversion1) {
    this.conversion1 = conversion1;
  }


  public ApiCoreDtoClickStreamHit conversion2(ApiCoreDtoClickStreamHitConversionInfo conversion2) {
    this.conversion2 = conversion2;
    return this;
  }

  /**
   * Get conversion2
   * @return conversion2
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitConversionInfo getConversion2() {
    return conversion2;
  }

  public void setConversion2(ApiCoreDtoClickStreamHitConversionInfo conversion2) {
    this.conversion2 = conversion2;
  }


  public ApiCoreDtoClickStreamHit conversion3(ApiCoreDtoClickStreamHitConversionInfo conversion3) {
    this.conversion3 = conversion3;
    return this;
  }

  /**
   * Get conversion3
   * @return conversion3
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitConversionInfo getConversion3() {
    return conversion3;
  }

  public void setConversion3(ApiCoreDtoClickStreamHitConversionInfo conversion3) {
    this.conversion3 = conversion3;
  }


  public ApiCoreDtoClickStreamHit conversion4(ApiCoreDtoClickStreamHitConversionInfo conversion4) {
    this.conversion4 = conversion4;
    return this;
  }

  /**
   * Get conversion4
   * @return conversion4
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitConversionInfo getConversion4() {
    return conversion4;
  }

  public void setConversion4(ApiCoreDtoClickStreamHitConversionInfo conversion4) {
    this.conversion4 = conversion4;
  }


  public ApiCoreDtoClickStreamHit conversion5(ApiCoreDtoClickStreamHitConversionInfo conversion5) {
    this.conversion5 = conversion5;
    return this;
  }

  /**
   * Get conversion5
   * @return conversion5
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitConversionInfo getConversion5() {
    return conversion5;
  }

  public void setConversion5(ApiCoreDtoClickStreamHitConversionInfo conversion5) {
    this.conversion5 = conversion5;
  }


  public ApiCoreDtoClickStreamHit conversions(List<ApiCoreDtoClickStreamHitConversionInfo> conversions) {
    this.conversions = conversions;
    return this;
  }

  public ApiCoreDtoClickStreamHit addConversionsItem(ApiCoreDtoClickStreamHitConversionInfo conversionsItem) {
    if (this.conversions == null) {
      this.conversions = new ArrayList<>();
    }
    this.conversions.add(conversionsItem);
    return this;
  }

  /**
   * Get conversions
   * @return conversions
   */
  @javax.annotation.Nullable
  public List<ApiCoreDtoClickStreamHitConversionInfo> getConversions() {
    return conversions;
  }

  public void setConversions(List<ApiCoreDtoClickStreamHitConversionInfo> conversions) {
    this.conversions = conversions;
  }


  public ApiCoreDtoClickStreamHit entity(ApiCoreDtoClickStreamHitDatapointInfo entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitDatapointInfo getEntity() {
    return entity;
  }

  public void setEntity(ApiCoreDtoClickStreamHitDatapointInfo entity) {
    this.entity = entity;
  }


  public ApiCoreDtoClickStreamHit ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   */
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public ApiCoreDtoClickStreamHit isProxy(String isProxy) {
    this.isProxy = isProxy;
    return this;
  }

  /**
   * Get isProxy
   * @return isProxy
   */
  @javax.annotation.Nullable
  public String getIsProxy() {
    return isProxy;
  }

  public void setIsProxy(String isProxy) {
    this.isProxy = isProxy;
  }


  public ApiCoreDtoClickStreamHit isSpider(String isSpider) {
    this.isSpider = isSpider;
    return this;
  }

  /**
   * Get isSpider
   * @return isSpider
   */
  @javax.annotation.Nullable
  public String getIsSpider() {
    return isSpider;
  }

  public void setIsSpider(String isSpider) {
    this.isSpider = isSpider;
  }


  public ApiCoreDtoClickStreamHit isUnique(String isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * Get isUnique
   * @return isUnique
   */
  @javax.annotation.Nullable
  public String getIsUnique() {
    return isUnique;
  }

  public void setIsUnique(String isUnique) {
    this.isUnique = isUnique;
  }


  public ApiCoreDtoClickStreamHit location(ApiCoreDtoClickStreamHitLocationInfo location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitLocationInfo getLocation() {
    return location;
  }

  public void setLocation(ApiCoreDtoClickStreamHitLocationInfo location) {
    this.location = location;
  }


  public ApiCoreDtoClickStreamHit org(String org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nullable
  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }


  public ApiCoreDtoClickStreamHit os(ApiCoreDtoClickStreamHitOsInfo os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitOsInfo getOs() {
    return os;
  }

  public void setOs(ApiCoreDtoClickStreamHitOsInfo os) {
    this.os = os;
  }


  public ApiCoreDtoClickStreamHit queryParams(String queryParams) {
    this.queryParams = queryParams;
    return this;
  }

  /**
   * Get queryParams
   * @return queryParams
   */
  @javax.annotation.Nullable
  public String getQueryParams() {
    return queryParams;
  }

  public void setQueryParams(String queryParams) {
    this.queryParams = queryParams;
  }


  public ApiCoreDtoClickStreamHit realDestinationUrl(String realDestinationUrl) {
    this.realDestinationUrl = realDestinationUrl;
    return this;
  }

  /**
   * Get realDestinationUrl
   * @return realDestinationUrl
   */
  @javax.annotation.Nullable
  public String getRealDestinationUrl() {
    return realDestinationUrl;
  }

  public void setRealDestinationUrl(String realDestinationUrl) {
    this.realDestinationUrl = realDestinationUrl;
  }


  public ApiCoreDtoClickStreamHit referer(String referer) {
    this.referer = referer;
    return this;
  }

  /**
   * Get referer
   * @return referer
   */
  @javax.annotation.Nullable
  public String getReferer() {
    return referer;
  }

  public void setReferer(String referer) {
    this.referer = referer;
  }


  public ApiCoreDtoClickStreamHit source(ApiCoreDtoClickStreamHitSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public ApiCoreDtoClickStreamHitSource getSource() {
    return source;
  }

  public void setSource(ApiCoreDtoClickStreamHitSource source) {
    this.source = source;
  }


  public ApiCoreDtoClickStreamHit type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoClickStreamHit apiCoreDtoClickStreamHit = (ApiCoreDtoClickStreamHit) o;
    return Objects.equals(this.accessTime, apiCoreDtoClickStreamHit.accessTime) &&
        Objects.equals(this.browser, apiCoreDtoClickStreamHit.browser) &&
        Objects.equals(this.clientLanguage, apiCoreDtoClickStreamHit.clientLanguage) &&
        Objects.equals(this.conversion1, apiCoreDtoClickStreamHit.conversion1) &&
        Objects.equals(this.conversion2, apiCoreDtoClickStreamHit.conversion2) &&
        Objects.equals(this.conversion3, apiCoreDtoClickStreamHit.conversion3) &&
        Objects.equals(this.conversion4, apiCoreDtoClickStreamHit.conversion4) &&
        Objects.equals(this.conversion5, apiCoreDtoClickStreamHit.conversion5) &&
        Objects.equals(this.conversions, apiCoreDtoClickStreamHit.conversions) &&
        Objects.equals(this.entity, apiCoreDtoClickStreamHit.entity) &&
        Objects.equals(this.ip, apiCoreDtoClickStreamHit.ip) &&
        Objects.equals(this.isProxy, apiCoreDtoClickStreamHit.isProxy) &&
        Objects.equals(this.isSpider, apiCoreDtoClickStreamHit.isSpider) &&
        Objects.equals(this.isUnique, apiCoreDtoClickStreamHit.isUnique) &&
        Objects.equals(this.location, apiCoreDtoClickStreamHit.location) &&
        Objects.equals(this.org, apiCoreDtoClickStreamHit.org) &&
        Objects.equals(this.os, apiCoreDtoClickStreamHit.os) &&
        Objects.equals(this.queryParams, apiCoreDtoClickStreamHit.queryParams) &&
        Objects.equals(this.realDestinationUrl, apiCoreDtoClickStreamHit.realDestinationUrl) &&
        Objects.equals(this.referer, apiCoreDtoClickStreamHit.referer) &&
        Objects.equals(this.source, apiCoreDtoClickStreamHit.source) &&
        Objects.equals(this.type, apiCoreDtoClickStreamHit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTime, browser, clientLanguage, conversion1, conversion2, conversion3, conversion4, conversion5, conversions, entity, ip, isProxy, isSpider, isUnique, location, org, os, queryParams, realDestinationUrl, referer, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoClickStreamHit {\n");
    sb.append("    accessTime: ").append(toIndentedString(accessTime)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    clientLanguage: ").append(toIndentedString(clientLanguage)).append("\n");
    sb.append("    conversion1: ").append(toIndentedString(conversion1)).append("\n");
    sb.append("    conversion2: ").append(toIndentedString(conversion2)).append("\n");
    sb.append("    conversion3: ").append(toIndentedString(conversion3)).append("\n");
    sb.append("    conversion4: ").append(toIndentedString(conversion4)).append("\n");
    sb.append("    conversion5: ").append(toIndentedString(conversion5)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    isProxy: ").append(toIndentedString(isProxy)).append("\n");
    sb.append("    isSpider: ").append(toIndentedString(isSpider)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    queryParams: ").append(toIndentedString(queryParams)).append("\n");
    sb.append("    realDestinationUrl: ").append(toIndentedString(realDestinationUrl)).append("\n");
    sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("accessTime");
    openapiFields.add("browser");
    openapiFields.add("clientLanguage");
    openapiFields.add("conversion1");
    openapiFields.add("conversion2");
    openapiFields.add("conversion3");
    openapiFields.add("conversion4");
    openapiFields.add("conversion5");
    openapiFields.add("conversions");
    openapiFields.add("entity");
    openapiFields.add("ip");
    openapiFields.add("isProxy");
    openapiFields.add("isSpider");
    openapiFields.add("isUnique");
    openapiFields.add("location");
    openapiFields.add("org");
    openapiFields.add("os");
    openapiFields.add("queryParams");
    openapiFields.add("realDestinationUrl");
    openapiFields.add("referer");
    openapiFields.add("source");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoClickStreamHit
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoClickStreamHit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoClickStreamHit is not found in the empty JSON string", ApiCoreDtoClickStreamHit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoClickStreamHit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoClickStreamHit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accessTime") != null && !jsonObj.get("accessTime").isJsonNull()) && !jsonObj.get("accessTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessTime").toString()));
      }
      // validate the optional field `browser`
      if (jsonObj.get("browser") != null && !jsonObj.get("browser").isJsonNull()) {
        ApiCoreDtoClickStreamHitBrowserInfo.validateJsonElement(jsonObj.get("browser"));
      }
      if ((jsonObj.get("clientLanguage") != null && !jsonObj.get("clientLanguage").isJsonNull()) && !jsonObj.get("clientLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientLanguage").toString()));
      }
      // validate the optional field `conversion1`
      if (jsonObj.get("conversion1") != null && !jsonObj.get("conversion1").isJsonNull()) {
        ApiCoreDtoClickStreamHitConversionInfo.validateJsonElement(jsonObj.get("conversion1"));
      }
      // validate the optional field `conversion2`
      if (jsonObj.get("conversion2") != null && !jsonObj.get("conversion2").isJsonNull()) {
        ApiCoreDtoClickStreamHitConversionInfo.validateJsonElement(jsonObj.get("conversion2"));
      }
      // validate the optional field `conversion3`
      if (jsonObj.get("conversion3") != null && !jsonObj.get("conversion3").isJsonNull()) {
        ApiCoreDtoClickStreamHitConversionInfo.validateJsonElement(jsonObj.get("conversion3"));
      }
      // validate the optional field `conversion4`
      if (jsonObj.get("conversion4") != null && !jsonObj.get("conversion4").isJsonNull()) {
        ApiCoreDtoClickStreamHitConversionInfo.validateJsonElement(jsonObj.get("conversion4"));
      }
      // validate the optional field `conversion5`
      if (jsonObj.get("conversion5") != null && !jsonObj.get("conversion5").isJsonNull()) {
        ApiCoreDtoClickStreamHitConversionInfo.validateJsonElement(jsonObj.get("conversion5"));
      }
      if (jsonObj.get("conversions") != null && !jsonObj.get("conversions").isJsonNull()) {
        JsonArray jsonArrayconversions = jsonObj.getAsJsonArray("conversions");
        if (jsonArrayconversions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conversions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conversions` to be an array in the JSON string but got `%s`", jsonObj.get("conversions").toString()));
          }

          // validate the optional field `conversions` (array)
          for (int i = 0; i < jsonArrayconversions.size(); i++) {
            ApiCoreDtoClickStreamHitConversionInfo.validateJsonElement(jsonArrayconversions.get(i));
          };
        }
      }
      // validate the optional field `entity`
      if (jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) {
        ApiCoreDtoClickStreamHitDatapointInfo.validateJsonElement(jsonObj.get("entity"));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("isProxy") != null && !jsonObj.get("isProxy").isJsonNull()) && !jsonObj.get("isProxy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isProxy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isProxy").toString()));
      }
      if ((jsonObj.get("isSpider") != null && !jsonObj.get("isSpider").isJsonNull()) && !jsonObj.get("isSpider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isSpider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isSpider").toString()));
      }
      if ((jsonObj.get("isUnique") != null && !jsonObj.get("isUnique").isJsonNull()) && !jsonObj.get("isUnique").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isUnique` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isUnique").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        ApiCoreDtoClickStreamHitLocationInfo.validateJsonElement(jsonObj.get("location"));
      }
      if ((jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) && !jsonObj.get("org").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org").toString()));
      }
      // validate the optional field `os`
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) {
        ApiCoreDtoClickStreamHitOsInfo.validateJsonElement(jsonObj.get("os"));
      }
      if ((jsonObj.get("queryParams") != null && !jsonObj.get("queryParams").isJsonNull()) && !jsonObj.get("queryParams").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryParams` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queryParams").toString()));
      }
      if ((jsonObj.get("realDestinationUrl") != null && !jsonObj.get("realDestinationUrl").isJsonNull()) && !jsonObj.get("realDestinationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realDestinationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realDestinationUrl").toString()));
      }
      if ((jsonObj.get("referer") != null && !jsonObj.get("referer").isJsonNull()) && !jsonObj.get("referer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referer").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        ApiCoreDtoClickStreamHitSource.validateJsonElement(jsonObj.get("source"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoClickStreamHit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoClickStreamHit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoClickStreamHit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoClickStreamHit.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoClickStreamHit>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoClickStreamHit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoClickStreamHit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoClickStreamHit given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoClickStreamHit
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoClickStreamHit
   */
  public static ApiCoreDtoClickStreamHit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoClickStreamHit.class);
  }

  /**
   * Convert an instance of ApiCoreDtoClickStreamHit to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

