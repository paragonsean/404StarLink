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
import org.openapitools.client.model.CreateDistributionWithTags20181105RequestDistributionConfigWithTagsTags;
import org.openapitools.client.model.CreateStreamingDistributionWithTags20181105RequestStreamingDistributionConfigWithTagsStreamingDistributionConfig;

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
 * A streaming distribution Configuration and a list of tags to be associated with the streaming distribution.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StreamingDistributionConfigWithTags {
  public static final String SERIALIZED_NAME_STREAMING_DISTRIBUTION_CONFIG = "StreamingDistributionConfig";
  @SerializedName(SERIALIZED_NAME_STREAMING_DISTRIBUTION_CONFIG)
  private CreateStreamingDistributionWithTags20181105RequestStreamingDistributionConfigWithTagsStreamingDistributionConfig streamingDistributionConfig;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private CreateDistributionWithTags20181105RequestDistributionConfigWithTagsTags tags;

  public StreamingDistributionConfigWithTags() {
  }

  public StreamingDistributionConfigWithTags streamingDistributionConfig(CreateStreamingDistributionWithTags20181105RequestStreamingDistributionConfigWithTagsStreamingDistributionConfig streamingDistributionConfig) {
    this.streamingDistributionConfig = streamingDistributionConfig;
    return this;
  }

  /**
   * Get streamingDistributionConfig
   * @return streamingDistributionConfig
   */
  @javax.annotation.Nonnull
  public CreateStreamingDistributionWithTags20181105RequestStreamingDistributionConfigWithTagsStreamingDistributionConfig getStreamingDistributionConfig() {
    return streamingDistributionConfig;
  }

  public void setStreamingDistributionConfig(CreateStreamingDistributionWithTags20181105RequestStreamingDistributionConfigWithTagsStreamingDistributionConfig streamingDistributionConfig) {
    this.streamingDistributionConfig = streamingDistributionConfig;
  }


  public StreamingDistributionConfigWithTags tags(CreateDistributionWithTags20181105RequestDistributionConfigWithTagsTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nonnull
  public CreateDistributionWithTags20181105RequestDistributionConfigWithTagsTags getTags() {
    return tags;
  }

  public void setTags(CreateDistributionWithTags20181105RequestDistributionConfigWithTagsTags tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamingDistributionConfigWithTags streamingDistributionConfigWithTags = (StreamingDistributionConfigWithTags) o;
    return Objects.equals(this.streamingDistributionConfig, streamingDistributionConfigWithTags.streamingDistributionConfig) &&
        Objects.equals(this.tags, streamingDistributionConfigWithTags.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamingDistributionConfig, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamingDistributionConfigWithTags {\n");
    sb.append("    streamingDistributionConfig: ").append(toIndentedString(streamingDistributionConfig)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("StreamingDistributionConfig");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("StreamingDistributionConfig");
    openapiRequiredFields.add("Tags");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StreamingDistributionConfigWithTags
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamingDistributionConfigWithTags.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamingDistributionConfigWithTags is not found in the empty JSON string", StreamingDistributionConfigWithTags.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamingDistributionConfigWithTags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamingDistributionConfigWithTags` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StreamingDistributionConfigWithTags.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `StreamingDistributionConfig`
      CreateStreamingDistributionWithTags20181105RequestStreamingDistributionConfigWithTagsStreamingDistributionConfig.validateJsonElement(jsonObj.get("StreamingDistributionConfig"));
      // validate the required field `Tags`
      CreateDistributionWithTags20181105RequestDistributionConfigWithTagsTags.validateJsonElement(jsonObj.get("Tags"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamingDistributionConfigWithTags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamingDistributionConfigWithTags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamingDistributionConfigWithTags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamingDistributionConfigWithTags.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamingDistributionConfigWithTags>() {
           @Override
           public void write(JsonWriter out, StreamingDistributionConfigWithTags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamingDistributionConfigWithTags read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StreamingDistributionConfigWithTags given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StreamingDistributionConfigWithTags
   * @throws IOException if the JSON string is invalid with respect to StreamingDistributionConfigWithTags
   */
  public static StreamingDistributionConfigWithTags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamingDistributionConfigWithTags.class);
  }

  /**
   * Convert an instance of StreamingDistributionConfigWithTags to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

