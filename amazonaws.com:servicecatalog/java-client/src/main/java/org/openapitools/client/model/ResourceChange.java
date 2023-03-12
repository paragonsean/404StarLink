/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import org.openapitools.client.model.ChangeAction;
import org.openapitools.client.model.Replacement;

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
 * Information about a resource change that will occur when a plan is executed.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceChange {
  public static final String SERIALIZED_NAME_ACTION = "Action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ChangeAction action;

  public static final String SERIALIZED_NAME_LOGICAL_RESOURCE_ID = "LogicalResourceId";
  @SerializedName(SERIALIZED_NAME_LOGICAL_RESOURCE_ID)
  private String logicalResourceId;

  public static final String SERIALIZED_NAME_PHYSICAL_RESOURCE_ID = "PhysicalResourceId";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_RESOURCE_ID)
  private String physicalResourceId;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "ResourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_REPLACEMENT = "Replacement";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT)
  private Replacement replacement;

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List scope;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List details;

  public ResourceChange() {
  }

  public ResourceChange action(ChangeAction action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  public ChangeAction getAction() {
    return action;
  }

  public void setAction(ChangeAction action) {
    this.action = action;
  }


  public ResourceChange logicalResourceId(String logicalResourceId) {
    this.logicalResourceId = logicalResourceId;
    return this;
  }

  /**
   * Get logicalResourceId
   * @return logicalResourceId
   */
  @javax.annotation.Nullable
  public String getLogicalResourceId() {
    return logicalResourceId;
  }

  public void setLogicalResourceId(String logicalResourceId) {
    this.logicalResourceId = logicalResourceId;
  }


  public ResourceChange physicalResourceId(String physicalResourceId) {
    this.physicalResourceId = physicalResourceId;
    return this;
  }

  /**
   * Get physicalResourceId
   * @return physicalResourceId
   */
  @javax.annotation.Nullable
  public String getPhysicalResourceId() {
    return physicalResourceId;
  }

  public void setPhysicalResourceId(String physicalResourceId) {
    this.physicalResourceId = physicalResourceId;
  }


  public ResourceChange resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public ResourceChange replacement(Replacement replacement) {
    this.replacement = replacement;
    return this;
  }

  /**
   * Get replacement
   * @return replacement
   */
  @javax.annotation.Nullable
  public Replacement getReplacement() {
    return replacement;
  }

  public void setReplacement(Replacement replacement) {
    this.replacement = replacement;
  }


  public ResourceChange scope(List scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public List getScope() {
    return scope;
  }

  public void setScope(List scope) {
    this.scope = scope;
  }


  public ResourceChange details(List details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  public List getDetails() {
    return details;
  }

  public void setDetails(List details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceChange resourceChange = (ResourceChange) o;
    return Objects.equals(this.action, resourceChange.action) &&
        Objects.equals(this.logicalResourceId, resourceChange.logicalResourceId) &&
        Objects.equals(this.physicalResourceId, resourceChange.physicalResourceId) &&
        Objects.equals(this.resourceType, resourceChange.resourceType) &&
        Objects.equals(this.replacement, resourceChange.replacement) &&
        Objects.equals(this.scope, resourceChange.scope) &&
        Objects.equals(this.details, resourceChange.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, logicalResourceId, physicalResourceId, resourceType, replacement, scope, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceChange {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    logicalResourceId: ").append(toIndentedString(logicalResourceId)).append("\n");
    sb.append("    physicalResourceId: ").append(toIndentedString(physicalResourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("Action");
    openapiFields.add("LogicalResourceId");
    openapiFields.add("PhysicalResourceId");
    openapiFields.add("ResourceType");
    openapiFields.add("Replacement");
    openapiFields.add("Scope");
    openapiFields.add("Details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceChange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceChange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceChange is not found in the empty JSON string", ResourceChange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceChange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceChange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Action`
      if (jsonObj.get("Action") != null && !jsonObj.get("Action").isJsonNull()) {
        ChangeAction.validateJsonElement(jsonObj.get("Action"));
      }
      // validate the optional field `LogicalResourceId`
      if (jsonObj.get("LogicalResourceId") != null && !jsonObj.get("LogicalResourceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LogicalResourceId"));
      }
      // validate the optional field `PhysicalResourceId`
      if (jsonObj.get("PhysicalResourceId") != null && !jsonObj.get("PhysicalResourceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PhysicalResourceId"));
      }
      // validate the optional field `ResourceType`
      if (jsonObj.get("ResourceType") != null && !jsonObj.get("ResourceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceType"));
      }
      // validate the optional field `Replacement`
      if (jsonObj.get("Replacement") != null && !jsonObj.get("Replacement").isJsonNull()) {
        Replacement.validateJsonElement(jsonObj.get("Replacement"));
      }
      // validate the optional field `Scope`
      if (jsonObj.get("Scope") != null && !jsonObj.get("Scope").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Scope"));
      }
      // validate the optional field `Details`
      if (jsonObj.get("Details") != null && !jsonObj.get("Details").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceChange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceChange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceChange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceChange.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceChange>() {
           @Override
           public void write(JsonWriter out, ResourceChange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceChange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceChange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceChange
   * @throws IOException if the JSON string is invalid with respect to ResourceChange
   */
  public static ResourceChange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceChange.class);
  }

  /**
   * Convert an instance of ResourceChange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

