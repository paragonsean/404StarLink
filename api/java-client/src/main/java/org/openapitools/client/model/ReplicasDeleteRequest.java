/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
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
 * ReplicasDeleteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:20.455241-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReplicasDeleteRequest {
  public static final String SERIALIZED_NAME_ABANDON_INSTANCE = "abandonInstance";
  @SerializedName(SERIALIZED_NAME_ABANDON_INSTANCE)
  private Boolean abandonInstance;

  public ReplicasDeleteRequest() {
  }

  public ReplicasDeleteRequest abandonInstance(Boolean abandonInstance) {
    this.abandonInstance = abandonInstance;
    return this;
  }

  /**
   * Whether the instance resource represented by this replica should be deleted or abandoned. If abandoned, the replica will be deleted but the virtual machine instance will remain. By default, this is set to false and the instance will be deleted along with the replica.
   * @return abandonInstance
   */
  @javax.annotation.Nullable
  public Boolean getAbandonInstance() {
    return abandonInstance;
  }

  public void setAbandonInstance(Boolean abandonInstance) {
    this.abandonInstance = abandonInstance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicasDeleteRequest replicasDeleteRequest = (ReplicasDeleteRequest) o;
    return Objects.equals(this.abandonInstance, replicasDeleteRequest.abandonInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicasDeleteRequest {\n");
    sb.append("    abandonInstance: ").append(toIndentedString(abandonInstance)).append("\n");
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
    openapiFields.add("abandonInstance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReplicasDeleteRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReplicasDeleteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicasDeleteRequest is not found in the empty JSON string", ReplicasDeleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReplicasDeleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReplicasDeleteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicasDeleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicasDeleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicasDeleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicasDeleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicasDeleteRequest>() {
           @Override
           public void write(JsonWriter out, ReplicasDeleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReplicasDeleteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReplicasDeleteRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReplicasDeleteRequest
   * @throws IOException if the JSON string is invalid with respect to ReplicasDeleteRequest
   */
  public static ReplicasDeleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicasDeleteRequest.class);
  }

  /**
   * Convert an instance of ReplicasDeleteRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

