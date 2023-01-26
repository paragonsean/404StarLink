/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
 * Response message for PriceAccuracyViewService.SummarizePriceAccuracy.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:54.390975-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SummarizePriceAccuracyResponse {
  /**
   * The current Book on Google price accuracy score.
   */
  @JsonAdapter(CurrentBookOnGoogleScoreEnum.Adapter.class)
  public enum CurrentBookOnGoogleScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    CurrentBookOnGoogleScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentBookOnGoogleScoreEnum fromValue(String value) {
      for (CurrentBookOnGoogleScoreEnum b : CurrentBookOnGoogleScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrentBookOnGoogleScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentBookOnGoogleScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentBookOnGoogleScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrentBookOnGoogleScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CurrentBookOnGoogleScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CURRENT_BOOK_ON_GOOGLE_SCORE = "currentBookOnGoogleScore";
  @SerializedName(SERIALIZED_NAME_CURRENT_BOOK_ON_GOOGLE_SCORE)
  private CurrentBookOnGoogleScoreEnum currentBookOnGoogleScore;

  /**
   * The current price accuracy score combining both website and Book on Google scores.
   */
  @JsonAdapter(CurrentOverallScoreEnum.Adapter.class)
  public enum CurrentOverallScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    CurrentOverallScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentOverallScoreEnum fromValue(String value) {
      for (CurrentOverallScoreEnum b : CurrentOverallScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrentOverallScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentOverallScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentOverallScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrentOverallScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CurrentOverallScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CURRENT_OVERALL_SCORE = "currentOverallScore";
  @SerializedName(SERIALIZED_NAME_CURRENT_OVERALL_SCORE)
  private CurrentOverallScoreEnum currentOverallScore;

  /**
   * The current price accuracy score. Contains the same value as &#x60;current_website_score&#x60;. For clarity, use either &#x60;current_website_score&#x60; or &#39;current_overall_score&#x60; depending upon which is needed.
   */
  @JsonAdapter(CurrentScoreEnum.Adapter.class)
  public enum CurrentScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    CurrentScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentScoreEnum fromValue(String value) {
      for (CurrentScoreEnum b : CurrentScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrentScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrentScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CurrentScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CURRENT_SCORE = "currentScore";
  @SerializedName(SERIALIZED_NAME_CURRENT_SCORE)
  private CurrentScoreEnum currentScore;

  /**
   * The current website price accuracy score.
   */
  @JsonAdapter(CurrentWebsiteScoreEnum.Adapter.class)
  public enum CurrentWebsiteScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    CurrentWebsiteScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentWebsiteScoreEnum fromValue(String value) {
      for (CurrentWebsiteScoreEnum b : CurrentWebsiteScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrentWebsiteScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentWebsiteScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentWebsiteScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrentWebsiteScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CurrentWebsiteScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CURRENT_WEBSITE_SCORE = "currentWebsiteScore";
  @SerializedName(SERIALIZED_NAME_CURRENT_WEBSITE_SCORE)
  private CurrentWebsiteScoreEnum currentWebsiteScore;

  /**
   * The predicted Book on Google price accuracy score.
   */
  @JsonAdapter(PredictedBookOnGoogleScoreEnum.Adapter.class)
  public enum PredictedBookOnGoogleScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    PredictedBookOnGoogleScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PredictedBookOnGoogleScoreEnum fromValue(String value) {
      for (PredictedBookOnGoogleScoreEnum b : PredictedBookOnGoogleScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PredictedBookOnGoogleScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PredictedBookOnGoogleScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PredictedBookOnGoogleScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PredictedBookOnGoogleScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PredictedBookOnGoogleScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PREDICTED_BOOK_ON_GOOGLE_SCORE = "predictedBookOnGoogleScore";
  @SerializedName(SERIALIZED_NAME_PREDICTED_BOOK_ON_GOOGLE_SCORE)
  private PredictedBookOnGoogleScoreEnum predictedBookOnGoogleScore;

  /**
   * The predicted price accuracy score combining both website and Book on Google scores.
   */
  @JsonAdapter(PredictedOverallScoreEnum.Adapter.class)
  public enum PredictedOverallScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    PredictedOverallScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PredictedOverallScoreEnum fromValue(String value) {
      for (PredictedOverallScoreEnum b : PredictedOverallScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PredictedOverallScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PredictedOverallScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PredictedOverallScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PredictedOverallScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PredictedOverallScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PREDICTED_OVERALL_SCORE = "predictedOverallScore";
  @SerializedName(SERIALIZED_NAME_PREDICTED_OVERALL_SCORE)
  private PredictedOverallScoreEnum predictedOverallScore;

  /**
   * The predicted price accuracy score. Contains the same value as &#x60;predicted_website_score&#x60;. For clarity, use either &#x60;predicted_website_score&#x60; or &#39;predicted_overall_score&#x60; depending upon which is needed.
   */
  @JsonAdapter(PredictedScoreEnum.Adapter.class)
  public enum PredictedScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    PredictedScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PredictedScoreEnum fromValue(String value) {
      for (PredictedScoreEnum b : PredictedScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PredictedScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PredictedScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PredictedScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PredictedScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PredictedScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PREDICTED_SCORE = "predictedScore";
  @SerializedName(SERIALIZED_NAME_PREDICTED_SCORE)
  private PredictedScoreEnum predictedScore;

  /**
   * The predicted website price accuracy score.
   */
  @JsonAdapter(PredictedWebsiteScoreEnum.Adapter.class)
  public enum PredictedWebsiteScoreEnum {
    PRICE_ACCURACY_STATE_UNSPECIFIED("PRICE_ACCURACY_STATE_UNSPECIFIED"),
    
    PRICE_ACCURACY_STATE_UNKNOWN("PRICE_ACCURACY_STATE_UNKNOWN"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    POOR("POOR"),
    
    AT_RISK("AT_RISK"),
    
    FAILED("FAILED");

    private String value;

    PredictedWebsiteScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PredictedWebsiteScoreEnum fromValue(String value) {
      for (PredictedWebsiteScoreEnum b : PredictedWebsiteScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PredictedWebsiteScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PredictedWebsiteScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PredictedWebsiteScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PredictedWebsiteScoreEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PredictedWebsiteScoreEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PREDICTED_WEBSITE_SCORE = "predictedWebsiteScore";
  @SerializedName(SERIALIZED_NAME_PREDICTED_WEBSITE_SCORE)
  private PredictedWebsiteScoreEnum predictedWebsiteScore;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public SummarizePriceAccuracyResponse() {
  }

  public SummarizePriceAccuracyResponse currentBookOnGoogleScore(CurrentBookOnGoogleScoreEnum currentBookOnGoogleScore) {
    this.currentBookOnGoogleScore = currentBookOnGoogleScore;
    return this;
  }

  /**
   * The current Book on Google price accuracy score.
   * @return currentBookOnGoogleScore
   */
  @javax.annotation.Nullable
  public CurrentBookOnGoogleScoreEnum getCurrentBookOnGoogleScore() {
    return currentBookOnGoogleScore;
  }

  public void setCurrentBookOnGoogleScore(CurrentBookOnGoogleScoreEnum currentBookOnGoogleScore) {
    this.currentBookOnGoogleScore = currentBookOnGoogleScore;
  }


  public SummarizePriceAccuracyResponse currentOverallScore(CurrentOverallScoreEnum currentOverallScore) {
    this.currentOverallScore = currentOverallScore;
    return this;
  }

  /**
   * The current price accuracy score combining both website and Book on Google scores.
   * @return currentOverallScore
   */
  @javax.annotation.Nullable
  public CurrentOverallScoreEnum getCurrentOverallScore() {
    return currentOverallScore;
  }

  public void setCurrentOverallScore(CurrentOverallScoreEnum currentOverallScore) {
    this.currentOverallScore = currentOverallScore;
  }


  public SummarizePriceAccuracyResponse currentScore(CurrentScoreEnum currentScore) {
    this.currentScore = currentScore;
    return this;
  }

  /**
   * The current price accuracy score. Contains the same value as &#x60;current_website_score&#x60;. For clarity, use either &#x60;current_website_score&#x60; or &#39;current_overall_score&#x60; depending upon which is needed.
   * @return currentScore
   */
  @javax.annotation.Nullable
  public CurrentScoreEnum getCurrentScore() {
    return currentScore;
  }

  public void setCurrentScore(CurrentScoreEnum currentScore) {
    this.currentScore = currentScore;
  }


  public SummarizePriceAccuracyResponse currentWebsiteScore(CurrentWebsiteScoreEnum currentWebsiteScore) {
    this.currentWebsiteScore = currentWebsiteScore;
    return this;
  }

  /**
   * The current website price accuracy score.
   * @return currentWebsiteScore
   */
  @javax.annotation.Nullable
  public CurrentWebsiteScoreEnum getCurrentWebsiteScore() {
    return currentWebsiteScore;
  }

  public void setCurrentWebsiteScore(CurrentWebsiteScoreEnum currentWebsiteScore) {
    this.currentWebsiteScore = currentWebsiteScore;
  }


  public SummarizePriceAccuracyResponse predictedBookOnGoogleScore(PredictedBookOnGoogleScoreEnum predictedBookOnGoogleScore) {
    this.predictedBookOnGoogleScore = predictedBookOnGoogleScore;
    return this;
  }

  /**
   * The predicted Book on Google price accuracy score.
   * @return predictedBookOnGoogleScore
   */
  @javax.annotation.Nullable
  public PredictedBookOnGoogleScoreEnum getPredictedBookOnGoogleScore() {
    return predictedBookOnGoogleScore;
  }

  public void setPredictedBookOnGoogleScore(PredictedBookOnGoogleScoreEnum predictedBookOnGoogleScore) {
    this.predictedBookOnGoogleScore = predictedBookOnGoogleScore;
  }


  public SummarizePriceAccuracyResponse predictedOverallScore(PredictedOverallScoreEnum predictedOverallScore) {
    this.predictedOverallScore = predictedOverallScore;
    return this;
  }

  /**
   * The predicted price accuracy score combining both website and Book on Google scores.
   * @return predictedOverallScore
   */
  @javax.annotation.Nullable
  public PredictedOverallScoreEnum getPredictedOverallScore() {
    return predictedOverallScore;
  }

  public void setPredictedOverallScore(PredictedOverallScoreEnum predictedOverallScore) {
    this.predictedOverallScore = predictedOverallScore;
  }


  public SummarizePriceAccuracyResponse predictedScore(PredictedScoreEnum predictedScore) {
    this.predictedScore = predictedScore;
    return this;
  }

  /**
   * The predicted price accuracy score. Contains the same value as &#x60;predicted_website_score&#x60;. For clarity, use either &#x60;predicted_website_score&#x60; or &#39;predicted_overall_score&#x60; depending upon which is needed.
   * @return predictedScore
   */
  @javax.annotation.Nullable
  public PredictedScoreEnum getPredictedScore() {
    return predictedScore;
  }

  public void setPredictedScore(PredictedScoreEnum predictedScore) {
    this.predictedScore = predictedScore;
  }


  public SummarizePriceAccuracyResponse predictedWebsiteScore(PredictedWebsiteScoreEnum predictedWebsiteScore) {
    this.predictedWebsiteScore = predictedWebsiteScore;
    return this;
  }

  /**
   * The predicted website price accuracy score.
   * @return predictedWebsiteScore
   */
  @javax.annotation.Nullable
  public PredictedWebsiteScoreEnum getPredictedWebsiteScore() {
    return predictedWebsiteScore;
  }

  public void setPredictedWebsiteScore(PredictedWebsiteScoreEnum predictedWebsiteScore) {
    this.predictedWebsiteScore = predictedWebsiteScore;
  }


  public SummarizePriceAccuracyResponse updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The update timestamp for the current score.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarizePriceAccuracyResponse summarizePriceAccuracyResponse = (SummarizePriceAccuracyResponse) o;
    return Objects.equals(this.currentBookOnGoogleScore, summarizePriceAccuracyResponse.currentBookOnGoogleScore) &&
        Objects.equals(this.currentOverallScore, summarizePriceAccuracyResponse.currentOverallScore) &&
        Objects.equals(this.currentScore, summarizePriceAccuracyResponse.currentScore) &&
        Objects.equals(this.currentWebsiteScore, summarizePriceAccuracyResponse.currentWebsiteScore) &&
        Objects.equals(this.predictedBookOnGoogleScore, summarizePriceAccuracyResponse.predictedBookOnGoogleScore) &&
        Objects.equals(this.predictedOverallScore, summarizePriceAccuracyResponse.predictedOverallScore) &&
        Objects.equals(this.predictedScore, summarizePriceAccuracyResponse.predictedScore) &&
        Objects.equals(this.predictedWebsiteScore, summarizePriceAccuracyResponse.predictedWebsiteScore) &&
        Objects.equals(this.updateTime, summarizePriceAccuracyResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentBookOnGoogleScore, currentOverallScore, currentScore, currentWebsiteScore, predictedBookOnGoogleScore, predictedOverallScore, predictedScore, predictedWebsiteScore, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarizePriceAccuracyResponse {\n");
    sb.append("    currentBookOnGoogleScore: ").append(toIndentedString(currentBookOnGoogleScore)).append("\n");
    sb.append("    currentOverallScore: ").append(toIndentedString(currentOverallScore)).append("\n");
    sb.append("    currentScore: ").append(toIndentedString(currentScore)).append("\n");
    sb.append("    currentWebsiteScore: ").append(toIndentedString(currentWebsiteScore)).append("\n");
    sb.append("    predictedBookOnGoogleScore: ").append(toIndentedString(predictedBookOnGoogleScore)).append("\n");
    sb.append("    predictedOverallScore: ").append(toIndentedString(predictedOverallScore)).append("\n");
    sb.append("    predictedScore: ").append(toIndentedString(predictedScore)).append("\n");
    sb.append("    predictedWebsiteScore: ").append(toIndentedString(predictedWebsiteScore)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("currentBookOnGoogleScore");
    openapiFields.add("currentOverallScore");
    openapiFields.add("currentScore");
    openapiFields.add("currentWebsiteScore");
    openapiFields.add("predictedBookOnGoogleScore");
    openapiFields.add("predictedOverallScore");
    openapiFields.add("predictedScore");
    openapiFields.add("predictedWebsiteScore");
    openapiFields.add("updateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SummarizePriceAccuracyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SummarizePriceAccuracyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SummarizePriceAccuracyResponse is not found in the empty JSON string", SummarizePriceAccuracyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SummarizePriceAccuracyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SummarizePriceAccuracyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currentBookOnGoogleScore") != null && !jsonObj.get("currentBookOnGoogleScore").isJsonNull()) && !jsonObj.get("currentBookOnGoogleScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentBookOnGoogleScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentBookOnGoogleScore").toString()));
      }
      // validate the optional field `currentBookOnGoogleScore`
      if (jsonObj.get("currentBookOnGoogleScore") != null && !jsonObj.get("currentBookOnGoogleScore").isJsonNull()) {
        CurrentBookOnGoogleScoreEnum.validateJsonElement(jsonObj.get("currentBookOnGoogleScore"));
      }
      if ((jsonObj.get("currentOverallScore") != null && !jsonObj.get("currentOverallScore").isJsonNull()) && !jsonObj.get("currentOverallScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentOverallScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentOverallScore").toString()));
      }
      // validate the optional field `currentOverallScore`
      if (jsonObj.get("currentOverallScore") != null && !jsonObj.get("currentOverallScore").isJsonNull()) {
        CurrentOverallScoreEnum.validateJsonElement(jsonObj.get("currentOverallScore"));
      }
      if ((jsonObj.get("currentScore") != null && !jsonObj.get("currentScore").isJsonNull()) && !jsonObj.get("currentScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentScore").toString()));
      }
      // validate the optional field `currentScore`
      if (jsonObj.get("currentScore") != null && !jsonObj.get("currentScore").isJsonNull()) {
        CurrentScoreEnum.validateJsonElement(jsonObj.get("currentScore"));
      }
      if ((jsonObj.get("currentWebsiteScore") != null && !jsonObj.get("currentWebsiteScore").isJsonNull()) && !jsonObj.get("currentWebsiteScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentWebsiteScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentWebsiteScore").toString()));
      }
      // validate the optional field `currentWebsiteScore`
      if (jsonObj.get("currentWebsiteScore") != null && !jsonObj.get("currentWebsiteScore").isJsonNull()) {
        CurrentWebsiteScoreEnum.validateJsonElement(jsonObj.get("currentWebsiteScore"));
      }
      if ((jsonObj.get("predictedBookOnGoogleScore") != null && !jsonObj.get("predictedBookOnGoogleScore").isJsonNull()) && !jsonObj.get("predictedBookOnGoogleScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predictedBookOnGoogleScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predictedBookOnGoogleScore").toString()));
      }
      // validate the optional field `predictedBookOnGoogleScore`
      if (jsonObj.get("predictedBookOnGoogleScore") != null && !jsonObj.get("predictedBookOnGoogleScore").isJsonNull()) {
        PredictedBookOnGoogleScoreEnum.validateJsonElement(jsonObj.get("predictedBookOnGoogleScore"));
      }
      if ((jsonObj.get("predictedOverallScore") != null && !jsonObj.get("predictedOverallScore").isJsonNull()) && !jsonObj.get("predictedOverallScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predictedOverallScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predictedOverallScore").toString()));
      }
      // validate the optional field `predictedOverallScore`
      if (jsonObj.get("predictedOverallScore") != null && !jsonObj.get("predictedOverallScore").isJsonNull()) {
        PredictedOverallScoreEnum.validateJsonElement(jsonObj.get("predictedOverallScore"));
      }
      if ((jsonObj.get("predictedScore") != null && !jsonObj.get("predictedScore").isJsonNull()) && !jsonObj.get("predictedScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predictedScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predictedScore").toString()));
      }
      // validate the optional field `predictedScore`
      if (jsonObj.get("predictedScore") != null && !jsonObj.get("predictedScore").isJsonNull()) {
        PredictedScoreEnum.validateJsonElement(jsonObj.get("predictedScore"));
      }
      if ((jsonObj.get("predictedWebsiteScore") != null && !jsonObj.get("predictedWebsiteScore").isJsonNull()) && !jsonObj.get("predictedWebsiteScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predictedWebsiteScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predictedWebsiteScore").toString()));
      }
      // validate the optional field `predictedWebsiteScore`
      if (jsonObj.get("predictedWebsiteScore") != null && !jsonObj.get("predictedWebsiteScore").isJsonNull()) {
        PredictedWebsiteScoreEnum.validateJsonElement(jsonObj.get("predictedWebsiteScore"));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SummarizePriceAccuracyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SummarizePriceAccuracyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SummarizePriceAccuracyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SummarizePriceAccuracyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SummarizePriceAccuracyResponse>() {
           @Override
           public void write(JsonWriter out, SummarizePriceAccuracyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SummarizePriceAccuracyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SummarizePriceAccuracyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SummarizePriceAccuracyResponse
   * @throws IOException if the JSON string is invalid with respect to SummarizePriceAccuracyResponse
   */
  public static SummarizePriceAccuracyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SummarizePriceAccuracyResponse.class);
  }

  /**
   * Convert an instance of SummarizePriceAccuracyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

