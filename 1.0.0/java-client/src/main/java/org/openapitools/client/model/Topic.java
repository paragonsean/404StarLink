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
import org.openapitools.client.model.GetFavoritesContextByID200ResponseCount;

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
 * Topic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:39.005803-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Topic {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_AUTHOR_IS_DELETED = "author_is_deleted";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IS_DELETED)
  private Boolean authorIsDeleted;

  public static final String SERIALIZED_NAME_AUTHOR_PATH_ALIAS = "author_path_alias";
  @SerializedName(SERIALIZED_NAME_AUTHOR_PATH_ALIAS)
  private String authorPathAlias;

  public static final String SERIALIZED_NAME_AUTHORNAME = "authorname";
  @SerializedName(SERIALIZED_NAME_AUTHORNAME)
  private String authorname;

  public static final String SERIALIZED_NAME_CAN_DELETE = "can_delete";
  @SerializedName(SERIALIZED_NAME_CAN_DELETE)
  private Boolean canDelete;

  public static final String SERIALIZED_NAME_CAN_EDIT = "can_edit";
  @SerializedName(SERIALIZED_NAME_CAN_EDIT)
  private Boolean canEdit;

  public static final String SERIALIZED_NAME_CAN_REPLY = "can_reply";
  @SerializedName(SERIALIZED_NAME_CAN_REPLY)
  private Boolean canReply;

  public static final String SERIALIZED_NAME_COUNT_REPLIES = "count_replies";
  @SerializedName(SERIALIZED_NAME_COUNT_REPLIES)
  private Integer countReplies;

  public static final String SERIALIZED_NAME_DATECREATE = "datecreate";
  @SerializedName(SERIALIZED_NAME_DATECREATE)
  private String datecreate;

  public static final String SERIALIZED_NAME_DATELASTPOST = "datelastpost";
  @SerializedName(SERIALIZED_NAME_DATELASTPOST)
  private String datelastpost;

  public static final String SERIALIZED_NAME_ICONFARM = "iconfarm";
  @SerializedName(SERIALIZED_NAME_ICONFARM)
  private String iconfarm;

  public static final String SERIALIZED_NAME_ICONSERVER = "iconserver";
  @SerializedName(SERIALIZED_NAME_ICONSERVER)
  private String iconserver;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_LOCKED = "is_locked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_IS_PRO = "is_pro";
  @SerializedName(SERIALIZED_NAME_IS_PRO)
  private Boolean isPro;

  public static final String SERIALIZED_NAME_IS_STICKY = "is_sticky";
  @SerializedName(SERIALIZED_NAME_IS_STICKY)
  private Boolean isSticky;

  public static final String SERIALIZED_NAME_LAST_REPLY = "last_reply";
  @SerializedName(SERIALIZED_NAME_LAST_REPLY)
  private String lastReply;

  public static final String SERIALIZED_NAME_LASTEDIT = "lastedit";
  @SerializedName(SERIALIZED_NAME_LASTEDIT)
  private String lastedit;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private GetFavoritesContextByID200ResponseCount message;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public Topic() {
  }

  public Topic author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public Topic authorIsDeleted(Boolean authorIsDeleted) {
    this.authorIsDeleted = authorIsDeleted;
    return this;
  }

  /**
   * Get authorIsDeleted
   * @return authorIsDeleted
   */
  @javax.annotation.Nullable
  public Boolean getAuthorIsDeleted() {
    return authorIsDeleted;
  }

  public void setAuthorIsDeleted(Boolean authorIsDeleted) {
    this.authorIsDeleted = authorIsDeleted;
  }


  public Topic authorPathAlias(String authorPathAlias) {
    this.authorPathAlias = authorPathAlias;
    return this;
  }

  /**
   * Get authorPathAlias
   * @return authorPathAlias
   */
  @javax.annotation.Nullable
  public String getAuthorPathAlias() {
    return authorPathAlias;
  }

  public void setAuthorPathAlias(String authorPathAlias) {
    this.authorPathAlias = authorPathAlias;
  }


  public Topic authorname(String authorname) {
    this.authorname = authorname;
    return this;
  }

  /**
   * Get authorname
   * @return authorname
   */
  @javax.annotation.Nullable
  public String getAuthorname() {
    return authorname;
  }

  public void setAuthorname(String authorname) {
    this.authorname = authorname;
  }


  public Topic canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

  /**
   * Get canDelete
   * @return canDelete
   */
  @javax.annotation.Nullable
  public Boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }


  public Topic canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * Get canEdit
   * @return canEdit
   */
  @javax.annotation.Nullable
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }


  public Topic canReply(Boolean canReply) {
    this.canReply = canReply;
    return this;
  }

  /**
   * Get canReply
   * @return canReply
   */
  @javax.annotation.Nullable
  public Boolean getCanReply() {
    return canReply;
  }

  public void setCanReply(Boolean canReply) {
    this.canReply = canReply;
  }


  public Topic countReplies(Integer countReplies) {
    this.countReplies = countReplies;
    return this;
  }

  /**
   * Get countReplies
   * @return countReplies
   */
  @javax.annotation.Nullable
  public Integer getCountReplies() {
    return countReplies;
  }

  public void setCountReplies(Integer countReplies) {
    this.countReplies = countReplies;
  }


  public Topic datecreate(String datecreate) {
    this.datecreate = datecreate;
    return this;
  }

  /**
   * Get datecreate
   * @return datecreate
   */
  @javax.annotation.Nullable
  public String getDatecreate() {
    return datecreate;
  }

  public void setDatecreate(String datecreate) {
    this.datecreate = datecreate;
  }


  public Topic datelastpost(String datelastpost) {
    this.datelastpost = datelastpost;
    return this;
  }

  /**
   * Get datelastpost
   * @return datelastpost
   */
  @javax.annotation.Nullable
  public String getDatelastpost() {
    return datelastpost;
  }

  public void setDatelastpost(String datelastpost) {
    this.datelastpost = datelastpost;
  }


  public Topic iconfarm(String iconfarm) {
    this.iconfarm = iconfarm;
    return this;
  }

  /**
   * Get iconfarm
   * @return iconfarm
   */
  @javax.annotation.Nullable
  public String getIconfarm() {
    return iconfarm;
  }

  public void setIconfarm(String iconfarm) {
    this.iconfarm = iconfarm;
  }


  public Topic iconserver(String iconserver) {
    this.iconserver = iconserver;
    return this;
  }

  /**
   * Get iconserver
   * @return iconserver
   */
  @javax.annotation.Nullable
  public String getIconserver() {
    return iconserver;
  }

  public void setIconserver(String iconserver) {
    this.iconserver = iconserver;
  }


  public Topic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Topic isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   * @return isLocked
   */
  @javax.annotation.Nullable
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public Topic isPro(Boolean isPro) {
    this.isPro = isPro;
    return this;
  }

  /**
   * Get isPro
   * @return isPro
   */
  @javax.annotation.Nullable
  public Boolean getIsPro() {
    return isPro;
  }

  public void setIsPro(Boolean isPro) {
    this.isPro = isPro;
  }


  public Topic isSticky(Boolean isSticky) {
    this.isSticky = isSticky;
    return this;
  }

  /**
   * Get isSticky
   * @return isSticky
   */
  @javax.annotation.Nullable
  public Boolean getIsSticky() {
    return isSticky;
  }

  public void setIsSticky(Boolean isSticky) {
    this.isSticky = isSticky;
  }


  public Topic lastReply(String lastReply) {
    this.lastReply = lastReply;
    return this;
  }

  /**
   * Get lastReply
   * @return lastReply
   */
  @javax.annotation.Nullable
  public String getLastReply() {
    return lastReply;
  }

  public void setLastReply(String lastReply) {
    this.lastReply = lastReply;
  }


  public Topic lastedit(String lastedit) {
    this.lastedit = lastedit;
    return this;
  }

  /**
   * Get lastedit
   * @return lastedit
   */
  @javax.annotation.Nullable
  public String getLastedit() {
    return lastedit;
  }

  public void setLastedit(String lastedit) {
    this.lastedit = lastedit;
  }


  public Topic message(GetFavoritesContextByID200ResponseCount message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getMessage() {
    return message;
  }

  public void setMessage(GetFavoritesContextByID200ResponseCount message) {
    this.message = message;
  }


  public Topic role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public Topic subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topic topic = (Topic) o;
    return Objects.equals(this.author, topic.author) &&
        Objects.equals(this.authorIsDeleted, topic.authorIsDeleted) &&
        Objects.equals(this.authorPathAlias, topic.authorPathAlias) &&
        Objects.equals(this.authorname, topic.authorname) &&
        Objects.equals(this.canDelete, topic.canDelete) &&
        Objects.equals(this.canEdit, topic.canEdit) &&
        Objects.equals(this.canReply, topic.canReply) &&
        Objects.equals(this.countReplies, topic.countReplies) &&
        Objects.equals(this.datecreate, topic.datecreate) &&
        Objects.equals(this.datelastpost, topic.datelastpost) &&
        Objects.equals(this.iconfarm, topic.iconfarm) &&
        Objects.equals(this.iconserver, topic.iconserver) &&
        Objects.equals(this.id, topic.id) &&
        Objects.equals(this.isLocked, topic.isLocked) &&
        Objects.equals(this.isPro, topic.isPro) &&
        Objects.equals(this.isSticky, topic.isSticky) &&
        Objects.equals(this.lastReply, topic.lastReply) &&
        Objects.equals(this.lastedit, topic.lastedit) &&
        Objects.equals(this.message, topic.message) &&
        Objects.equals(this.role, topic.role) &&
        Objects.equals(this.subject, topic.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, authorIsDeleted, authorPathAlias, authorname, canDelete, canEdit, canReply, countReplies, datecreate, datelastpost, iconfarm, iconserver, id, isLocked, isPro, isSticky, lastReply, lastedit, message, role, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topic {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorIsDeleted: ").append(toIndentedString(authorIsDeleted)).append("\n");
    sb.append("    authorPathAlias: ").append(toIndentedString(authorPathAlias)).append("\n");
    sb.append("    authorname: ").append(toIndentedString(authorname)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    canReply: ").append(toIndentedString(canReply)).append("\n");
    sb.append("    countReplies: ").append(toIndentedString(countReplies)).append("\n");
    sb.append("    datecreate: ").append(toIndentedString(datecreate)).append("\n");
    sb.append("    datelastpost: ").append(toIndentedString(datelastpost)).append("\n");
    sb.append("    iconfarm: ").append(toIndentedString(iconfarm)).append("\n");
    sb.append("    iconserver: ").append(toIndentedString(iconserver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isPro: ").append(toIndentedString(isPro)).append("\n");
    sb.append("    isSticky: ").append(toIndentedString(isSticky)).append("\n");
    sb.append("    lastReply: ").append(toIndentedString(lastReply)).append("\n");
    sb.append("    lastedit: ").append(toIndentedString(lastedit)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("author_is_deleted");
    openapiFields.add("author_path_alias");
    openapiFields.add("authorname");
    openapiFields.add("can_delete");
    openapiFields.add("can_edit");
    openapiFields.add("can_reply");
    openapiFields.add("count_replies");
    openapiFields.add("datecreate");
    openapiFields.add("datelastpost");
    openapiFields.add("iconfarm");
    openapiFields.add("iconserver");
    openapiFields.add("id");
    openapiFields.add("is_locked");
    openapiFields.add("is_pro");
    openapiFields.add("is_sticky");
    openapiFields.add("last_reply");
    openapiFields.add("lastedit");
    openapiFields.add("message");
    openapiFields.add("role");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Topic
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Topic.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Topic is not found in the empty JSON string", Topic.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Topic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Topic` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) && !jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if ((jsonObj.get("author_path_alias") != null && !jsonObj.get("author_path_alias").isJsonNull()) && !jsonObj.get("author_path_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_path_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_path_alias").toString()));
      }
      if ((jsonObj.get("authorname") != null && !jsonObj.get("authorname").isJsonNull()) && !jsonObj.get("authorname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorname").toString()));
      }
      if ((jsonObj.get("datecreate") != null && !jsonObj.get("datecreate").isJsonNull()) && !jsonObj.get("datecreate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datecreate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datecreate").toString()));
      }
      if ((jsonObj.get("datelastpost") != null && !jsonObj.get("datelastpost").isJsonNull()) && !jsonObj.get("datelastpost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datelastpost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datelastpost").toString()));
      }
      if ((jsonObj.get("iconfarm") != null && !jsonObj.get("iconfarm").isJsonNull()) && !jsonObj.get("iconfarm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconfarm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconfarm").toString()));
      }
      if ((jsonObj.get("iconserver") != null && !jsonObj.get("iconserver").isJsonNull()) && !jsonObj.get("iconserver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconserver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconserver").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("last_reply") != null && !jsonObj.get("last_reply").isJsonNull()) && !jsonObj.get("last_reply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_reply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_reply").toString()));
      }
      if ((jsonObj.get("lastedit") != null && !jsonObj.get("lastedit").isJsonNull()) && !jsonObj.get("lastedit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastedit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastedit").toString()));
      }
      // validate the optional field `message`
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("message"));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Topic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Topic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Topic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Topic.class));

       return (TypeAdapter<T>) new TypeAdapter<Topic>() {
           @Override
           public void write(JsonWriter out, Topic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Topic read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Topic given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Topic
   * @throws IOException if the JSON string is invalid with respect to Topic
   */
  public static Topic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Topic.class);
  }

  /**
   * Convert an instance of Topic to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

