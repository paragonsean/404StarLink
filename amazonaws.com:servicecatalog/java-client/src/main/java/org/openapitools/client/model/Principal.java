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
import org.openapitools.client.model.PrincipalType;

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
 * Information about a principal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Principal {
  public static final String SERIALIZED_NAME_PRINCIPAL_A_R_N = "PrincipalARN";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_A_R_N)
  private String principalARN;

  public static final String SERIALIZED_NAME_PRINCIPAL_TYPE = "PrincipalType";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_TYPE)
  private PrincipalType principalType;

  public Principal() {
  }

  public Principal principalARN(String principalARN) {
    this.principalARN = principalARN;
    return this;
  }

  /**
   * Get principalARN
   * @return principalARN
   */
  @javax.annotation.Nullable
  public String getPrincipalARN() {
    return principalARN;
  }

  public void setPrincipalARN(String principalARN) {
    this.principalARN = principalARN;
  }


  public Principal principalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  /**
   * Get principalType
   * @return principalType
   */
  @javax.annotation.Nullable
  public PrincipalType getPrincipalType() {
    return principalType;
  }

  public void setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Principal principal = (Principal) o;
    return Objects.equals(this.principalARN, principal.principalARN) &&
        Objects.equals(this.principalType, principal.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalARN, principalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Principal {\n");
    sb.append("    principalARN: ").append(toIndentedString(principalARN)).append("\n");
    sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
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
    openapiFields.add("PrincipalARN");
    openapiFields.add("PrincipalType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Principal
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Principal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Principal is not found in the empty JSON string", Principal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Principal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Principal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `PrincipalARN`
      if (jsonObj.get("PrincipalARN") != null && !jsonObj.get("PrincipalARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrincipalARN"));
      }
      // validate the optional field `PrincipalType`
      if (jsonObj.get("PrincipalType") != null && !jsonObj.get("PrincipalType").isJsonNull()) {
        PrincipalType.validateJsonElement(jsonObj.get("PrincipalType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Principal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Principal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Principal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Principal.class));

       return (TypeAdapter<T>) new TypeAdapter<Principal>() {
           @Override
           public void write(JsonWriter out, Principal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Principal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Principal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Principal
   * @throws IOException if the JSON string is invalid with respect to Principal
   */
  public static Principal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Principal.class);
  }

  /**
   * Convert an instance of Principal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

