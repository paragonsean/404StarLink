/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import org.openapitools.client.model.ControlFindingGenerator;

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
 * DescribeHubResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeHubResponse {
  public static final String SERIALIZED_NAME_HUB_ARN = "HubArn";
  @SerializedName(SERIALIZED_NAME_HUB_ARN)
  private String hubArn;

  public static final String SERIALIZED_NAME_SUBSCRIBED_AT = "SubscribedAt";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_AT)
  private String subscribedAt;

  public static final String SERIALIZED_NAME_AUTO_ENABLE_CONTROLS = "AutoEnableControls";
  @SerializedName(SERIALIZED_NAME_AUTO_ENABLE_CONTROLS)
  private Boolean autoEnableControls;

  public static final String SERIALIZED_NAME_CONTROL_FINDING_GENERATOR = "ControlFindingGenerator";
  @SerializedName(SERIALIZED_NAME_CONTROL_FINDING_GENERATOR)
  private ControlFindingGenerator controlFindingGenerator;

  public DescribeHubResponse() {
  }

  public DescribeHubResponse hubArn(String hubArn) {
    this.hubArn = hubArn;
    return this;
  }

  /**
   * Get hubArn
   * @return hubArn
   */
  @javax.annotation.Nullable
  public String getHubArn() {
    return hubArn;
  }

  public void setHubArn(String hubArn) {
    this.hubArn = hubArn;
  }


  public DescribeHubResponse subscribedAt(String subscribedAt) {
    this.subscribedAt = subscribedAt;
    return this;
  }

  /**
   * Get subscribedAt
   * @return subscribedAt
   */
  @javax.annotation.Nullable
  public String getSubscribedAt() {
    return subscribedAt;
  }

  public void setSubscribedAt(String subscribedAt) {
    this.subscribedAt = subscribedAt;
  }


  public DescribeHubResponse autoEnableControls(Boolean autoEnableControls) {
    this.autoEnableControls = autoEnableControls;
    return this;
  }

  /**
   * Get autoEnableControls
   * @return autoEnableControls
   */
  @javax.annotation.Nullable
  public Boolean getAutoEnableControls() {
    return autoEnableControls;
  }

  public void setAutoEnableControls(Boolean autoEnableControls) {
    this.autoEnableControls = autoEnableControls;
  }


  public DescribeHubResponse controlFindingGenerator(ControlFindingGenerator controlFindingGenerator) {
    this.controlFindingGenerator = controlFindingGenerator;
    return this;
  }

  /**
   * Get controlFindingGenerator
   * @return controlFindingGenerator
   */
  @javax.annotation.Nullable
  public ControlFindingGenerator getControlFindingGenerator() {
    return controlFindingGenerator;
  }

  public void setControlFindingGenerator(ControlFindingGenerator controlFindingGenerator) {
    this.controlFindingGenerator = controlFindingGenerator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeHubResponse describeHubResponse = (DescribeHubResponse) o;
    return Objects.equals(this.hubArn, describeHubResponse.hubArn) &&
        Objects.equals(this.subscribedAt, describeHubResponse.subscribedAt) &&
        Objects.equals(this.autoEnableControls, describeHubResponse.autoEnableControls) &&
        Objects.equals(this.controlFindingGenerator, describeHubResponse.controlFindingGenerator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hubArn, subscribedAt, autoEnableControls, controlFindingGenerator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeHubResponse {\n");
    sb.append("    hubArn: ").append(toIndentedString(hubArn)).append("\n");
    sb.append("    subscribedAt: ").append(toIndentedString(subscribedAt)).append("\n");
    sb.append("    autoEnableControls: ").append(toIndentedString(autoEnableControls)).append("\n");
    sb.append("    controlFindingGenerator: ").append(toIndentedString(controlFindingGenerator)).append("\n");
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
    openapiFields.add("HubArn");
    openapiFields.add("SubscribedAt");
    openapiFields.add("AutoEnableControls");
    openapiFields.add("ControlFindingGenerator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeHubResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeHubResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeHubResponse is not found in the empty JSON string", DescribeHubResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeHubResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeHubResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `HubArn`
      if (jsonObj.get("HubArn") != null && !jsonObj.get("HubArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HubArn"));
      }
      // validate the optional field `SubscribedAt`
      if (jsonObj.get("SubscribedAt") != null && !jsonObj.get("SubscribedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubscribedAt"));
      }
      // validate the optional field `AutoEnableControls`
      if (jsonObj.get("AutoEnableControls") != null && !jsonObj.get("AutoEnableControls").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AutoEnableControls"));
      }
      // validate the optional field `ControlFindingGenerator`
      if (jsonObj.get("ControlFindingGenerator") != null && !jsonObj.get("ControlFindingGenerator").isJsonNull()) {
        ControlFindingGenerator.validateJsonElement(jsonObj.get("ControlFindingGenerator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeHubResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeHubResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeHubResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeHubResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeHubResponse>() {
           @Override
           public void write(JsonWriter out, DescribeHubResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeHubResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeHubResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeHubResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeHubResponse
   */
  public static DescribeHubResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeHubResponse.class);
  }

  /**
   * Convert an instance of DescribeHubResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

