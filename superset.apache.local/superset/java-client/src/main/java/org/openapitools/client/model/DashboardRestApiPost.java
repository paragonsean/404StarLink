/*
 * Superset
 * Superset
 *
 * The version of the OpenAPI document: v1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DashboardRestApiPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DashboardRestApiPost {
  public static final String SERIALIZED_NAME_CSS = "css";
  @SerializedName(SERIALIZED_NAME_CSS)
  private String css;

  public static final String SERIALIZED_NAME_DASHBOARD_TITLE = "dashboard_title";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_TITLE)
  private String dashboardTitle;

  public static final String SERIALIZED_NAME_JSON_METADATA = "json_metadata";
  @SerializedName(SERIALIZED_NAME_JSON_METADATA)
  private String jsonMetadata;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Integer> owners = new ArrayList<>();

  public static final String SERIALIZED_NAME_POSITION_JSON = "position_json";
  @SerializedName(SERIALIZED_NAME_POSITION_JSON)
  private String positionJson;

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Integer> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public DashboardRestApiPost() {
  }

  public DashboardRestApiPost css(String css) {
    this.css = css;
    return this;
  }

  /**
   * Get css
   * @return css
   */
  @javax.annotation.Nullable
  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }


  public DashboardRestApiPost dashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
    return this;
  }

  /**
   * A title for the dashboard.
   * @return dashboardTitle
   */
  @javax.annotation.Nullable
  public String getDashboardTitle() {
    return dashboardTitle;
  }

  public void setDashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
  }


  public DashboardRestApiPost jsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
    return this;
  }

  /**
   * This JSON object is generated dynamically when clicking the save or overwrite button in the dashboard view. It is exposed here for reference and for power users who may want to alter  specific parameters.
   * @return jsonMetadata
   */
  @javax.annotation.Nullable
  public String getJsonMetadata() {
    return jsonMetadata;
  }

  public void setJsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
  }


  public DashboardRestApiPost owners(List<Integer> owners) {
    this.owners = owners;
    return this;
  }

  public DashboardRestApiPost addOwnersItem(Integer ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

  /**
   * Get owners
   * @return owners
   */
  @javax.annotation.Nullable
  public List<Integer> getOwners() {
    return owners;
  }

  public void setOwners(List<Integer> owners) {
    this.owners = owners;
  }


  public DashboardRestApiPost positionJson(String positionJson) {
    this.positionJson = positionJson;
    return this;
  }

  /**
   * This json object describes the positioning of the widgets in the dashboard. It is dynamically generated when adjusting the widgets size and positions by using drag &amp; drop in the dashboard view
   * @return positionJson
   */
  @javax.annotation.Nullable
  public String getPositionJson() {
    return positionJson;
  }

  public void setPositionJson(String positionJson) {
    this.positionJson = positionJson;
  }


  public DashboardRestApiPost published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Determines whether or not this dashboard is visible in the list of all dashboards.
   * @return published
   */
  @javax.annotation.Nullable
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }


  public DashboardRestApiPost roles(List<Integer> roles) {
    this.roles = roles;
    return this;
  }

  public DashboardRestApiPost addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public List<Integer> getRoles() {
    return roles;
  }

  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }


  public DashboardRestApiPost slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Unique identifying part for the web address of the dashboard.
   * @return slug
   */
  @javax.annotation.Nullable
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardRestApiPost dashboardRestApiPost = (DashboardRestApiPost) o;
    return Objects.equals(this.css, dashboardRestApiPost.css) &&
        Objects.equals(this.dashboardTitle, dashboardRestApiPost.dashboardTitle) &&
        Objects.equals(this.jsonMetadata, dashboardRestApiPost.jsonMetadata) &&
        Objects.equals(this.owners, dashboardRestApiPost.owners) &&
        Objects.equals(this.positionJson, dashboardRestApiPost.positionJson) &&
        Objects.equals(this.published, dashboardRestApiPost.published) &&
        Objects.equals(this.roles, dashboardRestApiPost.roles) &&
        Objects.equals(this.slug, dashboardRestApiPost.slug);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(css, dashboardTitle, jsonMetadata, owners, positionJson, published, roles, slug);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardRestApiPost {\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
    sb.append("    jsonMetadata: ").append(toIndentedString(jsonMetadata)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    positionJson: ").append(toIndentedString(positionJson)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
    openapiFields.add("css");
    openapiFields.add("dashboard_title");
    openapiFields.add("json_metadata");
    openapiFields.add("owners");
    openapiFields.add("position_json");
    openapiFields.add("published");
    openapiFields.add("roles");
    openapiFields.add("slug");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DashboardRestApiPost
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DashboardRestApiPost.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DashboardRestApiPost is not found in the empty JSON string", DashboardRestApiPost.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DashboardRestApiPost.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DashboardRestApiPost` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("css") != null && !jsonObj.get("css").isJsonNull()) && !jsonObj.get("css").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `css` to be a primitive type in the JSON string but got `%s`", jsonObj.get("css").toString()));
      }
      if ((jsonObj.get("dashboard_title") != null && !jsonObj.get("dashboard_title").isJsonNull()) && !jsonObj.get("dashboard_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard_title").toString()));
      }
      if ((jsonObj.get("json_metadata") != null && !jsonObj.get("json_metadata").isJsonNull()) && !jsonObj.get("json_metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `json_metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("json_metadata").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("owners") != null && !jsonObj.get("owners").isJsonNull() && !jsonObj.get("owners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owners` to be an array in the JSON string but got `%s`", jsonObj.get("owners").toString()));
      }
      if ((jsonObj.get("position_json") != null && !jsonObj.get("position_json").isJsonNull()) && !jsonObj.get("position_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_json").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull() && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DashboardRestApiPost.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DashboardRestApiPost' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DashboardRestApiPost> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DashboardRestApiPost.class));

       return (TypeAdapter<T>) new TypeAdapter<DashboardRestApiPost>() {
           @Override
           public void write(JsonWriter out, DashboardRestApiPost value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DashboardRestApiPost read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DashboardRestApiPost given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DashboardRestApiPost
   * @throws IOException if the JSON string is invalid with respect to DashboardRestApiPost
   */
  public static DashboardRestApiPost fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DashboardRestApiPost.class);
  }

  /**
   * Convert an instance of DashboardRestApiPost to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

