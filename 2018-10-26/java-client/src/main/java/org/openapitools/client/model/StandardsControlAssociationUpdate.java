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
import java.util.Arrays;
import org.openapitools.client.model.AssociationStatus;

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
 * An array of requested updates to the enablement status of controls in specified standards. The objects in the array include a security control ID, the Amazon Resource Name (ARN) of the standard, the requested enablement status, and the reason for updating the enablement status.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StandardsControlAssociationUpdate {
  public static final String SERIALIZED_NAME_STANDARDS_ARN = "StandardsArn";
  @SerializedName(SERIALIZED_NAME_STANDARDS_ARN)
  private String standardsArn;

  public static final String SERIALIZED_NAME_SECURITY_CONTROL_ID = "SecurityControlId";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTROL_ID)
  private String securityControlId;

  public static final String SERIALIZED_NAME_ASSOCIATION_STATUS = "AssociationStatus";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_STATUS)
  private AssociationStatus associationStatus;

  public static final String SERIALIZED_NAME_UPDATED_REASON = "UpdatedReason";
  @SerializedName(SERIALIZED_NAME_UPDATED_REASON)
  private String updatedReason;

  public StandardsControlAssociationUpdate() {
  }

  public StandardsControlAssociationUpdate standardsArn(String standardsArn) {
    this.standardsArn = standardsArn;
    return this;
  }

  /**
   * Get standardsArn
   * @return standardsArn
   */
  @javax.annotation.Nonnull
  public String getStandardsArn() {
    return standardsArn;
  }

  public void setStandardsArn(String standardsArn) {
    this.standardsArn = standardsArn;
  }


  public StandardsControlAssociationUpdate securityControlId(String securityControlId) {
    this.securityControlId = securityControlId;
    return this;
  }

  /**
   * Get securityControlId
   * @return securityControlId
   */
  @javax.annotation.Nonnull
  public String getSecurityControlId() {
    return securityControlId;
  }

  public void setSecurityControlId(String securityControlId) {
    this.securityControlId = securityControlId;
  }


  public StandardsControlAssociationUpdate associationStatus(AssociationStatus associationStatus) {
    this.associationStatus = associationStatus;
    return this;
  }

  /**
   * Get associationStatus
   * @return associationStatus
   */
  @javax.annotation.Nonnull
  public AssociationStatus getAssociationStatus() {
    return associationStatus;
  }

  public void setAssociationStatus(AssociationStatus associationStatus) {
    this.associationStatus = associationStatus;
  }


  public StandardsControlAssociationUpdate updatedReason(String updatedReason) {
    this.updatedReason = updatedReason;
    return this;
  }

  /**
   * Get updatedReason
   * @return updatedReason
   */
  @javax.annotation.Nullable
  public String getUpdatedReason() {
    return updatedReason;
  }

  public void setUpdatedReason(String updatedReason) {
    this.updatedReason = updatedReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardsControlAssociationUpdate standardsControlAssociationUpdate = (StandardsControlAssociationUpdate) o;
    return Objects.equals(this.standardsArn, standardsControlAssociationUpdate.standardsArn) &&
        Objects.equals(this.securityControlId, standardsControlAssociationUpdate.securityControlId) &&
        Objects.equals(this.associationStatus, standardsControlAssociationUpdate.associationStatus) &&
        Objects.equals(this.updatedReason, standardsControlAssociationUpdate.updatedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardsArn, securityControlId, associationStatus, updatedReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardsControlAssociationUpdate {\n");
    sb.append("    standardsArn: ").append(toIndentedString(standardsArn)).append("\n");
    sb.append("    securityControlId: ").append(toIndentedString(securityControlId)).append("\n");
    sb.append("    associationStatus: ").append(toIndentedString(associationStatus)).append("\n");
    sb.append("    updatedReason: ").append(toIndentedString(updatedReason)).append("\n");
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
    openapiFields.add("StandardsArn");
    openapiFields.add("SecurityControlId");
    openapiFields.add("AssociationStatus");
    openapiFields.add("UpdatedReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("StandardsArn");
    openapiRequiredFields.add("SecurityControlId");
    openapiRequiredFields.add("AssociationStatus");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StandardsControlAssociationUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StandardsControlAssociationUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardsControlAssociationUpdate is not found in the empty JSON string", StandardsControlAssociationUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StandardsControlAssociationUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StandardsControlAssociationUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StandardsControlAssociationUpdate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `StandardsArn`
      String.validateJsonElement(jsonObj.get("StandardsArn"));
      // validate the required field `SecurityControlId`
      String.validateJsonElement(jsonObj.get("SecurityControlId"));
      // validate the required field `AssociationStatus`
      AssociationStatus.validateJsonElement(jsonObj.get("AssociationStatus"));
      // validate the optional field `UpdatedReason`
      if (jsonObj.get("UpdatedReason") != null && !jsonObj.get("UpdatedReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UpdatedReason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardsControlAssociationUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardsControlAssociationUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardsControlAssociationUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardsControlAssociationUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardsControlAssociationUpdate>() {
           @Override
           public void write(JsonWriter out, StandardsControlAssociationUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StandardsControlAssociationUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StandardsControlAssociationUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StandardsControlAssociationUpdate
   * @throws IOException if the JSON string is invalid with respect to StandardsControlAssociationUpdate
   */
  public static StandardsControlAssociationUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardsControlAssociationUpdate.class);
  }

  /**
   * Convert an instance of StandardsControlAssociationUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

