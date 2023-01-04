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
import org.openapitools.client.model.Owner;
import org.openapitools.client.model.PhotoDates;
import org.openapitools.client.model.PhotoEditability;
import org.openapitools.client.model.PhotoNotes;
import org.openapitools.client.model.PhotoPeople;
import org.openapitools.client.model.PhotoPermissions;
import org.openapitools.client.model.PhotoTags;
import org.openapitools.client.model.PhotoUrls;
import org.openapitools.client.model.PhotoUsage;
import org.openapitools.client.model.PhotoVisibility;

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
 * Photo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:51.881402-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Photo {
  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private GetFavoritesContextByID200ResponseCount comments;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private PhotoDates dates;

  public static final String SERIALIZED_NAME_DATEUPLOADED = "dateuploaded";
  @SerializedName(SERIALIZED_NAME_DATEUPLOADED)
  private String dateuploaded;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private GetFavoritesContextByID200ResponseCount description;

  public static final String SERIALIZED_NAME_EDITABILITY = "editability";
  @SerializedName(SERIALIZED_NAME_EDITABILITY)
  private PhotoEditability editability;

  public static final String SERIALIZED_NAME_FARM = "farm";
  @SerializedName(SERIALIZED_NAME_FARM)
  private String farm;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISFAVORITE = "isfavorite";
  @SerializedName(SERIALIZED_NAME_ISFAVORITE)
  private Boolean isfavorite;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private String license;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private String media;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private PhotoNotes notes;

  public static final String SERIALIZED_NAME_ORIGINALSECRET = "originalsecret";
  @SerializedName(SERIALIZED_NAME_ORIGINALSECRET)
  private String originalsecret;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private Owner owner;

  public static final String SERIALIZED_NAME_PEOPLE = "people";
  @SerializedName(SERIALIZED_NAME_PEOPLE)
  private PhotoPeople people;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PhotoPermissions permissions;

  public static final String SERIALIZED_NAME_PUBLICEDITABILITY = "publiceditability";
  @SerializedName(SERIALIZED_NAME_PUBLICEDITABILITY)
  private PhotoEditability publiceditability;

  public static final String SERIALIZED_NAME_ROTATION = "rotation";
  @SerializedName(SERIALIZED_NAME_ROTATION)
  private String rotation;

  public static final String SERIALIZED_NAME_SAFE = "safe";
  @SerializedName(SERIALIZED_NAME_SAFE)
  private Boolean safe;

  public static final String SERIALIZED_NAME_SAFETY_LEVEL = "safety_level";
  @SerializedName(SERIALIZED_NAME_SAFETY_LEVEL)
  private String safetyLevel;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private PhotoTags tags;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private GetFavoritesContextByID200ResponseCount title;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private PhotoUrls urls;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private PhotoUsage usage;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private String views;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private PhotoVisibility visibility;

  public Photo() {
  }

  public Photo comments(GetFavoritesContextByID200ResponseCount comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getComments() {
    return comments;
  }

  public void setComments(GetFavoritesContextByID200ResponseCount comments) {
    this.comments = comments;
  }


  public Photo dates(PhotoDates dates) {
    this.dates = dates;
    return this;
  }

  /**
   * Get dates
   * @return dates
   */
  @javax.annotation.Nullable
  public PhotoDates getDates() {
    return dates;
  }

  public void setDates(PhotoDates dates) {
    this.dates = dates;
  }


  public Photo dateuploaded(String dateuploaded) {
    this.dateuploaded = dateuploaded;
    return this;
  }

  /**
   * Get dateuploaded
   * @return dateuploaded
   */
  @javax.annotation.Nullable
  public String getDateuploaded() {
    return dateuploaded;
  }

  public void setDateuploaded(String dateuploaded) {
    this.dateuploaded = dateuploaded;
  }


  public Photo description(GetFavoritesContextByID200ResponseCount description) {
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


  public Photo editability(PhotoEditability editability) {
    this.editability = editability;
    return this;
  }

  /**
   * Get editability
   * @return editability
   */
  @javax.annotation.Nullable
  public PhotoEditability getEditability() {
    return editability;
  }

  public void setEditability(PhotoEditability editability) {
    this.editability = editability;
  }


  public Photo farm(String farm) {
    this.farm = farm;
    return this;
  }

  /**
   * Get farm
   * @return farm
   */
  @javax.annotation.Nullable
  public String getFarm() {
    return farm;
  }

  public void setFarm(String farm) {
    this.farm = farm;
  }


  public Photo id(String id) {
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


  public Photo isfavorite(Boolean isfavorite) {
    this.isfavorite = isfavorite;
    return this;
  }

  /**
   * Get isfavorite
   * @return isfavorite
   */
  @javax.annotation.Nullable
  public Boolean getIsfavorite() {
    return isfavorite;
  }

  public void setIsfavorite(Boolean isfavorite) {
    this.isfavorite = isfavorite;
  }


  public Photo license(String license) {
    this.license = license;
    return this;
  }

  /**
   * Get license
   * @return license
   */
  @javax.annotation.Nullable
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }


  public Photo media(String media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @javax.annotation.Nullable
  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
  }


  public Photo notes(PhotoNotes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  public PhotoNotes getNotes() {
    return notes;
  }

  public void setNotes(PhotoNotes notes) {
    this.notes = notes;
  }


  public Photo originalsecret(String originalsecret) {
    this.originalsecret = originalsecret;
    return this;
  }

  /**
   * Get originalsecret
   * @return originalsecret
   */
  @javax.annotation.Nullable
  public String getOriginalsecret() {
    return originalsecret;
  }

  public void setOriginalsecret(String originalsecret) {
    this.originalsecret = originalsecret;
  }


  public Photo owner(Owner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }


  public Photo people(PhotoPeople people) {
    this.people = people;
    return this;
  }

  /**
   * Get people
   * @return people
   */
  @javax.annotation.Nullable
  public PhotoPeople getPeople() {
    return people;
  }

  public void setPeople(PhotoPeople people) {
    this.people = people;
  }


  public Photo permissions(PhotoPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @javax.annotation.Nullable
  public PhotoPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(PhotoPermissions permissions) {
    this.permissions = permissions;
  }


  public Photo publiceditability(PhotoEditability publiceditability) {
    this.publiceditability = publiceditability;
    return this;
  }

  /**
   * Get publiceditability
   * @return publiceditability
   */
  @javax.annotation.Nullable
  public PhotoEditability getPubliceditability() {
    return publiceditability;
  }

  public void setPubliceditability(PhotoEditability publiceditability) {
    this.publiceditability = publiceditability;
  }


  public Photo rotation(String rotation) {
    this.rotation = rotation;
    return this;
  }

  /**
   * Get rotation
   * @return rotation
   */
  @javax.annotation.Nullable
  public String getRotation() {
    return rotation;
  }

  public void setRotation(String rotation) {
    this.rotation = rotation;
  }


  public Photo safe(Boolean safe) {
    this.safe = safe;
    return this;
  }

  /**
   * Get safe
   * @return safe
   */
  @javax.annotation.Nullable
  public Boolean getSafe() {
    return safe;
  }

  public void setSafe(Boolean safe) {
    this.safe = safe;
  }


  public Photo safetyLevel(String safetyLevel) {
    this.safetyLevel = safetyLevel;
    return this;
  }

  /**
   * Get safetyLevel
   * @return safetyLevel
   */
  @javax.annotation.Nullable
  public String getSafetyLevel() {
    return safetyLevel;
  }

  public void setSafetyLevel(String safetyLevel) {
    this.safetyLevel = safetyLevel;
  }


  public Photo secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
   */
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Photo server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Get server
   * @return server
   */
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public Photo tags(PhotoTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public PhotoTags getTags() {
    return tags;
  }

  public void setTags(PhotoTags tags) {
    this.tags = tags;
  }


  public Photo title(GetFavoritesContextByID200ResponseCount title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getTitle() {
    return title;
  }

  public void setTitle(GetFavoritesContextByID200ResponseCount title) {
    this.title = title;
  }


  public Photo urls(PhotoUrls urls) {
    this.urls = urls;
    return this;
  }

  /**
   * Get urls
   * @return urls
   */
  @javax.annotation.Nullable
  public PhotoUrls getUrls() {
    return urls;
  }

  public void setUrls(PhotoUrls urls) {
    this.urls = urls;
  }


  public Photo usage(PhotoUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @javax.annotation.Nullable
  public PhotoUsage getUsage() {
    return usage;
  }

  public void setUsage(PhotoUsage usage) {
    this.usage = usage;
  }


  public Photo views(String views) {
    this.views = views;
    return this;
  }

  /**
   * Get views
   * @return views
   */
  @javax.annotation.Nullable
  public String getViews() {
    return views;
  }

  public void setViews(String views) {
    this.views = views;
  }


  public Photo visibility(PhotoVisibility visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  @javax.annotation.Nullable
  public PhotoVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(PhotoVisibility visibility) {
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
    Photo photo = (Photo) o;
    return Objects.equals(this.comments, photo.comments) &&
        Objects.equals(this.dates, photo.dates) &&
        Objects.equals(this.dateuploaded, photo.dateuploaded) &&
        Objects.equals(this.description, photo.description) &&
        Objects.equals(this.editability, photo.editability) &&
        Objects.equals(this.farm, photo.farm) &&
        Objects.equals(this.id, photo.id) &&
        Objects.equals(this.isfavorite, photo.isfavorite) &&
        Objects.equals(this.license, photo.license) &&
        Objects.equals(this.media, photo.media) &&
        Objects.equals(this.notes, photo.notes) &&
        Objects.equals(this.originalsecret, photo.originalsecret) &&
        Objects.equals(this.owner, photo.owner) &&
        Objects.equals(this.people, photo.people) &&
        Objects.equals(this.permissions, photo.permissions) &&
        Objects.equals(this.publiceditability, photo.publiceditability) &&
        Objects.equals(this.rotation, photo.rotation) &&
        Objects.equals(this.safe, photo.safe) &&
        Objects.equals(this.safetyLevel, photo.safetyLevel) &&
        Objects.equals(this.secret, photo.secret) &&
        Objects.equals(this.server, photo.server) &&
        Objects.equals(this.tags, photo.tags) &&
        Objects.equals(this.title, photo.title) &&
        Objects.equals(this.urls, photo.urls) &&
        Objects.equals(this.usage, photo.usage) &&
        Objects.equals(this.views, photo.views) &&
        Objects.equals(this.visibility, photo.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, dates, dateuploaded, description, editability, farm, id, isfavorite, license, media, notes, originalsecret, owner, people, permissions, publiceditability, rotation, safe, safetyLevel, secret, server, tags, title, urls, usage, views, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Photo {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    dateuploaded: ").append(toIndentedString(dateuploaded)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editability: ").append(toIndentedString(editability)).append("\n");
    sb.append("    farm: ").append(toIndentedString(farm)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isfavorite: ").append(toIndentedString(isfavorite)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    originalsecret: ").append(toIndentedString(originalsecret)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    publiceditability: ").append(toIndentedString(publiceditability)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    safe: ").append(toIndentedString(safe)).append("\n");
    sb.append("    safetyLevel: ").append(toIndentedString(safetyLevel)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
    openapiFields.add("comments");
    openapiFields.add("dates");
    openapiFields.add("dateuploaded");
    openapiFields.add("description");
    openapiFields.add("editability");
    openapiFields.add("farm");
    openapiFields.add("id");
    openapiFields.add("isfavorite");
    openapiFields.add("license");
    openapiFields.add("media");
    openapiFields.add("notes");
    openapiFields.add("originalsecret");
    openapiFields.add("owner");
    openapiFields.add("people");
    openapiFields.add("permissions");
    openapiFields.add("publiceditability");
    openapiFields.add("rotation");
    openapiFields.add("safe");
    openapiFields.add("safety_level");
    openapiFields.add("secret");
    openapiFields.add("server");
    openapiFields.add("tags");
    openapiFields.add("title");
    openapiFields.add("urls");
    openapiFields.add("usage");
    openapiFields.add("views");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Photo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Photo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Photo is not found in the empty JSON string", Photo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Photo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Photo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `comments`
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("comments"));
      }
      // validate the optional field `dates`
      if (jsonObj.get("dates") != null && !jsonObj.get("dates").isJsonNull()) {
        PhotoDates.validateJsonElement(jsonObj.get("dates"));
      }
      if ((jsonObj.get("dateuploaded") != null && !jsonObj.get("dateuploaded").isJsonNull()) && !jsonObj.get("dateuploaded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateuploaded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateuploaded").toString()));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("description"));
      }
      // validate the optional field `editability`
      if (jsonObj.get("editability") != null && !jsonObj.get("editability").isJsonNull()) {
        PhotoEditability.validateJsonElement(jsonObj.get("editability"));
      }
      if ((jsonObj.get("farm") != null && !jsonObj.get("farm").isJsonNull()) && !jsonObj.get("farm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `farm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("farm").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) && !jsonObj.get("license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license").toString()));
      }
      if ((jsonObj.get("media") != null && !jsonObj.get("media").isJsonNull()) && !jsonObj.get("media").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media").toString()));
      }
      // validate the optional field `notes`
      if (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) {
        PhotoNotes.validateJsonElement(jsonObj.get("notes"));
      }
      if ((jsonObj.get("originalsecret") != null && !jsonObj.get("originalsecret").isJsonNull()) && !jsonObj.get("originalsecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalsecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalsecret").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        Owner.validateJsonElement(jsonObj.get("owner"));
      }
      // validate the optional field `people`
      if (jsonObj.get("people") != null && !jsonObj.get("people").isJsonNull()) {
        PhotoPeople.validateJsonElement(jsonObj.get("people"));
      }
      // validate the optional field `permissions`
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        PhotoPermissions.validateJsonElement(jsonObj.get("permissions"));
      }
      // validate the optional field `publiceditability`
      if (jsonObj.get("publiceditability") != null && !jsonObj.get("publiceditability").isJsonNull()) {
        PhotoEditability.validateJsonElement(jsonObj.get("publiceditability"));
      }
      if ((jsonObj.get("rotation") != null && !jsonObj.get("rotation").isJsonNull()) && !jsonObj.get("rotation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotation").toString()));
      }
      if ((jsonObj.get("safety_level") != null && !jsonObj.get("safety_level").isJsonNull()) && !jsonObj.get("safety_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safety_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safety_level").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        PhotoTags.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("title"));
      }
      // validate the optional field `urls`
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonNull()) {
        PhotoUrls.validateJsonElement(jsonObj.get("urls"));
      }
      // validate the optional field `usage`
      if (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) {
        PhotoUsage.validateJsonElement(jsonObj.get("usage"));
      }
      if ((jsonObj.get("views") != null && !jsonObj.get("views").isJsonNull()) && !jsonObj.get("views").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `views` to be a primitive type in the JSON string but got `%s`", jsonObj.get("views").toString()));
      }
      // validate the optional field `visibility`
      if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) {
        PhotoVisibility.validateJsonElement(jsonObj.get("visibility"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Photo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Photo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Photo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Photo.class));

       return (TypeAdapter<T>) new TypeAdapter<Photo>() {
           @Override
           public void write(JsonWriter out, Photo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Photo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Photo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Photo
   * @throws IOException if the JSON string is invalid with respect to Photo
   */
  public static Photo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Photo.class);
  }

  /**
   * Convert an instance of Photo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

