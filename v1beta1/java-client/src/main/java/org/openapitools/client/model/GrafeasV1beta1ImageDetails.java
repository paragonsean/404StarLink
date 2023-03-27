/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
import org.openapitools.client.model.Derived;

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
 * Details of an image occurrence.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:01.336252-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GrafeasV1beta1ImageDetails {
  public static final String SERIALIZED_NAME_DERIVED_IMAGE = "derivedImage";
  @SerializedName(SERIALIZED_NAME_DERIVED_IMAGE)
  private Derived derivedImage;

  public GrafeasV1beta1ImageDetails() {
  }

  public GrafeasV1beta1ImageDetails derivedImage(Derived derivedImage) {
    this.derivedImage = derivedImage;
    return this;
  }

  /**
   * Get derivedImage
   * @return derivedImage
   */
  @javax.annotation.Nullable
  public Derived getDerivedImage() {
    return derivedImage;
  }

  public void setDerivedImage(Derived derivedImage) {
    this.derivedImage = derivedImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrafeasV1beta1ImageDetails grafeasV1beta1ImageDetails = (GrafeasV1beta1ImageDetails) o;
    return Objects.equals(this.derivedImage, grafeasV1beta1ImageDetails.derivedImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(derivedImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrafeasV1beta1ImageDetails {\n");
    sb.append("    derivedImage: ").append(toIndentedString(derivedImage)).append("\n");
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
    openapiFields.add("derivedImage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GrafeasV1beta1ImageDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GrafeasV1beta1ImageDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GrafeasV1beta1ImageDetails is not found in the empty JSON string", GrafeasV1beta1ImageDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GrafeasV1beta1ImageDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GrafeasV1beta1ImageDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `derivedImage`
      if (jsonObj.get("derivedImage") != null && !jsonObj.get("derivedImage").isJsonNull()) {
        Derived.validateJsonElement(jsonObj.get("derivedImage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GrafeasV1beta1ImageDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GrafeasV1beta1ImageDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GrafeasV1beta1ImageDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GrafeasV1beta1ImageDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GrafeasV1beta1ImageDetails>() {
           @Override
           public void write(JsonWriter out, GrafeasV1beta1ImageDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GrafeasV1beta1ImageDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GrafeasV1beta1ImageDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GrafeasV1beta1ImageDetails
   * @throws IOException if the JSON string is invalid with respect to GrafeasV1beta1ImageDetails
   */
  public static GrafeasV1beta1ImageDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GrafeasV1beta1ImageDetails.class);
  }

  /**
   * Convert an instance of GrafeasV1beta1ImageDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

