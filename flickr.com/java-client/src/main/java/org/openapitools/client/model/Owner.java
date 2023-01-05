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
 * Owner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:54.658141-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Owner {
  public static final String SERIALIZED_NAME_ICONFARM = "iconfarm";
  @SerializedName(SERIALIZED_NAME_ICONFARM)
  private String iconfarm;

  public static final String SERIALIZED_NAME_ICONSERVER = "iconserver";
  @SerializedName(SERIALIZED_NAME_ICONSERVER)
  private String iconserver;

  public static final String SERIALIZED_NAME_IS_AD_FREE = "is_ad_free";
  @SerializedName(SERIALIZED_NAME_IS_AD_FREE)
  private Boolean isAdFree;

  public static final String SERIALIZED_NAME_ISPRO = "ispro";
  @SerializedName(SERIALIZED_NAME_ISPRO)
  private Boolean ispro;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NOINDEXFOLLOW = "noindexfollow";
  @SerializedName(SERIALIZED_NAME_NOINDEXFOLLOW)
  private Boolean noindexfollow;

  public static final String SERIALIZED_NAME_NSID = "nsid";
  @SerializedName(SERIALIZED_NAME_NSID)
  private String nsid;

  public static final String SERIALIZED_NAME_PATH_ALIAS = "path_alias";
  @SerializedName(SERIALIZED_NAME_PATH_ALIAS)
  private String pathAlias;

  public static final String SERIALIZED_NAME_REALNAME = "realname";
  @SerializedName(SERIALIZED_NAME_REALNAME)
  private String realname;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public Owner() {
  }

  public Owner iconfarm(String iconfarm) {
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


  public Owner iconserver(String iconserver) {
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


  public Owner isAdFree(Boolean isAdFree) {
    this.isAdFree = isAdFree;
    return this;
  }

  /**
   * Get isAdFree
   * @return isAdFree
   */
  @javax.annotation.Nullable
  public Boolean getIsAdFree() {
    return isAdFree;
  }

  public void setIsAdFree(Boolean isAdFree) {
    this.isAdFree = isAdFree;
  }


  public Owner ispro(Boolean ispro) {
    this.ispro = ispro;
    return this;
  }

  /**
   * Get ispro
   * @return ispro
   */
  @javax.annotation.Nullable
  public Boolean getIspro() {
    return ispro;
  }

  public void setIspro(Boolean ispro) {
    this.ispro = ispro;
  }


  public Owner location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public Owner noindexfollow(Boolean noindexfollow) {
    this.noindexfollow = noindexfollow;
    return this;
  }

  /**
   * Get noindexfollow
   * @return noindexfollow
   */
  @javax.annotation.Nullable
  public Boolean getNoindexfollow() {
    return noindexfollow;
  }

  public void setNoindexfollow(Boolean noindexfollow) {
    this.noindexfollow = noindexfollow;
  }


  public Owner nsid(String nsid) {
    this.nsid = nsid;
    return this;
  }

  /**
   * Get nsid
   * @return nsid
   */
  @javax.annotation.Nullable
  public String getNsid() {
    return nsid;
  }

  public void setNsid(String nsid) {
    this.nsid = nsid;
  }


  public Owner pathAlias(String pathAlias) {
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


  public Owner realname(String realname) {
    this.realname = realname;
    return this;
  }

  /**
   * Get realname
   * @return realname
   */
  @javax.annotation.Nullable
  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public Owner username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
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
    Owner owner = (Owner) o;
    return Objects.equals(this.iconfarm, owner.iconfarm) &&
        Objects.equals(this.iconserver, owner.iconserver) &&
        Objects.equals(this.isAdFree, owner.isAdFree) &&
        Objects.equals(this.ispro, owner.ispro) &&
        Objects.equals(this.location, owner.location) &&
        Objects.equals(this.noindexfollow, owner.noindexfollow) &&
        Objects.equals(this.nsid, owner.nsid) &&
        Objects.equals(this.pathAlias, owner.pathAlias) &&
        Objects.equals(this.realname, owner.realname) &&
        Objects.equals(this.username, owner.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconfarm, iconserver, isAdFree, ispro, location, noindexfollow, nsid, pathAlias, realname, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Owner {\n");
    sb.append("    iconfarm: ").append(toIndentedString(iconfarm)).append("\n");
    sb.append("    iconserver: ").append(toIndentedString(iconserver)).append("\n");
    sb.append("    isAdFree: ").append(toIndentedString(isAdFree)).append("\n");
    sb.append("    ispro: ").append(toIndentedString(ispro)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    noindexfollow: ").append(toIndentedString(noindexfollow)).append("\n");
    sb.append("    nsid: ").append(toIndentedString(nsid)).append("\n");
    sb.append("    pathAlias: ").append(toIndentedString(pathAlias)).append("\n");
    sb.append("    realname: ").append(toIndentedString(realname)).append("\n");
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
    openapiFields.add("iconfarm");
    openapiFields.add("iconserver");
    openapiFields.add("is_ad_free");
    openapiFields.add("ispro");
    openapiFields.add("location");
    openapiFields.add("noindexfollow");
    openapiFields.add("nsid");
    openapiFields.add("path_alias");
    openapiFields.add("realname");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Owner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Owner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Owner is not found in the empty JSON string", Owner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Owner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Owner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("iconfarm") != null && !jsonObj.get("iconfarm").isJsonNull()) && !jsonObj.get("iconfarm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconfarm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconfarm").toString()));
      }
      if ((jsonObj.get("iconserver") != null && !jsonObj.get("iconserver").isJsonNull()) && !jsonObj.get("iconserver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconserver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconserver").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("nsid") != null && !jsonObj.get("nsid").isJsonNull()) && !jsonObj.get("nsid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nsid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nsid").toString()));
      }
      if ((jsonObj.get("path_alias") != null && !jsonObj.get("path_alias").isJsonNull()) && !jsonObj.get("path_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path_alias").toString()));
      }
      if ((jsonObj.get("realname") != null && !jsonObj.get("realname").isJsonNull()) && !jsonObj.get("realname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realname").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Owner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Owner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Owner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Owner.class));

       return (TypeAdapter<T>) new TypeAdapter<Owner>() {
           @Override
           public void write(JsonWriter out, Owner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Owner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Owner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Owner
   * @throws IOException if the JSON string is invalid with respect to Owner
   */
  public static Owner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Owner.class);
  }

  /**
   * Convert an instance of Owner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

