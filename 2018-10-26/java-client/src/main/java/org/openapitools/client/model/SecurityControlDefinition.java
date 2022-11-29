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
import org.openapitools.client.model.RegionAvailabilityStatus;
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
 *  Provides metadata for a security control, including its unique standard-agnostic identifier, title, description, severity, availability in Amazon Web Services Regions, and a link to remediation steps. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SecurityControlDefinition {
  public static final String SERIALIZED_NAME_SECURITY_CONTROL_ID = "SecurityControlId";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTROL_ID)
  private String securityControlId;

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

  public static final String SERIALIZED_NAME_CURRENT_REGION_AVAILABILITY = "CurrentRegionAvailability";
  @SerializedName(SERIALIZED_NAME_CURRENT_REGION_AVAILABILITY)
  private RegionAvailabilityStatus currentRegionAvailability;

  public SecurityControlDefinition() {
  }

  public SecurityControlDefinition securityControlId(String securityControlId) {
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


  public SecurityControlDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public SecurityControlDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public SecurityControlDefinition remediationUrl(String remediationUrl) {
    this.remediationUrl = remediationUrl;
    return this;
  }

  /**
   * Get remediationUrl
   * @return remediationUrl
   */
  @javax.annotation.Nonnull
  public String getRemediationUrl() {
    return remediationUrl;
  }

  public void setRemediationUrl(String remediationUrl) {
    this.remediationUrl = remediationUrl;
  }


  public SecurityControlDefinition severityRating(SeverityRating severityRating) {
    this.severityRating = severityRating;
    return this;
  }

  /**
   * Get severityRating
   * @return severityRating
   */
  @javax.annotation.Nonnull
  public SeverityRating getSeverityRating() {
    return severityRating;
  }

  public void setSeverityRating(SeverityRating severityRating) {
    this.severityRating = severityRating;
  }


  public SecurityControlDefinition currentRegionAvailability(RegionAvailabilityStatus currentRegionAvailability) {
    this.currentRegionAvailability = currentRegionAvailability;
    return this;
  }

  /**
   * Get currentRegionAvailability
   * @return currentRegionAvailability
   */
  @javax.annotation.Nonnull
  public RegionAvailabilityStatus getCurrentRegionAvailability() {
    return currentRegionAvailability;
  }

  public void setCurrentRegionAvailability(RegionAvailabilityStatus currentRegionAvailability) {
    this.currentRegionAvailability = currentRegionAvailability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityControlDefinition securityControlDefinition = (SecurityControlDefinition) o;
    return Objects.equals(this.securityControlId, securityControlDefinition.securityControlId) &&
        Objects.equals(this.title, securityControlDefinition.title) &&
        Objects.equals(this.description, securityControlDefinition.description) &&
        Objects.equals(this.remediationUrl, securityControlDefinition.remediationUrl) &&
        Objects.equals(this.severityRating, securityControlDefinition.severityRating) &&
        Objects.equals(this.currentRegionAvailability, securityControlDefinition.currentRegionAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityControlId, title, description, remediationUrl, severityRating, currentRegionAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityControlDefinition {\n");
    sb.append("    securityControlId: ").append(toIndentedString(securityControlId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    remediationUrl: ").append(toIndentedString(remediationUrl)).append("\n");
    sb.append("    severityRating: ").append(toIndentedString(severityRating)).append("\n");
    sb.append("    currentRegionAvailability: ").append(toIndentedString(currentRegionAvailability)).append("\n");
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
    openapiFields.add("SecurityControlId");
    openapiFields.add("Title");
    openapiFields.add("Description");
    openapiFields.add("RemediationUrl");
    openapiFields.add("SeverityRating");
    openapiFields.add("CurrentRegionAvailability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SecurityControlId");
    openapiRequiredFields.add("Title");
    openapiRequiredFields.add("Description");
    openapiRequiredFields.add("RemediationUrl");
    openapiRequiredFields.add("SeverityRating");
    openapiRequiredFields.add("CurrentRegionAvailability");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SecurityControlDefinition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecurityControlDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecurityControlDefinition is not found in the empty JSON string", SecurityControlDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SecurityControlDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecurityControlDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecurityControlDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `SecurityControlId`
      String.validateJsonElement(jsonObj.get("SecurityControlId"));
      // validate the required field `Title`
      String.validateJsonElement(jsonObj.get("Title"));
      // validate the required field `Description`
      String.validateJsonElement(jsonObj.get("Description"));
      // validate the required field `RemediationUrl`
      String.validateJsonElement(jsonObj.get("RemediationUrl"));
      // validate the required field `SeverityRating`
      SeverityRating.validateJsonElement(jsonObj.get("SeverityRating"));
      // validate the required field `CurrentRegionAvailability`
      RegionAvailabilityStatus.validateJsonElement(jsonObj.get("CurrentRegionAvailability"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityControlDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityControlDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityControlDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityControlDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityControlDefinition>() {
           @Override
           public void write(JsonWriter out, SecurityControlDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityControlDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SecurityControlDefinition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SecurityControlDefinition
   * @throws IOException if the JSON string is invalid with respect to SecurityControlDefinition
   */
  public static SecurityControlDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityControlDefinition.class);
  }

  /**
   * Convert an instance of SecurityControlDefinition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

