/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
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
 * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class S3Origin {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ORIGIN_ACCESS_IDENTITY = "OriginAccessIdentity";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ACCESS_IDENTITY)
  private String originAccessIdentity;

  public S3Origin() {
  }

  public S3Origin domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nonnull
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public S3Origin originAccessIdentity(String originAccessIdentity) {
    this.originAccessIdentity = originAccessIdentity;
    return this;
  }

  /**
   * Get originAccessIdentity
   * @return originAccessIdentity
   */
  @javax.annotation.Nonnull
  public String getOriginAccessIdentity() {
    return originAccessIdentity;
  }

  public void setOriginAccessIdentity(String originAccessIdentity) {
    this.originAccessIdentity = originAccessIdentity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Origin s3Origin = (S3Origin) o;
    return Objects.equals(this.domainName, s3Origin.domainName) &&
        Objects.equals(this.originAccessIdentity, s3Origin.originAccessIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, originAccessIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Origin {\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    originAccessIdentity: ").append(toIndentedString(originAccessIdentity)).append("\n");
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
    openapiFields.add("DomainName");
    openapiFields.add("OriginAccessIdentity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DomainName");
    openapiRequiredFields.add("OriginAccessIdentity");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to S3Origin
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!S3Origin.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in S3Origin is not found in the empty JSON string", S3Origin.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!S3Origin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `S3Origin` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : S3Origin.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `DomainName`
      String.validateJsonElement(jsonObj.get("DomainName"));
      // validate the required field `OriginAccessIdentity`
      String.validateJsonElement(jsonObj.get("OriginAccessIdentity"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!S3Origin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'S3Origin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<S3Origin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(S3Origin.class));

       return (TypeAdapter<T>) new TypeAdapter<S3Origin>() {
           @Override
           public void write(JsonWriter out, S3Origin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public S3Origin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of S3Origin given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of S3Origin
   * @throws IOException if the JSON string is invalid with respect to S3Origin
   */
  public static S3Origin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, S3Origin.class);
  }

  /**
   * Convert an instance of S3Origin to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

