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
 * An alias to a repo revision.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleDevtoolsContaineranalysisV1alpha1AliasContext {
  /**
   * The alias kind.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    KIND_UNSPECIFIED("KIND_UNSPECIFIED"),
    
    FIXED("FIXED"),
    
    MOVABLE("MOVABLE"),
    
    OTHER("OTHER");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public GoogleDevtoolsContaineranalysisV1alpha1AliasContext() {
  }

  public GoogleDevtoolsContaineranalysisV1alpha1AliasContext kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The alias kind.
   * @return kind
   */
  @javax.annotation.Nullable
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public GoogleDevtoolsContaineranalysisV1alpha1AliasContext name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The alias name.
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
    GoogleDevtoolsContaineranalysisV1alpha1AliasContext googleDevtoolsContaineranalysisV1alpha1AliasContext = (GoogleDevtoolsContaineranalysisV1alpha1AliasContext) o;
    return Objects.equals(this.kind, googleDevtoolsContaineranalysisV1alpha1AliasContext.kind) &&
        Objects.equals(this.name, googleDevtoolsContaineranalysisV1alpha1AliasContext.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDevtoolsContaineranalysisV1alpha1AliasContext {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
    openapiFields.add("kind");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleDevtoolsContaineranalysisV1alpha1AliasContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleDevtoolsContaineranalysisV1alpha1AliasContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleDevtoolsContaineranalysisV1alpha1AliasContext is not found in the empty JSON string", GoogleDevtoolsContaineranalysisV1alpha1AliasContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleDevtoolsContaineranalysisV1alpha1AliasContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleDevtoolsContaineranalysisV1alpha1AliasContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        KindEnum.validateJsonElement(jsonObj.get("kind"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleDevtoolsContaineranalysisV1alpha1AliasContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleDevtoolsContaineranalysisV1alpha1AliasContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleDevtoolsContaineranalysisV1alpha1AliasContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleDevtoolsContaineranalysisV1alpha1AliasContext.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleDevtoolsContaineranalysisV1alpha1AliasContext>() {
           @Override
           public void write(JsonWriter out, GoogleDevtoolsContaineranalysisV1alpha1AliasContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleDevtoolsContaineranalysisV1alpha1AliasContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleDevtoolsContaineranalysisV1alpha1AliasContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleDevtoolsContaineranalysisV1alpha1AliasContext
   * @throws IOException if the JSON string is invalid with respect to GoogleDevtoolsContaineranalysisV1alpha1AliasContext
   */
  public static GoogleDevtoolsContaineranalysisV1alpha1AliasContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleDevtoolsContaineranalysisV1alpha1AliasContext.class);
  }

  /**
   * Convert an instance of GoogleDevtoolsContaineranalysisV1alpha1AliasContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

