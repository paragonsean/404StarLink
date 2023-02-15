/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
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
import org.openapitools.client.model.CisBenchmark;
import org.openapitools.client.model.ComplianceVersion;

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
 * ComplianceNote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:59.945291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ComplianceNote {
  public static final String SERIALIZED_NAME_CIS_BENCHMARK = "cisBenchmark";
  @SerializedName(SERIALIZED_NAME_CIS_BENCHMARK)
  private CisBenchmark cisBenchmark;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RATIONALE = "rationale";
  @SerializedName(SERIALIZED_NAME_RATIONALE)
  private String rationale;

  public static final String SERIALIZED_NAME_REMEDIATION = "remediation";
  @SerializedName(SERIALIZED_NAME_REMEDIATION)
  private String remediation;

  public static final String SERIALIZED_NAME_SCAN_INSTRUCTIONS = "scanInstructions";
  @SerializedName(SERIALIZED_NAME_SCAN_INSTRUCTIONS)
  private byte[] scanInstructions;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private List<ComplianceVersion> version = new ArrayList<>();

  public ComplianceNote() {
  }

  public ComplianceNote cisBenchmark(CisBenchmark cisBenchmark) {
    this.cisBenchmark = cisBenchmark;
    return this;
  }

  /**
   * Get cisBenchmark
   * @return cisBenchmark
   */
  @javax.annotation.Nullable
  public CisBenchmark getCisBenchmark() {
    return cisBenchmark;
  }

  public void setCisBenchmark(CisBenchmark cisBenchmark) {
    this.cisBenchmark = cisBenchmark;
  }


  public ComplianceNote description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description about this compliance check.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ComplianceNote rationale(String rationale) {
    this.rationale = rationale;
    return this;
  }

  /**
   * A rationale for the existence of this compliance check.
   * @return rationale
   */
  @javax.annotation.Nullable
  public String getRationale() {
    return rationale;
  }

  public void setRationale(String rationale) {
    this.rationale = rationale;
  }


  public ComplianceNote remediation(String remediation) {
    this.remediation = remediation;
    return this;
  }

  /**
   * A description of remediation steps if the compliance check fails.
   * @return remediation
   */
  @javax.annotation.Nullable
  public String getRemediation() {
    return remediation;
  }

  public void setRemediation(String remediation) {
    this.remediation = remediation;
  }


  public ComplianceNote scanInstructions(byte[] scanInstructions) {
    this.scanInstructions = scanInstructions;
    return this;
  }

  /**
   * Serialized scan instructions with a predefined format.
   * @return scanInstructions
   */
  @javax.annotation.Nullable
  public byte[] getScanInstructions() {
    return scanInstructions;
  }

  public void setScanInstructions(byte[] scanInstructions) {
    this.scanInstructions = scanInstructions;
  }


  public ComplianceNote title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title that identifies this compliance check.
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public ComplianceNote version(List<ComplianceVersion> version) {
    this.version = version;
    return this;
  }

  public ComplianceNote addVersionItem(ComplianceVersion versionItem) {
    if (this.version == null) {
      this.version = new ArrayList<>();
    }
    this.version.add(versionItem);
    return this;
  }

  /**
   * The OS and config versions the benchmark applies to.
   * @return version
   */
  @javax.annotation.Nullable
  public List<ComplianceVersion> getVersion() {
    return version;
  }

  public void setVersion(List<ComplianceVersion> version) {
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
    ComplianceNote complianceNote = (ComplianceNote) o;
    return Objects.equals(this.cisBenchmark, complianceNote.cisBenchmark) &&
        Objects.equals(this.description, complianceNote.description) &&
        Objects.equals(this.rationale, complianceNote.rationale) &&
        Objects.equals(this.remediation, complianceNote.remediation) &&
        Arrays.equals(this.scanInstructions, complianceNote.scanInstructions) &&
        Objects.equals(this.title, complianceNote.title) &&
        Objects.equals(this.version, complianceNote.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cisBenchmark, description, rationale, remediation, Arrays.hashCode(scanInstructions), title, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceNote {\n");
    sb.append("    cisBenchmark: ").append(toIndentedString(cisBenchmark)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rationale: ").append(toIndentedString(rationale)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    scanInstructions: ").append(toIndentedString(scanInstructions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("cisBenchmark");
    openapiFields.add("description");
    openapiFields.add("rationale");
    openapiFields.add("remediation");
    openapiFields.add("scanInstructions");
    openapiFields.add("title");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ComplianceNote
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComplianceNote.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceNote is not found in the empty JSON string", ComplianceNote.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ComplianceNote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComplianceNote` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cisBenchmark`
      if (jsonObj.get("cisBenchmark") != null && !jsonObj.get("cisBenchmark").isJsonNull()) {
        CisBenchmark.validateJsonElement(jsonObj.get("cisBenchmark"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("rationale") != null && !jsonObj.get("rationale").isJsonNull()) && !jsonObj.get("rationale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rationale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rationale").toString()));
      }
      if ((jsonObj.get("remediation") != null && !jsonObj.get("remediation").isJsonNull()) && !jsonObj.get("remediation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remediation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remediation").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        JsonArray jsonArrayversion = jsonObj.getAsJsonArray("version");
        if (jsonArrayversion != null) {
          // ensure the json data is an array
          if (!jsonObj.get("version").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `version` to be an array in the JSON string but got `%s`", jsonObj.get("version").toString()));
          }

          // validate the optional field `version` (array)
          for (int i = 0; i < jsonArrayversion.size(); i++) {
            ComplianceVersion.validateJsonElement(jsonArrayversion.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceNote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceNote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceNote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceNote.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceNote>() {
           @Override
           public void write(JsonWriter out, ComplianceNote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceNote read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ComplianceNote given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ComplianceNote
   * @throws IOException if the JSON string is invalid with respect to ComplianceNote
   */
  public static ComplianceNote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceNote.class);
  }

  /**
   * Convert an instance of ComplianceNote to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

