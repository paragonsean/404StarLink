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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AbsoluteDateRange;
import org.openapitools.client.model.RealtimeTimeRange;
import org.openapitools.client.model.RelativeDateRange;

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
 * A set of filters that is applied to a request for data. Within a filter set, an AND operation is performed across the filters represented by each field. An OR operation is performed across the filters represented by the multiple values of a repeated field, for example, \&quot;format&#x3D;VIDEO AND deal_id&#x3D;12 AND (seller_network_id&#x3D;34 OR seller_network_id&#x3D;56)\&quot;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FilterSet {
  public static final String SERIALIZED_NAME_ABSOLUTE_DATE_RANGE = "absoluteDateRange";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE_DATE_RANGE)
  private AbsoluteDateRange absoluteDateRange;

  /**
   * Gets or Sets breakdownDimensions
   */
  @JsonAdapter(BreakdownDimensionsEnum.Adapter.class)
  public enum BreakdownDimensionsEnum {
    BREAKDOWN_DIMENSION_UNSPECIFIED("BREAKDOWN_DIMENSION_UNSPECIFIED"),
    
    PUBLISHER_IDENTIFIER("PUBLISHER_IDENTIFIER");

    private String value;

    BreakdownDimensionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BreakdownDimensionsEnum fromValue(String value) {
      for (BreakdownDimensionsEnum b : BreakdownDimensionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BreakdownDimensionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BreakdownDimensionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BreakdownDimensionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BreakdownDimensionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BreakdownDimensionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BREAKDOWN_DIMENSIONS = "breakdownDimensions";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN_DIMENSIONS)
  private List<BreakdownDimensionsEnum> breakdownDimensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creativeId";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId;

  public static final String SERIALIZED_NAME_DEAL_ID = "dealId";
  @SerializedName(SERIALIZED_NAME_DEAL_ID)
  private String dealId;

  /**
   * The environment on which to filter; optional.
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    ENVIRONMENT_UNSPECIFIED("ENVIRONMENT_UNSPECIFIED"),
    
    WEB("WEB"),
    
    APP("APP");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EnvironmentEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  /**
   * Creative format bidded on or allowed to bid on, can be empty.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    FORMAT_UNSPECIFIED("FORMAT_UNSPECIFIED"),
    
    NATIVE_DISPLAY("NATIVE_DISPLAY"),
    
    NATIVE_VIDEO("NATIVE_VIDEO"),
    
    NON_NATIVE_DISPLAY("NON_NATIVE_DISPLAY"),
    
    NON_NATIVE_VIDEO("NON_NATIVE_VIDEO");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  /**
   * Gets or Sets formats
   */
  @JsonAdapter(FormatsEnum.Adapter.class)
  public enum FormatsEnum {
    FORMAT_UNSPECIFIED("FORMAT_UNSPECIFIED"),
    
    NATIVE_DISPLAY("NATIVE_DISPLAY"),
    
    NATIVE_VIDEO("NATIVE_VIDEO"),
    
    NON_NATIVE_DISPLAY("NON_NATIVE_DISPLAY"),
    
    NON_NATIVE_VIDEO("NON_NATIVE_VIDEO");

    private String value;

    FormatsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatsEnum fromValue(String value) {
      for (FormatsEnum b : FormatsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMATS = "formats";
  @SerializedName(SERIALIZED_NAME_FORMATS)
  private List<FormatsEnum> formats = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets platforms
   */
  @JsonAdapter(PlatformsEnum.Adapter.class)
  public enum PlatformsEnum {
    PLATFORM_UNSPECIFIED("PLATFORM_UNSPECIFIED"),
    
    DESKTOP("DESKTOP"),
    
    TABLET("TABLET"),
    
    MOBILE("MOBILE");

    private String value;

    PlatformsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformsEnum fromValue(String value) {
      for (PlatformsEnum b : PlatformsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlatformsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlatformsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PlatformsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<PlatformsEnum> platforms = new ArrayList<>();

  public static final String SERIALIZED_NAME_PUBLISHER_IDENTIFIERS = "publisherIdentifiers";
  @SerializedName(SERIALIZED_NAME_PUBLISHER_IDENTIFIERS)
  private List<String> publisherIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_REALTIME_TIME_RANGE = "realtimeTimeRange";
  @SerializedName(SERIALIZED_NAME_REALTIME_TIME_RANGE)
  private RealtimeTimeRange realtimeTimeRange;

  public static final String SERIALIZED_NAME_RELATIVE_DATE_RANGE = "relativeDateRange";
  @SerializedName(SERIALIZED_NAME_RELATIVE_DATE_RANGE)
  private RelativeDateRange relativeDateRange;

  public static final String SERIALIZED_NAME_SELLER_NETWORK_IDS = "sellerNetworkIds";
  @SerializedName(SERIALIZED_NAME_SELLER_NETWORK_IDS)
  private List<Integer> sellerNetworkIds = new ArrayList<>();

  /**
   * The granularity of time intervals if a time series breakdown is preferred; optional.
   */
  @JsonAdapter(TimeSeriesGranularityEnum.Adapter.class)
  public enum TimeSeriesGranularityEnum {
    TIME_SERIES_GRANULARITY_UNSPECIFIED("TIME_SERIES_GRANULARITY_UNSPECIFIED"),
    
    HOURLY("HOURLY"),
    
    DAILY("DAILY");

    private String value;

    TimeSeriesGranularityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeSeriesGranularityEnum fromValue(String value) {
      for (TimeSeriesGranularityEnum b : TimeSeriesGranularityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeSeriesGranularityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeSeriesGranularityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeSeriesGranularityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeSeriesGranularityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimeSeriesGranularityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIME_SERIES_GRANULARITY = "timeSeriesGranularity";
  @SerializedName(SERIALIZED_NAME_TIME_SERIES_GRANULARITY)
  private TimeSeriesGranularityEnum timeSeriesGranularity;

  public FilterSet() {
  }

  public FilterSet absoluteDateRange(AbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
    return this;
  }

  /**
   * Get absoluteDateRange
   * @return absoluteDateRange
   */
  @javax.annotation.Nullable
  public AbsoluteDateRange getAbsoluteDateRange() {
    return absoluteDateRange;
  }

  public void setAbsoluteDateRange(AbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
  }


  public FilterSet breakdownDimensions(List<BreakdownDimensionsEnum> breakdownDimensions) {
    this.breakdownDimensions = breakdownDimensions;
    return this;
  }

  public FilterSet addBreakdownDimensionsItem(BreakdownDimensionsEnum breakdownDimensionsItem) {
    if (this.breakdownDimensions == null) {
      this.breakdownDimensions = new ArrayList<>();
    }
    this.breakdownDimensions.add(breakdownDimensionsItem);
    return this;
  }

  /**
   * The set of dimensions along which to break down the response; may be empty. If multiple dimensions are requested, the breakdown is along the Cartesian product of the requested dimensions.
   * @return breakdownDimensions
   */
  @javax.annotation.Nullable
  public List<BreakdownDimensionsEnum> getBreakdownDimensions() {
    return breakdownDimensions;
  }

  public void setBreakdownDimensions(List<BreakdownDimensionsEnum> breakdownDimensions) {
    this.breakdownDimensions = breakdownDimensions;
  }


  public FilterSet creativeId(String creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  /**
   * The ID of the creative on which to filter; optional. This field may be set only for a filter set that accesses account-level troubleshooting data, for example, one whose name matches the &#x60;bidders/_*_/accounts/_*_/filterSets/_*&#x60; pattern.
   * @return creativeId
   */
  @javax.annotation.Nullable
  public String getCreativeId() {
    return creativeId;
  }

  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public FilterSet dealId(String dealId) {
    this.dealId = dealId;
    return this;
  }

  /**
   * The ID of the deal on which to filter; optional. This field may be set only for a filter set that accesses account-level troubleshooting data, for example, one whose name matches the &#x60;bidders/_*_/accounts/_*_/filterSets/_*&#x60; pattern.
   * @return dealId
   */
  @javax.annotation.Nullable
  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }


  public FilterSet environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment on which to filter; optional.
   * @return environment
   */
  @javax.annotation.Nullable
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  public FilterSet format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Creative format bidded on or allowed to bid on, can be empty.
   * @return format
   */
  @javax.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public FilterSet formats(List<FormatsEnum> formats) {
    this.formats = formats;
    return this;
  }

  public FilterSet addFormatsItem(FormatsEnum formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<>();
    }
    this.formats.add(formatsItem);
    return this;
  }

  /**
   * Creative formats bidded on or allowed to bid on, can be empty. Although this field is a list, it can only be populated with a single item. A HTTP 400 bad request error will be returned in the response if you specify multiple items.
   * @return formats
   */
  @javax.annotation.Nullable
  public List<FormatsEnum> getFormats() {
    return formats;
  }

  public void setFormats(List<FormatsEnum> formats) {
    this.formats = formats;
  }


  public FilterSet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A user-defined name of the filter set. Filter set names must be unique globally and match one of the patterns: - &#x60;bidders/_*_/filterSets/_*&#x60; (for accessing bidder-level troubleshooting data) - &#x60;bidders/_*_/accounts/_*_/filterSets/_*&#x60; (for accessing account-level troubleshooting data) This field is required in create operations.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FilterSet platforms(List<PlatformsEnum> platforms) {
    this.platforms = platforms;
    return this;
  }

  public FilterSet addPlatformsItem(PlatformsEnum platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * The list of platforms on which to filter; may be empty. The filters represented by multiple platforms are ORed together (for example, if non-empty, results must match any one of the platforms).
   * @return platforms
   */
  @javax.annotation.Nullable
  public List<PlatformsEnum> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<PlatformsEnum> platforms) {
    this.platforms = platforms;
  }


  public FilterSet publisherIdentifiers(List<String> publisherIdentifiers) {
    this.publisherIdentifiers = publisherIdentifiers;
    return this;
  }

  public FilterSet addPublisherIdentifiersItem(String publisherIdentifiersItem) {
    if (this.publisherIdentifiers == null) {
      this.publisherIdentifiers = new ArrayList<>();
    }
    this.publisherIdentifiers.add(publisherIdentifiersItem);
    return this;
  }

  /**
   * For Open Bidding partners only. The list of publisher identifiers on which to filter; may be empty. The filters represented by multiple publisher identifiers are ORed together.
   * @return publisherIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getPublisherIdentifiers() {
    return publisherIdentifiers;
  }

  public void setPublisherIdentifiers(List<String> publisherIdentifiers) {
    this.publisherIdentifiers = publisherIdentifiers;
  }


  public FilterSet realtimeTimeRange(RealtimeTimeRange realtimeTimeRange) {
    this.realtimeTimeRange = realtimeTimeRange;
    return this;
  }

  /**
   * Get realtimeTimeRange
   * @return realtimeTimeRange
   */
  @javax.annotation.Nullable
  public RealtimeTimeRange getRealtimeTimeRange() {
    return realtimeTimeRange;
  }

  public void setRealtimeTimeRange(RealtimeTimeRange realtimeTimeRange) {
    this.realtimeTimeRange = realtimeTimeRange;
  }


  public FilterSet relativeDateRange(RelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
    return this;
  }

  /**
   * Get relativeDateRange
   * @return relativeDateRange
   */
  @javax.annotation.Nullable
  public RelativeDateRange getRelativeDateRange() {
    return relativeDateRange;
  }

  public void setRelativeDateRange(RelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }


  public FilterSet sellerNetworkIds(List<Integer> sellerNetworkIds) {
    this.sellerNetworkIds = sellerNetworkIds;
    return this;
  }

  public FilterSet addSellerNetworkIdsItem(Integer sellerNetworkIdsItem) {
    if (this.sellerNetworkIds == null) {
      this.sellerNetworkIds = new ArrayList<>();
    }
    this.sellerNetworkIds.add(sellerNetworkIdsItem);
    return this;
  }

  /**
   * For Authorized Buyers only. The list of IDs of the seller (publisher) networks on which to filter; may be empty. The filters represented by multiple seller network IDs are ORed together (for example, if non-empty, results must match any one of the publisher networks). See [seller-network-ids](https://developers.google.com/authorized-buyers/rtb/downloads/seller-network-ids) file for the set of existing seller network IDs.
   * @return sellerNetworkIds
   */
  @javax.annotation.Nullable
  public List<Integer> getSellerNetworkIds() {
    return sellerNetworkIds;
  }

  public void setSellerNetworkIds(List<Integer> sellerNetworkIds) {
    this.sellerNetworkIds = sellerNetworkIds;
  }


  public FilterSet timeSeriesGranularity(TimeSeriesGranularityEnum timeSeriesGranularity) {
    this.timeSeriesGranularity = timeSeriesGranularity;
    return this;
  }

  /**
   * The granularity of time intervals if a time series breakdown is preferred; optional.
   * @return timeSeriesGranularity
   */
  @javax.annotation.Nullable
  public TimeSeriesGranularityEnum getTimeSeriesGranularity() {
    return timeSeriesGranularity;
  }

  public void setTimeSeriesGranularity(TimeSeriesGranularityEnum timeSeriesGranularity) {
    this.timeSeriesGranularity = timeSeriesGranularity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSet filterSet = (FilterSet) o;
    return Objects.equals(this.absoluteDateRange, filterSet.absoluteDateRange) &&
        Objects.equals(this.breakdownDimensions, filterSet.breakdownDimensions) &&
        Objects.equals(this.creativeId, filterSet.creativeId) &&
        Objects.equals(this.dealId, filterSet.dealId) &&
        Objects.equals(this.environment, filterSet.environment) &&
        Objects.equals(this.format, filterSet.format) &&
        Objects.equals(this.formats, filterSet.formats) &&
        Objects.equals(this.name, filterSet.name) &&
        Objects.equals(this.platforms, filterSet.platforms) &&
        Objects.equals(this.publisherIdentifiers, filterSet.publisherIdentifiers) &&
        Objects.equals(this.realtimeTimeRange, filterSet.realtimeTimeRange) &&
        Objects.equals(this.relativeDateRange, filterSet.relativeDateRange) &&
        Objects.equals(this.sellerNetworkIds, filterSet.sellerNetworkIds) &&
        Objects.equals(this.timeSeriesGranularity, filterSet.timeSeriesGranularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteDateRange, breakdownDimensions, creativeId, dealId, environment, format, formats, name, platforms, publisherIdentifiers, realtimeTimeRange, relativeDateRange, sellerNetworkIds, timeSeriesGranularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSet {\n");
    sb.append("    absoluteDateRange: ").append(toIndentedString(absoluteDateRange)).append("\n");
    sb.append("    breakdownDimensions: ").append(toIndentedString(breakdownDimensions)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    publisherIdentifiers: ").append(toIndentedString(publisherIdentifiers)).append("\n");
    sb.append("    realtimeTimeRange: ").append(toIndentedString(realtimeTimeRange)).append("\n");
    sb.append("    relativeDateRange: ").append(toIndentedString(relativeDateRange)).append("\n");
    sb.append("    sellerNetworkIds: ").append(toIndentedString(sellerNetworkIds)).append("\n");
    sb.append("    timeSeriesGranularity: ").append(toIndentedString(timeSeriesGranularity)).append("\n");
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
    openapiFields.add("absoluteDateRange");
    openapiFields.add("breakdownDimensions");
    openapiFields.add("creativeId");
    openapiFields.add("dealId");
    openapiFields.add("environment");
    openapiFields.add("format");
    openapiFields.add("formats");
    openapiFields.add("name");
    openapiFields.add("platforms");
    openapiFields.add("publisherIdentifiers");
    openapiFields.add("realtimeTimeRange");
    openapiFields.add("relativeDateRange");
    openapiFields.add("sellerNetworkIds");
    openapiFields.add("timeSeriesGranularity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FilterSet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FilterSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterSet is not found in the empty JSON string", FilterSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FilterSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `absoluteDateRange`
      if (jsonObj.get("absoluteDateRange") != null && !jsonObj.get("absoluteDateRange").isJsonNull()) {
        AbsoluteDateRange.validateJsonElement(jsonObj.get("absoluteDateRange"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("breakdownDimensions") != null && !jsonObj.get("breakdownDimensions").isJsonNull() && !jsonObj.get("breakdownDimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `breakdownDimensions` to be an array in the JSON string but got `%s`", jsonObj.get("breakdownDimensions").toString()));
      }
      if ((jsonObj.get("creativeId") != null && !jsonObj.get("creativeId").isJsonNull()) && !jsonObj.get("creativeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeId").toString()));
      }
      if ((jsonObj.get("dealId") != null && !jsonObj.get("dealId").isJsonNull()) && !jsonObj.get("dealId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealId").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        EnvironmentEnum.validateJsonElement(jsonObj.get("environment"));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("formats") != null && !jsonObj.get("formats").isJsonNull() && !jsonObj.get("formats").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `formats` to be an array in the JSON string but got `%s`", jsonObj.get("formats").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("platforms") != null && !jsonObj.get("platforms").isJsonNull() && !jsonObj.get("platforms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `platforms` to be an array in the JSON string but got `%s`", jsonObj.get("platforms").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("publisherIdentifiers") != null && !jsonObj.get("publisherIdentifiers").isJsonNull() && !jsonObj.get("publisherIdentifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `publisherIdentifiers` to be an array in the JSON string but got `%s`", jsonObj.get("publisherIdentifiers").toString()));
      }
      // validate the optional field `realtimeTimeRange`
      if (jsonObj.get("realtimeTimeRange") != null && !jsonObj.get("realtimeTimeRange").isJsonNull()) {
        RealtimeTimeRange.validateJsonElement(jsonObj.get("realtimeTimeRange"));
      }
      // validate the optional field `relativeDateRange`
      if (jsonObj.get("relativeDateRange") != null && !jsonObj.get("relativeDateRange").isJsonNull()) {
        RelativeDateRange.validateJsonElement(jsonObj.get("relativeDateRange"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sellerNetworkIds") != null && !jsonObj.get("sellerNetworkIds").isJsonNull() && !jsonObj.get("sellerNetworkIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerNetworkIds` to be an array in the JSON string but got `%s`", jsonObj.get("sellerNetworkIds").toString()));
      }
      if ((jsonObj.get("timeSeriesGranularity") != null && !jsonObj.get("timeSeriesGranularity").isJsonNull()) && !jsonObj.get("timeSeriesGranularity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSeriesGranularity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSeriesGranularity").toString()));
      }
      // validate the optional field `timeSeriesGranularity`
      if (jsonObj.get("timeSeriesGranularity") != null && !jsonObj.get("timeSeriesGranularity").isJsonNull()) {
        TimeSeriesGranularityEnum.validateJsonElement(jsonObj.get("timeSeriesGranularity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterSet.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterSet>() {
           @Override
           public void write(JsonWriter out, FilterSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FilterSet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FilterSet
   * @throws IOException if the JSON string is invalid with respect to FilterSet
   */
  public static FilterSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterSet.class);
  }

  /**
   * Convert an instance of FilterSet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

