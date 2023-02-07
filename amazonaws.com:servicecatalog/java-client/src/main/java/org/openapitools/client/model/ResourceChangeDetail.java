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
import org.openapitools.client.model.EvaluationType;
import org.openapitools.client.model.ResourceChangeDetailTarget;

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
 * Information about a change to a resource attribute.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceChangeDetail {
  public static final String SERIALIZED_NAME_TARGET = "Target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private ResourceChangeDetailTarget target;

  public static final String SERIALIZED_NAME_EVALUATION = "Evaluation";
  @SerializedName(SERIALIZED_NAME_EVALUATION)
  private EvaluationType evaluation;

  public static final String SERIALIZED_NAME_CAUSING_ENTITY = "CausingEntity";
  @SerializedName(SERIALIZED_NAME_CAUSING_ENTITY)
  private String causingEntity;

  public ResourceChangeDetail() {
  }

  public ResourceChangeDetail target(ResourceChangeDetailTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @javax.annotation.Nullable
  public ResourceChangeDetailTarget getTarget() {
    return target;
  }

  public void setTarget(ResourceChangeDetailTarget target) {
    this.target = target;
  }


  public ResourceChangeDetail evaluation(EvaluationType evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  /**
   * Get evaluation
   * @return evaluation
   */
  @javax.annotation.Nullable
  public EvaluationType getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(EvaluationType evaluation) {
    this.evaluation = evaluation;
  }


  public ResourceChangeDetail causingEntity(String causingEntity) {
    this.causingEntity = causingEntity;
    return this;
  }

  /**
   * Get causingEntity
   * @return causingEntity
   */
  @javax.annotation.Nullable
  public String getCausingEntity() {
    return causingEntity;
  }

  public void setCausingEntity(String causingEntity) {
    this.causingEntity = causingEntity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceChangeDetail resourceChangeDetail = (ResourceChangeDetail) o;
    return Objects.equals(this.target, resourceChangeDetail.target) &&
        Objects.equals(this.evaluation, resourceChangeDetail.evaluation) &&
        Objects.equals(this.causingEntity, resourceChangeDetail.causingEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, evaluation, causingEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceChangeDetail {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    causingEntity: ").append(toIndentedString(causingEntity)).append("\n");
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
    openapiFields.add("Target");
    openapiFields.add("Evaluation");
    openapiFields.add("CausingEntity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceChangeDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceChangeDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceChangeDetail is not found in the empty JSON string", ResourceChangeDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceChangeDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceChangeDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Target`
      if (jsonObj.get("Target") != null && !jsonObj.get("Target").isJsonNull()) {
        ResourceChangeDetailTarget.validateJsonElement(jsonObj.get("Target"));
      }
      // validate the optional field `Evaluation`
      if (jsonObj.get("Evaluation") != null && !jsonObj.get("Evaluation").isJsonNull()) {
        EvaluationType.validateJsonElement(jsonObj.get("Evaluation"));
      }
      // validate the optional field `CausingEntity`
      if (jsonObj.get("CausingEntity") != null && !jsonObj.get("CausingEntity").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CausingEntity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceChangeDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceChangeDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceChangeDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceChangeDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceChangeDetail>() {
           @Override
           public void write(JsonWriter out, ResourceChangeDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceChangeDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceChangeDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceChangeDetail
   * @throws IOException if the JSON string is invalid with respect to ResourceChangeDetail
   */
  public static ResourceChangeDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceChangeDetail.class);
  }

  /**
   * Convert an instance of ResourceChangeDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

