/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import java.util.Map;
import org.openapitools.client.model.ServiceActionDefinitionType;

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
 * CreateServiceActionInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateServiceActionInput {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEFINITION_TYPE = "DefinitionType";
  @SerializedName(SERIALIZED_NAME_DEFINITION_TYPE)
  private ServiceActionDefinitionType definitionType;

  public static final String SERIALIZED_NAME_DEFINITION = "Definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private Map definition;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_TOKEN = "IdempotencyToken";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_TOKEN)
  private String idempotencyToken;

  public CreateServiceActionInput() {
  }

  public CreateServiceActionInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateServiceActionInput definitionType(ServiceActionDefinitionType definitionType) {
    this.definitionType = definitionType;
    return this;
  }

  /**
   * Get definitionType
   * @return definitionType
   */
  @javax.annotation.Nonnull
  public ServiceActionDefinitionType getDefinitionType() {
    return definitionType;
  }

  public void setDefinitionType(ServiceActionDefinitionType definitionType) {
    this.definitionType = definitionType;
  }


  public CreateServiceActionInput definition(Map definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
   */
  @javax.annotation.Nonnull
  public Map getDefinition() {
    return definition;
  }

  public void setDefinition(Map definition) {
    this.definition = definition;
  }


  public CreateServiceActionInput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateServiceActionInput acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * Get acceptLanguage
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public CreateServiceActionInput idempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  /**
   * Get idempotencyToken
   * @return idempotencyToken
   */
  @javax.annotation.Nonnull
  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public void setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceActionInput createServiceActionInput = (CreateServiceActionInput) o;
    return Objects.equals(this.name, createServiceActionInput.name) &&
        Objects.equals(this.definitionType, createServiceActionInput.definitionType) &&
        Objects.equals(this.definition, createServiceActionInput.definition) &&
        Objects.equals(this.description, createServiceActionInput.description) &&
        Objects.equals(this.acceptLanguage, createServiceActionInput.acceptLanguage) &&
        Objects.equals(this.idempotencyToken, createServiceActionInput.idempotencyToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, definitionType, definition, description, acceptLanguage, idempotencyToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceActionInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    definitionType: ").append(toIndentedString(definitionType)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    idempotencyToken: ").append(toIndentedString(idempotencyToken)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("DefinitionType");
    openapiFields.add("Definition");
    openapiFields.add("Description");
    openapiFields.add("AcceptLanguage");
    openapiFields.add("IdempotencyToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("DefinitionType");
    openapiRequiredFields.add("Definition");
    openapiRequiredFields.add("IdempotencyToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateServiceActionInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateServiceActionInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateServiceActionInput is not found in the empty JSON string", CreateServiceActionInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateServiceActionInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateServiceActionInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateServiceActionInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Name`
      String.validateJsonElement(jsonObj.get("Name"));
      // validate the required field `DefinitionType`
      ServiceActionDefinitionType.validateJsonElement(jsonObj.get("DefinitionType"));
      // validate the required field `Definition`
      Map.validateJsonElement(jsonObj.get("Definition"));
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the required field `IdempotencyToken`
      String.validateJsonElement(jsonObj.get("IdempotencyToken"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateServiceActionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateServiceActionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateServiceActionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateServiceActionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateServiceActionInput>() {
           @Override
           public void write(JsonWriter out, CreateServiceActionInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateServiceActionInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateServiceActionInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateServiceActionInput
   * @throws IOException if the JSON string is invalid with respect to CreateServiceActionInput
   */
  public static CreateServiceActionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateServiceActionInput.class);
  }

  /**
   * Convert an instance of CreateServiceActionInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

