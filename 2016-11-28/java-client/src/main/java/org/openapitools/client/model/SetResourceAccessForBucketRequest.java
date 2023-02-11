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
import org.openapitools.client.model.ResourceBucketAccess;

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
 * SetResourceAccessForBucketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SetResourceAccessForBucketRequest {
  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucketName";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  private String bucketName;

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private ResourceBucketAccess access;

  public SetResourceAccessForBucketRequest() {
  }

  public SetResourceAccessForBucketRequest resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   */
  @javax.annotation.Nonnull
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public SetResourceAccessForBucketRequest bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Get bucketName
   * @return bucketName
   */
  @javax.annotation.Nonnull
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  public SetResourceAccessForBucketRequest access(ResourceBucketAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nonnull
  public ResourceBucketAccess getAccess() {
    return access;
  }

  public void setAccess(ResourceBucketAccess access) {
    this.access = access;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetResourceAccessForBucketRequest setResourceAccessForBucketRequest = (SetResourceAccessForBucketRequest) o;
    return Objects.equals(this.resourceName, setResourceAccessForBucketRequest.resourceName) &&
        Objects.equals(this.bucketName, setResourceAccessForBucketRequest.bucketName) &&
        Objects.equals(this.access, setResourceAccessForBucketRequest.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, bucketName, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetResourceAccessForBucketRequest {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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
    openapiFields.add("resourceName");
    openapiFields.add("bucketName");
    openapiFields.add("access");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceName");
    openapiRequiredFields.add("bucketName");
    openapiRequiredFields.add("access");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SetResourceAccessForBucketRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetResourceAccessForBucketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetResourceAccessForBucketRequest is not found in the empty JSON string", SetResourceAccessForBucketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetResourceAccessForBucketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetResourceAccessForBucketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetResourceAccessForBucketRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `resourceName`
      String.validateJsonElement(jsonObj.get("resourceName"));
      // validate the required field `bucketName`
      String.validateJsonElement(jsonObj.get("bucketName"));
      // validate the required field `access`
      ResourceBucketAccess.validateJsonElement(jsonObj.get("access"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetResourceAccessForBucketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetResourceAccessForBucketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetResourceAccessForBucketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetResourceAccessForBucketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetResourceAccessForBucketRequest>() {
           @Override
           public void write(JsonWriter out, SetResourceAccessForBucketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetResourceAccessForBucketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SetResourceAccessForBucketRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetResourceAccessForBucketRequest
   * @throws IOException if the JSON string is invalid with respect to SetResourceAccessForBucketRequest
   */
  public static SetResourceAccessForBucketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetResourceAccessForBucketRequest.class);
  }

  /**
   * Convert an instance of SetResourceAccessForBucketRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

