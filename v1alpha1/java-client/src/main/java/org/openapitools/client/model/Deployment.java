/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1alpha1
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
 * The period during which some deployable was active in a runtime.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Deployment {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private String config;

  public static final String SERIALIZED_NAME_DEPLOY_TIME = "deployTime";
  @SerializedName(SERIALIZED_NAME_DEPLOY_TIME)
  private String deployTime;

  /**
   * Platform hosting this deployment.
   */
  @JsonAdapter(PlatformEnum.Adapter.class)
  public enum PlatformEnum {
    PLATFORM_UNSPECIFIED("PLATFORM_UNSPECIFIED"),
    
    GKE("GKE"),
    
    FLEX("FLEX"),
    
    CUSTOM("CUSTOM");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlatformEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PlatformEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private PlatformEnum platform;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private List<String> resourceUri = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNDEPLOY_TIME = "undeployTime";
  @SerializedName(SERIALIZED_NAME_UNDEPLOY_TIME)
  private String undeployTime;

  public static final String SERIALIZED_NAME_USER_EMAIL = "userEmail";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public Deployment() {
  }

  public Deployment address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of the runtime element hosting this deployment.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Deployment config(String config) {
    this.config = config;
    return this;
  }

  /**
   * Configuration used to create this deployment.
   * @return config
   */
  @javax.annotation.Nullable
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }


  public Deployment deployTime(String deployTime) {
    this.deployTime = deployTime;
    return this;
  }

  /**
   * Beginning of the lifetime of this deployment.
   * @return deployTime
   */
  @javax.annotation.Nullable
  public String getDeployTime() {
    return deployTime;
  }

  public void setDeployTime(String deployTime) {
    this.deployTime = deployTime;
  }


  public Deployment platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Platform hosting this deployment.
   * @return platform
   */
  @javax.annotation.Nullable
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  public Deployment resourceUri(List<String> resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  public Deployment addResourceUriItem(String resourceUriItem) {
    if (this.resourceUri == null) {
      this.resourceUri = new ArrayList<>();
    }
    this.resourceUri.add(resourceUriItem);
    return this;
  }

  /**
   * Resource URI for the artifact being deployed taken from the deployable field with the same name.
   * @return resourceUri
   */
  @javax.annotation.Nullable
  public List<String> getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(List<String> resourceUri) {
    this.resourceUri = resourceUri;
  }


  public Deployment undeployTime(String undeployTime) {
    this.undeployTime = undeployTime;
    return this;
  }

  /**
   * End of the lifetime of this deployment.
   * @return undeployTime
   */
  @javax.annotation.Nullable
  public String getUndeployTime() {
    return undeployTime;
  }

  public void setUndeployTime(String undeployTime) {
    this.undeployTime = undeployTime;
  }


  public Deployment userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Identity of the user that triggered this deployment.
   * @return userEmail
   */
  @javax.annotation.Nullable
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    return Objects.equals(this.address, deployment.address) &&
        Objects.equals(this.config, deployment.config) &&
        Objects.equals(this.deployTime, deployment.deployTime) &&
        Objects.equals(this.platform, deployment.platform) &&
        Objects.equals(this.resourceUri, deployment.resourceUri) &&
        Objects.equals(this.undeployTime, deployment.undeployTime) &&
        Objects.equals(this.userEmail, deployment.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, config, deployTime, platform, resourceUri, undeployTime, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    deployTime: ").append(toIndentedString(deployTime)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    undeployTime: ").append(toIndentedString(undeployTime)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("config");
    openapiFields.add("deployTime");
    openapiFields.add("platform");
    openapiFields.add("resourceUri");
    openapiFields.add("undeployTime");
    openapiFields.add("userEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Deployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Deployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Deployment is not found in the empty JSON string", Deployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Deployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Deployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) && !jsonObj.get("config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config").toString()));
      }
      if ((jsonObj.get("deployTime") != null && !jsonObj.get("deployTime").isJsonNull()) && !jsonObj.get("deployTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployTime").toString()));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      // validate the optional field `platform`
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) {
        PlatformEnum.validateJsonElement(jsonObj.get("platform"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resourceUri") != null && !jsonObj.get("resourceUri").isJsonNull() && !jsonObj.get("resourceUri").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceUri` to be an array in the JSON string but got `%s`", jsonObj.get("resourceUri").toString()));
      }
      if ((jsonObj.get("undeployTime") != null && !jsonObj.get("undeployTime").isJsonNull()) && !jsonObj.get("undeployTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `undeployTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("undeployTime").toString()));
      }
      if ((jsonObj.get("userEmail") != null && !jsonObj.get("userEmail").isJsonNull()) && !jsonObj.get("userEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userEmail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Deployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Deployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Deployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Deployment.class));

       return (TypeAdapter<T>) new TypeAdapter<Deployment>() {
           @Override
           public void write(JsonWriter out, Deployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Deployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Deployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Deployment
   * @throws IOException if the JSON string is invalid with respect to Deployment
   */
  public static Deployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Deployment.class);
  }

  /**
   * Convert an instance of Deployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

