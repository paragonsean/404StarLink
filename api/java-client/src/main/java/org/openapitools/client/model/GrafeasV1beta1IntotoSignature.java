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
 * A signature object consists of the KeyID used and the signature itself.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:49.449403-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GrafeasV1beta1IntotoSignature {
  public static final String SERIALIZED_NAME_KEYID = "keyid";
  @SerializedName(SERIALIZED_NAME_KEYID)
  private String keyid;

  public static final String SERIALIZED_NAME_SIG = "sig";
  @SerializedName(SERIALIZED_NAME_SIG)
  private String sig;

  public GrafeasV1beta1IntotoSignature() {
  }

  public GrafeasV1beta1IntotoSignature keyid(String keyid) {
    this.keyid = keyid;
    return this;
  }

  /**
   * Get keyid
   * @return keyid
   */
  @javax.annotation.Nullable
  public String getKeyid() {
    return keyid;
  }

  public void setKeyid(String keyid) {
    this.keyid = keyid;
  }


  public GrafeasV1beta1IntotoSignature sig(String sig) {
    this.sig = sig;
    return this;
  }

  /**
   * Get sig
   * @return sig
   */
  @javax.annotation.Nullable
  public String getSig() {
    return sig;
  }

  public void setSig(String sig) {
    this.sig = sig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrafeasV1beta1IntotoSignature grafeasV1beta1IntotoSignature = (GrafeasV1beta1IntotoSignature) o;
    return Objects.equals(this.keyid, grafeasV1beta1IntotoSignature.keyid) &&
        Objects.equals(this.sig, grafeasV1beta1IntotoSignature.sig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyid, sig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrafeasV1beta1IntotoSignature {\n");
    sb.append("    keyid: ").append(toIndentedString(keyid)).append("\n");
    sb.append("    sig: ").append(toIndentedString(sig)).append("\n");
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
    openapiFields.add("keyid");
    openapiFields.add("sig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GrafeasV1beta1IntotoSignature
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GrafeasV1beta1IntotoSignature.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GrafeasV1beta1IntotoSignature is not found in the empty JSON string", GrafeasV1beta1IntotoSignature.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GrafeasV1beta1IntotoSignature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GrafeasV1beta1IntotoSignature` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyid") != null && !jsonObj.get("keyid").isJsonNull()) && !jsonObj.get("keyid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyid").toString()));
      }
      if ((jsonObj.get("sig") != null && !jsonObj.get("sig").isJsonNull()) && !jsonObj.get("sig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sig").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GrafeasV1beta1IntotoSignature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GrafeasV1beta1IntotoSignature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GrafeasV1beta1IntotoSignature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GrafeasV1beta1IntotoSignature.class));

       return (TypeAdapter<T>) new TypeAdapter<GrafeasV1beta1IntotoSignature>() {
           @Override
           public void write(JsonWriter out, GrafeasV1beta1IntotoSignature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GrafeasV1beta1IntotoSignature read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GrafeasV1beta1IntotoSignature given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GrafeasV1beta1IntotoSignature
   * @throws IOException if the JSON string is invalid with respect to GrafeasV1beta1IntotoSignature
   */
  public static GrafeasV1beta1IntotoSignature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GrafeasV1beta1IntotoSignature.class);
  }

  /**
   * Convert an instance of GrafeasV1beta1IntotoSignature to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

