/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1alpha1
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
import org.openapitools.client.model.Version;

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
 * This represents a particular channel of distribution for a given package. e.g. Debian&#39;s jessie-backports dpkg mirror
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Distribution {
  /**
   * The CPU architecture for which packages in this distribution channel were built
   */
  @JsonAdapter(ArchitectureEnum.Adapter.class)
  public enum ArchitectureEnum {
    ARCHITECTURE_UNSPECIFIED("ARCHITECTURE_UNSPECIFIED"),
    
    X86("X86"),
    
    X64("X64");

    private String value;

    ArchitectureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArchitectureEnum fromValue(String value) {
      for (ArchitectureEnum b : ArchitectureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArchitectureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArchitectureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArchitectureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArchitectureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ArchitectureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private ArchitectureEnum architecture;

  public static final String SERIALIZED_NAME_CPE_URI = "cpeUri";
  @SerializedName(SERIALIZED_NAME_CPE_URI)
  private String cpeUri;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LATEST_VERSION = "latestVersion";
  @SerializedName(SERIALIZED_NAME_LATEST_VERSION)
  private Version latestVersion;

  public static final String SERIALIZED_NAME_MAINTAINER = "maintainer";
  @SerializedName(SERIALIZED_NAME_MAINTAINER)
  private String maintainer;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public Distribution() {
  }

  public Distribution architecture(ArchitectureEnum architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * The CPU architecture for which packages in this distribution channel were built
   * @return architecture
   */
  @javax.annotation.Nullable
  public ArchitectureEnum getArchitecture() {
    return architecture;
  }

  public void setArchitecture(ArchitectureEnum architecture) {
    this.architecture = architecture;
  }


  public Distribution cpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
   * @return cpeUri
   */
  @javax.annotation.Nullable
  public String getCpeUri() {
    return cpeUri;
  }

  public void setCpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
  }


  public Distribution description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The distribution channel-specific description of this package.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Distribution latestVersion(Version latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  /**
   * Get latestVersion
   * @return latestVersion
   */
  @javax.annotation.Nullable
  public Version getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(Version latestVersion) {
    this.latestVersion = latestVersion;
  }


  public Distribution maintainer(String maintainer) {
    this.maintainer = maintainer;
    return this;
  }

  /**
   * A freeform string denoting the maintainer of this package.
   * @return maintainer
   */
  @javax.annotation.Nullable
  public String getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }


  public Distribution url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The distribution channel-specific homepage for this package.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.architecture, distribution.architecture) &&
        Objects.equals(this.cpeUri, distribution.cpeUri) &&
        Objects.equals(this.description, distribution.description) &&
        Objects.equals(this.latestVersion, distribution.latestVersion) &&
        Objects.equals(this.maintainer, distribution.maintainer) &&
        Objects.equals(this.url, distribution.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, cpeUri, description, latestVersion, maintainer, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    cpeUri: ").append(toIndentedString(cpeUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("architecture");
    openapiFields.add("cpeUri");
    openapiFields.add("description");
    openapiFields.add("latestVersion");
    openapiFields.add("maintainer");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Distribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Distribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Distribution is not found in the empty JSON string", Distribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Distribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Distribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("architecture") != null && !jsonObj.get("architecture").isJsonNull()) && !jsonObj.get("architecture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `architecture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("architecture").toString()));
      }
      // validate the optional field `architecture`
      if (jsonObj.get("architecture") != null && !jsonObj.get("architecture").isJsonNull()) {
        ArchitectureEnum.validateJsonElement(jsonObj.get("architecture"));
      }
      if ((jsonObj.get("cpeUri") != null && !jsonObj.get("cpeUri").isJsonNull()) && !jsonObj.get("cpeUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpeUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpeUri").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `latestVersion`
      if (jsonObj.get("latestVersion") != null && !jsonObj.get("latestVersion").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("latestVersion"));
      }
      if ((jsonObj.get("maintainer") != null && !jsonObj.get("maintainer").isJsonNull()) && !jsonObj.get("maintainer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maintainer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maintainer").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Distribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Distribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Distribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Distribution.class));

       return (TypeAdapter<T>) new TypeAdapter<Distribution>() {
           @Override
           public void write(JsonWriter out, Distribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Distribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Distribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Distribution
   * @throws IOException if the JSON string is invalid with respect to Distribution
   */
  public static Distribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Distribution.class);
  }

  /**
   * Convert an instance of Distribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

