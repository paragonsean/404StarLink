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
 * &lt;p&gt;The user-defined preferences that will be applied during product provisioning, unless overridden by &lt;code&gt;ProvisioningPreferences&lt;/code&gt; or &lt;code&gt;UpdateProvisioningPreferences&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;For more information on maximum concurrent accounts and failure tolerance, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options\&quot;&gt;Stack set operation options&lt;/a&gt; in the &lt;i&gt;CloudFormation User Guide&lt;/i&gt;.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProvisioningArtifactPreferences {
  public static final String SERIALIZED_NAME_STACK_SET_ACCOUNTS = "StackSetAccounts";
  @SerializedName(SERIALIZED_NAME_STACK_SET_ACCOUNTS)
  private List stackSetAccounts;

  public static final String SERIALIZED_NAME_STACK_SET_REGIONS = "StackSetRegions";
  @SerializedName(SERIALIZED_NAME_STACK_SET_REGIONS)
  private List stackSetRegions;

  public ProvisioningArtifactPreferences() {
  }

  public ProvisioningArtifactPreferences stackSetAccounts(List stackSetAccounts) {
    this.stackSetAccounts = stackSetAccounts;
    return this;
  }

  /**
   * Get stackSetAccounts
   * @return stackSetAccounts
   */
  @javax.annotation.Nullable
  public List getStackSetAccounts() {
    return stackSetAccounts;
  }

  public void setStackSetAccounts(List stackSetAccounts) {
    this.stackSetAccounts = stackSetAccounts;
  }


  public ProvisioningArtifactPreferences stackSetRegions(List stackSetRegions) {
    this.stackSetRegions = stackSetRegions;
    return this;
  }

  /**
   * Get stackSetRegions
   * @return stackSetRegions
   */
  @javax.annotation.Nullable
  public List getStackSetRegions() {
    return stackSetRegions;
  }

  public void setStackSetRegions(List stackSetRegions) {
    this.stackSetRegions = stackSetRegions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningArtifactPreferences provisioningArtifactPreferences = (ProvisioningArtifactPreferences) o;
    return Objects.equals(this.stackSetAccounts, provisioningArtifactPreferences.stackSetAccounts) &&
        Objects.equals(this.stackSetRegions, provisioningArtifactPreferences.stackSetRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackSetAccounts, stackSetRegions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningArtifactPreferences {\n");
    sb.append("    stackSetAccounts: ").append(toIndentedString(stackSetAccounts)).append("\n");
    sb.append("    stackSetRegions: ").append(toIndentedString(stackSetRegions)).append("\n");
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
    openapiFields.add("StackSetAccounts");
    openapiFields.add("StackSetRegions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisioningArtifactPreferences
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisioningArtifactPreferences.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisioningArtifactPreferences is not found in the empty JSON string", ProvisioningArtifactPreferences.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisioningArtifactPreferences.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisioningArtifactPreferences` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `StackSetAccounts`
      if (jsonObj.get("StackSetAccounts") != null && !jsonObj.get("StackSetAccounts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("StackSetAccounts"));
      }
      // validate the optional field `StackSetRegions`
      if (jsonObj.get("StackSetRegions") != null && !jsonObj.get("StackSetRegions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("StackSetRegions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisioningArtifactPreferences.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisioningArtifactPreferences' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisioningArtifactPreferences> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisioningArtifactPreferences.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisioningArtifactPreferences>() {
           @Override
           public void write(JsonWriter out, ProvisioningArtifactPreferences value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisioningArtifactPreferences read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisioningArtifactPreferences given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisioningArtifactPreferences
   * @throws IOException if the JSON string is invalid with respect to ProvisioningArtifactPreferences
   */
  public static ProvisioningArtifactPreferences fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisioningArtifactPreferences.class);
  }

  /**
   * Convert an instance of ProvisioningArtifactPreferences to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

