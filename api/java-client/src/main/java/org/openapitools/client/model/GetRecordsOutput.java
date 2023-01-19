/*
 * Amazon DynamoDB Streams
 * <fullname>Amazon DynamoDB</fullname> <p>Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about application development with Streams, see <a href=\"https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html\">Capturing Table Activity with DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.</p>
 *
 * The version of the OpenAPI document: 2012-08-10
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
 * Represents the output of a &lt;code&gt;GetRecords&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:33.390334-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRecordsOutput {
  public static final String SERIALIZED_NAME_RECORDS = "Records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List records;

  public static final String SERIALIZED_NAME_NEXT_SHARD_ITERATOR = "NextShardIterator";
  @SerializedName(SERIALIZED_NAME_NEXT_SHARD_ITERATOR)
  private String nextShardIterator;

  public GetRecordsOutput() {
  }

  public GetRecordsOutput records(List records) {
    this.records = records;
    return this;
  }

  /**
   * Get records
   * @return records
   */
  @javax.annotation.Nullable
  public List getRecords() {
    return records;
  }

  public void setRecords(List records) {
    this.records = records;
  }


  public GetRecordsOutput nextShardIterator(String nextShardIterator) {
    this.nextShardIterator = nextShardIterator;
    return this;
  }

  /**
   * Get nextShardIterator
   * @return nextShardIterator
   */
  @javax.annotation.Nullable
  public String getNextShardIterator() {
    return nextShardIterator;
  }

  public void setNextShardIterator(String nextShardIterator) {
    this.nextShardIterator = nextShardIterator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecordsOutput getRecordsOutput = (GetRecordsOutput) o;
    return Objects.equals(this.records, getRecordsOutput.records) &&
        Objects.equals(this.nextShardIterator, getRecordsOutput.nextShardIterator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records, nextShardIterator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecordsOutput {\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    nextShardIterator: ").append(toIndentedString(nextShardIterator)).append("\n");
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
    openapiFields.add("Records");
    openapiFields.add("NextShardIterator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRecordsOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecordsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecordsOutput is not found in the empty JSON string", GetRecordsOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecordsOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecordsOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Records`
      if (jsonObj.get("Records") != null && !jsonObj.get("Records").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Records"));
      }
      // validate the optional field `NextShardIterator`
      if (jsonObj.get("NextShardIterator") != null && !jsonObj.get("NextShardIterator").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextShardIterator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecordsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecordsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecordsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecordsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecordsOutput>() {
           @Override
           public void write(JsonWriter out, GetRecordsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecordsOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRecordsOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRecordsOutput
   * @throws IOException if the JSON string is invalid with respect to GetRecordsOutput
   */
  public static GetRecordsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecordsOutput.class);
  }

  /**
   * Convert an instance of GetRecordsOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

