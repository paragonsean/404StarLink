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
 * Describes a user&#39;s SSH information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:31.623912-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UserProfile {
  public static final String SERIALIZED_NAME_IAM_USER_ARN = "IamUserArn";
  @SerializedName(SERIALIZED_NAME_IAM_USER_ARN)
  private String iamUserArn;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SSH_USERNAME = "SshUsername";
  @SerializedName(SERIALIZED_NAME_SSH_USERNAME)
  private String sshUsername;

  public static final String SERIALIZED_NAME_SSH_PUBLIC_KEY = "SshPublicKey";
  @SerializedName(SERIALIZED_NAME_SSH_PUBLIC_KEY)
  private String sshPublicKey;

  public static final String SERIALIZED_NAME_ALLOW_SELF_MANAGEMENT = "AllowSelfManagement";
  @SerializedName(SERIALIZED_NAME_ALLOW_SELF_MANAGEMENT)
  private Boolean allowSelfManagement;

  public UserProfile() {
  }

  public UserProfile iamUserArn(String iamUserArn) {
    this.iamUserArn = iamUserArn;
    return this;
  }

  /**
   * Get iamUserArn
   * @return iamUserArn
   */
  @javax.annotation.Nullable
  public String getIamUserArn() {
    return iamUserArn;
  }

  public void setIamUserArn(String iamUserArn) {
    this.iamUserArn = iamUserArn;
  }


  public UserProfile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UserProfile sshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
    return this;
  }

  /**
   * Get sshUsername
   * @return sshUsername
   */
  @javax.annotation.Nullable
  public String getSshUsername() {
    return sshUsername;
  }

  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }


  public UserProfile sshPublicKey(String sshPublicKey) {
    this.sshPublicKey = sshPublicKey;
    return this;
  }

  /**
   * Get sshPublicKey
   * @return sshPublicKey
   */
  @javax.annotation.Nullable
  public String getSshPublicKey() {
    return sshPublicKey;
  }

  public void setSshPublicKey(String sshPublicKey) {
    this.sshPublicKey = sshPublicKey;
  }


  public UserProfile allowSelfManagement(Boolean allowSelfManagement) {
    this.allowSelfManagement = allowSelfManagement;
    return this;
  }

  /**
   * Get allowSelfManagement
   * @return allowSelfManagement
   */
  @javax.annotation.Nullable
  public Boolean getAllowSelfManagement() {
    return allowSelfManagement;
  }

  public void setAllowSelfManagement(Boolean allowSelfManagement) {
    this.allowSelfManagement = allowSelfManagement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.iamUserArn, userProfile.iamUserArn) &&
        Objects.equals(this.name, userProfile.name) &&
        Objects.equals(this.sshUsername, userProfile.sshUsername) &&
        Objects.equals(this.sshPublicKey, userProfile.sshPublicKey) &&
        Objects.equals(this.allowSelfManagement, userProfile.allowSelfManagement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iamUserArn, name, sshUsername, sshPublicKey, allowSelfManagement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    sb.append("    iamUserArn: ").append(toIndentedString(iamUserArn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    sshPublicKey: ").append(toIndentedString(sshPublicKey)).append("\n");
    sb.append("    allowSelfManagement: ").append(toIndentedString(allowSelfManagement)).append("\n");
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
    openapiFields.add("IamUserArn");
    openapiFields.add("Name");
    openapiFields.add("SshUsername");
    openapiFields.add("SshPublicKey");
    openapiFields.add("AllowSelfManagement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserProfile is not found in the empty JSON string", UserProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IamUserArn`
      if (jsonObj.get("IamUserArn") != null && !jsonObj.get("IamUserArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IamUserArn"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `SshUsername`
      if (jsonObj.get("SshUsername") != null && !jsonObj.get("SshUsername").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SshUsername"));
      }
      // validate the optional field `SshPublicKey`
      if (jsonObj.get("SshPublicKey") != null && !jsonObj.get("SshPublicKey").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SshPublicKey"));
      }
      // validate the optional field `AllowSelfManagement`
      if (jsonObj.get("AllowSelfManagement") != null && !jsonObj.get("AllowSelfManagement").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AllowSelfManagement"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<UserProfile>() {
           @Override
           public void write(JsonWriter out, UserProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserProfile
   * @throws IOException if the JSON string is invalid with respect to UserProfile
   */
  public static UserProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserProfile.class);
  }

  /**
   * Convert an instance of UserProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

