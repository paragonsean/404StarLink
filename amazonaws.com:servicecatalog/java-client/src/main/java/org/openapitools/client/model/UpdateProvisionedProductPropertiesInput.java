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
 * UpdateProvisionedProductPropertiesInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateProvisionedProductPropertiesInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_ID = "ProvisionedProductId";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_ID)
  private String provisionedProductId;

  public static final String SERIALIZED_NAME_PROVISIONED_PRODUCT_PROPERTIES = "ProvisionedProductProperties";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_PRODUCT_PROPERTIES)
  private Map provisionedProductProperties;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_TOKEN = "IdempotencyToken";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_TOKEN)
  private String idempotencyToken;

  public UpdateProvisionedProductPropertiesInput() {
  }

  public UpdateProvisionedProductPropertiesInput acceptLanguage(String acceptLanguage) {
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


  public UpdateProvisionedProductPropertiesInput provisionedProductId(String provisionedProductId) {
    this.provisionedProductId = provisionedProductId;
    return this;
  }

  /**
   * Get provisionedProductId
   * @return provisionedProductId
   */
  @javax.annotation.Nonnull
  public String getProvisionedProductId() {
    return provisionedProductId;
  }

  public void setProvisionedProductId(String provisionedProductId) {
    this.provisionedProductId = provisionedProductId;
  }


  public UpdateProvisionedProductPropertiesInput provisionedProductProperties(Map provisionedProductProperties) {
    this.provisionedProductProperties = provisionedProductProperties;
    return this;
  }

  /**
   * Get provisionedProductProperties
   * @return provisionedProductProperties
   */
  @javax.annotation.Nonnull
  public Map getProvisionedProductProperties() {
    return provisionedProductProperties;
  }

  public void setProvisionedProductProperties(Map provisionedProductProperties) {
    this.provisionedProductProperties = provisionedProductProperties;
  }


  public UpdateProvisionedProductPropertiesInput idempotencyToken(String idempotencyToken) {
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
    UpdateProvisionedProductPropertiesInput updateProvisionedProductPropertiesInput = (UpdateProvisionedProductPropertiesInput) o;
    return Objects.equals(this.acceptLanguage, updateProvisionedProductPropertiesInput.acceptLanguage) &&
        Objects.equals(this.provisionedProductId, updateProvisionedProductPropertiesInput.provisionedProductId) &&
        Objects.equals(this.provisionedProductProperties, updateProvisionedProductPropertiesInput.provisionedProductProperties) &&
        Objects.equals(this.idempotencyToken, updateProvisionedProductPropertiesInput.idempotencyToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, provisionedProductId, provisionedProductProperties, idempotencyToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProvisionedProductPropertiesInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    provisionedProductId: ").append(toIndentedString(provisionedProductId)).append("\n");
    sb.append("    provisionedProductProperties: ").append(toIndentedString(provisionedProductProperties)).append("\n");
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
    openapiFields.add("ProvisionedProductId");
    openapiFields.add("ProvisionedProductProperties");
    openapiFields.add("IdempotencyToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ProvisionedProductId");
    openapiRequiredFields.add("ProvisionedProductProperties");
    openapiRequiredFields.add("IdempotencyToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateProvisionedProductPropertiesInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateProvisionedProductPropertiesInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateProvisionedProductPropertiesInput is not found in the empty JSON string", UpdateProvisionedProductPropertiesInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateProvisionedProductPropertiesInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateProvisionedProductPropertiesInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateProvisionedProductPropertiesInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the required field `ProvisionedProductId`
      String.validateJsonElement(jsonObj.get("ProvisionedProductId"));
      // validate the required field `ProvisionedProductProperties`
      Map.validateJsonElement(jsonObj.get("ProvisionedProductProperties"));
      // validate the required field `IdempotencyToken`
      String.validateJsonElement(jsonObj.get("IdempotencyToken"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateProvisionedProductPropertiesInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateProvisionedProductPropertiesInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateProvisionedProductPropertiesInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateProvisionedProductPropertiesInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateProvisionedProductPropertiesInput>() {
           @Override
           public void write(JsonWriter out, UpdateProvisionedProductPropertiesInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateProvisionedProductPropertiesInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateProvisionedProductPropertiesInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateProvisionedProductPropertiesInput
   * @throws IOException if the JSON string is invalid with respect to UpdateProvisionedProductPropertiesInput
   */
  public static UpdateProvisionedProductPropertiesInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateProvisionedProductPropertiesInput.class);
  }

  /**
   * Convert an instance of UpdateProvisionedProductPropertiesInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

