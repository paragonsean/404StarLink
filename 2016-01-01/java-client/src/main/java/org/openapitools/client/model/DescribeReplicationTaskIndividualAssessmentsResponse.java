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
 * &lt;p/&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeReplicationTaskIndividualAssessmentsResponse {
  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_INDIVIDUAL_ASSESSMENTS = "ReplicationTaskIndividualAssessments";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_INDIVIDUAL_ASSESSMENTS)
  private List replicationTaskIndividualAssessments;

  public DescribeReplicationTaskIndividualAssessmentsResponse() {
  }

  public DescribeReplicationTaskIndividualAssessmentsResponse marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
   */
  @javax.annotation.Nullable
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }


  public DescribeReplicationTaskIndividualAssessmentsResponse replicationTaskIndividualAssessments(List replicationTaskIndividualAssessments) {
    this.replicationTaskIndividualAssessments = replicationTaskIndividualAssessments;
    return this;
  }

  /**
   * Get replicationTaskIndividualAssessments
   * @return replicationTaskIndividualAssessments
   */
  @javax.annotation.Nullable
  public List getReplicationTaskIndividualAssessments() {
    return replicationTaskIndividualAssessments;
  }

  public void setReplicationTaskIndividualAssessments(List replicationTaskIndividualAssessments) {
    this.replicationTaskIndividualAssessments = replicationTaskIndividualAssessments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeReplicationTaskIndividualAssessmentsResponse describeReplicationTaskIndividualAssessmentsResponse = (DescribeReplicationTaskIndividualAssessmentsResponse) o;
    return Objects.equals(this.marker, describeReplicationTaskIndividualAssessmentsResponse.marker) &&
        Objects.equals(this.replicationTaskIndividualAssessments, describeReplicationTaskIndividualAssessmentsResponse.replicationTaskIndividualAssessments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marker, replicationTaskIndividualAssessments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeReplicationTaskIndividualAssessmentsResponse {\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    replicationTaskIndividualAssessments: ").append(toIndentedString(replicationTaskIndividualAssessments)).append("\n");
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
    openapiFields.add("Marker");
    openapiFields.add("ReplicationTaskIndividualAssessments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeReplicationTaskIndividualAssessmentsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeReplicationTaskIndividualAssessmentsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeReplicationTaskIndividualAssessmentsResponse is not found in the empty JSON string", DescribeReplicationTaskIndividualAssessmentsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeReplicationTaskIndividualAssessmentsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeReplicationTaskIndividualAssessmentsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Marker`
      if (jsonObj.get("Marker") != null && !jsonObj.get("Marker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Marker"));
      }
      // validate the optional field `ReplicationTaskIndividualAssessments`
      if (jsonObj.get("ReplicationTaskIndividualAssessments") != null && !jsonObj.get("ReplicationTaskIndividualAssessments").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ReplicationTaskIndividualAssessments"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeReplicationTaskIndividualAssessmentsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeReplicationTaskIndividualAssessmentsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeReplicationTaskIndividualAssessmentsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeReplicationTaskIndividualAssessmentsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeReplicationTaskIndividualAssessmentsResponse>() {
           @Override
           public void write(JsonWriter out, DescribeReplicationTaskIndividualAssessmentsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeReplicationTaskIndividualAssessmentsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeReplicationTaskIndividualAssessmentsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeReplicationTaskIndividualAssessmentsResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeReplicationTaskIndividualAssessmentsResponse
   */
  public static DescribeReplicationTaskIndividualAssessmentsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeReplicationTaskIndividualAssessmentsResponse.class);
  }

  /**
   * Convert an instance of DescribeReplicationTaskIndividualAssessmentsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

