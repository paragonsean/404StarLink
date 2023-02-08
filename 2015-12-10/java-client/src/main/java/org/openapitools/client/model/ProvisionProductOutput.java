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
import org.openapitools.client.model.ExecuteProvisionedProductPlanOutputRecordDetail;

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
 * ProvisionProductOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisionProductOutput {
  public static final String SERIALIZED_NAME_RECORD_DETAIL = "RecordDetail";
  @SerializedName(SERIALIZED_NAME_RECORD_DETAIL)
  private ExecuteProvisionedProductPlanOutputRecordDetail recordDetail;

  public ProvisionProductOutput() {
  }

  public ProvisionProductOutput recordDetail(ExecuteProvisionedProductPlanOutputRecordDetail recordDetail) {
    this.recordDetail = recordDetail;
    return this;
  }

  /**
   * Get recordDetail
   * @return recordDetail
   */
  @javax.annotation.Nullable
  public ExecuteProvisionedProductPlanOutputRecordDetail getRecordDetail() {
    return recordDetail;
  }

  public void setRecordDetail(ExecuteProvisionedProductPlanOutputRecordDetail recordDetail) {
    this.recordDetail = recordDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionProductOutput provisionProductOutput = (ProvisionProductOutput) o;
    return Objects.equals(this.recordDetail, provisionProductOutput.recordDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionProductOutput {\n");
    sb.append("    recordDetail: ").append(toIndentedString(recordDetail)).append("\n");
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
    openapiFields.add("RecordDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisionProductOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisionProductOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisionProductOutput is not found in the empty JSON string", ProvisionProductOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisionProductOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisionProductOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `RecordDetail`
      if (jsonObj.get("RecordDetail") != null && !jsonObj.get("RecordDetail").isJsonNull()) {
        ExecuteProvisionedProductPlanOutputRecordDetail.validateJsonElement(jsonObj.get("RecordDetail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisionProductOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisionProductOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisionProductOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisionProductOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisionProductOutput>() {
           @Override
           public void write(JsonWriter out, ProvisionProductOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisionProductOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisionProductOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisionProductOutput
   * @throws IOException if the JSON string is invalid with respect to ProvisionProductOutput
   */
  public static ProvisionProductOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisionProductOutput.class);
  }

  /**
   * Convert an instance of ProvisionProductOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

