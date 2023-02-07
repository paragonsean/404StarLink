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
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EngineWorkflowStatus;
import org.openapitools.client.model.NotifyProvisionProductEngineWorkflowResultInputResourceIdentifier;

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
 * NotifyProvisionProductEngineWorkflowResultInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NotifyProvisionProductEngineWorkflowResultInput {
  public static final String SERIALIZED_NAME_WORKFLOW_TOKEN = "WorkflowToken";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TOKEN)
  private String workflowToken;

  public static final String SERIALIZED_NAME_RECORD_ID = "RecordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EngineWorkflowStatus status;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "FailureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_RESOURCE_IDENTIFIER = "ResourceIdentifier";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDENTIFIER)
  private NotifyProvisionProductEngineWorkflowResultInputResourceIdentifier resourceIdentifier;

  public static final String SERIALIZED_NAME_OUTPUTS = "Outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private List outputs;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_TOKEN = "IdempotencyToken";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_TOKEN)
  private String idempotencyToken;

  public NotifyProvisionProductEngineWorkflowResultInput() {
  }

  public NotifyProvisionProductEngineWorkflowResultInput workflowToken(String workflowToken) {
    this.workflowToken = workflowToken;
    return this;
  }

  /**
   * Get workflowToken
   * @return workflowToken
   */
  @javax.annotation.Nonnull
  public String getWorkflowToken() {
    return workflowToken;
  }

  public void setWorkflowToken(String workflowToken) {
    this.workflowToken = workflowToken;
  }


  public NotifyProvisionProductEngineWorkflowResultInput recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * Get recordId
   * @return recordId
   */
  @javax.annotation.Nonnull
  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public NotifyProvisionProductEngineWorkflowResultInput status(EngineWorkflowStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public EngineWorkflowStatus getStatus() {
    return status;
  }

  public void setStatus(EngineWorkflowStatus status) {
    this.status = status;
  }


  public NotifyProvisionProductEngineWorkflowResultInput failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public NotifyProvisionProductEngineWorkflowResultInput resourceIdentifier(NotifyProvisionProductEngineWorkflowResultInputResourceIdentifier resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
    return this;
  }

  /**
   * Get resourceIdentifier
   * @return resourceIdentifier
   */
  @javax.annotation.Nullable
  public NotifyProvisionProductEngineWorkflowResultInputResourceIdentifier getResourceIdentifier() {
    return resourceIdentifier;
  }

  public void setResourceIdentifier(NotifyProvisionProductEngineWorkflowResultInputResourceIdentifier resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
  }


  public NotifyProvisionProductEngineWorkflowResultInput outputs(List outputs) {
    this.outputs = outputs;
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  @javax.annotation.Nullable
  public List getOutputs() {
    return outputs;
  }

  public void setOutputs(List outputs) {
    this.outputs = outputs;
  }


  public NotifyProvisionProductEngineWorkflowResultInput idempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  /**
   * Get idempotencyToken
   * @return idempotencyToken
   */
  @javax.annotation.Nonnull
  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public void setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyProvisionProductEngineWorkflowResultInput notifyProvisionProductEngineWorkflowResultInput = (NotifyProvisionProductEngineWorkflowResultInput) o;
    return Objects.equals(this.workflowToken, notifyProvisionProductEngineWorkflowResultInput.workflowToken) &&
        Objects.equals(this.recordId, notifyProvisionProductEngineWorkflowResultInput.recordId) &&
        Objects.equals(this.status, notifyProvisionProductEngineWorkflowResultInput.status) &&
        Objects.equals(this.failureReason, notifyProvisionProductEngineWorkflowResultInput.failureReason) &&
        Objects.equals(this.resourceIdentifier, notifyProvisionProductEngineWorkflowResultInput.resourceIdentifier) &&
        Objects.equals(this.outputs, notifyProvisionProductEngineWorkflowResultInput.outputs) &&
        Objects.equals(this.idempotencyToken, notifyProvisionProductEngineWorkflowResultInput.idempotencyToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowToken, recordId, status, failureReason, resourceIdentifier, outputs, idempotencyToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyProvisionProductEngineWorkflowResultInput {\n");
    sb.append("    workflowToken: ").append(toIndentedString(workflowToken)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    idempotencyToken: ").append(toIndentedString(idempotencyToken)).append("\n");
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
    openapiFields.add("WorkflowToken");
    openapiFields.add("RecordId");
    openapiFields.add("Status");
    openapiFields.add("FailureReason");
    openapiFields.add("ResourceIdentifier");
    openapiFields.add("Outputs");
    openapiFields.add("IdempotencyToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("WorkflowToken");
    openapiRequiredFields.add("RecordId");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("IdempotencyToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotifyProvisionProductEngineWorkflowResultInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotifyProvisionProductEngineWorkflowResultInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotifyProvisionProductEngineWorkflowResultInput is not found in the empty JSON string", NotifyProvisionProductEngineWorkflowResultInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotifyProvisionProductEngineWorkflowResultInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotifyProvisionProductEngineWorkflowResultInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotifyProvisionProductEngineWorkflowResultInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `WorkflowToken`
      String.validateJsonElement(jsonObj.get("WorkflowToken"));
      // validate the required field `RecordId`
      String.validateJsonElement(jsonObj.get("RecordId"));
      // validate the required field `Status`
      EngineWorkflowStatus.validateJsonElement(jsonObj.get("Status"));
      // validate the optional field `FailureReason`
      if (jsonObj.get("FailureReason") != null && !jsonObj.get("FailureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FailureReason"));
      }
      // validate the optional field `ResourceIdentifier`
      if (jsonObj.get("ResourceIdentifier") != null && !jsonObj.get("ResourceIdentifier").isJsonNull()) {
        NotifyProvisionProductEngineWorkflowResultInputResourceIdentifier.validateJsonElement(jsonObj.get("ResourceIdentifier"));
      }
      // validate the optional field `Outputs`
      if (jsonObj.get("Outputs") != null && !jsonObj.get("Outputs").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Outputs"));
      }
      // validate the required field `IdempotencyToken`
      String.validateJsonElement(jsonObj.get("IdempotencyToken"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotifyProvisionProductEngineWorkflowResultInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotifyProvisionProductEngineWorkflowResultInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotifyProvisionProductEngineWorkflowResultInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotifyProvisionProductEngineWorkflowResultInput.class));

       return (TypeAdapter<T>) new TypeAdapter<NotifyProvisionProductEngineWorkflowResultInput>() {
           @Override
           public void write(JsonWriter out, NotifyProvisionProductEngineWorkflowResultInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotifyProvisionProductEngineWorkflowResultInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotifyProvisionProductEngineWorkflowResultInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotifyProvisionProductEngineWorkflowResultInput
   * @throws IOException if the JSON string is invalid with respect to NotifyProvisionProductEngineWorkflowResultInput
   */
  public static NotifyProvisionProductEngineWorkflowResultInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotifyProvisionProductEngineWorkflowResultInput.class);
  }

  /**
   * Convert an instance of NotifyProvisionProductEngineWorkflowResultInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

