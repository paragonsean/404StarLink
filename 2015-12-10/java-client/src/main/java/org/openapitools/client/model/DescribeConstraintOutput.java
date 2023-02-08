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
import org.openapitools.client.model.CreateConstraintOutputConstraintDetail;
import org.openapitools.client.model.Status;

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
 * DescribeConstraintOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeConstraintOutput {
  public static final String SERIALIZED_NAME_CONSTRAINT_DETAIL = "ConstraintDetail";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_DETAIL)
  private CreateConstraintOutputConstraintDetail constraintDetail;

  public static final String SERIALIZED_NAME_CONSTRAINT_PARAMETERS = "ConstraintParameters";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_PARAMETERS)
  private String constraintParameters;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public DescribeConstraintOutput() {
  }

  public DescribeConstraintOutput constraintDetail(CreateConstraintOutputConstraintDetail constraintDetail) {
    this.constraintDetail = constraintDetail;
    return this;
  }

  /**
   * Get constraintDetail
   * @return constraintDetail
   */
  @javax.annotation.Nullable
  public CreateConstraintOutputConstraintDetail getConstraintDetail() {
    return constraintDetail;
  }

  public void setConstraintDetail(CreateConstraintOutputConstraintDetail constraintDetail) {
    this.constraintDetail = constraintDetail;
  }


  public DescribeConstraintOutput constraintParameters(String constraintParameters) {
    this.constraintParameters = constraintParameters;
    return this;
  }

  /**
   * Get constraintParameters
   * @return constraintParameters
   */
  @javax.annotation.Nullable
  public String getConstraintParameters() {
    return constraintParameters;
  }

  public void setConstraintParameters(String constraintParameters) {
    this.constraintParameters = constraintParameters;
  }


  public DescribeConstraintOutput status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
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
    DescribeConstraintOutput describeConstraintOutput = (DescribeConstraintOutput) o;
    return Objects.equals(this.constraintDetail, describeConstraintOutput.constraintDetail) &&
        Objects.equals(this.constraintParameters, describeConstraintOutput.constraintParameters) &&
        Objects.equals(this.status, describeConstraintOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintDetail, constraintParameters, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeConstraintOutput {\n");
    sb.append("    constraintDetail: ").append(toIndentedString(constraintDetail)).append("\n");
    sb.append("    constraintParameters: ").append(toIndentedString(constraintParameters)).append("\n");
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
    openapiFields.add("ConstraintDetail");
    openapiFields.add("ConstraintParameters");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeConstraintOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeConstraintOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeConstraintOutput is not found in the empty JSON string", DescribeConstraintOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeConstraintOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeConstraintOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ConstraintDetail`
      if (jsonObj.get("ConstraintDetail") != null && !jsonObj.get("ConstraintDetail").isJsonNull()) {
        CreateConstraintOutputConstraintDetail.validateJsonElement(jsonObj.get("ConstraintDetail"));
      }
      // validate the optional field `ConstraintParameters`
      if (jsonObj.get("ConstraintParameters") != null && !jsonObj.get("ConstraintParameters").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ConstraintParameters"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        Status.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeConstraintOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeConstraintOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeConstraintOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeConstraintOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeConstraintOutput>() {
           @Override
           public void write(JsonWriter out, DescribeConstraintOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeConstraintOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeConstraintOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeConstraintOutput
   * @throws IOException if the JSON string is invalid with respect to DescribeConstraintOutput
   */
  public static DescribeConstraintOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeConstraintOutput.class);
  }

  /**
   * Convert an instance of DescribeConstraintOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

