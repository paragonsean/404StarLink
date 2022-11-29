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
 * ResourceDetailsContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsContainer {
  public static final String SERIALIZED_NAME_CONTAINER_RUNTIME = "ContainerRuntime";
  @SerializedName(SERIALIZED_NAME_CONTAINER_RUNTIME)
  private String containerRuntime;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IMAGE_ID = "ImageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "ImageName";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_LAUNCHED_AT = "LaunchedAt";
  @SerializedName(SERIALIZED_NAME_LAUNCHED_AT)
  private String launchedAt;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "VolumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List volumeMounts;

  public static final String SERIALIZED_NAME_PRIVILEGED = "Privileged";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  private Boolean privileged;

  public ResourceDetailsContainer() {
  }

  public ResourceDetailsContainer containerRuntime(String containerRuntime) {
    this.containerRuntime = containerRuntime;
    return this;
  }

  /**
   * Get containerRuntime
   * @return containerRuntime
   */
  @javax.annotation.Nullable
  public String getContainerRuntime() {
    return containerRuntime;
  }

  public void setContainerRuntime(String containerRuntime) {
    this.containerRuntime = containerRuntime;
  }


  public ResourceDetailsContainer name(String name) {
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


  public ResourceDetailsContainer imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
   */
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public ResourceDetailsContainer imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Get imageName
   * @return imageName
   */
  @javax.annotation.Nullable
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public ResourceDetailsContainer launchedAt(String launchedAt) {
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


  public ResourceDetailsContainer volumeMounts(List volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  /**
   * Get volumeMounts
   * @return volumeMounts
   */
  @javax.annotation.Nullable
  public List getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public ResourceDetailsContainer privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Get privileged
   * @return privileged
   */
  @javax.annotation.Nullable
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsContainer resourceDetailsContainer = (ResourceDetailsContainer) o;
    return Objects.equals(this.containerRuntime, resourceDetailsContainer.containerRuntime) &&
        Objects.equals(this.name, resourceDetailsContainer.name) &&
        Objects.equals(this.imageId, resourceDetailsContainer.imageId) &&
        Objects.equals(this.imageName, resourceDetailsContainer.imageName) &&
        Objects.equals(this.launchedAt, resourceDetailsContainer.launchedAt) &&
        Objects.equals(this.volumeMounts, resourceDetailsContainer.volumeMounts) &&
        Objects.equals(this.privileged, resourceDetailsContainer.privileged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerRuntime, name, imageId, imageName, launchedAt, volumeMounts, privileged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsContainer {\n");
    sb.append("    containerRuntime: ").append(toIndentedString(containerRuntime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    launchedAt: ").append(toIndentedString(launchedAt)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
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
    openapiFields.add("ContainerRuntime");
    openapiFields.add("Name");
    openapiFields.add("ImageId");
    openapiFields.add("ImageName");
    openapiFields.add("LaunchedAt");
    openapiFields.add("VolumeMounts");
    openapiFields.add("Privileged");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsContainer is not found in the empty JSON string", ResourceDetailsContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ContainerRuntime`
      if (jsonObj.get("ContainerRuntime") != null && !jsonObj.get("ContainerRuntime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ContainerRuntime"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `ImageId`
      if (jsonObj.get("ImageId") != null && !jsonObj.get("ImageId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImageId"));
      }
      // validate the optional field `ImageName`
      if (jsonObj.get("ImageName") != null && !jsonObj.get("ImageName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImageName"));
      }
      // validate the optional field `LaunchedAt`
      if (jsonObj.get("LaunchedAt") != null && !jsonObj.get("LaunchedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchedAt"));
      }
      // validate the optional field `VolumeMounts`
      if (jsonObj.get("VolumeMounts") != null && !jsonObj.get("VolumeMounts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("VolumeMounts"));
      }
      // validate the optional field `Privileged`
      if (jsonObj.get("Privileged") != null && !jsonObj.get("Privileged").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Privileged"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsContainer>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsContainer
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsContainer
   */
  public static ResourceDetailsContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsContainer.class);
  }

  /**
   * Convert an instance of ResourceDetailsContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

