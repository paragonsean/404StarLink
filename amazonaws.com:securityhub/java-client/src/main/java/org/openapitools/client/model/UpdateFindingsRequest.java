/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import org.openapitools.client.model.BatchUpdateFindingsRequestNote;
import org.openapitools.client.model.CreateInsightRequestFilters;

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
 * UpdateFindingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateFindingsRequest {
  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private CreateInsightRequestFilters filters;

  public static final String SERIALIZED_NAME_NOTE = "Note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private BatchUpdateFindingsRequestNote note;

  /**
   * The updated record state for the finding.
   */
  @JsonAdapter(RecordStateEnum.Adapter.class)
  public enum RecordStateEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED");

    private String value;

    RecordStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecordStateEnum fromValue(String value) {
      for (RecordStateEnum b : RecordStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecordStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RecordStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RecordStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RECORD_STATE = "RecordState";
  @SerializedName(SERIALIZED_NAME_RECORD_STATE)
  private RecordStateEnum recordState;

  public UpdateFindingsRequest() {
  }

  public UpdateFindingsRequest filters(CreateInsightRequestFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @javax.annotation.Nonnull
  public CreateInsightRequestFilters getFilters() {
    return filters;
  }

  public void setFilters(CreateInsightRequestFilters filters) {
    this.filters = filters;
  }


  public UpdateFindingsRequest note(BatchUpdateFindingsRequestNote note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
   */
  @javax.annotation.Nullable
  public BatchUpdateFindingsRequestNote getNote() {
    return note;
  }

  public void setNote(BatchUpdateFindingsRequestNote note) {
    this.note = note;
  }


  public UpdateFindingsRequest recordState(RecordStateEnum recordState) {
    this.recordState = recordState;
    return this;
  }

  /**
   * The updated record state for the finding.
   * @return recordState
   */
  @javax.annotation.Nullable
  public RecordStateEnum getRecordState() {
    return recordState;
  }

  public void setRecordState(RecordStateEnum recordState) {
    this.recordState = recordState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFindingsRequest updateFindingsRequest = (UpdateFindingsRequest) o;
    return Objects.equals(this.filters, updateFindingsRequest.filters) &&
        Objects.equals(this.note, updateFindingsRequest.note) &&
        Objects.equals(this.recordState, updateFindingsRequest.recordState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, note, recordState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFindingsRequest {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    recordState: ").append(toIndentedString(recordState)).append("\n");
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
    openapiFields.add("Filters");
    openapiFields.add("Note");
    openapiFields.add("RecordState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Filters");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateFindingsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFindingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFindingsRequest is not found in the empty JSON string", UpdateFindingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFindingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFindingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateFindingsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Filters`
      CreateInsightRequestFilters.validateJsonElement(jsonObj.get("Filters"));
      // validate the optional field `Note`
      if (jsonObj.get("Note") != null && !jsonObj.get("Note").isJsonNull()) {
        BatchUpdateFindingsRequestNote.validateJsonElement(jsonObj.get("Note"));
      }
      if ((jsonObj.get("RecordState") != null && !jsonObj.get("RecordState").isJsonNull()) && !jsonObj.get("RecordState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RecordState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RecordState").toString()));
      }
      // validate the optional field `RecordState`
      if (jsonObj.get("RecordState") != null && !jsonObj.get("RecordState").isJsonNull()) {
        RecordStateEnum.validateJsonElement(jsonObj.get("RecordState"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFindingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFindingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFindingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFindingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFindingsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateFindingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFindingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateFindingsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateFindingsRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateFindingsRequest
   */
  public static UpdateFindingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFindingsRequest.class);
  }

  /**
   * Convert an instance of UpdateFindingsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

