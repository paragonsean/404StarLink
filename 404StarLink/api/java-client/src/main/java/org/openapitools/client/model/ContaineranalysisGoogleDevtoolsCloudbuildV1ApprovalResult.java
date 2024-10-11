/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
 * ApprovalResult describes the decision and associated metadata of a manual approval of a build.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:49.449403-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult {
  public static final String SERIALIZED_NAME_APPROVAL_TIME = "approvalTime";
  @SerializedName(SERIALIZED_NAME_APPROVAL_TIME)
  private String approvalTime;

  public static final String SERIALIZED_NAME_APPROVER_ACCOUNT = "approverAccount";
  @SerializedName(SERIALIZED_NAME_APPROVER_ACCOUNT)
  private String approverAccount;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  /**
   * Required. The decision of this manual approval.
   */
  @JsonAdapter(DecisionEnum.Adapter.class)
  public enum DecisionEnum {
    DECISION_UNSPECIFIED("DECISION_UNSPECIFIED"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    DecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DecisionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DecisionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DecisionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private DecisionEnum decision;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult(
     String approvalTime, 
     String approverAccount
  ) {
    this();
    this.approvalTime = approvalTime;
    this.approverAccount = approverAccount;
  }

  /**
   * Output only. The time when the approval decision was made.
   * @return approvalTime
   */
  @javax.annotation.Nullable
  public String getApprovalTime() {
    return approvalTime;
  }



  /**
   * Output only. Email of the user that called the ApproveBuild API to approve or reject a build at the time that the API was called.
   * @return approverAccount
   */
  @javax.annotation.Nullable
  public String getApproverAccount() {
    return approverAccount;
  }



  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Optional. An optional comment for this manual approval result.
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult decision(DecisionEnum decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Required. The decision of this manual approval.
   * @return decision
   */
  @javax.annotation.Nullable
  public DecisionEnum getDecision() {
    return decision;
  }

  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Optional. An optional URL tied to this manual approval result. This field is essentially the same as comment, except that it will be rendered by the UI differently. An example use case is a link to an external job that approved this Build.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult containeranalysisGoogleDevtoolsCloudbuildV1ApprovalResult = (ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult) o;
    return Objects.equals(this.approvalTime, containeranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.approvalTime) &&
        Objects.equals(this.approverAccount, containeranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.approverAccount) &&
        Objects.equals(this.comment, containeranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.comment) &&
        Objects.equals(this.decision, containeranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.decision) &&
        Objects.equals(this.url, containeranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalTime, approverAccount, comment, decision, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult {\n");
    sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
    sb.append("    approverAccount: ").append(toIndentedString(approverAccount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("approvalTime");
    openapiFields.add("approverAccount");
    openapiFields.add("comment");
    openapiFields.add("decision");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("approvalTime") != null && !jsonObj.get("approvalTime").isJsonNull()) && !jsonObj.get("approvalTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvalTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvalTime").toString()));
      }
      if ((jsonObj.get("approverAccount") != null && !jsonObj.get("approverAccount").isJsonNull()) && !jsonObj.get("approverAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approverAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approverAccount").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("decision") != null && !jsonObj.get("decision").isJsonNull()) && !jsonObj.get("decision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decision").toString()));
      }
      // validate the optional field `decision`
      if (jsonObj.get("decision") != null && !jsonObj.get("decision").isJsonNull()) {
        DecisionEnum.validateJsonElement(jsonObj.get("decision"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

