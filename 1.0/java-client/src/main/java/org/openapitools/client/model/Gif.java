/*
 * Giphy API
 * Giphy API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@giphy.com
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GifImages;
import org.openapitools.client.model.User;

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
 * Gif
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:04.658451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Gif {
  public static final String SERIALIZED_NAME_BITLY_URL = "bitly_url";
  @SerializedName(SERIALIZED_NAME_BITLY_URL)
  private String bitlyUrl;

  public static final String SERIALIZED_NAME_CONTENT_URL = "content_url";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  private String contentUrl;

  public static final String SERIALIZED_NAME_CREATE_DATETIME = "create_datetime";
  @SerializedName(SERIALIZED_NAME_CREATE_DATETIME)
  private OffsetDateTime createDatetime;

  public static final String SERIALIZED_NAME_EMBDED_URL = "embded_url";
  @SerializedName(SERIALIZED_NAME_EMBDED_URL)
  private String embdedUrl;

  public static final String SERIALIZED_NAME_FEATURED_TAGS = "featured_tags";
  @SerializedName(SERIALIZED_NAME_FEATURED_TAGS)
  private List<String> featuredTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private GifImages images;

  public static final String SERIALIZED_NAME_IMPORT_DATETIME = "import_datetime";
  @SerializedName(SERIALIZED_NAME_IMPORT_DATETIME)
  private OffsetDateTime importDatetime;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private String rating;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SOURCE_POST_URL = "source_post_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_POST_URL)
  private String sourcePostUrl;

  public static final String SERIALIZED_NAME_SOURCE_TLD = "source_tld";
  @SerializedName(SERIALIZED_NAME_SOURCE_TLD)
  private String sourceTld;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRENDING_DATETIME = "trending_datetime";
  @SerializedName(SERIALIZED_NAME_TRENDING_DATETIME)
  private OffsetDateTime trendingDatetime;

  /**
   * Type of the gif. By default, this is almost always gif
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GIF("gif");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.GIF;

  public static final String SERIALIZED_NAME_UPDATE_DATETIME = "update_datetime";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATETIME)
  private OffsetDateTime updateDatetime;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public Gif() {
  }

  public Gif bitlyUrl(String bitlyUrl) {
    this.bitlyUrl = bitlyUrl;
    return this;
  }

  /**
   * The unique bit.ly URL for this GIF
   * @return bitlyUrl
   */
  @javax.annotation.Nullable
  public String getBitlyUrl() {
    return bitlyUrl;
  }

  public void setBitlyUrl(String bitlyUrl) {
    this.bitlyUrl = bitlyUrl;
  }


  public Gif contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * Currently unused
   * @return contentUrl
   */
  @javax.annotation.Nullable
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }


  public Gif createDatetime(OffsetDateTime createDatetime) {
    this.createDatetime = createDatetime;
    return this;
  }

  /**
   * The date this GIF was added to the GIPHY database.
   * @return createDatetime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDatetime() {
    return createDatetime;
  }

  public void setCreateDatetime(OffsetDateTime createDatetime) {
    this.createDatetime = createDatetime;
  }


  public Gif embdedUrl(String embdedUrl) {
    this.embdedUrl = embdedUrl;
    return this;
  }

  /**
   * A URL used for embedding this GIF
   * @return embdedUrl
   */
  @javax.annotation.Nullable
  public String getEmbdedUrl() {
    return embdedUrl;
  }

  public void setEmbdedUrl(String embdedUrl) {
    this.embdedUrl = embdedUrl;
  }


  public Gif featuredTags(List<String> featuredTags) {
    this.featuredTags = featuredTags;
    return this;
  }

  public Gif addFeaturedTagsItem(String featuredTagsItem) {
    if (this.featuredTags == null) {
      this.featuredTags = new ArrayList<>();
    }
    this.featuredTags.add(featuredTagsItem);
    return this;
  }

  /**
   * An array of featured tags for this GIF (Note: Not available when using the Public Beta Key) 
   * @return featuredTags
   */
  @javax.annotation.Nullable
  public List<String> getFeaturedTags() {
    return featuredTags;
  }

  public void setFeaturedTags(List<String> featuredTags) {
    this.featuredTags = featuredTags;
  }


  public Gif id(String id) {
    this.id = id;
    return this;
  }

  /**
   * This GIF&#39;s unique ID
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Gif images(GifImages images) {
    this.images = images;
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @javax.annotation.Nullable
  public GifImages getImages() {
    return images;
  }

  public void setImages(GifImages images) {
    this.images = images;
  }


  public Gif importDatetime(OffsetDateTime importDatetime) {
    this.importDatetime = importDatetime;
    return this;
  }

  /**
   * The creation or upload date from this GIF&#39;s source.
   * @return importDatetime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getImportDatetime() {
    return importDatetime;
  }

  public void setImportDatetime(OffsetDateTime importDatetime) {
    this.importDatetime = importDatetime;
  }


  public Gif rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The MPAA-style rating for this content. Examples include Y, G, PG, PG-13 and R
   * @return rating
   */
  @javax.annotation.Nullable
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }


  public Gif slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * The unique slug used in this GIF&#39;s URL
   * @return slug
   */
  @javax.annotation.Nullable
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Gif source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The page on which this GIF was found
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public Gif sourcePostUrl(String sourcePostUrl) {
    this.sourcePostUrl = sourcePostUrl;
    return this;
  }

  /**
   * The URL of the webpage on which this GIF was found.
   * @return sourcePostUrl
   */
  @javax.annotation.Nullable
  public String getSourcePostUrl() {
    return sourcePostUrl;
  }

  public void setSourcePostUrl(String sourcePostUrl) {
    this.sourcePostUrl = sourcePostUrl;
  }


  public Gif sourceTld(String sourceTld) {
    this.sourceTld = sourceTld;
    return this;
  }

  /**
   * The top level domain of the source URL.
   * @return sourceTld
   */
  @javax.annotation.Nullable
  public String getSourceTld() {
    return sourceTld;
  }

  public void setSourceTld(String sourceTld) {
    this.sourceTld = sourceTld;
  }


  public Gif tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Gif addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags for this GIF (Note: Not available when using the Public Beta Key) 
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Gif trendingDatetime(OffsetDateTime trendingDatetime) {
    this.trendingDatetime = trendingDatetime;
    return this;
  }

  /**
   * The date on which this gif was marked trending, if applicable.
   * @return trendingDatetime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTrendingDatetime() {
    return trendingDatetime;
  }

  public void setTrendingDatetime(OffsetDateTime trendingDatetime) {
    this.trendingDatetime = trendingDatetime;
  }


  public Gif type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the gif. By default, this is almost always gif
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Gif updateDatetime(OffsetDateTime updateDatetime) {
    this.updateDatetime = updateDatetime;
    return this;
  }

  /**
   * The date on which this GIF was last updated.
   * @return updateDatetime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdateDatetime() {
    return updateDatetime;
  }

  public void setUpdateDatetime(OffsetDateTime updateDatetime) {
    this.updateDatetime = updateDatetime;
  }


  public Gif url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The unique URL for this GIF
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public Gif user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  public Gif username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username this GIF is attached to, if applicable
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gif gif = (Gif) o;
    return Objects.equals(this.bitlyUrl, gif.bitlyUrl) &&
        Objects.equals(this.contentUrl, gif.contentUrl) &&
        Objects.equals(this.createDatetime, gif.createDatetime) &&
        Objects.equals(this.embdedUrl, gif.embdedUrl) &&
        Objects.equals(this.featuredTags, gif.featuredTags) &&
        Objects.equals(this.id, gif.id) &&
        Objects.equals(this.images, gif.images) &&
        Objects.equals(this.importDatetime, gif.importDatetime) &&
        Objects.equals(this.rating, gif.rating) &&
        Objects.equals(this.slug, gif.slug) &&
        Objects.equals(this.source, gif.source) &&
        Objects.equals(this.sourcePostUrl, gif.sourcePostUrl) &&
        Objects.equals(this.sourceTld, gif.sourceTld) &&
        Objects.equals(this.tags, gif.tags) &&
        Objects.equals(this.trendingDatetime, gif.trendingDatetime) &&
        Objects.equals(this.type, gif.type) &&
        Objects.equals(this.updateDatetime, gif.updateDatetime) &&
        Objects.equals(this.url, gif.url) &&
        Objects.equals(this.user, gif.user) &&
        Objects.equals(this.username, gif.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitlyUrl, contentUrl, createDatetime, embdedUrl, featuredTags, id, images, importDatetime, rating, slug, source, sourcePostUrl, sourceTld, tags, trendingDatetime, type, updateDatetime, url, user, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gif {\n");
    sb.append("    bitlyUrl: ").append(toIndentedString(bitlyUrl)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    createDatetime: ").append(toIndentedString(createDatetime)).append("\n");
    sb.append("    embdedUrl: ").append(toIndentedString(embdedUrl)).append("\n");
    sb.append("    featuredTags: ").append(toIndentedString(featuredTags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    importDatetime: ").append(toIndentedString(importDatetime)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourcePostUrl: ").append(toIndentedString(sourcePostUrl)).append("\n");
    sb.append("    sourceTld: ").append(toIndentedString(sourceTld)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    trendingDatetime: ").append(toIndentedString(trendingDatetime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateDatetime: ").append(toIndentedString(updateDatetime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("bitly_url");
    openapiFields.add("content_url");
    openapiFields.add("create_datetime");
    openapiFields.add("embded_url");
    openapiFields.add("featured_tags");
    openapiFields.add("id");
    openapiFields.add("images");
    openapiFields.add("import_datetime");
    openapiFields.add("rating");
    openapiFields.add("slug");
    openapiFields.add("source");
    openapiFields.add("source_post_url");
    openapiFields.add("source_tld");
    openapiFields.add("tags");
    openapiFields.add("trending_datetime");
    openapiFields.add("type");
    openapiFields.add("update_datetime");
    openapiFields.add("url");
    openapiFields.add("user");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Gif
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Gif.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Gif is not found in the empty JSON string", Gif.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Gif.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Gif` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bitly_url") != null && !jsonObj.get("bitly_url").isJsonNull()) && !jsonObj.get("bitly_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bitly_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bitly_url").toString()));
      }
      if ((jsonObj.get("content_url") != null && !jsonObj.get("content_url").isJsonNull()) && !jsonObj.get("content_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_url").toString()));
      }
      if ((jsonObj.get("embded_url") != null && !jsonObj.get("embded_url").isJsonNull()) && !jsonObj.get("embded_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embded_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embded_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("featured_tags") != null && !jsonObj.get("featured_tags").isJsonNull() && !jsonObj.get("featured_tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featured_tags` to be an array in the JSON string but got `%s`", jsonObj.get("featured_tags").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `images`
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        GifImages.validateJsonElement(jsonObj.get("images"));
      }
      if ((jsonObj.get("rating") != null && !jsonObj.get("rating").isJsonNull()) && !jsonObj.get("rating").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rating` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rating").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("source_post_url") != null && !jsonObj.get("source_post_url").isJsonNull()) && !jsonObj.get("source_post_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_post_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_post_url").toString()));
      }
      if ((jsonObj.get("source_tld") != null && !jsonObj.get("source_tld").isJsonNull()) && !jsonObj.get("source_tld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_tld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_tld").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("user"));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Gif.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Gif' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Gif> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Gif.class));

       return (TypeAdapter<T>) new TypeAdapter<Gif>() {
           @Override
           public void write(JsonWriter out, Gif value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Gif read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Gif given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Gif
   * @throws IOException if the JSON string is invalid with respect to Gif
   */
  public static Gif fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Gif.class);
  }

  /**
   * Convert an instance of Gif to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

