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
import org.openapitools.client.model.CreateProductOutputProductViewDetail;

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
 * DescribeProductAsAdminOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeProductAsAdminOutput {
  public static final String SERIALIZED_NAME_PRODUCT_VIEW_DETAIL = "ProductViewDetail";
  @SerializedName(SERIALIZED_NAME_PRODUCT_VIEW_DETAIL)
  private CreateProductOutputProductViewDetail productViewDetail;

  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_SUMMARIES = "ProvisioningArtifactSummaries";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_SUMMARIES)
  private List provisioningArtifactSummaries;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_TAG_OPTIONS = "TagOptions";
  @SerializedName(SERIALIZED_NAME_TAG_OPTIONS)
  private List tagOptions;

  public static final String SERIALIZED_NAME_BUDGETS = "Budgets";
  @SerializedName(SERIALIZED_NAME_BUDGETS)
  private List budgets;

  public DescribeProductAsAdminOutput() {
  }

  public DescribeProductAsAdminOutput productViewDetail(CreateProductOutputProductViewDetail productViewDetail) {
    this.productViewDetail = productViewDetail;
    return this;
  }

  /**
   * Get productViewDetail
   * @return productViewDetail
   */
  @javax.annotation.Nullable
  public CreateProductOutputProductViewDetail getProductViewDetail() {
    return productViewDetail;
  }

  public void setProductViewDetail(CreateProductOutputProductViewDetail productViewDetail) {
    this.productViewDetail = productViewDetail;
  }


  public DescribeProductAsAdminOutput provisioningArtifactSummaries(List provisioningArtifactSummaries) {
    this.provisioningArtifactSummaries = provisioningArtifactSummaries;
    return this;
  }

  /**
   * Get provisioningArtifactSummaries
   * @return provisioningArtifactSummaries
   */
  @javax.annotation.Nullable
  public List getProvisioningArtifactSummaries() {
    return provisioningArtifactSummaries;
  }

  public void setProvisioningArtifactSummaries(List provisioningArtifactSummaries) {
    this.provisioningArtifactSummaries = provisioningArtifactSummaries;
  }


  public DescribeProductAsAdminOutput tags(List tags) {
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


  public DescribeProductAsAdminOutput tagOptions(List tagOptions) {
    this.tagOptions = tagOptions;
    return this;
  }

  /**
   * Get tagOptions
   * @return tagOptions
   */
  @javax.annotation.Nullable
  public List getTagOptions() {
    return tagOptions;
  }

  public void setTagOptions(List tagOptions) {
    this.tagOptions = tagOptions;
  }


  public DescribeProductAsAdminOutput budgets(List budgets) {
    this.budgets = budgets;
    return this;
  }

  /**
   * Get budgets
   * @return budgets
   */
  @javax.annotation.Nullable
  public List getBudgets() {
    return budgets;
  }

  public void setBudgets(List budgets) {
    this.budgets = budgets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProductAsAdminOutput describeProductAsAdminOutput = (DescribeProductAsAdminOutput) o;
    return Objects.equals(this.productViewDetail, describeProductAsAdminOutput.productViewDetail) &&
        Objects.equals(this.provisioningArtifactSummaries, describeProductAsAdminOutput.provisioningArtifactSummaries) &&
        Objects.equals(this.tags, describeProductAsAdminOutput.tags) &&
        Objects.equals(this.tagOptions, describeProductAsAdminOutput.tagOptions) &&
        Objects.equals(this.budgets, describeProductAsAdminOutput.budgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productViewDetail, provisioningArtifactSummaries, tags, tagOptions, budgets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProductAsAdminOutput {\n");
    sb.append("    productViewDetail: ").append(toIndentedString(productViewDetail)).append("\n");
    sb.append("    provisioningArtifactSummaries: ").append(toIndentedString(provisioningArtifactSummaries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagOptions: ").append(toIndentedString(tagOptions)).append("\n");
    sb.append("    budgets: ").append(toIndentedString(budgets)).append("\n");
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
    openapiFields.add("ProductViewDetail");
    openapiFields.add("ProvisioningArtifactSummaries");
    openapiFields.add("Tags");
    openapiFields.add("TagOptions");
    openapiFields.add("Budgets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeProductAsAdminOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeProductAsAdminOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeProductAsAdminOutput is not found in the empty JSON string", DescribeProductAsAdminOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeProductAsAdminOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeProductAsAdminOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ProductViewDetail`
      if (jsonObj.get("ProductViewDetail") != null && !jsonObj.get("ProductViewDetail").isJsonNull()) {
        CreateProductOutputProductViewDetail.validateJsonElement(jsonObj.get("ProductViewDetail"));
      }
      // validate the optional field `ProvisioningArtifactSummaries`
      if (jsonObj.get("ProvisioningArtifactSummaries") != null && !jsonObj.get("ProvisioningArtifactSummaries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProvisioningArtifactSummaries"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
      // validate the optional field `TagOptions`
      if (jsonObj.get("TagOptions") != null && !jsonObj.get("TagOptions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TagOptions"));
      }
      // validate the optional field `Budgets`
      if (jsonObj.get("Budgets") != null && !jsonObj.get("Budgets").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Budgets"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeProductAsAdminOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeProductAsAdminOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeProductAsAdminOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeProductAsAdminOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeProductAsAdminOutput>() {
           @Override
           public void write(JsonWriter out, DescribeProductAsAdminOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeProductAsAdminOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeProductAsAdminOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeProductAsAdminOutput
   * @throws IOException if the JSON string is invalid with respect to DescribeProductAsAdminOutput
   */
  public static DescribeProductAsAdminOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeProductAsAdminOutput.class);
  }

  /**
   * Convert an instance of DescribeProductAsAdminOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

