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
import org.openapitools.client.model.DescribeProvisioningParametersOutputProvisioningArtifactPreferences;

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
 * DescribeProvisioningParametersOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeProvisioningParametersOutput {
  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_PARAMETERS = "ProvisioningArtifactParameters";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_PARAMETERS)
  private List provisioningArtifactParameters;

  public static final String SERIALIZED_NAME_CONSTRAINT_SUMMARIES = "ConstraintSummaries";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_SUMMARIES)
  private List constraintSummaries;

  public static final String SERIALIZED_NAME_USAGE_INSTRUCTIONS = "UsageInstructions";
  @SerializedName(SERIALIZED_NAME_USAGE_INSTRUCTIONS)
  private List usageInstructions;

  public static final String SERIALIZED_NAME_TAG_OPTIONS = "TagOptions";
  @SerializedName(SERIALIZED_NAME_TAG_OPTIONS)
  private List tagOptions;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_PREFERENCES = "ProvisioningArtifactPreferences";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_PREFERENCES)
  private DescribeProvisioningParametersOutputProvisioningArtifactPreferences provisioningArtifactPreferences;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_OUTPUTS = "ProvisioningArtifactOutputs";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_OUTPUTS)
  private List provisioningArtifactOutputs;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_OUTPUT_KEYS = "ProvisioningArtifactOutputKeys";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_OUTPUT_KEYS)
  private List provisioningArtifactOutputKeys;

  public DescribeProvisioningParametersOutput() {
  }

  public DescribeProvisioningParametersOutput provisioningArtifactParameters(List provisioningArtifactParameters) {
    this.provisioningArtifactParameters = provisioningArtifactParameters;
    return this;
  }

  /**
   * Get provisioningArtifactParameters
   * @return provisioningArtifactParameters
   */
  @javax.annotation.Nullable
  public List getProvisioningArtifactParameters() {
    return provisioningArtifactParameters;
  }

  public void setProvisioningArtifactParameters(List provisioningArtifactParameters) {
    this.provisioningArtifactParameters = provisioningArtifactParameters;
  }


  public DescribeProvisioningParametersOutput constraintSummaries(List constraintSummaries) {
    this.constraintSummaries = constraintSummaries;
    return this;
  }

  /**
   * Get constraintSummaries
   * @return constraintSummaries
   */
  @javax.annotation.Nullable
  public List getConstraintSummaries() {
    return constraintSummaries;
  }

  public void setConstraintSummaries(List constraintSummaries) {
    this.constraintSummaries = constraintSummaries;
  }


  public DescribeProvisioningParametersOutput usageInstructions(List usageInstructions) {
    this.usageInstructions = usageInstructions;
    return this;
  }

  /**
   * Get usageInstructions
   * @return usageInstructions
   */
  @javax.annotation.Nullable
  public List getUsageInstructions() {
    return usageInstructions;
  }

  public void setUsageInstructions(List usageInstructions) {
    this.usageInstructions = usageInstructions;
  }


  public DescribeProvisioningParametersOutput tagOptions(List tagOptions) {
    this.tagOptions = tagOptions;
    return this;
  }

  /**
   * Get tagOptions
   * @return tagOptions
   */
  @javax.annotation.Nullable
  public List getTagOptions() {
    return tagOptions;
  }

  public void setTagOptions(List tagOptions) {
    this.tagOptions = tagOptions;
  }


  public DescribeProvisioningParametersOutput provisioningArtifactPreferences(DescribeProvisioningParametersOutputProvisioningArtifactPreferences provisioningArtifactPreferences) {
    this.provisioningArtifactPreferences = provisioningArtifactPreferences;
    return this;
  }

  /**
   * Get provisioningArtifactPreferences
   * @return provisioningArtifactPreferences
   */
  @javax.annotation.Nullable
  public DescribeProvisioningParametersOutputProvisioningArtifactPreferences getProvisioningArtifactPreferences() {
    return provisioningArtifactPreferences;
  }

  public void setProvisioningArtifactPreferences(DescribeProvisioningParametersOutputProvisioningArtifactPreferences provisioningArtifactPreferences) {
    this.provisioningArtifactPreferences = provisioningArtifactPreferences;
  }


  public DescribeProvisioningParametersOutput provisioningArtifactOutputs(List provisioningArtifactOutputs) {
    this.provisioningArtifactOutputs = provisioningArtifactOutputs;
    return this;
  }

  /**
   * Get provisioningArtifactOutputs
   * @return provisioningArtifactOutputs
   */
  @javax.annotation.Nullable
  public List getProvisioningArtifactOutputs() {
    return provisioningArtifactOutputs;
  }

  public void setProvisioningArtifactOutputs(List provisioningArtifactOutputs) {
    this.provisioningArtifactOutputs = provisioningArtifactOutputs;
  }


  public DescribeProvisioningParametersOutput provisioningArtifactOutputKeys(List provisioningArtifactOutputKeys) {
    this.provisioningArtifactOutputKeys = provisioningArtifactOutputKeys;
    return this;
  }

  /**
   * Get provisioningArtifactOutputKeys
   * @return provisioningArtifactOutputKeys
   */
  @javax.annotation.Nullable
  public List getProvisioningArtifactOutputKeys() {
    return provisioningArtifactOutputKeys;
  }

  public void setProvisioningArtifactOutputKeys(List provisioningArtifactOutputKeys) {
    this.provisioningArtifactOutputKeys = provisioningArtifactOutputKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProvisioningParametersOutput describeProvisioningParametersOutput = (DescribeProvisioningParametersOutput) o;
    return Objects.equals(this.provisioningArtifactParameters, describeProvisioningParametersOutput.provisioningArtifactParameters) &&
        Objects.equals(this.constraintSummaries, describeProvisioningParametersOutput.constraintSummaries) &&
        Objects.equals(this.usageInstructions, describeProvisioningParametersOutput.usageInstructions) &&
        Objects.equals(this.tagOptions, describeProvisioningParametersOutput.tagOptions) &&
        Objects.equals(this.provisioningArtifactPreferences, describeProvisioningParametersOutput.provisioningArtifactPreferences) &&
        Objects.equals(this.provisioningArtifactOutputs, describeProvisioningParametersOutput.provisioningArtifactOutputs) &&
        Objects.equals(this.provisioningArtifactOutputKeys, describeProvisioningParametersOutput.provisioningArtifactOutputKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioningArtifactParameters, constraintSummaries, usageInstructions, tagOptions, provisioningArtifactPreferences, provisioningArtifactOutputs, provisioningArtifactOutputKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProvisioningParametersOutput {\n");
    sb.append("    provisioningArtifactParameters: ").append(toIndentedString(provisioningArtifactParameters)).append("\n");
    sb.append("    constraintSummaries: ").append(toIndentedString(constraintSummaries)).append("\n");
    sb.append("    usageInstructions: ").append(toIndentedString(usageInstructions)).append("\n");
    sb.append("    tagOptions: ").append(toIndentedString(tagOptions)).append("\n");
    sb.append("    provisioningArtifactPreferences: ").append(toIndentedString(provisioningArtifactPreferences)).append("\n");
    sb.append("    provisioningArtifactOutputs: ").append(toIndentedString(provisioningArtifactOutputs)).append("\n");
    sb.append("    provisioningArtifactOutputKeys: ").append(toIndentedString(provisioningArtifactOutputKeys)).append("\n");
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
    openapiFields.add("ProvisioningArtifactParameters");
    openapiFields.add("ConstraintSummaries");
    openapiFields.add("UsageInstructions");
    openapiFields.add("TagOptions");
    openapiFields.add("ProvisioningArtifactPreferences");
    openapiFields.add("ProvisioningArtifactOutputs");
    openapiFields.add("ProvisioningArtifactOutputKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeProvisioningParametersOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeProvisioningParametersOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeProvisioningParametersOutput is not found in the empty JSON string", DescribeProvisioningParametersOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeProvisioningParametersOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeProvisioningParametersOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ProvisioningArtifactParameters`
      if (jsonObj.get("ProvisioningArtifactParameters") != null && !jsonObj.get("ProvisioningArtifactParameters").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProvisioningArtifactParameters"));
      }
      // validate the optional field `ConstraintSummaries`
      if (jsonObj.get("ConstraintSummaries") != null && !jsonObj.get("ConstraintSummaries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ConstraintSummaries"));
      }
      // validate the optional field `UsageInstructions`
      if (jsonObj.get("UsageInstructions") != null && !jsonObj.get("UsageInstructions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("UsageInstructions"));
      }
      // validate the optional field `TagOptions`
      if (jsonObj.get("TagOptions") != null && !jsonObj.get("TagOptions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TagOptions"));
      }
      // validate the optional field `ProvisioningArtifactPreferences`
      if (jsonObj.get("ProvisioningArtifactPreferences") != null && !jsonObj.get("ProvisioningArtifactPreferences").isJsonNull()) {
        DescribeProvisioningParametersOutputProvisioningArtifactPreferences.validateJsonElement(jsonObj.get("ProvisioningArtifactPreferences"));
      }
      // validate the optional field `ProvisioningArtifactOutputs`
      if (jsonObj.get("ProvisioningArtifactOutputs") != null && !jsonObj.get("ProvisioningArtifactOutputs").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProvisioningArtifactOutputs"));
      }
      // validate the optional field `ProvisioningArtifactOutputKeys`
      if (jsonObj.get("ProvisioningArtifactOutputKeys") != null && !jsonObj.get("ProvisioningArtifactOutputKeys").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProvisioningArtifactOutputKeys"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeProvisioningParametersOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeProvisioningParametersOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeProvisioningParametersOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeProvisioningParametersOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeProvisioningParametersOutput>() {
           @Override
           public void write(JsonWriter out, DescribeProvisioningParametersOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeProvisioningParametersOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeProvisioningParametersOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeProvisioningParametersOutput
   * @throws IOException if the JSON string is invalid with respect to DescribeProvisioningParametersOutput
   */
  public static DescribeProvisioningParametersOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeProvisioningParametersOutput.class);
  }

  /**
   * Convert an instance of DescribeProvisioningParametersOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

