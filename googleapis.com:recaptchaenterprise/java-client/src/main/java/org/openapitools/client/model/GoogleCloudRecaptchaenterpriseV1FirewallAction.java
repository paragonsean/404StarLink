/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
 *
 * The version of the OpenAPI document: v1
 * 
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
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction;

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
 * An individual action. Each action represents what to do if a policy matches.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:37.006704-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1FirewallAction {
  public static final String SERIALIZED_NAME_ALLOW = "allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private Object allow;

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private Object block;

  public static final String SERIALIZED_NAME_REDIRECT = "redirect";
  @SerializedName(SERIALIZED_NAME_REDIRECT)
  private Object redirect;

  public static final String SERIALIZED_NAME_SET_HEADER = "setHeader";
  @SerializedName(SERIALIZED_NAME_SET_HEADER)
  private GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction setHeader;

  public static final String SERIALIZED_NAME_SUBSTITUTE = "substitute";
  @SerializedName(SERIALIZED_NAME_SUBSTITUTE)
  private GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction substitute;

  public GoogleCloudRecaptchaenterpriseV1FirewallAction() {
  }

  public GoogleCloudRecaptchaenterpriseV1FirewallAction allow(Object allow) {
    this.allow = allow;
    return this;
  }

  /**
   * An allow action continues processing a request unimpeded.
   * @return allow
   */
  @javax.annotation.Nullable
  public Object getAllow() {
    return allow;
  }

  public void setAllow(Object allow) {
    this.allow = allow;
  }


  public GoogleCloudRecaptchaenterpriseV1FirewallAction block(Object block) {
    this.block = block;
    return this;
  }

  /**
   * A block action serves an HTTP error code a prevents the request from hitting the backend.
   * @return block
   */
  @javax.annotation.Nullable
  public Object getBlock() {
    return block;
  }

  public void setBlock(Object block) {
    this.block = block;
  }


  public GoogleCloudRecaptchaenterpriseV1FirewallAction redirect(Object redirect) {
    this.redirect = redirect;
    return this;
  }

  /**
   * A redirect action returns a 307 (temporary redirect) response, pointing the user to a ReCaptcha interstitial page to attach a token.
   * @return redirect
   */
  @javax.annotation.Nullable
  public Object getRedirect() {
    return redirect;
  }

  public void setRedirect(Object redirect) {
    this.redirect = redirect;
  }


  public GoogleCloudRecaptchaenterpriseV1FirewallAction setHeader(GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction setHeader) {
    this.setHeader = setHeader;
    return this;
  }

  /**
   * Get setHeader
   * @return setHeader
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction getSetHeader() {
    return setHeader;
  }

  public void setSetHeader(GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction setHeader) {
    this.setHeader = setHeader;
  }


  public GoogleCloudRecaptchaenterpriseV1FirewallAction substitute(GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction substitute) {
    this.substitute = substitute;
    return this;
  }

  /**
   * Get substitute
   * @return substitute
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction getSubstitute() {
    return substitute;
  }

  public void setSubstitute(GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction substitute) {
    this.substitute = substitute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1FirewallAction googleCloudRecaptchaenterpriseV1FirewallAction = (GoogleCloudRecaptchaenterpriseV1FirewallAction) o;
    return Objects.equals(this.allow, googleCloudRecaptchaenterpriseV1FirewallAction.allow) &&
        Objects.equals(this.block, googleCloudRecaptchaenterpriseV1FirewallAction.block) &&
        Objects.equals(this.redirect, googleCloudRecaptchaenterpriseV1FirewallAction.redirect) &&
        Objects.equals(this.setHeader, googleCloudRecaptchaenterpriseV1FirewallAction.setHeader) &&
        Objects.equals(this.substitute, googleCloudRecaptchaenterpriseV1FirewallAction.substitute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, block, redirect, setHeader, substitute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1FirewallAction {\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    setHeader: ").append(toIndentedString(setHeader)).append("\n");
    sb.append("    substitute: ").append(toIndentedString(substitute)).append("\n");
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
    openapiFields.add("allow");
    openapiFields.add("block");
    openapiFields.add("redirect");
    openapiFields.add("setHeader");
    openapiFields.add("substitute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1FirewallAction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1FirewallAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1FirewallAction is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1FirewallAction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1FirewallAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1FirewallAction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `setHeader`
      if (jsonObj.get("setHeader") != null && !jsonObj.get("setHeader").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction.validateJsonElement(jsonObj.get("setHeader"));
      }
      // validate the optional field `substitute`
      if (jsonObj.get("substitute") != null && !jsonObj.get("substitute").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction.validateJsonElement(jsonObj.get("substitute"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1FirewallAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1FirewallAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1FirewallAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1FirewallAction.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1FirewallAction>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1FirewallAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1FirewallAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1FirewallAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1FirewallAction
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1FirewallAction
   */
  public static GoogleCloudRecaptchaenterpriseV1FirewallAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1FirewallAction.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1FirewallAction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

