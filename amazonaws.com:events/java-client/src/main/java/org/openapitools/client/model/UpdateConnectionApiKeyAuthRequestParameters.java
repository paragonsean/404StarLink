/*
 * Amazon CloudWatch Events
 * <p>Amazon EventBridge helps you to respond to state changes in your Amazon Web Services resources. When your resources change state, they automatically send events to an event stream. You can create rules that match selected events in the stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For example, you can configure rules to:</p> <ul> <li> <p>Automatically invoke an Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance enters the running state.</p> </li> <li> <p>Direct specific API records from CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential security or availability risks.</p> </li> <li> <p>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</p> </li> </ul> <p>For more information about the features of Amazon EventBridge, see the <a href=\"https://docs.aws.amazon.com/eventbridge/latest/userguide\">Amazon EventBridge User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2015-10-07
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
 * Contains the API key authorization parameters to use to update the connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateConnectionApiKeyAuthRequestParameters {
  public static final String SERIALIZED_NAME_API_KEY_NAME = "ApiKeyName";
  @SerializedName(SERIALIZED_NAME_API_KEY_NAME)
  private String apiKeyName;

  public static final String SERIALIZED_NAME_API_KEY_VALUE = "ApiKeyValue";
  @SerializedName(SERIALIZED_NAME_API_KEY_VALUE)
  private String apiKeyValue;

  public UpdateConnectionApiKeyAuthRequestParameters() {
  }

  public UpdateConnectionApiKeyAuthRequestParameters apiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
    return this;
  }

  /**
   * Get apiKeyName
   * @return apiKeyName
   */
  @javax.annotation.Nullable
  public String getApiKeyName() {
    return apiKeyName;
  }

  public void setApiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
  }


  public UpdateConnectionApiKeyAuthRequestParameters apiKeyValue(String apiKeyValue) {
    this.apiKeyValue = apiKeyValue;
    return this;
  }

  /**
   * Get apiKeyValue
   * @return apiKeyValue
   */
  @javax.annotation.Nullable
  public String getApiKeyValue() {
    return apiKeyValue;
  }

  public void setApiKeyValue(String apiKeyValue) {
    this.apiKeyValue = apiKeyValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConnectionApiKeyAuthRequestParameters updateConnectionApiKeyAuthRequestParameters = (UpdateConnectionApiKeyAuthRequestParameters) o;
    return Objects.equals(this.apiKeyName, updateConnectionApiKeyAuthRequestParameters.apiKeyName) &&
        Objects.equals(this.apiKeyValue, updateConnectionApiKeyAuthRequestParameters.apiKeyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeyName, apiKeyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConnectionApiKeyAuthRequestParameters {\n");
    sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
    sb.append("    apiKeyValue: ").append(toIndentedString(apiKeyValue)).append("\n");
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
    openapiFields.add("ApiKeyName");
    openapiFields.add("ApiKeyValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateConnectionApiKeyAuthRequestParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateConnectionApiKeyAuthRequestParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateConnectionApiKeyAuthRequestParameters is not found in the empty JSON string", UpdateConnectionApiKeyAuthRequestParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateConnectionApiKeyAuthRequestParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateConnectionApiKeyAuthRequestParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ApiKeyName`
      if (jsonObj.get("ApiKeyName") != null && !jsonObj.get("ApiKeyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ApiKeyName"));
      }
      // validate the optional field `ApiKeyValue`
      if (jsonObj.get("ApiKeyValue") != null && !jsonObj.get("ApiKeyValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ApiKeyValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateConnectionApiKeyAuthRequestParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateConnectionApiKeyAuthRequestParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateConnectionApiKeyAuthRequestParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateConnectionApiKeyAuthRequestParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateConnectionApiKeyAuthRequestParameters>() {
           @Override
           public void write(JsonWriter out, UpdateConnectionApiKeyAuthRequestParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateConnectionApiKeyAuthRequestParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateConnectionApiKeyAuthRequestParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateConnectionApiKeyAuthRequestParameters
   * @throws IOException if the JSON string is invalid with respect to UpdateConnectionApiKeyAuthRequestParameters
   */
  public static UpdateConnectionApiKeyAuthRequestParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateConnectionApiKeyAuthRequestParameters.class);
  }

  /**
   * Convert an instance of UpdateConnectionApiKeyAuthRequestParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

