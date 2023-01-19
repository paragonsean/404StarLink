/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
 * Describes the parameters of a database.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RelationalDatabaseParameter {
  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private String allowedValues;

  public static final String SERIALIZED_NAME_APPLY_METHOD = "applyMethod";
  @SerializedName(SERIALIZED_NAME_APPLY_METHOD)
  private String applyMethod;

  public static final String SERIALIZED_NAME_APPLY_TYPE = "applyType";
  @SerializedName(SERIALIZED_NAME_APPLY_TYPE)
  private String applyType;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_MODIFIABLE = "isModifiable";
  @SerializedName(SERIALIZED_NAME_IS_MODIFIABLE)
  private Boolean isModifiable;

  public static final String SERIALIZED_NAME_PARAMETER_NAME = "parameterName";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NAME)
  private String parameterName;

  public static final String SERIALIZED_NAME_PARAMETER_VALUE = "parameterValue";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUE)
  private String parameterValue;

  public RelationalDatabaseParameter() {
  }

  public RelationalDatabaseParameter allowedValues(String allowedValues) {
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


  public RelationalDatabaseParameter applyMethod(String applyMethod) {
    this.applyMethod = applyMethod;
    return this;
  }

  /**
   * Get applyMethod
   * @return applyMethod
   */
  @javax.annotation.Nullable
  public String getApplyMethod() {
    return applyMethod;
  }

  public void setApplyMethod(String applyMethod) {
    this.applyMethod = applyMethod;
  }


  public RelationalDatabaseParameter applyType(String applyType) {
    this.applyType = applyType;
    return this;
  }

  /**
   * Get applyType
   * @return applyType
   */
  @javax.annotation.Nullable
  public String getApplyType() {
    return applyType;
  }

  public void setApplyType(String applyType) {
    this.applyType = applyType;
  }


  public RelationalDatabaseParameter dataType(String dataType) {
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


  public RelationalDatabaseParameter description(String description) {
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


  public RelationalDatabaseParameter isModifiable(Boolean isModifiable) {
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


  public RelationalDatabaseParameter parameterName(String parameterName) {
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


  public RelationalDatabaseParameter parameterValue(String parameterValue) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalDatabaseParameter relationalDatabaseParameter = (RelationalDatabaseParameter) o;
    return Objects.equals(this.allowedValues, relationalDatabaseParameter.allowedValues) &&
        Objects.equals(this.applyMethod, relationalDatabaseParameter.applyMethod) &&
        Objects.equals(this.applyType, relationalDatabaseParameter.applyType) &&
        Objects.equals(this.dataType, relationalDatabaseParameter.dataType) &&
        Objects.equals(this.description, relationalDatabaseParameter.description) &&
        Objects.equals(this.isModifiable, relationalDatabaseParameter.isModifiable) &&
        Objects.equals(this.parameterName, relationalDatabaseParameter.parameterName) &&
        Objects.equals(this.parameterValue, relationalDatabaseParameter.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, applyMethod, applyType, dataType, description, isModifiable, parameterName, parameterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalDatabaseParameter {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    applyMethod: ").append(toIndentedString(applyMethod)).append("\n");
    sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isModifiable: ").append(toIndentedString(isModifiable)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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
    openapiFields.add("allowedValues");
    openapiFields.add("applyMethod");
    openapiFields.add("applyType");
    openapiFields.add("dataType");
    openapiFields.add("description");
    openapiFields.add("isModifiable");
    openapiFields.add("parameterName");
    openapiFields.add("parameterValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelationalDatabaseParameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelationalDatabaseParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationalDatabaseParameter is not found in the empty JSON string", RelationalDatabaseParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelationalDatabaseParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelationalDatabaseParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `allowedValues`
      if (jsonObj.get("allowedValues") != null && !jsonObj.get("allowedValues").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("allowedValues"));
      }
      // validate the optional field `applyMethod`
      if (jsonObj.get("applyMethod") != null && !jsonObj.get("applyMethod").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("applyMethod"));
      }
      // validate the optional field `applyType`
      if (jsonObj.get("applyType") != null && !jsonObj.get("applyType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("applyType"));
      }
      // validate the optional field `dataType`
      if (jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("dataType"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("description"));
      }
      // validate the optional field `isModifiable`
      if (jsonObj.get("isModifiable") != null && !jsonObj.get("isModifiable").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isModifiable"));
      }
      // validate the optional field `parameterName`
      if (jsonObj.get("parameterName") != null && !jsonObj.get("parameterName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("parameterName"));
      }
      // validate the optional field `parameterValue`
      if (jsonObj.get("parameterValue") != null && !jsonObj.get("parameterValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("parameterValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelationalDatabaseParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationalDatabaseParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationalDatabaseParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationalDatabaseParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationalDatabaseParameter>() {
           @Override
           public void write(JsonWriter out, RelationalDatabaseParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelationalDatabaseParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelationalDatabaseParameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelationalDatabaseParameter
   * @throws IOException if the JSON string is invalid with respect to RelationalDatabaseParameter
   */
  public static RelationalDatabaseParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationalDatabaseParameter.class);
  }

  /**
   * Convert an instance of RelationalDatabaseParameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

