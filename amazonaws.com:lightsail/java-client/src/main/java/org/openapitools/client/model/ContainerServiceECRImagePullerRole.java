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
 * &lt;p&gt;Describes the activation status of the role that you can use to grant an Amazon Lightsail container service access to Amazon Elastic Container Registry (Amazon ECR) private repositories.&lt;/p&gt; &lt;p&gt;When activated, Lightsail creates an Identity and Access Management (IAM) role for the specified Lightsail container service. You can use the ARN of the role to create a trust relationship between your Lightsail container service and an Amazon ECR private repository in your Amazon Web Services account. This allows your container service to pull images from Amazon ECR private repositories. For more information, see &lt;a href&#x3D;\&quot;https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-container-service-ecr-private-repo-access\&quot;&gt;Configuring access to an Amazon ECR private repository for an Amazon Lightsail container service&lt;/a&gt; in the &lt;i&gt;Amazon Lightsail Developer Guide&lt;/i&gt;.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainerServiceECRImagePullerRole {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_PRINCIPAL_ARN = "principalArn";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ARN)
  private String principalArn;

  public ContainerServiceECRImagePullerRole() {
  }

  public ContainerServiceECRImagePullerRole isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ContainerServiceECRImagePullerRole principalArn(String principalArn) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerServiceECRImagePullerRole containerServiceECRImagePullerRole = (ContainerServiceECRImagePullerRole) o;
    return Objects.equals(this.isActive, containerServiceECRImagePullerRole.isActive) &&
        Objects.equals(this.principalArn, containerServiceECRImagePullerRole.principalArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, principalArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerServiceECRImagePullerRole {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    principalArn: ").append(toIndentedString(principalArn)).append("\n");
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
    openapiFields.add("isActive");
    openapiFields.add("principalArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerServiceECRImagePullerRole
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerServiceECRImagePullerRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerServiceECRImagePullerRole is not found in the empty JSON string", ContainerServiceECRImagePullerRole.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerServiceECRImagePullerRole.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerServiceECRImagePullerRole` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `isActive`
      if (jsonObj.get("isActive") != null && !jsonObj.get("isActive").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isActive"));
      }
      // validate the optional field `principalArn`
      if (jsonObj.get("principalArn") != null && !jsonObj.get("principalArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("principalArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerServiceECRImagePullerRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerServiceECRImagePullerRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerServiceECRImagePullerRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerServiceECRImagePullerRole.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerServiceECRImagePullerRole>() {
           @Override
           public void write(JsonWriter out, ContainerServiceECRImagePullerRole value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerServiceECRImagePullerRole read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerServiceECRImagePullerRole given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerServiceECRImagePullerRole
   * @throws IOException if the JSON string is invalid with respect to ContainerServiceECRImagePullerRole
   */
  public static ContainerServiceECRImagePullerRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerServiceECRImagePullerRole.class);
  }

  /**
   * Convert an instance of ContainerServiceECRImagePullerRole to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

