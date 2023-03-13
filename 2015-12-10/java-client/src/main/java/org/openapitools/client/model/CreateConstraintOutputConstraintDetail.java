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
 * CreateConstraintOutputConstraintDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateConstraintOutputConstraintDetail {
  public static final String SERIALIZED_NAME_CONSTRAINT_ID = "ConstraintId";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_ID)
  private String constraintId;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "PortfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private String portfolioId;

  public CreateConstraintOutputConstraintDetail() {
  }

  public CreateConstraintOutputConstraintDetail constraintId(String constraintId) {
    this.constraintId = constraintId;
    return this;
  }

  /**
   * Get constraintId
   * @return constraintId
   */
  @javax.annotation.Nullable
  public String getConstraintId() {
    return constraintId;
  }

  public void setConstraintId(String constraintId) {
    this.constraintId = constraintId;
  }


  public CreateConstraintOutputConstraintDetail type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CreateConstraintOutputConstraintDetail description(String description) {
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


  public CreateConstraintOutputConstraintDetail owner(String owner) {
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


  public CreateConstraintOutputConstraintDetail productId(String productId) {
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


  public CreateConstraintOutputConstraintDetail portfolioId(String portfolioId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConstraintOutputConstraintDetail createConstraintOutputConstraintDetail = (CreateConstraintOutputConstraintDetail) o;
    return Objects.equals(this.constraintId, createConstraintOutputConstraintDetail.constraintId) &&
        Objects.equals(this.type, createConstraintOutputConstraintDetail.type) &&
        Objects.equals(this.description, createConstraintOutputConstraintDetail.description) &&
        Objects.equals(this.owner, createConstraintOutputConstraintDetail.owner) &&
        Objects.equals(this.productId, createConstraintOutputConstraintDetail.productId) &&
        Objects.equals(this.portfolioId, createConstraintOutputConstraintDetail.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintId, type, description, owner, productId, portfolioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConstraintOutputConstraintDetail {\n");
    sb.append("    constraintId: ").append(toIndentedString(constraintId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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
    openapiFields.add("ConstraintId");
    openapiFields.add("Type");
    openapiFields.add("Description");
    openapiFields.add("Owner");
    openapiFields.add("ProductId");
    openapiFields.add("PortfolioId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateConstraintOutputConstraintDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateConstraintOutputConstraintDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConstraintOutputConstraintDetail is not found in the empty JSON string", CreateConstraintOutputConstraintDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateConstraintOutputConstraintDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConstraintOutputConstraintDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ConstraintId`
      if (jsonObj.get("ConstraintId") != null && !jsonObj.get("ConstraintId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ConstraintId"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `Owner`
      if (jsonObj.get("Owner") != null && !jsonObj.get("Owner").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Owner"));
      }
      // validate the optional field `ProductId`
      if (jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductId"));
      }
      // validate the optional field `PortfolioId`
      if (jsonObj.get("PortfolioId") != null && !jsonObj.get("PortfolioId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PortfolioId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConstraintOutputConstraintDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConstraintOutputConstraintDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConstraintOutputConstraintDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConstraintOutputConstraintDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConstraintOutputConstraintDetail>() {
           @Override
           public void write(JsonWriter out, CreateConstraintOutputConstraintDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConstraintOutputConstraintDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateConstraintOutputConstraintDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateConstraintOutputConstraintDetail
   * @throws IOException if the JSON string is invalid with respect to CreateConstraintOutputConstraintDetail
   */
  public static CreateConstraintOutputConstraintDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConstraintOutputConstraintDetail.class);
  }

  /**
   * Convert an instance of CreateConstraintOutputConstraintDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

