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
import java.util.List;
import org.openapitools.client.model.ComplianceStatus;

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
 * Contains finding details that are specific to control-based findings. Only returned for findings generated from controls.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Compliance {
  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ComplianceStatus status;

  public static final String SERIALIZED_NAME_RELATED_REQUIREMENTS = "RelatedRequirements";
  @SerializedName(SERIALIZED_NAME_RELATED_REQUIREMENTS)
  private List relatedRequirements;

  public static final String SERIALIZED_NAME_STATUS_REASONS = "StatusReasons";
  @SerializedName(SERIALIZED_NAME_STATUS_REASONS)
  private List statusReasons;

  public static final String SERIALIZED_NAME_SECURITY_CONTROL_ID = "SecurityControlId";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTROL_ID)
  private String securityControlId;

  public static final String SERIALIZED_NAME_ASSOCIATED_STANDARDS = "AssociatedStandards";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_STANDARDS)
  private List associatedStandards;

  public Compliance() {
  }

  public Compliance status(ComplianceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ComplianceStatus getStatus() {
    return status;
  }

  public void setStatus(ComplianceStatus status) {
    this.status = status;
  }


  public Compliance relatedRequirements(List relatedRequirements) {
    this.relatedRequirements = relatedRequirements;
    return this;
  }

  /**
   * Get relatedRequirements
   * @return relatedRequirements
   */
  @javax.annotation.Nullable
  public List getRelatedRequirements() {
    return relatedRequirements;
  }

  public void setRelatedRequirements(List relatedRequirements) {
    this.relatedRequirements = relatedRequirements;
  }


  public Compliance statusReasons(List statusReasons) {
    this.statusReasons = statusReasons;
    return this;
  }

  /**
   * Get statusReasons
   * @return statusReasons
   */
  @javax.annotation.Nullable
  public List getStatusReasons() {
    return statusReasons;
  }

  public void setStatusReasons(List statusReasons) {
    this.statusReasons = statusReasons;
  }


  public Compliance securityControlId(String securityControlId) {
    this.securityControlId = securityControlId;
    return this;
  }

  /**
   * Get securityControlId
   * @return securityControlId
   */
  @javax.annotation.Nullable
  public String getSecurityControlId() {
    return securityControlId;
  }

  public void setSecurityControlId(String securityControlId) {
    this.securityControlId = securityControlId;
  }


  public Compliance associatedStandards(List associatedStandards) {
    this.associatedStandards = associatedStandards;
    return this;
  }

  /**
   * Get associatedStandards
   * @return associatedStandards
   */
  @javax.annotation.Nullable
  public List getAssociatedStandards() {
    return associatedStandards;
  }

  public void setAssociatedStandards(List associatedStandards) {
    this.associatedStandards = associatedStandards;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compliance compliance = (Compliance) o;
    return Objects.equals(this.status, compliance.status) &&
        Objects.equals(this.relatedRequirements, compliance.relatedRequirements) &&
        Objects.equals(this.statusReasons, compliance.statusReasons) &&
        Objects.equals(this.securityControlId, compliance.securityControlId) &&
        Objects.equals(this.associatedStandards, compliance.associatedStandards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, relatedRequirements, statusReasons, securityControlId, associatedStandards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compliance {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedRequirements: ").append(toIndentedString(relatedRequirements)).append("\n");
    sb.append("    statusReasons: ").append(toIndentedString(statusReasons)).append("\n");
    sb.append("    securityControlId: ").append(toIndentedString(securityControlId)).append("\n");
    sb.append("    associatedStandards: ").append(toIndentedString(associatedStandards)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("RelatedRequirements");
    openapiFields.add("StatusReasons");
    openapiFields.add("SecurityControlId");
    openapiFields.add("AssociatedStandards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Compliance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Compliance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Compliance is not found in the empty JSON string", Compliance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Compliance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Compliance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ComplianceStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `RelatedRequirements`
      if (jsonObj.get("RelatedRequirements") != null && !jsonObj.get("RelatedRequirements").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RelatedRequirements"));
      }
      // validate the optional field `StatusReasons`
      if (jsonObj.get("StatusReasons") != null && !jsonObj.get("StatusReasons").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("StatusReasons"));
      }
      // validate the optional field `SecurityControlId`
      if (jsonObj.get("SecurityControlId") != null && !jsonObj.get("SecurityControlId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SecurityControlId"));
      }
      // validate the optional field `AssociatedStandards`
      if (jsonObj.get("AssociatedStandards") != null && !jsonObj.get("AssociatedStandards").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AssociatedStandards"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Compliance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Compliance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Compliance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Compliance.class));

       return (TypeAdapter<T>) new TypeAdapter<Compliance>() {
           @Override
           public void write(JsonWriter out, Compliance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Compliance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Compliance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Compliance
   * @throws IOException if the JSON string is invalid with respect to Compliance
   */
  public static Compliance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Compliance.class);
  }

  /**
   * Convert an instance of Compliance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

