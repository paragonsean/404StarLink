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
 * AnnouncementsPost201ResponseAnnouncementUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:46.849483-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AnnouncementsPost201ResponseAnnouncementUrl {
  public static final String SERIALIZED_NAME_DOWNLOAD = "download";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD)
  private String download;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AnnouncementsPost201ResponseAnnouncementUrl() {
  }

  public AnnouncementsPost201ResponseAnnouncementUrl download(String download) {
    this.download = download;
    return this;
  }

  /**
   * Get download
   * @return download
   */
  @javax.annotation.Nullable
  public String getDownload() {
    return download;
  }

  public void setDownload(String download) {
    this.download = download;
  }


  public AnnouncementsPost201ResponseAnnouncementUrl href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   */
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public AnnouncementsPost201ResponseAnnouncementUrl title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnouncementsPost201ResponseAnnouncementUrl announcementsPost201ResponseAnnouncementUrl = (AnnouncementsPost201ResponseAnnouncementUrl) o;
    return Objects.equals(this.download, announcementsPost201ResponseAnnouncementUrl.download) &&
        Objects.equals(this.href, announcementsPost201ResponseAnnouncementUrl.href) &&
        Objects.equals(this.title, announcementsPost201ResponseAnnouncementUrl.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(download, href, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementsPost201ResponseAnnouncementUrl {\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("download");
    openapiFields.add("href");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnnouncementsPost201ResponseAnnouncementUrl
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnnouncementsPost201ResponseAnnouncementUrl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnouncementsPost201ResponseAnnouncementUrl is not found in the empty JSON string", AnnouncementsPost201ResponseAnnouncementUrl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnnouncementsPost201ResponseAnnouncementUrl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnouncementsPost201ResponseAnnouncementUrl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("download") != null && !jsonObj.get("download").isJsonNull()) && !jsonObj.get("download").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnouncementsPost201ResponseAnnouncementUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnouncementsPost201ResponseAnnouncementUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnouncementsPost201ResponseAnnouncementUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnouncementsPost201ResponseAnnouncementUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnouncementsPost201ResponseAnnouncementUrl>() {
           @Override
           public void write(JsonWriter out, AnnouncementsPost201ResponseAnnouncementUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnouncementsPost201ResponseAnnouncementUrl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnnouncementsPost201ResponseAnnouncementUrl given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnnouncementsPost201ResponseAnnouncementUrl
   * @throws IOException if the JSON string is invalid with respect to AnnouncementsPost201ResponseAnnouncementUrl
   */
  public static AnnouncementsPost201ResponseAnnouncementUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnouncementsPost201ResponseAnnouncementUrl.class);
  }

  /**
   * Convert an instance of AnnouncementsPost201ResponseAnnouncementUrl to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

