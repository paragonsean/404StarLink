/*
 * Superset
 * Superset
 *
 * The version of the OpenAPI document: v1
 * 
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Meta43;
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
 * LogRestApiGet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LogRestApiGet {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_DASHBOARD_ID = "dashboard_id";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ID)
  private Integer dashboardId;

  public static final String SERIALIZED_NAME_DTTM = "dttm";
  @SerializedName(SERIALIZED_NAME_DTTM)
  private OffsetDateTime dttm;

  public static final String SERIALIZED_NAME_DURATION_MS = "duration_ms";
  @SerializedName(SERIALIZED_NAME_DURATION_MS)
  private Integer durationMs;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private String json;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private String referrer;

  public static final String SERIALIZED_NAME_SLICE_ID = "slice_id";
  @SerializedName(SERIALIZED_NAME_SLICE_ID)
  private Integer sliceId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Meta43 user;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public LogRestApiGet() {
  }

  public LogRestApiGet action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public LogRestApiGet dashboardId(Integer dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * Get dashboardId
   * @return dashboardId
   */
  @javax.annotation.Nullable
  public Integer getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(Integer dashboardId) {
    this.dashboardId = dashboardId;
  }


  public LogRestApiGet dttm(OffsetDateTime dttm) {
    this.dttm = dttm;
    return this;
  }

  /**
   * Get dttm
   * @return dttm
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDttm() {
    return dttm;
  }

  public void setDttm(OffsetDateTime dttm) {
    this.dttm = dttm;
  }


  public LogRestApiGet durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Get durationMs
   * @return durationMs
   */
  @javax.annotation.Nullable
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }


  public LogRestApiGet json(String json) {
    this.json = json;
    return this;
  }

  /**
   * Get json
   * @return json
   */
  @javax.annotation.Nullable
  public String getJson() {
    return json;
  }

  public void setJson(String json) {
    this.json = json;
  }


  public LogRestApiGet referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

  /**
   * Get referrer
   * @return referrer
   */
  @javax.annotation.Nullable
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  public LogRestApiGet sliceId(Integer sliceId) {
    this.sliceId = sliceId;
    return this;
  }

  /**
   * Get sliceId
   * @return sliceId
   */
  @javax.annotation.Nullable
  public Integer getSliceId() {
    return sliceId;
  }

  public void setSliceId(Integer sliceId) {
    this.sliceId = sliceId;
  }


  public LogRestApiGet user(Meta43 user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public Meta43 getUser() {
    return user;
  }

  public void setUser(Meta43 user) {
    this.user = user;
  }


  public LogRestApiGet userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRestApiGet logRestApiGet = (LogRestApiGet) o;
    return Objects.equals(this.action, logRestApiGet.action) &&
        Objects.equals(this.dashboardId, logRestApiGet.dashboardId) &&
        Objects.equals(this.dttm, logRestApiGet.dttm) &&
        Objects.equals(this.durationMs, logRestApiGet.durationMs) &&
        Objects.equals(this.json, logRestApiGet.json) &&
        Objects.equals(this.referrer, logRestApiGet.referrer) &&
        Objects.equals(this.sliceId, logRestApiGet.sliceId) &&
        Objects.equals(this.user, logRestApiGet.user) &&
        Objects.equals(this.userId, logRestApiGet.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dashboardId, dttm, durationMs, json, referrer, sliceId, user, userId);
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
    sb.append("class LogRestApiGet {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    dttm: ").append(toIndentedString(dttm)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("dashboard_id");
    openapiFields.add("dttm");
    openapiFields.add("duration_ms");
    openapiFields.add("json");
    openapiFields.add("referrer");
    openapiFields.add("slice_id");
    openapiFields.add("user");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LogRestApiGet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LogRestApiGet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogRestApiGet is not found in the empty JSON string", LogRestApiGet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LogRestApiGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogRestApiGet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("json") != null && !jsonObj.get("json").isJsonNull()) && !jsonObj.get("json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("json").toString()));
      }
      if ((jsonObj.get("referrer") != null && !jsonObj.get("referrer").isJsonNull()) && !jsonObj.get("referrer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referrer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referrer").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        Meta43.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogRestApiGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogRestApiGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogRestApiGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogRestApiGet.class));

       return (TypeAdapter<T>) new TypeAdapter<LogRestApiGet>() {
           @Override
           public void write(JsonWriter out, LogRestApiGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogRestApiGet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LogRestApiGet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LogRestApiGet
   * @throws IOException if the JSON string is invalid with respect to LogRestApiGet
   */
  public static LogRestApiGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogRestApiGet.class);
  }

  /**
   * Convert an instance of LogRestApiGet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

