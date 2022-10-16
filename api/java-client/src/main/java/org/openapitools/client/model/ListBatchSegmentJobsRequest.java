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
 * ListBatchSegmentJobsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListBatchSegmentJobsRequest {
  public static final String SERIALIZED_NAME_SOLUTION_VERSION_ARN = "solutionVersionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_VERSION_ARN)
  private String solutionVersionArn;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public ListBatchSegmentJobsRequest() {
  }

  public ListBatchSegmentJobsRequest solutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
    return this;
  }

  /**
   * Get solutionVersionArn
   * @return solutionVersionArn
   */
  @javax.annotation.Nullable
  public String getSolutionVersionArn() {
    return solutionVersionArn;
  }

  public void setSolutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
  }


  public ListBatchSegmentJobsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public ListBatchSegmentJobsRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Get maxResults
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBatchSegmentJobsRequest listBatchSegmentJobsRequest = (ListBatchSegmentJobsRequest) o;
    return Objects.equals(this.solutionVersionArn, listBatchSegmentJobsRequest.solutionVersionArn) &&
        Objects.equals(this.nextToken, listBatchSegmentJobsRequest.nextToken) &&
        Objects.equals(this.maxResults, listBatchSegmentJobsRequest.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionVersionArn, nextToken, maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBatchSegmentJobsRequest {\n");
    sb.append("    solutionVersionArn: ").append(toIndentedString(solutionVersionArn)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
    openapiFields.add("solutionVersionArn");
    openapiFields.add("nextToken");
    openapiFields.add("maxResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListBatchSegmentJobsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBatchSegmentJobsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBatchSegmentJobsRequest is not found in the empty JSON string", ListBatchSegmentJobsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBatchSegmentJobsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBatchSegmentJobsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `solutionVersionArn`
      if (jsonObj.get("solutionVersionArn") != null && !jsonObj.get("solutionVersionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("solutionVersionArn"));
      }
      // validate the optional field `nextToken`
      if (jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("nextToken"));
      }
      // validate the optional field `maxResults`
      if (jsonObj.get("maxResults") != null && !jsonObj.get("maxResults").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("maxResults"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBatchSegmentJobsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBatchSegmentJobsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBatchSegmentJobsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBatchSegmentJobsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBatchSegmentJobsRequest>() {
           @Override
           public void write(JsonWriter out, ListBatchSegmentJobsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBatchSegmentJobsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListBatchSegmentJobsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListBatchSegmentJobsRequest
   * @throws IOException if the JSON string is invalid with respect to ListBatchSegmentJobsRequest
   */
  public static ListBatchSegmentJobsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBatchSegmentJobsRequest.class);
  }

  /**
   * Convert an instance of ListBatchSegmentJobsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

