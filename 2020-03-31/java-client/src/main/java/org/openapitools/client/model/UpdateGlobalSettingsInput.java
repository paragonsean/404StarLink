/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
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
import org.openapitools.client.model.OrganizationSharingStatus;

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
 * UpdateGlobalSettingsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:48.152112-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateGlobalSettingsInput {
  public static final String SERIALIZED_NAME_ORGANIZATION_SHARING_STATUS = "OrganizationSharingStatus";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_SHARING_STATUS)
  private OrganizationSharingStatus organizationSharingStatus;

  public UpdateGlobalSettingsInput() {
  }

  public UpdateGlobalSettingsInput organizationSharingStatus(OrganizationSharingStatus organizationSharingStatus) {
    this.organizationSharingStatus = organizationSharingStatus;
    return this;
  }

  /**
   * Get organizationSharingStatus
   * @return organizationSharingStatus
   */
  @javax.annotation.Nullable
  public OrganizationSharingStatus getOrganizationSharingStatus() {
    return organizationSharingStatus;
  }

  public void setOrganizationSharingStatus(OrganizationSharingStatus organizationSharingStatus) {
    this.organizationSharingStatus = organizationSharingStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGlobalSettingsInput updateGlobalSettingsInput = (UpdateGlobalSettingsInput) o;
    return Objects.equals(this.organizationSharingStatus, updateGlobalSettingsInput.organizationSharingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationSharingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGlobalSettingsInput {\n");
    sb.append("    organizationSharingStatus: ").append(toIndentedString(organizationSharingStatus)).append("\n");
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
    openapiFields.add("OrganizationSharingStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGlobalSettingsInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGlobalSettingsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGlobalSettingsInput is not found in the empty JSON string", UpdateGlobalSettingsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateGlobalSettingsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGlobalSettingsInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `OrganizationSharingStatus`
      if (jsonObj.get("OrganizationSharingStatus") != null && !jsonObj.get("OrganizationSharingStatus").isJsonNull()) {
        OrganizationSharingStatus.validateJsonElement(jsonObj.get("OrganizationSharingStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGlobalSettingsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGlobalSettingsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGlobalSettingsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGlobalSettingsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGlobalSettingsInput>() {
           @Override
           public void write(JsonWriter out, UpdateGlobalSettingsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGlobalSettingsInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateGlobalSettingsInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGlobalSettingsInput
   * @throws IOException if the JSON string is invalid with respect to UpdateGlobalSettingsInput
   */
  public static UpdateGlobalSettingsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGlobalSettingsInput.class);
  }

  /**
   * Convert an instance of UpdateGlobalSettingsInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

