/*
 * Smart Device Management API
 * Allow select enterprise partners to access, control, and manage Google and Nest devices programmatically.
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
 * Represents device relationships, for instance, structure/room to which the device is assigned to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:03.373841-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleHomeEnterpriseSdmV1ParentRelation {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public GoogleHomeEnterpriseSdmV1ParentRelation() {
  }

  public GoogleHomeEnterpriseSdmV1ParentRelation(
     String displayName, 
     String parent
  ) {
    this();
    this.displayName = displayName;
    this.parent = parent;
  }

  /**
   * Output only. The custom name of the relation -- e.g., structure/room where the device is assigned to.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }



  /**
   * Output only. The name of the relation -- e.g., structure/room where the device is assigned to. For example: \&quot;enterprises/XYZ/structures/ABC\&quot; or \&quot;enterprises/XYZ/structures/ABC/rooms/123\&quot;
   * @return parent
   */
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleHomeEnterpriseSdmV1ParentRelation googleHomeEnterpriseSdmV1ParentRelation = (GoogleHomeEnterpriseSdmV1ParentRelation) o;
    return Objects.equals(this.displayName, googleHomeEnterpriseSdmV1ParentRelation.displayName) &&
        Objects.equals(this.parent, googleHomeEnterpriseSdmV1ParentRelation.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleHomeEnterpriseSdmV1ParentRelation {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("parent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleHomeEnterpriseSdmV1ParentRelation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleHomeEnterpriseSdmV1ParentRelation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleHomeEnterpriseSdmV1ParentRelation is not found in the empty JSON string", GoogleHomeEnterpriseSdmV1ParentRelation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleHomeEnterpriseSdmV1ParentRelation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleHomeEnterpriseSdmV1ParentRelation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleHomeEnterpriseSdmV1ParentRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleHomeEnterpriseSdmV1ParentRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleHomeEnterpriseSdmV1ParentRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleHomeEnterpriseSdmV1ParentRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleHomeEnterpriseSdmV1ParentRelation>() {
           @Override
           public void write(JsonWriter out, GoogleHomeEnterpriseSdmV1ParentRelation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleHomeEnterpriseSdmV1ParentRelation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleHomeEnterpriseSdmV1ParentRelation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleHomeEnterpriseSdmV1ParentRelation
   * @throws IOException if the JSON string is invalid with respect to GoogleHomeEnterpriseSdmV1ParentRelation
   */
  public static GoogleHomeEnterpriseSdmV1ParentRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleHomeEnterpriseSdmV1ParentRelation.class);
  }

  /**
   * Convert an instance of GoogleHomeEnterpriseSdmV1ParentRelation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

