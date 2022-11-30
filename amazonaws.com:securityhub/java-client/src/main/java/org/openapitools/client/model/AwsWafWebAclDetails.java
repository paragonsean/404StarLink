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
 * Provides information about an WAF web access control list (web ACL).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsWafWebAclDetails {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEFAULT_ACTION = "DefaultAction";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION)
  private String defaultAction;

  public static final String SERIALIZED_NAME_RULES = "Rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List rules;

  public static final String SERIALIZED_NAME_WEB_ACL_ID = "WebAclId";
  @SerializedName(SERIALIZED_NAME_WEB_ACL_ID)
  private String webAclId;

  public AwsWafWebAclDetails() {
  }

  public AwsWafWebAclDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AwsWafWebAclDetails defaultAction(String defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }

  /**
   * Get defaultAction
   * @return defaultAction
   */
  @javax.annotation.Nullable
  public String getDefaultAction() {
    return defaultAction;
  }

  public void setDefaultAction(String defaultAction) {
    this.defaultAction = defaultAction;
  }


  public AwsWafWebAclDetails rules(List rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   * @return rules
   */
  @javax.annotation.Nullable
  public List getRules() {
    return rules;
  }

  public void setRules(List rules) {
    this.rules = rules;
  }


  public AwsWafWebAclDetails webAclId(String webAclId) {
    this.webAclId = webAclId;
    return this;
  }

  /**
   * Get webAclId
   * @return webAclId
   */
  @javax.annotation.Nullable
  public String getWebAclId() {
    return webAclId;
  }

  public void setWebAclId(String webAclId) {
    this.webAclId = webAclId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsWafWebAclDetails awsWafWebAclDetails = (AwsWafWebAclDetails) o;
    return Objects.equals(this.name, awsWafWebAclDetails.name) &&
        Objects.equals(this.defaultAction, awsWafWebAclDetails.defaultAction) &&
        Objects.equals(this.rules, awsWafWebAclDetails.rules) &&
        Objects.equals(this.webAclId, awsWafWebAclDetails.webAclId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultAction, rules, webAclId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsWafWebAclDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultAction: ").append(toIndentedString(defaultAction)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    webAclId: ").append(toIndentedString(webAclId)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("DefaultAction");
    openapiFields.add("Rules");
    openapiFields.add("WebAclId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsWafWebAclDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsWafWebAclDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsWafWebAclDetails is not found in the empty JSON string", AwsWafWebAclDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsWafWebAclDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsWafWebAclDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `DefaultAction`
      if (jsonObj.get("DefaultAction") != null && !jsonObj.get("DefaultAction").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultAction"));
      }
      // validate the optional field `Rules`
      if (jsonObj.get("Rules") != null && !jsonObj.get("Rules").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Rules"));
      }
      // validate the optional field `WebAclId`
      if (jsonObj.get("WebAclId") != null && !jsonObj.get("WebAclId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("WebAclId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsWafWebAclDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsWafWebAclDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsWafWebAclDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsWafWebAclDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsWafWebAclDetails>() {
           @Override
           public void write(JsonWriter out, AwsWafWebAclDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsWafWebAclDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsWafWebAclDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsWafWebAclDetails
   * @throws IOException if the JSON string is invalid with respect to AwsWafWebAclDetails
   */
  public static AwsWafWebAclDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsWafWebAclDetails.class);
  }

  /**
   * Convert an instance of AwsWafWebAclDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

