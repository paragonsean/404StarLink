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
import java.util.Map;
import org.openapitools.client.model.AwsApiGatewayV2StageDetailsAccessLogSettings;
import org.openapitools.client.model.AwsApiGatewayV2StageDetailsDefaultRouteSettings;
import org.openapitools.client.model.AwsApiGatewayV2StageDetailsRouteSettings;

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
 * Contains information about a version 2 stage for Amazon API Gateway.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsApiGatewayV2StageDetails {
  public static final String SERIALIZED_NAME_CLIENT_CERTIFICATE_ID = "ClientCertificateId";
  @SerializedName(SERIALIZED_NAME_CLIENT_CERTIFICATE_ID)
  private String clientCertificateId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private String createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_ROUTE_SETTINGS = "DefaultRouteSettings";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ROUTE_SETTINGS)
  private AwsApiGatewayV2StageDetailsDefaultRouteSettings defaultRouteSettings;

  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "DeploymentId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID)
  private String deploymentId;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE = "LastUpdatedDate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE)
  private String lastUpdatedDate;

  public static final String SERIALIZED_NAME_ROUTE_SETTINGS = "RouteSettings";
  @SerializedName(SERIALIZED_NAME_ROUTE_SETTINGS)
  private AwsApiGatewayV2StageDetailsRouteSettings routeSettings;

  public static final String SERIALIZED_NAME_STAGE_NAME = "StageName";
  @SerializedName(SERIALIZED_NAME_STAGE_NAME)
  private String stageName;

  public static final String SERIALIZED_NAME_STAGE_VARIABLES = "StageVariables";
  @SerializedName(SERIALIZED_NAME_STAGE_VARIABLES)
  private Map stageVariables;

  public static final String SERIALIZED_NAME_ACCESS_LOG_SETTINGS = "AccessLogSettings";
  @SerializedName(SERIALIZED_NAME_ACCESS_LOG_SETTINGS)
  private AwsApiGatewayV2StageDetailsAccessLogSettings accessLogSettings;

  public static final String SERIALIZED_NAME_AUTO_DEPLOY = "AutoDeploy";
  @SerializedName(SERIALIZED_NAME_AUTO_DEPLOY)
  private Boolean autoDeploy;

  public static final String SERIALIZED_NAME_LAST_DEPLOYMENT_STATUS_MESSAGE = "LastDeploymentStatusMessage";
  @SerializedName(SERIALIZED_NAME_LAST_DEPLOYMENT_STATUS_MESSAGE)
  private String lastDeploymentStatusMessage;

  public static final String SERIALIZED_NAME_API_GATEWAY_MANAGED = "ApiGatewayManaged";
  @SerializedName(SERIALIZED_NAME_API_GATEWAY_MANAGED)
  private Boolean apiGatewayManaged;

  public AwsApiGatewayV2StageDetails() {
  }

  public AwsApiGatewayV2StageDetails clientCertificateId(String clientCertificateId) {
    this.clientCertificateId = clientCertificateId;
    return this;
  }

  /**
   * Get clientCertificateId
   * @return clientCertificateId
   */
  @javax.annotation.Nullable
  public String getClientCertificateId() {
    return clientCertificateId;
  }

  public void setClientCertificateId(String clientCertificateId) {
    this.clientCertificateId = clientCertificateId;
  }


  public AwsApiGatewayV2StageDetails createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public AwsApiGatewayV2StageDetails description(String description) {
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


  public AwsApiGatewayV2StageDetails defaultRouteSettings(AwsApiGatewayV2StageDetailsDefaultRouteSettings defaultRouteSettings) {
    this.defaultRouteSettings = defaultRouteSettings;
    return this;
  }

  /**
   * Get defaultRouteSettings
   * @return defaultRouteSettings
   */
  @javax.annotation.Nullable
  public AwsApiGatewayV2StageDetailsDefaultRouteSettings getDefaultRouteSettings() {
    return defaultRouteSettings;
  }

  public void setDefaultRouteSettings(AwsApiGatewayV2StageDetailsDefaultRouteSettings defaultRouteSettings) {
    this.defaultRouteSettings = defaultRouteSettings;
  }


  public AwsApiGatewayV2StageDetails deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Get deploymentId
   * @return deploymentId
   */
  @javax.annotation.Nullable
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  public AwsApiGatewayV2StageDetails lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
   */
  @javax.annotation.Nullable
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  public AwsApiGatewayV2StageDetails routeSettings(AwsApiGatewayV2StageDetailsRouteSettings routeSettings) {
    this.routeSettings = routeSettings;
    return this;
  }

  /**
   * Get routeSettings
   * @return routeSettings
   */
  @javax.annotation.Nullable
  public AwsApiGatewayV2StageDetailsRouteSettings getRouteSettings() {
    return routeSettings;
  }

  public void setRouteSettings(AwsApiGatewayV2StageDetailsRouteSettings routeSettings) {
    this.routeSettings = routeSettings;
  }


  public AwsApiGatewayV2StageDetails stageName(String stageName) {
    this.stageName = stageName;
    return this;
  }

  /**
   * Get stageName
   * @return stageName
   */
  @javax.annotation.Nullable
  public String getStageName() {
    return stageName;
  }

  public void setStageName(String stageName) {
    this.stageName = stageName;
  }


  public AwsApiGatewayV2StageDetails stageVariables(Map stageVariables) {
    this.stageVariables = stageVariables;
    return this;
  }

  /**
   * Get stageVariables
   * @return stageVariables
   */
  @javax.annotation.Nullable
  public Map getStageVariables() {
    return stageVariables;
  }

  public void setStageVariables(Map stageVariables) {
    this.stageVariables = stageVariables;
  }


  public AwsApiGatewayV2StageDetails accessLogSettings(AwsApiGatewayV2StageDetailsAccessLogSettings accessLogSettings) {
    this.accessLogSettings = accessLogSettings;
    return this;
  }

  /**
   * Get accessLogSettings
   * @return accessLogSettings
   */
  @javax.annotation.Nullable
  public AwsApiGatewayV2StageDetailsAccessLogSettings getAccessLogSettings() {
    return accessLogSettings;
  }

  public void setAccessLogSettings(AwsApiGatewayV2StageDetailsAccessLogSettings accessLogSettings) {
    this.accessLogSettings = accessLogSettings;
  }


  public AwsApiGatewayV2StageDetails autoDeploy(Boolean autoDeploy) {
    this.autoDeploy = autoDeploy;
    return this;
  }

  /**
   * Get autoDeploy
   * @return autoDeploy
   */
  @javax.annotation.Nullable
  public Boolean getAutoDeploy() {
    return autoDeploy;
  }

  public void setAutoDeploy(Boolean autoDeploy) {
    this.autoDeploy = autoDeploy;
  }


  public AwsApiGatewayV2StageDetails lastDeploymentStatusMessage(String lastDeploymentStatusMessage) {
    this.lastDeploymentStatusMessage = lastDeploymentStatusMessage;
    return this;
  }

  /**
   * Get lastDeploymentStatusMessage
   * @return lastDeploymentStatusMessage
   */
  @javax.annotation.Nullable
  public String getLastDeploymentStatusMessage() {
    return lastDeploymentStatusMessage;
  }

  public void setLastDeploymentStatusMessage(String lastDeploymentStatusMessage) {
    this.lastDeploymentStatusMessage = lastDeploymentStatusMessage;
  }


  public AwsApiGatewayV2StageDetails apiGatewayManaged(Boolean apiGatewayManaged) {
    this.apiGatewayManaged = apiGatewayManaged;
    return this;
  }

  /**
   * Get apiGatewayManaged
   * @return apiGatewayManaged
   */
  @javax.annotation.Nullable
  public Boolean getApiGatewayManaged() {
    return apiGatewayManaged;
  }

  public void setApiGatewayManaged(Boolean apiGatewayManaged) {
    this.apiGatewayManaged = apiGatewayManaged;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsApiGatewayV2StageDetails awsApiGatewayV2StageDetails = (AwsApiGatewayV2StageDetails) o;
    return Objects.equals(this.clientCertificateId, awsApiGatewayV2StageDetails.clientCertificateId) &&
        Objects.equals(this.createdDate, awsApiGatewayV2StageDetails.createdDate) &&
        Objects.equals(this.description, awsApiGatewayV2StageDetails.description) &&
        Objects.equals(this.defaultRouteSettings, awsApiGatewayV2StageDetails.defaultRouteSettings) &&
        Objects.equals(this.deploymentId, awsApiGatewayV2StageDetails.deploymentId) &&
        Objects.equals(this.lastUpdatedDate, awsApiGatewayV2StageDetails.lastUpdatedDate) &&
        Objects.equals(this.routeSettings, awsApiGatewayV2StageDetails.routeSettings) &&
        Objects.equals(this.stageName, awsApiGatewayV2StageDetails.stageName) &&
        Objects.equals(this.stageVariables, awsApiGatewayV2StageDetails.stageVariables) &&
        Objects.equals(this.accessLogSettings, awsApiGatewayV2StageDetails.accessLogSettings) &&
        Objects.equals(this.autoDeploy, awsApiGatewayV2StageDetails.autoDeploy) &&
        Objects.equals(this.lastDeploymentStatusMessage, awsApiGatewayV2StageDetails.lastDeploymentStatusMessage) &&
        Objects.equals(this.apiGatewayManaged, awsApiGatewayV2StageDetails.apiGatewayManaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCertificateId, createdDate, description, defaultRouteSettings, deploymentId, lastUpdatedDate, routeSettings, stageName, stageVariables, accessLogSettings, autoDeploy, lastDeploymentStatusMessage, apiGatewayManaged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsApiGatewayV2StageDetails {\n");
    sb.append("    clientCertificateId: ").append(toIndentedString(clientCertificateId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultRouteSettings: ").append(toIndentedString(defaultRouteSettings)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    routeSettings: ").append(toIndentedString(routeSettings)).append("\n");
    sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
    sb.append("    stageVariables: ").append(toIndentedString(stageVariables)).append("\n");
    sb.append("    accessLogSettings: ").append(toIndentedString(accessLogSettings)).append("\n");
    sb.append("    autoDeploy: ").append(toIndentedString(autoDeploy)).append("\n");
    sb.append("    lastDeploymentStatusMessage: ").append(toIndentedString(lastDeploymentStatusMessage)).append("\n");
    sb.append("    apiGatewayManaged: ").append(toIndentedString(apiGatewayManaged)).append("\n");
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
    openapiFields.add("ClientCertificateId");
    openapiFields.add("CreatedDate");
    openapiFields.add("Description");
    openapiFields.add("DefaultRouteSettings");
    openapiFields.add("DeploymentId");
    openapiFields.add("LastUpdatedDate");
    openapiFields.add("RouteSettings");
    openapiFields.add("StageName");
    openapiFields.add("StageVariables");
    openapiFields.add("AccessLogSettings");
    openapiFields.add("AutoDeploy");
    openapiFields.add("LastDeploymentStatusMessage");
    openapiFields.add("ApiGatewayManaged");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsApiGatewayV2StageDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsApiGatewayV2StageDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsApiGatewayV2StageDetails is not found in the empty JSON string", AwsApiGatewayV2StageDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsApiGatewayV2StageDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsApiGatewayV2StageDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ClientCertificateId`
      if (jsonObj.get("ClientCertificateId") != null && !jsonObj.get("ClientCertificateId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ClientCertificateId"));
      }
      // validate the optional field `CreatedDate`
      if (jsonObj.get("CreatedDate") != null && !jsonObj.get("CreatedDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedDate"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `DefaultRouteSettings`
      if (jsonObj.get("DefaultRouteSettings") != null && !jsonObj.get("DefaultRouteSettings").isJsonNull()) {
        AwsApiGatewayV2StageDetailsDefaultRouteSettings.validateJsonElement(jsonObj.get("DefaultRouteSettings"));
      }
      // validate the optional field `DeploymentId`
      if (jsonObj.get("DeploymentId") != null && !jsonObj.get("DeploymentId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DeploymentId"));
      }
      // validate the optional field `LastUpdatedDate`
      if (jsonObj.get("LastUpdatedDate") != null && !jsonObj.get("LastUpdatedDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastUpdatedDate"));
      }
      // validate the optional field `RouteSettings`
      if (jsonObj.get("RouteSettings") != null && !jsonObj.get("RouteSettings").isJsonNull()) {
        AwsApiGatewayV2StageDetailsRouteSettings.validateJsonElement(jsonObj.get("RouteSettings"));
      }
      // validate the optional field `StageName`
      if (jsonObj.get("StageName") != null && !jsonObj.get("StageName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StageName"));
      }
      // validate the optional field `StageVariables`
      if (jsonObj.get("StageVariables") != null && !jsonObj.get("StageVariables").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("StageVariables"));
      }
      // validate the optional field `AccessLogSettings`
      if (jsonObj.get("AccessLogSettings") != null && !jsonObj.get("AccessLogSettings").isJsonNull()) {
        AwsApiGatewayV2StageDetailsAccessLogSettings.validateJsonElement(jsonObj.get("AccessLogSettings"));
      }
      // validate the optional field `AutoDeploy`
      if (jsonObj.get("AutoDeploy") != null && !jsonObj.get("AutoDeploy").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AutoDeploy"));
      }
      // validate the optional field `LastDeploymentStatusMessage`
      if (jsonObj.get("LastDeploymentStatusMessage") != null && !jsonObj.get("LastDeploymentStatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastDeploymentStatusMessage"));
      }
      // validate the optional field `ApiGatewayManaged`
      if (jsonObj.get("ApiGatewayManaged") != null && !jsonObj.get("ApiGatewayManaged").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ApiGatewayManaged"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsApiGatewayV2StageDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsApiGatewayV2StageDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsApiGatewayV2StageDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsApiGatewayV2StageDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsApiGatewayV2StageDetails>() {
           @Override
           public void write(JsonWriter out, AwsApiGatewayV2StageDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsApiGatewayV2StageDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsApiGatewayV2StageDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsApiGatewayV2StageDetails
   * @throws IOException if the JSON string is invalid with respect to AwsApiGatewayV2StageDetails
   */
  public static AwsApiGatewayV2StageDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsApiGatewayV2StageDetails.class);
  }

  /**
   * Convert an instance of AwsApiGatewayV2StageDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

