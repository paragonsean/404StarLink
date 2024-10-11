/*
 * Drive Labels API
 * An API for managing Drive Labels
 *
 * The version of the OpenAPI document: v2
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
import org.openapitools.client.model.GoogleAppsDriveLabelsV2LabelPermission;

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
 * Response for listing the permissions on a Label.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:59.934987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleAppsDriveLabelsV2ListLabelPermissionsResponse {
  public static final String SERIALIZED_NAME_LABEL_PERMISSIONS = "labelPermissions";
  @SerializedName(SERIALIZED_NAME_LABEL_PERMISSIONS)
  private List<GoogleAppsDriveLabelsV2LabelPermission> labelPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse() {
  }

  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse labelPermissions(List<GoogleAppsDriveLabelsV2LabelPermission> labelPermissions) {
    this.labelPermissions = labelPermissions;
    return this;
  }

  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse addLabelPermissionsItem(GoogleAppsDriveLabelsV2LabelPermission labelPermissionsItem) {
    if (this.labelPermissions == null) {
      this.labelPermissions = new ArrayList<>();
    }
    this.labelPermissions.add(labelPermissionsItem);
    return this;
  }

  /**
   * Label permissions.
   * @return labelPermissions
   */
  @javax.annotation.Nullable
  public List<GoogleAppsDriveLabelsV2LabelPermission> getLabelPermissions() {
    return labelPermissions;
  }

  public void setLabelPermissions(List<GoogleAppsDriveLabelsV2LabelPermission> labelPermissions) {
    this.labelPermissions = labelPermissions;
  }


  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The token of the next page in the response.
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
    GoogleAppsDriveLabelsV2ListLabelPermissionsResponse googleAppsDriveLabelsV2ListLabelPermissionsResponse = (GoogleAppsDriveLabelsV2ListLabelPermissionsResponse) o;
    return Objects.equals(this.labelPermissions, googleAppsDriveLabelsV2ListLabelPermissionsResponse.labelPermissions) &&
        Objects.equals(this.nextPageToken, googleAppsDriveLabelsV2ListLabelPermissionsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelPermissions, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAppsDriveLabelsV2ListLabelPermissionsResponse {\n");
    sb.append("    labelPermissions: ").append(toIndentedString(labelPermissions)).append("\n");
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
    openapiFields.add("labelPermissions");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleAppsDriveLabelsV2ListLabelPermissionsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleAppsDriveLabelsV2ListLabelPermissionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleAppsDriveLabelsV2ListLabelPermissionsResponse is not found in the empty JSON string", GoogleAppsDriveLabelsV2ListLabelPermissionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleAppsDriveLabelsV2ListLabelPermissionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleAppsDriveLabelsV2ListLabelPermissionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("labelPermissions") != null && !jsonObj.get("labelPermissions").isJsonNull()) {
        JsonArray jsonArraylabelPermissions = jsonObj.getAsJsonArray("labelPermissions");
        if (jsonArraylabelPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labelPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labelPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("labelPermissions").toString()));
          }

          // validate the optional field `labelPermissions` (array)
          for (int i = 0; i < jsonArraylabelPermissions.size(); i++) {
            GoogleAppsDriveLabelsV2LabelPermission.validateJsonElement(jsonArraylabelPermissions.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleAppsDriveLabelsV2ListLabelPermissionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleAppsDriveLabelsV2ListLabelPermissionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleAppsDriveLabelsV2ListLabelPermissionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleAppsDriveLabelsV2ListLabelPermissionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleAppsDriveLabelsV2ListLabelPermissionsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleAppsDriveLabelsV2ListLabelPermissionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleAppsDriveLabelsV2ListLabelPermissionsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleAppsDriveLabelsV2ListLabelPermissionsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleAppsDriveLabelsV2ListLabelPermissionsResponse
   */
  public static GoogleAppsDriveLabelsV2ListLabelPermissionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleAppsDriveLabelsV2ListLabelPermissionsResponse.class);
  }

  /**
   * Convert an instance of GoogleAppsDriveLabelsV2ListLabelPermissionsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

