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
 * Summary of the information about a CloudFront origin access identity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloudFrontOriginAccessIdentitySummary {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_S3_CANONICAL_USER_ID = "S3CanonicalUserId";
  @SerializedName(SERIALIZED_NAME_S3_CANONICAL_USER_ID)
  private String s3CanonicalUserId;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public CloudFrontOriginAccessIdentitySummary() {
  }

  public CloudFrontOriginAccessIdentitySummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CloudFrontOriginAccessIdentitySummary s3CanonicalUserId(String s3CanonicalUserId) {
    this.s3CanonicalUserId = s3CanonicalUserId;
    return this;
  }

  /**
   * Get s3CanonicalUserId
   * @return s3CanonicalUserId
   */
  @javax.annotation.Nonnull
  public String getS3CanonicalUserId() {
    return s3CanonicalUserId;
  }

  public void setS3CanonicalUserId(String s3CanonicalUserId) {
    this.s3CanonicalUserId = s3CanonicalUserId;
  }


  public CloudFrontOriginAccessIdentitySummary comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nonnull
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudFrontOriginAccessIdentitySummary cloudFrontOriginAccessIdentitySummary = (CloudFrontOriginAccessIdentitySummary) o;
    return Objects.equals(this.id, cloudFrontOriginAccessIdentitySummary.id) &&
        Objects.equals(this.s3CanonicalUserId, cloudFrontOriginAccessIdentitySummary.s3CanonicalUserId) &&
        Objects.equals(this.comment, cloudFrontOriginAccessIdentitySummary.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, s3CanonicalUserId, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudFrontOriginAccessIdentitySummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    s3CanonicalUserId: ").append(toIndentedString(s3CanonicalUserId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("S3CanonicalUserId");
    openapiFields.add("Comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("S3CanonicalUserId");
    openapiRequiredFields.add("Comment");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudFrontOriginAccessIdentitySummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudFrontOriginAccessIdentitySummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudFrontOriginAccessIdentitySummary is not found in the empty JSON string", CloudFrontOriginAccessIdentitySummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudFrontOriginAccessIdentitySummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudFrontOriginAccessIdentitySummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudFrontOriginAccessIdentitySummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the required field `S3CanonicalUserId`
      String.validateJsonElement(jsonObj.get("S3CanonicalUserId"));
      // validate the required field `Comment`
      String.validateJsonElement(jsonObj.get("Comment"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudFrontOriginAccessIdentitySummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudFrontOriginAccessIdentitySummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudFrontOriginAccessIdentitySummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudFrontOriginAccessIdentitySummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudFrontOriginAccessIdentitySummary>() {
           @Override
           public void write(JsonWriter out, CloudFrontOriginAccessIdentitySummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudFrontOriginAccessIdentitySummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudFrontOriginAccessIdentitySummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudFrontOriginAccessIdentitySummary
   * @throws IOException if the JSON string is invalid with respect to CloudFrontOriginAccessIdentitySummary
   */
  public static CloudFrontOriginAccessIdentitySummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudFrontOriginAccessIdentitySummary.class);
  }

  /**
   * Convert an instance of CloudFrontOriginAccessIdentitySummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

