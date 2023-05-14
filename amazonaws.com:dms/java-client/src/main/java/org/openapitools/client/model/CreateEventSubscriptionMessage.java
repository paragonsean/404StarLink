/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
 * &lt;p/&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateEventSubscriptionMessage {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_NAME = "SubscriptionName";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_NAME)
  private String subscriptionName;

  public static final String SERIALIZED_NAME_SNS_TOPIC_ARN = "SnsTopicArn";
  @SerializedName(SERIALIZED_NAME_SNS_TOPIC_ARN)
  private String snsTopicArn;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "SourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_EVENT_CATEGORIES = "EventCategories";
  @SerializedName(SERIALIZED_NAME_EVENT_CATEGORIES)
  private List eventCategories;

  public static final String SERIALIZED_NAME_SOURCE_IDS = "SourceIds";
  @SerializedName(SERIALIZED_NAME_SOURCE_IDS)
  private List sourceIds;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateEventSubscriptionMessage() {
  }

  public CreateEventSubscriptionMessage subscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
    return this;
  }

  /**
   * Get subscriptionName
   * @return subscriptionName
   */
  @javax.annotation.Nonnull
  public String getSubscriptionName() {
    return subscriptionName;
  }

  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }


  public CreateEventSubscriptionMessage snsTopicArn(String snsTopicArn) {
    this.snsTopicArn = snsTopicArn;
    return this;
  }

  /**
   * Get snsTopicArn
   * @return snsTopicArn
   */
  @javax.annotation.Nonnull
  public String getSnsTopicArn() {
    return snsTopicArn;
  }

  public void setSnsTopicArn(String snsTopicArn) {
    this.snsTopicArn = snsTopicArn;
  }


  public CreateEventSubscriptionMessage sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @javax.annotation.Nullable
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public CreateEventSubscriptionMessage eventCategories(List eventCategories) {
    this.eventCategories = eventCategories;
    return this;
  }

  /**
   * Get eventCategories
   * @return eventCategories
   */
  @javax.annotation.Nullable
  public List getEventCategories() {
    return eventCategories;
  }

  public void setEventCategories(List eventCategories) {
    this.eventCategories = eventCategories;
  }


  public CreateEventSubscriptionMessage sourceIds(List sourceIds) {
    this.sourceIds = sourceIds;
    return this;
  }

  /**
   * Get sourceIds
   * @return sourceIds
   */
  @javax.annotation.Nullable
  public List getSourceIds() {
    return sourceIds;
  }

  public void setSourceIds(List sourceIds) {
    this.sourceIds = sourceIds;
  }


  public CreateEventSubscriptionMessage enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CreateEventSubscriptionMessage tags(List tags) {
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
    CreateEventSubscriptionMessage createEventSubscriptionMessage = (CreateEventSubscriptionMessage) o;
    return Objects.equals(this.subscriptionName, createEventSubscriptionMessage.subscriptionName) &&
        Objects.equals(this.snsTopicArn, createEventSubscriptionMessage.snsTopicArn) &&
        Objects.equals(this.sourceType, createEventSubscriptionMessage.sourceType) &&
        Objects.equals(this.eventCategories, createEventSubscriptionMessage.eventCategories) &&
        Objects.equals(this.sourceIds, createEventSubscriptionMessage.sourceIds) &&
        Objects.equals(this.enabled, createEventSubscriptionMessage.enabled) &&
        Objects.equals(this.tags, createEventSubscriptionMessage.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionName, snsTopicArn, sourceType, eventCategories, sourceIds, enabled, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEventSubscriptionMessage {\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    snsTopicArn: ").append(toIndentedString(snsTopicArn)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    eventCategories: ").append(toIndentedString(eventCategories)).append("\n");
    sb.append("    sourceIds: ").append(toIndentedString(sourceIds)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("SubscriptionName");
    openapiFields.add("SnsTopicArn");
    openapiFields.add("SourceType");
    openapiFields.add("EventCategories");
    openapiFields.add("SourceIds");
    openapiFields.add("Enabled");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SubscriptionName");
    openapiRequiredFields.add("SnsTopicArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEventSubscriptionMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEventSubscriptionMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEventSubscriptionMessage is not found in the empty JSON string", CreateEventSubscriptionMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEventSubscriptionMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEventSubscriptionMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEventSubscriptionMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `SubscriptionName`
      String.validateJsonElement(jsonObj.get("SubscriptionName"));
      // validate the required field `SnsTopicArn`
      String.validateJsonElement(jsonObj.get("SnsTopicArn"));
      // validate the optional field `SourceType`
      if (jsonObj.get("SourceType") != null && !jsonObj.get("SourceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceType"));
      }
      // validate the optional field `EventCategories`
      if (jsonObj.get("EventCategories") != null && !jsonObj.get("EventCategories").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("EventCategories"));
      }
      // validate the optional field `SourceIds`
      if (jsonObj.get("SourceIds") != null && !jsonObj.get("SourceIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SourceIds"));
      }
      // validate the optional field `Enabled`
      if (jsonObj.get("Enabled") != null && !jsonObj.get("Enabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Enabled"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEventSubscriptionMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEventSubscriptionMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEventSubscriptionMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEventSubscriptionMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEventSubscriptionMessage>() {
           @Override
           public void write(JsonWriter out, CreateEventSubscriptionMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEventSubscriptionMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEventSubscriptionMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEventSubscriptionMessage
   * @throws IOException if the JSON string is invalid with respect to CreateEventSubscriptionMessage
   */
  public static CreateEventSubscriptionMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEventSubscriptionMessage.class);
  }

  /**
   * Convert an instance of CreateEventSubscriptionMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

