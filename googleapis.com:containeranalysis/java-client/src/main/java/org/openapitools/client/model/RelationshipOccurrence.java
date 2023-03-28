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
 * RelationshipOccurrence represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:05.225194-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RelationshipOccurrence {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  /**
   * Output only. The type of relationship between the source and target SPDX elements
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RELATIONSHIP_TYPE_UNSPECIFIED("RELATIONSHIP_TYPE_UNSPECIFIED"),
    
    DESCRIBES("DESCRIBES"),
    
    DESCRIBED_BY("DESCRIBED_BY"),
    
    CONTAINS("CONTAINS"),
    
    CONTAINED_BY("CONTAINED_BY"),
    
    DEPENDS_ON("DEPENDS_ON"),
    
    DEPENDENCY_OF("DEPENDENCY_OF"),
    
    DEPENDENCY_MANIFEST_OF("DEPENDENCY_MANIFEST_OF"),
    
    BUILD_DEPENDENCY_OF("BUILD_DEPENDENCY_OF"),
    
    DEV_DEPENDENCY_OF("DEV_DEPENDENCY_OF"),
    
    OPTIONAL_DEPENDENCY_OF("OPTIONAL_DEPENDENCY_OF"),
    
    PROVIDED_DEPENDENCY_OF("PROVIDED_DEPENDENCY_OF"),
    
    TEST_DEPENDENCY_OF("TEST_DEPENDENCY_OF"),
    
    RUNTIME_DEPENDENCY_OF("RUNTIME_DEPENDENCY_OF"),
    
    EXAMPLE_OF("EXAMPLE_OF"),
    
    GENERATES("GENERATES"),
    
    GENERATED_FROM("GENERATED_FROM"),
    
    ANCESTOR_OF("ANCESTOR_OF"),
    
    DESCENDANT_OF("DESCENDANT_OF"),
    
    VARIANT_OF("VARIANT_OF"),
    
    DISTRIBUTION_ARTIFACT("DISTRIBUTION_ARTIFACT"),
    
    PATCH_FOR("PATCH_FOR"),
    
    PATCH_APPLIED("PATCH_APPLIED"),
    
    COPY_OF("COPY_OF"),
    
    FILE_ADDED("FILE_ADDED"),
    
    FILE_DELETED("FILE_DELETED"),
    
    FILE_MODIFIED("FILE_MODIFIED"),
    
    EXPANDED_FROM_ARCHIVE("EXPANDED_FROM_ARCHIVE"),
    
    DYNAMIC_LINK("DYNAMIC_LINK"),
    
    STATIC_LINK("STATIC_LINK"),
    
    DATA_FILE_OF("DATA_FILE_OF"),
    
    TEST_CASE_OF("TEST_CASE_OF"),
    
    BUILD_TOOL_OF("BUILD_TOOL_OF"),
    
    DEV_TOOL_OF("DEV_TOOL_OF"),
    
    TEST_OF("TEST_OF"),
    
    TEST_TOOL_OF("TEST_TOOL_OF"),
    
    DOCUMENTATION_OF("DOCUMENTATION_OF"),
    
    OPTIONAL_COMPONENT_OF("OPTIONAL_COMPONENT_OF"),
    
    METAFILE_OF("METAFILE_OF"),
    
    PACKAGE_OF("PACKAGE_OF"),
    
    AMENDS("AMENDS"),
    
    PREREQUISITE_FOR("PREREQUISITE_FOR"),
    
    HAS_PREREQUISITE("HAS_PREREQUISITE"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public RelationshipOccurrence() {
  }

  public RelationshipOccurrence(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  public RelationshipOccurrence comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * A place for the SPDX file creator to record any general comments about the relationship
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public RelationshipOccurrence source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public RelationshipOccurrence target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are \&quot;known unknowns\&quot;, the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  /**
   * Output only. The type of relationship between the source and target SPDX elements
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipOccurrence relationshipOccurrence = (RelationshipOccurrence) o;
    return Objects.equals(this.comment, relationshipOccurrence.comment) &&
        Objects.equals(this.source, relationshipOccurrence.source) &&
        Objects.equals(this.target, relationshipOccurrence.target) &&
        Objects.equals(this.type, relationshipOccurrence.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, source, target, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipOccurrence {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("source");
    openapiFields.add("target");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelationshipOccurrence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelationshipOccurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationshipOccurrence is not found in the empty JSON string", RelationshipOccurrence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelationshipOccurrence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelationshipOccurrence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelationshipOccurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationshipOccurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationshipOccurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationshipOccurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationshipOccurrence>() {
           @Override
           public void write(JsonWriter out, RelationshipOccurrence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelationshipOccurrence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelationshipOccurrence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelationshipOccurrence
   * @throws IOException if the JSON string is invalid with respect to RelationshipOccurrence
   */
  public static RelationshipOccurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationshipOccurrence.class);
  }

  /**
   * Convert an instance of RelationshipOccurrence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

