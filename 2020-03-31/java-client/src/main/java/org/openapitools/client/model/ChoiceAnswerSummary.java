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
import org.openapitools.client.model.ChoiceReason;
import org.openapitools.client.model.ChoiceStatus;

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
 * A choice summary that has been answered on a question in your workload.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:48.152112-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ChoiceAnswerSummary {
  public static final String SERIALIZED_NAME_CHOICE_ID = "ChoiceId";
  @SerializedName(SERIALIZED_NAME_CHOICE_ID)
  private String choiceId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ChoiceStatus status;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ChoiceReason reason;

  public ChoiceAnswerSummary() {
  }

  public ChoiceAnswerSummary choiceId(String choiceId) {
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


  public ChoiceAnswerSummary status(ChoiceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ChoiceStatus getStatus() {
    return status;
  }

  public void setStatus(ChoiceStatus status) {
    this.status = status;
  }


  public ChoiceAnswerSummary reason(ChoiceReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nullable
  public ChoiceReason getReason() {
    return reason;
  }

  public void setReason(ChoiceReason reason) {
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
    ChoiceAnswerSummary choiceAnswerSummary = (ChoiceAnswerSummary) o;
    return Objects.equals(this.choiceId, choiceAnswerSummary.choiceId) &&
        Objects.equals(this.status, choiceAnswerSummary.status) &&
        Objects.equals(this.reason, choiceAnswerSummary.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choiceId, status, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoiceAnswerSummary {\n");
    sb.append("    choiceId: ").append(toIndentedString(choiceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ChoiceId");
    openapiFields.add("Status");
    openapiFields.add("Reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChoiceAnswerSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChoiceAnswerSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChoiceAnswerSummary is not found in the empty JSON string", ChoiceAnswerSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChoiceAnswerSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChoiceAnswerSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ChoiceId") != null && !jsonObj.get("ChoiceId").isJsonNull()) && !jsonObj.get("ChoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChoiceId").toString()));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ChoiceStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Reason`
      if (jsonObj.get("Reason") != null && !jsonObj.get("Reason").isJsonNull()) {
        ChoiceReason.validateJsonElement(jsonObj.get("Reason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChoiceAnswerSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChoiceAnswerSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChoiceAnswerSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChoiceAnswerSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ChoiceAnswerSummary>() {
           @Override
           public void write(JsonWriter out, ChoiceAnswerSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChoiceAnswerSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChoiceAnswerSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChoiceAnswerSummary
   * @throws IOException if the JSON string is invalid with respect to ChoiceAnswerSummary
   */
  public static ChoiceAnswerSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChoiceAnswerSummary.class);
  }

  /**
   * Convert an instance of ChoiceAnswerSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

