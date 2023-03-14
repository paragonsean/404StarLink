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
import org.openapitools.client.model.RecordStatus;

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
 * ExecuteProvisionedProductPlanOutputRecordDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ExecuteProvisionedProductPlanOutputRecordDetail {
  public static final String SERIALIZED_NAME_RECORD_ID = "RecordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_NAME = "ProvisionedProductName";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_NAME)
  private String provisionedProductName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RecordStatus status;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "UpdatedTime";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private OffsetDateTime updatedTime;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_TYPE = "ProvisionedProductType";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_TYPE)
  private String provisionedProductType;

  public static final String SERIALIZED_NAME_RECORD_TYPE = "RecordType";
  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  private String recordType;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_ID = "ProvisionedProductId";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_ID)
  private String provisionedProductId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID = "ProvisioningArtifactId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID)
  private String provisioningArtifactId;

  public static final String SERIALIZED_NAME_PATH_ID = "PathId";
  @SerializedName(SERIALIZED_NAME_PATH_ID)
  private String pathId;

  public static final String SERIALIZED_NAME_RECORD_ERRORS = "RecordErrors";
  @SerializedName(SERIALIZED_NAME_RECORD_ERRORS)
  private List recordErrors;

  public static final String SERIALIZED_NAME_RECORD_TAGS = "RecordTags";
  @SerializedName(SERIALIZED_NAME_RECORD_TAGS)
  private List recordTags;

  public static final String SERIALIZED_NAME_LAUNCH_ROLE_ARN = "LaunchRoleArn";
  @SerializedName(SERIALIZED_NAME_LAUNCH_ROLE_ARN)
  private String launchRoleArn;

  public ExecuteProvisionedProductPlanOutputRecordDetail() {
  }

  public ExecuteProvisionedProductPlanOutputRecordDetail recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * Get recordId
   * @return recordId
   */
  @javax.annotation.Nullable
  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail provisionedProductName(String provisionedProductName) {
    this.provisionedProductName = provisionedProductName;
    return this;
  }

  /**
   * Get provisionedProductName
   * @return provisionedProductName
   */
  @javax.annotation.Nullable
  public String getProvisionedProductName() {
    return provisionedProductName;
  }

  public void setProvisionedProductName(String provisionedProductName) {
    this.provisionedProductName = provisionedProductName;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail status(RecordStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public RecordStatus getStatus() {
    return status;
  }

  public void setStatus(RecordStatus status) {
    this.status = status;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail createdTime(OffsetDateTime createdTime) {
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


  public ExecuteProvisionedProductPlanOutputRecordDetail updatedTime(OffsetDateTime updatedTime) {
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


  public ExecuteProvisionedProductPlanOutputRecordDetail provisionedProductType(String provisionedProductType) {
    this.provisionedProductType = provisionedProductType;
    return this;
  }

  /**
   * Get provisionedProductType
   * @return provisionedProductType
   */
  @javax.annotation.Nullable
  public String getProvisionedProductType() {
    return provisionedProductType;
  }

  public void setProvisionedProductType(String provisionedProductType) {
    this.provisionedProductType = provisionedProductType;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
   */
  @javax.annotation.Nullable
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail provisionedProductId(String provisionedProductId) {
    this.provisionedProductId = provisionedProductId;
    return this;
  }

  /**
   * Get provisionedProductId
   * @return provisionedProductId
   */
  @javax.annotation.Nullable
  public String getProvisionedProductId() {
    return provisionedProductId;
  }

  public void setProvisionedProductId(String provisionedProductId) {
    this.provisionedProductId = provisionedProductId;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail productId(String productId) {
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


  public ExecuteProvisionedProductPlanOutputRecordDetail provisioningArtifactId(String provisioningArtifactId) {
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


  public ExecuteProvisionedProductPlanOutputRecordDetail pathId(String pathId) {
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


  public ExecuteProvisionedProductPlanOutputRecordDetail recordErrors(List recordErrors) {
    this.recordErrors = recordErrors;
    return this;
  }

  /**
   * Get recordErrors
   * @return recordErrors
   */
  @javax.annotation.Nullable
  public List getRecordErrors() {
    return recordErrors;
  }

  public void setRecordErrors(List recordErrors) {
    this.recordErrors = recordErrors;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail recordTags(List recordTags) {
    this.recordTags = recordTags;
    return this;
  }

  /**
   * Get recordTags
   * @return recordTags
   */
  @javax.annotation.Nullable
  public List getRecordTags() {
    return recordTags;
  }

  public void setRecordTags(List recordTags) {
    this.recordTags = recordTags;
  }


  public ExecuteProvisionedProductPlanOutputRecordDetail launchRoleArn(String launchRoleArn) {
    this.launchRoleArn = launchRoleArn;
    return this;
  }

  /**
   * Get launchRoleArn
   * @return launchRoleArn
   */
  @javax.annotation.Nullable
  public String getLaunchRoleArn() {
    return launchRoleArn;
  }

  public void setLaunchRoleArn(String launchRoleArn) {
    this.launchRoleArn = launchRoleArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteProvisionedProductPlanOutputRecordDetail executeProvisionedProductPlanOutputRecordDetail = (ExecuteProvisionedProductPlanOutputRecordDetail) o;
    return Objects.equals(this.recordId, executeProvisionedProductPlanOutputRecordDetail.recordId) &&
        Objects.equals(this.provisionedProductName, executeProvisionedProductPlanOutputRecordDetail.provisionedProductName) &&
        Objects.equals(this.status, executeProvisionedProductPlanOutputRecordDetail.status) &&
        Objects.equals(this.createdTime, executeProvisionedProductPlanOutputRecordDetail.createdTime) &&
        Objects.equals(this.updatedTime, executeProvisionedProductPlanOutputRecordDetail.updatedTime) &&
        Objects.equals(this.provisionedProductType, executeProvisionedProductPlanOutputRecordDetail.provisionedProductType) &&
        Objects.equals(this.recordType, executeProvisionedProductPlanOutputRecordDetail.recordType) &&
        Objects.equals(this.provisionedProductId, executeProvisionedProductPlanOutputRecordDetail.provisionedProductId) &&
        Objects.equals(this.productId, executeProvisionedProductPlanOutputRecordDetail.productId) &&
        Objects.equals(this.provisioningArtifactId, executeProvisionedProductPlanOutputRecordDetail.provisioningArtifactId) &&
        Objects.equals(this.pathId, executeProvisionedProductPlanOutputRecordDetail.pathId) &&
        Objects.equals(this.recordErrors, executeProvisionedProductPlanOutputRecordDetail.recordErrors) &&
        Objects.equals(this.recordTags, executeProvisionedProductPlanOutputRecordDetail.recordTags) &&
        Objects.equals(this.launchRoleArn, executeProvisionedProductPlanOutputRecordDetail.launchRoleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, provisionedProductName, status, createdTime, updatedTime, provisionedProductType, recordType, provisionedProductId, productId, provisioningArtifactId, pathId, recordErrors, recordTags, launchRoleArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteProvisionedProductPlanOutputRecordDetail {\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    provisionedProductName: ").append(toIndentedString(provisionedProductName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    provisionedProductType: ").append(toIndentedString(provisionedProductType)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    provisionedProductId: ").append(toIndentedString(provisionedProductId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    provisioningArtifactId: ").append(toIndentedString(provisioningArtifactId)).append("\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    recordErrors: ").append(toIndentedString(recordErrors)).append("\n");
    sb.append("    recordTags: ").append(toIndentedString(recordTags)).append("\n");
    sb.append("    launchRoleArn: ").append(toIndentedString(launchRoleArn)).append("\n");
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
    openapiFields.add("RecordId");
    openapiFields.add("ProvisionedProductName");
    openapiFields.add("Status");
    openapiFields.add("CreatedTime");
    openapiFields.add("UpdatedTime");
    openapiFields.add("ProvisionedProductType");
    openapiFields.add("RecordType");
    openapiFields.add("ProvisionedProductId");
    openapiFields.add("ProductId");
    openapiFields.add("ProvisioningArtifactId");
    openapiFields.add("PathId");
    openapiFields.add("RecordErrors");
    openapiFields.add("RecordTags");
    openapiFields.add("LaunchRoleArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExecuteProvisionedProductPlanOutputRecordDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteProvisionedProductPlanOutputRecordDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteProvisionedProductPlanOutputRecordDetail is not found in the empty JSON string", ExecuteProvisionedProductPlanOutputRecordDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteProvisionedProductPlanOutputRecordDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteProvisionedProductPlanOutputRecordDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `RecordId`
      if (jsonObj.get("RecordId") != null && !jsonObj.get("RecordId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RecordId"));
      }
      // validate the optional field `ProvisionedProductName`
      if (jsonObj.get("ProvisionedProductName") != null && !jsonObj.get("ProvisionedProductName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionedProductName"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        RecordStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `UpdatedTime`
      if (jsonObj.get("UpdatedTime") != null && !jsonObj.get("UpdatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("UpdatedTime"));
      }
      // validate the optional field `ProvisionedProductType`
      if (jsonObj.get("ProvisionedProductType") != null && !jsonObj.get("ProvisionedProductType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionedProductType"));
      }
      // validate the optional field `RecordType`
      if (jsonObj.get("RecordType") != null && !jsonObj.get("RecordType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RecordType"));
      }
      // validate the optional field `ProvisionedProductId`
      if (jsonObj.get("ProvisionedProductId") != null && !jsonObj.get("ProvisionedProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionedProductId"));
      }
      // validate the optional field `ProductId`
      if (jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductId"));
      }
      // validate the optional field `ProvisioningArtifactId`
      if (jsonObj.get("ProvisioningArtifactId") != null && !jsonObj.get("ProvisioningArtifactId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactId"));
      }
      // validate the optional field `PathId`
      if (jsonObj.get("PathId") != null && !jsonObj.get("PathId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PathId"));
      }
      // validate the optional field `RecordErrors`
      if (jsonObj.get("RecordErrors") != null && !jsonObj.get("RecordErrors").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RecordErrors"));
      }
      // validate the optional field `RecordTags`
      if (jsonObj.get("RecordTags") != null && !jsonObj.get("RecordTags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RecordTags"));
      }
      // validate the optional field `LaunchRoleArn`
      if (jsonObj.get("LaunchRoleArn") != null && !jsonObj.get("LaunchRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchRoleArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteProvisionedProductPlanOutputRecordDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteProvisionedProductPlanOutputRecordDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteProvisionedProductPlanOutputRecordDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteProvisionedProductPlanOutputRecordDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteProvisionedProductPlanOutputRecordDetail>() {
           @Override
           public void write(JsonWriter out, ExecuteProvisionedProductPlanOutputRecordDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteProvisionedProductPlanOutputRecordDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExecuteProvisionedProductPlanOutputRecordDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExecuteProvisionedProductPlanOutputRecordDetail
   * @throws IOException if the JSON string is invalid with respect to ExecuteProvisionedProductPlanOutputRecordDetail
   */
  public static ExecuteProvisionedProductPlanOutputRecordDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteProvisionedProductPlanOutputRecordDetail.class);
  }

  /**
   * Convert an instance of ExecuteProvisionedProductPlanOutputRecordDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

