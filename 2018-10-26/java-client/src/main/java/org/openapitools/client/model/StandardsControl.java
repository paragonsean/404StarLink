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
import java.util.List;
import org.openapitools.client.model.ControlStatus;
import org.openapitools.client.model.SeverityRating;

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
 * Details for an individual security standard control.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StandardsControl {
  public static final String SERIALIZED_NAME_STANDARDS_CONTROL_ARN = "StandardsControlArn";
  @SerializedName(SERIALIZED_NAME_STANDARDS_CONTROL_ARN)
  private String standardsControlArn;

  public static final String SERIALIZED_NAME_CONTROL_STATUS = "ControlStatus";
  @SerializedName(SERIALIZED_NAME_CONTROL_STATUS)
  private ControlStatus controlStatus;

  public static final String SERIALIZED_NAME_DISABLED_REASON = "DisabledReason";
  @SerializedName(SERIALIZED_NAME_DISABLED_REASON)
  private String disabledReason;

  public static final String SERIALIZED_NAME_CONTROL_STATUS_UPDATED_AT = "ControlStatusUpdatedAt";
  @SerializedName(SERIALIZED_NAME_CONTROL_STATUS_UPDATED_AT)
  private OffsetDateTime controlStatusUpdatedAt;

  public static final String SERIALIZED_NAME_CONTROL_ID = "ControlId";
  @SerializedName(SERIALIZED_NAME_CONTROL_ID)
  private String controlId;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REMEDIATION_URL = "RemediationUrl";
  @SerializedName(SERIALIZED_NAME_REMEDIATION_URL)
  private String remediationUrl;

  public static final String SERIALIZED_NAME_SEVERITY_RATING = "SeverityRating";
  @SerializedName(SERIALIZED_NAME_SEVERITY_RATING)
  private SeverityRating severityRating;

  public static final String SERIALIZED_NAME_RELATED_REQUIREMENTS = "RelatedRequirements";
  @SerializedName(SERIALIZED_NAME_RELATED_REQUIREMENTS)
  private List relatedRequirements;

  public StandardsControl() {
  }

  public StandardsControl standardsControlArn(String standardsControlArn) {
    this.standardsControlArn = standardsControlArn;
    return this;
  }

  /**
   * Get standardsControlArn
   * @return standardsControlArn
   */
  @javax.annotation.Nullable
  public String getStandardsControlArn() {
    return standardsControlArn;
  }

  public void setStandardsControlArn(String standardsControlArn) {
    this.standardsControlArn = standardsControlArn;
  }


  public StandardsControl controlStatus(ControlStatus controlStatus) {
    this.controlStatus = controlStatus;
    return this;
  }

  /**
   * Get controlStatus
   * @return controlStatus
   */
  @javax.annotation.Nullable
  public ControlStatus getControlStatus() {
    return controlStatus;
  }

  public void setControlStatus(ControlStatus controlStatus) {
    this.controlStatus = controlStatus;
  }


  public StandardsControl disabledReason(String disabledReason) {
    this.disabledReason = disabledReason;
    return this;
  }

  /**
   * Get disabledReason
   * @return disabledReason
   */
  @javax.annotation.Nullable
  public String getDisabledReason() {
    return disabledReason;
  }

  public void setDisabledReason(String disabledReason) {
    this.disabledReason = disabledReason;
  }


  public StandardsControl controlStatusUpdatedAt(OffsetDateTime controlStatusUpdatedAt) {
    this.controlStatusUpdatedAt = controlStatusUpdatedAt;
    return this;
  }

  /**
   * Get controlStatusUpdatedAt
   * @return controlStatusUpdatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getControlStatusUpdatedAt() {
    return controlStatusUpdatedAt;
  }

  public void setControlStatusUpdatedAt(OffsetDateTime controlStatusUpdatedAt) {
    this.controlStatusUpdatedAt = controlStatusUpdatedAt;
  }


  public StandardsControl controlId(String controlId) {
    this.controlId = controlId;
    return this;
  }

  /**
   * Get controlId
   * @return controlId
   */
  @javax.annotation.Nullable
  public String getControlId() {
    return controlId;
  }

  public void setControlId(String controlId) {
    this.controlId = controlId;
  }


  public StandardsControl title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public StandardsControl description(String description) {
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


  public StandardsControl remediationUrl(String remediationUrl) {
    this.remediationUrl = remediationUrl;
    return this;
  }

  /**
   * Get remediationUrl
   * @return remediationUrl
   */
  @javax.annotation.Nullable
  public String getRemediationUrl() {
    return remediationUrl;
  }

  public void setRemediationUrl(String remediationUrl) {
    this.remediationUrl = remediationUrl;
  }


  public StandardsControl severityRating(SeverityRating severityRating) {
    this.severityRating = severityRating;
    return this;
  }

  /**
   * Get severityRating
   * @return severityRating
   */
  @javax.annotation.Nullable
  public SeverityRating getSeverityRating() {
    return severityRating;
  }

  public void setSeverityRating(SeverityRating severityRating) {
    this.severityRating = severityRating;
  }


  public StandardsControl relatedRequirements(List relatedRequirements) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardsControl standardsControl = (StandardsControl) o;
    return Objects.equals(this.standardsControlArn, standardsControl.standardsControlArn) &&
        Objects.equals(this.controlStatus, standardsControl.controlStatus) &&
        Objects.equals(this.disabledReason, standardsControl.disabledReason) &&
        Objects.equals(this.controlStatusUpdatedAt, standardsControl.controlStatusUpdatedAt) &&
        Objects.equals(this.controlId, standardsControl.controlId) &&
        Objects.equals(this.title, standardsControl.title) &&
        Objects.equals(this.description, standardsControl.description) &&
        Objects.equals(this.remediationUrl, standardsControl.remediationUrl) &&
        Objects.equals(this.severityRating, standardsControl.severityRating) &&
        Objects.equals(this.relatedRequirements, standardsControl.relatedRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardsControlArn, controlStatus, disabledReason, controlStatusUpdatedAt, controlId, title, description, remediationUrl, severityRating, relatedRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardsControl {\n");
    sb.append("    standardsControlArn: ").append(toIndentedString(standardsControlArn)).append("\n");
    sb.append("    controlStatus: ").append(toIndentedString(controlStatus)).append("\n");
    sb.append("    disabledReason: ").append(toIndentedString(disabledReason)).append("\n");
    sb.append("    controlStatusUpdatedAt: ").append(toIndentedString(controlStatusUpdatedAt)).append("\n");
    sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    remediationUrl: ").append(toIndentedString(remediationUrl)).append("\n");
    sb.append("    severityRating: ").append(toIndentedString(severityRating)).append("\n");
    sb.append("    relatedRequirements: ").append(toIndentedString(relatedRequirements)).append("\n");
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
    openapiFields.add("StandardsControlArn");
    openapiFields.add("ControlStatus");
    openapiFields.add("DisabledReason");
    openapiFields.add("ControlStatusUpdatedAt");
    openapiFields.add("ControlId");
    openapiFields.add("Title");
    openapiFields.add("Description");
    openapiFields.add("RemediationUrl");
    openapiFields.add("SeverityRating");
    openapiFields.add("RelatedRequirements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StandardsControl
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StandardsControl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardsControl is not found in the empty JSON string", StandardsControl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StandardsControl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StandardsControl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `StandardsControlArn`
      if (jsonObj.get("StandardsControlArn") != null && !jsonObj.get("StandardsControlArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StandardsControlArn"));
      }
      // validate the optional field `ControlStatus`
      if (jsonObj.get("ControlStatus") != null && !jsonObj.get("ControlStatus").isJsonNull()) {
        ControlStatus.validateJsonElement(jsonObj.get("ControlStatus"));
      }
      // validate the optional field `DisabledReason`
      if (jsonObj.get("DisabledReason") != null && !jsonObj.get("DisabledReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DisabledReason"));
      }
      // validate the optional field `ControlStatusUpdatedAt`
      if (jsonObj.get("ControlStatusUpdatedAt") != null && !jsonObj.get("ControlStatusUpdatedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ControlStatusUpdatedAt"));
      }
      // validate the optional field `ControlId`
      if (jsonObj.get("ControlId") != null && !jsonObj.get("ControlId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ControlId"));
      }
      // validate the optional field `Title`
      if (jsonObj.get("Title") != null && !jsonObj.get("Title").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Title"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `RemediationUrl`
      if (jsonObj.get("RemediationUrl") != null && !jsonObj.get("RemediationUrl").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RemediationUrl"));
      }
      // validate the optional field `SeverityRating`
      if (jsonObj.get("SeverityRating") != null && !jsonObj.get("SeverityRating").isJsonNull()) {
        SeverityRating.validateJsonElement(jsonObj.get("SeverityRating"));
      }
      // validate the optional field `RelatedRequirements`
      if (jsonObj.get("RelatedRequirements") != null && !jsonObj.get("RelatedRequirements").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RelatedRequirements"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardsControl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardsControl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardsControl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardsControl.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardsControl>() {
           @Override
           public void write(JsonWriter out, StandardsControl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StandardsControl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StandardsControl given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StandardsControl
   * @throws IOException if the JSON string is invalid with respect to StandardsControl
   */
  public static StandardsControl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardsControl.class);
  }

  /**
   * Convert an instance of StandardsControl to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

