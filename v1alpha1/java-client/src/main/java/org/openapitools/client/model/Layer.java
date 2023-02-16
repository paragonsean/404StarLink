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
 * Layer holds metadata specific to a layer of a Docker image.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:03.965307-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Layer {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private String arguments;

  /**
   * The recovered Dockerfile directive used to construct this layer.
   */
  @JsonAdapter(DirectiveEnum.Adapter.class)
  public enum DirectiveEnum {
    DIRECTIVE_UNSPECIFIED("DIRECTIVE_UNSPECIFIED"),
    
    MAINTAINER("MAINTAINER"),
    
    RUN("RUN"),
    
    CMD("CMD"),
    
    LABEL("LABEL"),
    
    EXPOSE("EXPOSE"),
    
    ENV("ENV"),
    
    ADD("ADD"),
    
    COPY("COPY"),
    
    ENTRYPOINT("ENTRYPOINT"),
    
    VOLUME("VOLUME"),
    
    USER("USER"),
    
    WORKDIR("WORKDIR"),
    
    ARG("ARG"),
    
    ONBUILD("ONBUILD"),
    
    STOPSIGNAL("STOPSIGNAL"),
    
    HEALTHCHECK("HEALTHCHECK"),
    
    SHELL("SHELL");

    private String value;

    DirectiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectiveEnum fromValue(String value) {
      for (DirectiveEnum b : DirectiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectiveEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DirectiveEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DIRECTIVE = "directive";
  @SerializedName(SERIALIZED_NAME_DIRECTIVE)
  private DirectiveEnum directive;

  public Layer() {
  }

  public Layer arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * The recovered arguments to the Dockerfile directive.
   * @return arguments
   */
  @javax.annotation.Nullable
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }


  public Layer directive(DirectiveEnum directive) {
    this.directive = directive;
    return this;
  }

  /**
   * The recovered Dockerfile directive used to construct this layer.
   * @return directive
   */
  @javax.annotation.Nullable
  public DirectiveEnum getDirective() {
    return directive;
  }

  public void setDirective(DirectiveEnum directive) {
    this.directive = directive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Layer layer = (Layer) o;
    return Objects.equals(this.arguments, layer.arguments) &&
        Objects.equals(this.directive, layer.directive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, directive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Layer {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    directive: ").append(toIndentedString(directive)).append("\n");
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
    openapiFields.add("arguments");
    openapiFields.add("directive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Layer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Layer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Layer is not found in the empty JSON string", Layer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Layer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Layer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("arguments") != null && !jsonObj.get("arguments").isJsonNull()) && !jsonObj.get("arguments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arguments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
      }
      if ((jsonObj.get("directive") != null && !jsonObj.get("directive").isJsonNull()) && !jsonObj.get("directive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directive").toString()));
      }
      // validate the optional field `directive`
      if (jsonObj.get("directive") != null && !jsonObj.get("directive").isJsonNull()) {
        DirectiveEnum.validateJsonElement(jsonObj.get("directive"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Layer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Layer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Layer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Layer.class));

       return (TypeAdapter<T>) new TypeAdapter<Layer>() {
           @Override
           public void write(JsonWriter out, Layer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Layer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Layer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Layer
   * @throws IOException if the JSON string is invalid with respect to Layer
   */
  public static Layer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Layer.class);
  }

  /**
   * Convert an instance of Layer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

