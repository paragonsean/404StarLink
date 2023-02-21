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
import java.util.Arrays;
import org.openapitools.client.model.Explicit;
import org.openapitools.client.model.Exponential;
import org.openapitools.client.model.Linear;

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
 * BucketOptions describes the bucket boundaries used to create a histogram for the distribution. The buckets can be in a linear sequence, an exponential sequence, or each bucket can be specified explicitly. BucketOptions does not include the number of values in each bucket.A bucket has an inclusive lower bound and exclusive upper bound for the values that are counted for that bucket. The upper bound of a bucket must be strictly greater than the lower bound. The sequence of N buckets for a distribution consists of an underflow bucket (number 0), zero or more finite buckets (number 1 through N - 2) and an overflow bucket (number N - 1). The buckets are contiguous: the lower bound of bucket i (i &gt; 0) is the same as the upper bound of bucket i - 1. The buckets span the whole range of finite values: lower bound of the underflow bucket is -infinity and the upper bound of the overflow bucket is +infinity. The finite buckets are so-called because both bounds are finite.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:22.830819-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BucketOptions {
  public static final String SERIALIZED_NAME_EXPLICIT_BUCKETS = "explicitBuckets";
  @SerializedName(SERIALIZED_NAME_EXPLICIT_BUCKETS)
  private Explicit explicitBuckets;

  public static final String SERIALIZED_NAME_EXPONENTIAL_BUCKETS = "exponentialBuckets";
  @SerializedName(SERIALIZED_NAME_EXPONENTIAL_BUCKETS)
  private Exponential exponentialBuckets;

  public static final String SERIALIZED_NAME_LINEAR_BUCKETS = "linearBuckets";
  @SerializedName(SERIALIZED_NAME_LINEAR_BUCKETS)
  private Linear linearBuckets;

  public BucketOptions() {
  }

  public BucketOptions explicitBuckets(Explicit explicitBuckets) {
    this.explicitBuckets = explicitBuckets;
    return this;
  }

  /**
   * Get explicitBuckets
   * @return explicitBuckets
   */
  @javax.annotation.Nullable
  public Explicit getExplicitBuckets() {
    return explicitBuckets;
  }

  public void setExplicitBuckets(Explicit explicitBuckets) {
    this.explicitBuckets = explicitBuckets;
  }


  public BucketOptions exponentialBuckets(Exponential exponentialBuckets) {
    this.exponentialBuckets = exponentialBuckets;
    return this;
  }

  /**
   * Get exponentialBuckets
   * @return exponentialBuckets
   */
  @javax.annotation.Nullable
  public Exponential getExponentialBuckets() {
    return exponentialBuckets;
  }

  public void setExponentialBuckets(Exponential exponentialBuckets) {
    this.exponentialBuckets = exponentialBuckets;
  }


  public BucketOptions linearBuckets(Linear linearBuckets) {
    this.linearBuckets = linearBuckets;
    return this;
  }

  /**
   * Get linearBuckets
   * @return linearBuckets
   */
  @javax.annotation.Nullable
  public Linear getLinearBuckets() {
    return linearBuckets;
  }

  public void setLinearBuckets(Linear linearBuckets) {
    this.linearBuckets = linearBuckets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketOptions bucketOptions = (BucketOptions) o;
    return Objects.equals(this.explicitBuckets, bucketOptions.explicitBuckets) &&
        Objects.equals(this.exponentialBuckets, bucketOptions.exponentialBuckets) &&
        Objects.equals(this.linearBuckets, bucketOptions.linearBuckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explicitBuckets, exponentialBuckets, linearBuckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketOptions {\n");
    sb.append("    explicitBuckets: ").append(toIndentedString(explicitBuckets)).append("\n");
    sb.append("    exponentialBuckets: ").append(toIndentedString(exponentialBuckets)).append("\n");
    sb.append("    linearBuckets: ").append(toIndentedString(linearBuckets)).append("\n");
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
    openapiFields.add("explicitBuckets");
    openapiFields.add("exponentialBuckets");
    openapiFields.add("linearBuckets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BucketOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BucketOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BucketOptions is not found in the empty JSON string", BucketOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BucketOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BucketOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `explicitBuckets`
      if (jsonObj.get("explicitBuckets") != null && !jsonObj.get("explicitBuckets").isJsonNull()) {
        Explicit.validateJsonElement(jsonObj.get("explicitBuckets"));
      }
      // validate the optional field `exponentialBuckets`
      if (jsonObj.get("exponentialBuckets") != null && !jsonObj.get("exponentialBuckets").isJsonNull()) {
        Exponential.validateJsonElement(jsonObj.get("exponentialBuckets"));
      }
      // validate the optional field `linearBuckets`
      if (jsonObj.get("linearBuckets") != null && !jsonObj.get("linearBuckets").isJsonNull()) {
        Linear.validateJsonElement(jsonObj.get("linearBuckets"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BucketOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BucketOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BucketOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BucketOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<BucketOptions>() {
           @Override
           public void write(JsonWriter out, BucketOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BucketOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BucketOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BucketOptions
   * @throws IOException if the JSON string is invalid with respect to BucketOptions
   */
  public static BucketOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BucketOptions.class);
  }

  /**
   * Convert an instance of BucketOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

