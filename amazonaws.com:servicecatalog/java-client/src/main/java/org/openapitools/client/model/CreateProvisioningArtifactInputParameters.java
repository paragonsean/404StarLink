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
import org.openapitools.client.model.ProvisioningArtifactType;

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
 * CreateProvisioningArtifactInputParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateProvisioningArtifactInputParameters {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INFO = "Info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private Map info;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ProvisioningArtifactType type;

  public static final String SERIALIZED_NAME_DISABLE_TEMPLATE_VALIDATION = "DisableTemplateValidation";
  @SerializedName(SERIALIZED_NAME_DISABLE_TEMPLATE_VALIDATION)
  private Boolean disableTemplateValidation;

  public CreateProvisioningArtifactInputParameters() {
  }

  public CreateProvisioningArtifactInputParameters name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateProvisioningArtifactInputParameters description(String description) {
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


  public CreateProvisioningArtifactInputParameters info(Map info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nullable
  public Map getInfo() {
    return info;
  }

  public void setInfo(Map info) {
    this.info = info;
  }


  public CreateProvisioningArtifactInputParameters type(ProvisioningArtifactType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public ProvisioningArtifactType getType() {
    return type;
  }

  public void setType(ProvisioningArtifactType type) {
    this.type = type;
  }


  public CreateProvisioningArtifactInputParameters disableTemplateValidation(Boolean disableTemplateValidation) {
    this.disableTemplateValidation = disableTemplateValidation;
    return this;
  }

  /**
   * Get disableTemplateValidation
   * @return disableTemplateValidation
   */
  @javax.annotation.Nullable
  public Boolean getDisableTemplateValidation() {
    return disableTemplateValidation;
  }

  public void setDisableTemplateValidation(Boolean disableTemplateValidation) {
    this.disableTemplateValidation = disableTemplateValidation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProvisioningArtifactInputParameters createProvisioningArtifactInputParameters = (CreateProvisioningArtifactInputParameters) o;
    return Objects.equals(this.name, createProvisioningArtifactInputParameters.name) &&
        Objects.equals(this.description, createProvisioningArtifactInputParameters.description) &&
        Objects.equals(this.info, createProvisioningArtifactInputParameters.info) &&
        Objects.equals(this.type, createProvisioningArtifactInputParameters.type) &&
        Objects.equals(this.disableTemplateValidation, createProvisioningArtifactInputParameters.disableTemplateValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, info, type, disableTemplateValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProvisioningArtifactInputParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    disableTemplateValidation: ").append(toIndentedString(disableTemplateValidation)).append("\n");
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
    openapiFields.add("Description");
    openapiFields.add("Info");
    openapiFields.add("Type");
    openapiFields.add("DisableTemplateValidation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateProvisioningArtifactInputParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateProvisioningArtifactInputParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProvisioningArtifactInputParameters is not found in the empty JSON string", CreateProvisioningArtifactInputParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateProvisioningArtifactInputParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProvisioningArtifactInputParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `Info`
      if (jsonObj.get("Info") != null && !jsonObj.get("Info").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Info"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        ProvisioningArtifactType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `DisableTemplateValidation`
      if (jsonObj.get("DisableTemplateValidation") != null && !jsonObj.get("DisableTemplateValidation").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DisableTemplateValidation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProvisioningArtifactInputParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProvisioningArtifactInputParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProvisioningArtifactInputParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProvisioningArtifactInputParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProvisioningArtifactInputParameters>() {
           @Override
           public void write(JsonWriter out, CreateProvisioningArtifactInputParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProvisioningArtifactInputParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateProvisioningArtifactInputParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateProvisioningArtifactInputParameters
   * @throws IOException if the JSON string is invalid with respect to CreateProvisioningArtifactInputParameters
   */
  public static CreateProvisioningArtifactInputParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProvisioningArtifactInputParameters.class);
  }

  /**
   * Convert an instance of CreateProvisioningArtifactInputParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

