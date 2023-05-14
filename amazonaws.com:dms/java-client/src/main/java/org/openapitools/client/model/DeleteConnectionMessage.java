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
 * &lt;p/&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeleteConnectionMessage {
  public static final String SERIALIZED_NAME_ENDPOINT_ARN = "EndpointArn";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ARN)
  private String endpointArn;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_ARN = "ReplicationInstanceArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_ARN)
  private String replicationInstanceArn;

  public DeleteConnectionMessage() {
  }

  public DeleteConnectionMessage endpointArn(String endpointArn) {
    this.endpointArn = endpointArn;
    return this;
  }

  /**
   * Get endpointArn
   * @return endpointArn
   */
  @javax.annotation.Nonnull
  public String getEndpointArn() {
    return endpointArn;
  }

  public void setEndpointArn(String endpointArn) {
    this.endpointArn = endpointArn;
  }


  public DeleteConnectionMessage replicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
    return this;
  }

  /**
   * Get replicationInstanceArn
   * @return replicationInstanceArn
   */
  @javax.annotation.Nonnull
  public String getReplicationInstanceArn() {
    return replicationInstanceArn;
  }

  public void setReplicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteConnectionMessage deleteConnectionMessage = (DeleteConnectionMessage) o;
    return Objects.equals(this.endpointArn, deleteConnectionMessage.endpointArn) &&
        Objects.equals(this.replicationInstanceArn, deleteConnectionMessage.replicationInstanceArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointArn, replicationInstanceArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteConnectionMessage {\n");
    sb.append("    endpointArn: ").append(toIndentedString(endpointArn)).append("\n");
    sb.append("    replicationInstanceArn: ").append(toIndentedString(replicationInstanceArn)).append("\n");
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
    openapiFields.add("EndpointArn");
    openapiFields.add("ReplicationInstanceArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("EndpointArn");
    openapiRequiredFields.add("ReplicationInstanceArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteConnectionMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteConnectionMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteConnectionMessage is not found in the empty JSON string", DeleteConnectionMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteConnectionMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteConnectionMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteConnectionMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `EndpointArn`
      String.validateJsonElement(jsonObj.get("EndpointArn"));
      // validate the required field `ReplicationInstanceArn`
      String.validateJsonElement(jsonObj.get("ReplicationInstanceArn"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteConnectionMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteConnectionMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteConnectionMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteConnectionMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteConnectionMessage>() {
           @Override
           public void write(JsonWriter out, DeleteConnectionMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteConnectionMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteConnectionMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteConnectionMessage
   * @throws IOException if the JSON string is invalid with respect to DeleteConnectionMessage
   */
  public static DeleteConnectionMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteConnectionMessage.class);
  }

  /**
   * Convert an instance of DeleteConnectionMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

