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
import org.openapitools.client.model.BuildProvenance;
import org.openapitools.client.model.InTotoProvenance;
import org.openapitools.client.model.InTotoStatement;

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
 * Message encapsulating build provenance details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BuildDetails {
  public static final String SERIALIZED_NAME_INTOTO_PROVENANCE = "intotoProvenance";
  @SerializedName(SERIALIZED_NAME_INTOTO_PROVENANCE)
  private InTotoProvenance intotoProvenance;

  public static final String SERIALIZED_NAME_INTOTO_STATEMENT = "intotoStatement";
  @SerializedName(SERIALIZED_NAME_INTOTO_STATEMENT)
  private InTotoStatement intotoStatement;

  public static final String SERIALIZED_NAME_PROVENANCE = "provenance";
  @SerializedName(SERIALIZED_NAME_PROVENANCE)
  private BuildProvenance provenance;

  public static final String SERIALIZED_NAME_PROVENANCE_BYTES = "provenanceBytes";
  @SerializedName(SERIALIZED_NAME_PROVENANCE_BYTES)
  private String provenanceBytes;

  public BuildDetails() {
  }

  public BuildDetails intotoProvenance(InTotoProvenance intotoProvenance) {
    this.intotoProvenance = intotoProvenance;
    return this;
  }

  /**
   * Get intotoProvenance
   * @return intotoProvenance
   */
  @javax.annotation.Nullable
  public InTotoProvenance getIntotoProvenance() {
    return intotoProvenance;
  }

  public void setIntotoProvenance(InTotoProvenance intotoProvenance) {
    this.intotoProvenance = intotoProvenance;
  }


  public BuildDetails intotoStatement(InTotoStatement intotoStatement) {
    this.intotoStatement = intotoStatement;
    return this;
  }

  /**
   * Get intotoStatement
   * @return intotoStatement
   */
  @javax.annotation.Nullable
  public InTotoStatement getIntotoStatement() {
    return intotoStatement;
  }

  public void setIntotoStatement(InTotoStatement intotoStatement) {
    this.intotoStatement = intotoStatement;
  }


  public BuildDetails provenance(BuildProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Get provenance
   * @return provenance
   */
  @javax.annotation.Nullable
  public BuildProvenance getProvenance() {
    return provenance;
  }

  public void setProvenance(BuildProvenance provenance) {
    this.provenance = provenance;
  }


  public BuildDetails provenanceBytes(String provenanceBytes) {
    this.provenanceBytes = provenanceBytes;
    return this;
  }

  /**
   * Serialized JSON representation of the provenance, used in generating the &#x60;BuildSignature&#x60; in the corresponding Result. After verifying the signature, &#x60;provenance_bytes&#x60; can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
   * @return provenanceBytes
   */
  @javax.annotation.Nullable
  public String getProvenanceBytes() {
    return provenanceBytes;
  }

  public void setProvenanceBytes(String provenanceBytes) {
    this.provenanceBytes = provenanceBytes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildDetails buildDetails = (BuildDetails) o;
    return Objects.equals(this.intotoProvenance, buildDetails.intotoProvenance) &&
        Objects.equals(this.intotoStatement, buildDetails.intotoStatement) &&
        Objects.equals(this.provenance, buildDetails.provenance) &&
        Objects.equals(this.provenanceBytes, buildDetails.provenanceBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intotoProvenance, intotoStatement, provenance, provenanceBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildDetails {\n");
    sb.append("    intotoProvenance: ").append(toIndentedString(intotoProvenance)).append("\n");
    sb.append("    intotoStatement: ").append(toIndentedString(intotoStatement)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    provenanceBytes: ").append(toIndentedString(provenanceBytes)).append("\n");
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
    openapiFields.add("intotoProvenance");
    openapiFields.add("intotoStatement");
    openapiFields.add("provenance");
    openapiFields.add("provenanceBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BuildDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BuildDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuildDetails is not found in the empty JSON string", BuildDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BuildDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuildDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `intotoProvenance`
      if (jsonObj.get("intotoProvenance") != null && !jsonObj.get("intotoProvenance").isJsonNull()) {
        InTotoProvenance.validateJsonElement(jsonObj.get("intotoProvenance"));
      }
      // validate the optional field `intotoStatement`
      if (jsonObj.get("intotoStatement") != null && !jsonObj.get("intotoStatement").isJsonNull()) {
        InTotoStatement.validateJsonElement(jsonObj.get("intotoStatement"));
      }
      // validate the optional field `provenance`
      if (jsonObj.get("provenance") != null && !jsonObj.get("provenance").isJsonNull()) {
        BuildProvenance.validateJsonElement(jsonObj.get("provenance"));
      }
      if ((jsonObj.get("provenanceBytes") != null && !jsonObj.get("provenanceBytes").isJsonNull()) && !jsonObj.get("provenanceBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provenanceBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provenanceBytes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuildDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuildDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuildDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuildDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BuildDetails>() {
           @Override
           public void write(JsonWriter out, BuildDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuildDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BuildDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BuildDetails
   * @throws IOException if the JSON string is invalid with respect to BuildDetails
   */
  public static BuildDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuildDetails.class);
  }

  /**
   * Convert an instance of BuildDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

