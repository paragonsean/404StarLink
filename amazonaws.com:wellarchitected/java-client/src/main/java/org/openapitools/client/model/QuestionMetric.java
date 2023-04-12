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
import java.util.List;
import org.openapitools.client.model.Risk;

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
 * A metric for a particular question in the pillar. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:47.577947-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class QuestionMetric {
  public static final String SERIALIZED_NAME_QUESTION_ID = "QuestionId";
  @SerializedName(SERIALIZED_NAME_QUESTION_ID)
  private String questionId;

  public static final String SERIALIZED_NAME_RISK = "Risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private Risk risk;

  public static final String SERIALIZED_NAME_BEST_PRACTICES = "BestPractices";
  @SerializedName(SERIALIZED_NAME_BEST_PRACTICES)
  private List bestPractices;

  public QuestionMetric() {
  }

  public QuestionMetric questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * The ID of the question.
   * @return questionId
   */
  @javax.annotation.Nullable
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }


  public QuestionMetric risk(Risk risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
   */
  @javax.annotation.Nullable
  public Risk getRisk() {
    return risk;
  }

  public void setRisk(Risk risk) {
    this.risk = risk;
  }


  public QuestionMetric bestPractices(List bestPractices) {
    this.bestPractices = bestPractices;
    return this;
  }

  /**
   * Get bestPractices
   * @return bestPractices
   */
  @javax.annotation.Nullable
  public List getBestPractices() {
    return bestPractices;
  }

  public void setBestPractices(List bestPractices) {
    this.bestPractices = bestPractices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionMetric questionMetric = (QuestionMetric) o;
    return Objects.equals(this.questionId, questionMetric.questionId) &&
        Objects.equals(this.risk, questionMetric.risk) &&
        Objects.equals(this.bestPractices, questionMetric.bestPractices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, risk, bestPractices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionMetric {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    bestPractices: ").append(toIndentedString(bestPractices)).append("\n");
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
    openapiFields.add("QuestionId");
    openapiFields.add("Risk");
    openapiFields.add("BestPractices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuestionMetric
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuestionMetric.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuestionMetric is not found in the empty JSON string", QuestionMetric.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuestionMetric.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuestionMetric` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("QuestionId") != null && !jsonObj.get("QuestionId").isJsonNull()) && !jsonObj.get("QuestionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QuestionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QuestionId").toString()));
      }
      // validate the optional field `Risk`
      if (jsonObj.get("Risk") != null && !jsonObj.get("Risk").isJsonNull()) {
        Risk.validateJsonElement(jsonObj.get("Risk"));
      }
      // validate the optional field `BestPractices`
      if (jsonObj.get("BestPractices") != null && !jsonObj.get("BestPractices").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("BestPractices"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionMetric.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionMetric' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionMetric> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionMetric.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionMetric>() {
           @Override
           public void write(JsonWriter out, QuestionMetric value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuestionMetric read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuestionMetric given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuestionMetric
   * @throws IOException if the JSON string is invalid with respect to QuestionMetric
   */
  public static QuestionMetric fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionMetric.class);
  }

  /**
   * Convert an instance of QuestionMetric to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

