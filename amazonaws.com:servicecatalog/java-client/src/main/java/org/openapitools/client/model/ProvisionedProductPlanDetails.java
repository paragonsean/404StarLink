/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import org.openapitools.client.model.ProvisionedProductPlanStatus;
import org.openapitools.client.model.ProvisionedProductPlanType;

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
 * Information about a plan.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisionedProductPlanDetails {
  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_PATH_ID = "PathId";
  @SerializedName(SERIALIZED_NAME_PATH_ID)
  private String pathId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "PlanName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_ID = "PlanId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PROVISION_PRODUCT_ID = "ProvisionProductId";
  @SerializedName(SERIALIZED_NAME_PROVISION_PRODUCT_ID)
  private String provisionProductId;

  public static final String SERIALIZED_NAME_PROVISION_PRODUCT_NAME = "ProvisionProductName";
  @SerializedName(SERIALIZED_NAME_PROVISION_PRODUCT_NAME)
  private String provisionProductName;

  public static final String SERIALIZED_NAME_PLAN_TYPE = "PlanType";
  @SerializedName(SERIALIZED_NAME_PLAN_TYPE)
  private ProvisionedProductPlanType planType;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID = "ProvisioningArtifactId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID)
  private String provisioningArtifactId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ProvisionedProductPlanStatus status;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "UpdatedTime";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private OffsetDateTime updatedTime;

  public static final String SERIALIZED_NAME_NOTIFICATION_ARNS = "NotificationArns";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ARNS)
  private List notificationArns;

  public static final String SERIALIZED_NAME_PROVISIONING_PARAMETERS = "ProvisioningParameters";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_PARAMETERS)
  private List provisioningParameters;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "StatusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public ProvisionedProductPlanDetails() {
  }

  public ProvisionedProductPlanDetails createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public ProvisionedProductPlanDetails pathId(String pathId) {
    this.pathId = pathId;
    return this;
  }

  /**
   * Get pathId
   * @return pathId
   */
  @javax.annotation.Nullable
  public String getPathId() {
    return pathId;
  }

  public void setPathId(String pathId) {
    this.pathId = pathId;
  }


  public ProvisionedProductPlanDetails productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public ProvisionedProductPlanDetails planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Get planName
   * @return planName
   */
  @javax.annotation.Nullable
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public ProvisionedProductPlanDetails planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
   */
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public ProvisionedProductPlanDetails provisionProductId(String provisionProductId) {
    this.provisionProductId = provisionProductId;
    return this;
  }

  /**
   * Get provisionProductId
   * @return provisionProductId
   */
  @javax.annotation.Nullable
  public String getProvisionProductId() {
    return provisionProductId;
  }

  public void setProvisionProductId(String provisionProductId) {
    this.provisionProductId = provisionProductId;
  }


  public ProvisionedProductPlanDetails provisionProductName(String provisionProductName) {
    this.provisionProductName = provisionProductName;
    return this;
  }

  /**
   * Get provisionProductName
   * @return provisionProductName
   */
  @javax.annotation.Nullable
  public String getProvisionProductName() {
    return provisionProductName;
  }

  public void setProvisionProductName(String provisionProductName) {
    this.provisionProductName = provisionProductName;
  }


  public ProvisionedProductPlanDetails planType(ProvisionedProductPlanType planType) {
    this.planType = planType;
    return this;
  }

  /**
   * Get planType
   * @return planType
   */
  @javax.annotation.Nullable
  public ProvisionedProductPlanType getPlanType() {
    return planType;
  }

  public void setPlanType(ProvisionedProductPlanType planType) {
    this.planType = planType;
  }


  public ProvisionedProductPlanDetails provisioningArtifactId(String provisioningArtifactId) {
    this.provisioningArtifactId = provisioningArtifactId;
    return this;
  }

  /**
   * Get provisioningArtifactId
   * @return provisioningArtifactId
   */
  @javax.annotation.Nullable
  public String getProvisioningArtifactId() {
    return provisioningArtifactId;
  }

  public void setProvisioningArtifactId(String provisioningArtifactId) {
    this.provisioningArtifactId = provisioningArtifactId;
  }


  public ProvisionedProductPlanDetails status(ProvisionedProductPlanStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ProvisionedProductPlanStatus getStatus() {
    return status;
  }

  public void setStatus(ProvisionedProductPlanStatus status) {
    this.status = status;
  }


  public ProvisionedProductPlanDetails updatedTime(OffsetDateTime updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(OffsetDateTime updatedTime) {
    this.updatedTime = updatedTime;
  }


  public ProvisionedProductPlanDetails notificationArns(List notificationArns) {
    this.notificationArns = notificationArns;
    return this;
  }

  /**
   * Get notificationArns
   * @return notificationArns
   */
  @javax.annotation.Nullable
  public List getNotificationArns() {
    return notificationArns;
  }

  public void setNotificationArns(List notificationArns) {
    this.notificationArns = notificationArns;
  }


  public ProvisionedProductPlanDetails provisioningParameters(List provisioningParameters) {
    this.provisioningParameters = provisioningParameters;
    return this;
  }

  /**
   * Get provisioningParameters
   * @return provisioningParameters
   */
  @javax.annotation.Nullable
  public List getProvisioningParameters() {
    return provisioningParameters;
  }

  public void setProvisioningParameters(List provisioningParameters) {
    this.provisioningParameters = provisioningParameters;
  }


  public ProvisionedProductPlanDetails tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public ProvisionedProductPlanDetails statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionedProductPlanDetails provisionedProductPlanDetails = (ProvisionedProductPlanDetails) o;
    return Objects.equals(this.createdTime, provisionedProductPlanDetails.createdTime) &&
        Objects.equals(this.pathId, provisionedProductPlanDetails.pathId) &&
        Objects.equals(this.productId, provisionedProductPlanDetails.productId) &&
        Objects.equals(this.planName, provisionedProductPlanDetails.planName) &&
        Objects.equals(this.planId, provisionedProductPlanDetails.planId) &&
        Objects.equals(this.provisionProductId, provisionedProductPlanDetails.provisionProductId) &&
        Objects.equals(this.provisionProductName, provisionedProductPlanDetails.provisionProductName) &&
        Objects.equals(this.planType, provisionedProductPlanDetails.planType) &&
        Objects.equals(this.provisioningArtifactId, provisionedProductPlanDetails.provisioningArtifactId) &&
        Objects.equals(this.status, provisionedProductPlanDetails.status) &&
        Objects.equals(this.updatedTime, provisionedProductPlanDetails.updatedTime) &&
        Objects.equals(this.notificationArns, provisionedProductPlanDetails.notificationArns) &&
        Objects.equals(this.provisioningParameters, provisionedProductPlanDetails.provisioningParameters) &&
        Objects.equals(this.tags, provisionedProductPlanDetails.tags) &&
        Objects.equals(this.statusMessage, provisionedProductPlanDetails.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, pathId, productId, planName, planId, provisionProductId, provisionProductName, planType, provisioningArtifactId, status, updatedTime, notificationArns, provisioningParameters, tags, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionedProductPlanDetails {\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    provisionProductId: ").append(toIndentedString(provisionProductId)).append("\n");
    sb.append("    provisionProductName: ").append(toIndentedString(provisionProductName)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    provisioningArtifactId: ").append(toIndentedString(provisioningArtifactId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    notificationArns: ").append(toIndentedString(notificationArns)).append("\n");
    sb.append("    provisioningParameters: ").append(toIndentedString(provisioningParameters)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
    openapiFields.add("CreatedTime");
    openapiFields.add("PathId");
    openapiFields.add("ProductId");
    openapiFields.add("PlanName");
    openapiFields.add("PlanId");
    openapiFields.add("ProvisionProductId");
    openapiFields.add("ProvisionProductName");
    openapiFields.add("PlanType");
    openapiFields.add("ProvisioningArtifactId");
    openapiFields.add("Status");
    openapiFields.add("UpdatedTime");
    openapiFields.add("NotificationArns");
    openapiFields.add("ProvisioningParameters");
    openapiFields.add("Tags");
    openapiFields.add("StatusMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisionedProductPlanDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisionedProductPlanDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisionedProductPlanDetails is not found in the empty JSON string", ProvisionedProductPlanDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisionedProductPlanDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisionedProductPlanDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `PathId`
      if (jsonObj.get("PathId") != null && !jsonObj.get("PathId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PathId"));
      }
      // validate the optional field `ProductId`
      if (jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductId"));
      }
      // validate the optional field `PlanName`
      if (jsonObj.get("PlanName") != null && !jsonObj.get("PlanName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PlanName"));
      }
      // validate the optional field `PlanId`
      if (jsonObj.get("PlanId") != null && !jsonObj.get("PlanId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PlanId"));
      }
      // validate the optional field `ProvisionProductId`
      if (jsonObj.get("ProvisionProductId") != null && !jsonObj.get("ProvisionProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionProductId"));
      }
      // validate the optional field `ProvisionProductName`
      if (jsonObj.get("ProvisionProductName") != null && !jsonObj.get("ProvisionProductName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionProductName"));
      }
      // validate the optional field `PlanType`
      if (jsonObj.get("PlanType") != null && !jsonObj.get("PlanType").isJsonNull()) {
        ProvisionedProductPlanType.validateJsonElement(jsonObj.get("PlanType"));
      }
      // validate the optional field `ProvisioningArtifactId`
      if (jsonObj.get("ProvisioningArtifactId") != null && !jsonObj.get("ProvisioningArtifactId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ProvisionedProductPlanStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `UpdatedTime`
      if (jsonObj.get("UpdatedTime") != null && !jsonObj.get("UpdatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("UpdatedTime"));
      }
      // validate the optional field `NotificationArns`
      if (jsonObj.get("NotificationArns") != null && !jsonObj.get("NotificationArns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NotificationArns"));
      }
      // validate the optional field `ProvisioningParameters`
      if (jsonObj.get("ProvisioningParameters") != null && !jsonObj.get("ProvisioningParameters").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProvisioningParameters"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
      // validate the optional field `StatusMessage`
      if (jsonObj.get("StatusMessage") != null && !jsonObj.get("StatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisionedProductPlanDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisionedProductPlanDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisionedProductPlanDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisionedProductPlanDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisionedProductPlanDetails>() {
           @Override
           public void write(JsonWriter out, ProvisionedProductPlanDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisionedProductPlanDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisionedProductPlanDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisionedProductPlanDetails
   * @throws IOException if the JSON string is invalid with respect to ProvisionedProductPlanDetails
   */
  public static ProvisionedProductPlanDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisionedProductPlanDetails.class);
  }

  /**
   * Convert an instance of ProvisionedProductPlanDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

