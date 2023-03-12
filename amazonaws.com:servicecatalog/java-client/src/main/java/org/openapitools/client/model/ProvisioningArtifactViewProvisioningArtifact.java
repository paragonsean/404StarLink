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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ProvisioningArtifactGuidance;

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
 * ProvisioningArtifactViewProvisioningArtifact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisioningArtifactViewProvisioningArtifact {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_GUIDANCE = "Guidance";
  @SerializedName(SERIALIZED_NAME_GUIDANCE)
  private ProvisioningArtifactGuidance guidance;

  public ProvisioningArtifactViewProvisioningArtifact() {
  }

  public ProvisioningArtifactViewProvisioningArtifact id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProvisioningArtifactViewProvisioningArtifact name(String name) {
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


  public ProvisioningArtifactViewProvisioningArtifact description(String description) {
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


  public ProvisioningArtifactViewProvisioningArtifact createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public ProvisioningArtifactViewProvisioningArtifact guidance(ProvisioningArtifactGuidance guidance) {
    this.guidance = guidance;
    return this;
  }

  /**
   * Get guidance
   * @return guidance
   */
  @javax.annotation.Nullable
  public ProvisioningArtifactGuidance getGuidance() {
    return guidance;
  }

  public void setGuidance(ProvisioningArtifactGuidance guidance) {
    this.guidance = guidance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningArtifactViewProvisioningArtifact provisioningArtifactViewProvisioningArtifact = (ProvisioningArtifactViewProvisioningArtifact) o;
    return Objects.equals(this.id, provisioningArtifactViewProvisioningArtifact.id) &&
        Objects.equals(this.name, provisioningArtifactViewProvisioningArtifact.name) &&
        Objects.equals(this.description, provisioningArtifactViewProvisioningArtifact.description) &&
        Objects.equals(this.createdTime, provisioningArtifactViewProvisioningArtifact.createdTime) &&
        Objects.equals(this.guidance, provisioningArtifactViewProvisioningArtifact.guidance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, createdTime, guidance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningArtifactViewProvisioningArtifact {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("Name");
    openapiFields.add("Description");
    openapiFields.add("CreatedTime");
    openapiFields.add("Guidance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisioningArtifactViewProvisioningArtifact
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisioningArtifactViewProvisioningArtifact.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisioningArtifactViewProvisioningArtifact is not found in the empty JSON string", ProvisioningArtifactViewProvisioningArtifact.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisioningArtifactViewProvisioningArtifact.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisioningArtifactViewProvisioningArtifact` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `Guidance`
      if (jsonObj.get("Guidance") != null && !jsonObj.get("Guidance").isJsonNull()) {
        ProvisioningArtifactGuidance.validateJsonElement(jsonObj.get("Guidance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisioningArtifactViewProvisioningArtifact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisioningArtifactViewProvisioningArtifact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisioningArtifactViewProvisioningArtifact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisioningArtifactViewProvisioningArtifact.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisioningArtifactViewProvisioningArtifact>() {
           @Override
           public void write(JsonWriter out, ProvisioningArtifactViewProvisioningArtifact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisioningArtifactViewProvisioningArtifact read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisioningArtifactViewProvisioningArtifact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisioningArtifactViewProvisioningArtifact
   * @throws IOException if the JSON string is invalid with respect to ProvisioningArtifactViewProvisioningArtifact
   */
  public static ProvisioningArtifactViewProvisioningArtifact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisioningArtifactViewProvisioningArtifact.class);
  }

  /**
   * Convert an instance of ProvisioningArtifactViewProvisioningArtifact to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

