/*
 * The SureVoIP RESTful API
 * # Introduction Welcome to the SureVoIP RESTful hypermedia API (sometimes known as a VoIP REST API, Telecom REST API, SIP API, Hypermedia API or just VoIP API.)  The SureVoIP API is a way for you to automate your interaction with the SureVoIP platforms. With the API, you can create your own scripts, applications or mashups which can: * List calls * create customers * search numbers * provision numbers * send SMS texts * create outbound calls * schedule announcements * schedule call hangups with an announcement * subscribe to events/alerts * track calls * retrieve invoices * grab your SIP details * check your IP address * be 100% self-sufficient * and much more! 
 *
 * The version of the OpenAPI document: 9dcb0dc8
 * Contact: support@surevoip.co.uk
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
import org.openapitools.client.model.AnnouncementsPost201ResponseAnnouncement;

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
 * AnnouncementsPost201Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:13.709755-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AnnouncementsPost201Response {
  public static final String SERIALIZED_NAME_ANNOUNCEMENT = "announcement";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT)
  private AnnouncementsPost201ResponseAnnouncement announcement;

  public AnnouncementsPost201Response() {
  }

  public AnnouncementsPost201Response announcement(AnnouncementsPost201ResponseAnnouncement announcement) {
    this.announcement = announcement;
    return this;
  }

  /**
   * Get announcement
   * @return announcement
   */
  @javax.annotation.Nullable
  public AnnouncementsPost201ResponseAnnouncement getAnnouncement() {
    return announcement;
  }

  public void setAnnouncement(AnnouncementsPost201ResponseAnnouncement announcement) {
    this.announcement = announcement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnouncementsPost201Response announcementsPost201Response = (AnnouncementsPost201Response) o;
    return Objects.equals(this.announcement, announcementsPost201Response.announcement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementsPost201Response {\n");
    sb.append("    announcement: ").append(toIndentedString(announcement)).append("\n");
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
    openapiFields.add("announcement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnnouncementsPost201Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnnouncementsPost201Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnouncementsPost201Response is not found in the empty JSON string", AnnouncementsPost201Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnnouncementsPost201Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnouncementsPost201Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `announcement`
      if (jsonObj.get("announcement") != null && !jsonObj.get("announcement").isJsonNull()) {
        AnnouncementsPost201ResponseAnnouncement.validateJsonElement(jsonObj.get("announcement"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnouncementsPost201Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnouncementsPost201Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnouncementsPost201Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnouncementsPost201Response.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnouncementsPost201Response>() {
           @Override
           public void write(JsonWriter out, AnnouncementsPost201Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnouncementsPost201Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnnouncementsPost201Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnnouncementsPost201Response
   * @throws IOException if the JSON string is invalid with respect to AnnouncementsPost201Response
   */
  public static AnnouncementsPost201Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnouncementsPost201Response.class);
  }

  /**
   * Convert an instance of AnnouncementsPost201Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

