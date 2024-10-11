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
import org.openapitools.client.model.DeleteElasticsearchDomainResponseDomainStatus;

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
 * The result of a &lt;code&gt;DeleteElasticsearchDomain&lt;/code&gt; request. Contains the status of the pending deletion, or no status if the domain and all of its resources have been deleted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeleteElasticsearchDomainResponse {
  public static final String SERIALIZED_NAME_DOMAIN_STATUS = "DomainStatus";
  @SerializedName(SERIALIZED_NAME_DOMAIN_STATUS)
  private DeleteElasticsearchDomainResponseDomainStatus domainStatus;

  public DeleteElasticsearchDomainResponse() {
  }

  public DeleteElasticsearchDomainResponse domainStatus(DeleteElasticsearchDomainResponseDomainStatus domainStatus) {
    this.domainStatus = domainStatus;
    return this;
  }

  /**
   * Get domainStatus
   * @return domainStatus
   */
  @javax.annotation.Nullable
  public DeleteElasticsearchDomainResponseDomainStatus getDomainStatus() {
    return domainStatus;
  }

  public void setDomainStatus(DeleteElasticsearchDomainResponseDomainStatus domainStatus) {
    this.domainStatus = domainStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteElasticsearchDomainResponse deleteElasticsearchDomainResponse = (DeleteElasticsearchDomainResponse) o;
    return Objects.equals(this.domainStatus, deleteElasticsearchDomainResponse.domainStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteElasticsearchDomainResponse {\n");
    sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
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
    openapiFields.add("DomainStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteElasticsearchDomainResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteElasticsearchDomainResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteElasticsearchDomainResponse is not found in the empty JSON string", DeleteElasticsearchDomainResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteElasticsearchDomainResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteElasticsearchDomainResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DomainStatus`
      if (jsonObj.get("DomainStatus") != null && !jsonObj.get("DomainStatus").isJsonNull()) {
        DeleteElasticsearchDomainResponseDomainStatus.validateJsonElement(jsonObj.get("DomainStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteElasticsearchDomainResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteElasticsearchDomainResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteElasticsearchDomainResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteElasticsearchDomainResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteElasticsearchDomainResponse>() {
           @Override
           public void write(JsonWriter out, DeleteElasticsearchDomainResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteElasticsearchDomainResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteElasticsearchDomainResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteElasticsearchDomainResponse
   * @throws IOException if the JSON string is invalid with respect to DeleteElasticsearchDomainResponse
   */
  public static DeleteElasticsearchDomainResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteElasticsearchDomainResponse.class);
  }

  /**
   * Convert an instance of DeleteElasticsearchDomainResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

