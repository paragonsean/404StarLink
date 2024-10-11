/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import org.openapitools.client.model.AvailableSimulcasts;
import org.openapitools.client.model.AvailableVersions;
import org.openapitools.client.model.AvailableWebcasts;
import org.openapitools.client.model.Versions;

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
 * VersionsMixin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VersionsMixin {
  public static final String SERIALIZED_NAME_AVAILABLE_SIMULCASTS = "available_simulcasts";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SIMULCASTS)
  private AvailableSimulcasts availableSimulcasts;

  public static final String SERIALIZED_NAME_AVAILABLE_VERSIONS = "available_versions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VERSIONS)
  private AvailableVersions availableVersions;

  public static final String SERIALIZED_NAME_AVAILABLE_WEBCASTS = "available_webcasts";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_WEBCASTS)
  private AvailableWebcasts availableWebcasts;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<Versions> versions = new ArrayList<>();

  public VersionsMixin() {
  }

  public VersionsMixin availableSimulcasts(AvailableSimulcasts availableSimulcasts) {
    this.availableSimulcasts = availableSimulcasts;
    return this;
  }

  /**
   * Get availableSimulcasts
   * @return availableSimulcasts
   */
  @javax.annotation.Nullable
  public AvailableSimulcasts getAvailableSimulcasts() {
    return availableSimulcasts;
  }

  public void setAvailableSimulcasts(AvailableSimulcasts availableSimulcasts) {
    this.availableSimulcasts = availableSimulcasts;
  }


  public VersionsMixin availableVersions(AvailableVersions availableVersions) {
    this.availableVersions = availableVersions;
    return this;
  }

  /**
   * Get availableVersions
   * @return availableVersions
   */
  @javax.annotation.Nullable
  public AvailableVersions getAvailableVersions() {
    return availableVersions;
  }

  public void setAvailableVersions(AvailableVersions availableVersions) {
    this.availableVersions = availableVersions;
  }


  public VersionsMixin availableWebcasts(AvailableWebcasts availableWebcasts) {
    this.availableWebcasts = availableWebcasts;
    return this;
  }

  /**
   * Get availableWebcasts
   * @return availableWebcasts
   */
  @javax.annotation.Nullable
  public AvailableWebcasts getAvailableWebcasts() {
    return availableWebcasts;
  }

  public void setAvailableWebcasts(AvailableWebcasts availableWebcasts) {
    this.availableWebcasts = availableWebcasts;
  }


  public VersionsMixin versions(List<Versions> versions) {
    this.versions = versions;
    return this;
  }

  public VersionsMixin addVersionsItem(Versions versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * Get versions
   * @return versions
   */
  @javax.annotation.Nullable
  public List<Versions> getVersions() {
    return versions;
  }

  public void setVersions(List<Versions> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionsMixin versionsMixin = (VersionsMixin) o;
    return Objects.equals(this.availableSimulcasts, versionsMixin.availableSimulcasts) &&
        Objects.equals(this.availableVersions, versionsMixin.availableVersions) &&
        Objects.equals(this.availableWebcasts, versionsMixin.availableWebcasts) &&
        Objects.equals(this.versions, versionsMixin.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableSimulcasts, availableVersions, availableWebcasts, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionsMixin {\n");
    sb.append("    availableSimulcasts: ").append(toIndentedString(availableSimulcasts)).append("\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
    sb.append("    availableWebcasts: ").append(toIndentedString(availableWebcasts)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("available_simulcasts");
    openapiFields.add("available_versions");
    openapiFields.add("available_webcasts");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionsMixin
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionsMixin.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionsMixin is not found in the empty JSON string", VersionsMixin.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionsMixin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionsMixin` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `available_simulcasts`
      if (jsonObj.get("available_simulcasts") != null && !jsonObj.get("available_simulcasts").isJsonNull()) {
        AvailableSimulcasts.validateJsonElement(jsonObj.get("available_simulcasts"));
      }
      // validate the optional field `available_versions`
      if (jsonObj.get("available_versions") != null && !jsonObj.get("available_versions").isJsonNull()) {
        AvailableVersions.validateJsonElement(jsonObj.get("available_versions"));
      }
      // validate the optional field `available_webcasts`
      if (jsonObj.get("available_webcasts") != null && !jsonObj.get("available_webcasts").isJsonNull()) {
        AvailableWebcasts.validateJsonElement(jsonObj.get("available_webcasts"));
      }
      if (jsonObj.get("versions") != null && !jsonObj.get("versions").isJsonNull()) {
        JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
        if (jsonArrayversions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("versions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
          }

          // validate the optional field `versions` (array)
          for (int i = 0; i < jsonArrayversions.size(); i++) {
            Versions.validateJsonElement(jsonArrayversions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionsMixin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionsMixin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionsMixin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionsMixin.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionsMixin>() {
           @Override
           public void write(JsonWriter out, VersionsMixin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionsMixin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionsMixin given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionsMixin
   * @throws IOException if the JSON string is invalid with respect to VersionsMixin
   */
  public static VersionsMixin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionsMixin.class);
  }

  /**
   * Convert an instance of VersionsMixin to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

