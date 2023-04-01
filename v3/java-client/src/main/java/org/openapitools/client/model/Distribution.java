/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
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
import org.openapitools.client.model.BucketOptions;
import org.openapitools.client.model.Exemplar;
import org.openapitools.client.model.Range;

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
 * Distribution contains summary statistics for a population of values. It optionally contains a histogram representing the distribution of those values across a set of buckets.The summary statistics are the count, mean, sum of the squared deviation from the mean, the minimum, and the maximum of the set of population of values. The histogram is based on a sequence of buckets and gives a count of values that fall into each bucket. The boundaries of the buckets are given either explicitly or by formulas for buckets of fixed or exponentially increasing widths.Although it is not forbidden, it is generally a bad idea to include non-finite values (infinities or NaNs) in the population of values, as this will render the mean and sum_of_squared_deviation fields meaningless.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Distribution {
  public static final String SERIALIZED_NAME_BUCKET_COUNTS = "bucketCounts";
  @SerializedName(SERIALIZED_NAME_BUCKET_COUNTS)
  private List<String> bucketCounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUCKET_OPTIONS = "bucketOptions";
  @SerializedName(SERIALIZED_NAME_BUCKET_OPTIONS)
  private BucketOptions bucketOptions;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_EXEMPLARS = "exemplars";
  @SerializedName(SERIALIZED_NAME_EXEMPLARS)
  private List<Exemplar> exemplars = new ArrayList<>();

  public static final String SERIALIZED_NAME_MEAN = "mean";
  @SerializedName(SERIALIZED_NAME_MEAN)
  private Double mean;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private Range range;

  public static final String SERIALIZED_NAME_SUM_OF_SQUARED_DEVIATION = "sumOfSquaredDeviation";
  @SerializedName(SERIALIZED_NAME_SUM_OF_SQUARED_DEVIATION)
  private Double sumOfSquaredDeviation;

  public Distribution() {
  }

  public Distribution bucketCounts(List<String> bucketCounts) {
    this.bucketCounts = bucketCounts;
    return this;
  }

  public Distribution addBucketCountsItem(String bucketCountsItem) {
    if (this.bucketCounts == null) {
      this.bucketCounts = new ArrayList<>();
    }
    this.bucketCounts.add(bucketCountsItem);
    return this;
  }

  /**
   * Required in the Cloud Monitoring API v3. The values for each bucket specified in bucket_options. The sum of the values in bucketCounts must equal the value in the count field of the Distribution object. The order of the bucket counts follows the numbering schemes described for the three bucket types. The underflow bucket has number 0; the finite buckets, if any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of bucket_counts must not be greater than N. If the size is less than N, then the remaining buckets are assigned values of zero.
   * @return bucketCounts
   */
  @javax.annotation.Nullable
  public List<String> getBucketCounts() {
    return bucketCounts;
  }

  public void setBucketCounts(List<String> bucketCounts) {
    this.bucketCounts = bucketCounts;
  }


  public Distribution bucketOptions(BucketOptions bucketOptions) {
    this.bucketOptions = bucketOptions;
    return this;
  }

  /**
   * Get bucketOptions
   * @return bucketOptions
   */
  @javax.annotation.Nullable
  public BucketOptions getBucketOptions() {
    return bucketOptions;
  }

  public void setBucketOptions(BucketOptions bucketOptions) {
    this.bucketOptions = bucketOptions;
  }


  public Distribution count(String count) {
    this.count = count;
    return this;
  }

  /**
   * The number of values in the population. Must be non-negative. This value must equal the sum of the values in bucket_counts if a histogram is provided.
   * @return count
   */
  @javax.annotation.Nullable
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }


  public Distribution exemplars(List<Exemplar> exemplars) {
    this.exemplars = exemplars;
    return this;
  }

  public Distribution addExemplarsItem(Exemplar exemplarsItem) {
    if (this.exemplars == null) {
      this.exemplars = new ArrayList<>();
    }
    this.exemplars.add(exemplarsItem);
    return this;
  }

  /**
   * Must be in increasing order of value field.
   * @return exemplars
   */
  @javax.annotation.Nullable
  public List<Exemplar> getExemplars() {
    return exemplars;
  }

  public void setExemplars(List<Exemplar> exemplars) {
    this.exemplars = exemplars;
  }


  public Distribution mean(Double mean) {
    this.mean = mean;
    return this;
  }

  /**
   * The arithmetic mean of the values in the population. If count is zero then this field must be zero.
   * @return mean
   */
  @javax.annotation.Nullable
  public Double getMean() {
    return mean;
  }

  public void setMean(Double mean) {
    this.mean = mean;
  }


  public Distribution range(Range range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
   */
  @javax.annotation.Nullable
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }


  public Distribution sumOfSquaredDeviation(Double sumOfSquaredDeviation) {
    this.sumOfSquaredDeviation = sumOfSquaredDeviation;
    return this;
  }

  /**
   * The sum of squared deviations from the mean of the values in the population. For values x_i this is: Sum[i&#x3D;1..n]((x_i - mean)^2) Knuth, \&quot;The Art of Computer Programming\&quot;, Vol. 2, page 232, 3rd edition describes Welford&#39;s method for accumulating this sum in one pass.If count is zero then this field must be zero.
   * @return sumOfSquaredDeviation
   */
  @javax.annotation.Nullable
  public Double getSumOfSquaredDeviation() {
    return sumOfSquaredDeviation;
  }

  public void setSumOfSquaredDeviation(Double sumOfSquaredDeviation) {
    this.sumOfSquaredDeviation = sumOfSquaredDeviation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.bucketCounts, distribution.bucketCounts) &&
        Objects.equals(this.bucketOptions, distribution.bucketOptions) &&
        Objects.equals(this.count, distribution.count) &&
        Objects.equals(this.exemplars, distribution.exemplars) &&
        Objects.equals(this.mean, distribution.mean) &&
        Objects.equals(this.range, distribution.range) &&
        Objects.equals(this.sumOfSquaredDeviation, distribution.sumOfSquaredDeviation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketCounts, bucketOptions, count, exemplars, mean, range, sumOfSquaredDeviation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    sb.append("    bucketCounts: ").append(toIndentedString(bucketCounts)).append("\n");
    sb.append("    bucketOptions: ").append(toIndentedString(bucketOptions)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    exemplars: ").append(toIndentedString(exemplars)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    sumOfSquaredDeviation: ").append(toIndentedString(sumOfSquaredDeviation)).append("\n");
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
    openapiFields.add("bucketCounts");
    openapiFields.add("bucketOptions");
    openapiFields.add("count");
    openapiFields.add("exemplars");
    openapiFields.add("mean");
    openapiFields.add("range");
    openapiFields.add("sumOfSquaredDeviation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Distribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Distribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Distribution is not found in the empty JSON string", Distribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Distribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Distribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("bucketCounts") != null && !jsonObj.get("bucketCounts").isJsonNull() && !jsonObj.get("bucketCounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucketCounts` to be an array in the JSON string but got `%s`", jsonObj.get("bucketCounts").toString()));
      }
      // validate the optional field `bucketOptions`
      if (jsonObj.get("bucketOptions") != null && !jsonObj.get("bucketOptions").isJsonNull()) {
        BucketOptions.validateJsonElement(jsonObj.get("bucketOptions"));
      }
      if ((jsonObj.get("count") != null && !jsonObj.get("count").isJsonNull()) && !jsonObj.get("count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count").toString()));
      }
      if (jsonObj.get("exemplars") != null && !jsonObj.get("exemplars").isJsonNull()) {
        JsonArray jsonArrayexemplars = jsonObj.getAsJsonArray("exemplars");
        if (jsonArrayexemplars != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exemplars").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exemplars` to be an array in the JSON string but got `%s`", jsonObj.get("exemplars").toString()));
          }

          // validate the optional field `exemplars` (array)
          for (int i = 0; i < jsonArrayexemplars.size(); i++) {
            Exemplar.validateJsonElement(jsonArrayexemplars.get(i));
          };
        }
      }
      // validate the optional field `range`
      if (jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) {
        Range.validateJsonElement(jsonObj.get("range"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Distribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Distribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Distribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Distribution.class));

       return (TypeAdapter<T>) new TypeAdapter<Distribution>() {
           @Override
           public void write(JsonWriter out, Distribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Distribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Distribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Distribution
   * @throws IOException if the JSON string is invalid with respect to Distribution
   */
  public static Distribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Distribution.class);
  }

  /**
   * Convert an instance of Distribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

