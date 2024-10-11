/*
 * QuickChart API
 * An API to generate charts and QR codes using QuickChart services.
 *
 * The version of the OpenAPI document: 1.0.0
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
 * QrPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:44.736906-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class QrPostRequest {
  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private Integer margin;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public QrPostRequest() {
  }

  public QrPostRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * The output format of the QR code, e.g., &#39;png&#39; or &#39;svg&#39;.
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public QrPostRequest height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The height of the QR code in pixels.
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  public QrPostRequest margin(Integer margin) {
    this.margin = margin;
    return this;
  }

  /**
   * The margin around the QR code in pixels.
   * @return margin
   */
  @javax.annotation.Nullable
  public Integer getMargin() {
    return margin;
  }

  public void setMargin(Integer margin) {
    this.margin = margin;
  }


  public QrPostRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text to be encoded in the QR code.
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public QrPostRequest width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * The width of the QR code in pixels.
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QrPostRequest qrPostRequest = (QrPostRequest) o;
    return Objects.equals(this.format, qrPostRequest.format) &&
        Objects.equals(this.height, qrPostRequest.height) &&
        Objects.equals(this.margin, qrPostRequest.margin) &&
        Objects.equals(this.text, qrPostRequest.text) &&
        Objects.equals(this.width, qrPostRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, height, margin, text, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QrPostRequest {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("height");
    openapiFields.add("margin");
    openapiFields.add("text");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QrPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QrPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QrPostRequest is not found in the empty JSON string", QrPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QrPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QrPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QrPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QrPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QrPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QrPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QrPostRequest>() {
           @Override
           public void write(JsonWriter out, QrPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QrPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QrPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QrPostRequest
   * @throws IOException if the JSON string is invalid with respect to QrPostRequest
   */
  public static QrPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QrPostRequest.class);
  }

  /**
   * Convert an instance of QrPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

