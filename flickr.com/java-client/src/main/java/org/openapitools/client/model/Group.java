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
import org.openapitools.client.model.Cover;
import org.openapitools.client.model.GetFavoritesContextByID200ResponseCount;
import org.openapitools.client.model.GroupBlast;
import org.openapitools.client.model.GroupRestrictions;
import org.openapitools.client.model.GroupRoles;
import org.openapitools.client.model.GroupThrottle;
import org.openapitools.client.model.PhotoURLs;

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
 * Group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:54.658141-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Group {
  public static final String SERIALIZED_NAME_BLAST = "blast";
  @SerializedName(SERIALIZED_NAME_BLAST)
  private GroupBlast blast;

  public static final String SERIALIZED_NAME_COVER = "cover";
  @SerializedName(SERIALIZED_NAME_COVER)
  private Cover cover;

  public static final String SERIALIZED_NAME_COVERPHOTO_FARM = "coverphoto_farm";
  @SerializedName(SERIALIZED_NAME_COVERPHOTO_FARM)
  private String coverphotoFarm;

  public static final String SERIALIZED_NAME_COVERPHOTO_SERVER = "coverphoto_server";
  @SerializedName(SERIALIZED_NAME_COVERPHOTO_SERVER)
  private String coverphotoServer;

  public static final String SERIALIZED_NAME_COVERPHOTO_URL = "coverphoto_url";
  @SerializedName(SERIALIZED_NAME_COVERPHOTO_URL)
  private PhotoURLs coverphotoUrl;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private GetFavoritesContextByID200ResponseCount description;

  public static final String SERIALIZED_NAME_ICONFARM = "iconfarm";
  @SerializedName(SERIALIZED_NAME_ICONFARM)
  private String iconfarm;

  public static final String SERIALIZED_NAME_ICONSERVER = "iconserver";
  @SerializedName(SERIALIZED_NAME_ICONSERVER)
  private String iconserver;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_IS_MEMBER = "is_member";
  @SerializedName(SERIALIZED_NAME_IS_MEMBER)
  private Boolean isMember;

  public static final String SERIALIZED_NAME_IS_MODERATOR = "is_moderator";
  @SerializedName(SERIALIZED_NAME_IS_MODERATOR)
  private Boolean isModerator;

  public static final String SERIALIZED_NAME_ISPOOLMODERATED = "ispoolmoderated";
  @SerializedName(SERIALIZED_NAME_ISPOOLMODERATED)
  private Boolean ispoolmoderated;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private GetFavoritesContextByID200ResponseCount members;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private GetFavoritesContextByID200ResponseCount name;

  public static final String SERIALIZED_NAME_PATH_ALIAS = "path_alias";
  @SerializedName(SERIALIZED_NAME_PATH_ALIAS)
  private String pathAlias;

  public static final String SERIALIZED_NAME_POOL_COUNT = "pool_count";
  @SerializedName(SERIALIZED_NAME_POOL_COUNT)
  private GetFavoritesContextByID200ResponseCount poolCount;

  public static final String SERIALIZED_NAME_POOL_ROWS = "pool_rows";
  @SerializedName(SERIALIZED_NAME_POOL_ROWS)
  private Integer poolRows;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private GetFavoritesContextByID200ResponseCount privacy;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private GroupRestrictions restrictions;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private GroupRoles roles;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private GetFavoritesContextByID200ResponseCount rules;

  public static final String SERIALIZED_NAME_THROTTLE = "throttle";
  @SerializedName(SERIALIZED_NAME_THROTTLE)
  private GroupThrottle throttle;

  public static final String SERIALIZED_NAME_TOPIC_COUNT = "topic_count";
  @SerializedName(SERIALIZED_NAME_TOPIC_COUNT)
  private GetFavoritesContextByID200ResponseCount topicCount;

  public Group() {
  }

  public Group blast(GroupBlast blast) {
    this.blast = blast;
    return this;
  }

  /**
   * Get blast
   * @return blast
   */
  @javax.annotation.Nullable
  public GroupBlast getBlast() {
    return blast;
  }

  public void setBlast(GroupBlast blast) {
    this.blast = blast;
  }


  public Group cover(Cover cover) {
    this.cover = cover;
    return this;
  }

  /**
   * Get cover
   * @return cover
   */
  @javax.annotation.Nullable
  public Cover getCover() {
    return cover;
  }

  public void setCover(Cover cover) {
    this.cover = cover;
  }


  public Group coverphotoFarm(String coverphotoFarm) {
    this.coverphotoFarm = coverphotoFarm;
    return this;
  }

  /**
   * Get coverphotoFarm
   * @return coverphotoFarm
   */
  @javax.annotation.Nullable
  public String getCoverphotoFarm() {
    return coverphotoFarm;
  }

  public void setCoverphotoFarm(String coverphotoFarm) {
    this.coverphotoFarm = coverphotoFarm;
  }


  public Group coverphotoServer(String coverphotoServer) {
    this.coverphotoServer = coverphotoServer;
    return this;
  }

  /**
   * Get coverphotoServer
   * @return coverphotoServer
   */
  @javax.annotation.Nullable
  public String getCoverphotoServer() {
    return coverphotoServer;
  }

  public void setCoverphotoServer(String coverphotoServer) {
    this.coverphotoServer = coverphotoServer;
  }


  public Group coverphotoUrl(PhotoURLs coverphotoUrl) {
    this.coverphotoUrl = coverphotoUrl;
    return this;
  }

  /**
   * Get coverphotoUrl
   * @return coverphotoUrl
   */
  @javax.annotation.Nullable
  public PhotoURLs getCoverphotoUrl() {
    return coverphotoUrl;
  }

  public void setCoverphotoUrl(PhotoURLs coverphotoUrl) {
    this.coverphotoUrl = coverphotoUrl;
  }


  public Group description(GetFavoritesContextByID200ResponseCount description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getDescription() {
    return description;
  }

  public void setDescription(GetFavoritesContextByID200ResponseCount description) {
    this.description = description;
  }


  public Group iconfarm(String iconfarm) {
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


  public Group iconserver(String iconserver) {
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


  public Group id(String id) {
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


  public Group isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Get isAdmin
   * @return isAdmin
   */
  @javax.annotation.Nullable
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public Group isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

  /**
   * Get isMember
   * @return isMember
   */
  @javax.annotation.Nullable
  public Boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public Group isModerator(Boolean isModerator) {
    this.isModerator = isModerator;
    return this;
  }

  /**
   * Get isModerator
   * @return isModerator
   */
  @javax.annotation.Nullable
  public Boolean getIsModerator() {
    return isModerator;
  }

  public void setIsModerator(Boolean isModerator) {
    this.isModerator = isModerator;
  }


  public Group ispoolmoderated(Boolean ispoolmoderated) {
    this.ispoolmoderated = ispoolmoderated;
    return this;
  }

  /**
   * Get ispoolmoderated
   * @return ispoolmoderated
   */
  @javax.annotation.Nullable
  public Boolean getIspoolmoderated() {
    return ispoolmoderated;
  }

  public void setIspoolmoderated(Boolean ispoolmoderated) {
    this.ispoolmoderated = ispoolmoderated;
  }


  public Group lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
   */
  @javax.annotation.Nullable
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public Group members(GetFavoritesContextByID200ResponseCount members) {
    this.members = members;
    return this;
  }

  /**
   * Get members
   * @return members
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getMembers() {
    return members;
  }

  public void setMembers(GetFavoritesContextByID200ResponseCount members) {
    this.members = members;
  }


  public Group name(GetFavoritesContextByID200ResponseCount name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getName() {
    return name;
  }

  public void setName(GetFavoritesContextByID200ResponseCount name) {
    this.name = name;
  }


  public Group pathAlias(String pathAlias) {
    this.pathAlias = pathAlias;
    return this;
  }

  /**
   * Get pathAlias
   * @return pathAlias
   */
  @javax.annotation.Nullable
  public String getPathAlias() {
    return pathAlias;
  }

  public void setPathAlias(String pathAlias) {
    this.pathAlias = pathAlias;
  }


  public Group poolCount(GetFavoritesContextByID200ResponseCount poolCount) {
    this.poolCount = poolCount;
    return this;
  }

  /**
   * Get poolCount
   * @return poolCount
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getPoolCount() {
    return poolCount;
  }

  public void setPoolCount(GetFavoritesContextByID200ResponseCount poolCount) {
    this.poolCount = poolCount;
  }


  public Group poolRows(Integer poolRows) {
    this.poolRows = poolRows;
    return this;
  }

  /**
   * Get poolRows
   * @return poolRows
   */
  @javax.annotation.Nullable
  public Integer getPoolRows() {
    return poolRows;
  }

  public void setPoolRows(Integer poolRows) {
    this.poolRows = poolRows;
  }


  public Group privacy(GetFavoritesContextByID200ResponseCount privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * Get privacy
   * @return privacy
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getPrivacy() {
    return privacy;
  }

  public void setPrivacy(GetFavoritesContextByID200ResponseCount privacy) {
    this.privacy = privacy;
  }


  public Group restrictions(GroupRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  /**
   * Get restrictions
   * @return restrictions
   */
  @javax.annotation.Nullable
  public GroupRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(GroupRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  public Group roles(GroupRoles roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public GroupRoles getRoles() {
    return roles;
  }

  public void setRoles(GroupRoles roles) {
    this.roles = roles;
  }


  public Group rules(GetFavoritesContextByID200ResponseCount rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   * @return rules
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getRules() {
    return rules;
  }

  public void setRules(GetFavoritesContextByID200ResponseCount rules) {
    this.rules = rules;
  }


  public Group throttle(GroupThrottle throttle) {
    this.throttle = throttle;
    return this;
  }

  /**
   * Get throttle
   * @return throttle
   */
  @javax.annotation.Nullable
  public GroupThrottle getThrottle() {
    return throttle;
  }

  public void setThrottle(GroupThrottle throttle) {
    this.throttle = throttle;
  }


  public Group topicCount(GetFavoritesContextByID200ResponseCount topicCount) {
    this.topicCount = topicCount;
    return this;
  }

  /**
   * Get topicCount
   * @return topicCount
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getTopicCount() {
    return topicCount;
  }

  public void setTopicCount(GetFavoritesContextByID200ResponseCount topicCount) {
    this.topicCount = topicCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.blast, group.blast) &&
        Objects.equals(this.cover, group.cover) &&
        Objects.equals(this.coverphotoFarm, group.coverphotoFarm) &&
        Objects.equals(this.coverphotoServer, group.coverphotoServer) &&
        Objects.equals(this.coverphotoUrl, group.coverphotoUrl) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.iconfarm, group.iconfarm) &&
        Objects.equals(this.iconserver, group.iconserver) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.isAdmin, group.isAdmin) &&
        Objects.equals(this.isMember, group.isMember) &&
        Objects.equals(this.isModerator, group.isModerator) &&
        Objects.equals(this.ispoolmoderated, group.ispoolmoderated) &&
        Objects.equals(this.lang, group.lang) &&
        Objects.equals(this.members, group.members) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.pathAlias, group.pathAlias) &&
        Objects.equals(this.poolCount, group.poolCount) &&
        Objects.equals(this.poolRows, group.poolRows) &&
        Objects.equals(this.privacy, group.privacy) &&
        Objects.equals(this.restrictions, group.restrictions) &&
        Objects.equals(this.roles, group.roles) &&
        Objects.equals(this.rules, group.rules) &&
        Objects.equals(this.throttle, group.throttle) &&
        Objects.equals(this.topicCount, group.topicCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blast, cover, coverphotoFarm, coverphotoServer, coverphotoUrl, description, iconfarm, iconserver, id, isAdmin, isMember, isModerator, ispoolmoderated, lang, members, name, pathAlias, poolCount, poolRows, privacy, restrictions, roles, rules, throttle, topicCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    blast: ").append(toIndentedString(blast)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    coverphotoFarm: ").append(toIndentedString(coverphotoFarm)).append("\n");
    sb.append("    coverphotoServer: ").append(toIndentedString(coverphotoServer)).append("\n");
    sb.append("    coverphotoUrl: ").append(toIndentedString(coverphotoUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconfarm: ").append(toIndentedString(iconfarm)).append("\n");
    sb.append("    iconserver: ").append(toIndentedString(iconserver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    isModerator: ").append(toIndentedString(isModerator)).append("\n");
    sb.append("    ispoolmoderated: ").append(toIndentedString(ispoolmoderated)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathAlias: ").append(toIndentedString(pathAlias)).append("\n");
    sb.append("    poolCount: ").append(toIndentedString(poolCount)).append("\n");
    sb.append("    poolRows: ").append(toIndentedString(poolRows)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
    sb.append("    topicCount: ").append(toIndentedString(topicCount)).append("\n");
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
    openapiFields.add("blast");
    openapiFields.add("cover");
    openapiFields.add("coverphoto_farm");
    openapiFields.add("coverphoto_server");
    openapiFields.add("coverphoto_url");
    openapiFields.add("description");
    openapiFields.add("iconfarm");
    openapiFields.add("iconserver");
    openapiFields.add("id");
    openapiFields.add("is_admin");
    openapiFields.add("is_member");
    openapiFields.add("is_moderator");
    openapiFields.add("ispoolmoderated");
    openapiFields.add("lang");
    openapiFields.add("members");
    openapiFields.add("name");
    openapiFields.add("path_alias");
    openapiFields.add("pool_count");
    openapiFields.add("pool_rows");
    openapiFields.add("privacy");
    openapiFields.add("restrictions");
    openapiFields.add("roles");
    openapiFields.add("rules");
    openapiFields.add("throttle");
    openapiFields.add("topic_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Group
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Group.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Group is not found in the empty JSON string", Group.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Group.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Group` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `blast`
      if (jsonObj.get("blast") != null && !jsonObj.get("blast").isJsonNull()) {
        GroupBlast.validateJsonElement(jsonObj.get("blast"));
      }
      // validate the optional field `cover`
      if (jsonObj.get("cover") != null && !jsonObj.get("cover").isJsonNull()) {
        Cover.validateJsonElement(jsonObj.get("cover"));
      }
      if ((jsonObj.get("coverphoto_farm") != null && !jsonObj.get("coverphoto_farm").isJsonNull()) && !jsonObj.get("coverphoto_farm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverphoto_farm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverphoto_farm").toString()));
      }
      if ((jsonObj.get("coverphoto_server") != null && !jsonObj.get("coverphoto_server").isJsonNull()) && !jsonObj.get("coverphoto_server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverphoto_server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverphoto_server").toString()));
      }
      // validate the optional field `coverphoto_url`
      if (jsonObj.get("coverphoto_url") != null && !jsonObj.get("coverphoto_url").isJsonNull()) {
        PhotoURLs.validateJsonElement(jsonObj.get("coverphoto_url"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("description"));
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
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      // validate the optional field `members`
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("members"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("name"));
      }
      if ((jsonObj.get("path_alias") != null && !jsonObj.get("path_alias").isJsonNull()) && !jsonObj.get("path_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path_alias").toString()));
      }
      // validate the optional field `pool_count`
      if (jsonObj.get("pool_count") != null && !jsonObj.get("pool_count").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("pool_count"));
      }
      // validate the optional field `privacy`
      if (jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("privacy"));
      }
      // validate the optional field `restrictions`
      if (jsonObj.get("restrictions") != null && !jsonObj.get("restrictions").isJsonNull()) {
        GroupRestrictions.validateJsonElement(jsonObj.get("restrictions"));
      }
      // validate the optional field `roles`
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        GroupRoles.validateJsonElement(jsonObj.get("roles"));
      }
      // validate the optional field `rules`
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("rules"));
      }
      // validate the optional field `throttle`
      if (jsonObj.get("throttle") != null && !jsonObj.get("throttle").isJsonNull()) {
        GroupThrottle.validateJsonElement(jsonObj.get("throttle"));
      }
      // validate the optional field `topic_count`
      if (jsonObj.get("topic_count") != null && !jsonObj.get("topic_count").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("topic_count"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Group.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Group' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Group> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Group.class));

       return (TypeAdapter<T>) new TypeAdapter<Group>() {
           @Override
           public void write(JsonWriter out, Group value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Group read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Group given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Group
   * @throws IOException if the JSON string is invalid with respect to Group
   */
  public static Group fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Group.class);
  }

  /**
   * Convert an instance of Group to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

