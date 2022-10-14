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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Map;

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
 * Provides feature transformation information. Feature transformation is the process of modifying raw input data into a form more suitable for model training.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FeatureTransformation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FEATURE_TRANSFORMATION_ARN = "featureTransformationArn";
  @SerializedName(SERIALIZED_NAME_FEATURE_TRANSFORMATION_ARN)
  private String featureTransformationArn;

  public static final String SERIALIZED_NAME_DEFAULT_PARAMETERS = "defaultParameters";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PARAMETERS)
  private Map defaultParameters;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public FeatureTransformation() {
  }

  public FeatureTransformation name(String name) {
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


  public FeatureTransformation featureTransformationArn(String featureTransformationArn) {
    this.featureTransformationArn = featureTransformationArn;
    return this;
  }

  /**
   * Get featureTransformationArn
   * @return featureTransformationArn
   */
  @javax.annotation.Nullable
  public String getFeatureTransformationArn() {
    return featureTransformationArn;
  }

  public void setFeatureTransformationArn(String featureTransformationArn) {
    this.featureTransformationArn = featureTransformationArn;
  }


  public FeatureTransformation defaultParameters(Map defaultParameters) {
    this.defaultParameters = defaultParameters;
    return this;
  }

  /**
   * Get defaultParameters
   * @return defaultParameters
   */
  @javax.annotation.Nullable
  public Map getDefaultParameters() {
    return defaultParameters;
  }

  public void setDefaultParameters(Map defaultParameters) {
    this.defaultParameters = defaultParameters;
  }


  public FeatureTransformation creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public FeatureTransformation lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

  /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }


  public FeatureTransformation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureTransformation featureTransformation = (FeatureTransformation) o;
    return Objects.equals(this.name, featureTransformation.name) &&
        Objects.equals(this.featureTransformationArn, featureTransformation.featureTransformationArn) &&
        Objects.equals(this.defaultParameters, featureTransformation.defaultParameters) &&
        Objects.equals(this.creationDateTime, featureTransformation.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, featureTransformation.lastUpdatedDateTime) &&
        Objects.equals(this.status, featureTransformation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, featureTransformationArn, defaultParameters, creationDateTime, lastUpdatedDateTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureTransformation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    featureTransformationArn: ").append(toIndentedString(featureTransformationArn)).append("\n");
    sb.append("    defaultParameters: ").append(toIndentedString(defaultParameters)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("featureTransformationArn");
    openapiFields.add("defaultParameters");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeatureTransformation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeatureTransformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeatureTransformation is not found in the empty JSON string", FeatureTransformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeatureTransformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeatureTransformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `featureTransformationArn`
      if (jsonObj.get("featureTransformationArn") != null && !jsonObj.get("featureTransformationArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("featureTransformationArn"));
      }
      // validate the optional field `defaultParameters`
      if (jsonObj.get("defaultParameters") != null && !jsonObj.get("defaultParameters").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("defaultParameters"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeatureTransformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeatureTransformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeatureTransformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeatureTransformation.class));

       return (TypeAdapter<T>) new TypeAdapter<FeatureTransformation>() {
           @Override
           public void write(JsonWriter out, FeatureTransformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeatureTransformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeatureTransformation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeatureTransformation
   * @throws IOException if the JSON string is invalid with respect to FeatureTransformation
   */
  public static FeatureTransformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeatureTransformation.class);
  }

  /**
   * Convert an instance of FeatureTransformation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

