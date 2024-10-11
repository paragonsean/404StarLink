/*
 * Cloud Billing API
 * Allows developers to manage billing for their Google Cloud Platform projects programmatically.
 *
 * The version of the OpenAPI document: v1beta
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
import org.openapitools.client.model.Usage;

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
 * Egress traffic between two regions.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:37.545354-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class InterRegionEgress {
  public static final String SERIALIZED_NAME_DESTINATION_REGION = "destinationRegion";
  @SerializedName(SERIALIZED_NAME_DESTINATION_REGION)
  private String destinationRegion;

  public static final String SERIALIZED_NAME_EGRESS_RATE = "egressRate";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE)
  private Usage egressRate;

  public static final String SERIALIZED_NAME_SOURCE_REGION = "sourceRegion";
  @SerializedName(SERIALIZED_NAME_SOURCE_REGION)
  private String sourceRegion;

  public InterRegionEgress() {
  }

  public InterRegionEgress destinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
    return this;
  }

  /**
   * Which [region](https://cloud.google.com/compute/docs/regions-zones) the egress data goes to.
   * @return destinationRegion
   */
  @javax.annotation.Nullable
  public String getDestinationRegion() {
    return destinationRegion;
  }

  public void setDestinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
  }


  public InterRegionEgress egressRate(Usage egressRate) {
    this.egressRate = egressRate;
    return this;
  }

  /**
   * Get egressRate
   * @return egressRate
   */
  @javax.annotation.Nullable
  public Usage getEgressRate() {
    return egressRate;
  }

  public void setEgressRate(Usage egressRate) {
    this.egressRate = egressRate;
  }


  public InterRegionEgress sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

  /**
   * Which [region](https://cloud.google.com/compute/docs/regions-zones) the egress data comes from.
   * @return sourceRegion
   */
  @javax.annotation.Nullable
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterRegionEgress interRegionEgress = (InterRegionEgress) o;
    return Objects.equals(this.destinationRegion, interRegionEgress.destinationRegion) &&
        Objects.equals(this.egressRate, interRegionEgress.egressRate) &&
        Objects.equals(this.sourceRegion, interRegionEgress.sourceRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationRegion, egressRate, sourceRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterRegionEgress {\n");
    sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
    sb.append("    egressRate: ").append(toIndentedString(egressRate)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
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
    openapiFields.add("destinationRegion");
    openapiFields.add("egressRate");
    openapiFields.add("sourceRegion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InterRegionEgress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InterRegionEgress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InterRegionEgress is not found in the empty JSON string", InterRegionEgress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InterRegionEgress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InterRegionEgress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("destinationRegion") != null && !jsonObj.get("destinationRegion").isJsonNull()) && !jsonObj.get("destinationRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationRegion").toString()));
      }
      // validate the optional field `egressRate`
      if (jsonObj.get("egressRate") != null && !jsonObj.get("egressRate").isJsonNull()) {
        Usage.validateJsonElement(jsonObj.get("egressRate"));
      }
      if ((jsonObj.get("sourceRegion") != null && !jsonObj.get("sourceRegion").isJsonNull()) && !jsonObj.get("sourceRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceRegion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InterRegionEgress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InterRegionEgress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InterRegionEgress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InterRegionEgress.class));

       return (TypeAdapter<T>) new TypeAdapter<InterRegionEgress>() {
           @Override
           public void write(JsonWriter out, InterRegionEgress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InterRegionEgress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InterRegionEgress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InterRegionEgress
   * @throws IOException if the JSON string is invalid with respect to InterRegionEgress
   */
  public static InterRegionEgress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InterRegionEgress.class);
  }

  /**
   * Convert an instance of InterRegionEgress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

