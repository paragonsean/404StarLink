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
 * GetRelationalDatabaseLogStreamsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRelationalDatabaseLogStreamsResult {
  public static final String SERIALIZED_NAME_LOG_STREAMS = "logStreams";
  @SerializedName(SERIALIZED_NAME_LOG_STREAMS)
  private List logStreams;

  public GetRelationalDatabaseLogStreamsResult() {
  }

  public GetRelationalDatabaseLogStreamsResult logStreams(List logStreams) {
    this.logStreams = logStreams;
    return this;
  }

  /**
   * Get logStreams
   * @return logStreams
   */
  @javax.annotation.Nullable
  public List getLogStreams() {
    return logStreams;
  }

  public void setLogStreams(List logStreams) {
    this.logStreams = logStreams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRelationalDatabaseLogStreamsResult getRelationalDatabaseLogStreamsResult = (GetRelationalDatabaseLogStreamsResult) o;
    return Objects.equals(this.logStreams, getRelationalDatabaseLogStreamsResult.logStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRelationalDatabaseLogStreamsResult {\n");
    sb.append("    logStreams: ").append(toIndentedString(logStreams)).append("\n");
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
    openapiFields.add("logStreams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRelationalDatabaseLogStreamsResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRelationalDatabaseLogStreamsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRelationalDatabaseLogStreamsResult is not found in the empty JSON string", GetRelationalDatabaseLogStreamsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRelationalDatabaseLogStreamsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRelationalDatabaseLogStreamsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `logStreams`
      if (jsonObj.get("logStreams") != null && !jsonObj.get("logStreams").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("logStreams"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRelationalDatabaseLogStreamsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRelationalDatabaseLogStreamsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRelationalDatabaseLogStreamsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRelationalDatabaseLogStreamsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRelationalDatabaseLogStreamsResult>() {
           @Override
           public void write(JsonWriter out, GetRelationalDatabaseLogStreamsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRelationalDatabaseLogStreamsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRelationalDatabaseLogStreamsResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRelationalDatabaseLogStreamsResult
   * @throws IOException if the JSON string is invalid with respect to GetRelationalDatabaseLogStreamsResult
   */
  public static GetRelationalDatabaseLogStreamsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRelationalDatabaseLogStreamsResult.class);
  }

  /**
   * Convert an instance of GetRelationalDatabaseLogStreamsResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

