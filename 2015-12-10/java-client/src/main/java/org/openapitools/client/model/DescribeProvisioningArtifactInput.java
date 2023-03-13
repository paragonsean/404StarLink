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
 * DescribeProvisioningArtifactInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeProvisioningArtifactInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID = "ProvisioningArtifactId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID)
  private String provisioningArtifactId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_NAME = "ProvisioningArtifactName";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_NAME)
  private String provisioningArtifactName;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "ProductName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_VERBOSE = "Verbose";
  @SerializedName(SERIALIZED_NAME_VERBOSE)
  private Boolean verbose;

  public DescribeProvisioningArtifactInput() {
  }

  public DescribeProvisioningArtifactInput acceptLanguage(String acceptLanguage) {
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


  public DescribeProvisioningArtifactInput provisioningArtifactId(String provisioningArtifactId) {
    this.provisioningArtifactId = provisioningArtifactId;
    return this;
  }

  /**
   * Get provisioningArtifactId
   * @return provisioningArtifactId
   */
  @javax.annotation.Nullable
  public String getProvisioningArtifactId() {
    return provisioningArtifactId;
  }

  public void setProvisioningArtifactId(String provisioningArtifactId) {
    this.provisioningArtifactId = provisioningArtifactId;
  }


  public DescribeProvisioningArtifactInput productId(String productId) {
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


  public DescribeProvisioningArtifactInput provisioningArtifactName(String provisioningArtifactName) {
    this.provisioningArtifactName = provisioningArtifactName;
    return this;
  }

  /**
   * Get provisioningArtifactName
   * @return provisioningArtifactName
   */
  @javax.annotation.Nullable
  public String getProvisioningArtifactName() {
    return provisioningArtifactName;
  }

  public void setProvisioningArtifactName(String provisioningArtifactName) {
    this.provisioningArtifactName = provisioningArtifactName;
  }


  public DescribeProvisioningArtifactInput productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
   */
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public DescribeProvisioningArtifactInput verbose(Boolean verbose) {
    this.verbose = verbose;
    return this;
  }

  /**
   * Get verbose
   * @return verbose
   */
  @javax.annotation.Nullable
  public Boolean getVerbose() {
    return verbose;
  }

  public void setVerbose(Boolean verbose) {
    this.verbose = verbose;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProvisioningArtifactInput describeProvisioningArtifactInput = (DescribeProvisioningArtifactInput) o;
    return Objects.equals(this.acceptLanguage, describeProvisioningArtifactInput.acceptLanguage) &&
        Objects.equals(this.provisioningArtifactId, describeProvisioningArtifactInput.provisioningArtifactId) &&
        Objects.equals(this.productId, describeProvisioningArtifactInput.productId) &&
        Objects.equals(this.provisioningArtifactName, describeProvisioningArtifactInput.provisioningArtifactName) &&
        Objects.equals(this.productName, describeProvisioningArtifactInput.productName) &&
        Objects.equals(this.verbose, describeProvisioningArtifactInput.verbose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, provisioningArtifactId, productId, provisioningArtifactName, productName, verbose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProvisioningArtifactInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    provisioningArtifactId: ").append(toIndentedString(provisioningArtifactId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    provisioningArtifactName: ").append(toIndentedString(provisioningArtifactName)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    verbose: ").append(toIndentedString(verbose)).append("\n");
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
    openapiFields.add("ProvisioningArtifactId");
    openapiFields.add("ProductId");
    openapiFields.add("ProvisioningArtifactName");
    openapiFields.add("ProductName");
    openapiFields.add("Verbose");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeProvisioningArtifactInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeProvisioningArtifactInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeProvisioningArtifactInput is not found in the empty JSON string", DescribeProvisioningArtifactInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeProvisioningArtifactInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeProvisioningArtifactInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the optional field `ProvisioningArtifactId`
      if (jsonObj.get("ProvisioningArtifactId") != null && !jsonObj.get("ProvisioningArtifactId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactId"));
      }
      // validate the optional field `ProductId`
      if (jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductId"));
      }
      // validate the optional field `ProvisioningArtifactName`
      if (jsonObj.get("ProvisioningArtifactName") != null && !jsonObj.get("ProvisioningArtifactName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactName"));
      }
      // validate the optional field `ProductName`
      if (jsonObj.get("ProductName") != null && !jsonObj.get("ProductName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductName"));
      }
      // validate the optional field `Verbose`
      if (jsonObj.get("Verbose") != null && !jsonObj.get("Verbose").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Verbose"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeProvisioningArtifactInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeProvisioningArtifactInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeProvisioningArtifactInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeProvisioningArtifactInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeProvisioningArtifactInput>() {
           @Override
           public void write(JsonWriter out, DescribeProvisioningArtifactInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeProvisioningArtifactInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeProvisioningArtifactInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeProvisioningArtifactInput
   * @throws IOException if the JSON string is invalid with respect to DescribeProvisioningArtifactInput
   */
  public static DescribeProvisioningArtifactInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeProvisioningArtifactInput.class);
  }

  /**
   * Convert an instance of DescribeProvisioningArtifactInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

