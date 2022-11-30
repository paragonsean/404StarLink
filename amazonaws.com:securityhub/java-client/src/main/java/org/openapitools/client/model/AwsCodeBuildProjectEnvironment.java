/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import org.openapitools.client.model.AwsCodeBuildProjectEnvironmentRegistryCredential;

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
 * Information about the build environment for this build project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCodeBuildProjectEnvironment {
  public static final String SERIALIZED_NAME_CERTIFICATE = "Certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_ENVIRONMENT_VARIABLES = "EnvironmentVariables";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_VARIABLES)
  private List environmentVariables;

  public static final String SERIALIZED_NAME_PRIVILEGED_MODE = "PrivilegedMode";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED_MODE)
  private Boolean privilegedMode;

  public static final String SERIALIZED_NAME_IMAGE_PULL_CREDENTIALS_TYPE = "ImagePullCredentialsType";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_CREDENTIALS_TYPE)
  private String imagePullCredentialsType;

  public static final String SERIALIZED_NAME_REGISTRY_CREDENTIAL = "RegistryCredential";
  @SerializedName(SERIALIZED_NAME_REGISTRY_CREDENTIAL)
  private AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AwsCodeBuildProjectEnvironment() {
  }

  public AwsCodeBuildProjectEnvironment certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
   */
  @javax.annotation.Nullable
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public AwsCodeBuildProjectEnvironment environmentVariables(List environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
  }

  /**
   * Get environmentVariables
   * @return environmentVariables
   */
  @javax.annotation.Nullable
  public List getEnvironmentVariables() {
    return environmentVariables;
  }

  public void setEnvironmentVariables(List environmentVariables) {
    this.environmentVariables = environmentVariables;
  }


  public AwsCodeBuildProjectEnvironment privilegedMode(Boolean privilegedMode) {
    this.privilegedMode = privilegedMode;
    return this;
  }

  /**
   * Get privilegedMode
   * @return privilegedMode
   */
  @javax.annotation.Nullable
  public Boolean getPrivilegedMode() {
    return privilegedMode;
  }

  public void setPrivilegedMode(Boolean privilegedMode) {
    this.privilegedMode = privilegedMode;
  }


  public AwsCodeBuildProjectEnvironment imagePullCredentialsType(String imagePullCredentialsType) {
    this.imagePullCredentialsType = imagePullCredentialsType;
    return this;
  }

  /**
   * Get imagePullCredentialsType
   * @return imagePullCredentialsType
   */
  @javax.annotation.Nullable
  public String getImagePullCredentialsType() {
    return imagePullCredentialsType;
  }

  public void setImagePullCredentialsType(String imagePullCredentialsType) {
    this.imagePullCredentialsType = imagePullCredentialsType;
  }


  public AwsCodeBuildProjectEnvironment registryCredential(AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential) {
    this.registryCredential = registryCredential;
    return this;
  }

  /**
   * Get registryCredential
   * @return registryCredential
   */
  @javax.annotation.Nullable
  public AwsCodeBuildProjectEnvironmentRegistryCredential getRegistryCredential() {
    return registryCredential;
  }

  public void setRegistryCredential(AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential) {
    this.registryCredential = registryCredential;
  }


  public AwsCodeBuildProjectEnvironment type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCodeBuildProjectEnvironment awsCodeBuildProjectEnvironment = (AwsCodeBuildProjectEnvironment) o;
    return Objects.equals(this.certificate, awsCodeBuildProjectEnvironment.certificate) &&
        Objects.equals(this.environmentVariables, awsCodeBuildProjectEnvironment.environmentVariables) &&
        Objects.equals(this.privilegedMode, awsCodeBuildProjectEnvironment.privilegedMode) &&
        Objects.equals(this.imagePullCredentialsType, awsCodeBuildProjectEnvironment.imagePullCredentialsType) &&
        Objects.equals(this.registryCredential, awsCodeBuildProjectEnvironment.registryCredential) &&
        Objects.equals(this.type, awsCodeBuildProjectEnvironment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, environmentVariables, privilegedMode, imagePullCredentialsType, registryCredential, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCodeBuildProjectEnvironment {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
    sb.append("    privilegedMode: ").append(toIndentedString(privilegedMode)).append("\n");
    sb.append("    imagePullCredentialsType: ").append(toIndentedString(imagePullCredentialsType)).append("\n");
    sb.append("    registryCredential: ").append(toIndentedString(registryCredential)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("Certificate");
    openapiFields.add("EnvironmentVariables");
    openapiFields.add("PrivilegedMode");
    openapiFields.add("ImagePullCredentialsType");
    openapiFields.add("RegistryCredential");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCodeBuildProjectEnvironment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCodeBuildProjectEnvironment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCodeBuildProjectEnvironment is not found in the empty JSON string", AwsCodeBuildProjectEnvironment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCodeBuildProjectEnvironment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCodeBuildProjectEnvironment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Certificate`
      if (jsonObj.get("Certificate") != null && !jsonObj.get("Certificate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Certificate"));
      }
      // validate the optional field `EnvironmentVariables`
      if (jsonObj.get("EnvironmentVariables") != null && !jsonObj.get("EnvironmentVariables").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("EnvironmentVariables"));
      }
      // validate the optional field `PrivilegedMode`
      if (jsonObj.get("PrivilegedMode") != null && !jsonObj.get("PrivilegedMode").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("PrivilegedMode"));
      }
      // validate the optional field `ImagePullCredentialsType`
      if (jsonObj.get("ImagePullCredentialsType") != null && !jsonObj.get("ImagePullCredentialsType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImagePullCredentialsType"));
      }
      // validate the optional field `RegistryCredential`
      if (jsonObj.get("RegistryCredential") != null && !jsonObj.get("RegistryCredential").isJsonNull()) {
        AwsCodeBuildProjectEnvironmentRegistryCredential.validateJsonElement(jsonObj.get("RegistryCredential"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCodeBuildProjectEnvironment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCodeBuildProjectEnvironment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCodeBuildProjectEnvironment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCodeBuildProjectEnvironment.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCodeBuildProjectEnvironment>() {
           @Override
           public void write(JsonWriter out, AwsCodeBuildProjectEnvironment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCodeBuildProjectEnvironment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCodeBuildProjectEnvironment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCodeBuildProjectEnvironment
   * @throws IOException if the JSON string is invalid with respect to AwsCodeBuildProjectEnvironment
   */
  public static AwsCodeBuildProjectEnvironment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCodeBuildProjectEnvironment.class);
  }

  /**
   * Convert an instance of AwsCodeBuildProjectEnvironment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

