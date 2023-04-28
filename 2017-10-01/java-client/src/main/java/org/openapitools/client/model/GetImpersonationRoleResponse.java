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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ImpersonationRoleType;

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
 * GetImpersonationRoleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:37.440706-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetImpersonationRoleResponse {
  public static final String SERIALIZED_NAME_IMPERSONATION_ROLE_ID = "ImpersonationRoleId";
  @SerializedName(SERIALIZED_NAME_IMPERSONATION_ROLE_ID)
  private String impersonationRoleId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ImpersonationRoleType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RULES = "Rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List rules;

  public static final String SERIALIZED_NAME_DATE_CREATED = "DateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "DateModified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public GetImpersonationRoleResponse() {
  }

  public GetImpersonationRoleResponse impersonationRoleId(String impersonationRoleId) {
    this.impersonationRoleId = impersonationRoleId;
    return this;
  }

  /**
   * Get impersonationRoleId
   * @return impersonationRoleId
   */
  @javax.annotation.Nullable
  public String getImpersonationRoleId() {
    return impersonationRoleId;
  }

  public void setImpersonationRoleId(String impersonationRoleId) {
    this.impersonationRoleId = impersonationRoleId;
  }


  public GetImpersonationRoleResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetImpersonationRoleResponse type(ImpersonationRoleType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public ImpersonationRoleType getType() {
    return type;
  }

  public void setType(ImpersonationRoleType type) {
    this.type = type;
  }


  public GetImpersonationRoleResponse description(String description) {
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


  public GetImpersonationRoleResponse rules(List rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   * @return rules
   */
  @javax.annotation.Nullable
  public List getRules() {
    return rules;
  }

  public void setRules(List rules) {
    this.rules = rules;
  }


  public GetImpersonationRoleResponse dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public GetImpersonationRoleResponse dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

  /**
   * Get dateModified
   * @return dateModified
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImpersonationRoleResponse getImpersonationRoleResponse = (GetImpersonationRoleResponse) o;
    return Objects.equals(this.impersonationRoleId, getImpersonationRoleResponse.impersonationRoleId) &&
        Objects.equals(this.name, getImpersonationRoleResponse.name) &&
        Objects.equals(this.type, getImpersonationRoleResponse.type) &&
        Objects.equals(this.description, getImpersonationRoleResponse.description) &&
        Objects.equals(this.rules, getImpersonationRoleResponse.rules) &&
        Objects.equals(this.dateCreated, getImpersonationRoleResponse.dateCreated) &&
        Objects.equals(this.dateModified, getImpersonationRoleResponse.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impersonationRoleId, name, type, description, rules, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImpersonationRoleResponse {\n");
    sb.append("    impersonationRoleId: ").append(toIndentedString(impersonationRoleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
    openapiFields.add("ImpersonationRoleId");
    openapiFields.add("Name");
    openapiFields.add("Type");
    openapiFields.add("Description");
    openapiFields.add("Rules");
    openapiFields.add("DateCreated");
    openapiFields.add("DateModified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetImpersonationRoleResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetImpersonationRoleResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetImpersonationRoleResponse is not found in the empty JSON string", GetImpersonationRoleResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetImpersonationRoleResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetImpersonationRoleResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ImpersonationRoleId`
      if (jsonObj.get("ImpersonationRoleId") != null && !jsonObj.get("ImpersonationRoleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImpersonationRoleId"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        ImpersonationRoleType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `Rules`
      if (jsonObj.get("Rules") != null && !jsonObj.get("Rules").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Rules"));
      }
      // validate the optional field `DateCreated`
      if (jsonObj.get("DateCreated") != null && !jsonObj.get("DateCreated").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("DateCreated"));
      }
      // validate the optional field `DateModified`
      if (jsonObj.get("DateModified") != null && !jsonObj.get("DateModified").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("DateModified"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetImpersonationRoleResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetImpersonationRoleResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetImpersonationRoleResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetImpersonationRoleResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetImpersonationRoleResponse>() {
           @Override
           public void write(JsonWriter out, GetImpersonationRoleResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetImpersonationRoleResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetImpersonationRoleResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetImpersonationRoleResponse
   * @throws IOException if the JSON string is invalid with respect to GetImpersonationRoleResponse
   */
  public static GetImpersonationRoleResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetImpersonationRoleResponse.class);
  }

  /**
   * Convert an instance of GetImpersonationRoleResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

