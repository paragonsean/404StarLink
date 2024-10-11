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
import org.openapitools.client.model.InvalidationInvalidationBatch;

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
 * An invalidation. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Invalidation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATE_TIME = "CreateTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_INVALIDATION_BATCH = "InvalidationBatch";
  @SerializedName(SERIALIZED_NAME_INVALIDATION_BATCH)
  private InvalidationInvalidationBatch invalidationBatch;

  public Invalidation() {
  }

  public Invalidation id(String id) {
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


  public Invalidation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Invalidation createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }


  public Invalidation invalidationBatch(InvalidationInvalidationBatch invalidationBatch) {
    this.invalidationBatch = invalidationBatch;
    return this;
  }

  /**
   * Get invalidationBatch
   * @return invalidationBatch
   */
  @javax.annotation.Nonnull
  public InvalidationInvalidationBatch getInvalidationBatch() {
    return invalidationBatch;
  }

  public void setInvalidationBatch(InvalidationInvalidationBatch invalidationBatch) {
    this.invalidationBatch = invalidationBatch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invalidation invalidation = (Invalidation) o;
    return Objects.equals(this.id, invalidation.id) &&
        Objects.equals(this.status, invalidation.status) &&
        Objects.equals(this.createTime, invalidation.createTime) &&
        Objects.equals(this.invalidationBatch, invalidation.invalidationBatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, createTime, invalidationBatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invalidation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    invalidationBatch: ").append(toIndentedString(invalidationBatch)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("CreateTime");
    openapiFields.add("InvalidationBatch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("CreateTime");
    openapiRequiredFields.add("InvalidationBatch");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Invalidation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Invalidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invalidation is not found in the empty JSON string", Invalidation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Invalidation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invalidation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Invalidation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the required field `Status`
      String.validateJsonElement(jsonObj.get("Status"));
      // validate the required field `CreateTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("CreateTime"));
      // validate the required field `InvalidationBatch`
      InvalidationInvalidationBatch.validateJsonElement(jsonObj.get("InvalidationBatch"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invalidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invalidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invalidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invalidation.class));

       return (TypeAdapter<T>) new TypeAdapter<Invalidation>() {
           @Override
           public void write(JsonWriter out, Invalidation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invalidation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Invalidation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Invalidation
   * @throws IOException if the JSON string is invalid with respect to Invalidation
   */
  public static Invalidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invalidation.class);
  }

  /**
   * Convert an instance of Invalidation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

