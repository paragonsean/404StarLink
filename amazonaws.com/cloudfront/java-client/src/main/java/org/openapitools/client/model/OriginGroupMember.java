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
 * An origin in an origin group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class OriginGroupMember {
  public static final String SERIALIZED_NAME_ORIGIN_ID = "OriginId";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ID)
  private String originId;

  public OriginGroupMember() {
  }

  public OriginGroupMember originId(String originId) {
    this.originId = originId;
    return this;
  }

  /**
   * Get originId
   * @return originId
   */
  @javax.annotation.Nonnull
  public String getOriginId() {
    return originId;
  }

  public void setOriginId(String originId) {
    this.originId = originId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginGroupMember originGroupMember = (OriginGroupMember) o;
    return Objects.equals(this.originId, originGroupMember.originId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginGroupMember {\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
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
    openapiFields.add("OriginId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("OriginId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OriginGroupMember
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OriginGroupMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginGroupMember is not found in the empty JSON string", OriginGroupMember.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OriginGroupMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginGroupMember` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginGroupMember.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `OriginId`
      String.validateJsonElement(jsonObj.get("OriginId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginGroupMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginGroupMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginGroupMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginGroupMember.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginGroupMember>() {
           @Override
           public void write(JsonWriter out, OriginGroupMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginGroupMember read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OriginGroupMember given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OriginGroupMember
   * @throws IOException if the JSON string is invalid with respect to OriginGroupMember
   */
  public static OriginGroupMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginGroupMember.class);
  }

  /**
   * Convert an instance of OriginGroupMember to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

