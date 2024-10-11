/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
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
import org.openapitools.client.model.CreateDistributionResultDistribution;

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
 * The returned result of the corresponding request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateDistributionResult {
  public static final String SERIALIZED_NAME_DISTRIBUTION = "Distribution";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION)
  private CreateDistributionResultDistribution distribution;

  public UpdateDistributionResult() {
  }

  public UpdateDistributionResult distribution(CreateDistributionResultDistribution distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Get distribution
   * @return distribution
   */
  @javax.annotation.Nullable
  public CreateDistributionResultDistribution getDistribution() {
    return distribution;
  }

  public void setDistribution(CreateDistributionResultDistribution distribution) {
    this.distribution = distribution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDistributionResult updateDistributionResult = (UpdateDistributionResult) o;
    return Objects.equals(this.distribution, updateDistributionResult.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDistributionResult {\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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
    openapiFields.add("Distribution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateDistributionResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateDistributionResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDistributionResult is not found in the empty JSON string", UpdateDistributionResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateDistributionResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDistributionResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Distribution`
      if (jsonObj.get("Distribution") != null && !jsonObj.get("Distribution").isJsonNull()) {
        CreateDistributionResultDistribution.validateJsonElement(jsonObj.get("Distribution"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDistributionResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDistributionResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDistributionResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDistributionResult.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDistributionResult>() {
           @Override
           public void write(JsonWriter out, UpdateDistributionResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDistributionResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateDistributionResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateDistributionResult
   * @throws IOException if the JSON string is invalid with respect to UpdateDistributionResult
   */
  public static UpdateDistributionResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDistributionResult.class);
  }

  /**
   * Convert an instance of UpdateDistributionResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

