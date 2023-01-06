/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
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
import java.util.List;
import org.openapitools.client.model.DataIssueDetail;

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
 * A hotel view.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:57.375310-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HotelView {
  public static final String SERIALIZED_NAME_DATA_ISSUE_DETAIL = "dataIssueDetail";
  @SerializedName(SERIALIZED_NAME_DATA_ISSUE_DETAIL)
  private List<DataIssueDetail> dataIssueDetail = new ArrayList<>();

  /**
   * Gets or Sets dataIssues
   */
  @JsonAdapter(DataIssuesEnum.Adapter.class)
  public enum DataIssuesEnum {
    FEED_DATA_ISSUE_UNSPECIFIED("FEED_DATA_ISSUE_UNSPECIFIED"),
    
    FEED_DATA_ISSUE_UNKNOWN("FEED_DATA_ISSUE_UNKNOWN"),
    
    NO_DATA_ISSUE("NO_DATA_ISSUE"),
    
    DUPLICATE_ADDRESS("DUPLICATE_ADDRESS"),
    
    MISSING_PHYSICAL_STREET_ADDRESS("MISSING_PHYSICAL_STREET_ADDRESS"),
    
    MISSING_STREET_NAME("MISSING_STREET_NAME"),
    
    MISSING_STREET_NUMBER("MISSING_STREET_NUMBER"),
    
    MISSING_ADDRESS("MISSING_ADDRESS"),
    
    MISSING_COUNTRY("MISSING_COUNTRY"),
    
    INVALID_POSTAL_CODE("INVALID_POSTAL_CODE"),
    
    INVALID_POSTAL_CODE_SUFFIX("INVALID_POSTAL_CODE_SUFFIX"),
    
    UNEXPECTED_POSTAL_CODE_SUFFIX("UNEXPECTED_POSTAL_CODE_SUFFIX"),
    
    UNEXPECTED_POSTAL_CODE("UNEXPECTED_POSTAL_CODE"),
    
    INVALID_AMENITIES("INVALID_AMENITIES"),
    
    INVALID_EMAIL_ADDRESS("INVALID_EMAIL_ADDRESS"),
    
    DUPLICATE_LATLONG("DUPLICATE_LATLONG"),
    
    LATLONG_INCONSISTENT_WITH_ADDRESS("LATLONG_INCONSISTENT_WITH_ADDRESS"),
    
    MISSING_LATLONG("MISSING_LATLONG"),
    
    COULD_NOT_GEOCODE("COULD_NOT_GEOCODE"),
    
    MISSING_HOTEL_NAME("MISSING_HOTEL_NAME"),
    
    HOTEL_NAME_EMPTY("HOTEL_NAME_EMPTY"),
    
    INVALID_HOTEL_NAME("INVALID_HOTEL_NAME"),
    
    HOTEL_NAME_TOO_LONG("HOTEL_NAME_TOO_LONG"),
    
    PARSE_ERROR_IN_XML("PARSE_ERROR_IN_XML"),
    
    UNEXPECTED_ATTRIBUTE_IN_XML("UNEXPECTED_ATTRIBUTE_IN_XML"),
    
    DUPLICATE_PHONE_NUMBER("DUPLICATE_PHONE_NUMBER"),
    
    MISSING_PHONE_NUMBER("MISSING_PHONE_NUMBER"),
    
    MISSING_VOICE_PHONE_NUMBER("MISSING_VOICE_PHONE_NUMBER"),
    
    INVALID_PHONE_NUMBER_FORMAT("INVALID_PHONE_NUMBER_FORMAT"),
    
    INVALID_PHONE_NUMBER("INVALID_PHONE_NUMBER"),
    
    INVALID_PHONE_NUMBER_COUNTRY_CODE("INVALID_PHONE_NUMBER_COUNTRY_CODE"),
    
    PHONE_NUMBER_TOO_LONG("PHONE_NUMBER_TOO_LONG"),
    
    PHONE_NUMBER_TOO_SHORT("PHONE_NUMBER_TOO_SHORT"),
    
    INVALID_WEBSITE_URL("INVALID_WEBSITE_URL"),
    
    ADWORDS_ATTRIBUTE_TOO_LONG("ADWORDS_ATTRIBUTE_TOO_LONG"),
    
    BRAND_NOT_ALLOWED("BRAND_NOT_ALLOWED"),
    
    FLAGGED_DUE_TO_SUSPICIOUS_METADATA("FLAGGED_DUE_TO_SUSPICIOUS_METADATA"),
    
    NOT_ENOUGH_IMAGES_PROVIDED("NOT_ENOUGH_IMAGES_PROVIDED"),
    
    IMAGE_PROCESSING_IN_PROGRESS("IMAGE_PROCESSING_IN_PROGRESS"),
    
    CANNOT_FETCH_IMAGES("CANNOT_FETCH_IMAGES"),
    
    INCOMPATIBLE_IMAGE_SIZE_OR_LOW_QUALITY("INCOMPATIBLE_IMAGE_SIZE_OR_LOW_QUALITY"),
    
    MISSING_LANG_IN_RAW_LISTING("MISSING_LANG_IN_RAW_LISTING"),
    
    IS_HOTEL("IS_HOTEL"),
    
    MISSING_REQ_ATTR("MISSING_REQ_ATTR"),
    
    MISSING_NAME("MISSING_NAME"),
    
    MISSING_LANG_IN_NAME("MISSING_LANG_IN_NAME"),
    
    VR_NAME_TOO_LONG("VR_NAME_TOO_LONG"),
    
    TEST_PROPERTY("TEST_PROPERTY"),
    
    NON_VR_ACCOMMODATION_TYPE_BASED_ON_LISTING_NAME("NON_VR_ACCOMMODATION_TYPE_BASED_ON_LISTING_NAME"),
    
    BRAND_NAME_TOO_LONG("BRAND_NAME_TOO_LONG"),
    
    MISSING_BRAND_NAME("MISSING_BRAND_NAME"),
    
    INVALID_REVIEW_RATING("INVALID_REVIEW_RATING"),
    
    INVALID_CHECKIN_FORMAT("INVALID_CHECKIN_FORMAT"),
    
    INVALID_CHECKOUT_FORMAT("INVALID_CHECKOUT_FORMAT");

    private String value;

    DataIssuesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataIssuesEnum fromValue(String value) {
      for (DataIssuesEnum b : DataIssuesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataIssuesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataIssuesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataIssuesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataIssuesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DataIssuesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DATA_ISSUES = "dataIssues";
  @SerializedName(SERIALIZED_NAME_DATA_ISSUES)
  private List<DataIssuesEnum> dataIssues = new ArrayList<>();

  public static final String SERIALIZED_NAME_GOOGLE_CLUSTER_ID = "googleClusterId";
  @SerializedName(SERIALIZED_NAME_GOOGLE_CLUSTER_ID)
  private String googleClusterId;

  public static final String SERIALIZED_NAME_GOOGLE_HOTEL_DISPLAY_NAME = "googleHotelDisplayName";
  @SerializedName(SERIALIZED_NAME_GOOGLE_HOTEL_DISPLAY_NAME)
  private String googleHotelDisplayName;

  public static final String SERIALIZED_NAME_GOOGLE_HOTEL_ID = "googleHotelId";
  @SerializedName(SERIALIZED_NAME_GOOGLE_HOTEL_ID)
  private String googleHotelId;

  public static final String SERIALIZED_NAME_LIVE_ON_GOOGLE = "liveOnGoogle";
  @SerializedName(SERIALIZED_NAME_LIVE_ON_GOOGLE)
  private Boolean liveOnGoogle;

  /**
   * Current matching status of the hotel.
   */
  @JsonAdapter(MatchStatusEnum.Adapter.class)
  public enum MatchStatusEnum {
    MATCH_STATUS_UNSPECIFIED("MATCH_STATUS_UNSPECIFIED"),
    
    MATCH_STATUS_UNKNOWN("MATCH_STATUS_UNKNOWN"),
    
    NOT_MATCHED("NOT_MATCHED"),
    
    MATCHED("MATCHED"),
    
    MAP_OVERLAP("MAP_OVERLAP");

    private String value;

    MatchStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchStatusEnum fromValue(String value) {
      for (MatchStatusEnum b : MatchStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MatchStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MATCH_STATUS = "matchStatus";
  @SerializedName(SERIALIZED_NAME_MATCH_STATUS)
  private MatchStatusEnum matchStatus;

  public static final String SERIALIZED_NAME_OVERCLUSTERED_PARTNER_HOTEL_IDS = "overclusteredPartnerHotelIds";
  @SerializedName(SERIALIZED_NAME_OVERCLUSTERED_PARTNER_HOTEL_IDS)
  private List<String> overclusteredPartnerHotelIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARTNER_HOTEL_DISPLAY_NAME = "partnerHotelDisplayName";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_DISPLAY_NAME)
  private String partnerHotelDisplayName;

  public static final String SERIALIZED_NAME_PARTNER_HOTEL_ID = "partnerHotelId";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_ID)
  private String partnerHotelId;

  public static final String SERIALIZED_NAME_PRIMARY_OVERCLUSTERED_PARTNER_HOTEL_ID = "primaryOverclusteredPartnerHotelId";
  @SerializedName(SERIALIZED_NAME_PRIMARY_OVERCLUSTERED_PARTNER_HOTEL_ID)
  private String primaryOverclusteredPartnerHotelId;

  public static final String SERIALIZED_NAME_PROPERTY_DETAILS = "propertyDetails";
  @SerializedName(SERIALIZED_NAME_PROPERTY_DETAILS)
  private String propertyDetails;

  public HotelView() {
  }

  public HotelView dataIssueDetail(List<DataIssueDetail> dataIssueDetail) {
    this.dataIssueDetail = dataIssueDetail;
    return this;
  }

  public HotelView addDataIssueDetailItem(DataIssueDetail dataIssueDetailItem) {
    if (this.dataIssueDetail == null) {
      this.dataIssueDetail = new ArrayList<>();
    }
    this.dataIssueDetail.add(dataIssueDetailItem);
    return this;
  }

  /**
   * The type and severity of each data quality issue in the feed. If your feed contains data issues, update the feed and resubmit it. For more information, refer to this article.
   * @return dataIssueDetail
   */
  @javax.annotation.Nullable
  public List<DataIssueDetail> getDataIssueDetail() {
    return dataIssueDetail;
  }

  public void setDataIssueDetail(List<DataIssueDetail> dataIssueDetail) {
    this.dataIssueDetail = dataIssueDetail;
  }


  public HotelView dataIssues(List<DataIssuesEnum> dataIssues) {
    this.dataIssues = dataIssues;
    return this;
  }

  public HotelView addDataIssuesItem(DataIssuesEnum dataIssuesItem) {
    if (this.dataIssues == null) {
      this.dataIssues = new ArrayList<>();
    }
    this.dataIssues.add(dataIssuesItem);
    return this;
  }

  /**
   * DEPRECATED. Indicates that the hotel has data quality issues. The value of this field indicates the type of error. This has been replaced with the data_issue_detail field. If your feed contains data issues, update the feed and resubmit it. For more information, refer to this article.
   * @return dataIssues
   */
  @javax.annotation.Nullable
  public List<DataIssuesEnum> getDataIssues() {
    return dataIssues;
  }

  public void setDataIssues(List<DataIssuesEnum> dataIssues) {
    this.dataIssues = dataIssues;
  }


  public HotelView googleClusterId(String googleClusterId) {
    this.googleClusterId = googleClusterId;
    return this;
  }

  /**
   * The Google Maps identifier for the hotel.
   * @return googleClusterId
   */
  @javax.annotation.Nullable
  public String getGoogleClusterId() {
    return googleClusterId;
  }

  public void setGoogleClusterId(String googleClusterId) {
    this.googleClusterId = googleClusterId;
  }


  public HotelView googleHotelDisplayName(String googleHotelDisplayName) {
    this.googleHotelDisplayName = googleHotelDisplayName;
    return this;
  }

  /**
   * Google&#39;s hotel name.
   * @return googleHotelDisplayName
   */
  @javax.annotation.Nullable
  public String getGoogleHotelDisplayName() {
    return googleHotelDisplayName;
  }

  public void setGoogleHotelDisplayName(String googleHotelDisplayName) {
    this.googleHotelDisplayName = googleHotelDisplayName;
  }


  public HotelView googleHotelId(String googleHotelId) {
    this.googleHotelId = googleHotelId;
    return this;
  }

  /**
   * Google&#39;s canonical ID for the hotel.
   * @return googleHotelId
   */
  @javax.annotation.Nullable
  public String getGoogleHotelId() {
    return googleHotelId;
  }

  public void setGoogleHotelId(String googleHotelId) {
    this.googleHotelId = googleHotelId;
  }


  public HotelView liveOnGoogle(Boolean liveOnGoogle) {
    this.liveOnGoogle = liveOnGoogle;
    return this;
  }

  /**
   * Optional. Whether the hotel appears in Google&#39;s hotel booking links. Declaration &amp; behavior to get detection of presence/absence in JSON conversion.
   * @return liveOnGoogle
   */
  @javax.annotation.Nullable
  public Boolean getLiveOnGoogle() {
    return liveOnGoogle;
  }

  public void setLiveOnGoogle(Boolean liveOnGoogle) {
    this.liveOnGoogle = liveOnGoogle;
  }


  public HotelView matchStatus(MatchStatusEnum matchStatus) {
    this.matchStatus = matchStatus;
    return this;
  }

  /**
   * Current matching status of the hotel.
   * @return matchStatus
   */
  @javax.annotation.Nullable
  public MatchStatusEnum getMatchStatus() {
    return matchStatus;
  }

  public void setMatchStatus(MatchStatusEnum matchStatus) {
    this.matchStatus = matchStatus;
  }


  public HotelView overclusteredPartnerHotelIds(List<String> overclusteredPartnerHotelIds) {
    this.overclusteredPartnerHotelIds = overclusteredPartnerHotelIds;
    return this;
  }

  public HotelView addOverclusteredPartnerHotelIdsItem(String overclusteredPartnerHotelIdsItem) {
    if (this.overclusteredPartnerHotelIds == null) {
      this.overclusteredPartnerHotelIds = new ArrayList<>();
    }
    this.overclusteredPartnerHotelIds.add(overclusteredPartnerHotelIdsItem);
    return this;
  }

  /**
   * Other hotels with which the hotel is overclustered. If your feed contains overclustered hotels, update the feed and resubmit it. To do this, you can use the manual match tool.
   * @return overclusteredPartnerHotelIds
   */
  @javax.annotation.Nullable
  public List<String> getOverclusteredPartnerHotelIds() {
    return overclusteredPartnerHotelIds;
  }

  public void setOverclusteredPartnerHotelIds(List<String> overclusteredPartnerHotelIds) {
    this.overclusteredPartnerHotelIds = overclusteredPartnerHotelIds;
  }


  public HotelView partnerHotelDisplayName(String partnerHotelDisplayName) {
    this.partnerHotelDisplayName = partnerHotelDisplayName;
    return this;
  }

  /**
   * Partner&#39;s hotel name.
   * @return partnerHotelDisplayName
   */
  @javax.annotation.Nullable
  public String getPartnerHotelDisplayName() {
    return partnerHotelDisplayName;
  }

  public void setPartnerHotelDisplayName(String partnerHotelDisplayName) {
    this.partnerHotelDisplayName = partnerHotelDisplayName;
  }


  public HotelView partnerHotelId(String partnerHotelId) {
    this.partnerHotelId = partnerHotelId;
    return this;
  }

  /**
   * The unique ID of the hotel that the partner provides in their Hotel List Feed.
   * @return partnerHotelId
   */
  @javax.annotation.Nullable
  public String getPartnerHotelId() {
    return partnerHotelId;
  }

  public void setPartnerHotelId(String partnerHotelId) {
    this.partnerHotelId = partnerHotelId;
  }


  public HotelView primaryOverclusteredPartnerHotelId(String primaryOverclusteredPartnerHotelId) {
    this.primaryOverclusteredPartnerHotelId = primaryOverclusteredPartnerHotelId;
    return this;
  }

  /**
   * The primary hotel in the overclustered set.
   * @return primaryOverclusteredPartnerHotelId
   */
  @javax.annotation.Nullable
  public String getPrimaryOverclusteredPartnerHotelId() {
    return primaryOverclusteredPartnerHotelId;
  }

  public void setPrimaryOverclusteredPartnerHotelId(String primaryOverclusteredPartnerHotelId) {
    this.primaryOverclusteredPartnerHotelId = primaryOverclusteredPartnerHotelId;
  }


  public HotelView propertyDetails(String propertyDetails) {
    this.propertyDetails = propertyDetails;
    return this;
  }

  /**
   * Optional. A URL to the property on Google. Only available for properties that are listed.
   * @return propertyDetails
   */
  @javax.annotation.Nullable
  public String getPropertyDetails() {
    return propertyDetails;
  }

  public void setPropertyDetails(String propertyDetails) {
    this.propertyDetails = propertyDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelView hotelView = (HotelView) o;
    return Objects.equals(this.dataIssueDetail, hotelView.dataIssueDetail) &&
        Objects.equals(this.dataIssues, hotelView.dataIssues) &&
        Objects.equals(this.googleClusterId, hotelView.googleClusterId) &&
        Objects.equals(this.googleHotelDisplayName, hotelView.googleHotelDisplayName) &&
        Objects.equals(this.googleHotelId, hotelView.googleHotelId) &&
        Objects.equals(this.liveOnGoogle, hotelView.liveOnGoogle) &&
        Objects.equals(this.matchStatus, hotelView.matchStatus) &&
        Objects.equals(this.overclusteredPartnerHotelIds, hotelView.overclusteredPartnerHotelIds) &&
        Objects.equals(this.partnerHotelDisplayName, hotelView.partnerHotelDisplayName) &&
        Objects.equals(this.partnerHotelId, hotelView.partnerHotelId) &&
        Objects.equals(this.primaryOverclusteredPartnerHotelId, hotelView.primaryOverclusteredPartnerHotelId) &&
        Objects.equals(this.propertyDetails, hotelView.propertyDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataIssueDetail, dataIssues, googleClusterId, googleHotelDisplayName, googleHotelId, liveOnGoogle, matchStatus, overclusteredPartnerHotelIds, partnerHotelDisplayName, partnerHotelId, primaryOverclusteredPartnerHotelId, propertyDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelView {\n");
    sb.append("    dataIssueDetail: ").append(toIndentedString(dataIssueDetail)).append("\n");
    sb.append("    dataIssues: ").append(toIndentedString(dataIssues)).append("\n");
    sb.append("    googleClusterId: ").append(toIndentedString(googleClusterId)).append("\n");
    sb.append("    googleHotelDisplayName: ").append(toIndentedString(googleHotelDisplayName)).append("\n");
    sb.append("    googleHotelId: ").append(toIndentedString(googleHotelId)).append("\n");
    sb.append("    liveOnGoogle: ").append(toIndentedString(liveOnGoogle)).append("\n");
    sb.append("    matchStatus: ").append(toIndentedString(matchStatus)).append("\n");
    sb.append("    overclusteredPartnerHotelIds: ").append(toIndentedString(overclusteredPartnerHotelIds)).append("\n");
    sb.append("    partnerHotelDisplayName: ").append(toIndentedString(partnerHotelDisplayName)).append("\n");
    sb.append("    partnerHotelId: ").append(toIndentedString(partnerHotelId)).append("\n");
    sb.append("    primaryOverclusteredPartnerHotelId: ").append(toIndentedString(primaryOverclusteredPartnerHotelId)).append("\n");
    sb.append("    propertyDetails: ").append(toIndentedString(propertyDetails)).append("\n");
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
    openapiFields.add("dataIssueDetail");
    openapiFields.add("dataIssues");
    openapiFields.add("googleClusterId");
    openapiFields.add("googleHotelDisplayName");
    openapiFields.add("googleHotelId");
    openapiFields.add("liveOnGoogle");
    openapiFields.add("matchStatus");
    openapiFields.add("overclusteredPartnerHotelIds");
    openapiFields.add("partnerHotelDisplayName");
    openapiFields.add("partnerHotelId");
    openapiFields.add("primaryOverclusteredPartnerHotelId");
    openapiFields.add("propertyDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelView
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HotelView.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelView is not found in the empty JSON string", HotelView.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HotelView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelView` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dataIssueDetail") != null && !jsonObj.get("dataIssueDetail").isJsonNull()) {
        JsonArray jsonArraydataIssueDetail = jsonObj.getAsJsonArray("dataIssueDetail");
        if (jsonArraydataIssueDetail != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dataIssueDetail").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dataIssueDetail` to be an array in the JSON string but got `%s`", jsonObj.get("dataIssueDetail").toString()));
          }

          // validate the optional field `dataIssueDetail` (array)
          for (int i = 0; i < jsonArraydataIssueDetail.size(); i++) {
            DataIssueDetail.validateJsonElement(jsonArraydataIssueDetail.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dataIssues") != null && !jsonObj.get("dataIssues").isJsonNull() && !jsonObj.get("dataIssues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataIssues` to be an array in the JSON string but got `%s`", jsonObj.get("dataIssues").toString()));
      }
      if ((jsonObj.get("googleClusterId") != null && !jsonObj.get("googleClusterId").isJsonNull()) && !jsonObj.get("googleClusterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googleClusterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googleClusterId").toString()));
      }
      if ((jsonObj.get("googleHotelDisplayName") != null && !jsonObj.get("googleHotelDisplayName").isJsonNull()) && !jsonObj.get("googleHotelDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googleHotelDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googleHotelDisplayName").toString()));
      }
      if ((jsonObj.get("googleHotelId") != null && !jsonObj.get("googleHotelId").isJsonNull()) && !jsonObj.get("googleHotelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googleHotelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googleHotelId").toString()));
      }
      if ((jsonObj.get("matchStatus") != null && !jsonObj.get("matchStatus").isJsonNull()) && !jsonObj.get("matchStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchStatus").toString()));
      }
      // validate the optional field `matchStatus`
      if (jsonObj.get("matchStatus") != null && !jsonObj.get("matchStatus").isJsonNull()) {
        MatchStatusEnum.validateJsonElement(jsonObj.get("matchStatus"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("overclusteredPartnerHotelIds") != null && !jsonObj.get("overclusteredPartnerHotelIds").isJsonNull() && !jsonObj.get("overclusteredPartnerHotelIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `overclusteredPartnerHotelIds` to be an array in the JSON string but got `%s`", jsonObj.get("overclusteredPartnerHotelIds").toString()));
      }
      if ((jsonObj.get("partnerHotelDisplayName") != null && !jsonObj.get("partnerHotelDisplayName").isJsonNull()) && !jsonObj.get("partnerHotelDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerHotelDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerHotelDisplayName").toString()));
      }
      if ((jsonObj.get("partnerHotelId") != null && !jsonObj.get("partnerHotelId").isJsonNull()) && !jsonObj.get("partnerHotelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerHotelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerHotelId").toString()));
      }
      if ((jsonObj.get("primaryOverclusteredPartnerHotelId") != null && !jsonObj.get("primaryOverclusteredPartnerHotelId").isJsonNull()) && !jsonObj.get("primaryOverclusteredPartnerHotelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryOverclusteredPartnerHotelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryOverclusteredPartnerHotelId").toString()));
      }
      if ((jsonObj.get("propertyDetails") != null && !jsonObj.get("propertyDetails").isJsonNull()) && !jsonObj.get("propertyDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyDetails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelView.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelView>() {
           @Override
           public void write(JsonWriter out, HotelView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelView read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HotelView given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HotelView
   * @throws IOException if the JSON string is invalid with respect to HotelView
   */
  public static HotelView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelView.class);
  }

  /**
   * Convert an instance of HotelView to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

