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
import org.openapitools.client.model.AwsEfsAccessPointDetailsPosixUser;
import org.openapitools.client.model.AwsEfsAccessPointDetailsRootDirectory;

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
 * ResourceDetailsAwsEfsAccessPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEfsAccessPoint {
  public static final String SERIALIZED_NAME_ACCESS_POINT_ID = "AccessPointId";
  @SerializedName(SERIALIZED_NAME_ACCESS_POINT_ID)
  private String accessPointId;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_CLIENT_TOKEN = "ClientToken";
  @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN)
  private String clientToken;

  public static final String SERIALIZED_NAME_FILE_SYSTEM_ID = "FileSystemId";
  @SerializedName(SERIALIZED_NAME_FILE_SYSTEM_ID)
  private String fileSystemId;

  public static final String SERIALIZED_NAME_POSIX_USER = "PosixUser";
  @SerializedName(SERIALIZED_NAME_POSIX_USER)
  private AwsEfsAccessPointDetailsPosixUser posixUser;

  public static final String SERIALIZED_NAME_ROOT_DIRECTORY = "RootDirectory";
  @SerializedName(SERIALIZED_NAME_ROOT_DIRECTORY)
  private AwsEfsAccessPointDetailsRootDirectory rootDirectory;

  public ResourceDetailsAwsEfsAccessPoint() {
  }

  public ResourceDetailsAwsEfsAccessPoint accessPointId(String accessPointId) {
    this.accessPointId = accessPointId;
    return this;
  }

  /**
   * Get accessPointId
   * @return accessPointId
   */
  @javax.annotation.Nullable
  public String getAccessPointId() {
    return accessPointId;
  }

  public void setAccessPointId(String accessPointId) {
    this.accessPointId = accessPointId;
  }


  public ResourceDetailsAwsEfsAccessPoint arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public ResourceDetailsAwsEfsAccessPoint clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * Get clientToken
   * @return clientToken
   */
  @javax.annotation.Nullable
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }


  public ResourceDetailsAwsEfsAccessPoint fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

  /**
   * Get fileSystemId
   * @return fileSystemId
   */
  @javax.annotation.Nullable
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }


  public ResourceDetailsAwsEfsAccessPoint posixUser(AwsEfsAccessPointDetailsPosixUser posixUser) {
    this.posixUser = posixUser;
    return this;
  }

  /**
   * Get posixUser
   * @return posixUser
   */
  @javax.annotation.Nullable
  public AwsEfsAccessPointDetailsPosixUser getPosixUser() {
    return posixUser;
  }

  public void setPosixUser(AwsEfsAccessPointDetailsPosixUser posixUser) {
    this.posixUser = posixUser;
  }


  public ResourceDetailsAwsEfsAccessPoint rootDirectory(AwsEfsAccessPointDetailsRootDirectory rootDirectory) {
    this.rootDirectory = rootDirectory;
    return this;
  }

  /**
   * Get rootDirectory
   * @return rootDirectory
   */
  @javax.annotation.Nullable
  public AwsEfsAccessPointDetailsRootDirectory getRootDirectory() {
    return rootDirectory;
  }

  public void setRootDirectory(AwsEfsAccessPointDetailsRootDirectory rootDirectory) {
    this.rootDirectory = rootDirectory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEfsAccessPoint resourceDetailsAwsEfsAccessPoint = (ResourceDetailsAwsEfsAccessPoint) o;
    return Objects.equals(this.accessPointId, resourceDetailsAwsEfsAccessPoint.accessPointId) &&
        Objects.equals(this.arn, resourceDetailsAwsEfsAccessPoint.arn) &&
        Objects.equals(this.clientToken, resourceDetailsAwsEfsAccessPoint.clientToken) &&
        Objects.equals(this.fileSystemId, resourceDetailsAwsEfsAccessPoint.fileSystemId) &&
        Objects.equals(this.posixUser, resourceDetailsAwsEfsAccessPoint.posixUser) &&
        Objects.equals(this.rootDirectory, resourceDetailsAwsEfsAccessPoint.rootDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPointId, arn, clientToken, fileSystemId, posixUser, rootDirectory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEfsAccessPoint {\n");
    sb.append("    accessPointId: ").append(toIndentedString(accessPointId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    posixUser: ").append(toIndentedString(posixUser)).append("\n");
    sb.append("    rootDirectory: ").append(toIndentedString(rootDirectory)).append("\n");
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
    openapiFields.add("AccessPointId");
    openapiFields.add("Arn");
    openapiFields.add("ClientToken");
    openapiFields.add("FileSystemId");
    openapiFields.add("PosixUser");
    openapiFields.add("RootDirectory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEfsAccessPoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEfsAccessPoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEfsAccessPoint is not found in the empty JSON string", ResourceDetailsAwsEfsAccessPoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEfsAccessPoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEfsAccessPoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccessPointId`
      if (jsonObj.get("AccessPointId") != null && !jsonObj.get("AccessPointId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessPointId"));
      }
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `ClientToken`
      if (jsonObj.get("ClientToken") != null && !jsonObj.get("ClientToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ClientToken"));
      }
      // validate the optional field `FileSystemId`
      if (jsonObj.get("FileSystemId") != null && !jsonObj.get("FileSystemId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("FileSystemId"));
      }
      // validate the optional field `PosixUser`
      if (jsonObj.get("PosixUser") != null && !jsonObj.get("PosixUser").isJsonNull()) {
        AwsEfsAccessPointDetailsPosixUser.validateJsonElement(jsonObj.get("PosixUser"));
      }
      // validate the optional field `RootDirectory`
      if (jsonObj.get("RootDirectory") != null && !jsonObj.get("RootDirectory").isJsonNull()) {
        AwsEfsAccessPointDetailsRootDirectory.validateJsonElement(jsonObj.get("RootDirectory"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEfsAccessPoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEfsAccessPoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEfsAccessPoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEfsAccessPoint.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEfsAccessPoint>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEfsAccessPoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEfsAccessPoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEfsAccessPoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEfsAccessPoint
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEfsAccessPoint
   */
  public static ResourceDetailsAwsEfsAccessPoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEfsAccessPoint.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEfsAccessPoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

