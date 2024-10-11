/*
 * Amazon Elasticsearch Service
 * <fullname>Amazon Elasticsearch Configuration Service</fullname> <p>Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.</p> <p>For sample code that uses the Configuration API, see the <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html\">Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html\">sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.</p> <p>The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a href=\"http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions\" target=\"_blank\">Regions and Endpoints</a>.</p>
 *
 * The version of the OpenAPI document: 2015-01-01
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
 * CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions {
  public static final String SERIALIZED_NAME_MASTER_USER_A_R_N = "MasterUserARN";
  @SerializedName(SERIALIZED_NAME_MASTER_USER_A_R_N)
  private String masterUserARN;

  public static final String SERIALIZED_NAME_MASTER_USER_NAME = "MasterUserName";
  @SerializedName(SERIALIZED_NAME_MASTER_USER_NAME)
  private String masterUserName;

  public static final String SERIALIZED_NAME_MASTER_USER_PASSWORD = "MasterUserPassword";
  @SerializedName(SERIALIZED_NAME_MASTER_USER_PASSWORD)
  private String masterUserPassword;

  public CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions() {
  }

  public CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions masterUserARN(String masterUserARN) {
    this.masterUserARN = masterUserARN;
    return this;
  }

  /**
   * Get masterUserARN
   * @return masterUserARN
   */
  @javax.annotation.Nullable
  public String getMasterUserARN() {
    return masterUserARN;
  }

  public void setMasterUserARN(String masterUserARN) {
    this.masterUserARN = masterUserARN;
  }


  public CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions masterUserName(String masterUserName) {
    this.masterUserName = masterUserName;
    return this;
  }

  /**
   * Get masterUserName
   * @return masterUserName
   */
  @javax.annotation.Nullable
  public String getMasterUserName() {
    return masterUserName;
  }

  public void setMasterUserName(String masterUserName) {
    this.masterUserName = masterUserName;
  }


  public CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions masterUserPassword(String masterUserPassword) {
    this.masterUserPassword = masterUserPassword;
    return this;
  }

  /**
   * Get masterUserPassword
   * @return masterUserPassword
   */
  @javax.annotation.Nullable
  public String getMasterUserPassword() {
    return masterUserPassword;
  }

  public void setMasterUserPassword(String masterUserPassword) {
    this.masterUserPassword = masterUserPassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions createElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions = (CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions) o;
    return Objects.equals(this.masterUserARN, createElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.masterUserARN) &&
        Objects.equals(this.masterUserName, createElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.masterUserName) &&
        Objects.equals(this.masterUserPassword, createElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.masterUserPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterUserARN, masterUserName, masterUserPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions {\n");
    sb.append("    masterUserARN: ").append(toIndentedString(masterUserARN)).append("\n");
    sb.append("    masterUserName: ").append(toIndentedString(masterUserName)).append("\n");
    sb.append("    masterUserPassword: ").append(toIndentedString(masterUserPassword)).append("\n");
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
    openapiFields.add("MasterUserARN");
    openapiFields.add("MasterUserName");
    openapiFields.add("MasterUserPassword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions is not found in the empty JSON string", CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `MasterUserARN`
      if (jsonObj.get("MasterUserARN") != null && !jsonObj.get("MasterUserARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MasterUserARN"));
      }
      // validate the optional field `MasterUserName`
      if (jsonObj.get("MasterUserName") != null && !jsonObj.get("MasterUserName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MasterUserName"));
      }
      // validate the optional field `MasterUserPassword`
      if (jsonObj.get("MasterUserPassword") != null && !jsonObj.get("MasterUserPassword").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MasterUserPassword"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions>() {
           @Override
           public void write(JsonWriter out, CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions
   * @throws IOException if the JSON string is invalid with respect to CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions
   */
  public static CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions.class);
  }

  /**
   * Convert an instance of CreateElasticsearchDomainRequestAdvancedSecurityOptionsMasterUserOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

