/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1Volume;

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
 * A step in the build pipeline.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep {
  public static final String SERIALIZED_NAME_ALLOW_EXIT_CODES = "allowExitCodes";
  @SerializedName(SERIALIZED_NAME_ALLOW_EXIT_CODES)
  private List<Integer> allowExitCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOW_FAILURE = "allowFailure";
  @SerializedName(SERIALIZED_NAME_ALLOW_FAILURE)
  private Boolean allowFailure;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIR = "dir";
  @SerializedName(SERIALIZED_NAME_DIR)
  private String dir;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private String entrypoint;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<String> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXIT_CODE = "exitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Integer exitCode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PULL_TIMING = "pullTiming";
  @SerializedName(SERIALIZED_NAME_PULL_TIMING)
  private ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan pullTiming;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_SECRET_ENV = "secretEnv";
  @SerializedName(SERIALIZED_NAME_SECRET_ENV)
  private List<String> secretEnv = new ArrayList<>();

  /**
   * Output only. Status of the build step. At this time, build step status is only updated on build completion; step status is not updated in real-time as the build progresses.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STATUS_UNKNOWN("STATUS_UNKNOWN"),
    
    PENDING("PENDING"),
    
    QUEUED("QUEUED"),
    
    WORKING("WORKING"),
    
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    INTERNAL_ERROR("INTERNAL_ERROR"),
    
    TIMEOUT("TIMEOUT"),
    
    CANCELLED("CANCELLED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout;

  public static final String SERIALIZED_NAME_TIMING = "timing";
  @SerializedName(SERIALIZED_NAME_TIMING)
  private ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan timing;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1Volume> volumes = new ArrayList<>();

  public static final String SERIALIZED_NAME_WAIT_FOR = "waitFor";
  @SerializedName(SERIALIZED_NAME_WAIT_FOR)
  private List<String> waitFor = new ArrayList<>();

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep(
     Integer exitCode, 
     StatusEnum status
  ) {
    this();
    this.exitCode = exitCode;
    this.status = status;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep allowExitCodes(List<Integer> allowExitCodes) {
    this.allowExitCodes = allowExitCodes;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep addAllowExitCodesItem(Integer allowExitCodesItem) {
    if (this.allowExitCodes == null) {
      this.allowExitCodes = new ArrayList<>();
    }
    this.allowExitCodes.add(allowExitCodesItem);
    return this;
  }

  /**
   * Allow this build step to fail without failing the entire build if and only if the exit code is one of the specified codes. If allow_failure is also specified, this field will take precedence.
   * @return allowExitCodes
   */
  @javax.annotation.Nullable
  public List<Integer> getAllowExitCodes() {
    return allowExitCodes;
  }

  public void setAllowExitCodes(List<Integer> allowExitCodes) {
    this.allowExitCodes = allowExitCodes;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * Allow this build step to fail without failing the entire build. If false, the entire build will fail if this step fails. Otherwise, the build will succeed, but this step will still have a failure status. Error information will be reported in the failure_detail field.
   * @return allowFailure
   */
  @javax.annotation.Nullable
  public Boolean getAllowFailure() {
    return allowFailure;
  }

  public void setAllowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep args(List<String> args) {
    this.args = args;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * A list of arguments that will be presented to the step when it is started. If the image used to run the step&#39;s container has an entrypoint, the &#x60;args&#x60; are used as arguments to that entrypoint. If the image does not define an entrypoint, the first element in args is used as the entrypoint, and the remainder will be used as arguments.
   * @return args
   */
  @javax.annotation.Nullable
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep dir(String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Working directory to use when running this step&#39;s container. If this value is a relative path, it is relative to the build&#39;s working directory. If this value is absolute, it may be outside the build&#39;s working directory, in which case the contents of the path may not be persisted across build step executions, unless a &#x60;volume&#x60; for that path is specified. If the build specifies a &#x60;RepoSource&#x60; with &#x60;dir&#x60; and a step with a &#x60;dir&#x60;, which specifies an absolute path, the &#x60;RepoSource&#x60; &#x60;dir&#x60; is ignored for the step&#39;s execution.
   * @return dir
   */
  @javax.annotation.Nullable
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * Entrypoint to be used instead of the build step image&#39;s default entrypoint. If unset, the image&#39;s default entrypoint is used.
   * @return entrypoint
   */
  @javax.annotation.Nullable
  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep env(List<String> env) {
    this.env = env;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * A list of environment variable definitions to be used when running a step. The elements are of the form \&quot;KEY&#x3D;VALUE\&quot; for the environment variable \&quot;KEY\&quot; being given the value \&quot;VALUE\&quot;.
   * @return env
   */
  @javax.annotation.Nullable
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }


  /**
   * Output only. Return code from running the step.
   * @return exitCode
   */
  @javax.annotation.Nullable
  public Integer getExitCode() {
    return exitCode;
  }



  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for this build step, used in &#x60;wait_for&#x60; to reference this build step as a dependency.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The name of the container image that will run this particular build step. If the image is available in the host&#39;s Docker daemon&#39;s cache, it will be run directly. If not, the host will attempt to pull the image first, using the builder service account&#39;s credentials if necessary. The Docker daemon&#39;s cache will already have the latest versions of all of the officially supported build steps ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also have cached many of the layers for some popular images, like \&quot;ubuntu\&quot;, \&quot;debian\&quot;, but they will be refreshed at the time you attempt to use them. If you built an image in a previous build step, it will be stored in the host&#39;s Docker daemon&#39;s cache and is available to use as the name for a later build step.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep pullTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan pullTiming) {
    this.pullTiming = pullTiming;
    return this;
  }

  /**
   * Get pullTiming
   * @return pullTiming
   */
  @javax.annotation.Nullable
  public ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan getPullTiming() {
    return pullTiming;
  }

  public void setPullTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan pullTiming) {
    this.pullTiming = pullTiming;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep script(String script) {
    this.script = script;
    return this;
  }

  /**
   * A shell script to be executed in the step. When script is provided, the user cannot specify the entrypoint or args.
   * @return script
   */
  @javax.annotation.Nullable
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep secretEnv(List<String> secretEnv) {
    this.secretEnv = secretEnv;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep addSecretEnvItem(String secretEnvItem) {
    if (this.secretEnv == null) {
      this.secretEnv = new ArrayList<>();
    }
    this.secretEnv.add(secretEnvItem);
    return this;
  }

  /**
   * A list of environment variables which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build&#39;s &#x60;Secret&#x60;.
   * @return secretEnv
   */
  @javax.annotation.Nullable
  public List<String> getSecretEnv() {
    return secretEnv;
  }

  public void setSecretEnv(List<String> secretEnv) {
    this.secretEnv = secretEnv;
  }


  /**
   * Output only. Status of the build step. At this time, build step status is only updated on build completion; step status is not updated in real-time as the build progresses.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }



  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep timeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Time limit for executing this build step. If not defined, the step has no time limit and will be allowed to continue to run until either it completes or the build itself times out.
   * @return timeout
   */
  @javax.annotation.Nullable
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep timing(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan timing) {
    this.timing = timing;
    return this;
  }

  /**
   * Get timing
   * @return timing
   */
  @javax.annotation.Nullable
  public ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan getTiming() {
    return timing;
  }

  public void setTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan timing) {
    this.timing = timing;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep volumes(List<ContaineranalysisGoogleDevtoolsCloudbuildV1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep addVolumesItem(ContaineranalysisGoogleDevtoolsCloudbuildV1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * List of volumes to mount into the build step. Each volume is created as an empty volume prior to execution of the build step. Upon completion of the build, volumes and their contents are discarded. Using a named volume in only one step is not valid as it is indicative of a build request with an incorrect configuration.
   * @return volumes
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<ContaineranalysisGoogleDevtoolsCloudbuildV1Volume> volumes) {
    this.volumes = volumes;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep waitFor(List<String> waitFor) {
    this.waitFor = waitFor;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep addWaitForItem(String waitForItem) {
    if (this.waitFor == null) {
      this.waitFor = new ArrayList<>();
    }
    this.waitFor.add(waitForItem);
    return this;
  }

  /**
   * The ID(s) of the step(s) that this build step depends on. This build step will not start until all the build steps in &#x60;wait_for&#x60; have completed successfully. If &#x60;wait_for&#x60; is empty, this build step will start when all previous build steps in the &#x60;Build.Steps&#x60; list have completed successfully.
   * @return waitFor
   */
  @javax.annotation.Nullable
  public List<String> getWaitFor() {
    return waitFor;
  }

  public void setWaitFor(List<String> waitFor) {
    this.waitFor = waitFor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep containeranalysisGoogleDevtoolsCloudbuildV1BuildStep = (ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep) o;
    return Objects.equals(this.allowExitCodes, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.allowExitCodes) &&
        Objects.equals(this.allowFailure, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.allowFailure) &&
        Objects.equals(this.args, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.args) &&
        Objects.equals(this.dir, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.dir) &&
        Objects.equals(this.entrypoint, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.entrypoint) &&
        Objects.equals(this.env, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.env) &&
        Objects.equals(this.exitCode, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.exitCode) &&
        Objects.equals(this.id, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.id) &&
        Objects.equals(this.name, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.name) &&
        Objects.equals(this.pullTiming, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.pullTiming) &&
        Objects.equals(this.script, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.script) &&
        Objects.equals(this.secretEnv, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.secretEnv) &&
        Objects.equals(this.status, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.status) &&
        Objects.equals(this.timeout, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.timeout) &&
        Objects.equals(this.timing, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.timing) &&
        Objects.equals(this.volumes, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.volumes) &&
        Objects.equals(this.waitFor, containeranalysisGoogleDevtoolsCloudbuildV1BuildStep.waitFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowExitCodes, allowFailure, args, dir, entrypoint, env, exitCode, id, name, pullTiming, script, secretEnv, status, timeout, timing, volumes, waitFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep {\n");
    sb.append("    allowExitCodes: ").append(toIndentedString(allowExitCodes)).append("\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pullTiming: ").append(toIndentedString(pullTiming)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    secretEnv: ").append(toIndentedString(secretEnv)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    waitFor: ").append(toIndentedString(waitFor)).append("\n");
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
    openapiFields.add("allowExitCodes");
    openapiFields.add("allowFailure");
    openapiFields.add("args");
    openapiFields.add("dir");
    openapiFields.add("entrypoint");
    openapiFields.add("env");
    openapiFields.add("exitCode");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("pullTiming");
    openapiFields.add("script");
    openapiFields.add("secretEnv");
    openapiFields.add("status");
    openapiFields.add("timeout");
    openapiFields.add("timing");
    openapiFields.add("volumes");
    openapiFields.add("waitFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowExitCodes") != null && !jsonObj.get("allowExitCodes").isJsonNull() && !jsonObj.get("allowExitCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowExitCodes` to be an array in the JSON string but got `%s`", jsonObj.get("allowExitCodes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("args") != null && !jsonObj.get("args").isJsonNull() && !jsonObj.get("args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `args` to be an array in the JSON string but got `%s`", jsonObj.get("args").toString()));
      }
      if ((jsonObj.get("dir") != null && !jsonObj.get("dir").isJsonNull()) && !jsonObj.get("dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dir").toString()));
      }
      if ((jsonObj.get("entrypoint") != null && !jsonObj.get("entrypoint").isJsonNull()) && !jsonObj.get("entrypoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entrypoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entrypoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull() && !jsonObj.get("env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `pullTiming`
      if (jsonObj.get("pullTiming") != null && !jsonObj.get("pullTiming").isJsonNull()) {
        ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan.validateJsonElement(jsonObj.get("pullTiming"));
      }
      if ((jsonObj.get("script") != null && !jsonObj.get("script").isJsonNull()) && !jsonObj.get("script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("secretEnv") != null && !jsonObj.get("secretEnv").isJsonNull() && !jsonObj.get("secretEnv").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretEnv` to be an array in the JSON string but got `%s`", jsonObj.get("secretEnv").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonNull()) && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
      }
      // validate the optional field `timing`
      if (jsonObj.get("timing") != null && !jsonObj.get("timing").isJsonNull()) {
        ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan.validateJsonElement(jsonObj.get("timing"));
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1Volume.validateJsonElement(jsonArrayvolumes.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("waitFor") != null && !jsonObj.get("waitFor").isJsonNull() && !jsonObj.get("waitFor").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `waitFor` to be an array in the JSON string but got `%s`", jsonObj.get("waitFor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1BuildStep to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

