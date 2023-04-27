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
import java.util.List;
import org.openapitools.client.model.MemberType;

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
 * Permission granted to a user, group, or resource to access a certain aspect of another user, group, or resource mailbox.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:33.109694-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Permission {
  public static final String SERIALIZED_NAME_GRANTEE_ID = "GranteeId";
  @SerializedName(SERIALIZED_NAME_GRANTEE_ID)
  private String granteeId;

  public static final String SERIALIZED_NAME_GRANTEE_TYPE = "GranteeType";
  @SerializedName(SERIALIZED_NAME_GRANTEE_TYPE)
  private MemberType granteeType;

  public static final String SERIALIZED_NAME_PERMISSION_VALUES = "PermissionValues";
  @SerializedName(SERIALIZED_NAME_PERMISSION_VALUES)
  private List permissionValues;

  public Permission() {
  }

  public Permission granteeId(String granteeId) {
    this.granteeId = granteeId;
    return this;
  }

  /**
   * Get granteeId
   * @return granteeId
   */
  @javax.annotation.Nonnull
  public String getGranteeId() {
    return granteeId;
  }

  public void setGranteeId(String granteeId) {
    this.granteeId = granteeId;
  }


  public Permission granteeType(MemberType granteeType) {
    this.granteeType = granteeType;
    return this;
  }

  /**
   * Get granteeType
   * @return granteeType
   */
  @javax.annotation.Nonnull
  public MemberType getGranteeType() {
    return granteeType;
  }

  public void setGranteeType(MemberType granteeType) {
    this.granteeType = granteeType;
  }


  public Permission permissionValues(List permissionValues) {
    this.permissionValues = permissionValues;
    return this;
  }

  /**
   * Get permissionValues
   * @return permissionValues
   */
  @javax.annotation.Nonnull
  public List getPermissionValues() {
    return permissionValues;
  }

  public void setPermissionValues(List permissionValues) {
    this.permissionValues = permissionValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.granteeId, permission.granteeId) &&
        Objects.equals(this.granteeType, permission.granteeType) &&
        Objects.equals(this.permissionValues, permission.permissionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granteeId, granteeType, permissionValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    sb.append("    granteeId: ").append(toIndentedString(granteeId)).append("\n");
    sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
    sb.append("    permissionValues: ").append(toIndentedString(permissionValues)).append("\n");
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
    openapiFields.add("GranteeId");
    openapiFields.add("GranteeType");
    openapiFields.add("PermissionValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GranteeId");
    openapiRequiredFields.add("GranteeType");
    openapiRequiredFields.add("PermissionValues");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Permission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Permission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Permission is not found in the empty JSON string", Permission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Permission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Permission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Permission.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `GranteeId`
      String.validateJsonElement(jsonObj.get("GranteeId"));
      // validate the required field `GranteeType`
      MemberType.validateJsonElement(jsonObj.get("GranteeType"));
      // validate the required field `PermissionValues`
      List.validateJsonElement(jsonObj.get("PermissionValues"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Permission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Permission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Permission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Permission.class));

       return (TypeAdapter<T>) new TypeAdapter<Permission>() {
           @Override
           public void write(JsonWriter out, Permission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Permission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Permission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Permission
   * @throws IOException if the JSON string is invalid with respect to Permission
   */
  public static Permission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Permission.class);
  }

  /**
   * Convert an instance of Permission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

