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
 * ListCheckSummariesInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:48.152112-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListCheckSummariesInput {
  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "MaxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_LENS_ARN = "LensArn";
  @SerializedName(SERIALIZED_NAME_LENS_ARN)
  private String lensArn;

  public static final String SERIALIZED_NAME_PILLAR_ID = "PillarId";
  @SerializedName(SERIALIZED_NAME_PILLAR_ID)
  private String pillarId;

  public static final String SERIALIZED_NAME_QUESTION_ID = "QuestionId";
  @SerializedName(SERIALIZED_NAME_QUESTION_ID)
  private String questionId;

  public static final String SERIALIZED_NAME_CHOICE_ID = "ChoiceId";
  @SerializedName(SERIALIZED_NAME_CHOICE_ID)
  private String choiceId;

  public ListCheckSummariesInput() {
  }

  public ListCheckSummariesInput nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * The token to use to retrieve the next set of results.
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public ListCheckSummariesInput maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of results to return for this request.
   * minimum: 1
   * maximum: 50
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public ListCheckSummariesInput lensArn(String lensArn) {
    this.lensArn = lensArn;
    return this;
  }

  /**
   * Get lensArn
   * @return lensArn
   */
  @javax.annotation.Nonnull
  public String getLensArn() {
    return lensArn;
  }

  public void setLensArn(String lensArn) {
    this.lensArn = lensArn;
  }


  public ListCheckSummariesInput pillarId(String pillarId) {
    this.pillarId = pillarId;
    return this;
  }

  /**
   * &lt;p&gt;The ID used to identify a pillar, for example, &lt;code&gt;security&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;A pillar is identified by its &lt;a&gt;PillarReviewSummary$PillarId&lt;/a&gt;.&lt;/p&gt;
   * @return pillarId
   */
  @javax.annotation.Nonnull
  public String getPillarId() {
    return pillarId;
  }

  public void setPillarId(String pillarId) {
    this.pillarId = pillarId;
  }


  public ListCheckSummariesInput questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * The ID of the question.
   * @return questionId
   */
  @javax.annotation.Nonnull
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }


  public ListCheckSummariesInput choiceId(String choiceId) {
    this.choiceId = choiceId;
    return this;
  }

  /**
   * The ID of a choice.
   * @return choiceId
   */
  @javax.annotation.Nonnull
  public String getChoiceId() {
    return choiceId;
  }

  public void setChoiceId(String choiceId) {
    this.choiceId = choiceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCheckSummariesInput listCheckSummariesInput = (ListCheckSummariesInput) o;
    return Objects.equals(this.nextToken, listCheckSummariesInput.nextToken) &&
        Objects.equals(this.maxResults, listCheckSummariesInput.maxResults) &&
        Objects.equals(this.lensArn, listCheckSummariesInput.lensArn) &&
        Objects.equals(this.pillarId, listCheckSummariesInput.pillarId) &&
        Objects.equals(this.questionId, listCheckSummariesInput.questionId) &&
        Objects.equals(this.choiceId, listCheckSummariesInput.choiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, maxResults, lensArn, pillarId, questionId, choiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCheckSummariesInput {\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    lensArn: ").append(toIndentedString(lensArn)).append("\n");
    sb.append("    pillarId: ").append(toIndentedString(pillarId)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    choiceId: ").append(toIndentedString(choiceId)).append("\n");
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
    openapiFields.add("NextToken");
    openapiFields.add("MaxResults");
    openapiFields.add("LensArn");
    openapiFields.add("PillarId");
    openapiFields.add("QuestionId");
    openapiFields.add("ChoiceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LensArn");
    openapiRequiredFields.add("PillarId");
    openapiRequiredFields.add("QuestionId");
    openapiRequiredFields.add("ChoiceId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListCheckSummariesInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListCheckSummariesInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCheckSummariesInput is not found in the empty JSON string", ListCheckSummariesInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListCheckSummariesInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCheckSummariesInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListCheckSummariesInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) && !jsonObj.get("NextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NextToken").toString()));
      }
      // validate the required field `LensArn`
      String.validateJsonElement(jsonObj.get("LensArn"));
      if (!jsonObj.get("PillarId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PillarId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PillarId").toString()));
      }
      if (!jsonObj.get("QuestionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QuestionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QuestionId").toString()));
      }
      if (!jsonObj.get("ChoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChoiceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCheckSummariesInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCheckSummariesInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCheckSummariesInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCheckSummariesInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCheckSummariesInput>() {
           @Override
           public void write(JsonWriter out, ListCheckSummariesInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCheckSummariesInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListCheckSummariesInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListCheckSummariesInput
   * @throws IOException if the JSON string is invalid with respect to ListCheckSummariesInput
   */
  public static ListCheckSummariesInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCheckSummariesInput.class);
  }

  /**
   * Convert an instance of ListCheckSummariesInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

