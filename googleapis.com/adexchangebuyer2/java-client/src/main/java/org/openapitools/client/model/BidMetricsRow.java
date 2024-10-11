/*
 * Ad Exchange Buyer API II
 * Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
 *
 * The version of the OpenAPI document: v2beta1
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
import java.util.Arrays;
import org.openapitools.client.model.MetricValue;
import org.openapitools.client.model.RowDimensions;

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
 * The set of metrics that are measured in numbers of bids, representing how many bids with the specified dimension values were considered eligible at each stage of the bidding funnel;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BidMetricsRow {
  public static final String SERIALIZED_NAME_BIDS = "bids";
  @SerializedName(SERIALIZED_NAME_BIDS)
  private MetricValue bids;

  public static final String SERIALIZED_NAME_BIDS_IN_AUCTION = "bidsInAuction";
  @SerializedName(SERIALIZED_NAME_BIDS_IN_AUCTION)
  private MetricValue bidsInAuction;

  public static final String SERIALIZED_NAME_BILLED_IMPRESSIONS = "billedImpressions";
  @SerializedName(SERIALIZED_NAME_BILLED_IMPRESSIONS)
  private MetricValue billedImpressions;

  public static final String SERIALIZED_NAME_IMPRESSIONS_WON = "impressionsWon";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS_WON)
  private MetricValue impressionsWon;

  public static final String SERIALIZED_NAME_MEASURABLE_IMPRESSIONS = "measurableImpressions";
  @SerializedName(SERIALIZED_NAME_MEASURABLE_IMPRESSIONS)
  private MetricValue measurableImpressions;

  public static final String SERIALIZED_NAME_REACHED_QUERIES = "reachedQueries";
  @SerializedName(SERIALIZED_NAME_REACHED_QUERIES)
  private MetricValue reachedQueries;

  public static final String SERIALIZED_NAME_ROW_DIMENSIONS = "rowDimensions";
  @SerializedName(SERIALIZED_NAME_ROW_DIMENSIONS)
  private RowDimensions rowDimensions;

  public static final String SERIALIZED_NAME_VIEWABLE_IMPRESSIONS = "viewableImpressions";
  @SerializedName(SERIALIZED_NAME_VIEWABLE_IMPRESSIONS)
  private MetricValue viewableImpressions;

  public BidMetricsRow() {
  }

  public BidMetricsRow bids(MetricValue bids) {
    this.bids = bids;
    return this;
  }

  /**
   * Get bids
   * @return bids
   */
  @javax.annotation.Nullable
  public MetricValue getBids() {
    return bids;
  }

  public void setBids(MetricValue bids) {
    this.bids = bids;
  }


  public BidMetricsRow bidsInAuction(MetricValue bidsInAuction) {
    this.bidsInAuction = bidsInAuction;
    return this;
  }

  /**
   * Get bidsInAuction
   * @return bidsInAuction
   */
  @javax.annotation.Nullable
  public MetricValue getBidsInAuction() {
    return bidsInAuction;
  }

  public void setBidsInAuction(MetricValue bidsInAuction) {
    this.bidsInAuction = bidsInAuction;
  }


  public BidMetricsRow billedImpressions(MetricValue billedImpressions) {
    this.billedImpressions = billedImpressions;
    return this;
  }

  /**
   * Get billedImpressions
   * @return billedImpressions
   */
  @javax.annotation.Nullable
  public MetricValue getBilledImpressions() {
    return billedImpressions;
  }

  public void setBilledImpressions(MetricValue billedImpressions) {
    this.billedImpressions = billedImpressions;
  }


  public BidMetricsRow impressionsWon(MetricValue impressionsWon) {
    this.impressionsWon = impressionsWon;
    return this;
  }

  /**
   * Get impressionsWon
   * @return impressionsWon
   */
  @javax.annotation.Nullable
  public MetricValue getImpressionsWon() {
    return impressionsWon;
  }

  public void setImpressionsWon(MetricValue impressionsWon) {
    this.impressionsWon = impressionsWon;
  }


  public BidMetricsRow measurableImpressions(MetricValue measurableImpressions) {
    this.measurableImpressions = measurableImpressions;
    return this;
  }

  /**
   * Get measurableImpressions
   * @return measurableImpressions
   */
  @javax.annotation.Nullable
  public MetricValue getMeasurableImpressions() {
    return measurableImpressions;
  }

  public void setMeasurableImpressions(MetricValue measurableImpressions) {
    this.measurableImpressions = measurableImpressions;
  }


  public BidMetricsRow reachedQueries(MetricValue reachedQueries) {
    this.reachedQueries = reachedQueries;
    return this;
  }

  /**
   * Get reachedQueries
   * @return reachedQueries
   */
  @javax.annotation.Nullable
  public MetricValue getReachedQueries() {
    return reachedQueries;
  }

  public void setReachedQueries(MetricValue reachedQueries) {
    this.reachedQueries = reachedQueries;
  }


  public BidMetricsRow rowDimensions(RowDimensions rowDimensions) {
    this.rowDimensions = rowDimensions;
    return this;
  }

  /**
   * Get rowDimensions
   * @return rowDimensions
   */
  @javax.annotation.Nullable
  public RowDimensions getRowDimensions() {
    return rowDimensions;
  }

  public void setRowDimensions(RowDimensions rowDimensions) {
    this.rowDimensions = rowDimensions;
  }


  public BidMetricsRow viewableImpressions(MetricValue viewableImpressions) {
    this.viewableImpressions = viewableImpressions;
    return this;
  }

  /**
   * Get viewableImpressions
   * @return viewableImpressions
   */
  @javax.annotation.Nullable
  public MetricValue getViewableImpressions() {
    return viewableImpressions;
  }

  public void setViewableImpressions(MetricValue viewableImpressions) {
    this.viewableImpressions = viewableImpressions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidMetricsRow bidMetricsRow = (BidMetricsRow) o;
    return Objects.equals(this.bids, bidMetricsRow.bids) &&
        Objects.equals(this.bidsInAuction, bidMetricsRow.bidsInAuction) &&
        Objects.equals(this.billedImpressions, bidMetricsRow.billedImpressions) &&
        Objects.equals(this.impressionsWon, bidMetricsRow.impressionsWon) &&
        Objects.equals(this.measurableImpressions, bidMetricsRow.measurableImpressions) &&
        Objects.equals(this.reachedQueries, bidMetricsRow.reachedQueries) &&
        Objects.equals(this.rowDimensions, bidMetricsRow.rowDimensions) &&
        Objects.equals(this.viewableImpressions, bidMetricsRow.viewableImpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bids, bidsInAuction, billedImpressions, impressionsWon, measurableImpressions, reachedQueries, rowDimensions, viewableImpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidMetricsRow {\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
    sb.append("    bidsInAuction: ").append(toIndentedString(bidsInAuction)).append("\n");
    sb.append("    billedImpressions: ").append(toIndentedString(billedImpressions)).append("\n");
    sb.append("    impressionsWon: ").append(toIndentedString(impressionsWon)).append("\n");
    sb.append("    measurableImpressions: ").append(toIndentedString(measurableImpressions)).append("\n");
    sb.append("    reachedQueries: ").append(toIndentedString(reachedQueries)).append("\n");
    sb.append("    rowDimensions: ").append(toIndentedString(rowDimensions)).append("\n");
    sb.append("    viewableImpressions: ").append(toIndentedString(viewableImpressions)).append("\n");
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
    openapiFields.add("bids");
    openapiFields.add("bidsInAuction");
    openapiFields.add("billedImpressions");
    openapiFields.add("impressionsWon");
    openapiFields.add("measurableImpressions");
    openapiFields.add("reachedQueries");
    openapiFields.add("rowDimensions");
    openapiFields.add("viewableImpressions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BidMetricsRow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BidMetricsRow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BidMetricsRow is not found in the empty JSON string", BidMetricsRow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BidMetricsRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BidMetricsRow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bids`
      if (jsonObj.get("bids") != null && !jsonObj.get("bids").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("bids"));
      }
      // validate the optional field `bidsInAuction`
      if (jsonObj.get("bidsInAuction") != null && !jsonObj.get("bidsInAuction").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("bidsInAuction"));
      }
      // validate the optional field `billedImpressions`
      if (jsonObj.get("billedImpressions") != null && !jsonObj.get("billedImpressions").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("billedImpressions"));
      }
      // validate the optional field `impressionsWon`
      if (jsonObj.get("impressionsWon") != null && !jsonObj.get("impressionsWon").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("impressionsWon"));
      }
      // validate the optional field `measurableImpressions`
      if (jsonObj.get("measurableImpressions") != null && !jsonObj.get("measurableImpressions").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("measurableImpressions"));
      }
      // validate the optional field `reachedQueries`
      if (jsonObj.get("reachedQueries") != null && !jsonObj.get("reachedQueries").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("reachedQueries"));
      }
      // validate the optional field `rowDimensions`
      if (jsonObj.get("rowDimensions") != null && !jsonObj.get("rowDimensions").isJsonNull()) {
        RowDimensions.validateJsonElement(jsonObj.get("rowDimensions"));
      }
      // validate the optional field `viewableImpressions`
      if (jsonObj.get("viewableImpressions") != null && !jsonObj.get("viewableImpressions").isJsonNull()) {
        MetricValue.validateJsonElement(jsonObj.get("viewableImpressions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BidMetricsRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BidMetricsRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BidMetricsRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BidMetricsRow.class));

       return (TypeAdapter<T>) new TypeAdapter<BidMetricsRow>() {
           @Override
           public void write(JsonWriter out, BidMetricsRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BidMetricsRow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BidMetricsRow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BidMetricsRow
   * @throws IOException if the JSON string is invalid with respect to BidMetricsRow
   */
  public static BidMetricsRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BidMetricsRow.class);
  }

  /**
   * Convert an instance of BidMetricsRow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

