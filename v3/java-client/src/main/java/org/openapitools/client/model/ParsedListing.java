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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.DataIssueDetail;
import org.openapitools.client.model.Image;
import org.openapitools.client.model.LatLng;
import org.openapitools.client.model.LocalizedText;
import org.openapitools.client.model.Review;

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
 * A parsed listing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:57.375310-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ParsedListing {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<LocalizedText> category = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_ISSUE_DETAIL = "dataIssueDetail";
  @SerializedName(SERIALIZED_NAME_DATA_ISSUE_DETAIL)
  private List<DataIssueDetail> dataIssueDetail = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private List<LocalizedText> description = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private List<Image> image = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMPRECISION_RADIUS_METERS = "imprecisionRadiusMeters";
  @SerializedName(SERIALIZED_NAME_IMPRECISION_RADIUS_METERS)
  private Integer imprecisionRadiusMeters;

  public static final String SERIALIZED_NAME_IS_SERVED = "isServed";
  @SerializedName(SERIALIZED_NAME_IS_SERVED)
  private Boolean isServed;

  public static final String SERIALIZED_NAME_LISTING_NAME = "listingName";
  @SerializedName(SERIALIZED_NAME_LISTING_NAME)
  private List<LocalizedText> listingName = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LatLng location;

  public static final String SERIALIZED_NAME_PARTNER_LIST_ID = "partnerListId";
  @SerializedName(SERIALIZED_NAME_PARTNER_LIST_ID)
  private String partnerListId;

  public static final String SERIALIZED_NAME_REGION_CODE = "regionCode";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_REVIEW = "review";
  @SerializedName(SERIALIZED_NAME_REVIEW)
  private List<Review> review = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNIT_ATTRIBUTES = "unitAttributes";
  @SerializedName(SERIALIZED_NAME_UNIT_ATTRIBUTES)
  private Map<String, String> unitAttributes = new HashMap<>();

  public ParsedListing() {
  }

  public ParsedListing brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * If not empty, it indicates that this listing belongs to a brand of the feed.
   * @return brand
   */
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ParsedListing category(List<LocalizedText> category) {
    this.category = category;
    return this;
  }

  public ParsedListing addCategoryItem(LocalizedText categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * The partner provided category (accommodation type) of the property.
   * @return category
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getCategory() {
    return category;
  }

  public void setCategory(List<LocalizedText> category) {
    this.category = category;
  }


  public ParsedListing dataIssueDetail(List<DataIssueDetail> dataIssueDetail) {
    this.dataIssueDetail = dataIssueDetail;
    return this;
  }

  public ParsedListing addDataIssueDetailItem(DataIssueDetail dataIssueDetailItem) {
    if (this.dataIssueDetail == null) {
      this.dataIssueDetail = new ArrayList<>();
    }
    this.dataIssueDetail.add(dataIssueDetailItem);
    return this;
  }

  /**
   * Data issues about this listing
   * @return dataIssueDetail
   */
  @javax.annotation.Nullable
  public List<DataIssueDetail> getDataIssueDetail() {
    return dataIssueDetail;
  }

  public void setDataIssueDetail(List<DataIssueDetail> dataIssueDetail) {
    this.dataIssueDetail = dataIssueDetail;
  }


  public ParsedListing description(List<LocalizedText> description) {
    this.description = description;
    return this;
  }

  public ParsedListing addDescriptionItem(LocalizedText descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Description of the property.
   * @return description
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getDescription() {
    return description;
  }

  public void setDescription(List<LocalizedText> description) {
    this.description = description;
  }


  public ParsedListing image(List<Image> image) {
    this.image = image;
    return this;
  }

  public ParsedListing addImageItem(Image imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

  /**
   * Images associated with this listing, localized.
   * @return image
   */
  @javax.annotation.Nullable
  public List<Image> getImage() {
    return image;
  }

  public void setImage(List<Image> image) {
    this.image = image;
  }


  public ParsedListing imprecisionRadiusMeters(Integer imprecisionRadiusMeters) {
    this.imprecisionRadiusMeters = imprecisionRadiusMeters;
    return this;
  }

  /**
   * Represents the accuracy of the location. The listing can be anywhere within the defined circular area.
   * @return imprecisionRadiusMeters
   */
  @javax.annotation.Nullable
  public Integer getImprecisionRadiusMeters() {
    return imprecisionRadiusMeters;
  }

  public void setImprecisionRadiusMeters(Integer imprecisionRadiusMeters) {
    this.imprecisionRadiusMeters = imprecisionRadiusMeters;
  }


  public ParsedListing isServed(Boolean isServed) {
    this.isServed = isServed;
    return this;
  }

  /**
   * Whether the listing can be served based on non image data alone.
   * @return isServed
   */
  @javax.annotation.Nullable
  public Boolean getIsServed() {
    return isServed;
  }

  public void setIsServed(Boolean isServed) {
    this.isServed = isServed;
  }


  public ParsedListing listingName(List<LocalizedText> listingName) {
    this.listingName = listingName;
    return this;
  }

  public ParsedListing addListingNameItem(LocalizedText listingNameItem) {
    if (this.listingName == null) {
      this.listingName = new ArrayList<>();
    }
    this.listingName.add(listingNameItem);
    return this;
  }

  /**
   * List of localized names.
   * @return listingName
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getListingName() {
    return listingName;
  }

  public void setListingName(List<LocalizedText> listingName) {
    this.listingName = listingName;
  }


  public ParsedListing location(LatLng location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public LatLng getLocation() {
    return location;
  }

  public void setLocation(LatLng location) {
    this.location = location;
  }


  public ParsedListing partnerListId(String partnerListId) {
    this.partnerListId = partnerListId;
    return this;
  }

  /**
   * The list id on partner lec feed, provided by partner.
   * @return partnerListId
   */
  @javax.annotation.Nullable
  public String getPartnerListId() {
    return partnerListId;
  }

  public void setPartnerListId(String partnerListId) {
    this.partnerListId = partnerListId;
  }


  public ParsedListing regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * The country code where the listing is located.
   * @return regionCode
   */
  @javax.annotation.Nullable
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public ParsedListing review(List<Review> review) {
    this.review = review;
    return this;
  }

  public ParsedListing addReviewItem(Review reviewItem) {
    if (this.review == null) {
      this.review = new ArrayList<>();
    }
    this.review.add(reviewItem);
    return this;
  }

  /**
   * Reviews associated with this listing. Each review proto has a single language attached to it.
   * @return review
   */
  @javax.annotation.Nullable
  public List<Review> getReview() {
    return review;
  }

  public void setReview(List<Review> review) {
    this.review = review;
  }


  public ParsedListing unitAttributes(Map<String, String> unitAttributes) {
    this.unitAttributes = unitAttributes;
    return this;
  }

  public ParsedListing putUnitAttributesItem(String key, String unitAttributesItem) {
    if (this.unitAttributes == null) {
      this.unitAttributes = new HashMap<>();
    }
    this.unitAttributes.put(key, unitAttributesItem);
    return this;
  }

  /**
   * VR List attribute.
   * @return unitAttributes
   */
  @javax.annotation.Nullable
  public Map<String, String> getUnitAttributes() {
    return unitAttributes;
  }

  public void setUnitAttributes(Map<String, String> unitAttributes) {
    this.unitAttributes = unitAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedListing parsedListing = (ParsedListing) o;
    return Objects.equals(this.brand, parsedListing.brand) &&
        Objects.equals(this.category, parsedListing.category) &&
        Objects.equals(this.dataIssueDetail, parsedListing.dataIssueDetail) &&
        Objects.equals(this.description, parsedListing.description) &&
        Objects.equals(this.image, parsedListing.image) &&
        Objects.equals(this.imprecisionRadiusMeters, parsedListing.imprecisionRadiusMeters) &&
        Objects.equals(this.isServed, parsedListing.isServed) &&
        Objects.equals(this.listingName, parsedListing.listingName) &&
        Objects.equals(this.location, parsedListing.location) &&
        Objects.equals(this.partnerListId, parsedListing.partnerListId) &&
        Objects.equals(this.regionCode, parsedListing.regionCode) &&
        Objects.equals(this.review, parsedListing.review) &&
        Objects.equals(this.unitAttributes, parsedListing.unitAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, category, dataIssueDetail, description, image, imprecisionRadiusMeters, isServed, listingName, location, partnerListId, regionCode, review, unitAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedListing {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dataIssueDetail: ").append(toIndentedString(dataIssueDetail)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imprecisionRadiusMeters: ").append(toIndentedString(imprecisionRadiusMeters)).append("\n");
    sb.append("    isServed: ").append(toIndentedString(isServed)).append("\n");
    sb.append("    listingName: ").append(toIndentedString(listingName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    partnerListId: ").append(toIndentedString(partnerListId)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    unitAttributes: ").append(toIndentedString(unitAttributes)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("category");
    openapiFields.add("dataIssueDetail");
    openapiFields.add("description");
    openapiFields.add("image");
    openapiFields.add("imprecisionRadiusMeters");
    openapiFields.add("isServed");
    openapiFields.add("listingName");
    openapiFields.add("location");
    openapiFields.add("partnerListId");
    openapiFields.add("regionCode");
    openapiFields.add("review");
    openapiFields.add("unitAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ParsedListing
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParsedListing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParsedListing is not found in the empty JSON string", ParsedListing.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParsedListing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParsedListing` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        JsonArray jsonArraycategory = jsonObj.getAsJsonArray("category");
        if (jsonArraycategory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("category").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `category` to be an array in the JSON string but got `%s`", jsonObj.get("category").toString()));
          }

          // validate the optional field `category` (array)
          for (int i = 0; i < jsonArraycategory.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraycategory.get(i));
          };
        }
      }
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
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        JsonArray jsonArraydescription = jsonObj.getAsJsonArray("description");
        if (jsonArraydescription != null) {
          // ensure the json data is an array
          if (!jsonObj.get("description").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be an array in the JSON string but got `%s`", jsonObj.get("description").toString()));
          }

          // validate the optional field `description` (array)
          for (int i = 0; i < jsonArraydescription.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraydescription.get(i));
          };
        }
      }
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        JsonArray jsonArrayimage = jsonObj.getAsJsonArray("image");
        if (jsonArrayimage != null) {
          // ensure the json data is an array
          if (!jsonObj.get("image").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `image` to be an array in the JSON string but got `%s`", jsonObj.get("image").toString()));
          }

          // validate the optional field `image` (array)
          for (int i = 0; i < jsonArrayimage.size(); i++) {
            Image.validateJsonElement(jsonArrayimage.get(i));
          };
        }
      }
      if (jsonObj.get("listingName") != null && !jsonObj.get("listingName").isJsonNull()) {
        JsonArray jsonArraylistingName = jsonObj.getAsJsonArray("listingName");
        if (jsonArraylistingName != null) {
          // ensure the json data is an array
          if (!jsonObj.get("listingName").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `listingName` to be an array in the JSON string but got `%s`", jsonObj.get("listingName").toString()));
          }

          // validate the optional field `listingName` (array)
          for (int i = 0; i < jsonArraylistingName.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraylistingName.get(i));
          };
        }
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LatLng.validateJsonElement(jsonObj.get("location"));
      }
      if ((jsonObj.get("partnerListId") != null && !jsonObj.get("partnerListId").isJsonNull()) && !jsonObj.get("partnerListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerListId").toString()));
      }
      if ((jsonObj.get("regionCode") != null && !jsonObj.get("regionCode").isJsonNull()) && !jsonObj.get("regionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionCode").toString()));
      }
      if (jsonObj.get("review") != null && !jsonObj.get("review").isJsonNull()) {
        JsonArray jsonArrayreview = jsonObj.getAsJsonArray("review");
        if (jsonArrayreview != null) {
          // ensure the json data is an array
          if (!jsonObj.get("review").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `review` to be an array in the JSON string but got `%s`", jsonObj.get("review").toString()));
          }

          // validate the optional field `review` (array)
          for (int i = 0; i < jsonArrayreview.size(); i++) {
            Review.validateJsonElement(jsonArrayreview.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParsedListing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParsedListing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParsedListing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParsedListing.class));

       return (TypeAdapter<T>) new TypeAdapter<ParsedListing>() {
           @Override
           public void write(JsonWriter out, ParsedListing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParsedListing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ParsedListing given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ParsedListing
   * @throws IOException if the JSON string is invalid with respect to ParsedListing
   */
  public static ParsedListing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParsedListing.class);
  }

  /**
   * Convert an instance of ParsedListing to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

