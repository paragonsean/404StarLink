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
 * Details about how a build should be executed on a &#x60;WorkerPool&#x60;. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:59.945291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The &#x60;WorkerPool&#x60; resource to execute the build on. You must have &#x60;cloudbuild.workerpools.use&#x60; on the project hosting the WorkerPool. Format projects/{project}/locations/{location}/workerPools/{workerPoolId}
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption containeranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption = (ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption) o;
    return Objects.equals(this.name, containeranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1BuildOptionsPoolOption to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

