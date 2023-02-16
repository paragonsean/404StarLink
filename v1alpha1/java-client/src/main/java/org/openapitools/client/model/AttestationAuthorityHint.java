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
 * This submessage provides human-readable hints about the purpose of the AttestationAuthority. Because the name of a Note acts as its resource reference, it is important to disambiguate the canonical name of the Note (which might be a UUID for security purposes) from \&quot;readable\&quot; names more suitable for debug output. Note that these hints should NOT be used to look up AttestationAuthorities in security sensitive contexts, such as when looking up Attestations to verify.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:03.965307-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AttestationAuthorityHint {
  public static final String SERIALIZED_NAME_HUMAN_READABLE_NAME = "humanReadableName";
  @SerializedName(SERIALIZED_NAME_HUMAN_READABLE_NAME)
  private String humanReadableName;

  public AttestationAuthorityHint() {
  }

  public AttestationAuthorityHint humanReadableName(String humanReadableName) {
    this.humanReadableName = humanReadableName;
    return this;
  }

  /**
   * The human readable name of this Attestation Authority, for example \&quot;qa\&quot;.
   * @return humanReadableName
   */
  @javax.annotation.Nullable
  public String getHumanReadableName() {
    return humanReadableName;
  }

  public void setHumanReadableName(String humanReadableName) {
    this.humanReadableName = humanReadableName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttestationAuthorityHint attestationAuthorityHint = (AttestationAuthorityHint) o;
    return Objects.equals(this.humanReadableName, attestationAuthorityHint.humanReadableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humanReadableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttestationAuthorityHint {\n");
    sb.append("    humanReadableName: ").append(toIndentedString(humanReadableName)).append("\n");
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
    openapiFields.add("humanReadableName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttestationAuthorityHint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttestationAuthorityHint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttestationAuthorityHint is not found in the empty JSON string", AttestationAuthorityHint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AttestationAuthorityHint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttestationAuthorityHint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("humanReadableName") != null && !jsonObj.get("humanReadableName").isJsonNull()) && !jsonObj.get("humanReadableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `humanReadableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("humanReadableName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttestationAuthorityHint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttestationAuthorityHint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttestationAuthorityHint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttestationAuthorityHint.class));

       return (TypeAdapter<T>) new TypeAdapter<AttestationAuthorityHint>() {
           @Override
           public void write(JsonWriter out, AttestationAuthorityHint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttestationAuthorityHint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AttestationAuthorityHint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttestationAuthorityHint
   * @throws IOException if the JSON string is invalid with respect to AttestationAuthorityHint
   */
  public static AttestationAuthorityHint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttestationAuthorityHint.class);
  }

  /**
   * Convert an instance of AttestationAuthorityHint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

