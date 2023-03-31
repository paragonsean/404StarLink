/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.client.model.ColumnLayout;
import org.openapitools.client.model.DashboardFilter;
import org.openapitools.client.model.GridLayout;
import org.openapitools.client.model.MosaicLayout;
import org.openapitools.client.model.RowLayout;

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
 * A Google Stackdriver dashboard. Dashboards define the content and layout of pages in the Stackdriver web application.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:15.949518-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Dashboard {
  public static final String SERIALIZED_NAME_COLUMN_LAYOUT = "columnLayout";
  @SerializedName(SERIALIZED_NAME_COLUMN_LAYOUT)
  private ColumnLayout columnLayout;

  public static final String SERIALIZED_NAME_DASHBOARD_FILTERS = "dashboardFilters";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_FILTERS)
  private List<DashboardFilter> dashboardFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_GRID_LAYOUT = "gridLayout";
  @SerializedName(SERIALIZED_NAME_GRID_LAYOUT)
  private GridLayout gridLayout;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MOSAIC_LAYOUT = "mosaicLayout";
  @SerializedName(SERIALIZED_NAME_MOSAIC_LAYOUT)
  private MosaicLayout mosaicLayout;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROW_LAYOUT = "rowLayout";
  @SerializedName(SERIALIZED_NAME_ROW_LAYOUT)
  private RowLayout rowLayout;

  public Dashboard() {
  }

  public Dashboard columnLayout(ColumnLayout columnLayout) {
    this.columnLayout = columnLayout;
    return this;
  }

  /**
   * Get columnLayout
   * @return columnLayout
   */
  @javax.annotation.Nullable
  public ColumnLayout getColumnLayout() {
    return columnLayout;
  }

  public void setColumnLayout(ColumnLayout columnLayout) {
    this.columnLayout = columnLayout;
  }


  public Dashboard dashboardFilters(List<DashboardFilter> dashboardFilters) {
    this.dashboardFilters = dashboardFilters;
    return this;
  }

  public Dashboard addDashboardFiltersItem(DashboardFilter dashboardFiltersItem) {
    if (this.dashboardFilters == null) {
      this.dashboardFilters = new ArrayList<>();
    }
    this.dashboardFilters.add(dashboardFiltersItem);
    return this;
  }

  /**
   * Filters to reduce the amount of data charted based on the filter criteria.
   * @return dashboardFilters
   */
  @javax.annotation.Nullable
  public List<DashboardFilter> getDashboardFilters() {
    return dashboardFilters;
  }

  public void setDashboardFilters(List<DashboardFilter> dashboardFilters) {
    this.dashboardFilters = dashboardFilters;
  }


  public Dashboard displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The mutable, human-readable name.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Dashboard etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
   * @return etag
   */
  @javax.annotation.Nullable
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  public Dashboard gridLayout(GridLayout gridLayout) {
    this.gridLayout = gridLayout;
    return this;
  }

  /**
   * Get gridLayout
   * @return gridLayout
   */
  @javax.annotation.Nullable
  public GridLayout getGridLayout() {
    return gridLayout;
  }

  public void setGridLayout(GridLayout gridLayout) {
    this.gridLayout = gridLayout;
  }


  public Dashboard labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Dashboard putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels applied to the dashboard
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public Dashboard mosaicLayout(MosaicLayout mosaicLayout) {
    this.mosaicLayout = mosaicLayout;
    return this;
  }

  /**
   * Get mosaicLayout
   * @return mosaicLayout
   */
  @javax.annotation.Nullable
  public MosaicLayout getMosaicLayout() {
    return mosaicLayout;
  }

  public void setMosaicLayout(MosaicLayout mosaicLayout) {
    this.mosaicLayout = mosaicLayout;
  }


  public Dashboard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The resource name of the dashboard.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Dashboard rowLayout(RowLayout rowLayout) {
    this.rowLayout = rowLayout;
    return this;
  }

  /**
   * Get rowLayout
   * @return rowLayout
   */
  @javax.annotation.Nullable
  public RowLayout getRowLayout() {
    return rowLayout;
  }

  public void setRowLayout(RowLayout rowLayout) {
    this.rowLayout = rowLayout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.columnLayout, dashboard.columnLayout) &&
        Objects.equals(this.dashboardFilters, dashboard.dashboardFilters) &&
        Objects.equals(this.displayName, dashboard.displayName) &&
        Objects.equals(this.etag, dashboard.etag) &&
        Objects.equals(this.gridLayout, dashboard.gridLayout) &&
        Objects.equals(this.labels, dashboard.labels) &&
        Objects.equals(this.mosaicLayout, dashboard.mosaicLayout) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.rowLayout, dashboard.rowLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnLayout, dashboardFilters, displayName, etag, gridLayout, labels, mosaicLayout, name, rowLayout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    columnLayout: ").append(toIndentedString(columnLayout)).append("\n");
    sb.append("    dashboardFilters: ").append(toIndentedString(dashboardFilters)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    gridLayout: ").append(toIndentedString(gridLayout)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mosaicLayout: ").append(toIndentedString(mosaicLayout)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rowLayout: ").append(toIndentedString(rowLayout)).append("\n");
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
    openapiFields.add("columnLayout");
    openapiFields.add("dashboardFilters");
    openapiFields.add("displayName");
    openapiFields.add("etag");
    openapiFields.add("gridLayout");
    openapiFields.add("labels");
    openapiFields.add("mosaicLayout");
    openapiFields.add("name");
    openapiFields.add("rowLayout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Dashboard
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboard is not found in the empty JSON string", Dashboard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `columnLayout`
      if (jsonObj.get("columnLayout") != null && !jsonObj.get("columnLayout").isJsonNull()) {
        ColumnLayout.validateJsonElement(jsonObj.get("columnLayout"));
      }
      if (jsonObj.get("dashboardFilters") != null && !jsonObj.get("dashboardFilters").isJsonNull()) {
        JsonArray jsonArraydashboardFilters = jsonObj.getAsJsonArray("dashboardFilters");
        if (jsonArraydashboardFilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dashboardFilters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dashboardFilters` to be an array in the JSON string but got `%s`", jsonObj.get("dashboardFilters").toString()));
          }

          // validate the optional field `dashboardFilters` (array)
          for (int i = 0; i < jsonArraydashboardFilters.size(); i++) {
            DashboardFilter.validateJsonElement(jsonArraydashboardFilters.get(i));
          };
        }
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      // validate the optional field `gridLayout`
      if (jsonObj.get("gridLayout") != null && !jsonObj.get("gridLayout").isJsonNull()) {
        GridLayout.validateJsonElement(jsonObj.get("gridLayout"));
      }
      // validate the optional field `mosaicLayout`
      if (jsonObj.get("mosaicLayout") != null && !jsonObj.get("mosaicLayout").isJsonNull()) {
        MosaicLayout.validateJsonElement(jsonObj.get("mosaicLayout"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `rowLayout`
      if (jsonObj.get("rowLayout") != null && !jsonObj.get("rowLayout").isJsonNull()) {
        RowLayout.validateJsonElement(jsonObj.get("rowLayout"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboard.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboard>() {
           @Override
           public void write(JsonWriter out, Dashboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Dashboard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Dashboard
   * @throws IOException if the JSON string is invalid with respect to Dashboard
   */
  public static Dashboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboard.class);
  }

  /**
   * Convert an instance of Dashboard to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

