/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
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
 * ListLensSharesOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListLensSharesOutput {
  public static final String SERIALIZED_NAME_LENS_SHARE_SUMMARIES = "LensShareSummaries";
  @SerializedName(SERIALIZED_NAME_LENS_SHARE_SUMMARIES)
  private List lensShareSummaries;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListLensSharesOutput() {
  }

  public ListLensSharesOutput lensShareSummaries(List lensShareSummaries) {
    this.lensShareSummaries = lensShareSummaries;
    return this;
  }

  /**
   * Get lensShareSummaries
   * @return lensShareSummaries
   */
  @javax.annotation.Nullable
  public List getLensShareSummaries() {
    return lensShareSummaries;
  }

  public void setLensShareSummaries(List lensShareSummaries) {
    this.lensShareSummaries = lensShareSummaries;
  }


  public ListLensSharesOutput nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * The token to use to retrieve the next set of results.
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLensSharesOutput listLensSharesOutput = (ListLensSharesOutput) o;
    return Objects.equals(this.lensShareSummaries, listLensSharesOutput.lensShareSummaries) &&
        Objects.equals(this.nextToken, listLensSharesOutput.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lensShareSummaries, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLensSharesOutput {\n");
    sb.append("    lensShareSummaries: ").append(toIndentedString(lensShareSummaries)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("LensShareSummaries");
    openapiFields.add("NextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListLensSharesOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListLensSharesOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListLensSharesOutput is not found in the empty JSON string", ListLensSharesOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListLensSharesOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListLensSharesOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LensShareSummaries`
      if (jsonObj.get("LensShareSummaries") != null && !jsonObj.get("LensShareSummaries").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("LensShareSummaries"));
      }
      if ((jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) && !jsonObj.get("NextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NextToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListLensSharesOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListLensSharesOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListLensSharesOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListLensSharesOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListLensSharesOutput>() {
           @Override
           public void write(JsonWriter out, ListLensSharesOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListLensSharesOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListLensSharesOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListLensSharesOutput
   * @throws IOException if the JSON string is invalid with respect to ListLensSharesOutput
   */
  public static ListLensSharesOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListLensSharesOutput.class);
  }

  /**
   * Convert an instance of ListLensSharesOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

