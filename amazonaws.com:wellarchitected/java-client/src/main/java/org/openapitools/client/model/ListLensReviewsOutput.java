/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
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
import org.openapitools.client.model.LensReviewSummary;

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
 * Output of a list lens reviews call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:47.577947-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListLensReviewsOutput {
  public static final String SERIALIZED_NAME_WORKLOAD_ID = "WorkloadId";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_ID)
  private String workloadId;

  public static final String SERIALIZED_NAME_MILESTONE_NUMBER = "MilestoneNumber";
  @SerializedName(SERIALIZED_NAME_MILESTONE_NUMBER)
  private Integer milestoneNumber;

  public static final String SERIALIZED_NAME_LENS_REVIEW_SUMMARIES = "LensReviewSummaries";
  @SerializedName(SERIALIZED_NAME_LENS_REVIEW_SUMMARIES)
  private List<LensReviewSummary> lensReviewSummaries = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListLensReviewsOutput() {
  }

  public ListLensReviewsOutput workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * The ID assigned to the workload. This ID is unique within an Amazon Web Services Region.
   * @return workloadId
   */
  @javax.annotation.Nullable
  public String getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }


  public ListLensReviewsOutput milestoneNumber(Integer milestoneNumber) {
    this.milestoneNumber = milestoneNumber;
    return this;
  }

  /**
   * &lt;p&gt;The milestone number.&lt;/p&gt; &lt;p&gt;A workload can have a maximum of 100 milestones.&lt;/p&gt;
   * minimum: 1
   * maximum: 100
   * @return milestoneNumber
   */
  @javax.annotation.Nullable
  public Integer getMilestoneNumber() {
    return milestoneNumber;
  }

  public void setMilestoneNumber(Integer milestoneNumber) {
    this.milestoneNumber = milestoneNumber;
  }


  public ListLensReviewsOutput lensReviewSummaries(List<LensReviewSummary> lensReviewSummaries) {
    this.lensReviewSummaries = lensReviewSummaries;
    return this;
  }

  public ListLensReviewsOutput addLensReviewSummariesItem(LensReviewSummary lensReviewSummariesItem) {
    if (this.lensReviewSummaries == null) {
      this.lensReviewSummaries = new ArrayList<>();
    }
    this.lensReviewSummaries.add(lensReviewSummariesItem);
    return this;
  }

  /**
   * List of lens summaries of lens reviews of a workload.
   * @return lensReviewSummaries
   */
  @javax.annotation.Nullable
  public List<LensReviewSummary> getLensReviewSummaries() {
    return lensReviewSummaries;
  }

  public void setLensReviewSummaries(List<LensReviewSummary> lensReviewSummaries) {
    this.lensReviewSummaries = lensReviewSummaries;
  }


  public ListLensReviewsOutput nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * The token to use to retrieve the next set of results.
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLensReviewsOutput listLensReviewsOutput = (ListLensReviewsOutput) o;
    return Objects.equals(this.workloadId, listLensReviewsOutput.workloadId) &&
        Objects.equals(this.milestoneNumber, listLensReviewsOutput.milestoneNumber) &&
        Objects.equals(this.lensReviewSummaries, listLensReviewsOutput.lensReviewSummaries) &&
        Objects.equals(this.nextToken, listLensReviewsOutput.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadId, milestoneNumber, lensReviewSummaries, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLensReviewsOutput {\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    milestoneNumber: ").append(toIndentedString(milestoneNumber)).append("\n");
    sb.append("    lensReviewSummaries: ").append(toIndentedString(lensReviewSummaries)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("WorkloadId");
    openapiFields.add("MilestoneNumber");
    openapiFields.add("LensReviewSummaries");
    openapiFields.add("NextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListLensReviewsOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListLensReviewsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListLensReviewsOutput is not found in the empty JSON string", ListLensReviewsOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListLensReviewsOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListLensReviewsOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("WorkloadId") != null && !jsonObj.get("WorkloadId").isJsonNull()) && !jsonObj.get("WorkloadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadId").toString()));
      }
      if (jsonObj.get("LensReviewSummaries") != null && !jsonObj.get("LensReviewSummaries").isJsonNull()) {
        JsonArray jsonArraylensReviewSummaries = jsonObj.getAsJsonArray("LensReviewSummaries");
        if (jsonArraylensReviewSummaries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("LensReviewSummaries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `LensReviewSummaries` to be an array in the JSON string but got `%s`", jsonObj.get("LensReviewSummaries").toString()));
          }

          // validate the optional field `LensReviewSummaries` (array)
          for (int i = 0; i < jsonArraylensReviewSummaries.size(); i++) {
            LensReviewSummary.validateJsonElement(jsonArraylensReviewSummaries.get(i));
          };
        }
      }
      if ((jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) && !jsonObj.get("NextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NextToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListLensReviewsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListLensReviewsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListLensReviewsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListLensReviewsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListLensReviewsOutput>() {
           @Override
           public void write(JsonWriter out, ListLensReviewsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListLensReviewsOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListLensReviewsOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListLensReviewsOutput
   * @throws IOException if the JSON string is invalid with respect to ListLensReviewsOutput
   */
  public static ListLensReviewsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListLensReviewsOutput.class);
  }

  /**
   * Convert an instance of ListLensReviewsOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

