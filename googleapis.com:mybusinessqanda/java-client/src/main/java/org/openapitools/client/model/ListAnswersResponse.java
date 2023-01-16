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
 * Response message for QuestionsAndAnswers.ListAnswers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:25.788610-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListAnswersResponse {
  public static final String SERIALIZED_NAME_ANSWERS = "answers";
  @SerializedName(SERIALIZED_NAME_ANSWERS)
  private List<Answer> answers = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public ListAnswersResponse() {
  }

  public ListAnswersResponse answers(List<Answer> answers) {
    this.answers = answers;
    return this;
  }

  public ListAnswersResponse addAnswersItem(Answer answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * The requested answers.
   * @return answers
   */
  @javax.annotation.Nullable
  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }


  public ListAnswersResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * If the number of answers exceeds the requested max page size, this field is populated with a token to fetch the next page of answers on a subsequent call. If there are no more answers, this field is not present in the response.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ListAnswersResponse totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * The total number of answers posted for this question across all pages.
   * @return totalSize
   */
  @javax.annotation.Nullable
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnswersResponse listAnswersResponse = (ListAnswersResponse) o;
    return Objects.equals(this.answers, listAnswersResponse.answers) &&
        Objects.equals(this.nextPageToken, listAnswersResponse.nextPageToken) &&
        Objects.equals(this.totalSize, listAnswersResponse.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers, nextPageToken, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnswersResponse {\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("answers");
    openapiFields.add("nextPageToken");
    openapiFields.add("totalSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListAnswersResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListAnswersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnswersResponse is not found in the empty JSON string", ListAnswersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListAnswersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnswersResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("answers") != null && !jsonObj.get("answers").isJsonNull()) {
        JsonArray jsonArrayanswers = jsonObj.getAsJsonArray("answers");
        if (jsonArrayanswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("answers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `answers` to be an array in the JSON string but got `%s`", jsonObj.get("answers").toString()));
          }

          // validate the optional field `answers` (array)
          for (int i = 0; i < jsonArrayanswers.size(); i++) {
            Answer.validateJsonElement(jsonArrayanswers.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnswersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnswersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnswersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnswersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnswersResponse>() {
           @Override
           public void write(JsonWriter out, ListAnswersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnswersResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListAnswersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListAnswersResponse
   * @throws IOException if the JSON string is invalid with respect to ListAnswersResponse
   */
  public static ListAnswersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnswersResponse.class);
  }

  /**
   * Convert an instance of ListAnswersResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

