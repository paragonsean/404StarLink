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
import org.openapitools.client.model.TrustedAdvisorIntegrationStatus;

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
 * WorkloadDiscoveryConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:44.124838-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class WorkloadDiscoveryConfig {
  public static final String SERIALIZED_NAME_TRUSTED_ADVISOR_INTEGRATION_STATUS = "TrustedAdvisorIntegrationStatus";
  @SerializedName(SERIALIZED_NAME_TRUSTED_ADVISOR_INTEGRATION_STATUS)
  private TrustedAdvisorIntegrationStatus trustedAdvisorIntegrationStatus;

  public WorkloadDiscoveryConfig() {
  }

  public WorkloadDiscoveryConfig trustedAdvisorIntegrationStatus(TrustedAdvisorIntegrationStatus trustedAdvisorIntegrationStatus) {
    this.trustedAdvisorIntegrationStatus = trustedAdvisorIntegrationStatus;
    return this;
  }

  /**
   * Get trustedAdvisorIntegrationStatus
   * @return trustedAdvisorIntegrationStatus
   */
  @javax.annotation.Nullable
  public TrustedAdvisorIntegrationStatus getTrustedAdvisorIntegrationStatus() {
    return trustedAdvisorIntegrationStatus;
  }

  public void setTrustedAdvisorIntegrationStatus(TrustedAdvisorIntegrationStatus trustedAdvisorIntegrationStatus) {
    this.trustedAdvisorIntegrationStatus = trustedAdvisorIntegrationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadDiscoveryConfig workloadDiscoveryConfig = (WorkloadDiscoveryConfig) o;
    return Objects.equals(this.trustedAdvisorIntegrationStatus, workloadDiscoveryConfig.trustedAdvisorIntegrationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustedAdvisorIntegrationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadDiscoveryConfig {\n");
    sb.append("    trustedAdvisorIntegrationStatus: ").append(toIndentedString(trustedAdvisorIntegrationStatus)).append("\n");
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
    openapiFields.add("TrustedAdvisorIntegrationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkloadDiscoveryConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkloadDiscoveryConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkloadDiscoveryConfig is not found in the empty JSON string", WorkloadDiscoveryConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkloadDiscoveryConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkloadDiscoveryConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TrustedAdvisorIntegrationStatus`
      if (jsonObj.get("TrustedAdvisorIntegrationStatus") != null && !jsonObj.get("TrustedAdvisorIntegrationStatus").isJsonNull()) {
        TrustedAdvisorIntegrationStatus.validateJsonElement(jsonObj.get("TrustedAdvisorIntegrationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkloadDiscoveryConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkloadDiscoveryConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkloadDiscoveryConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkloadDiscoveryConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkloadDiscoveryConfig>() {
           @Override
           public void write(JsonWriter out, WorkloadDiscoveryConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkloadDiscoveryConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkloadDiscoveryConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkloadDiscoveryConfig
   * @throws IOException if the JSON string is invalid with respect to WorkloadDiscoveryConfig
   */
  public static WorkloadDiscoveryConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkloadDiscoveryConfig.class);
  }

  /**
   * Convert an instance of WorkloadDiscoveryConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

