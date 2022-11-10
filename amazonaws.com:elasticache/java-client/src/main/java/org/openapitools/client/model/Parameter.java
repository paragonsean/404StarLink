/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
import org.openapitools.client.model.ChangeType;

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
 * Describes an individual setting that controls some aspect of ElastiCache behavior.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:52.956161-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Parameter {
  public static final String SERIALIZED_NAME_PARAMETER_NAME = "ParameterName";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NAME)
  private String parameterName;

  public static final String SERIALIZED_NAME_PARAMETER_VALUE = "ParameterValue";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUE)
  private String parameterValue;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_DATA_TYPE = "DataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "AllowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private String allowedValues;

  public static final String SERIALIZED_NAME_IS_MODIFIABLE = "IsModifiable";
  @SerializedName(SERIALIZED_NAME_IS_MODIFIABLE)
  private Boolean isModifiable;

  public static final String SERIALIZED_NAME_MINIMUM_ENGINE_VERSION = "MinimumEngineVersion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ENGINE_VERSION)
  private String minimumEngineVersion;

  public static final String SERIALIZED_NAME_CHANGE_TYPE = "ChangeType";
  @SerializedName(SERIALIZED_NAME_CHANGE_TYPE)
  private ChangeType changeType;

  public Parameter() {
  }

  public Parameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  /**
   * Get parameterName
   * @return parameterName
   */
  @javax.annotation.Nullable
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public Parameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

  /**
   * Get parameterValue
   * @return parameterValue
   */
  @javax.annotation.Nullable
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  public Parameter description(String description) {
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


  public Parameter source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public Parameter dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   */
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public Parameter allowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * Get allowedValues
   * @return allowedValues
   */
  @javax.annotation.Nullable
  public String getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
  }


  public Parameter isModifiable(Boolean isModifiable) {
    this.isModifiable = isModifiable;
    return this;
  }

  /**
   * Get isModifiable
   * @return isModifiable
   */
  @javax.annotation.Nullable
  public Boolean getIsModifiable() {
    return isModifiable;
  }

  public void setIsModifiable(Boolean isModifiable) {
    this.isModifiable = isModifiable;
  }


  public Parameter minimumEngineVersion(String minimumEngineVersion) {
    this.minimumEngineVersion = minimumEngineVersion;
    return this;
  }

  /**
   * Get minimumEngineVersion
   * @return minimumEngineVersion
   */
  @javax.annotation.Nullable
  public String getMinimumEngineVersion() {
    return minimumEngineVersion;
  }

  public void setMinimumEngineVersion(String minimumEngineVersion) {
    this.minimumEngineVersion = minimumEngineVersion;
  }


  public Parameter changeType(ChangeType changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
   */
  @javax.annotation.Nullable
  public ChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeType changeType) {
    this.changeType = changeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(this.parameterName, parameter.parameterName) &&
        Objects.equals(this.parameterValue, parameter.parameterValue) &&
        Objects.equals(this.description, parameter.description) &&
        Objects.equals(this.source, parameter.source) &&
        Objects.equals(this.dataType, parameter.dataType) &&
        Objects.equals(this.allowedValues, parameter.allowedValues) &&
        Objects.equals(this.isModifiable, parameter.isModifiable) &&
        Objects.equals(this.minimumEngineVersion, parameter.minimumEngineVersion) &&
        Objects.equals(this.changeType, parameter.changeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterValue, description, source, dataType, allowedValues, isModifiable, minimumEngineVersion, changeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    isModifiable: ").append(toIndentedString(isModifiable)).append("\n");
    sb.append("    minimumEngineVersion: ").append(toIndentedString(minimumEngineVersion)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
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
    openapiFields.add("ParameterName");
    openapiFields.add("ParameterValue");
    openapiFields.add("Description");
    openapiFields.add("Source");
    openapiFields.add("DataType");
    openapiFields.add("AllowedValues");
    openapiFields.add("IsModifiable");
    openapiFields.add("MinimumEngineVersion");
    openapiFields.add("ChangeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Parameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Parameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Parameter is not found in the empty JSON string", Parameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Parameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Parameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ParameterName`
      if (jsonObj.get("ParameterName") != null && !jsonObj.get("ParameterName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ParameterName"));
      }
      // validate the optional field `ParameterValue`
      if (jsonObj.get("ParameterValue") != null && !jsonObj.get("ParameterValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ParameterValue"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `Source`
      if (jsonObj.get("Source") != null && !jsonObj.get("Source").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Source"));
      }
      // validate the optional field `DataType`
      if (jsonObj.get("DataType") != null && !jsonObj.get("DataType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DataType"));
      }
      // validate the optional field `AllowedValues`
      if (jsonObj.get("AllowedValues") != null && !jsonObj.get("AllowedValues").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AllowedValues"));
      }
      // validate the optional field `IsModifiable`
      if (jsonObj.get("IsModifiable") != null && !jsonObj.get("IsModifiable").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IsModifiable"));
      }
      // validate the optional field `MinimumEngineVersion`
      if (jsonObj.get("MinimumEngineVersion") != null && !jsonObj.get("MinimumEngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MinimumEngineVersion"));
      }
      // validate the optional field `ChangeType`
      if (jsonObj.get("ChangeType") != null && !jsonObj.get("ChangeType").isJsonNull()) {
        ChangeType.validateJsonElement(jsonObj.get("ChangeType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Parameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Parameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Parameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Parameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Parameter>() {
           @Override
           public void write(JsonWriter out, Parameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Parameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Parameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Parameter
   * @throws IOException if the JSON string is invalid with respect to Parameter
   */
  public static Parameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Parameter.class);
  }

  /**
   * Convert an instance of Parameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

