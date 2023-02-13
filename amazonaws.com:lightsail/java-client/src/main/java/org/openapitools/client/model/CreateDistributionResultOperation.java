/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import org.openapitools.client.model.OperationLocation;
import org.openapitools.client.model.OperationStatus;
import org.openapitools.client.model.OperationType;
import org.openapitools.client.model.ResourceType;

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
 * CreateDistributionResultOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateDistributionResultOperation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private OperationLocation location;

  public static final String SERIALIZED_NAME_IS_TERMINAL = "isTerminal";
  @SerializedName(SERIALIZED_NAME_IS_TERMINAL)
  private Boolean isTerminal;

  public static final String SERIALIZED_NAME_OPERATION_DETAILS = "operationDetails";
  @SerializedName(SERIALIZED_NAME_OPERATION_DETAILS)
  private String operationDetails;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operationType";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private OperationType operationType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private OperationStatus status;

  public static final String SERIALIZED_NAME_STATUS_CHANGED_AT = "statusChangedAt";
  @SerializedName(SERIALIZED_NAME_STATUS_CHANGED_AT)
  private OffsetDateTime statusChangedAt;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public CreateDistributionResultOperation() {
  }

  public CreateDistributionResultOperation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CreateDistributionResultOperation resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   */
  @javax.annotation.Nullable
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public CreateDistributionResultOperation resourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public ResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public CreateDistributionResultOperation createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreateDistributionResultOperation location(OperationLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public OperationLocation getLocation() {
    return location;
  }

  public void setLocation(OperationLocation location) {
    this.location = location;
  }


  public CreateDistributionResultOperation isTerminal(Boolean isTerminal) {
    this.isTerminal = isTerminal;
    return this;
  }

  /**
   * Get isTerminal
   * @return isTerminal
   */
  @javax.annotation.Nullable
  public Boolean getIsTerminal() {
    return isTerminal;
  }

  public void setIsTerminal(Boolean isTerminal) {
    this.isTerminal = isTerminal;
  }


  public CreateDistributionResultOperation operationDetails(String operationDetails) {
    this.operationDetails = operationDetails;
    return this;
  }

  /**
   * Get operationDetails
   * @return operationDetails
   */
  @javax.annotation.Nullable
  public String getOperationDetails() {
    return operationDetails;
  }

  public void setOperationDetails(String operationDetails) {
    this.operationDetails = operationDetails;
  }


  public CreateDistributionResultOperation operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
   */
  @javax.annotation.Nullable
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }


  public CreateDistributionResultOperation status(OperationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public OperationStatus getStatus() {
    return status;
  }

  public void setStatus(OperationStatus status) {
    this.status = status;
  }


  public CreateDistributionResultOperation statusChangedAt(OffsetDateTime statusChangedAt) {
    this.statusChangedAt = statusChangedAt;
    return this;
  }

  /**
   * Get statusChangedAt
   * @return statusChangedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStatusChangedAt() {
    return statusChangedAt;
  }

  public void setStatusChangedAt(OffsetDateTime statusChangedAt) {
    this.statusChangedAt = statusChangedAt;
  }


  public CreateDistributionResultOperation errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  @javax.annotation.Nullable
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CreateDistributionResultOperation errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails
   * @return errorDetails
   */
  @javax.annotation.Nullable
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDistributionResultOperation createDistributionResultOperation = (CreateDistributionResultOperation) o;
    return Objects.equals(this.id, createDistributionResultOperation.id) &&
        Objects.equals(this.resourceName, createDistributionResultOperation.resourceName) &&
        Objects.equals(this.resourceType, createDistributionResultOperation.resourceType) &&
        Objects.equals(this.createdAt, createDistributionResultOperation.createdAt) &&
        Objects.equals(this.location, createDistributionResultOperation.location) &&
        Objects.equals(this.isTerminal, createDistributionResultOperation.isTerminal) &&
        Objects.equals(this.operationDetails, createDistributionResultOperation.operationDetails) &&
        Objects.equals(this.operationType, createDistributionResultOperation.operationType) &&
        Objects.equals(this.status, createDistributionResultOperation.status) &&
        Objects.equals(this.statusChangedAt, createDistributionResultOperation.statusChangedAt) &&
        Objects.equals(this.errorCode, createDistributionResultOperation.errorCode) &&
        Objects.equals(this.errorDetails, createDistributionResultOperation.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceName, resourceType, createdAt, location, isTerminal, operationDetails, operationType, status, statusChangedAt, errorCode, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDistributionResultOperation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    isTerminal: ").append(toIndentedString(isTerminal)).append("\n");
    sb.append("    operationDetails: ").append(toIndentedString(operationDetails)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedAt: ").append(toIndentedString(statusChangedAt)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("resourceName");
    openapiFields.add("resourceType");
    openapiFields.add("createdAt");
    openapiFields.add("location");
    openapiFields.add("isTerminal");
    openapiFields.add("operationDetails");
    openapiFields.add("operationType");
    openapiFields.add("status");
    openapiFields.add("statusChangedAt");
    openapiFields.add("errorCode");
    openapiFields.add("errorDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDistributionResultOperation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDistributionResultOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDistributionResultOperation is not found in the empty JSON string", CreateDistributionResultOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDistributionResultOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDistributionResultOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("id"));
      }
      // validate the optional field `resourceName`
      if (jsonObj.get("resourceName") != null && !jsonObj.get("resourceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("resourceName"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        OperationLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `isTerminal`
      if (jsonObj.get("isTerminal") != null && !jsonObj.get("isTerminal").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isTerminal"));
      }
      // validate the optional field `operationDetails`
      if (jsonObj.get("operationDetails") != null && !jsonObj.get("operationDetails").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("operationDetails"));
      }
      // validate the optional field `operationType`
      if (jsonObj.get("operationType") != null && !jsonObj.get("operationType").isJsonNull()) {
        OperationType.validateJsonElement(jsonObj.get("operationType"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        OperationStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `statusChangedAt`
      if (jsonObj.get("statusChangedAt") != null && !jsonObj.get("statusChangedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("statusChangedAt"));
      }
      // validate the optional field `errorCode`
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("errorCode"));
      }
      // validate the optional field `errorDetails`
      if (jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("errorDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDistributionResultOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDistributionResultOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDistributionResultOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDistributionResultOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDistributionResultOperation>() {
           @Override
           public void write(JsonWriter out, CreateDistributionResultOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDistributionResultOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDistributionResultOperation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDistributionResultOperation
   * @throws IOException if the JSON string is invalid with respect to CreateDistributionResultOperation
   */
  public static CreateDistributionResultOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDistributionResultOperation.class);
  }

  /**
   * Convert an instance of CreateDistributionResultOperation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

