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
import org.openapitools.client.model.CreateDistributionResultOperation;
import org.openapitools.client.model.CreateKeyPairResultKeyPair;

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
 * CreateKeyPairResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateKeyPairResult {
  public static final String SERIALIZED_NAME_KEY_PAIR = "keyPair";
  @SerializedName(SERIALIZED_NAME_KEY_PAIR)
  private CreateKeyPairResultKeyPair keyPair;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_BASE64 = "publicKeyBase64";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_BASE64)
  private String publicKeyBase64;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_BASE64 = "privateKeyBase64";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_BASE64)
  private String privateKeyBase64;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private CreateDistributionResultOperation operation;

  public CreateKeyPairResult() {
  }

  public CreateKeyPairResult keyPair(CreateKeyPairResultKeyPair keyPair) {
    this.keyPair = keyPair;
    return this;
  }

  /**
   * Get keyPair
   * @return keyPair
   */
  @javax.annotation.Nullable
  public CreateKeyPairResultKeyPair getKeyPair() {
    return keyPair;
  }

  public void setKeyPair(CreateKeyPairResultKeyPair keyPair) {
    this.keyPair = keyPair;
  }


  public CreateKeyPairResult publicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
    return this;
  }

  /**
   * Get publicKeyBase64
   * @return publicKeyBase64
   */
  @javax.annotation.Nullable
  public String getPublicKeyBase64() {
    return publicKeyBase64;
  }

  public void setPublicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
  }


  public CreateKeyPairResult privateKeyBase64(String privateKeyBase64) {
    this.privateKeyBase64 = privateKeyBase64;
    return this;
  }

  /**
   * Get privateKeyBase64
   * @return privateKeyBase64
   */
  @javax.annotation.Nullable
  public String getPrivateKeyBase64() {
    return privateKeyBase64;
  }

  public void setPrivateKeyBase64(String privateKeyBase64) {
    this.privateKeyBase64 = privateKeyBase64;
  }


  public CreateKeyPairResult operation(CreateDistributionResultOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable
  public CreateDistributionResultOperation getOperation() {
    return operation;
  }

  public void setOperation(CreateDistributionResultOperation operation) {
    this.operation = operation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKeyPairResult createKeyPairResult = (CreateKeyPairResult) o;
    return Objects.equals(this.keyPair, createKeyPairResult.keyPair) &&
        Objects.equals(this.publicKeyBase64, createKeyPairResult.publicKeyBase64) &&
        Objects.equals(this.privateKeyBase64, createKeyPairResult.privateKeyBase64) &&
        Objects.equals(this.operation, createKeyPairResult.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyPair, publicKeyBase64, privateKeyBase64, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKeyPairResult {\n");
    sb.append("    keyPair: ").append(toIndentedString(keyPair)).append("\n");
    sb.append("    publicKeyBase64: ").append(toIndentedString(publicKeyBase64)).append("\n");
    sb.append("    privateKeyBase64: ").append(toIndentedString(privateKeyBase64)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("keyPair");
    openapiFields.add("publicKeyBase64");
    openapiFields.add("privateKeyBase64");
    openapiFields.add("operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateKeyPairResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateKeyPairResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateKeyPairResult is not found in the empty JSON string", CreateKeyPairResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateKeyPairResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateKeyPairResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `keyPair`
      if (jsonObj.get("keyPair") != null && !jsonObj.get("keyPair").isJsonNull()) {
        CreateKeyPairResultKeyPair.validateJsonElement(jsonObj.get("keyPair"));
      }
      // validate the optional field `publicKeyBase64`
      if (jsonObj.get("publicKeyBase64") != null && !jsonObj.get("publicKeyBase64").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("publicKeyBase64"));
      }
      // validate the optional field `privateKeyBase64`
      if (jsonObj.get("privateKeyBase64") != null && !jsonObj.get("privateKeyBase64").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("privateKeyBase64"));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        CreateDistributionResultOperation.validateJsonElement(jsonObj.get("operation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateKeyPairResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateKeyPairResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateKeyPairResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateKeyPairResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateKeyPairResult>() {
           @Override
           public void write(JsonWriter out, CreateKeyPairResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateKeyPairResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateKeyPairResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateKeyPairResult
   * @throws IOException if the JSON string is invalid with respect to CreateKeyPairResult
   */
  public static CreateKeyPairResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateKeyPairResult.class);
  }

  /**
   * Convert an instance of CreateKeyPairResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

