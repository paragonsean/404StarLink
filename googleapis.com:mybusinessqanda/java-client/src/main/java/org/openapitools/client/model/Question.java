/*
 * My Business Q&A API
 * The My Business Q&A API allows questions and answers to be posted for specific listings. Note - If you have a quota of 0 after enabling the API, please request for GBP API access.
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
import org.openapitools.client.model.Answer;
import org.openapitools.client.model.Author;

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
 * Represents a single question and some of its answers.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:25.788610-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Question {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private Author author;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TOP_ANSWERS = "topAnswers";
  @SerializedName(SERIALIZED_NAME_TOP_ANSWERS)
  private List<Answer> topAnswers = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ANSWER_COUNT = "totalAnswerCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_ANSWER_COUNT)
  private Integer totalAnswerCount;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_UPVOTE_COUNT = "upvoteCount";
  @SerializedName(SERIALIZED_NAME_UPVOTE_COUNT)
  private Integer upvoteCount;

  public Question() {
  }

  public Question(
     String createTime, 
     List<Answer> topAnswers, 
     Integer totalAnswerCount, 
     String updateTime, 
     Integer upvoteCount
  ) {
    this();
    this.createTime = createTime;
    this.topAnswers = topAnswers;
    this.totalAnswerCount = totalAnswerCount;
    this.updateTime = updateTime;
    this.upvoteCount = upvoteCount;
  }

  public Question author(Author author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @javax.annotation.Nullable
  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }


  /**
   * Output only. The timestamp for when the question was written.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  public Question name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The unique name for the question. locations/_*_/questions/_* This field will be ignored if set during question creation.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Question text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Required. The text of the question. It should contain at least three words and the total length should be greater than or equal to 10 characters. The maximum length is 4096 characters.
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  /**
   * Output only. A list of answers to the question, sorted by upvotes. This may not be a complete list of answers depending on the request parameters (answers_per_question)
   * @return topAnswers
   */
  @javax.annotation.Nullable
  public List<Answer> getTopAnswers() {
    return topAnswers;
  }



  /**
   * Output only. The total number of answers posted for this question.
   * @return totalAnswerCount
   */
  @javax.annotation.Nullable
  public Integer getTotalAnswerCount() {
    return totalAnswerCount;
  }



  /**
   * Output only. The timestamp for when the question was last modified.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  /**
   * Output only. The number of upvotes for the question.
   * @return upvoteCount
   */
  @javax.annotation.Nullable
  public Integer getUpvoteCount() {
    return upvoteCount;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.author, question.author) &&
        Objects.equals(this.createTime, question.createTime) &&
        Objects.equals(this.name, question.name) &&
        Objects.equals(this.text, question.text) &&
        Objects.equals(this.topAnswers, question.topAnswers) &&
        Objects.equals(this.totalAnswerCount, question.totalAnswerCount) &&
        Objects.equals(this.updateTime, question.updateTime) &&
        Objects.equals(this.upvoteCount, question.upvoteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, createTime, name, text, topAnswers, totalAnswerCount, updateTime, upvoteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    topAnswers: ").append(toIndentedString(topAnswers)).append("\n");
    sb.append("    totalAnswerCount: ").append(toIndentedString(totalAnswerCount)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    upvoteCount: ").append(toIndentedString(upvoteCount)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("createTime");
    openapiFields.add("name");
    openapiFields.add("text");
    openapiFields.add("topAnswers");
    openapiFields.add("totalAnswerCount");
    openapiFields.add("updateTime");
    openapiFields.add("upvoteCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Question
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Question.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Question is not found in the empty JSON string", Question.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Question.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Question` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        Author.validateJsonElement(jsonObj.get("author"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("topAnswers") != null && !jsonObj.get("topAnswers").isJsonNull()) {
        JsonArray jsonArraytopAnswers = jsonObj.getAsJsonArray("topAnswers");
        if (jsonArraytopAnswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("topAnswers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `topAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("topAnswers").toString()));
          }

          // validate the optional field `topAnswers` (array)
          for (int i = 0; i < jsonArraytopAnswers.size(); i++) {
            Answer.validateJsonElement(jsonArraytopAnswers.get(i));
          };
        }
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Question.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Question' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Question> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Question.class));

       return (TypeAdapter<T>) new TypeAdapter<Question>() {
           @Override
           public void write(JsonWriter out, Question value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Question read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Question given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Question
   * @throws IOException if the JSON string is invalid with respect to Question
   */
  public static Question fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Question.class);
  }

  /**
   * Convert an instance of Question to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

