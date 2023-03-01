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
import org.openapitools.client.model.AnswerReason;
import org.openapitools.client.model.Choice;
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
 * An answer summary of a lens review in a workload.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:44.124838-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AnswerSummary {
  public static final String SERIALIZED_NAME_QUESTION_ID = "QuestionId";
  @SerializedName(SERIALIZED_NAME_QUESTION_ID)
  private String questionId;

  public static final String SERIALIZED_NAME_PILLAR_ID = "PillarId";
  @SerializedName(SERIALIZED_NAME_PILLAR_ID)
  private String pillarId;

  public static final String SERIALIZED_NAME_QUESTION_TITLE = "QuestionTitle";
  @SerializedName(SERIALIZED_NAME_QUESTION_TITLE)
  private String questionTitle;

  public static final String SERIALIZED_NAME_CHOICES = "Choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<Choice> choices = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_CHOICES = "SelectedChoices";
  @SerializedName(SERIALIZED_NAME_SELECTED_CHOICES)
  private List<String> selectedChoices = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHOICE_ANSWER_SUMMARIES = "ChoiceAnswerSummaries";
  @SerializedName(SERIALIZED_NAME_CHOICE_ANSWER_SUMMARIES)
  private List choiceAnswerSummaries;

  public static final String SERIALIZED_NAME_IS_APPLICABLE = "IsApplicable";
  @SerializedName(SERIALIZED_NAME_IS_APPLICABLE)
  private Boolean isApplicable;

  public static final String SERIALIZED_NAME_RISK = "Risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private Risk risk;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private AnswerReason reason;

  public AnswerSummary() {
  }

  public AnswerSummary questionId(String questionId) {
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


  public AnswerSummary pillarId(String pillarId) {
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


  public AnswerSummary questionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
    return this;
  }

  /**
   * The title of the question.
   * @return questionTitle
   */
  @javax.annotation.Nullable
  public String getQuestionTitle() {
    return questionTitle;
  }

  public void setQuestionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
  }


  public AnswerSummary choices(List<Choice> choices) {
    this.choices = choices;
    return this;
  }

  public AnswerSummary addChoicesItem(Choice choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * List of choices available for a question.
   * @return choices
   */
  @javax.annotation.Nullable
  public List<Choice> getChoices() {
    return choices;
  }

  public void setChoices(List<Choice> choices) {
    this.choices = choices;
  }


  public AnswerSummary selectedChoices(List<String> selectedChoices) {
    this.selectedChoices = selectedChoices;
    return this;
  }

  public AnswerSummary addSelectedChoicesItem(String selectedChoicesItem) {
    if (this.selectedChoices == null) {
      this.selectedChoices = new ArrayList<>();
    }
    this.selectedChoices.add(selectedChoicesItem);
    return this;
  }

  /**
   * &lt;p&gt;List of selected choice IDs in a question answer.&lt;/p&gt; &lt;p&gt;The values entered replace the previously selected choices.&lt;/p&gt;
   * @return selectedChoices
   */
  @javax.annotation.Nullable
  public List<String> getSelectedChoices() {
    return selectedChoices;
  }

  public void setSelectedChoices(List<String> selectedChoices) {
    this.selectedChoices = selectedChoices;
  }


  public AnswerSummary choiceAnswerSummaries(List choiceAnswerSummaries) {
    this.choiceAnswerSummaries = choiceAnswerSummaries;
    return this;
  }

  /**
   * Get choiceAnswerSummaries
   * @return choiceAnswerSummaries
   */
  @javax.annotation.Nullable
  public List getChoiceAnswerSummaries() {
    return choiceAnswerSummaries;
  }

  public void setChoiceAnswerSummaries(List choiceAnswerSummaries) {
    this.choiceAnswerSummaries = choiceAnswerSummaries;
  }


  public AnswerSummary isApplicable(Boolean isApplicable) {
    this.isApplicable = isApplicable;
    return this;
  }

  /**
   * Defines whether this question is applicable to a lens review.
   * @return isApplicable
   */
  @javax.annotation.Nullable
  public Boolean getIsApplicable() {
    return isApplicable;
  }

  public void setIsApplicable(Boolean isApplicable) {
    this.isApplicable = isApplicable;
  }


  public AnswerSummary risk(Risk risk) {
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


  public AnswerSummary reason(AnswerReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nullable
  public AnswerReason getReason() {
    return reason;
  }

  public void setReason(AnswerReason reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerSummary answerSummary = (AnswerSummary) o;
    return Objects.equals(this.questionId, answerSummary.questionId) &&
        Objects.equals(this.pillarId, answerSummary.pillarId) &&
        Objects.equals(this.questionTitle, answerSummary.questionTitle) &&
        Objects.equals(this.choices, answerSummary.choices) &&
        Objects.equals(this.selectedChoices, answerSummary.selectedChoices) &&
        Objects.equals(this.choiceAnswerSummaries, answerSummary.choiceAnswerSummaries) &&
        Objects.equals(this.isApplicable, answerSummary.isApplicable) &&
        Objects.equals(this.risk, answerSummary.risk) &&
        Objects.equals(this.reason, answerSummary.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, pillarId, questionTitle, choices, selectedChoices, choiceAnswerSummaries, isApplicable, risk, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerSummary {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    pillarId: ").append(toIndentedString(pillarId)).append("\n");
    sb.append("    questionTitle: ").append(toIndentedString(questionTitle)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    selectedChoices: ").append(toIndentedString(selectedChoices)).append("\n");
    sb.append("    choiceAnswerSummaries: ").append(toIndentedString(choiceAnswerSummaries)).append("\n");
    sb.append("    isApplicable: ").append(toIndentedString(isApplicable)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("PillarId");
    openapiFields.add("QuestionTitle");
    openapiFields.add("Choices");
    openapiFields.add("SelectedChoices");
    openapiFields.add("ChoiceAnswerSummaries");
    openapiFields.add("IsApplicable");
    openapiFields.add("Risk");
    openapiFields.add("Reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnswerSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnswerSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnswerSummary is not found in the empty JSON string", AnswerSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnswerSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnswerSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("QuestionId") != null && !jsonObj.get("QuestionId").isJsonNull()) && !jsonObj.get("QuestionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QuestionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QuestionId").toString()));
      }
      if ((jsonObj.get("PillarId") != null && !jsonObj.get("PillarId").isJsonNull()) && !jsonObj.get("PillarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PillarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PillarId").toString()));
      }
      if ((jsonObj.get("QuestionTitle") != null && !jsonObj.get("QuestionTitle").isJsonNull()) && !jsonObj.get("QuestionTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QuestionTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QuestionTitle").toString()));
      }
      if (jsonObj.get("Choices") != null && !jsonObj.get("Choices").isJsonNull()) {
        JsonArray jsonArraychoices = jsonObj.getAsJsonArray("Choices");
        if (jsonArraychoices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Choices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Choices` to be an array in the JSON string but got `%s`", jsonObj.get("Choices").toString()));
          }

          // validate the optional field `Choices` (array)
          for (int i = 0; i < jsonArraychoices.size(); i++) {
            Choice.validateJsonElement(jsonArraychoices.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SelectedChoices") != null && !jsonObj.get("SelectedChoices").isJsonNull() && !jsonObj.get("SelectedChoices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectedChoices` to be an array in the JSON string but got `%s`", jsonObj.get("SelectedChoices").toString()));
      }
      // validate the optional field `ChoiceAnswerSummaries`
      if (jsonObj.get("ChoiceAnswerSummaries") != null && !jsonObj.get("ChoiceAnswerSummaries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ChoiceAnswerSummaries"));
      }
      // validate the optional field `Risk`
      if (jsonObj.get("Risk") != null && !jsonObj.get("Risk").isJsonNull()) {
        Risk.validateJsonElement(jsonObj.get("Risk"));
      }
      // validate the optional field `Reason`
      if (jsonObj.get("Reason") != null && !jsonObj.get("Reason").isJsonNull()) {
        AnswerReason.validateJsonElement(jsonObj.get("Reason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnswerSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnswerSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnswerSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnswerSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<AnswerSummary>() {
           @Override
           public void write(JsonWriter out, AnswerSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnswerSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnswerSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnswerSummary
   * @throws IOException if the JSON string is invalid with respect to AnswerSummary
   */
  public static AnswerSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnswerSummary.class);
  }

  /**
   * Convert an instance of AnswerSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

