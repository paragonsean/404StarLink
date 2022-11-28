/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
 * UpdateFindingAggregatorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateFindingAggregatorResponse {
  public static final String SERIALIZED_NAME_FINDING_AGGREGATOR_ARN = "FindingAggregatorArn";
  @SerializedName(SERIALIZED_NAME_FINDING_AGGREGATOR_ARN)
  private String findingAggregatorArn;

  public static final String SERIALIZED_NAME_FINDING_AGGREGATION_REGION = "FindingAggregationRegion";
  @SerializedName(SERIALIZED_NAME_FINDING_AGGREGATION_REGION)
  private String findingAggregationRegion;

  public static final String SERIALIZED_NAME_REGION_LINKING_MODE = "RegionLinkingMode";
  @SerializedName(SERIALIZED_NAME_REGION_LINKING_MODE)
  private String regionLinkingMode;

  public static final String SERIALIZED_NAME_REGIONS = "Regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List regions;

  public UpdateFindingAggregatorResponse() {
  }

  public UpdateFindingAggregatorResponse findingAggregatorArn(String findingAggregatorArn) {
    this.findingAggregatorArn = findingAggregatorArn;
    return this;
  }

  /**
   * Get findingAggregatorArn
   * @return findingAggregatorArn
   */
  @javax.annotation.Nullable
  public String getFindingAggregatorArn() {
    return findingAggregatorArn;
  }

  public void setFindingAggregatorArn(String findingAggregatorArn) {
    this.findingAggregatorArn = findingAggregatorArn;
  }


  public UpdateFindingAggregatorResponse findingAggregationRegion(String findingAggregationRegion) {
    this.findingAggregationRegion = findingAggregationRegion;
    return this;
  }

  /**
   * Get findingAggregationRegion
   * @return findingAggregationRegion
   */
  @javax.annotation.Nullable
  public String getFindingAggregationRegion() {
    return findingAggregationRegion;
  }

  public void setFindingAggregationRegion(String findingAggregationRegion) {
    this.findingAggregationRegion = findingAggregationRegion;
  }


  public UpdateFindingAggregatorResponse regionLinkingMode(String regionLinkingMode) {
    this.regionLinkingMode = regionLinkingMode;
    return this;
  }

  /**
   * Get regionLinkingMode
   * @return regionLinkingMode
   */
  @javax.annotation.Nullable
  public String getRegionLinkingMode() {
    return regionLinkingMode;
  }

  public void setRegionLinkingMode(String regionLinkingMode) {
    this.regionLinkingMode = regionLinkingMode;
  }


  public UpdateFindingAggregatorResponse regions(List regions) {
    this.regions = regions;
    return this;
  }

  /**
   * Get regions
   * @return regions
   */
  @javax.annotation.Nullable
  public List getRegions() {
    return regions;
  }

  public void setRegions(List regions) {
    this.regions = regions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFindingAggregatorResponse updateFindingAggregatorResponse = (UpdateFindingAggregatorResponse) o;
    return Objects.equals(this.findingAggregatorArn, updateFindingAggregatorResponse.findingAggregatorArn) &&
        Objects.equals(this.findingAggregationRegion, updateFindingAggregatorResponse.findingAggregationRegion) &&
        Objects.equals(this.regionLinkingMode, updateFindingAggregatorResponse.regionLinkingMode) &&
        Objects.equals(this.regions, updateFindingAggregatorResponse.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findingAggregatorArn, findingAggregationRegion, regionLinkingMode, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFindingAggregatorResponse {\n");
    sb.append("    findingAggregatorArn: ").append(toIndentedString(findingAggregatorArn)).append("\n");
    sb.append("    findingAggregationRegion: ").append(toIndentedString(findingAggregationRegion)).append("\n");
    sb.append("    regionLinkingMode: ").append(toIndentedString(regionLinkingMode)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
    openapiFields.add("FindingAggregatorArn");
    openapiFields.add("FindingAggregationRegion");
    openapiFields.add("RegionLinkingMode");
    openapiFields.add("Regions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateFindingAggregatorResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFindingAggregatorResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFindingAggregatorResponse is not found in the empty JSON string", UpdateFindingAggregatorResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFindingAggregatorResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFindingAggregatorResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `FindingAggregatorArn`
      if (jsonObj.get("FindingAggregatorArn") != null && !jsonObj.get("FindingAggregatorArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FindingAggregatorArn"));
      }
      // validate the optional field `FindingAggregationRegion`
      if (jsonObj.get("FindingAggregationRegion") != null && !jsonObj.get("FindingAggregationRegion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FindingAggregationRegion"));
      }
      // validate the optional field `RegionLinkingMode`
      if (jsonObj.get("RegionLinkingMode") != null && !jsonObj.get("RegionLinkingMode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RegionLinkingMode"));
      }
      // validate the optional field `Regions`
      if (jsonObj.get("Regions") != null && !jsonObj.get("Regions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Regions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFindingAggregatorResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFindingAggregatorResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFindingAggregatorResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFindingAggregatorResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFindingAggregatorResponse>() {
           @Override
           public void write(JsonWriter out, UpdateFindingAggregatorResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFindingAggregatorResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateFindingAggregatorResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateFindingAggregatorResponse
   * @throws IOException if the JSON string is invalid with respect to UpdateFindingAggregatorResponse
   */
  public static UpdateFindingAggregatorResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFindingAggregatorResponse.class);
  }

  /**
   * Convert an instance of UpdateFindingAggregatorResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

