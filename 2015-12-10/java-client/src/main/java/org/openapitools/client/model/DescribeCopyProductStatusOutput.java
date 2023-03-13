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
import org.openapitools.client.model.CopyProductStatus;

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
 * DescribeCopyProductStatusOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeCopyProductStatusOutput {
  public static final String SERIALIZED_NAME_COPY_PRODUCT_STATUS = "CopyProductStatus";
  @SerializedName(SERIALIZED_NAME_COPY_PRODUCT_STATUS)
  private CopyProductStatus copyProductStatus;

  public static final String SERIALIZED_NAME_TARGET_PRODUCT_ID = "TargetProductId";
  @SerializedName(SERIALIZED_NAME_TARGET_PRODUCT_ID)
  private String targetProductId;

  public static final String SERIALIZED_NAME_STATUS_DETAIL = "StatusDetail";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAIL)
  private String statusDetail;

  public DescribeCopyProductStatusOutput() {
  }

  public DescribeCopyProductStatusOutput copyProductStatus(CopyProductStatus copyProductStatus) {
    this.copyProductStatus = copyProductStatus;
    return this;
  }

  /**
   * Get copyProductStatus
   * @return copyProductStatus
   */
  @javax.annotation.Nullable
  public CopyProductStatus getCopyProductStatus() {
    return copyProductStatus;
  }

  public void setCopyProductStatus(CopyProductStatus copyProductStatus) {
    this.copyProductStatus = copyProductStatus;
  }


  public DescribeCopyProductStatusOutput targetProductId(String targetProductId) {
    this.targetProductId = targetProductId;
    return this;
  }

  /**
   * Get targetProductId
   * @return targetProductId
   */
  @javax.annotation.Nullable
  public String getTargetProductId() {
    return targetProductId;
  }

  public void setTargetProductId(String targetProductId) {
    this.targetProductId = targetProductId;
  }


  public DescribeCopyProductStatusOutput statusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Get statusDetail
   * @return statusDetail
   */
  @javax.annotation.Nullable
  public String getStatusDetail() {
    return statusDetail;
  }

  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCopyProductStatusOutput describeCopyProductStatusOutput = (DescribeCopyProductStatusOutput) o;
    return Objects.equals(this.copyProductStatus, describeCopyProductStatusOutput.copyProductStatus) &&
        Objects.equals(this.targetProductId, describeCopyProductStatusOutput.targetProductId) &&
        Objects.equals(this.statusDetail, describeCopyProductStatusOutput.statusDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyProductStatus, targetProductId, statusDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCopyProductStatusOutput {\n");
    sb.append("    copyProductStatus: ").append(toIndentedString(copyProductStatus)).append("\n");
    sb.append("    targetProductId: ").append(toIndentedString(targetProductId)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
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
    openapiFields.add("CopyProductStatus");
    openapiFields.add("TargetProductId");
    openapiFields.add("StatusDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeCopyProductStatusOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeCopyProductStatusOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeCopyProductStatusOutput is not found in the empty JSON string", DescribeCopyProductStatusOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeCopyProductStatusOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeCopyProductStatusOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CopyProductStatus`
      if (jsonObj.get("CopyProductStatus") != null && !jsonObj.get("CopyProductStatus").isJsonNull()) {
        CopyProductStatus.validateJsonElement(jsonObj.get("CopyProductStatus"));
      }
      // validate the optional field `TargetProductId`
      if (jsonObj.get("TargetProductId") != null && !jsonObj.get("TargetProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TargetProductId"));
      }
      // validate the optional field `StatusDetail`
      if (jsonObj.get("StatusDetail") != null && !jsonObj.get("StatusDetail").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusDetail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeCopyProductStatusOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeCopyProductStatusOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeCopyProductStatusOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeCopyProductStatusOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeCopyProductStatusOutput>() {
           @Override
           public void write(JsonWriter out, DescribeCopyProductStatusOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeCopyProductStatusOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeCopyProductStatusOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeCopyProductStatusOutput
   * @throws IOException if the JSON string is invalid with respect to DescribeCopyProductStatusOutput
   */
  public static DescribeCopyProductStatusOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeCopyProductStatusOutput.class);
  }

  /**
   * Convert an instance of DescribeCopyProductStatusOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

