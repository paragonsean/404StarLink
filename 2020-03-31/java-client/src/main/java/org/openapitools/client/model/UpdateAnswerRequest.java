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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ChoiceUpdate;

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
 * UpdateAnswerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateAnswerRequest {
  public static final String SERIALIZED_NAME_SELECTED_CHOICES = "SelectedChoices";
  @SerializedName(SERIALIZED_NAME_SELECTED_CHOICES)
  private List<String> selectedChoices = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHOICE_UPDATES = "ChoiceUpdates";
  @SerializedName(SERIALIZED_NAME_CHOICE_UPDATES)
  private Map<String, ChoiceUpdate> choiceUpdates = new HashMap<>();

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_IS_APPLICABLE = "IsApplicable";
  @SerializedName(SERIALIZED_NAME_IS_APPLICABLE)
  private Boolean isApplicable;

  /**
   * The reason why a question is not applicable to your workload.
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    OUT_OF_SCOPE("OUT_OF_SCOPE"),
    
    BUSINESS_PRIORITIES("BUSINESS_PRIORITIES"),
    
    ARCHITECTURE_CONSTRAINTS("ARCHITECTURE_CONSTRAINTS"),
    
    OTHER("OTHER"),
    
    NONE("NONE");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public UpdateAnswerRequest() {
  }

  public UpdateAnswerRequest selectedChoices(List<String> selectedChoices) {
    this.selectedChoices = selectedChoices;
    return this;
  }

  public UpdateAnswerRequest addSelectedChoicesItem(String selectedChoicesItem) {
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


  public UpdateAnswerRequest choiceUpdates(Map<String, ChoiceUpdate> choiceUpdates) {
    this.choiceUpdates = choiceUpdates;
    return this;
  }

  public UpdateAnswerRequest putChoiceUpdatesItem(String key, ChoiceUpdate choiceUpdatesItem) {
    if (this.choiceUpdates == null) {
      this.choiceUpdates = new HashMap<>();
    }
    this.choiceUpdates.put(key, choiceUpdatesItem);
    return this;
  }

  /**
   * A list of choices to update on a question in your workload. The String key corresponds to the choice ID to be updated.
   * @return choiceUpdates
   */
  @javax.annotation.Nullable
  public Map<String, ChoiceUpdate> getChoiceUpdates() {
    return choiceUpdates;
  }

  public void setChoiceUpdates(Map<String, ChoiceUpdate> choiceUpdates) {
    this.choiceUpdates = choiceUpdates;
  }


  public UpdateAnswerRequest notes(String notes) {
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


  public UpdateAnswerRequest isApplicable(Boolean isApplicable) {
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


  public UpdateAnswerRequest reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason why a question is not applicable to your workload.
   * @return reason
   */
  @javax.annotation.Nullable
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
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
    UpdateAnswerRequest updateAnswerRequest = (UpdateAnswerRequest) o;
    return Objects.equals(this.selectedChoices, updateAnswerRequest.selectedChoices) &&
        Objects.equals(this.choiceUpdates, updateAnswerRequest.choiceUpdates) &&
        Objects.equals(this.notes, updateAnswerRequest.notes) &&
        Objects.equals(this.isApplicable, updateAnswerRequest.isApplicable) &&
        Objects.equals(this.reason, updateAnswerRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedChoices, choiceUpdates, notes, isApplicable, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnswerRequest {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to UpdateAnswerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAnswerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAnswerRequest is not found in the empty JSON string", UpdateAnswerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAnswerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAnswerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("SelectedChoices") != null && !jsonObj.get("SelectedChoices").isJsonNull() && !jsonObj.get("SelectedChoices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectedChoices` to be an array in the JSON string but got `%s`", jsonObj.get("SelectedChoices").toString()));
      }
      if ((jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonNull()) && !jsonObj.get("Notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      if ((jsonObj.get("Reason") != null && !jsonObj.get("Reason").isJsonNull()) && !jsonObj.get("Reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Reason").toString()));
      }
      // validate the optional field `Reason`
      if (jsonObj.get("Reason") != null && !jsonObj.get("Reason").isJsonNull()) {
        ReasonEnum.validateJsonElement(jsonObj.get("Reason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAnswerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAnswerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAnswerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAnswerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAnswerRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAnswerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAnswerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAnswerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAnswerRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateAnswerRequest
   */
  public static UpdateAnswerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAnswerRequest.class);
  }

  /**
   * Convert an instance of UpdateAnswerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

