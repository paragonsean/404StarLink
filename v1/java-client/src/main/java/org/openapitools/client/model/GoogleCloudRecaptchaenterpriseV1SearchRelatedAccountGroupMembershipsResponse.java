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
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership;

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
 * The response to a &#x60;SearchRelatedAccountGroupMemberships&#x60; call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:52.022302-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_RELATED_ACCOUNT_GROUP_MEMBERSHIPS = "relatedAccountGroupMemberships";
  @SerializedName(SERIALIZED_NAME_RELATED_ACCOUNT_GROUP_MEMBERSHIPS)
  private List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership> relatedAccountGroupMemberships = new ArrayList<>();

  public GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse() {
  }

  public GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse nextPageToken(String nextPageToken) {
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


  public GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse relatedAccountGroupMemberships(List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership> relatedAccountGroupMemberships) {
    this.relatedAccountGroupMemberships = relatedAccountGroupMemberships;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse addRelatedAccountGroupMembershipsItem(GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership relatedAccountGroupMembershipsItem) {
    if (this.relatedAccountGroupMemberships == null) {
      this.relatedAccountGroupMemberships = new ArrayList<>();
    }
    this.relatedAccountGroupMemberships.add(relatedAccountGroupMembershipsItem);
    return this;
  }

  /**
   * The queried memberships.
   * @return relatedAccountGroupMemberships
   */
  @javax.annotation.Nullable
  public List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership> getRelatedAccountGroupMemberships() {
    return relatedAccountGroupMemberships;
  }

  public void setRelatedAccountGroupMemberships(List<GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership> relatedAccountGroupMemberships) {
    this.relatedAccountGroupMemberships = relatedAccountGroupMemberships;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse googleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse = (GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse) o;
    return Objects.equals(this.nextPageToken, googleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.nextPageToken) &&
        Objects.equals(this.relatedAccountGroupMemberships, googleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.relatedAccountGroupMemberships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, relatedAccountGroupMemberships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    relatedAccountGroupMemberships: ").append(toIndentedString(relatedAccountGroupMemberships)).append("\n");
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
    openapiFields.add("relatedAccountGroupMemberships");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("relatedAccountGroupMemberships") != null && !jsonObj.get("relatedAccountGroupMemberships").isJsonNull()) {
        JsonArray jsonArrayrelatedAccountGroupMemberships = jsonObj.getAsJsonArray("relatedAccountGroupMemberships");
        if (jsonArrayrelatedAccountGroupMemberships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relatedAccountGroupMemberships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relatedAccountGroupMemberships` to be an array in the JSON string but got `%s`", jsonObj.get("relatedAccountGroupMemberships").toString()));
          }

          // validate the optional field `relatedAccountGroupMemberships` (array)
          for (int i = 0; i < jsonArrayrelatedAccountGroupMemberships.size(); i++) {
            GoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership.validateJsonElement(jsonArrayrelatedAccountGroupMemberships.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
   */
  public static GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

