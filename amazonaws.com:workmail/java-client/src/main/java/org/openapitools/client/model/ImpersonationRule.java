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
import org.openapitools.client.model.AccessEffect;

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
 * The rules for the given impersonation role.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:33.109694-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ImpersonationRule {
  public static final String SERIALIZED_NAME_IMPERSONATION_RULE_ID = "ImpersonationRuleId";
  @SerializedName(SERIALIZED_NAME_IMPERSONATION_RULE_ID)
  private String impersonationRuleId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EFFECT = "Effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private AccessEffect effect;

  public static final String SERIALIZED_NAME_TARGET_USERS = "TargetUsers";
  @SerializedName(SERIALIZED_NAME_TARGET_USERS)
  private List targetUsers;

  public static final String SERIALIZED_NAME_NOT_TARGET_USERS = "NotTargetUsers";
  @SerializedName(SERIALIZED_NAME_NOT_TARGET_USERS)
  private List notTargetUsers;

  public ImpersonationRule() {
  }

  public ImpersonationRule impersonationRuleId(String impersonationRuleId) {
    this.impersonationRuleId = impersonationRuleId;
    return this;
  }

  /**
   * Get impersonationRuleId
   * @return impersonationRuleId
   */
  @javax.annotation.Nonnull
  public String getImpersonationRuleId() {
    return impersonationRuleId;
  }

  public void setImpersonationRuleId(String impersonationRuleId) {
    this.impersonationRuleId = impersonationRuleId;
  }


  public ImpersonationRule name(String name) {
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


  public ImpersonationRule description(String description) {
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


  public ImpersonationRule effect(AccessEffect effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Get effect
   * @return effect
   */
  @javax.annotation.Nonnull
  public AccessEffect getEffect() {
    return effect;
  }

  public void setEffect(AccessEffect effect) {
    this.effect = effect;
  }


  public ImpersonationRule targetUsers(List targetUsers) {
    this.targetUsers = targetUsers;
    return this;
  }

  /**
   * Get targetUsers
   * @return targetUsers
   */
  @javax.annotation.Nullable
  public List getTargetUsers() {
    return targetUsers;
  }

  public void setTargetUsers(List targetUsers) {
    this.targetUsers = targetUsers;
  }


  public ImpersonationRule notTargetUsers(List notTargetUsers) {
    this.notTargetUsers = notTargetUsers;
    return this;
  }

  /**
   * Get notTargetUsers
   * @return notTargetUsers
   */
  @javax.annotation.Nullable
  public List getNotTargetUsers() {
    return notTargetUsers;
  }

  public void setNotTargetUsers(List notTargetUsers) {
    this.notTargetUsers = notTargetUsers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpersonationRule impersonationRule = (ImpersonationRule) o;
    return Objects.equals(this.impersonationRuleId, impersonationRule.impersonationRuleId) &&
        Objects.equals(this.name, impersonationRule.name) &&
        Objects.equals(this.description, impersonationRule.description) &&
        Objects.equals(this.effect, impersonationRule.effect) &&
        Objects.equals(this.targetUsers, impersonationRule.targetUsers) &&
        Objects.equals(this.notTargetUsers, impersonationRule.notTargetUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impersonationRuleId, name, description, effect, targetUsers, notTargetUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpersonationRule {\n");
    sb.append("    impersonationRuleId: ").append(toIndentedString(impersonationRuleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    targetUsers: ").append(toIndentedString(targetUsers)).append("\n");
    sb.append("    notTargetUsers: ").append(toIndentedString(notTargetUsers)).append("\n");
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
    openapiFields.add("ImpersonationRuleId");
    openapiFields.add("Name");
    openapiFields.add("Description");
    openapiFields.add("Effect");
    openapiFields.add("TargetUsers");
    openapiFields.add("NotTargetUsers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ImpersonationRuleId");
    openapiRequiredFields.add("Effect");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImpersonationRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImpersonationRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImpersonationRule is not found in the empty JSON string", ImpersonationRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImpersonationRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImpersonationRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImpersonationRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ImpersonationRuleId`
      String.validateJsonElement(jsonObj.get("ImpersonationRuleId"));
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the required field `Effect`
      AccessEffect.validateJsonElement(jsonObj.get("Effect"));
      // validate the optional field `TargetUsers`
      if (jsonObj.get("TargetUsers") != null && !jsonObj.get("TargetUsers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TargetUsers"));
      }
      // validate the optional field `NotTargetUsers`
      if (jsonObj.get("NotTargetUsers") != null && !jsonObj.get("NotTargetUsers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NotTargetUsers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImpersonationRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImpersonationRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImpersonationRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImpersonationRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ImpersonationRule>() {
           @Override
           public void write(JsonWriter out, ImpersonationRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImpersonationRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImpersonationRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImpersonationRule
   * @throws IOException if the JSON string is invalid with respect to ImpersonationRule
   */
  public static ImpersonationRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImpersonationRule.class);
  }

  /**
   * Convert an instance of ImpersonationRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

