/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1alpha1
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
import org.openapitools.client.model.SlsaCompleteness;

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
 * Other properties of the build.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SlsaMetadata {
  public static final String SERIALIZED_NAME_BUILD_FINISHED_ON = "buildFinishedOn";
  @SerializedName(SERIALIZED_NAME_BUILD_FINISHED_ON)
  private String buildFinishedOn;

  public static final String SERIALIZED_NAME_BUILD_INVOCATION_ID = "buildInvocationId";
  @SerializedName(SERIALIZED_NAME_BUILD_INVOCATION_ID)
  private String buildInvocationId;

  public static final String SERIALIZED_NAME_BUILD_STARTED_ON = "buildStartedOn";
  @SerializedName(SERIALIZED_NAME_BUILD_STARTED_ON)
  private String buildStartedOn;

  public static final String SERIALIZED_NAME_COMPLETENESS = "completeness";
  @SerializedName(SERIALIZED_NAME_COMPLETENESS)
  private SlsaCompleteness completeness;

  public static final String SERIALIZED_NAME_REPRODUCIBLE = "reproducible";
  @SerializedName(SERIALIZED_NAME_REPRODUCIBLE)
  private Boolean reproducible;

  public SlsaMetadata() {
  }

  public SlsaMetadata buildFinishedOn(String buildFinishedOn) {
    this.buildFinishedOn = buildFinishedOn;
    return this;
  }

  /**
   * The timestamp of when the build completed.
   * @return buildFinishedOn
   */
  @javax.annotation.Nullable
  public String getBuildFinishedOn() {
    return buildFinishedOn;
  }

  public void setBuildFinishedOn(String buildFinishedOn) {
    this.buildFinishedOn = buildFinishedOn;
  }


  public SlsaMetadata buildInvocationId(String buildInvocationId) {
    this.buildInvocationId = buildInvocationId;
    return this;
  }

  /**
   * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
   * @return buildInvocationId
   */
  @javax.annotation.Nullable
  public String getBuildInvocationId() {
    return buildInvocationId;
  }

  public void setBuildInvocationId(String buildInvocationId) {
    this.buildInvocationId = buildInvocationId;
  }


  public SlsaMetadata buildStartedOn(String buildStartedOn) {
    this.buildStartedOn = buildStartedOn;
    return this;
  }

  /**
   * The timestamp of when the build started.
   * @return buildStartedOn
   */
  @javax.annotation.Nullable
  public String getBuildStartedOn() {
    return buildStartedOn;
  }

  public void setBuildStartedOn(String buildStartedOn) {
    this.buildStartedOn = buildStartedOn;
  }


  public SlsaMetadata completeness(SlsaCompleteness completeness) {
    this.completeness = completeness;
    return this;
  }

  /**
   * Get completeness
   * @return completeness
   */
  @javax.annotation.Nullable
  public SlsaCompleteness getCompleteness() {
    return completeness;
  }

  public void setCompleteness(SlsaCompleteness completeness) {
    this.completeness = completeness;
  }


  public SlsaMetadata reproducible(Boolean reproducible) {
    this.reproducible = reproducible;
    return this;
  }

  /**
   * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
   * @return reproducible
   */
  @javax.annotation.Nullable
  public Boolean getReproducible() {
    return reproducible;
  }

  public void setReproducible(Boolean reproducible) {
    this.reproducible = reproducible;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlsaMetadata slsaMetadata = (SlsaMetadata) o;
    return Objects.equals(this.buildFinishedOn, slsaMetadata.buildFinishedOn) &&
        Objects.equals(this.buildInvocationId, slsaMetadata.buildInvocationId) &&
        Objects.equals(this.buildStartedOn, slsaMetadata.buildStartedOn) &&
        Objects.equals(this.completeness, slsaMetadata.completeness) &&
        Objects.equals(this.reproducible, slsaMetadata.reproducible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildFinishedOn, buildInvocationId, buildStartedOn, completeness, reproducible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlsaMetadata {\n");
    sb.append("    buildFinishedOn: ").append(toIndentedString(buildFinishedOn)).append("\n");
    sb.append("    buildInvocationId: ").append(toIndentedString(buildInvocationId)).append("\n");
    sb.append("    buildStartedOn: ").append(toIndentedString(buildStartedOn)).append("\n");
    sb.append("    completeness: ").append(toIndentedString(completeness)).append("\n");
    sb.append("    reproducible: ").append(toIndentedString(reproducible)).append("\n");
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
    openapiFields.add("buildFinishedOn");
    openapiFields.add("buildInvocationId");
    openapiFields.add("buildStartedOn");
    openapiFields.add("completeness");
    openapiFields.add("reproducible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SlsaMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SlsaMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SlsaMetadata is not found in the empty JSON string", SlsaMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SlsaMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SlsaMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("buildFinishedOn") != null && !jsonObj.get("buildFinishedOn").isJsonNull()) && !jsonObj.get("buildFinishedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildFinishedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildFinishedOn").toString()));
      }
      if ((jsonObj.get("buildInvocationId") != null && !jsonObj.get("buildInvocationId").isJsonNull()) && !jsonObj.get("buildInvocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildInvocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildInvocationId").toString()));
      }
      if ((jsonObj.get("buildStartedOn") != null && !jsonObj.get("buildStartedOn").isJsonNull()) && !jsonObj.get("buildStartedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildStartedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildStartedOn").toString()));
      }
      // validate the optional field `completeness`
      if (jsonObj.get("completeness") != null && !jsonObj.get("completeness").isJsonNull()) {
        SlsaCompleteness.validateJsonElement(jsonObj.get("completeness"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SlsaMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SlsaMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SlsaMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SlsaMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<SlsaMetadata>() {
           @Override
           public void write(JsonWriter out, SlsaMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SlsaMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SlsaMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SlsaMetadata
   * @throws IOException if the JSON string is invalid with respect to SlsaMetadata
   */
  public static SlsaMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SlsaMetadata.class);
  }

  /**
   * Convert an instance of SlsaMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

