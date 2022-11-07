/*
 * AWS Security Token Service
 * <fullname>Security Token Service</fullname> <p>Security Token Service (STS) enables you to request temporary, limited-privilege credentials for Identity and Access Management (IAM) users or for users that you authenticate (federated users). This guide provides descriptions of the STS API. For more information about using this service, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html\">Temporary Security Credentials</a>.</p>
 *
 * The version of the OpenAPI document: 2011-06-15
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
import org.openapitools.client.model.AssumeRoleResponseCredentials;
import org.openapitools.client.model.GetFederationTokenResponseFederatedUser;

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
 * Contains the response to a successful &lt;a&gt;GetFederationToken&lt;/a&gt; request, including temporary Amazon Web Services credentials that can be used to make Amazon Web Services requests. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:56.639241-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetFederationTokenResponse {
  public static final String SERIALIZED_NAME_CREDENTIALS = "Credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private AssumeRoleResponseCredentials credentials;

  public static final String SERIALIZED_NAME_FEDERATED_USER = "FederatedUser";
  @SerializedName(SERIALIZED_NAME_FEDERATED_USER)
  private GetFederationTokenResponseFederatedUser federatedUser;

  public static final String SERIALIZED_NAME_PACKED_POLICY_SIZE = "PackedPolicySize";
  @SerializedName(SERIALIZED_NAME_PACKED_POLICY_SIZE)
  private Integer packedPolicySize;

  public GetFederationTokenResponse() {
  }

  public GetFederationTokenResponse credentials(AssumeRoleResponseCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @javax.annotation.Nullable
  public AssumeRoleResponseCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(AssumeRoleResponseCredentials credentials) {
    this.credentials = credentials;
  }


  public GetFederationTokenResponse federatedUser(GetFederationTokenResponseFederatedUser federatedUser) {
    this.federatedUser = federatedUser;
    return this;
  }

  /**
   * Get federatedUser
   * @return federatedUser
   */
  @javax.annotation.Nullable
  public GetFederationTokenResponseFederatedUser getFederatedUser() {
    return federatedUser;
  }

  public void setFederatedUser(GetFederationTokenResponseFederatedUser federatedUser) {
    this.federatedUser = federatedUser;
  }


  public GetFederationTokenResponse packedPolicySize(Integer packedPolicySize) {
    this.packedPolicySize = packedPolicySize;
    return this;
  }

  /**
   * Get packedPolicySize
   * @return packedPolicySize
   */
  @javax.annotation.Nullable
  public Integer getPackedPolicySize() {
    return packedPolicySize;
  }

  public void setPackedPolicySize(Integer packedPolicySize) {
    this.packedPolicySize = packedPolicySize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFederationTokenResponse getFederationTokenResponse = (GetFederationTokenResponse) o;
    return Objects.equals(this.credentials, getFederationTokenResponse.credentials) &&
        Objects.equals(this.federatedUser, getFederationTokenResponse.federatedUser) &&
        Objects.equals(this.packedPolicySize, getFederationTokenResponse.packedPolicySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, federatedUser, packedPolicySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFederationTokenResponse {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    federatedUser: ").append(toIndentedString(federatedUser)).append("\n");
    sb.append("    packedPolicySize: ").append(toIndentedString(packedPolicySize)).append("\n");
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
    openapiFields.add("Credentials");
    openapiFields.add("FederatedUser");
    openapiFields.add("PackedPolicySize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetFederationTokenResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFederationTokenResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFederationTokenResponse is not found in the empty JSON string", GetFederationTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFederationTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFederationTokenResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Credentials`
      if (jsonObj.get("Credentials") != null && !jsonObj.get("Credentials").isJsonNull()) {
        AssumeRoleResponseCredentials.validateJsonElement(jsonObj.get("Credentials"));
      }
      // validate the optional field `FederatedUser`
      if (jsonObj.get("FederatedUser") != null && !jsonObj.get("FederatedUser").isJsonNull()) {
        GetFederationTokenResponseFederatedUser.validateJsonElement(jsonObj.get("FederatedUser"));
      }
      // validate the optional field `PackedPolicySize`
      if (jsonObj.get("PackedPolicySize") != null && !jsonObj.get("PackedPolicySize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("PackedPolicySize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFederationTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFederationTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFederationTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFederationTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFederationTokenResponse>() {
           @Override
           public void write(JsonWriter out, GetFederationTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFederationTokenResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFederationTokenResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFederationTokenResponse
   * @throws IOException if the JSON string is invalid with respect to GetFederationTokenResponse
   */
  public static GetFederationTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFederationTokenResponse.class);
  }

  /**
   * Convert an instance of GetFederationTokenResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

