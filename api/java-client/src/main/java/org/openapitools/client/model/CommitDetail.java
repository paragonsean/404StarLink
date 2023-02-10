/*
 * CircleCI REST API
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
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
import java.net.URI;
import java.time.OffsetDateTime;
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
 * CommitDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:35.022082-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CommitDetail {
  public static final String SERIALIZED_NAME_AUTHOR_DATE = "author_date";
  @SerializedName(SERIALIZED_NAME_AUTHOR_DATE)
  private OffsetDateTime authorDate;

  public static final String SERIALIZED_NAME_AUTHOR_EMAIL = "author_email";
  @SerializedName(SERIALIZED_NAME_AUTHOR_EMAIL)
  private String authorEmail;

  public static final String SERIALIZED_NAME_AUTHOR_LOGIN = "author_login";
  @SerializedName(SERIALIZED_NAME_AUTHOR_LOGIN)
  private String authorLogin;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private String commit;

  public static final String SERIALIZED_NAME_COMMIT_URL = "commit_url";
  @SerializedName(SERIALIZED_NAME_COMMIT_URL)
  private URI commitUrl;

  public static final String SERIALIZED_NAME_COMMITTER_DATE = "committer_date";
  @SerializedName(SERIALIZED_NAME_COMMITTER_DATE)
  private OffsetDateTime committerDate;

  public static final String SERIALIZED_NAME_COMMITTER_EMAIL = "committer_email";
  @SerializedName(SERIALIZED_NAME_COMMITTER_EMAIL)
  private String committerEmail;

  public static final String SERIALIZED_NAME_COMMITTER_LOGIN = "committer_login";
  @SerializedName(SERIALIZED_NAME_COMMITTER_LOGIN)
  private String committerLogin;

  public static final String SERIALIZED_NAME_COMMITTER_NAME = "committer_name";
  @SerializedName(SERIALIZED_NAME_COMMITTER_NAME)
  private String committerName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public CommitDetail() {
  }

  public CommitDetail authorDate(OffsetDateTime authorDate) {
    this.authorDate = authorDate;
    return this;
  }

  /**
   * Get authorDate
   * @return authorDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getAuthorDate() {
    return authorDate;
  }

  public void setAuthorDate(OffsetDateTime authorDate) {
    this.authorDate = authorDate;
  }


  public CommitDetail authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

  /**
   * Get authorEmail
   * @return authorEmail
   */
  @javax.annotation.Nullable
  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }


  public CommitDetail authorLogin(String authorLogin) {
    this.authorLogin = authorLogin;
    return this;
  }

  /**
   * Get authorLogin
   * @return authorLogin
   */
  @javax.annotation.Nullable
  public String getAuthorLogin() {
    return authorLogin;
  }

  public void setAuthorLogin(String authorLogin) {
    this.authorLogin = authorLogin;
  }


  public CommitDetail authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * Get authorName
   * @return authorName
   */
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public CommitDetail body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  public CommitDetail commit(String commit) {
    this.commit = commit;
    return this;
  }

  /**
   * Get commit
   * @return commit
   */
  @javax.annotation.Nullable
  public String getCommit() {
    return commit;
  }

  public void setCommit(String commit) {
    this.commit = commit;
  }


  public CommitDetail commitUrl(URI commitUrl) {
    this.commitUrl = commitUrl;
    return this;
  }

  /**
   * Get commitUrl
   * @return commitUrl
   */
  @javax.annotation.Nullable
  public URI getCommitUrl() {
    return commitUrl;
  }

  public void setCommitUrl(URI commitUrl) {
    this.commitUrl = commitUrl;
  }


  public CommitDetail committerDate(OffsetDateTime committerDate) {
    this.committerDate = committerDate;
    return this;
  }

  /**
   * Get committerDate
   * @return committerDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCommitterDate() {
    return committerDate;
  }

  public void setCommitterDate(OffsetDateTime committerDate) {
    this.committerDate = committerDate;
  }


  public CommitDetail committerEmail(String committerEmail) {
    this.committerEmail = committerEmail;
    return this;
  }

  /**
   * Get committerEmail
   * @return committerEmail
   */
  @javax.annotation.Nullable
  public String getCommitterEmail() {
    return committerEmail;
  }

  public void setCommitterEmail(String committerEmail) {
    this.committerEmail = committerEmail;
  }


  public CommitDetail committerLogin(String committerLogin) {
    this.committerLogin = committerLogin;
    return this;
  }

  /**
   * Get committerLogin
   * @return committerLogin
   */
  @javax.annotation.Nullable
  public String getCommitterLogin() {
    return committerLogin;
  }

  public void setCommitterLogin(String committerLogin) {
    this.committerLogin = committerLogin;
  }


  public CommitDetail committerName(String committerName) {
    this.committerName = committerName;
    return this;
  }

  /**
   * Get committerName
   * @return committerName
   */
  @javax.annotation.Nullable
  public String getCommitterName() {
    return committerName;
  }

  public void setCommitterName(String committerName) {
    this.committerName = committerName;
  }


  public CommitDetail subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitDetail commitDetail = (CommitDetail) o;
    return Objects.equals(this.authorDate, commitDetail.authorDate) &&
        Objects.equals(this.authorEmail, commitDetail.authorEmail) &&
        Objects.equals(this.authorLogin, commitDetail.authorLogin) &&
        Objects.equals(this.authorName, commitDetail.authorName) &&
        Objects.equals(this.body, commitDetail.body) &&
        Objects.equals(this.commit, commitDetail.commit) &&
        Objects.equals(this.commitUrl, commitDetail.commitUrl) &&
        Objects.equals(this.committerDate, commitDetail.committerDate) &&
        Objects.equals(this.committerEmail, commitDetail.committerEmail) &&
        Objects.equals(this.committerLogin, commitDetail.committerLogin) &&
        Objects.equals(this.committerName, commitDetail.committerName) &&
        Objects.equals(this.subject, commitDetail.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorDate, authorEmail, authorLogin, authorName, body, commit, commitUrl, committerDate, committerEmail, committerLogin, committerName, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitDetail {\n");
    sb.append("    authorDate: ").append(toIndentedString(authorDate)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    authorLogin: ").append(toIndentedString(authorLogin)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
    sb.append("    committerDate: ").append(toIndentedString(committerDate)).append("\n");
    sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
    sb.append("    committerLogin: ").append(toIndentedString(committerLogin)).append("\n");
    sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("author_date");
    openapiFields.add("author_email");
    openapiFields.add("author_login");
    openapiFields.add("author_name");
    openapiFields.add("body");
    openapiFields.add("commit");
    openapiFields.add("commit_url");
    openapiFields.add("committer_date");
    openapiFields.add("committer_email");
    openapiFields.add("committer_login");
    openapiFields.add("committer_name");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommitDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommitDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommitDetail is not found in the empty JSON string", CommitDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommitDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommitDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("author_email") != null && !jsonObj.get("author_email").isJsonNull()) && !jsonObj.get("author_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_email").toString()));
      }
      if ((jsonObj.get("author_login") != null && !jsonObj.get("author_login").isJsonNull()) && !jsonObj.get("author_login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_login").toString()));
      }
      if ((jsonObj.get("author_name") != null && !jsonObj.get("author_name").isJsonNull()) && !jsonObj.get("author_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_name").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("commit") != null && !jsonObj.get("commit").isJsonNull()) && !jsonObj.get("commit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit").toString()));
      }
      if ((jsonObj.get("commit_url") != null && !jsonObj.get("commit_url").isJsonNull()) && !jsonObj.get("commit_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_url").toString()));
      }
      if ((jsonObj.get("committer_email") != null && !jsonObj.get("committer_email").isJsonNull()) && !jsonObj.get("committer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `committer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("committer_email").toString()));
      }
      if ((jsonObj.get("committer_login") != null && !jsonObj.get("committer_login").isJsonNull()) && !jsonObj.get("committer_login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `committer_login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("committer_login").toString()));
      }
      if ((jsonObj.get("committer_name") != null && !jsonObj.get("committer_name").isJsonNull()) && !jsonObj.get("committer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `committer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("committer_name").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommitDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommitDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommitDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommitDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<CommitDetail>() {
           @Override
           public void write(JsonWriter out, CommitDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommitDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommitDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommitDetail
   * @throws IOException if the JSON string is invalid with respect to CommitDetail
   */
  public static CommitDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommitDetail.class);
  }

  /**
   * Convert an instance of CommitDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

