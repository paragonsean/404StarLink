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
import org.openapitools.client.model.CreatePortfolioOutputPortfolioDetail;

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
 * CreatePortfolioOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreatePortfolioOutput {
  public static final String SERIALIZED_NAME_PORTFOLIO_DETAIL = "PortfolioDetail";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_DETAIL)
  private CreatePortfolioOutputPortfolioDetail portfolioDetail;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreatePortfolioOutput() {
  }

  public CreatePortfolioOutput portfolioDetail(CreatePortfolioOutputPortfolioDetail portfolioDetail) {
    this.portfolioDetail = portfolioDetail;
    return this;
  }

  /**
   * Get portfolioDetail
   * @return portfolioDetail
   */
  @javax.annotation.Nullable
  public CreatePortfolioOutputPortfolioDetail getPortfolioDetail() {
    return portfolioDetail;
  }

  public void setPortfolioDetail(CreatePortfolioOutputPortfolioDetail portfolioDetail) {
    this.portfolioDetail = portfolioDetail;
  }


  public CreatePortfolioOutput tags(List tags) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePortfolioOutput createPortfolioOutput = (CreatePortfolioOutput) o;
    return Objects.equals(this.portfolioDetail, createPortfolioOutput.portfolioDetail) &&
        Objects.equals(this.tags, createPortfolioOutput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioDetail, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePortfolioOutput {\n");
    sb.append("    portfolioDetail: ").append(toIndentedString(portfolioDetail)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("PortfolioDetail");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatePortfolioOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePortfolioOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePortfolioOutput is not found in the empty JSON string", CreatePortfolioOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePortfolioOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePortfolioOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `PortfolioDetail`
      if (jsonObj.get("PortfolioDetail") != null && !jsonObj.get("PortfolioDetail").isJsonNull()) {
        CreatePortfolioOutputPortfolioDetail.validateJsonElement(jsonObj.get("PortfolioDetail"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePortfolioOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePortfolioOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePortfolioOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePortfolioOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePortfolioOutput>() {
           @Override
           public void write(JsonWriter out, CreatePortfolioOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePortfolioOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatePortfolioOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePortfolioOutput
   * @throws IOException if the JSON string is invalid with respect to CreatePortfolioOutput
   */
  public static CreatePortfolioOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePortfolioOutput.class);
  }

  /**
   * Convert an instance of CreatePortfolioOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

