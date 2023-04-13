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
 * An answer of the question.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:51.532398-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Answer {
  public static final String SERIALIZED_NAME_QUESTION_ID = "QuestionId";
  @SerializedName(SERIALIZED_NAME_QUESTION_ID)
  private String questionId;

  public static final String SERIALIZED_NAME_PILLAR_ID = "PillarId";
  @SerializedName(SERIALIZED_NAME_PILLAR_ID)
  private String pillarId;

  public static final String SERIALIZED_NAME_QUESTION_TITLE = "QuestionTitle";
  @SerializedName(SERIALIZED_NAME_QUESTION_TITLE)
  private String questionTitle;

  public static final String SERIALIZED_NAME_QUESTION_DESCRIPTION = "QuestionDescription";
  @SerializedName(SERIALIZED_NAME_QUESTION_DESCRIPTION)
  private String questionDescription;

  public static final String SERIALIZED_NAME_IMPROVEMENT_PLAN_URL = "ImprovementPlanUrl";
  @SerializedName(SERIALIZED_NAME_IMPROVEMENT_PLAN_URL)
  private String improvementPlanUrl;

  public static final String SERIALIZED_NAME_HELPFUL_RESOURCE_URL = "HelpfulResourceUrl";
  @SerializedName(SERIALIZED_NAME_HELPFUL_RESOURCE_URL)
  private String helpfulResourceUrl;

  public static final String SERIALIZED_NAME_HELPFUL_RESOURCE_DISPLAY_TEXT = "HelpfulResourceDisplayText";
  @SerializedName(SERIALIZED_NAME_HELPFUL_RESOURCE_DISPLAY_TEXT)
  private String helpfulResourceDisplayText;

  public static final String SERIALIZED_NAME_CHOICES = "Choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<Choice> choices = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_CHOICES = "SelectedChoices";
  @SerializedName(SERIALIZED_NAME_SELECTED_CHOICES)
  private List<String> selectedChoices = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHOICE_ANSWERS = "ChoiceAnswers";
  @SerializedName(SERIALIZED_NAME_CHOICE_ANSWERS)
  private List choiceAnswers;

  public static final String SERIALIZED_NAME_IS_APPLICABLE = "IsApplicable";
  @SerializedName(SERIALIZED_NAME_IS_APPLICABLE)
  private Boolean isApplicable;

  public static final String SERIALIZED_NAME_RISK = "Risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private Risk risk;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private AnswerReason reason;

  public Answer() {
  }

  public Answer questionId(String questionId) {
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


  public Answer pillarId(String pillarId) {
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


  public Answer questionTitle(String questionTitle) {
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


  public Answer questionDescription(String questionDescription) {
    this.questionDescription = questionDescription;
    return this;
  }

  /**
   * The description of the question.
   * @return questionDescription
   */
  @javax.annotation.Nullable
  public String getQuestionDescription() {
    return questionDescription;
  }

  public void setQuestionDescription(String questionDescription) {
    this.questionDescription = questionDescription;
  }


  public Answer improvementPlanUrl(String improvementPlanUrl) {
    this.improvementPlanUrl = improvementPlanUrl;
    return this;
  }

  /**
   * &lt;p&gt;The improvement plan URL for a question in an Amazon Web Services official lenses.&lt;/p&gt; &lt;p&gt;This value is only available if the question has been answered.&lt;/p&gt; &lt;p&gt;This value does not apply to custom lenses.&lt;/p&gt;
   * @return improvementPlanUrl
   */
  @javax.annotation.Nullable
  public String getImprovementPlanUrl() {
    return improvementPlanUrl;
  }

  public void setImprovementPlanUrl(String improvementPlanUrl) {
    this.improvementPlanUrl = improvementPlanUrl;
  }


  public Answer helpfulResourceUrl(String helpfulResourceUrl) {
    this.helpfulResourceUrl = helpfulResourceUrl;
    return this;
  }

  /**
   * &lt;p&gt;The helpful resource URL.&lt;/p&gt; &lt;p&gt;For Amazon Web Services official lenses, this is the helpful resource URL for a question or choice.&lt;/p&gt; &lt;p&gt;For custom lenses, this is the helpful resource URL for a question and is only provided if &lt;code&gt;HelpfulResourceDisplayText&lt;/code&gt; was specified for the question.&lt;/p&gt;
   * @return helpfulResourceUrl
   */
  @javax.annotation.Nullable
  public String getHelpfulResourceUrl() {
    return helpfulResourceUrl;
  }

  public void setHelpfulResourceUrl(String helpfulResourceUrl) {
    this.helpfulResourceUrl = helpfulResourceUrl;
  }


  public Answer helpfulResourceDisplayText(String helpfulResourceDisplayText) {
    this.helpfulResourceDisplayText = helpfulResourceDisplayText;
    return this;
  }

  /**
   * Get helpfulResourceDisplayText
   * @return helpfulResourceDisplayText
   */
  @javax.annotation.Nullable
  public String getHelpfulResourceDisplayText() {
    return helpfulResourceDisplayText;
  }

  public void setHelpfulResourceDisplayText(String helpfulResourceDisplayText) {
    this.helpfulResourceDisplayText = helpfulResourceDisplayText;
  }


  public Answer choices(List<Choice> choices) {
    this.choices = choices;
    return this;
  }

  public Answer addChoicesItem(Choice choicesItem) {
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


  public Answer selectedChoices(List<String> selectedChoices) {
    this.selectedChoices = selectedChoices;
    return this;
  }

  public Answer addSelectedChoicesItem(String selectedChoicesItem) {
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


  public Answer choiceAnswers(List choiceAnswers) {
    this.choiceAnswers = choiceAnswers;
    return this;
  }

  /**
   * Get choiceAnswers
   * @return choiceAnswers
   */
  @javax.annotation.Nullable
  public List getChoiceAnswers() {
    return choiceAnswers;
  }

  public void setChoiceAnswers(List choiceAnswers) {
    this.choiceAnswers = choiceAnswers;
  }


  public Answer isApplicable(Boolean isApplicable) {
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


  public Answer risk(Risk risk) {
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


  public Answer notes(String notes) {
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


  public Answer reason(AnswerReason reason) {
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
    Answer answer = (Answer) o;
    return Objects.equals(this.questionId, answer.questionId) &&
        Objects.equals(this.pillarId, answer.pillarId) &&
        Objects.equals(this.questionTitle, answer.questionTitle) &&
        Objects.equals(this.questionDescription, answer.questionDescription) &&
        Objects.equals(this.improvementPlanUrl, answer.improvementPlanUrl) &&
        Objects.equals(this.helpfulResourceUrl, answer.helpfulResourceUrl) &&
        Objects.equals(this.helpfulResourceDisplayText, answer.helpfulResourceDisplayText) &&
        Objects.equals(this.choices, answer.choices) &&
        Objects.equals(this.selectedChoices, answer.selectedChoices) &&
        Objects.equals(this.choiceAnswers, answer.choiceAnswers) &&
        Objects.equals(this.isApplicable, answer.isApplicable) &&
        Objects.equals(this.risk, answer.risk) &&
        Objects.equals(this.notes, answer.notes) &&
        Objects.equals(this.reason, answer.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, pillarId, questionTitle, questionDescription, improvementPlanUrl, helpfulResourceUrl, helpfulResourceDisplayText, choices, selectedChoices, choiceAnswers, isApplicable, risk, notes, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    pillarId: ").append(toIndentedString(pillarId)).append("\n");
    sb.append("    questionTitle: ").append(toIndentedString(questionTitle)).append("\n");
    sb.append("    questionDescription: ").append(toIndentedString(questionDescription)).append("\n");
    sb.append("    improvementPlanUrl: ").append(toIndentedString(improvementPlanUrl)).append("\n");
    sb.append("    helpfulResourceUrl: ").append(toIndentedString(helpfulResourceUrl)).append("\n");
    sb.append("    helpfulResourceDisplayText: ").append(toIndentedString(helpfulResourceDisplayText)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    selectedChoices: ").append(toIndentedString(selectedChoices)).append("\n");
    sb.append("    choiceAnswers: ").append(toIndentedString(choiceAnswers)).append("\n");
    sb.append("    isApplicable: ").append(toIndentedString(isApplicable)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("QuestionDescription");
    openapiFields.add("ImprovementPlanUrl");
    openapiFields.add("HelpfulResourceUrl");
    openapiFields.add("HelpfulResourceDisplayText");
    openapiFields.add("Choices");
    openapiFields.add("SelectedChoices");
    openapiFields.add("ChoiceAnswers");
    openapiFields.add("IsApplicable");
    openapiFields.add("Risk");
    openapiFields.add("Notes");
    openapiFields.add("Reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Answer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Answer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Answer is not found in the empty JSON string", Answer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Answer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Answer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("QuestionDescription") != null && !jsonObj.get("QuestionDescription").isJsonNull()) && !jsonObj.get("QuestionDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QuestionDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QuestionDescription").toString()));
      }
      if ((jsonObj.get("ImprovementPlanUrl") != null && !jsonObj.get("ImprovementPlanUrl").isJsonNull()) && !jsonObj.get("ImprovementPlanUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImprovementPlanUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImprovementPlanUrl").toString()));
      }
      if ((jsonObj.get("HelpfulResourceUrl") != null && !jsonObj.get("HelpfulResourceUrl").isJsonNull()) && !jsonObj.get("HelpfulResourceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HelpfulResourceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HelpfulResourceUrl").toString()));
      }
      // validate the optional field `HelpfulResourceDisplayText`
      if (jsonObj.get("HelpfulResourceDisplayText") != null && !jsonObj.get("HelpfulResourceDisplayText").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HelpfulResourceDisplayText"));
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
      // validate the optional field `ChoiceAnswers`
      if (jsonObj.get("ChoiceAnswers") != null && !jsonObj.get("ChoiceAnswers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ChoiceAnswers"));
      }
      // validate the optional field `Risk`
      if (jsonObj.get("Risk") != null && !jsonObj.get("Risk").isJsonNull()) {
        Risk.validateJsonElement(jsonObj.get("Risk"));
      }
      if ((jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonNull()) && !jsonObj.get("Notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
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
       if (!Answer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Answer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Answer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Answer.class));

       return (TypeAdapter<T>) new TypeAdapter<Answer>() {
           @Override
           public void write(JsonWriter out, Answer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Answer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Answer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Answer
   * @throws IOException if the JSON string is invalid with respect to Answer
   */
  public static Answer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Answer.class);
  }

  /**
   * Convert an instance of Answer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

