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
import java.util.List;

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
 * ProvisioningArtifactParameterParameterConstraints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisioningArtifactParameterParameterConstraints {
  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "AllowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List allowedValues;

  public static final String SERIALIZED_NAME_ALLOWED_PATTERN = "AllowedPattern";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PATTERN)
  private String allowedPattern;

  public static final String SERIALIZED_NAME_CONSTRAINT_DESCRIPTION = "ConstraintDescription";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_DESCRIPTION)
  private String constraintDescription;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "MaxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private String maxLength;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "MinLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private String minLength;

  public static final String SERIALIZED_NAME_MAX_VALUE = "MaxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private String maxValue;

  public static final String SERIALIZED_NAME_MIN_VALUE = "MinValue";
  @SerializedName(SERIALIZED_NAME_MIN_VALUE)
  private String minValue;

  public ProvisioningArtifactParameterParameterConstraints() {
  }

  public ProvisioningArtifactParameterParameterConstraints allowedValues(List allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * Get allowedValues
   * @return allowedValues
   */
  @javax.annotation.Nullable
  public List getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List allowedValues) {
    this.allowedValues = allowedValues;
  }


  public ProvisioningArtifactParameterParameterConstraints allowedPattern(String allowedPattern) {
    this.allowedPattern = allowedPattern;
    return this;
  }

  /**
   * Get allowedPattern
   * @return allowedPattern
   */
  @javax.annotation.Nullable
  public String getAllowedPattern() {
    return allowedPattern;
  }

  public void setAllowedPattern(String allowedPattern) {
    this.allowedPattern = allowedPattern;
  }


  public ProvisioningArtifactParameterParameterConstraints constraintDescription(String constraintDescription) {
    this.constraintDescription = constraintDescription;
    return this;
  }

  /**
   * Get constraintDescription
   * @return constraintDescription
   */
  @javax.annotation.Nullable
  public String getConstraintDescription() {
    return constraintDescription;
  }

  public void setConstraintDescription(String constraintDescription) {
    this.constraintDescription = constraintDescription;
  }


  public ProvisioningArtifactParameterParameterConstraints maxLength(String maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
   */
  @javax.annotation.Nullable
  public String getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }


  public ProvisioningArtifactParameterParameterConstraints minLength(String minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
   */
  @javax.annotation.Nullable
  public String getMinLength() {
    return minLength;
  }

  public void setMinLength(String minLength) {
    this.minLength = minLength;
  }


  public ProvisioningArtifactParameterParameterConstraints maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Get maxValue
   * @return maxValue
   */
  @javax.annotation.Nullable
  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }


  public ProvisioningArtifactParameterParameterConstraints minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Get minValue
   * @return minValue
   */
  @javax.annotation.Nullable
  public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningArtifactParameterParameterConstraints provisioningArtifactParameterParameterConstraints = (ProvisioningArtifactParameterParameterConstraints) o;
    return Objects.equals(this.allowedValues, provisioningArtifactParameterParameterConstraints.allowedValues) &&
        Objects.equals(this.allowedPattern, provisioningArtifactParameterParameterConstraints.allowedPattern) &&
        Objects.equals(this.constraintDescription, provisioningArtifactParameterParameterConstraints.constraintDescription) &&
        Objects.equals(this.maxLength, provisioningArtifactParameterParameterConstraints.maxLength) &&
        Objects.equals(this.minLength, provisioningArtifactParameterParameterConstraints.minLength) &&
        Objects.equals(this.maxValue, provisioningArtifactParameterParameterConstraints.maxValue) &&
        Objects.equals(this.minValue, provisioningArtifactParameterParameterConstraints.minValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, allowedPattern, constraintDescription, maxLength, minLength, maxValue, minValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningArtifactParameterParameterConstraints {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    allowedPattern: ").append(toIndentedString(allowedPattern)).append("\n");
    sb.append("    constraintDescription: ").append(toIndentedString(constraintDescription)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
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
    openapiFields.add("AllowedValues");
    openapiFields.add("AllowedPattern");
    openapiFields.add("ConstraintDescription");
    openapiFields.add("MaxLength");
    openapiFields.add("MinLength");
    openapiFields.add("MaxValue");
    openapiFields.add("MinValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisioningArtifactParameterParameterConstraints
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisioningArtifactParameterParameterConstraints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisioningArtifactParameterParameterConstraints is not found in the empty JSON string", ProvisioningArtifactParameterParameterConstraints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisioningArtifactParameterParameterConstraints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisioningArtifactParameterParameterConstraints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AllowedValues`
      if (jsonObj.get("AllowedValues") != null && !jsonObj.get("AllowedValues").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AllowedValues"));
      }
      // validate the optional field `AllowedPattern`
      if (jsonObj.get("AllowedPattern") != null && !jsonObj.get("AllowedPattern").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AllowedPattern"));
      }
      // validate the optional field `ConstraintDescription`
      if (jsonObj.get("ConstraintDescription") != null && !jsonObj.get("ConstraintDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ConstraintDescription"));
      }
      // validate the optional field `MaxLength`
      if (jsonObj.get("MaxLength") != null && !jsonObj.get("MaxLength").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MaxLength"));
      }
      // validate the optional field `MinLength`
      if (jsonObj.get("MinLength") != null && !jsonObj.get("MinLength").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MinLength"));
      }
      // validate the optional field `MaxValue`
      if (jsonObj.get("MaxValue") != null && !jsonObj.get("MaxValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MaxValue"));
      }
      // validate the optional field `MinValue`
      if (jsonObj.get("MinValue") != null && !jsonObj.get("MinValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MinValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisioningArtifactParameterParameterConstraints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisioningArtifactParameterParameterConstraints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisioningArtifactParameterParameterConstraints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisioningArtifactParameterParameterConstraints.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisioningArtifactParameterParameterConstraints>() {
           @Override
           public void write(JsonWriter out, ProvisioningArtifactParameterParameterConstraints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisioningArtifactParameterParameterConstraints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisioningArtifactParameterParameterConstraints given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisioningArtifactParameterParameterConstraints
   * @throws IOException if the JSON string is invalid with respect to ProvisioningArtifactParameterParameterConstraints
   */
  public static ProvisioningArtifactParameterParameterConstraints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisioningArtifactParameterParameterConstraints.class);
  }

  /**
   * Convert an instance of ProvisioningArtifactParameterParameterConstraints to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

