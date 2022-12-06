/*
 * AWS OpsWorks
 * <fullname>AWS OpsWorks</fullname> <p>Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples for AWS OpsWorks Stacks actions and data types, including common parameters and error codes. </p> <p>AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For information about this product, go to the <a href=\"http://aws.amazon.com/opsworks/\">AWS OpsWorks</a> details page. </p> <p> <b>SDKs and CLI</b> </p> <p>The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using one of the AWS SDKs to implement applications in your preferred language. For more information, see:</p> <ul> <li> <p> <a href=\"https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html\">AWS CLI</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html\">AWS SDK for Java</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm\">AWS SDK for .NET</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html\">AWS SDK for PHP 2</a> </p> </li> <li> <p> <a href=\"http://docs.aws.amazon.com/sdkforruby/api/\">AWS SDK for Ruby</a> </p> </li> <li> <p> <a href=\"http://aws.amazon.com/documentation/sdkforjavascript/\">AWS SDK for Node.js</a> </p> </li> <li> <p> <a href=\"http://docs.pythonboto.org/en/latest/ref/opsworks.html\">AWS SDK for Python(Boto)</a> </p> </li> </ul> <p> <b>Endpoints</b> </p> <p>AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks can only be accessed or managed within the endpoint in which they are created.</p> <ul> <li> <p>opsworks.us-east-1.amazonaws.com</p> </li> <li> <p>opsworks.us-east-2.amazonaws.com</p> </li> <li> <p>opsworks.us-west-1.amazonaws.com</p> </li> <li> <p>opsworks.us-west-2.amazonaws.com</p> </li> <li> <p>opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)</p> </li> <li> <p>opsworks.eu-west-1.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-2.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-3.amazonaws.com</p> </li> <li> <p>opsworks.eu-central-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-2.amazonaws.com</p> </li> <li> <p>opsworks.ap-south-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-2.amazonaws.com</p> </li> <li> <p>opsworks.sa-east-1.amazonaws.com</p> </li> </ul> <p> <b>Chef Versions</b> </p> <p>When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a href=\"https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html\">Chef Versions</a>.</p> <note> <p>You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to Chef 12 as soon as possible.</p> </note>
 *
 * The version of the OpenAPI document: 2013-02-18
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
import java.util.List;

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
 * DescribeDeploymentsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:40.935644-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeDeploymentsRequest {
  public static final String SERIALIZED_NAME_STACK_ID = "StackId";
  @SerializedName(SERIALIZED_NAME_STACK_ID)
  private String stackId;

  public static final String SERIALIZED_NAME_APP_ID = "AppId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_IDS = "DeploymentIds";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_IDS)
  private List deploymentIds;

  public DescribeDeploymentsRequest() {
  }

  public DescribeDeploymentsRequest stackId(String stackId) {
    this.stackId = stackId;
    return this;
  }

  /**
   * Get stackId
   * @return stackId
   */
  @javax.annotation.Nullable
  public String getStackId() {
    return stackId;
  }

  public void setStackId(String stackId) {
    this.stackId = stackId;
  }


  public DescribeDeploymentsRequest appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
   */
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  public DescribeDeploymentsRequest deploymentIds(List deploymentIds) {
    this.deploymentIds = deploymentIds;
    return this;
  }

  /**
   * Get deploymentIds
   * @return deploymentIds
   */
  @javax.annotation.Nullable
  public List getDeploymentIds() {
    return deploymentIds;
  }

  public void setDeploymentIds(List deploymentIds) {
    this.deploymentIds = deploymentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDeploymentsRequest describeDeploymentsRequest = (DescribeDeploymentsRequest) o;
    return Objects.equals(this.stackId, describeDeploymentsRequest.stackId) &&
        Objects.equals(this.appId, describeDeploymentsRequest.appId) &&
        Objects.equals(this.deploymentIds, describeDeploymentsRequest.deploymentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackId, appId, deploymentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDeploymentsRequest {\n");
    sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    deploymentIds: ").append(toIndentedString(deploymentIds)).append("\n");
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
    openapiFields.add("StackId");
    openapiFields.add("AppId");
    openapiFields.add("DeploymentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeDeploymentsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeDeploymentsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeDeploymentsRequest is not found in the empty JSON string", DescribeDeploymentsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeDeploymentsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeDeploymentsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `StackId`
      if (jsonObj.get("StackId") != null && !jsonObj.get("StackId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StackId"));
      }
      // validate the optional field `AppId`
      if (jsonObj.get("AppId") != null && !jsonObj.get("AppId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AppId"));
      }
      // validate the optional field `DeploymentIds`
      if (jsonObj.get("DeploymentIds") != null && !jsonObj.get("DeploymentIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("DeploymentIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeDeploymentsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeDeploymentsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeDeploymentsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeDeploymentsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeDeploymentsRequest>() {
           @Override
           public void write(JsonWriter out, DescribeDeploymentsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeDeploymentsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeDeploymentsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeDeploymentsRequest
   * @throws IOException if the JSON string is invalid with respect to DescribeDeploymentsRequest
   */
  public static DescribeDeploymentsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeDeploymentsRequest.class);
  }

  /**
   * Convert an instance of DescribeDeploymentsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

