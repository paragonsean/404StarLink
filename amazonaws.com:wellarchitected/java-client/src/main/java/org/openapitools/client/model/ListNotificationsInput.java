/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
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
 * ListNotificationsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:47.577947-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListNotificationsInput {
  public static final String SERIALIZED_NAME_WORKLOAD_ID = "WorkloadId";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_ID)
  private String workloadId;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "MaxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public ListNotificationsInput() {
  }

  public ListNotificationsInput workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * The ID assigned to the workload. This ID is unique within an Amazon Web Services Region.
   * @return workloadId
   */
  @javax.annotation.Nullable
  public String getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }


  public ListNotificationsInput nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * The token to use to retrieve the next set of results.
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public ListNotificationsInput maxResults(Integer maxResults) {
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
    ListNotificationsInput listNotificationsInput = (ListNotificationsInput) o;
    return Objects.equals(this.workloadId, listNotificationsInput.workloadId) &&
        Objects.equals(this.nextToken, listNotificationsInput.nextToken) &&
        Objects.equals(this.maxResults, listNotificationsInput.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadId, nextToken, maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNotificationsInput {\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
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
    openapiFields.add("WorkloadId");
    openapiFields.add("NextToken");
    openapiFields.add("MaxResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListNotificationsInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListNotificationsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListNotificationsInput is not found in the empty JSON string", ListNotificationsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListNotificationsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListNotificationsInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("WorkloadId") != null && !jsonObj.get("WorkloadId").isJsonNull()) && !jsonObj.get("WorkloadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadId").toString()));
      }
      if ((jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) && !jsonObj.get("NextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NextToken").toString()));
      }
      // validate the optional field `MaxResults`
      if (jsonObj.get("MaxResults") != null && !jsonObj.get("MaxResults").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxResults"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListNotificationsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListNotificationsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListNotificationsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListNotificationsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListNotificationsInput>() {
           @Override
           public void write(JsonWriter out, ListNotificationsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListNotificationsInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListNotificationsInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListNotificationsInput
   * @throws IOException if the JSON string is invalid with respect to ListNotificationsInput
   */
  public static ListNotificationsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListNotificationsInput.class);
  }

  /**
   * Convert an instance of ListNotificationsInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

