/*
 * Cloud Translation API
 * Integrates text translation into your website or application.
 *
 * The version of the OpenAPI document: v3beta1
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
 * A translated document message.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:25.577525-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DocumentTranslation {
  public static final String SERIALIZED_NAME_BYTE_STREAM_OUTPUTS = "byteStreamOutputs";
  @SerializedName(SERIALIZED_NAME_BYTE_STREAM_OUTPUTS)
  private List<byte[]> byteStreamOutputs = new ArrayList<>();

  public static final String SERIALIZED_NAME_DETECTED_LANGUAGE_CODE = "detectedLanguageCode";
  @SerializedName(SERIALIZED_NAME_DETECTED_LANGUAGE_CODE)
  private String detectedLanguageCode;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public DocumentTranslation() {
  }

  public DocumentTranslation byteStreamOutputs(List<byte[]> byteStreamOutputs) {
    this.byteStreamOutputs = byteStreamOutputs;
    return this;
  }

  public DocumentTranslation addByteStreamOutputsItem(byte[] byteStreamOutputsItem) {
    if (this.byteStreamOutputs == null) {
      this.byteStreamOutputs = new ArrayList<>();
    }
    this.byteStreamOutputs.add(byteStreamOutputsItem);
    return this;
  }

  /**
   * The array of translated documents. It is expected to be size 1 for now. We may produce multiple translated documents in the future for other type of file formats.
   * @return byteStreamOutputs
   */
  @javax.annotation.Nullable
  public List<byte[]> getByteStreamOutputs() {
    return byteStreamOutputs;
  }

  public void setByteStreamOutputs(List<byte[]> byteStreamOutputs) {
    this.byteStreamOutputs = byteStreamOutputs;
  }


  public DocumentTranslation detectedLanguageCode(String detectedLanguageCode) {
    this.detectedLanguageCode = detectedLanguageCode;
    return this;
  }

  /**
   * The detected language for the input document. If the user did not provide the source language for the input document, this field will have the language code automatically detected. If the source language was passed, auto-detection of the language does not occur and this field is empty.
   * @return detectedLanguageCode
   */
  @javax.annotation.Nullable
  public String getDetectedLanguageCode() {
    return detectedLanguageCode;
  }

  public void setDetectedLanguageCode(String detectedLanguageCode) {
    this.detectedLanguageCode = detectedLanguageCode;
  }


  public DocumentTranslation mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The translated document&#39;s mime type.
   * @return mimeType
   */
  @javax.annotation.Nullable
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTranslation documentTranslation = (DocumentTranslation) o;
    return Objects.equals(this.byteStreamOutputs, documentTranslation.byteStreamOutputs) &&
        Objects.equals(this.detectedLanguageCode, documentTranslation.detectedLanguageCode) &&
        Objects.equals(this.mimeType, documentTranslation.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteStreamOutputs, detectedLanguageCode, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTranslation {\n");
    sb.append("    byteStreamOutputs: ").append(toIndentedString(byteStreamOutputs)).append("\n");
    sb.append("    detectedLanguageCode: ").append(toIndentedString(detectedLanguageCode)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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
    openapiFields.add("byteStreamOutputs");
    openapiFields.add("detectedLanguageCode");
    openapiFields.add("mimeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentTranslation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentTranslation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentTranslation is not found in the empty JSON string", DocumentTranslation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentTranslation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentTranslation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("byteStreamOutputs") != null && !jsonObj.get("byteStreamOutputs").isJsonNull() && !jsonObj.get("byteStreamOutputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `byteStreamOutputs` to be an array in the JSON string but got `%s`", jsonObj.get("byteStreamOutputs").toString()));
      }
      if ((jsonObj.get("detectedLanguageCode") != null && !jsonObj.get("detectedLanguageCode").isJsonNull()) && !jsonObj.get("detectedLanguageCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectedLanguageCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detectedLanguageCode").toString()));
      }
      if ((jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonNull()) && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentTranslation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentTranslation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentTranslation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentTranslation.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentTranslation>() {
           @Override
           public void write(JsonWriter out, DocumentTranslation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentTranslation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentTranslation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentTranslation
   * @throws IOException if the JSON string is invalid with respect to DocumentTranslation
   */
  public static DocumentTranslation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentTranslation.class);
  }

  /**
   * Convert an instance of DocumentTranslation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

