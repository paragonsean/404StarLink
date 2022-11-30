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
 * Information about the build input source code for this build project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCodeBuildProjectSource {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_GIT_CLONE_DEPTH = "GitCloneDepth";
  @SerializedName(SERIALIZED_NAME_GIT_CLONE_DEPTH)
  private Integer gitCloneDepth;

  public static final String SERIALIZED_NAME_INSECURE_SSL = "InsecureSsl";
  @SerializedName(SERIALIZED_NAME_INSECURE_SSL)
  private Boolean insecureSsl;

  public AwsCodeBuildProjectSource() {
  }

  public AwsCodeBuildProjectSource type(String type) {
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


  public AwsCodeBuildProjectSource location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public AwsCodeBuildProjectSource gitCloneDepth(Integer gitCloneDepth) {
    this.gitCloneDepth = gitCloneDepth;
    return this;
  }

  /**
   * Get gitCloneDepth
   * @return gitCloneDepth
   */
  @javax.annotation.Nullable
  public Integer getGitCloneDepth() {
    return gitCloneDepth;
  }

  public void setGitCloneDepth(Integer gitCloneDepth) {
    this.gitCloneDepth = gitCloneDepth;
  }


  public AwsCodeBuildProjectSource insecureSsl(Boolean insecureSsl) {
    this.insecureSsl = insecureSsl;
    return this;
  }

  /**
   * Get insecureSsl
   * @return insecureSsl
   */
  @javax.annotation.Nullable
  public Boolean getInsecureSsl() {
    return insecureSsl;
  }

  public void setInsecureSsl(Boolean insecureSsl) {
    this.insecureSsl = insecureSsl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCodeBuildProjectSource awsCodeBuildProjectSource = (AwsCodeBuildProjectSource) o;
    return Objects.equals(this.type, awsCodeBuildProjectSource.type) &&
        Objects.equals(this.location, awsCodeBuildProjectSource.location) &&
        Objects.equals(this.gitCloneDepth, awsCodeBuildProjectSource.gitCloneDepth) &&
        Objects.equals(this.insecureSsl, awsCodeBuildProjectSource.insecureSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, location, gitCloneDepth, insecureSsl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCodeBuildProjectSource {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    gitCloneDepth: ").append(toIndentedString(gitCloneDepth)).append("\n");
    sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Location");
    openapiFields.add("GitCloneDepth");
    openapiFields.add("InsecureSsl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCodeBuildProjectSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCodeBuildProjectSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCodeBuildProjectSource is not found in the empty JSON string", AwsCodeBuildProjectSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCodeBuildProjectSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCodeBuildProjectSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `Location`
      if (jsonObj.get("Location") != null && !jsonObj.get("Location").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Location"));
      }
      // validate the optional field `GitCloneDepth`
      if (jsonObj.get("GitCloneDepth") != null && !jsonObj.get("GitCloneDepth").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("GitCloneDepth"));
      }
      // validate the optional field `InsecureSsl`
      if (jsonObj.get("InsecureSsl") != null && !jsonObj.get("InsecureSsl").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("InsecureSsl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCodeBuildProjectSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCodeBuildProjectSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCodeBuildProjectSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCodeBuildProjectSource.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCodeBuildProjectSource>() {
           @Override
           public void write(JsonWriter out, AwsCodeBuildProjectSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCodeBuildProjectSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCodeBuildProjectSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCodeBuildProjectSource
   * @throws IOException if the JSON string is invalid with respect to AwsCodeBuildProjectSource
   */
  public static AwsCodeBuildProjectSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCodeBuildProjectSource.class);
  }

  /**
   * Convert an instance of AwsCodeBuildProjectSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

