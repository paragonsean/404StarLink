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
 * The identifiers for the temporary security credentials that the operation returns.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:51.326464-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AssumedRoleUser {
  public static final String SERIALIZED_NAME_ASSUMED_ROLE_ID = "AssumedRoleId";
  @SerializedName(SERIALIZED_NAME_ASSUMED_ROLE_ID)
  private String assumedRoleId;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public AssumedRoleUser() {
  }

  public AssumedRoleUser assumedRoleId(String assumedRoleId) {
    this.assumedRoleId = assumedRoleId;
    return this;
  }

  /**
   * Get assumedRoleId
   * @return assumedRoleId
   */
  @javax.annotation.Nonnull
  public String getAssumedRoleId() {
    return assumedRoleId;
  }

  public void setAssumedRoleId(String assumedRoleId) {
    this.assumedRoleId = assumedRoleId;
  }


  public AssumedRoleUser arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nonnull
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssumedRoleUser assumedRoleUser = (AssumedRoleUser) o;
    return Objects.equals(this.assumedRoleId, assumedRoleUser.assumedRoleId) &&
        Objects.equals(this.arn, assumedRoleUser.arn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assumedRoleId, arn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssumedRoleUser {\n");
    sb.append("    assumedRoleId: ").append(toIndentedString(assumedRoleId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
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
    openapiFields.add("AssumedRoleId");
    openapiFields.add("Arn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AssumedRoleId");
    openapiRequiredFields.add("Arn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AssumedRoleUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssumedRoleUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssumedRoleUser is not found in the empty JSON string", AssumedRoleUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssumedRoleUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssumedRoleUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssumedRoleUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `AssumedRoleId`
      String.validateJsonElement(jsonObj.get("AssumedRoleId"));
      // validate the required field `Arn`
      String.validateJsonElement(jsonObj.get("Arn"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssumedRoleUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssumedRoleUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssumedRoleUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssumedRoleUser.class));

       return (TypeAdapter<T>) new TypeAdapter<AssumedRoleUser>() {
           @Override
           public void write(JsonWriter out, AssumedRoleUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssumedRoleUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AssumedRoleUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssumedRoleUser
   * @throws IOException if the JSON string is invalid with respect to AssumedRoleUser
   */
  public static AssumedRoleUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssumedRoleUser.class);
  }

  /**
   * Convert an instance of AssumedRoleUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

