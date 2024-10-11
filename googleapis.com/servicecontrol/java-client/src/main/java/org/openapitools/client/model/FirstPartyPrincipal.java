/*
 * Service Control API
 * Provides admission control and telemetry reporting for services integrated with Service Infrastructure. 
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * First party identity principal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:54.152517-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FirstPartyPrincipal {
  public static final String SERIALIZED_NAME_PRINCIPAL_EMAIL = "principalEmail";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_EMAIL)
  private String principalEmail;

  public static final String SERIALIZED_NAME_SERVICE_METADATA = "serviceMetadata";
  @SerializedName(SERIALIZED_NAME_SERVICE_METADATA)
  private Map<String, Object> serviceMetadata = new HashMap<>();

  public FirstPartyPrincipal() {
  }

  public FirstPartyPrincipal principalEmail(String principalEmail) {
    this.principalEmail = principalEmail;
    return this;
  }

  /**
   * The email address of a Google account. .
   * @return principalEmail
   */
  @javax.annotation.Nullable
  public String getPrincipalEmail() {
    return principalEmail;
  }

  public void setPrincipalEmail(String principalEmail) {
    this.principalEmail = principalEmail;
  }


  public FirstPartyPrincipal serviceMetadata(Map<String, Object> serviceMetadata) {
    this.serviceMetadata = serviceMetadata;
    return this;
  }

  public FirstPartyPrincipal putServiceMetadataItem(String key, Object serviceMetadataItem) {
    if (this.serviceMetadata == null) {
      this.serviceMetadata = new HashMap<>();
    }
    this.serviceMetadata.put(key, serviceMetadataItem);
    return this;
  }

  /**
   * Metadata about the service that uses the service account. .
   * @return serviceMetadata
   */
  @javax.annotation.Nullable
  public Map<String, Object> getServiceMetadata() {
    return serviceMetadata;
  }

  public void setServiceMetadata(Map<String, Object> serviceMetadata) {
    this.serviceMetadata = serviceMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstPartyPrincipal firstPartyPrincipal = (FirstPartyPrincipal) o;
    return Objects.equals(this.principalEmail, firstPartyPrincipal.principalEmail) &&
        Objects.equals(this.serviceMetadata, firstPartyPrincipal.serviceMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalEmail, serviceMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstPartyPrincipal {\n");
    sb.append("    principalEmail: ").append(toIndentedString(principalEmail)).append("\n");
    sb.append("    serviceMetadata: ").append(toIndentedString(serviceMetadata)).append("\n");
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
    openapiFields.add("principalEmail");
    openapiFields.add("serviceMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FirstPartyPrincipal
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirstPartyPrincipal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirstPartyPrincipal is not found in the empty JSON string", FirstPartyPrincipal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirstPartyPrincipal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirstPartyPrincipal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("principalEmail") != null && !jsonObj.get("principalEmail").isJsonNull()) && !jsonObj.get("principalEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principalEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principalEmail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirstPartyPrincipal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirstPartyPrincipal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirstPartyPrincipal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirstPartyPrincipal.class));

       return (TypeAdapter<T>) new TypeAdapter<FirstPartyPrincipal>() {
           @Override
           public void write(JsonWriter out, FirstPartyPrincipal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirstPartyPrincipal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FirstPartyPrincipal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FirstPartyPrincipal
   * @throws IOException if the JSON string is invalid with respect to FirstPartyPrincipal
   */
  public static FirstPartyPrincipal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirstPartyPrincipal.class);
  }

  /**
   * Convert an instance of FirstPartyPrincipal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

