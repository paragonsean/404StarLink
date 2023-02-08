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
 * Information about a provisioning artifact (also known as a version) for a product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisioningArtifactDetail {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ProvisioningArtifactType type;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_ACTIVE = "Active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_GUIDANCE = "Guidance";
  @SerializedName(SERIALIZED_NAME_GUIDANCE)
  private ProvisioningArtifactGuidance guidance;

  public static final String SERIALIZED_NAME_SOURCE_REVISION = "SourceRevision";
  @SerializedName(SERIALIZED_NAME_SOURCE_REVISION)
  private String sourceRevision;

  public ProvisioningArtifactDetail() {
  }

  public ProvisioningArtifactDetail id(String id) {
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


  public ProvisioningArtifactDetail name(String name) {
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


  public ProvisioningArtifactDetail description(String description) {
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


  public ProvisioningArtifactDetail type(ProvisioningArtifactType type) {
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


  public ProvisioningArtifactDetail createdTime(OffsetDateTime createdTime) {
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


  public ProvisioningArtifactDetail active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public ProvisioningArtifactDetail guidance(ProvisioningArtifactGuidance guidance) {
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


  public ProvisioningArtifactDetail sourceRevision(String sourceRevision) {
    this.sourceRevision = sourceRevision;
    return this;
  }

  /**
   * Get sourceRevision
   * @return sourceRevision
   */
  @javax.annotation.Nullable
  public String getSourceRevision() {
    return sourceRevision;
  }

  public void setSourceRevision(String sourceRevision) {
    this.sourceRevision = sourceRevision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningArtifactDetail provisioningArtifactDetail = (ProvisioningArtifactDetail) o;
    return Objects.equals(this.id, provisioningArtifactDetail.id) &&
        Objects.equals(this.name, provisioningArtifactDetail.name) &&
        Objects.equals(this.description, provisioningArtifactDetail.description) &&
        Objects.equals(this.type, provisioningArtifactDetail.type) &&
        Objects.equals(this.createdTime, provisioningArtifactDetail.createdTime) &&
        Objects.equals(this.active, provisioningArtifactDetail.active) &&
        Objects.equals(this.guidance, provisioningArtifactDetail.guidance) &&
        Objects.equals(this.sourceRevision, provisioningArtifactDetail.sourceRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, createdTime, active, guidance, sourceRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningArtifactDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
    sb.append("    sourceRevision: ").append(toIndentedString(sourceRevision)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("CreatedTime");
    openapiFields.add("Active");
    openapiFields.add("Guidance");
    openapiFields.add("SourceRevision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisioningArtifactDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisioningArtifactDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisioningArtifactDetail is not found in the empty JSON string", ProvisioningArtifactDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisioningArtifactDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisioningArtifactDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        ProvisioningArtifactType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `Active`
      if (jsonObj.get("Active") != null && !jsonObj.get("Active").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Active"));
      }
      // validate the optional field `Guidance`
      if (jsonObj.get("Guidance") != null && !jsonObj.get("Guidance").isJsonNull()) {
        ProvisioningArtifactGuidance.validateJsonElement(jsonObj.get("Guidance"));
      }
      // validate the optional field `SourceRevision`
      if (jsonObj.get("SourceRevision") != null && !jsonObj.get("SourceRevision").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceRevision"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisioningArtifactDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisioningArtifactDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisioningArtifactDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisioningArtifactDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisioningArtifactDetail>() {
           @Override
           public void write(JsonWriter out, ProvisioningArtifactDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisioningArtifactDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisioningArtifactDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisioningArtifactDetail
   * @throws IOException if the JSON string is invalid with respect to ProvisioningArtifactDetail
   */
  public static ProvisioningArtifactDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisioningArtifactDetail.class);
  }

  /**
   * Convert an instance of ProvisioningArtifactDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

