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
import java.util.Map;
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
 * UpdateProvisionedProductPropertiesOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateProvisionedProductPropertiesOutput {
  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_ID = "ProvisionedProductId";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_ID)
  private String provisionedProductId;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_PROPERTIES = "ProvisionedProductProperties";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_PROPERTIES)
  private Map provisionedProductProperties;

  public static final String SERIALIZED_NAME_RECORD_ID = "RecordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RecordStatus status;

  public UpdateProvisionedProductPropertiesOutput() {
  }

  public UpdateProvisionedProductPropertiesOutput provisionedProductId(String provisionedProductId) {
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


  public UpdateProvisionedProductPropertiesOutput provisionedProductProperties(Map provisionedProductProperties) {
    this.provisionedProductProperties = provisionedProductProperties;
    return this;
  }

  /**
   * Get provisionedProductProperties
   * @return provisionedProductProperties
   */
  @javax.annotation.Nullable
  public Map getProvisionedProductProperties() {
    return provisionedProductProperties;
  }

  public void setProvisionedProductProperties(Map provisionedProductProperties) {
    this.provisionedProductProperties = provisionedProductProperties;
  }


  public UpdateProvisionedProductPropertiesOutput recordId(String recordId) {
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


  public UpdateProvisionedProductPropertiesOutput status(RecordStatus status) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProvisionedProductPropertiesOutput updateProvisionedProductPropertiesOutput = (UpdateProvisionedProductPropertiesOutput) o;
    return Objects.equals(this.provisionedProductId, updateProvisionedProductPropertiesOutput.provisionedProductId) &&
        Objects.equals(this.provisionedProductProperties, updateProvisionedProductPropertiesOutput.provisionedProductProperties) &&
        Objects.equals(this.recordId, updateProvisionedProductPropertiesOutput.recordId) &&
        Objects.equals(this.status, updateProvisionedProductPropertiesOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisionedProductId, provisionedProductProperties, recordId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProvisionedProductPropertiesOutput {\n");
    sb.append("    provisionedProductId: ").append(toIndentedString(provisionedProductId)).append("\n");
    sb.append("    provisionedProductProperties: ").append(toIndentedString(provisionedProductProperties)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ProvisionedProductId");
    openapiFields.add("ProvisionedProductProperties");
    openapiFields.add("RecordId");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateProvisionedProductPropertiesOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateProvisionedProductPropertiesOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateProvisionedProductPropertiesOutput is not found in the empty JSON string", UpdateProvisionedProductPropertiesOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateProvisionedProductPropertiesOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateProvisionedProductPropertiesOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ProvisionedProductId`
      if (jsonObj.get("ProvisionedProductId") != null && !jsonObj.get("ProvisionedProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionedProductId"));
      }
      // validate the optional field `ProvisionedProductProperties`
      if (jsonObj.get("ProvisionedProductProperties") != null && !jsonObj.get("ProvisionedProductProperties").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("ProvisionedProductProperties"));
      }
      // validate the optional field `RecordId`
      if (jsonObj.get("RecordId") != null && !jsonObj.get("RecordId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RecordId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        RecordStatus.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateProvisionedProductPropertiesOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateProvisionedProductPropertiesOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateProvisionedProductPropertiesOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateProvisionedProductPropertiesOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateProvisionedProductPropertiesOutput>() {
           @Override
           public void write(JsonWriter out, UpdateProvisionedProductPropertiesOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateProvisionedProductPropertiesOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateProvisionedProductPropertiesOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateProvisionedProductPropertiesOutput
   * @throws IOException if the JSON string is invalid with respect to UpdateProvisionedProductPropertiesOutput
   */
  public static UpdateProvisionedProductPropertiesOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateProvisionedProductPropertiesOutput.class);
  }

  /**
   * Convert an instance of UpdateProvisionedProductPropertiesOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

