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
 * A reference to the IAM managed policy that is passed as a session policy for a role session or a federated user session.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:32.170421-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PolicyDescriptorType {
  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public PolicyDescriptorType() {
  }

  public PolicyDescriptorType arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
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
    PolicyDescriptorType policyDescriptorType = (PolicyDescriptorType) o;
    return Objects.equals(this.arn, policyDescriptorType.arn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyDescriptorType {\n");
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
    openapiFields.add("arn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PolicyDescriptorType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PolicyDescriptorType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyDescriptorType is not found in the empty JSON string", PolicyDescriptorType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PolicyDescriptorType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PolicyDescriptorType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyDescriptorType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyDescriptorType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyDescriptorType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyDescriptorType.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyDescriptorType>() {
           @Override
           public void write(JsonWriter out, PolicyDescriptorType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PolicyDescriptorType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PolicyDescriptorType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PolicyDescriptorType
   * @throws IOException if the JSON string is invalid with respect to PolicyDescriptorType
   */
  public static PolicyDescriptorType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyDescriptorType.class);
  }

  /**
   * Convert an instance of PolicyDescriptorType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

