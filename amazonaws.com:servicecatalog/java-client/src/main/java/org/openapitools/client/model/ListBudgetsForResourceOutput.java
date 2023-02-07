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
 * ListBudgetsForResourceOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListBudgetsForResourceOutput {
  public static final String SERIALIZED_NAME_BUDGETS = "Budgets";
  @SerializedName(SERIALIZED_NAME_BUDGETS)
  private List budgets;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "NextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public ListBudgetsForResourceOutput() {
  }

  public ListBudgetsForResourceOutput budgets(List budgets) {
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


  public ListBudgetsForResourceOutput nextPageToken(String nextPageToken) {
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
    ListBudgetsForResourceOutput listBudgetsForResourceOutput = (ListBudgetsForResourceOutput) o;
    return Objects.equals(this.budgets, listBudgetsForResourceOutput.budgets) &&
        Objects.equals(this.nextPageToken, listBudgetsForResourceOutput.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgets, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBudgetsForResourceOutput {\n");
    sb.append("    budgets: ").append(toIndentedString(budgets)).append("\n");
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
    openapiFields.add("Budgets");
    openapiFields.add("NextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListBudgetsForResourceOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBudgetsForResourceOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBudgetsForResourceOutput is not found in the empty JSON string", ListBudgetsForResourceOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBudgetsForResourceOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBudgetsForResourceOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Budgets`
      if (jsonObj.get("Budgets") != null && !jsonObj.get("Budgets").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Budgets"));
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
       if (!ListBudgetsForResourceOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBudgetsForResourceOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBudgetsForResourceOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBudgetsForResourceOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBudgetsForResourceOutput>() {
           @Override
           public void write(JsonWriter out, ListBudgetsForResourceOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBudgetsForResourceOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListBudgetsForResourceOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListBudgetsForResourceOutput
   * @throws IOException if the JSON string is invalid with respect to ListBudgetsForResourceOutput
   */
  public static ListBudgetsForResourceOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBudgetsForResourceOutput.class);
  }

  /**
   * Convert an instance of ListBudgetsForResourceOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

