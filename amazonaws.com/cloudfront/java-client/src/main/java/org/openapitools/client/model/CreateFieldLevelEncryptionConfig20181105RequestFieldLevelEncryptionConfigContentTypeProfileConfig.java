/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
 * Contact: mike.ralphson@gmail.com
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
import org.openapitools.client.model.ContentTypeProfileConfigContentTypeProfiles;

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
 * CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig {
  public static final String SERIALIZED_NAME_FORWARD_WHEN_CONTENT_TYPE_IS_UNKNOWN = "ForwardWhenContentTypeIsUnknown";
  @SerializedName(SERIALIZED_NAME_FORWARD_WHEN_CONTENT_TYPE_IS_UNKNOWN)
  private Boolean forwardWhenContentTypeIsUnknown;

  public static final String SERIALIZED_NAME_CONTENT_TYPE_PROFILES = "ContentTypeProfiles";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE_PROFILES)
  private ContentTypeProfileConfigContentTypeProfiles contentTypeProfiles;

  public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig() {
  }

  public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig forwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
    this.forwardWhenContentTypeIsUnknown = forwardWhenContentTypeIsUnknown;
    return this;
  }

  /**
   * Get forwardWhenContentTypeIsUnknown
   * @return forwardWhenContentTypeIsUnknown
   */
  @javax.annotation.Nonnull
  public Boolean getForwardWhenContentTypeIsUnknown() {
    return forwardWhenContentTypeIsUnknown;
  }

  public void setForwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
    this.forwardWhenContentTypeIsUnknown = forwardWhenContentTypeIsUnknown;
  }


  public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig contentTypeProfiles(ContentTypeProfileConfigContentTypeProfiles contentTypeProfiles) {
    this.contentTypeProfiles = contentTypeProfiles;
    return this;
  }

  /**
   * Get contentTypeProfiles
   * @return contentTypeProfiles
   */
  @javax.annotation.Nullable
  public ContentTypeProfileConfigContentTypeProfiles getContentTypeProfiles() {
    return contentTypeProfiles;
  }

  public void setContentTypeProfiles(ContentTypeProfileConfigContentTypeProfiles contentTypeProfiles) {
    this.contentTypeProfiles = contentTypeProfiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig createFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig = (CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig) o;
    return Objects.equals(this.forwardWhenContentTypeIsUnknown, createFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.forwardWhenContentTypeIsUnknown) &&
        Objects.equals(this.contentTypeProfiles, createFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.contentTypeProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardWhenContentTypeIsUnknown, contentTypeProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig {\n");
    sb.append("    forwardWhenContentTypeIsUnknown: ").append(toIndentedString(forwardWhenContentTypeIsUnknown)).append("\n");
    sb.append("    contentTypeProfiles: ").append(toIndentedString(contentTypeProfiles)).append("\n");
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
    openapiFields.add("ForwardWhenContentTypeIsUnknown");
    openapiFields.add("ContentTypeProfiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ForwardWhenContentTypeIsUnknown");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig is not found in the empty JSON string", CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ForwardWhenContentTypeIsUnknown`
      Boolean.validateJsonElement(jsonObj.get("ForwardWhenContentTypeIsUnknown"));
      // validate the optional field `ContentTypeProfiles`
      if (jsonObj.get("ContentTypeProfiles") != null && !jsonObj.get("ContentTypeProfiles").isJsonNull()) {
        ContentTypeProfileConfigContentTypeProfiles.validateJsonElement(jsonObj.get("ContentTypeProfiles"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig>() {
           @Override
           public void write(JsonWriter out, CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig
   * @throws IOException if the JSON string is invalid with respect to CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig
   */
  public static CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig.class);
  }

  /**
   * Convert an instance of CreateFieldLevelEncryptionConfig20181105RequestFieldLevelEncryptionConfigContentTypeProfileConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

