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
public class DescribeReplicationSubnetGroupsResponse {
  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public static final String SERIALIZED_NAME_REPLICATION_SUBNET_GROUPS = "ReplicationSubnetGroups";
  @SerializedName(SERIALIZED_NAME_REPLICATION_SUBNET_GROUPS)
  private List replicationSubnetGroups;

  public DescribeReplicationSubnetGroupsResponse() {
  }

  public DescribeReplicationSubnetGroupsResponse marker(String marker) {
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


  public DescribeReplicationSubnetGroupsResponse replicationSubnetGroups(List replicationSubnetGroups) {
    this.replicationSubnetGroups = replicationSubnetGroups;
    return this;
  }

  /**
   * Get replicationSubnetGroups
   * @return replicationSubnetGroups
   */
  @javax.annotation.Nullable
  public List getReplicationSubnetGroups() {
    return replicationSubnetGroups;
  }

  public void setReplicationSubnetGroups(List replicationSubnetGroups) {
    this.replicationSubnetGroups = replicationSubnetGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeReplicationSubnetGroupsResponse describeReplicationSubnetGroupsResponse = (DescribeReplicationSubnetGroupsResponse) o;
    return Objects.equals(this.marker, describeReplicationSubnetGroupsResponse.marker) &&
        Objects.equals(this.replicationSubnetGroups, describeReplicationSubnetGroupsResponse.replicationSubnetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marker, replicationSubnetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeReplicationSubnetGroupsResponse {\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    replicationSubnetGroups: ").append(toIndentedString(replicationSubnetGroups)).append("\n");
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
    openapiFields.add("ReplicationSubnetGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeReplicationSubnetGroupsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeReplicationSubnetGroupsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeReplicationSubnetGroupsResponse is not found in the empty JSON string", DescribeReplicationSubnetGroupsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeReplicationSubnetGroupsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeReplicationSubnetGroupsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Marker`
      if (jsonObj.get("Marker") != null && !jsonObj.get("Marker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Marker"));
      }
      // validate the optional field `ReplicationSubnetGroups`
      if (jsonObj.get("ReplicationSubnetGroups") != null && !jsonObj.get("ReplicationSubnetGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ReplicationSubnetGroups"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeReplicationSubnetGroupsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeReplicationSubnetGroupsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeReplicationSubnetGroupsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeReplicationSubnetGroupsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeReplicationSubnetGroupsResponse>() {
           @Override
           public void write(JsonWriter out, DescribeReplicationSubnetGroupsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeReplicationSubnetGroupsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeReplicationSubnetGroupsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeReplicationSubnetGroupsResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeReplicationSubnetGroupsResponse
   */
  public static DescribeReplicationSubnetGroupsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeReplicationSubnetGroupsResponse.class);
  }

  /**
   * Convert an instance of DescribeReplicationSubnetGroupsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

