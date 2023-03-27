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
 * DocumentNote represents an SPDX Document Creation Information section: https://spdx.github.io/spdx-spec/v2.3/document-creation-information/
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:01.336252-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DocumentNote {
  public static final String SERIALIZED_NAME_DATA_LICENCE = "dataLicence";
  @SerializedName(SERIALIZED_NAME_DATA_LICENCE)
  private String dataLicence;

  public static final String SERIALIZED_NAME_SPDX_VERSION = "spdxVersion";
  @SerializedName(SERIALIZED_NAME_SPDX_VERSION)
  private String spdxVersion;

  public DocumentNote() {
  }

  public DocumentNote dataLicence(String dataLicence) {
    this.dataLicence = dataLicence;
    return this;
  }

  /**
   * Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields (\&quot;SPDX-Metadata\&quot;)
   * @return dataLicence
   */
  @javax.annotation.Nullable
  public String getDataLicence() {
    return dataLicence;
  }

  public void setDataLicence(String dataLicence) {
    this.dataLicence = dataLicence;
  }


  public DocumentNote spdxVersion(String spdxVersion) {
    this.spdxVersion = spdxVersion;
    return this;
  }

  /**
   * Provide a reference number that can be used to understand how to parse and interpret the rest of the file
   * @return spdxVersion
   */
  @javax.annotation.Nullable
  public String getSpdxVersion() {
    return spdxVersion;
  }

  public void setSpdxVersion(String spdxVersion) {
    this.spdxVersion = spdxVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentNote documentNote = (DocumentNote) o;
    return Objects.equals(this.dataLicence, documentNote.dataLicence) &&
        Objects.equals(this.spdxVersion, documentNote.spdxVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataLicence, spdxVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentNote {\n");
    sb.append("    dataLicence: ").append(toIndentedString(dataLicence)).append("\n");
    sb.append("    spdxVersion: ").append(toIndentedString(spdxVersion)).append("\n");
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
    openapiFields.add("dataLicence");
    openapiFields.add("spdxVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentNote
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentNote.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentNote is not found in the empty JSON string", DocumentNote.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentNote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentNote` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataLicence") != null && !jsonObj.get("dataLicence").isJsonNull()) && !jsonObj.get("dataLicence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataLicence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataLicence").toString()));
      }
      if ((jsonObj.get("spdxVersion") != null && !jsonObj.get("spdxVersion").isJsonNull()) && !jsonObj.get("spdxVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spdxVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spdxVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentNote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentNote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentNote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentNote.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentNote>() {
           @Override
           public void write(JsonWriter out, DocumentNote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentNote read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentNote given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentNote
   * @throws IOException if the JSON string is invalid with respect to DocumentNote
   */
  public static DocumentNote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentNote.class);
  }

  /**
   * Convert an instance of DocumentNote to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

