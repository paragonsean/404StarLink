/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
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
import java.util.List;
import org.openapitools.client.model.TrainingMode;

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
 * CreateSolutionVersionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateSolutionVersionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOLUTION_ARN = "solutionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ARN)
  private String solutionArn;

  public static final String SERIALIZED_NAME_TRAINING_MODE = "trainingMode";
  @SerializedName(SERIALIZED_NAME_TRAINING_MODE)
  private TrainingMode trainingMode;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateSolutionVersionRequest() {
  }

  public CreateSolutionVersionRequest name(String name) {
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


  public CreateSolutionVersionRequest solutionArn(String solutionArn) {
    this.solutionArn = solutionArn;
    return this;
  }

  /**
   * Get solutionArn
   * @return solutionArn
   */
  @javax.annotation.Nonnull
  public String getSolutionArn() {
    return solutionArn;
  }

  public void setSolutionArn(String solutionArn) {
    this.solutionArn = solutionArn;
  }


  public CreateSolutionVersionRequest trainingMode(TrainingMode trainingMode) {
    this.trainingMode = trainingMode;
    return this;
  }

  /**
   * Get trainingMode
   * @return trainingMode
   */
  @javax.annotation.Nullable
  public TrainingMode getTrainingMode() {
    return trainingMode;
  }

  public void setTrainingMode(TrainingMode trainingMode) {
    this.trainingMode = trainingMode;
  }


  public CreateSolutionVersionRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSolutionVersionRequest createSolutionVersionRequest = (CreateSolutionVersionRequest) o;
    return Objects.equals(this.name, createSolutionVersionRequest.name) &&
        Objects.equals(this.solutionArn, createSolutionVersionRequest.solutionArn) &&
        Objects.equals(this.trainingMode, createSolutionVersionRequest.trainingMode) &&
        Objects.equals(this.tags, createSolutionVersionRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, solutionArn, trainingMode, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSolutionVersionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    solutionArn: ").append(toIndentedString(solutionArn)).append("\n");
    sb.append("    trainingMode: ").append(toIndentedString(trainingMode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("solutionArn");
    openapiFields.add("trainingMode");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("solutionArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateSolutionVersionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSolutionVersionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSolutionVersionRequest is not found in the empty JSON string", CreateSolutionVersionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSolutionVersionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSolutionVersionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSolutionVersionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the required field `solutionArn`
      String.validateJsonElement(jsonObj.get("solutionArn"));
      // validate the optional field `trainingMode`
      if (jsonObj.get("trainingMode") != null && !jsonObj.get("trainingMode").isJsonNull()) {
        TrainingMode.validateJsonElement(jsonObj.get("trainingMode"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSolutionVersionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSolutionVersionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSolutionVersionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSolutionVersionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSolutionVersionRequest>() {
           @Override
           public void write(JsonWriter out, CreateSolutionVersionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSolutionVersionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateSolutionVersionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateSolutionVersionRequest
   * @throws IOException if the JSON string is invalid with respect to CreateSolutionVersionRequest
   */
  public static CreateSolutionVersionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSolutionVersionRequest.class);
  }

  /**
   * Convert an instance of CreateSolutionVersionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

