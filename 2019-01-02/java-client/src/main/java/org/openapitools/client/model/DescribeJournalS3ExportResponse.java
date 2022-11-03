/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
import org.openapitools.client.model.DescribeJournalS3ExportResponseExportDescription;

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
 * DescribeJournalS3ExportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:45.268682-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeJournalS3ExportResponse {
  public static final String SERIALIZED_NAME_EXPORT_DESCRIPTION = "ExportDescription";
  @SerializedName(SERIALIZED_NAME_EXPORT_DESCRIPTION)
  private DescribeJournalS3ExportResponseExportDescription exportDescription;

  public DescribeJournalS3ExportResponse() {
  }

  public DescribeJournalS3ExportResponse exportDescription(DescribeJournalS3ExportResponseExportDescription exportDescription) {
    this.exportDescription = exportDescription;
    return this;
  }

  /**
   * Get exportDescription
   * @return exportDescription
   */
  @javax.annotation.Nonnull
  public DescribeJournalS3ExportResponseExportDescription getExportDescription() {
    return exportDescription;
  }

  public void setExportDescription(DescribeJournalS3ExportResponseExportDescription exportDescription) {
    this.exportDescription = exportDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeJournalS3ExportResponse describeJournalS3ExportResponse = (DescribeJournalS3ExportResponse) o;
    return Objects.equals(this.exportDescription, describeJournalS3ExportResponse.exportDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeJournalS3ExportResponse {\n");
    sb.append("    exportDescription: ").append(toIndentedString(exportDescription)).append("\n");
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
    openapiFields.add("ExportDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ExportDescription");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeJournalS3ExportResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeJournalS3ExportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeJournalS3ExportResponse is not found in the empty JSON string", DescribeJournalS3ExportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeJournalS3ExportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeJournalS3ExportResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DescribeJournalS3ExportResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ExportDescription`
      DescribeJournalS3ExportResponseExportDescription.validateJsonElement(jsonObj.get("ExportDescription"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeJournalS3ExportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeJournalS3ExportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeJournalS3ExportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeJournalS3ExportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeJournalS3ExportResponse>() {
           @Override
           public void write(JsonWriter out, DescribeJournalS3ExportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeJournalS3ExportResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeJournalS3ExportResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeJournalS3ExportResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeJournalS3ExportResponse
   */
  public static DescribeJournalS3ExportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeJournalS3ExportResponse.class);
  }

  /**
   * Convert an instance of DescribeJournalS3ExportResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

