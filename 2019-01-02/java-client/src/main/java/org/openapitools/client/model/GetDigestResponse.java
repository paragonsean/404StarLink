/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
import org.openapitools.client.model.GetDigestResponseDigestTipAddress;

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
 * GetDigestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:20.150579-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetDigestResponse {
  public static final String SERIALIZED_NAME_DIGEST = "Digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_DIGEST_TIP_ADDRESS = "DigestTipAddress";
  @SerializedName(SERIALIZED_NAME_DIGEST_TIP_ADDRESS)
  private GetDigestResponseDigestTipAddress digestTipAddress;

  public GetDigestResponse() {
  }

  public GetDigestResponse digest(String digest) {
    this.digest = digest;
    return this;
  }

  /**
   * Get digest
   * @return digest
   */
  @javax.annotation.Nonnull
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }


  public GetDigestResponse digestTipAddress(GetDigestResponseDigestTipAddress digestTipAddress) {
    this.digestTipAddress = digestTipAddress;
    return this;
  }

  /**
   * Get digestTipAddress
   * @return digestTipAddress
   */
  @javax.annotation.Nonnull
  public GetDigestResponseDigestTipAddress getDigestTipAddress() {
    return digestTipAddress;
  }

  public void setDigestTipAddress(GetDigestResponseDigestTipAddress digestTipAddress) {
    this.digestTipAddress = digestTipAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDigestResponse getDigestResponse = (GetDigestResponse) o;
    return Objects.equals(this.digest, getDigestResponse.digest) &&
        Objects.equals(this.digestTipAddress, getDigestResponse.digestTipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, digestTipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDigestResponse {\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    digestTipAddress: ").append(toIndentedString(digestTipAddress)).append("\n");
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
    openapiFields.add("Digest");
    openapiFields.add("DigestTipAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Digest");
    openapiRequiredFields.add("DigestTipAddress");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDigestResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDigestResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDigestResponse is not found in the empty JSON string", GetDigestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDigestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDigestResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDigestResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Digest`
      String.validateJsonElement(jsonObj.get("Digest"));
      // validate the required field `DigestTipAddress`
      GetDigestResponseDigestTipAddress.validateJsonElement(jsonObj.get("DigestTipAddress"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDigestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDigestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDigestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDigestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDigestResponse>() {
           @Override
           public void write(JsonWriter out, GetDigestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDigestResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDigestResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDigestResponse
   * @throws IOException if the JSON string is invalid with respect to GetDigestResponse
   */
  public static GetDigestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDigestResponse.class);
  }

  /**
   * Convert an instance of GetDigestResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

