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
 * A best practice, or question choice, that has been identified as a risk in this question.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:47.577947-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BestPractice {
  public static final String SERIALIZED_NAME_CHOICE_ID = "ChoiceId";
  @SerializedName(SERIALIZED_NAME_CHOICE_ID)
  private String choiceId;

  public static final String SERIALIZED_NAME_CHOICE_TITLE = "ChoiceTitle";
  @SerializedName(SERIALIZED_NAME_CHOICE_TITLE)
  private String choiceTitle;

  public BestPractice() {
  }

  public BestPractice choiceId(String choiceId) {
    this.choiceId = choiceId;
    return this;
  }

  /**
   * The ID of a choice.
   * @return choiceId
   */
  @javax.annotation.Nullable
  public String getChoiceId() {
    return choiceId;
  }

  public void setChoiceId(String choiceId) {
    this.choiceId = choiceId;
  }


  public BestPractice choiceTitle(String choiceTitle) {
    this.choiceTitle = choiceTitle;
    return this;
  }

  /**
   * The title of a choice.
   * @return choiceTitle
   */
  @javax.annotation.Nullable
  public String getChoiceTitle() {
    return choiceTitle;
  }

  public void setChoiceTitle(String choiceTitle) {
    this.choiceTitle = choiceTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BestPractice bestPractice = (BestPractice) o;
    return Objects.equals(this.choiceId, bestPractice.choiceId) &&
        Objects.equals(this.choiceTitle, bestPractice.choiceTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choiceId, choiceTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BestPractice {\n");
    sb.append("    choiceId: ").append(toIndentedString(choiceId)).append("\n");
    sb.append("    choiceTitle: ").append(toIndentedString(choiceTitle)).append("\n");
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
    openapiFields.add("ChoiceId");
    openapiFields.add("ChoiceTitle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BestPractice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BestPractice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BestPractice is not found in the empty JSON string", BestPractice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BestPractice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BestPractice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ChoiceId") != null && !jsonObj.get("ChoiceId").isJsonNull()) && !jsonObj.get("ChoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChoiceId").toString()));
      }
      if ((jsonObj.get("ChoiceTitle") != null && !jsonObj.get("ChoiceTitle").isJsonNull()) && !jsonObj.get("ChoiceTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChoiceTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChoiceTitle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BestPractice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BestPractice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BestPractice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BestPractice.class));

       return (TypeAdapter<T>) new TypeAdapter<BestPractice>() {
           @Override
           public void write(JsonWriter out, BestPractice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BestPractice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BestPractice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BestPractice
   * @throws IOException if the JSON string is invalid with respect to BestPractice
   */
  public static BestPractice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BestPractice.class);
  }

  /**
   * Convert an instance of BestPractice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

