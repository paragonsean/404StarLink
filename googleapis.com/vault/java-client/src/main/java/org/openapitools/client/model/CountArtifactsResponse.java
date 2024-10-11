/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
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
import java.util.Arrays;
import org.openapitools.client.model.GroupsCountResult;
import org.openapitools.client.model.MailCountResult;

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
 * Definition of the response for method CountArtifacts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CountArtifactsResponse {
  public static final String SERIALIZED_NAME_GROUPS_COUNT_RESULT = "groupsCountResult";
  @SerializedName(SERIALIZED_NAME_GROUPS_COUNT_RESULT)
  private GroupsCountResult groupsCountResult;

  public static final String SERIALIZED_NAME_MAIL_COUNT_RESULT = "mailCountResult";
  @SerializedName(SERIALIZED_NAME_MAIL_COUNT_RESULT)
  private MailCountResult mailCountResult;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private String totalCount;

  public CountArtifactsResponse() {
  }

  public CountArtifactsResponse groupsCountResult(GroupsCountResult groupsCountResult) {
    this.groupsCountResult = groupsCountResult;
    return this;
  }

  /**
   * Get groupsCountResult
   * @return groupsCountResult
   */
  @javax.annotation.Nullable
  public GroupsCountResult getGroupsCountResult() {
    return groupsCountResult;
  }

  public void setGroupsCountResult(GroupsCountResult groupsCountResult) {
    this.groupsCountResult = groupsCountResult;
  }


  public CountArtifactsResponse mailCountResult(MailCountResult mailCountResult) {
    this.mailCountResult = mailCountResult;
    return this;
  }

  /**
   * Get mailCountResult
   * @return mailCountResult
   */
  @javax.annotation.Nullable
  public MailCountResult getMailCountResult() {
    return mailCountResult;
  }

  public void setMailCountResult(MailCountResult mailCountResult) {
    this.mailCountResult = mailCountResult;
  }


  public CountArtifactsResponse totalCount(String totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total count of messages.
   * @return totalCount
   */
  @javax.annotation.Nullable
  public String getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountArtifactsResponse countArtifactsResponse = (CountArtifactsResponse) o;
    return Objects.equals(this.groupsCountResult, countArtifactsResponse.groupsCountResult) &&
        Objects.equals(this.mailCountResult, countArtifactsResponse.mailCountResult) &&
        Objects.equals(this.totalCount, countArtifactsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupsCountResult, mailCountResult, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountArtifactsResponse {\n");
    sb.append("    groupsCountResult: ").append(toIndentedString(groupsCountResult)).append("\n");
    sb.append("    mailCountResult: ").append(toIndentedString(mailCountResult)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("groupsCountResult");
    openapiFields.add("mailCountResult");
    openapiFields.add("totalCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CountArtifactsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CountArtifactsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CountArtifactsResponse is not found in the empty JSON string", CountArtifactsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CountArtifactsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CountArtifactsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `groupsCountResult`
      if (jsonObj.get("groupsCountResult") != null && !jsonObj.get("groupsCountResult").isJsonNull()) {
        GroupsCountResult.validateJsonElement(jsonObj.get("groupsCountResult"));
      }
      // validate the optional field `mailCountResult`
      if (jsonObj.get("mailCountResult") != null && !jsonObj.get("mailCountResult").isJsonNull()) {
        MailCountResult.validateJsonElement(jsonObj.get("mailCountResult"));
      }
      if ((jsonObj.get("totalCount") != null && !jsonObj.get("totalCount").isJsonNull()) && !jsonObj.get("totalCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CountArtifactsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CountArtifactsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CountArtifactsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CountArtifactsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CountArtifactsResponse>() {
           @Override
           public void write(JsonWriter out, CountArtifactsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CountArtifactsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CountArtifactsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CountArtifactsResponse
   * @throws IOException if the JSON string is invalid with respect to CountArtifactsResponse
   */
  public static CountArtifactsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CountArtifactsResponse.class);
  }

  /**
   * Convert an instance of CountArtifactsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

