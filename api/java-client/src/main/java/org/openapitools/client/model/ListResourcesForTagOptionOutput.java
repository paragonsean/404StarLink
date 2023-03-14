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
 * ListResourcesForTagOptionOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListResourcesForTagOptionOutput {
  public static final String SERIALIZED_NAME_RESOURCE_DETAILS = "ResourceDetails";
  @SerializedName(SERIALIZED_NAME_RESOURCE_DETAILS)
  private List resourceDetails;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "PageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public ListResourcesForTagOptionOutput() {
  }

  public ListResourcesForTagOptionOutput resourceDetails(List resourceDetails) {
    this.resourceDetails = resourceDetails;
    return this;
  }

  /**
   * Get resourceDetails
   * @return resourceDetails
   */
  @javax.annotation.Nullable
  public List getResourceDetails() {
    return resourceDetails;
  }

  public void setResourceDetails(List resourceDetails) {
    this.resourceDetails = resourceDetails;
  }


  public ListResourcesForTagOptionOutput pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Get pageToken
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResourcesForTagOptionOutput listResourcesForTagOptionOutput = (ListResourcesForTagOptionOutput) o;
    return Objects.equals(this.resourceDetails, listResourcesForTagOptionOutput.resourceDetails) &&
        Objects.equals(this.pageToken, listResourcesForTagOptionOutput.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceDetails, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResourcesForTagOptionOutput {\n");
    sb.append("    resourceDetails: ").append(toIndentedString(resourceDetails)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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
    openapiFields.add("ResourceDetails");
    openapiFields.add("PageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListResourcesForTagOptionOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListResourcesForTagOptionOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListResourcesForTagOptionOutput is not found in the empty JSON string", ListResourcesForTagOptionOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListResourcesForTagOptionOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListResourcesForTagOptionOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ResourceDetails`
      if (jsonObj.get("ResourceDetails") != null && !jsonObj.get("ResourceDetails").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ResourceDetails"));
      }
      // validate the optional field `PageToken`
      if (jsonObj.get("PageToken") != null && !jsonObj.get("PageToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PageToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListResourcesForTagOptionOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListResourcesForTagOptionOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListResourcesForTagOptionOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListResourcesForTagOptionOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListResourcesForTagOptionOutput>() {
           @Override
           public void write(JsonWriter out, ListResourcesForTagOptionOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListResourcesForTagOptionOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListResourcesForTagOptionOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListResourcesForTagOptionOutput
   * @throws IOException if the JSON string is invalid with respect to ListResourcesForTagOptionOutput
   */
  public static ListResourcesForTagOptionOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListResourcesForTagOptionOutput.class);
  }

  /**
   * Convert an instance of ListResourcesForTagOptionOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

