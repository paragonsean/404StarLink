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
 * GetCloudFormationStackRecordsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetCloudFormationStackRecordsResult {
  public static final String SERIALIZED_NAME_CLOUD_FORMATION_STACK_RECORDS = "cloudFormationStackRecords";
  @SerializedName(SERIALIZED_NAME_CLOUD_FORMATION_STACK_RECORDS)
  private List cloudFormationStackRecords;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public GetCloudFormationStackRecordsResult() {
  }

  public GetCloudFormationStackRecordsResult cloudFormationStackRecords(List cloudFormationStackRecords) {
    this.cloudFormationStackRecords = cloudFormationStackRecords;
    return this;
  }

  /**
   * Get cloudFormationStackRecords
   * @return cloudFormationStackRecords
   */
  @javax.annotation.Nullable
  public List getCloudFormationStackRecords() {
    return cloudFormationStackRecords;
  }

  public void setCloudFormationStackRecords(List cloudFormationStackRecords) {
    this.cloudFormationStackRecords = cloudFormationStackRecords;
  }


  public GetCloudFormationStackRecordsResult nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Get nextPageToken
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCloudFormationStackRecordsResult getCloudFormationStackRecordsResult = (GetCloudFormationStackRecordsResult) o;
    return Objects.equals(this.cloudFormationStackRecords, getCloudFormationStackRecordsResult.cloudFormationStackRecords) &&
        Objects.equals(this.nextPageToken, getCloudFormationStackRecordsResult.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudFormationStackRecords, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCloudFormationStackRecordsResult {\n");
    sb.append("    cloudFormationStackRecords: ").append(toIndentedString(cloudFormationStackRecords)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("cloudFormationStackRecords");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCloudFormationStackRecordsResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCloudFormationStackRecordsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCloudFormationStackRecordsResult is not found in the empty JSON string", GetCloudFormationStackRecordsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCloudFormationStackRecordsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCloudFormationStackRecordsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cloudFormationStackRecords`
      if (jsonObj.get("cloudFormationStackRecords") != null && !jsonObj.get("cloudFormationStackRecords").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("cloudFormationStackRecords"));
      }
      // validate the optional field `nextPageToken`
      if (jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("nextPageToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCloudFormationStackRecordsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCloudFormationStackRecordsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCloudFormationStackRecordsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCloudFormationStackRecordsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCloudFormationStackRecordsResult>() {
           @Override
           public void write(JsonWriter out, GetCloudFormationStackRecordsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCloudFormationStackRecordsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCloudFormationStackRecordsResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCloudFormationStackRecordsResult
   * @throws IOException if the JSON string is invalid with respect to GetCloudFormationStackRecordsResult
   */
  public static GetCloudFormationStackRecordsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCloudFormationStackRecordsResult.class);
  }

  /**
   * Convert an instance of GetCloudFormationStackRecordsResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

