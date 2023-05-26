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
import org.openapitools.client.model.ConnectionAuthResponseParametersApiKeyAuthParameters;
import org.openapitools.client.model.ConnectionAuthResponseParametersBasicAuthParameters;
import org.openapitools.client.model.ConnectionAuthResponseParametersInvocationHttpParameters;
import org.openapitools.client.model.ConnectionAuthResponseParametersOAuthParameters;

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
 * DescribeConnectionResponseAuthParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeConnectionResponseAuthParameters {
  public static final String SERIALIZED_NAME_BASIC_AUTH_PARAMETERS = "BasicAuthParameters";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH_PARAMETERS)
  private ConnectionAuthResponseParametersBasicAuthParameters basicAuthParameters;

  public static final String SERIALIZED_NAME_OAUTH_PARAMETERS = "OAuthParameters";
  @SerializedName(SERIALIZED_NAME_OAUTH_PARAMETERS)
  private ConnectionAuthResponseParametersOAuthParameters oauthParameters;

  public static final String SERIALIZED_NAME_API_KEY_AUTH_PARAMETERS = "ApiKeyAuthParameters";
  @SerializedName(SERIALIZED_NAME_API_KEY_AUTH_PARAMETERS)
  private ConnectionAuthResponseParametersApiKeyAuthParameters apiKeyAuthParameters;

  public static final String SERIALIZED_NAME_INVOCATION_HTTP_PARAMETERS = "InvocationHttpParameters";
  @SerializedName(SERIALIZED_NAME_INVOCATION_HTTP_PARAMETERS)
  private ConnectionAuthResponseParametersInvocationHttpParameters invocationHttpParameters;

  public DescribeConnectionResponseAuthParameters() {
  }

  public DescribeConnectionResponseAuthParameters basicAuthParameters(ConnectionAuthResponseParametersBasicAuthParameters basicAuthParameters) {
    this.basicAuthParameters = basicAuthParameters;
    return this;
  }

  /**
   * Get basicAuthParameters
   * @return basicAuthParameters
   */
  @javax.annotation.Nullable
  public ConnectionAuthResponseParametersBasicAuthParameters getBasicAuthParameters() {
    return basicAuthParameters;
  }

  public void setBasicAuthParameters(ConnectionAuthResponseParametersBasicAuthParameters basicAuthParameters) {
    this.basicAuthParameters = basicAuthParameters;
  }


  public DescribeConnectionResponseAuthParameters oauthParameters(ConnectionAuthResponseParametersOAuthParameters oauthParameters) {
    this.oauthParameters = oauthParameters;
    return this;
  }

  /**
   * Get oauthParameters
   * @return oauthParameters
   */
  @javax.annotation.Nullable
  public ConnectionAuthResponseParametersOAuthParameters getOauthParameters() {
    return oauthParameters;
  }

  public void setOauthParameters(ConnectionAuthResponseParametersOAuthParameters oauthParameters) {
    this.oauthParameters = oauthParameters;
  }


  public DescribeConnectionResponseAuthParameters apiKeyAuthParameters(ConnectionAuthResponseParametersApiKeyAuthParameters apiKeyAuthParameters) {
    this.apiKeyAuthParameters = apiKeyAuthParameters;
    return this;
  }

  /**
   * Get apiKeyAuthParameters
   * @return apiKeyAuthParameters
   */
  @javax.annotation.Nullable
  public ConnectionAuthResponseParametersApiKeyAuthParameters getApiKeyAuthParameters() {
    return apiKeyAuthParameters;
  }

  public void setApiKeyAuthParameters(ConnectionAuthResponseParametersApiKeyAuthParameters apiKeyAuthParameters) {
    this.apiKeyAuthParameters = apiKeyAuthParameters;
  }


  public DescribeConnectionResponseAuthParameters invocationHttpParameters(ConnectionAuthResponseParametersInvocationHttpParameters invocationHttpParameters) {
    this.invocationHttpParameters = invocationHttpParameters;
    return this;
  }

  /**
   * Get invocationHttpParameters
   * @return invocationHttpParameters
   */
  @javax.annotation.Nullable
  public ConnectionAuthResponseParametersInvocationHttpParameters getInvocationHttpParameters() {
    return invocationHttpParameters;
  }

  public void setInvocationHttpParameters(ConnectionAuthResponseParametersInvocationHttpParameters invocationHttpParameters) {
    this.invocationHttpParameters = invocationHttpParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeConnectionResponseAuthParameters describeConnectionResponseAuthParameters = (DescribeConnectionResponseAuthParameters) o;
    return Objects.equals(this.basicAuthParameters, describeConnectionResponseAuthParameters.basicAuthParameters) &&
        Objects.equals(this.oauthParameters, describeConnectionResponseAuthParameters.oauthParameters) &&
        Objects.equals(this.apiKeyAuthParameters, describeConnectionResponseAuthParameters.apiKeyAuthParameters) &&
        Objects.equals(this.invocationHttpParameters, describeConnectionResponseAuthParameters.invocationHttpParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuthParameters, oauthParameters, apiKeyAuthParameters, invocationHttpParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeConnectionResponseAuthParameters {\n");
    sb.append("    basicAuthParameters: ").append(toIndentedString(basicAuthParameters)).append("\n");
    sb.append("    oauthParameters: ").append(toIndentedString(oauthParameters)).append("\n");
    sb.append("    apiKeyAuthParameters: ").append(toIndentedString(apiKeyAuthParameters)).append("\n");
    sb.append("    invocationHttpParameters: ").append(toIndentedString(invocationHttpParameters)).append("\n");
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
    openapiFields.add("BasicAuthParameters");
    openapiFields.add("OAuthParameters");
    openapiFields.add("ApiKeyAuthParameters");
    openapiFields.add("InvocationHttpParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeConnectionResponseAuthParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeConnectionResponseAuthParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeConnectionResponseAuthParameters is not found in the empty JSON string", DescribeConnectionResponseAuthParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeConnectionResponseAuthParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeConnectionResponseAuthParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `BasicAuthParameters`
      if (jsonObj.get("BasicAuthParameters") != null && !jsonObj.get("BasicAuthParameters").isJsonNull()) {
        ConnectionAuthResponseParametersBasicAuthParameters.validateJsonElement(jsonObj.get("BasicAuthParameters"));
      }
      // validate the optional field `OAuthParameters`
      if (jsonObj.get("OAuthParameters") != null && !jsonObj.get("OAuthParameters").isJsonNull()) {
        ConnectionAuthResponseParametersOAuthParameters.validateJsonElement(jsonObj.get("OAuthParameters"));
      }
      // validate the optional field `ApiKeyAuthParameters`
      if (jsonObj.get("ApiKeyAuthParameters") != null && !jsonObj.get("ApiKeyAuthParameters").isJsonNull()) {
        ConnectionAuthResponseParametersApiKeyAuthParameters.validateJsonElement(jsonObj.get("ApiKeyAuthParameters"));
      }
      // validate the optional field `InvocationHttpParameters`
      if (jsonObj.get("InvocationHttpParameters") != null && !jsonObj.get("InvocationHttpParameters").isJsonNull()) {
        ConnectionAuthResponseParametersInvocationHttpParameters.validateJsonElement(jsonObj.get("InvocationHttpParameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeConnectionResponseAuthParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeConnectionResponseAuthParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeConnectionResponseAuthParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeConnectionResponseAuthParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeConnectionResponseAuthParameters>() {
           @Override
           public void write(JsonWriter out, DescribeConnectionResponseAuthParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeConnectionResponseAuthParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeConnectionResponseAuthParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeConnectionResponseAuthParameters
   * @throws IOException if the JSON string is invalid with respect to DescribeConnectionResponseAuthParameters
   */
  public static DescribeConnectionResponseAuthParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeConnectionResponseAuthParameters.class);
  }

  /**
   * Convert an instance of DescribeConnectionResponseAuthParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

