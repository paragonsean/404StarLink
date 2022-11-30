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
import java.util.ArrayList;
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
 * CreateFindingAggregatorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateFindingAggregatorRequest {
  public static final String SERIALIZED_NAME_REGION_LINKING_MODE = "RegionLinkingMode";
  @SerializedName(SERIALIZED_NAME_REGION_LINKING_MODE)
  private String regionLinkingMode;

  public static final String SERIALIZED_NAME_REGIONS = "Regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<String> regions = new ArrayList<>();

  public CreateFindingAggregatorRequest() {
  }

  public CreateFindingAggregatorRequest regionLinkingMode(String regionLinkingMode) {
    this.regionLinkingMode = regionLinkingMode;
    return this;
  }

  /**
   * &lt;p&gt;Indicates whether to aggregate findings from all of the available Regions in the current partition. Also determines whether to automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.&lt;/p&gt; &lt;p&gt;The selected option also determines how to use the Regions provided in the Regions list.&lt;/p&gt; &lt;p&gt;The options are as follows:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALL_REGIONS&lt;/code&gt; - Indicates to aggregate findings from all of the Regions where Security Hub is enabled. When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them and you opt into them. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALL_REGIONS_EXCEPT_SPECIFIED&lt;/code&gt; - Indicates to aggregate findings from all of the Regions where Security Hub is enabled, except for the Regions listed in the &lt;code&gt;Regions&lt;/code&gt; parameter. When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them and you opt into them. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;SPECIFIED_REGIONS&lt;/code&gt; - Indicates to aggregate findings only from the Regions listed in the &lt;code&gt;Regions&lt;/code&gt; parameter. Security Hub does not automatically aggregate findings from new Regions. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @return regionLinkingMode
   */
  @javax.annotation.Nonnull
  public String getRegionLinkingMode() {
    return regionLinkingMode;
  }

  public void setRegionLinkingMode(String regionLinkingMode) {
    this.regionLinkingMode = regionLinkingMode;
  }


  public CreateFindingAggregatorRequest regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public CreateFindingAggregatorRequest addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * &lt;p&gt;If &lt;code&gt;RegionLinkingMode&lt;/code&gt; is &lt;code&gt;ALL_REGIONS_EXCEPT_SPECIFIED&lt;/code&gt;, then this is a space-separated list of Regions that do not aggregate findings to the aggregation Region.&lt;/p&gt; &lt;p&gt;If &lt;code&gt;RegionLinkingMode&lt;/code&gt; is &lt;code&gt;SPECIFIED_REGIONS&lt;/code&gt;, then this is a space-separated list of Regions that do aggregate findings to the aggregation Region. &lt;/p&gt;
   * @return regions
   */
  @javax.annotation.Nullable
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
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
    CreateFindingAggregatorRequest createFindingAggregatorRequest = (CreateFindingAggregatorRequest) o;
    return Objects.equals(this.regionLinkingMode, createFindingAggregatorRequest.regionLinkingMode) &&
        Objects.equals(this.regions, createFindingAggregatorRequest.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionLinkingMode, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFindingAggregatorRequest {\n");
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
    openapiFields.add("RegionLinkingMode");
    openapiFields.add("Regions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RegionLinkingMode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFindingAggregatorRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFindingAggregatorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFindingAggregatorRequest is not found in the empty JSON string", CreateFindingAggregatorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFindingAggregatorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFindingAggregatorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFindingAggregatorRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("RegionLinkingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RegionLinkingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RegionLinkingMode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Regions") != null && !jsonObj.get("Regions").isJsonNull() && !jsonObj.get("Regions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Regions` to be an array in the JSON string but got `%s`", jsonObj.get("Regions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFindingAggregatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFindingAggregatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFindingAggregatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFindingAggregatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFindingAggregatorRequest>() {
           @Override
           public void write(JsonWriter out, CreateFindingAggregatorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFindingAggregatorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateFindingAggregatorRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFindingAggregatorRequest
   * @throws IOException if the JSON string is invalid with respect to CreateFindingAggregatorRequest
   */
  public static CreateFindingAggregatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFindingAggregatorRequest.class);
  }

  /**
   * Convert an instance of CreateFindingAggregatorRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

