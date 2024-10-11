/*
 * Superset
 * Superset
 *
 * The version of the OpenAPI document: v1
 * 
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
 * TableMetadataOptionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TableMetadataOptionsResponse {
  public static final String SERIALIZED_NAME_DEFERRABLE = "deferrable";
  @SerializedName(SERIALIZED_NAME_DEFERRABLE)
  private Boolean deferrable;

  public static final String SERIALIZED_NAME_INITIALLY = "initially";
  @SerializedName(SERIALIZED_NAME_INITIALLY)
  private Boolean initially;

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private Boolean match;

  public static final String SERIALIZED_NAME_ONDELETE = "ondelete";
  @SerializedName(SERIALIZED_NAME_ONDELETE)
  private Boolean ondelete;

  public static final String SERIALIZED_NAME_ONUPDATE = "onupdate";
  @SerializedName(SERIALIZED_NAME_ONUPDATE)
  private Boolean onupdate;

  public TableMetadataOptionsResponse() {
  }

  public TableMetadataOptionsResponse deferrable(Boolean deferrable) {
    this.deferrable = deferrable;
    return this;
  }

  /**
   * Get deferrable
   * @return deferrable
   */
  @javax.annotation.Nullable
  public Boolean getDeferrable() {
    return deferrable;
  }

  public void setDeferrable(Boolean deferrable) {
    this.deferrable = deferrable;
  }


  public TableMetadataOptionsResponse initially(Boolean initially) {
    this.initially = initially;
    return this;
  }

  /**
   * Get initially
   * @return initially
   */
  @javax.annotation.Nullable
  public Boolean getInitially() {
    return initially;
  }

  public void setInitially(Boolean initially) {
    this.initially = initially;
  }


  public TableMetadataOptionsResponse match(Boolean match) {
    this.match = match;
    return this;
  }

  /**
   * Get match
   * @return match
   */
  @javax.annotation.Nullable
  public Boolean getMatch() {
    return match;
  }

  public void setMatch(Boolean match) {
    this.match = match;
  }


  public TableMetadataOptionsResponse ondelete(Boolean ondelete) {
    this.ondelete = ondelete;
    return this;
  }

  /**
   * Get ondelete
   * @return ondelete
   */
  @javax.annotation.Nullable
  public Boolean getOndelete() {
    return ondelete;
  }

  public void setOndelete(Boolean ondelete) {
    this.ondelete = ondelete;
  }


  public TableMetadataOptionsResponse onupdate(Boolean onupdate) {
    this.onupdate = onupdate;
    return this;
  }

  /**
   * Get onupdate
   * @return onupdate
   */
  @javax.annotation.Nullable
  public Boolean getOnupdate() {
    return onupdate;
  }

  public void setOnupdate(Boolean onupdate) {
    this.onupdate = onupdate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableMetadataOptionsResponse tableMetadataOptionsResponse = (TableMetadataOptionsResponse) o;
    return Objects.equals(this.deferrable, tableMetadataOptionsResponse.deferrable) &&
        Objects.equals(this.initially, tableMetadataOptionsResponse.initially) &&
        Objects.equals(this.match, tableMetadataOptionsResponse.match) &&
        Objects.equals(this.ondelete, tableMetadataOptionsResponse.ondelete) &&
        Objects.equals(this.onupdate, tableMetadataOptionsResponse.onupdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deferrable, initially, match, ondelete, onupdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMetadataOptionsResponse {\n");
    sb.append("    deferrable: ").append(toIndentedString(deferrable)).append("\n");
    sb.append("    initially: ").append(toIndentedString(initially)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    ondelete: ").append(toIndentedString(ondelete)).append("\n");
    sb.append("    onupdate: ").append(toIndentedString(onupdate)).append("\n");
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
    openapiFields.add("deferrable");
    openapiFields.add("initially");
    openapiFields.add("match");
    openapiFields.add("ondelete");
    openapiFields.add("onupdate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TableMetadataOptionsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TableMetadataOptionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TableMetadataOptionsResponse is not found in the empty JSON string", TableMetadataOptionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TableMetadataOptionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TableMetadataOptionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TableMetadataOptionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TableMetadataOptionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TableMetadataOptionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TableMetadataOptionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TableMetadataOptionsResponse>() {
           @Override
           public void write(JsonWriter out, TableMetadataOptionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TableMetadataOptionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TableMetadataOptionsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TableMetadataOptionsResponse
   * @throws IOException if the JSON string is invalid with respect to TableMetadataOptionsResponse
   */
  public static TableMetadataOptionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TableMetadataOptionsResponse.class);
  }

  /**
   * Convert an instance of TableMetadataOptionsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

