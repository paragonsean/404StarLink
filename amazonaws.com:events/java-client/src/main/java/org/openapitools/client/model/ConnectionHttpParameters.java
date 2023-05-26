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
 * Contains additional parameters for the connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConnectionHttpParameters {
  public static final String SERIALIZED_NAME_HEADER_PARAMETERS = "HeaderParameters";
  @SerializedName(SERIALIZED_NAME_HEADER_PARAMETERS)
  private List headerParameters;

  public static final String SERIALIZED_NAME_QUERY_STRING_PARAMETERS = "QueryStringParameters";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING_PARAMETERS)
  private List queryStringParameters;

  public static final String SERIALIZED_NAME_BODY_PARAMETERS = "BodyParameters";
  @SerializedName(SERIALIZED_NAME_BODY_PARAMETERS)
  private List bodyParameters;

  public ConnectionHttpParameters() {
  }

  public ConnectionHttpParameters headerParameters(List headerParameters) {
    this.headerParameters = headerParameters;
    return this;
  }

  /**
   * Get headerParameters
   * @return headerParameters
   */
  @javax.annotation.Nullable
  public List getHeaderParameters() {
    return headerParameters;
  }

  public void setHeaderParameters(List headerParameters) {
    this.headerParameters = headerParameters;
  }


  public ConnectionHttpParameters queryStringParameters(List queryStringParameters) {
    this.queryStringParameters = queryStringParameters;
    return this;
  }

  /**
   * Get queryStringParameters
   * @return queryStringParameters
   */
  @javax.annotation.Nullable
  public List getQueryStringParameters() {
    return queryStringParameters;
  }

  public void setQueryStringParameters(List queryStringParameters) {
    this.queryStringParameters = queryStringParameters;
  }


  public ConnectionHttpParameters bodyParameters(List bodyParameters) {
    this.bodyParameters = bodyParameters;
    return this;
  }

  /**
   * Get bodyParameters
   * @return bodyParameters
   */
  @javax.annotation.Nullable
  public List getBodyParameters() {
    return bodyParameters;
  }

  public void setBodyParameters(List bodyParameters) {
    this.bodyParameters = bodyParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionHttpParameters connectionHttpParameters = (ConnectionHttpParameters) o;
    return Objects.equals(this.headerParameters, connectionHttpParameters.headerParameters) &&
        Objects.equals(this.queryStringParameters, connectionHttpParameters.queryStringParameters) &&
        Objects.equals(this.bodyParameters, connectionHttpParameters.bodyParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerParameters, queryStringParameters, bodyParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionHttpParameters {\n");
    sb.append("    headerParameters: ").append(toIndentedString(headerParameters)).append("\n");
    sb.append("    queryStringParameters: ").append(toIndentedString(queryStringParameters)).append("\n");
    sb.append("    bodyParameters: ").append(toIndentedString(bodyParameters)).append("\n");
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
    openapiFields.add("HeaderParameters");
    openapiFields.add("QueryStringParameters");
    openapiFields.add("BodyParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConnectionHttpParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConnectionHttpParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionHttpParameters is not found in the empty JSON string", ConnectionHttpParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConnectionHttpParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectionHttpParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `HeaderParameters`
      if (jsonObj.get("HeaderParameters") != null && !jsonObj.get("HeaderParameters").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("HeaderParameters"));
      }
      // validate the optional field `QueryStringParameters`
      if (jsonObj.get("QueryStringParameters") != null && !jsonObj.get("QueryStringParameters").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("QueryStringParameters"));
      }
      // validate the optional field `BodyParameters`
      if (jsonObj.get("BodyParameters") != null && !jsonObj.get("BodyParameters").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("BodyParameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionHttpParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionHttpParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionHttpParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionHttpParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionHttpParameters>() {
           @Override
           public void write(JsonWriter out, ConnectionHttpParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionHttpParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConnectionHttpParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConnectionHttpParameters
   * @throws IOException if the JSON string is invalid with respect to ConnectionHttpParameters
   */
  public static ConnectionHttpParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionHttpParameters.class);
  }

  /**
   * Convert an instance of ConnectionHttpParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

