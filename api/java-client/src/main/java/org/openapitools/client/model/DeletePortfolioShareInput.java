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
import org.openapitools.client.model.DeletePortfolioShareInputOrganizationNode;

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
 * DeletePortfolioShareInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeletePortfolioShareInput {
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
  private DeletePortfolioShareInputOrganizationNode organizationNode;

  public DeletePortfolioShareInput() {
  }

  public DeletePortfolioShareInput acceptLanguage(String acceptLanguage) {
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


  public DeletePortfolioShareInput portfolioId(String portfolioId) {
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


  public DeletePortfolioShareInput accountId(String accountId) {
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


  public DeletePortfolioShareInput organizationNode(DeletePortfolioShareInputOrganizationNode organizationNode) {
    this.organizationNode = organizationNode;
    return this;
  }

  /**
   * Get organizationNode
   * @return organizationNode
   */
  @javax.annotation.Nullable
  public DeletePortfolioShareInputOrganizationNode getOrganizationNode() {
    return organizationNode;
  }

  public void setOrganizationNode(DeletePortfolioShareInputOrganizationNode organizationNode) {
    this.organizationNode = organizationNode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePortfolioShareInput deletePortfolioShareInput = (DeletePortfolioShareInput) o;
    return Objects.equals(this.acceptLanguage, deletePortfolioShareInput.acceptLanguage) &&
        Objects.equals(this.portfolioId, deletePortfolioShareInput.portfolioId) &&
        Objects.equals(this.accountId, deletePortfolioShareInput.accountId) &&
        Objects.equals(this.organizationNode, deletePortfolioShareInput.organizationNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, portfolioId, accountId, organizationNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePortfolioShareInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    organizationNode: ").append(toIndentedString(organizationNode)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PortfolioId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeletePortfolioShareInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeletePortfolioShareInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeletePortfolioShareInput is not found in the empty JSON string", DeletePortfolioShareInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeletePortfolioShareInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeletePortfolioShareInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeletePortfolioShareInput.openapiRequiredFields) {
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
        DeletePortfolioShareInputOrganizationNode.validateJsonElement(jsonObj.get("OrganizationNode"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeletePortfolioShareInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeletePortfolioShareInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeletePortfolioShareInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeletePortfolioShareInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DeletePortfolioShareInput>() {
           @Override
           public void write(JsonWriter out, DeletePortfolioShareInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeletePortfolioShareInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeletePortfolioShareInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeletePortfolioShareInput
   * @throws IOException if the JSON string is invalid with respect to DeletePortfolioShareInput
   */
  public static DeletePortfolioShareInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeletePortfolioShareInput.class);
  }

  /**
   * Convert an instance of DeletePortfolioShareInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

