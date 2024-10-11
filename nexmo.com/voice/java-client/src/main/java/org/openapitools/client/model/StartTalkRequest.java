/*
 * Voice API
 * The Voice API lets you create outbound calls, control in-progress calls and get information about historical calls. More information about the Voice API can be found at <https://developer.nexmo.com/voice/voice-api/overview>.
 *
 * The version of the OpenAPI document: 1.3.10
 * Contact: devrel@vonage.com
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
import org.openapitools.client.model.Language;
import org.openapitools.client.model.VoiceName;

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
 * StartTalkRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:03.439896-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StartTalkRequest {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language = Language.EN_US;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level = "0";

  public static final String SERIALIZED_NAME_LOOP = "loop";
  @SerializedName(SERIALIZED_NAME_LOOP)
  private Integer loop = 1;

  public static final String SERIALIZED_NAME_PREMIUM = "premium";
  @SerializedName(SERIALIZED_NAME_PREMIUM)
  private Boolean premium = false;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private Integer style = 0;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_VOICE_NAME = "voice_name";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_VOICE_NAME)
  private VoiceName voiceName = VoiceName.KIMBERLY;

  public StartTalkRequest() {
  }

  public StartTalkRequest language(Language language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @javax.annotation.Nullable
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }


  public StartTalkRequest level(String level) {
    this.level = level;
    return this;
  }

  /**
   * The volume level that the speech is played. This can be any value between &#x60;-1&#x60; to &#x60;1&#x60; in &#x60;0.1&#x60; increments, with &#x60;0&#x60; being the default.
   * @return level
   */
  @javax.annotation.Nullable
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  public StartTalkRequest loop(Integer loop) {
    this.loop = loop;
    return this;
  }

  /**
   * The number of times to repeat the text the file, 0 for infinite
   * @return loop
   */
  @javax.annotation.Nullable
  public Integer getLoop() {
    return loop;
  }

  public void setLoop(Integer loop) {
    this.loop = loop;
  }


  public StartTalkRequest premium(Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Set to true to use the premium version of the specified style if available, otherwise the standard version will be used. The default value is false. You can find more information about Premium Voices in the [Text-To-Speech guide](/voice/voice-api/guides/text-to-speech#premium-voices).
   * @return premium
   */
  @javax.annotation.Nullable
  public Boolean getPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }


  public StartTalkRequest style(Integer style) {
    this.style = style;
    return this;
  }

  /**
   * The vocal style (vocal range, tessitura, and timbre) to use
   * @return style
   */
  @javax.annotation.Nullable
  public Integer getStyle() {
    return style;
  }

  public void setStyle(Integer style) {
    this.style = style;
  }


  public StartTalkRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text to read
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Deprecated
  public StartTalkRequest voiceName(VoiceName voiceName) {
    this.voiceName = voiceName;
    return this;
  }

  /**
   * Get voiceName
   * @return voiceName
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public VoiceName getVoiceName() {
    return voiceName;
  }

  @Deprecated
  public void setVoiceName(VoiceName voiceName) {
    this.voiceName = voiceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartTalkRequest startTalkRequest = (StartTalkRequest) o;
    return Objects.equals(this.language, startTalkRequest.language) &&
        Objects.equals(this.level, startTalkRequest.level) &&
        Objects.equals(this.loop, startTalkRequest.loop) &&
        Objects.equals(this.premium, startTalkRequest.premium) &&
        Objects.equals(this.style, startTalkRequest.style) &&
        Objects.equals(this.text, startTalkRequest.text) &&
        Objects.equals(this.voiceName, startTalkRequest.voiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, level, loop, premium, style, text, voiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartTalkRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    loop: ").append(toIndentedString(loop)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    voiceName: ").append(toIndentedString(voiceName)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("level");
    openapiFields.add("loop");
    openapiFields.add("premium");
    openapiFields.add("style");
    openapiFields.add("text");
    openapiFields.add("voice_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StartTalkRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StartTalkRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartTalkRequest is not found in the empty JSON string", StartTalkRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StartTalkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StartTalkRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StartTalkRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `language`
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) {
        Language.validateJsonElement(jsonObj.get("language"));
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // validate the optional field `voice_name`
      if (jsonObj.get("voice_name") != null && !jsonObj.get("voice_name").isJsonNull()) {
        VoiceName.validateJsonElement(jsonObj.get("voice_name"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartTalkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartTalkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartTalkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartTalkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StartTalkRequest>() {
           @Override
           public void write(JsonWriter out, StartTalkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StartTalkRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StartTalkRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StartTalkRequest
   * @throws IOException if the JSON string is invalid with respect to StartTalkRequest
   */
  public static StartTalkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartTalkRequest.class);
  }

  /**
   * Convert an instance of StartTalkRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

