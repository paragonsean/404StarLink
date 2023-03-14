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
import org.openapitools.client.model.ProductType;

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
 * DescribeProductViewOutputProductViewSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeProductViewOutputProductViewSummary {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "ShortDescription";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ProductType type;

  public static final String SERIALIZED_NAME_DISTRIBUTOR = "Distributor";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTOR)
  private String distributor;

  public static final String SERIALIZED_NAME_HAS_DEFAULT_PATH = "HasDefaultPath";
  @SerializedName(SERIALIZED_NAME_HAS_DEFAULT_PATH)
  private Boolean hasDefaultPath;

  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "SupportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public static final String SERIALIZED_NAME_SUPPORT_DESCRIPTION = "SupportDescription";
  @SerializedName(SERIALIZED_NAME_SUPPORT_DESCRIPTION)
  private String supportDescription;

  public static final String SERIALIZED_NAME_SUPPORT_URL = "SupportUrl";
  @SerializedName(SERIALIZED_NAME_SUPPORT_URL)
  private String supportUrl;

  public DescribeProductViewOutputProductViewSummary() {
  }

  public DescribeProductViewOutputProductViewSummary id(String id) {
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


  public DescribeProductViewOutputProductViewSummary productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public DescribeProductViewOutputProductViewSummary name(String name) {
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


  public DescribeProductViewOutputProductViewSummary owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public DescribeProductViewOutputProductViewSummary shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Get shortDescription
   * @return shortDescription
   */
  @javax.annotation.Nullable
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public DescribeProductViewOutputProductViewSummary type(ProductType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public ProductType getType() {
    return type;
  }

  public void setType(ProductType type) {
    this.type = type;
  }


  public DescribeProductViewOutputProductViewSummary distributor(String distributor) {
    this.distributor = distributor;
    return this;
  }

  /**
   * Get distributor
   * @return distributor
   */
  @javax.annotation.Nullable
  public String getDistributor() {
    return distributor;
  }

  public void setDistributor(String distributor) {
    this.distributor = distributor;
  }


  public DescribeProductViewOutputProductViewSummary hasDefaultPath(Boolean hasDefaultPath) {
    this.hasDefaultPath = hasDefaultPath;
    return this;
  }

  /**
   * Get hasDefaultPath
   * @return hasDefaultPath
   */
  @javax.annotation.Nullable
  public Boolean getHasDefaultPath() {
    return hasDefaultPath;
  }

  public void setHasDefaultPath(Boolean hasDefaultPath) {
    this.hasDefaultPath = hasDefaultPath;
  }


  public DescribeProductViewOutputProductViewSummary supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

  /**
   * Get supportEmail
   * @return supportEmail
   */
  @javax.annotation.Nullable
  public String getSupportEmail() {
    return supportEmail;
  }

  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }


  public DescribeProductViewOutputProductViewSummary supportDescription(String supportDescription) {
    this.supportDescription = supportDescription;
    return this;
  }

  /**
   * Get supportDescription
   * @return supportDescription
   */
  @javax.annotation.Nullable
  public String getSupportDescription() {
    return supportDescription;
  }

  public void setSupportDescription(String supportDescription) {
    this.supportDescription = supportDescription;
  }


  public DescribeProductViewOutputProductViewSummary supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

  /**
   * Get supportUrl
   * @return supportUrl
   */
  @javax.annotation.Nullable
  public String getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProductViewOutputProductViewSummary describeProductViewOutputProductViewSummary = (DescribeProductViewOutputProductViewSummary) o;
    return Objects.equals(this.id, describeProductViewOutputProductViewSummary.id) &&
        Objects.equals(this.productId, describeProductViewOutputProductViewSummary.productId) &&
        Objects.equals(this.name, describeProductViewOutputProductViewSummary.name) &&
        Objects.equals(this.owner, describeProductViewOutputProductViewSummary.owner) &&
        Objects.equals(this.shortDescription, describeProductViewOutputProductViewSummary.shortDescription) &&
        Objects.equals(this.type, describeProductViewOutputProductViewSummary.type) &&
        Objects.equals(this.distributor, describeProductViewOutputProductViewSummary.distributor) &&
        Objects.equals(this.hasDefaultPath, describeProductViewOutputProductViewSummary.hasDefaultPath) &&
        Objects.equals(this.supportEmail, describeProductViewOutputProductViewSummary.supportEmail) &&
        Objects.equals(this.supportDescription, describeProductViewOutputProductViewSummary.supportDescription) &&
        Objects.equals(this.supportUrl, describeProductViewOutputProductViewSummary.supportUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, name, owner, shortDescription, type, distributor, hasDefaultPath, supportEmail, supportDescription, supportUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProductViewOutputProductViewSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    hasDefaultPath: ").append(toIndentedString(hasDefaultPath)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    supportDescription: ").append(toIndentedString(supportDescription)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("ProductId");
    openapiFields.add("Name");
    openapiFields.add("Owner");
    openapiFields.add("ShortDescription");
    openapiFields.add("Type");
    openapiFields.add("Distributor");
    openapiFields.add("HasDefaultPath");
    openapiFields.add("SupportEmail");
    openapiFields.add("SupportDescription");
    openapiFields.add("SupportUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeProductViewOutputProductViewSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeProductViewOutputProductViewSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeProductViewOutputProductViewSummary is not found in the empty JSON string", DescribeProductViewOutputProductViewSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeProductViewOutputProductViewSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeProductViewOutputProductViewSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `ProductId`
      if (jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductId"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Owner`
      if (jsonObj.get("Owner") != null && !jsonObj.get("Owner").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Owner"));
      }
      // validate the optional field `ShortDescription`
      if (jsonObj.get("ShortDescription") != null && !jsonObj.get("ShortDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ShortDescription"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        ProductType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `Distributor`
      if (jsonObj.get("Distributor") != null && !jsonObj.get("Distributor").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Distributor"));
      }
      // validate the optional field `HasDefaultPath`
      if (jsonObj.get("HasDefaultPath") != null && !jsonObj.get("HasDefaultPath").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("HasDefaultPath"));
      }
      // validate the optional field `SupportEmail`
      if (jsonObj.get("SupportEmail") != null && !jsonObj.get("SupportEmail").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SupportEmail"));
      }
      // validate the optional field `SupportDescription`
      if (jsonObj.get("SupportDescription") != null && !jsonObj.get("SupportDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SupportDescription"));
      }
      // validate the optional field `SupportUrl`
      if (jsonObj.get("SupportUrl") != null && !jsonObj.get("SupportUrl").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SupportUrl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeProductViewOutputProductViewSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeProductViewOutputProductViewSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeProductViewOutputProductViewSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeProductViewOutputProductViewSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeProductViewOutputProductViewSummary>() {
           @Override
           public void write(JsonWriter out, DescribeProductViewOutputProductViewSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeProductViewOutputProductViewSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeProductViewOutputProductViewSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeProductViewOutputProductViewSummary
   * @throws IOException if the JSON string is invalid with respect to DescribeProductViewOutputProductViewSummary
   */
  public static DescribeProductViewOutputProductViewSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeProductViewOutputProductViewSummary.class);
  }

  /**
   * Convert an instance of DescribeProductViewOutputProductViewSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

