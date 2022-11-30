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
import org.openapitools.client.model.AwsWafv2RulesActionDetailsAllow;
import org.openapitools.client.model.AwsWafv2RulesActionDetailsBlock;
import org.openapitools.client.model.AwsWafv2RulesActionDetailsCaptcha;
import org.openapitools.client.model.AwsWafv2RulesActionDetailsCount;

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
 *  The action that WAF should take on a web request when it matches a rule&#39;s statement. Settings at the web ACL level can override the rule action setting. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsWafv2RulesActionDetails {
  public static final String SERIALIZED_NAME_ALLOW = "Allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private AwsWafv2RulesActionDetailsAllow allow;

  public static final String SERIALIZED_NAME_BLOCK = "Block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private AwsWafv2RulesActionDetailsBlock block;

  public static final String SERIALIZED_NAME_CAPTCHA = "Captcha";
  @SerializedName(SERIALIZED_NAME_CAPTCHA)
  private AwsWafv2RulesActionDetailsCaptcha captcha;

  public static final String SERIALIZED_NAME_COUNT = "Count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private AwsWafv2RulesActionDetailsCount count;

  public AwsWafv2RulesActionDetails() {
  }

  public AwsWafv2RulesActionDetails allow(AwsWafv2RulesActionDetailsAllow allow) {
    this.allow = allow;
    return this;
  }

  /**
   * Get allow
   * @return allow
   */
  @javax.annotation.Nullable
  public AwsWafv2RulesActionDetailsAllow getAllow() {
    return allow;
  }

  public void setAllow(AwsWafv2RulesActionDetailsAllow allow) {
    this.allow = allow;
  }


  public AwsWafv2RulesActionDetails block(AwsWafv2RulesActionDetailsBlock block) {
    this.block = block;
    return this;
  }

  /**
   * Get block
   * @return block
   */
  @javax.annotation.Nullable
  public AwsWafv2RulesActionDetailsBlock getBlock() {
    return block;
  }

  public void setBlock(AwsWafv2RulesActionDetailsBlock block) {
    this.block = block;
  }


  public AwsWafv2RulesActionDetails captcha(AwsWafv2RulesActionDetailsCaptcha captcha) {
    this.captcha = captcha;
    return this;
  }

  /**
   * Get captcha
   * @return captcha
   */
  @javax.annotation.Nullable
  public AwsWafv2RulesActionDetailsCaptcha getCaptcha() {
    return captcha;
  }

  public void setCaptcha(AwsWafv2RulesActionDetailsCaptcha captcha) {
    this.captcha = captcha;
  }


  public AwsWafv2RulesActionDetails count(AwsWafv2RulesActionDetailsCount count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  public AwsWafv2RulesActionDetailsCount getCount() {
    return count;
  }

  public void setCount(AwsWafv2RulesActionDetailsCount count) {
    this.count = count;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsWafv2RulesActionDetails awsWafv2RulesActionDetails = (AwsWafv2RulesActionDetails) o;
    return Objects.equals(this.allow, awsWafv2RulesActionDetails.allow) &&
        Objects.equals(this.block, awsWafv2RulesActionDetails.block) &&
        Objects.equals(this.captcha, awsWafv2RulesActionDetails.captcha) &&
        Objects.equals(this.count, awsWafv2RulesActionDetails.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, block, captcha, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsWafv2RulesActionDetails {\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    captcha: ").append(toIndentedString(captcha)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("Allow");
    openapiFields.add("Block");
    openapiFields.add("Captcha");
    openapiFields.add("Count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsWafv2RulesActionDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsWafv2RulesActionDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsWafv2RulesActionDetails is not found in the empty JSON string", AwsWafv2RulesActionDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsWafv2RulesActionDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsWafv2RulesActionDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Allow`
      if (jsonObj.get("Allow") != null && !jsonObj.get("Allow").isJsonNull()) {
        AwsWafv2RulesActionDetailsAllow.validateJsonElement(jsonObj.get("Allow"));
      }
      // validate the optional field `Block`
      if (jsonObj.get("Block") != null && !jsonObj.get("Block").isJsonNull()) {
        AwsWafv2RulesActionDetailsBlock.validateJsonElement(jsonObj.get("Block"));
      }
      // validate the optional field `Captcha`
      if (jsonObj.get("Captcha") != null && !jsonObj.get("Captcha").isJsonNull()) {
        AwsWafv2RulesActionDetailsCaptcha.validateJsonElement(jsonObj.get("Captcha"));
      }
      // validate the optional field `Count`
      if (jsonObj.get("Count") != null && !jsonObj.get("Count").isJsonNull()) {
        AwsWafv2RulesActionDetailsCount.validateJsonElement(jsonObj.get("Count"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsWafv2RulesActionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsWafv2RulesActionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsWafv2RulesActionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsWafv2RulesActionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsWafv2RulesActionDetails>() {
           @Override
           public void write(JsonWriter out, AwsWafv2RulesActionDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsWafv2RulesActionDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsWafv2RulesActionDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsWafv2RulesActionDetails
   * @throws IOException if the JSON string is invalid with respect to AwsWafv2RulesActionDetails
   */
  public static AwsWafv2RulesActionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsWafv2RulesActionDetails.class);
  }

  /**
   * Convert an instance of AwsWafv2RulesActionDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

