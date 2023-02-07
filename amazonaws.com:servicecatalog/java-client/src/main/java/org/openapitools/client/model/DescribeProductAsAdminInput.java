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
 * DescribeProductAsAdminInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:32.195618-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeProductAsAdminInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_PORTFOLIO_ID = "SourcePortfolioId";
  @SerializedName(SERIALIZED_NAME_SOURCE_PORTFOLIO_ID)
  private String sourcePortfolioId;

  public DescribeProductAsAdminInput() {
  }

  public DescribeProductAsAdminInput acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * Get acceptLanguage
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public DescribeProductAsAdminInput id(String id) {
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


  public DescribeProductAsAdminInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DescribeProductAsAdminInput sourcePortfolioId(String sourcePortfolioId) {
    this.sourcePortfolioId = sourcePortfolioId;
    return this;
  }

  /**
   * Get sourcePortfolioId
   * @return sourcePortfolioId
   */
  @javax.annotation.Nullable
  public String getSourcePortfolioId() {
    return sourcePortfolioId;
  }

  public void setSourcePortfolioId(String sourcePortfolioId) {
    this.sourcePortfolioId = sourcePortfolioId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProductAsAdminInput describeProductAsAdminInput = (DescribeProductAsAdminInput) o;
    return Objects.equals(this.acceptLanguage, describeProductAsAdminInput.acceptLanguage) &&
        Objects.equals(this.id, describeProductAsAdminInput.id) &&
        Objects.equals(this.name, describeProductAsAdminInput.name) &&
        Objects.equals(this.sourcePortfolioId, describeProductAsAdminInput.sourcePortfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, id, name, sourcePortfolioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProductAsAdminInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourcePortfolioId: ").append(toIndentedString(sourcePortfolioId)).append("\n");
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
    openapiFields.add("AcceptLanguage");
    openapiFields.add("Id");
    openapiFields.add("Name");
    openapiFields.add("SourcePortfolioId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeProductAsAdminInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeProductAsAdminInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeProductAsAdminInput is not found in the empty JSON string", DescribeProductAsAdminInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeProductAsAdminInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeProductAsAdminInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `SourcePortfolioId`
      if (jsonObj.get("SourcePortfolioId") != null && !jsonObj.get("SourcePortfolioId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourcePortfolioId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeProductAsAdminInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeProductAsAdminInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeProductAsAdminInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeProductAsAdminInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeProductAsAdminInput>() {
           @Override
           public void write(JsonWriter out, DescribeProductAsAdminInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeProductAsAdminInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeProductAsAdminInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeProductAsAdminInput
   * @throws IOException if the JSON string is invalid with respect to DescribeProductAsAdminInput
   */
  public static DescribeProductAsAdminInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeProductAsAdminInput.class);
  }

  /**
   * Convert an instance of DescribeProductAsAdminInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

