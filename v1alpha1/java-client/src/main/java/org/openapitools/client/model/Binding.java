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
import org.openapitools.client.model.Expr;

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
 * Associates &#x60;members&#x60;, or principals, with a &#x60;role&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Binding {
  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private Expr condition;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<String> members = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public Binding() {
  }

  public Binding condition(Expr condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @javax.annotation.Nullable
  public Expr getCondition() {
    return condition;
  }

  public void setCondition(Expr condition) {
    this.condition = condition;
  }


  public Binding members(List<String> members) {
    this.members = members;
    return this;
  }

  public Binding addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Specifies the principals requesting access for a Google Cloud resource. &#x60;members&#x60; can have the following values: * &#x60;allUsers&#x60;: A special identifier that represents anyone who is on the internet; with or without a Google account. * &#x60;allAuthenticatedUsers&#x60;: A special identifier that represents anyone who is authenticated with a Google account or a service account. Does not include identities that come from external identity providers (IdPs) through identity federation. * &#x60;user:{emailid}&#x60;: An email address that represents a specific Google account. For example, &#x60;alice@example.com&#x60; . * &#x60;serviceAccount:{emailid}&#x60;: An email address that represents a Google service account. For example, &#x60;my-other-app@appspot.gserviceaccount.com&#x60;. * &#x60;serviceAccount:{projectid}.svc.id.goog[{namespace}/{kubernetes-sa}]&#x60;: An identifier for a [Kubernetes service account](https://cloud.google.com/kubernetes-engine/docs/how-to/kubernetes-service-accounts). For example, &#x60;my-project.svc.id.goog[my-namespace/my-kubernetes-sa]&#x60;. * &#x60;group:{emailid}&#x60;: An email address that represents a Google group. For example, &#x60;admins@example.com&#x60;. * &#x60;domain:{domain}&#x60;: The G Suite domain (primary) that represents all the users of that domain. For example, &#x60;google.com&#x60; or &#x60;example.com&#x60;. * &#x60;deleted:user:{emailid}?uid&#x3D;{uniqueid}&#x60;: An email address (plus unique identifier) representing a user that has been recently deleted. For example, &#x60;alice@example.com?uid&#x3D;123456789012345678901&#x60;. If the user is recovered, this value reverts to &#x60;user:{emailid}&#x60; and the recovered user retains the role in the binding. * &#x60;deleted:serviceAccount:{emailid}?uid&#x3D;{uniqueid}&#x60;: An email address (plus unique identifier) representing a service account that has been recently deleted. For example, &#x60;my-other-app@appspot.gserviceaccount.com?uid&#x3D;123456789012345678901&#x60;. If the service account is undeleted, this value reverts to &#x60;serviceAccount:{emailid}&#x60; and the undeleted service account retains the role in the binding. * &#x60;deleted:group:{emailid}?uid&#x3D;{uniqueid}&#x60;: An email address (plus unique identifier) representing a Google group that has been recently deleted. For example, &#x60;admins@example.com?uid&#x3D;123456789012345678901&#x60;. If the group is recovered, this value reverts to &#x60;group:{emailid}&#x60; and the recovered group retains the role in the binding.
   * @return members
   */
  @javax.annotation.Nullable
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }


  public Binding role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role that is assigned to the list of &#x60;members&#x60;, or principals. For example, &#x60;roles/viewer&#x60;, &#x60;roles/editor&#x60;, or &#x60;roles/owner&#x60;.
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Binding binding = (Binding) o;
    return Objects.equals(this.condition, binding.condition) &&
        Objects.equals(this.members, binding.members) &&
        Objects.equals(this.role, binding.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, members, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Binding {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("condition");
    openapiFields.add("members");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Binding
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Binding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Binding is not found in the empty JSON string", Binding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Binding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Binding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `condition`
      if (jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) {
        Expr.validateJsonElement(jsonObj.get("condition"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull() && !jsonObj.get("members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Binding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Binding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Binding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Binding.class));

       return (TypeAdapter<T>) new TypeAdapter<Binding>() {
           @Override
           public void write(JsonWriter out, Binding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Binding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Binding given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Binding
   * @throws IOException if the JSON string is invalid with respect to Binding
   */
  public static Binding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Binding.class);
  }

  /**
   * Convert an instance of Binding to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

