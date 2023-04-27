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
 * GetImpersonationRoleEffectResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:33.109694-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetImpersonationRoleEffectResponse {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ImpersonationRoleType type;

  public static final String SERIALIZED_NAME_EFFECT = "Effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private AccessEffect effect;

  public static final String SERIALIZED_NAME_MATCHED_RULES = "MatchedRules";
  @SerializedName(SERIALIZED_NAME_MATCHED_RULES)
  private List matchedRules;

  public GetImpersonationRoleEffectResponse() {
  }

  public GetImpersonationRoleEffectResponse type(ImpersonationRoleType type) {
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


  public GetImpersonationRoleEffectResponse effect(AccessEffect effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Get effect
   * @return effect
   */
  @javax.annotation.Nullable
  public AccessEffect getEffect() {
    return effect;
  }

  public void setEffect(AccessEffect effect) {
    this.effect = effect;
  }


  public GetImpersonationRoleEffectResponse matchedRules(List matchedRules) {
    this.matchedRules = matchedRules;
    return this;
  }

  /**
   * Get matchedRules
   * @return matchedRules
   */
  @javax.annotation.Nullable
  public List getMatchedRules() {
    return matchedRules;
  }

  public void setMatchedRules(List matchedRules) {
    this.matchedRules = matchedRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImpersonationRoleEffectResponse getImpersonationRoleEffectResponse = (GetImpersonationRoleEffectResponse) o;
    return Objects.equals(this.type, getImpersonationRoleEffectResponse.type) &&
        Objects.equals(this.effect, getImpersonationRoleEffectResponse.effect) &&
        Objects.equals(this.matchedRules, getImpersonationRoleEffectResponse.matchedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, effect, matchedRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImpersonationRoleEffectResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    matchedRules: ").append(toIndentedString(matchedRules)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Effect");
    openapiFields.add("MatchedRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetImpersonationRoleEffectResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetImpersonationRoleEffectResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetImpersonationRoleEffectResponse is not found in the empty JSON string", GetImpersonationRoleEffectResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetImpersonationRoleEffectResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetImpersonationRoleEffectResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        ImpersonationRoleType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `Effect`
      if (jsonObj.get("Effect") != null && !jsonObj.get("Effect").isJsonNull()) {
        AccessEffect.validateJsonElement(jsonObj.get("Effect"));
      }
      // validate the optional field `MatchedRules`
      if (jsonObj.get("MatchedRules") != null && !jsonObj.get("MatchedRules").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("MatchedRules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetImpersonationRoleEffectResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetImpersonationRoleEffectResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetImpersonationRoleEffectResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetImpersonationRoleEffectResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetImpersonationRoleEffectResponse>() {
           @Override
           public void write(JsonWriter out, GetImpersonationRoleEffectResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetImpersonationRoleEffectResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetImpersonationRoleEffectResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetImpersonationRoleEffectResponse
   * @throws IOException if the JSON string is invalid with respect to GetImpersonationRoleEffectResponse
   */
  public static GetImpersonationRoleEffectResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetImpersonationRoleEffectResponse.class);
  }

  /**
   * Convert an instance of GetImpersonationRoleEffectResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

