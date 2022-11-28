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
 * UpdateStandardsControlRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateStandardsControlRequest {
  /**
   * The updated status of the security standard control.
   */
  @JsonAdapter(ControlStatusEnum.Adapter.class)
  public enum ControlStatusEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    ControlStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ControlStatusEnum fromValue(String value) {
      for (ControlStatusEnum b : ControlStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ControlStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ControlStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ControlStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ControlStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ControlStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTROL_STATUS = "ControlStatus";
  @SerializedName(SERIALIZED_NAME_CONTROL_STATUS)
  private ControlStatusEnum controlStatus;

  public static final String SERIALIZED_NAME_DISABLED_REASON = "DisabledReason";
  @SerializedName(SERIALIZED_NAME_DISABLED_REASON)
  private String disabledReason;

  public UpdateStandardsControlRequest() {
  }

  public UpdateStandardsControlRequest controlStatus(ControlStatusEnum controlStatus) {
    this.controlStatus = controlStatus;
    return this;
  }

  /**
   * The updated status of the security standard control.
   * @return controlStatus
   */
  @javax.annotation.Nullable
  public ControlStatusEnum getControlStatus() {
    return controlStatus;
  }

  public void setControlStatus(ControlStatusEnum controlStatus) {
    this.controlStatus = controlStatus;
  }


  public UpdateStandardsControlRequest disabledReason(String disabledReason) {
    this.disabledReason = disabledReason;
    return this;
  }

  /**
   * A description of the reason why you are disabling a security standard control. If you are disabling a control, then this is required.
   * @return disabledReason
   */
  @javax.annotation.Nullable
  public String getDisabledReason() {
    return disabledReason;
  }

  public void setDisabledReason(String disabledReason) {
    this.disabledReason = disabledReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStandardsControlRequest updateStandardsControlRequest = (UpdateStandardsControlRequest) o;
    return Objects.equals(this.controlStatus, updateStandardsControlRequest.controlStatus) &&
        Objects.equals(this.disabledReason, updateStandardsControlRequest.disabledReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlStatus, disabledReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStandardsControlRequest {\n");
    sb.append("    controlStatus: ").append(toIndentedString(controlStatus)).append("\n");
    sb.append("    disabledReason: ").append(toIndentedString(disabledReason)).append("\n");
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
    openapiFields.add("ControlStatus");
    openapiFields.add("DisabledReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateStandardsControlRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateStandardsControlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateStandardsControlRequest is not found in the empty JSON string", UpdateStandardsControlRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateStandardsControlRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateStandardsControlRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ControlStatus") != null && !jsonObj.get("ControlStatus").isJsonNull()) && !jsonObj.get("ControlStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ControlStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ControlStatus").toString()));
      }
      // validate the optional field `ControlStatus`
      if (jsonObj.get("ControlStatus") != null && !jsonObj.get("ControlStatus").isJsonNull()) {
        ControlStatusEnum.validateJsonElement(jsonObj.get("ControlStatus"));
      }
      if ((jsonObj.get("DisabledReason") != null && !jsonObj.get("DisabledReason").isJsonNull()) && !jsonObj.get("DisabledReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisabledReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisabledReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateStandardsControlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateStandardsControlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateStandardsControlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateStandardsControlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateStandardsControlRequest>() {
           @Override
           public void write(JsonWriter out, UpdateStandardsControlRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateStandardsControlRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateStandardsControlRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateStandardsControlRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateStandardsControlRequest
   */
  public static UpdateStandardsControlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateStandardsControlRequest.class);
  }

  /**
   * Convert an instance of UpdateStandardsControlRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

