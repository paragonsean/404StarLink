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
import org.openapitools.client.model.OrganizationNodeType;

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
 * ListOrganizationPortfolioAccessInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListOrganizationPortfolioAccessInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "PortfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private String portfolioId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NODE_TYPE = "OrganizationNodeType";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NODE_TYPE)
  private OrganizationNodeType organizationNodeType;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "PageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "PageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public ListOrganizationPortfolioAccessInput() {
  }

  public ListOrganizationPortfolioAccessInput acceptLanguage(String acceptLanguage) {
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


  public ListOrganizationPortfolioAccessInput portfolioId(String portfolioId) {
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


  public ListOrganizationPortfolioAccessInput organizationNodeType(OrganizationNodeType organizationNodeType) {
    this.organizationNodeType = organizationNodeType;
    return this;
  }

  /**
   * Get organizationNodeType
   * @return organizationNodeType
   */
  @javax.annotation.Nonnull
  public OrganizationNodeType getOrganizationNodeType() {
    return organizationNodeType;
  }

  public void setOrganizationNodeType(OrganizationNodeType organizationNodeType) {
    this.organizationNodeType = organizationNodeType;
  }


  public ListOrganizationPortfolioAccessInput pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Get pageToken
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  public ListOrganizationPortfolioAccessInput pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOrganizationPortfolioAccessInput listOrganizationPortfolioAccessInput = (ListOrganizationPortfolioAccessInput) o;
    return Objects.equals(this.acceptLanguage, listOrganizationPortfolioAccessInput.acceptLanguage) &&
        Objects.equals(this.portfolioId, listOrganizationPortfolioAccessInput.portfolioId) &&
        Objects.equals(this.organizationNodeType, listOrganizationPortfolioAccessInput.organizationNodeType) &&
        Objects.equals(this.pageToken, listOrganizationPortfolioAccessInput.pageToken) &&
        Objects.equals(this.pageSize, listOrganizationPortfolioAccessInput.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, portfolioId, organizationNodeType, pageToken, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOrganizationPortfolioAccessInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    organizationNodeType: ").append(toIndentedString(organizationNodeType)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("OrganizationNodeType");
    openapiFields.add("PageToken");
    openapiFields.add("PageSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PortfolioId");
    openapiRequiredFields.add("OrganizationNodeType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListOrganizationPortfolioAccessInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListOrganizationPortfolioAccessInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOrganizationPortfolioAccessInput is not found in the empty JSON string", ListOrganizationPortfolioAccessInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListOrganizationPortfolioAccessInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOrganizationPortfolioAccessInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListOrganizationPortfolioAccessInput.openapiRequiredFields) {
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
      // validate the required field `OrganizationNodeType`
      OrganizationNodeType.validateJsonElement(jsonObj.get("OrganizationNodeType"));
      // validate the optional field `PageToken`
      if (jsonObj.get("PageToken") != null && !jsonObj.get("PageToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PageToken"));
      }
      // validate the optional field `PageSize`
      if (jsonObj.get("PageSize") != null && !jsonObj.get("PageSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("PageSize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOrganizationPortfolioAccessInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOrganizationPortfolioAccessInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOrganizationPortfolioAccessInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOrganizationPortfolioAccessInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOrganizationPortfolioAccessInput>() {
           @Override
           public void write(JsonWriter out, ListOrganizationPortfolioAccessInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOrganizationPortfolioAccessInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListOrganizationPortfolioAccessInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListOrganizationPortfolioAccessInput
   * @throws IOException if the JSON string is invalid with respect to ListOrganizationPortfolioAccessInput
   */
  public static ListOrganizationPortfolioAccessInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOrganizationPortfolioAccessInput.class);
  }

  /**
   * Convert an instance of ListOrganizationPortfolioAccessInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

