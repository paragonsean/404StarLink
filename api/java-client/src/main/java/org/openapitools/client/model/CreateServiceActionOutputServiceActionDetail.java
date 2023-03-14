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
import org.openapitools.client.model.ServiceActionDetailServiceActionSummary;

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
 * CreateServiceActionOutputServiceActionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateServiceActionOutputServiceActionDetail {
  public static final String SERIALIZED_NAME_SERVICE_ACTION_SUMMARY = "ServiceActionSummary";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACTION_SUMMARY)
  private ServiceActionDetailServiceActionSummary serviceActionSummary;

  public static final String SERIALIZED_NAME_DEFINITION = "Definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private Map definition;

  public CreateServiceActionOutputServiceActionDetail() {
  }

  public CreateServiceActionOutputServiceActionDetail serviceActionSummary(ServiceActionDetailServiceActionSummary serviceActionSummary) {
    this.serviceActionSummary = serviceActionSummary;
    return this;
  }

  /**
   * Get serviceActionSummary
   * @return serviceActionSummary
   */
  @javax.annotation.Nullable
  public ServiceActionDetailServiceActionSummary getServiceActionSummary() {
    return serviceActionSummary;
  }

  public void setServiceActionSummary(ServiceActionDetailServiceActionSummary serviceActionSummary) {
    this.serviceActionSummary = serviceActionSummary;
  }


  public CreateServiceActionOutputServiceActionDetail definition(Map definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
   */
  @javax.annotation.Nullable
  public Map getDefinition() {
    return definition;
  }

  public void setDefinition(Map definition) {
    this.definition = definition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceActionOutputServiceActionDetail createServiceActionOutputServiceActionDetail = (CreateServiceActionOutputServiceActionDetail) o;
    return Objects.equals(this.serviceActionSummary, createServiceActionOutputServiceActionDetail.serviceActionSummary) &&
        Objects.equals(this.definition, createServiceActionOutputServiceActionDetail.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceActionSummary, definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceActionOutputServiceActionDetail {\n");
    sb.append("    serviceActionSummary: ").append(toIndentedString(serviceActionSummary)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
    openapiFields.add("ServiceActionSummary");
    openapiFields.add("Definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateServiceActionOutputServiceActionDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateServiceActionOutputServiceActionDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateServiceActionOutputServiceActionDetail is not found in the empty JSON string", CreateServiceActionOutputServiceActionDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateServiceActionOutputServiceActionDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateServiceActionOutputServiceActionDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ServiceActionSummary`
      if (jsonObj.get("ServiceActionSummary") != null && !jsonObj.get("ServiceActionSummary").isJsonNull()) {
        ServiceActionDetailServiceActionSummary.validateJsonElement(jsonObj.get("ServiceActionSummary"));
      }
      // validate the optional field `Definition`
      if (jsonObj.get("Definition") != null && !jsonObj.get("Definition").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Definition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateServiceActionOutputServiceActionDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateServiceActionOutputServiceActionDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateServiceActionOutputServiceActionDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateServiceActionOutputServiceActionDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateServiceActionOutputServiceActionDetail>() {
           @Override
           public void write(JsonWriter out, CreateServiceActionOutputServiceActionDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateServiceActionOutputServiceActionDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateServiceActionOutputServiceActionDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateServiceActionOutputServiceActionDetail
   * @throws IOException if the JSON string is invalid with respect to CreateServiceActionOutputServiceActionDetail
   */
  public static CreateServiceActionOutputServiceActionDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateServiceActionOutputServiceActionDetail.class);
  }

  /**
   * Convert an instance of CreateServiceActionOutputServiceActionDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

