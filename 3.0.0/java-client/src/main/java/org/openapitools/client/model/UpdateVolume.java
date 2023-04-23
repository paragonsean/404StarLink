/*
 * IBM Containers API
 * Containers are virtual software objects that include all the elements that an app needs to run. A container has the benefits of resource isolation and allocation but is more portable and efficient than, for example, a virtual machine.   This documentation describes the IBM Containers API, which is based on the Docker Remote API. The API provides endpoints that you can use to create and manage your single containers and container groups in Bluemix. Endpoints are summarized under the following tags:   - **Authentication**: Retrieve and refresh your TLS certificates.  - **Private Docker images registry**: Create your own private Docker images registry in Bluemix by setting a namespace for your organization.  - **Images**: View, build, and push your images to your private Bluemix registry so you can use them with IBM Containers. You can also scan your container images with the Vulnerability Advisor against standard policies set by the organization manager and a database of known Ubuntu issues.  - **Single Containers**: Create and manage single containers in Bluemix. Use a single container to implement short-lived processes or to run simple tests as you develop an app or service. To make your single container available from the internet, review the `Public IP addresses` endpoints.  - **Container Groups**: Create and manage your container groups in Bluemix. A container group consists of multiple single containers that are all created from the same container image and as a consequence are configured in the same way. Container groups offer further options at no cost to make your app highly available. These options include in-built load balancing, auto-recovery of unhealthy container instances, and auto-scaling of container instances based on CPU and memory usage. Map a public route to your container group to make your app accessible from the internet.   - **Public IP addresses**: Use these endpoints to request public IP addresses for your space. You can bind this IP address to your container to make your container accessible from the internet.  - **File shares**: Create, list and delete file shares in a space. A file share is a NFS storage system that hosts Docker volumes.   - **Volumes**: Create and manage container volumes in your space to persist the data of your containers.      Each API request requires an HTTP header that includes the 'X-Auth-Token’ and 'X-Auth-Project-Id’ parameter.   - **X-Auth-Token**: The JSON web token (JWT) that you receive when logging into the Bluemix platform. It allows you to use the IBM Containers REST API, access services, and resources. Run `cf oauth-token` to retrieve your access token information. - **X-Auth-Project-Id**: The unique ID of your organization space where you want to create or work with your containers. Run `cf space <space_name> --guid`, where `<space_name>` is the name of your space, to retrieve your space ID.    For further information about how containers work in the IBM Containers service, review the documentation under https://new-console.ng.bluemix.net/docs/containers/container_index.html. 
 *
 * The version of the OpenAPI document: 3.0.0
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
 * UpdateVolume
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:21.112823-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateVolume {
  public static final String SERIALIZED_NAME_ADD_SPACES = "addSpaces";
  @SerializedName(SERIALIZED_NAME_ADD_SPACES)
  private List<String> addSpaces = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOVE_SPACES = "removeSpaces";
  @SerializedName(SERIALIZED_NAME_REMOVE_SPACES)
  private List<String> removeSpaces = new ArrayList<>();

  public UpdateVolume() {
  }

  public UpdateVolume addSpaces(List<String> addSpaces) {
    this.addSpaces = addSpaces;
    return this;
  }

  public UpdateVolume addAddSpacesItem(String addSpacesItem) {
    if (this.addSpaces == null) {
      this.addSpaces = new ArrayList<>();
    }
    this.addSpaces.add(addSpacesItem);
    return this;
  }

  /**
   * The name or ID of the space where you want to provision your existing volume. Run &#x60;cf spaces&#x60; to retrieve the name, or &#x60;cf space &lt;space_name&gt; --guid&#x60; to retrieve the space ID. 
   * @return addSpaces
   */
  @javax.annotation.Nullable
  public List<String> getAddSpaces() {
    return addSpaces;
  }

  public void setAddSpaces(List<String> addSpaces) {
    this.addSpaces = addSpaces;
  }


  public UpdateVolume removeSpaces(List<String> removeSpaces) {
    this.removeSpaces = removeSpaces;
    return this;
  }

  public UpdateVolume addRemoveSpacesItem(String removeSpacesItem) {
    if (this.removeSpaces == null) {
      this.removeSpaces = new ArrayList<>();
    }
    this.removeSpaces.add(removeSpacesItem);
    return this;
  }

  /**
   * The name or ID of the space from which you want to unprovision your existing volume. Run &#x60;cf spaces&#x60; to retrieve the name, or &#x60;cf space &lt;space_name&gt; --guid&#x60; to retrieve the space ID.
   * @return removeSpaces
   */
  @javax.annotation.Nullable
  public List<String> getRemoveSpaces() {
    return removeSpaces;
  }

  public void setRemoveSpaces(List<String> removeSpaces) {
    this.removeSpaces = removeSpaces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVolume updateVolume = (UpdateVolume) o;
    return Objects.equals(this.addSpaces, updateVolume.addSpaces) &&
        Objects.equals(this.removeSpaces, updateVolume.removeSpaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addSpaces, removeSpaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVolume {\n");
    sb.append("    addSpaces: ").append(toIndentedString(addSpaces)).append("\n");
    sb.append("    removeSpaces: ").append(toIndentedString(removeSpaces)).append("\n");
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
    openapiFields.add("addSpaces");
    openapiFields.add("removeSpaces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateVolume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateVolume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVolume is not found in the empty JSON string", UpdateVolume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateVolume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVolume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("addSpaces") != null && !jsonObj.get("addSpaces").isJsonNull() && !jsonObj.get("addSpaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addSpaces` to be an array in the JSON string but got `%s`", jsonObj.get("addSpaces").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("removeSpaces") != null && !jsonObj.get("removeSpaces").isJsonNull() && !jsonObj.get("removeSpaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `removeSpaces` to be an array in the JSON string but got `%s`", jsonObj.get("removeSpaces").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVolume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVolume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVolume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVolume.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVolume>() {
           @Override
           public void write(JsonWriter out, UpdateVolume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVolume read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateVolume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateVolume
   * @throws IOException if the JSON string is invalid with respect to UpdateVolume
   */
  public static UpdateVolume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVolume.class);
  }

  /**
   * Convert an instance of UpdateVolume to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

