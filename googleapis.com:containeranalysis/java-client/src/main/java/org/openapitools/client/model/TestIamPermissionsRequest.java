/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
 * Request message for &#x60;TestIamPermissions&#x60; method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TestIamPermissionsRequest {
  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = new ArrayList<>();

  public TestIamPermissionsRequest() {
  }

  public TestIamPermissionsRequest permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public TestIamPermissionsRequest addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * The set of permissions to check for the &#x60;resource&#x60;. Permissions with wildcards (such as &#x60;*&#x60; or &#x60;storage.*&#x60;) are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @return permissions
   */
  @javax.annotation.Nullable
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestIamPermissionsRequest testIamPermissionsRequest = (TestIamPermissionsRequest) o;
    return Objects.equals(this.permissions, testIamPermissionsRequest.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestIamPermissionsRequest {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestIamPermissionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestIamPermissionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestIamPermissionsRequest is not found in the empty JSON string", TestIamPermissionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestIamPermissionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestIamPermissionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull() && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestIamPermissionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestIamPermissionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestIamPermissionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestIamPermissionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TestIamPermissionsRequest>() {
           @Override
           public void write(JsonWriter out, TestIamPermissionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestIamPermissionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestIamPermissionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestIamPermissionsRequest
   * @throws IOException if the JSON string is invalid with respect to TestIamPermissionsRequest
   */
  public static TestIamPermissionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestIamPermissionsRequest.class);
  }

  /**
   * Convert an instance of TestIamPermissionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

