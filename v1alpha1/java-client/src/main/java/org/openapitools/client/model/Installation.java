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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.License;
import org.openapitools.client.model.Location;
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
 * This represents how a particular software package may be installed on a system.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Installation {
  /**
   * Output only. The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
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

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private License license;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private List<Location> location = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "packageType";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public Installation() {
  }

  public Installation(
     ArchitectureEnum architecture, 
     String cpeUri, 
     String name, 
     String packageType
  ) {
    this();
    this.architecture = architecture;
    this.cpeUri = cpeUri;
    this.name = name;
    this.packageType = packageType;
  }

  /**
   * Output only. The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
   * @return architecture
   */
  @javax.annotation.Nullable
  public ArchitectureEnum getArchitecture() {
    return architecture;
  }



  /**
   * Output only. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
   * @return cpeUri
   */
  @javax.annotation.Nullable
  public String getCpeUri() {
    return cpeUri;
  }



  public Installation license(License license) {
    this.license = license;
    return this;
  }

  /**
   * Get license
   * @return license
   */
  @javax.annotation.Nullable
  public License getLicense() {
    return license;
  }

  public void setLicense(License license) {
    this.license = license;
  }


  public Installation location(List<Location> location) {
    this.location = location;
    return this;
  }

  public Installation addLocationItem(Location locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<>();
    }
    this.location.add(locationItem);
    return this;
  }

  /**
   * All of the places within the filesystem versions of this package have been found.
   * @return location
   */
  @javax.annotation.Nullable
  public List<Location> getLocation() {
    return location;
  }

  public void setLocation(List<Location> location) {
    this.location = location;
  }


  /**
   * Output only. The name of the installed package.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  /**
   * Output only. The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
   * @return packageType
   */
  @javax.annotation.Nullable
  public String getPackageType() {
    return packageType;
  }



  public Installation version(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installation installation = (Installation) o;
    return Objects.equals(this.architecture, installation.architecture) &&
        Objects.equals(this.cpeUri, installation.cpeUri) &&
        Objects.equals(this.license, installation.license) &&
        Objects.equals(this.location, installation.location) &&
        Objects.equals(this.name, installation.name) &&
        Objects.equals(this.packageType, installation.packageType) &&
        Objects.equals(this.version, installation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, cpeUri, license, location, name, packageType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installation {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    cpeUri: ").append(toIndentedString(cpeUri)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("license");
    openapiFields.add("location");
    openapiFields.add("name");
    openapiFields.add("packageType");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Installation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Installation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Installation is not found in the empty JSON string", Installation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Installation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Installation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `license`
      if (jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) {
        License.validateJsonElement(jsonObj.get("license"));
      }
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        JsonArray jsonArraylocation = jsonObj.getAsJsonArray("location");
        if (jsonArraylocation != null) {
          // ensure the json data is an array
          if (!jsonObj.get("location").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `location` to be an array in the JSON string but got `%s`", jsonObj.get("location").toString()));
          }

          // validate the optional field `location` (array)
          for (int i = 0; i < jsonArraylocation.size(); i++) {
            Location.validateJsonElement(jsonArraylocation.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("packageType") != null && !jsonObj.get("packageType").isJsonNull()) && !jsonObj.get("packageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageType").toString()));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("version"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Installation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Installation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Installation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Installation.class));

       return (TypeAdapter<T>) new TypeAdapter<Installation>() {
           @Override
           public void write(JsonWriter out, Installation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Installation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Installation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Installation
   * @throws IOException if the JSON string is invalid with respect to Installation
   */
  public static Installation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Installation.class);
  }

  /**
   * Convert an instance of Installation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

