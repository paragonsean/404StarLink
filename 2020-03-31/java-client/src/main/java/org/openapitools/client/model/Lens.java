/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
 * Contact: mike.ralphson@gmail.com
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
import java.util.Map;

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
 * A lens return object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Lens {
  public static final String SERIALIZED_NAME_LENS_ARN = "LensArn";
  @SerializedName(SERIALIZED_NAME_LENS_ARN)
  private String lensArn;

  public static final String SERIALIZED_NAME_LENS_VERSION = "LensVersion";
  @SerializedName(SERIALIZED_NAME_LENS_VERSION)
  private String lensVersion;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_SHARE_INVITATION_ID = "ShareInvitationId";
  @SerializedName(SERIALIZED_NAME_SHARE_INVITATION_ID)
  private String shareInvitationId;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map tags;

  public Lens() {
  }

  public Lens lensArn(String lensArn) {
    this.lensArn = lensArn;
    return this;
  }

  /**
   * Get lensArn
   * @return lensArn
   */
  @javax.annotation.Nullable
  public String getLensArn() {
    return lensArn;
  }

  public void setLensArn(String lensArn) {
    this.lensArn = lensArn;
  }


  public Lens lensVersion(String lensVersion) {
    this.lensVersion = lensVersion;
    return this;
  }

  /**
   * Get lensVersion
   * @return lensVersion
   */
  @javax.annotation.Nullable
  public String getLensVersion() {
    return lensVersion;
  }

  public void setLensVersion(String lensVersion) {
    this.lensVersion = lensVersion;
  }


  public Lens name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of the lens.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Lens description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the lens.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Lens owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public Lens shareInvitationId(String shareInvitationId) {
    this.shareInvitationId = shareInvitationId;
    return this;
  }

  /**
   * Get shareInvitationId
   * @return shareInvitationId
   */
  @javax.annotation.Nullable
  public String getShareInvitationId() {
    return shareInvitationId;
  }

  public void setShareInvitationId(String shareInvitationId) {
    this.shareInvitationId = shareInvitationId;
  }


  public Lens tags(Map tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public Map getTags() {
    return tags;
  }

  public void setTags(Map tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lens lens = (Lens) o;
    return Objects.equals(this.lensArn, lens.lensArn) &&
        Objects.equals(this.lensVersion, lens.lensVersion) &&
        Objects.equals(this.name, lens.name) &&
        Objects.equals(this.description, lens.description) &&
        Objects.equals(this.owner, lens.owner) &&
        Objects.equals(this.shareInvitationId, lens.shareInvitationId) &&
        Objects.equals(this.tags, lens.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lensArn, lensVersion, name, description, owner, shareInvitationId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lens {\n");
    sb.append("    lensArn: ").append(toIndentedString(lensArn)).append("\n");
    sb.append("    lensVersion: ").append(toIndentedString(lensVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    shareInvitationId: ").append(toIndentedString(shareInvitationId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("LensArn");
    openapiFields.add("LensVersion");
    openapiFields.add("Name");
    openapiFields.add("Description");
    openapiFields.add("Owner");
    openapiFields.add("ShareInvitationId");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Lens
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Lens.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Lens is not found in the empty JSON string", Lens.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Lens.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Lens` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LensArn`
      if (jsonObj.get("LensArn") != null && !jsonObj.get("LensArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LensArn"));
      }
      // validate the optional field `LensVersion`
      if (jsonObj.get("LensVersion") != null && !jsonObj.get("LensVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LensVersion"));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      // validate the optional field `Owner`
      if (jsonObj.get("Owner") != null && !jsonObj.get("Owner").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Owner"));
      }
      // validate the optional field `ShareInvitationId`
      if (jsonObj.get("ShareInvitationId") != null && !jsonObj.get("ShareInvitationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ShareInvitationId"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Lens.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Lens' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Lens> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Lens.class));

       return (TypeAdapter<T>) new TypeAdapter<Lens>() {
           @Override
           public void write(JsonWriter out, Lens value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Lens read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Lens given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Lens
   * @throws IOException if the JSON string is invalid with respect to Lens
   */
  public static Lens fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Lens.class);
  }

  /**
   * Convert an instance of Lens to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

