/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BuilderConfig;
import org.openapitools.client.model.Metadata;
import org.openapitools.client.model.Recipe;

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
 * InTotoProvenance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:53.550882-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class InTotoProvenance {
  public static final String SERIALIZED_NAME_BUILDER_CONFIG = "builderConfig";
  @SerializedName(SERIALIZED_NAME_BUILDER_CONFIG)
  private BuilderConfig builderConfig;

  public static final String SERIALIZED_NAME_MATERIALS = "materials";
  @SerializedName(SERIALIZED_NAME_MATERIALS)
  private List<String> materials = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;

  public static final String SERIALIZED_NAME_RECIPE = "recipe";
  @SerializedName(SERIALIZED_NAME_RECIPE)
  private Recipe recipe;

  public InTotoProvenance() {
  }

  public InTotoProvenance builderConfig(BuilderConfig builderConfig) {
    this.builderConfig = builderConfig;
    return this;
  }

  /**
   * Get builderConfig
   * @return builderConfig
   */
  @javax.annotation.Nullable
  public BuilderConfig getBuilderConfig() {
    return builderConfig;
  }

  public void setBuilderConfig(BuilderConfig builderConfig) {
    this.builderConfig = builderConfig;
  }


  public InTotoProvenance materials(List<String> materials) {
    this.materials = materials;
    return this;
  }

  public InTotoProvenance addMaterialsItem(String materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<>();
    }
    this.materials.add(materialsItem);
    return this;
  }

  /**
   * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
   * @return materials
   */
  @javax.annotation.Nullable
  public List<String> getMaterials() {
    return materials;
  }

  public void setMaterials(List<String> materials) {
    this.materials = materials;
  }


  public InTotoProvenance metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public InTotoProvenance recipe(Recipe recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * Get recipe
   * @return recipe
   */
  @javax.annotation.Nullable
  public Recipe getRecipe() {
    return recipe;
  }

  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InTotoProvenance inTotoProvenance = (InTotoProvenance) o;
    return Objects.equals(this.builderConfig, inTotoProvenance.builderConfig) &&
        Objects.equals(this.materials, inTotoProvenance.materials) &&
        Objects.equals(this.metadata, inTotoProvenance.metadata) &&
        Objects.equals(this.recipe, inTotoProvenance.recipe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builderConfig, materials, metadata, recipe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InTotoProvenance {\n");
    sb.append("    builderConfig: ").append(toIndentedString(builderConfig)).append("\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
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
    openapiFields.add("builderConfig");
    openapiFields.add("materials");
    openapiFields.add("metadata");
    openapiFields.add("recipe");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InTotoProvenance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InTotoProvenance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InTotoProvenance is not found in the empty JSON string", InTotoProvenance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InTotoProvenance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InTotoProvenance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `builderConfig`
      if (jsonObj.get("builderConfig") != null && !jsonObj.get("builderConfig").isJsonNull()) {
        BuilderConfig.validateJsonElement(jsonObj.get("builderConfig"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("materials") != null && !jsonObj.get("materials").isJsonNull() && !jsonObj.get("materials").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `materials` to be an array in the JSON string but got `%s`", jsonObj.get("materials").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        Metadata.validateJsonElement(jsonObj.get("metadata"));
      }
      // validate the optional field `recipe`
      if (jsonObj.get("recipe") != null && !jsonObj.get("recipe").isJsonNull()) {
        Recipe.validateJsonElement(jsonObj.get("recipe"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InTotoProvenance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InTotoProvenance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InTotoProvenance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InTotoProvenance.class));

       return (TypeAdapter<T>) new TypeAdapter<InTotoProvenance>() {
           @Override
           public void write(JsonWriter out, InTotoProvenance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InTotoProvenance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InTotoProvenance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InTotoProvenance
   * @throws IOException if the JSON string is invalid with respect to InTotoProvenance
   */
  public static InTotoProvenance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InTotoProvenance.class);
  }

  /**
   * Convert an instance of InTotoProvenance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

