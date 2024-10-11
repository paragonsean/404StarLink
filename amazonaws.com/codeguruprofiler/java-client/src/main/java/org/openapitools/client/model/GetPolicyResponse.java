/*
 * Amazon CodeGuru Profiler
 * <p> This section provides documentation for the Amazon CodeGuru Profiler API operations. </p> <p> Amazon CodeGuru Profiler collects runtime performance data from your live applications, and provides recommendations that can help you fine-tune your application performance. Using machine learning algorithms, CodeGuru Profiler can help you find your most expensive lines of code and suggest ways you can improve efficiency and remove CPU bottlenecks. </p> <p> Amazon CodeGuru Profiler provides different visualizations of profiling data to help you identify what code is running on the CPU, see how much time is consumed, and suggest ways to reduce CPU utilization. </p> <note> <p>Amazon CodeGuru Profiler currently supports applications written in all Java virtual machine (JVM) languages and Python. While CodeGuru Profiler supports both visualizations and recommendations for applications written in Java, it can also generate visualizations and a subset of recommendations for applications written in other JVM languages and Python.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/codeguru/latest/profiler-ug/what-is-codeguru-profiler.html\">What is Amazon CodeGuru Profiler</a> in the <i>Amazon CodeGuru Profiler User Guide</i>. </p>
 *
 * The version of the OpenAPI document: 2019-07-18
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
 * The structure representing the &lt;code&gt;getPolicyResponse&lt;/code&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:43.000790-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetPolicyResponse {
  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_REVISION_ID = "revisionId";
  @SerializedName(SERIALIZED_NAME_REVISION_ID)
  private String revisionId;

  public GetPolicyResponse() {
  }

  public GetPolicyResponse policy(String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   */
  @javax.annotation.Nonnull
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public GetPolicyResponse revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Get revisionId
   * @return revisionId
   */
  @javax.annotation.Nonnull
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPolicyResponse getPolicyResponse = (GetPolicyResponse) o;
    return Objects.equals(this.policy, getPolicyResponse.policy) &&
        Objects.equals(this.revisionId, getPolicyResponse.revisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, revisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyResponse {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
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
    openapiFields.add("policy");
    openapiFields.add("revisionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("policy");
    openapiRequiredFields.add("revisionId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPolicyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPolicyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPolicyResponse is not found in the empty JSON string", GetPolicyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPolicyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPolicyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPolicyResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `policy`
      String.validateJsonElement(jsonObj.get("policy"));
      // validate the required field `revisionId`
      String.validateJsonElement(jsonObj.get("revisionId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPolicyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPolicyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPolicyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPolicyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPolicyResponse>() {
           @Override
           public void write(JsonWriter out, GetPolicyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPolicyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPolicyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPolicyResponse
   * @throws IOException if the JSON string is invalid with respect to GetPolicyResponse
   */
  public static GetPolicyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPolicyResponse.class);
  }

  /**
   * Convert an instance of GetPolicyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

