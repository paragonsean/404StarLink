/*
 * Amazon WorkMail
 * <p>WorkMail is a secure, managed business email and calendaring service with support for existing desktop and mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory and control both the keys that encrypt your data and the location in which your data is stored.</p> <p>The WorkMail API is designed for the following scenarios:</p> <ul> <li> <p>Listing and describing organizations</p> </li> </ul> <ul> <li> <p>Managing users</p> </li> </ul> <ul> <li> <p>Managing groups</p> </li> </ul> <ul> <li> <p>Managing resources</p> </li> </ul> <p>All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy). This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a selective basis using the IAM model.</p>
 *
 * The version of the OpenAPI document: 2017-10-01
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
 * DescribeEmailMonitoringConfigurationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:37.440706-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeEmailMonitoringConfigurationResponse {
  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_LOG_GROUP_ARN = "LogGroupArn";
  @SerializedName(SERIALIZED_NAME_LOG_GROUP_ARN)
  private String logGroupArn;

  public DescribeEmailMonitoringConfigurationResponse() {
  }

  public DescribeEmailMonitoringConfigurationResponse roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nullable
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public DescribeEmailMonitoringConfigurationResponse logGroupArn(String logGroupArn) {
    this.logGroupArn = logGroupArn;
    return this;
  }

  /**
   * Get logGroupArn
   * @return logGroupArn
   */
  @javax.annotation.Nullable
  public String getLogGroupArn() {
    return logGroupArn;
  }

  public void setLogGroupArn(String logGroupArn) {
    this.logGroupArn = logGroupArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeEmailMonitoringConfigurationResponse describeEmailMonitoringConfigurationResponse = (DescribeEmailMonitoringConfigurationResponse) o;
    return Objects.equals(this.roleArn, describeEmailMonitoringConfigurationResponse.roleArn) &&
        Objects.equals(this.logGroupArn, describeEmailMonitoringConfigurationResponse.logGroupArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn, logGroupArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeEmailMonitoringConfigurationResponse {\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    logGroupArn: ").append(toIndentedString(logGroupArn)).append("\n");
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
    openapiFields.add("RoleArn");
    openapiFields.add("LogGroupArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeEmailMonitoringConfigurationResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeEmailMonitoringConfigurationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeEmailMonitoringConfigurationResponse is not found in the empty JSON string", DescribeEmailMonitoringConfigurationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeEmailMonitoringConfigurationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeEmailMonitoringConfigurationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `RoleArn`
      if (jsonObj.get("RoleArn") != null && !jsonObj.get("RoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RoleArn"));
      }
      // validate the optional field `LogGroupArn`
      if (jsonObj.get("LogGroupArn") != null && !jsonObj.get("LogGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LogGroupArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeEmailMonitoringConfigurationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeEmailMonitoringConfigurationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeEmailMonitoringConfigurationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeEmailMonitoringConfigurationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeEmailMonitoringConfigurationResponse>() {
           @Override
           public void write(JsonWriter out, DescribeEmailMonitoringConfigurationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeEmailMonitoringConfigurationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeEmailMonitoringConfigurationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeEmailMonitoringConfigurationResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeEmailMonitoringConfigurationResponse
   */
  public static DescribeEmailMonitoringConfigurationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeEmailMonitoringConfigurationResponse.class);
  }

  /**
   * Convert an instance of DescribeEmailMonitoringConfigurationResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

