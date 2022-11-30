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
import org.openapitools.client.model.AwsLambdaFunctionDetailsCode;
import org.openapitools.client.model.AwsLambdaFunctionDetailsDeadLetterConfig;
import org.openapitools.client.model.AwsLambdaFunctionDetailsEnvironment;
import org.openapitools.client.model.AwsLambdaFunctionDetailsTracingConfig;
import org.openapitools.client.model.AwsLambdaFunctionDetailsVpcConfig;

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
 * Details about an Lambda function&#39;s configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsLambdaFunctionDetails {
  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private AwsLambdaFunctionDetailsCode code;

  public static final String SERIALIZED_NAME_CODE_SHA256 = "CodeSha256";
  @SerializedName(SERIALIZED_NAME_CODE_SHA256)
  private String codeSha256;

  public static final String SERIALIZED_NAME_DEAD_LETTER_CONFIG = "DeadLetterConfig";
  @SerializedName(SERIALIZED_NAME_DEAD_LETTER_CONFIG)
  private AwsLambdaFunctionDetailsDeadLetterConfig deadLetterConfig;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "Environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private AwsLambdaFunctionDetailsEnvironment environment;

  public static final String SERIALIZED_NAME_FUNCTION_NAME = "FunctionName";
  @SerializedName(SERIALIZED_NAME_FUNCTION_NAME)
  private String functionName;

  public static final String SERIALIZED_NAME_HANDLER = "Handler";
  @SerializedName(SERIALIZED_NAME_HANDLER)
  private String handler;

  public static final String SERIALIZED_NAME_KMS_KEY_ARN = "KmsKeyArn";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ARN)
  private String kmsKeyArn;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "LastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_LAYERS = "Layers";
  @SerializedName(SERIALIZED_NAME_LAYERS)
  private List layers;

  public static final String SERIALIZED_NAME_MASTER_ARN = "MasterArn";
  @SerializedName(SERIALIZED_NAME_MASTER_ARN)
  private String masterArn;

  public static final String SERIALIZED_NAME_MEMORY_SIZE = "MemorySize";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE)
  private Integer memorySize;

  public static final String SERIALIZED_NAME_REVISION_ID = "RevisionId";
  @SerializedName(SERIALIZED_NAME_REVISION_ID)
  private String revisionId;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_RUNTIME = "Runtime";
  @SerializedName(SERIALIZED_NAME_RUNTIME)
  private String runtime;

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_TRACING_CONFIG = "TracingConfig";
  @SerializedName(SERIALIZED_NAME_TRACING_CONFIG)
  private AwsLambdaFunctionDetailsTracingConfig tracingConfig;

  public static final String SERIALIZED_NAME_VPC_CONFIG = "VpcConfig";
  @SerializedName(SERIALIZED_NAME_VPC_CONFIG)
  private AwsLambdaFunctionDetailsVpcConfig vpcConfig;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ARCHITECTURES = "Architectures";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURES)
  private List architectures;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "PackageType";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public AwsLambdaFunctionDetails() {
  }

  public AwsLambdaFunctionDetails code(AwsLambdaFunctionDetailsCode code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public AwsLambdaFunctionDetailsCode getCode() {
    return code;
  }

  public void setCode(AwsLambdaFunctionDetailsCode code) {
    this.code = code;
  }


  public AwsLambdaFunctionDetails codeSha256(String codeSha256) {
    this.codeSha256 = codeSha256;
    return this;
  }

  /**
   * Get codeSha256
   * @return codeSha256
   */
  @javax.annotation.Nullable
  public String getCodeSha256() {
    return codeSha256;
  }

  public void setCodeSha256(String codeSha256) {
    this.codeSha256 = codeSha256;
  }


  public AwsLambdaFunctionDetails deadLetterConfig(AwsLambdaFunctionDetailsDeadLetterConfig deadLetterConfig) {
    this.deadLetterConfig = deadLetterConfig;
    return this;
  }

  /**
   * Get deadLetterConfig
   * @return deadLetterConfig
   */
  @javax.annotation.Nullable
  public AwsLambdaFunctionDetailsDeadLetterConfig getDeadLetterConfig() {
    return deadLetterConfig;
  }

  public void setDeadLetterConfig(AwsLambdaFunctionDetailsDeadLetterConfig deadLetterConfig) {
    this.deadLetterConfig = deadLetterConfig;
  }


  public AwsLambdaFunctionDetails environment(AwsLambdaFunctionDetailsEnvironment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  public AwsLambdaFunctionDetailsEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(AwsLambdaFunctionDetailsEnvironment environment) {
    this.environment = environment;
  }


  public AwsLambdaFunctionDetails functionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  /**
   * Get functionName
   * @return functionName
   */
  @javax.annotation.Nullable
  public String getFunctionName() {
    return functionName;
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }


  public AwsLambdaFunctionDetails handler(String handler) {
    this.handler = handler;
    return this;
  }

  /**
   * Get handler
   * @return handler
   */
  @javax.annotation.Nullable
  public String getHandler() {
    return handler;
  }

  public void setHandler(String handler) {
    this.handler = handler;
  }


  public AwsLambdaFunctionDetails kmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
    return this;
  }

  /**
   * Get kmsKeyArn
   * @return kmsKeyArn
   */
  @javax.annotation.Nullable
  public String getKmsKeyArn() {
    return kmsKeyArn;
  }

  public void setKmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
  }


  public AwsLambdaFunctionDetails lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public AwsLambdaFunctionDetails layers(List layers) {
    this.layers = layers;
    return this;
  }

  /**
   * Get layers
   * @return layers
   */
  @javax.annotation.Nullable
  public List getLayers() {
    return layers;
  }

  public void setLayers(List layers) {
    this.layers = layers;
  }


  public AwsLambdaFunctionDetails masterArn(String masterArn) {
    this.masterArn = masterArn;
    return this;
  }

  /**
   * Get masterArn
   * @return masterArn
   */
  @javax.annotation.Nullable
  public String getMasterArn() {
    return masterArn;
  }

  public void setMasterArn(String masterArn) {
    this.masterArn = masterArn;
  }


  public AwsLambdaFunctionDetails memorySize(Integer memorySize) {
    this.memorySize = memorySize;
    return this;
  }

  /**
   * Get memorySize
   * @return memorySize
   */
  @javax.annotation.Nullable
  public Integer getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(Integer memorySize) {
    this.memorySize = memorySize;
  }


  public AwsLambdaFunctionDetails revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Get revisionId
   * @return revisionId
   */
  @javax.annotation.Nullable
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }


  public AwsLambdaFunctionDetails role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public AwsLambdaFunctionDetails runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Get runtime
   * @return runtime
   */
  @javax.annotation.Nullable
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }


  public AwsLambdaFunctionDetails timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Get timeout
   * @return timeout
   */
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public AwsLambdaFunctionDetails tracingConfig(AwsLambdaFunctionDetailsTracingConfig tracingConfig) {
    this.tracingConfig = tracingConfig;
    return this;
  }

  /**
   * Get tracingConfig
   * @return tracingConfig
   */
  @javax.annotation.Nullable
  public AwsLambdaFunctionDetailsTracingConfig getTracingConfig() {
    return tracingConfig;
  }

  public void setTracingConfig(AwsLambdaFunctionDetailsTracingConfig tracingConfig) {
    this.tracingConfig = tracingConfig;
  }


  public AwsLambdaFunctionDetails vpcConfig(AwsLambdaFunctionDetailsVpcConfig vpcConfig) {
    this.vpcConfig = vpcConfig;
    return this;
  }

  /**
   * Get vpcConfig
   * @return vpcConfig
   */
  @javax.annotation.Nullable
  public AwsLambdaFunctionDetailsVpcConfig getVpcConfig() {
    return vpcConfig;
  }

  public void setVpcConfig(AwsLambdaFunctionDetailsVpcConfig vpcConfig) {
    this.vpcConfig = vpcConfig;
  }


  public AwsLambdaFunctionDetails version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public AwsLambdaFunctionDetails architectures(List architectures) {
    this.architectures = architectures;
    return this;
  }

  /**
   * Get architectures
   * @return architectures
   */
  @javax.annotation.Nullable
  public List getArchitectures() {
    return architectures;
  }

  public void setArchitectures(List architectures) {
    this.architectures = architectures;
  }


  public AwsLambdaFunctionDetails packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Get packageType
   * @return packageType
   */
  @javax.annotation.Nullable
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsLambdaFunctionDetails awsLambdaFunctionDetails = (AwsLambdaFunctionDetails) o;
    return Objects.equals(this.code, awsLambdaFunctionDetails.code) &&
        Objects.equals(this.codeSha256, awsLambdaFunctionDetails.codeSha256) &&
        Objects.equals(this.deadLetterConfig, awsLambdaFunctionDetails.deadLetterConfig) &&
        Objects.equals(this.environment, awsLambdaFunctionDetails.environment) &&
        Objects.equals(this.functionName, awsLambdaFunctionDetails.functionName) &&
        Objects.equals(this.handler, awsLambdaFunctionDetails.handler) &&
        Objects.equals(this.kmsKeyArn, awsLambdaFunctionDetails.kmsKeyArn) &&
        Objects.equals(this.lastModified, awsLambdaFunctionDetails.lastModified) &&
        Objects.equals(this.layers, awsLambdaFunctionDetails.layers) &&
        Objects.equals(this.masterArn, awsLambdaFunctionDetails.masterArn) &&
        Objects.equals(this.memorySize, awsLambdaFunctionDetails.memorySize) &&
        Objects.equals(this.revisionId, awsLambdaFunctionDetails.revisionId) &&
        Objects.equals(this.role, awsLambdaFunctionDetails.role) &&
        Objects.equals(this.runtime, awsLambdaFunctionDetails.runtime) &&
        Objects.equals(this.timeout, awsLambdaFunctionDetails.timeout) &&
        Objects.equals(this.tracingConfig, awsLambdaFunctionDetails.tracingConfig) &&
        Objects.equals(this.vpcConfig, awsLambdaFunctionDetails.vpcConfig) &&
        Objects.equals(this.version, awsLambdaFunctionDetails.version) &&
        Objects.equals(this.architectures, awsLambdaFunctionDetails.architectures) &&
        Objects.equals(this.packageType, awsLambdaFunctionDetails.packageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeSha256, deadLetterConfig, environment, functionName, handler, kmsKeyArn, lastModified, layers, masterArn, memorySize, revisionId, role, runtime, timeout, tracingConfig, vpcConfig, version, architectures, packageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsLambdaFunctionDetails {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeSha256: ").append(toIndentedString(codeSha256)).append("\n");
    sb.append("    deadLetterConfig: ").append(toIndentedString(deadLetterConfig)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    kmsKeyArn: ").append(toIndentedString(kmsKeyArn)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    masterArn: ").append(toIndentedString(masterArn)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    tracingConfig: ").append(toIndentedString(tracingConfig)).append("\n");
    sb.append("    vpcConfig: ").append(toIndentedString(vpcConfig)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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
    openapiFields.add("Code");
    openapiFields.add("CodeSha256");
    openapiFields.add("DeadLetterConfig");
    openapiFields.add("Environment");
    openapiFields.add("FunctionName");
    openapiFields.add("Handler");
    openapiFields.add("KmsKeyArn");
    openapiFields.add("LastModified");
    openapiFields.add("Layers");
    openapiFields.add("MasterArn");
    openapiFields.add("MemorySize");
    openapiFields.add("RevisionId");
    openapiFields.add("Role");
    openapiFields.add("Runtime");
    openapiFields.add("Timeout");
    openapiFields.add("TracingConfig");
    openapiFields.add("VpcConfig");
    openapiFields.add("Version");
    openapiFields.add("Architectures");
    openapiFields.add("PackageType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsLambdaFunctionDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsLambdaFunctionDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsLambdaFunctionDetails is not found in the empty JSON string", AwsLambdaFunctionDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsLambdaFunctionDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsLambdaFunctionDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Code`
      if (jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) {
        AwsLambdaFunctionDetailsCode.validateJsonElement(jsonObj.get("Code"));
      }
      // validate the optional field `CodeSha256`
      if (jsonObj.get("CodeSha256") != null && !jsonObj.get("CodeSha256").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CodeSha256"));
      }
      // validate the optional field `DeadLetterConfig`
      if (jsonObj.get("DeadLetterConfig") != null && !jsonObj.get("DeadLetterConfig").isJsonNull()) {
        AwsLambdaFunctionDetailsDeadLetterConfig.validateJsonElement(jsonObj.get("DeadLetterConfig"));
      }
      // validate the optional field `Environment`
      if (jsonObj.get("Environment") != null && !jsonObj.get("Environment").isJsonNull()) {
        AwsLambdaFunctionDetailsEnvironment.validateJsonElement(jsonObj.get("Environment"));
      }
      // validate the optional field `FunctionName`
      if (jsonObj.get("FunctionName") != null && !jsonObj.get("FunctionName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FunctionName"));
      }
      // validate the optional field `Handler`
      if (jsonObj.get("Handler") != null && !jsonObj.get("Handler").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Handler"));
      }
      // validate the optional field `KmsKeyArn`
      if (jsonObj.get("KmsKeyArn") != null && !jsonObj.get("KmsKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyArn"));
      }
      // validate the optional field `LastModified`
      if (jsonObj.get("LastModified") != null && !jsonObj.get("LastModified").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastModified"));
      }
      // validate the optional field `Layers`
      if (jsonObj.get("Layers") != null && !jsonObj.get("Layers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Layers"));
      }
      // validate the optional field `MasterArn`
      if (jsonObj.get("MasterArn") != null && !jsonObj.get("MasterArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MasterArn"));
      }
      // validate the optional field `MemorySize`
      if (jsonObj.get("MemorySize") != null && !jsonObj.get("MemorySize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MemorySize"));
      }
      // validate the optional field `RevisionId`
      if (jsonObj.get("RevisionId") != null && !jsonObj.get("RevisionId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RevisionId"));
      }
      // validate the optional field `Role`
      if (jsonObj.get("Role") != null && !jsonObj.get("Role").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Role"));
      }
      // validate the optional field `Runtime`
      if (jsonObj.get("Runtime") != null && !jsonObj.get("Runtime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Runtime"));
      }
      // validate the optional field `Timeout`
      if (jsonObj.get("Timeout") != null && !jsonObj.get("Timeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Timeout"));
      }
      // validate the optional field `TracingConfig`
      if (jsonObj.get("TracingConfig") != null && !jsonObj.get("TracingConfig").isJsonNull()) {
        AwsLambdaFunctionDetailsTracingConfig.validateJsonElement(jsonObj.get("TracingConfig"));
      }
      // validate the optional field `VpcConfig`
      if (jsonObj.get("VpcConfig") != null && !jsonObj.get("VpcConfig").isJsonNull()) {
        AwsLambdaFunctionDetailsVpcConfig.validateJsonElement(jsonObj.get("VpcConfig"));
      }
      // validate the optional field `Version`
      if (jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Version"));
      }
      // validate the optional field `Architectures`
      if (jsonObj.get("Architectures") != null && !jsonObj.get("Architectures").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Architectures"));
      }
      // validate the optional field `PackageType`
      if (jsonObj.get("PackageType") != null && !jsonObj.get("PackageType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PackageType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsLambdaFunctionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsLambdaFunctionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsLambdaFunctionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsLambdaFunctionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsLambdaFunctionDetails>() {
           @Override
           public void write(JsonWriter out, AwsLambdaFunctionDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsLambdaFunctionDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsLambdaFunctionDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsLambdaFunctionDetails
   * @throws IOException if the JSON string is invalid with respect to AwsLambdaFunctionDetails
   */
  public static AwsLambdaFunctionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsLambdaFunctionDetails.class);
  }

  /**
   * Convert an instance of AwsLambdaFunctionDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

