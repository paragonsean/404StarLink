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
import org.openapitools.client.model.DescribeDomainChangeProgressResponseChangeProgressStatus;

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
 * The result of a &lt;code&gt;DescribeDomainChangeProgress&lt;/code&gt; request. Contains the progress information of the requested domain change. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeDomainChangeProgressResponse {
  public static final String SERIALIZED_NAME_CHANGE_PROGRESS_STATUS = "ChangeProgressStatus";
  @SerializedName(SERIALIZED_NAME_CHANGE_PROGRESS_STATUS)
  private DescribeDomainChangeProgressResponseChangeProgressStatus changeProgressStatus;

  public DescribeDomainChangeProgressResponse() {
  }

  public DescribeDomainChangeProgressResponse changeProgressStatus(DescribeDomainChangeProgressResponseChangeProgressStatus changeProgressStatus) {
    this.changeProgressStatus = changeProgressStatus;
    return this;
  }

  /**
   * Get changeProgressStatus
   * @return changeProgressStatus
   */
  @javax.annotation.Nullable
  public DescribeDomainChangeProgressResponseChangeProgressStatus getChangeProgressStatus() {
    return changeProgressStatus;
  }

  public void setChangeProgressStatus(DescribeDomainChangeProgressResponseChangeProgressStatus changeProgressStatus) {
    this.changeProgressStatus = changeProgressStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDomainChangeProgressResponse describeDomainChangeProgressResponse = (DescribeDomainChangeProgressResponse) o;
    return Objects.equals(this.changeProgressStatus, describeDomainChangeProgressResponse.changeProgressStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeProgressStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDomainChangeProgressResponse {\n");
    sb.append("    changeProgressStatus: ").append(toIndentedString(changeProgressStatus)).append("\n");
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
    openapiFields.add("ChangeProgressStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeDomainChangeProgressResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeDomainChangeProgressResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeDomainChangeProgressResponse is not found in the empty JSON string", DescribeDomainChangeProgressResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeDomainChangeProgressResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeDomainChangeProgressResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ChangeProgressStatus`
      if (jsonObj.get("ChangeProgressStatus") != null && !jsonObj.get("ChangeProgressStatus").isJsonNull()) {
        DescribeDomainChangeProgressResponseChangeProgressStatus.validateJsonElement(jsonObj.get("ChangeProgressStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeDomainChangeProgressResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeDomainChangeProgressResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeDomainChangeProgressResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeDomainChangeProgressResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeDomainChangeProgressResponse>() {
           @Override
           public void write(JsonWriter out, DescribeDomainChangeProgressResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeDomainChangeProgressResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeDomainChangeProgressResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeDomainChangeProgressResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeDomainChangeProgressResponse
   */
  public static DescribeDomainChangeProgressResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeDomainChangeProgressResponse.class);
  }

  /**
   * Convert an instance of DescribeDomainChangeProgressResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

