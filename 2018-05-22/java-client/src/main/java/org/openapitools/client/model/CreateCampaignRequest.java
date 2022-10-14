/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
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
import java.util.List;
import org.openapitools.client.model.CreateCampaignRequestCampaignConfig;

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
 * CreateCampaignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateCampaignRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOLUTION_VERSION_ARN = "solutionVersionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_VERSION_ARN)
  private String solutionVersionArn;

  public static final String SERIALIZED_NAME_MIN_PROVISIONED_T_P_S = "minProvisionedTPS";
  @SerializedName(SERIALIZED_NAME_MIN_PROVISIONED_T_P_S)
  private Integer minProvisionedTPS;

  public static final String SERIALIZED_NAME_CAMPAIGN_CONFIG = "campaignConfig";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CONFIG)
  private CreateCampaignRequestCampaignConfig campaignConfig;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateCampaignRequest() {
  }

  public CreateCampaignRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateCampaignRequest solutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
    return this;
  }

  /**
   * Get solutionVersionArn
   * @return solutionVersionArn
   */
  @javax.annotation.Nonnull
  public String getSolutionVersionArn() {
    return solutionVersionArn;
  }

  public void setSolutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
  }


  public CreateCampaignRequest minProvisionedTPS(Integer minProvisionedTPS) {
    this.minProvisionedTPS = minProvisionedTPS;
    return this;
  }

  /**
   * Get minProvisionedTPS
   * @return minProvisionedTPS
   */
  @javax.annotation.Nullable
  public Integer getMinProvisionedTPS() {
    return minProvisionedTPS;
  }

  public void setMinProvisionedTPS(Integer minProvisionedTPS) {
    this.minProvisionedTPS = minProvisionedTPS;
  }


  public CreateCampaignRequest campaignConfig(CreateCampaignRequestCampaignConfig campaignConfig) {
    this.campaignConfig = campaignConfig;
    return this;
  }

  /**
   * Get campaignConfig
   * @return campaignConfig
   */
  @javax.annotation.Nullable
  public CreateCampaignRequestCampaignConfig getCampaignConfig() {
    return campaignConfig;
  }

  public void setCampaignConfig(CreateCampaignRequestCampaignConfig campaignConfig) {
    this.campaignConfig = campaignConfig;
  }


  public CreateCampaignRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCampaignRequest createCampaignRequest = (CreateCampaignRequest) o;
    return Objects.equals(this.name, createCampaignRequest.name) &&
        Objects.equals(this.solutionVersionArn, createCampaignRequest.solutionVersionArn) &&
        Objects.equals(this.minProvisionedTPS, createCampaignRequest.minProvisionedTPS) &&
        Objects.equals(this.campaignConfig, createCampaignRequest.campaignConfig) &&
        Objects.equals(this.tags, createCampaignRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, solutionVersionArn, minProvisionedTPS, campaignConfig, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCampaignRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    solutionVersionArn: ").append(toIndentedString(solutionVersionArn)).append("\n");
    sb.append("    minProvisionedTPS: ").append(toIndentedString(minProvisionedTPS)).append("\n");
    sb.append("    campaignConfig: ").append(toIndentedString(campaignConfig)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("solutionVersionArn");
    openapiFields.add("minProvisionedTPS");
    openapiFields.add("campaignConfig");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("solutionVersionArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCampaignRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCampaignRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCampaignRequest is not found in the empty JSON string", CreateCampaignRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCampaignRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCampaignRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCampaignRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `name`
      String.validateJsonElement(jsonObj.get("name"));
      // validate the required field `solutionVersionArn`
      String.validateJsonElement(jsonObj.get("solutionVersionArn"));
      // validate the optional field `minProvisionedTPS`
      if (jsonObj.get("minProvisionedTPS") != null && !jsonObj.get("minProvisionedTPS").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("minProvisionedTPS"));
      }
      // validate the optional field `campaignConfig`
      if (jsonObj.get("campaignConfig") != null && !jsonObj.get("campaignConfig").isJsonNull()) {
        CreateCampaignRequestCampaignConfig.validateJsonElement(jsonObj.get("campaignConfig"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCampaignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCampaignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCampaignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCampaignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCampaignRequest>() {
           @Override
           public void write(JsonWriter out, CreateCampaignRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCampaignRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCampaignRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCampaignRequest
   * @throws IOException if the JSON string is invalid with respect to CreateCampaignRequest
   */
  public static CreateCampaignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCampaignRequest.class);
  }

  /**
   * Convert an instance of CreateCampaignRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

