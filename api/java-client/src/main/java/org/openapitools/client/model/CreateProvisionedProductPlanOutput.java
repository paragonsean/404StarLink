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
 * CreateProvisionedProductPlanOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateProvisionedProductPlanOutput {
  public static final String SERIALIZED_NAME_PLAN_NAME = "PlanName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_ID = "PlanId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PROVISION_PRODUCT_ID = "ProvisionProductId";
  @SerializedName(SERIALIZED_NAME_PROVISION_PRODUCT_ID)
  private String provisionProductId;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_NAME = "ProvisionedProductName";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_NAME)
  private String provisionedProductName;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID = "ProvisioningArtifactId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID)
  private String provisioningArtifactId;

  public CreateProvisionedProductPlanOutput() {
  }

  public CreateProvisionedProductPlanOutput planName(String planName) {
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


  public CreateProvisionedProductPlanOutput planId(String planId) {
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


  public CreateProvisionedProductPlanOutput provisionProductId(String provisionProductId) {
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


  public CreateProvisionedProductPlanOutput provisionedProductName(String provisionedProductName) {
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


  public CreateProvisionedProductPlanOutput provisioningArtifactId(String provisioningArtifactId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProvisionedProductPlanOutput createProvisionedProductPlanOutput = (CreateProvisionedProductPlanOutput) o;
    return Objects.equals(this.planName, createProvisionedProductPlanOutput.planName) &&
        Objects.equals(this.planId, createProvisionedProductPlanOutput.planId) &&
        Objects.equals(this.provisionProductId, createProvisionedProductPlanOutput.provisionProductId) &&
        Objects.equals(this.provisionedProductName, createProvisionedProductPlanOutput.provisionedProductName) &&
        Objects.equals(this.provisioningArtifactId, createProvisionedProductPlanOutput.provisioningArtifactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planName, planId, provisionProductId, provisionedProductName, provisioningArtifactId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProvisionedProductPlanOutput {\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    provisionProductId: ").append(toIndentedString(provisionProductId)).append("\n");
    sb.append("    provisionedProductName: ").append(toIndentedString(provisionedProductName)).append("\n");
    sb.append("    provisioningArtifactId: ").append(toIndentedString(provisioningArtifactId)).append("\n");
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
    openapiFields.add("PlanName");
    openapiFields.add("PlanId");
    openapiFields.add("ProvisionProductId");
    openapiFields.add("ProvisionedProductName");
    openapiFields.add("ProvisioningArtifactId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateProvisionedProductPlanOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateProvisionedProductPlanOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProvisionedProductPlanOutput is not found in the empty JSON string", CreateProvisionedProductPlanOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateProvisionedProductPlanOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProvisionedProductPlanOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // validate the optional field `ProvisionedProductName`
      if (jsonObj.get("ProvisionedProductName") != null && !jsonObj.get("ProvisionedProductName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisionedProductName"));
      }
      // validate the optional field `ProvisioningArtifactId`
      if (jsonObj.get("ProvisioningArtifactId") != null && !jsonObj.get("ProvisioningArtifactId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProvisionedProductPlanOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProvisionedProductPlanOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProvisionedProductPlanOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProvisionedProductPlanOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProvisionedProductPlanOutput>() {
           @Override
           public void write(JsonWriter out, CreateProvisionedProductPlanOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProvisionedProductPlanOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateProvisionedProductPlanOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateProvisionedProductPlanOutput
   * @throws IOException if the JSON string is invalid with respect to CreateProvisionedProductPlanOutput
   */
  public static CreateProvisionedProductPlanOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProvisionedProductPlanOutput.class);
  }

  /**
   * Convert an instance of CreateProvisionedProductPlanOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

