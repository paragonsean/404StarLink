/*
 * Ad Exchange Buyer API II
 * Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
 *
 * The version of the OpenAPI document: v2beta1
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
 * Request to accept a proposal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcceptProposalRequest {
  public static final String SERIALIZED_NAME_PROPOSAL_REVISION = "proposalRevision";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_REVISION)
  private String proposalRevision;

  public AcceptProposalRequest() {
  }

  public AcceptProposalRequest proposalRevision(String proposalRevision) {
    this.proposalRevision = proposalRevision;
    return this;
  }

  /**
   * The last known client revision number of the proposal.
   * @return proposalRevision
   */
  @javax.annotation.Nullable
  public String getProposalRevision() {
    return proposalRevision;
  }

  public void setProposalRevision(String proposalRevision) {
    this.proposalRevision = proposalRevision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptProposalRequest acceptProposalRequest = (AcceptProposalRequest) o;
    return Objects.equals(this.proposalRevision, acceptProposalRequest.proposalRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptProposalRequest {\n");
    sb.append("    proposalRevision: ").append(toIndentedString(proposalRevision)).append("\n");
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
    openapiFields.add("proposalRevision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcceptProposalRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcceptProposalRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcceptProposalRequest is not found in the empty JSON string", AcceptProposalRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcceptProposalRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcceptProposalRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("proposalRevision") != null && !jsonObj.get("proposalRevision").isJsonNull()) && !jsonObj.get("proposalRevision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proposalRevision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proposalRevision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcceptProposalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcceptProposalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcceptProposalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcceptProposalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AcceptProposalRequest>() {
           @Override
           public void write(JsonWriter out, AcceptProposalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcceptProposalRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcceptProposalRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcceptProposalRequest
   * @throws IOException if the JSON string is invalid with respect to AcceptProposalRequest
   */
  public static AcceptProposalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcceptProposalRequest.class);
  }

  /**
   * Convert an instance of AcceptProposalRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

