/*
 * Amazon WorkMail
 * <p>WorkMail is a secure, managed business email and calendaring service with support for existing desktop and mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory and control both the keys that encrypt your data and the location in which your data is stored.</p> <p>The WorkMail API is designed for the following scenarios:</p> <ul> <li> <p>Listing and describing organizations</p> </li> </ul> <ul> <li> <p>Managing users</p> </li> </ul> <ul> <li> <p>Managing groups</p> </li> </ul> <ul> <li> <p>Managing resources</p> </li> </ul> <p>All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy). This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a selective basis using the IAM model.</p>
 *
 * The version of the OpenAPI document: 2017-10-01
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
 * StartMailboxExportJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:37.440706-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StartMailboxExportJobRequest {
  public static final String SERIALIZED_NAME_CLIENT_TOKEN = "ClientToken";
  @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN)
  private String clientToken;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "OrganizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_ENTITY_ID = "EntityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_KMS_KEY_ARN = "KmsKeyArn";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ARN)
  private String kmsKeyArn;

  public static final String SERIALIZED_NAME_S3_BUCKET_NAME = "S3BucketName";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET_NAME)
  private String s3BucketName;

  public static final String SERIALIZED_NAME_S3_PREFIX = "S3Prefix";
  @SerializedName(SERIALIZED_NAME_S3_PREFIX)
  private String s3Prefix;

  public StartMailboxExportJobRequest() {
  }

  public StartMailboxExportJobRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * Get clientToken
   * @return clientToken
   */
  @javax.annotation.Nonnull
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }


  public StartMailboxExportJobRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   * @return organizationId
   */
  @javax.annotation.Nonnull
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public StartMailboxExportJobRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nonnull
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public StartMailboxExportJobRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public StartMailboxExportJobRequest roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public StartMailboxExportJobRequest kmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
    return this;
  }

  /**
   * Get kmsKeyArn
   * @return kmsKeyArn
   */
  @javax.annotation.Nonnull
  public String getKmsKeyArn() {
    return kmsKeyArn;
  }

  public void setKmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
  }


  public StartMailboxExportJobRequest s3BucketName(String s3BucketName) {
    this.s3BucketName = s3BucketName;
    return this;
  }

  /**
   * Get s3BucketName
   * @return s3BucketName
   */
  @javax.annotation.Nonnull
  public String getS3BucketName() {
    return s3BucketName;
  }

  public void setS3BucketName(String s3BucketName) {
    this.s3BucketName = s3BucketName;
  }


  public StartMailboxExportJobRequest s3Prefix(String s3Prefix) {
    this.s3Prefix = s3Prefix;
    return this;
  }

  /**
   * Get s3Prefix
   * @return s3Prefix
   */
  @javax.annotation.Nonnull
  public String getS3Prefix() {
    return s3Prefix;
  }

  public void setS3Prefix(String s3Prefix) {
    this.s3Prefix = s3Prefix;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartMailboxExportJobRequest startMailboxExportJobRequest = (StartMailboxExportJobRequest) o;
    return Objects.equals(this.clientToken, startMailboxExportJobRequest.clientToken) &&
        Objects.equals(this.organizationId, startMailboxExportJobRequest.organizationId) &&
        Objects.equals(this.entityId, startMailboxExportJobRequest.entityId) &&
        Objects.equals(this.description, startMailboxExportJobRequest.description) &&
        Objects.equals(this.roleArn, startMailboxExportJobRequest.roleArn) &&
        Objects.equals(this.kmsKeyArn, startMailboxExportJobRequest.kmsKeyArn) &&
        Objects.equals(this.s3BucketName, startMailboxExportJobRequest.s3BucketName) &&
        Objects.equals(this.s3Prefix, startMailboxExportJobRequest.s3Prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, organizationId, entityId, description, roleArn, kmsKeyArn, s3BucketName, s3Prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartMailboxExportJobRequest {\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    kmsKeyArn: ").append(toIndentedString(kmsKeyArn)).append("\n");
    sb.append("    s3BucketName: ").append(toIndentedString(s3BucketName)).append("\n");
    sb.append("    s3Prefix: ").append(toIndentedString(s3Prefix)).append("\n");
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
    openapiFields.add("ClientToken");
    openapiFields.add("OrganizationId");
    openapiFields.add("EntityId");
    openapiFields.add("Description");
    openapiFields.add("RoleArn");
    openapiFields.add("KmsKeyArn");
    openapiFields.add("S3BucketName");
    openapiFields.add("S3Prefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ClientToken");
    openapiRequiredFields.add("OrganizationId");
    openapiRequiredFields.add("EntityId");
    openapiRequiredFields.add("RoleArn");
    openapiRequiredFields.add("KmsKeyArn");
    openapiRequiredFields.add("S3BucketName");
    openapiRequiredFields.add("S3Prefix");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StartMailboxExportJobRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StartMailboxExportJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartMailboxExportJobRequest is not found in the empty JSON string", StartMailboxExportJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StartMailboxExportJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StartMailboxExportJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StartMailboxExportJobRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ClientToken`
      String.validateJsonElement(jsonObj.get("ClientToken"));
      // validate the required field `OrganizationId`
      String.validateJsonElement(jsonObj.get("OrganizationId"));
      // validate the required field `EntityId`
      String.validateJsonElement(jsonObj.get("EntityId"));
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the required field `RoleArn`
      String.validateJsonElement(jsonObj.get("RoleArn"));
      // validate the required field `KmsKeyArn`
      String.validateJsonElement(jsonObj.get("KmsKeyArn"));
      // validate the required field `S3BucketName`
      String.validateJsonElement(jsonObj.get("S3BucketName"));
      // validate the required field `S3Prefix`
      String.validateJsonElement(jsonObj.get("S3Prefix"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartMailboxExportJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartMailboxExportJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartMailboxExportJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartMailboxExportJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StartMailboxExportJobRequest>() {
           @Override
           public void write(JsonWriter out, StartMailboxExportJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StartMailboxExportJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StartMailboxExportJobRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StartMailboxExportJobRequest
   * @throws IOException if the JSON string is invalid with respect to StartMailboxExportJobRequest
   */
  public static StartMailboxExportJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartMailboxExportJobRequest.class);
  }

  /**
   * Convert an instance of StartMailboxExportJobRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

