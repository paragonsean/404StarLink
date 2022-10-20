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
 * ApiCoreDtoClickStreamHitBrowserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:30.497679-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoClickStreamHitBrowserInfo {
  public static final String SERIALIZED_NAME_BROWSER_TYPE = "browserType";
  @SerializedName(SERIALIZED_NAME_BROWSER_TYPE)
  private String browserType;

  public static final String SERIALIZED_NAME_FAMILY_ID = "familyId";
  @SerializedName(SERIALIZED_NAME_FAMILY_ID)
  private Long familyId;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ApiCoreDtoClickStreamHitBrowserInfo() {
  }

  public ApiCoreDtoClickStreamHitBrowserInfo browserType(String browserType) {
    this.browserType = browserType;
    return this;
  }

  /**
   * Get browserType
   * @return browserType
   */
  @javax.annotation.Nullable
  public String getBrowserType() {
    return browserType;
  }

  public void setBrowserType(String browserType) {
    this.browserType = browserType;
  }


  public ApiCoreDtoClickStreamHitBrowserInfo familyId(Long familyId) {
    this.familyId = familyId;
    return this;
  }

  /**
   * Get familyId
   * @return familyId
   */
  @javax.annotation.Nullable
  public Long getFamilyId() {
    return familyId;
  }

  public void setFamilyId(Long familyId) {
    this.familyId = familyId;
  }


  public ApiCoreDtoClickStreamHitBrowserInfo familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Get familyName
   * @return familyName
   */
  @javax.annotation.Nullable
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public ApiCoreDtoClickStreamHitBrowserInfo id(Long id) {
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


  public ApiCoreDtoClickStreamHitBrowserInfo name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoClickStreamHitBrowserInfo apiCoreDtoClickStreamHitBrowserInfo = (ApiCoreDtoClickStreamHitBrowserInfo) o;
    return Objects.equals(this.browserType, apiCoreDtoClickStreamHitBrowserInfo.browserType) &&
        Objects.equals(this.familyId, apiCoreDtoClickStreamHitBrowserInfo.familyId) &&
        Objects.equals(this.familyName, apiCoreDtoClickStreamHitBrowserInfo.familyName) &&
        Objects.equals(this.id, apiCoreDtoClickStreamHitBrowserInfo.id) &&
        Objects.equals(this.name, apiCoreDtoClickStreamHitBrowserInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserType, familyId, familyName, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoClickStreamHitBrowserInfo {\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
    sb.append("    familyId: ").append(toIndentedString(familyId)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("browserType");
    openapiFields.add("familyId");
    openapiFields.add("familyName");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoClickStreamHitBrowserInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoClickStreamHitBrowserInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoClickStreamHitBrowserInfo is not found in the empty JSON string", ApiCoreDtoClickStreamHitBrowserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoClickStreamHitBrowserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoClickStreamHitBrowserInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("browserType") != null && !jsonObj.get("browserType").isJsonNull()) && !jsonObj.get("browserType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browserType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browserType").toString()));
      }
      if ((jsonObj.get("familyName") != null && !jsonObj.get("familyName").isJsonNull()) && !jsonObj.get("familyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `familyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("familyName").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoClickStreamHitBrowserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoClickStreamHitBrowserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoClickStreamHitBrowserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoClickStreamHitBrowserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoClickStreamHitBrowserInfo>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoClickStreamHitBrowserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoClickStreamHitBrowserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoClickStreamHitBrowserInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoClickStreamHitBrowserInfo
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoClickStreamHitBrowserInfo
   */
  public static ApiCoreDtoClickStreamHitBrowserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoClickStreamHitBrowserInfo.class);
  }

  /**
   * Convert an instance of ApiCoreDtoClickStreamHitBrowserInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

