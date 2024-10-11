/*
 * Drive Labels API
 * An API for managing Drive Labels
 *
 * The version of the OpenAPI document: v2
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
 * The capabilities of a user.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:59.934987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleAppsDriveLabelsV2UserCapabilities {
  public static final String SERIALIZED_NAME_CAN_ACCESS_LABEL_MANAGER = "canAccessLabelManager";
  @SerializedName(SERIALIZED_NAME_CAN_ACCESS_LABEL_MANAGER)
  private Boolean canAccessLabelManager;

  public static final String SERIALIZED_NAME_CAN_ADMINISTRATE_LABELS = "canAdministrateLabels";
  @SerializedName(SERIALIZED_NAME_CAN_ADMINISTRATE_LABELS)
  private Boolean canAdministrateLabels;

  public static final String SERIALIZED_NAME_CAN_CREATE_ADMIN_LABELS = "canCreateAdminLabels";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_ADMIN_LABELS)
  private Boolean canCreateAdminLabels;

  public static final String SERIALIZED_NAME_CAN_CREATE_SHARED_LABELS = "canCreateSharedLabels";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_SHARED_LABELS)
  private Boolean canCreateSharedLabels;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public GoogleAppsDriveLabelsV2UserCapabilities() {
  }

  public GoogleAppsDriveLabelsV2UserCapabilities(
     Boolean canAccessLabelManager, 
     Boolean canAdministrateLabels, 
     Boolean canCreateAdminLabels, 
     Boolean canCreateSharedLabels, 
     String name
  ) {
    this();
    this.canAccessLabelManager = canAccessLabelManager;
    this.canAdministrateLabels = canAdministrateLabels;
    this.canCreateAdminLabels = canCreateAdminLabels;
    this.canCreateSharedLabels = canCreateSharedLabels;
    this.name = name;
  }

  /**
   * Output only. Whether the user is allowed access to the label manager.
   * @return canAccessLabelManager
   */
  @javax.annotation.Nullable
  public Boolean getCanAccessLabelManager() {
    return canAccessLabelManager;
  }



  /**
   * Output only. Whether the user is an administrator for the shared labels feature.
   * @return canAdministrateLabels
   */
  @javax.annotation.Nullable
  public Boolean getCanAdministrateLabels() {
    return canAdministrateLabels;
  }



  /**
   * Output only. Whether the user is allowed to create new admin labels.
   * @return canCreateAdminLabels
   */
  @javax.annotation.Nullable
  public Boolean getCanCreateAdminLabels() {
    return canCreateAdminLabels;
  }



  /**
   * Output only. Whether the user is allowed to create new shared labels.
   * @return canCreateSharedLabels
   */
  @javax.annotation.Nullable
  public Boolean getCanCreateSharedLabels() {
    return canCreateSharedLabels;
  }



  /**
   * Output only. Resource name for the user capabilities.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAppsDriveLabelsV2UserCapabilities googleAppsDriveLabelsV2UserCapabilities = (GoogleAppsDriveLabelsV2UserCapabilities) o;
    return Objects.equals(this.canAccessLabelManager, googleAppsDriveLabelsV2UserCapabilities.canAccessLabelManager) &&
        Objects.equals(this.canAdministrateLabels, googleAppsDriveLabelsV2UserCapabilities.canAdministrateLabels) &&
        Objects.equals(this.canCreateAdminLabels, googleAppsDriveLabelsV2UserCapabilities.canCreateAdminLabels) &&
        Objects.equals(this.canCreateSharedLabels, googleAppsDriveLabelsV2UserCapabilities.canCreateSharedLabels) &&
        Objects.equals(this.name, googleAppsDriveLabelsV2UserCapabilities.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAccessLabelManager, canAdministrateLabels, canCreateAdminLabels, canCreateSharedLabels, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAppsDriveLabelsV2UserCapabilities {\n");
    sb.append("    canAccessLabelManager: ").append(toIndentedString(canAccessLabelManager)).append("\n");
    sb.append("    canAdministrateLabels: ").append(toIndentedString(canAdministrateLabels)).append("\n");
    sb.append("    canCreateAdminLabels: ").append(toIndentedString(canCreateAdminLabels)).append("\n");
    sb.append("    canCreateSharedLabels: ").append(toIndentedString(canCreateSharedLabels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("canAccessLabelManager");
    openapiFields.add("canAdministrateLabels");
    openapiFields.add("canCreateAdminLabels");
    openapiFields.add("canCreateSharedLabels");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleAppsDriveLabelsV2UserCapabilities
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleAppsDriveLabelsV2UserCapabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleAppsDriveLabelsV2UserCapabilities is not found in the empty JSON string", GoogleAppsDriveLabelsV2UserCapabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleAppsDriveLabelsV2UserCapabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleAppsDriveLabelsV2UserCapabilities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleAppsDriveLabelsV2UserCapabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleAppsDriveLabelsV2UserCapabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleAppsDriveLabelsV2UserCapabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleAppsDriveLabelsV2UserCapabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleAppsDriveLabelsV2UserCapabilities>() {
           @Override
           public void write(JsonWriter out, GoogleAppsDriveLabelsV2UserCapabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleAppsDriveLabelsV2UserCapabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleAppsDriveLabelsV2UserCapabilities given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleAppsDriveLabelsV2UserCapabilities
   * @throws IOException if the JSON string is invalid with respect to GoogleAppsDriveLabelsV2UserCapabilities
   */
  public static GoogleAppsDriveLabelsV2UserCapabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleAppsDriveLabelsV2UserCapabilities.class);
  }

  /**
   * Convert an instance of GoogleAppsDriveLabelsV2UserCapabilities to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

