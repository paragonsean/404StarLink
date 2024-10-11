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
import java.util.Arrays;
import org.openapitools.client.model.TranslateTextGlossaryConfig;

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
 * A single translation response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:25.577525-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Translation {
  public static final String SERIALIZED_NAME_DETECTED_LANGUAGE_CODE = "detectedLanguageCode";
  @SerializedName(SERIALIZED_NAME_DETECTED_LANGUAGE_CODE)
  private String detectedLanguageCode;

  public static final String SERIALIZED_NAME_GLOSSARY_CONFIG = "glossaryConfig";
  @SerializedName(SERIALIZED_NAME_GLOSSARY_CONFIG)
  private TranslateTextGlossaryConfig glossaryConfig;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_TRANSLATED_TEXT = "translatedText";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_TEXT)
  private String translatedText;

  public Translation() {
  }

  public Translation detectedLanguageCode(String detectedLanguageCode) {
    this.detectedLanguageCode = detectedLanguageCode;
    return this;
  }

  /**
   * The BCP-47 language code of source text in the initial request, detected automatically, if no source language was passed within the initial request. If the source language was passed, auto-detection of the language does not occur and this field is empty.
   * @return detectedLanguageCode
   */
  @javax.annotation.Nullable
  public String getDetectedLanguageCode() {
    return detectedLanguageCode;
  }

  public void setDetectedLanguageCode(String detectedLanguageCode) {
    this.detectedLanguageCode = detectedLanguageCode;
  }


  public Translation glossaryConfig(TranslateTextGlossaryConfig glossaryConfig) {
    this.glossaryConfig = glossaryConfig;
    return this;
  }

  /**
   * Get glossaryConfig
   * @return glossaryConfig
   */
  @javax.annotation.Nullable
  public TranslateTextGlossaryConfig getGlossaryConfig() {
    return glossaryConfig;
  }

  public void setGlossaryConfig(TranslateTextGlossaryConfig glossaryConfig) {
    this.glossaryConfig = glossaryConfig;
  }


  public Translation model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Only present when &#x60;model&#x60; is present in the request. &#x60;model&#x60; here is normalized to have project number. For example: If the &#x60;model&#x60; requested in TranslationTextRequest is &#x60;projects/{project-id}/locations/{location-id}/models/general/nmt&#x60; then &#x60;model&#x60; here would be normalized to &#x60;projects/{project-number}/locations/{location-id}/models/general/nmt&#x60;.
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public Translation translatedText(String translatedText) {
    this.translatedText = translatedText;
    return this;
  }

  /**
   * Text translated into the target language. If an error occurs during translation, this field might be excluded from the response.
   * @return translatedText
   */
  @javax.annotation.Nullable
  public String getTranslatedText() {
    return translatedText;
  }

  public void setTranslatedText(String translatedText) {
    this.translatedText = translatedText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Translation translation = (Translation) o;
    return Objects.equals(this.detectedLanguageCode, translation.detectedLanguageCode) &&
        Objects.equals(this.glossaryConfig, translation.glossaryConfig) &&
        Objects.equals(this.model, translation.model) &&
        Objects.equals(this.translatedText, translation.translatedText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectedLanguageCode, glossaryConfig, model, translatedText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Translation {\n");
    sb.append("    detectedLanguageCode: ").append(toIndentedString(detectedLanguageCode)).append("\n");
    sb.append("    glossaryConfig: ").append(toIndentedString(glossaryConfig)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    translatedText: ").append(toIndentedString(translatedText)).append("\n");
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
    openapiFields.add("detectedLanguageCode");
    openapiFields.add("glossaryConfig");
    openapiFields.add("model");
    openapiFields.add("translatedText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Translation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Translation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Translation is not found in the empty JSON string", Translation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Translation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Translation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("detectedLanguageCode") != null && !jsonObj.get("detectedLanguageCode").isJsonNull()) && !jsonObj.get("detectedLanguageCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectedLanguageCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detectedLanguageCode").toString()));
      }
      // validate the optional field `glossaryConfig`
      if (jsonObj.get("glossaryConfig") != null && !jsonObj.get("glossaryConfig").isJsonNull()) {
        TranslateTextGlossaryConfig.validateJsonElement(jsonObj.get("glossaryConfig"));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("translatedText") != null && !jsonObj.get("translatedText").isJsonNull()) && !jsonObj.get("translatedText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `translatedText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("translatedText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Translation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Translation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Translation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Translation.class));

       return (TypeAdapter<T>) new TypeAdapter<Translation>() {
           @Override
           public void write(JsonWriter out, Translation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Translation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Translation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Translation
   * @throws IOException if the JSON string is invalid with respect to Translation
   */
  public static Translation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Translation.class);
  }

  /**
   * Convert an instance of Translation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

