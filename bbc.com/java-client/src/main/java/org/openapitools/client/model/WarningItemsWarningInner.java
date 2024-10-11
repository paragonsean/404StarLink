/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import org.openapitools.client.model.WarningItemsWarningInnerWarningInner;

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
 * WarningItemsWarningInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class WarningItemsWarningInner {
  public static final String SERIALIZED_NAME_HASH_TEXT = "#text";
  @SerializedName(SERIALIZED_NAME_HASH_TEXT)
  private String hashText;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "short_description";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private List<WarningItemsWarningInnerWarningInner> warning = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private String warningCode;

  public WarningItemsWarningInner() {
  }

  public WarningItemsWarningInner hashText(String hashText) {
    this.hashText = hashText;
    return this;
  }

  /**
   * Get hashText
   * @return hashText
   */
  @javax.annotation.Nullable
  public String getHashText() {
    return hashText;
  }

  public void setHashText(String hashText) {
    this.hashText = hashText;
  }


  public WarningItemsWarningInner shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Get shortDescription
   * @return shortDescription
   */
  @javax.annotation.Nullable
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public WarningItemsWarningInner warning(List<WarningItemsWarningInnerWarningInner> warning) {
    this.warning = warning;
    return this;
  }

  public WarningItemsWarningInner addWarningItem(WarningItemsWarningInnerWarningInner warningItem) {
    if (this.warning == null) {
      this.warning = new ArrayList<>();
    }
    this.warning.add(warningItem);
    return this;
  }

  /**
   * Get warning
   * @return warning
   */
  @javax.annotation.Nullable
  public List<WarningItemsWarningInnerWarningInner> getWarning() {
    return warning;
  }

  public void setWarning(List<WarningItemsWarningInnerWarningInner> warning) {
    this.warning = warning;
  }


  public WarningItemsWarningInner warningCode(String warningCode) {
    this.warningCode = warningCode;
    return this;
  }

  /**
   * Get warningCode
   * @return warningCode
   */
  @javax.annotation.Nullable
  public String getWarningCode() {
    return warningCode;
  }

  public void setWarningCode(String warningCode) {
    this.warningCode = warningCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarningItemsWarningInner warningItemsWarningInner = (WarningItemsWarningInner) o;
    return Objects.equals(this.hashText, warningItemsWarningInner.hashText) &&
        Objects.equals(this.shortDescription, warningItemsWarningInner.shortDescription) &&
        Objects.equals(this.warning, warningItemsWarningInner.warning) &&
        Objects.equals(this.warningCode, warningItemsWarningInner.warningCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashText, shortDescription, warning, warningCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningItemsWarningInner {\n");
    sb.append("    hashText: ").append(toIndentedString(hashText)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
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
    openapiFields.add("#text");
    openapiFields.add("short_description");
    openapiFields.add("warning");
    openapiFields.add("warning_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WarningItemsWarningInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WarningItemsWarningInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WarningItemsWarningInner is not found in the empty JSON string", WarningItemsWarningInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WarningItemsWarningInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WarningItemsWarningInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("#text") != null && !jsonObj.get("#text").isJsonNull()) && !jsonObj.get("#text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `#text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("#text").toString()));
      }
      if ((jsonObj.get("short_description") != null && !jsonObj.get("short_description").isJsonNull()) && !jsonObj.get("short_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_description").toString()));
      }
      if (jsonObj.get("warning") != null && !jsonObj.get("warning").isJsonNull()) {
        JsonArray jsonArraywarning = jsonObj.getAsJsonArray("warning");
        if (jsonArraywarning != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warning").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warning` to be an array in the JSON string but got `%s`", jsonObj.get("warning").toString()));
          }

          // validate the optional field `warning` (array)
          for (int i = 0; i < jsonArraywarning.size(); i++) {
            WarningItemsWarningInnerWarningInner.validateJsonElement(jsonArraywarning.get(i));
          };
        }
      }
      if ((jsonObj.get("warning_code") != null && !jsonObj.get("warning_code").isJsonNull()) && !jsonObj.get("warning_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WarningItemsWarningInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WarningItemsWarningInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WarningItemsWarningInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WarningItemsWarningInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WarningItemsWarningInner>() {
           @Override
           public void write(JsonWriter out, WarningItemsWarningInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WarningItemsWarningInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WarningItemsWarningInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WarningItemsWarningInner
   * @throws IOException if the JSON string is invalid with respect to WarningItemsWarningInner
   */
  public static WarningItemsWarningInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WarningItemsWarningInner.class);
  }

  /**
   * Convert an instance of WarningItemsWarningInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

