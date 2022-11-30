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
 * Information about an Amazon ECR image.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcrContainerImageDetails {
  public static final String SERIALIZED_NAME_REGISTRY_ID = "RegistryId";
  @SerializedName(SERIALIZED_NAME_REGISTRY_ID)
  private String registryId;

  public static final String SERIALIZED_NAME_REPOSITORY_NAME = "RepositoryName";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_NAME)
  private String repositoryName;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "Architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_IMAGE_DIGEST = "ImageDigest";
  @SerializedName(SERIALIZED_NAME_IMAGE_DIGEST)
  private String imageDigest;

  public static final String SERIALIZED_NAME_IMAGE_TAGS = "ImageTags";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAGS)
  private List imageTags;

  public static final String SERIALIZED_NAME_IMAGE_PUBLISHED_AT = "ImagePublishedAt";
  @SerializedName(SERIALIZED_NAME_IMAGE_PUBLISHED_AT)
  private String imagePublishedAt;

  public AwsEcrContainerImageDetails() {
  }

  public AwsEcrContainerImageDetails registryId(String registryId) {
    this.registryId = registryId;
    return this;
  }

  /**
   * Get registryId
   * @return registryId
   */
  @javax.annotation.Nullable
  public String getRegistryId() {
    return registryId;
  }

  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }


  public AwsEcrContainerImageDetails repositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

  /**
   * Get repositoryName
   * @return repositoryName
   */
  @javax.annotation.Nullable
  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }


  public AwsEcrContainerImageDetails architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   */
  @javax.annotation.Nullable
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public AwsEcrContainerImageDetails imageDigest(String imageDigest) {
    this.imageDigest = imageDigest;
    return this;
  }

  /**
   * Get imageDigest
   * @return imageDigest
   */
  @javax.annotation.Nullable
  public String getImageDigest() {
    return imageDigest;
  }

  public void setImageDigest(String imageDigest) {
    this.imageDigest = imageDigest;
  }


  public AwsEcrContainerImageDetails imageTags(List imageTags) {
    this.imageTags = imageTags;
    return this;
  }

  /**
   * Get imageTags
   * @return imageTags
   */
  @javax.annotation.Nullable
  public List getImageTags() {
    return imageTags;
  }

  public void setImageTags(List imageTags) {
    this.imageTags = imageTags;
  }


  public AwsEcrContainerImageDetails imagePublishedAt(String imagePublishedAt) {
    this.imagePublishedAt = imagePublishedAt;
    return this;
  }

  /**
   * Get imagePublishedAt
   * @return imagePublishedAt
   */
  @javax.annotation.Nullable
  public String getImagePublishedAt() {
    return imagePublishedAt;
  }

  public void setImagePublishedAt(String imagePublishedAt) {
    this.imagePublishedAt = imagePublishedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcrContainerImageDetails awsEcrContainerImageDetails = (AwsEcrContainerImageDetails) o;
    return Objects.equals(this.registryId, awsEcrContainerImageDetails.registryId) &&
        Objects.equals(this.repositoryName, awsEcrContainerImageDetails.repositoryName) &&
        Objects.equals(this.architecture, awsEcrContainerImageDetails.architecture) &&
        Objects.equals(this.imageDigest, awsEcrContainerImageDetails.imageDigest) &&
        Objects.equals(this.imageTags, awsEcrContainerImageDetails.imageTags) &&
        Objects.equals(this.imagePublishedAt, awsEcrContainerImageDetails.imagePublishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryId, repositoryName, architecture, imageDigest, imageTags, imagePublishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcrContainerImageDetails {\n");
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    imagePublishedAt: ").append(toIndentedString(imagePublishedAt)).append("\n");
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
    openapiFields.add("RegistryId");
    openapiFields.add("RepositoryName");
    openapiFields.add("Architecture");
    openapiFields.add("ImageDigest");
    openapiFields.add("ImageTags");
    openapiFields.add("ImagePublishedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcrContainerImageDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcrContainerImageDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcrContainerImageDetails is not found in the empty JSON string", AwsEcrContainerImageDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcrContainerImageDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcrContainerImageDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `RegistryId`
      if (jsonObj.get("RegistryId") != null && !jsonObj.get("RegistryId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RegistryId"));
      }
      // validate the optional field `RepositoryName`
      if (jsonObj.get("RepositoryName") != null && !jsonObj.get("RepositoryName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RepositoryName"));
      }
      // validate the optional field `Architecture`
      if (jsonObj.get("Architecture") != null && !jsonObj.get("Architecture").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Architecture"));
      }
      // validate the optional field `ImageDigest`
      if (jsonObj.get("ImageDigest") != null && !jsonObj.get("ImageDigest").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImageDigest"));
      }
      // validate the optional field `ImageTags`
      if (jsonObj.get("ImageTags") != null && !jsonObj.get("ImageTags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ImageTags"));
      }
      // validate the optional field `ImagePublishedAt`
      if (jsonObj.get("ImagePublishedAt") != null && !jsonObj.get("ImagePublishedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImagePublishedAt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcrContainerImageDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcrContainerImageDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcrContainerImageDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcrContainerImageDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcrContainerImageDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcrContainerImageDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcrContainerImageDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcrContainerImageDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcrContainerImageDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcrContainerImageDetails
   */
  public static AwsEcrContainerImageDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcrContainerImageDetails.class);
  }

  /**
   * Convert an instance of AwsEcrContainerImageDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

