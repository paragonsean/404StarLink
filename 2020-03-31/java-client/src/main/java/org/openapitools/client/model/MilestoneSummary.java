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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.WorkloadSummary;

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
 * A milestone summary return object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class MilestoneSummary {
  public static final String SERIALIZED_NAME_MILESTONE_NUMBER = "MilestoneNumber";
  @SerializedName(SERIALIZED_NAME_MILESTONE_NUMBER)
  private Integer milestoneNumber;

  public static final String SERIALIZED_NAME_MILESTONE_NAME = "MilestoneName";
  @SerializedName(SERIALIZED_NAME_MILESTONE_NAME)
  private String milestoneName;

  public static final String SERIALIZED_NAME_RECORDED_AT = "RecordedAt";
  @SerializedName(SERIALIZED_NAME_RECORDED_AT)
  private OffsetDateTime recordedAt;

  public static final String SERIALIZED_NAME_WORKLOAD_SUMMARY = "WorkloadSummary";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_SUMMARY)
  private WorkloadSummary workloadSummary;

  public MilestoneSummary() {
  }

  public MilestoneSummary milestoneNumber(Integer milestoneNumber) {
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


  public MilestoneSummary milestoneName(String milestoneName) {
    this.milestoneName = milestoneName;
    return this;
  }

  /**
   * &lt;p&gt;The name of the milestone in a workload.&lt;/p&gt; &lt;p&gt;Milestone names must be unique within a workload.&lt;/p&gt;
   * @return milestoneName
   */
  @javax.annotation.Nullable
  public String getMilestoneName() {
    return milestoneName;
  }

  public void setMilestoneName(String milestoneName) {
    this.milestoneName = milestoneName;
  }


  public MilestoneSummary recordedAt(OffsetDateTime recordedAt) {
    this.recordedAt = recordedAt;
    return this;
  }

  /**
   * The date and time recorded.
   * @return recordedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRecordedAt() {
    return recordedAt;
  }

  public void setRecordedAt(OffsetDateTime recordedAt) {
    this.recordedAt = recordedAt;
  }


  public MilestoneSummary workloadSummary(WorkloadSummary workloadSummary) {
    this.workloadSummary = workloadSummary;
    return this;
  }

  /**
   * Get workloadSummary
   * @return workloadSummary
   */
  @javax.annotation.Nullable
  public WorkloadSummary getWorkloadSummary() {
    return workloadSummary;
  }

  public void setWorkloadSummary(WorkloadSummary workloadSummary) {
    this.workloadSummary = workloadSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MilestoneSummary milestoneSummary = (MilestoneSummary) o;
    return Objects.equals(this.milestoneNumber, milestoneSummary.milestoneNumber) &&
        Objects.equals(this.milestoneName, milestoneSummary.milestoneName) &&
        Objects.equals(this.recordedAt, milestoneSummary.recordedAt) &&
        Objects.equals(this.workloadSummary, milestoneSummary.workloadSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(milestoneNumber, milestoneName, recordedAt, workloadSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilestoneSummary {\n");
    sb.append("    milestoneNumber: ").append(toIndentedString(milestoneNumber)).append("\n");
    sb.append("    milestoneName: ").append(toIndentedString(milestoneName)).append("\n");
    sb.append("    recordedAt: ").append(toIndentedString(recordedAt)).append("\n");
    sb.append("    workloadSummary: ").append(toIndentedString(workloadSummary)).append("\n");
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
    openapiFields.add("MilestoneNumber");
    openapiFields.add("MilestoneName");
    openapiFields.add("RecordedAt");
    openapiFields.add("WorkloadSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MilestoneSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MilestoneSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MilestoneSummary is not found in the empty JSON string", MilestoneSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MilestoneSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MilestoneSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MilestoneName") != null && !jsonObj.get("MilestoneName").isJsonNull()) && !jsonObj.get("MilestoneName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MilestoneName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MilestoneName").toString()));
      }
      // validate the optional field `WorkloadSummary`
      if (jsonObj.get("WorkloadSummary") != null && !jsonObj.get("WorkloadSummary").isJsonNull()) {
        WorkloadSummary.validateJsonElement(jsonObj.get("WorkloadSummary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MilestoneSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MilestoneSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MilestoneSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MilestoneSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<MilestoneSummary>() {
           @Override
           public void write(JsonWriter out, MilestoneSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MilestoneSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MilestoneSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MilestoneSummary
   * @throws IOException if the JSON string is invalid with respect to MilestoneSummary
   */
  public static MilestoneSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MilestoneSummary.class);
  }

  /**
   * Convert an instance of MilestoneSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

