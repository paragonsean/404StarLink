/*
 * Amazon Personalize Runtime
 * <p/>
 *
 * The version of the OpenAPI document: 2018-05-22
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Promotion;

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
 * GetRecommendationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:55.811291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRecommendationsRequest {
  public static final String SERIALIZED_NAME_CAMPAIGN_ARN = "campaignArn";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ARN)
  private String campaignArn;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "numResults";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Map<String, String> context = new HashMap<>();

  public static final String SERIALIZED_NAME_FILTER_ARN = "filterArn";
  @SerializedName(SERIALIZED_NAME_FILTER_ARN)
  private String filterArn;

  public static final String SERIALIZED_NAME_FILTER_VALUES = "filterValues";
  @SerializedName(SERIALIZED_NAME_FILTER_VALUES)
  private Map<String, String> filterValues = new HashMap<>();

  public static final String SERIALIZED_NAME_RECOMMENDER_ARN = "recommenderArn";
  @SerializedName(SERIALIZED_NAME_RECOMMENDER_ARN)
  private String recommenderArn;

  public static final String SERIALIZED_NAME_PROMOTIONS = "promotions";
  @SerializedName(SERIALIZED_NAME_PROMOTIONS)
  private List<Promotion> promotions = new ArrayList<>();

  public GetRecommendationsRequest() {
  }

  public GetRecommendationsRequest campaignArn(String campaignArn) {
    this.campaignArn = campaignArn;
    return this;
  }

  /**
   * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
   * @return campaignArn
   */
  @javax.annotation.Nullable
  public String getCampaignArn() {
    return campaignArn;
  }

  public void setCampaignArn(String campaignArn) {
    this.campaignArn = campaignArn;
  }


  public GetRecommendationsRequest itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * &lt;p&gt;The item ID to provide recommendations for.&lt;/p&gt; &lt;p&gt;Required for &lt;code&gt;RELATED_ITEMS&lt;/code&gt; recipe type.&lt;/p&gt;
   * @return itemId
   */
  @javax.annotation.Nullable
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public GetRecommendationsRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * &lt;p&gt;The user ID to provide recommendations for.&lt;/p&gt; &lt;p&gt;Required for &lt;code&gt;USER_PERSONALIZATION&lt;/code&gt; recipe type.&lt;/p&gt;
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetRecommendationsRequest numResults(Integer numResults) {
    this.numResults = numResults;
    return this;
  }

  /**
   * The number of results to return. The default is 25. The maximum is 500.
   * minimum: 0
   * @return numResults
   */
  @javax.annotation.Nullable
  public Integer getNumResults() {
    return numResults;
  }

  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }


  public GetRecommendationsRequest context(Map<String, String> context) {
    this.context = context;
    return this;
  }

  public GetRecommendationsRequest putContextItem(String key, String contextItem) {
    if (this.context == null) {
      this.context = new HashMap<>();
    }
    this.context.put(key, contextItem);
    return this;
  }

  /**
   * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user&#39;s recommendations, such as the user&#39;s current location or device type.
   * @return context
   */
  @javax.annotation.Nullable
  public Map<String, String> getContext() {
    return context;
  }

  public void setContext(Map<String, String> context) {
    this.context = context;
  }


  public GetRecommendationsRequest filterArn(String filterArn) {
    this.filterArn = filterArn;
    return this;
  }

  /**
   * &lt;p&gt;The ARN of the filter to apply to the returned recommendations. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/personalize/latest/dg/filter.html\&quot;&gt;Filtering Recommendations&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;When using this parameter, be sure the filter resource is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;/p&gt;
   * @return filterArn
   */
  @javax.annotation.Nullable
  public String getFilterArn() {
    return filterArn;
  }

  public void setFilterArn(String filterArn) {
    this.filterArn = filterArn;
  }


  public GetRecommendationsRequest filterValues(Map<String, String> filterValues) {
    this.filterValues = filterValues;
    return this;
  }

  public GetRecommendationsRequest putFilterValuesItem(String key, String filterValuesItem) {
    if (this.filterValues == null) {
      this.filterValues = new HashMap<>();
    }
    this.filterValues.put(key, filterValuesItem);
    return this;
  }

  /**
   * &lt;p&gt;The values to use when filtering recommendations. For each placeholder parameter in your filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma. &lt;/p&gt; &lt;p&gt;For filter expressions that use an &lt;code&gt;INCLUDE&lt;/code&gt; element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an &lt;code&gt;EXCLUDE&lt;/code&gt; element to exclude items, you can omit the &lt;code&gt;filter-values&lt;/code&gt;.In this case, Amazon Personalize doesn&#39;t use that portion of the expression to filter recommendations.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/personalize/latest/dg/filter.html\&quot;&gt;Filtering recommendations and user segments&lt;/a&gt;.&lt;/p&gt;
   * @return filterValues
   */
  @javax.annotation.Nullable
  public Map<String, String> getFilterValues() {
    return filterValues;
  }

  public void setFilterValues(Map<String, String> filterValues) {
    this.filterValues = filterValues;
  }


  public GetRecommendationsRequest recommenderArn(String recommenderArn) {
    this.recommenderArn = recommenderArn;
    return this;
  }

  /**
   * The Amazon Resource Name (ARN) of the recommender to use to get recommendations. Provide a recommender ARN if you created a Domain dataset group with a recommender for a domain use case.
   * @return recommenderArn
   */
  @javax.annotation.Nullable
  public String getRecommenderArn() {
    return recommenderArn;
  }

  public void setRecommenderArn(String recommenderArn) {
    this.recommenderArn = recommenderArn;
  }


  public GetRecommendationsRequest promotions(List<Promotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  public GetRecommendationsRequest addPromotionsItem(Promotion promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

  /**
   * The promotions to apply to the recommendation request. A promotion defines additional business rules that apply to a configurable subset of recommended items.
   * @return promotions
   */
  @javax.annotation.Nullable
  public List<Promotion> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<Promotion> promotions) {
    this.promotions = promotions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecommendationsRequest getRecommendationsRequest = (GetRecommendationsRequest) o;
    return Objects.equals(this.campaignArn, getRecommendationsRequest.campaignArn) &&
        Objects.equals(this.itemId, getRecommendationsRequest.itemId) &&
        Objects.equals(this.userId, getRecommendationsRequest.userId) &&
        Objects.equals(this.numResults, getRecommendationsRequest.numResults) &&
        Objects.equals(this.context, getRecommendationsRequest.context) &&
        Objects.equals(this.filterArn, getRecommendationsRequest.filterArn) &&
        Objects.equals(this.filterValues, getRecommendationsRequest.filterValues) &&
        Objects.equals(this.recommenderArn, getRecommendationsRequest.recommenderArn) &&
        Objects.equals(this.promotions, getRecommendationsRequest.promotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignArn, itemId, userId, numResults, context, filterArn, filterValues, recommenderArn, promotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecommendationsRequest {\n");
    sb.append("    campaignArn: ").append(toIndentedString(campaignArn)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    filterArn: ").append(toIndentedString(filterArn)).append("\n");
    sb.append("    filterValues: ").append(toIndentedString(filterValues)).append("\n");
    sb.append("    recommenderArn: ").append(toIndentedString(recommenderArn)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
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
    openapiFields.add("campaignArn");
    openapiFields.add("itemId");
    openapiFields.add("userId");
    openapiFields.add("numResults");
    openapiFields.add("context");
    openapiFields.add("filterArn");
    openapiFields.add("filterValues");
    openapiFields.add("recommenderArn");
    openapiFields.add("promotions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRecommendationsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecommendationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecommendationsRequest is not found in the empty JSON string", GetRecommendationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecommendationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecommendationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("campaignArn") != null && !jsonObj.get("campaignArn").isJsonNull()) && !jsonObj.get("campaignArn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignArn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignArn").toString()));
      }
      if ((jsonObj.get("itemId") != null && !jsonObj.get("itemId").isJsonNull()) && !jsonObj.get("itemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("filterArn") != null && !jsonObj.get("filterArn").isJsonNull()) && !jsonObj.get("filterArn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterArn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterArn").toString()));
      }
      if ((jsonObj.get("recommenderArn") != null && !jsonObj.get("recommenderArn").isJsonNull()) && !jsonObj.get("recommenderArn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommenderArn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommenderArn").toString()));
      }
      if (jsonObj.get("promotions") != null && !jsonObj.get("promotions").isJsonNull()) {
        JsonArray jsonArraypromotions = jsonObj.getAsJsonArray("promotions");
        if (jsonArraypromotions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("promotions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `promotions` to be an array in the JSON string but got `%s`", jsonObj.get("promotions").toString()));
          }

          // validate the optional field `promotions` (array)
          for (int i = 0; i < jsonArraypromotions.size(); i++) {
            Promotion.validateJsonElement(jsonArraypromotions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecommendationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecommendationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecommendationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecommendationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecommendationsRequest>() {
           @Override
           public void write(JsonWriter out, GetRecommendationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecommendationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRecommendationsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRecommendationsRequest
   * @throws IOException if the JSON string is invalid with respect to GetRecommendationsRequest
   */
  public static GetRecommendationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecommendationsRequest.class);
  }

  /**
   * Convert an instance of GetRecommendationsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

