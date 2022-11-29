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
 * AwsSecurityFindingProcess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsSecurityFindingProcess {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PID = "Pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private Integer pid;

  public static final String SERIALIZED_NAME_PARENT_PID = "ParentPid";
  @SerializedName(SERIALIZED_NAME_PARENT_PID)
  private Integer parentPid;

  public static final String SERIALIZED_NAME_LAUNCHED_AT = "LaunchedAt";
  @SerializedName(SERIALIZED_NAME_LAUNCHED_AT)
  private String launchedAt;

  public static final String SERIALIZED_NAME_TERMINATED_AT = "TerminatedAt";
  @SerializedName(SERIALIZED_NAME_TERMINATED_AT)
  private String terminatedAt;

  public AwsSecurityFindingProcess() {
  }

  public AwsSecurityFindingProcess name(String name) {
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


  public AwsSecurityFindingProcess path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public AwsSecurityFindingProcess pid(Integer pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @javax.annotation.Nullable
  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }


  public AwsSecurityFindingProcess parentPid(Integer parentPid) {
    this.parentPid = parentPid;
    return this;
  }

  /**
   * Get parentPid
   * @return parentPid
   */
  @javax.annotation.Nullable
  public Integer getParentPid() {
    return parentPid;
  }

  public void setParentPid(Integer parentPid) {
    this.parentPid = parentPid;
  }


  public AwsSecurityFindingProcess launchedAt(String launchedAt) {
    this.launchedAt = launchedAt;
    return this;
  }

  /**
   * Get launchedAt
   * @return launchedAt
   */
  @javax.annotation.Nullable
  public String getLaunchedAt() {
    return launchedAt;
  }

  public void setLaunchedAt(String launchedAt) {
    this.launchedAt = launchedAt;
  }


  public AwsSecurityFindingProcess terminatedAt(String terminatedAt) {
    this.terminatedAt = terminatedAt;
    return this;
  }

  /**
   * Get terminatedAt
   * @return terminatedAt
   */
  @javax.annotation.Nullable
  public String getTerminatedAt() {
    return terminatedAt;
  }

  public void setTerminatedAt(String terminatedAt) {
    this.terminatedAt = terminatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsSecurityFindingProcess awsSecurityFindingProcess = (AwsSecurityFindingProcess) o;
    return Objects.equals(this.name, awsSecurityFindingProcess.name) &&
        Objects.equals(this.path, awsSecurityFindingProcess.path) &&
        Objects.equals(this.pid, awsSecurityFindingProcess.pid) &&
        Objects.equals(this.parentPid, awsSecurityFindingProcess.parentPid) &&
        Objects.equals(this.launchedAt, awsSecurityFindingProcess.launchedAt) &&
        Objects.equals(this.terminatedAt, awsSecurityFindingProcess.terminatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, pid, parentPid, launchedAt, terminatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsSecurityFindingProcess {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    parentPid: ").append(toIndentedString(parentPid)).append("\n");
    sb.append("    launchedAt: ").append(toIndentedString(launchedAt)).append("\n");
    sb.append("    terminatedAt: ").append(toIndentedString(terminatedAt)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Path");
    openapiFields.add("Pid");
    openapiFields.add("ParentPid");
    openapiFields.add("LaunchedAt");
    openapiFields.add("TerminatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsSecurityFindingProcess
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsSecurityFindingProcess.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsSecurityFindingProcess is not found in the empty JSON string", AwsSecurityFindingProcess.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsSecurityFindingProcess.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsSecurityFindingProcess` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Path`
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Path"));
      }
      // validate the optional field `Pid`
      if (jsonObj.get("Pid") != null && !jsonObj.get("Pid").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Pid"));
      }
      // validate the optional field `ParentPid`
      if (jsonObj.get("ParentPid") != null && !jsonObj.get("ParentPid").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ParentPid"));
      }
      // validate the optional field `LaunchedAt`
      if (jsonObj.get("LaunchedAt") != null && !jsonObj.get("LaunchedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchedAt"));
      }
      // validate the optional field `TerminatedAt`
      if (jsonObj.get("TerminatedAt") != null && !jsonObj.get("TerminatedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TerminatedAt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsSecurityFindingProcess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsSecurityFindingProcess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsSecurityFindingProcess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsSecurityFindingProcess.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsSecurityFindingProcess>() {
           @Override
           public void write(JsonWriter out, AwsSecurityFindingProcess value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsSecurityFindingProcess read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsSecurityFindingProcess given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsSecurityFindingProcess
   * @throws IOException if the JSON string is invalid with respect to AwsSecurityFindingProcess
   */
  public static AwsSecurityFindingProcess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsSecurityFindingProcess.class);
  }

  /**
   * Convert an instance of AwsSecurityFindingProcess to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

