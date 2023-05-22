/*
 * Giphy API
 * Giphy API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@giphy.com
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
import org.openapitools.client.model.GifImagesDownsized;
import org.openapitools.client.model.GifImagesDownsizedLarge;
import org.openapitools.client.model.GifImagesDownsizedMedium;
import org.openapitools.client.model.GifImagesDownsizedSmall;
import org.openapitools.client.model.GifImagesDownsizedStill;
import org.openapitools.client.model.GifImagesFixedHeight;
import org.openapitools.client.model.GifImagesFixedHeightDownsampled;
import org.openapitools.client.model.GifImagesFixedHeightSmall;
import org.openapitools.client.model.GifImagesFixedHeightSmallStill;
import org.openapitools.client.model.GifImagesFixedHeightStill;
import org.openapitools.client.model.GifImagesFixedWidth;
import org.openapitools.client.model.GifImagesFixedWidthDownsampled;
import org.openapitools.client.model.GifImagesFixedWidthSmall;
import org.openapitools.client.model.GifImagesFixedWidthSmallStill;
import org.openapitools.client.model.GifImagesFixedWidthStill;
import org.openapitools.client.model.GifImagesLooping;
import org.openapitools.client.model.GifImagesOriginal;
import org.openapitools.client.model.GifImagesOriginalStill;
import org.openapitools.client.model.GifImagesPreview;
import org.openapitools.client.model.GifImagesPreviewGif;

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
 * An object containing data for various available formats and sizes of this GIF.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:01.821019-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GifImages {
  public static final String SERIALIZED_NAME_DOWNSIZED = "downsized";
  @SerializedName(SERIALIZED_NAME_DOWNSIZED)
  private GifImagesDownsized downsized;

  public static final String SERIALIZED_NAME_DOWNSIZED_LARGE = "downsized_large";
  @SerializedName(SERIALIZED_NAME_DOWNSIZED_LARGE)
  private GifImagesDownsizedLarge downsizedLarge;

  public static final String SERIALIZED_NAME_DOWNSIZED_MEDIUM = "downsized_medium";
  @SerializedName(SERIALIZED_NAME_DOWNSIZED_MEDIUM)
  private GifImagesDownsizedMedium downsizedMedium;

  public static final String SERIALIZED_NAME_DOWNSIZED_SMALL = "downsized_small";
  @SerializedName(SERIALIZED_NAME_DOWNSIZED_SMALL)
  private GifImagesDownsizedSmall downsizedSmall;

  public static final String SERIALIZED_NAME_DOWNSIZED_STILL = "downsized_still";
  @SerializedName(SERIALIZED_NAME_DOWNSIZED_STILL)
  private GifImagesDownsizedStill downsizedStill;

  public static final String SERIALIZED_NAME_FIXED_HEIGHT = "fixed_height";
  @SerializedName(SERIALIZED_NAME_FIXED_HEIGHT)
  private GifImagesFixedHeight fixedHeight;

  public static final String SERIALIZED_NAME_FIXED_HEIGHT_DOWNSAMPLED = "fixed_height_downsampled";
  @SerializedName(SERIALIZED_NAME_FIXED_HEIGHT_DOWNSAMPLED)
  private GifImagesFixedHeightDownsampled fixedHeightDownsampled;

  public static final String SERIALIZED_NAME_FIXED_HEIGHT_SMALL = "fixed_height_small";
  @SerializedName(SERIALIZED_NAME_FIXED_HEIGHT_SMALL)
  private GifImagesFixedHeightSmall fixedHeightSmall;

  public static final String SERIALIZED_NAME_FIXED_HEIGHT_SMALL_STILL = "fixed_height_small_still";
  @SerializedName(SERIALIZED_NAME_FIXED_HEIGHT_SMALL_STILL)
  private GifImagesFixedHeightSmallStill fixedHeightSmallStill;

  public static final String SERIALIZED_NAME_FIXED_HEIGHT_STILL = "fixed_height_still";
  @SerializedName(SERIALIZED_NAME_FIXED_HEIGHT_STILL)
  private GifImagesFixedHeightStill fixedHeightStill;

  public static final String SERIALIZED_NAME_FIXED_WIDTH = "fixed_width";
  @SerializedName(SERIALIZED_NAME_FIXED_WIDTH)
  private GifImagesFixedWidth fixedWidth;

  public static final String SERIALIZED_NAME_FIXED_WIDTH_DOWNSAMPLED = "fixed_width_downsampled";
  @SerializedName(SERIALIZED_NAME_FIXED_WIDTH_DOWNSAMPLED)
  private GifImagesFixedWidthDownsampled fixedWidthDownsampled;

  public static final String SERIALIZED_NAME_FIXED_WIDTH_SMALL = "fixed_width_small";
  @SerializedName(SERIALIZED_NAME_FIXED_WIDTH_SMALL)
  private GifImagesFixedWidthSmall fixedWidthSmall;

  public static final String SERIALIZED_NAME_FIXED_WIDTH_SMALL_STILL = "fixed_width_small_still";
  @SerializedName(SERIALIZED_NAME_FIXED_WIDTH_SMALL_STILL)
  private GifImagesFixedWidthSmallStill fixedWidthSmallStill;

  public static final String SERIALIZED_NAME_FIXED_WIDTH_STILL = "fixed_width_still";
  @SerializedName(SERIALIZED_NAME_FIXED_WIDTH_STILL)
  private GifImagesFixedWidthStill fixedWidthStill;

  public static final String SERIALIZED_NAME_LOOPING = "looping";
  @SerializedName(SERIALIZED_NAME_LOOPING)
  private GifImagesLooping looping;

  public static final String SERIALIZED_NAME_ORIGINAL = "original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private GifImagesOriginal original;

  public static final String SERIALIZED_NAME_ORIGINAL_STILL = "original_still";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_STILL)
  private GifImagesOriginalStill originalStill;

  public static final String SERIALIZED_NAME_PREVIEW = "preview";
  @SerializedName(SERIALIZED_NAME_PREVIEW)
  private GifImagesPreview preview;

  public static final String SERIALIZED_NAME_PREVIEW_GIF = "preview_gif";
  @SerializedName(SERIALIZED_NAME_PREVIEW_GIF)
  private GifImagesPreviewGif previewGif;

  public GifImages() {
  }

  public GifImages downsized(GifImagesDownsized downsized) {
    this.downsized = downsized;
    return this;
  }

  /**
   * Get downsized
   * @return downsized
   */
  @javax.annotation.Nullable
  public GifImagesDownsized getDownsized() {
    return downsized;
  }

  public void setDownsized(GifImagesDownsized downsized) {
    this.downsized = downsized;
  }


  public GifImages downsizedLarge(GifImagesDownsizedLarge downsizedLarge) {
    this.downsizedLarge = downsizedLarge;
    return this;
  }

  /**
   * Get downsizedLarge
   * @return downsizedLarge
   */
  @javax.annotation.Nullable
  public GifImagesDownsizedLarge getDownsizedLarge() {
    return downsizedLarge;
  }

  public void setDownsizedLarge(GifImagesDownsizedLarge downsizedLarge) {
    this.downsizedLarge = downsizedLarge;
  }


  public GifImages downsizedMedium(GifImagesDownsizedMedium downsizedMedium) {
    this.downsizedMedium = downsizedMedium;
    return this;
  }

  /**
   * Get downsizedMedium
   * @return downsizedMedium
   */
  @javax.annotation.Nullable
  public GifImagesDownsizedMedium getDownsizedMedium() {
    return downsizedMedium;
  }

  public void setDownsizedMedium(GifImagesDownsizedMedium downsizedMedium) {
    this.downsizedMedium = downsizedMedium;
  }


  public GifImages downsizedSmall(GifImagesDownsizedSmall downsizedSmall) {
    this.downsizedSmall = downsizedSmall;
    return this;
  }

  /**
   * Get downsizedSmall
   * @return downsizedSmall
   */
  @javax.annotation.Nullable
  public GifImagesDownsizedSmall getDownsizedSmall() {
    return downsizedSmall;
  }

  public void setDownsizedSmall(GifImagesDownsizedSmall downsizedSmall) {
    this.downsizedSmall = downsizedSmall;
  }


  public GifImages downsizedStill(GifImagesDownsizedStill downsizedStill) {
    this.downsizedStill = downsizedStill;
    return this;
  }

  /**
   * Get downsizedStill
   * @return downsizedStill
   */
  @javax.annotation.Nullable
  public GifImagesDownsizedStill getDownsizedStill() {
    return downsizedStill;
  }

  public void setDownsizedStill(GifImagesDownsizedStill downsizedStill) {
    this.downsizedStill = downsizedStill;
  }


  public GifImages fixedHeight(GifImagesFixedHeight fixedHeight) {
    this.fixedHeight = fixedHeight;
    return this;
  }

  /**
   * Get fixedHeight
   * @return fixedHeight
   */
  @javax.annotation.Nullable
  public GifImagesFixedHeight getFixedHeight() {
    return fixedHeight;
  }

  public void setFixedHeight(GifImagesFixedHeight fixedHeight) {
    this.fixedHeight = fixedHeight;
  }


  public GifImages fixedHeightDownsampled(GifImagesFixedHeightDownsampled fixedHeightDownsampled) {
    this.fixedHeightDownsampled = fixedHeightDownsampled;
    return this;
  }

  /**
   * Get fixedHeightDownsampled
   * @return fixedHeightDownsampled
   */
  @javax.annotation.Nullable
  public GifImagesFixedHeightDownsampled getFixedHeightDownsampled() {
    return fixedHeightDownsampled;
  }

  public void setFixedHeightDownsampled(GifImagesFixedHeightDownsampled fixedHeightDownsampled) {
    this.fixedHeightDownsampled = fixedHeightDownsampled;
  }


  public GifImages fixedHeightSmall(GifImagesFixedHeightSmall fixedHeightSmall) {
    this.fixedHeightSmall = fixedHeightSmall;
    return this;
  }

  /**
   * Get fixedHeightSmall
   * @return fixedHeightSmall
   */
  @javax.annotation.Nullable
  public GifImagesFixedHeightSmall getFixedHeightSmall() {
    return fixedHeightSmall;
  }

  public void setFixedHeightSmall(GifImagesFixedHeightSmall fixedHeightSmall) {
    this.fixedHeightSmall = fixedHeightSmall;
  }


  public GifImages fixedHeightSmallStill(GifImagesFixedHeightSmallStill fixedHeightSmallStill) {
    this.fixedHeightSmallStill = fixedHeightSmallStill;
    return this;
  }

  /**
   * Get fixedHeightSmallStill
   * @return fixedHeightSmallStill
   */
  @javax.annotation.Nullable
  public GifImagesFixedHeightSmallStill getFixedHeightSmallStill() {
    return fixedHeightSmallStill;
  }

  public void setFixedHeightSmallStill(GifImagesFixedHeightSmallStill fixedHeightSmallStill) {
    this.fixedHeightSmallStill = fixedHeightSmallStill;
  }


  public GifImages fixedHeightStill(GifImagesFixedHeightStill fixedHeightStill) {
    this.fixedHeightStill = fixedHeightStill;
    return this;
  }

  /**
   * Get fixedHeightStill
   * @return fixedHeightStill
   */
  @javax.annotation.Nullable
  public GifImagesFixedHeightStill getFixedHeightStill() {
    return fixedHeightStill;
  }

  public void setFixedHeightStill(GifImagesFixedHeightStill fixedHeightStill) {
    this.fixedHeightStill = fixedHeightStill;
  }


  public GifImages fixedWidth(GifImagesFixedWidth fixedWidth) {
    this.fixedWidth = fixedWidth;
    return this;
  }

  /**
   * Get fixedWidth
   * @return fixedWidth
   */
  @javax.annotation.Nullable
  public GifImagesFixedWidth getFixedWidth() {
    return fixedWidth;
  }

  public void setFixedWidth(GifImagesFixedWidth fixedWidth) {
    this.fixedWidth = fixedWidth;
  }


  public GifImages fixedWidthDownsampled(GifImagesFixedWidthDownsampled fixedWidthDownsampled) {
    this.fixedWidthDownsampled = fixedWidthDownsampled;
    return this;
  }

  /**
   * Get fixedWidthDownsampled
   * @return fixedWidthDownsampled
   */
  @javax.annotation.Nullable
  public GifImagesFixedWidthDownsampled getFixedWidthDownsampled() {
    return fixedWidthDownsampled;
  }

  public void setFixedWidthDownsampled(GifImagesFixedWidthDownsampled fixedWidthDownsampled) {
    this.fixedWidthDownsampled = fixedWidthDownsampled;
  }


  public GifImages fixedWidthSmall(GifImagesFixedWidthSmall fixedWidthSmall) {
    this.fixedWidthSmall = fixedWidthSmall;
    return this;
  }

  /**
   * Get fixedWidthSmall
   * @return fixedWidthSmall
   */
  @javax.annotation.Nullable
  public GifImagesFixedWidthSmall getFixedWidthSmall() {
    return fixedWidthSmall;
  }

  public void setFixedWidthSmall(GifImagesFixedWidthSmall fixedWidthSmall) {
    this.fixedWidthSmall = fixedWidthSmall;
  }


  public GifImages fixedWidthSmallStill(GifImagesFixedWidthSmallStill fixedWidthSmallStill) {
    this.fixedWidthSmallStill = fixedWidthSmallStill;
    return this;
  }

  /**
   * Get fixedWidthSmallStill
   * @return fixedWidthSmallStill
   */
  @javax.annotation.Nullable
  public GifImagesFixedWidthSmallStill getFixedWidthSmallStill() {
    return fixedWidthSmallStill;
  }

  public void setFixedWidthSmallStill(GifImagesFixedWidthSmallStill fixedWidthSmallStill) {
    this.fixedWidthSmallStill = fixedWidthSmallStill;
  }


  public GifImages fixedWidthStill(GifImagesFixedWidthStill fixedWidthStill) {
    this.fixedWidthStill = fixedWidthStill;
    return this;
  }

  /**
   * Get fixedWidthStill
   * @return fixedWidthStill
   */
  @javax.annotation.Nullable
  public GifImagesFixedWidthStill getFixedWidthStill() {
    return fixedWidthStill;
  }

  public void setFixedWidthStill(GifImagesFixedWidthStill fixedWidthStill) {
    this.fixedWidthStill = fixedWidthStill;
  }


  public GifImages looping(GifImagesLooping looping) {
    this.looping = looping;
    return this;
  }

  /**
   * Get looping
   * @return looping
   */
  @javax.annotation.Nullable
  public GifImagesLooping getLooping() {
    return looping;
  }

  public void setLooping(GifImagesLooping looping) {
    this.looping = looping;
  }


  public GifImages original(GifImagesOriginal original) {
    this.original = original;
    return this;
  }

  /**
   * Get original
   * @return original
   */
  @javax.annotation.Nullable
  public GifImagesOriginal getOriginal() {
    return original;
  }

  public void setOriginal(GifImagesOriginal original) {
    this.original = original;
  }


  public GifImages originalStill(GifImagesOriginalStill originalStill) {
    this.originalStill = originalStill;
    return this;
  }

  /**
   * Get originalStill
   * @return originalStill
   */
  @javax.annotation.Nullable
  public GifImagesOriginalStill getOriginalStill() {
    return originalStill;
  }

  public void setOriginalStill(GifImagesOriginalStill originalStill) {
    this.originalStill = originalStill;
  }


  public GifImages preview(GifImagesPreview preview) {
    this.preview = preview;
    return this;
  }

  /**
   * Get preview
   * @return preview
   */
  @javax.annotation.Nullable
  public GifImagesPreview getPreview() {
    return preview;
  }

  public void setPreview(GifImagesPreview preview) {
    this.preview = preview;
  }


  public GifImages previewGif(GifImagesPreviewGif previewGif) {
    this.previewGif = previewGif;
    return this;
  }

  /**
   * Get previewGif
   * @return previewGif
   */
  @javax.annotation.Nullable
  public GifImagesPreviewGif getPreviewGif() {
    return previewGif;
  }

  public void setPreviewGif(GifImagesPreviewGif previewGif) {
    this.previewGif = previewGif;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GifImages gifImages = (GifImages) o;
    return Objects.equals(this.downsized, gifImages.downsized) &&
        Objects.equals(this.downsizedLarge, gifImages.downsizedLarge) &&
        Objects.equals(this.downsizedMedium, gifImages.downsizedMedium) &&
        Objects.equals(this.downsizedSmall, gifImages.downsizedSmall) &&
        Objects.equals(this.downsizedStill, gifImages.downsizedStill) &&
        Objects.equals(this.fixedHeight, gifImages.fixedHeight) &&
        Objects.equals(this.fixedHeightDownsampled, gifImages.fixedHeightDownsampled) &&
        Objects.equals(this.fixedHeightSmall, gifImages.fixedHeightSmall) &&
        Objects.equals(this.fixedHeightSmallStill, gifImages.fixedHeightSmallStill) &&
        Objects.equals(this.fixedHeightStill, gifImages.fixedHeightStill) &&
        Objects.equals(this.fixedWidth, gifImages.fixedWidth) &&
        Objects.equals(this.fixedWidthDownsampled, gifImages.fixedWidthDownsampled) &&
        Objects.equals(this.fixedWidthSmall, gifImages.fixedWidthSmall) &&
        Objects.equals(this.fixedWidthSmallStill, gifImages.fixedWidthSmallStill) &&
        Objects.equals(this.fixedWidthStill, gifImages.fixedWidthStill) &&
        Objects.equals(this.looping, gifImages.looping) &&
        Objects.equals(this.original, gifImages.original) &&
        Objects.equals(this.originalStill, gifImages.originalStill) &&
        Objects.equals(this.preview, gifImages.preview) &&
        Objects.equals(this.previewGif, gifImages.previewGif);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downsized, downsizedLarge, downsizedMedium, downsizedSmall, downsizedStill, fixedHeight, fixedHeightDownsampled, fixedHeightSmall, fixedHeightSmallStill, fixedHeightStill, fixedWidth, fixedWidthDownsampled, fixedWidthSmall, fixedWidthSmallStill, fixedWidthStill, looping, original, originalStill, preview, previewGif);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifImages {\n");
    sb.append("    downsized: ").append(toIndentedString(downsized)).append("\n");
    sb.append("    downsizedLarge: ").append(toIndentedString(downsizedLarge)).append("\n");
    sb.append("    downsizedMedium: ").append(toIndentedString(downsizedMedium)).append("\n");
    sb.append("    downsizedSmall: ").append(toIndentedString(downsizedSmall)).append("\n");
    sb.append("    downsizedStill: ").append(toIndentedString(downsizedStill)).append("\n");
    sb.append("    fixedHeight: ").append(toIndentedString(fixedHeight)).append("\n");
    sb.append("    fixedHeightDownsampled: ").append(toIndentedString(fixedHeightDownsampled)).append("\n");
    sb.append("    fixedHeightSmall: ").append(toIndentedString(fixedHeightSmall)).append("\n");
    sb.append("    fixedHeightSmallStill: ").append(toIndentedString(fixedHeightSmallStill)).append("\n");
    sb.append("    fixedHeightStill: ").append(toIndentedString(fixedHeightStill)).append("\n");
    sb.append("    fixedWidth: ").append(toIndentedString(fixedWidth)).append("\n");
    sb.append("    fixedWidthDownsampled: ").append(toIndentedString(fixedWidthDownsampled)).append("\n");
    sb.append("    fixedWidthSmall: ").append(toIndentedString(fixedWidthSmall)).append("\n");
    sb.append("    fixedWidthSmallStill: ").append(toIndentedString(fixedWidthSmallStill)).append("\n");
    sb.append("    fixedWidthStill: ").append(toIndentedString(fixedWidthStill)).append("\n");
    sb.append("    looping: ").append(toIndentedString(looping)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    originalStill: ").append(toIndentedString(originalStill)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    previewGif: ").append(toIndentedString(previewGif)).append("\n");
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
    openapiFields.add("downsized");
    openapiFields.add("downsized_large");
    openapiFields.add("downsized_medium");
    openapiFields.add("downsized_small");
    openapiFields.add("downsized_still");
    openapiFields.add("fixed_height");
    openapiFields.add("fixed_height_downsampled");
    openapiFields.add("fixed_height_small");
    openapiFields.add("fixed_height_small_still");
    openapiFields.add("fixed_height_still");
    openapiFields.add("fixed_width");
    openapiFields.add("fixed_width_downsampled");
    openapiFields.add("fixed_width_small");
    openapiFields.add("fixed_width_small_still");
    openapiFields.add("fixed_width_still");
    openapiFields.add("looping");
    openapiFields.add("original");
    openapiFields.add("original_still");
    openapiFields.add("preview");
    openapiFields.add("preview_gif");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GifImages
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GifImages.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GifImages is not found in the empty JSON string", GifImages.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GifImages.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GifImages` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `downsized`
      if (jsonObj.get("downsized") != null && !jsonObj.get("downsized").isJsonNull()) {
        GifImagesDownsized.validateJsonElement(jsonObj.get("downsized"));
      }
      // validate the optional field `downsized_large`
      if (jsonObj.get("downsized_large") != null && !jsonObj.get("downsized_large").isJsonNull()) {
        GifImagesDownsizedLarge.validateJsonElement(jsonObj.get("downsized_large"));
      }
      // validate the optional field `downsized_medium`
      if (jsonObj.get("downsized_medium") != null && !jsonObj.get("downsized_medium").isJsonNull()) {
        GifImagesDownsizedMedium.validateJsonElement(jsonObj.get("downsized_medium"));
      }
      // validate the optional field `downsized_small`
      if (jsonObj.get("downsized_small") != null && !jsonObj.get("downsized_small").isJsonNull()) {
        GifImagesDownsizedSmall.validateJsonElement(jsonObj.get("downsized_small"));
      }
      // validate the optional field `downsized_still`
      if (jsonObj.get("downsized_still") != null && !jsonObj.get("downsized_still").isJsonNull()) {
        GifImagesDownsizedStill.validateJsonElement(jsonObj.get("downsized_still"));
      }
      // validate the optional field `fixed_height`
      if (jsonObj.get("fixed_height") != null && !jsonObj.get("fixed_height").isJsonNull()) {
        GifImagesFixedHeight.validateJsonElement(jsonObj.get("fixed_height"));
      }
      // validate the optional field `fixed_height_downsampled`
      if (jsonObj.get("fixed_height_downsampled") != null && !jsonObj.get("fixed_height_downsampled").isJsonNull()) {
        GifImagesFixedHeightDownsampled.validateJsonElement(jsonObj.get("fixed_height_downsampled"));
      }
      // validate the optional field `fixed_height_small`
      if (jsonObj.get("fixed_height_small") != null && !jsonObj.get("fixed_height_small").isJsonNull()) {
        GifImagesFixedHeightSmall.validateJsonElement(jsonObj.get("fixed_height_small"));
      }
      // validate the optional field `fixed_height_small_still`
      if (jsonObj.get("fixed_height_small_still") != null && !jsonObj.get("fixed_height_small_still").isJsonNull()) {
        GifImagesFixedHeightSmallStill.validateJsonElement(jsonObj.get("fixed_height_small_still"));
      }
      // validate the optional field `fixed_height_still`
      if (jsonObj.get("fixed_height_still") != null && !jsonObj.get("fixed_height_still").isJsonNull()) {
        GifImagesFixedHeightStill.validateJsonElement(jsonObj.get("fixed_height_still"));
      }
      // validate the optional field `fixed_width`
      if (jsonObj.get("fixed_width") != null && !jsonObj.get("fixed_width").isJsonNull()) {
        GifImagesFixedWidth.validateJsonElement(jsonObj.get("fixed_width"));
      }
      // validate the optional field `fixed_width_downsampled`
      if (jsonObj.get("fixed_width_downsampled") != null && !jsonObj.get("fixed_width_downsampled").isJsonNull()) {
        GifImagesFixedWidthDownsampled.validateJsonElement(jsonObj.get("fixed_width_downsampled"));
      }
      // validate the optional field `fixed_width_small`
      if (jsonObj.get("fixed_width_small") != null && !jsonObj.get("fixed_width_small").isJsonNull()) {
        GifImagesFixedWidthSmall.validateJsonElement(jsonObj.get("fixed_width_small"));
      }
      // validate the optional field `fixed_width_small_still`
      if (jsonObj.get("fixed_width_small_still") != null && !jsonObj.get("fixed_width_small_still").isJsonNull()) {
        GifImagesFixedWidthSmallStill.validateJsonElement(jsonObj.get("fixed_width_small_still"));
      }
      // validate the optional field `fixed_width_still`
      if (jsonObj.get("fixed_width_still") != null && !jsonObj.get("fixed_width_still").isJsonNull()) {
        GifImagesFixedWidthStill.validateJsonElement(jsonObj.get("fixed_width_still"));
      }
      // validate the optional field `looping`
      if (jsonObj.get("looping") != null && !jsonObj.get("looping").isJsonNull()) {
        GifImagesLooping.validateJsonElement(jsonObj.get("looping"));
      }
      // validate the optional field `original`
      if (jsonObj.get("original") != null && !jsonObj.get("original").isJsonNull()) {
        GifImagesOriginal.validateJsonElement(jsonObj.get("original"));
      }
      // validate the optional field `original_still`
      if (jsonObj.get("original_still") != null && !jsonObj.get("original_still").isJsonNull()) {
        GifImagesOriginalStill.validateJsonElement(jsonObj.get("original_still"));
      }
      // validate the optional field `preview`
      if (jsonObj.get("preview") != null && !jsonObj.get("preview").isJsonNull()) {
        GifImagesPreview.validateJsonElement(jsonObj.get("preview"));
      }
      // validate the optional field `preview_gif`
      if (jsonObj.get("preview_gif") != null && !jsonObj.get("preview_gif").isJsonNull()) {
        GifImagesPreviewGif.validateJsonElement(jsonObj.get("preview_gif"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GifImages.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GifImages' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GifImages> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GifImages.class));

       return (TypeAdapter<T>) new TypeAdapter<GifImages>() {
           @Override
           public void write(JsonWriter out, GifImages value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GifImages read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GifImages given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GifImages
   * @throws IOException if the JSON string is invalid with respect to GifImages
   */
  public static GifImages fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GifImages.class);
  }

  /**
   * Convert an instance of GifImages to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

