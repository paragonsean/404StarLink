/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ContainerServiceCurrentDeployment;
import org.openapitools.client.model.ContainerServiceLocation;
import org.openapitools.client.model.ContainerServiceNextDeployment;
import org.openapitools.client.model.ContainerServicePowerName;
import org.openapitools.client.model.ContainerServicePrivateRegistryAccess;
import org.openapitools.client.model.ContainerServiceState;
import org.openapitools.client.model.ContainerServiceStateDetail;
import org.openapitools.client.model.ResourceType;

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
 * Describes an Amazon Lightsail container service.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainerService {
  public static final String SERIALIZED_NAME_CONTAINER_SERVICE_NAME = "containerServiceName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_SERVICE_NAME)
  private String containerServiceName;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private ContainerServiceLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_POWER = "power";
  @SerializedName(SERIALIZED_NAME_POWER)
  private ContainerServicePowerName power;

  public static final String SERIALIZED_NAME_POWER_ID = "powerId";
  @SerializedName(SERIALIZED_NAME_POWER_ID)
  private String powerId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ContainerServiceState state;

  public static final String SERIALIZED_NAME_STATE_DETAIL = "stateDetail";
  @SerializedName(SERIALIZED_NAME_STATE_DETAIL)
  private ContainerServiceStateDetail stateDetail;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private Integer scale;

  public static final String SERIALIZED_NAME_CURRENT_DEPLOYMENT = "currentDeployment";
  @SerializedName(SERIALIZED_NAME_CURRENT_DEPLOYMENT)
  private ContainerServiceCurrentDeployment currentDeployment;

  public static final String SERIALIZED_NAME_NEXT_DEPLOYMENT = "nextDeployment";
  @SerializedName(SERIALIZED_NAME_NEXT_DEPLOYMENT)
  private ContainerServiceNextDeployment nextDeployment;

  public static final String SERIALIZED_NAME_IS_DISABLED = "isDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_PRINCIPAL_ARN = "principalArn";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ARN)
  private String principalArn;

  public static final String SERIALIZED_NAME_PRIVATE_DOMAIN_NAME = "privateDomainName";
  @SerializedName(SERIALIZED_NAME_PRIVATE_DOMAIN_NAME)
  private String privateDomainName;

  public static final String SERIALIZED_NAME_PUBLIC_DOMAIN_NAMES = "publicDomainNames";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DOMAIN_NAMES)
  private Map publicDomainNames;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PRIVATE_REGISTRY_ACCESS = "privateRegistryAccess";
  @SerializedName(SERIALIZED_NAME_PRIVATE_REGISTRY_ACCESS)
  private ContainerServicePrivateRegistryAccess privateRegistryAccess;

  public ContainerService() {
  }

  public ContainerService containerServiceName(String containerServiceName) {
    this.containerServiceName = containerServiceName;
    return this;
  }

  /**
   * Get containerServiceName
   * @return containerServiceName
   */
  @javax.annotation.Nullable
  public String getContainerServiceName() {
    return containerServiceName;
  }

  public void setContainerServiceName(String containerServiceName) {
    this.containerServiceName = containerServiceName;
  }


  public ContainerService arn(String arn) {
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


  public ContainerService createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ContainerService location(ContainerServiceLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public ContainerServiceLocation getLocation() {
    return location;
  }

  public void setLocation(ContainerServiceLocation location) {
    this.location = location;
  }


  public ContainerService resourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public ResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public ContainerService tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public ContainerService power(ContainerServicePowerName power) {
    this.power = power;
    return this;
  }

  /**
   * Get power
   * @return power
   */
  @javax.annotation.Nullable
  public ContainerServicePowerName getPower() {
    return power;
  }

  public void setPower(ContainerServicePowerName power) {
    this.power = power;
  }


  public ContainerService powerId(String powerId) {
    this.powerId = powerId;
    return this;
  }

  /**
   * Get powerId
   * @return powerId
   */
  @javax.annotation.Nullable
  public String getPowerId() {
    return powerId;
  }

  public void setPowerId(String powerId) {
    this.powerId = powerId;
  }


  public ContainerService state(ContainerServiceState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public ContainerServiceState getState() {
    return state;
  }

  public void setState(ContainerServiceState state) {
    this.state = state;
  }


  public ContainerService stateDetail(ContainerServiceStateDetail stateDetail) {
    this.stateDetail = stateDetail;
    return this;
  }

  /**
   * Get stateDetail
   * @return stateDetail
   */
  @javax.annotation.Nullable
  public ContainerServiceStateDetail getStateDetail() {
    return stateDetail;
  }

  public void setStateDetail(ContainerServiceStateDetail stateDetail) {
    this.stateDetail = stateDetail;
  }


  public ContainerService scale(Integer scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nullable
  public Integer getScale() {
    return scale;
  }

  public void setScale(Integer scale) {
    this.scale = scale;
  }


  public ContainerService currentDeployment(ContainerServiceCurrentDeployment currentDeployment) {
    this.currentDeployment = currentDeployment;
    return this;
  }

  /**
   * Get currentDeployment
   * @return currentDeployment
   */
  @javax.annotation.Nullable
  public ContainerServiceCurrentDeployment getCurrentDeployment() {
    return currentDeployment;
  }

  public void setCurrentDeployment(ContainerServiceCurrentDeployment currentDeployment) {
    this.currentDeployment = currentDeployment;
  }


  public ContainerService nextDeployment(ContainerServiceNextDeployment nextDeployment) {
    this.nextDeployment = nextDeployment;
    return this;
  }

  /**
   * Get nextDeployment
   * @return nextDeployment
   */
  @javax.annotation.Nullable
  public ContainerServiceNextDeployment getNextDeployment() {
    return nextDeployment;
  }

  public void setNextDeployment(ContainerServiceNextDeployment nextDeployment) {
    this.nextDeployment = nextDeployment;
  }


  public ContainerService isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Get isDisabled
   * @return isDisabled
   */
  @javax.annotation.Nullable
  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public ContainerService principalArn(String principalArn) {
    this.principalArn = principalArn;
    return this;
  }

  /**
   * Get principalArn
   * @return principalArn
   */
  @javax.annotation.Nullable
  public String getPrincipalArn() {
    return principalArn;
  }

  public void setPrincipalArn(String principalArn) {
    this.principalArn = principalArn;
  }


  public ContainerService privateDomainName(String privateDomainName) {
    this.privateDomainName = privateDomainName;
    return this;
  }

  /**
   * Get privateDomainName
   * @return privateDomainName
   */
  @javax.annotation.Nullable
  public String getPrivateDomainName() {
    return privateDomainName;
  }

  public void setPrivateDomainName(String privateDomainName) {
    this.privateDomainName = privateDomainName;
  }


  public ContainerService publicDomainNames(Map publicDomainNames) {
    this.publicDomainNames = publicDomainNames;
    return this;
  }

  /**
   * Get publicDomainNames
   * @return publicDomainNames
   */
  @javax.annotation.Nullable
  public Map getPublicDomainNames() {
    return publicDomainNames;
  }

  public void setPublicDomainNames(Map publicDomainNames) {
    this.publicDomainNames = publicDomainNames;
  }


  public ContainerService url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public ContainerService privateRegistryAccess(ContainerServicePrivateRegistryAccess privateRegistryAccess) {
    this.privateRegistryAccess = privateRegistryAccess;
    return this;
  }

  /**
   * Get privateRegistryAccess
   * @return privateRegistryAccess
   */
  @javax.annotation.Nullable
  public ContainerServicePrivateRegistryAccess getPrivateRegistryAccess() {
    return privateRegistryAccess;
  }

  public void setPrivateRegistryAccess(ContainerServicePrivateRegistryAccess privateRegistryAccess) {
    this.privateRegistryAccess = privateRegistryAccess;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerService containerService = (ContainerService) o;
    return Objects.equals(this.containerServiceName, containerService.containerServiceName) &&
        Objects.equals(this.arn, containerService.arn) &&
        Objects.equals(this.createdAt, containerService.createdAt) &&
        Objects.equals(this.location, containerService.location) &&
        Objects.equals(this.resourceType, containerService.resourceType) &&
        Objects.equals(this.tags, containerService.tags) &&
        Objects.equals(this.power, containerService.power) &&
        Objects.equals(this.powerId, containerService.powerId) &&
        Objects.equals(this.state, containerService.state) &&
        Objects.equals(this.stateDetail, containerService.stateDetail) &&
        Objects.equals(this.scale, containerService.scale) &&
        Objects.equals(this.currentDeployment, containerService.currentDeployment) &&
        Objects.equals(this.nextDeployment, containerService.nextDeployment) &&
        Objects.equals(this.isDisabled, containerService.isDisabled) &&
        Objects.equals(this.principalArn, containerService.principalArn) &&
        Objects.equals(this.privateDomainName, containerService.privateDomainName) &&
        Objects.equals(this.publicDomainNames, containerService.publicDomainNames) &&
        Objects.equals(this.url, containerService.url) &&
        Objects.equals(this.privateRegistryAccess, containerService.privateRegistryAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerServiceName, arn, createdAt, location, resourceType, tags, power, powerId, state, stateDetail, scale, currentDeployment, nextDeployment, isDisabled, principalArn, privateDomainName, publicDomainNames, url, privateRegistryAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerService {\n");
    sb.append("    containerServiceName: ").append(toIndentedString(containerServiceName)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    powerId: ").append(toIndentedString(powerId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDetail: ").append(toIndentedString(stateDetail)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    currentDeployment: ").append(toIndentedString(currentDeployment)).append("\n");
    sb.append("    nextDeployment: ").append(toIndentedString(nextDeployment)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    principalArn: ").append(toIndentedString(principalArn)).append("\n");
    sb.append("    privateDomainName: ").append(toIndentedString(privateDomainName)).append("\n");
    sb.append("    publicDomainNames: ").append(toIndentedString(publicDomainNames)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    privateRegistryAccess: ").append(toIndentedString(privateRegistryAccess)).append("\n");
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
    openapiFields.add("containerServiceName");
    openapiFields.add("arn");
    openapiFields.add("createdAt");
    openapiFields.add("location");
    openapiFields.add("resourceType");
    openapiFields.add("tags");
    openapiFields.add("power");
    openapiFields.add("powerId");
    openapiFields.add("state");
    openapiFields.add("stateDetail");
    openapiFields.add("scale");
    openapiFields.add("currentDeployment");
    openapiFields.add("nextDeployment");
    openapiFields.add("isDisabled");
    openapiFields.add("principalArn");
    openapiFields.add("privateDomainName");
    openapiFields.add("publicDomainNames");
    openapiFields.add("url");
    openapiFields.add("privateRegistryAccess");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerService
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerService.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerService is not found in the empty JSON string", ContainerService.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerService.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerService` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `containerServiceName`
      if (jsonObj.get("containerServiceName") != null && !jsonObj.get("containerServiceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("containerServiceName"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        ContainerServiceLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `power`
      if (jsonObj.get("power") != null && !jsonObj.get("power").isJsonNull()) {
        ContainerServicePowerName.validateJsonElement(jsonObj.get("power"));
      }
      // validate the optional field `powerId`
      if (jsonObj.get("powerId") != null && !jsonObj.get("powerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("powerId"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        ContainerServiceState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `stateDetail`
      if (jsonObj.get("stateDetail") != null && !jsonObj.get("stateDetail").isJsonNull()) {
        ContainerServiceStateDetail.validateJsonElement(jsonObj.get("stateDetail"));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("scale"));
      }
      // validate the optional field `currentDeployment`
      if (jsonObj.get("currentDeployment") != null && !jsonObj.get("currentDeployment").isJsonNull()) {
        ContainerServiceCurrentDeployment.validateJsonElement(jsonObj.get("currentDeployment"));
      }
      // validate the optional field `nextDeployment`
      if (jsonObj.get("nextDeployment") != null && !jsonObj.get("nextDeployment").isJsonNull()) {
        ContainerServiceNextDeployment.validateJsonElement(jsonObj.get("nextDeployment"));
      }
      // validate the optional field `isDisabled`
      if (jsonObj.get("isDisabled") != null && !jsonObj.get("isDisabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isDisabled"));
      }
      // validate the optional field `principalArn`
      if (jsonObj.get("principalArn") != null && !jsonObj.get("principalArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("principalArn"));
      }
      // validate the optional field `privateDomainName`
      if (jsonObj.get("privateDomainName") != null && !jsonObj.get("privateDomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("privateDomainName"));
      }
      // validate the optional field `publicDomainNames`
      if (jsonObj.get("publicDomainNames") != null && !jsonObj.get("publicDomainNames").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("publicDomainNames"));
      }
      // validate the optional field `url`
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("url"));
      }
      // validate the optional field `privateRegistryAccess`
      if (jsonObj.get("privateRegistryAccess") != null && !jsonObj.get("privateRegistryAccess").isJsonNull()) {
        ContainerServicePrivateRegistryAccess.validateJsonElement(jsonObj.get("privateRegistryAccess"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerService.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerService' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerService> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerService.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerService>() {
           @Override
           public void write(JsonWriter out, ContainerService value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerService read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerService given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerService
   * @throws IOException if the JSON string is invalid with respect to ContainerService
   */
  public static ContainerService fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerService.class);
  }

  /**
   * Convert an instance of ContainerService to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

