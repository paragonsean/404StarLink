/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
import org.openapitools.client.model.ArtifactRule;
import org.openapitools.client.model.SigningKey;

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
 * This contains the fields corresponding to the definition of a software supply chain step in an in-toto layout. This information goes into a Grafeas note.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class InToto {
  public static final String SERIALIZED_NAME_EXPECTED_COMMAND = "expectedCommand";
  @SerializedName(SERIALIZED_NAME_EXPECTED_COMMAND)
  private List<String> expectedCommand = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPECTED_MATERIALS = "expectedMaterials";
  @SerializedName(SERIALIZED_NAME_EXPECTED_MATERIALS)
  private List<ArtifactRule> expectedMaterials = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPECTED_PRODUCTS = "expectedProducts";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PRODUCTS)
  private List<ArtifactRule> expectedProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIGNING_KEYS = "signingKeys";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEYS)
  private List<SigningKey> signingKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_STEP_NAME = "stepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME)
  private String stepName;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private String threshold;

  public InToto() {
  }

  public InToto expectedCommand(List<String> expectedCommand) {
    this.expectedCommand = expectedCommand;
    return this;
  }

  public InToto addExpectedCommandItem(String expectedCommandItem) {
    if (this.expectedCommand == null) {
      this.expectedCommand = new ArrayList<>();
    }
    this.expectedCommand.add(expectedCommandItem);
    return this;
  }

  /**
   * This field contains the expected command used to perform the step.
   * @return expectedCommand
   */
  @javax.annotation.Nullable
  public List<String> getExpectedCommand() {
    return expectedCommand;
  }

  public void setExpectedCommand(List<String> expectedCommand) {
    this.expectedCommand = expectedCommand;
  }


  public InToto expectedMaterials(List<ArtifactRule> expectedMaterials) {
    this.expectedMaterials = expectedMaterials;
    return this;
  }

  public InToto addExpectedMaterialsItem(ArtifactRule expectedMaterialsItem) {
    if (this.expectedMaterials == null) {
      this.expectedMaterials = new ArrayList<>();
    }
    this.expectedMaterials.add(expectedMaterialsItem);
    return this;
  }

  /**
   * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the step.
   * @return expectedMaterials
   */
  @javax.annotation.Nullable
  public List<ArtifactRule> getExpectedMaterials() {
    return expectedMaterials;
  }

  public void setExpectedMaterials(List<ArtifactRule> expectedMaterials) {
    this.expectedMaterials = expectedMaterials;
  }


  public InToto expectedProducts(List<ArtifactRule> expectedProducts) {
    this.expectedProducts = expectedProducts;
    return this;
  }

  public InToto addExpectedProductsItem(ArtifactRule expectedProductsItem) {
    if (this.expectedProducts == null) {
      this.expectedProducts = new ArrayList<>();
    }
    this.expectedProducts.add(expectedProductsItem);
    return this;
  }

  /**
   * Get expectedProducts
   * @return expectedProducts
   */
  @javax.annotation.Nullable
  public List<ArtifactRule> getExpectedProducts() {
    return expectedProducts;
  }

  public void setExpectedProducts(List<ArtifactRule> expectedProducts) {
    this.expectedProducts = expectedProducts;
  }


  public InToto signingKeys(List<SigningKey> signingKeys) {
    this.signingKeys = signingKeys;
    return this;
  }

  public InToto addSigningKeysItem(SigningKey signingKeysItem) {
    if (this.signingKeys == null) {
      this.signingKeys = new ArrayList<>();
    }
    this.signingKeys.add(signingKeysItem);
    return this;
  }

  /**
   * This field contains the public keys that can be used to verify the signatures on the step metadata.
   * @return signingKeys
   */
  @javax.annotation.Nullable
  public List<SigningKey> getSigningKeys() {
    return signingKeys;
  }

  public void setSigningKeys(List<SigningKey> signingKeys) {
    this.signingKeys = signingKeys;
  }


  public InToto stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

  /**
   * This field identifies the name of the step in the supply chain.
   * @return stepName
   */
  @javax.annotation.Nullable
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }


  public InToto threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * This field contains a value that indicates the minimum number of keys that need to be used to sign the step&#39;s in-toto link.
   * @return threshold
   */
  @javax.annotation.Nullable
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InToto inToto = (InToto) o;
    return Objects.equals(this.expectedCommand, inToto.expectedCommand) &&
        Objects.equals(this.expectedMaterials, inToto.expectedMaterials) &&
        Objects.equals(this.expectedProducts, inToto.expectedProducts) &&
        Objects.equals(this.signingKeys, inToto.signingKeys) &&
        Objects.equals(this.stepName, inToto.stepName) &&
        Objects.equals(this.threshold, inToto.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedCommand, expectedMaterials, expectedProducts, signingKeys, stepName, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InToto {\n");
    sb.append("    expectedCommand: ").append(toIndentedString(expectedCommand)).append("\n");
    sb.append("    expectedMaterials: ").append(toIndentedString(expectedMaterials)).append("\n");
    sb.append("    expectedProducts: ").append(toIndentedString(expectedProducts)).append("\n");
    sb.append("    signingKeys: ").append(toIndentedString(signingKeys)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
    openapiFields.add("expectedCommand");
    openapiFields.add("expectedMaterials");
    openapiFields.add("expectedProducts");
    openapiFields.add("signingKeys");
    openapiFields.add("stepName");
    openapiFields.add("threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InToto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InToto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InToto is not found in the empty JSON string", InToto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InToto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InToto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("expectedCommand") != null && !jsonObj.get("expectedCommand").isJsonNull() && !jsonObj.get("expectedCommand").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expectedCommand` to be an array in the JSON string but got `%s`", jsonObj.get("expectedCommand").toString()));
      }
      if (jsonObj.get("expectedMaterials") != null && !jsonObj.get("expectedMaterials").isJsonNull()) {
        JsonArray jsonArrayexpectedMaterials = jsonObj.getAsJsonArray("expectedMaterials");
        if (jsonArrayexpectedMaterials != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expectedMaterials").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expectedMaterials` to be an array in the JSON string but got `%s`", jsonObj.get("expectedMaterials").toString()));
          }

          // validate the optional field `expectedMaterials` (array)
          for (int i = 0; i < jsonArrayexpectedMaterials.size(); i++) {
            ArtifactRule.validateJsonElement(jsonArrayexpectedMaterials.get(i));
          };
        }
      }
      if (jsonObj.get("expectedProducts") != null && !jsonObj.get("expectedProducts").isJsonNull()) {
        JsonArray jsonArrayexpectedProducts = jsonObj.getAsJsonArray("expectedProducts");
        if (jsonArrayexpectedProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expectedProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expectedProducts` to be an array in the JSON string but got `%s`", jsonObj.get("expectedProducts").toString()));
          }

          // validate the optional field `expectedProducts` (array)
          for (int i = 0; i < jsonArrayexpectedProducts.size(); i++) {
            ArtifactRule.validateJsonElement(jsonArrayexpectedProducts.get(i));
          };
        }
      }
      if (jsonObj.get("signingKeys") != null && !jsonObj.get("signingKeys").isJsonNull()) {
        JsonArray jsonArraysigningKeys = jsonObj.getAsJsonArray("signingKeys");
        if (jsonArraysigningKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("signingKeys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `signingKeys` to be an array in the JSON string but got `%s`", jsonObj.get("signingKeys").toString()));
          }

          // validate the optional field `signingKeys` (array)
          for (int i = 0; i < jsonArraysigningKeys.size(); i++) {
            SigningKey.validateJsonElement(jsonArraysigningKeys.get(i));
          };
        }
      }
      if ((jsonObj.get("stepName") != null && !jsonObj.get("stepName").isJsonNull()) && !jsonObj.get("stepName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stepName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stepName").toString()));
      }
      if ((jsonObj.get("threshold") != null && !jsonObj.get("threshold").isJsonNull()) && !jsonObj.get("threshold").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threshold` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threshold").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InToto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InToto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InToto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InToto.class));

       return (TypeAdapter<T>) new TypeAdapter<InToto>() {
           @Override
           public void write(JsonWriter out, InToto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InToto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InToto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InToto
   * @throws IOException if the JSON string is invalid with respect to InToto
   */
  public static InToto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InToto.class);
  }

  /**
   * Convert an instance of InToto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

