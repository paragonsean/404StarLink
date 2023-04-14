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
import java.util.Arrays;
import java.util.HashMap;
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
 * A pillar review summary of a lens review.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PillarReviewSummary {
  public static final String SERIALIZED_NAME_PILLAR_ID = "PillarId";
  @SerializedName(SERIALIZED_NAME_PILLAR_ID)
  private String pillarId;

  public static final String SERIALIZED_NAME_PILLAR_NAME = "PillarName";
  @SerializedName(SERIALIZED_NAME_PILLAR_NAME)
  private String pillarName;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_RISK_COUNTS = "RiskCounts";
  @SerializedName(SERIALIZED_NAME_RISK_COUNTS)
  private Map<String, Integer> riskCounts = new HashMap<>();

  public PillarReviewSummary() {
  }

  public PillarReviewSummary pillarId(String pillarId) {
    this.pillarId = pillarId;
    return this;
  }

  /**
   * &lt;p&gt;The ID used to identify a pillar, for example, &lt;code&gt;security&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;A pillar is identified by its &lt;a&gt;PillarReviewSummary$PillarId&lt;/a&gt;.&lt;/p&gt;
   * @return pillarId
   */
  @javax.annotation.Nullable
  public String getPillarId() {
    return pillarId;
  }

  public void setPillarId(String pillarId) {
    this.pillarId = pillarId;
  }


  public PillarReviewSummary pillarName(String pillarName) {
    this.pillarName = pillarName;
    return this;
  }

  /**
   * The name of the pillar.
   * @return pillarName
   */
  @javax.annotation.Nullable
  public String getPillarName() {
    return pillarName;
  }

  public void setPillarName(String pillarName) {
    this.pillarName = pillarName;
  }


  public PillarReviewSummary notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The notes associated with the workload.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public PillarReviewSummary riskCounts(Map<String, Integer> riskCounts) {
    this.riskCounts = riskCounts;
    return this;
  }

  public PillarReviewSummary putRiskCountsItem(String key, Integer riskCountsItem) {
    if (this.riskCounts == null) {
      this.riskCounts = new HashMap<>();
    }
    this.riskCounts.put(key, riskCountsItem);
    return this;
  }

  /**
   * A map from risk names to the count of how many questions have that rating.
   * @return riskCounts
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getRiskCounts() {
    return riskCounts;
  }

  public void setRiskCounts(Map<String, Integer> riskCounts) {
    this.riskCounts = riskCounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PillarReviewSummary pillarReviewSummary = (PillarReviewSummary) o;
    return Objects.equals(this.pillarId, pillarReviewSummary.pillarId) &&
        Objects.equals(this.pillarName, pillarReviewSummary.pillarName) &&
        Objects.equals(this.notes, pillarReviewSummary.notes) &&
        Objects.equals(this.riskCounts, pillarReviewSummary.riskCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pillarId, pillarName, notes, riskCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PillarReviewSummary {\n");
    sb.append("    pillarId: ").append(toIndentedString(pillarId)).append("\n");
    sb.append("    pillarName: ").append(toIndentedString(pillarName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    riskCounts: ").append(toIndentedString(riskCounts)).append("\n");
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
    openapiFields.add("PillarId");
    openapiFields.add("PillarName");
    openapiFields.add("Notes");
    openapiFields.add("RiskCounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PillarReviewSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PillarReviewSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PillarReviewSummary is not found in the empty JSON string", PillarReviewSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PillarReviewSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PillarReviewSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("PillarId") != null && !jsonObj.get("PillarId").isJsonNull()) && !jsonObj.get("PillarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PillarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PillarId").toString()));
      }
      if ((jsonObj.get("PillarName") != null && !jsonObj.get("PillarName").isJsonNull()) && !jsonObj.get("PillarName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PillarName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PillarName").toString()));
      }
      if ((jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonNull()) && !jsonObj.get("Notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PillarReviewSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PillarReviewSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PillarReviewSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PillarReviewSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PillarReviewSummary>() {
           @Override
           public void write(JsonWriter out, PillarReviewSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PillarReviewSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PillarReviewSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PillarReviewSummary
   * @throws IOException if the JSON string is invalid with respect to PillarReviewSummary
   */
  public static PillarReviewSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PillarReviewSummary.class);
  }

  /**
   * Convert an instance of PillarReviewSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

