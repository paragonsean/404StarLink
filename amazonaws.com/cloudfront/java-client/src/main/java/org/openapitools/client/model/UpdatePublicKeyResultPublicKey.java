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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.PublicKeyPublicKeyConfig;

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
 * UpdatePublicKeyResultPublicKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdatePublicKeyResultPublicKey {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_CONFIG = "PublicKeyConfig";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_CONFIG)
  private PublicKeyPublicKeyConfig publicKeyConfig;

  public UpdatePublicKeyResultPublicKey() {
  }

  public UpdatePublicKeyResultPublicKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public UpdatePublicKeyResultPublicKey createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public UpdatePublicKeyResultPublicKey publicKeyConfig(PublicKeyPublicKeyConfig publicKeyConfig) {
    this.publicKeyConfig = publicKeyConfig;
    return this;
  }

  /**
   * Get publicKeyConfig
   * @return publicKeyConfig
   */
  @javax.annotation.Nonnull
  public PublicKeyPublicKeyConfig getPublicKeyConfig() {
    return publicKeyConfig;
  }

  public void setPublicKeyConfig(PublicKeyPublicKeyConfig publicKeyConfig) {
    this.publicKeyConfig = publicKeyConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePublicKeyResultPublicKey updatePublicKeyResultPublicKey = (UpdatePublicKeyResultPublicKey) o;
    return Objects.equals(this.id, updatePublicKeyResultPublicKey.id) &&
        Objects.equals(this.createdTime, updatePublicKeyResultPublicKey.createdTime) &&
        Objects.equals(this.publicKeyConfig, updatePublicKeyResultPublicKey.publicKeyConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, publicKeyConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePublicKeyResultPublicKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    publicKeyConfig: ").append(toIndentedString(publicKeyConfig)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("CreatedTime");
    openapiFields.add("PublicKeyConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("CreatedTime");
    openapiRequiredFields.add("PublicKeyConfig");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePublicKeyResultPublicKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePublicKeyResultPublicKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePublicKeyResultPublicKey is not found in the empty JSON string", UpdatePublicKeyResultPublicKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePublicKeyResultPublicKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePublicKeyResultPublicKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePublicKeyResultPublicKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the required field `CreatedTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("CreatedTime"));
      // validate the required field `PublicKeyConfig`
      PublicKeyPublicKeyConfig.validateJsonElement(jsonObj.get("PublicKeyConfig"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePublicKeyResultPublicKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePublicKeyResultPublicKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePublicKeyResultPublicKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePublicKeyResultPublicKey.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePublicKeyResultPublicKey>() {
           @Override
           public void write(JsonWriter out, UpdatePublicKeyResultPublicKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePublicKeyResultPublicKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdatePublicKeyResultPublicKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePublicKeyResultPublicKey
   * @throws IOException if the JSON string is invalid with respect to UpdatePublicKeyResultPublicKey
   */
  public static UpdatePublicKeyResultPublicKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePublicKeyResultPublicKey.class);
  }

  /**
   * Convert an instance of UpdatePublicKeyResultPublicKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

