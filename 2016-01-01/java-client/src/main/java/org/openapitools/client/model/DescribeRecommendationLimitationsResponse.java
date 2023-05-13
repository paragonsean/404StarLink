/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
 * DescribeRecommendationLimitationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeRecommendationLimitationsResponse {
  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_LIMITATIONS = "Limitations";
  @SerializedName(SERIALIZED_NAME_LIMITATIONS)
  private List limitations;

  public DescribeRecommendationLimitationsResponse() {
  }

  public DescribeRecommendationLimitationsResponse nextToken(String nextToken) {
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


  public DescribeRecommendationLimitationsResponse limitations(List limitations) {
    this.limitations = limitations;
    return this;
  }

  /**
   * Get limitations
   * @return limitations
   */
  @javax.annotation.Nullable
  public List getLimitations() {
    return limitations;
  }

  public void setLimitations(List limitations) {
    this.limitations = limitations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRecommendationLimitationsResponse describeRecommendationLimitationsResponse = (DescribeRecommendationLimitationsResponse) o;
    return Objects.equals(this.nextToken, describeRecommendationLimitationsResponse.nextToken) &&
        Objects.equals(this.limitations, describeRecommendationLimitationsResponse.limitations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, limitations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRecommendationLimitationsResponse {\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    limitations: ").append(toIndentedString(limitations)).append("\n");
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
    openapiFields.add("NextToken");
    openapiFields.add("Limitations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeRecommendationLimitationsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeRecommendationLimitationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeRecommendationLimitationsResponse is not found in the empty JSON string", DescribeRecommendationLimitationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeRecommendationLimitationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeRecommendationLimitationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `NextToken`
      if (jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextToken"));
      }
      // validate the optional field `Limitations`
      if (jsonObj.get("Limitations") != null && !jsonObj.get("Limitations").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Limitations"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeRecommendationLimitationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeRecommendationLimitationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeRecommendationLimitationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeRecommendationLimitationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeRecommendationLimitationsResponse>() {
           @Override
           public void write(JsonWriter out, DescribeRecommendationLimitationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeRecommendationLimitationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeRecommendationLimitationsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeRecommendationLimitationsResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeRecommendationLimitationsResponse
   */
  public static DescribeRecommendationLimitationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeRecommendationLimitationsResponse.class);
  }

  /**
   * Convert an instance of DescribeRecommendationLimitationsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

