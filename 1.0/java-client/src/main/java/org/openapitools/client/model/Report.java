/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Account;

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
 * Reports filed against users and/or statuses, to be taken action on by moderators.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:23.722002-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Report {
  public static final String SERIALIZED_NAME_ACTION_TAKEN = "action_taken";
  @SerializedName(SERIALIZED_NAME_ACTION_TAKEN)
  private Boolean actionTaken;

  public static final String SERIALIZED_NAME_ACTION_TAKEN_AT = "action_taken_at";
  @SerializedName(SERIALIZED_NAME_ACTION_TAKEN_AT)
  private OffsetDateTime actionTakenAt;

  /**
   * Gets or Sets category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    OTHER("other"),
    
    SPAM("spam"),
    
    VIOLATION("violation");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CategoryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FORWARDED = "forwarded";
  @SerializedName(SERIALIZED_NAME_FORWARDED)
  private Boolean forwarded;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RULE_IDS = "rule_ids";
  @SerializedName(SERIALIZED_NAME_RULE_IDS)
  private List<Integer> ruleIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS_IDS = "status_ids";
  @SerializedName(SERIALIZED_NAME_STATUS_IDS)
  private List<Integer> statusIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT = "target_account";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT)
  private Account targetAccount;

  public Report() {
  }

  public Report actionTaken(Boolean actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

  /**
   * Get actionTaken
   * @return actionTaken
   */
  @javax.annotation.Nullable
  public Boolean getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(Boolean actionTaken) {
    this.actionTaken = actionTaken;
  }


  public Report actionTakenAt(OffsetDateTime actionTakenAt) {
    this.actionTakenAt = actionTakenAt;
    return this;
  }

  /**
   * Get actionTakenAt
   * @return actionTakenAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getActionTakenAt() {
    return actionTakenAt;
  }

  public void setActionTakenAt(OffsetDateTime actionTakenAt) {
    this.actionTakenAt = actionTakenAt;
  }


  public Report category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nullable
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public Report comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public Report createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Report forwarded(Boolean forwarded) {
    this.forwarded = forwarded;
    return this;
  }

  /**
   * Get forwarded
   * @return forwarded
   */
  @javax.annotation.Nullable
  public Boolean getForwarded() {
    return forwarded;
  }

  public void setForwarded(Boolean forwarded) {
    this.forwarded = forwarded;
  }


  public Report id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Report ruleIds(List<Integer> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public Report addRuleIdsItem(Integer ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

  /**
   * Get ruleIds
   * @return ruleIds
   */
  @javax.annotation.Nullable
  public List<Integer> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<Integer> ruleIds) {
    this.ruleIds = ruleIds;
  }


  public Report statusIds(List<Integer> statusIds) {
    this.statusIds = statusIds;
    return this;
  }

  public Report addStatusIdsItem(Integer statusIdsItem) {
    if (this.statusIds == null) {
      this.statusIds = new ArrayList<>();
    }
    this.statusIds.add(statusIdsItem);
    return this;
  }

  /**
   * Get statusIds
   * @return statusIds
   */
  @javax.annotation.Nullable
  public List<Integer> getStatusIds() {
    return statusIds;
  }

  public void setStatusIds(List<Integer> statusIds) {
    this.statusIds = statusIds;
  }


  public Report targetAccount(Account targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * Get targetAccount
   * @return targetAccount
   */
  @javax.annotation.Nullable
  public Account getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(Account targetAccount) {
    this.targetAccount = targetAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.actionTaken, report.actionTaken) &&
        Objects.equals(this.actionTakenAt, report.actionTakenAt) &&
        Objects.equals(this.category, report.category) &&
        Objects.equals(this.comment, report.comment) &&
        Objects.equals(this.createdAt, report.createdAt) &&
        Objects.equals(this.forwarded, report.forwarded) &&
        Objects.equals(this.id, report.id) &&
        Objects.equals(this.ruleIds, report.ruleIds) &&
        Objects.equals(this.statusIds, report.statusIds) &&
        Objects.equals(this.targetAccount, report.targetAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTaken, actionTakenAt, category, comment, createdAt, forwarded, id, ruleIds, statusIds, targetAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    actionTakenAt: ").append(toIndentedString(actionTakenAt)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    forwarded: ").append(toIndentedString(forwarded)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
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
    openapiFields.add("action_taken");
    openapiFields.add("action_taken_at");
    openapiFields.add("category");
    openapiFields.add("comment");
    openapiFields.add("created_at");
    openapiFields.add("forwarded");
    openapiFields.add("id");
    openapiFields.add("rule_ids");
    openapiFields.add("status_ids");
    openapiFields.add("target_account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Report
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Report.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Report is not found in the empty JSON string", Report.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Report.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Report` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // validate the optional field `category`
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        CategoryEnum.validateJsonElement(jsonObj.get("category"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rule_ids") != null && !jsonObj.get("rule_ids").isJsonNull() && !jsonObj.get("rule_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_ids` to be an array in the JSON string but got `%s`", jsonObj.get("rule_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status_ids") != null && !jsonObj.get("status_ids").isJsonNull() && !jsonObj.get("status_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_ids` to be an array in the JSON string but got `%s`", jsonObj.get("status_ids").toString()));
      }
      // validate the optional field `target_account`
      if (jsonObj.get("target_account") != null && !jsonObj.get("target_account").isJsonNull()) {
        Account.validateJsonElement(jsonObj.get("target_account"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Report.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Report' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Report> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Report.class));

       return (TypeAdapter<T>) new TypeAdapter<Report>() {
           @Override
           public void write(JsonWriter out, Report value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Report read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Report given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Report
   * @throws IOException if the JSON string is invalid with respect to Report
   */
  public static Report fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Report.class);
  }

  /**
   * Convert an instance of Report to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

