/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
 * Briefly describes a Fleet Advisor collector.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CollectorShortInfoResponse {
  public static final String SERIALIZED_NAME_COLLECTOR_REFERENCED_ID = "CollectorReferencedId";
  @SerializedName(SERIALIZED_NAME_COLLECTOR_REFERENCED_ID)
  private String collectorReferencedId;

  public static final String SERIALIZED_NAME_COLLECTOR_NAME = "CollectorName";
  @SerializedName(SERIALIZED_NAME_COLLECTOR_NAME)
  private String collectorName;

  public CollectorShortInfoResponse() {
  }

  public CollectorShortInfoResponse collectorReferencedId(String collectorReferencedId) {
    this.collectorReferencedId = collectorReferencedId;
    return this;
  }

  /**
   * Get collectorReferencedId
   * @return collectorReferencedId
   */
  @javax.annotation.Nullable
  public String getCollectorReferencedId() {
    return collectorReferencedId;
  }

  public void setCollectorReferencedId(String collectorReferencedId) {
    this.collectorReferencedId = collectorReferencedId;
  }


  public CollectorShortInfoResponse collectorName(String collectorName) {
    this.collectorName = collectorName;
    return this;
  }

  /**
   * Get collectorName
   * @return collectorName
   */
  @javax.annotation.Nullable
  public String getCollectorName() {
    return collectorName;
  }

  public void setCollectorName(String collectorName) {
    this.collectorName = collectorName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectorShortInfoResponse collectorShortInfoResponse = (CollectorShortInfoResponse) o;
    return Objects.equals(this.collectorReferencedId, collectorShortInfoResponse.collectorReferencedId) &&
        Objects.equals(this.collectorName, collectorShortInfoResponse.collectorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorReferencedId, collectorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectorShortInfoResponse {\n");
    sb.append("    collectorReferencedId: ").append(toIndentedString(collectorReferencedId)).append("\n");
    sb.append("    collectorName: ").append(toIndentedString(collectorName)).append("\n");
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
    openapiFields.add("CollectorReferencedId");
    openapiFields.add("CollectorName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CollectorShortInfoResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CollectorShortInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectorShortInfoResponse is not found in the empty JSON string", CollectorShortInfoResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CollectorShortInfoResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectorShortInfoResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CollectorReferencedId`
      if (jsonObj.get("CollectorReferencedId") != null && !jsonObj.get("CollectorReferencedId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CollectorReferencedId"));
      }
      // validate the optional field `CollectorName`
      if (jsonObj.get("CollectorName") != null && !jsonObj.get("CollectorName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CollectorName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectorShortInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectorShortInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectorShortInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectorShortInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectorShortInfoResponse>() {
           @Override
           public void write(JsonWriter out, CollectorShortInfoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectorShortInfoResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CollectorShortInfoResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CollectorShortInfoResponse
   * @throws IOException if the JSON string is invalid with respect to CollectorShortInfoResponse
   */
  public static CollectorShortInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectorShortInfoResponse.class);
  }

  /**
   * Convert an instance of CollectorShortInfoResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

