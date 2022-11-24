/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
 *
 * The version of the OpenAPI document: v1
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup;

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
 * The response to a &#x60;ListRelatedAccountGroups&#x60; call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:37.006704-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_RELATED_ACCOUNT_GROUPS = "relatedAccountGroups";
  @SerializedName(SERIALIZED_NAME_RELATED_ACCOUNT_GROUPS)
  private List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup> relatedAccountGroups = new ArrayList<>();

  public GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse() {
  }

  public GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token, which can be sent as &#x60;page_token&#x60; to retrieve the next page. If this field is omitted, there are no subsequent pages.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse relatedAccountGroups(List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup> relatedAccountGroups) {
    this.relatedAccountGroups = relatedAccountGroups;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse addRelatedAccountGroupsItem(GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup relatedAccountGroupsItem) {
    if (this.relatedAccountGroups == null) {
      this.relatedAccountGroups = new ArrayList<>();
    }
    this.relatedAccountGroups.add(relatedAccountGroupsItem);
    return this;
  }

  /**
   * The groups of related accounts listed by the query.
   * @return relatedAccountGroups
   */
  @javax.annotation.Nullable
  public List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup> getRelatedAccountGroups() {
    return relatedAccountGroups;
  }

  public void setRelatedAccountGroups(List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup> relatedAccountGroups) {
    this.relatedAccountGroups = relatedAccountGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse googleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse = (GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse) o;
    return Objects.equals(this.nextPageToken, googleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.nextPageToken) &&
        Objects.equals(this.relatedAccountGroups, googleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.relatedAccountGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, relatedAccountGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    relatedAccountGroups: ").append(toIndentedString(relatedAccountGroups)).append("\n");
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
    openapiFields.add("nextPageToken");
    openapiFields.add("relatedAccountGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("relatedAccountGroups") != null && !jsonObj.get("relatedAccountGroups").isJsonNull()) {
        JsonArray jsonArrayrelatedAccountGroups = jsonObj.getAsJsonArray("relatedAccountGroups");
        if (jsonArrayrelatedAccountGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relatedAccountGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relatedAccountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("relatedAccountGroups").toString()));
          }

          // validate the optional field `relatedAccountGroups` (array)
          for (int i = 0; i < jsonArrayrelatedAccountGroups.size(); i++) {
            GoogleCloudRecaptchaenterpriseV1RelatedAccountGroup.validateJsonElement(jsonArrayrelatedAccountGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse
   */
  public static GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

