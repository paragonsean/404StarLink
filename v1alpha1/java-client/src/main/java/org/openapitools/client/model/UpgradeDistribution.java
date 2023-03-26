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
 * The Upgrade Distribution represents metadata about the Upgrade for each operating system (CPE). Some distributions have additional metadata around updates, classifying them into various categories and severities.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpgradeDistribution {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public static final String SERIALIZED_NAME_CPE_URI = "cpeUri";
  @SerializedName(SERIALIZED_NAME_CPE_URI)
  private String cpeUri;

  public static final String SERIALIZED_NAME_CVE = "cve";
  @SerializedName(SERIALIZED_NAME_CVE)
  private List<String> cve = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public UpgradeDistribution() {
  }

  public UpgradeDistribution classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed.
   * @return classification
   */
  @javax.annotation.Nullable
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }


  public UpgradeDistribution cpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
   * @return cpeUri
   */
  @javax.annotation.Nullable
  public String getCpeUri() {
    return cpeUri;
  }

  public void setCpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
  }


  public UpgradeDistribution cve(List<String> cve) {
    this.cve = cve;
    return this;
  }

  public UpgradeDistribution addCveItem(String cveItem) {
    if (this.cve == null) {
      this.cve = new ArrayList<>();
    }
    this.cve.add(cveItem);
    return this;
  }

  /**
   * The cve that would be resolved by this upgrade.
   * @return cve
   */
  @javax.annotation.Nullable
  public List<String> getCve() {
    return cve;
  }

  public void setCve(List<String> cve) {
    this.cve = cve;
  }


  public UpgradeDistribution severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity as specified by the upstream operating system.
   * @return severity
   */
  @javax.annotation.Nullable
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDistribution upgradeDistribution = (UpgradeDistribution) o;
    return Objects.equals(this.classification, upgradeDistribution.classification) &&
        Objects.equals(this.cpeUri, upgradeDistribution.cpeUri) &&
        Objects.equals(this.cve, upgradeDistribution.cve) &&
        Objects.equals(this.severity, upgradeDistribution.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, cpeUri, cve, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDistribution {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    cpeUri: ").append(toIndentedString(cpeUri)).append("\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
    openapiFields.add("classification");
    openapiFields.add("cpeUri");
    openapiFields.add("cve");
    openapiFields.add("severity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpgradeDistribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpgradeDistribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpgradeDistribution is not found in the empty JSON string", UpgradeDistribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpgradeDistribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpgradeDistribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) && !jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      if ((jsonObj.get("cpeUri") != null && !jsonObj.get("cpeUri").isJsonNull()) && !jsonObj.get("cpeUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpeUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpeUri").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cve") != null && !jsonObj.get("cve").isJsonNull() && !jsonObj.get("cve").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cve` to be an array in the JSON string but got `%s`", jsonObj.get("cve").toString()));
      }
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpgradeDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpgradeDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpgradeDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpgradeDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<UpgradeDistribution>() {
           @Override
           public void write(JsonWriter out, UpgradeDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpgradeDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpgradeDistribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpgradeDistribution
   * @throws IOException if the JSON string is invalid with respect to UpgradeDistribution
   */
  public static UpgradeDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpgradeDistribution.class);
  }

  /**
   * Convert an instance of UpgradeDistribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

