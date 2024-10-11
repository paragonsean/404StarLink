/*
 * MineSkin API
 * Client implementations:  Java: https://github.com/InventivetalentDev/MineskinClient NodeJS: https://github.com/InventivetalentDev/mineskin-client  Examples: https://github.com/MineSkin/examples 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@mineskin.org
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
import org.openapitools.client.model.GetListPageGet200ResponsePage;
import org.openapitools.client.model.PartialSkinInfo;

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
 * GetListPageGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:35.189579-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetListPageGet200Response {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private GetListPageGet200ResponsePage page;

  public static final String SERIALIZED_NAME_SKINS = "skins";
  @SerializedName(SERIALIZED_NAME_SKINS)
  private List<PartialSkinInfo> skins = new ArrayList<>();

  public GetListPageGet200Response() {
  }

  public GetListPageGet200Response filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public GetListPageGet200Response page(GetListPageGet200ResponsePage page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nonnull
  public GetListPageGet200ResponsePage getPage() {
    return page;
  }

  public void setPage(GetListPageGet200ResponsePage page) {
    this.page = page;
  }


  public GetListPageGet200Response skins(List<PartialSkinInfo> skins) {
    this.skins = skins;
    return this;
  }

  public GetListPageGet200Response addSkinsItem(PartialSkinInfo skinsItem) {
    if (this.skins == null) {
      this.skins = new ArrayList<>();
    }
    this.skins.add(skinsItem);
    return this;
  }

  /**
   * Get skins
   * @return skins
   */
  @javax.annotation.Nonnull
  public List<PartialSkinInfo> getSkins() {
    return skins;
  }

  public void setSkins(List<PartialSkinInfo> skins) {
    this.skins = skins;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetListPageGet200Response getListPageGet200Response = (GetListPageGet200Response) o;
    return Objects.equals(this.filter, getListPageGet200Response.filter) &&
        Objects.equals(this.page, getListPageGet200Response.page) &&
        Objects.equals(this.skins, getListPageGet200Response.skins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, page, skins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListPageGet200Response {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    skins: ").append(toIndentedString(skins)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("page");
    openapiFields.add("skins");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("skins");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetListPageGet200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetListPageGet200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetListPageGet200Response is not found in the empty JSON string", GetListPageGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetListPageGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetListPageGet200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetListPageGet200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the required field `page`
      GetListPageGet200ResponsePage.validateJsonElement(jsonObj.get("page"));
      // ensure the json data is an array
      if (!jsonObj.get("skins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `skins` to be an array in the JSON string but got `%s`", jsonObj.get("skins").toString()));
      }

      JsonArray jsonArrayskins = jsonObj.getAsJsonArray("skins");
      // validate the required field `skins` (array)
      for (int i = 0; i < jsonArrayskins.size(); i++) {
        PartialSkinInfo.validateJsonElement(jsonArrayskins.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetListPageGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetListPageGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetListPageGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetListPageGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetListPageGet200Response>() {
           @Override
           public void write(JsonWriter out, GetListPageGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetListPageGet200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetListPageGet200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetListPageGet200Response
   * @throws IOException if the JSON string is invalid with respect to GetListPageGet200Response
   */
  public static GetListPageGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetListPageGet200Response.class);
  }

  /**
   * Convert an instance of GetListPageGet200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

