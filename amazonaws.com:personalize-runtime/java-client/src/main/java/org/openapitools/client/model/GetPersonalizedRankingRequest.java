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
 * GetPersonalizedRankingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:55.811291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetPersonalizedRankingRequest {
  public static final String SERIALIZED_NAME_CAMPAIGN_ARN = "campaignArn";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ARN)
  private String campaignArn;

  public static final String SERIALIZED_NAME_INPUT_LIST = "inputList";
  @SerializedName(SERIALIZED_NAME_INPUT_LIST)
  private List<String> inputList = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Map<String, String> context = new HashMap<>();

  public static final String SERIALIZED_NAME_FILTER_ARN = "filterArn";
  @SerializedName(SERIALIZED_NAME_FILTER_ARN)
  private String filterArn;

  public static final String SERIALIZED_NAME_FILTER_VALUES = "filterValues";
  @SerializedName(SERIALIZED_NAME_FILTER_VALUES)
  private Map<String, String> filterValues = new HashMap<>();

  public GetPersonalizedRankingRequest() {
  }

  public GetPersonalizedRankingRequest campaignArn(String campaignArn) {
    this.campaignArn = campaignArn;
    return this;
  }

  /**
   * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
   * @return campaignArn
   */
  @javax.annotation.Nonnull
  public String getCampaignArn() {
    return campaignArn;
  }

  public void setCampaignArn(String campaignArn) {
    this.campaignArn = campaignArn;
  }


  public GetPersonalizedRankingRequest inputList(List<String> inputList) {
    this.inputList = inputList;
    return this;
  }

  public GetPersonalizedRankingRequest addInputListItem(String inputListItem) {
    if (this.inputList == null) {
      this.inputList = new ArrayList<>();
    }
    this.inputList.add(inputListItem);
    return this;
  }

  /**
   * A list of items (by &lt;code&gt;itemId&lt;/code&gt;) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.
   * @return inputList
   */
  @javax.annotation.Nonnull
  public List<String> getInputList() {
    return inputList;
  }

  public void setInputList(List<String> inputList) {
    this.inputList = inputList;
  }


  public GetPersonalizedRankingRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user for which you want the campaign to provide a personalized ranking.
   * @return userId
   */
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetPersonalizedRankingRequest context(Map<String, String> context) {
    this.context = context;
    return this;
  }

  public GetPersonalizedRankingRequest putContextItem(String key, String contextItem) {
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


  public GetPersonalizedRankingRequest filterArn(String filterArn) {
    this.filterArn = filterArn;
    return this;
  }

  /**
   * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for a given user. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/personalize/latest/dg/filter.html\&quot;&gt;Filtering Recommendations&lt;/a&gt;.
   * @return filterArn
   */
  @javax.annotation.Nullable
  public String getFilterArn() {
    return filterArn;
  }

  public void setFilterArn(String filterArn) {
    this.filterArn = filterArn;
  }


  public GetPersonalizedRankingRequest filterValues(Map<String, String> filterValues) {
    this.filterValues = filterValues;
    return this;
  }

  public GetPersonalizedRankingRequest putFilterValuesItem(String key, String filterValuesItem) {
    if (this.filterValues == null) {
      this.filterValues = new HashMap<>();
    }
    this.filterValues.put(key, filterValuesItem);
    return this;
  }

  /**
   * &lt;p&gt;The values to use when filtering recommendations. For each placeholder parameter in your filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma. &lt;/p&gt; &lt;p&gt;For filter expressions that use an &lt;code&gt;INCLUDE&lt;/code&gt; element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an &lt;code&gt;EXCLUDE&lt;/code&gt; element to exclude items, you can omit the &lt;code&gt;filter-values&lt;/code&gt;.In this case, Amazon Personalize doesn&#39;t use that portion of the expression to filter recommendations.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/personalize/latest/dg/filter.html\&quot;&gt;Filtering Recommendations&lt;/a&gt;.&lt;/p&gt;
   * @return filterValues
   */
  @javax.annotation.Nullable
  public Map<String, String> getFilterValues() {
    return filterValues;
  }

  public void setFilterValues(Map<String, String> filterValues) {
    this.filterValues = filterValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPersonalizedRankingRequest getPersonalizedRankingRequest = (GetPersonalizedRankingRequest) o;
    return Objects.equals(this.campaignArn, getPersonalizedRankingRequest.campaignArn) &&
        Objects.equals(this.inputList, getPersonalizedRankingRequest.inputList) &&
        Objects.equals(this.userId, getPersonalizedRankingRequest.userId) &&
        Objects.equals(this.context, getPersonalizedRankingRequest.context) &&
        Objects.equals(this.filterArn, getPersonalizedRankingRequest.filterArn) &&
        Objects.equals(this.filterValues, getPersonalizedRankingRequest.filterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignArn, inputList, userId, context, filterArn, filterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPersonalizedRankingRequest {\n");
    sb.append("    campaignArn: ").append(toIndentedString(campaignArn)).append("\n");
    sb.append("    inputList: ").append(toIndentedString(inputList)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    filterArn: ").append(toIndentedString(filterArn)).append("\n");
    sb.append("    filterValues: ").append(toIndentedString(filterValues)).append("\n");
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
    openapiFields.add("inputList");
    openapiFields.add("userId");
    openapiFields.add("context");
    openapiFields.add("filterArn");
    openapiFields.add("filterValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("campaignArn");
    openapiRequiredFields.add("inputList");
    openapiRequiredFields.add("userId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPersonalizedRankingRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPersonalizedRankingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPersonalizedRankingRequest is not found in the empty JSON string", GetPersonalizedRankingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPersonalizedRankingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPersonalizedRankingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPersonalizedRankingRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("campaignArn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignArn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignArn").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("inputList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("inputList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputList` to be an array in the JSON string but got `%s`", jsonObj.get("inputList").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("filterArn") != null && !jsonObj.get("filterArn").isJsonNull()) && !jsonObj.get("filterArn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterArn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterArn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPersonalizedRankingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPersonalizedRankingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPersonalizedRankingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPersonalizedRankingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPersonalizedRankingRequest>() {
           @Override
           public void write(JsonWriter out, GetPersonalizedRankingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPersonalizedRankingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPersonalizedRankingRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPersonalizedRankingRequest
   * @throws IOException if the JSON string is invalid with respect to GetPersonalizedRankingRequest
   */
  public static GetPersonalizedRankingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPersonalizedRankingRequest.class);
  }

  /**
   * Convert an instance of GetPersonalizedRankingRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

