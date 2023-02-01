/*
 * Notebooks API
 * Notebooks API is used to manage notebook resources in Google Cloud.
 *
 * The version of the OpenAPI document: v2
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
import org.openapitools.client.model.Binding;

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
 * An Identity and Access Management (IAM) policy, which specifies access controls for Google Cloud resources. A &#x60;Policy&#x60; is a collection of &#x60;bindings&#x60;. A &#x60;binding&#x60; binds one or more &#x60;members&#x60;, or principals, to a single &#x60;role&#x60;. Principals can be user accounts, service accounts, Google groups, and domains (such as G Suite). A &#x60;role&#x60; is a named list of permissions; each &#x60;role&#x60; can be an IAM predefined role or a user-created custom role. For some types of Google Cloud resources, a &#x60;binding&#x60; can also specify a &#x60;condition&#x60;, which is a logical expression that allows access to a resource only if the expression evaluates to &#x60;true&#x60;. A condition can add constraints based on attributes of the request, the resource, or both. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies). **JSON example:** { \&quot;bindings\&quot;: [ { \&quot;role\&quot;: \&quot;roles/resourcemanager.organizationAdmin\&quot;, \&quot;members\&quot;: [ \&quot;user:mike@example.com\&quot;, \&quot;group:admins@example.com\&quot;, \&quot;domain:google.com\&quot;, \&quot;serviceAccount:my-project-id@appspot.gserviceaccount.com\&quot; ] }, { \&quot;role\&quot;: \&quot;roles/resourcemanager.organizationViewer\&quot;, \&quot;members\&quot;: [ \&quot;user:eve@example.com\&quot; ], \&quot;condition\&quot;: { \&quot;title\&quot;: \&quot;expirable access\&quot;, \&quot;description\&quot;: \&quot;Does not grant access after Sep 2020\&quot;, \&quot;expression\&quot;: \&quot;request.time &lt; timestamp(&#39;2020-10-01T00:00:00.000Z&#39;)\&quot;, } } ], \&quot;etag\&quot;: \&quot;BwWWja0YfJA&#x3D;\&quot;, \&quot;version\&quot;: 3 } **YAML example:** bindings: - members: - user:mike@example.com - group:admins@example.com - domain:google.com - serviceAccount:my-project-id@appspot.gserviceaccount.com role: roles/resourcemanager.organizationAdmin - members: - user:eve@example.com role: roles/resourcemanager.organizationViewer condition: title: expirable access description: Does not grant access after Sep 2020 expression: request.time &lt; timestamp(&#39;2020-10-01T00:00:00.000Z&#39;) etag: BwWWja0YfJA&#x3D; version: 3 For a description of IAM and its features, see the [IAM documentation](https://cloud.google.com/iam/docs/).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:16.064664-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Policy {
  public static final String SERIALIZED_NAME_BINDINGS = "bindings";
  @SerializedName(SERIALIZED_NAME_BINDINGS)
  private List<Binding> bindings = new ArrayList<>();

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private byte[] etag;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public Policy() {
  }

  public Policy bindings(List<Binding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Policy addBindingsItem(Binding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<>();
    }
    this.bindings.add(bindingsItem);
    return this;
  }

  /**
   * Associates a list of &#x60;members&#x60;, or principals, with a &#x60;role&#x60;. Optionally, may specify a &#x60;condition&#x60; that determines how and when the &#x60;bindings&#x60; are applied. Each of the &#x60;bindings&#x60; must contain at least one principal. The &#x60;bindings&#x60; in a &#x60;Policy&#x60; can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the &#x60;bindings&#x60; grant 50 different roles to &#x60;user:alice@example.com&#x60;, and not to any other principal, then you can add another 1,450 principals to the &#x60;bindings&#x60; in the &#x60;Policy&#x60;.
   * @return bindings
   */
  @javax.annotation.Nullable
  public List<Binding> getBindings() {
    return bindings;
  }

  public void setBindings(List<Binding> bindings) {
    this.bindings = bindings;
  }


  public Policy etag(byte[] etag) {
    this.etag = etag;
    return this;
  }

  /**
   * &#x60;etag&#x60; is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the &#x60;etag&#x60; in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An &#x60;etag&#x60; is returned in the response to &#x60;getIamPolicy&#x60;, and systems are expected to put that etag in the request to &#x60;setIamPolicy&#x60; to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the &#x60;etag&#x60; field whenever you call &#x60;setIamPolicy&#x60;. If you omit this field, then IAM allows you to overwrite a version &#x60;3&#x60; policy with a version &#x60;1&#x60; policy, and all of the conditions in the version &#x60;3&#x60; policy are lost.
   * @return etag
   */
  @javax.annotation.Nullable
  public byte[] getEtag() {
    return etag;
  }

  public void setEtag(byte[] etag) {
    this.etag = etag;
  }


  public Policy version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Specifies the format of the policy. Valid values are &#x60;0&#x60;, &#x60;1&#x60;, and &#x60;3&#x60;. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version &#x60;3&#x60;. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the &#x60;etag&#x60; field whenever you call &#x60;setIamPolicy&#x60;. If you omit this field, then IAM allows you to overwrite a version &#x60;3&#x60; policy with a version &#x60;1&#x60; policy, and all of the conditions in the version &#x60;3&#x60; policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.bindings, policy.bindings) &&
        Arrays.equals(this.etag, policy.etag) &&
        Objects.equals(this.version, policy.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings, Arrays.hashCode(etag), version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("bindings");
    openapiFields.add("etag");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Policy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policy is not found in the empty JSON string", Policy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("bindings") != null && !jsonObj.get("bindings").isJsonNull()) {
        JsonArray jsonArraybindings = jsonObj.getAsJsonArray("bindings");
        if (jsonArraybindings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bindings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bindings` to be an array in the JSON string but got `%s`", jsonObj.get("bindings").toString()));
          }

          // validate the optional field `bindings` (array)
          for (int i = 0; i < jsonArraybindings.size(); i++) {
            Binding.validateJsonElement(jsonArraybindings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policy.class));

       return (TypeAdapter<T>) new TypeAdapter<Policy>() {
           @Override
           public void write(JsonWriter out, Policy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Policy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Policy
   * @throws IOException if the JSON string is invalid with respect to Policy
   */
  public static Policy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policy.class);
  }

  /**
   * Convert an instance of Policy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

