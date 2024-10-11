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
import java.util.Arrays;
import java.util.Map;

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
 * Reference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Reference {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "result_type";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private String resultType;

  public static final String SERIALIZED_NAME_HREF_DEPRECATED = "href_deprecated";
  @SerializedName(SERIALIZED_NAME_HREF_DEPRECATED)
  private Boolean hrefDeprecated;

  public static final String SERIALIZED_NAME_RESULT_TYPE_DEPRECATED = "result_type_deprecated";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE_DEPRECATED)
  private Boolean resultTypeDeprecated;

  public Reference() {
  }

  public Reference href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   */
  @javax.annotation.Nonnull
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public Reference resultType(String resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Get resultType
   * @return resultType
   */
  @javax.annotation.Nonnull
  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }


  public Reference hrefDeprecated(Boolean hrefDeprecated) {
    this.hrefDeprecated = hrefDeprecated;
    return this;
  }

  /**
   * Get hrefDeprecated
   * @return hrefDeprecated
   */
  @javax.annotation.Nullable
  public Boolean getHrefDeprecated() {
    return hrefDeprecated;
  }

  public void setHrefDeprecated(Boolean hrefDeprecated) {
    this.hrefDeprecated = hrefDeprecated;
  }


  public Reference resultTypeDeprecated(Boolean resultTypeDeprecated) {
    this.resultTypeDeprecated = resultTypeDeprecated;
    return this;
  }

  /**
   * Get resultTypeDeprecated
   * @return resultTypeDeprecated
   */
  @javax.annotation.Nullable
  public Boolean getResultTypeDeprecated() {
    return resultTypeDeprecated;
  }

  public void setResultTypeDeprecated(Boolean resultTypeDeprecated) {
    this.resultTypeDeprecated = resultTypeDeprecated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.href, reference.href) &&
        Objects.equals(this.resultType, reference.resultType) &&
        Objects.equals(this.hrefDeprecated, reference.hrefDeprecated) &&
        Objects.equals(this.resultTypeDeprecated, reference.resultTypeDeprecated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, resultType, hrefDeprecated, resultTypeDeprecated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    hrefDeprecated: ").append(toIndentedString(hrefDeprecated)).append("\n");
    sb.append("    resultTypeDeprecated: ").append(toIndentedString(resultTypeDeprecated)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("result_type");
    openapiFields.add("href_deprecated");
    openapiFields.add("result_type_deprecated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("result_type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Reference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reference is not found in the empty JSON string", Reference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Reference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("result_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reference.class));

       return (TypeAdapter<T>) new TypeAdapter<Reference>() {
           @Override
           public void write(JsonWriter out, Reference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Reference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Reference
   * @throws IOException if the JSON string is invalid with respect to Reference
   */
  public static Reference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reference.class);
  }

  /**
   * Convert an instance of Reference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

