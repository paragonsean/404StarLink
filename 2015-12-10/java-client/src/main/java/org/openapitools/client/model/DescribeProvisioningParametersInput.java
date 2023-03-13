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
 * DescribeProvisioningParametersInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeProvisioningParametersInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "ProductName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID = "ProvisioningArtifactId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_ID)
  private String provisioningArtifactId;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_NAME = "ProvisioningArtifactName";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_NAME)
  private String provisioningArtifactName;

  public static final String SERIALIZED_NAME_PATH_ID = "PathId";
  @SerializedName(SERIALIZED_NAME_PATH_ID)
  private String pathId;

  public static final String SERIALIZED_NAME_PATH_NAME = "PathName";
  @SerializedName(SERIALIZED_NAME_PATH_NAME)
  private String pathName;

  public DescribeProvisioningParametersInput() {
  }

  public DescribeProvisioningParametersInput acceptLanguage(String acceptLanguage) {
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


  public DescribeProvisioningParametersInput productId(String productId) {
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


  public DescribeProvisioningParametersInput productName(String productName) {
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


  public DescribeProvisioningParametersInput provisioningArtifactId(String provisioningArtifactId) {
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


  public DescribeProvisioningParametersInput provisioningArtifactName(String provisioningArtifactName) {
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


  public DescribeProvisioningParametersInput pathId(String pathId) {
    this.pathId = pathId;
    return this;
  }

  /**
   * Get pathId
   * @return pathId
   */
  @javax.annotation.Nullable
  public String getPathId() {
    return pathId;
  }

  public void setPathId(String pathId) {
    this.pathId = pathId;
  }


  public DescribeProvisioningParametersInput pathName(String pathName) {
    this.pathName = pathName;
    return this;
  }

  /**
   * Get pathName
   * @return pathName
   */
  @javax.annotation.Nullable
  public String getPathName() {
    return pathName;
  }

  public void setPathName(String pathName) {
    this.pathName = pathName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProvisioningParametersInput describeProvisioningParametersInput = (DescribeProvisioningParametersInput) o;
    return Objects.equals(this.acceptLanguage, describeProvisioningParametersInput.acceptLanguage) &&
        Objects.equals(this.productId, describeProvisioningParametersInput.productId) &&
        Objects.equals(this.productName, describeProvisioningParametersInput.productName) &&
        Objects.equals(this.provisioningArtifactId, describeProvisioningParametersInput.provisioningArtifactId) &&
        Objects.equals(this.provisioningArtifactName, describeProvisioningParametersInput.provisioningArtifactName) &&
        Objects.equals(this.pathId, describeProvisioningParametersInput.pathId) &&
        Objects.equals(this.pathName, describeProvisioningParametersInput.pathName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, productId, productName, provisioningArtifactId, provisioningArtifactName, pathId, pathName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProvisioningParametersInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    provisioningArtifactId: ").append(toIndentedString(provisioningArtifactId)).append("\n");
    sb.append("    provisioningArtifactName: ").append(toIndentedString(provisioningArtifactName)).append("\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    pathName: ").append(toIndentedString(pathName)).append("\n");
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
    openapiFields.add("ProductId");
    openapiFields.add("ProductName");
    openapiFields.add("ProvisioningArtifactId");
    openapiFields.add("ProvisioningArtifactName");
    openapiFields.add("PathId");
    openapiFields.add("PathName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeProvisioningParametersInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeProvisioningParametersInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeProvisioningParametersInput is not found in the empty JSON string", DescribeProvisioningParametersInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeProvisioningParametersInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeProvisioningParametersInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the optional field `ProductId`
      if (jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductId"));
      }
      // validate the optional field `ProductName`
      if (jsonObj.get("ProductName") != null && !jsonObj.get("ProductName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductName"));
      }
      // validate the optional field `ProvisioningArtifactId`
      if (jsonObj.get("ProvisioningArtifactId") != null && !jsonObj.get("ProvisioningArtifactId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactId"));
      }
      // validate the optional field `ProvisioningArtifactName`
      if (jsonObj.get("ProvisioningArtifactName") != null && !jsonObj.get("ProvisioningArtifactName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProvisioningArtifactName"));
      }
      // validate the optional field `PathId`
      if (jsonObj.get("PathId") != null && !jsonObj.get("PathId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PathId"));
      }
      // validate the optional field `PathName`
      if (jsonObj.get("PathName") != null && !jsonObj.get("PathName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PathName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeProvisioningParametersInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeProvisioningParametersInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeProvisioningParametersInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeProvisioningParametersInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeProvisioningParametersInput>() {
           @Override
           public void write(JsonWriter out, DescribeProvisioningParametersInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeProvisioningParametersInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeProvisioningParametersInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeProvisioningParametersInput
   * @throws IOException if the JSON string is invalid with respect to DescribeProvisioningParametersInput
   */
  public static DescribeProvisioningParametersInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeProvisioningParametersInput.class);
  }

  /**
   * Convert an instance of DescribeProvisioningParametersInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

