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
 * UpdateRelationalDatabaseParametersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateRelationalDatabaseParametersRequest {
  public static final String SERIALIZED_NAME_RELATIONAL_DATABASE_NAME = "relationalDatabaseName";
  @SerializedName(SERIALIZED_NAME_RELATIONAL_DATABASE_NAME)
  private String relationalDatabaseName;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List parameters;

  public UpdateRelationalDatabaseParametersRequest() {
  }

  public UpdateRelationalDatabaseParametersRequest relationalDatabaseName(String relationalDatabaseName) {
    this.relationalDatabaseName = relationalDatabaseName;
    return this;
  }

  /**
   * Get relationalDatabaseName
   * @return relationalDatabaseName
   */
  @javax.annotation.Nonnull
  public String getRelationalDatabaseName() {
    return relationalDatabaseName;
  }

  public void setRelationalDatabaseName(String relationalDatabaseName) {
    this.relationalDatabaseName = relationalDatabaseName;
  }


  public UpdateRelationalDatabaseParametersRequest parameters(List parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   */
  @javax.annotation.Nonnull
  public List getParameters() {
    return parameters;
  }

  public void setParameters(List parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest = (UpdateRelationalDatabaseParametersRequest) o;
    return Objects.equals(this.relationalDatabaseName, updateRelationalDatabaseParametersRequest.relationalDatabaseName) &&
        Objects.equals(this.parameters, updateRelationalDatabaseParametersRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationalDatabaseName, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRelationalDatabaseParametersRequest {\n");
    sb.append("    relationalDatabaseName: ").append(toIndentedString(relationalDatabaseName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("relationalDatabaseName");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("relationalDatabaseName");
    openapiRequiredFields.add("parameters");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateRelationalDatabaseParametersRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateRelationalDatabaseParametersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateRelationalDatabaseParametersRequest is not found in the empty JSON string", UpdateRelationalDatabaseParametersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateRelationalDatabaseParametersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateRelationalDatabaseParametersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateRelationalDatabaseParametersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `relationalDatabaseName`
      String.validateJsonElement(jsonObj.get("relationalDatabaseName"));
      // validate the required field `parameters`
      List.validateJsonElement(jsonObj.get("parameters"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateRelationalDatabaseParametersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateRelationalDatabaseParametersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateRelationalDatabaseParametersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateRelationalDatabaseParametersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateRelationalDatabaseParametersRequest>() {
           @Override
           public void write(JsonWriter out, UpdateRelationalDatabaseParametersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateRelationalDatabaseParametersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateRelationalDatabaseParametersRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateRelationalDatabaseParametersRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateRelationalDatabaseParametersRequest
   */
  public static UpdateRelationalDatabaseParametersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateRelationalDatabaseParametersRequest.class);
  }

  /**
   * Convert an instance of UpdateRelationalDatabaseParametersRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

