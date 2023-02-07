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
import java.util.List;
import org.openapitools.client.model.CreateProductInputProvisioningArtifactParameters;
import org.openapitools.client.model.CreateProductInputSourceConnection;
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
 * CreateProductInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateProductInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISTRIBUTOR = "Distributor";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTOR)
  private String distributor;

  public static final String SERIALIZED_NAME_SUPPORT_DESCRIPTION = "SupportDescription";
  @SerializedName(SERIALIZED_NAME_SUPPORT_DESCRIPTION)
  private String supportDescription;

  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "SupportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public static final String SERIALIZED_NAME_SUPPORT_URL = "SupportUrl";
  @SerializedName(SERIALIZED_NAME_SUPPORT_URL)
  private String supportUrl;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "ProductType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private ProductType productType;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_PARAMETERS = "ProvisioningArtifactParameters";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_PARAMETERS)
  private CreateProductInputProvisioningArtifactParameters provisioningArtifactParameters;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_TOKEN = "IdempotencyToken";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_TOKEN)
  private String idempotencyToken;

  public static final String SERIALIZED_NAME_SOURCE_CONNECTION = "SourceConnection";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONNECTION)
  private CreateProductInputSourceConnection sourceConnection;

  public CreateProductInput() {
  }

  public CreateProductInput acceptLanguage(String acceptLanguage) {
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


  public CreateProductInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateProductInput owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nonnull
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public CreateProductInput description(String description) {
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


  public CreateProductInput distributor(String distributor) {
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


  public CreateProductInput supportDescription(String supportDescription) {
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


  public CreateProductInput supportEmail(String supportEmail) {
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


  public CreateProductInput supportUrl(String supportUrl) {
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


  public CreateProductInput productType(ProductType productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
   */
  @javax.annotation.Nonnull
  public ProductType getProductType() {
    return productType;
  }

  public void setProductType(ProductType productType) {
    this.productType = productType;
  }


  public CreateProductInput tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public CreateProductInput provisioningArtifactParameters(CreateProductInputProvisioningArtifactParameters provisioningArtifactParameters) {
    this.provisioningArtifactParameters = provisioningArtifactParameters;
    return this;
  }

  /**
   * Get provisioningArtifactParameters
   * @return provisioningArtifactParameters
   */
  @javax.annotation.Nullable
  public CreateProductInputProvisioningArtifactParameters getProvisioningArtifactParameters() {
    return provisioningArtifactParameters;
  }

  public void setProvisioningArtifactParameters(CreateProductInputProvisioningArtifactParameters provisioningArtifactParameters) {
    this.provisioningArtifactParameters = provisioningArtifactParameters;
  }


  public CreateProductInput idempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  /**
   * Get idempotencyToken
   * @return idempotencyToken
   */
  @javax.annotation.Nonnull
  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public void setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
  }


  public CreateProductInput sourceConnection(CreateProductInputSourceConnection sourceConnection) {
    this.sourceConnection = sourceConnection;
    return this;
  }

  /**
   * Get sourceConnection
   * @return sourceConnection
   */
  @javax.annotation.Nullable
  public CreateProductInputSourceConnection getSourceConnection() {
    return sourceConnection;
  }

  public void setSourceConnection(CreateProductInputSourceConnection sourceConnection) {
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
    CreateProductInput createProductInput = (CreateProductInput) o;
    return Objects.equals(this.acceptLanguage, createProductInput.acceptLanguage) &&
        Objects.equals(this.name, createProductInput.name) &&
        Objects.equals(this.owner, createProductInput.owner) &&
        Objects.equals(this.description, createProductInput.description) &&
        Objects.equals(this.distributor, createProductInput.distributor) &&
        Objects.equals(this.supportDescription, createProductInput.supportDescription) &&
        Objects.equals(this.supportEmail, createProductInput.supportEmail) &&
        Objects.equals(this.supportUrl, createProductInput.supportUrl) &&
        Objects.equals(this.productType, createProductInput.productType) &&
        Objects.equals(this.tags, createProductInput.tags) &&
        Objects.equals(this.provisioningArtifactParameters, createProductInput.provisioningArtifactParameters) &&
        Objects.equals(this.idempotencyToken, createProductInput.idempotencyToken) &&
        Objects.equals(this.sourceConnection, createProductInput.sourceConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, name, owner, description, distributor, supportDescription, supportEmail, supportUrl, productType, tags, provisioningArtifactParameters, idempotencyToken, sourceConnection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProductInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    supportDescription: ").append(toIndentedString(supportDescription)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    provisioningArtifactParameters: ").append(toIndentedString(provisioningArtifactParameters)).append("\n");
    sb.append("    idempotencyToken: ").append(toIndentedString(idempotencyToken)).append("\n");
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
    openapiFields.add("AcceptLanguage");
    openapiFields.add("Name");
    openapiFields.add("Owner");
    openapiFields.add("Description");
    openapiFields.add("Distributor");
    openapiFields.add("SupportDescription");
    openapiFields.add("SupportEmail");
    openapiFields.add("SupportUrl");
    openapiFields.add("ProductType");
    openapiFields.add("Tags");
    openapiFields.add("ProvisioningArtifactParameters");
    openapiFields.add("IdempotencyToken");
    openapiFields.add("SourceConnection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Owner");
    openapiRequiredFields.add("ProductType");
    openapiRequiredFields.add("IdempotencyToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateProductInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateProductInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProductInput is not found in the empty JSON string", CreateProductInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateProductInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProductInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateProductInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the required field `Name`
      String.validateJsonElement(jsonObj.get("Name"));
      // validate the required field `Owner`
      String.validateJsonElement(jsonObj.get("Owner"));
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `Distributor`
      if (jsonObj.get("Distributor") != null && !jsonObj.get("Distributor").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Distributor"));
      }
      // validate the optional field `SupportDescription`
      if (jsonObj.get("SupportDescription") != null && !jsonObj.get("SupportDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SupportDescription"));
      }
      // validate the optional field `SupportEmail`
      if (jsonObj.get("SupportEmail") != null && !jsonObj.get("SupportEmail").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SupportEmail"));
      }
      // validate the optional field `SupportUrl`
      if (jsonObj.get("SupportUrl") != null && !jsonObj.get("SupportUrl").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SupportUrl"));
      }
      // validate the required field `ProductType`
      ProductType.validateJsonElement(jsonObj.get("ProductType"));
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
      // validate the optional field `ProvisioningArtifactParameters`
      if (jsonObj.get("ProvisioningArtifactParameters") != null && !jsonObj.get("ProvisioningArtifactParameters").isJsonNull()) {
        CreateProductInputProvisioningArtifactParameters.validateJsonElement(jsonObj.get("ProvisioningArtifactParameters"));
      }
      // validate the required field `IdempotencyToken`
      String.validateJsonElement(jsonObj.get("IdempotencyToken"));
      // validate the optional field `SourceConnection`
      if (jsonObj.get("SourceConnection") != null && !jsonObj.get("SourceConnection").isJsonNull()) {
        CreateProductInputSourceConnection.validateJsonElement(jsonObj.get("SourceConnection"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProductInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProductInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProductInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProductInput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProductInput>() {
           @Override
           public void write(JsonWriter out, CreateProductInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProductInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateProductInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateProductInput
   * @throws IOException if the JSON string is invalid with respect to CreateProductInput
   */
  public static CreateProductInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProductInput.class);
  }

  /**
   * Convert an instance of CreateProductInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

