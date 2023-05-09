/*
 * Fitbit Plus API
 * # Overview The Fitbit Plus API is a RESTful API. The requests and responses are formated according to the [JSON API](http://jsonapi.org/format/1.0/) specification.  In addition to this documentation, we also provide an [OpenAPI](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) \"yaml\" file describing the API: [Fitbit Plus API Specification](swagger.yaml).  # Authentication Authentication for the Fitbit Plus API is based on the [OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749). Fitbit Plus currently supports grant types of **client_credentials** and **refresh_token**.  See [POST /oauth/token](#operation/createToken) for details on the request and response formats. <!-- ReDoc-Inject: <security-definitions> -->  ## Building Integrations We will provide customers with unique client credentials for each application/integration they build, allowing us to enforce appropriate access controls and monitor API usage. The client credentials will be scoped to the organization, and allow full access to all patients and related data within that organization.  These credentials are appropriate for creating an integration that does one of the following:  - background reporting/analysis  - synchronizing data with another system (such as an EMR)  The API credentials and oauth flows we currently support are **not** well suited for creating a user-facing application that allows a user (patient, coach, or admin) to login and have access to data which is appropriate to that specific user. It is possible to build such an application, but it is not possible to use Fitbit Plus as a federated identity provider. You would need to have a separate means of verifying a user's identity. We do not currently support the required password-based oauth flow to make this possible.  # Paging The Fitbit Plus API supports two different pagination strategies for GET collection endpoints.  #### Skip-based paging  Skip-based paging uses the query parameters `page[size]` and `page[number]` to specify the max number of resources returned and the page number. We default to skip-based paging if there are no page parameters. The response will include a `links` object containing links to the first, last, prev, and next pages of data.  If the contents of the collection change while you are iterating through the collection, you will see duplicate or missing documents. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=1`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=2`, the first entry in the second response will be a duplicate of the last entry in the first response.  #### Cursor-based paging Cursor-based paging uses the query parameters `page[limit]` and `page[after]` to specify the max number of entries returned and identify where to begin the next page. Add `page[limit]` to the parameters to use cursor-based paging. The response will include a `links` object containing a link to the next page of data, if the next page exists.  Cursor-based paging is not subject to duplication if new resources are added to the collection. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[limit]=50`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, you will not see a duplicate entry when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[limit]=50&page[after]=<cursor>`.  We encourage the use of cursor-based paging for performance reasons.  In either form of paging, you can determine whether any resources were missed by comparing the number of fetched resources against `meta.count`. Set `page[size]` or `page[limit]` to 0 to get only the count.  It is not valid to mix the two strategies. 
 *
 * The version of the OpenAPI document: v7.78.1
 * Contact: apiteam@twinehealth.com
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
import org.openapitools.client.model.PatientHealthResultResourceAttributesAnnotationsInner;
import org.openapitools.client.model.PatientHealthResultResourceAttributesData;
import org.openapitools.client.model.PatientHealthResultResourceAttributesSource;

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
 * PatientHealthResultResourceAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:14.895652-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PatientHealthResultResourceAttributes {
  public static final String SERIALIZED_NAME_THREAD = "_thread";
  @SerializedName(SERIALIZED_NAME_THREAD)
  private String thread;

  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private String aggregation;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<PatientHealthResultResourceAttributesAnnotationsInner> annotations = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private PatientHealthResultResourceAttributesData data;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  /**
   * Gets or Sets metricType
   */
  @JsonAdapter(MetricTypeEnum.Adapter.class)
  public enum MetricTypeEnum {
    BLOOD_PRESSURE_SYSTOLIC("blood_pressure_systolic"),
    
    BLOOD_PRESSURE_DIASTOLIC("blood_pressure_diastolic"),
    
    HEMOGLOBIN_A1C("hemoglobin_a1c"),
    
    HDL_CHOLESTEROL("hdl_cholesterol"),
    
    LDL_CHOLESTEROL("ldl_cholesterol"),
    
    TOTAL_CHOLESTEROL("total_cholesterol"),
    
    TRIGLYCERIDES("triglycerides"),
    
    BLOOD_UREA_NITROGEN("blood_urea_nitrogen"),
    
    CREATININE("creatinine"),
    
    HEMOGLOBIN("hemoglobin"),
    
    HEMATOCRIT("hematocrit"),
    
    TOTAL_SERUM_IRON("total_serum_iron"),
    
    THYROID_STIMULATING_HORMONE("thyroid_stimulating_hormone"),
    
    FREE_THYROXINE("free_thyroxine"),
    
    FREE_TRIIODOTHYRONINE("free_triiodothyronine"),
    
    TOTAL_TRIIODOTHYRONINE("total_triiodothyronine"),
    
    CD4_CELL_COUNT("cd4_cell_count"),
    
    HIV_VIRAL_LOAD("hiv_viral_load"),
    
    INR("inr"),
    
    FREE_TESTOSTERONE("free_testosterone"),
    
    TOTAL_TESTOSTERONE("total_testosterone"),
    
    C_REACTIVE_PROTEIN("c_reactive_protein"),
    
    PROSTATE_SPECIFIC_ANTIGEN("prostate_specific_antigen"),
    
    COTININE("cotinine"),
    
    C_PEPTIDE("c_peptide"),
    
    BLOOD_PRESSURE("blood_pressure"),
    
    BLOOD_GLUCOSE("blood_glucose"),
    
    WEIGHT("weight"),
    
    HEART_RATE("heart_rate"),
    
    BODY_FAT_PERCENTAGE("body_fat_percentage"),
    
    BODY_MASS_INDEX("body_mass_index"),
    
    BODY_TEMPERATURE("body_temperature"),
    
    FORCED_EXPIRATORY_VOLUME1("forced_expiratory_volume1"),
    
    FORCED_VITAL_CAPACITY("forced_vital_capacity"),
    
    LEAN_BODY_MASS("lean_body_mass"),
    
    NAUSEA_LEVEL("nausea_level"),
    
    OXYGEN_SATURATION("oxygen_saturation"),
    
    PAIN_LEVEL("pain_level"),
    
    PEAK_EXPIRATORY_FLOW_RATE("peak_expiratory_flow_rate"),
    
    PERIPHERAL_PERFUSION_INDEX("peripheral_perfusion_index"),
    
    RESPIRATORY_RATE("respiratory_rate"),
    
    INHALER_USAGE("inhaler_usage");

    private String value;

    MetricTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetricTypeEnum fromValue(String value) {
      for (MetricTypeEnum b : MetricTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetricTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetricTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetricTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetricTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MetricTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_METRIC_TYPE = "metric_type";
  @SerializedName(SERIALIZED_NAME_METRIC_TYPE)
  private MetricTypeEnum metricType;

  public static final String SERIALIZED_NAME_OCCURRED_AT = "occurred_at";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT)
  private String occurredAt;

  public static final String SERIALIZED_NAME_OCCURRED_AT_TIME_ZONE = "occurred_at_time_zone";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT_TIME_ZONE)
  private String occurredAtTimeZone;

  public static final String SERIALIZED_NAME_SKIPPED = "skipped";
  @SerializedName(SERIALIZED_NAME_SKIPPED)
  private Boolean skipped;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private PatientHealthResultResourceAttributesSource source;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WINDOW = "window";
  @SerializedName(SERIALIZED_NAME_WINDOW)
  private String window;

  public PatientHealthResultResourceAttributes() {
  }

  public PatientHealthResultResourceAttributes thread(String thread) {
    this.thread = thread;
    return this;
  }

  /**
   * Links together results. This should be the same as the thread of _action, if it is defined
   * @return thread
   */
  @javax.annotation.Nullable
  public String getThread() {
    return thread;
  }

  public void setThread(String thread) {
    this.thread = thread;
  }


  public PatientHealthResultResourceAttributes aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Get aggregation
   * @return aggregation
   */
  @javax.annotation.Nullable
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }


  public PatientHealthResultResourceAttributes annotations(List<PatientHealthResultResourceAttributesAnnotationsInner> annotations) {
    this.annotations = annotations;
    return this;
  }

  public PatientHealthResultResourceAttributes addAnnotationsItem(PatientHealthResultResourceAttributesAnnotationsInner annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

  /**
   * Get annotations
   * @return annotations
   */
  @javax.annotation.Nullable
  public List<PatientHealthResultResourceAttributesAnnotationsInner> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<PatientHealthResultResourceAttributesAnnotationsInner> annotations) {
    this.annotations = annotations;
  }


  public PatientHealthResultResourceAttributes channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   */
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public PatientHealthResultResourceAttributes data(PatientHealthResultResourceAttributesData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public PatientHealthResultResourceAttributesData getData() {
    return data;
  }

  public void setData(PatientHealthResultResourceAttributesData data) {
    this.data = data;
  }


  public PatientHealthResultResourceAttributes externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public PatientHealthResultResourceAttributes metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }

  /**
   * Get metricType
   * @return metricType
   */
  @javax.annotation.Nullable
  public MetricTypeEnum getMetricType() {
    return metricType;
  }

  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }


  public PatientHealthResultResourceAttributes occurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Get occurredAt
   * @return occurredAt
   */
  @javax.annotation.Nullable
  public String getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
  }


  public PatientHealthResultResourceAttributes occurredAtTimeZone(String occurredAtTimeZone) {
    this.occurredAtTimeZone = occurredAtTimeZone;
    return this;
  }

  /**
   * Get occurredAtTimeZone
   * @return occurredAtTimeZone
   */
  @javax.annotation.Nullable
  public String getOccurredAtTimeZone() {
    return occurredAtTimeZone;
  }

  public void setOccurredAtTimeZone(String occurredAtTimeZone) {
    this.occurredAtTimeZone = occurredAtTimeZone;
  }


  public PatientHealthResultResourceAttributes skipped(Boolean skipped) {
    this.skipped = skipped;
    return this;
  }

  /**
   * Get skipped
   * @return skipped
   */
  @javax.annotation.Nullable
  public Boolean getSkipped() {
    return skipped;
  }

  public void setSkipped(Boolean skipped) {
    this.skipped = skipped;
  }


  public PatientHealthResultResourceAttributes source(PatientHealthResultResourceAttributesSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public PatientHealthResultResourceAttributesSource getSource() {
    return source;
  }

  public void setSource(PatientHealthResultResourceAttributesSource source) {
    this.source = source;
  }


  public PatientHealthResultResourceAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of result. Usually the same as metric_type except for lifestyle actions
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public PatientHealthResultResourceAttributes window(String window) {
    this.window = window;
    return this;
  }

  /**
   * Get window
   * @return window
   */
  @javax.annotation.Nullable
  public String getWindow() {
    return window;
  }

  public void setWindow(String window) {
    this.window = window;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientHealthResultResourceAttributes patientHealthResultResourceAttributes = (PatientHealthResultResourceAttributes) o;
    return Objects.equals(this.thread, patientHealthResultResourceAttributes.thread) &&
        Objects.equals(this.aggregation, patientHealthResultResourceAttributes.aggregation) &&
        Objects.equals(this.annotations, patientHealthResultResourceAttributes.annotations) &&
        Objects.equals(this.channel, patientHealthResultResourceAttributes.channel) &&
        Objects.equals(this.data, patientHealthResultResourceAttributes.data) &&
        Objects.equals(this.externalId, patientHealthResultResourceAttributes.externalId) &&
        Objects.equals(this.metricType, patientHealthResultResourceAttributes.metricType) &&
        Objects.equals(this.occurredAt, patientHealthResultResourceAttributes.occurredAt) &&
        Objects.equals(this.occurredAtTimeZone, patientHealthResultResourceAttributes.occurredAtTimeZone) &&
        Objects.equals(this.skipped, patientHealthResultResourceAttributes.skipped) &&
        Objects.equals(this.source, patientHealthResultResourceAttributes.source) &&
        Objects.equals(this.type, patientHealthResultResourceAttributes.type) &&
        Objects.equals(this.window, patientHealthResultResourceAttributes.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thread, aggregation, annotations, channel, data, externalId, metricType, occurredAt, occurredAtTimeZone, skipped, source, type, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientHealthResultResourceAttributes {\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    occurredAtTimeZone: ").append(toIndentedString(occurredAtTimeZone)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
    openapiFields.add("_thread");
    openapiFields.add("aggregation");
    openapiFields.add("annotations");
    openapiFields.add("channel");
    openapiFields.add("data");
    openapiFields.add("external_id");
    openapiFields.add("metric_type");
    openapiFields.add("occurred_at");
    openapiFields.add("occurred_at_time_zone");
    openapiFields.add("skipped");
    openapiFields.add("source");
    openapiFields.add("type");
    openapiFields.add("window");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatientHealthResultResourceAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatientHealthResultResourceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatientHealthResultResourceAttributes is not found in the empty JSON string", PatientHealthResultResourceAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatientHealthResultResourceAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatientHealthResultResourceAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("_thread") != null && !jsonObj.get("_thread").isJsonNull()) && !jsonObj.get("_thread").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_thread` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_thread").toString()));
      }
      if ((jsonObj.get("aggregation") != null && !jsonObj.get("aggregation").isJsonNull()) && !jsonObj.get("aggregation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregation").toString()));
      }
      if (jsonObj.get("annotations") != null && !jsonObj.get("annotations").isJsonNull()) {
        JsonArray jsonArrayannotations = jsonObj.getAsJsonArray("annotations");
        if (jsonArrayannotations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("annotations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `annotations` to be an array in the JSON string but got `%s`", jsonObj.get("annotations").toString()));
          }

          // validate the optional field `annotations` (array)
          for (int i = 0; i < jsonArrayannotations.size(); i++) {
            PatientHealthResultResourceAttributesAnnotationsInner.validateJsonElement(jsonArrayannotations.get(i));
          };
        }
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        PatientHealthResultResourceAttributesData.validateJsonElement(jsonObj.get("data"));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("metric_type") != null && !jsonObj.get("metric_type").isJsonNull()) && !jsonObj.get("metric_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metric_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metric_type").toString()));
      }
      // validate the optional field `metric_type`
      if (jsonObj.get("metric_type") != null && !jsonObj.get("metric_type").isJsonNull()) {
        MetricTypeEnum.validateJsonElement(jsonObj.get("metric_type"));
      }
      if ((jsonObj.get("occurred_at") != null && !jsonObj.get("occurred_at").isJsonNull()) && !jsonObj.get("occurred_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occurred_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occurred_at").toString()));
      }
      if ((jsonObj.get("occurred_at_time_zone") != null && !jsonObj.get("occurred_at_time_zone").isJsonNull()) && !jsonObj.get("occurred_at_time_zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occurred_at_time_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occurred_at_time_zone").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        PatientHealthResultResourceAttributesSource.validateJsonElement(jsonObj.get("source"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("window") != null && !jsonObj.get("window").isJsonNull()) && !jsonObj.get("window").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `window` to be a primitive type in the JSON string but got `%s`", jsonObj.get("window").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatientHealthResultResourceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatientHealthResultResourceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatientHealthResultResourceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatientHealthResultResourceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<PatientHealthResultResourceAttributes>() {
           @Override
           public void write(JsonWriter out, PatientHealthResultResourceAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatientHealthResultResourceAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatientHealthResultResourceAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatientHealthResultResourceAttributes
   * @throws IOException if the JSON string is invalid with respect to PatientHealthResultResourceAttributes
   */
  public static PatientHealthResultResourceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatientHealthResultResourceAttributes.class);
  }

  /**
   * Convert an instance of PatientHealthResultResourceAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

