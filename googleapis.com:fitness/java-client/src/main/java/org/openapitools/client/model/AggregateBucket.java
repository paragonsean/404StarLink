/*
 * Fitness API
 * The Fitness API for managing users' fitness tracking data.
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.client.model.Dataset;
import org.openapitools.client.model.Session;

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
 * AggregateBucket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:05.813979-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AggregateBucket {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private Integer activity;

  public static final String SERIALIZED_NAME_DATASET = "dataset";
  @SerializedName(SERIALIZED_NAME_DATASET)
  private List<Dataset> dataset = new ArrayList<>();

  public static final String SERIALIZED_NAME_END_TIME_MILLIS = "endTimeMillis";
  @SerializedName(SERIALIZED_NAME_END_TIME_MILLIS)
  private String endTimeMillis;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_START_TIME_MILLIS = "startTimeMillis";
  @SerializedName(SERIALIZED_NAME_START_TIME_MILLIS)
  private String startTimeMillis;

  /**
   * The type of a bucket signifies how the data aggregation is performed in the bucket.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    TIME("time"),
    
    SESSION("session"),
    
    ACTIVITY_TYPE("activityType"),
    
    ACTIVITY_SEGMENT("activitySegment");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public AggregateBucket() {
  }

  public AggregateBucket activity(Integer activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT
   * @return activity
   */
  @javax.annotation.Nullable
  public Integer getActivity() {
    return activity;
  }

  public void setActivity(Integer activity) {
    this.activity = activity;
  }


  public AggregateBucket dataset(List<Dataset> dataset) {
    this.dataset = dataset;
    return this;
  }

  public AggregateBucket addDatasetItem(Dataset datasetItem) {
    if (this.dataset == null) {
      this.dataset = new ArrayList<>();
    }
    this.dataset.add(datasetItem);
    return this;
  }

  /**
   * There will be one dataset per AggregateBy in the request.
   * @return dataset
   */
  @javax.annotation.Nullable
  public List<Dataset> getDataset() {
    return dataset;
  }

  public void setDataset(List<Dataset> dataset) {
    this.dataset = dataset;
  }


  public AggregateBucket endTimeMillis(String endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
    return this;
  }

  /**
   * The end time for the aggregated data, in milliseconds since epoch, inclusive.
   * @return endTimeMillis
   */
  @javax.annotation.Nullable
  public String getEndTimeMillis() {
    return endTimeMillis;
  }

  public void setEndTimeMillis(String endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
  }


  public AggregateBucket session(Session session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
   */
  @javax.annotation.Nullable
  public Session getSession() {
    return session;
  }

  public void setSession(Session session) {
    this.session = session;
  }


  public AggregateBucket startTimeMillis(String startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
  }

  /**
   * The start time for the aggregated data, in milliseconds since epoch, inclusive.
   * @return startTimeMillis
   */
  @javax.annotation.Nullable
  public String getStartTimeMillis() {
    return startTimeMillis;
  }

  public void setStartTimeMillis(String startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
  }


  public AggregateBucket type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of a bucket signifies how the data aggregation is performed in the bucket.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateBucket aggregateBucket = (AggregateBucket) o;
    return Objects.equals(this.activity, aggregateBucket.activity) &&
        Objects.equals(this.dataset, aggregateBucket.dataset) &&
        Objects.equals(this.endTimeMillis, aggregateBucket.endTimeMillis) &&
        Objects.equals(this.session, aggregateBucket.session) &&
        Objects.equals(this.startTimeMillis, aggregateBucket.startTimeMillis) &&
        Objects.equals(this.type, aggregateBucket.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, dataset, endTimeMillis, session, startTimeMillis, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateBucket {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    endTimeMillis: ").append(toIndentedString(endTimeMillis)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    startTimeMillis: ").append(toIndentedString(startTimeMillis)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("activity");
    openapiFields.add("dataset");
    openapiFields.add("endTimeMillis");
    openapiFields.add("session");
    openapiFields.add("startTimeMillis");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregateBucket
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregateBucket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregateBucket is not found in the empty JSON string", AggregateBucket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregateBucket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregateBucket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dataset") != null && !jsonObj.get("dataset").isJsonNull()) {
        JsonArray jsonArraydataset = jsonObj.getAsJsonArray("dataset");
        if (jsonArraydataset != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dataset").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dataset` to be an array in the JSON string but got `%s`", jsonObj.get("dataset").toString()));
          }

          // validate the optional field `dataset` (array)
          for (int i = 0; i < jsonArraydataset.size(); i++) {
            Dataset.validateJsonElement(jsonArraydataset.get(i));
          };
        }
      }
      if ((jsonObj.get("endTimeMillis") != null && !jsonObj.get("endTimeMillis").isJsonNull()) && !jsonObj.get("endTimeMillis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTimeMillis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTimeMillis").toString()));
      }
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        Session.validateJsonElement(jsonObj.get("session"));
      }
      if ((jsonObj.get("startTimeMillis") != null && !jsonObj.get("startTimeMillis").isJsonNull()) && !jsonObj.get("startTimeMillis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTimeMillis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTimeMillis").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregateBucket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregateBucket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregateBucket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregateBucket.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregateBucket>() {
           @Override
           public void write(JsonWriter out, AggregateBucket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregateBucket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregateBucket given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregateBucket
   * @throws IOException if the JSON string is invalid with respect to AggregateBucket
   */
  public static AggregateBucket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregateBucket.class);
  }

  /**
   * Convert an instance of AggregateBucket to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

