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
import org.openapitools.client.model.ObjectiveSensitivity;

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
 * SolutionConfigOptimizationObjective
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SolutionConfigOptimizationObjective {
  public static final String SERIALIZED_NAME_ITEM_ATTRIBUTE = "itemAttribute";
  @SerializedName(SERIALIZED_NAME_ITEM_ATTRIBUTE)
  private String itemAttribute;

  public static final String SERIALIZED_NAME_OBJECTIVE_SENSITIVITY = "objectiveSensitivity";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_SENSITIVITY)
  private ObjectiveSensitivity objectiveSensitivity;

  public SolutionConfigOptimizationObjective() {
  }

  public SolutionConfigOptimizationObjective itemAttribute(String itemAttribute) {
    this.itemAttribute = itemAttribute;
    return this;
  }

  /**
   * Get itemAttribute
   * @return itemAttribute
   */
  @javax.annotation.Nullable
  public String getItemAttribute() {
    return itemAttribute;
  }

  public void setItemAttribute(String itemAttribute) {
    this.itemAttribute = itemAttribute;
  }


  public SolutionConfigOptimizationObjective objectiveSensitivity(ObjectiveSensitivity objectiveSensitivity) {
    this.objectiveSensitivity = objectiveSensitivity;
    return this;
  }

  /**
   * Get objectiveSensitivity
   * @return objectiveSensitivity
   */
  @javax.annotation.Nullable
  public ObjectiveSensitivity getObjectiveSensitivity() {
    return objectiveSensitivity;
  }

  public void setObjectiveSensitivity(ObjectiveSensitivity objectiveSensitivity) {
    this.objectiveSensitivity = objectiveSensitivity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionConfigOptimizationObjective solutionConfigOptimizationObjective = (SolutionConfigOptimizationObjective) o;
    return Objects.equals(this.itemAttribute, solutionConfigOptimizationObjective.itemAttribute) &&
        Objects.equals(this.objectiveSensitivity, solutionConfigOptimizationObjective.objectiveSensitivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemAttribute, objectiveSensitivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionConfigOptimizationObjective {\n");
    sb.append("    itemAttribute: ").append(toIndentedString(itemAttribute)).append("\n");
    sb.append("    objectiveSensitivity: ").append(toIndentedString(objectiveSensitivity)).append("\n");
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
    openapiFields.add("itemAttribute");
    openapiFields.add("objectiveSensitivity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SolutionConfigOptimizationObjective
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SolutionConfigOptimizationObjective.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SolutionConfigOptimizationObjective is not found in the empty JSON string", SolutionConfigOptimizationObjective.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SolutionConfigOptimizationObjective.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SolutionConfigOptimizationObjective` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `itemAttribute`
      if (jsonObj.get("itemAttribute") != null && !jsonObj.get("itemAttribute").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("itemAttribute"));
      }
      // validate the optional field `objectiveSensitivity`
      if (jsonObj.get("objectiveSensitivity") != null && !jsonObj.get("objectiveSensitivity").isJsonNull()) {
        ObjectiveSensitivity.validateJsonElement(jsonObj.get("objectiveSensitivity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SolutionConfigOptimizationObjective.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SolutionConfigOptimizationObjective' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SolutionConfigOptimizationObjective> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SolutionConfigOptimizationObjective.class));

       return (TypeAdapter<T>) new TypeAdapter<SolutionConfigOptimizationObjective>() {
           @Override
           public void write(JsonWriter out, SolutionConfigOptimizationObjective value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SolutionConfigOptimizationObjective read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SolutionConfigOptimizationObjective given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SolutionConfigOptimizationObjective
   * @throws IOException if the JSON string is invalid with respect to SolutionConfigOptimizationObjective
   */
  public static SolutionConfigOptimizationObjective fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SolutionConfigOptimizationObjective.class);
  }

  /**
   * Convert an instance of SolutionConfigOptimizationObjective to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

