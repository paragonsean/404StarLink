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
 * ListPortfoliosOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListPortfoliosOutput {
  public static final String SERIALIZED_NAME_PORTFOLIO_DETAILS = "PortfolioDetails";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_DETAILS)
  private List portfolioDetails;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "NextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public ListPortfoliosOutput() {
  }

  public ListPortfoliosOutput portfolioDetails(List portfolioDetails) {
    this.portfolioDetails = portfolioDetails;
    return this;
  }

  /**
   * Get portfolioDetails
   * @return portfolioDetails
   */
  @javax.annotation.Nullable
  public List getPortfolioDetails() {
    return portfolioDetails;
  }

  public void setPortfolioDetails(List portfolioDetails) {
    this.portfolioDetails = portfolioDetails;
  }


  public ListPortfoliosOutput nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Get nextPageToken
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPortfoliosOutput listPortfoliosOutput = (ListPortfoliosOutput) o;
    return Objects.equals(this.portfolioDetails, listPortfoliosOutput.portfolioDetails) &&
        Objects.equals(this.nextPageToken, listPortfoliosOutput.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioDetails, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPortfoliosOutput {\n");
    sb.append("    portfolioDetails: ").append(toIndentedString(portfolioDetails)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("PortfolioDetails");
    openapiFields.add("NextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListPortfoliosOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPortfoliosOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPortfoliosOutput is not found in the empty JSON string", ListPortfoliosOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPortfoliosOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPortfoliosOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `PortfolioDetails`
      if (jsonObj.get("PortfolioDetails") != null && !jsonObj.get("PortfolioDetails").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PortfolioDetails"));
      }
      // validate the optional field `NextPageToken`
      if (jsonObj.get("NextPageToken") != null && !jsonObj.get("NextPageToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextPageToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPortfoliosOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPortfoliosOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPortfoliosOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPortfoliosOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPortfoliosOutput>() {
           @Override
           public void write(JsonWriter out, ListPortfoliosOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPortfoliosOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListPortfoliosOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListPortfoliosOutput
   * @throws IOException if the JSON string is invalid with respect to ListPortfoliosOutput
   */
  public static ListPortfoliosOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPortfoliosOutput.class);
  }

  /**
   * Convert an instance of ListPortfoliosOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

