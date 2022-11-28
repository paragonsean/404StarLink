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
 * Information about the build artifacts for the CodeBuild project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCodeBuildProjectArtifactsDetails {
  public static final String SERIALIZED_NAME_ARTIFACT_IDENTIFIER = "ArtifactIdentifier";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_IDENTIFIER)
  private String artifactIdentifier;

  public static final String SERIALIZED_NAME_ENCRYPTION_DISABLED = "EncryptionDisabled";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_DISABLED)
  private Boolean encryptionDisabled;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_TYPE = "NamespaceType";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_TYPE)
  private String namespaceType;

  public static final String SERIALIZED_NAME_OVERRIDE_ARTIFACT_NAME = "OverrideArtifactName";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_ARTIFACT_NAME)
  private Boolean overrideArtifactName;

  public static final String SERIALIZED_NAME_PACKAGING = "Packaging";
  @SerializedName(SERIALIZED_NAME_PACKAGING)
  private String packaging;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AwsCodeBuildProjectArtifactsDetails() {
  }

  public AwsCodeBuildProjectArtifactsDetails artifactIdentifier(String artifactIdentifier) {
    this.artifactIdentifier = artifactIdentifier;
    return this;
  }

  /**
   * Get artifactIdentifier
   * @return artifactIdentifier
   */
  @javax.annotation.Nullable
  public String getArtifactIdentifier() {
    return artifactIdentifier;
  }

  public void setArtifactIdentifier(String artifactIdentifier) {
    this.artifactIdentifier = artifactIdentifier;
  }


  public AwsCodeBuildProjectArtifactsDetails encryptionDisabled(Boolean encryptionDisabled) {
    this.encryptionDisabled = encryptionDisabled;
    return this;
  }

  /**
   * Get encryptionDisabled
   * @return encryptionDisabled
   */
  @javax.annotation.Nullable
  public Boolean getEncryptionDisabled() {
    return encryptionDisabled;
  }

  public void setEncryptionDisabled(Boolean encryptionDisabled) {
    this.encryptionDisabled = encryptionDisabled;
  }


  public AwsCodeBuildProjectArtifactsDetails location(String location) {
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


  public AwsCodeBuildProjectArtifactsDetails name(String name) {
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


  public AwsCodeBuildProjectArtifactsDetails namespaceType(String namespaceType) {
    this.namespaceType = namespaceType;
    return this;
  }

  /**
   * Get namespaceType
   * @return namespaceType
   */
  @javax.annotation.Nullable
  public String getNamespaceType() {
    return namespaceType;
  }

  public void setNamespaceType(String namespaceType) {
    this.namespaceType = namespaceType;
  }


  public AwsCodeBuildProjectArtifactsDetails overrideArtifactName(Boolean overrideArtifactName) {
    this.overrideArtifactName = overrideArtifactName;
    return this;
  }

  /**
   * Get overrideArtifactName
   * @return overrideArtifactName
   */
  @javax.annotation.Nullable
  public Boolean getOverrideArtifactName() {
    return overrideArtifactName;
  }

  public void setOverrideArtifactName(Boolean overrideArtifactName) {
    this.overrideArtifactName = overrideArtifactName;
  }


  public AwsCodeBuildProjectArtifactsDetails packaging(String packaging) {
    this.packaging = packaging;
    return this;
  }

  /**
   * Get packaging
   * @return packaging
   */
  @javax.annotation.Nullable
  public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
  }


  public AwsCodeBuildProjectArtifactsDetails path(String path) {
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


  public AwsCodeBuildProjectArtifactsDetails type(String type) {
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
    AwsCodeBuildProjectArtifactsDetails awsCodeBuildProjectArtifactsDetails = (AwsCodeBuildProjectArtifactsDetails) o;
    return Objects.equals(this.artifactIdentifier, awsCodeBuildProjectArtifactsDetails.artifactIdentifier) &&
        Objects.equals(this.encryptionDisabled, awsCodeBuildProjectArtifactsDetails.encryptionDisabled) &&
        Objects.equals(this.location, awsCodeBuildProjectArtifactsDetails.location) &&
        Objects.equals(this.name, awsCodeBuildProjectArtifactsDetails.name) &&
        Objects.equals(this.namespaceType, awsCodeBuildProjectArtifactsDetails.namespaceType) &&
        Objects.equals(this.overrideArtifactName, awsCodeBuildProjectArtifactsDetails.overrideArtifactName) &&
        Objects.equals(this.packaging, awsCodeBuildProjectArtifactsDetails.packaging) &&
        Objects.equals(this.path, awsCodeBuildProjectArtifactsDetails.path) &&
        Objects.equals(this.type, awsCodeBuildProjectArtifactsDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactIdentifier, encryptionDisabled, location, name, namespaceType, overrideArtifactName, packaging, path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCodeBuildProjectArtifactsDetails {\n");
    sb.append("    artifactIdentifier: ").append(toIndentedString(artifactIdentifier)).append("\n");
    sb.append("    encryptionDisabled: ").append(toIndentedString(encryptionDisabled)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceType: ").append(toIndentedString(namespaceType)).append("\n");
    sb.append("    overrideArtifactName: ").append(toIndentedString(overrideArtifactName)).append("\n");
    sb.append("    packaging: ").append(toIndentedString(packaging)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("ArtifactIdentifier");
    openapiFields.add("EncryptionDisabled");
    openapiFields.add("Location");
    openapiFields.add("Name");
    openapiFields.add("NamespaceType");
    openapiFields.add("OverrideArtifactName");
    openapiFields.add("Packaging");
    openapiFields.add("Path");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCodeBuildProjectArtifactsDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCodeBuildProjectArtifactsDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCodeBuildProjectArtifactsDetails is not found in the empty JSON string", AwsCodeBuildProjectArtifactsDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCodeBuildProjectArtifactsDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCodeBuildProjectArtifactsDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ArtifactIdentifier`
      if (jsonObj.get("ArtifactIdentifier") != null && !jsonObj.get("ArtifactIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ArtifactIdentifier"));
      }
      // validate the optional field `EncryptionDisabled`
      if (jsonObj.get("EncryptionDisabled") != null && !jsonObj.get("EncryptionDisabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EncryptionDisabled"));
      }
      // validate the optional field `Location`
      if (jsonObj.get("Location") != null && !jsonObj.get("Location").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Location"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `NamespaceType`
      if (jsonObj.get("NamespaceType") != null && !jsonObj.get("NamespaceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NamespaceType"));
      }
      // validate the optional field `OverrideArtifactName`
      if (jsonObj.get("OverrideArtifactName") != null && !jsonObj.get("OverrideArtifactName").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("OverrideArtifactName"));
      }
      // validate the optional field `Packaging`
      if (jsonObj.get("Packaging") != null && !jsonObj.get("Packaging").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Packaging"));
      }
      // validate the optional field `Path`
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Path"));
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
       if (!AwsCodeBuildProjectArtifactsDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCodeBuildProjectArtifactsDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCodeBuildProjectArtifactsDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCodeBuildProjectArtifactsDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCodeBuildProjectArtifactsDetails>() {
           @Override
           public void write(JsonWriter out, AwsCodeBuildProjectArtifactsDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCodeBuildProjectArtifactsDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCodeBuildProjectArtifactsDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCodeBuildProjectArtifactsDetails
   * @throws IOException if the JSON string is invalid with respect to AwsCodeBuildProjectArtifactsDetails
   */
  public static AwsCodeBuildProjectArtifactsDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCodeBuildProjectArtifactsDetails.class);
  }

  /**
   * Convert an instance of AwsCodeBuildProjectArtifactsDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

