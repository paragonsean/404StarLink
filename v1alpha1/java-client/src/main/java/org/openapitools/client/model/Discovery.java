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
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider&#39;s project. A &#x60;Discovery&#x60; occurrence is created in a consumer&#39;s project at the start of analysis. The occurrence&#39;s operation will indicate the status of the analysis. Absence of an occurrence linked to this note for a resource indicates that analysis hasn&#39;t started.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Discovery {
  /**
   * The kind of analysis that is handled by this discovery.
   */
  @JsonAdapter(AnalysisKindEnum.Adapter.class)
  public enum AnalysisKindEnum {
    KIND_UNSPECIFIED("KIND_UNSPECIFIED"),
    
    PACKAGE_VULNERABILITY("PACKAGE_VULNERABILITY"),
    
    BUILD_DETAILS("BUILD_DETAILS"),
    
    IMAGE_BASIS("IMAGE_BASIS"),
    
    PACKAGE_MANAGER("PACKAGE_MANAGER"),
    
    DEPLOYABLE("DEPLOYABLE"),
    
    DISCOVERY("DISCOVERY"),
    
    ATTESTATION_AUTHORITY("ATTESTATION_AUTHORITY"),
    
    UPGRADE("UPGRADE"),
    
    COMPLIANCE("COMPLIANCE"),
    
    SBOM("SBOM"),
    
    SPDX_PACKAGE("SPDX_PACKAGE"),
    
    SPDX_FILE("SPDX_FILE"),
    
    SPDX_RELATIONSHIP("SPDX_RELATIONSHIP"),
    
    DSSE_ATTESTATION("DSSE_ATTESTATION"),
    
    VULNERABILITY_ASSESSMENT("VULNERABILITY_ASSESSMENT"),
    
    SBOM_REFERENCE("SBOM_REFERENCE");

    private String value;

    AnalysisKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnalysisKindEnum fromValue(String value) {
      for (AnalysisKindEnum b : AnalysisKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AnalysisKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnalysisKindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AnalysisKindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AnalysisKindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ANALYSIS_KIND = "analysisKind";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_KIND)
  private AnalysisKindEnum analysisKind;

  public Discovery() {
  }

  public Discovery analysisKind(AnalysisKindEnum analysisKind) {
    this.analysisKind = analysisKind;
    return this;
  }

  /**
   * The kind of analysis that is handled by this discovery.
   * @return analysisKind
   */
  @javax.annotation.Nullable
  public AnalysisKindEnum getAnalysisKind() {
    return analysisKind;
  }

  public void setAnalysisKind(AnalysisKindEnum analysisKind) {
    this.analysisKind = analysisKind;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discovery discovery = (Discovery) o;
    return Objects.equals(this.analysisKind, discovery.analysisKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discovery {\n");
    sb.append("    analysisKind: ").append(toIndentedString(analysisKind)).append("\n");
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
    openapiFields.add("analysisKind");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Discovery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Discovery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Discovery is not found in the empty JSON string", Discovery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Discovery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Discovery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("analysisKind") != null && !jsonObj.get("analysisKind").isJsonNull()) && !jsonObj.get("analysisKind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `analysisKind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("analysisKind").toString()));
      }
      // validate the optional field `analysisKind`
      if (jsonObj.get("analysisKind") != null && !jsonObj.get("analysisKind").isJsonNull()) {
        AnalysisKindEnum.validateJsonElement(jsonObj.get("analysisKind"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Discovery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Discovery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Discovery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Discovery.class));

       return (TypeAdapter<T>) new TypeAdapter<Discovery>() {
           @Override
           public void write(JsonWriter out, Discovery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Discovery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Discovery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Discovery
   * @throws IOException if the JSON string is invalid with respect to Discovery
   */
  public static Discovery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Discovery.class);
  }

  /**
   * Convert an instance of Discovery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

