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
import java.util.Map;
import org.openapitools.client.model.AnswerReason;

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
 * Input to update answer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:48.152112-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateAnswerInput {
  public static final String SERIALIZED_NAME_SELECTED_CHOICES = "SelectedChoices";
  @SerializedName(SERIALIZED_NAME_SELECTED_CHOICES)
  private List<String> selectedChoices = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHOICE_UPDATES = "ChoiceUpdates";
  @SerializedName(SERIALIZED_NAME_CHOICE_UPDATES)
  private Map choiceUpdates;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_IS_APPLICABLE = "IsApplicable";
  @SerializedName(SERIALIZED_NAME_IS_APPLICABLE)
  private Boolean isApplicable;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private AnswerReason reason;

  public UpdateAnswerInput() {
  }

  public UpdateAnswerInput selectedChoices(List<String> selectedChoices) {
    this.selectedChoices = selectedChoices;
    return this;
  }

  public UpdateAnswerInput addSelectedChoicesItem(String selectedChoicesItem) {
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


  public UpdateAnswerInput choiceUpdates(Map choiceUpdates) {
    this.choiceUpdates = choiceUpdates;
    return this;
  }

  /**
   * Get choiceUpdates
   * @return choiceUpdates
   */
  @javax.annotation.Nullable
  public Map getChoiceUpdates() {
    return choiceUpdates;
  }

  public void setChoiceUpdates(Map choiceUpdates) {
    this.choiceUpdates = choiceUpdates;
  }


  public UpdateAnswerInput notes(String notes) {
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


  public UpdateAnswerInput isApplicable(Boolean isApplicable) {
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


  public UpdateAnswerInput reason(AnswerReason reason) {
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
    UpdateAnswerInput updateAnswerInput = (UpdateAnswerInput) o;
    return Objects.equals(this.selectedChoices, updateAnswerInput.selectedChoices) &&
        Objects.equals(this.choiceUpdates, updateAnswerInput.choiceUpdates) &&
        Objects.equals(this.notes, updateAnswerInput.notes) &&
        Objects.equals(this.isApplicable, updateAnswerInput.isApplicable) &&
        Objects.equals(this.reason, updateAnswerInput.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedChoices, choiceUpdates, notes, isApplicable, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnswerInput {\n");
    sb.append("    selectedChoices: ").append(toIndentedString(selectedChoices)).append("\n");
    sb.append("    choiceUpdates: ").append(toIndentedString(choiceUpdates)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    isApplicable: ").append(toIndentedString(isApplicable)).append("\n");
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
    openapiFields.add("SelectedChoices");
    openapiFields.add("ChoiceUpdates");
    openapiFields.add("Notes");
    openapiFields.add("IsApplicable");
    openapiFields.add("Reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateAnswerInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAnswerInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAnswerInput is not found in the empty JSON string", UpdateAnswerInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAnswerInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAnswerInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("SelectedChoices") != null && !jsonObj.get("SelectedChoices").isJsonNull() && !jsonObj.get("SelectedChoices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectedChoices` to be an array in the JSON string but got `%s`", jsonObj.get("SelectedChoices").toString()));
      }
      // validate the optional field `ChoiceUpdates`
      if (jsonObj.get("ChoiceUpdates") != null && !jsonObj.get("ChoiceUpdates").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("ChoiceUpdates"));
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
       if (!UpdateAnswerInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAnswerInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAnswerInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAnswerInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAnswerInput>() {
           @Override
           public void write(JsonWriter out, UpdateAnswerInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAnswerInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAnswerInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAnswerInput
   * @throws IOException if the JSON string is invalid with respect to UpdateAnswerInput
   */
  public static UpdateAnswerInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAnswerInput.class);
  }

  /**
   * Convert an instance of UpdateAnswerInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

