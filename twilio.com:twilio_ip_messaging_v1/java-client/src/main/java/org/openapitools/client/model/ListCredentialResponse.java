/*
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
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
import org.openapitools.client.model.IpMessagingV1Credential;
import org.openapitools.client.model.ListCredentialResponseMeta;

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
 * ListCredentialResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:43.360758-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListCredentialResponse {
  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private List<IpMessagingV1Credential> credentials = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListCredentialResponseMeta meta;

  public ListCredentialResponse() {
  }

  public ListCredentialResponse credentials(List<IpMessagingV1Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public ListCredentialResponse addCredentialsItem(IpMessagingV1Credential credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @javax.annotation.Nullable
  public List<IpMessagingV1Credential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<IpMessagingV1Credential> credentials) {
    this.credentials = credentials;
  }


  public ListCredentialResponse meta(ListCredentialResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public ListCredentialResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListCredentialResponseMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCredentialResponse listCredentialResponse = (ListCredentialResponse) o;
    return Objects.equals(this.credentials, listCredentialResponse.credentials) &&
        Objects.equals(this.meta, listCredentialResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCredentialResponse {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("credentials");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListCredentialResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListCredentialResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCredentialResponse is not found in the empty JSON string", ListCredentialResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListCredentialResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCredentialResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("credentials") != null && !jsonObj.get("credentials").isJsonNull()) {
        JsonArray jsonArraycredentials = jsonObj.getAsJsonArray("credentials");
        if (jsonArraycredentials != null) {
          // ensure the json data is an array
          if (!jsonObj.get("credentials").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `credentials` to be an array in the JSON string but got `%s`", jsonObj.get("credentials").toString()));
          }

          // validate the optional field `credentials` (array)
          for (int i = 0; i < jsonArraycredentials.size(); i++) {
            IpMessagingV1Credential.validateJsonElement(jsonArraycredentials.get(i));
          };
        }
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        ListCredentialResponseMeta.validateJsonElement(jsonObj.get("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCredentialResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCredentialResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCredentialResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCredentialResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCredentialResponse>() {
           @Override
           public void write(JsonWriter out, ListCredentialResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCredentialResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListCredentialResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListCredentialResponse
   * @throws IOException if the JSON string is invalid with respect to ListCredentialResponse
   */
  public static ListCredentialResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCredentialResponse.class);
  }

  /**
   * Convert an instance of ListCredentialResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

