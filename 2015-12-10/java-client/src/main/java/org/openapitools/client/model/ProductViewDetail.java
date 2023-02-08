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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.DescribeProductOutputProductViewSummary;
import org.openapitools.client.model.ProductViewDetailSourceConnection;
import org.openapitools.client.model.Status;

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
 * Information about a product view.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProductViewDetail {
  public static final String SERIALIZED_NAME_PRODUCT_VIEW_SUMMARY = "ProductViewSummary";
  @SerializedName(SERIALIZED_NAME_PRODUCT_VIEW_SUMMARY)
  private DescribeProductOutputProductViewSummary productViewSummary;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_PRODUCT_A_R_N = "ProductARN";
  @SerializedName(SERIALIZED_NAME_PRODUCT_A_R_N)
  private String productARN;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_SOURCE_CONNECTION = "SourceConnection";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONNECTION)
  private ProductViewDetailSourceConnection sourceConnection;

  public ProductViewDetail() {
  }

  public ProductViewDetail productViewSummary(DescribeProductOutputProductViewSummary productViewSummary) {
    this.productViewSummary = productViewSummary;
    return this;
  }

  /**
   * Get productViewSummary
   * @return productViewSummary
   */
  @javax.annotation.Nullable
  public DescribeProductOutputProductViewSummary getProductViewSummary() {
    return productViewSummary;
  }

  public void setProductViewSummary(DescribeProductOutputProductViewSummary productViewSummary) {
    this.productViewSummary = productViewSummary;
  }


  public ProductViewDetail status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }


  public ProductViewDetail productARN(String productARN) {
    this.productARN = productARN;
    return this;
  }

  /**
   * Get productARN
   * @return productARN
   */
  @javax.annotation.Nullable
  public String getProductARN() {
    return productARN;
  }

  public void setProductARN(String productARN) {
    this.productARN = productARN;
  }


  public ProductViewDetail createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public ProductViewDetail sourceConnection(ProductViewDetailSourceConnection sourceConnection) {
    this.sourceConnection = sourceConnection;
    return this;
  }

  /**
   * Get sourceConnection
   * @return sourceConnection
   */
  @javax.annotation.Nullable
  public ProductViewDetailSourceConnection getSourceConnection() {
    return sourceConnection;
  }

  public void setSourceConnection(ProductViewDetailSourceConnection sourceConnection) {
    this.sourceConnection = sourceConnection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductViewDetail productViewDetail = (ProductViewDetail) o;
    return Objects.equals(this.productViewSummary, productViewDetail.productViewSummary) &&
        Objects.equals(this.status, productViewDetail.status) &&
        Objects.equals(this.productARN, productViewDetail.productARN) &&
        Objects.equals(this.createdTime, productViewDetail.createdTime) &&
        Objects.equals(this.sourceConnection, productViewDetail.sourceConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productViewSummary, status, productARN, createdTime, sourceConnection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductViewDetail {\n");
    sb.append("    productViewSummary: ").append(toIndentedString(productViewSummary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productARN: ").append(toIndentedString(productARN)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    sourceConnection: ").append(toIndentedString(sourceConnection)).append("\n");
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
    openapiFields.add("ProductViewSummary");
    openapiFields.add("Status");
    openapiFields.add("ProductARN");
    openapiFields.add("CreatedTime");
    openapiFields.add("SourceConnection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductViewDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductViewDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductViewDetail is not found in the empty JSON string", ProductViewDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductViewDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductViewDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ProductViewSummary`
      if (jsonObj.get("ProductViewSummary") != null && !jsonObj.get("ProductViewSummary").isJsonNull()) {
        DescribeProductOutputProductViewSummary.validateJsonElement(jsonObj.get("ProductViewSummary"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        Status.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `ProductARN`
      if (jsonObj.get("ProductARN") != null && !jsonObj.get("ProductARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductARN"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `SourceConnection`
      if (jsonObj.get("SourceConnection") != null && !jsonObj.get("SourceConnection").isJsonNull()) {
        ProductViewDetailSourceConnection.validateJsonElement(jsonObj.get("SourceConnection"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductViewDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductViewDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductViewDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductViewDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductViewDetail>() {
           @Override
           public void write(JsonWriter out, ProductViewDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductViewDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductViewDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductViewDetail
   * @throws IOException if the JSON string is invalid with respect to ProductViewDetail
   */
  public static ProductViewDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductViewDetail.class);
  }

  /**
   * Convert an instance of ProductViewDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

