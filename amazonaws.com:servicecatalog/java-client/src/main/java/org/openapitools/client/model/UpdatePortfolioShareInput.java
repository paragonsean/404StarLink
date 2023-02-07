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
import org.openapitools.client.model.OrganizationNode;

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
 * UpdatePortfolioShareInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdatePortfolioShareInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "PortfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private String portfolioId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NODE = "OrganizationNode";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NODE)
  private OrganizationNode organizationNode;

  public static final String SERIALIZED_NAME_SHARE_TAG_OPTIONS = "ShareTagOptions";
  @SerializedName(SERIALIZED_NAME_SHARE_TAG_OPTIONS)
  private Boolean shareTagOptions;

  public static final String SERIALIZED_NAME_SHARE_PRINCIPALS = "SharePrincipals";
  @SerializedName(SERIALIZED_NAME_SHARE_PRINCIPALS)
  private Boolean sharePrincipals;

  public UpdatePortfolioShareInput() {
  }

  public UpdatePortfolioShareInput acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * Get acceptLanguage
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public UpdatePortfolioShareInput portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

  /**
   * Get portfolioId
   * @return portfolioId
   */
  @javax.annotation.Nonnull
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }


  public UpdatePortfolioShareInput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public UpdatePortfolioShareInput organizationNode(OrganizationNode organizationNode) {
    this.organizationNode = organizationNode;
    return this;
  }

  /**
   * Get organizationNode
   * @return organizationNode
   */
  @javax.annotation.Nullable
  public OrganizationNode getOrganizationNode() {
    return organizationNode;
  }

  public void setOrganizationNode(OrganizationNode organizationNode) {
    this.organizationNode = organizationNode;
  }


  public UpdatePortfolioShareInput shareTagOptions(Boolean shareTagOptions) {
    this.shareTagOptions = shareTagOptions;
    return this;
  }

  /**
   * Get shareTagOptions
   * @return shareTagOptions
   */
  @javax.annotation.Nullable
  public Boolean getShareTagOptions() {
    return shareTagOptions;
  }

  public void setShareTagOptions(Boolean shareTagOptions) {
    this.shareTagOptions = shareTagOptions;
  }


  public UpdatePortfolioShareInput sharePrincipals(Boolean sharePrincipals) {
    this.sharePrincipals = sharePrincipals;
    return this;
  }

  /**
   * Get sharePrincipals
   * @return sharePrincipals
   */
  @javax.annotation.Nullable
  public Boolean getSharePrincipals() {
    return sharePrincipals;
  }

  public void setSharePrincipals(Boolean sharePrincipals) {
    this.sharePrincipals = sharePrincipals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePortfolioShareInput updatePortfolioShareInput = (UpdatePortfolioShareInput) o;
    return Objects.equals(this.acceptLanguage, updatePortfolioShareInput.acceptLanguage) &&
        Objects.equals(this.portfolioId, updatePortfolioShareInput.portfolioId) &&
        Objects.equals(this.accountId, updatePortfolioShareInput.accountId) &&
        Objects.equals(this.organizationNode, updatePortfolioShareInput.organizationNode) &&
        Objects.equals(this.shareTagOptions, updatePortfolioShareInput.shareTagOptions) &&
        Objects.equals(this.sharePrincipals, updatePortfolioShareInput.sharePrincipals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, portfolioId, accountId, organizationNode, shareTagOptions, sharePrincipals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePortfolioShareInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    organizationNode: ").append(toIndentedString(organizationNode)).append("\n");
    sb.append("    shareTagOptions: ").append(toIndentedString(shareTagOptions)).append("\n");
    sb.append("    sharePrincipals: ").append(toIndentedString(sharePrincipals)).append("\n");
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
    openapiFields.add("AcceptLanguage");
    openapiFields.add("PortfolioId");
    openapiFields.add("AccountId");
    openapiFields.add("OrganizationNode");
    openapiFields.add("ShareTagOptions");
    openapiFields.add("SharePrincipals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PortfolioId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePortfolioShareInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePortfolioShareInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePortfolioShareInput is not found in the empty JSON string", UpdatePortfolioShareInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePortfolioShareInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePortfolioShareInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePortfolioShareInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the required field `PortfolioId`
      String.validateJsonElement(jsonObj.get("PortfolioId"));
      // validate the optional field `AccountId`
      if (jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccountId"));
      }
      // validate the optional field `OrganizationNode`
      if (jsonObj.get("OrganizationNode") != null && !jsonObj.get("OrganizationNode").isJsonNull()) {
        OrganizationNode.validateJsonElement(jsonObj.get("OrganizationNode"));
      }
      // validate the optional field `ShareTagOptions`
      if (jsonObj.get("ShareTagOptions") != null && !jsonObj.get("ShareTagOptions").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ShareTagOptions"));
      }
      // validate the optional field `SharePrincipals`
      if (jsonObj.get("SharePrincipals") != null && !jsonObj.get("SharePrincipals").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("SharePrincipals"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePortfolioShareInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePortfolioShareInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePortfolioShareInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePortfolioShareInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePortfolioShareInput>() {
           @Override
           public void write(JsonWriter out, UpdatePortfolioShareInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePortfolioShareInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdatePortfolioShareInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePortfolioShareInput
   * @throws IOException if the JSON string is invalid with respect to UpdatePortfolioShareInput
   */
  public static UpdatePortfolioShareInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePortfolioShareInput.class);
  }

  /**
   * Convert an instance of UpdatePortfolioShareInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

