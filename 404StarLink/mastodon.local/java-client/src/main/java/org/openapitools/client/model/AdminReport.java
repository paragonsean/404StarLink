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
import org.openapitools.client.model.Status;

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
 * Admin-level information about a filed report.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:45.133390-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AdminReport {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_ACTION_TAKEN = "action_taken";
  @SerializedName(SERIALIZED_NAME_ACTION_TAKEN)
  private String actionTaken;

  public static final String SERIALIZED_NAME_ASSIGNED_ACCOUNT = "assigned_account";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_ACCOUNT)
  private Account assignedAccount;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<Status> statuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT = "target_account";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT)
  private Account targetAccount;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AdminReport() {
  }

  public AdminReport account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }


  public AdminReport actionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

  /**
   * The action taken to resolve this report. Enumerable oneOf.
   * @return actionTaken
   */
  @javax.annotation.Nullable
  public String getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
  }


  public AdminReport assignedAccount(Account assignedAccount) {
    this.assignedAccount = assignedAccount;
    return this;
  }

  /**
   * Get assignedAccount
   * @return assignedAccount
   */
  @javax.annotation.Nullable
  public Account getAssignedAccount() {
    return assignedAccount;
  }

  public void setAssignedAccount(Account assignedAccount) {
    this.assignedAccount = assignedAccount;
  }


  public AdminReport comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * An optional reason for reporting.
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public AdminReport createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the report was filed.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AdminReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the report in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AdminReport statuses(List<Status> statuses) {
    this.statuses = statuses;
    return this;
  }

  public AdminReport addStatusesItem(Status statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Statuses attached to the report, for context.
   * @return statuses
   */
  @javax.annotation.Nullable
  public List<Status> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<Status> statuses) {
    this.statuses = statuses;
  }


  public AdminReport targetAccount(Account targetAccount) {
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


  public AdminReport updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time of last action on this report.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminReport adminReport = (AdminReport) o;
    return Objects.equals(this.account, adminReport.account) &&
        Objects.equals(this.actionTaken, adminReport.actionTaken) &&
        Objects.equals(this.assignedAccount, adminReport.assignedAccount) &&
        Objects.equals(this.comment, adminReport.comment) &&
        Objects.equals(this.createdAt, adminReport.createdAt) &&
        Objects.equals(this.id, adminReport.id) &&
        Objects.equals(this.statuses, adminReport.statuses) &&
        Objects.equals(this.targetAccount, adminReport.targetAccount) &&
        Objects.equals(this.updatedAt, adminReport.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, actionTaken, assignedAccount, comment, createdAt, id, statuses, targetAccount, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminReport {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    assignedAccount: ").append(toIndentedString(assignedAccount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("action_taken");
    openapiFields.add("assigned_account");
    openapiFields.add("comment");
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("statuses");
    openapiFields.add("target_account");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdminReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdminReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminReport is not found in the empty JSON string", AdminReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdminReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        Account.validateJsonElement(jsonObj.get("account"));
      }
      if ((jsonObj.get("action_taken") != null && !jsonObj.get("action_taken").isJsonNull()) && !jsonObj.get("action_taken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_taken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_taken").toString()));
      }
      // validate the optional field `assigned_account`
      if (jsonObj.get("assigned_account") != null && !jsonObj.get("assigned_account").isJsonNull()) {
        Account.validateJsonElement(jsonObj.get("assigned_account"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
        if (jsonArraystatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
          }

          // validate the optional field `statuses` (array)
          for (int i = 0; i < jsonArraystatuses.size(); i++) {
            Status.validateJsonElement(jsonArraystatuses.get(i));
          };
        }
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
       if (!AdminReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminReport.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminReport>() {
           @Override
           public void write(JsonWriter out, AdminReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdminReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdminReport
   * @throws IOException if the JSON string is invalid with respect to AdminReport
   */
  public static AdminReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminReport.class);
  }

  /**
   * Convert an instance of AdminReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

