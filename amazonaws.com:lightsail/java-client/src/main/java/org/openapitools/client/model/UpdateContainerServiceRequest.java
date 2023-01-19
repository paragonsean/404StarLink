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
import java.util.Arrays;
import java.util.Map;
import org.openapitools.client.model.ContainerServicePowerName;
import org.openapitools.client.model.CreateContainerServiceRequestPrivateRegistryAccess;

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
 * UpdateContainerServiceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateContainerServiceRequest {
  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_POWER = "power";
  @SerializedName(SERIALIZED_NAME_POWER)
  private ContainerServicePowerName power;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private Integer scale;

  public static final String SERIALIZED_NAME_IS_DISABLED = "isDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_PUBLIC_DOMAIN_NAMES = "publicDomainNames";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DOMAIN_NAMES)
  private Map publicDomainNames;

  public static final String SERIALIZED_NAME_PRIVATE_REGISTRY_ACCESS = "privateRegistryAccess";
  @SerializedName(SERIALIZED_NAME_PRIVATE_REGISTRY_ACCESS)
  private CreateContainerServiceRequestPrivateRegistryAccess privateRegistryAccess;

  public UpdateContainerServiceRequest() {
  }

  public UpdateContainerServiceRequest serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @javax.annotation.Nonnull
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public UpdateContainerServiceRequest power(ContainerServicePowerName power) {
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


  public UpdateContainerServiceRequest scale(Integer scale) {
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


  public UpdateContainerServiceRequest isDisabled(Boolean isDisabled) {
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


  public UpdateContainerServiceRequest publicDomainNames(Map publicDomainNames) {
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


  public UpdateContainerServiceRequest privateRegistryAccess(CreateContainerServiceRequestPrivateRegistryAccess privateRegistryAccess) {
    this.privateRegistryAccess = privateRegistryAccess;
    return this;
  }

  /**
   * Get privateRegistryAccess
   * @return privateRegistryAccess
   */
  @javax.annotation.Nullable
  public CreateContainerServiceRequestPrivateRegistryAccess getPrivateRegistryAccess() {
    return privateRegistryAccess;
  }

  public void setPrivateRegistryAccess(CreateContainerServiceRequestPrivateRegistryAccess privateRegistryAccess) {
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
    UpdateContainerServiceRequest updateContainerServiceRequest = (UpdateContainerServiceRequest) o;
    return Objects.equals(this.serviceName, updateContainerServiceRequest.serviceName) &&
        Objects.equals(this.power, updateContainerServiceRequest.power) &&
        Objects.equals(this.scale, updateContainerServiceRequest.scale) &&
        Objects.equals(this.isDisabled, updateContainerServiceRequest.isDisabled) &&
        Objects.equals(this.publicDomainNames, updateContainerServiceRequest.publicDomainNames) &&
        Objects.equals(this.privateRegistryAccess, updateContainerServiceRequest.privateRegistryAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, power, scale, isDisabled, publicDomainNames, privateRegistryAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContainerServiceRequest {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    publicDomainNames: ").append(toIndentedString(publicDomainNames)).append("\n");
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
    openapiFields.add("serviceName");
    openapiFields.add("power");
    openapiFields.add("scale");
    openapiFields.add("isDisabled");
    openapiFields.add("publicDomainNames");
    openapiFields.add("privateRegistryAccess");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("serviceName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateContainerServiceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateContainerServiceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateContainerServiceRequest is not found in the empty JSON string", UpdateContainerServiceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateContainerServiceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateContainerServiceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateContainerServiceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `serviceName`
      String.validateJsonElement(jsonObj.get("serviceName"));
      // validate the optional field `power`
      if (jsonObj.get("power") != null && !jsonObj.get("power").isJsonNull()) {
        ContainerServicePowerName.validateJsonElement(jsonObj.get("power"));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("scale"));
      }
      // validate the optional field `isDisabled`
      if (jsonObj.get("isDisabled") != null && !jsonObj.get("isDisabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isDisabled"));
      }
      // validate the optional field `publicDomainNames`
      if (jsonObj.get("publicDomainNames") != null && !jsonObj.get("publicDomainNames").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("publicDomainNames"));
      }
      // validate the optional field `privateRegistryAccess`
      if (jsonObj.get("privateRegistryAccess") != null && !jsonObj.get("privateRegistryAccess").isJsonNull()) {
        CreateContainerServiceRequestPrivateRegistryAccess.validateJsonElement(jsonObj.get("privateRegistryAccess"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateContainerServiceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateContainerServiceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateContainerServiceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateContainerServiceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateContainerServiceRequest>() {
           @Override
           public void write(JsonWriter out, UpdateContainerServiceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateContainerServiceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateContainerServiceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateContainerServiceRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateContainerServiceRequest
   */
  public static UpdateContainerServiceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateContainerServiceRequest.class);
  }

  /**
   * Convert an instance of UpdateContainerServiceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

