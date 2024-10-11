/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
 * Represents an announcement set by an administrator.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:45.133390-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Announcement {
  public static final String SERIALIZED_NAME_ALL_DAY = "all_day";
  @SerializedName(SERIALIZED_NAME_ALL_DAY)
  private Boolean allDay;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ENDS_AT = "ends_at";
  @SerializedName(SERIALIZED_NAME_ENDS_AT)
  private String endsAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduled_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private String scheduledAt;

  public static final String SERIALIZED_NAME_STARTS_AT = "starts_at";
  @SerializedName(SERIALIZED_NAME_STARTS_AT)
  private String startsAt;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public Announcement() {
  }

  public Announcement allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

  /**
   * Whether the announcement has a start/end time.
   * @return allDay
   */
  @javax.annotation.Nonnull
  public Boolean getAllDay() {
    return allDay;
  }

  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }


  public Announcement createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the announcement was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Announcement endsAt(String endsAt) {
    this.endsAt = endsAt;
    return this;
  }

  /**
   * When the future announcement will end. ISO 8601 Datetime.
   * @return endsAt
   */
  @javax.annotation.Nullable
  public String getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }


  public Announcement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The announcement id. Cast from an integer, but not guaranteed to be a number.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Announcement published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Whether the announcement is currently active.
   * @return published
   */
  @javax.annotation.Nonnull
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }


  public Announcement read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Whether the announcement has been read by the user.
   * @return read
   */
  @javax.annotation.Nonnull
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }


  public Announcement scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * When the future announcement was scheduled. ISO 8601 Datetime.
   * @return scheduledAt
   */
  @javax.annotation.Nullable
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public Announcement startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * When the future announcement will start. ISO 8601 Datetime.
   * @return startsAt
   */
  @javax.annotation.Nullable
  public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }


  public Announcement text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the announcement.
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public Announcement updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the announcement was last updated. ISO 8601 Datetime.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Announcement announcement = (Announcement) o;
    return Objects.equals(this.allDay, announcement.allDay) &&
        Objects.equals(this.createdAt, announcement.createdAt) &&
        Objects.equals(this.endsAt, announcement.endsAt) &&
        Objects.equals(this.id, announcement.id) &&
        Objects.equals(this.published, announcement.published) &&
        Objects.equals(this.read, announcement.read) &&
        Objects.equals(this.scheduledAt, announcement.scheduledAt) &&
        Objects.equals(this.startsAt, announcement.startsAt) &&
        Objects.equals(this.text, announcement.text) &&
        Objects.equals(this.updatedAt, announcement.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDay, createdAt, endsAt, id, published, read, scheduledAt, startsAt, text, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Announcement {\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("all_day");
    openapiFields.add("created_at");
    openapiFields.add("ends_at");
    openapiFields.add("id");
    openapiFields.add("published");
    openapiFields.add("read");
    openapiFields.add("scheduled_at");
    openapiFields.add("starts_at");
    openapiFields.add("text");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("all_day");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("published");
    openapiRequiredFields.add("read");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Announcement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Announcement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Announcement is not found in the empty JSON string", Announcement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Announcement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Announcement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Announcement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("ends_at") != null && !jsonObj.get("ends_at").isJsonNull()) && !jsonObj.get("ends_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ends_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ends_at").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("scheduled_at") != null && !jsonObj.get("scheduled_at").isJsonNull()) && !jsonObj.get("scheduled_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_at").toString()));
      }
      if ((jsonObj.get("starts_at") != null && !jsonObj.get("starts_at").isJsonNull()) && !jsonObj.get("starts_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `starts_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("starts_at").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Announcement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Announcement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Announcement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Announcement.class));

       return (TypeAdapter<T>) new TypeAdapter<Announcement>() {
           @Override
           public void write(JsonWriter out, Announcement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Announcement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Announcement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Announcement
   * @throws IOException if the JSON string is invalid with respect to Announcement
   */
  public static Announcement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Announcement.class);
  }

  /**
   * Convert an instance of Announcement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

