/*
 * Serverless VPC Access API
 * API for managing VPC access connectors.
 *
 * The version of the OpenAPI document: v1
 * 
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
 * Metadata for google.longrunning.Operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:33.625098-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class OperationMetadataV1Beta1 {
  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public OperationMetadataV1Beta1() {
  }

  public OperationMetadataV1Beta1(
     String createTime, 
     String endTime, 
     String method, 
     String target
  ) {
    this();
    this.createTime = createTime;
    this.endTime = endTime;
    this.method = method;
    this.target = target;
  }

  /**
   * Output only. Time when the operation was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  /**
   * Output only. Time when the operation completed.
   * @return endTime
   */
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }



  /**
   * Output only. Method that initiated the operation e.g. google.cloud.vpcaccess.v1beta1.Connectors.CreateConnector.
   * @return method
   */
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }



  /**
   * Output only. Name of the resource that this operation is acting on e.g. projects/my-project/locations/us-central1/connectors/v1.
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationMetadataV1Beta1 operationMetadataV1Beta1 = (OperationMetadataV1Beta1) o;
    return Objects.equals(this.createTime, operationMetadataV1Beta1.createTime) &&
        Objects.equals(this.endTime, operationMetadataV1Beta1.endTime) &&
        Objects.equals(this.method, operationMetadataV1Beta1.method) &&
        Objects.equals(this.target, operationMetadataV1Beta1.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, endTime, method, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationMetadataV1Beta1 {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
    openapiFields.add("createTime");
    openapiFields.add("endTime");
    openapiFields.add("method");
    openapiFields.add("target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OperationMetadataV1Beta1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OperationMetadataV1Beta1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationMetadataV1Beta1 is not found in the empty JSON string", OperationMetadataV1Beta1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OperationMetadataV1Beta1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationMetadataV1Beta1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationMetadataV1Beta1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationMetadataV1Beta1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationMetadataV1Beta1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationMetadataV1Beta1.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationMetadataV1Beta1>() {
           @Override
           public void write(JsonWriter out, OperationMetadataV1Beta1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationMetadataV1Beta1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OperationMetadataV1Beta1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OperationMetadataV1Beta1
   * @throws IOException if the JSON string is invalid with respect to OperationMetadataV1Beta1
   */
  public static OperationMetadataV1Beta1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationMetadataV1Beta1.class);
  }

  /**
   * Convert an instance of OperationMetadataV1Beta1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

