/*
 * Flickr API Schema
 * A subset of Flickr's API defined in Swagger format.
 *
 * The version of the OpenAPI document: 1.0.0
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
import java.util.Arrays;
import org.openapitools.client.model.TopicReply;

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
 * GetGroupTopicRepliesByID200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:44.951610-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetGroupTopicRepliesByID200Response {
  public static final String SERIALIZED_NAME_REPLY = "reply";
  @SerializedName(SERIALIZED_NAME_REPLY)
  private TopicReply reply;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private String stat;

  public GetGroupTopicRepliesByID200Response() {
  }

  public GetGroupTopicRepliesByID200Response reply(TopicReply reply) {
    this.reply = reply;
    return this;
  }

  /**
   * Get reply
   * @return reply
   */
  @javax.annotation.Nullable
  public TopicReply getReply() {
    return reply;
  }

  public void setReply(TopicReply reply) {
    this.reply = reply;
  }


  public GetGroupTopicRepliesByID200Response stat(String stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @javax.annotation.Nullable
  public String getStat() {
    return stat;
  }

  public void setStat(String stat) {
    this.stat = stat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupTopicRepliesByID200Response getGroupTopicRepliesByID200Response = (GetGroupTopicRepliesByID200Response) o;
    return Objects.equals(this.reply, getGroupTopicRepliesByID200Response.reply) &&
        Objects.equals(this.stat, getGroupTopicRepliesByID200Response.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reply, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupTopicRepliesByID200Response {\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
    openapiFields.add("reply");
    openapiFields.add("stat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetGroupTopicRepliesByID200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGroupTopicRepliesByID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupTopicRepliesByID200Response is not found in the empty JSON string", GetGroupTopicRepliesByID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGroupTopicRepliesByID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupTopicRepliesByID200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `reply`
      if (jsonObj.get("reply") != null && !jsonObj.get("reply").isJsonNull()) {
        TopicReply.validateJsonElement(jsonObj.get("reply"));
      }
      if ((jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) && !jsonObj.get("stat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupTopicRepliesByID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupTopicRepliesByID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupTopicRepliesByID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupTopicRepliesByID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupTopicRepliesByID200Response>() {
           @Override
           public void write(JsonWriter out, GetGroupTopicRepliesByID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupTopicRepliesByID200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetGroupTopicRepliesByID200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetGroupTopicRepliesByID200Response
   * @throws IOException if the JSON string is invalid with respect to GetGroupTopicRepliesByID200Response
   */
  public static GetGroupTopicRepliesByID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupTopicRepliesByID200Response.class);
  }

  /**
   * Convert an instance of GetGroupTopicRepliesByID200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

