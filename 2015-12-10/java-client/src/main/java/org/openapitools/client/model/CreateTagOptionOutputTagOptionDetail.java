/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
 * CreateTagOptionOutputTagOptionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateTagOptionOutputTagOptionDetail {
  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ACTIVE = "Active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public CreateTagOptionOutputTagOptionDetail() {
  }

  public CreateTagOptionOutputTagOptionDetail key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public CreateTagOptionOutputTagOptionDetail value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public CreateTagOptionOutputTagOptionDetail active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateTagOptionOutputTagOptionDetail id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CreateTagOptionOutputTagOptionDetail owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTagOptionOutputTagOptionDetail createTagOptionOutputTagOptionDetail = (CreateTagOptionOutputTagOptionDetail) o;
    return Objects.equals(this.key, createTagOptionOutputTagOptionDetail.key) &&
        Objects.equals(this.value, createTagOptionOutputTagOptionDetail.value) &&
        Objects.equals(this.active, createTagOptionOutputTagOptionDetail.active) &&
        Objects.equals(this.id, createTagOptionOutputTagOptionDetail.id) &&
        Objects.equals(this.owner, createTagOptionOutputTagOptionDetail.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, active, id, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTagOptionOutputTagOptionDetail {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
    openapiFields.add("Key");
    openapiFields.add("Value");
    openapiFields.add("Active");
    openapiFields.add("Id");
    openapiFields.add("Owner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTagOptionOutputTagOptionDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTagOptionOutputTagOptionDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTagOptionOutputTagOptionDetail is not found in the empty JSON string", CreateTagOptionOutputTagOptionDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTagOptionOutputTagOptionDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTagOptionOutputTagOptionDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Key`
      if (jsonObj.get("Key") != null && !jsonObj.get("Key").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Key"));
      }
      // validate the optional field `Value`
      if (jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Value"));
      }
      // validate the optional field `Active`
      if (jsonObj.get("Active") != null && !jsonObj.get("Active").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Active"));
      }
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `Owner`
      if (jsonObj.get("Owner") != null && !jsonObj.get("Owner").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Owner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTagOptionOutputTagOptionDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTagOptionOutputTagOptionDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTagOptionOutputTagOptionDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTagOptionOutputTagOptionDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTagOptionOutputTagOptionDetail>() {
           @Override
           public void write(JsonWriter out, CreateTagOptionOutputTagOptionDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTagOptionOutputTagOptionDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTagOptionOutputTagOptionDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTagOptionOutputTagOptionDetail
   * @throws IOException if the JSON string is invalid with respect to CreateTagOptionOutputTagOptionDetail
   */
  public static CreateTagOptionOutputTagOptionDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTagOptionOutputTagOptionDetail.class);
  }

  /**
   * Convert an instance of CreateTagOptionOutputTagOptionDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

