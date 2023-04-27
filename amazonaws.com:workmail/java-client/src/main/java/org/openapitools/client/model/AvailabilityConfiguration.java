/*
 * Amazon WorkMail
 * <p>WorkMail is a secure, managed business email and calendaring service with support for existing desktop and mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory and control both the keys that encrypt your data and the location in which your data is stored.</p> <p>The WorkMail API is designed for the following scenarios:</p> <ul> <li> <p>Listing and describing organizations</p> </li> </ul> <ul> <li> <p>Managing users</p> </li> </ul> <ul> <li> <p>Managing groups</p> </li> </ul> <ul> <li> <p>Managing resources</p> </li> </ul> <p>All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy). This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a selective basis using the IAM model.</p>
 *
 * The version of the OpenAPI document: 2017-10-01
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.AvailabilityConfigurationEwsProvider;
import org.openapitools.client.model.AvailabilityConfigurationLambdaProvider;
import org.openapitools.client.model.AvailabilityProviderType;

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
 * List all the &lt;code&gt;AvailabilityConfiguration&lt;/code&gt;&#39;s for the given WorkMail organization.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:33.109694-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AvailabilityConfiguration {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "ProviderType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private AvailabilityProviderType providerType;

  public static final String SERIALIZED_NAME_EWS_PROVIDER = "EwsProvider";
  @SerializedName(SERIALIZED_NAME_EWS_PROVIDER)
  private AvailabilityConfigurationEwsProvider ewsProvider;

  public static final String SERIALIZED_NAME_LAMBDA_PROVIDER = "LambdaProvider";
  @SerializedName(SERIALIZED_NAME_LAMBDA_PROVIDER)
  private AvailabilityConfigurationLambdaProvider lambdaProvider;

  public static final String SERIALIZED_NAME_DATE_CREATED = "DateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "DateModified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public AvailabilityConfiguration() {
  }

  public AvailabilityConfiguration domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public AvailabilityConfiguration providerType(AvailabilityProviderType providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * Get providerType
   * @return providerType
   */
  @javax.annotation.Nullable
  public AvailabilityProviderType getProviderType() {
    return providerType;
  }

  public void setProviderType(AvailabilityProviderType providerType) {
    this.providerType = providerType;
  }


  public AvailabilityConfiguration ewsProvider(AvailabilityConfigurationEwsProvider ewsProvider) {
    this.ewsProvider = ewsProvider;
    return this;
  }

  /**
   * Get ewsProvider
   * @return ewsProvider
   */
  @javax.annotation.Nullable
  public AvailabilityConfigurationEwsProvider getEwsProvider() {
    return ewsProvider;
  }

  public void setEwsProvider(AvailabilityConfigurationEwsProvider ewsProvider) {
    this.ewsProvider = ewsProvider;
  }


  public AvailabilityConfiguration lambdaProvider(AvailabilityConfigurationLambdaProvider lambdaProvider) {
    this.lambdaProvider = lambdaProvider;
    return this;
  }

  /**
   * Get lambdaProvider
   * @return lambdaProvider
   */
  @javax.annotation.Nullable
  public AvailabilityConfigurationLambdaProvider getLambdaProvider() {
    return lambdaProvider;
  }

  public void setLambdaProvider(AvailabilityConfigurationLambdaProvider lambdaProvider) {
    this.lambdaProvider = lambdaProvider;
  }


  public AvailabilityConfiguration dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public AvailabilityConfiguration dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

  /**
   * Get dateModified
   * @return dateModified
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityConfiguration availabilityConfiguration = (AvailabilityConfiguration) o;
    return Objects.equals(this.domainName, availabilityConfiguration.domainName) &&
        Objects.equals(this.providerType, availabilityConfiguration.providerType) &&
        Objects.equals(this.ewsProvider, availabilityConfiguration.ewsProvider) &&
        Objects.equals(this.lambdaProvider, availabilityConfiguration.lambdaProvider) &&
        Objects.equals(this.dateCreated, availabilityConfiguration.dateCreated) &&
        Objects.equals(this.dateModified, availabilityConfiguration.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, providerType, ewsProvider, lambdaProvider, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityConfiguration {\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    ewsProvider: ").append(toIndentedString(ewsProvider)).append("\n");
    sb.append("    lambdaProvider: ").append(toIndentedString(lambdaProvider)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
    openapiFields.add("DomainName");
    openapiFields.add("ProviderType");
    openapiFields.add("EwsProvider");
    openapiFields.add("LambdaProvider");
    openapiFields.add("DateCreated");
    openapiFields.add("DateModified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailabilityConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailabilityConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailabilityConfiguration is not found in the empty JSON string", AvailabilityConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailabilityConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailabilityConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `ProviderType`
      if (jsonObj.get("ProviderType") != null && !jsonObj.get("ProviderType").isJsonNull()) {
        AvailabilityProviderType.validateJsonElement(jsonObj.get("ProviderType"));
      }
      // validate the optional field `EwsProvider`
      if (jsonObj.get("EwsProvider") != null && !jsonObj.get("EwsProvider").isJsonNull()) {
        AvailabilityConfigurationEwsProvider.validateJsonElement(jsonObj.get("EwsProvider"));
      }
      // validate the optional field `LambdaProvider`
      if (jsonObj.get("LambdaProvider") != null && !jsonObj.get("LambdaProvider").isJsonNull()) {
        AvailabilityConfigurationLambdaProvider.validateJsonElement(jsonObj.get("LambdaProvider"));
      }
      // validate the optional field `DateCreated`
      if (jsonObj.get("DateCreated") != null && !jsonObj.get("DateCreated").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("DateCreated"));
      }
      // validate the optional field `DateModified`
      if (jsonObj.get("DateModified") != null && !jsonObj.get("DateModified").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("DateModified"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailabilityConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailabilityConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailabilityConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailabilityConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailabilityConfiguration>() {
           @Override
           public void write(JsonWriter out, AvailabilityConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailabilityConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailabilityConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailabilityConfiguration
   * @throws IOException if the JSON string is invalid with respect to AvailabilityConfiguration
   */
  public static AvailabilityConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailabilityConfiguration.class);
  }

  /**
   * Convert an instance of AvailabilityConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

