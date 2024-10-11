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
import org.openapitools.client.model.ElasticsearchVersionStatusStatus;

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
 * ElasticsearchDomainConfigElasticsearchVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ElasticsearchDomainConfigElasticsearchVersion {
  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private String options;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ElasticsearchVersionStatusStatus status;

  public ElasticsearchDomainConfigElasticsearchVersion() {
  }

  public ElasticsearchDomainConfigElasticsearchVersion options(String options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nonnull
  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }


  public ElasticsearchDomainConfigElasticsearchVersion status(ElasticsearchVersionStatusStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ElasticsearchVersionStatusStatus getStatus() {
    return status;
  }

  public void setStatus(ElasticsearchVersionStatusStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchDomainConfigElasticsearchVersion elasticsearchDomainConfigElasticsearchVersion = (ElasticsearchDomainConfigElasticsearchVersion) o;
    return Objects.equals(this.options, elasticsearchDomainConfigElasticsearchVersion.options) &&
        Objects.equals(this.status, elasticsearchDomainConfigElasticsearchVersion.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchDomainConfigElasticsearchVersion {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Options");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Options");
    openapiRequiredFields.add("Status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElasticsearchDomainConfigElasticsearchVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElasticsearchDomainConfigElasticsearchVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElasticsearchDomainConfigElasticsearchVersion is not found in the empty JSON string", ElasticsearchDomainConfigElasticsearchVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElasticsearchDomainConfigElasticsearchVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElasticsearchDomainConfigElasticsearchVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ElasticsearchDomainConfigElasticsearchVersion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Options`
      String.validateJsonElement(jsonObj.get("Options"));
      // validate the required field `Status`
      ElasticsearchVersionStatusStatus.validateJsonElement(jsonObj.get("Status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElasticsearchDomainConfigElasticsearchVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElasticsearchDomainConfigElasticsearchVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElasticsearchDomainConfigElasticsearchVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElasticsearchDomainConfigElasticsearchVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ElasticsearchDomainConfigElasticsearchVersion>() {
           @Override
           public void write(JsonWriter out, ElasticsearchDomainConfigElasticsearchVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElasticsearchDomainConfigElasticsearchVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElasticsearchDomainConfigElasticsearchVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElasticsearchDomainConfigElasticsearchVersion
   * @throws IOException if the JSON string is invalid with respect to ElasticsearchDomainConfigElasticsearchVersion
   */
  public static ElasticsearchDomainConfigElasticsearchVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElasticsearchDomainConfigElasticsearchVersion.class);
  }

  /**
   * Convert an instance of ElasticsearchDomainConfigElasticsearchVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

