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
import java.time.OffsetDateTime;
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
 * AnnotationRestApiPut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AnnotationRestApiPut {
  public static final String SERIALIZED_NAME_END_DTTM = "end_dttm";
  @SerializedName(SERIALIZED_NAME_END_DTTM)
  private OffsetDateTime endDttm;

  public static final String SERIALIZED_NAME_JSON_METADATA = "json_metadata";
  @SerializedName(SERIALIZED_NAME_JSON_METADATA)
  private String jsonMetadata;

  public static final String SERIALIZED_NAME_LONG_DESCR = "long_descr";
  @SerializedName(SERIALIZED_NAME_LONG_DESCR)
  private String longDescr;

  public static final String SERIALIZED_NAME_SHORT_DESCR = "short_descr";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCR)
  private String shortDescr;

  public static final String SERIALIZED_NAME_START_DTTM = "start_dttm";
  @SerializedName(SERIALIZED_NAME_START_DTTM)
  private OffsetDateTime startDttm;

  public AnnotationRestApiPut() {
  }

  public AnnotationRestApiPut endDttm(OffsetDateTime endDttm) {
    this.endDttm = endDttm;
    return this;
  }

  /**
   * The annotation end date time
   * @return endDttm
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDttm() {
    return endDttm;
  }

  public void setEndDttm(OffsetDateTime endDttm) {
    this.endDttm = endDttm;
  }


  public AnnotationRestApiPut jsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
    return this;
  }

  /**
   * JSON metadata
   * @return jsonMetadata
   */
  @javax.annotation.Nullable
  public String getJsonMetadata() {
    return jsonMetadata;
  }

  public void setJsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
  }


  public AnnotationRestApiPut longDescr(String longDescr) {
    this.longDescr = longDescr;
    return this;
  }

  /**
   * A long description
   * @return longDescr
   */
  @javax.annotation.Nullable
  public String getLongDescr() {
    return longDescr;
  }

  public void setLongDescr(String longDescr) {
    this.longDescr = longDescr;
  }


  public AnnotationRestApiPut shortDescr(String shortDescr) {
    this.shortDescr = shortDescr;
    return this;
  }

  /**
   * A short description
   * @return shortDescr
   */
  @javax.annotation.Nullable
  public String getShortDescr() {
    return shortDescr;
  }

  public void setShortDescr(String shortDescr) {
    this.shortDescr = shortDescr;
  }


  public AnnotationRestApiPut startDttm(OffsetDateTime startDttm) {
    this.startDttm = startDttm;
    return this;
  }

  /**
   * The annotation start date time
   * @return startDttm
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDttm() {
    return startDttm;
  }

  public void setStartDttm(OffsetDateTime startDttm) {
    this.startDttm = startDttm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationRestApiPut annotationRestApiPut = (AnnotationRestApiPut) o;
    return Objects.equals(this.endDttm, annotationRestApiPut.endDttm) &&
        Objects.equals(this.jsonMetadata, annotationRestApiPut.jsonMetadata) &&
        Objects.equals(this.longDescr, annotationRestApiPut.longDescr) &&
        Objects.equals(this.shortDescr, annotationRestApiPut.shortDescr) &&
        Objects.equals(this.startDttm, annotationRestApiPut.startDttm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDttm, jsonMetadata, longDescr, shortDescr, startDttm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationRestApiPut {\n");
    sb.append("    endDttm: ").append(toIndentedString(endDttm)).append("\n");
    sb.append("    jsonMetadata: ").append(toIndentedString(jsonMetadata)).append("\n");
    sb.append("    longDescr: ").append(toIndentedString(longDescr)).append("\n");
    sb.append("    shortDescr: ").append(toIndentedString(shortDescr)).append("\n");
    sb.append("    startDttm: ").append(toIndentedString(startDttm)).append("\n");
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
    openapiFields.add("end_dttm");
    openapiFields.add("json_metadata");
    openapiFields.add("long_descr");
    openapiFields.add("short_descr");
    openapiFields.add("start_dttm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnnotationRestApiPut
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnnotationRestApiPut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnotationRestApiPut is not found in the empty JSON string", AnnotationRestApiPut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnnotationRestApiPut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnotationRestApiPut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("json_metadata") != null && !jsonObj.get("json_metadata").isJsonNull()) && !jsonObj.get("json_metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `json_metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("json_metadata").toString()));
      }
      if ((jsonObj.get("long_descr") != null && !jsonObj.get("long_descr").isJsonNull()) && !jsonObj.get("long_descr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `long_descr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("long_descr").toString()));
      }
      if ((jsonObj.get("short_descr") != null && !jsonObj.get("short_descr").isJsonNull()) && !jsonObj.get("short_descr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_descr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_descr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnotationRestApiPut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnotationRestApiPut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnotationRestApiPut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnotationRestApiPut.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnotationRestApiPut>() {
           @Override
           public void write(JsonWriter out, AnnotationRestApiPut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnotationRestApiPut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnnotationRestApiPut given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnnotationRestApiPut
   * @throws IOException if the JSON string is invalid with respect to AnnotationRestApiPut
   */
  public static AnnotationRestApiPut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnotationRestApiPut.class);
  }

  /**
   * Convert an instance of AnnotationRestApiPut to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

