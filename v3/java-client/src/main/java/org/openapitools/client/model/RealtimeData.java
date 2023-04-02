/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
 *
 * The version of the OpenAPI document: v3
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.GaDataColumnHeadersInner;
import org.openapitools.client.model.RealtimeDataProfileInfo;
import org.openapitools.client.model.RealtimeDataQuery;

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
 * Real time data for a given view (profile).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:22.913673-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RealtimeData {
  public static final String SERIALIZED_NAME_COLUMN_HEADERS = "columnHeaders";
  @SerializedName(SERIALIZED_NAME_COLUMN_HEADERS)
  private List<GaDataColumnHeadersInner> columnHeaders = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = "analytics#realtimeData";

  public static final String SERIALIZED_NAME_PROFILE_INFO = "profileInfo";
  @SerializedName(SERIALIZED_NAME_PROFILE_INFO)
  private RealtimeDataProfileInfo profileInfo;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private RealtimeDataQuery query;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<List<String>> rows = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public static final String SERIALIZED_NAME_TOTAL_RESULTS = "totalResults";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULTS)
  private Integer totalResults;

  public static final String SERIALIZED_NAME_TOTALS_FOR_ALL_RESULTS = "totalsForAllResults";
  @SerializedName(SERIALIZED_NAME_TOTALS_FOR_ALL_RESULTS)
  private Map<String, String> totalsForAllResults = new HashMap<>();

  public RealtimeData() {
  }

  public RealtimeData columnHeaders(List<GaDataColumnHeadersInner> columnHeaders) {
    this.columnHeaders = columnHeaders;
    return this;
  }

  public RealtimeData addColumnHeadersItem(GaDataColumnHeadersInner columnHeadersItem) {
    if (this.columnHeaders == null) {
      this.columnHeaders = new ArrayList<>();
    }
    this.columnHeaders.add(columnHeadersItem);
    return this;
  }

  /**
   * Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request.
   * @return columnHeaders
   */
  @javax.annotation.Nullable
  public List<GaDataColumnHeadersInner> getColumnHeaders() {
    return columnHeaders;
  }

  public void setColumnHeaders(List<GaDataColumnHeadersInner> columnHeaders) {
    this.columnHeaders = columnHeaders;
  }


  public RealtimeData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for this data response.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RealtimeData kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Resource type.
   * @return kind
   */
  @javax.annotation.Nullable
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  public RealtimeData profileInfo(RealtimeDataProfileInfo profileInfo) {
    this.profileInfo = profileInfo;
    return this;
  }

  /**
   * Get profileInfo
   * @return profileInfo
   */
  @javax.annotation.Nullable
  public RealtimeDataProfileInfo getProfileInfo() {
    return profileInfo;
  }

  public void setProfileInfo(RealtimeDataProfileInfo profileInfo) {
    this.profileInfo = profileInfo;
  }


  public RealtimeData query(RealtimeDataQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public RealtimeDataQuery getQuery() {
    return query;
  }

  public void setQuery(RealtimeDataQuery query) {
    this.query = query;
  }


  public RealtimeData rows(List<List<String>> rows) {
    this.rows = rows;
    return this;
  }

  public RealtimeData addRowsItem(List<String> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Real time data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as specified in the request.
   * @return rows
   */
  @javax.annotation.Nullable
  public List<List<String>> getRows() {
    return rows;
  }

  public void setRows(List<List<String>> rows) {
    this.rows = rows;
  }


  public RealtimeData selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Link to this page.
   * @return selfLink
   */
  @javax.annotation.Nullable
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }


  public RealtimeData totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * The total number of rows for the query, regardless of the number of rows in the response.
   * @return totalResults
   */
  @javax.annotation.Nullable
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public RealtimeData totalsForAllResults(Map<String, String> totalsForAllResults) {
    this.totalsForAllResults = totalsForAllResults;
    return this;
  }

  public RealtimeData putTotalsForAllResultsItem(String key, String totalsForAllResultsItem) {
    if (this.totalsForAllResults == null) {
      this.totalsForAllResults = new HashMap<>();
    }
    this.totalsForAllResults.put(key, totalsForAllResultsItem);
    return this;
  }

  /**
   * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as the metric order specified in the request.
   * @return totalsForAllResults
   */
  @javax.annotation.Nullable
  public Map<String, String> getTotalsForAllResults() {
    return totalsForAllResults;
  }

  public void setTotalsForAllResults(Map<String, String> totalsForAllResults) {
    this.totalsForAllResults = totalsForAllResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeData realtimeData = (RealtimeData) o;
    return Objects.equals(this.columnHeaders, realtimeData.columnHeaders) &&
        Objects.equals(this.id, realtimeData.id) &&
        Objects.equals(this.kind, realtimeData.kind) &&
        Objects.equals(this.profileInfo, realtimeData.profileInfo) &&
        Objects.equals(this.query, realtimeData.query) &&
        Objects.equals(this.rows, realtimeData.rows) &&
        Objects.equals(this.selfLink, realtimeData.selfLink) &&
        Objects.equals(this.totalResults, realtimeData.totalResults) &&
        Objects.equals(this.totalsForAllResults, realtimeData.totalsForAllResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnHeaders, id, kind, profileInfo, query, rows, selfLink, totalResults, totalsForAllResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeData {\n");
    sb.append("    columnHeaders: ").append(toIndentedString(columnHeaders)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    profileInfo: ").append(toIndentedString(profileInfo)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    totalsForAllResults: ").append(toIndentedString(totalsForAllResults)).append("\n");
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
    openapiFields.add("columnHeaders");
    openapiFields.add("id");
    openapiFields.add("kind");
    openapiFields.add("profileInfo");
    openapiFields.add("query");
    openapiFields.add("rows");
    openapiFields.add("selfLink");
    openapiFields.add("totalResults");
    openapiFields.add("totalsForAllResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RealtimeData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealtimeData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeData is not found in the empty JSON string", RealtimeData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RealtimeData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RealtimeData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("columnHeaders") != null && !jsonObj.get("columnHeaders").isJsonNull()) {
        JsonArray jsonArraycolumnHeaders = jsonObj.getAsJsonArray("columnHeaders");
        if (jsonArraycolumnHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columnHeaders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columnHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("columnHeaders").toString()));
          }

          // validate the optional field `columnHeaders` (array)
          for (int i = 0; i < jsonArraycolumnHeaders.size(); i++) {
            GaDataColumnHeadersInner.validateJsonElement(jsonArraycolumnHeaders.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `profileInfo`
      if (jsonObj.get("profileInfo") != null && !jsonObj.get("profileInfo").isJsonNull()) {
        RealtimeDataProfileInfo.validateJsonElement(jsonObj.get("profileInfo"));
      }
      // validate the optional field `query`
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) {
        RealtimeDataQuery.validateJsonElement(jsonObj.get("query"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonNull() && !jsonObj.get("rows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
      }
      if ((jsonObj.get("selfLink") != null && !jsonObj.get("selfLink").isJsonNull()) && !jsonObj.get("selfLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selfLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selfLink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeData.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeData>() {
           @Override
           public void write(JsonWriter out, RealtimeData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RealtimeData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RealtimeData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RealtimeData
   * @throws IOException if the JSON string is invalid with respect to RealtimeData
   */
  public static RealtimeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeData.class);
  }

  /**
   * Convert an instance of RealtimeData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

