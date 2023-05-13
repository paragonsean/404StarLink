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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ModifyEventSubscriptionMessage {
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

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public ModifyEventSubscriptionMessage() {
  }

  public ModifyEventSubscriptionMessage subscriptionName(String subscriptionName) {
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


  public ModifyEventSubscriptionMessage snsTopicArn(String snsTopicArn) {
    this.snsTopicArn = snsTopicArn;
    return this;
  }

  /**
   * Get snsTopicArn
   * @return snsTopicArn
   */
  @javax.annotation.Nullable
  public String getSnsTopicArn() {
    return snsTopicArn;
  }

  public void setSnsTopicArn(String snsTopicArn) {
    this.snsTopicArn = snsTopicArn;
  }


  public ModifyEventSubscriptionMessage sourceType(String sourceType) {
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


  public ModifyEventSubscriptionMessage eventCategories(List eventCategories) {
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


  public ModifyEventSubscriptionMessage enabled(Boolean enabled) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyEventSubscriptionMessage modifyEventSubscriptionMessage = (ModifyEventSubscriptionMessage) o;
    return Objects.equals(this.subscriptionName, modifyEventSubscriptionMessage.subscriptionName) &&
        Objects.equals(this.snsTopicArn, modifyEventSubscriptionMessage.snsTopicArn) &&
        Objects.equals(this.sourceType, modifyEventSubscriptionMessage.sourceType) &&
        Objects.equals(this.eventCategories, modifyEventSubscriptionMessage.eventCategories) &&
        Objects.equals(this.enabled, modifyEventSubscriptionMessage.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionName, snsTopicArn, sourceType, eventCategories, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyEventSubscriptionMessage {\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    snsTopicArn: ").append(toIndentedString(snsTopicArn)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    eventCategories: ").append(toIndentedString(eventCategories)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("Enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SubscriptionName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModifyEventSubscriptionMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyEventSubscriptionMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyEventSubscriptionMessage is not found in the empty JSON string", ModifyEventSubscriptionMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModifyEventSubscriptionMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyEventSubscriptionMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyEventSubscriptionMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `SubscriptionName`
      String.validateJsonElement(jsonObj.get("SubscriptionName"));
      // validate the optional field `SnsTopicArn`
      if (jsonObj.get("SnsTopicArn") != null && !jsonObj.get("SnsTopicArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnsTopicArn"));
      }
      // validate the optional field `SourceType`
      if (jsonObj.get("SourceType") != null && !jsonObj.get("SourceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceType"));
      }
      // validate the optional field `EventCategories`
      if (jsonObj.get("EventCategories") != null && !jsonObj.get("EventCategories").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("EventCategories"));
      }
      // validate the optional field `Enabled`
      if (jsonObj.get("Enabled") != null && !jsonObj.get("Enabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Enabled"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyEventSubscriptionMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyEventSubscriptionMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyEventSubscriptionMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyEventSubscriptionMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyEventSubscriptionMessage>() {
           @Override
           public void write(JsonWriter out, ModifyEventSubscriptionMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyEventSubscriptionMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModifyEventSubscriptionMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModifyEventSubscriptionMessage
   * @throws IOException if the JSON string is invalid with respect to ModifyEventSubscriptionMessage
   */
  public static ModifyEventSubscriptionMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyEventSubscriptionMessage.class);
  }

  /**
   * Convert an instance of ModifyEventSubscriptionMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

