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
 * SolutionAutoMLResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SolutionAutoMLResult {
  public static final String SERIALIZED_NAME_BEST_RECIPE_ARN = "bestRecipeArn";
  @SerializedName(SERIALIZED_NAME_BEST_RECIPE_ARN)
  private String bestRecipeArn;

  public SolutionAutoMLResult() {
  }

  public SolutionAutoMLResult bestRecipeArn(String bestRecipeArn) {
    this.bestRecipeArn = bestRecipeArn;
    return this;
  }

  /**
   * Get bestRecipeArn
   * @return bestRecipeArn
   */
  @javax.annotation.Nullable
  public String getBestRecipeArn() {
    return bestRecipeArn;
  }

  public void setBestRecipeArn(String bestRecipeArn) {
    this.bestRecipeArn = bestRecipeArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionAutoMLResult solutionAutoMLResult = (SolutionAutoMLResult) o;
    return Objects.equals(this.bestRecipeArn, solutionAutoMLResult.bestRecipeArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestRecipeArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionAutoMLResult {\n");
    sb.append("    bestRecipeArn: ").append(toIndentedString(bestRecipeArn)).append("\n");
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
    openapiFields.add("bestRecipeArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SolutionAutoMLResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SolutionAutoMLResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SolutionAutoMLResult is not found in the empty JSON string", SolutionAutoMLResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SolutionAutoMLResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SolutionAutoMLResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bestRecipeArn`
      if (jsonObj.get("bestRecipeArn") != null && !jsonObj.get("bestRecipeArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("bestRecipeArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SolutionAutoMLResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SolutionAutoMLResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SolutionAutoMLResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SolutionAutoMLResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SolutionAutoMLResult>() {
           @Override
           public void write(JsonWriter out, SolutionAutoMLResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SolutionAutoMLResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SolutionAutoMLResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SolutionAutoMLResult
   * @throws IOException if the JSON string is invalid with respect to SolutionAutoMLResult
   */
  public static SolutionAutoMLResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SolutionAutoMLResult.class);
  }

  /**
   * Convert an instance of SolutionAutoMLResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

