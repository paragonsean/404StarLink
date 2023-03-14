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
import org.openapitools.client.model.DescribePortfolioShareStatusOutputShareDetails;
import org.openapitools.client.model.ShareStatus;

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
 * DescribePortfolioShareStatusOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribePortfolioShareStatusOutput {
  public static final String SERIALIZED_NAME_PORTFOLIO_SHARE_TOKEN = "PortfolioShareToken";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_SHARE_TOKEN)
  private String portfolioShareToken;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "PortfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private String portfolioId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NODE_VALUE = "OrganizationNodeValue";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NODE_VALUE)
  private String organizationNodeValue;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ShareStatus status;

  public static final String SERIALIZED_NAME_SHARE_DETAILS = "ShareDetails";
  @SerializedName(SERIALIZED_NAME_SHARE_DETAILS)
  private DescribePortfolioShareStatusOutputShareDetails shareDetails;

  public DescribePortfolioShareStatusOutput() {
  }

  public DescribePortfolioShareStatusOutput portfolioShareToken(String portfolioShareToken) {
    this.portfolioShareToken = portfolioShareToken;
    return this;
  }

  /**
   * Get portfolioShareToken
   * @return portfolioShareToken
   */
  @javax.annotation.Nullable
  public String getPortfolioShareToken() {
    return portfolioShareToken;
  }

  public void setPortfolioShareToken(String portfolioShareToken) {
    this.portfolioShareToken = portfolioShareToken;
  }


  public DescribePortfolioShareStatusOutput portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

  /**
   * Get portfolioId
   * @return portfolioId
   */
  @javax.annotation.Nullable
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }


  public DescribePortfolioShareStatusOutput organizationNodeValue(String organizationNodeValue) {
    this.organizationNodeValue = organizationNodeValue;
    return this;
  }

  /**
   * Get organizationNodeValue
   * @return organizationNodeValue
   */
  @javax.annotation.Nullable
  public String getOrganizationNodeValue() {
    return organizationNodeValue;
  }

  public void setOrganizationNodeValue(String organizationNodeValue) {
    this.organizationNodeValue = organizationNodeValue;
  }


  public DescribePortfolioShareStatusOutput status(ShareStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ShareStatus getStatus() {
    return status;
  }

  public void setStatus(ShareStatus status) {
    this.status = status;
  }


  public DescribePortfolioShareStatusOutput shareDetails(DescribePortfolioShareStatusOutputShareDetails shareDetails) {
    this.shareDetails = shareDetails;
    return this;
  }

  /**
   * Get shareDetails
   * @return shareDetails
   */
  @javax.annotation.Nullable
  public DescribePortfolioShareStatusOutputShareDetails getShareDetails() {
    return shareDetails;
  }

  public void setShareDetails(DescribePortfolioShareStatusOutputShareDetails shareDetails) {
    this.shareDetails = shareDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribePortfolioShareStatusOutput describePortfolioShareStatusOutput = (DescribePortfolioShareStatusOutput) o;
    return Objects.equals(this.portfolioShareToken, describePortfolioShareStatusOutput.portfolioShareToken) &&
        Objects.equals(this.portfolioId, describePortfolioShareStatusOutput.portfolioId) &&
        Objects.equals(this.organizationNodeValue, describePortfolioShareStatusOutput.organizationNodeValue) &&
        Objects.equals(this.status, describePortfolioShareStatusOutput.status) &&
        Objects.equals(this.shareDetails, describePortfolioShareStatusOutput.shareDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioShareToken, portfolioId, organizationNodeValue, status, shareDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePortfolioShareStatusOutput {\n");
    sb.append("    portfolioShareToken: ").append(toIndentedString(portfolioShareToken)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    organizationNodeValue: ").append(toIndentedString(organizationNodeValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shareDetails: ").append(toIndentedString(shareDetails)).append("\n");
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
    openapiFields.add("PortfolioShareToken");
    openapiFields.add("PortfolioId");
    openapiFields.add("OrganizationNodeValue");
    openapiFields.add("Status");
    openapiFields.add("ShareDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribePortfolioShareStatusOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribePortfolioShareStatusOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribePortfolioShareStatusOutput is not found in the empty JSON string", DescribePortfolioShareStatusOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribePortfolioShareStatusOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribePortfolioShareStatusOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `PortfolioShareToken`
      if (jsonObj.get("PortfolioShareToken") != null && !jsonObj.get("PortfolioShareToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PortfolioShareToken"));
      }
      // validate the optional field `PortfolioId`
      if (jsonObj.get("PortfolioId") != null && !jsonObj.get("PortfolioId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PortfolioId"));
      }
      // validate the optional field `OrganizationNodeValue`
      if (jsonObj.get("OrganizationNodeValue") != null && !jsonObj.get("OrganizationNodeValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OrganizationNodeValue"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ShareStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `ShareDetails`
      if (jsonObj.get("ShareDetails") != null && !jsonObj.get("ShareDetails").isJsonNull()) {
        DescribePortfolioShareStatusOutputShareDetails.validateJsonElement(jsonObj.get("ShareDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribePortfolioShareStatusOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribePortfolioShareStatusOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribePortfolioShareStatusOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribePortfolioShareStatusOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribePortfolioShareStatusOutput>() {
           @Override
           public void write(JsonWriter out, DescribePortfolioShareStatusOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribePortfolioShareStatusOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribePortfolioShareStatusOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribePortfolioShareStatusOutput
   * @throws IOException if the JSON string is invalid with respect to DescribePortfolioShareStatusOutput
   */
  public static DescribePortfolioShareStatusOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribePortfolioShareStatusOutput.class);
  }

  /**
   * Convert an instance of DescribePortfolioShareStatusOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

