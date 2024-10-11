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
import org.openapitools.client.model.OriginGroupFailoverCriteria;
import org.openapitools.client.model.OriginGroupMembers;

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
 * An origin group includes two origins (a primary origin and a second origin to failover to) and a failover criteria that you specify. You create an origin group to support origin failover in CloudFront. When you create or update a distribution, you can specifiy the origin group instead of a single origin, and CloudFront will failover from the primary origin to the second origin under the failover conditions that you&#39;ve chosen.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:01.473565-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class OriginGroup {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FAILOVER_CRITERIA = "FailoverCriteria";
  @SerializedName(SERIALIZED_NAME_FAILOVER_CRITERIA)
  private OriginGroupFailoverCriteria failoverCriteria;

  public static final String SERIALIZED_NAME_MEMBERS = "Members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private OriginGroupMembers members;

  public OriginGroup() {
  }

  public OriginGroup id(String id) {
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


  public OriginGroup failoverCriteria(OriginGroupFailoverCriteria failoverCriteria) {
    this.failoverCriteria = failoverCriteria;
    return this;
  }

  /**
   * Get failoverCriteria
   * @return failoverCriteria
   */
  @javax.annotation.Nonnull
  public OriginGroupFailoverCriteria getFailoverCriteria() {
    return failoverCriteria;
  }

  public void setFailoverCriteria(OriginGroupFailoverCriteria failoverCriteria) {
    this.failoverCriteria = failoverCriteria;
  }


  public OriginGroup members(OriginGroupMembers members) {
    this.members = members;
    return this;
  }

  /**
   * Get members
   * @return members
   */
  @javax.annotation.Nonnull
  public OriginGroupMembers getMembers() {
    return members;
  }

  public void setMembers(OriginGroupMembers members) {
    this.members = members;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginGroup originGroup = (OriginGroup) o;
    return Objects.equals(this.id, originGroup.id) &&
        Objects.equals(this.failoverCriteria, originGroup.failoverCriteria) &&
        Objects.equals(this.members, originGroup.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, failoverCriteria, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    failoverCriteria: ").append(toIndentedString(failoverCriteria)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("FailoverCriteria");
    openapiFields.add("Members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("FailoverCriteria");
    openapiRequiredFields.add("Members");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OriginGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OriginGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginGroup is not found in the empty JSON string", OriginGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OriginGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Id`
      String.validateJsonElement(jsonObj.get("Id"));
      // validate the required field `FailoverCriteria`
      OriginGroupFailoverCriteria.validateJsonElement(jsonObj.get("FailoverCriteria"));
      // validate the required field `Members`
      OriginGroupMembers.validateJsonElement(jsonObj.get("Members"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginGroup>() {
           @Override
           public void write(JsonWriter out, OriginGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OriginGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OriginGroup
   * @throws IOException if the JSON string is invalid with respect to OriginGroup
   */
  public static OriginGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginGroup.class);
  }

  /**
   * Convert an instance of OriginGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

