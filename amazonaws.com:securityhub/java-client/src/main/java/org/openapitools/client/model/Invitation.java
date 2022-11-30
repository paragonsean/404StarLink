/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
 * Details about an invitation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Invitation {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_INVITATION_ID = "InvitationId";
  @SerializedName(SERIALIZED_NAME_INVITATION_ID)
  private String invitationId;

  public static final String SERIALIZED_NAME_INVITED_AT = "InvitedAt";
  @SerializedName(SERIALIZED_NAME_INVITED_AT)
  private OffsetDateTime invitedAt;

  public static final String SERIALIZED_NAME_MEMBER_STATUS = "MemberStatus";
  @SerializedName(SERIALIZED_NAME_MEMBER_STATUS)
  private String memberStatus;

  public Invitation() {
  }

  public Invitation accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Invitation invitationId(String invitationId) {
    this.invitationId = invitationId;
    return this;
  }

  /**
   * Get invitationId
   * @return invitationId
   */
  @javax.annotation.Nullable
  public String getInvitationId() {
    return invitationId;
  }

  public void setInvitationId(String invitationId) {
    this.invitationId = invitationId;
  }


  public Invitation invitedAt(OffsetDateTime invitedAt) {
    this.invitedAt = invitedAt;
    return this;
  }

  /**
   * Get invitedAt
   * @return invitedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getInvitedAt() {
    return invitedAt;
  }

  public void setInvitedAt(OffsetDateTime invitedAt) {
    this.invitedAt = invitedAt;
  }


  public Invitation memberStatus(String memberStatus) {
    this.memberStatus = memberStatus;
    return this;
  }

  /**
   * Get memberStatus
   * @return memberStatus
   */
  @javax.annotation.Nullable
  public String getMemberStatus() {
    return memberStatus;
  }

  public void setMemberStatus(String memberStatus) {
    this.memberStatus = memberStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invitation invitation = (Invitation) o;
    return Objects.equals(this.accountId, invitation.accountId) &&
        Objects.equals(this.invitationId, invitation.invitationId) &&
        Objects.equals(this.invitedAt, invitation.invitedAt) &&
        Objects.equals(this.memberStatus, invitation.memberStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, invitationId, invitedAt, memberStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invitation {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
    sb.append("    invitedAt: ").append(toIndentedString(invitedAt)).append("\n");
    sb.append("    memberStatus: ").append(toIndentedString(memberStatus)).append("\n");
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
    openapiFields.add("AccountId");
    openapiFields.add("InvitationId");
    openapiFields.add("InvitedAt");
    openapiFields.add("MemberStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Invitation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Invitation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invitation is not found in the empty JSON string", Invitation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Invitation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invitation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccountId`
      if (jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccountId"));
      }
      // validate the optional field `InvitationId`
      if (jsonObj.get("InvitationId") != null && !jsonObj.get("InvitationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InvitationId"));
      }
      // validate the optional field `InvitedAt`
      if (jsonObj.get("InvitedAt") != null && !jsonObj.get("InvitedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("InvitedAt"));
      }
      // validate the optional field `MemberStatus`
      if (jsonObj.get("MemberStatus") != null && !jsonObj.get("MemberStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MemberStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invitation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invitation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invitation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invitation.class));

       return (TypeAdapter<T>) new TypeAdapter<Invitation>() {
           @Override
           public void write(JsonWriter out, Invitation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invitation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Invitation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Invitation
   * @throws IOException if the JSON string is invalid with respect to Invitation
   */
  public static Invitation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invitation.class);
  }

  /**
   * Convert an instance of Invitation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

