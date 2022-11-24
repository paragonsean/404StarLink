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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Account;
import org.openapitools.client.model.Application;
import org.openapitools.client.model.Attachment;
import org.openapitools.client.model.Card;
import org.openapitools.client.model.Emoji;
import org.openapitools.client.model.Mention;
import org.openapitools.client.model.Poll;
import org.openapitools.client.model.Tag;

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
 * Represents a status posted by an account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:48.626423-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Status {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private Application application;

  public static final String SERIALIZED_NAME_BOOKMARKED = "bookmarked";
  @SerializedName(SERIALIZED_NAME_BOOKMARKED)
  private Boolean bookmarked;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EMOJIS = "emojis";
  @SerializedName(SERIALIZED_NAME_EMOJIS)
  private List<Emoji> emojis = new ArrayList<>();

  public static final String SERIALIZED_NAME_FAVOURITED = "favourited";
  @SerializedName(SERIALIZED_NAME_FAVOURITED)
  private Boolean favourited;

  public static final String SERIALIZED_NAME_FAVOURITES_COUNT = "favourites_count";
  @SerializedName(SERIALIZED_NAME_FAVOURITES_COUNT)
  private Integer favouritesCount;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IN_REPLY_TO_ACCOUNT_ID = "in_reply_to_account_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_ACCOUNT_ID)
  private String inReplyToAccountId;

  public static final String SERIALIZED_NAME_IN_REPLY_TO_ID = "in_reply_to_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_ID)
  private String inReplyToId;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_MEDIA_ATTACHMENTS = "media_attachments";
  @SerializedName(SERIALIZED_NAME_MEDIA_ATTACHMENTS)
  private List<Attachment> mediaAttachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  private List<Mention> mentions = new ArrayList<>();

  public static final String SERIALIZED_NAME_MUTED = "muted";
  @SerializedName(SERIALIZED_NAME_MUTED)
  private Boolean muted;

  public static final String SERIALIZED_NAME_PINNED = "pinned";
  @SerializedName(SERIALIZED_NAME_PINNED)
  private Boolean pinned;

  public static final String SERIALIZED_NAME_POLL = "poll";
  @SerializedName(SERIALIZED_NAME_POLL)
  private Poll poll;

  public static final String SERIALIZED_NAME_REBLOG = "reblog";
  @SerializedName(SERIALIZED_NAME_REBLOG)
  private Status reblog;

  public static final String SERIALIZED_NAME_REBLOGGED = "reblogged";
  @SerializedName(SERIALIZED_NAME_REBLOGGED)
  private Boolean reblogged;

  public static final String SERIALIZED_NAME_REBLOGS_COUNT = "reblogs_count";
  @SerializedName(SERIALIZED_NAME_REBLOGS_COUNT)
  private Integer reblogsCount;

  public static final String SERIALIZED_NAME_REPLIES_COUNT = "replies_count";
  @SerializedName(SERIALIZED_NAME_REPLIES_COUNT)
  private Integer repliesCount;

  public static final String SERIALIZED_NAME_SENSITIVE = "sensitive";
  @SerializedName(SERIALIZED_NAME_SENSITIVE)
  private Boolean sensitive;

  public static final String SERIALIZED_NAME_SPOILER_TEXT = "spoiler_text";
  @SerializedName(SERIALIZED_NAME_SPOILER_TEXT)
  private String spoilerText;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * Visibility of this status.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private"),
    
    DIRECT("direct");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VisibilityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public Status() {
  }

  public Status account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }


  public Status application(Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @javax.annotation.Nullable
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }


  public Status bookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
    return this;
  }

  /**
   * Have you bookmarked this status?
   * @return bookmarked
   */
  @javax.annotation.Nullable
  public Boolean getBookmarked() {
    return bookmarked;
  }

  public void setBookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
  }


  public Status card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @javax.annotation.Nullable
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }


  public Status content(String content) {
    this.content = content;
    return this;
  }

  /**
   * HTML-encoded status content.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Status createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when this status was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Status emojis(List<Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Status addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji to be used when rendering status content.
   * @return emojis
   */
  @javax.annotation.Nullable
  public List<Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<Emoji> emojis) {
    this.emojis = emojis;
  }


  public Status favourited(Boolean favourited) {
    this.favourited = favourited;
    return this;
  }

  /**
   * Have you favourited this status?
   * @return favourited
   */
  @javax.annotation.Nullable
  public Boolean getFavourited() {
    return favourited;
  }

  public void setFavourited(Boolean favourited) {
    this.favourited = favourited;
  }


  public Status favouritesCount(Integer favouritesCount) {
    this.favouritesCount = favouritesCount;
    return this;
  }

  /**
   * How many favourites this status has received.
   * @return favouritesCount
   */
  @javax.annotation.Nullable
  public Integer getFavouritesCount() {
    return favouritesCount;
  }

  public void setFavouritesCount(Integer favouritesCount) {
    this.favouritesCount = favouritesCount;
  }


  public Status id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the status in the database. Cast from an integer but not guaranteed to be a number.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Status inReplyToAccountId(String inReplyToAccountId) {
    this.inReplyToAccountId = inReplyToAccountId;
    return this;
  }

  /**
   * ID of the account being replied to.
   * @return inReplyToAccountId
   */
  @javax.annotation.Nullable
  public String getInReplyToAccountId() {
    return inReplyToAccountId;
  }

  public void setInReplyToAccountId(String inReplyToAccountId) {
    this.inReplyToAccountId = inReplyToAccountId;
  }


  public Status inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * ID of the status being replied. Cast from an integer but not guaranteed to be a number.
   * @return inReplyToId
   */
  @javax.annotation.Nullable
  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }


  public Status language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Primary language of this status. ISO 639 Part 1 two-letter language code.
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public Status mediaAttachments(List<Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
    return this;
  }

  public Status addMediaAttachmentsItem(Attachment mediaAttachmentsItem) {
    if (this.mediaAttachments == null) {
      this.mediaAttachments = new ArrayList<>();
    }
    this.mediaAttachments.add(mediaAttachmentsItem);
    return this;
  }

  /**
   * Media that is attached to this status.
   * @return mediaAttachments
   */
  @javax.annotation.Nullable
  public List<Attachment> getMediaAttachments() {
    return mediaAttachments;
  }

  public void setMediaAttachments(List<Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
  }


  public Status mentions(List<Mention> mentions) {
    this.mentions = mentions;
    return this;
  }

  public Status addMentionsItem(Mention mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

  /**
   * Mentions of users within the status content.
   * @return mentions
   */
  @javax.annotation.Nullable
  public List<Mention> getMentions() {
    return mentions;
  }

  public void setMentions(List<Mention> mentions) {
    this.mentions = mentions;
  }


  public Status muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Have you muted notifications for this status&#39;s conversation?
   * @return muted
   */
  @javax.annotation.Nullable
  public Boolean getMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  public Status pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

  /**
   * Have you pinned this status? Only appears if the status is pinnable.
   * @return pinned
   */
  @javax.annotation.Nullable
  public Boolean getPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }


  public Status poll(Poll poll) {
    this.poll = poll;
    return this;
  }

  /**
   * Get poll
   * @return poll
   */
  @javax.annotation.Nullable
  public Poll getPoll() {
    return poll;
  }

  public void setPoll(Poll poll) {
    this.poll = poll;
  }


  public Status reblog(Status reblog) {
    this.reblog = reblog;
    return this;
  }

  /**
   * Get reblog
   * @return reblog
   */
  @javax.annotation.Nullable
  public Status getReblog() {
    return reblog;
  }

  public void setReblog(Status reblog) {
    this.reblog = reblog;
  }


  public Status reblogged(Boolean reblogged) {
    this.reblogged = reblogged;
    return this;
  }

  /**
   * Have you boosted this status?
   * @return reblogged
   */
  @javax.annotation.Nullable
  public Boolean getReblogged() {
    return reblogged;
  }

  public void setReblogged(Boolean reblogged) {
    this.reblogged = reblogged;
  }


  public Status reblogsCount(Integer reblogsCount) {
    this.reblogsCount = reblogsCount;
    return this;
  }

  /**
   * How many boosts this status has received.
   * @return reblogsCount
   */
  @javax.annotation.Nullable
  public Integer getReblogsCount() {
    return reblogsCount;
  }

  public void setReblogsCount(Integer reblogsCount) {
    this.reblogsCount = reblogsCount;
  }


  public Status repliesCount(Integer repliesCount) {
    this.repliesCount = repliesCount;
    return this;
  }

  /**
   * How many replies this status has received.
   * @return repliesCount
   */
  @javax.annotation.Nullable
  public Integer getRepliesCount() {
    return repliesCount;
  }

  public void setRepliesCount(Integer repliesCount) {
    this.repliesCount = repliesCount;
  }


  public Status sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Is this status marked as sensitive content?
   * @return sensitive
   */
  @javax.annotation.Nullable
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }


  public Status spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * Subject or summary line, below which status content is collapsed until expanded.
   * @return spoilerText
   */
  @javax.annotation.Nullable
  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }


  public Status tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Status addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Hashtags used within the status content.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public Status text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Plain-text source of a status. Returned instead of &#x60;content&#x60; when status is deleted, so the user may redraft from the source text without the client having to reverse-engineer the original text from the HTML content.
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public Status uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URI of the status used for federation.
   * @return uri
   */
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  public Status url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to the status&#39;s HTML representation.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public Status visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of this status.
   * @return visibility
   */
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.account, status.account) &&
        Objects.equals(this.application, status.application) &&
        Objects.equals(this.bookmarked, status.bookmarked) &&
        Objects.equals(this.card, status.card) &&
        Objects.equals(this.content, status.content) &&
        Objects.equals(this.createdAt, status.createdAt) &&
        Objects.equals(this.emojis, status.emojis) &&
        Objects.equals(this.favourited, status.favourited) &&
        Objects.equals(this.favouritesCount, status.favouritesCount) &&
        Objects.equals(this.id, status.id) &&
        Objects.equals(this.inReplyToAccountId, status.inReplyToAccountId) &&
        Objects.equals(this.inReplyToId, status.inReplyToId) &&
        Objects.equals(this.language, status.language) &&
        Objects.equals(this.mediaAttachments, status.mediaAttachments) &&
        Objects.equals(this.mentions, status.mentions) &&
        Objects.equals(this.muted, status.muted) &&
        Objects.equals(this.pinned, status.pinned) &&
        Objects.equals(this.poll, status.poll) &&
        Objects.equals(this.reblog, status.reblog) &&
        Objects.equals(this.reblogged, status.reblogged) &&
        Objects.equals(this.reblogsCount, status.reblogsCount) &&
        Objects.equals(this.repliesCount, status.repliesCount) &&
        Objects.equals(this.sensitive, status.sensitive) &&
        Objects.equals(this.spoilerText, status.spoilerText) &&
        Objects.equals(this.tags, status.tags) &&
        Objects.equals(this.text, status.text) &&
        Objects.equals(this.uri, status.uri) &&
        Objects.equals(this.url, status.url) &&
        Objects.equals(this.visibility, status.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, application, bookmarked, card, content, createdAt, emojis, favourited, favouritesCount, id, inReplyToAccountId, inReplyToId, language, mediaAttachments, mentions, muted, pinned, poll, reblog, reblogged, reblogsCount, repliesCount, sensitive, spoilerText, tags, text, uri, url, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    bookmarked: ").append(toIndentedString(bookmarked)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    favourited: ").append(toIndentedString(favourited)).append("\n");
    sb.append("    favouritesCount: ").append(toIndentedString(favouritesCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inReplyToAccountId: ").append(toIndentedString(inReplyToAccountId)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaAttachments: ").append(toIndentedString(mediaAttachments)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    reblog: ").append(toIndentedString(reblog)).append("\n");
    sb.append("    reblogged: ").append(toIndentedString(reblogged)).append("\n");
    sb.append("    reblogsCount: ").append(toIndentedString(reblogsCount)).append("\n");
    sb.append("    repliesCount: ").append(toIndentedString(repliesCount)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("application");
    openapiFields.add("bookmarked");
    openapiFields.add("card");
    openapiFields.add("content");
    openapiFields.add("created_at");
    openapiFields.add("emojis");
    openapiFields.add("favourited");
    openapiFields.add("favourites_count");
    openapiFields.add("id");
    openapiFields.add("in_reply_to_account_id");
    openapiFields.add("in_reply_to_id");
    openapiFields.add("language");
    openapiFields.add("media_attachments");
    openapiFields.add("mentions");
    openapiFields.add("muted");
    openapiFields.add("pinned");
    openapiFields.add("poll");
    openapiFields.add("reblog");
    openapiFields.add("reblogged");
    openapiFields.add("reblogs_count");
    openapiFields.add("replies_count");
    openapiFields.add("sensitive");
    openapiFields.add("spoiler_text");
    openapiFields.add("tags");
    openapiFields.add("text");
    openapiFields.add("uri");
    openapiFields.add("url");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Status
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Status.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Status is not found in the empty JSON string", Status.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Status.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Status` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        Account.validateJsonElement(jsonObj.get("account"));
      }
      // validate the optional field `application`
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()) {
        Application.validateJsonElement(jsonObj.get("application"));
      }
      // validate the optional field `card`
      if (jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) {
        Card.validateJsonElement(jsonObj.get("card"));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("emojis") != null && !jsonObj.get("emojis").isJsonNull()) {
        JsonArray jsonArrayemojis = jsonObj.getAsJsonArray("emojis");
        if (jsonArrayemojis != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emojis").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emojis` to be an array in the JSON string but got `%s`", jsonObj.get("emojis").toString()));
          }

          // validate the optional field `emojis` (array)
          for (int i = 0; i < jsonArrayemojis.size(); i++) {
            Emoji.validateJsonElement(jsonArrayemojis.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("in_reply_to_account_id") != null && !jsonObj.get("in_reply_to_account_id").isJsonNull()) && !jsonObj.get("in_reply_to_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_reply_to_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_reply_to_account_id").toString()));
      }
      if ((jsonObj.get("in_reply_to_id") != null && !jsonObj.get("in_reply_to_id").isJsonNull()) && !jsonObj.get("in_reply_to_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_reply_to_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_reply_to_id").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("media_attachments") != null && !jsonObj.get("media_attachments").isJsonNull()) {
        JsonArray jsonArraymediaAttachments = jsonObj.getAsJsonArray("media_attachments");
        if (jsonArraymediaAttachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("media_attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `media_attachments` to be an array in the JSON string but got `%s`", jsonObj.get("media_attachments").toString()));
          }

          // validate the optional field `media_attachments` (array)
          for (int i = 0; i < jsonArraymediaAttachments.size(); i++) {
            Attachment.validateJsonElement(jsonArraymediaAttachments.get(i));
          };
        }
      }
      if (jsonObj.get("mentions") != null && !jsonObj.get("mentions").isJsonNull()) {
        JsonArray jsonArraymentions = jsonObj.getAsJsonArray("mentions");
        if (jsonArraymentions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mentions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mentions` to be an array in the JSON string but got `%s`", jsonObj.get("mentions").toString()));
          }

          // validate the optional field `mentions` (array)
          for (int i = 0; i < jsonArraymentions.size(); i++) {
            Mention.validateJsonElement(jsonArraymentions.get(i));
          };
        }
      }
      // validate the optional field `poll`
      if (jsonObj.get("poll") != null && !jsonObj.get("poll").isJsonNull()) {
        Poll.validateJsonElement(jsonObj.get("poll"));
      }
      // validate the optional field `reblog`
      if (jsonObj.get("reblog") != null && !jsonObj.get("reblog").isJsonNull()) {
        Status.validateJsonElement(jsonObj.get("reblog"));
      }
      if ((jsonObj.get("spoiler_text") != null && !jsonObj.get("spoiler_text").isJsonNull()) && !jsonObj.get("spoiler_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spoiler_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spoiler_text").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the optional field `visibility`
      if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) {
        VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Status.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Status' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Status> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Status.class));

       return (TypeAdapter<T>) new TypeAdapter<Status>() {
           @Override
           public void write(JsonWriter out, Status value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Status read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Status given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Status
   * @throws IOException if the JSON string is invalid with respect to Status
   */
  public static Status fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Status.class);
  }

  /**
   * Convert an instance of Status to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

