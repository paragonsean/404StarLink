/*
 * Crossbrowsertesting.com Screenshot Comparisons API
 * What's in this version:   1. Compare two screenshots for layout differences   2. Compare a full screenshot test of browsers to a single baseline browser for layout differences.   3. Compare a screenshot test version to another test version - good for regression tests.   4. Get links to the Comparison UI for visual representation of layout differences
 *
 * The version of the OpenAPI document: 3.0.0
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FullComparisonTestBase;
import org.openapitools.client.model.Target;

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
 * FullComparisonTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:20.933088-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FullComparisonTest {
  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private FullComparisonTestBase base;

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<Target> targets = new ArrayList<>();

  public FullComparisonTest() {
  }

  public FullComparisonTest base(FullComparisonTestBase base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
   */
  @javax.annotation.Nullable
  public FullComparisonTestBase getBase() {
    return base;
  }

  public void setBase(FullComparisonTestBase base) {
    this.base = base;
  }


  public FullComparisonTest targets(List<Target> targets) {
    this.targets = targets;
    return this;
  }

  public FullComparisonTest addTargetsItem(Target targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
   */
  @javax.annotation.Nullable
  public List<Target> getTargets() {
    return targets;
  }

  public void setTargets(List<Target> targets) {
    this.targets = targets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullComparisonTest fullComparisonTest = (FullComparisonTest) o;
    return Objects.equals(this.base, fullComparisonTest.base) &&
        Objects.equals(this.targets, fullComparisonTest.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullComparisonTest {\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
    openapiFields.add("base");
    openapiFields.add("targets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FullComparisonTest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FullComparisonTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FullComparisonTest is not found in the empty JSON string", FullComparisonTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FullComparisonTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FullComparisonTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `base`
      if (jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) {
        FullComparisonTestBase.validateJsonElement(jsonObj.get("base"));
      }
      if (jsonObj.get("targets") != null && !jsonObj.get("targets").isJsonNull()) {
        JsonArray jsonArraytargets = jsonObj.getAsJsonArray("targets");
        if (jsonArraytargets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("targets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `targets` to be an array in the JSON string but got `%s`", jsonObj.get("targets").toString()));
          }

          // validate the optional field `targets` (array)
          for (int i = 0; i < jsonArraytargets.size(); i++) {
            Target.validateJsonElement(jsonArraytargets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FullComparisonTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FullComparisonTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FullComparisonTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FullComparisonTest.class));

       return (TypeAdapter<T>) new TypeAdapter<FullComparisonTest>() {
           @Override
           public void write(JsonWriter out, FullComparisonTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FullComparisonTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FullComparisonTest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FullComparisonTest
   * @throws IOException if the JSON string is invalid with respect to FullComparisonTest
   */
  public static FullComparisonTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FullComparisonTest.class);
  }

  /**
   * Convert an instance of FullComparisonTest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

