/*
 * Amazon Elasticsearch Service
 * <fullname>Amazon Elasticsearch Configuration Service</fullname> <p>Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.</p> <p>For sample code that uses the Configuration API, see the <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html\">Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html\">sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.</p> <p>The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a href=\"http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions\" target=\"_blank\">Regions and Endpoints</a>.</p>
 *
 * The version of the OpenAPI document: 2015-01-01
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
import org.openapitools.client.model.UpgradeStatus;
import org.openapitools.client.model.UpgradeStep;

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
 *  Container for response returned by &lt;code&gt; &lt;a&gt;GetUpgradeStatus&lt;/a&gt; &lt;/code&gt; operation. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetUpgradeStatusResponse {
  public static final String SERIALIZED_NAME_UPGRADE_STEP = "UpgradeStep";
  @SerializedName(SERIALIZED_NAME_UPGRADE_STEP)
  private UpgradeStep upgradeStep;

  public static final String SERIALIZED_NAME_STEP_STATUS = "StepStatus";
  @SerializedName(SERIALIZED_NAME_STEP_STATUS)
  private UpgradeStatus stepStatus;

  public static final String SERIALIZED_NAME_UPGRADE_NAME = "UpgradeName";
  @SerializedName(SERIALIZED_NAME_UPGRADE_NAME)
  private String upgradeName;

  public GetUpgradeStatusResponse() {
  }

  public GetUpgradeStatusResponse upgradeStep(UpgradeStep upgradeStep) {
    this.upgradeStep = upgradeStep;
    return this;
  }

  /**
   * Get upgradeStep
   * @return upgradeStep
   */
  @javax.annotation.Nullable
  public UpgradeStep getUpgradeStep() {
    return upgradeStep;
  }

  public void setUpgradeStep(UpgradeStep upgradeStep) {
    this.upgradeStep = upgradeStep;
  }


  public GetUpgradeStatusResponse stepStatus(UpgradeStatus stepStatus) {
    this.stepStatus = stepStatus;
    return this;
  }

  /**
   * Get stepStatus
   * @return stepStatus
   */
  @javax.annotation.Nullable
  public UpgradeStatus getStepStatus() {
    return stepStatus;
  }

  public void setStepStatus(UpgradeStatus stepStatus) {
    this.stepStatus = stepStatus;
  }


  public GetUpgradeStatusResponse upgradeName(String upgradeName) {
    this.upgradeName = upgradeName;
    return this;
  }

  /**
   * Get upgradeName
   * @return upgradeName
   */
  @javax.annotation.Nullable
  public String getUpgradeName() {
    return upgradeName;
  }

  public void setUpgradeName(String upgradeName) {
    this.upgradeName = upgradeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUpgradeStatusResponse getUpgradeStatusResponse = (GetUpgradeStatusResponse) o;
    return Objects.equals(this.upgradeStep, getUpgradeStatusResponse.upgradeStep) &&
        Objects.equals(this.stepStatus, getUpgradeStatusResponse.stepStatus) &&
        Objects.equals(this.upgradeName, getUpgradeStatusResponse.upgradeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgradeStep, stepStatus, upgradeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUpgradeStatusResponse {\n");
    sb.append("    upgradeStep: ").append(toIndentedString(upgradeStep)).append("\n");
    sb.append("    stepStatus: ").append(toIndentedString(stepStatus)).append("\n");
    sb.append("    upgradeName: ").append(toIndentedString(upgradeName)).append("\n");
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
    openapiFields.add("UpgradeStep");
    openapiFields.add("StepStatus");
    openapiFields.add("UpgradeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetUpgradeStatusResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetUpgradeStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetUpgradeStatusResponse is not found in the empty JSON string", GetUpgradeStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetUpgradeStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetUpgradeStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `UpgradeStep`
      if (jsonObj.get("UpgradeStep") != null && !jsonObj.get("UpgradeStep").isJsonNull()) {
        UpgradeStep.validateJsonElement(jsonObj.get("UpgradeStep"));
      }
      // validate the optional field `StepStatus`
      if (jsonObj.get("StepStatus") != null && !jsonObj.get("StepStatus").isJsonNull()) {
        UpgradeStatus.validateJsonElement(jsonObj.get("StepStatus"));
      }
      // validate the optional field `UpgradeName`
      if (jsonObj.get("UpgradeName") != null && !jsonObj.get("UpgradeName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UpgradeName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetUpgradeStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetUpgradeStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetUpgradeStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetUpgradeStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetUpgradeStatusResponse>() {
           @Override
           public void write(JsonWriter out, GetUpgradeStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetUpgradeStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetUpgradeStatusResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetUpgradeStatusResponse
   * @throws IOException if the JSON string is invalid with respect to GetUpgradeStatusResponse
   */
  public static GetUpgradeStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUpgradeStatusResponse.class);
  }

  /**
   * Convert an instance of GetUpgradeStatusResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

