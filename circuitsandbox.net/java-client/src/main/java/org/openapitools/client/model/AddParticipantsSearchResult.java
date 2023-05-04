/*
 * REST API Version 2
 * Circuit REST API to interact with the Circuit system.  [Learn more about the Circuit Development Community](https://www.circuit.com/web/developers/home)
 *
 * The version of the OpenAPI document: 2.9.235
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
 * AddParticipantsSearchResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:59.136525-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AddParticipantsSearchResult {
  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_IS_MEMBER = "isMember";
  @SerializedName(SERIALIZED_NAME_IS_MEMBER)
  private Boolean isMember;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SMALL_IMAGE_URI = "smallImageUri";
  @SerializedName(SERIALIZED_NAME_SMALL_IMAGE_URI)
  private String smallImageUri;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AddParticipantsSearchResult() {
  }

  public AddParticipantsSearchResult department(String department) {
    this.department = department;
    return this;
  }

  /**
   * The department of the participant
   * @return department
   */
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public AddParticipantsSearchResult firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the participant
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AddParticipantsSearchResult isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

  /**
   * is the participant a member, true or false
   * @return isMember
   */
  @javax.annotation.Nullable
  public Boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public AddParticipantsSearchResult jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * The job title of the participant
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public AddParticipantsSearchResult lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the participant
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AddParticipantsSearchResult smallImageUri(String smallImageUri) {
    this.smallImageUri = smallImageUri;
    return this;
  }

  /**
   * The uri of the small picture of the participant
   * @return smallImageUri
   */
  @javax.annotation.Nullable
  public String getSmallImageUri() {
    return smallImageUri;
  }

  public void setSmallImageUri(String smallImageUri) {
    this.smallImageUri = smallImageUri;
  }


  public AddParticipantsSearchResult tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * the tenant id of the participant
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public AddParticipantsSearchResult userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the participant
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddParticipantsSearchResult addParticipantsSearchResult = (AddParticipantsSearchResult) o;
    return Objects.equals(this.department, addParticipantsSearchResult.department) &&
        Objects.equals(this.firstName, addParticipantsSearchResult.firstName) &&
        Objects.equals(this.isMember, addParticipantsSearchResult.isMember) &&
        Objects.equals(this.jobTitle, addParticipantsSearchResult.jobTitle) &&
        Objects.equals(this.lastName, addParticipantsSearchResult.lastName) &&
        Objects.equals(this.smallImageUri, addParticipantsSearchResult.smallImageUri) &&
        Objects.equals(this.tenantId, addParticipantsSearchResult.tenantId) &&
        Objects.equals(this.userId, addParticipantsSearchResult.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(department, firstName, isMember, jobTitle, lastName, smallImageUri, tenantId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddParticipantsSearchResult {\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    smallImageUri: ").append(toIndentedString(smallImageUri)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("department");
    openapiFields.add("firstName");
    openapiFields.add("isMember");
    openapiFields.add("jobTitle");
    openapiFields.add("lastName");
    openapiFields.add("smallImageUri");
    openapiFields.add("tenantId");
    openapiFields.add("userId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddParticipantsSearchResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddParticipantsSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddParticipantsSearchResult is not found in the empty JSON string", AddParticipantsSearchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddParticipantsSearchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddParticipantsSearchResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) && !jsonObj.get("department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("jobTitle") != null && !jsonObj.get("jobTitle").isJsonNull()) && !jsonObj.get("jobTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobTitle").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("smallImageUri") != null && !jsonObj.get("smallImageUri").isJsonNull()) && !jsonObj.get("smallImageUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smallImageUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smallImageUri").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddParticipantsSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddParticipantsSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddParticipantsSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddParticipantsSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<AddParticipantsSearchResult>() {
           @Override
           public void write(JsonWriter out, AddParticipantsSearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddParticipantsSearchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AddParticipantsSearchResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddParticipantsSearchResult
   * @throws IOException if the JSON string is invalid with respect to AddParticipantsSearchResult
   */
  public static AddParticipantsSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddParticipantsSearchResult.class);
  }

  /**
   * Convert an instance of AddParticipantsSearchResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

