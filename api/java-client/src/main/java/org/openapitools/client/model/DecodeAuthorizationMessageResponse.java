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
 * A document that contains additional information about the authorization status of a request from an encoded message that is returned in response to an Amazon Web Services request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:32.170421-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DecodeAuthorizationMessageResponse {
  public static final String SERIALIZED_NAME_DECODED_MESSAGE = "DecodedMessage";
  @SerializedName(SERIALIZED_NAME_DECODED_MESSAGE)
  private String decodedMessage;

  public DecodeAuthorizationMessageResponse() {
  }

  public DecodeAuthorizationMessageResponse decodedMessage(String decodedMessage) {
    this.decodedMessage = decodedMessage;
    return this;
  }

  /**
   * Get decodedMessage
   * @return decodedMessage
   */
  @javax.annotation.Nullable
  public String getDecodedMessage() {
    return decodedMessage;
  }

  public void setDecodedMessage(String decodedMessage) {
    this.decodedMessage = decodedMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeAuthorizationMessageResponse decodeAuthorizationMessageResponse = (DecodeAuthorizationMessageResponse) o;
    return Objects.equals(this.decodedMessage, decodeAuthorizationMessageResponse.decodedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decodedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeAuthorizationMessageResponse {\n");
    sb.append("    decodedMessage: ").append(toIndentedString(decodedMessage)).append("\n");
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
    openapiFields.add("DecodedMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DecodeAuthorizationMessageResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DecodeAuthorizationMessageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeAuthorizationMessageResponse is not found in the empty JSON string", DecodeAuthorizationMessageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DecodeAuthorizationMessageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeAuthorizationMessageResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DecodedMessage`
      if (jsonObj.get("DecodedMessage") != null && !jsonObj.get("DecodedMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DecodedMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeAuthorizationMessageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeAuthorizationMessageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeAuthorizationMessageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeAuthorizationMessageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeAuthorizationMessageResponse>() {
           @Override
           public void write(JsonWriter out, DecodeAuthorizationMessageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeAuthorizationMessageResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DecodeAuthorizationMessageResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DecodeAuthorizationMessageResponse
   * @throws IOException if the JSON string is invalid with respect to DecodeAuthorizationMessageResponse
   */
  public static DecodeAuthorizationMessageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeAuthorizationMessageResponse.class);
  }

  /**
   * Convert an instance of DecodeAuthorizationMessageResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

