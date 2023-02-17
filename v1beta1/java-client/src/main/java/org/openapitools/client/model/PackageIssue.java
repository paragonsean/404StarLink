/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
import org.openapitools.client.model.VulnerabilityLocation;

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
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:08.153528-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PackageIssue {
  public static final String SERIALIZED_NAME_AFFECTED_LOCATION = "affectedLocation";
  @SerializedName(SERIALIZED_NAME_AFFECTED_LOCATION)
  private VulnerabilityLocation affectedLocation;

  /**
   * Output only. The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
   */
  @JsonAdapter(EffectiveSeverityEnum.Adapter.class)
  public enum EffectiveSeverityEnum {
    SEVERITY_UNSPECIFIED("SEVERITY_UNSPECIFIED"),
    
    MINIMAL("MINIMAL"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    EffectiveSeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectiveSeverityEnum fromValue(String value) {
      for (EffectiveSeverityEnum b : EffectiveSeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EffectiveSeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectiveSeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectiveSeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffectiveSeverityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EffectiveSeverityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EFFECTIVE_SEVERITY = "effectiveSeverity";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_SEVERITY)
  private EffectiveSeverityEnum effectiveSeverity;

  public static final String SERIALIZED_NAME_FIXED_LOCATION = "fixedLocation";
  @SerializedName(SERIALIZED_NAME_FIXED_LOCATION)
  private VulnerabilityLocation fixedLocation;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "packageType";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public static final String SERIALIZED_NAME_SEVERITY_NAME = "severityName";
  @SerializedName(SERIALIZED_NAME_SEVERITY_NAME)
  private String severityName;

  public PackageIssue() {
  }

  public PackageIssue(
     EffectiveSeverityEnum effectiveSeverity
  ) {
    this();
    this.effectiveSeverity = effectiveSeverity;
  }

  public PackageIssue affectedLocation(VulnerabilityLocation affectedLocation) {
    this.affectedLocation = affectedLocation;
    return this;
  }

  /**
   * Get affectedLocation
   * @return affectedLocation
   */
  @javax.annotation.Nullable
  public VulnerabilityLocation getAffectedLocation() {
    return affectedLocation;
  }

  public void setAffectedLocation(VulnerabilityLocation affectedLocation) {
    this.affectedLocation = affectedLocation;
  }


  /**
   * Output only. The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
   * @return effectiveSeverity
   */
  @javax.annotation.Nullable
  public EffectiveSeverityEnum getEffectiveSeverity() {
    return effectiveSeverity;
  }



  public PackageIssue fixedLocation(VulnerabilityLocation fixedLocation) {
    this.fixedLocation = fixedLocation;
    return this;
  }

  /**
   * Get fixedLocation
   * @return fixedLocation
   */
  @javax.annotation.Nullable
  public VulnerabilityLocation getFixedLocation() {
    return fixedLocation;
  }

  public void setFixedLocation(VulnerabilityLocation fixedLocation) {
    this.fixedLocation = fixedLocation;
  }


  public PackageIssue packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * The type of package (e.g. OS, MAVEN, GO).
   * @return packageType
   */
  @javax.annotation.Nullable
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }


  public PackageIssue severityName(String severityName) {
    this.severityName = severityName;
    return this;
  }

  /**
   * Deprecated, use Details.effective_severity instead The severity (e.g., distro assigned severity) for this vulnerability.
   * @return severityName
   */
  @javax.annotation.Nullable
  public String getSeverityName() {
    return severityName;
  }

  public void setSeverityName(String severityName) {
    this.severityName = severityName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageIssue packageIssue = (PackageIssue) o;
    return Objects.equals(this.affectedLocation, packageIssue.affectedLocation) &&
        Objects.equals(this.effectiveSeverity, packageIssue.effectiveSeverity) &&
        Objects.equals(this.fixedLocation, packageIssue.fixedLocation) &&
        Objects.equals(this.packageType, packageIssue.packageType) &&
        Objects.equals(this.severityName, packageIssue.severityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedLocation, effectiveSeverity, fixedLocation, packageType, severityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageIssue {\n");
    sb.append("    affectedLocation: ").append(toIndentedString(affectedLocation)).append("\n");
    sb.append("    effectiveSeverity: ").append(toIndentedString(effectiveSeverity)).append("\n");
    sb.append("    fixedLocation: ").append(toIndentedString(fixedLocation)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    severityName: ").append(toIndentedString(severityName)).append("\n");
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
    openapiFields.add("affectedLocation");
    openapiFields.add("effectiveSeverity");
    openapiFields.add("fixedLocation");
    openapiFields.add("packageType");
    openapiFields.add("severityName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PackageIssue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PackageIssue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackageIssue is not found in the empty JSON string", PackageIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PackageIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PackageIssue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `affectedLocation`
      if (jsonObj.get("affectedLocation") != null && !jsonObj.get("affectedLocation").isJsonNull()) {
        VulnerabilityLocation.validateJsonElement(jsonObj.get("affectedLocation"));
      }
      if ((jsonObj.get("effectiveSeverity") != null && !jsonObj.get("effectiveSeverity").isJsonNull()) && !jsonObj.get("effectiveSeverity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveSeverity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveSeverity").toString()));
      }
      // validate the optional field `effectiveSeverity`
      if (jsonObj.get("effectiveSeverity") != null && !jsonObj.get("effectiveSeverity").isJsonNull()) {
        EffectiveSeverityEnum.validateJsonElement(jsonObj.get("effectiveSeverity"));
      }
      // validate the optional field `fixedLocation`
      if (jsonObj.get("fixedLocation") != null && !jsonObj.get("fixedLocation").isJsonNull()) {
        VulnerabilityLocation.validateJsonElement(jsonObj.get("fixedLocation"));
      }
      if ((jsonObj.get("packageType") != null && !jsonObj.get("packageType").isJsonNull()) && !jsonObj.get("packageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageType").toString()));
      }
      if ((jsonObj.get("severityName") != null && !jsonObj.get("severityName").isJsonNull()) && !jsonObj.get("severityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severityName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackageIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackageIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackageIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackageIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<PackageIssue>() {
           @Override
           public void write(JsonWriter out, PackageIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackageIssue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PackageIssue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PackageIssue
   * @throws IOException if the JSON string is invalid with respect to PackageIssue
   */
  public static PackageIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackageIssue.class);
  }

  /**
   * Convert an instance of PackageIssue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

