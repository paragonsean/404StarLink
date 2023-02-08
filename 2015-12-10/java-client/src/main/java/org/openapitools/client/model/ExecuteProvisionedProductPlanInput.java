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
 * ExecuteProvisionedProductPlanInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ExecuteProvisionedProductPlanInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_PLAN_ID = "PlanId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_TOKEN = "IdempotencyToken";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_TOKEN)
  private String idempotencyToken;

  public ExecuteProvisionedProductPlanInput() {
  }

  public ExecuteProvisionedProductPlanInput acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * Get acceptLanguage
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public ExecuteProvisionedProductPlanInput planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
   */
  @javax.annotation.Nonnull
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public ExecuteProvisionedProductPlanInput idempotencyToken(String idempotencyToken) {
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
    ExecuteProvisionedProductPlanInput executeProvisionedProductPlanInput = (ExecuteProvisionedProductPlanInput) o;
    return Objects.equals(this.acceptLanguage, executeProvisionedProductPlanInput.acceptLanguage) &&
        Objects.equals(this.planId, executeProvisionedProductPlanInput.planId) &&
        Objects.equals(this.idempotencyToken, executeProvisionedProductPlanInput.idempotencyToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, planId, idempotencyToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteProvisionedProductPlanInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
    openapiFields.add("AcceptLanguage");
    openapiFields.add("PlanId");
    openapiFields.add("IdempotencyToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PlanId");
    openapiRequiredFields.add("IdempotencyToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExecuteProvisionedProductPlanInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteProvisionedProductPlanInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteProvisionedProductPlanInput is not found in the empty JSON string", ExecuteProvisionedProductPlanInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteProvisionedProductPlanInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteProvisionedProductPlanInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExecuteProvisionedProductPlanInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the required field `PlanId`
      String.validateJsonElement(jsonObj.get("PlanId"));
      // validate the required field `IdempotencyToken`
      String.validateJsonElement(jsonObj.get("IdempotencyToken"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteProvisionedProductPlanInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteProvisionedProductPlanInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteProvisionedProductPlanInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteProvisionedProductPlanInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteProvisionedProductPlanInput>() {
           @Override
           public void write(JsonWriter out, ExecuteProvisionedProductPlanInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteProvisionedProductPlanInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExecuteProvisionedProductPlanInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExecuteProvisionedProductPlanInput
   * @throws IOException if the JSON string is invalid with respect to ExecuteProvisionedProductPlanInput
   */
  public static ExecuteProvisionedProductPlanInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteProvisionedProductPlanInput.class);
  }

  /**
   * Convert an instance of ExecuteProvisionedProductPlanInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

