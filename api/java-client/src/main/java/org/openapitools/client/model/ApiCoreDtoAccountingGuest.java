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
import java.util.Arrays;
import org.openapitools.client.model.ApiCoreDtoAccountingConversionOptions;
import org.openapitools.client.model.ApiCoreDtoAccountingExtendedGrants;
import org.openapitools.client.model.ApiCoreDtoAccountingHitOptions;
import org.openapitools.client.model.ApiCoreDtoGrantsGrant;

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
 * ApiCoreDtoAccountingGuest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:19.349158-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoAccountingGuest {
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_CONVERSION_OPTIONS = "conversionOptions";
  @SerializedName(SERIALIZED_NAME_CONVERSION_OPTIONS)
  private ApiCoreDtoAccountingConversionOptions conversionOptions;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_CURRENT_GRANT = "currentGrant";
  @SerializedName(SERIALIZED_NAME_CURRENT_GRANT)
  private ApiCoreDtoGrantsGrant currentGrant;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_DECIMAL_SEPARATOR = "decimalSeparator";
  @SerializedName(SERIALIZED_NAME_DECIMAL_SEPARATOR)
  private String decimalSeparator;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTENDED_GRANTS = "extendedGrants";
  @SerializedName(SERIALIZED_NAME_EXTENDED_GRANTS)
  private ApiCoreDtoAccountingExtendedGrants extendedGrants;

  public static final String SERIALIZED_NAME_GROUP_GRANTS = "groupGrants";
  @SerializedName(SERIALIZED_NAME_GROUP_GRANTS)
  private Long groupGrants;

  public static final String SERIALIZED_NAME_HIT_OPTIONS = "hitOptions";
  @SerializedName(SERIALIZED_NAME_HIT_OPTIONS)
  private ApiCoreDtoAccountingHitOptions hitOptions;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LOGIN_COUNT = "loginCount";
  @SerializedName(SERIALIZED_NAME_LOGIN_COUNT)
  private Integer loginCount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_NUMBER_GROUP_SEPARATOR = "numberGroupSeparator";
  @SerializedName(SERIALIZED_NAME_NUMBER_GROUP_SEPARATOR)
  private String numberGroupSeparator;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  /**
   * Gets or Sets timeFormat
   */
  @JsonAdapter(TimeFormatEnum.Adapter.class)
  public enum TimeFormatEnum {
    AM_PM("AmPm"),
    
    H24("H24");

    private String value;

    TimeFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeFormatEnum fromValue(String value) {
      for (TimeFormatEnum b : TimeFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimeFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIME_FORMAT = "timeFormat";
  @SerializedName(SERIALIZED_NAME_TIME_FORMAT)
  private TimeFormatEnum timeFormat;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private Integer timeZone;

  public static final String SERIALIZED_NAME_TIMEFRAME_MIN_DATE = "timeframeMinDate";
  @SerializedName(SERIALIZED_NAME_TIMEFRAME_MIN_DATE)
  private String timeframeMinDate;

  public static final String SERIALIZED_NAME_TIMEZONENAME = "timezonename";
  @SerializedName(SERIALIZED_NAME_TIMEZONENAME)
  private String timezonename;

  public static final String SERIALIZED_NAME_TL_GRANTS = "tlGrants";
  @SerializedName(SERIALIZED_NAME_TL_GRANTS)
  private Long tlGrants;

  public static final String SERIALIZED_NAME_TP_GRANTS = "tpGrants";
  @SerializedName(SERIALIZED_NAME_TP_GRANTS)
  private Long tpGrants;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public ApiCoreDtoAccountingGuest() {
  }

  public ApiCoreDtoAccountingGuest apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
   */
  @javax.annotation.Nullable
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public ApiCoreDtoAccountingGuest conversionOptions(ApiCoreDtoAccountingConversionOptions conversionOptions) {
    this.conversionOptions = conversionOptions;
    return this;
  }

  /**
   * Get conversionOptions
   * @return conversionOptions
   */
  @javax.annotation.Nullable
  public ApiCoreDtoAccountingConversionOptions getConversionOptions() {
    return conversionOptions;
  }

  public void setConversionOptions(ApiCoreDtoAccountingConversionOptions conversionOptions) {
    this.conversionOptions = conversionOptions;
  }


  public ApiCoreDtoAccountingGuest creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return creationDate
   */
  @javax.annotation.Nullable
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public ApiCoreDtoAccountingGuest currentGrant(ApiCoreDtoGrantsGrant currentGrant) {
    this.currentGrant = currentGrant;
    return this;
  }

  /**
   * Get currentGrant
   * @return currentGrant
   */
  @javax.annotation.Nullable
  public ApiCoreDtoGrantsGrant getCurrentGrant() {
    return currentGrant;
  }

  public void setCurrentGrant(ApiCoreDtoGrantsGrant currentGrant) {
    this.currentGrant = currentGrant;
  }


  public ApiCoreDtoAccountingGuest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * Get dateFormat
   * @return dateFormat
   */
  @javax.annotation.Nullable
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public ApiCoreDtoAccountingGuest decimalSeparator(String decimalSeparator) {
    this.decimalSeparator = decimalSeparator;
    return this;
  }

  /**
   * Get decimalSeparator
   * @return decimalSeparator
   */
  @javax.annotation.Nullable
  public String getDecimalSeparator() {
    return decimalSeparator;
  }

  public void setDecimalSeparator(String decimalSeparator) {
    this.decimalSeparator = decimalSeparator;
  }


  public ApiCoreDtoAccountingGuest email(String email) {
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


  public ApiCoreDtoAccountingGuest extendedGrants(ApiCoreDtoAccountingExtendedGrants extendedGrants) {
    this.extendedGrants = extendedGrants;
    return this;
  }

  /**
   * Get extendedGrants
   * @return extendedGrants
   */
  @javax.annotation.Nullable
  public ApiCoreDtoAccountingExtendedGrants getExtendedGrants() {
    return extendedGrants;
  }

  public void setExtendedGrants(ApiCoreDtoAccountingExtendedGrants extendedGrants) {
    this.extendedGrants = extendedGrants;
  }


  public ApiCoreDtoAccountingGuest groupGrants(Long groupGrants) {
    this.groupGrants = groupGrants;
    return this;
  }

  /**
   * Get groupGrants
   * @return groupGrants
   */
  @javax.annotation.Nullable
  public Long getGroupGrants() {
    return groupGrants;
  }

  public void setGroupGrants(Long groupGrants) {
    this.groupGrants = groupGrants;
  }


  public ApiCoreDtoAccountingGuest hitOptions(ApiCoreDtoAccountingHitOptions hitOptions) {
    this.hitOptions = hitOptions;
    return this;
  }

  /**
   * Get hitOptions
   * @return hitOptions
   */
  @javax.annotation.Nullable
  public ApiCoreDtoAccountingHitOptions getHitOptions() {
    return hitOptions;
  }

  public void setHitOptions(ApiCoreDtoAccountingHitOptions hitOptions) {
    this.hitOptions = hitOptions;
  }


  public ApiCoreDtoAccountingGuest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public ApiCoreDtoAccountingGuest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public ApiCoreDtoAccountingGuest language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public ApiCoreDtoAccountingGuest loginCount(Integer loginCount) {
    this.loginCount = loginCount;
    return this;
  }

  /**
   * Get loginCount
   * @return loginCount
   */
  @javax.annotation.Nullable
  public Integer getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }


  public ApiCoreDtoAccountingGuest name(String name) {
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


  public ApiCoreDtoAccountingGuest notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ApiCoreDtoAccountingGuest numberGroupSeparator(String numberGroupSeparator) {
    this.numberGroupSeparator = numberGroupSeparator;
    return this;
  }

  /**
   * Get numberGroupSeparator
   * @return numberGroupSeparator
   */
  @javax.annotation.Nullable
  public String getNumberGroupSeparator() {
    return numberGroupSeparator;
  }

  public void setNumberGroupSeparator(String numberGroupSeparator) {
    this.numberGroupSeparator = numberGroupSeparator;
  }


  public ApiCoreDtoAccountingGuest password(String password) {
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


  public ApiCoreDtoAccountingGuest timeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

  /**
   * Get timeFormat
   * @return timeFormat
   */
  @javax.annotation.Nullable
  public TimeFormatEnum getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
  }


  public ApiCoreDtoAccountingGuest timeZone(Integer timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  @javax.annotation.Nullable
  public Integer getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(Integer timeZone) {
    this.timeZone = timeZone;
  }


  public ApiCoreDtoAccountingGuest timeframeMinDate(String timeframeMinDate) {
    this.timeframeMinDate = timeframeMinDate;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return timeframeMinDate
   */
  @javax.annotation.Nullable
  public String getTimeframeMinDate() {
    return timeframeMinDate;
  }

  public void setTimeframeMinDate(String timeframeMinDate) {
    this.timeframeMinDate = timeframeMinDate;
  }


  public ApiCoreDtoAccountingGuest timezonename(String timezonename) {
    this.timezonename = timezonename;
    return this;
  }

  /**
   * Get timezonename
   * @return timezonename
   */
  @javax.annotation.Nullable
  public String getTimezonename() {
    return timezonename;
  }

  public void setTimezonename(String timezonename) {
    this.timezonename = timezonename;
  }


  public ApiCoreDtoAccountingGuest tlGrants(Long tlGrants) {
    this.tlGrants = tlGrants;
    return this;
  }

  /**
   * Get tlGrants
   * @return tlGrants
   */
  @javax.annotation.Nullable
  public Long getTlGrants() {
    return tlGrants;
  }

  public void setTlGrants(Long tlGrants) {
    this.tlGrants = tlGrants;
  }


  public ApiCoreDtoAccountingGuest tpGrants(Long tpGrants) {
    this.tpGrants = tpGrants;
    return this;
  }

  /**
   * Get tpGrants
   * @return tpGrants
   */
  @javax.annotation.Nullable
  public Long getTpGrants() {
    return tpGrants;
  }

  public void setTpGrants(Long tpGrants) {
    this.tpGrants = tpGrants;
  }


  public ApiCoreDtoAccountingGuest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoAccountingGuest apiCoreDtoAccountingGuest = (ApiCoreDtoAccountingGuest) o;
    return Objects.equals(this.apiKey, apiCoreDtoAccountingGuest.apiKey) &&
        Objects.equals(this.conversionOptions, apiCoreDtoAccountingGuest.conversionOptions) &&
        Objects.equals(this.creationDate, apiCoreDtoAccountingGuest.creationDate) &&
        Objects.equals(this.currentGrant, apiCoreDtoAccountingGuest.currentGrant) &&
        Objects.equals(this.dateFormat, apiCoreDtoAccountingGuest.dateFormat) &&
        Objects.equals(this.decimalSeparator, apiCoreDtoAccountingGuest.decimalSeparator) &&
        Objects.equals(this.email, apiCoreDtoAccountingGuest.email) &&
        Objects.equals(this.extendedGrants, apiCoreDtoAccountingGuest.extendedGrants) &&
        Objects.equals(this.groupGrants, apiCoreDtoAccountingGuest.groupGrants) &&
        Objects.equals(this.hitOptions, apiCoreDtoAccountingGuest.hitOptions) &&
        Objects.equals(this.id, apiCoreDtoAccountingGuest.id) &&
        Objects.equals(this.key, apiCoreDtoAccountingGuest.key) &&
        Objects.equals(this.language, apiCoreDtoAccountingGuest.language) &&
        Objects.equals(this.loginCount, apiCoreDtoAccountingGuest.loginCount) &&
        Objects.equals(this.name, apiCoreDtoAccountingGuest.name) &&
        Objects.equals(this.notes, apiCoreDtoAccountingGuest.notes) &&
        Objects.equals(this.numberGroupSeparator, apiCoreDtoAccountingGuest.numberGroupSeparator) &&
        Objects.equals(this.password, apiCoreDtoAccountingGuest.password) &&
        Objects.equals(this.timeFormat, apiCoreDtoAccountingGuest.timeFormat) &&
        Objects.equals(this.timeZone, apiCoreDtoAccountingGuest.timeZone) &&
        Objects.equals(this.timeframeMinDate, apiCoreDtoAccountingGuest.timeframeMinDate) &&
        Objects.equals(this.timezonename, apiCoreDtoAccountingGuest.timezonename) &&
        Objects.equals(this.tlGrants, apiCoreDtoAccountingGuest.tlGrants) &&
        Objects.equals(this.tpGrants, apiCoreDtoAccountingGuest.tpGrants) &&
        Objects.equals(this.userName, apiCoreDtoAccountingGuest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, conversionOptions, creationDate, currentGrant, dateFormat, decimalSeparator, email, extendedGrants, groupGrants, hitOptions, id, key, language, loginCount, name, notes, numberGroupSeparator, password, timeFormat, timeZone, timeframeMinDate, timezonename, tlGrants, tpGrants, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoAccountingGuest {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    conversionOptions: ").append(toIndentedString(conversionOptions)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    currentGrant: ").append(toIndentedString(currentGrant)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    decimalSeparator: ").append(toIndentedString(decimalSeparator)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    extendedGrants: ").append(toIndentedString(extendedGrants)).append("\n");
    sb.append("    groupGrants: ").append(toIndentedString(groupGrants)).append("\n");
    sb.append("    hitOptions: ").append(toIndentedString(hitOptions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    loginCount: ").append(toIndentedString(loginCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numberGroupSeparator: ").append(toIndentedString(numberGroupSeparator)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeframeMinDate: ").append(toIndentedString(timeframeMinDate)).append("\n");
    sb.append("    timezonename: ").append(toIndentedString(timezonename)).append("\n");
    sb.append("    tlGrants: ").append(toIndentedString(tlGrants)).append("\n");
    sb.append("    tpGrants: ").append(toIndentedString(tpGrants)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("apiKey");
    openapiFields.add("conversionOptions");
    openapiFields.add("creationDate");
    openapiFields.add("currentGrant");
    openapiFields.add("dateFormat");
    openapiFields.add("decimalSeparator");
    openapiFields.add("email");
    openapiFields.add("extendedGrants");
    openapiFields.add("groupGrants");
    openapiFields.add("hitOptions");
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("language");
    openapiFields.add("loginCount");
    openapiFields.add("name");
    openapiFields.add("notes");
    openapiFields.add("numberGroupSeparator");
    openapiFields.add("password");
    openapiFields.add("timeFormat");
    openapiFields.add("timeZone");
    openapiFields.add("timeframeMinDate");
    openapiFields.add("timezonename");
    openapiFields.add("tlGrants");
    openapiFields.add("tpGrants");
    openapiFields.add("userName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoAccountingGuest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoAccountingGuest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoAccountingGuest is not found in the empty JSON string", ApiCoreDtoAccountingGuest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoAccountingGuest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoAccountingGuest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiKey") != null && !jsonObj.get("apiKey").isJsonNull()) && !jsonObj.get("apiKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiKey").toString()));
      }
      // validate the optional field `conversionOptions`
      if (jsonObj.get("conversionOptions") != null && !jsonObj.get("conversionOptions").isJsonNull()) {
        ApiCoreDtoAccountingConversionOptions.validateJsonElement(jsonObj.get("conversionOptions"));
      }
      if ((jsonObj.get("creationDate") != null && !jsonObj.get("creationDate").isJsonNull()) && !jsonObj.get("creationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creationDate").toString()));
      }
      // validate the optional field `currentGrant`
      if (jsonObj.get("currentGrant") != null && !jsonObj.get("currentGrant").isJsonNull()) {
        ApiCoreDtoGrantsGrant.validateJsonElement(jsonObj.get("currentGrant"));
      }
      if ((jsonObj.get("dateFormat") != null && !jsonObj.get("dateFormat").isJsonNull()) && !jsonObj.get("dateFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateFormat").toString()));
      }
      if ((jsonObj.get("decimalSeparator") != null && !jsonObj.get("decimalSeparator").isJsonNull()) && !jsonObj.get("decimalSeparator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decimalSeparator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decimalSeparator").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `extendedGrants`
      if (jsonObj.get("extendedGrants") != null && !jsonObj.get("extendedGrants").isJsonNull()) {
        ApiCoreDtoAccountingExtendedGrants.validateJsonElement(jsonObj.get("extendedGrants"));
      }
      // validate the optional field `hitOptions`
      if (jsonObj.get("hitOptions") != null && !jsonObj.get("hitOptions").isJsonNull()) {
        ApiCoreDtoAccountingHitOptions.validateJsonElement(jsonObj.get("hitOptions"));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("numberGroupSeparator") != null && !jsonObj.get("numberGroupSeparator").isJsonNull()) && !jsonObj.get("numberGroupSeparator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberGroupSeparator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberGroupSeparator").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("timeFormat") != null && !jsonObj.get("timeFormat").isJsonNull()) && !jsonObj.get("timeFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeFormat").toString()));
      }
      // validate the optional field `timeFormat`
      if (jsonObj.get("timeFormat") != null && !jsonObj.get("timeFormat").isJsonNull()) {
        TimeFormatEnum.validateJsonElement(jsonObj.get("timeFormat"));
      }
      if ((jsonObj.get("timeframeMinDate") != null && !jsonObj.get("timeframeMinDate").isJsonNull()) && !jsonObj.get("timeframeMinDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeframeMinDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeframeMinDate").toString()));
      }
      if ((jsonObj.get("timezonename") != null && !jsonObj.get("timezonename").isJsonNull()) && !jsonObj.get("timezonename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezonename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezonename").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoAccountingGuest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoAccountingGuest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoAccountingGuest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoAccountingGuest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoAccountingGuest>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoAccountingGuest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoAccountingGuest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoAccountingGuest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoAccountingGuest
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoAccountingGuest
   */
  public static ApiCoreDtoAccountingGuest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoAccountingGuest.class);
  }

  /**
   * Convert an instance of ApiCoreDtoAccountingGuest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

