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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret;

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
 * Secrets and secret environment variables.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets {
  public static final String SERIALIZED_NAME_INLINE = "inline";
  @SerializedName(SERIALIZED_NAME_INLINE)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret> inline = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECRET_MANAGER = "secretManager";
  @SerializedName(SERIALIZED_NAME_SECRET_MANAGER)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret> secretManager = new ArrayList<>();

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets inline(List<ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret> inline) {
    this.inline = inline;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets addInlineItem(ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret inlineItem) {
    if (this.inline == null) {
      this.inline = new ArrayList<>();
    }
    this.inline.add(inlineItem);
    return this;
  }

  /**
   * Secrets encrypted with KMS key and the associated secret environment variable.
   * @return inline
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret> getInline() {
    return inline;
  }

  public void setInline(List<ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret> inline) {
    this.inline = inline;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets secretManager(List<ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret> secretManager) {
    this.secretManager = secretManager;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets addSecretManagerItem(ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret secretManagerItem) {
    if (this.secretManager == null) {
      this.secretManager = new ArrayList<>();
    }
    this.secretManager.add(secretManagerItem);
    return this;
  }

  /**
   * Secrets in Secret Manager and associated secret environment variable.
   * @return secretManager
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret> getSecretManager() {
    return secretManager;
  }

  public void setSecretManager(List<ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret> secretManager) {
    this.secretManager = secretManager;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets containeranalysisGoogleDevtoolsCloudbuildV1Secrets = (ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets) o;
    return Objects.equals(this.inline, containeranalysisGoogleDevtoolsCloudbuildV1Secrets.inline) &&
        Objects.equals(this.secretManager, containeranalysisGoogleDevtoolsCloudbuildV1Secrets.secretManager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inline, secretManager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets {\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
    sb.append("    secretManager: ").append(toIndentedString(secretManager)).append("\n");
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
    openapiFields.add("inline");
    openapiFields.add("secretManager");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("inline") != null && !jsonObj.get("inline").isJsonNull()) {
        JsonArray jsonArrayinline = jsonObj.getAsJsonArray("inline");
        if (jsonArrayinline != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inline").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inline` to be an array in the JSON string but got `%s`", jsonObj.get("inline").toString()));
          }

          // validate the optional field `inline` (array)
          for (int i = 0; i < jsonArrayinline.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret.validateJsonElement(jsonArrayinline.get(i));
          };
        }
      }
      if (jsonObj.get("secretManager") != null && !jsonObj.get("secretManager").isJsonNull()) {
        JsonArray jsonArraysecretManager = jsonObj.getAsJsonArray("secretManager");
        if (jsonArraysecretManager != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secretManager").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secretManager` to be an array in the JSON string but got `%s`", jsonObj.get("secretManager").toString()));
          }

          // validate the optional field `secretManager` (array)
          for (int i = 0; i < jsonArraysecretManager.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret.validateJsonElement(jsonArraysecretManager.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

