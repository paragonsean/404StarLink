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
import org.openapitools.client.model.AwsWafv2RuleGroupDetailsVisibilityConfig;
import org.openapitools.client.model.AwsWafv2WebAclDetailsCaptchaConfig;
import org.openapitools.client.model.AwsWafv2WebAclDetailsDefaultAction;

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
 *  Details about an WAFv2 web Access Control List (ACL). 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsWafv2WebAclDetails {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_MANAGEDBY_FIREWALL_MANAGER = "ManagedbyFirewallManager";
  @SerializedName(SERIALIZED_NAME_MANAGEDBY_FIREWALL_MANAGER)
  private Boolean managedbyFirewallManager;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CAPACITY = "Capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_CAPTCHA_CONFIG = "CaptchaConfig";
  @SerializedName(SERIALIZED_NAME_CAPTCHA_CONFIG)
  private AwsWafv2WebAclDetailsCaptchaConfig captchaConfig;

  public static final String SERIALIZED_NAME_DEFAULT_ACTION = "DefaultAction";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION)
  private AwsWafv2WebAclDetailsDefaultAction defaultAction;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RULES = "Rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List rules;

  public static final String SERIALIZED_NAME_VISIBILITY_CONFIG = "VisibilityConfig";
  @SerializedName(SERIALIZED_NAME_VISIBILITY_CONFIG)
  private AwsWafv2RuleGroupDetailsVisibilityConfig visibilityConfig;

  public AwsWafv2WebAclDetails() {
  }

  public AwsWafv2WebAclDetails name(String name) {
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


  public AwsWafv2WebAclDetails arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public AwsWafv2WebAclDetails managedbyFirewallManager(Boolean managedbyFirewallManager) {
    this.managedbyFirewallManager = managedbyFirewallManager;
    return this;
  }

  /**
   * Get managedbyFirewallManager
   * @return managedbyFirewallManager
   */
  @javax.annotation.Nullable
  public Boolean getManagedbyFirewallManager() {
    return managedbyFirewallManager;
  }

  public void setManagedbyFirewallManager(Boolean managedbyFirewallManager) {
    this.managedbyFirewallManager = managedbyFirewallManager;
  }


  public AwsWafv2WebAclDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AwsWafv2WebAclDetails capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   */
  @javax.annotation.Nullable
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public AwsWafv2WebAclDetails captchaConfig(AwsWafv2WebAclDetailsCaptchaConfig captchaConfig) {
    this.captchaConfig = captchaConfig;
    return this;
  }

  /**
   * Get captchaConfig
   * @return captchaConfig
   */
  @javax.annotation.Nullable
  public AwsWafv2WebAclDetailsCaptchaConfig getCaptchaConfig() {
    return captchaConfig;
  }

  public void setCaptchaConfig(AwsWafv2WebAclDetailsCaptchaConfig captchaConfig) {
    this.captchaConfig = captchaConfig;
  }


  public AwsWafv2WebAclDetails defaultAction(AwsWafv2WebAclDetailsDefaultAction defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }

  /**
   * Get defaultAction
   * @return defaultAction
   */
  @javax.annotation.Nullable
  public AwsWafv2WebAclDetailsDefaultAction getDefaultAction() {
    return defaultAction;
  }

  public void setDefaultAction(AwsWafv2WebAclDetailsDefaultAction defaultAction) {
    this.defaultAction = defaultAction;
  }


  public AwsWafv2WebAclDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AwsWafv2WebAclDetails rules(List rules) {
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


  public AwsWafv2WebAclDetails visibilityConfig(AwsWafv2RuleGroupDetailsVisibilityConfig visibilityConfig) {
    this.visibilityConfig = visibilityConfig;
    return this;
  }

  /**
   * Get visibilityConfig
   * @return visibilityConfig
   */
  @javax.annotation.Nullable
  public AwsWafv2RuleGroupDetailsVisibilityConfig getVisibilityConfig() {
    return visibilityConfig;
  }

  public void setVisibilityConfig(AwsWafv2RuleGroupDetailsVisibilityConfig visibilityConfig) {
    this.visibilityConfig = visibilityConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsWafv2WebAclDetails awsWafv2WebAclDetails = (AwsWafv2WebAclDetails) o;
    return Objects.equals(this.name, awsWafv2WebAclDetails.name) &&
        Objects.equals(this.arn, awsWafv2WebAclDetails.arn) &&
        Objects.equals(this.managedbyFirewallManager, awsWafv2WebAclDetails.managedbyFirewallManager) &&
        Objects.equals(this.id, awsWafv2WebAclDetails.id) &&
        Objects.equals(this.capacity, awsWafv2WebAclDetails.capacity) &&
        Objects.equals(this.captchaConfig, awsWafv2WebAclDetails.captchaConfig) &&
        Objects.equals(this.defaultAction, awsWafv2WebAclDetails.defaultAction) &&
        Objects.equals(this.description, awsWafv2WebAclDetails.description) &&
        Objects.equals(this.rules, awsWafv2WebAclDetails.rules) &&
        Objects.equals(this.visibilityConfig, awsWafv2WebAclDetails.visibilityConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, managedbyFirewallManager, id, capacity, captchaConfig, defaultAction, description, rules, visibilityConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsWafv2WebAclDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    managedbyFirewallManager: ").append(toIndentedString(managedbyFirewallManager)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    captchaConfig: ").append(toIndentedString(captchaConfig)).append("\n");
    sb.append("    defaultAction: ").append(toIndentedString(defaultAction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    visibilityConfig: ").append(toIndentedString(visibilityConfig)).append("\n");
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
    openapiFields.add("Arn");
    openapiFields.add("ManagedbyFirewallManager");
    openapiFields.add("Id");
    openapiFields.add("Capacity");
    openapiFields.add("CaptchaConfig");
    openapiFields.add("DefaultAction");
    openapiFields.add("Description");
    openapiFields.add("Rules");
    openapiFields.add("VisibilityConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsWafv2WebAclDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsWafv2WebAclDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsWafv2WebAclDetails is not found in the empty JSON string", AwsWafv2WebAclDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsWafv2WebAclDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsWafv2WebAclDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `ManagedbyFirewallManager`
      if (jsonObj.get("ManagedbyFirewallManager") != null && !jsonObj.get("ManagedbyFirewallManager").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ManagedbyFirewallManager"));
      }
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `Capacity`
      if (jsonObj.get("Capacity") != null && !jsonObj.get("Capacity").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Capacity"));
      }
      // validate the optional field `CaptchaConfig`
      if (jsonObj.get("CaptchaConfig") != null && !jsonObj.get("CaptchaConfig").isJsonNull()) {
        AwsWafv2WebAclDetailsCaptchaConfig.validateJsonElement(jsonObj.get("CaptchaConfig"));
      }
      // validate the optional field `DefaultAction`
      if (jsonObj.get("DefaultAction") != null && !jsonObj.get("DefaultAction").isJsonNull()) {
        AwsWafv2WebAclDetailsDefaultAction.validateJsonElement(jsonObj.get("DefaultAction"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `Rules`
      if (jsonObj.get("Rules") != null && !jsonObj.get("Rules").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Rules"));
      }
      // validate the optional field `VisibilityConfig`
      if (jsonObj.get("VisibilityConfig") != null && !jsonObj.get("VisibilityConfig").isJsonNull()) {
        AwsWafv2RuleGroupDetailsVisibilityConfig.validateJsonElement(jsonObj.get("VisibilityConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsWafv2WebAclDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsWafv2WebAclDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsWafv2WebAclDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsWafv2WebAclDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsWafv2WebAclDetails>() {
           @Override
           public void write(JsonWriter out, AwsWafv2WebAclDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsWafv2WebAclDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsWafv2WebAclDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsWafv2WebAclDetails
   * @throws IOException if the JSON string is invalid with respect to AwsWafv2WebAclDetails
   */
  public static AwsWafv2WebAclDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsWafv2WebAclDetails.class);
  }

  /**
   * Convert an instance of AwsWafv2WebAclDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

