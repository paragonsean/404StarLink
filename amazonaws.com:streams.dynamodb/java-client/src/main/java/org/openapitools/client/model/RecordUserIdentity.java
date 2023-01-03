/*
 * Amazon DynamoDB Streams
 * <fullname>Amazon DynamoDB</fullname> <p>Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about application development with Streams, see <a href=\"https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html\">Capturing Table Activity with DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.</p>
 *
 * The version of the OpenAPI document: 2012-08-10
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
 * RecordUserIdentity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:49.320287-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RecordUserIdentity {
  public static final String SERIALIZED_NAME_PRINCIPAL_ID = "PrincipalId";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ID)
  private String principalId;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RecordUserIdentity() {
  }

  public RecordUserIdentity principalId(String principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * Get principalId
   * @return principalId
   */
  @javax.annotation.Nullable
  public String getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }


  public RecordUserIdentity type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordUserIdentity recordUserIdentity = (RecordUserIdentity) o;
    return Objects.equals(this.principalId, recordUserIdentity.principalId) &&
        Objects.equals(this.type, recordUserIdentity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordUserIdentity {\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("PrincipalId");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordUserIdentity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordUserIdentity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordUserIdentity is not found in the empty JSON string", RecordUserIdentity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordUserIdentity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordUserIdentity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `PrincipalId`
      if (jsonObj.get("PrincipalId") != null && !jsonObj.get("PrincipalId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrincipalId"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordUserIdentity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordUserIdentity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordUserIdentity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordUserIdentity.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordUserIdentity>() {
           @Override
           public void write(JsonWriter out, RecordUserIdentity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordUserIdentity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordUserIdentity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordUserIdentity
   * @throws IOException if the JSON string is invalid with respect to RecordUserIdentity
   */
  public static RecordUserIdentity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordUserIdentity.class);
  }

  /**
   * Convert an instance of RecordUserIdentity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

