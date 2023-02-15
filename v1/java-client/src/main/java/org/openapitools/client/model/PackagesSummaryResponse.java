/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
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
import org.openapitools.client.model.LicensesSummary;

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
 * A summary of the packages found within the given resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:59.945291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PackagesSummaryResponse {
  public static final String SERIALIZED_NAME_LICENSES_SUMMARY = "licensesSummary";
  @SerializedName(SERIALIZED_NAME_LICENSES_SUMMARY)
  private List<LicensesSummary> licensesSummary = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_URL = "resourceUrl";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URL)
  private String resourceUrl;

  public PackagesSummaryResponse() {
  }

  public PackagesSummaryResponse licensesSummary(List<LicensesSummary> licensesSummary) {
    this.licensesSummary = licensesSummary;
    return this;
  }

  public PackagesSummaryResponse addLicensesSummaryItem(LicensesSummary licensesSummaryItem) {
    if (this.licensesSummary == null) {
      this.licensesSummary = new ArrayList<>();
    }
    this.licensesSummary.add(licensesSummaryItem);
    return this;
  }

  /**
   * A listing by license name of each of the licenses and their counts.
   * @return licensesSummary
   */
  @javax.annotation.Nullable
  public List<LicensesSummary> getLicensesSummary() {
    return licensesSummary;
  }

  public void setLicensesSummary(List<LicensesSummary> licensesSummary) {
    this.licensesSummary = licensesSummary;
  }


  public PackagesSummaryResponse resourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

  /**
   * The unique URL of the image or the container for which this summary applies.
   * @return resourceUrl
   */
  @javax.annotation.Nullable
  public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackagesSummaryResponse packagesSummaryResponse = (PackagesSummaryResponse) o;
    return Objects.equals(this.licensesSummary, packagesSummaryResponse.licensesSummary) &&
        Objects.equals(this.resourceUrl, packagesSummaryResponse.resourceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licensesSummary, resourceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackagesSummaryResponse {\n");
    sb.append("    licensesSummary: ").append(toIndentedString(licensesSummary)).append("\n");
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
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
    openapiFields.add("licensesSummary");
    openapiFields.add("resourceUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PackagesSummaryResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PackagesSummaryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackagesSummaryResponse is not found in the empty JSON string", PackagesSummaryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PackagesSummaryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PackagesSummaryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("licensesSummary") != null && !jsonObj.get("licensesSummary").isJsonNull()) {
        JsonArray jsonArraylicensesSummary = jsonObj.getAsJsonArray("licensesSummary");
        if (jsonArraylicensesSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("licensesSummary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `licensesSummary` to be an array in the JSON string but got `%s`", jsonObj.get("licensesSummary").toString()));
          }

          // validate the optional field `licensesSummary` (array)
          for (int i = 0; i < jsonArraylicensesSummary.size(); i++) {
            LicensesSummary.validateJsonElement(jsonArraylicensesSummary.get(i));
          };
        }
      }
      if ((jsonObj.get("resourceUrl") != null && !jsonObj.get("resourceUrl").isJsonNull()) && !jsonObj.get("resourceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackagesSummaryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackagesSummaryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackagesSummaryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackagesSummaryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PackagesSummaryResponse>() {
           @Override
           public void write(JsonWriter out, PackagesSummaryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackagesSummaryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PackagesSummaryResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PackagesSummaryResponse
   * @throws IOException if the JSON string is invalid with respect to PackagesSummaryResponse
   */
  public static PackagesSummaryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackagesSummaryResponse.class);
  }

  /**
   * Convert an instance of PackagesSummaryResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

